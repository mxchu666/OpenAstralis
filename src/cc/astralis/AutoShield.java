package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_239;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_239.class_240;

public class AutoShield extends guu {
   private int ghw;
   private final gbp eps;
   private final gbp dwd;
   private final gbp ald;
   private static final long a = 61507978480279L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long p;

   public AutoShield() {
      long a = AutoShield.a ^ 68112702316805L;
      super(bfm.PLAYER);
      a.ghw = -1;
      short var10003 = 1364;
      long var10004 = 8701468209688988056L ^ a;
      a.eps = new gbp("Counter Shield with Axe", true);
      var10003 = 29570;
      var10004 = 3882559383405870924L ^ a;
      a.dwd = new gbp("Only While Sneaking", false);
      var10003 = 4415;
      var10004 = 5141264999096180210L ^ a;
      a.ald = new gbp("Switch Back", true);
      a.bfi(new ffn[]{a.eps, a.dwd, a.ald});
   }

   @gdz
   public void ddj(fxx event) {
      int[] ax;
      int var12;
      label218: {
         label222: {
            long axx = AutoShield.a ^ 107444289336334L;
            int[] var10000 = dar.abu();
            class_239 axxx = chi.field_1765;
            ax = var10000;
            var12 = axxx instanceof class_3965;
            if (ax != null) {
               if (var12 != 0) {
                  class_3965 axxxx = (class_3965)axxx;
                  var12 = chi.field_1687.method_8320(axxxx.method_17777()).method_26215();
                  if (ax != null) {
                     if (var12 != 0) {
                        return;
                     }

                     var12 = a.dwd.dnp();
                  }

                  label182:
                  if (ax != null) {
                     if (var12 != 0) {
                        var12 = chi.field_1724.method_5715();
                        if (ax == null) {
                           break label182;
                        }

                        if (var12 == 0) {
                           return;
                        }
                     }

                     var12 = chi.field_1690.field_1886.method_1434();
                  }

                  if (ax != null) {
                     if (var12 != 0) {
                        var12 = a.ghw;
                        if (ax == null) {
                           break label218;
                        }

                        if (a.ghw != -1) {
                           break label222;
                        }

                        a.ghw = chi.field_1724.method_31548().method_67532();
                        bav.any(axxxx.method_17777());
                        if (ax != null) {
                           break label222;
                        }
                     }

                     var12 = a.ghw;
                  }

                  if (ax == null) {
                     break label218;
                  }

                  if (var12 == -1) {
                     break label222;
                  }

                  var12 = a.ald.dnp();
                  if (ax == null) {
                     break label218;
                  }

                  if (var12 == 0) {
                     break label222;
                  }

                  a.czn();
                  if (ax != null) {
                     break label222;
                  }
               }

               var12 = a.ghw;
            }

            if (ax == null) {
               break label218;
            }

            if (var12 != -1) {
               var12 = chi.field_1690.field_1886.method_1434();
               if (ax == null) {
                  break label218;
               }

               if (var12 == 0) {
                  var12 = a.ald.dnp();
                  if (ax == null) {
                     break label218;
                  }

                  if (var12 != 0) {
                     a.czn();
                  }
               }
            }
         }

         var12 = a.eps.dnp();
      }

      if (var12 != 0) {
         class_239 var13 = chi.field_1765;
         if (ax != null) {
            if (chi.field_1765 == null) {
               return;
            }

            var13 = chi.field_1765;
         }

         if (ax != null) {
            if (var13.method_17783() != class_240.field_1331) {
               return;
            }

            var13 = chi.field_1765;
         }

         class_239 axxxxx = var13;
         class_239 var14 = axxxxx;
         if (ax != null) {
            if (!(axxxxx instanceof class_3966)) {
               return;
            }

            var14 = axxxxx;
         }

         class_3966 axxxxxx = (class_3966)var14;
         class_1297 var10 = axxxxxx.method_17782();
         class_1297 var15 = var10;
         if (ax != null) {
            if (!(var10 instanceof class_1657)) {
               return;
            }

            var15 = var10;
         }

         class_1657 axxxxxxx = (class_1657)var15;
         var12 = axxxxxxx.method_6115();
         if (ax != null) {
            if (var12 == 0) {
               return;
            }

            var12 = axxxxxxx.method_6030().method_31574(class_1802.field_8255);
         }

         if (ax != null) {
            if (var12 == 0) {
               return;
            }

            var12 = ffm(axxxxxxxx -> axxxxxxxx.method_7909() instanceof class_1743);
         }

         label227: {
            a = var12;
            var12 = a;
            int var10001 = -1;
            if (ax != null) {
               if (a == -1) {
                  return;
               }

               var18 = chi.field_1724.method_31548();
               if (ax == null) {
                  break label227;
               }

               var12 = var18.method_67532();
               var10001 = a;
            }

            if (var12 == var10001) {
               return;
            }

            a.ghw = chi.field_1724.method_31548().method_67532();
            var18 = chi.field_1724.method_31548();
         }

         var18.method_61496(a);
      }
   }

   private static int ffm(Predicate<class_1799> a) {
      long ax = AutoShield.a ^ 65885716100056L;
      int[] var10000 = dar.abu();
      int axx = 0;
      int[] axxx = var10000;

      while (true) {
         if (axx < (int)p) {
            class_1799 axxxx = chi.field_1724.method_31548().method_5438(axx);
            if (axxx != null) {
               var6 = a.test(axxxx);
               if (axxx == null) {
                  break;
               }

               if (var6 != 0) {
                  return axx;
               }

               axx++;
            }

            if (axxx != null) {
               continue;
            }
         }

         var6 = -1;
         break;
      }

      return var6;
   }

   private void czn() {
      chi.field_1724.method_31548().method_61496(a.ghw);
      a.ghw = -1;
   }

   static {
      long var5 = a ^ 546722335554L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[3];
      int var12 = 0;
      String var11 = "èk®½\u0000²\u0093\u0080a;|\u0002ì#\u009bÀPV¢\u0093Ä^h¡\u0001ò.kM¥q\u0087Ã û\u007fnàæt §\u008d)»'Õå6Ù2U\u0017\u0096©Ì\u0012\u009d\u0015ànmM\u0019N\u0094úz=;,-\u0091 qÍý\u0094m\u009cr7\u001f7x\u0016/§Ô!J{f«£¼È\fþ±¤O\u0095¨\u001a\u0015";
      int var13 = "èk®½\u0000²\u0093\u0080a;|\u0002ì#\u009bÀPV¢\u0093Ä^h¡\u0001ò.kM¥q\u0087Ã û\u007fnàæt §\u008d)»'Õå6Ù2U\u0017\u0096©Ì\u0012\u009d\u0015ànmM\u0019N\u0094úz=;,-\u0091 qÍý\u0094m\u009cr7\u001f7x\u0016/§Ô!J{f«£¼È\fþ±¤O\u0095¨\u001a\u0015"
         .length();
      char var10 = '(';
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var20 = d(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var20;
         if ((var9 += var10) >= var13) {
            g = var14;
            h = new String[3];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = 7498619139903571283L;
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
            long var23 = (var4[0] & 255L) << 56
               | (var4[1] & 255L) << 48
               | (var4[2] & 255L) << 40
               | (var4[3] & 255L) << 32
               | (var4[4] & 255L) << 24
               | (var4[5] & 255L) << 16
               | (var4[6] & 255L) << 8
               | var4[7] & 255L;
            var10001 = -1;
            p = var23;
            return;
         }

         var10 = var11.charAt(var9);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10078;
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
            throw new RuntimeException("cc/astralis/axo", var10);
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
         throw new RuntimeException("cc/astralis/axo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
