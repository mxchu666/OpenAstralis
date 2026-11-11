package cc.astralis;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dfg extends brc {
   private String bwv;
   private static String dlw;
   private static final String[] b;
   private static final long c = 91558447581817L;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public dfg() {
      long a = c ^ 113410352141651L;
      super(a<"y">(19390, 4359463895358576808L ^ a));
   }

   public dfg(String message) {
      long ax = c ^ 123179699645242L;
      short var10001 = 937;
      long var10002 = 1458463832947437276L ^ ax;
      super(13);
      a.bwv = a;
   }

   @Override
   public void etg(JsonObject jsonObject) {
      a.cps(a);
      a.bwv = a.get(b[3]).getAsString();
   }

   @Override
   public String cql() {
      JsonObject a = a.fdo();
      String[] var2 = b;
      a.dqb(a, var2[1], a.bwv);
      return fz.dvr(a.toString(), cni.fsi(var2[0]), cni.fsi(var2[2]));
   }

   public String gnq() {
      return a.bwv;
   }

   public static void abv(String var0) {
      dlw = var0;
   }

   public static String gmu() {
      return dlw;
   }

   static {
      long var20 = c ^ 111708046419864L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[3];
      int var17 = 0;
      String var16 = "óMÉY|C\nì\u001a¢¤Ëk\u0001Y¯\u008fOº\u009dól¿éw\"¢K<Lû\u0010ú\u0094\u000e\u0088\u0012¼`\\«l°\\Ê\u007f¹h\u008do\u008cb\u0010áGnN\u008eRûÒ\u0080\bÛ@PÄîÉt5Ê»\u0093´>¤tAl\u008b\u0003N\u0092\u008b®.Ã54ÁVoX\fÖ4Jø³|'úù¾»P\n°\u0015ô\u0084\bG²»\u008cÛþö\u009d8¾)Vä±\u001e®F¨.B6\u009d\u0017\u001c\u00ad\u001d\u0094¤\u00146\u0090\u001cz\u0017`j\u0011Pb\u0094W'\u007f\u0091\u0092Gæ&nãöÑ\u009fª:øR#²\u0085\u0000 kì=";
      int var18 = "óMÉY|C\nì\u001a¢¤Ëk\u0001Y¯\u008fOº\u009dól¿éw\"¢K<Lû\u0010ú\u0094\u000e\u0088\u0012¼`\\«l°\\Ê\u007f¹h\u008do\u008cb\u0010áGnN\u008eRûÒ\u0080\bÛ@PÄîÉt5Ê»\u0093´>¤tAl\u008b\u0003N\u0092\u008b®.Ã54ÁVoX\fÖ4Jø³|'úù¾»P\n°\u0015ô\u0084\bG²»\u008cÛþö\u009d8¾)Vä±\u001e®F¨.B6\u009d\u0017\u001c\u00ad\u001d\u0094¤\u00146\u0090\u001cz\u0017`j\u0011Pb\u0094W'\u007f\u0091\u0092Gæ&nãöÑ\u009fª:øR#²\u0085\u0000 kì="
         .length();
      char var15 = 'p';
      int var14 = -1;

      while (true) {
         byte[] var19 = var12.doFinal(var16.substring(++var14, var14 + var15).getBytes("ISO-8859-1"));
         String var49 = b(var19).intern();
         int var10001 = -1;
         var11[var17++] = var49;
         if ((var14 += var15) >= var18) {
            i = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[15];
            int var3 = 0;
            String var4 = "®â\u0000O8z#d9]L\u0087#øýÙ+6û×øSaÐðð+àÿ\u0014\u000bj\u0002;j\u0090Nlj\u0097z8ßìÜwg\u0083±üÁ\u0016Ix¢aÎ\u0083j\u0015\u0089\u007fâ6ÆöBj]Î\u008aña\u008b¬\u0019i\u0095q# n©\u001a\u000b\u0087y\u001cSiNvçÌ\u0099\u0091É(óÊ\\E$6";
            int var5 = "®â\u0000O8z#d9]L\u0087#øýÙ+6û×øSaÐðð+àÿ\u0014\u000bj\u0002;j\u0090Nlj\u0097z8ßìÜwg\u0083±üÁ\u0016Ix¢aÎ\u0083j\u0015\u0089\u007fâ6ÆöBj]Î\u008aña\u008b¬\u0019i\u0095q# n©\u001a\u000b\u0087y\u001cSiNvçÌ\u0099\u0091É(óÊ\\E$6"
               .length();
            byte var2 = 0;

            label54:
            while (true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var33 = var6;
               var10001 = var3++;
               long var52 = (var7[0] & 255L) << 56
                  | (var7[1] & 255L) << 48
                  | (var7[2] & 255L) << 40
                  | (var7[3] & 255L) << 32
                  | (var7[4] & 255L) << 24
                  | (var7[5] & 255L) << 16
                  | (var7[6] & 255L) << 8
                  | var7[7] & 255L;
               byte var59 = -1;

               while (true) {
                  long var8 = var52;
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
                  long var61 = (var10[0] & 255L) << 56
                     | (var10[1] & 255L) << 48
                     | (var10[2] & 255L) << 40
                     | (var10[3] & 255L) << 32
                     | (var10[4] & 255L) << 24
                     | (var10[5] & 255L) << 16
                     | (var10[6] & 255L) << 8
                     | var10[7] & 255L;
                  switch (var59) {
                     case 0:
                        var33[var10001] = var61;
                        if (var2 >= var5) {
                           g = var6;
                           h = new Integer[15];
                           String[] var27 = new String[4];
                           int var25 = 0;
                           String var24;
                           int var26 = (var24 = var11[2]).length();
                           String var34 = var11[1];
                           short var44 = 28549;
                           long var54 = 7447582599453281879L ^ var20;
                           char var23 = ',';
                           abv(var34);
                           int var31 = -1;

                           label44:
                           while (true) {
                              short var35 = 14012;
                              long var45 = 3113170231752054630L ^ var20;
                              byte var36 = 89;
                              String var46 = var24.substring(++var31, var31 + var23);
                              byte var55 = -1;

                              while (true) {
                                 String var37 = b(var36, b(var46));
                                 switch (var55) {
                                    case 0:
                                       var27[var25++] = var37;
                                       if ((var31 += var23) >= var26) {
                                          b = var27;
                                          return;
                                       }

                                       var23 = var24.charAt(var31);
                                       break;
                                    default:
                                       var27[var25++] = var37;
                                       if ((var31 += var23) < var26) {
                                          var23 = var24.charAt(var31);
                                          continue label44;
                                       }

                                       var26 = (var24 = var11[0]).length();
                                       short var38 = 3889;
                                       long var47 = 4756830132088303335L ^ var20;
                                       var23 = '`';
                                       var31 = -1;
                                 }

                                 short var39 = 24555;
                                 long var48 = 6378485113450511935L ^ var20;
                                 var36 = 52;
                                 var46 = var24.substring(++var31, var31 + var23);
                                 var55 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var33[var10001] = var61;
                        if (var2 < var5) {
                           continue label54;
                        }

                        var4 = "å\rãà4Ð<QÀ©\u009eyUêYû";
                        var5 = "å\rãà4Ð<QÀ©\u009eyUêYû".length();
                        var2 = 0;
                  }

                  byte var43 = var2;
                  var2 += 8;
                  var7 = var4.substring(var43, var2).getBytes("ISO-8859-1");
                  var33 = var6;
                  var10001 = var3++;
                  var52 = (var7[0] & 255L) << 56
                     | (var7[1] & 255L) << 48
                     | (var7[2] & 255L) << 40
                     | (var7[3] & 255L) << 32
                     | (var7[4] & 255L) << 24
                     | (var7[5] & 255L) << 16
                     | (var7[6] & 255L) << 8
                     | var7[7] & 255L;
                  var59 = 0;
               }
            }
         }

         var15 = var16.charAt(var14);
      }
   }

   private static char[] b(String var0) {
      long var1 = c ^ 137422171975523L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ a<"y">(7688, 1922831802259912493L ^ var1));
      }

      return var10000;
   }

   private static String b(int var0, char[] var1) {
      long var2 = c ^ 16528230084704L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 26012;
         long var10009 = 299463221591118781L ^ var2;
         byte var10;
         switch (var4 % 7) {
            case 0:
               var10 = 488;
               long var23 = 1740463656303425475L ^ var2;
               var10 = 116;
               break;
            case 1:
               var10 = 2039;
               long var22 = 2645867319613977047L ^ var2;
               var10 = 108;
               break;
            case 2:
               var10 = 10272;
               long var21 = 9028971946286734855L ^ var2;
               var10 = 33;
               break;
            case 3:
               var10 = 29851;
               long var20 = 2899429517746307768L ^ var2;
               var10 = 24;
               break;
            case 4:
               var10 = 23253;
               long var19 = 657252635843800316L ^ var2;
               var10 = 54;
               break;
            case 5:
               var10 = 18614;
               long var18 = 5924115656563932827L ^ var2;
               var10 = 87;
               break;
            default:
               var10 = 27216;
               long var17 = 4468014430268497016L ^ var2;
               var10 = 16;
         }

         var10001[var4] = (char)(var10005 ^ var10002 ^ var10);
      }

      return new String(var10001).intern();
   }

   private static String b(byte[] var0) {
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3122;
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
            throw new RuntimeException("cc/astralis/dfg", var14);
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
         throw new RuntimeException("cc/astralis/dfg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
