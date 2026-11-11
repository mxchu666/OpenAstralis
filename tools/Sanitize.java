import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

import java.nio.file.*;
import java.util.*;

/**
 * Sanitize - neutralises the remote-control surface of the Astralis client.
 *
 * Runs on the already deobfuscated classes (work/deobf) and writes patched
 * classes to an output directory; the jar is reassembled afterwards.
 *
 * What it does:
 *   1. rewrites every hard-coded C2 / payload URL to a dead loopback address
 *   2. replaces Runtime.getRuntime() with null so every halt() throws NPE into
 *      the surrounding catch instead of killing the game process
 *   3. empties the WebSocket callbacks and the three remote config fetchers
 *   4. optionally strips the native registration calls (Loader/Hidden0)
 *
 * usage: java Sanitize <inDir> <outDir> [--nonative]
 */
public final class Sanitize {

    static final String[][] URL_SWAPS = {
            {"ws://127.0.0.1:9/", "serenityutils.club"},
            {"http://127.0.0.1:9/", "discord.com/api/v10/channels"},
            {"http://127.0.0.1:9/", "pastebin.com"},
    };

    static int nUrl, nHalt, nStub, nNative;
    static boolean nonative;

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("usage: Sanitize <inDir> <outDir> [--nonative]");
            System.exit(2);
        }
        Path in = Paths.get(args[0]);
        Path out = Paths.get(args[1]);
        nonative = args.length > 2 && args[2].equals("--nonative");

        List<Path> files = new ArrayList<>();
        try (var s = Files.walk(in)) {
            s.filter(p -> p.toString().endsWith(".class")).forEach(files::add);
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
                if (patch(cn)) {
                    ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
                    cn.accept(cw);
                    Files.write(dst, cw.toByteArray());
                } else {
                    Files.write(dst, data);
                }
            } catch (Throwable t) {
                System.err.println("[!] " + rel + ": " + t);
                Files.write(dst, data);
            }
        }
        System.out.printf("url=%d halt=%d stubs=%d nativeCalls=%d%n", nUrl, nHalt, nStub, nNative);
    }

    static boolean patch(ClassNode cn) {
        boolean changed = false;

        for (MethodNode mn : cn.methods) {
            // ---- body-level rewrites
            for (AbstractInsnNode insn : mn.instructions) {
                if (insn instanceof LdcInsnNode ldc && ldc.cst instanceof String s) {
                    for (String[] swap : URL_SWAPS) {
                        if (s.contains(swap[1])) {
                            ldc.cst = swap[0];
                            nUrl++;
                            changed = true;
                        }
                    }
                }
                if (insn instanceof MethodInsnNode m
                        && m.owner.equals("java/lang/Runtime")
                        && m.name.equals("getRuntime")) {
                    mn.instructions.set(insn, new InsnNode(Opcodes.ACONST_NULL));
                    nHalt++;
                    changed = true;
                }
                if (nonative && insn instanceof MethodInsnNode m
                        && m.getOpcode() == Opcodes.INVOKESTATIC
                        && (m.owner.equals("dev/opalV2/Loader")
                            || m.owner.startsWith("dev/opalV2/hidden/"))) {
                    mn.instructions.set(insn, new InsnNode(Opcodes.NOP));
                    nNative++;
                    changed = true;
                }
            }

            // ---- drop the native payload entirely: a native method without the
            // DLL is an UnsatisfiedLinkError waiting for a call site, so it
            // becomes a plain Java stub that returns a neutral value.
            if (nonative && (mn.access & Opcodes.ACC_NATIVE) != 0) {
                mn.access &= ~Opcodes.ACC_NATIVE;
                stub(mn);
                nNative++;
                changed = true;
            }

            // ---- stub out the C2 surface
            String key = cn.name + "." + mn.name + mn.desc;
            if (shouldStub(key)) {
                stub(mn);
                nStub++;
                changed = true;
            }
        }
        return changed;
    }

    static boolean shouldStub(String key) {
        return key.equals("cc/astralis/hdl.onOpen(Lorg/java_websocket/handshake/ServerHandshake;)V")
            || key.equals("cc/astralis/hdl.onError(Ljava/lang/Exception;)V")
            || key.equals("cc/astralis/hdl.onClose(ILjava/lang/String;Z)V")
            || key.equals("cc/astralis/dle.gxa()V")
            || key.equals("cc/astralis/fwi.akb()Ljava/lang/String;")
            || key.equals("cc/astralis/fwi.cvu()Z")
            || key.equals("cc/astralis/hht.ga()Z");
    }

    static void stub(MethodNode mn) {
        mn.instructions.clear();
        mn.tryCatchBlocks.clear();
        if (mn.localVariables != null) mn.localVariables.clear();
        Type ret = Type.getReturnType(mn.desc);
        switch (ret.getSort()) {
            case Type.VOID -> mn.instructions.add(new InsnNode(Opcodes.RETURN));
            case Type.BOOLEAN, Type.BYTE, Type.CHAR, Type.SHORT, Type.INT -> {
                mn.instructions.add(new InsnNode(Opcodes.ICONST_0));
                mn.instructions.add(new InsnNode(Opcodes.IRETURN));
            }
            case Type.LONG -> {
                mn.instructions.add(new InsnNode(Opcodes.LCONST_0));
                mn.instructions.add(new InsnNode(Opcodes.LRETURN));
            }
            case Type.FLOAT -> {
                mn.instructions.add(new InsnNode(Opcodes.FCONST_0));
                mn.instructions.add(new InsnNode(Opcodes.FRETURN));
            }
            case Type.DOUBLE -> {
                mn.instructions.add(new InsnNode(Opcodes.DCONST_0));
                mn.instructions.add(new InsnNode(Opcodes.DRETURN));
            }
            default -> {
                mn.instructions.add(new InsnNode(Opcodes.ACONST_NULL));
                mn.instructions.add(new InsnNode(Opcodes.ARETURN));
            }
        }
    }

    private Sanitize() { }
}
