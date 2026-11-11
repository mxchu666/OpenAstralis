package cc.astralis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hht {
   private static int[] bum;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long[] h;
   private static final Long[] i;
   private static final Map j;

   public static boolean ga() {
      long a = hht.a ^ 16381749921415L;
      int[] ax = dar.abu();

      try {
         short var10002 = 3920;
         long var10003 = 2629019145812217023L ^ a;
         HttpURLConnection axx = (HttpURLConnection)new URL("https://pastebin.com/raw/G6DvJjqY").openConnection();
         short var10001 = 26063;
         long var13 = 5548790900966942241L ^ a;
         axx.setRequestMethod("GET");
         var10001 = 16510;
         long var14 = 603376952221061919L ^ a;
         axx.setConnectTimeout(3000);
         var10001 = 1632;
         long var15 = 4597088537965008128L ^ a;
         axx.setReadTimeout(3000);
         BufferedReader axxx = new BufferedReader(new InputStreamReader(axx.getInputStream()));
         StringBuilder axxxx = new StringBuilder();

         while (true) {
            String axxxxx;
            if ((axxxxx = axxx.readLine()) != null) {
               axxxx.append(axxxxx.trim());
               if (ax != null) {
                  continue;
               }
               break;
            }

            axxx.close();
            break;
         }

         String var10000 = axxxx.toString();
         var10001 = 5116;
         long var16 = 8609386961484714001L ^ a;
         return var10000.equalsIgnoreCase("true");
      } catch (Exception var7) {
         long axx = c<"w">(7058, 6171550226314359747L ^ a);

         while (axx < c<"w">(5052, 8869761197248805868L ^ a)) {
            axx--;
            axx++;
            if (ax == null) {
               break;
            }
         }

         return true;
      }
   }

   public static void dlb(int[] var0) {
      bum = var0;
   }

   public static int[] ajb() {
      return bum;
   }

   static {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc2_w 74278086692912
      // 003: putstatic cc/astralis/hht.a J
      // 006: new java/util/HashMap
      // 009: dup
      // 00a: bipush 13
      // 00c: invokespecial java/util/HashMap.<init> (I)V
      // 00f: putstatic cc/astralis/hht.d Ljava/util/Map;
      // 012: getstatic cc/astralis/hht.a J
      // 015: ldc2_w 92155590756225
      // 018: lxor
      // 019: lstore 22
      // 01b: ldc "DES/CBC/PKCS5Padding"
      // 01d: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 020: dup
      // 021: astore 24
      // 023: bipush 2
      // 024: ldc "DES"
      // 026: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 029: bipush 8
      // 02b: newarray 8
      // 02d: dup
      // 02e: bipush 0
      // 02f: lload 22
      // 031: bipush 56
      // 033: lushr
      // 034: l2i
      // 035: i2b
      // 036: bastore
      // 037: bipush 1
      // 038: istore 25
      // 03a: iload 25
      // 03c: bipush 8
      // 03e: if_icmpge 058
      // 041: dup
      // 042: iload 25
      // 044: lload 22
      // 046: iload 25
      // 048: bipush 8
      // 04a: imul
      // 04b: lshl
      // 04c: bipush 56
      // 04e: lushr
      // 04f: l2i
      // 050: i2b
      // 051: bastore
      // 052: iinc 25 1
      // 055: goto 03a
      // 058: new javax/crypto/spec/DESKeySpec
      // 05b: dup_x1
      // 05c: swap
      // 05d: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 060: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 063: new javax/crypto/spec/IvParameterSpec
      // 066: dup
      // 067: bipush 8
      // 069: newarray 8
      // 06b: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 06e: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 071: bipush 3
      // 072: anewarray 98
      // 075: astore 31
      // 077: bipush 0
      // 078: istore 29
      // 07a: ldc "c\\\u0089\u0091ë\u009a\u0083-seMOÙ5\u0016\u007fdfnl¢<¦X26Ú:\u0094yQ;QFÞy1À\u0094w¨ý]p\u0089/êÓ\t\u007f×å\u0012!\u001cEOÞª0p\u0010y\u0007\u00102\u001c\u007fÆÁøg£)®)\u0099\u001a\u0086\u0012:\u0010Ó®{gùyààZ\u001d\u0098×¯.fj"
      // 07c: dup
      // 07d: astore 28
      // 07f: invokevirtual java/lang/String.length ()I
      // 082: istore 30
      // 084: bipush 64
      // 086: istore 27
      // 088: bipush -1
      // 089: istore 26
      // 08b: iinc 26 1
      // 08e: aload 28
      // 090: iload 26
      // 092: dup
      // 093: iload 27
      // 095: iadd
      // 096: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 099: bipush -1
      // 09a: goto 0cf
      // 09d: aload 31
      // 09f: swap
      // 0a0: iload 29
      // 0a2: iinc 29 1
      // 0a5: swap
      // 0a6: aastore
      // 0a7: iload 26
      // 0a9: iload 27
      // 0ab: iadd
      // 0ac: dup
      // 0ad: istore 26
      // 0af: iload 30
      // 0b1: if_icmpge 0c0
      // 0b4: aload 28
      // 0b6: iload 26
      // 0b8: invokevirtual java/lang/String.charAt (I)C
      // 0bb: istore 27
      // 0bd: goto 08b
      // 0c0: aload 31
      // 0c2: putstatic cc/astralis/hht.b [Ljava/lang/String;
      // 0c5: bipush 3
      // 0c6: anewarray 98
      // 0c9: putstatic cc/astralis/hht.c [Ljava/lang/String;
      // 0cc: goto 0ea
      // 0cf: swap
      // 0d0: ldc "ISO-8859-1"
      // 0d2: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 0d5: aload 24
      // 0d7: swap
      // 0d8: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 0db: astore 32
      // 0dd: aload 32
      // 0df: invokestatic cc/astralis/hht.a ([B)Ljava/lang/String;
      // 0e2: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 0e5: swap
      // 0e6: pop
      // 0e7: goto 09d
      // 0ea: new java/util/HashMap
      // 0ed: dup
      // 0ee: bipush 13
      // 0f0: invokespecial java/util/HashMap.<init> (I)V
      // 0f3: putstatic cc/astralis/hht.g Ljava/util/Map;
      // 0f6: ldc "DES/CBC/NoPadding"
      // 0f8: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 0fb: dup
      // 0fc: astore 11
      // 0fe: bipush 2
      // 0ff: ldc "DES"
      // 101: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 104: bipush 8
      // 106: newarray 8
      // 108: dup
      // 109: bipush 0
      // 10a: lload 22
      // 10c: bipush 56
      // 10e: lushr
      // 10f: l2i
      // 110: i2b
      // 111: bastore
      // 112: bipush 1
      // 113: istore 12
      // 115: iload 12
      // 117: bipush 8
      // 119: if_icmpge 133
      // 11c: dup
      // 11d: iload 12
      // 11f: lload 22
      // 121: iload 12
      // 123: bipush 8
      // 125: imul
      // 126: lshl
      // 127: bipush 56
      // 129: lushr
      // 12a: l2i
      // 12b: i2b
      // 12c: bastore
      // 12d: iinc 12 1
      // 130: goto 115
      // 133: new javax/crypto/spec/DESKeySpec
      // 136: dup_x1
      // 137: swap
      // 138: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 13b: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 13e: new javax/crypto/spec/IvParameterSpec
      // 141: dup
      // 142: bipush 8
      // 144: newarray 8
      // 146: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 149: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 14c: bipush 2
      // 14d: newarray 11
      // 14f: astore 17
      // 151: bipush 0
      // 152: istore 14
      // 154: ldc "0<ß\u0002\u008fâÍg¡ÍåÃò\\.A"
      // 156: dup
      // 157: astore 15
      // 159: invokevirtual java/lang/String.length ()I
      // 15c: istore 16
      // 15e: bipush 0
      // 15f: istore 13
      // 161: aload 15
      // 163: iload 13
      // 165: iinc 13 8
      // 168: iload 13
      // 16a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 16d: ldc "ISO-8859-1"
      // 16f: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 172: astore 18
      // 174: aload 17
      // 176: iload 14
      // 178: iinc 14 1
      // 17b: aload 18
      // 17d: bipush 0
      // 17e: baload
      // 17f: i2l
      // 180: ldc2_w 255
      // 183: land
      // 184: bipush 56
      // 186: lshl
      // 187: aload 18
      // 189: bipush 1
      // 18a: baload
      // 18b: i2l
      // 18c: ldc2_w 255
      // 18f: land
      // 190: bipush 48
      // 192: lshl
      // 193: lor
      // 194: aload 18
      // 196: bipush 2
      // 197: baload
      // 198: i2l
      // 199: ldc2_w 255
      // 19c: land
      // 19d: bipush 40
      // 19f: lshl
      // 1a0: lor
      // 1a1: aload 18
      // 1a3: bipush 3
      // 1a4: baload
      // 1a5: i2l
      // 1a6: ldc2_w 255
      // 1a9: land
      // 1aa: bipush 32
      // 1ac: lshl
      // 1ad: lor
      // 1ae: aload 18
      // 1b0: bipush 4
      // 1b1: baload
      // 1b2: i2l
      // 1b3: ldc2_w 255
      // 1b6: land
      // 1b7: bipush 24
      // 1b9: lshl
      // 1ba: lor
      // 1bb: aload 18
      // 1bd: bipush 5
      // 1be: baload
      // 1bf: i2l
      // 1c0: ldc2_w 255
      // 1c3: land
      // 1c4: bipush 16
      // 1c6: lshl
      // 1c7: lor
      // 1c8: aload 18
      // 1ca: bipush 6
      // 1cc: baload
      // 1cd: i2l
      // 1ce: ldc2_w 255
      // 1d1: land
      // 1d2: bipush 8
      // 1d4: lshl
      // 1d5: lor
      // 1d6: aload 18
      // 1d8: bipush 7
      // 1da: baload
      // 1db: i2l
      // 1dc: ldc2_w 255
      // 1df: land
      // 1e0: lor
      // 1e1: bipush -1
      // 1e2: goto 1fc
      // 1e5: lastore
      // 1e6: iload 13
      // 1e8: iload 16
      // 1ea: if_icmplt 161
      // 1ed: aload 17
      // 1ef: putstatic cc/astralis/hht.e [J
      // 1f2: bipush 2
      // 1f3: anewarray 234
      // 1f6: putstatic cc/astralis/hht.f [Ljava/lang/Integer;
      // 1f9: goto 2c7
      // 1fc: dup_x2
      // 1fd: pop
      // 1fe: lstore 19
      // 200: bipush 8
      // 202: newarray 8
      // 204: dup
      // 205: bipush 0
      // 206: lload 19
      // 208: bipush 56
      // 20a: lushr
      // 20b: l2i
      // 20c: i2b
      // 20d: bastore
      // 20e: dup
      // 20f: bipush 1
      // 210: lload 19
      // 212: bipush 48
      // 214: lushr
      // 215: l2i
      // 216: i2b
      // 217: bastore
      // 218: dup
      // 219: bipush 2
      // 21a: lload 19
      // 21c: bipush 40
      // 21e: lushr
      // 21f: l2i
      // 220: i2b
      // 221: bastore
      // 222: dup
      // 223: bipush 3
      // 224: lload 19
      // 226: bipush 32
      // 228: lushr
      // 229: l2i
      // 22a: i2b
      // 22b: bastore
      // 22c: dup
      // 22d: bipush 4
      // 22e: lload 19
      // 230: bipush 24
      // 232: lushr
      // 233: l2i
      // 234: i2b
      // 235: bastore
      // 236: dup
      // 237: bipush 5
      // 238: lload 19
      // 23a: bipush 16
      // 23c: lushr
      // 23d: l2i
      // 23e: i2b
      // 23f: bastore
      // 240: dup
      // 241: bipush 6
      // 243: lload 19
      // 245: bipush 8
      // 247: lushr
      // 248: l2i
      // 249: i2b
      // 24a: bastore
      // 24b: dup
      // 24c: bipush 7
      // 24e: lload 19
      // 250: l2i
      // 251: i2b
      // 252: bastore
      // 253: aload 11
      // 255: swap
      // 256: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 259: astore 21
      // 25b: aload 21
      // 25d: bipush 0
      // 25e: baload
      // 25f: i2l
      // 260: ldc2_w 255
      // 263: land
      // 264: bipush 56
      // 266: lshl
      // 267: aload 21
      // 269: bipush 1
      // 26a: baload
      // 26b: i2l
      // 26c: ldc2_w 255
      // 26f: land
      // 270: bipush 48
      // 272: lshl
      // 273: lor
      // 274: aload 21
      // 276: bipush 2
      // 277: baload
      // 278: i2l
      // 279: ldc2_w 255
      // 27c: land
      // 27d: bipush 40
      // 27f: lshl
      // 280: lor
      // 281: aload 21
      // 283: bipush 3
      // 284: baload
      // 285: i2l
      // 286: ldc2_w 255
      // 289: land
      // 28a: bipush 32
      // 28c: lshl
      // 28d: lor
      // 28e: aload 21
      // 290: bipush 4
      // 291: baload
      // 292: i2l
      // 293: ldc2_w 255
      // 296: land
      // 297: bipush 24
      // 299: lshl
      // 29a: lor
      // 29b: aload 21
      // 29d: bipush 5
      // 29e: baload
      // 29f: i2l
      // 2a0: ldc2_w 255
      // 2a3: land
      // 2a4: bipush 16
      // 2a6: lshl
      // 2a7: lor
      // 2a8: aload 21
      // 2aa: bipush 6
      // 2ac: baload
      // 2ad: i2l
      // 2ae: ldc2_w 255
      // 2b1: land
      // 2b2: bipush 8
      // 2b4: lshl
      // 2b5: lor
      // 2b6: aload 21
      // 2b8: bipush 7
      // 2ba: baload
      // 2bb: i2l
      // 2bc: ldc2_w 255
      // 2bf: land
      // 2c0: lor
      // 2c1: dup2_x1
      // 2c2: pop2
      // 2c3: pop
      // 2c4: goto 1e5
      // 2c7: new java/util/HashMap
      // 2ca: dup
      // 2cb: bipush 13
      // 2cd: invokespecial java/util/HashMap.<init> (I)V
      // 2d0: putstatic cc/astralis/hht.j Ljava/util/Map;
      // 2d3: ldc "DES/CBC/NoPadding"
      // 2d5: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 2d8: dup
      // 2d9: astore 0
      // 2da: bipush 2
      // 2db: ldc "DES"
      // 2dd: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 2e0: bipush 8
      // 2e2: newarray 8
      // 2e4: dup
      // 2e5: bipush 0
      // 2e6: lload 22
      // 2e8: bipush 56
      // 2ea: lushr
      // 2eb: l2i
      // 2ec: i2b
      // 2ed: bastore
      // 2ee: bipush 1
      // 2ef: istore 1
      // 2f0: iload 1
      // 2f1: bipush 8
      // 2f3: if_icmpge 30b
      // 2f6: dup
      // 2f7: iload 1
      // 2f8: lload 22
      // 2fa: iload 1
      // 2fb: bipush 8
      // 2fd: imul
      // 2fe: lshl
      // 2ff: bipush 56
      // 301: lushr
      // 302: l2i
      // 303: i2b
      // 304: bastore
      // 305: iinc 1 1
      // 308: goto 2f0
      // 30b: new javax/crypto/spec/DESKeySpec
      // 30e: dup_x1
      // 30f: swap
      // 310: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 313: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 316: new javax/crypto/spec/IvParameterSpec
      // 319: dup
      // 31a: bipush 8
      // 31c: newarray 8
      // 31e: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 321: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 324: bipush 2
      // 325: newarray 11
      // 327: astore 6
      // 329: bipush 0
      // 32a: istore 3
      // 32b: ldc "'÷\\m \u0091\u008a#ßWB?\u0003Ö1\u009a"
      // 32d: dup
      // 32e: astore 4
      // 330: invokevirtual java/lang/String.length ()I
      // 333: istore 5
      // 335: bipush 0
      // 336: istore 2
      // 337: aload 4
      // 339: iload 2
      // 33a: iinc 2 8
      // 33d: iload 2
      // 33e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 341: ldc "ISO-8859-1"
      // 343: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 346: astore 7
      // 348: aload 6
      // 34a: iload 3
      // 34b: iinc 3 1
      // 34e: aload 7
      // 350: bipush 0
      // 351: baload
      // 352: i2l
      // 353: ldc2_w 255
      // 356: land
      // 357: bipush 56
      // 359: lshl
      // 35a: aload 7
      // 35c: bipush 1
      // 35d: baload
      // 35e: i2l
      // 35f: ldc2_w 255
      // 362: land
      // 363: bipush 48
      // 365: lshl
      // 366: lor
      // 367: aload 7
      // 369: bipush 2
      // 36a: baload
      // 36b: i2l
      // 36c: ldc2_w 255
      // 36f: land
      // 370: bipush 40
      // 372: lshl
      // 373: lor
      // 374: aload 7
      // 376: bipush 3
      // 377: baload
      // 378: i2l
      // 379: ldc2_w 255
      // 37c: land
      // 37d: bipush 32
      // 37f: lshl
      // 380: lor
      // 381: aload 7
      // 383: bipush 4
      // 384: baload
      // 385: i2l
      // 386: ldc2_w 255
      // 389: land
      // 38a: bipush 24
      // 38c: lshl
      // 38d: lor
      // 38e: aload 7
      // 390: bipush 5
      // 391: baload
      // 392: i2l
      // 393: ldc2_w 255
      // 396: land
      // 397: bipush 16
      // 399: lshl
      // 39a: lor
      // 39b: aload 7
      // 39d: bipush 6
      // 39f: baload
      // 3a0: i2l
      // 3a1: ldc2_w 255
      // 3a4: land
      // 3a5: bipush 8
      // 3a7: lshl
      // 3a8: lor
      // 3a9: aload 7
      // 3ab: bipush 7
      // 3ad: baload
      // 3ae: i2l
      // 3af: ldc2_w 255
      // 3b2: land
      // 3b3: lor
      // 3b4: bipush -1
      // 3b5: goto 3ce
      // 3b8: lastore
      // 3b9: iload 2
      // 3ba: iload 5
      // 3bc: if_icmplt 337
      // 3bf: aload 6
      // 3c1: putstatic cc/astralis/hht.h [J
      // 3c4: bipush 2
      // 3c5: anewarray 244
      // 3c8: putstatic cc/astralis/hht.i [Ljava/lang/Long;
      // 3cb: goto 498
      // 3ce: dup_x2
      // 3cf: pop
      // 3d0: lstore 8
      // 3d2: bipush 8
      // 3d4: newarray 8
      // 3d6: dup
      // 3d7: bipush 0
      // 3d8: lload 8
      // 3da: bipush 56
      // 3dc: lushr
      // 3dd: l2i
      // 3de: i2b
      // 3df: bastore
      // 3e0: dup
      // 3e1: bipush 1
      // 3e2: lload 8
      // 3e4: bipush 48
      // 3e6: lushr
      // 3e7: l2i
      // 3e8: i2b
      // 3e9: bastore
      // 3ea: dup
      // 3eb: bipush 2
      // 3ec: lload 8
      // 3ee: bipush 40
      // 3f0: lushr
      // 3f1: l2i
      // 3f2: i2b
      // 3f3: bastore
      // 3f4: dup
      // 3f5: bipush 3
      // 3f6: lload 8
      // 3f8: bipush 32
      // 3fa: lushr
      // 3fb: l2i
      // 3fc: i2b
      // 3fd: bastore
      // 3fe: dup
      // 3ff: bipush 4
      // 400: lload 8
      // 402: bipush 24
      // 404: lushr
      // 405: l2i
      // 406: i2b
      // 407: bastore
      // 408: dup
      // 409: bipush 5
      // 40a: lload 8
      // 40c: bipush 16
      // 40e: lushr
      // 40f: l2i
      // 410: i2b
      // 411: bastore
      // 412: dup
      // 413: bipush 6
      // 415: lload 8
      // 417: bipush 8
      // 419: lushr
      // 41a: l2i
      // 41b: i2b
      // 41c: bastore
      // 41d: dup
      // 41e: bipush 7
      // 420: lload 8
      // 422: l2i
      // 423: i2b
      // 424: bastore
      // 425: aload 0
      // 426: swap
      // 427: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 42a: astore 10
      // 42c: aload 10
      // 42e: bipush 0
      // 42f: baload
      // 430: i2l
      // 431: ldc2_w 255
      // 434: land
      // 435: bipush 56
      // 437: lshl
      // 438: aload 10
      // 43a: bipush 1
      // 43b: baload
      // 43c: i2l
      // 43d: ldc2_w 255
      // 440: land
      // 441: bipush 48
      // 443: lshl
      // 444: lor
      // 445: aload 10
      // 447: bipush 2
      // 448: baload
      // 449: i2l
      // 44a: ldc2_w 255
      // 44d: land
      // 44e: bipush 40
      // 450: lshl
      // 451: lor
      // 452: aload 10
      // 454: bipush 3
      // 455: baload
      // 456: i2l
      // 457: ldc2_w 255
      // 45a: land
      // 45b: bipush 32
      // 45d: lshl
      // 45e: lor
      // 45f: aload 10
      // 461: bipush 4
      // 462: baload
      // 463: i2l
      // 464: ldc2_w 255
      // 467: land
      // 468: bipush 24
      // 46a: lshl
      // 46b: lor
      // 46c: aload 10
      // 46e: bipush 5
      // 46f: baload
      // 470: i2l
      // 471: ldc2_w 255
      // 474: land
      // 475: bipush 16
      // 477: lshl
      // 478: lor
      // 479: aload 10
      // 47b: bipush 6
      // 47d: baload
      // 47e: i2l
      // 47f: ldc2_w 255
      // 482: land
      // 483: bipush 8
      // 485: lshl
      // 486: lor
      // 487: aload 10
      // 489: bipush 7
      // 48b: baload
      // 48c: i2l
      // 48d: ldc2_w 255
      // 490: land
      // 491: lor
      // 492: dup2_x1
      // 493: pop2
      // 494: pop
      // 495: goto 3b8
      // 498: invokestatic cc/astralis/hht.ajb ()[I
      // 49b: ifnonnull 4ab
      // 49e: bipush 5
      // 49f: newarray 10
      // 4a1: invokestatic cc/astralis/hht.dlb ([I)V
      // 4a4: goto 4ab
      // 4a7: invokestatic cc/astralis/hht.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4aa: athrow
      // 4ab: return
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21848;
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
            throw new RuntimeException("cc/astralis/hht", var10);
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
         throw new RuntimeException("cc/astralis/hht" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17879;
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
            throw new RuntimeException("cc/astralis/hht", var14);
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
         throw new RuntimeException("cc/astralis/hht" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16102;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/hht", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/hht" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
