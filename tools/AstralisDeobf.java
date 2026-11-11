import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 * AstralisDeobf - offline constant recovery for the Astralis jar.
 *
 * Reads the map produced by tools/astralis_deobf.py and rewrites class files:
 *   - DES-encrypted string constants  -> plaintext LDC
 *   - invokedynamic (IJ)I constants   -> POP2 POP LDC value
 *
 * The invokedynamic operands are recovered with ASM's data-flow Analyzer over a
 * constant-tracking interpreter, then the concrete int is folded in. No class
 * from the input jar is loaded or initialised.
 *
 * usage: java -cp ... AstralisDeobf <inDir> <outDir> <map>
 */
public final class AstralisDeobf {

    static final class Info {
        String field = "a";
        long a;
        long key;
        int xor = 19379;
        int xorStr = -1;
        final List<byte[]> table = new ArrayList<>();
        final List<long[]> arrays = new ArrayList<>();
        final Map<String, String> strings = new HashMap<>();
    }

    static final Map<String, Info> DB = new HashMap<>();
    static final boolean DBG = System.getProperty("dbg") != null;
    static int nStrings, nIndy, nClasses, nFail, nAnalyzed;

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.err.println("usage: AstralisDeobf <inDir> <outDir> <map>");
            System.exit(2);
        }
        Path in = Paths.get(args[0]);
        Path out = Paths.get(args[1]);
        loadMap(Paths.get(args[2]));

        List<Path> files = new ArrayList<>();
        try (var stream = Files.walk(in)) {
            stream.filter(p -> p.toString().endsWith(".class")).forEach(files::add);
        }
        files.sort(Comparator.comparing(Path::toString));

        for (Path p : files) {
            String rel = in.relativize(p).toString().replace('\\', '/');
            Path dst = out.resolve(rel);
            Files.createDirectories(dst.getParent());
            byte[] data = Files.readAllBytes(p);
            try {
                ClassReader cr = new ClassReader(data);
                ClassNode cn = new ClassNode();
                cr.accept(cn, 0);
                boolean changed = transform(cn, DB.get(rel));
                if (changed) {
                    ClassWriter cw = new ClassWriter(0);
                    cn.accept(cw);
                    Files.write(dst, cw.toByteArray());
                } else {
                    Files.write(dst, data);
                }
                nClasses++;
            } catch (Throwable t) {
                nFail++;
                System.err.println("[!] " + rel + ": " + t);
                Files.write(dst, data);
            }
        }
        System.out.printf("classes=%d analyzed=%d strings=%d indy=%d failures=%d%n",
                nClasses, nAnalyzed, nStrings, nIndy, nFail);
    }

    static void loadMap(Path file) throws IOException {
        Info cur = null;
        for (String line : Files.readAllLines(file, StandardCharsets.UTF_8)) {
            if (line.isBlank()) continue;
            String[] f = line.split(" ");
            switch (f[0]) {
                case "C" -> { cur = new Info(); DB.put(f[1], cur); }
                case "F" -> cur.field = f[1];
                case "A" -> cur.a = Long.parseUnsignedLong(f[1], 16);
                case "K" -> cur.key = Long.parseUnsignedLong(f[1], 16);
                case "X" -> cur.xor = Integer.parseInt(f[1]);
                case "Y" -> cur.xorStr = Integer.parseInt(f[1]);
                case "T" -> {
                    for (String part : f[1].split("\\|"))
                        cur.table.add(Base64.getDecoder().decode(part));
                }
                case "B" -> {
                    String[] parts = f[1].split(",");
                    long[] arr = new long[parts.length];
                    for (int i = 0; i < parts.length; i++) arr[i] = Long.parseUnsignedLong(parts[i], 16);
                    cur.arrays.add(arr);
                }
                case "S" -> {
                    String enc = new String(Base64.getDecoder().decode(f[1]), StandardCharsets.UTF_8);
                    String dec = new String(Base64.getDecoder().decode(f[2]), StandardCharsets.UTF_8);
                    cur.strings.put(enc, dec);
                }
                default -> { }
            }
        }
        System.out.println("map entries: " + DB.size());
    }

    static boolean transform(ClassNode cn, Info info) {
        if (info == null) return false;
        boolean changed = false;
        for (MethodNode mn : cn.methods) {
            // pass 1: strings
            for (AbstractInsnNode insn : mn.instructions) {
                if (insn instanceof LdcInsnNode ldc && ldc.cst instanceof String s) {
                    String plain = info.strings.get(s);
                    if (plain != null) {
                        ldc.cst = plain;
                        nStrings++;
                        changed = true;
                    }
                }
            }
            if (info.arrays.isEmpty() && info.table.isEmpty()) continue;

            // pass 2: invokedynamic constants via data flow
            Frame<Const>[] frames;
            try {
                frames = new Analyzer<>(new ConstInterp(info)).analyze(cn.name, mn);
                nAnalyzed++;
            } catch (Throwable t) {
                if (DBG) System.err.println("[analyze] " + cn.name + "." + mn.name + ": " + t);
                continue;
            }
            List<AbstractInsnNode> kill = new ArrayList<>();
            List<Object> vals = new ArrayList<>();
            AbstractInsnNode[] arr = mn.instructions.toArray();
            for (int i = 0; i < arr.length; i++) {
                AbstractInsnNode insn = arr[i];
                if (!(insn instanceof InvokeDynamicInsnNode indy)) continue;
                boolean isInt = indy.desc.equals("(IJ)I");
                boolean isStr = indy.desc.equals("(IJ)Ljava/lang/String;")
                        && !info.table.isEmpty() && info.xorStr >= 0;
                if (!isInt && !isStr) continue;
                Frame<Const> fr = frames[i];
                if (fr == null) continue;
                int n = fr.getStackSize();
                if (n < 2) continue;
                Const v0 = fr.getStack(n - 2);
                Const v1 = fr.getStack(n - 1);
                if (DBG) System.err.printf("indy@%d %s: v0=%s v1=%s%n", i, indy.desc,
                        v0.known ? Long.toString(v0.value) : "?", v1.known ? Long.toString(v1.value) : "?");
                if (!v0.known || !v1.known) continue;
                if (isInt) {
                    Integer val = eval(info, v0.value, v1.value);
                    if (val == null) continue;
                    kill.add(indy);
                    vals.add(val);
                } else {
                    int idx = (int) ((v0.value ^ (v1.value & 0x7FFF) ^ info.xorStr) & 0x7FFFFFFF);
                    if (idx >= info.table.size()) continue;
                    String s = decryptString(info.table.get(idx), v1.value);
                    if (s == null) continue;
                    kill.add(indy);
                    vals.add(s);
                }
            }
            for (int i = 0; i < kill.size(); i++) {
                AbstractInsnNode insn = kill.get(i);
                InsnList add = new InsnList();
                add.add(new InsnNode(Opcodes.POP2));
                add.add(new InsnNode(Opcodes.POP));
                add.add(new LdcInsnNode(vals.get(i)));
                mn.instructions.insertBefore(insn, add);
                mn.instructions.remove(insn);
                nIndy++;
                changed = true;
            }
        }
        return changed;
    }

    static String decryptString(byte[] ct, long arg1) {
        byte[] kb = new byte[8];
        for (int k = 0; k < 8; k++) kb[k] = (byte) (arg1 >>> (56 - 8 * k));
        try {
            Cipher c = Cipher.getInstance("DES/CBC/PKCS5Padding");
            c.init(Cipher.DECRYPT_MODE,
                    SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(kb)),
                    new IvParameterSpec(new byte[8]));
            return cesu8(c.doFinal(ct));
        } catch (Exception e) {
            return null;
        }
    }

    /** same byte->char pass the obfuscator uses */
    static String cesu8(byte[] b) {
        StringBuilder sb = new StringBuilder(b.length);
        int i = 0;
        while (i < b.length) {
            int v = b[i] & 0xFF;
            if (v < 0xC0) { sb.append((char) v); i++; }
            else if (v < 0xE0 && i + 1 < b.length) {
                sb.append((char) (((v & 0x1F) << 6) | (b[i + 1] & 0x3F))); i += 2;
            } else if (i + 2 < b.length) {
                sb.append((char) (((v & 0x0F) << 12) | ((b[i + 1] & 0x3F) << 6) | (b[i + 2] & 0x3F)));
                i += 3;
            } else break;
        }
        return sb.toString();
    }

    static Integer eval(Info info, long arg0, long arg1) {
        int idx = (int) ((arg0 ^ (arg1 & 0x7FFF) ^ info.xor) & 0x7FFFFFFF);
        for (long[] array : info.arrays) {
            if (idx >= array.length) continue;
            byte[] ct = new byte[8];
            byte[] kb = new byte[8];
            for (int k = 0; k < 8; k++) {
                ct[k] = (byte) (array[idx] >>> (56 - 8 * k));
                kb[k] = (byte) (arg1 >>> (56 - 8 * k));
            }
            try {
                Cipher c = Cipher.getInstance("DES/CBC/NoPadding");
                c.init(Cipher.DECRYPT_MODE,
                        SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(kb)),
                        new IvParameterSpec(new byte[8]));
                byte[] pt = c.doFinal(ct);
                return ((pt[4] & 0xFF) << 24) | ((pt[5] & 0xFF) << 16)
                        | ((pt[6] & 0xFF) << 8) | (pt[7] & 0xFF);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    /** int/long constant, everything else unknown */
    static final class Const implements Value {
        static final Const UNKNOWN = new Const(false, 0, 1);
        final boolean known;
        final long value;
        final int size;

        Const(boolean known, long value, int size) {
            this.known = known; this.value = value; this.size = size;
        }

        static Const of(long v, int size) { return new Const(true, v, size); }

        @Override public int getSize() { return size; }

        @Override public boolean equals(Object o) {
            if (!(o instanceof Const c)) return false;
            return known == c.known && (!known || value == c.value) && size == c.size;
        }

        @Override public int hashCode() { return Long.hashCode(value) ^ size; }
    }

    static final class ConstInterp extends Interpreter<Const> {
        final Info info;

        ConstInterp(Info info) { super(Opcodes.ASM9); this.info = info; }

        @Override public Const newValue(Type type) {
            if (type == null) return Const.UNKNOWN;
            if (type.getSort() == Type.VOID) return null;
            return new Const(false, 0, type.getSize());
        }

        @Override public Const newOperation(AbstractInsnNode insn) {
            switch (insn.getOpcode()) {
                case Opcodes.ICONST_M1: return Const.of(-1, 1);
                case Opcodes.ICONST_0: return Const.of(0, 1);
                case Opcodes.ICONST_1: return Const.of(1, 1);
                case Opcodes.ICONST_2: return Const.of(2, 1);
                case Opcodes.ICONST_3: return Const.of(3, 1);
                case Opcodes.ICONST_4: return Const.of(4, 1);
                case Opcodes.ICONST_5: return Const.of(5, 1);
                case Opcodes.LCONST_0: return Const.of(0, 2);
                case Opcodes.LCONST_1: return Const.of(1, 2);
                case Opcodes.BIPUSH:
                case Opcodes.SIPUSH: return Const.of(((IntInsnNode) insn).operand, 1);
                case Opcodes.LDC: {
                    Object c = ((LdcInsnNode) insn).cst;
                    if (c instanceof Integer v) return Const.of(v, 1);
                    if (c instanceof Long v) return Const.of(v, 2);
                    return Const.UNKNOWN;
                }
                case Opcodes.GETSTATIC: {
                    FieldInsnNode f = (FieldInsnNode) insn;
                    if (f.desc.equals("J") && f.name.equals(info.field)) return Const.of(info.a, 2);
                    return new Const(false, 0, Type.getType(f.desc).getSize());
                }
                case Opcodes.GETFIELD: {
                    FieldInsnNode f = (FieldInsnNode) insn;
                    return new Const(false, 0, Type.getType(f.desc).getSize());
                }
                case Opcodes.ACONST_NULL: return new Const(false, 0, 1);
                default: return Const.UNKNOWN;
            }
        }

        @Override public Const copyOperation(AbstractInsnNode insn, Const value) { return value; }

        @Override public Const unaryOperation(AbstractInsnNode insn, Const value) {
            switch (insn.getOpcode()) {
                case Opcodes.I2L: return value.known ? Const.of((int) value.value, 2) : new Const(false, 0, 2);
                case Opcodes.L2I: return value.known ? Const.of((int) value.value, 1) : new Const(false, 0, 1);
                case Opcodes.INEG: return value.known ? Const.of(-value.value, 1) : Const.UNKNOWN;
                case Opcodes.LNEG: return value.known ? Const.of(-value.value, 2) : new Const(false, 0, 2);
                default: return new Const(false, 0, value.size);
            }
        }

        @Override public Const binaryOperation(AbstractInsnNode insn, Const a, Const b) {
            int size = Math.max(a.size, b.size);
            if (!a.known || !b.known) return new Const(false, 0, size);
            long x = a.value, y = b.value;
            return switch (insn.getOpcode()) {
                case Opcodes.IXOR, Opcodes.LXOR -> Const.of(x ^ y, size);
                case Opcodes.IADD, Opcodes.LADD -> Const.of(x + y, size);
                case Opcodes.ISUB, Opcodes.LSUB -> Const.of(x - y, size);
                case Opcodes.IMUL, Opcodes.LMUL -> Const.of(x * y, size);
                case Opcodes.IAND, Opcodes.LAND -> Const.of(x & y, size);
                case Opcodes.IOR, Opcodes.LOR -> Const.of(x | y, size);
                case Opcodes.ISHL, Opcodes.LSHL -> Const.of(x << y, size);
                case Opcodes.ISHR, Opcodes.LSHR -> Const.of(x >> y, size);
                case Opcodes.IUSHR, Opcodes.LUSHR -> Const.of(x >>> y, size);
                default -> new Const(false, 0, size);
            };
        }

        @Override public Const ternaryOperation(AbstractInsnNode insn, Const a, Const b, Const c) {
            return Const.UNKNOWN;
        }

        @Override public Const naryOperation(AbstractInsnNode insn, List<? extends Const> values) {
            String desc = insn instanceof MethodInsnNode m ? m.desc
                    : insn instanceof InvokeDynamicInsnNode d ? d.desc : null;
            if (desc == null) return Const.UNKNOWN;
            Type ret = Type.getReturnType(desc);
            if (ret.getSort() == Type.VOID) return null;
            return new Const(false, 0, ret.getSize());
        }

        @Override public void returnOperation(AbstractInsnNode insn, Const value, Const expected) { }

        @Override public Const merge(Const a, Const b) {
            if (a.equals(b)) return a;
            return new Const(false, 0, Math.max(a.size, b.size));
        }
    }

    private AstralisDeobf() { }
}
