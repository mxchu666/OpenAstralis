package cc.astralis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_310;

public class dvp extends guu {
   private final cbm hc = new cbm();
   private static final long a = 123074770375794L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long p;

   public dvp() {
      super(bfm.EXPLOIT);
   }

   @gdz
   public void aap(fxx event) {
      long ax = dvp.a ^ 137073874600331L;
      int[] axx = dar.abu();
      class_310 var10000 = chi;
      if (axx != null) {
         if (chi.field_1724 == null) {
            return;
         }

         var10000 = chi;
      }

      if (var10000.field_1687 != null && a.hc.fsc(p) && chi.method_1548() != null && !chi.method_1542()) {
         a.hc.glr();
         Runnable axxx = () -> {
            long axxxx = dvp.a ^ 122696742775376L;
            int[] var10000x = dar.abu();
            HttpURLConnection ax = a.fxi();
            int[] axx = var10000x;

            try (BufferedReader axxx = new BufferedReader(new InputStreamReader(ax.getInputStream(), StandardCharsets.UTF_8))) {
               StringBuilder axxxx = new StringBuilder();

               String axxxxx;
               while ((axxxxx = axxx.readLine()) != null) {
                  axxxx.append(axxxxx.trim());
                  if (axx == null) {
                     return;
                  }
               }
            } catch (IOException var10) {
            }
         };
         CompletableFuture.runAsync(axxx).exceptionally(axxxx -> null);
      }
   }

   private HttpURLConnection fxi() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic cc/astralis/dvp.a J
      // 03: ldc2_w 33206681422324
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic cc/astralis/dar.abu ()[I
      // 0b: new com/google/gson/JsonObject
      // 0e: dup
      // 0f: invokespecial com/google/gson/JsonObject.<init> ()V
      // 12: astore 4
      // 14: aload 4
      // 16: sipush 30763
      // 19: ldc2_w 5919130014867045826
      // 1c: lload 1
      // 1d: lxor
      // 1e: pop2
      // 1f: pop
      // 20: ldc "accessToken"
      // 22: getstatic cc/astralis/dvp.chi Lnet/minecraft/class_310;
      // 25: invokevirtual net/minecraft/class_310.method_1548 ()Lnet/minecraft/class_320;
      // 28: invokevirtual net/minecraft/class_320.method_1674 ()Ljava/lang/String;
      // 2b: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 2e: astore 3
      // 2f: aload 4
      // 31: sipush 8839
      // 34: ldc2_w 6457087345202784106
      // 37: lload 1
      // 38: lxor
      // 39: pop2
      // 3a: pop
      // 3b: ldc "selectedProfile"
      // 3d: getstatic cc/astralis/dvp.chi Lnet/minecraft/class_310;
      // 40: invokevirtual net/minecraft/class_310.method_1548 ()Lnet/minecraft/class_320;
      // 43: invokevirtual net/minecraft/class_320.method_44717 ()Ljava/util/UUID;
      // 46: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 49: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 4c: aload 4
      // 4e: sipush 12939
      // 51: ldc2_w 3609351380094973801
      // 54: lload 1
      // 55: lxor
      // 56: pop2
      // 57: pop
      // 58: ldc "serverId"
      // 5a: sipush 17060
      // 5d: ldc2_w 3577226776522622791
      // 60: lload 1
      // 61: lxor
      // 62: pop2
      // 63: pop
      // 64: ldc "31531515"
      // 66: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 69: aload 0
      // 6a: invokevirtual cc/astralis/dvp.fws ()Ljava/net/HttpURLConnection;
      // 6d: astore 5
      // 6f: aload 5
      // 71: invokevirtual java/net/HttpURLConnection.getOutputStream ()Ljava/io/OutputStream;
      // 74: astore 6
      // 76: aload 4
      // 78: invokevirtual com/google/gson/JsonObject.toString ()Ljava/lang/String;
      // 7b: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 7e: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 81: astore 7
      // 83: aload 6
      // 85: aload 7
      // 87: bipush 0
      // 88: aload 7
      // 8a: arraylength
      // 8b: invokevirtual java/io/OutputStream.write ([BII)V
      // 8e: aload 6
      // 90: aload 3
      // 91: ifnull 99
      // 94: ifnull c5
      // 97: aload 6
      // 99: invokevirtual java/io/OutputStream.close ()V
      // 9c: goto c5
      // 9f: astore 7
      // a1: aload 6
      // a3: aload 3
      // a4: ifnull b3
      // a7: ifnull c2
      // aa: goto b1
      // ad: invokestatic cc/astralis/dvp.d (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b0: athrow
      // b1: aload 6
      // b3: invokevirtual java/io/OutputStream.close ()V
      // b6: goto c2
      // b9: astore 8
      // bb: aload 7
      // bd: aload 8
      // bf: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // c2: aload 7
      // c4: athrow
      // c5: goto d4
      // c8: astore 6
      // ca: new java/lang/RuntimeException
      // cd: dup
      // ce: aload 6
      // d0: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
      // d3: athrow
      // d4: aload 5
      // d6: areturn
   }

   private HttpURLConnection fws() {
      long a = dvp.a ^ 104335450963725L;

      URL ax;
      try {
         short var10002 = 2732;
         long var10003 = 284904512698710459L ^ a;
         ax = new URL("https://sessionserver.mojang.com/session/minecraft/join");
      } catch (MalformedURLException var8) {
         throw new RuntimeException(var8);
      }

      HttpURLConnection axx;
      try {
         axx = (HttpURLConnection)ax.openConnection();
      } catch (IOException var7) {
         throw new RuntimeException(var7);
      }

      try {
         short var10001 = 24095;
         long var11 = 1834585636391890185L ^ a;
         axx.setRequestMethod("POST");
      } catch (ProtocolException var6) {
         throw new RuntimeException(var6);
      }

      short var9 = 28421;
      long var12 = 8040259123095804950L ^ a;
      short var13 = 26054;
      long var16 = 2158622265367336660L ^ a;
      axx.setRequestProperty("Content-type", "application/json");
      var9 = 17149;
      var12 = 8284796970143298024L ^ a;
      short var15 = 10569;
      var16 = 3402265628208683608L ^ a;
      axx.setRequestProperty("Accept", "application/json");
      axx.setDoOutput(true);
      return axx;
   }

   static {
      long var5 = a ^ 45519843641283L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[10];
      int var12 = 0;
      String var11 = "{é\u009c%üG8¶Õ\u0093q¤\u0011\u001c¾+K4O´J¦ÚR\u0003\u0011\u009a¿1d\u00971(è=\u001f\u0090KÃ\u0018±ý\u0015ÅJ.ý\u001c6n{\u0018I\u0014\fÏû.\u0083¡àEvf×\u001e\u0019\u0094\fÂu®t(\u0018¡ì.²pÙ\u0016\nãÎö|í\u001fYØ\u008b\u0004Á`;ëD\u0095á\u0007ó\u0018\u0090 ¿ Pû\u0004ä\u009b\u007f0\u0018Þ÷i\u0083\u0084éø\u0086\u009c@eÃT\u0096z\u0084\u0018\u0010\u0095\u0083|O,¢X\u001e\u0006\u0090çî]5qì[{\u0001Ê\"6M-\u0002d'Ûª*×\u008e\u009c{\u0097{á\u0086.µÃ+\u0012æa\u009b/\u0004!í6!r\u0090\u0082\u0005¬\"z\u008dä\u0018gw\u0099ÖÍ°D\u000bXË¬¸voÖ-Ãú@»ÄÏFwL¶{Z§bõg\u0088\u0010Ò\u0089àm\u0085}û´F'QÀ\t\u0011\u009b^\u0010\u0004\u009e\u0088 £\u001c|b\u00ad¸Ð\u008dÏ\u008fé;\u0018+\u0084kÇS!áeB÷%\u0007gm\u001aB;}¿ýB°)B";
      int var13 = "{é\u009c%üG8¶Õ\u0093q¤\u0011\u001c¾+K4O´J¦ÚR\u0003\u0011\u009a¿1d\u00971(è=\u001f\u0090KÃ\u0018±ý\u0015ÅJ.ý\u001c6n{\u0018I\u0014\fÏû.\u0083¡àEvf×\u001e\u0019\u0094\fÂu®t(\u0018¡ì.²pÙ\u0016\nãÎö|í\u001fYØ\u008b\u0004Á`;ëD\u0095á\u0007ó\u0018\u0090 ¿ Pû\u0004ä\u009b\u007f0\u0018Þ÷i\u0083\u0084éø\u0086\u009c@eÃT\u0096z\u0084\u0018\u0010\u0095\u0083|O,¢X\u001e\u0006\u0090çî]5qì[{\u0001Ê\"6M-\u0002d'Ûª*×\u008e\u009c{\u0097{á\u0086.µÃ+\u0012æa\u009b/\u0004!í6!r\u0090\u0082\u0005¬\"z\u008dä\u0018gw\u0099ÖÍ°D\u000bXË¬¸voÖ-Ãú@»ÄÏFwL¶{Z§bõg\u0088\u0010Ò\u0089àm\u0085}û´F'QÀ\t\u0011\u009b^\u0010\u0004\u009e\u0088 £\u001c|b\u00ad¸Ð\u008dÏ\u008fé;\u0018+\u0084kÇS!áeB÷%\u0007gm\u001aB;}¿ýB°)B"
         .length();
      char var10 = ' ';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = d(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     g = var14;
                     h = new String[10];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 3515453131389609120L;
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
                     p = var30;
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

                  var11 = "\u0097ßiËHRíbêbun]åÇ(Vu!5zM`ÒÁn\u001b\u0094:Ù*{ hÀö%²Æïý5ìÌ):+§½ÑX°Ï¹ãï·½SëÕzô\f\u0016";
                  var13 = "\u0097ßiËHRíbêbun]åÇ(Vu!5zM`ÒÁn\u001b\u0094:Ù*{ hÀö%²Æïý5ìÌ):+§½ÑX°Ï¹ãï·½SëÕzô\f\u0016".length();
                  var10 = ' ';
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
            var10001 = 0;
         }
      }
   }

   private static String d(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6252;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/dvp", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("cc/astralis/dvp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
