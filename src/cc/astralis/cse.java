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

public class cse extends brc {
   private String hcn;
   private static cdr[] dga;
   private static final String[] b;
   private static final long c = 82349651030575L;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public cse() {
      super(4);
   }

   public cse(String message) {
      super(4);
      a.hcn = a;
   }

   @Override
   public void etg(JsonObject jsonObject) {
      a.cps(a);
      a.hcn = a.get(b[3]).getAsString();
   }

   @Override
   public String cql() {
      JsonObject a = a.fdo();
      String[] var2 = b;
      a.dqb(a, var2[0], a.hcn);
      return fz.dvr(a.toString(), cni.fsi(var2[1]), cni.fsi(var2[2]));
   }

   public String bgn() {
      return a.hcn;
   }

   public static void bpl(cdr[] var0) {
      dga = var0;
   }

   public static cdr[] eww() {
      return dga;
   }

   static {
      long var20 = c ^ 126164080739301L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[2];
      int var17 = 0;
      String var16 = "\u000fn\u0005¾\u008d\u0090×\u008cM~\u0014=ÒKÈr\u00940\u0091õ<=cø,ª\u009dmóÍ\u00950ÂÁ=äíj\b\u00945\u0092õ\u000e²3\u000fààj»´\u0019î\u0093ÒpK\u001537CÝýlòÁÓFö·:\n_S.@õ¯\u0095¼È(\u0017É Æ0& \u00adrÄ#\u008bF$heM-:k\u0015\u001f\bÈ6Z\u001bÉsÓkàY\u0096µ\u0001ßÜ\u001c\u001a¤7,ÝÑ\u0002Ãù\u00adjîhUVlÞÆ\u00adÄWà¸ÛÄ¨|\u0084;«\u001aZ\u0007Ù\u0005ÈìÁ\u0093\u0019\n'\u0010ã\u0097\u0095E";
      int var18 = "\u000fn\u0005¾\u008d\u0090×\u008cM~\u0014=ÒKÈr\u00940\u0091õ<=cø,ª\u009dmóÍ\u00950ÂÁ=äíj\b\u00945\u0092õ\u000e²3\u000fààj»´\u0019î\u0093ÒpK\u001537CÝýlòÁÓFö·:\n_S.@õ¯\u0095¼È(\u0017É Æ0& \u00adrÄ#\u008bF$heM-:k\u0015\u001f\bÈ6Z\u001bÉsÓkàY\u0096µ\u0001ßÜ\u001c\u001a¤7,ÝÑ\u0002Ãù\u00adjîhUVlÞÆ\u00adÄWà¸ÛÄ¨|\u0084;«\u001aZ\u0007Ù\u0005ÈìÁ\u0093\u0019\n'\u0010ã\u0097\u0095E"
         .length();
      char var15 = '8';
      int var14 = -1;

      while (true) {
         byte[] var19 = var12.doFinal(var16.substring(++var14, var14 + var15).getBytes("ISO-8859-1"));
         String var41 = b(var19).intern();
         int var10001 = -1;
         var11[var17++] = var41;
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
            long[] var6 = new long[13];
            int var3 = 0;
            String var4 = "*Úû:dîæ·\u0007cms\u001e\u008c÷R\u009eaÜ]|ÓrðÀñh}aùÆ¢\u0006H¡êx\u0004B\u009eÙ\u0017\u0015ß#)\u009c©\u0099^£F G\u008d=ThXdw*F¬,eT-SCa\u0080äC¯\u009b«ã\u0080É\u009emIÜ,M\u0089\u000b";
            int var5 = "*Úû:dîæ·\u0007cms\u001e\u008c÷R\u009eaÜ]|ÓrðÀñh}aùÆ¢\u0006H¡êx\u0004B\u009eÙ\u0017\u0015ß#)\u009c©\u0099^£F G\u008d=ThXdw*F¬,eT-SCa\u0080äC¯\u009b«ã\u0080É\u009emIÜ,M\u0089\u000b"
               .length();
            byte var2 = 0;

            label54:
            while (true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var33 = var6;
               var10001 = var3++;
               long var44 = (var7[0] & 255L) << 56
                  | (var7[1] & 255L) << 48
                  | (var7[2] & 255L) << 40
                  | (var7[3] & 255L) << 32
                  | (var7[4] & 255L) << 24
                  | (var7[5] & 255L) << 16
                  | (var7[6] & 255L) << 8
                  | var7[7] & 255L;
               byte var50 = -1;

               while (true) {
                  long var8 = var44;
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
                  long var52 = (var10[0] & 255L) << 56
                     | (var10[1] & 255L) << 48
                     | (var10[2] & 255L) << 40
                     | (var10[3] & 255L) << 32
                     | (var10[4] & 255L) << 24
                     | (var10[5] & 255L) << 16
                     | (var10[6] & 255L) << 8
                     | var10[7] & 255L;
                  switch (var50) {
                     case 0:
                        var33[var10001] = var52;
                        if (var2 >= var5) {
                           g = var6;
                           h = new Integer[13];
                           String[] var27 = new String[4];
                           int var25 = 0;
                           String var24;
                           int var26 = (var24 = var11[0]).length();
                           int var23 = a<"l">(14329, 7332260207066383912L ^ var20);
                           bpl(null);
                           int var31 = -1;

                           label44:
                           while (true) {
                              int var34 = a<"l">(1688, 7350101694644729676L ^ var20);
                              String var40 = var24.substring(++var31, var31 + var23);
                              byte var46 = -1;

                              while (true) {
                                 String var35 = b(var34, b(var40));
                                 switch (var46) {
                                    case 0:
                                       var27[var25++] = var35;
                                       if ((var31 += var23) >= var26) {
                                          b = var27;
                                          return;
                                       }

                                       var23 = var24.charAt(var31);
                                       break;
                                    default:
                                       var27[var25++] = var35;
                                       if ((var31 += var23) < var26) {
                                          var23 = var24.charAt(var31);
                                          continue label44;
                                       }

                                       var26 = (var24 = var11[1]).length();
                                       var23 = a<"l">(3899, 7270124820467302125L ^ var20);
                                       var31 = -1;
                                 }

                                 var34 = a<"l">(7944, 4124300716344323802L ^ var20);
                                 var40 = var24.substring(++var31, var31 + var23);
                                 var46 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var33[var10001] = var52;
                        if (var2 < var5) {
                           continue label54;
                        }

                        var4 = "\"t»Ù\u0000y\u009f\u0003Î\u0093H÷s\u008e«\u000f";
                        var5 = "\"t»Ù\u0000y\u009f\u0003Î\u0093H÷s\u008e«\u000f".length();
                        var2 = 0;
                  }

                  byte var39 = var2;
                  var2 += 8;
                  var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
                  var33 = var6;
                  var10001 = var3++;
                  var44 = (var7[0] & 255L) << 56
                     | (var7[1] & 255L) << 48
                     | (var7[2] & 255L) << 40
                     | (var7[3] & 255L) << 32
                     | (var7[4] & 255L) << 24
                     | (var7[5] & 255L) << 16
                     | (var7[6] & 255L) << 8
                     | var7[7] & 255L;
                  var50 = 0;
               }
            }
         }

         var15 = var16.charAt(var14);
      }
   }

   private static char[] b(String var0) {
      long var1 = c ^ 70418497216535L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ a<"l">(21775, 395899884245911342L ^ var1));
      }

      return var10000;
   }

   private static String b(int var0, char[] var1) {
      long var2 = c ^ 17961787531683L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         var10001[var4] = (char)(var10001[var4] ^ var10002 ^ switch (var4 % a<"l">(3062, 7973988338578282607L ^ var2)) {
            case 0 -> a<"l">(21233, 4990986430394499431L ^ var2);
            case 1 -> a<"l">(1558, 4475765059565999500L ^ var2);
            case 2 -> a<"l">(29018, 2558166148779221697L ^ var2);
            case 3 -> a<"l">(21202, 4541048841812771151L ^ var2);
            case 4 -> a<"l">(4978, 5233966716541583585L ^ var2);
            case 5 -> a<"l">(10794, 4068480857362790843L ^ var2);
            default -> a<"l">(342, 6189940491263496910L ^ var2);
         });
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29;
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
            throw new RuntimeException("cc/astralis/cse", var14);
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
         throw new RuntimeException("cc/astralis/cse" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
