/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.humbleui.skija.ColorType
 *  io.github.humbleui.skija.DirectContext
 *  io.github.humbleui.skija.Image
 *  io.github.humbleui.skija.SurfaceOrigin
 *  org.lwjgl.opengl.GL11
 */
package cc.astralis;

import cc.astralis.agz;
import cc.astralis.cmq;
import cc.astralis.dar;
import cc.astralis.ehy;
import cc.astralis.ekh;
import io.github.humbleui.skija.ColorType;
import io.github.humbleui.skija.DirectContext;
import io.github.humbleui.skija.Image;
import io.github.humbleui.skija.SurfaceOrigin;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class hcu {
    private static final int bhn;
    private static final Map<Integer, agz> gui;
    private static final Map<String, Image> ezx;
    private static final Map<String, Image> hdi;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public hcu() {
        hcu a;
    }

    public static Image byu(DirectContext a, int a2, int a3, int a4, boolean a5) {
        agz agz2;
        block4: {
            agz a6;
            block5: {
                block3: {
                    int[] a7;
                    block2: {
                        long a8 = hcu.a ^ 0x153FAD5AEFA8L;
                        int[] nArray = dar.abu();
                        long cfr_ignored_0 = 0x6297610494EFE4DCL ^ a8;
                        GL11.glBindTexture((int)3553, (int)a2);
                        a7 = nArray;
                        agz2 = a6 = gui.get(a2);
                        if (a7 == null) break block2;
                        if (agz2 == null) break block3;
                        agz2 = a6;
                    }
                    if (a7 == null) break block4;
                    if (agz2.aec(a3, a4, a5)) break block5;
                }
                Image a9 = hcu.dox(a, a2, a3, a4, a5);
                a6 = new agz(a9, a3, a4, a5);
                gui.put(a2, a6);
            }
            agz2 = a6;
        }
        return agz2.gac;
    }

    private static Image dox(DirectContext a, int a2, int a3, int a4, boolean a5) {
        long a6 = hcu.a ^ 0x70A19783A498L;
        ColorType a7 = a5 ? ColorType.RGBA_8888 : ColorType.RGB_888X;
        long cfr_ignored_0 = 0x7A32B16B2D172675L ^ a6;
        long cfr_ignored_1 = 0x390B637C19B2F657L ^ a6;
        return Image.adoptGLTextureFrom((DirectContext)a, (int)a2, (int)3553, (int)a3, (int)a4, (int)32856, (SurfaceOrigin)SurfaceOrigin.BOTTOM_LEFT, (ColorType)a7);
    }

    /*
     * Unable to fully structure code
     */
    public static Image fkx(InputStream a) {
        block16: {
            block14: {
                a = hcu.a ^ 58175727990823L;
                a = dar.abu();
                v0 = a;
                if (a == null) ** GOTO lbl12
                if (v0 == null) {
                    3684328725138099958L ^ a;
                    throw new IllegalArgumentException("InputStream cannot be null");
                }
                v0 = a;
lbl12:
                // 2 sources

                a = v0;
                try {
                    a = a.readAllBytes();
                    var6_7 = Image.makeDeferredFromEncodedBytes((byte[])a);
                    v1 = a;
                    if (a == null) break block14;
                }
                catch (Throwable var5_6) {
                    try {
                        block15: {
                            v2 = a;
                            if (a == null) ** GOTO lbl25
                            if (v2 == null) break block15;
                            try {
                                v2 = a;
lbl25:
                                // 2 sources

                                v2.close();
                            }
                            catch (Throwable var6_8) {
                                var5_6.addSuppressed(var6_8);
                            }
                        }
                        throw var5_6;
                    }
                    catch (IOException a) {
                        7848528856528119385L ^ a;
                        throw new RuntimeException("Failed to load Skija Image from stream", a);
                    }
                }
                if (v1 == null) break block16;
                v1 = a;
            }
            v1.close();
        }
        return var6_7;
    }

    public static Image dhy(String a2) {
        return ezx.computeIfAbsent(a2, a -> {
            void a2;
            long a3 = hcu.a ^ 0x2AD7E4B00C78L;
            long cfr_ignored_0 = 0x30120FC876343934L ^ a3;
            InputStream inputStream = hcu.class.getResourceAsStream("assets/astralis/" + a);
            int[] a4 = dar.abu();
            void v0 = a2;
            if (a4 != null) {
                if (v0 == null) {
                    long cfr_ignored_1 = 0x5E3E7B7615DD6F02L ^ a3;
                    throw new IllegalArgumentException("Resource not found: " + a);
                }
                v0 = a2;
            }
            return hcu.fkx((InputStream)v0);
        });
    }

    public static Image fbz(String a2) {
        String string;
        block4: {
            block5: {
                long a3;
                block3: {
                    int[] nArray;
                    block2: {
                        a3 = hcu.a ^ 0x1745EC34373BL;
                        nArray = dar.abu();
                        string = a2;
                        if (nArray == null) break block2;
                        if (string == null) break block3;
                        string = a2;
                    }
                    if (nArray == null) break block4;
                    if (!string.isEmpty()) break block5;
                }
                long cfr_ignored_0 = 0x39D428958FFAACA7L ^ a3;
                throw new IllegalArgumentException("Absolute path cannot be null or empty");
            }
            string = ezx.computeIfAbsent(a2, a -> {
                Image image;
                long a2 = hcu.a ^ 0x12627FDD9B76L;
                FileInputStream a3 = new FileInputStream((String)a);
                try {
                    image = hcu.fkx(a3);
                }
                catch (Throwable throwable) {
                    try {
                        try {
                            ((InputStream)a3).close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                        throw throwable;
                    }
                    catch (IOException a4) {
                        long cfr_ignored_0 = 0x1F59AA880E8F249DL ^ a2;
                        throw new RuntimeException("Failed to load Skija Image from path: " + a, a4);
                    }
                }
                ((InputStream)a3).close();
                return image;
            });
        }
        return (Image)string;
    }

    public static void asr() {
        block3: {
            long a = hcu.a ^ 0x3426C9A06F5BL;
            Iterator<Image> iterator = ezx.values().iterator();
            int[] a2 = dar.abu();
            while (iterator.hasNext()) {
                block5: {
                    Image image;
                    block4: {
                        Image a3 = iterator.next();
                        if (a2 == null) break block3;
                        image = a3;
                        if (a2 == null) break block4;
                        if (image == null) break block5;
                        image = a3;
                    }
                    image.close();
                }
                if (a2 != null) continue;
            }
            ezx.clear();
        }
    }

    public static Image amw(String a) {
        return hdi.computeIfAbsent(a.toString(), arg_0 -> hcu.lambda$loadSkin$2(a, arg_0));
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ Image lambda$loadSkin$2(String a, String a) {
        block13: {
            block11: {
                a = hcu.a ^ 106190640603680L;
                a = dar.abu();
                a = ehy.cyx(a);
                try {
                    var6_6 = hcu.fkx(a);
                    v0 = a;
                    if (a == null) break block11;
                }
                catch (Throwable var6_7) {
                    try {
                        block12: {
                            v1 = a;
                            if (a == null) ** GOTO lbl16
                            if (v1 == null) break block12;
                            try {
                                v1 = a;
lbl16:
                                // 2 sources

                                v1.close();
                            }
                            catch (Throwable var7_8) {
                                var6_7.addSuppressed(var7_8);
                            }
                        }
                        throw var6_7;
                    }
                    catch (Exception a) {
                        return null;
                    }
                }
                if (v0 == null) break block13;
                v0 = a;
            }
            v0.close();
        }
        return var6_6;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        hcu.a = 124557723121435L;
                        var20 = hcu.a ^ 21832085429261L;
                        hcu.d = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[6];
                        var16_4 = 0;
                        var15_5 = "G\"5\u00ce\u00d4\u00a3\u000b@\u00af=\u000f\u008d\u00f1\u0083\u00a5\u00c3\u00a1h\u00d4\u00fa\u00a0\u00fb\u0018 \u0092\u008d\u00b1\u00ef-k\u00a0|Y\t\u0089\u0000bO3Z(\u00db\u00cap\u008c\u0006\u00b7\u00134%0\u0015\u00c4\u00cf\u00f2m;\u0089\u0001\u0083zu\u00b3\u009e*\u008b\u000e\u001bDQH:\u008a\u00eeJ\u00d5\u009b\u0097\u00c2\u00c0\u00b3@Q\"\u00b6\u00d2\u00e2\u00fb&'\u008d\u00b6\u00b0\u00b4\u00b4\u00baw\u00ae^\u001e<x\u0011\u0017\u00d2\u00b0\u0010\u00f0\u00acH\u0018\u00daq\u00cd\u00b8\u00f7\u00c9\u00ce\u00ff\u00d6\u0082L\u00ffs\u001d\u0094\u00e4\u00c9AW\u00f8p~\rv\u00a8\u00f7\u0017\u0088\\\u00d0\u00a9\b\u00f0P\u0096@[\u00d1\u00b6Z\u0001\u00ec\u008dKnh\u009d\u0018\r\u00f6b\u0017\u00ea\u00a7\u00e8?\u0015\u00bdD#\u00a0U(]\u009c/\u00c7\u008a\u00c5\u00e2\u0099\u00837\u00f0d\u00e7\u00bd\u00ec\u0011\u0013\u00b8\u00e8\u00d4\u0002p\u00d5\t\u0010\u001f.\u0010\u00e6\u00beE\u00a9\u00c8\u00cb\u0095\u00b1\u009a";
                        var17_6 = "G\"5\u00ce\u00d4\u00a3\u000b@\u00af=\u000f\u008d\u00f1\u0083\u00a5\u00c3\u00a1h\u00d4\u00fa\u00a0\u00fb\u0018 \u0092\u008d\u00b1\u00ef-k\u00a0|Y\t\u0089\u0000bO3Z(\u00db\u00cap\u008c\u0006\u00b7\u00134%0\u0015\u00c4\u00cf\u00f2m;\u0089\u0001\u0083zu\u00b3\u009e*\u008b\u000e\u001bDQH:\u008a\u00eeJ\u00d5\u009b\u0097\u00c2\u00c0\u00b3@Q\"\u00b6\u00d2\u00e2\u00fb&'\u008d\u00b6\u00b0\u00b4\u00b4\u00baw\u00ae^\u001e<x\u0011\u0017\u00d2\u00b0\u0010\u00f0\u00acH\u0018\u00daq\u00cd\u00b8\u00f7\u00c9\u00ce\u00ff\u00d6\u0082L\u00ffs\u001d\u0094\u00e4\u00c9AW\u00f8p~\rv\u00a8\u00f7\u0017\u0088\\\u00d0\u00a9\b\u00f0P\u0096@[\u00d1\u00b6Z\u0001\u00ec\u008dKnh\u009d\u0018\r\u00f6b\u0017\u00ea\u00a7\u00e8?\u0015\u00bdD#\u00a0U(]\u009c/\u00c7\u008a\u00c5\u00e2\u0099\u00837\u00f0d\u00e7\u00bd\u00ec\u0011\u0013\u00b8\u00e8\u00d4\u0002p\u00d5\t\u0010\u001f.\u0010\u00e6\u00beE\u00a9\u00c8\u00cb\u0095\u00b1\u009a".length();
                        var14_7 = 40;
                        var13_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = hcu.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "=\u00cb\u0090\u00e8u\u0097\u008a\u00aegG\u00af\u00cb\u00eerDS\u0017[+C\u00d4Wp\u000fX\u00e3\u00c4H\u009a\u00be\u00c7M\u00925\u0085\u00bcb\u0012O\u0082ko\u0094\u001e=\u00f7\u00d5|\u00dd\u00e5 z\u00c9c\u00ba\u00efSy\u0088\u00b0P\u0001Ng8\u009c\u00e6\u00d2\u0096>\u0012\u00fa\u0082\u00ae>\u00e46\u00af\u00eb\u00dbT\u00d4\u001b\u00fc\u009fj~\u00ec+I\u0019\u0015j^\u00c5D\u0094i\u0003\u0088\u00ba\t\u0093\u0082z\u0091\u00bb\u00b6<\u009a\u00a7\u00c9\u00c2d\u008e\u00d4\u00f3\u00c6\u00e7\u00c5\u00db";
                            var17_6 = "=\u00cb\u0090\u00e8u\u0097\u008a\u00aegG\u00af\u00cb\u00eerDS\u0017[+C\u00d4Wp\u000fX\u00e3\u00c4H\u009a\u00be\u00c7M\u00925\u0085\u00bcb\u0012O\u0082ko\u0094\u001e=\u00f7\u00d5|\u00dd\u00e5 z\u00c9c\u00ba\u00efSy\u0088\u00b0P\u0001Ng8\u009c\u00e6\u00d2\u0096>\u0012\u00fa\u0082\u00ae>\u00e46\u00af\u00eb\u00dbT\u00d4\u001b\u00fc\u009fj~\u00ec+I\u0019\u0015j^\u00c5D\u0094i\u0003\u0088\u00ba\t\u0093\u0082z\u0091\u00bb\u00b6<\u009a\u00a7\u00c9\u00c2d\u008e\u00d4\u00f3\u00c6\u00e7\u00c5\u00db".length();
                            var14_7 = 64;
                            var13_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = hcu.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl51:
                        // 1 sources

                        ** continue;
                    }
                }
                hcu.b = var18_3;
                hcu.c = new String[6];
                hcu.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[6];
                var3_13 = 0;
                var4_14 = "\u000b\u008d\u009d\u0098\u009a\u00e4D\u0013V\u00c5\u00a9\u00eb\u0099\u00dd\u00b2C2\u00d4@\u00c25\u0011\u0004\u00cc\u00c6\u00d0\u00d0\u00c4\u009e\"0\u00f1";
                var5_15 = "\u000b\u008d\u009d\u0098\u009a\u00e4D\u0013V\u00c5\u00a9\u00eb\u0099\u00dd\u00b2C2\u00d4@\u00c25\u0011\u0004\u00cc\u00c6\u00d0\u00d0\u00c4\u009e\"0\u00f1".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00a3\u00ba.\u0081\u00d2\u008dt\u00de\u0006z\u00ab\u0006%\u00d3\u00123";
                    var5_15 = "\u00a3\u00ba.\u0081\u00d2\u008dt\u00de\u0006z\u00ab\u0006%\u00d3\u00123".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl104:
                // 1 sources

                ** continue;
            }
        }
        hcu.e = var6_12;
        hcu.f = new Integer[6];
        var20 ^ 4786523319081293395L;
        hcu.bhn = 256;
        8265364495091797452L ^ var20;
        hcu.gui = new cmq(64, 0.75f, true);
        hcu.ezx = new ConcurrentHashMap<String, Image>();
        591771404138474110L ^ var20;
        hcu.hdi = new ekh(128, 0.75f, true);
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1365;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("cc/astralis/hcu", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            hcu.c[n2] = hcu.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = hcu.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("cc/astralis/hcu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7104;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("cc/astralis/hcu", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            hcu.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = hcu.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("cc/astralis/hcu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(hcu.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(hcu.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
