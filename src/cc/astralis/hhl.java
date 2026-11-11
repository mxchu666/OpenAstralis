package cc.astralis;

import astralis.mixin.accessor.MinecraftClientSessionAccessor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.net.ssl.HttpsURLConnection;
import net.minecraft.class_320;

public class hhl implements dlc {
   private static final long a = 65119911051757L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public static String grf(String url, String post, boolean json) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic cc/astralis/hhl.a J
      // 003: ldc2_w 49384659462789
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic cc/astralis/dar.abu ()[I
      // 00b: astore 5
      // 00d: new java/net/URL
      // 010: dup
      // 011: aload 0
      // 012: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 015: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 018: checkcast javax/net/ssl/HttpsURLConnection
      // 01b: astore 6
      // 01d: aload 6
      // 01f: sipush 18770
      // 022: ldc2_w 2689243449946361266
      // 025: lload 3
      // 026: lxor
      // 027: pop2
      // 028: pop
      // 029: ldc "User-Agent"
      // 02b: sipush 17419
      // 02e: ldc2_w 5556895206945210612
      // 031: lload 3
      // 032: lxor
      // 033: pop2
      // 034: pop
      // 035: ldc "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36"
      // 037: invokevirtual javax/net/ssl/HttpsURLConnection.addRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 03a: aload 6
      // 03c: sipush 22133
      // 03f: ldc2_w 5911034597583639190
      // 042: lload 3
      // 043: lxor
      // 044: pop2
      // 045: pop
      // 046: ldc "POST"
      // 048: invokevirtual javax/net/ssl/HttpsURLConnection.setRequestMethod (Ljava/lang/String;)V
      // 04b: aload 6
      // 04d: bipush 1
      // 04e: invokevirtual javax/net/ssl/HttpsURLConnection.setDoOutput (Z)V
      // 051: aload 1
      // 052: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 055: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 058: astore 7
      // 05a: aload 7
      // 05c: arraylength
      // 05d: istore 8
      // 05f: aload 6
      // 061: iload 8
      // 063: invokevirtual javax/net/ssl/HttpsURLConnection.setFixedLengthStreamingMode (I)V
      // 066: aload 6
      // 068: sipush 22952
      // 06b: ldc2_w 3566167282032827725
      // 06e: lload 3
      // 06f: lxor
      // 070: pop2
      // 071: pop
      // 072: ldc "Content-Type"
      // 074: iload 2
      // 075: ifeq 08b
      // 078: sipush 17465
      // 07b: ldc2_w 8436155605966864605
      // 07e: lload 3
      // 07f: lxor
      // 080: pop2
      // 081: pop
      // 082: ldc "application/json"
      // 084: goto 097
      // 087: invokestatic cc/astralis/hhl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: sipush 7155
      // 08e: ldc2_w 5981962389176983310
      // 091: lload 3
      // 092: lxor
      // 093: pop2
      // 094: pop
      // 095: ldc "application/x-www-form-urlencoded; charset=UTF-8"
      // 097: invokevirtual javax/net/ssl/HttpsURLConnection.addRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 09a: aload 6
      // 09c: sipush 23997
      // 09f: ldc2_w 5689916282694916417
      // 0a2: lload 3
      // 0a3: lxor
      // 0a4: pop2
      // 0a5: pop
      // 0a6: ldc "Accept"
      // 0a8: sipush 12266
      // 0ab: ldc2_w 5451756947231943435
      // 0ae: lload 3
      // 0af: lxor
      // 0b0: pop2
      // 0b1: pop
      // 0b2: ldc "application/json"
      // 0b4: invokevirtual javax/net/ssl/HttpsURLConnection.addRequestProperty (Ljava/lang/String;Ljava/lang/String;)V
      // 0b7: aload 6
      // 0b9: invokevirtual javax/net/ssl/HttpsURLConnection.connect ()V
      // 0bc: aload 6
      // 0be: invokevirtual javax/net/ssl/HttpsURLConnection.getOutputStream ()Ljava/io/OutputStream;
      // 0c1: astore 9
      // 0c3: aload 9
      // 0c5: aload 7
      // 0c7: invokevirtual java/io/OutputStream.write ([B)V
      // 0ca: aload 9
      // 0cc: aload 5
      // 0ce: ifnull 0d6
      // 0d1: ifnull 103
      // 0d4: aload 9
      // 0d6: invokevirtual java/io/OutputStream.close ()V
      // 0d9: goto 103
      // 0dc: astore 10
      // 0de: aload 9
      // 0e0: aload 5
      // 0e2: ifnull 0f1
      // 0e5: ifnull 100
      // 0e8: goto 0ef
      // 0eb: invokestatic cc/astralis/hhl.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: aload 9
      // 0f1: invokevirtual java/io/OutputStream.close ()V
      // 0f4: goto 100
      // 0f7: astore 11
      // 0f9: aload 10
      // 0fb: aload 11
      // 0fd: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 100: aload 10
      // 102: athrow
      // 103: aload 6
      // 105: invokevirtual javax/net/ssl/HttpsURLConnection.getResponseCode ()I
      // 108: istore 9
      // 10a: iload 9
      // 10c: sipush 25844
      // 10f: ldc2_w 5348825387765691067
      // 112: lload 3
      // 113: lxor
      // 114: pop2
      // 115: pop
      // 116: ldc 100
      // 118: idiv
      // 119: bipush 2
      // 11a: aload 5
      // 11c: ifnull 139
      // 11f: if_icmpeq 143
      // 122: goto 129
      // 125: invokestatic cc/astralis/hhl.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 128: athrow
      // 129: iload 9
      // 12b: sipush 4123
      // 12e: ldc2_w 5160987058220697173
      // 131: lload 3
      // 132: lxor
      // 133: pop2
      // 134: pop
      // 135: ldc 100
      // 137: idiv
      // 138: bipush 3
      // 139: if_icmpne 14f
      // 13c: goto 143
      // 13f: invokestatic cc/astralis/hhl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 142: athrow
      // 143: aload 6
      // 145: invokevirtual javax/net/ssl/HttpsURLConnection.getInputStream ()Ljava/io/InputStream;
      // 148: goto 154
      // 14b: invokestatic cc/astralis/hhl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: aload 6
      // 151: invokevirtual javax/net/ssl/HttpsURLConnection.getErrorStream ()Ljava/io/InputStream;
      // 154: astore 10
      // 156: aload 5
      // 158: ifnull 189
      // 15b: aload 10
      // 15d: ifnonnull 18b
      // 160: goto 167
      // 163: invokestatic cc/astralis/hhl.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 166: athrow
      // 167: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 16a: iload 9
      // 16c: aload 0
      // 16d: sipush 17328
      // 170: ldc2_w 9110305016636622686
      // 173: lload 3
      // 174: lxor
      // 175: pop2
      // 176: pop
      // 177: ldc ": "
      // 179: swap
      // 17a: invokedynamic makeConcatWithConstants (ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 17f: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 182: goto 189
      // 185: invokestatic cc/astralis/hhl.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 188: athrow
      // 189: aconst_null
      // 18a: areturn
      // 18b: new java/io/BufferedReader
      // 18e: dup
      // 18f: new java/io/InputStreamReader
      // 192: dup
      // 193: aload 10
      // 195: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 198: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 19b: astore 11
      // 19d: new java/lang/StringBuilder
      // 1a0: dup
      // 1a1: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a4: astore 13
      // 1a6: aload 11
      // 1a8: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 1ab: dup
      // 1ac: astore 12
      // 1ae: ifnull 1d0
      // 1b1: aload 13
      // 1b3: aload 12
      // 1b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b8: pop
      // 1b9: aload 5
      // 1bb: ifnull 1d5
      // 1be: goto 1c5
      // 1c1: invokestatic cc/astralis/hhl.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c4: athrow
      // 1c5: goto 1a6
      // 1c8: invokestatic cc/astralis/hhl.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cb: athrow
      // 1cc: invokestatic cc/astralis/hhl.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cf: athrow
      // 1d0: aload 11
      // 1d2: invokevirtual java/io/BufferedReader.close ()V
      // 1d5: aload 13
      // 1d7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1da: areturn
      // 1db: astore 6
      // 1dd: aload 6
      // 1df: invokevirtual java/lang/Exception.printStackTrace ()V
      // 1e2: aconst_null
      // 1e3: areturn
   }

   public static String axf(String url, String jsonBody) {
      return grf(a, a, true);
   }

   public static String alb(String url, String bearerToken) {
      return bvs(a, a);
   }

   public static String bvs(String url, String bearer) {
      long ax = hhl.a ^ 32909970608498L;
      int[] axx = dar.abu();

      try {
         HttpsURLConnection axxx = (HttpsURLConnection)new URL(a).openConnection();
         short var10001 = 4612;
         long var10002 = 3190762943882636575L ^ ax;
         short var18 = 19047;
         long var10003 = 875302926328460654L ^ ax;
         axxx.addRequestProperty(
            "User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36"
         );
         var10001 = 27791;
         var10002 = 1334975452970701727L ^ ax;
         short var20 = 12266;
         var10003 = 5451810806390395132L ^ ax;
         axxx.addRequestProperty("Accept", "application/json");
         var10001 = 29674;
         var10002 = 467967808252562677L ^ ax;
         short var24 = 3253;
         long var10004 = 4595152015580705721L ^ ax;
         axxx.addRequestProperty("Authorization", "Bearer " + a);
         int var10000 = axxx.getResponseCode();
         var10001 = 3473;
         var10002 = 324095536592429099L ^ ax;
         if (var10000 == 200) {
            BufferedReader axxxx = new BufferedReader(new InputStreamReader(axxx.getInputStream()));
            StringBuilder axxxxx = new StringBuilder();

            do {
               String axxxxxx;
               if ((axxxxxx = axxxx.readLine()) == null) {
                  var14 = axxxxx;
                  break;
               }

               var14 = axxxxx.append(axxxxxx);
            } while (axx != null);

            return var14.toString();
         } else {
            BufferedReader axxxx = new BufferedReader(new InputStreamReader(axxx.getErrorStream()));
            StringBuilder axxxxx = new StringBuilder();

            do {
               String axxxxxx;
               if ((axxxxxx = axxxx.readLine()) == null) {
                  var13 = axxxxx;
                  break;
               }

               var13 = axxxxx.append(axxxxxx);
            } while (axx != null);

            return var13.toString();
         }
      } catch (Exception var9) {
         return null;
      }
   }

   public static afc cwa(String refreshToken, String clientID) {
      afc ax = gxg.ar(a, a);
      UUID axx = ehy.duo(ax.acp);
      class_320 axxx = new class_320(ax.av, axx, ax.aqg, Optional.empty(), Optional.empty());
      MinecraftClientSessionAccessor axxxx = (MinecraftClientSessionAccessor)chi;
      axxxx.setSession(axxx);
      return ax;
   }

   public static void fua(String url) {
      long ax = hhl.a ^ 132799888829221L;
      int[] axx = dar.abu();

      try {
         String var10000 = a;
         if (axx != null) {
            short var10001 = 6194;
            long var10002 = 713700588347235688L ^ ax;
            if (a.startsWith("hhttps")) {
               a = a.substring(1);
               var10001 = 13303;
               var10002 = 5626971882013275838L ^ ax;
               a = a + "BBqLuWGf3ZE";
            }

            short var7 = 8786;
            long var13 = 8180520768655140624L ^ ax;
            var10000 = System.getProperty("os.name").toLowerCase();
         }

         String axxx = var10000;
         short var14 = 17080;
         long var19 = 247300219816036341L ^ ax;
         boolean var8 = axxx.contains("win");
         if (axx != null) {
            if (var8) {
               Runtime var11 = Runtime.getRuntime();
               short var25 = 22433;
               long var27 = 8458933385495630570L ^ ax;
               var11.exec("rundll32 url.dll,FileProtocolHandler " + a);
               return;
            }

            var14 = 13326;
            var19 = 1626682574716580183L ^ ax;
            var8 = axxx.contains("mac");
         }

         if (axx != null) {
            if (var8) {
               Runtime var10 = Runtime.getRuntime();
               short var24 = 24747;
               long var26 = 2830789169074136548L ^ ax;
               var10.exec("open " + a);
               return;
            }

            var14 = 19140;
            var19 = 3663635988657721244L ^ ax;
            var8 = axxx.contains("nix");
         }

         label51: {
            if (axx != null) {
               if (var8) {
                  break label51;
               }

               var14 = 19729;
               var19 = 6550689890211678299L ^ ax;
               var8 = axxx.contains("nux");
            }

            if (!var8) {
               return;
            }
         }

         Runtime var9 = Runtime.getRuntime();
         short var23 = 12312;
         long var10003 = 5904699770280195422L ^ ax;
         var9.exec("xdg-open " + a);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   static {
      long var11 = a ^ 47331504493861L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[24];
      int var18 = 0;
      String var17 = ".\u0015µã°,\u0012f*\u0015,B½\u008e\u0082H8\u0086ãMñ;\u009b? ñ\u0013È\u0089Í´ìA\u009c66¶ü[ÿîÐ\u009eÜ\u0080\b-\u0001O\u0088Èê\u001f¤q\"`ýíã`¸\u0083\u0005-ãÖ)P³ ùÁ\u0018BÜ\u0006C\u001f\u009b\u0019µ\u0019z\u009c\u0000\u0082¸ÖaÒïô\u0095øÖé}\u0018L\u0086\u0085Ë\u0007¡\u0091hf\u000b£ÜÕÍ\nï)Èllå\u0089\u0081¼\u0018\u009eR\u0011\u0087QÕsáOÜ¢9üÁ\u009e\u0001\u0010\u0007f¸Í\u001c*2\u0010\u008eæ\u0089\u0091²\u009ffÉú b\u009cµ.î\u009e\u0018ËÝ\u0007DÃ\r\u009fv\u0001\u0016\u0080QÑÚépÐ\\j\u0080{³\u00902\u0010\u009dÃ¤{3\u0085Ú\u001f\b\u0007Æ?ã¼Qh\u0010\u0084y¾*(Ý\u000eÍP\u000b®-\u0013`\u00977\u0010õ\u008agÄ\t(Ð¿xÞ[\u001dÝ\u009dsÙ O\u001f \u008c\u0097Êw&\u009b\u009d¿æþ·]|\u001d\u0093÷\u008eðñ\u0098\u0002G~\u0096\u001d{ß\u009dT(®MP):gÝÅw\u001f\u008f\u000eù]¦\u0099\u0086Êõð\u0005ÒÆp±kb÷cË©sê_í¸¬\u008fyñ\u0018Ô*\u0014»üüx\u0093\u007f¤\u009dK\u0007§Ñø\tÒÙ®øÇô\b\u0010Ì`\u0083!µ\u0099<$ÌÝ\u008eºrDêq(K.ºÅ\u0010\u009a`î\u008cy\u00adD\u0098/2wÝûj\u0015èÏý©~Û\u0089êÙJÐwÔ\u000e±HH-y× $a{\u0094=CVè;ß\tp\b\u008d\u0099Ö\u001417qÑå\u0093Á\u0083uèÂ\u0088¿ax\u0010\u0013\u0093ùMÛóÅ£\u0091\u0084<úu´!â\u0010ú\u0017\u0015\u0002u¸á¡\rû\u00995V\u0099ë\u0011\u00106\u008e\u0084\u001dÇ\u001cìt\u0080ÿ¹0ö§R5\u0010\bKµ¹\u008fr\u0087îÌpýÙ\u001a\u0088ñ(°\u0085fW;36ö:Ä\u009c\"\u0005\u0097¬]:\u0013ÿì>áÀu\u0088é¯tFØ\u008eehdÛ¿×ek¬\u0019y½þÃ\u0093ÂA¦/~ÚQÿ¯È\u0018Üåõâô\u0014\u008d9ånHóRïbÄ\u0086\f9\u0013!\u001cP,\u0083süi`~É>Í\u001b'Y²\u0080gU\rli·æTp\u0005Î\u0007º»\u0019}þ\u0084§óû°$\r-ªV\u0084è\néR\u000bÉMýÓ÷\u0090@hÊ\u0017É¾utÝÉ\u0016l\u000f4¤ÂÈ~(/¼·\u0094\u009d\u008c¢\u0086\u0093ì9²f\f/\u001b\u008a\u0003\u0002Í(ªÅ\u0001¸pºjz\u0081ñµ\u0095,\u0017Â\u008eè\u0087ïÖ9íI£åií\u0011ß¹'A¢»R*MÓy\u008b%ñNkO\u0095O\u009fñx\u0001½ã\u0014Ü2\u008eSÐ&åMøï\u001d³\u0084Ô§¸§\u0000À9\u0092\u0094\u0092êMd\u008d¿g\u0090\u0016¹³òÚá\u0080/Pn°a\u009fÂñ`ÓYYS`:e\u0093\fÅèàm\u000byÿÆÅ\u0093\u0005²(\u0097r\u001a\u0088Û£ïÔÕõ#Ä\u008e÷\u008aõ¸9m\u00803+ô\u008d¨ÔS-=\u008e:\u0017\u009d-=?ÊÉ\u0014 \u0080ë$¨\u0096\u007fî\u008a\u0089 îmäêü\u009a\u0004©\u0086Lz\u0007ëÄù\u0015";
      int var19 = ".\u0015µã°,\u0012f*\u0015,B½\u008e\u0082H8\u0086ãMñ;\u009b? ñ\u0013È\u0089Í´ìA\u009c66¶ü[ÿîÐ\u009eÜ\u0080\b-\u0001O\u0088Èê\u001f¤q\"`ýíã`¸\u0083\u0005-ãÖ)P³ ùÁ\u0018BÜ\u0006C\u001f\u009b\u0019µ\u0019z\u009c\u0000\u0082¸ÖaÒïô\u0095øÖé}\u0018L\u0086\u0085Ë\u0007¡\u0091hf\u000b£ÜÕÍ\nï)Èllå\u0089\u0081¼\u0018\u009eR\u0011\u0087QÕsáOÜ¢9üÁ\u009e\u0001\u0010\u0007f¸Í\u001c*2\u0010\u008eæ\u0089\u0091²\u009ffÉú b\u009cµ.î\u009e\u0018ËÝ\u0007DÃ\r\u009fv\u0001\u0016\u0080QÑÚépÐ\\j\u0080{³\u00902\u0010\u009dÃ¤{3\u0085Ú\u001f\b\u0007Æ?ã¼Qh\u0010\u0084y¾*(Ý\u000eÍP\u000b®-\u0013`\u00977\u0010õ\u008agÄ\t(Ð¿xÞ[\u001dÝ\u009dsÙ O\u001f \u008c\u0097Êw&\u009b\u009d¿æþ·]|\u001d\u0093÷\u008eðñ\u0098\u0002G~\u0096\u001d{ß\u009dT(®MP):gÝÅw\u001f\u008f\u000eù]¦\u0099\u0086Êõð\u0005ÒÆp±kb÷cË©sê_í¸¬\u008fyñ\u0018Ô*\u0014»üüx\u0093\u007f¤\u009dK\u0007§Ñø\tÒÙ®øÇô\b\u0010Ì`\u0083!µ\u0099<$ÌÝ\u008eºrDêq(K.ºÅ\u0010\u009a`î\u008cy\u00adD\u0098/2wÝûj\u0015èÏý©~Û\u0089êÙJÐwÔ\u000e±HH-y× $a{\u0094=CVè;ß\tp\b\u008d\u0099Ö\u001417qÑå\u0093Á\u0083uèÂ\u0088¿ax\u0010\u0013\u0093ùMÛóÅ£\u0091\u0084<úu´!â\u0010ú\u0017\u0015\u0002u¸á¡\rû\u00995V\u0099ë\u0011\u00106\u008e\u0084\u001dÇ\u001cìt\u0080ÿ¹0ö§R5\u0010\bKµ¹\u008fr\u0087îÌpýÙ\u001a\u0088ñ(°\u0085fW;36ö:Ä\u009c\"\u0005\u0097¬]:\u0013ÿì>áÀu\u0088é¯tFØ\u008eehdÛ¿×ek¬\u0019y½þÃ\u0093ÂA¦/~ÚQÿ¯È\u0018Üåõâô\u0014\u008d9ånHóRïbÄ\u0086\f9\u0013!\u001cP,\u0083süi`~É>Í\u001b'Y²\u0080gU\rli·æTp\u0005Î\u0007º»\u0019}þ\u0084§óû°$\r-ªV\u0084è\néR\u000bÉMýÓ÷\u0090@hÊ\u0017É¾utÝÉ\u0016l\u000f4¤ÂÈ~(/¼·\u0094\u009d\u008c¢\u0086\u0093ì9²f\f/\u001b\u008a\u0003\u0002Í(ªÅ\u0001¸pºjz\u0081ñµ\u0095,\u0017Â\u008eè\u0087ïÖ9íI£åií\u0011ß¹'A¢»R*MÓy\u008b%ñNkO\u0095O\u009fñx\u0001½ã\u0014Ü2\u008eSÐ&åMøï\u001d³\u0084Ô§¸§\u0000À9\u0092\u0094\u0092êMd\u008d¿g\u0090\u0016¹³òÚá\u0080/Pn°a\u009fÂñ`ÓYYS`:e\u0093\fÅèàm\u000byÿÆÅ\u0093\u0005²(\u0097r\u001a\u0088Û£ïÔÕõ#Ä\u008e÷\u008aõ¸9m\u00803+ô\u008d¨ÔS-=\u008e:\u0017\u009d-=?ÊÉ\u0014 \u0080ë$¨\u0096\u007fî\u008a\u0089 îmäêü\u009a\u0004©\u0086Lz\u0007ëÄù\u0015"
         .length();
      char var16 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     b = var20;
                     c = new String[24];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "d&E,ã\u0087÷«%cRö¨G+Zv<c£\u0096\u0082\u0094h";
                     int var5 = "d&E,ã\u0087÷«%cRö¨G+Zv<c£\u0096\u0082\u0094h".length();
                     byte var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
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
                        long var10004 = (var10[0] & 255L) << 56
                           | (var10[1] & 255L) << 48
                           | (var10[2] & 255L) << 40
                           | (var10[3] & 255L) << 32
                           | (var10[4] & 255L) << 24
                           | (var10[5] & 255L) << 16
                           | (var10[6] & 255L) << 8
                           | var10[7] & 255L;
                        byte var38 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     e = var6;
                     f = new Integer[3];
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var33;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "2<8½9uÕh¥~§³<Öv\u008fPS]ºÆ¸\u0012Äµ\u0084ãJ\u0087Ë´4\u0086Ñõ\u0095'\u0091jk?\u0007©úG«X`\u0083¼ý\u008f\u008dOæs\u0096·ÁO?\u0005(²d9¾\"0M¿Á5D`ëXpn.¸;¯§ùé\u0087\u009fÙ\u0087lß®p+,Q";
                  var19 = "2<8½9uÕh¥~§³<Öv\u008fPS]ºÆ¸\u0012Äµ\u0084ãJ\u0087Ë´4\u0086Ñõ\u0095'\u0091jk?\u0007©úG«X`\u0083¼ý\u008f\u008dOæs\u0096·ÁO?\u0005(²d9¾\"0M¿Á5D`ëXpn.¸;¯§ùé\u0087\u009fÙ\u0087lß®p+,Q"
                     .length();
                  var16 = 16;
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12162;
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
            throw new RuntimeException("cc/astralis/hhl", var10);
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
         throw new RuntimeException("cc/astralis/hhl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15655;
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
            throw new RuntimeException("cc/astralis/hhl", var14);
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
         throw new RuntimeException("cc/astralis/hhl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
