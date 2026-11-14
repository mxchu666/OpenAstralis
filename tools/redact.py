#!/usr/bin/env python3
"""Redact credentials recovered by the string folding pass.

Deobfuscation turns encrypted literals back into plaintext, and a plaintext
literal can be somebody's credential. The build hard-codes a Discord bot token
in `cc/astralis/dle`, so the folded tree carries it verbatim; publishing that is
a live secret, not analysis. This pass rewrites credential shapes to a marker
before the tree is committed.

    python tools/redact.py src
    python tools/redact.py src --check     # exit 1 if anything would change

Patterns are matched on the literal shape, not on a list of known values, so a
rebuild with rotated credentials is caught too.
"""
import argparse
import os
import re
import sys

PATTERNS = [
    ("discord-bot-token",
     re.compile(r"[MN][A-Za-z\d]{23,27}\.[\w-]{6}\.[\w-]{27,40}")),
    ("discord-webhook",
     re.compile(r"https://(?:ptb\.|canary\.)?discord(?:app)?\.com/api/webhooks/"
                r"\d{17,20}/[\w-]{60,80}")),
    ("aws-access-key", re.compile(r"AKIA[0-9A-Z]{16}")),
    ("private-key",
     re.compile(r"-----BEGIN (?:RSA |EC |OPENSSH )?PRIVATE KEY-----")),
]


def redact(text):
    hits = []
    for kind, rx in PATTERNS:
        def swap(m):
            hits.append((kind, m.group(0)[:12]))
            return "<redacted:%s>" % kind
        text = rx.sub(swap, text)
    return text, hits


def main(argv):
    ap = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    ap.add_argument("root")
    ap.add_argument("--check", action="store_true",
                    help="report only, exit 1 when a credential is present")
    args = ap.parse_args(argv[1:])

    total = 0
    files = 0
    for dirpath, _, names in os.walk(args.root):
        for n in names:
            if not n.endswith(".java"):
                continue
            path = os.path.join(dirpath, n)
            text = open(path, encoding="utf-8", errors="replace").read()
            new, hits = redact(text)
            if not hits:
                continue
            total += len(hits)
            files += 1
            print("%s:%d credential(s): %s"
                  % (os.path.relpath(path, args.root), len(hits),
                     ", ".join(sorted({k for k, _ in hits}))))
            if not args.check:
                open(path, "w", encoding="utf-8", newline="\n").write(new)
    print("%d credential(s) in %d file(s)%s"
          % (total, files, " (check only)" if args.check else " redacted"))
    return 1 if args.check and total else 0


if __name__ == "__main__":
    sys.exit(main(sys.argv))
