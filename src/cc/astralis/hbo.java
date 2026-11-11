package cc.astralis;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hbo implements ago {
   private String gtr;
   private String emq;
   private long fzx;
   private JsonObject exe;
   private int djp;
   private bvc fun;
   private static int[] ghe;
   private static final String[] a;
   private static final long b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;
   private static final long[] f;
   private static final Long[] g;
   private static final Map h;

   public hbo(String name, String description, int userUid, String userName, JsonObject configData) {
      a.gtr = a;
      a.emq = a;
      a.exe = a;
      a.fzx = System.currentTimeMillis();
      a.fun = new dtk(a, a);
      a.djp = (a + a + a + a.fzx).hashCode();
   }

   public hbo(String name, String description, int userUid, String userName, long uploadDate, JsonObject configData, int configId) {
      a.gtr = a;
      a.emq = a;
      a.fzx = a;
      a.exe = a;
      a.djp = a;
      a.fun = new dtk(a, a);
   }

   @Override
   public JsonObject dpp() {
      long a = b ^ 133664549034906L;
      long ax = b<"q">(17879, 4231808444612171347L ^ a);
      int[] var10000 = dar.abu();
      int[] var10001 = gfb();
      JsonObject axx = new JsonObject();
      int[] axxx = var10001;
      String[] var8 = hbo.a;
      short var10003 = 2131;
      long var10004 = 947603908344708799L ^ a;
      axx.addProperty(var8[12], a.gtr);
      axx.addProperty(var8[3], a.emq);
      var10003 = 27368;
      var10004 = 204769060249377798L ^ a;
      axx.addProperty(var8[9], a.fun.cfs());
      int[] axxxx = var10000;
      short var10002 = 4740;
      long var13 = 1473157769758925935L ^ a;
      axx.addProperty(var8[7], a.fun.eus());
      var10002 = 5189;
      long var14 = 5336278411202814636L ^ a;
      axx.addProperty(var8[10], a.fzx);
      axx.addProperty(var8[4], a.djp);
      JsonObject var9 = axx;
      String[] var10 = var8;
      if (axxxx != null) {
         axx.add(var8[5], a.exe);
         var9 = axx;
         if (axxx == null) {
            return axx;
         }

         var10 = new String[2];
      }

      cdr.apm(var10);
      return var9;
   }

   public static hbo bdi(JsonObject obj) {
      long ax;
      Object axx;
      label67: {
         ax = b ^ 71618489369922L;
         int[] var10000 = dar.abu();
         long axxx = b<"q">(21312, 5570404258585599517L ^ ax);
         int[] axxxx = var10000;
         var10000 = gfb();
         axx = new JsonObject();
         int[] axxxxx = var10000;
         JsonObject var14 = a;
         String[] var10 = hbo.a;
         String var10001 = var10[0];
         if (axxxx != null) {
            if (!a.has(var10001)) {
               break label67;
            }

            var14 = a;
            var10001 = var10[0];
         }

         JsonElement axxxxxx = var14.get(var10001);
         boolean var15 = axxxxxx.isJsonObject();
         if (axxxx != null) {
            label56: {
               if (var15) {
                  var16 = axxxxxx.getAsJsonObject();
                  if (axxxx == null) {
                     break label56;
                  }

                  axx = var16;
                  if (axxxxx == null) {
                     break label67;
                  }
               }

               var16 = axxxxxx;
            }

            var15 = var16.isJsonPrimitive();
         }

         if (var15 && axxxxxx.getAsJsonPrimitive().isString()) {
            try {
               axx = JsonParser.parseString(axxxxxx.getAsString()).getAsJsonObject();
            } catch (Exception var11) {
               axx = new JsonObject();
            }
         }
      }

      hbo var17 = new hbo;
      int var10004 = 28691;
      long var10005 = 1002758090568407080L ^ ax;
      String var10002 = a.get(hbo.a[6]).getAsString();
      String var10003 = a.has(hbo.a[2]) ? a.get(hbo.a[2]).getAsString() : "";
      String[] var12 = hbo.a;
      short var10006 = 17215;
      long var10007 = 8227478947638455058L ^ ax;
      var10004 = a.get(var12[11]).getAsInt();
      String var19 = a.get(var12[1]).getAsString();
      long var20 = a.get(var12[a<"k">(2757, 1387088706498290413L ^ ax)]).getAsLong();
      short var10010 = 10511;
      long var10011 = 8540865520194502968L ^ ax;
      int var10008;
      if (a.has(var12[8])) {
         var10010 = 23765;
         var10011 = 2316025335216747749L ^ ax;
         var10008 = a.get(var12[8]).getAsInt();
      } else {
         var10008 = -1;
      }

      var17./* $VF: Unable to resugar constructor */<init>(var10002, var10003, var10004, var19, var20, (JsonObject)axx, var10008);
      if (cdr.haa() == null) {
         aui(new int[4]);
      }

      return var17;
   }

   @Override
   public String amx() {
      return a.gtr;
   }

   @Override
   public String chb() {
      return a.emq;
   }

   @Override
   public long bsl() {
      return a.fzx;
   }

   @Override
   public JsonObject dvu() {
      return a.exe;
   }

   @Override
   public int cna() {
      return a.djp;
   }

   @Override
   public bvc ayq() {
      return a.fun;
   }

   @Override
   public void bn(String name) {
      a.gtr = a;
   }

   @Override
   public void dnv(String description) {
      a.emq = a;
   }

   @Override
   public void ewm(long uploadDate) {
      a.fzx = a;
   }

   @Override
   public void bq(JsonObject configData) {
      a.exe = a;
   }

   public void god(int configId) {
      a.djp = a;
   }

   public void grt(bvc user) {
      a.fun = a;
   }

   public static void aui(int[] var0) {
      ghe = var0;
   }

   public static int[] gfb() {
      return ghe;
   }

   static {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc2_w 124159745746027
      // 003: putstatic cc/astralis/hbo.b J
      // 006: getstatic cc/astralis/hbo.b J
      // 009: ldc2_w 13848085896356
      // 00c: lxor
      // 00d: lstore 31
      // 00f: ldc_w "DES/CBC/PKCS5Padding"
      // 012: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 015: dup
      // 016: astore 23
      // 018: bipush 2
      // 019: ldc_w "DES"
      // 01c: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 01f: bipush 8
      // 021: newarray 8
      // 023: dup
      // 024: bipush 0
      // 025: lload 31
      // 027: bipush 56
      // 029: lushr
      // 02a: l2i
      // 02b: i2b
      // 02c: bastore
      // 02d: bipush 1
      // 02e: istore 24
      // 030: iload 24
      // 032: bipush 8
      // 034: if_icmpge 04e
      // 037: dup
      // 038: iload 24
      // 03a: lload 31
      // 03c: iload 24
      // 03e: bipush 8
      // 040: imul
      // 041: lshl
      // 042: bipush 56
      // 044: lushr
      // 045: l2i
      // 046: i2b
      // 047: bastore
      // 048: iinc 24 1
      // 04b: goto 030
      // 04e: new javax/crypto/spec/DESKeySpec
      // 051: dup_x1
      // 052: swap
      // 053: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 056: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 059: new javax/crypto/spec/IvParameterSpec
      // 05c: dup
      // 05d: bipush 8
      // 05f: newarray 8
      // 061: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 064: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 067: bipush 2
      // 068: anewarray 82
      // 06b: astore 22
      // 06d: bipush 0
      // 06e: istore 28
      // 070: ldc_w "Õ\u000b:MØÛ\u000f¼+½\u0006Ô\u0018~Ã£·Üï\u001cvQ\u008c÷\u0082\u008ek¨8\u0099\u008a\u0089¢_KWÙCå:T\u0081\nf\u0010\u0000½Pûî«\u001dô·\u009dÑ\u0090>%_©\u00ad\u0095¹\u0004N,\u008e©\u008c\u0018~\u0017M£\u00133ëja\u0097¢\u0015\u009f¡Sf>÷\u009f'ë§-Ó-Î\u008dM\\\u0019\u008cÆ;Â.¯\u0014\\êÙAû|ñF\u0018Iã+\u0010MÔÜ¦6ÖKÐ\u0010g/÷Ó)p¸"
      // 073: dup
      // 074: astore 27
      // 076: invokevirtual java/lang/String.length ()I
      // 079: istore 29
      // 07b: bipush 120
      // 07d: istore 26
      // 07f: bipush -1
      // 080: istore 25
      // 082: iinc 25 1
      // 085: aload 27
      // 087: iload 25
      // 089: dup
      // 08a: iload 26
      // 08c: iadd
      // 08d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 090: bipush -1
      // 091: goto 0ba
      // 094: aload 22
      // 096: swap
      // 097: iload 28
      // 099: iinc 28 1
      // 09c: swap
      // 09d: aastore
      // 09e: iload 25
      // 0a0: iload 26
      // 0a2: iadd
      // 0a3: dup
      // 0a4: istore 25
      // 0a6: iload 29
      // 0a8: if_icmpge 0b7
      // 0ab: aload 27
      // 0ad: iload 25
      // 0af: invokevirtual java/lang/String.charAt (I)C
      // 0b2: istore 26
      // 0b4: goto 082
      // 0b7: goto 0d6
      // 0ba: swap
      // 0bb: ldc_w "ISO-8859-1"
      // 0be: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 0c1: aload 23
      // 0c3: swap
      // 0c4: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 0c7: astore 30
      // 0c9: aload 30
      // 0cb: invokestatic cc/astralis/hbo.a ([B)Ljava/lang/String;
      // 0ce: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 0d1: swap
      // 0d2: pop
      // 0d3: goto 094
      // 0d6: new java/util/HashMap
      // 0d9: dup
      // 0da: bipush 13
      // 0dc: invokespecial java/util/HashMap.<init> (I)V
      // 0df: putstatic cc/astralis/hbo.e Ljava/util/Map;
      // 0e2: ldc_w "DES/CBC/NoPadding"
      // 0e5: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 0e8: dup
      // 0e9: astore 11
      // 0eb: bipush 2
      // 0ec: ldc_w "DES"
      // 0ef: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 0f2: bipush 8
      // 0f4: newarray 8
      // 0f6: dup
      // 0f7: bipush 0
      // 0f8: lload 31
      // 0fa: bipush 56
      // 0fc: lushr
      // 0fd: l2i
      // 0fe: i2b
      // 0ff: bastore
      // 100: bipush 1
      // 101: istore 12
      // 103: iload 12
      // 105: bipush 8
      // 107: if_icmpge 121
      // 10a: dup
      // 10b: iload 12
      // 10d: lload 31
      // 10f: iload 12
      // 111: bipush 8
      // 113: imul
      // 114: lshl
      // 115: bipush 56
      // 117: lushr
      // 118: l2i
      // 119: i2b
      // 11a: bastore
      // 11b: iinc 12 1
      // 11e: goto 103
      // 121: new javax/crypto/spec/DESKeySpec
      // 124: dup_x1
      // 125: swap
      // 126: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 129: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 12c: new javax/crypto/spec/IvParameterSpec
      // 12f: dup
      // 130: bipush 8
      // 132: newarray 8
      // 134: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 137: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 13a: bipush 22
      // 13c: newarray 11
      // 13e: astore 17
      // 140: bipush 0
      // 141: istore 14
      // 143: ldc_w ",\u0096!\u0083j1\u001cß\u0013áþcX^½ËV\u00ad\u0085¦ó,ôÌ(\u008eHÏUimú.ÃDy\u008cÎ§Ò³ý«\u0090\u0005\u008cU\u0083:#8¼Zý,n?\u0010-¹Ú\u0003:h\n|\u0098äÛ>S \u009c×\"ø¾yTsqm8¬ÊIÖ`÷\u001aråÞFÅ\u009añÈF\u009c\u0089\u0011eTNP\u009d}\u0085|óUÜ4\u0097\u009a\u0012 µ\br\u0080\u0082b\u008eI5Üâ\u0019\u0014!sÅT\t\u0012\u0019wªF\u0099ü\u0080\rw:'\u00920\u0006*ÉN\u0014ýÃ¶\u009eæ"
      // 146: dup
      // 147: astore 15
      // 149: invokevirtual java/lang/String.length ()I
      // 14c: istore 16
      // 14e: bipush 0
      // 14f: istore 13
      // 151: aload 15
      // 153: iload 13
      // 155: iinc 13 8
      // 158: iload 13
      // 15a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 15d: ldc_w "ISO-8859-1"
      // 160: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 163: astore 18
      // 165: aload 17
      // 167: iload 14
      // 169: iinc 14 1
      // 16c: aload 18
      // 16e: bipush 0
      // 16f: baload
      // 170: i2l
      // 171: ldc2_w 255
      // 174: land
      // 175: bipush 56
      // 177: lshl
      // 178: aload 18
      // 17a: bipush 1
      // 17b: baload
      // 17c: i2l
      // 17d: ldc2_w 255
      // 180: land
      // 181: bipush 48
      // 183: lshl
      // 184: lor
      // 185: aload 18
      // 187: bipush 2
      // 188: baload
      // 189: i2l
      // 18a: ldc2_w 255
      // 18d: land
      // 18e: bipush 40
      // 190: lshl
      // 191: lor
      // 192: aload 18
      // 194: bipush 3
      // 195: baload
      // 196: i2l
      // 197: ldc2_w 255
      // 19a: land
      // 19b: bipush 32
      // 19d: lshl
      // 19e: lor
      // 19f: aload 18
      // 1a1: bipush 4
      // 1a2: baload
      // 1a3: i2l
      // 1a4: ldc2_w 255
      // 1a7: land
      // 1a8: bipush 24
      // 1aa: lshl
      // 1ab: lor
      // 1ac: aload 18
      // 1ae: bipush 5
      // 1af: baload
      // 1b0: i2l
      // 1b1: ldc2_w 255
      // 1b4: land
      // 1b5: bipush 16
      // 1b7: lshl
      // 1b8: lor
      // 1b9: aload 18
      // 1bb: bipush 6
      // 1bd: baload
      // 1be: i2l
      // 1bf: ldc2_w 255
      // 1c2: land
      // 1c3: bipush 8
      // 1c5: lshl
      // 1c6: lor
      // 1c7: aload 18
      // 1c9: bipush 7
      // 1cb: baload
      // 1cc: i2l
      // 1cd: ldc2_w 255
      // 1d0: land
      // 1d1: lor
      // 1d2: bipush -1
      // 1d3: goto 289
      // 1d6: lastore
      // 1d7: iload 13
      // 1d9: iload 16
      // 1db: if_icmplt 151
      // 1de: ldc_w "jEu>Ô÷9bt\u00151=±÷Ìu"
      // 1e1: dup
      // 1e2: astore 15
      // 1e4: invokevirtual java/lang/String.length ()I
      // 1e7: istore 16
      // 1e9: bipush 0
      // 1ea: istore 13
      // 1ec: aload 15
      // 1ee: iload 13
      // 1f0: iinc 13 8
      // 1f3: iload 13
      // 1f5: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1f8: ldc_w "ISO-8859-1"
      // 1fb: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 1fe: astore 18
      // 200: aload 17
      // 202: iload 14
      // 204: iinc 14 1
      // 207: aload 18
      // 209: bipush 0
      // 20a: baload
      // 20b: i2l
      // 20c: ldc2_w 255
      // 20f: land
      // 210: bipush 56
      // 212: lshl
      // 213: aload 18
      // 215: bipush 1
      // 216: baload
      // 217: i2l
      // 218: ldc2_w 255
      // 21b: land
      // 21c: bipush 48
      // 21e: lshl
      // 21f: lor
      // 220: aload 18
      // 222: bipush 2
      // 223: baload
      // 224: i2l
      // 225: ldc2_w 255
      // 228: land
      // 229: bipush 40
      // 22b: lshl
      // 22c: lor
      // 22d: aload 18
      // 22f: bipush 3
      // 230: baload
      // 231: i2l
      // 232: ldc2_w 255
      // 235: land
      // 236: bipush 32
      // 238: lshl
      // 239: lor
      // 23a: aload 18
      // 23c: bipush 4
      // 23d: baload
      // 23e: i2l
      // 23f: ldc2_w 255
      // 242: land
      // 243: bipush 24
      // 245: lshl
      // 246: lor
      // 247: aload 18
      // 249: bipush 5
      // 24a: baload
      // 24b: i2l
      // 24c: ldc2_w 255
      // 24f: land
      // 250: bipush 16
      // 252: lshl
      // 253: lor
      // 254: aload 18
      // 256: bipush 6
      // 258: baload
      // 259: i2l
      // 25a: ldc2_w 255
      // 25d: land
      // 25e: bipush 8
      // 260: lshl
      // 261: lor
      // 262: aload 18
      // 264: bipush 7
      // 266: baload
      // 267: i2l
      // 268: ldc2_w 255
      // 26b: land
      // 26c: lor
      // 26d: bipush 0
      // 26e: goto 289
      // 271: lastore
      // 272: iload 13
      // 274: iload 16
      // 276: if_icmplt 1ec
      // 279: aload 17
      // 27b: putstatic cc/astralis/hbo.c [J
      // 27e: bipush 22
      // 280: anewarray 139
      // 283: putstatic cc/astralis/hbo.d [Ljava/lang/Integer;
      // 286: goto 364
      // 289: dup_x2
      // 28a: pop
      // 28b: lstore 19
      // 28d: bipush 8
      // 28f: newarray 8
      // 291: dup
      // 292: bipush 0
      // 293: lload 19
      // 295: bipush 56
      // 297: lushr
      // 298: l2i
      // 299: i2b
      // 29a: bastore
      // 29b: dup
      // 29c: bipush 1
      // 29d: lload 19
      // 29f: bipush 48
      // 2a1: lushr
      // 2a2: l2i
      // 2a3: i2b
      // 2a4: bastore
      // 2a5: dup
      // 2a6: bipush 2
      // 2a7: lload 19
      // 2a9: bipush 40
      // 2ab: lushr
      // 2ac: l2i
      // 2ad: i2b
      // 2ae: bastore
      // 2af: dup
      // 2b0: bipush 3
      // 2b1: lload 19
      // 2b3: bipush 32
      // 2b5: lushr
      // 2b6: l2i
      // 2b7: i2b
      // 2b8: bastore
      // 2b9: dup
      // 2ba: bipush 4
      // 2bb: lload 19
      // 2bd: bipush 24
      // 2bf: lushr
      // 2c0: l2i
      // 2c1: i2b
      // 2c2: bastore
      // 2c3: dup
      // 2c4: bipush 5
      // 2c5: lload 19
      // 2c7: bipush 16
      // 2c9: lushr
      // 2ca: l2i
      // 2cb: i2b
      // 2cc: bastore
      // 2cd: dup
      // 2ce: bipush 6
      // 2d0: lload 19
      // 2d2: bipush 8
      // 2d4: lushr
      // 2d5: l2i
      // 2d6: i2b
      // 2d7: bastore
      // 2d8: dup
      // 2d9: bipush 7
      // 2db: lload 19
      // 2dd: l2i
      // 2de: i2b
      // 2df: bastore
      // 2e0: aload 11
      // 2e2: swap
      // 2e3: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 2e6: astore 21
      // 2e8: aload 21
      // 2ea: bipush 0
      // 2eb: baload
      // 2ec: i2l
      // 2ed: ldc2_w 255
      // 2f0: land
      // 2f1: bipush 56
      // 2f3: lshl
      // 2f4: aload 21
      // 2f6: bipush 1
      // 2f7: baload
      // 2f8: i2l
      // 2f9: ldc2_w 255
      // 2fc: land
      // 2fd: bipush 48
      // 2ff: lshl
      // 300: lor
      // 301: aload 21
      // 303: bipush 2
      // 304: baload
      // 305: i2l
      // 306: ldc2_w 255
      // 309: land
      // 30a: bipush 40
      // 30c: lshl
      // 30d: lor
      // 30e: aload 21
      // 310: bipush 3
      // 311: baload
      // 312: i2l
      // 313: ldc2_w 255
      // 316: land
      // 317: bipush 32
      // 319: lshl
      // 31a: lor
      // 31b: aload 21
      // 31d: bipush 4
      // 31e: baload
      // 31f: i2l
      // 320: ldc2_w 255
      // 323: land
      // 324: bipush 24
      // 326: lshl
      // 327: lor
      // 328: aload 21
      // 32a: bipush 5
      // 32b: baload
      // 32c: i2l
      // 32d: ldc2_w 255
      // 330: land
      // 331: bipush 16
      // 333: lshl
      // 334: lor
      // 335: aload 21
      // 337: bipush 6
      // 339: baload
      // 33a: i2l
      // 33b: ldc2_w 255
      // 33e: land
      // 33f: bipush 8
      // 341: lshl
      // 342: lor
      // 343: aload 21
      // 345: bipush 7
      // 347: baload
      // 348: i2l
      // 349: ldc2_w 255
      // 34c: land
      // 34d: lor
      // 34e: dup2_x1
      // 34f: pop2
      // 350: tableswitch -378 0 0 -223
      // 364: new java/util/HashMap
      // 367: dup
      // 368: bipush 13
      // 36a: invokespecial java/util/HashMap.<init> (I)V
      // 36d: putstatic cc/astralis/hbo.h Ljava/util/Map;
      // 370: ldc_w "DES/CBC/NoPadding"
      // 373: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 376: dup
      // 377: astore 0
      // 378: bipush 2
      // 379: ldc_w "DES"
      // 37c: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 37f: bipush 8
      // 381: newarray 8
      // 383: dup
      // 384: bipush 0
      // 385: lload 31
      // 387: bipush 56
      // 389: lushr
      // 38a: l2i
      // 38b: i2b
      // 38c: bastore
      // 38d: bipush 1
      // 38e: istore 1
      // 38f: iload 1
      // 390: bipush 8
      // 392: if_icmpge 3aa
      // 395: dup
      // 396: iload 1
      // 397: lload 31
      // 399: iload 1
      // 39a: bipush 8
      // 39c: imul
      // 39d: lshl
      // 39e: bipush 56
      // 3a0: lushr
      // 3a1: l2i
      // 3a2: i2b
      // 3a3: bastore
      // 3a4: iinc 1 1
      // 3a7: goto 38f
      // 3aa: new javax/crypto/spec/DESKeySpec
      // 3ad: dup_x1
      // 3ae: swap
      // 3af: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 3b2: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 3b5: new javax/crypto/spec/IvParameterSpec
      // 3b8: dup
      // 3b9: bipush 8
      // 3bb: newarray 8
      // 3bd: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 3c0: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 3c3: bipush 2
      // 3c4: newarray 11
      // 3c6: astore 6
      // 3c8: bipush 0
      // 3c9: istore 3
      // 3ca: ldc_w "x\u0005\u009fk¦~4È5ý\u0089\b\u008b°\u0094®"
      // 3cd: dup
      // 3ce: astore 4
      // 3d0: invokevirtual java/lang/String.length ()I
      // 3d3: istore 5
      // 3d5: bipush 0
      // 3d6: istore 2
      // 3d7: aload 4
      // 3d9: iload 2
      // 3da: iinc 2 8
      // 3dd: iload 2
      // 3de: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 3e1: ldc_w "ISO-8859-1"
      // 3e4: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 3e7: astore 7
      // 3e9: aload 6
      // 3eb: iload 3
      // 3ec: iinc 3 1
      // 3ef: aload 7
      // 3f1: bipush 0
      // 3f2: baload
      // 3f3: i2l
      // 3f4: ldc2_w 255
      // 3f7: land
      // 3f8: bipush 56
      // 3fa: lshl
      // 3fb: aload 7
      // 3fd: bipush 1
      // 3fe: baload
      // 3ff: i2l
      // 400: ldc2_w 255
      // 403: land
      // 404: bipush 48
      // 406: lshl
      // 407: lor
      // 408: aload 7
      // 40a: bipush 2
      // 40b: baload
      // 40c: i2l
      // 40d: ldc2_w 255
      // 410: land
      // 411: bipush 40
      // 413: lshl
      // 414: lor
      // 415: aload 7
      // 417: bipush 3
      // 418: baload
      // 419: i2l
      // 41a: ldc2_w 255
      // 41d: land
      // 41e: bipush 32
      // 420: lshl
      // 421: lor
      // 422: aload 7
      // 424: bipush 4
      // 425: baload
      // 426: i2l
      // 427: ldc2_w 255
      // 42a: land
      // 42b: bipush 24
      // 42d: lshl
      // 42e: lor
      // 42f: aload 7
      // 431: bipush 5
      // 432: baload
      // 433: i2l
      // 434: ldc2_w 255
      // 437: land
      // 438: bipush 16
      // 43a: lshl
      // 43b: lor
      // 43c: aload 7
      // 43e: bipush 6
      // 440: baload
      // 441: i2l
      // 442: ldc2_w 255
      // 445: land
      // 446: bipush 8
      // 448: lshl
      // 449: lor
      // 44a: aload 7
      // 44c: bipush 7
      // 44e: baload
      // 44f: i2l
      // 450: ldc2_w 255
      // 453: land
      // 454: lor
      // 455: bipush -1
      // 456: goto 46f
      // 459: lastore
      // 45a: iload 2
      // 45b: iload 5
      // 45d: if_icmplt 3d7
      // 460: aload 6
      // 462: putstatic cc/astralis/hbo.f [J
      // 465: bipush 2
      // 466: anewarray 158
      // 469: putstatic cc/astralis/hbo.g [Ljava/lang/Long;
      // 46c: goto 539
      // 46f: dup_x2
      // 470: pop
      // 471: lstore 8
      // 473: bipush 8
      // 475: newarray 8
      // 477: dup
      // 478: bipush 0
      // 479: lload 8
      // 47b: bipush 56
      // 47d: lushr
      // 47e: l2i
      // 47f: i2b
      // 480: bastore
      // 481: dup
      // 482: bipush 1
      // 483: lload 8
      // 485: bipush 48
      // 487: lushr
      // 488: l2i
      // 489: i2b
      // 48a: bastore
      // 48b: dup
      // 48c: bipush 2
      // 48d: lload 8
      // 48f: bipush 40
      // 491: lushr
      // 492: l2i
      // 493: i2b
      // 494: bastore
      // 495: dup
      // 496: bipush 3
      // 497: lload 8
      // 499: bipush 32
      // 49b: lushr
      // 49c: l2i
      // 49d: i2b
      // 49e: bastore
      // 49f: dup
      // 4a0: bipush 4
      // 4a1: lload 8
      // 4a3: bipush 24
      // 4a5: lushr
      // 4a6: l2i
      // 4a7: i2b
      // 4a8: bastore
      // 4a9: dup
      // 4aa: bipush 5
      // 4ab: lload 8
      // 4ad: bipush 16
      // 4af: lushr
      // 4b0: l2i
      // 4b1: i2b
      // 4b2: bastore
      // 4b3: dup
      // 4b4: bipush 6
      // 4b6: lload 8
      // 4b8: bipush 8
      // 4ba: lushr
      // 4bb: l2i
      // 4bc: i2b
      // 4bd: bastore
      // 4be: dup
      // 4bf: bipush 7
      // 4c1: lload 8
      // 4c3: l2i
      // 4c4: i2b
      // 4c5: bastore
      // 4c6: aload 0
      // 4c7: swap
      // 4c8: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 4cb: astore 10
      // 4cd: aload 10
      // 4cf: bipush 0
      // 4d0: baload
      // 4d1: i2l
      // 4d2: ldc2_w 255
      // 4d5: land
      // 4d6: bipush 56
      // 4d8: lshl
      // 4d9: aload 10
      // 4db: bipush 1
      // 4dc: baload
      // 4dd: i2l
      // 4de: ldc2_w 255
      // 4e1: land
      // 4e2: bipush 48
      // 4e4: lshl
      // 4e5: lor
      // 4e6: aload 10
      // 4e8: bipush 2
      // 4e9: baload
      // 4ea: i2l
      // 4eb: ldc2_w 255
      // 4ee: land
      // 4ef: bipush 40
      // 4f1: lshl
      // 4f2: lor
      // 4f3: aload 10
      // 4f5: bipush 3
      // 4f6: baload
      // 4f7: i2l
      // 4f8: ldc2_w 255
      // 4fb: land
      // 4fc: bipush 32
      // 4fe: lshl
      // 4ff: lor
      // 500: aload 10
      // 502: bipush 4
      // 503: baload
      // 504: i2l
      // 505: ldc2_w 255
      // 508: land
      // 509: bipush 24
      // 50b: lshl
      // 50c: lor
      // 50d: aload 10
      // 50f: bipush 5
      // 510: baload
      // 511: i2l
      // 512: ldc2_w 255
      // 515: land
      // 516: bipush 16
      // 518: lshl
      // 519: lor
      // 51a: aload 10
      // 51c: bipush 6
      // 51e: baload
      // 51f: i2l
      // 520: ldc2_w 255
      // 523: land
      // 524: bipush 8
      // 526: lshl
      // 527: lor
      // 528: aload 10
      // 52a: bipush 7
      // 52c: baload
      // 52d: i2l
      // 52e: ldc2_w 255
      // 531: land
      // 532: lor
      // 533: dup2_x1
      // 534: pop2
      // 535: pop
      // 536: goto 459
      // 539: sipush 21276
      // 53c: ldc2_w 7131078218415366870
      // 53f: lload 31
      // 541: lxor
      // 542: pop2
      // 543: pop
      // 544: ldc_w 14
      // 547: anewarray 82
      // 54a: astore 38
      // 54c: sipush 32740
      // 54f: aconst_null
      // 550: bipush 0
      // 551: istore 36
      // 553: invokestatic cc/astralis/hbo.aui ([I)V
      // 556: ldc2_w 8084038930845093421
      // 559: lload 31
      // 55b: lxor
      // 55c: aload 22
      // 55e: bipush 0
      // 55f: aaload
      // 560: dup
      // 561: astore 35
      // 563: invokevirtual java/lang/String.length ()I
      // 566: istore 37
      // 568: pop2
      // 569: pop
      // 56a: ldc 10
      // 56c: istore 34
      // 56e: bipush -1
      // 56f: istore 33
      // 571: sipush 9581
      // 574: ldc2_w 4723721711661618357
      // 577: lload 31
      // 579: lxor
      // 57a: pop2
      // 57b: pop
      // 57c: ldc_w 27
      // 57f: iinc 33 1
      // 582: aload 35
      // 584: iload 33
      // 586: dup
      // 587: iload 34
      // 589: iadd
      // 58a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 58d: bipush -1
      // 58e: goto 611
      // 591: aload 38
      // 593: swap
      // 594: iload 36
      // 596: iinc 36 1
      // 599: swap
      // 59a: aastore
      // 59b: iload 33
      // 59d: iload 34
      // 59f: iadd
      // 5a0: dup
      // 5a1: istore 33
      // 5a3: iload 37
      // 5a5: if_icmpge 5b4
      // 5a8: aload 35
      // 5aa: iload 33
      // 5ac: invokevirtual java/lang/String.charAt (I)C
      // 5af: istore 34
      // 5b1: goto 571
      // 5b4: aload 22
      // 5b6: bipush 1
      // 5b7: aaload
      // 5b8: dup
      // 5b9: astore 35
      // 5bb: invokevirtual java/lang/String.length ()I
      // 5be: istore 37
      // 5c0: bipush 4
      // 5c1: istore 34
      // 5c3: bipush -1
      // 5c4: istore 33
      // 5c6: sipush 22254
      // 5c9: ldc2_w 1289457728986113842
      // 5cc: lload 31
      // 5ce: lxor
      // 5cf: pop2
      // 5d0: pop
      // 5d1: ldc_w 124
      // 5d4: iinc 33 1
      // 5d7: aload 35
      // 5d9: iload 33
      // 5db: dup
      // 5dc: iload 34
      // 5de: iadd
      // 5df: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 5e2: bipush 0
      // 5e3: goto 611
      // 5e6: aload 38
      // 5e8: swap
      // 5e9: iload 36
      // 5eb: iinc 36 1
      // 5ee: swap
      // 5ef: aastore
      // 5f0: iload 33
      // 5f2: iload 34
      // 5f4: iadd
      // 5f5: dup
      // 5f6: istore 33
      // 5f8: iload 37
      // 5fa: if_icmpge 609
      // 5fd: aload 35
      // 5ff: iload 33
      // 601: invokevirtual java/lang/String.charAt (I)C
      // 604: istore 34
      // 606: goto 5c6
      // 609: aload 38
      // 60b: putstatic cc/astralis/hbo.a [Ljava/lang/String;
      // 60e: goto 62c
      // 611: dup_x2
      // 612: pop
      // 613: invokestatic cc/astralis/hbo.a (Ljava/lang/String;)[C
      // 616: invokestatic cc/astralis/hbo.a (I[C)Ljava/lang/String;
      // 619: swap
      // 61a: tableswitch -137 0 0 -52
      // 62c: return
   }

   private static char[] a(String var0) {
      long var1 = b ^ 84892593056877L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 17987;
         long var10005 = 7427963694540523348L ^ var1;
         var10000[0] = (char)(var10003 ^ 'K');
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 55158575537826L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 1080;
         long var10009 = 1211827958379984868L ^ var2;
         var10001[var4] = (char)(var10005 ^ var10002 ^ switch (var4 % 7) {
            case 0 -> {
               short var15 = 13145;
               long var21 = 2167527503867936919L ^ var2;
               yield 120;
            }
            case 1 -> {
               short var14 = 14018;
               long var20 = 3569790838778365213L ^ var2;
               yield 84;
            }
            case 2 -> {
               short var13 = 2351;
               long var19 = 825670173231758066L ^ var2;
               yield 121;
            }
            case 3 -> {
               short var12 = 2135;
               long var18 = 810477674781686661L ^ var2;
               yield 42;
            }
            case 4 -> a<"k">(28875, 497867256335123202L ^ var2);
            case 5 -> {
               short var11 = 17654;
               long var17 = 1434292684646709027L ^ var2;
               yield 34;
            }
            default -> {
               short var10007 = 23688;
               long var16 = 3733088916422258513L ^ var2;
               yield 75;
            }
         });
      }

      return new String(var10001).intern();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18708;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/hbo", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("cc/astralis/hbo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11381;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/hbo", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static long b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = b(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
         throw new RuntimeException("cc/astralis/hbo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
