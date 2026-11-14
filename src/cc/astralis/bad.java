package cc.astralis;

import io.github.humbleui.skija.Canvas;
import io.github.humbleui.skija.FontMetrics;
import io.github.humbleui.skija.ImageFilter;
import io.github.humbleui.skija.Paint;
import io.github.humbleui.skija.Typeface;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_124;

public final class bad {
   private final String bmh;
   private final float eak;
   private final Typeface ezr;
   private final io.github.humbleui.skija.Font eax;
   private final fll ckr;
   private final Paint hel;
   private final ImageFilter gqt;
   private volatile boolean hav;
   private static final ImageFilter cwr;
   private static final long a = 3770022731586L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public bad(String name, float size) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic cc/astralis/bad.a J
      // 003: ldc2_w 96291972713189
      // 006: lxor
      // 007: lstore 3
      // 008: aload 0
      // 009: invokespecial java/lang/Object.<init> ()V
      // 00c: invokestatic cc/astralis/dar.abu ()[I
      // 00f: aload 0
      // 010: new io/github/humbleui/skija/Paint
      // 013: dup
      // 014: invokespecial io/github/humbleui/skija/Paint.<init> ()V
      // 017: putfield cc/astralis/bad.hel Lio/github/humbleui/skija/Paint;
      // 01a: aload 0
      // 01b: ldc 4.0
      // 01d: invokestatic cc/astralis/dmp.fqt ()F
      // 020: fmul
      // 021: ldc 4.0
      // 023: invokestatic cc/astralis/dmp.fqt ()F
      // 026: fmul
      // 027: getstatic io/github/humbleui/skija/FilterTileMode.DECAL Lio/github/humbleui/skija/FilterTileMode;
      // 02a: invokestatic io/github/humbleui/skija/ImageFilter.makeBlur (FFLio/github/humbleui/skija/FilterTileMode;)Lio/github/humbleui/skija/ImageFilter;
      // 02d: putfield cc/astralis/bad.gqt Lio/github/humbleui/skija/ImageFilter;
      // 030: aload 0
      // 031: bipush 0
      // 032: putfield cc/astralis/bad.hav Z
      // 035: astore 5
      // 037: aload 0
      // 038: aload 1
      // 039: putfield cc/astralis/bad.bmh Ljava/lang/String;
      // 03c: aload 0
      // 03d: fload 2
      // 03e: putfield cc/astralis/bad.eak F
      // 041: ldc cc/astralis/bad
      // 043: aload 1
      // 044: sipush 1381
      // 047: ldc2_w 2714088072119770815
      // 04a: lload 3
      // 04b: lxor
      // 04c: pop2
      // 04d: pop
      // 04e: ldc "/assets/astralis/fonts/"
      // 050: swap
      // 051: sipush 11850
      // 054: ldc2_w 7045828757032596881
      // 057: lload 3
      // 058: lxor
      // 059: pop2
      // 05a: pop
      // 05b: ldc ".ttf"
      // 05d: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 062: invokevirtual java/lang/Class.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
      // 065: astore 7
      // 067: aload 7
      // 069: aload 5
      // 06b: ifnull 09d
      // 06e: ifnonnull 09b
      // 071: goto 078
      // 074: invokestatic cc/astralis/bad.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: new java/lang/IllegalArgumentException
      // 07b: dup
      // 07c: aload 1
      // 07d: sipush 19711
      // 080: ldc2_w 1452369372259686176
      // 083: lload 3
      // 084: lxor
      // 085: pop2
      // 086: pop
      // 087: ldc "Can't load font: "
      // 089: swap
      // 08a: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 08f: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 092: athrow
      // 093: invokestatic cc/astralis/bad.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: invokestatic cc/astralis/bad.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: aload 7
      // 09d: invokevirtual java/io/InputStream.readAllBytes ()[B
      // 0a0: astore 8
      // 0a2: aload 8
      // 0a4: invokestatic io/github/humbleui/skija/Data.makeFromBytes ([B)Lio/github/humbleui/skija/Data;
      // 0a7: invokestatic io/github/humbleui/skija/Typeface.makeFromData (Lio/github/humbleui/skija/Data;)Lio/github/humbleui/skija/Typeface;
      // 0aa: astore 6
      // 0ac: aload 7
      // 0ae: aload 5
      // 0b0: ifnull 0bf
      // 0b3: ifnull 0f0
      // 0b6: goto 0bd
      // 0b9: invokestatic cc/astralis/bad.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: aload 7
      // 0bf: invokevirtual java/io/InputStream.close ()V
      // 0c2: goto 0f0
      // 0c5: invokestatic cc/astralis/bad.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c8: athrow
      // 0c9: astore 8
      // 0cb: aload 7
      // 0cd: aload 5
      // 0cf: ifnull 0de
      // 0d2: ifnull 0ed
      // 0d5: goto 0dc
      // 0d8: invokestatic cc/astralis/bad.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: aload 7
      // 0de: invokevirtual java/io/InputStream.close ()V
      // 0e1: goto 0ed
      // 0e4: astore 9
      // 0e6: aload 8
      // 0e8: aload 9
      // 0ea: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 0ed: aload 8
      // 0ef: athrow
      // 0f0: goto 112
      // 0f3: astore 7
      // 0f5: new java/lang/RuntimeException
      // 0f8: dup
      // 0f9: aload 1
      // 0fa: sipush 1953
      // 0fd: ldc2_w 4525192834489277561
      // 100: lload 3
      // 101: lxor
      // 102: pop2
      // 103: pop
      // 104: ldc "Failed to load font: "
      // 106: swap
      // 107: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 10c: aload 7
      // 10e: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 111: athrow
      // 112: aload 0
      // 113: aload 6
      // 115: putfield cc/astralis/bad.ezr Lio/github/humbleui/skija/Typeface;
      // 118: aload 0
      // 119: new io/github/humbleui/skija/Font
      // 11c: dup
      // 11d: aload 0
      // 11e: getfield cc/astralis/bad.ezr Lio/github/humbleui/skija/Typeface;
      // 121: aload 0
      // 122: getfield cc/astralis/bad.eak F
      // 125: invokestatic cc/astralis/dmp.fqt ()F
      // 128: fmul
      // 129: invokespecial io/github/humbleui/skija/Font.<init> (Lio/github/humbleui/skija/Typeface;F)V
      // 12c: putfield cc/astralis/bad.eax Lio/github/humbleui/skija/Font;
      // 12f: aload 0
      // 130: getfield cc/astralis/bad.eax Lio/github/humbleui/skija/Font;
      // 133: bipush 1
      // 134: invokevirtual io/github/humbleui/skija/Font.setSubpixel (Z)Lio/github/humbleui/skija/Font;
      // 137: pop
      // 138: aload 0
      // 139: getfield cc/astralis/bad.eax Lio/github/humbleui/skija/Font;
      // 13c: getstatic io/github/humbleui/skija/FontHinting.FULL Lio/github/humbleui/skija/FontHinting;
      // 13f: invokevirtual io/github/humbleui/skija/Font.setHinting (Lio/github/humbleui/skija/FontHinting;)Lio/github/humbleui/skija/Font;
      // 142: pop
      // 143: aload 0
      // 144: getfield cc/astralis/bad.eax Lio/github/humbleui/skija/Font;
      // 147: getstatic io/github/humbleui/skija/FontEdging.SUBPIXEL_ANTI_ALIAS Lio/github/humbleui/skija/FontEdging;
      // 14a: invokevirtual io/github/humbleui/skija/Font.setEdging (Lio/github/humbleui/skija/FontEdging;)Lio/github/humbleui/skija/Font;
      // 14d: pop
      // 14e: aload 0
      // 14f: new cc/astralis/fll
      // 152: dup
      // 153: aload 0
      // 154: fload 2
      // 155: invokestatic cc/astralis/dmp.fqt ()F
      // 158: fmul
      // 159: invokespecial cc/astralis/fll.<init> (Lcc/astralis/bad;F)V
      // 15c: putfield cc/astralis/bad.ckr Lcc/astralis/fll;
      // 15f: return
   }

   public io.github.humbleui.skija.Font bvg() {
      return a.eax;
   }

   public fll emq() {
      return a.ckr;
   }

   public void bkm(String text, float x, float y, Color baseColor) {
      a.hdu(a, a, a, a, false, false);
   }

   public void ejy(String text, float x, float y, Color baseColor) {
      a.hdu(a, a, a, a, false, true);
   }

   public void fmf(String text, float x, float y, Color color) {
      float ax = a - a.ena(a) / (2.0F * dmp.fqt());
      a.hdu(a, ax, a, a, false, false);
   }

   public void bmc(String text, float x, float y, Color color) {
      float ax = a - a.ena(a) / (2.0F * dmp.fqt());
      a.hdu(a, ax, a, a, false, true);
   }

   public void byi(String text, float x, float y, Color color) {
      float ax = a - a.ena(a) / 2.0F;
      float axx = a - a.dru(a) / 2.0F;
      a.hdu(a, ax, axx, a, false, false);
   }

   public void fty(String text, float x, float y, Color color) {
      float ax = a - a.ena(a) / 2.0F;
      float axx = a - a.dru(a) / 2.0F;
      a.hdu(a, ax, axx, a, false, true);
   }

   public void gcz(String text, float x, float y, float width, float height, Color color) {
      float ax = a + (a - a.ena(a)) / 2.0F;
      float axx = a + (a - a.dru(a)) / 2.0F;
      a.hdu(a, ax, axx, a, false, false);
   }

   public void ccw(String text, float x, float y, float width, float height, Color color) {
      float ax = a + (a - a.ena(a)) / 2.0F;
      float axx = a + (a - a.dru(a)) / 2.0F;
      a.hdu(a, ax, axx, a, false, true);
   }

   public void gvv(String text, float x, float y, boolean glow, Color textColor) {
      a.hdu(a, a, a, a, a, false);
   }

   public float ena(String text) {
      return a.eax.measureTextWidth(class_124.method_539(a), null) / dmp.fqt();
   }

   public float dru(String ignored) {
      FontMetrics ax = a.eax.getMetrics();
      return (ax.getDescent() - ax.getAscent()) / dmp.fqt();
   }

   public synchronized void bq() {
      long a = bad.a ^ 101508794840323L;
      int[] var3 = dar.abu();
      bad var10000 = a;
      if (var3 != null) {
         if (a.hav) {
            return;
         }

         a.gqt.close();
         a.hel.close();
         a.eax.close();
         a.ezr.close();
         var10000 = a;
      }

      var10000.hav = true;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private void hdu(String a, float a, float a, Color a, boolean a, boolean a) {
      long ax = bad.a ^ 68762203311366L;
      int[] var10000 = dar.abu();
      Canvas axx = dmp.fpb();
      int[] axxx = var10000;
      if (axx != null && !a.isEmpty()) {
         float axxxx = a * dmp.fqt();
         FontMetrics axxxxx = a.eax.getMetrics();
         float axxxxxx = -axxxxx.getAscent();
         float axxxxxxx = a * dmp.fqt() + axxxxxx;
         float axxxxxxxx = axxxx;

         for (gvf axxxxxxxxx : a.bhy(a, a.hel.setColor(a.getRGB()))) {
            String axxxxxxxxxx = axxxxxxxxx.hbz();
            Paint axxxxxxxxxxx = axxxxxxxxx.azn();
            boolean var27 = a;
            if (axxx != null) {
               if (a) {
                  Paint axxxxxxxxxxxx = axxxxxxxxxxx.makeClone().setColor(ear(a));
                  axx.drawString(axxxxxxxxxx, axxxxxxxx + 1.0F, axxxxxxx + 1.0F, a.eax, axxxxxxxxxxxx);
                  axxxxxxxxxxxx.close();
               }

               var27 = a;
            }

            label64: {
               if (var27) {
                  Paint axxxxxxxxxxxx = axxxxxxxxxxx.makeClone().setColor(a.getRGB()).setImageFilter(a.gqt);

                  try {
                     axx.drawString(axxxxxxxxxx, axxxxxxxx, axxxxxxx, a.eax, axxxxxxxxxxxx);
                  } catch (Throwable var25) {
                     Paint var28 = axxxxxxxxxxxx;
                     if (axxx != null) {
                        if (axxxxxxxxxxxx == null) {
                           throw var25;
                        }

                        try {
                           var28 = axxxxxxxxxxxx;
                        } catch (Throwable var24) {
                           var25.addSuppressed(var24);
                           throw var25;
                        }
                     }

                     try {
                        var28.close();
                     } catch (Throwable var23) {
                        var25.addSuppressed(var23);
                     }

                     throw var25;
                  }

                  if (axxx == null) {
                     break label64;
                  }

                  if (axxxxxxxxxxxx != null) {
                     axxxxxxxxxxxx.close();
                  }
               }

               axx.drawString(axxxxxxxxxx, axxxxxxxx, axxxxxxx, a.eax, axxxxxxxxxxx);
               axxxxxxxx += a.eax.measureTextWidth(axxxxxxxxxx, axxxxxxxxxxx);
            }

            if (axxx == null) {
               break;
            }
         }
      }
   }

   public List<gvf> bhy(String input, Paint originalPaint) {
      long ax = bad.a ^ 373671701151L;
      int[] axx = dar.abu();
      if (a.isEmpty()) {
         return Collections.emptyList();
      } else {
         ArrayList axxx = new ArrayList();
         short var10000 = 21498;
         long var10001 = 9066163424558032985L ^ ax;
         Pattern axxxx = Pattern.compile("§([0-9a-fklmnor])");
         Matcher axxxxx = axxxx.matcher(a);
         Paint axxxxxx = a.makeClone();
         int axxxxxxx = 0;

         while (true) {
            if (axxxxx.find()) {
               char axxxxxxxx = axxxxx.group(1).charAt(0);
               class_124 axxxxxxxxx = class_124.method_544(axxxxxxxx);
               if (axx == null) {
                  break;
               }

               if (axxxxxxxxx == null) {
                  continue;
               }

               label80: {
                  label90: {
                     String axxxxxxxxxx = a.substring(axxxxxxx, axxxxx.start());
                     boolean var16 = axxxxxxxxxx.isEmpty();
                     if (axx != null) {
                        if (!var16) {
                           axxx.add(new gvf(axxxxxxxxxx, axxxxxx.makeClone()));
                        }

                        var17 = axxxxxxxxx;
                        if (axx == null) {
                           break label90;
                        }

                        var16 = axxxxxxxxx.method_543();
                     }

                     if (var16) {
                        Integer axxxxxxxxxxx = axxxxxxxxx.method_532();
                        if (axx != null) {
                           if (axxxxxxxxxxx == null) {
                              continue;
                           }

                           axxxxxx = a.gyp(a, axxxxxxxxxxx);
                        }

                        if (axx != null) {
                           break label80;
                        }
                     }

                     var17 = axxxxxxxxx;
                  }

                  if (var17 == class_124.field_1070) {
                     axxxxxx = a.makeClone();
                  }
               }

               axxxxxxx = axxxxx.end();
               if (axx != null) {
                  continue;
               }
            }

            if (axxxxxxx < a.length()) {
               String axxxxxxxxxxxx = a.substring(axxxxxxx);
               if (axx != null && !axxxxxxxxxxxx.isEmpty()) {
                  axxx.add(new gvf(axxxxxxxxxxxx, axxxxxx.makeClone()));
               }
            }
            break;
         }

         return axxx;
      }
   }

   private Paint gyp(Paint a, int a) {
      long ax = bad.a ^ 99729440478594L;
      Paint axx = a.makeClone();
      axx.setShader(null);
      short var10002 = 25074;
      long var10003 = 4782366622734744662L ^ ax;
      axx.setColor(a | 0xFF000000);
      return axx;
   }

   private static int ear(Color a) {
      long ax = bad.a ^ 33549236036713L;
      int var10000 = 20257;
      long var10001 = 6020920461175235435L ^ ax;
      int axx = 153;
      int axxx = (int)(a.getRed() * 0.3F);
      int axxxx = (int)(a.getGreen() * 0.3F);
      int axxxxx = (int)(a.getBlue() * 0.3F);
      short var9 = 4080;
      long var10002 = 1313957748429644728L ^ ax;
      var10000 = axx << 24;
      short var10 = 29337;
      long var10003 = 803594739366731472L ^ ax;
      var10000 |= axxx << 16;
      short var11 = 30524;
      var10003 = 1268579292747701111L ^ ax;
      return var10000 | axxxx << 8 | axxxxx;
   }

   static {
      long var20 = a ^ 19589130167123L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[5];
      int var16 = 0;
      String var15 = "Å\u0005£m\u008c\u0094);\u0092\u0098u\n±\u008a\u0096¹(æ Bªé\u0017ñ\u009a`Çè¤\u0086ö#¯íZÕÎ³\"»]\u0015\u0017ûÃ\u009b;FªÜ\u0014\u0088v÷\u0082sº(\u0087#\u0015í7¥Y² ùÃÝ\n\u0080ô¬\u001a÷<\u009b\u009bÔ\u001d}FÔ2N©òÑ\u0014|\u0019\"6\u009f:øp";
      int var17 = "Å\u0005£m\u008c\u0094);\u0092\u0098u\n±\u008a\u0096¹(æ Bªé\u0017ñ\u009a`Çè¤\u0086ö#¯íZÕÎ³\"»]\u0015\u0017ûÃ\u009b;FªÜ\u0014\u0088v÷\u0082sº(\u0087#\u0015í7¥Y² ùÃÝ\n\u0080ô¬\u001a÷<\u009b\u009bÔ\u001d}FÔ2N©òÑ\u0014|\u0019\"6\u009f:øp"
         .length();
      char var14 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     c = new String[5];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "V\u0084\u0001z»cõ\u0006\u0019BKËXë5\u0006\u0090'¬(Ù0\u001e \u001eÔhtv\bÍ\u009d";
                     int var5 = "V\u0084\u0001z»cõ\u0006\u0019BKËXë5\u0006\u0090'¬(Ù0\u001e \u001eÔhtv\bÍ\u009d".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
                           byte[] var10 = var0.doFinal(
                              new byte[]{
                                 (byte)(var8 >>> 56),
                                 (byte)(var8 >>> 48),
                                 (byte)(var8 >>> 40),
                                 (byte)(var8 >>> 32),
                                 (byte)(var8 >>> 24),
                                 (byte)(var8 >>> 16),
                                 (byte)(var8 >>> 8),
                                 (byte)var8
                              }
                           );
                           long var45 = (var10[0] & 255L) << 56
                              | (var10[1] & 255L) << 48
                              | (var10[2] & 255L) << 40
                              | (var10[3] & 255L) << 32
                              | (var10[4] & 255L) << 24
                              | (var10[5] & 255L) << 16
                              | (var10[6] & 255L) << 8
                              | var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[6];
                                    short var46 = 21067;
                                    long var10005 = 7711825137536956735L ^ var20;
                                    cwr = ImageFilter.makeDropShadow(1.0F, 1.0F, 0.5F, 0.5F, -16777216, null, null);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "³=WÁ¸\u0092\u0015.BL«ë\u001fÀÞj";
                                 var5 = "³=WÁ¸\u0092\u0015.BL«ë\u001fÀÞj".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = (var7[0] & 255L) << 56
                              | (var7[1] & 255L) << 48
                              | (var7[2] & 255L) << 40
                              | (var7[3] & 255L) << 32
                              | (var7[4] & 255L) << 24
                              | (var7[5] & 255L) << 16
                              | (var7[6] & 255L) << 8
                              | var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var36;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "¸¯Ý;\u0006âÀßJ\u0098\bag¥Äne\u008f_Ù\\`rsÉh\u0018+õ\u0085Ê\u001f\b\u0089»\u0012Ýd\u00ad¬(¹]\t×\u0014FC¦íë¥ðøÍ}\u001e\u001bw\u008e\u008aæÎ?âý©Õ¿\u008ecÊ?Ó\t \u0099j¦ò\u009e";
                  var17 = "¸¯Ý;\u0006âÀßJ\u0098\bag¥Äne\u008f_Ù\\`rsÉh\u0018+õ\u0085Ê\u001f\b\u0089»\u0012Ýd\u00ad¬(¹]\t×\u0014FC¦íë¥ðøÍ}\u001e\u001bw\u008e\u008aæÎ?âý©Õ¿\u008ecÊ?Ó\t \u0099j¦ò\u009e"
                     .length();
                  var14 = '(';
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20092;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/bad", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/bad" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5985;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = e[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/bad", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/bad" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
