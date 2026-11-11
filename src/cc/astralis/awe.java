package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_642;

public class awe extends hcr {
   private boolean gqw;
   private static final long a = 38699828952182L;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public awe(guu module) {
      long ax = awe.a ^ 139910953420163L;
      short var10002 = 2982;
      long var10003 = 1416685846781002457L ^ ax;
      super(a, "Watchdog");
   }

   @gdz
   public void bjn(eih event) {
      long ax;
      int[] axx;
      boolean var10;
      label139: {
         label142: {
            ax = awe.a ^ 85549911303172L;
            axx = dar.abu();
            class_310 var10000 = chi;
            if (axx != null) {
               if (chi.method_1542()) {
                  break label142;
               }

               var10000 = chi;
            }

            class_642 var8 = var10000.method_1558();
            if (axx != null) {
               if (var8 == null) {
                  break label142;
               }

               var8 = chi.method_1558();
            }

            String var9 = var8.field_3761.toLowerCase();
            short var10001 = 29529;
            long var10002 = 7275153385265453984L ^ ax;
            var10 = var9.contains("anticheat");
            if (axx == null) {
               break label139;
            }

            if (!var10) {
               var10 = 1;
               break label139;
            }
         }

         var10 = 0;
      }

      boolean axxx = (boolean)var10;
      Iterator var6 = chi.field_1724.method_31548().method_67533().iterator();

      label143: {
         label144: {
            while (true) {
               if (var6.hasNext()) {
                  class_1799 axxxx = (class_1799)var6.next();
                  if (axx == null) {
                     break;
                  }

                  if (axxxx.method_7909() == class_1802.field_8251) {
                     return;
                  }

                  if (axx != null) {
                     continue;
                  }
               }

               var10 = chi.field_1724.field_6012;
               if (axx == null) {
                  break label144;
               }

               short var16 = 17427;
               long var19 = 1629584268406820393L ^ ax;
               if (chi.field_1724.field_6012 <= 200) {
                  var10 = axxx;
                  if (axx == null) {
                     break label144;
                  }

                  if (axxx != 0) {
                     var10 = chi.field_1724.method_24828();
                     if (axx != null) {
                        if (var10 != 0) {
                           chi.field_1724.method_6043();
                           if (axx != null) {
                              return;
                           }
                        }

                        var10 = a.gqw;
                     }

                     if (axx != null) {
                        if (var10 == 0) {
                           fnb var13 = fnb.hcp();
                           var16 = 17137;
                           var19 = 1558599713513892363L ^ ax;
                           fnb var14 = var13.ael("Disabling, Please Stay Still!", gge.INFO);
                           var16 = 10376;
                           var19 = 8806097277501760179L ^ ax;
                           var14.bvw(5000).evs();
                           a.gqw = true;
                        }

                        var10 = dar.gqy().aws().diy(dqk.class).dsv();
                     }

                     if (axx != null) {
                        if (var10 != 0) {
                           dar.gqy().aws().diy(dqk.class).fga(false);
                        }

                        var10 = hjr % 2;
                     }

                     if (var10 == 0) {
                        a.dzs(a.ejv() + 0.095);
                        a.dbl(a.dba() + 0.095);
                        a.gty(360.0F);
                     }

                     chi.field_1724.method_18800(0.0, 0.0, 0.0);
                     if (axx != null) {
                        return;
                     }
                  }
               }

               a.gqw = false;
               break;
            }

            var15 = dar.gqy().aws().diy(dqk.class);
            if (axx == null) {
               break label143;
            }

            var10 = var15.dsv();
         }

         if (var10 != 0) {
            return;
         }

         var15 = dar.gqy().aws().diy(dqk.class);
      }

      var15.fga(true);
   }

   static {
      long var11 = a ^ 39972244488642L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[3];
      int var18 = 0;
      String var17 = "\u0083pß\u0000\u008eû\u0007\n»\u0083\\Ý\"\u0006bªËÃîÏ>1\u009aÈ¼ýá\u0080\u001e\u009d\u0001x \u0084\u001c\u009d\u008e\u0081#òÆ¿úÏ\u0086\u0086Ín~ñ\u000em\u0096íÊÊyS\u0088\rV0ñõk8\u0081´\u001cW(CWcmÅÍyaáÎÐ\u008eöþÉGþÀ¥Öí¦ïqËYqýw¼åÇÖþ\u008a\u0085ªå¢éN\u0097E\u0091ñÈ\u000fa.>Ú";
      int var19 = "\u0083pß\u0000\u008eû\u0007\n»\u0083\\Ý\"\u0006bªËÃîÏ>1\u009aÈ¼ýá\u0080\u001e\u009d\u0001x \u0084\u001c\u009d\u008e\u0081#òÆ¿úÏ\u0086\u0086Ín~ñ\u000em\u0096íÊÊyS\u0088\rV0ñõk8\u0081´\u001cW(CWcmÅÍyaáÎÐ\u008eöþÉGþÀ¥Öí¦ïqËYqýw¼åÇÖþ\u008a\u0085ªå¢éN\u0097E\u0091ñÈ\u000fa.>Ú"
         .length();
      char var16 = ' ';
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var27 = a(var21).intern();
         int var10001 = -1;
         var20[var18++] = var27;
         if ((var15 += var16) >= var19) {
            d = var20;
            e = new String[3];
            i = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "9\u0006cÃqÐ\u009a\u009f\u0082\u0012\u001f¿²ï8Ë";
            int var5 = "9\u0006cÃqÐ\u009a\u009f\u0082\u0012\u001f¿²ï8Ë".length();
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
               byte var31 = -1;
               var6[var10001] = var10004;
            } while (var2 < var5);

            g = var6;
            h = new Integer[2];
            return;
         }

         var16 = var17.charAt(var15);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28810;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/awe", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("cc/astralis/awe" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4680;
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
            throw new RuntimeException("cc/astralis/awe", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("cc/astralis/awe" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
