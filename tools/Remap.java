import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.SimpleRemapper;

/**
 * Rename classes inside a jar with a ProGuard-style class mapping.
 *
 *   java Remap in.jar out.jar modules.proguard.txt
 *
 * ProGuard writes {@code old.Name -> new.Name:}; dots become slashes. Inner and
 * anonymous classes of a renamed owner are renamed with the same prefix.
 */
public final class Remap {
    private Remap() {
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.err.println("usage: Remap in.jar out.jar mapping.proguard.txt");
            System.exit(2);
        }
        Map<String, String> map = new HashMap<>();
        for (String line : Files.readAllLines(Path.of(args[2]))) {
            line = line.trim();
            int arrow = line.indexOf(" -> ");
            if (arrow < 0 || !line.endsWith(":")) {
                continue;
            }
            String from = line.substring(0, arrow).trim().replace('.', '/');
            String to = line.substring(arrow + 4, line.length() - 1).trim().replace('.', '/');
            if (!from.isEmpty() && !to.isEmpty()) {
                map.put(from, to);
            }
        }

        List<String> names = new ArrayList<>();
        try (ZipFile in = new ZipFile(args[0])) {
            Enumeration<? extends ZipEntry> en = in.entries();
            while (en.hasMoreElements()) {
                String n = en.nextElement().getName();
                if (n.endsWith(".class")) {
                    names.add(n.substring(0, n.length() - 6));
                }
            }
        }
        for (String name : names) {
            for (Map.Entry<String, String> e : new HashMap<>(map).entrySet()) {
                String old = e.getKey();
                if (name.startsWith(old + "$")) {
                    map.put(name, e.getValue() + name.substring(old.length()));
                }
            }
        }

        int renamed = 0;
        try (ZipFile in = new ZipFile(args[0]);
             ZipOutputStream out = new ZipOutputStream(Files.newOutputStream(Path.of(args[1])))) {
            Enumeration<? extends ZipEntry> en = in.entries();
            while (en.hasMoreElements()) {
                ZipEntry entry = en.nextElement();
                String name = entry.getName();
                byte[] data = readAll(in.getInputStream(entry));
                String entryName = name;
                if (name.endsWith(".class")) {
                    String cls = name.substring(0, name.length() - 6);
                    String to = map.get(cls);
                    if (to != null) {
                        ClassReader reader = new ClassReader(data);
                        ClassWriter writer = new ClassWriter(0);
                        reader.accept(new ClassRemapper(writer, new SimpleRemapper(map)), 0);
                        data = writer.toByteArray();
                        entryName = to + ".class";
                        renamed++;
                    }
                }
                out.putNextEntry(new ZipEntry(entryName));
                out.write(data);
                out.closeEntry();
            }
        }
        System.out.println("renamed " + renamed + " classes into " + args[1]);
    }

    private static byte[] readAll(InputStream in) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        byte[] chunk = new byte[1 << 16];
        int n;
        while ((n = in.read(chunk)) > 0) {
            buffer.write(chunk, 0, n);
        }
        return buffer.toByteArray();
    }
}
