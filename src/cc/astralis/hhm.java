package cc.astralis;

import com.google.gson.JsonObject;
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

public class hhm extends brc {
   private ago fxt;
   private static String[] bzn;
   private static final String[] c;
   private static final long b;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;
   private static final long m;

   public hhm() {
      long a = b ^ 101514945219836L;
      short var10001 = 19539;
      long var10002 = 1317063441052354666L ^ a;
      super(11);
   }

   public hhm(ago cloudConfig) {
      long ax = b ^ 45273524609001L;
      short var10001 = 2540;
      long var10002 = 3461204636810632917L ^ ax;
      super(11);
      a.fxt = a;
   }

   @Override
   public void etg(JsonObject json) {
      a.cps(a);
      a.fxt = hbo.bdi(a);
   }

   @Override
   public String cql() {
      long a = b ^ 39217580348302L;
      int[] var10000 = dar.abu();
      long ax = m;
      int[] axx = var10000;
      JsonObject axxx = a.fdo();
      var10000 = fxc.gty();
      short var10003 = 28334;
      long var10004 = 5864924312071681504L ^ a;
      Object[] var12 = new Object[14];
      String[] var8 = c;
      var12[0] = var8[0];
      var12[1] = a.fxt.amx();
      var12[2] = var8[2];
      var12[3] = a.fxt.chb();
      var12[4] = var8[4];
      var12[5] = a.fxt.ayq().cfs();
      short var10005 = 28219;
      long var10006 = 6153832401776850279L ^ a;
      var12[6] = var8[3];
      var10005 = 18331;
      var10006 = 7652797158611590359L ^ a;
      var12[7] = a.fxt.ayq().eus();
      var10005 = 23536;
      var10006 = 1269474455927750838L ^ a;
      short var10007 = 22477;
      long var10008 = 978421058410318988L ^ a;
      var12[8] = var8[6];
      var12[a<"u">(17605, 1459668393748471710L ^ a)] = a.fxt.bsl();
      var10005 = 7495;
      var10006 = 1657667260348417540L ^ a;
      var12[10] = var8[5];
      var10005 = 2540;
      var10006 = 3461194165908427442L ^ a;
      var12[11] = a.fxt.cna();
      var10005 = 5986;
      var10006 = 1062228305958390842L ^ a;
      var10007 = 30302;
      var10008 = 777112952374996241L ^ a;
      var12[12] = var8[8];
      var10005 = 7085;
      var10006 = 5751501757916594418L ^ a;
      var12[13] = a.fxt.dvu().toString();
      a.eqw(axxx, var12);
      int[] axxxx = var10000;
      String var10 = axxx.toString();
      String[] var10001 = var8;
      if (axx != null) {
         byte[] var11 = cni.fsi(var8[1]);
         var10003 = 18331;
         var10004 = 7652797158611590359L ^ a;
         var10 = fz.dvr(var10, var11, cni.fsi(var8[7]));
         if (axxxx == null) {
            return var10;
         }

         var10001 = new String[4];
      }

      cdr.apm(var10001);
      return var10;
   }

   public ago eqn() {
      return a.fxt;
   }

   public static void feb(String[] var0) {
      bzn = var0;
   }

   public static String[] btp() {
      return bzn;
   }

   static {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at org.jetbrains.java.decompiler.util.collections.FastSparseSetFactory$FastSparseSet.getCopy(FastSparseSetFactory.java:98)
      //   at org.jetbrains.java.decompiler.util.collections.SFormsFastMapDirect.getCopy(SFormsFastMapDirect.java:67)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.mergeInVarMaps(SFormsConstructor.java:243)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.ssaStatements(SFormsConstructor.java:107)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:94)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SSAUConstructorSparseEx.splitVariables(SSAUConstructorSparseEx.java:43)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:86)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:299)
      //
      // Bytecode:
      // 000: ldc2_w 35443067040940
      // 003: putstatic cc/astralis/hhm.b J
      // 006: getstatic cc/astralis/hhm.b J
      // 009: ldc2_w 8622372509394
      // 00c: lxor
      // 00d: lstore 25
      // 00f: ldc "DES/CBC/PKCS5Padding"
      // 011: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 014: dup
      // 015: astore 17
      // 017: bipush 2
      // 018: ldc "DES"
      // 01a: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 01d: bipush 8
      // 01f: newarray 8
      // 021: dup
      // 022: bipush 0
      // 023: lload 25
      // 025: bipush 56
      // 027: lushr
      // 028: l2i
      // 029: i2b
      // 02a: bastore
      // 02b: bipush 1
      // 02c: istore 18
      // 02e: iload 18
      // 030: bipush 8
      // 032: if_icmpge 04c
      // 035: dup
      // 036: iload 18
      // 038: lload 25
      // 03a: iload 18
      // 03c: bipush 8
      // 03e: imul
      // 03f: lshl
      // 040: bipush 56
      // 042: lushr
      // 043: l2i
      // 044: i2b
      // 045: bastore
      // 046: iinc 18 1
      // 049: goto 02e
      // 04c: new javax/crypto/spec/DESKeySpec
      // 04f: dup_x1
      // 050: swap
      // 051: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 054: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 057: new javax/crypto/spec/IvParameterSpec
      // 05a: dup
      // 05b: bipush 8
      // 05d: newarray 8
      // 05f: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 062: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 065: bipush 2
      // 066: anewarray 183
      // 069: astore 16
      // 06b: bipush 0
      // 06c: istore 22
      // 06e: ldc "3\u0099\u00944\u000f\u0018\u0091VÄ\u0088JâA¼>\u0081\u008dëßG\u0099\u0088\u0013\r\u0001\u0088\u009a\u000b¤b\u0093|\u0096ÉZ\u0001\u0089ÀÊ\u0005O\u0094&\u0089MÁH-\u008b#)î/ÝRÙP\u0094;'\u0081\u0099{KÙmeÔ|pM\fõM\u0089Á,Q^\u0006g¹\u00074\u001bÆ¨¡\u0093Óñ\u007f\b\u000b\"úF¦Jù\u00104ê \u0084¹\u0083qt§Û\u0088hMjôõw\u000bû\u0097A\u008c8p¤\u0086VRâ^/uC{bGò±ë/\u0099\u00ad'ÀÕ\u0092º¤©\u0011\u0099ÇÎª$6GRæ\u0002Û&O\u0085\u009aníý¼Åß\u0085\u001bã^®TòJç\u0010PèÖpäø\u0085\u0086§²pEÝU\u001eÀp6\u0090k \u0086i\u0006\u0081\u009c\u009a,\u0082è¹\u0011¬êß"
      // 070: dup
      // 071: astore 21
      // 073: invokevirtual java/lang/String.length ()I
      // 076: istore 23
      // 078: bipush 112
      // 07a: istore 20
      // 07c: bipush -1
      // 07d: istore 19
      // 07f: iinc 19 1
      // 082: aload 21
      // 084: iload 19
      // 086: dup
      // 087: iload 20
      // 089: iadd
      // 08a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 08d: bipush -1
      // 08e: goto 0b7
      // 091: aload 16
      // 093: swap
      // 094: iload 22
      // 096: iinc 22 1
      // 099: swap
      // 09a: aastore
      // 09b: iload 19
      // 09d: iload 20
      // 09f: iadd
      // 0a0: dup
      // 0a1: istore 19
      // 0a3: iload 23
      // 0a5: if_icmpge 0b4
      // 0a8: aload 21
      // 0aa: iload 19
      // 0ac: invokevirtual java/lang/String.charAt (I)C
      // 0af: istore 20
      // 0b1: goto 07f
      // 0b4: goto 0d2
      // 0b7: swap
      // 0b8: ldc "ISO-8859-1"
      // 0ba: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 0bd: aload 17
      // 0bf: swap
      // 0c0: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 0c3: astore 24
      // 0c5: aload 24
      // 0c7: invokestatic cc/astralis/hhm.b ([B)Ljava/lang/String;
      // 0ca: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 0cd: swap
      // 0ce: pop
      // 0cf: goto 091
      // 0d2: new java/util/HashMap
      // 0d5: dup
      // 0d6: bipush 13
      // 0d8: invokespecial java/util/HashMap.<init> (I)V
      // 0db: putstatic cc/astralis/hhm.i Ljava/util/Map;
      // 0de: ldc_w "DES/CBC/NoPadding"
      // 0e1: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 0e4: dup
      // 0e5: astore 5
      // 0e7: bipush 2
      // 0e8: ldc "DES"
      // 0ea: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 0ed: bipush 8
      // 0ef: newarray 8
      // 0f1: dup
      // 0f2: bipush 0
      // 0f3: lload 25
      // 0f5: bipush 56
      // 0f7: lushr
      // 0f8: l2i
      // 0f9: i2b
      // 0fa: bastore
      // 0fb: bipush 1
      // 0fc: istore 6
      // 0fe: iload 6
      // 100: bipush 8
      // 102: if_icmpge 11c
      // 105: dup
      // 106: iload 6
      // 108: lload 25
      // 10a: iload 6
      // 10c: bipush 8
      // 10e: imul
      // 10f: lshl
      // 110: bipush 56
      // 112: lushr
      // 113: l2i
      // 114: i2b
      // 115: bastore
      // 116: iinc 6 1
      // 119: goto 0fe
      // 11c: new javax/crypto/spec/DESKeySpec
      // 11f: dup_x1
      // 120: swap
      // 121: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 124: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 127: new javax/crypto/spec/IvParameterSpec
      // 12a: dup
      // 12b: bipush 8
      // 12d: newarray 8
      // 12f: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 132: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 135: bipush 24
      // 137: newarray 11
      // 139: astore 11
      // 13b: bipush 0
      // 13c: istore 8
      // 13e: ldc_w "\u0015\u008b\\õÍT\u009fóÃýË\u001f\u0082Úñ4\u0014BøLdÒï_S-¶\u009bpÄ¡åÆÔ¸\u008a¸¸iTOT[\u0091z´\u0085ÎÔ*\t\u0083Ëð<_\u00ad\u0004Â#yÏv<ÊW\u001dh\u0002â\u0017AÄFVÍ%ÈÕ\\6UÖ¿¼½¯år\u0096Öã¹\u0018½ÌkÄ\u001f}U+\nLÃ\u0091²F\u0006¡ªKÆ£\u0088{Cp¥»\u00adèõ>\u0082]Ä\u008f\u00adM\u0012Ë\u009fÔy¿\u000bS\"\u0094²\u0015<\\\u0014Biy\u0095W\u0013p\u0011\u008e\u0011h\u0012~/\u0089ß\u00adÂ{\u0014î\u0093åg\u0084Ðì\u0086\u008e\u008f\u0088"
      // 141: dup
      // 142: astore 9
      // 144: invokevirtual java/lang/String.length ()I
      // 147: istore 10
      // 149: bipush 0
      // 14a: istore 7
      // 14c: aload 9
      // 14e: iload 7
      // 150: iinc 7 8
      // 153: iload 7
      // 155: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 158: ldc "ISO-8859-1"
      // 15a: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 15d: astore 12
      // 15f: aload 11
      // 161: iload 8
      // 163: iinc 8 1
      // 166: aload 12
      // 168: bipush 0
      // 169: baload
      // 16a: i2l
      // 16b: ldc2_w 255
      // 16e: land
      // 16f: bipush 56
      // 171: lshl
      // 172: aload 12
      // 174: bipush 1
      // 175: baload
      // 176: i2l
      // 177: ldc2_w 255
      // 17a: land
      // 17b: bipush 48
      // 17d: lshl
      // 17e: lor
      // 17f: aload 12
      // 181: bipush 2
      // 182: baload
      // 183: i2l
      // 184: ldc2_w 255
      // 187: land
      // 188: bipush 40
      // 18a: lshl
      // 18b: lor
      // 18c: aload 12
      // 18e: bipush 3
      // 18f: baload
      // 190: i2l
      // 191: ldc2_w 255
      // 194: land
      // 195: bipush 32
      // 197: lshl
      // 198: lor
      // 199: aload 12
      // 19b: bipush 4
      // 19c: baload
      // 19d: i2l
      // 19e: ldc2_w 255
      // 1a1: land
      // 1a2: bipush 24
      // 1a4: lshl
      // 1a5: lor
      // 1a6: aload 12
      // 1a8: bipush 5
      // 1a9: baload
      // 1aa: i2l
      // 1ab: ldc2_w 255
      // 1ae: land
      // 1af: bipush 16
      // 1b1: lshl
      // 1b2: lor
      // 1b3: aload 12
      // 1b5: bipush 6
      // 1b7: baload
      // 1b8: i2l
      // 1b9: ldc2_w 255
      // 1bc: land
      // 1bd: bipush 8
      // 1bf: lshl
      // 1c0: lor
      // 1c1: aload 12
      // 1c3: bipush 7
      // 1c5: baload
      // 1c6: i2l
      // 1c7: ldc2_w 255
      // 1ca: land
      // 1cb: lor
      // 1cc: bipush -1
      // 1cd: goto 282
      // 1d0: lastore
      // 1d1: iload 7
      // 1d3: iload 10
      // 1d5: if_icmplt 14c
      // 1d8: ldc_w "&{\nV¬\u009e¸)\u009bãëµ\u0013);Æ"
      // 1db: dup
      // 1dc: astore 9
      // 1de: invokevirtual java/lang/String.length ()I
      // 1e1: istore 10
      // 1e3: bipush 0
      // 1e4: istore 7
      // 1e6: aload 9
      // 1e8: iload 7
      // 1ea: iinc 7 8
      // 1ed: iload 7
      // 1ef: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1f2: ldc "ISO-8859-1"
      // 1f4: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 1f7: astore 12
      // 1f9: aload 11
      // 1fb: iload 8
      // 1fd: iinc 8 1
      // 200: aload 12
      // 202: bipush 0
      // 203: baload
      // 204: i2l
      // 205: ldc2_w 255
      // 208: land
      // 209: bipush 56
      // 20b: lshl
      // 20c: aload 12
      // 20e: bipush 1
      // 20f: baload
      // 210: i2l
      // 211: ldc2_w 255
      // 214: land
      // 215: bipush 48
      // 217: lshl
      // 218: lor
      // 219: aload 12
      // 21b: bipush 2
      // 21c: baload
      // 21d: i2l
      // 21e: ldc2_w 255
      // 221: land
      // 222: bipush 40
      // 224: lshl
      // 225: lor
      // 226: aload 12
      // 228: bipush 3
      // 229: baload
      // 22a: i2l
      // 22b: ldc2_w 255
      // 22e: land
      // 22f: bipush 32
      // 231: lshl
      // 232: lor
      // 233: aload 12
      // 235: bipush 4
      // 236: baload
      // 237: i2l
      // 238: ldc2_w 255
      // 23b: land
      // 23c: bipush 24
      // 23e: lshl
      // 23f: lor
      // 240: aload 12
      // 242: bipush 5
      // 243: baload
      // 244: i2l
      // 245: ldc2_w 255
      // 248: land
      // 249: bipush 16
      // 24b: lshl
      // 24c: lor
      // 24d: aload 12
      // 24f: bipush 6
      // 251: baload
      // 252: i2l
      // 253: ldc2_w 255
      // 256: land
      // 257: bipush 8
      // 259: lshl
      // 25a: lor
      // 25b: aload 12
      // 25d: bipush 7
      // 25f: baload
      // 260: i2l
      // 261: ldc2_w 255
      // 264: land
      // 265: lor
      // 266: bipush 0
      // 267: goto 282
      // 26a: lastore
      // 26b: iload 7
      // 26d: iload 10
      // 26f: if_icmplt 1e6
      // 272: aload 11
      // 274: putstatic cc/astralis/hhm.g [J
      // 277: bipush 24
      // 279: anewarray 101
      // 27c: putstatic cc/astralis/hhm.h [Ljava/lang/Integer;
      // 27f: goto 35c
      // 282: dup_x2
      // 283: pop
      // 284: lstore 13
      // 286: bipush 8
      // 288: newarray 8
      // 28a: dup
      // 28b: bipush 0
      // 28c: lload 13
      // 28e: bipush 56
      // 290: lushr
      // 291: l2i
      // 292: i2b
      // 293: bastore
      // 294: dup
      // 295: bipush 1
      // 296: lload 13
      // 298: bipush 48
      // 29a: lushr
      // 29b: l2i
      // 29c: i2b
      // 29d: bastore
      // 29e: dup
      // 29f: bipush 2
      // 2a0: lload 13
      // 2a2: bipush 40
      // 2a4: lushr
      // 2a5: l2i
      // 2a6: i2b
      // 2a7: bastore
      // 2a8: dup
      // 2a9: bipush 3
      // 2aa: lload 13
      // 2ac: bipush 32
      // 2ae: lushr
      // 2af: l2i
      // 2b0: i2b
      // 2b1: bastore
      // 2b2: dup
      // 2b3: bipush 4
      // 2b4: lload 13
      // 2b6: bipush 24
      // 2b8: lushr
      // 2b9: l2i
      // 2ba: i2b
      // 2bb: bastore
      // 2bc: dup
      // 2bd: bipush 5
      // 2be: lload 13
      // 2c0: bipush 16
      // 2c2: lushr
      // 2c3: l2i
      // 2c4: i2b
      // 2c5: bastore
      // 2c6: dup
      // 2c7: bipush 6
      // 2c9: lload 13
      // 2cb: bipush 8
      // 2cd: lushr
      // 2ce: l2i
      // 2cf: i2b
      // 2d0: bastore
      // 2d1: dup
      // 2d2: bipush 7
      // 2d4: lload 13
      // 2d6: l2i
      // 2d7: i2b
      // 2d8: bastore
      // 2d9: aload 5
      // 2db: swap
      // 2dc: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 2df: astore 15
      // 2e1: aload 15
      // 2e3: bipush 0
      // 2e4: baload
      // 2e5: i2l
      // 2e6: ldc2_w 255
      // 2e9: land
      // 2ea: bipush 56
      // 2ec: lshl
      // 2ed: aload 15
      // 2ef: bipush 1
      // 2f0: baload
      // 2f1: i2l
      // 2f2: ldc2_w 255
      // 2f5: land
      // 2f6: bipush 48
      // 2f8: lshl
      // 2f9: lor
      // 2fa: aload 15
      // 2fc: bipush 2
      // 2fd: baload
      // 2fe: i2l
      // 2ff: ldc2_w 255
      // 302: land
      // 303: bipush 40
      // 305: lshl
      // 306: lor
      // 307: aload 15
      // 309: bipush 3
      // 30a: baload
      // 30b: i2l
      // 30c: ldc2_w 255
      // 30f: land
      // 310: bipush 32
      // 312: lshl
      // 313: lor
      // 314: aload 15
      // 316: bipush 4
      // 317: baload
      // 318: i2l
      // 319: ldc2_w 255
      // 31c: land
      // 31d: bipush 24
      // 31f: lshl
      // 320: lor
      // 321: aload 15
      // 323: bipush 5
      // 324: baload
      // 325: i2l
      // 326: ldc2_w 255
      // 329: land
      // 32a: bipush 16
      // 32c: lshl
      // 32d: lor
      // 32e: aload 15
      // 330: bipush 6
      // 332: baload
      // 333: i2l
      // 334: ldc2_w 255
      // 337: land
      // 338: bipush 8
      // 33a: lshl
      // 33b: lor
      // 33c: aload 15
      // 33e: bipush 7
      // 340: baload
      // 341: i2l
      // 342: ldc2_w 255
      // 345: land
      // 346: lor
      // 347: dup2_x1
      // 348: pop2
      // 349: tableswitch -377 0 0 -223
      // 35c: ldc_w "DES/CBC/NoPadding"
      // 35f: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 362: dup
      // 363: astore 0
      // 364: bipush 2
      // 365: ldc "DES"
      // 367: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 36a: bipush 8
      // 36c: newarray 8
      // 36e: dup
      // 36f: bipush 0
      // 370: lload 25
      // 372: bipush 56
      // 374: lushr
      // 375: l2i
      // 376: i2b
      // 377: bastore
      // 378: bipush 1
      // 379: istore 1
      // 37a: iload 1
      // 37b: bipush 8
      // 37d: if_icmpge 395
      // 380: dup
      // 381: iload 1
      // 382: lload 25
      // 384: iload 1
      // 385: bipush 8
      // 387: imul
      // 388: lshl
      // 389: bipush 56
      // 38b: lushr
      // 38c: l2i
      // 38d: i2b
      // 38e: bastore
      // 38f: iinc 1 1
      // 392: goto 37a
      // 395: new javax/crypto/spec/DESKeySpec
      // 398: dup_x1
      // 399: swap
      // 39a: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 39d: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 3a0: new javax/crypto/spec/IvParameterSpec
      // 3a3: dup
      // 3a4: bipush 8
      // 3a6: newarray 8
      // 3a8: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 3ab: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 3ae: ldc2_w 6937483341130420316
      // 3b1: bipush -1
      // 3b2: goto 3bb
      // 3b5: putstatic cc/astralis/hhm.m J
      // 3b8: goto 47c
      // 3bb: dup_x2
      // 3bc: pop
      // 3bd: lstore 2
      // 3be: bipush 8
      // 3c0: newarray 8
      // 3c2: dup
      // 3c3: bipush 0
      // 3c4: lload 2
      // 3c5: bipush 56
      // 3c7: lushr
      // 3c8: l2i
      // 3c9: i2b
      // 3ca: bastore
      // 3cb: dup
      // 3cc: bipush 1
      // 3cd: lload 2
      // 3ce: bipush 48
      // 3d0: lushr
      // 3d1: l2i
      // 3d2: i2b
      // 3d3: bastore
      // 3d4: dup
      // 3d5: bipush 2
      // 3d6: lload 2
      // 3d7: bipush 40
      // 3d9: lushr
      // 3da: l2i
      // 3db: i2b
      // 3dc: bastore
      // 3dd: dup
      // 3de: bipush 3
      // 3df: lload 2
      // 3e0: bipush 32
      // 3e2: lushr
      // 3e3: l2i
      // 3e4: i2b
      // 3e5: bastore
      // 3e6: dup
      // 3e7: bipush 4
      // 3e8: lload 2
      // 3e9: bipush 24
      // 3eb: lushr
      // 3ec: l2i
      // 3ed: i2b
      // 3ee: bastore
      // 3ef: dup
      // 3f0: bipush 5
      // 3f1: lload 2
      // 3f2: bipush 16
      // 3f4: lushr
      // 3f5: l2i
      // 3f6: i2b
      // 3f7: bastore
      // 3f8: dup
      // 3f9: bipush 6
      // 3fb: lload 2
      // 3fc: bipush 8
      // 3fe: lushr
      // 3ff: l2i
      // 400: i2b
      // 401: bastore
      // 402: dup
      // 403: bipush 7
      // 405: lload 2
      // 406: l2i
      // 407: i2b
      // 408: bastore
      // 409: aload 0
      // 40a: swap
      // 40b: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 40e: astore 4
      // 410: aload 4
      // 412: bipush 0
      // 413: baload
      // 414: i2l
      // 415: ldc2_w 255
      // 418: land
      // 419: bipush 56
      // 41b: lshl
      // 41c: aload 4
      // 41e: bipush 1
      // 41f: baload
      // 420: i2l
      // 421: ldc2_w 255
      // 424: land
      // 425: bipush 48
      // 427: lshl
      // 428: lor
      // 429: aload 4
      // 42b: bipush 2
      // 42c: baload
      // 42d: i2l
      // 42e: ldc2_w 255
      // 431: land
      // 432: bipush 40
      // 434: lshl
      // 435: lor
      // 436: aload 4
      // 438: bipush 3
      // 439: baload
      // 43a: i2l
      // 43b: ldc2_w 255
      // 43e: land
      // 43f: bipush 32
      // 441: lshl
      // 442: lor
      // 443: aload 4
      // 445: bipush 4
      // 446: baload
      // 447: i2l
      // 448: ldc2_w 255
      // 44b: land
      // 44c: bipush 24
      // 44e: lshl
      // 44f: lor
      // 450: aload 4
      // 452: bipush 5
      // 453: baload
      // 454: i2l
      // 455: ldc2_w 255
      // 458: land
      // 459: bipush 16
      // 45b: lshl
      // 45c: lor
      // 45d: aload 4
      // 45f: bipush 6
      // 461: baload
      // 462: i2l
      // 463: ldc2_w 255
      // 466: land
      // 467: bipush 8
      // 469: lshl
      // 46a: lor
      // 46b: aload 4
      // 46d: bipush 7
      // 46f: baload
      // 470: i2l
      // 471: ldc2_w 255
      // 474: land
      // 475: lor
      // 476: dup2_x1
      // 477: pop2
      // 478: pop
      // 479: goto 3b5
      // 47c: sipush 24194
      // 47f: ldc2_w 3869172886596370590
      // 482: lload 25
      // 484: lxor
      // 485: pop2
      // 486: pop
      // 487: ldc_w 9
      // 48a: anewarray 183
      // 48d: astore 32
      // 48f: aconst_null
      // 490: bipush 0
      // 491: istore 30
      // 493: aload 16
      // 495: bipush 1
      // 496: aaload
      // 497: dup
      // 498: astore 29
      // 49a: invokevirtual java/lang/String.length ()I
      // 49d: istore 31
      // 49f: bipush 4
      // 4a0: istore 28
      // 4a2: invokestatic cc/astralis/hhm.feb ([Ljava/lang/String;)V
      // 4a5: bipush -1
      // 4a6: istore 27
      // 4a8: sipush 3093
      // 4ab: ldc2_w 5019591219822793216
      // 4ae: lload 25
      // 4b0: lxor
      // 4b1: pop2
      // 4b2: pop
      // 4b3: ldc_w 125
      // 4b6: iinc 27 1
      // 4b9: aload 29
      // 4bb: iload 27
      // 4bd: dup
      // 4be: iload 28
      // 4c0: iadd
      // 4c1: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 4c4: bipush -1
      // 4c5: goto 555
      // 4c8: aload 32
      // 4ca: swap
      // 4cb: iload 30
      // 4cd: iinc 30 1
      // 4d0: swap
      // 4d1: aastore
      // 4d2: iload 27
      // 4d4: iload 28
      // 4d6: iadd
      // 4d7: dup
      // 4d8: istore 27
      // 4da: iload 31
      // 4dc: if_icmpge 4eb
      // 4df: aload 29
      // 4e1: iload 27
      // 4e3: invokevirtual java/lang/String.charAt (I)C
      // 4e6: istore 28
      // 4e8: goto 4a8
      // 4eb: aload 16
      // 4ed: bipush 0
      // 4ee: aaload
      // 4ef: dup
      // 4f0: astore 29
      // 4f2: invokevirtual java/lang/String.length ()I
      // 4f5: istore 31
      // 4f7: sipush 18371
      // 4fa: ldc2_w 720896131896039874
      // 4fd: lload 25
      // 4ff: lxor
      // 500: pop2
      // 501: pop
      // 502: ldc_w 96
      // 505: istore 28
      // 507: bipush -1
      // 508: istore 27
      // 50a: sipush 7938
      // 50d: ldc2_w 703046185069084935
      // 510: lload 25
      // 512: lxor
      // 513: pop2
      // 514: pop
      // 515: ldc_w 82
      // 518: iinc 27 1
      // 51b: aload 29
      // 51d: iload 27
      // 51f: dup
      // 520: iload 28
      // 522: iadd
      // 523: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 526: bipush 0
      // 527: goto 555
      // 52a: aload 32
      // 52c: swap
      // 52d: iload 30
      // 52f: iinc 30 1
      // 532: swap
      // 533: aastore
      // 534: iload 27
      // 536: iload 28
      // 538: iadd
      // 539: dup
      // 53a: istore 27
      // 53c: iload 31
      // 53e: if_icmpge 54d
      // 541: aload 29
      // 543: iload 27
      // 545: invokevirtual java/lang/String.charAt (I)C
      // 548: istore 28
      // 54a: goto 50a
      // 54d: aload 32
      // 54f: putstatic cc/astralis/hhm.c [Ljava/lang/String;
      // 552: goto 570
      // 555: dup_x2
      // 556: pop
      // 557: invokestatic cc/astralis/hhm.b (Ljava/lang/String;)[C
      // 55a: invokestatic cc/astralis/hhm.b (I[C)Ljava/lang/String;
      // 55d: swap
      // 55e: tableswitch -150 0 0 -52
      // 570: return
   }

   private static char[] b(String var0) {
      long var1 = b ^ 109301114022425L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 1352;
         long var10005 = 3758113059531057048L ^ var1;
         var10000[0] = (char)(var10003 ^ ',');
      }

      return var10000;
   }

   private static String b(int param0, char[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: getstatic cc/astralis/hhm.b J
      // 03: ldc2_w 94206035305220
      // 06: lxor
      // 07: lstore 2
      // 08: iload 0
      // 09: aload 1
      // 0a: dup_x1
      // 0b: arraylength
      // 0c: dup_x2
      // 0d: pop
      // 0e: bipush 0
      // 0f: istore 1
      // 10: goto bc
      // 13: dup2
      // 14: swap
      // 15: iload 1
      // 16: dup2_x1
      // 17: caload
      // 18: swap
      // 19: iload 1
      // 1a: sipush 6985
      // 1d: ldc2_w 2321050720990818457
      // 20: lload 2
      // 21: lxor
      // 22: invokedynamic u (IJ)I bsm=cc/astralis/hhm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: irem
      // 28: tableswitch 128 0 5 40 60 76 92 108 112
      // 50: sipush 13947
      // 53: ldc2_w 725997364666391996
      // 56: lload 2
      // 57: lxor
      // 58: pop2
      // 59: pop
      // 5a: ldc_w 106
      // 5d: goto b5
      // 60: invokestatic cc/astralis/hhm.a (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 63: athrow
      // 64: sipush 20313
      // 67: ldc2_w 6525462161704395929
      // 6a: lload 2
      // 6b: lxor
      // 6c: pop2
      // 6d: pop
      // 6e: ldc_w 95
      // 71: goto b5
      // 74: sipush 2110
      // 77: ldc2_w 554854143618671601
      // 7a: lload 2
      // 7b: lxor
      // 7c: pop2
      // 7d: pop
      // 7e: ldc_w 105
      // 81: goto b5
      // 84: sipush 10441
      // 87: ldc2_w 326571531759993601
      // 8a: lload 2
      // 8b: lxor
      // 8c: pop2
      // 8d: pop
      // 8e: ldc_w 110
      // 91: goto b5
      // 94: bipush 2
      // 95: goto b5
      // 98: sipush 24082
      // 9b: ldc2_w 4597877569967338972
      // 9e: lload 2
      // 9f: lxor
      // a0: pop2
      // a1: pop
      // a2: ldc_w 48
      // a5: goto b5
      // a8: sipush 10672
      // ab: ldc2_w 2720342697306505842
      // ae: lload 2
      // af: lxor
      // b0: pop2
      // b1: pop
      // b2: ldc_w 44
      // b5: ixor
      // b6: ixor
      // b7: i2c
      // b8: castore
      // b9: iinc 1 1
      // bc: dup2_x1
      // bd: pop2
      // be: dup_x2
      // bf: iload 1
      // c0: if_icmpgt 13
      // c3: pop
      // c4: new java/lang/String
      // c7: dup_x1
      // c8: swap
      // c9: invokespecial java/lang/String.<init> ([C)V
      // cc: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // cf: areturn
   }

   private static String b(byte[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 1
      // 02: aload 0
      // 03: arraylength
      // 04: dup
      // 05: istore 2
      // 06: newarray 5
      // 08: astore 3
      // 09: bipush 0
      // 0a: istore 4
      // 0c: iload 4
      // 0e: iload 2
      // 0f: if_icmpge b2
      // 12: sipush 255
      // 15: aload 0
      // 16: iload 4
      // 18: baload
      // 19: iand
      // 1a: dup
      // 1b: istore 5
      // 1d: sipush 192
      // 20: if_icmpge 2f
      // 23: aload 3
      // 24: iload 1
      // 25: iinc 1 1
      // 28: iload 5
      // 2a: i2c
      // 2b: castore
      // 2c: goto ac
      // 2f: iload 5
      // 31: sipush 224
      // 34: if_icmpge 63
      // 37: iload 5
      // 39: bipush 31
      // 3b: iand
      // 3c: i2c
      // 3d: bipush 6
      // 3f: ishl
      // 40: i2c
      // 41: istore 6
      // 43: aload 0
      // 44: iinc 4 1
      // 47: iload 4
      // 49: baload
      // 4a: istore 5
      // 4c: iload 6
      // 4e: iload 5
      // 50: bipush 63
      // 52: iand
      // 53: i2c
      // 54: ior
      // 55: i2c
      // 56: istore 6
      // 58: aload 3
      // 59: iload 1
      // 5a: iinc 1 1
      // 5d: iload 6
      // 5f: castore
      // 60: goto ac
      // 63: iload 4
      // 65: iload 2
      // 66: bipush 2
      // 67: isub
      // 68: if_icmpge ac
      // 6b: iload 5
      // 6d: bipush 15
      // 6f: iand
      // 70: i2c
      // 71: bipush 12
      // 73: ishl
      // 74: i2c
      // 75: istore 6
      // 77: aload 0
      // 78: iinc 4 1
      // 7b: iload 4
      // 7d: baload
      // 7e: istore 5
      // 80: iload 6
      // 82: iload 5
      // 84: bipush 63
      // 86: iand
      // 87: i2c
      // 88: bipush 6
      // 8a: ishl
      // 8b: ior
      // 8c: i2c
      // 8d: istore 6
      // 8f: aload 0
      // 90: iinc 4 1
      // 93: iload 4
      // 95: baload
      // 96: istore 5
      // 98: iload 6
      // 9a: iload 5
      // 9c: bipush 63
      // 9e: iand
      // 9f: i2c
      // a0: ior
      // a1: i2c
      // a2: istore 6
      // a4: aload 3
      // a5: iload 1
      // a6: iinc 1 1
      // a9: iload 6
      // ab: castore
      // ac: iinc 4 1
      // af: goto 0c
      // b2: new java/lang/String
      // b5: dup
      // b6: aload 3
      // b7: bipush 0
      // b8: iload 1
      // b9: invokespecial java/lang/String.<init> ([CII)V
      // bc: areturn
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31855;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/hhm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
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
         throw new RuntimeException("cc/astralis/hhm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
