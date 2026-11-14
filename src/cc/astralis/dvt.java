package cc.astralis;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2960;
import net.minecraft.class_3298;

public class dvt implements dlc {
   private static final Map<String, class_2960> gxc;
   private static final long a = 104523496290566L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public static void exy(JsonObject json, String path) {
      try {
         Gson ax = new GsonBuilder().setPrettyPrinting().create();
         FileWriter axx = new FileWriter(a);
         ax.toJson(a, axx);
         axx.close();
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public static java.awt.Font fio(class_2960 fontIdentifier) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic cc/astralis/dvt.a J
      // 03: ldc2_w 129199266711853
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic cc/astralis/dar.abu ()[I
      // 0b: astore 3
      // 0c: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 0f: invokevirtual net/minecraft/class_310.method_1478 ()Lnet/minecraft/class_3300;
      // 12: astore 4
      // 14: aload 4
      // 16: aload 0
      // 17: invokeinterface net/minecraft/class_3300.method_14486 (Lnet/minecraft/class_2960;)Ljava/util/Optional; 2
      // 1c: astore 5
      // 1e: aload 5
      // 20: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 23: checkcast net/minecraft/class_3298
      // 26: invokevirtual net/minecraft/class_3298.method_14482 ()Ljava/io/InputStream;
      // 29: astore 6
      // 2b: bipush 0
      // 2c: aload 6
      // 2e: invokestatic java/awt/Font.createFont (ILjava/io/InputStream;)Ljava/awt/Font;
      // 31: astore 7
      // 33: aload 6
      // 35: aload 3
      // 36: ifnull 45
      // 39: ifnull 4f
      // 3c: goto 43
      // 3f: invokestatic cc/astralis/dvt.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 6
      // 45: invokevirtual java/io/InputStream.close ()V
      // 48: goto 4f
      // 4b: invokestatic cc/astralis/dvt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: aload 7
      // 51: areturn
      // 52: astore 7
      // 54: aload 6
      // 56: aload 3
      // 57: ifnull 66
      // 5a: ifnull 75
      // 5d: goto 64
      // 60: invokestatic cc/astralis/dvt.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: aload 6
      // 66: invokevirtual java/io/InputStream.close ()V
      // 69: goto 75
      // 6c: astore 8
      // 6e: aload 7
      // 70: aload 8
      // 72: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 75: aload 7
      // 77: athrow
      // 78: astore 4
      // 7a: getstatic cc/astralis/dar.ecj Lorg/slf4j/Logger;
      // 7d: aload 4
      // 7f: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 82: sipush 9443
      // 85: ldc2_w 5489180087390495794
      // 88: lload 1
      // 89: lxor
      // 8a: pop2
      // 8b: pop
      // 8c: ldc "Failed To Load Font: "
      // 8e: swap
      // 8f: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 94: invokeinterface org/slf4j/Logger.error (Ljava/lang/String;)V 2
      // 99: aconst_null
      // 9a: areturn
   }

   private static Path fmf(class_2960 a) {
      long ax = dvt.a ^ 42186399084238L;

      try {
         InputStream axx = ((class_3298)chi.method_1478().method_14486(a).get()).method_14482();
         short var10000 = 23020;
         long var10001 = 608887265851555545L ^ ax;
         Path axxx = Paths.get(System.getProperty("java.io.tmpdir"), a.method_12832());
         Files.createDirectories(axxx.getParent());
         Files.copy(axx, axxx, StandardCopyOption.REPLACE_EXISTING);
         return axxx;
      } catch (IOException var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public static class_2960 dld(java.awt.Font[] fonts, char from, char to, float size) {
      String ax = Arrays.stream(a).map(axx -> axx.getName() + axx.getStyle() + axx.getSize()).collect(Collectors.joining()) + a + a + a;
      return gxc.computeIfAbsent(ax, axx -> fkp(a, a, a, a));
   }

   public static class_2960 fkp(java.awt.Font[] fonts, char from, char to, float size) {
      long ax = dvt.a ^ 5640651317154L;
      String axx = Arrays.stream(a).map(axxx -> axxx.getName() + axxx.getStyle() + axxx.getSize()).collect(Collectors.joining());
      String var10000 = ek.bf(axx);
      int axxx = (int)a;
      String var11 = var10000;
      short var12 = 15154;
      long var10001 = 3894375339852672365L ^ ax;
      String axxxx = "glyphs/" + var11 + "/" + a + "-" + a + "-" + axxx;
      short var13 = 5895;
      var10001 = 6658812285306503515L ^ ax;
      return class_2960.method_60655("renderer", axxxx);
   }

   public static List<fv> bru() {
      long var0 = a ^ 73273937238151L;
      short var10000 = 1394;
      long var10001 = 2860602135422211084L ^ var0;
      String var2 = System.getProperty("os.name").toLowerCase();
      short var3 = 28461;
      long var10002 = 8066582536253996624L ^ var0;
      return var2.contains("win") ? gtk() : bvb();
   }

   private static List<fv> bvb() {
      long a = dvt.a ^ 66863973077759L;
      int[] var10000 = dar.abu();
      ArrayList ax = new ArrayList();
      int[] axx = var10000;

      try {
         Runtime var14 = Runtime.getRuntime();
         String[] var10001 = new String[1];
         short var10004 = 23101;
         long var10005 = 3288335917278970161L ^ a;
         var10001[0] = "fc-list";
         Process axxx = var14.exec(var10001);

         String axxxx;
         try (BufferedReader axxxxx = new BufferedReader(new InputStreamReader(axxx.getInputStream()))) {
            while ((axxxx = axxxxx.readLine()) != null) {
               int axxxxxx = axxxx.indexOf((int)e);
               if (axx == null) {
                  return ax;
               }

               if (axxxxxx != -1) {
                  String axxxxxxx = axxxx.substring(0, axxxxxx).trim();
                  String axxxxxxxx = axxxx.substring(axxxxxx + 1).trim();
                  String axxxxxxxxx = axxxxxxxx.split(":")[0].trim();
                  ax.add(new fv(axxxxxxxxx, axxxxxxx));
                  if (axx == null) {
                     break;
                  }
               }
            }
         }

         axxx.waitFor();
      } catch (Exception var13) {
         var13.printStackTrace();
      }

      return ax;
   }

   private static List<fv> gtk() {
      long a = dvt.a ^ 26671864036589L;
      List<fv> ax = new ArrayList<>();
      short var10002 = 32438;
      long var10003 = 1130987494155733930L ^ a;
      String var4 = System.getenv("WINDIR");
      short var5 = 24619;
      long var10004 = 4221120678731076921L ^ a;
      File axx = new File(var4 + "\\Fonts");
      ekv(axx, ax);
      return ax;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static void ekv(File a, List<fv> a) {
      long ax = dvt.a ^ 24249824466416L;
      int[] var10000 = dar.abu();
      File[] axx = a.listFiles();
      int[] axxx = var10000;
      File[] var14 = axx;
      if (axxx != null) {
         if (axx == null) {
            return;
         }

         var14 = axx;
      }

      File[] var6 = var14;
      int var7 = var6.length;
      int var8 = 0;

      while (var8 < var7) {
         label66: {
            File axxxx = var6[var8];
            File var15 = axxxx;
            if (axxx != null) {
               if (axxxx.isDirectory()) {
                  ekv(axxxx, a);
                  break label66;
               }

               var15 = axxxx;
            }

            String axxxxx = var15.getName().toLowerCase();
            short var10001 = 10887;
            long var10002 = 7159344865714402951L ^ ax;
            byte var16 = axxxxx.endsWith(".ttf");
            if (axxx != null) {
               if (var16 == 0) {
                  var10001 = 24373;
                  var10002 = 529753187983557437L ^ ax;
                  if (!axxxxx.endsWith(".otf")) {
                     break label66;
                  }
               }

               try {
                  var16 = 0;
               } catch (Exception var13) {
                  break label66;
               }
            }

            try {
               java.awt.Font axxxxxx = java.awt.Font.createFont(var16, axxxx);
               a.add(new fv(axxxxxx.getFontName(), axxxx.getAbsolutePath()));
            } catch (Exception var12) {
            }
         }

         var8++;
         if (axxx == null) {
            break;
         }
      }
   }

   static {
      long var5 = a ^ 62762583974102L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[11];
      int var12 = 0;
      String var11 = "\u009f\tY\u009d\u008f2»«ÚCéQ\u0094öx\u0010\u0010\u0003ÔÕEÉ®J\u009dxí¤\u0090n©ö\u009d\u0018Å\u0098yV\u0098\u0088÷¿\u0093\u0005\u009a¸cª8Å0Äh\u008c\u000e®ÿ»\u0010îO¦\u009d\u0085<âáQó\u0089É>)\ní\u0010\u000eLá4AuªrCÈ©bE\u007fr0(¥¢\u0096l\u008f\u0017\u009f\n{Ú\u001e:M#[\u0014\u0006Ñ*\u0093xÈe\u0014}Z\u0002Å\u001b0&\u0084Á^ÿÆ\u008d\u008c\u008e\\\u0010ü@R\u0011\u0011\u00934\u00ad4¥\u0017(\u008b\u0006ýª )0\u007fè\u000b\u0017¿\u009aRs®\u0088\u0094ð©\u000b©K¾á@Ù\u0080\u0001\bJr{=æòI\u0010k8\u0098mîõ~»]\rg¾\u009c\u0093~?";
      int var13 = "\u009f\tY\u009d\u008f2»«ÚCéQ\u0094öx\u0010\u0010\u0003ÔÕEÉ®J\u009dxí¤\u0090n©ö\u009d\u0018Å\u0098yV\u0098\u0088÷¿\u0093\u0005\u009a¸cª8Å0Äh\u008c\u000e®ÿ»\u0010îO¦\u009d\u0085<âáQó\u0089É>)\ní\u0010\u000eLá4AuªrCÈ©bE\u007fr0(¥¢\u0096l\u008f\u0017\u009f\n{Ú\u001e:M#[\u0014\u0006Ñ*\u0093xÈe\u0014}Z\u0002Å\u001b0&\u0084Á^ÿÆ\u008d\u008c\u008e\\\u0010ü@R\u0011\u0011\u00934\u00ad4¥\u0017(\u008b\u0006ýª )0\u007fè\u000b\u0017¿\u009aRs®\u0088\u0094ð©\u000b©K¾á@Ù\u0080\u0001\bJr{=æòI\u0010k8\u0098mîõ~»]\rg¾\u009c\u0093~?"
         .length();
      char var10 = 16;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = a(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     b = var14;
                     c = new String[11];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 1652607843198837424L;
                     byte[] var4 = var0.doFinal(
                        new byte[]{
                           (byte)(var2 >>> 56),
                           (byte)(var2 >>> 48),
                           (byte)(var2 >>> 40),
                           (byte)(var2 >>> 32),
                           (byte)(var2 >>> 24),
                           (byte)(var2 >>> 16),
                           (byte)(var2 >>> 8),
                           (byte)var2
                        }
                     );
                     long var30 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     var10001 = -1;
                     e = var30;
                     gxc = new ConcurrentHashMap<>();
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = "\u0082¹\u0004´\u009fÒjÎ\u008a»ªù 1¨;\u0010R\u008fõ\u0000\u001dxÞ\u0004_Þ&\u009b$`\u008a\u0010";
                  var13 = "\u0082¹\u0004´\u009fÒjÎ\u008a»ªù 1¨;\u0010R\u008fõ\u0000\u001dxÞ\u0004_Þ&\u009b$`\u008a\u0010".length();
                  var10 = 16;
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28927;
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
            throw new RuntimeException("cc/astralis/dvt", var10);
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
         throw new RuntimeException("cc/astralis/dvt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
