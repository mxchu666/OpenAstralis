#!/usr/bin/env python3
"""Scan a directory of class files for invokedynamic sites and their bootstrap methods.

Reports, per class: indy descriptor -> bootstrap MethodHandle ref, so the
constant scheme used by each descriptor can be traced to one implementation.

usage: indy_scan.py <classes-dir> [filter-substring]
"""
import io
import os
import struct
import sys

TAG_NAMES = {
    1: 'Utf8', 3: 'Int', 4: 'Float', 5: 'Long', 6: 'Double', 7: 'Class',
    8: 'String', 9: 'Field', 10: 'Method', 11: 'InterfaceMethod',
    12: 'NameAndType', 15: 'MethodHandle', 16: 'MethodType', 17: 'Dynamic',
    18: 'InvokeDynamic', 19: 'Module', 20: 'Package',
}


class CP:
    def __init__(self, data):
        self.data = data
        self.items = [None]
        self._parse()

    def _parse(self):
        d = self.data
        n = struct.unpack_from('>H', d, 8)[0]
        p = 10
        i = 1
        while i < n:
            tag = d[p]
            p += 1
            if tag == 1:
                ln = struct.unpack_from('>H', d, p)[0]
                p += 2
                self.items.append(('Utf8', d[p:p + ln].decode('utf-8', 'replace')))
                p += ln
            elif tag in (3, 4):
                self.items.append((TAG_NAMES[tag], struct.unpack_from('>i', d, p)[0]))
                p += 4
            elif tag in (5, 6):
                self.items.append((TAG_NAMES[tag], struct.unpack_from('>q', d, p)[0]))
                p += 8
                i += 1
                self.items.append(None)
            elif tag in (7, 8, 16, 19, 20):
                self.items.append((TAG_NAMES[tag], struct.unpack_from('>H', d, p)[0]))
                p += 2
            elif tag in (9, 10, 11, 12, 17, 18):
                a, b = struct.unpack_from('>HH', d, p)
                self.items.append((TAG_NAMES[tag], a, b))
                p += 4
            elif tag == 15:
                kind = d[p]
                idx = struct.unpack_from('>H', d, p + 1)[0]
                self.items.append(('MethodHandle', kind, idx))
                p += 3
            else:
                raise ValueError('bad cp tag %d at %d' % (tag, p))
            i += 1

    def utf(self, i):
        it = self.items[i]
        return it[1] if it and it[0] == 'Utf8' else None

    def describe(self, i):
        it = self.items[i]
        if not it:
            return '?'
        tag = it[0]
        if tag == 'Utf8':
            return it[1]
        if tag == 'Class':
            return self.utf(it[1])
        if tag == 'MethodHandle':
            target = self.describe(it[2])
            return 'handle[%d] %s' % (it[1], target)
        if tag in ('Method', 'Field', 'InterfaceMethod'):
            cls = self.describe(it[1])
            nt = self.items[it[2]]
            return '%s.%s:%s' % (cls, self.utf(nt[1]), self.utf(nt[2]))
        if tag == 'NameAndType':
            return '%s:%s' % (self.utf(it[1]), self.utf(it[2]))
        if tag == 'InvokeDynamic':
            nt = self.items[it[2]]
            return '%s:%s' % (self.utf(nt[1]), self.utf(nt[2]))
        return str(it)


def class_attrs(data, cp):
    """Return bootstrap table and class name."""
    p = 10
    n = struct.unpack_from('>H', data, 8)[0]
    i = 1
    while i < n:  # skip cp
        tag = data[p]
        p += 1
        if tag == 1:
            ln = struct.unpack_from('>H', data, p)[0]
            p += 2 + ln
        elif tag in (3, 4, 9, 10, 11, 12, 17, 18):
            p += 4
        elif tag in (5, 6):
            p += 8
            i += 1
        elif tag in (7, 8, 16, 19, 20):
            p += 2
        elif tag == 15:
            p += 3
        i += 1
    this_idx = struct.unpack_from('>H', data, p + 2)[0]
    name = cp.describe(this_idx)
    p += 6
    ifc = struct.unpack_from('>H', data, p)[0]
    p += 2 + 2 * ifc
    for _ in range(2):  # fields, methods
        cnt = struct.unpack_from('>H', data, p)[0]
        p += 2
        for _ in range(cnt):
            p += 6
            ac = struct.unpack_from('>H', data, p)[0]
            p += 2
            for _ in range(ac):
                alen = struct.unpack_from('>I', data, p + 2)[0]
                p += 6 + alen
    ac = struct.unpack_from('>H', data, p)[0]
    p += 2
    boot = []
    for _ in range(ac):
        an = cp.utf(struct.unpack_from('>H', data, p)[0])
        alen = struct.unpack_from('>I', data, p + 2)[0]
        body = data[p + 6:p + 6 + alen]
        if an == 'BootstrapMethods':
            nb = struct.unpack_from('>H', body, 0)[0]
            q = 2
            for _ in range(nb):
                ref, na = struct.unpack_from('>HH', body, q)
                q += 4 + 2 * na
                boot.append(ref)
        p += 6 + alen
    return name, boot


def scan(path):
    data = open(path, 'rb').read()
    if data[:4] != b'\xca\xfe\xba\xbe':
        return None
    cp = CP(data)
    name, boot = class_attrs(data, cp)
    sites = []
    for i, it in enumerate(cp.items):
        if it and it[0] == 'InvokeDynamic':
            bsm = boot[it[1]] if it[1] < len(boot) else None
            nt = cp.items[it[2]]
            sites.append((cp.utf(nt[2]), cp.describe(bsm) if bsm else '?'))
    return name, sites


def main():
    root = sys.argv[1]
    needle = sys.argv[2] if len(sys.argv) > 2 else None
    agg = {}
    files = 0
    for dp, _, fns in os.walk(root):
        for fn in fns:
            if not fn.endswith('.class'):
                continue
            r = scan(os.path.join(dp, fn))
            if not r:
                continue
            files += 1
            name, sites = r
            for desc, bsm in sites:
                agg.setdefault(desc, {}).setdefault(bsm, []).append(name)
    print('classes=%d descriptors=%d' % (files, len(agg)))
    for desc in sorted(agg, key=lambda d: (-sum(len(v) for v in agg[d].values()), d)):
        total = sum(len(v) for v in agg[desc].values())
        print('\n%-40s sites=%d' % (desc, total))
        for bsm, owners in sorted(agg[desc].items(), key=lambda kv: -len(kv[1])):
            print('    %-70s classes=%d' % (bsm, len(owners)))
            if needle:
                print('        e.g. %s' % ', '.join(sorted(set(owners))[:6]))


if __name__ == '__main__':
    main()
