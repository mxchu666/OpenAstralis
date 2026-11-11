package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.math.BigInteger;
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

public class asz {
   private static final BigInteger auv;
   private static final BigInteger bso;
   private static final BigInteger dap;
   private BigInteger gvq;
   private final BigInteger drt;
   private final BigInteger eqm;
   private static boolean ghu;
   private static final String[] a;
   private static final long b = 61286216124813L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;
   private static final long[] f;
   private static final Long[] g;
   private static final Map h;

   public asz(byte[] key) {
      long ax = b ^ 21588066910907L;
      long axx = b<"v">(19031, 1586365581393188221L ^ ax);
      int[] var10000 = dar.abu();
      super();
      int[] axxx = var10000;
      byte[] var9 = a;
      if (axxx != null) {
         int var10 = a.length;
         short var10001 = 2531;
         long var10002 = 4922280111985099102L ^ ax;
         if (var10 != 32) {
            throw new IllegalArgumentException(asz.a[2]);
         }

         short var12 = 30439;
         long var10003 = 8656253869328727633L ^ ax;
         var9 = Arrays.copyOfRange(a, 0, 16);
      }

      ByteBuffer axxxx = ByteBuffer.wrap(var9).order(ByteOrder.LITTLE_ENDIAN);
      a.drt = new BigInteger(1, axxxx.array()).and(bso);
      short var11 = 30439;
      long var13 = 8656253869328727633L ^ ax;
      short var14 = 2531;
      long var15 = 4922280111985099102L ^ ax;
      ByteBuffer axxxxx = ByteBuffer.wrap(Arrays.copyOfRange(a, 16, 32)).order(ByteOrder.LITTLE_ENDIAN);
      a.eqm = new BigInteger(1, axxxxx.array());
      a.gvq = BigInteger.ZERO;
   }

   public void ajy(byte[] data) {
      long ax = b ^ 10447675165679L;
      long axx = b<"v">(32573, 6612432323455035713L ^ ax);
      cdr[] var10000 = fz.dtf();
      byte axxx = 0;
      cdr[] axxxx = var10000;

      while (axxx < a.length) {
         short var10003 = 7804;
         long var10004 = 3470437977959980945L ^ ax;
         byte[] axxxxx = Arrays.copyOfRange(a, axxx, Math.min(axxx + 16, a.length));
         byte[] axxxxxx = new byte[axxxxx.length + 1];
         System.arraycopy(axxxxx, 0, axxxxxx, 0, axxxxx.length);
         axxxxxx[axxxxxx.length - 1] = 1;
         BigInteger axxxxxxx = new BigInteger(1, axxxxxx);
         a.gvq = a.gvq.add(axxxxxxx).mod(auv);
         a.gvq = a.gvq.multiply(a.drt).mod(auv);
         axxx += 16;
         if (axxxx != null) {
            break;
         }
      }
   }

   public byte[] fkw() {
      long a = b ^ 63300625246563L;
      BigInteger ax = a.gvq.add(a.eqm).and(dap);
      byte[] axx = ax.toByteArray();
      short var10000 = 30439;
      long var10001 = 8656229886261138825L ^ a;
      byte[] axxx = new byte[16];
      int var7 = axx.length;
      short var10002 = 30439;
      long var10003 = 8656229886261138825L ^ a;
      int axxxx = Math.max(0, var7 - 16);
      short var8 = 30439;
      long var10004 = 8656229886261138825L ^ a;
      System.arraycopy(axx, axxxx, axxx, 16 - (axx.length - axxxx), axx.length - axxxx);
      return axxx;
   }

   static {
      long var31 = b ^ 98588934656095L;
      Cipher var23;
      Cipher var10000 = var23 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var24 = 1; var24 < 8; var24++) {
         var10003[var24] = (byte)(var31 << var24 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var22 = new String[3];
      int var28 = 0;
      String var27 = "\t\u009a QMØ\u008aí8\u000f¥^D[*À]r\u0018\u008a\u0090Ä\u0002/Q\u0005\u0081¨\u008c'C\u0091ôµ\u0013\u0080\u009c\u008eÍrg\u0000¦NÎU\u008b\u0084(tâM\u009bÊs$jIäm¸\u0093Pvs\u009e+®Y_\u00adh7Îv\\Õ¡\u008aa²\u0099Ý¢\t\u009a[» 'ù¿\u0000¡_\u008c³uÓ£:Á\u0006j\n3°ÌjYõ\u0081Y´\u008e\\}®Y»a\u0010×Ý\t[Î\u0016\u009ac\u008fn§¡Æ\u001f\u00883";
      int var29 = "\t\u009a QMØ\u008aí8\u000f¥^D[*À]r\u0018\u008a\u0090Ä\u0002/Q\u0005\u0081¨\u008c'C\u0091ôµ\u0013\u0080\u009c\u008eÍrg\u0000¦NÎU\u008b\u0084(tâM\u009bÊs$jIäm¸\u0093Pvs\u009e+®Y_\u00adh7Îv\\Õ¡\u008aa²\u0099Ý¢\t\u009a[» 'ù¿\u0000¡_\u008c³uÓ£:Á\u0006j\n3°ÌjYõ\u0081Y´\u008e\\}®Y»a\u0010×Ý\t[Î\u0016\u009ac\u008fn§¡Æ\u001f\u00883"
         .length();
      char var26 = 'X';
      int var25 = -1;

      while (true) {
         byte[] var30 = var23.doFinal(var27.substring(++var25, var25 + var26).getBytes("ISO-8859-1"));
         String var71 = a(var30).intern();
         int var10001 = -1;
         var22[var28++] = var71;
         if ((var25 += var26) >= var29) {
            e = new HashMap(13);
            Cipher var11;
            var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var12 = 1; var12 < 8; var12++) {
               var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var17 = new long[21];
            int var14 = 0;
            String var15 = "? \u008fE4¸8TçÏ\u0095(\u0080\u00939]Ôd¶d$Kg\u00adÍ/®\u009ayê¡\f\u0013Ãh¬\u0098\fôÜ\u009a`zÌ\u0084\u0088¹\u0015³¾f=H¥\u0017}H\u0092z\u0012Þ\u0000\u009eù'@Ð\u0002*ÈÇã.Á\u0082\u000f\"B\u009bÝï\u000b´\u0084&'\u000b4A·¸\u007fï£\u009d1º \u0083\u0003Y\u0018l\u0091ªhÝ»ùp_úû\u001f\tR\u00973\u0096j\u00908\u0002¾Ì\u0088 däÿàxMæZöQ\u0085A¥Az\u0015©n{T\u0088±ä³\u0010";
            int var16 = "? \u008fE4¸8TçÏ\u0095(\u0080\u00939]Ôd¶d$Kg\u00adÍ/®\u009ayê¡\f\u0013Ãh¬\u0098\fôÜ\u009a`zÌ\u0084\u0088¹\u0015³¾f=H¥\u0017}H\u0092z\u0012Þ\u0000\u009eù'@Ð\u0002*ÈÇã.Á\u0082\u000f\"B\u009bÝï\u000b´\u0084&'\u000b4A·¸\u007fï£\u009d1º \u0083\u0003Y\u0018l\u0091ªhÝ»ùp_úû\u001f\tR\u00973\u0096j\u00908\u0002¾Ì\u0088 däÿàxMæZöQ\u0085A¥Az\u0015©n{T\u0088±ä³\u0010"
               .length();
            byte var13 = 0;

            label82:
            while (true) {
               var10001 = var13;
               var13 += 8;
               byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
               long[] var53 = var17;
               var10001 = var14++;
               long var74 = (var18[0] & 255L) << 56
                  | (var18[1] & 255L) << 48
                  | (var18[2] & 255L) << 40
                  | (var18[3] & 255L) << 32
                  | (var18[4] & 255L) << 24
                  | (var18[5] & 255L) << 16
                  | (var18[6] & 255L) << 8
                  | var18[7] & 255L;
               byte var93 = -1;

               while (true) {
                  long var19 = var74;
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
                  long var108 = (var21[0] & 255L) << 56
                     | (var21[1] & 255L) << 48
                     | (var21[2] & 255L) << 40
                     | (var21[3] & 255L) << 32
                     | (var21[4] & 255L) << 24
                     | (var21[5] & 255L) << 16
                     | (var21[6] & 255L) << 8
                     | var21[7] & 255L;
                  switch (var93) {
                     case 0:
                        var53[var10001] = var108;
                        if (var13 >= var16) {
                           c = var17;
                           d = new Integer[21];
                           h = new HashMap(13);
                           Cipher var0;
                           var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                           var10002 = SecretKeyFactory.getInstance("DES");
                           var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var1 = 1; var1 < 8; var1++) {
                              var10003[var1] = (byte)(var31 << var1 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           long[] var6 = new long[5];
                           int var3 = 0;
                           String var4 = "¹Þáü3\u0016n\u0094\u0088Í\u0014je\u0004æd-í$:)\u009cá\u0001";
                           int var5 = "¹Þáü3\u0016n\u0094\u0088Í\u0014je\u0004æd-í$:)\u009cá\u0001".length();
                           byte var2 = 0;

                           label66:
                           while (true) {
                              int var62 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var62, var2).getBytes("ISO-8859-1");
                              long[] var55 = var6;
                              var62 = var3++;
                              long var77 = (var7[0] & 255L) << 56
                                 | (var7[1] & 255L) << 48
                                 | (var7[2] & 255L) << 40
                                 | (var7[3] & 255L) << 32
                                 | (var7[4] & 255L) << 24
                                 | (var7[5] & 255L) << 16
                                 | (var7[6] & 255L) << 8
                                 | var7[7] & 255L;
                              byte var96 = -1;

                              while (true) {
                                 long var8 = var77;
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
                                 var108 = (var10[0] & 255L) << 56
                                    | (var10[1] & 255L) << 48
                                    | (var10[2] & 255L) << 40
                                    | (var10[3] & 255L) << 32
                                    | (var10[4] & 255L) << 24
                                    | (var10[5] & 255L) << 16
                                    | (var10[6] & 255L) << 8
                                    | var10[7] & 255L;
                                 switch (var96) {
                                    case 0:
                                       var55[var62] = var108;
                                       if (var2 >= var5) {
                                          f = var6;
                                          g = new Long[5];
                                          long var45 = b<"v">(27577, 5692560418511382129L ^ var31);
                                          short var56 = 19799;
                                          String[] var44 = new String[3];
                                          dhe(false);
                                          long var65 = 6597184797825783559L ^ var31;
                                          int var42 = 0;
                                          String var41;
                                          int var43 = (var41 = var22[0]).length();
                                          char var40 = ' ';
                                          int var39 = -1;

                                          while (true) {
                                             String var79 = a(5, a(var41.substring(++var39, var39 + var40)));
                                             int var66 = -1;
                                             var44[var42++] = var79;
                                             if ((var39 += var40) >= var43) {
                                                a = var44;
                                                long[] var33 = new long[2];
                                                int var35 = 0;
                                                String var36;
                                                int var37 = (var36 = var22[1]).length();
                                                byte var34 = 0;

                                                do {
                                                   var66 = var34;
                                                   var34 += 8;
                                                   byte[] var38 = var36.substring(var66, var34).getBytes(var22[2]);
                                                   var66 = var35++;
                                                   long var81 = var38[0] & b<"v">(19015, 1696037372225800072L ^ var31);
                                                   short var98 = 21427;
                                                   var108 = 5200716375625484775L ^ var31;
                                                   long var82 = var81 << 56;
                                                   long var99 = var38[1] & b<"v">(31113, 868150392992592964L ^ var31);
                                                   short var112 = 7315;
                                                   long var10005 = 6469006828304533196L ^ var31;
                                                   long var83 = var82 | var99 << 48;
                                                   long var100 = var38[2] & b<"v">(31113, 868150392992592964L ^ var31);
                                                   short var113 = 25053;
                                                   var10005 = 6557022378629299093L ^ var31;
                                                   long var84 = var83 | var100 << 40;
                                                   long var101 = var38[3] & b<"v">(31113, 868150392992592964L ^ var31);
                                                   short var114 = 2531;
                                                   var10005 = 4922216304690402234L ^ var31;
                                                   long var85 = var84 | var101 << 32;
                                                   long var102 = var38[4] & b<"v">(31113, 868150392992592964L ^ var31);
                                                   short var115 = 5289;
                                                   var10005 = 2590152715516677887L ^ var31;
                                                   long var86 = var85 | var102 << 24;
                                                   long var103 = var38[5] & b<"v">(31113, 868150392992592964L ^ var31);
                                                   short var116 = 30439;
                                                   var10005 = 8656335202430414005L ^ var31;
                                                   long var87 = var86 | var103 << 16;
                                                   long var104 = var38[a<"i">(2525, 8849092749422433175L ^ var31)] & b<"v">(31113, 868150392992592964L ^ var31);
                                                   short var117 = 21139;
                                                   var10005 = 7701616208995829952L ^ var31;
                                                   long var88 = var87 | var104 << 8;
                                                   short var118 = 13380;
                                                   var10005 = 3495828922876210718L ^ var31;
                                                   var108 = (var88 | var38[7] & b<"v">(31113, 868150392992592964L ^ var31)) ^ var45;
                                                   byte var105 = -1;
                                                   var33[var66] = var108;
                                                } while (var34 < var37);

                                                BigInteger var57 = BigInteger.valueOf(var33[0]);
                                                short var70 = 7553;
                                                long var89 = 2607686751259035615L ^ var31;
                                                auv = var57.pow(130).subtract(BigInteger.valueOf(var33[1]));
                                                String[] var51 = a;
                                                String var90 = var51[1];
                                                short var106 = 30439;
                                                var108 = 8656335202430414005L ^ var31;
                                                bso = new BigInteger(var90, 16);
                                                String var91 = var51[0];
                                                short var107 = 30439;
                                                var108 = 8656335202430414005L ^ var31;
                                                dap = new BigInteger(var91, 16);
                                                return;
                                             }

                                             var40 = var41.charAt(var39);
                                          }
                                       }
                                       break;
                                    default:
                                       var55[var62] = var108;
                                       if (var2 < var5) {
                                          continue label66;
                                       }

                                       var4 = "d\u0082A\u0082¾\u001e´£&s@£Ö¿\u0087à";
                                       var5 = "d\u0082A\u0082¾\u001e´£&s@£Ö¿\u0087à".length();
                                       var2 = 0;
                                 }

                                 byte var64 = var2;
                                 var2 += 8;
                                 var7 = var4.substring(var64, var2).getBytes("ISO-8859-1");
                                 var55 = var6;
                                 var62 = var3++;
                                 var77 = (var7[0] & 255L) << 56
                                    | (var7[1] & 255L) << 48
                                    | (var7[2] & 255L) << 40
                                    | (var7[3] & 255L) << 32
                                    | (var7[4] & 255L) << 24
                                    | (var7[5] & 255L) << 16
                                    | (var7[6] & 255L) << 8
                                    | var7[7] & 255L;
                                 var96 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var53[var10001] = var108;
                        if (var13 < var16) {
                           continue label82;
                        }

                        var15 = "¬Gô\u000e¡½\u0006É2û¹7G¢¥Û";
                        var16 = "¬Gô\u000e¡½\u0006É2û¹7G¢¥Û".length();
                        var13 = 0;
                  }

                  byte var61 = var13;
                  var13 += 8;
                  var18 = var15.substring(var61, var13).getBytes("ISO-8859-1");
                  var53 = var17;
                  var10001 = var14++;
                  var74 = (var18[0] & 255L) << 56
                     | (var18[1] & 255L) << 48
                     | (var18[2] & 255L) << 40
                     | (var18[3] & 255L) << 32
                     | (var18[4] & 255L) << 24
                     | (var18[5] & 255L) << 16
                     | (var18[6] & 255L) << 8
                     | var18[7] & 255L;
                  var93 = 0;
               }
            }
         }

         var26 = var27.charAt(var25);
      }
   }

   public static void dhe(boolean var0) {
      ghu = var0;
   }

   public static boolean gry() {
      return ghu;
   }

   public static boolean gco() {
      long var0 = b ^ 66740653203353L;
      int[] var2 = dar.abu();
      boolean var3 = gry();
      boolean var10000 = var3;
      if (var2 != null) {
         if (!var3) {
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   private static char[] a(String var0) {
      long var1 = b ^ 72129106116310L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 32675;
         long var10005 = 3436207987298880369L ^ var1;
         var10000[0] = (char)(var10003 ^ '[');
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 126502501025301L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 32711;
         long var10009 = 4736296918661772241L ^ var2;
         var10001[var4] = (char)(var10005 ^ var10002 ^ switch (var4 % 7) {
            case 0 -> {
               short var15 = 14636;
               long var21 = 7202249876222932279L ^ var2;
               yield 28;
            }
            case 1 -> {
               short var14 = 16487;
               long var20 = 941835405188533368L ^ var2;
               yield 118;
            }
            case 2 -> {
               short var13 = 31905;
               long var19 = 160100729126367394L ^ var2;
               yield 48;
            }
            case 3 -> a<"i">(18420, 8297009606200396787L ^ var2);
            case 4 -> {
               short var12 = 24477;
               long var18 = 428036643825259392L ^ var2;
               yield 47;
            }
            case 5 -> {
               short var11 = 8004;
               long var17 = 7716919041616597846L ^ var2;
               yield 93;
            }
            default -> {
               short var10007 = 543;
               long var16 = 3134224503262137886L ^ var2;
               yield 91;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 907;
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
            throw new RuntimeException("cc/astralis/asz", var14);
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
         throw new RuntimeException("cc/astralis/asz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5150;
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
            throw new RuntimeException("cc/astralis/asz", var14);
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
         throw new RuntimeException("cc/astralis/asz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
