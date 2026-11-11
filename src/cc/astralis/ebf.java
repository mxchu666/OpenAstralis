package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class ebf {
   private static final int[] dma;
   private final byte[] cfb;
   private final byte[] amg;
   private int bbq;
   private static final String[] a;
   private static final long b = 131467604084641L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;
   private static final long[] f;
   private static final Long[] g;
   private static final Map h;

   public ebf(byte[] key, byte[] nonce, int count) {
      int var10;
      label35: {
         long ax = b ^ 55795859802633L;
         int[] var10000 = dar.abu();
         long axx = b<"t">(32478, 2528824069463394568L ^ ax);
         super();
         int[] axxx = var10000;
         var10 = a.length;
         short var10001 = 13717;
         long var10002 = 8031898992840208809L ^ ax;
         short var11 = 32;
         if (axxx != null) {
            if (var10 != 32) {
               String[] var9 = ebf.a;
               throw new IllegalArgumentException(var9[0]);
            }

            var10 = a.length;
            if (axxx == null) {
               break label35;
            }

            var11 = 4979;
            var10002 = 7161060872975177596L ^ ax;
            var11 = 12;
         }

         if (var10 != var11) {
            throw new IllegalArgumentException(ebf.a[1]);
         }

         var10 = a;
      }

      if (var10 < 0) {
         throw new IllegalArgumentException(ebf.a[2]);
      } else {
         a.cfb = a;
         a.amg = a;
         a.bbq = a;
      }
   }

   private static int ejt(int a, int a) {
      long ax = b ^ 83360902866523L;
      int var10000 = a << a;
      short var10002 = 2238;
      long var10003 = 7731108295213375731L ^ ax;
      return var10000 | a >>> 32 - a;
   }

   private static void gzn(int[] a, int a, int a, int a, int a) {
      long ax = b ^ 24311647845198L;
      a[a] += a[a];
      int var10002 = a[a] ^ a[a];
      short var10003 = 10023;
      long var10004 = 367046311860638333L ^ ax;
      a[a] = ejt(var10002, 16);
      a[a] += a[a];
      a[a] = ejt(a[a] ^ a[a], a<"e">(10892, 3330186168058585085L ^ ax));
      a[a] += a[a];
      var10002 = a[a] ^ a[a];
      var10003 = 897;
      var10004 = 8385687307707299541L ^ ax;
      a[a] = ejt(var10002, 8);
      a[a] += a[a];
      var10002 = a[a] ^ a[a];
      var10003 = 23645;
      var10004 = 3036183911319922983L ^ ax;
      a[a] = ejt(var10002, 7);
   }

   private static void gwz(int[] a) {
      long ax = b ^ 27858586727240L;
      short var10003 = 31098;
      long var10004 = 6743643875757261884L ^ ax;
      gzn(a, 0, 4, 8, a<"e">(10892, 3330198511089440763L ^ ax));
      var10003 = 16207;
      var10004 = 5287453207062102550L ^ ax;
      short var18 = 30990;
      long var10005 = 6756581197694207051L ^ ax;
      gzn(a, 1, 5, 9, 13);
      short var10002 = 19394;
      long var7 = 3314354571913279125L ^ ax;
      var10003 = 21724;
      var10004 = 5600435776898345379L ^ ax;
      short var20 = 23340;
      var10005 = 5051642577811842687L ^ ax;
      gzn(a, 2, 6, 10, 14);
      var10002 = 14765;
      long var9 = 6640803308706874615L ^ ax;
      var10003 = 28336;
      var10004 = 6413671082792850400L ^ ax;
      short var22 = 10435;
      var10005 = 7559936547537638841L ^ ax;
      gzn(a, 3, 7, 11, 15);
      var10003 = 21724;
      var10004 = 5600435776898345379L ^ ax;
      short var24 = 24778;
      var10005 = 2362874011121950108L ^ ax;
      gzn(a, 0, 5, 10, 15);
      var10002 = 27194;
      long var12 = 5994189793472518007L ^ ax;
      var10003 = 24896;
      var10004 = 3087411802259889214L ^ ax;
      gzn(a, 1, 6, 11, a<"e">(10892, 3330198511089440763L ^ ax));
      var10002 = 23645;
      long var14 = 3036198437536309537L ^ ax;
      var10003 = 897;
      var10004 = 8385699652148494035L ^ ax;
      short var27 = 20768;
      var10005 = 348005797354318959L ^ ax;
      gzn(a, 2, 7, 8, 13);
      var10003 = 8998;
      var10004 = 6014271920102530654L ^ ax;
      short var29 = 18684;
      var10005 = 8673601046388323767L ^ ax;
      gzn(a, 3, 4, 9, 14);
   }

   private int[] bgb() {
      long a = b ^ 69856315582092L;
      int[] var10000 = dar.abu();
      long ax = b<"t">(5789, 9099539577101700553L ^ a);
      short var10001 = 10023;
      long var10002 = 367090896754184127L ^ a;
      int[] axx = new int[16];
      int[] axxx = var10000;
      cdr[] var11 = fz.dtf();
      System.arraycopy(dma, 0, axx, 0, 4);
      ByteBuffer axxxx = ByteBuffer.wrap(a.cfb).order(ByteOrder.LITTLE_ENDIAN);
      cdr[] axxxxx = var11;
      int axxxxxx = 4;

      label31:
      while (true) {
         if (axxxxxx < a<"e">(10892, 3330160377614762559L ^ a)) {
            axx[axxxxxx] = axxxx.getInt();
            axxxxxx++;

            do {
               cdr[] var12 = axxxxx;
               if (axxx != null) {
                  if (axxxxx != null) {
                     break label31;
                  }

                  var12 = axxxxx;
               }

               if (var12 == null) {
                  continue label31;
               }
            } while (axxx == null);
         }

         axx[a<"e">(10892, 3330160377614762559L ^ a)] = a.bbq;
         break;
      }

      ByteBuffer axxxxxxx = ByteBuffer.wrap(a.amg).order(ByteOrder.LITTLE_ENDIAN);
      var10001 = 20768;
      var10002 = 348039080730098091L ^ a;
      axx[13] = axxxxxxx.getInt();
      var10001 = 18684;
      var10002 = 8673639229104119923L ^ a;
      axx[14] = axxxxxxx.getInt(4);
      var10001 = 24778;
      var10002 = 2362907362117240920L ^ a;
      short var10003 = 897;
      long var10004 = 8385662621397232407L ^ a;
      axx[15] = axxxxxxx.getInt(8);
      return axx;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private byte[] ggl(byte[] a) {
      long ax = b ^ 25874102729348L;
      long axx = b<"t">(16647, 6016087485505930840L ^ ax);
      cdr[] var10000 = fz.dtf();
      int[] axxx = a.bgb();
      int[] axxxx = (int[])axxx.clone();
      cdr[] axxxxx = var10000;
      int[] var16 = dar.abu();
      int axxxxxx = 0;
      int[] axxxxxxx = var16;

      label67:
      while (true) {
         short var10001 = 30139;
         long var10002 = 8441077342470324528L ^ ax;
         if (axxxxxx < 10) {
            gwz(axxxx);
            axxxxxx++;
            if (axxxxx == null) {
               continue;
            }
         }

         while (axxxxxxx == null) {
            if (axxxxx == null) {
               continue label67;
            }
         }

         short var17 = 11894;
         long var19 = 6889776943251102443L ^ ax;
         ByteBuffer axxxxxxxx = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
         int axxxxxxxxx = 0;

         label55:
         while (true) {
            var10001 = 4497;
            var10002 = 8640980087593772311L ^ ax;
            if (axxxxxxxxx < 16) {
               axxxxxxxx.putInt(axxx[axxxxxxxxx] + axxxx[axxxxxxxxx]);
               axxxxxxxxx++;
               if (axxxxx == null) {
                  continue;
               }
            }

            while (axxxxxxx == null) {
               if (axxxxx == null) {
                  continue label55;
               }
            }

            byte[] axxxxxxxxxx = new byte[a.length];
            byte[] axxxxxxxxxxx = axxxxxxxx.array();
            int axxxxxxxxxxxx = 0;

            label41:
            while (axxxxxxxxxxxx < a.length) {
               if (axxxxxxx == null) {
                  return axxxxxxxxxx;
               }

               axxxxxxxxxx[axxxxxxxxxxxx] = (byte)(a[axxxxxxxxxxxx] ^ axxxxxxxxxxx[axxxxxxxxxxxx]);
               axxxxxxxxxxxx++;

               do {
                  if (axxxxx != null) {
                     return axxxxxxxxxx;
                  }

                  if (axxxxx == null) {
                     continue label41;
                  }
               } while (axxxxxxx == null);
               break;
            }

            a.bbq++;
            return axxxxxxxxxx;
         }
      }
   }

   public byte[] atf(byte[] data) {
      long ax = b ^ 117451226822781L;
      int[] var10000 = dar.abu();
      long axx = b<"t">(5287, 5983012363723428103L ^ ax);
      cdr[] var10001 = fz.dtf();
      byte[] axxx = new byte[a.length];
      cdr[] axxxx = var10001;
      int axxxxx = 0;
      byte axxxxxx = 0;
      int[] axxxxxxx = var10000;

      while (true) {
         if (axxxxxx < a.length) {
            short var10003 = 29437;
            long var10004 = 3111872379452212362L ^ ax;
            byte[] axxxxxxxx = Arrays.copyOfRange(a, axxxxxx, Math.min(axxxxxx + 64, a.length));
            byte[] axxxxxxxxx = a.ggl(axxxxxxxx);
            if (axxxxxxx != null) {
               var13 = axxxxxxxxx;
               if (axxxx != null) {
                  break;
               }

               System.arraycopy(axxxxxxxxx, 0, axxx, axxxxx, axxxxxxxxx.length);
               axxxxx += axxxxxxxxx.length;
               axxxxxx += 64;
            }

            if (axxxx == null) {
               continue;
            }
         }

         var13 = axxx;
         break;
      }

      return var13;
   }

   public byte[] bfj(byte[] data) {
      return a.atf(a);
   }

   static {
      long var31 = b ^ 97141255895734L;
      Cipher var23;
      Cipher var10000 = var23 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var24 = 1; var24 < 8; var24++) {
         var10003[var24] = (byte)(var31 << var24 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var22 = new String[5];
      int var28 = 0;
      String var27 = "èü\u0010Q7ÃÈ~¤\núÐuìº\u0099\u0010èü\u0010Q7ÃÈ~¤\núÐuìº\u0099H\u008cI!«üCmR6\u0083Á§\u0098.Q\u0017ó\u008b$w>Õ¦blS'Ô\u0000\u0007àÝo$9=é[ìõß8\u008d´¾6Zbm$17±,U\u001dÖÓ·\u0015\u0015\u0096\u0015\u0081L\u0014IV\u008d«TQ";
      int var29 = "èü\u0010Q7ÃÈ~¤\núÐuìº\u0099\u0010èü\u0010Q7ÃÈ~¤\núÐuìº\u0099H\u008cI!«üCmR6\u0083Á§\u0098.Q\u0017ó\u008b$w>Õ¦blS'Ô\u0000\u0007àÝo$9=é[ìõß8\u008d´¾6Zbm$17±,U\u001dÖÓ·\u0015\u0015\u0096\u0015\u0081L\u0014IV\u008d«TQ"
         .length();
      char var26 = 16;
      int var50 = -1;

      label112:
      while (true) {
         String var53 = var27.substring(++var50, var50 + var26);
         int var10001 = -1;

         while (true) {
            byte[] var30 = var23.doFinal(var53.getBytes("ISO-8859-1"));
            String var79 = a(var30).intern();
            switch (var10001) {
               case 0:
                  var22[var28++] = var79;
                  if ((var50 += var26) >= var29) {
                     e = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[42];
                     int var14 = 0;
                     String var15 = "ZA\u0005\u0091½Y\u0002½q\u009f\u0095©ÐX.\u008f\u0095<hÄÞâ%°\u0012\u009c\u0006x\u0091-Ã/\u0015XÎ\u0016\u008bÌ\u0087jý-\u0097n\u0098¤Ýbâ°r\u0087ö\u0001\rPµ\u0081\u0011hï°Íx¥Lg\u0012Öb\u0011#f\u0090\u0086ðQN\u0095°\u0010\u0005AGà\u0012 \u0004vÈ\\ÈlO&\u0016B\u0093\u0004\u0082Qÿ\u0017O·é\u000eix\u0002m³U.c+?ÏÊ\u0000º\u000b?\u0096\u0094R\u0018\u0017ÊUg¦]\u0001À,´Ï\u0082üº\u0014\u0089í\u009e@Y\nÎÍ÷a\u008bû]ã\u0089yÓ'fü[ï\"vÓÍÎ%OaAi>è)]EÆÜ^\u008f\u0090ö\u009dBÉ\u0093\u001f_OØ²9ø±\u009a\u0088ª»CgñD÷n\u001eÈVììÕïq£l×5ÈâjØ\u009d]iN\f'(ÓM\u008c$\u0007o\u008cZ\u0019\u008fâ\u008bì|§'TÉ7x\u0003<^H÷%±\u0015|9Â¥\u0012 îò\u0015§^Ùa\u0011.+Ô ß.MÇ%Ñm\u007f\u0019óJX¥\u009fß6®wRÜ\u007f*V\u001a/\u0095xì¾\u0083À\u008eâo¤~q9ç\u008d²\u0006Ð>";
                     int var16 = "ZA\u0005\u0091½Y\u0002½q\u009f\u0095©ÐX.\u008f\u0095<hÄÞâ%°\u0012\u009c\u0006x\u0091-Ã/\u0015XÎ\u0016\u008bÌ\u0087jý-\u0097n\u0098¤Ýbâ°r\u0087ö\u0001\rPµ\u0081\u0011hï°Íx¥Lg\u0012Öb\u0011#f\u0090\u0086ðQN\u0095°\u0010\u0005AGà\u0012 \u0004vÈ\\ÈlO&\u0016B\u0093\u0004\u0082Qÿ\u0017O·é\u000eix\u0002m³U.c+?ÏÊ\u0000º\u000b?\u0096\u0094R\u0018\u0017ÊUg¦]\u0001À,´Ï\u0082üº\u0014\u0089í\u009e@Y\nÎÍ÷a\u008bû]ã\u0089yÓ'fü[ï\"vÓÍÎ%OaAi>è)]EÆÜ^\u008f\u0090ö\u009dBÉ\u0093\u001f_OØ²9ø±\u009a\u0088ª»CgñD÷n\u001eÈVììÕïq£l×5ÈâjØ\u009d]iN\f'(ÓM\u008c$\u0007o\u008cZ\u0019\u008fâ\u008bì|§'TÉ7x\u0003<^H÷%±\u0015|9Â¥\u0012 îò\u0015§^Ùa\u0011.+Ô ß.MÇ%Ñm\u007f\u0019óJX¥\u009fß6®wRÜ\u007f*V\u001a/\u0095xì¾\u0083À\u008eâo¤~q9ç\u008d²\u0006Ð>"
                        .length();
                     byte var13 = 0;

                     label94:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var56 = var17;
                        var10001 = var14++;
                        long var83 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var108 = -1;

                        while (true) {
                           long var19 = var83;
                           byte[] var21 = var11.doFinal(
                              new byte[]{
                                 (byte)(var19 >>> 56),
                                 (byte)(var19 >>> 48),
                                 (byte)(var19 >>> 40),
                                 (byte)(var19 >>> 32),
                                 (byte)(var19 >>> 24),
                                 (byte)(var19 >>> 16),
                                 (byte)(var19 >>> 8),
                                 (byte)var19
                              }
                           );
                           long var128 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var108) {
                              case 0:
                                 var56[var10001] = var128;
                                 if (var13 >= var16) {
                                    c = var17;
                                    d = new Integer[42];
                                    h = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var31 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[7];
                                    int var3 = 0;
                                    String var4 = "}Ä¬\u001d¯<ôð÷z8£¥µHd=\u0007\u0080Úgü·²þ¿G]Ê>\u0089\u009f´KÑ(ÊÎ>é";
                                    int var5 = "}Ä¬\u001d¯<ôð÷z8£¥µHd=\u0007\u0080Úgü·²þ¿G]Ê>\u0089\u009f´KÑ(ÊÎ>é".length();
                                    byte var2 = 0;

                                    label78:
                                    while (true) {
                                       int var68 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var68, var2).getBytes("ISO-8859-1");
                                       long[] var58 = var6;
                                       var68 = var3++;
                                       long var86 = (var7[0] & 255L) << 56
                                          | (var7[1] & 255L) << 48
                                          | (var7[2] & 255L) << 40
                                          | (var7[3] & 255L) << 32
                                          | (var7[4] & 255L) << 24
                                          | (var7[5] & 255L) << 16
                                          | (var7[6] & 255L) << 8
                                          | var7[7] & 255L;
                                       byte var111 = -1;

                                       while (true) {
                                          long var8 = var86;
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
                                          var128 = (var10[0] & 255L) << 56
                                             | (var10[1] & 255L) << 48
                                             | (var10[2] & 255L) << 40
                                             | (var10[3] & 255L) << 32
                                             | (var10[4] & 255L) << 24
                                             | (var10[5] & 255L) << 16
                                             | (var10[6] & 255L) << 8
                                             | var10[7] & 255L;
                                          switch (var111) {
                                             case 0:
                                                var58[var68] = var128;
                                                if (var2 >= var5) {
                                                   f = var6;
                                                   g = new Long[7];
                                                   long var45 = b<"t">(6950, 4812092875114519630L ^ var31);
                                                   short var59 = 12404;
                                                   String[] var44 = new String[3];
                                                   long var71 = 2357742190953481426L ^ var31;
                                                   int var42 = 0;
                                                   String var41;
                                                   int var43 = (var41 = var22[2]).length();
                                                   char var40 = 20;
                                                   int var39 = -1;

                                                   while (true) {
                                                      short var60 = 8209;
                                                      long var72 = 7990155588470854822L ^ var31;
                                                      String var88 = a(29, a(var41.substring(++var39, var39 + var40)));
                                                      int var73 = -1;
                                                      var44[var42++] = var88;
                                                      if ((var39 += var40) >= var43) {
                                                         a = var44;
                                                         long[] var33 = new long[4];
                                                         int var35 = 0;
                                                         String var36;
                                                         int var37 = (var36 = var22[4]).length();
                                                         byte var34 = 0;

                                                         label62:
                                                         while (true) {
                                                            var73 = var34;
                                                            var34 += 8;
                                                            byte[] var38 = var36.substring(var73, var34).getBytes(var22[1]);
                                                            long[] var61 = var33;
                                                            var73 = var35++;
                                                            long var90 = var38[0] & b<"t">(27464, 857326542725573666L ^ var31);
                                                            short var113 = 14184;
                                                            var128 = 7327045317192565722L ^ var31;
                                                            long var91 = var90 << 56;
                                                            long var114 = var38[1] & b<"t">(10620, 217023907311332883L ^ var31);
                                                            short var132 = 27762;
                                                            long var10005 = 3895543647622371535L ^ var31;
                                                            long var92 = var91 | var114 << 48;
                                                            long var115 = var38[2] & b<"t">(10620, 217023907311332883L ^ var31);
                                                            short var133 = 25075;
                                                            var10005 = 7542531660627875161L ^ var31;
                                                            long var93 = var92 | var115 << 40;
                                                            long var116 = var38[3] & b<"t">(10620, 217023907311332883L ^ var31);
                                                            short var134 = 2238;
                                                            var10005 = 7731125305414843422L ^ var31;
                                                            long var94 = var93
                                                               | var116 << 32
                                                               | (var38[4] & b<"t">(10620, 217023907311332883L ^ var31))
                                                                  << a<"e">(17554, 4602838824157622298L ^ var31);
                                                            long var117 = var38[5] & b<"t">(10620, 217023907311332883L ^ var31);
                                                            short var135 = 10023;
                                                            var10005 = 367127929009525637L ^ var31;
                                                            long var95 = var94 | var117 << 16;
                                                            short var136 = 27194;
                                                            var10005 = 5994259033225502345L ^ var31;
                                                            long var118 = var38[6] & b<"t">(10620, 217023907311332883L ^ var31);
                                                            short var137 = 897;
                                                            var10005 = 8385628187598255917L ^ var31;
                                                            long var96 = var95 | var118 << 8;
                                                            short var138 = 23645;
                                                            var10005 = 3036269935368349919L ^ var31;
                                                            long var97 = var96 | var38[7] & b<"t">(10620, 217023907311332883L ^ var31);
                                                            byte var119 = -1;

                                                            while (true) {
                                                               var128 = var97 ^ var45;
                                                               switch (var119) {
                                                                  case 0:
                                                                     var61[var73] = var128;
                                                                     if (var34 >= var37) {
                                                                        dma = new int[]{(int)var33[0], (int)var33[2], (int)var33[1], (int)var33[3]};
                                                                        return;
                                                                     }
                                                                     break;
                                                                  default:
                                                                     var61[var73] = var128;
                                                                     if (var34 < var37) {
                                                                        continue label62;
                                                                     }

                                                                     var37 = (var36 = var22[3]).length();
                                                                     var34 = 0;
                                                               }

                                                               byte var77 = var34;
                                                               var34 += 8;
                                                               var38 = var36.substring(var77, var34).getBytes(var22[0]);
                                                               var61 = var33;
                                                               var73 = var35++;
                                                               long var99 = var38[0] & b<"t">(10620, 217023907311332883L ^ var31);
                                                               short var121 = 6355;
                                                               var128 = 3226950883741428848L ^ var31;
                                                               long var100 = var99 << 56;
                                                               long var122 = var38[1] & b<"t">(10620, 217023907311332883L ^ var31);
                                                               short var142 = 12944;
                                                               var10005 = 7661602709894907434L ^ var31;
                                                               long var101 = var100 | var122 << 48;
                                                               long var123 = var38[2] & b<"t">(10620, 217023907311332883L ^ var31);
                                                               short var143 = 10249;
                                                               var10005 = 788412507085823144L ^ var31;
                                                               long var102 = var101 | var123 << 40;
                                                               long var124 = var38[3] & b<"t">(10620, 217023907311332883L ^ var31);
                                                               short var144 = 2238;
                                                               var10005 = 7731125305414843422L ^ var31;
                                                               long var103 = var102 | var124 << 32;
                                                               long var125 = var38[4] & b<"t">(10620, 217023907311332883L ^ var31);
                                                               short var145 = 32355;
                                                               var10005 = 5880743607558015686L ^ var31;
                                                               long var104 = var103 | var125 << 24;
                                                               long var126 = var38[5] & b<"t">(10620, 217023907311332883L ^ var31);
                                                               short var146 = 10023;
                                                               var10005 = 367127929009525637L ^ var31;
                                                               long var105 = var104 | var126 << 16;
                                                               short var147 = 27194;
                                                               var10005 = 5994259033225502345L ^ var31;
                                                               long var127 = var38[6] & b<"t">(10620, 217023907311332883L ^ var31);
                                                               short var148 = 897;
                                                               var10005 = 8385628187598255917L ^ var31;
                                                               long var106 = var105 | var127 << 8;
                                                               short var149 = 23645;
                                                               var10005 = 3036269935368349919L ^ var31;
                                                               var97 = var106 | var38[7] & b<"t">(10620, 217023907311332883L ^ var31);
                                                               var119 = 0;
                                                            }
                                                         }
                                                      }

                                                      var40 = var41.charAt(var39);
                                                   }
                                                }
                                                break;
                                             default:
                                                var58[var68] = var128;
                                                if (var2 < var5) {
                                                   continue label78;
                                                }

                                                var4 = "µÿ\u009d\u0015*¿\u009akÌñÜõÛÔÙÈ";
                                                var5 = "µÿ\u009d\u0015*¿\u009akÌñÜõÛÔÙÈ".length();
                                                var2 = 0;
                                          }

                                          byte var70 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var70, var2).getBytes("ISO-8859-1");
                                          var58 = var6;
                                          var68 = var3++;
                                          var86 = (var7[0] & 255L) << 56
                                             | (var7[1] & 255L) << 48
                                             | (var7[2] & 255L) << 40
                                             | (var7[3] & 255L) << 32
                                             | (var7[4] & 255L) << 24
                                             | (var7[5] & 255L) << 16
                                             | (var7[6] & 255L) << 8
                                             | var7[7] & 255L;
                                          var111 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var56[var10001] = var128;
                                 if (var13 < var16) {
                                    continue label94;
                                 }

                                 var15 = "'1Õ\u0017~\u0002y\u0013\u000eøÃi~ê4Ò";
                                 var16 = "'1Õ\u0017~\u0002y\u0013\u000eøÃi~ê4Ò".length();
                                 var13 = 0;
                           }

                           byte var67 = var13;
                           var13 += 8;
                           var18 = var15.substring(var67, var13).getBytes("ISO-8859-1");
                           var56 = var17;
                           var10001 = var14++;
                           var83 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var108 = 0;
                        }
                     }
                  }

                  var26 = var27.charAt(var50);
                  break;
               default:
                  var22[var28++] = var79;
                  if ((var50 += var26) < var29) {
                     var26 = var27.charAt(var50);
                     continue label112;
                  }

                  var27 = "%OOTV§ðÀ#\u008b\u0090Üv7Ls3\u0096\fÈ\u001c«I\rë/\u0006¤\u007fOXé \u0001ê\u0088S?2\u0089J½\u0015=ÆñrB2\u008e\u0001¢R$nJ*\u0080ÈÁ3A\u008fà>";
                  var29 = "%OOTV§ðÀ#\u008b\u0090Üv7Ls3\u0096\fÈ\u001c«I\rë/\u0006¤\u007fOXé \u0001ê\u0088S?2\u0089J½\u0015=ÆñrB2\u008e\u0001¢R$nJ*\u0080ÈÁ3A\u008fà>"
                     .length();
                  var26 = ' ';
                  var50 = -1;
            }

            var53 = var27.substring(++var50, var50 + var26);
            var10001 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      long var1 = b ^ 534731842436L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 22383;
         long var10005 = 5710885892752915179L ^ var1;
         var10000[0] = (char)(var10003 ^ 'M');
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 114093409991780L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 23645;
         long var10009 = 3036201263155162637L ^ var2;
         var10001[var4] = (char)(var10005 ^ var10002 ^ switch (var4 % 7) {
            case 0 -> {
               short var15 = 16581;
               long var21 = 2091005786117911184L ^ var2;
               yield 63;
            }
            case 1 -> {
               short var14 = 9969;
               long var20 = 1340077042293298333L ^ var2;
               yield 65;
            }
            case 2 -> {
               short var13 = 31669;
               long var19 = 2910707881616148962L ^ var2;
               yield 70;
            }
            case 3 -> 2;
            case 4 -> {
               short var12 = 18684;
               long var18 = 8673559736788499099L ^ var2;
               yield 14;
            }
            case 5 -> {
               short var11 = 7754;
               long var17 = 8418078697068719155L ^ var2;
               yield 108;
            }
            default -> {
               short var10007 = 5373;
               long var16 = 7598722919605626512L ^ var2;
               yield 77;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18871;
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
            throw new RuntimeException("cc/astralis/ebf", var14);
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
         throw new RuntimeException("cc/astralis/ebf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14972;
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
            throw new RuntimeException("cc/astralis/ebf", var14);
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
         throw new RuntimeException("cc/astralis/ebf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
