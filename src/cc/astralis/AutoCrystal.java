package cc.astralis;

import java.awt.Color;
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
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_4048;
import net.minecraft.class_4587;
import net.minecraft.class_7422;

public class AutoCrystal extends guu {
   private final bes fsf;
   private final bes abj;
   private final bes ebx;
   private final bes gmb;
   private final gbp fwk;
   private final gbp dsp;
   private class_1309 fqj;
   private final cbm ese;
   private class_7422 gqa;
   private static final long a = 16944584109118L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public AutoCrystal() {
      long a = AutoCrystal.a ^ 3050607420039L;
      super(bfm.COMBAT);
      short var10003 = 19919;
      long var10004 = 5296514707853170168L ^ a;
      a.fsf = new bes("Scout Range", 6.0F, 0.0F, 12.0F, 1.0F);
      var10003 = 15977;
      var10004 = 2541608116901881425L ^ a;
      a.abj = new bes("Min Range", 1.0F, 0.0F, 10.0F, 0.1F);
      var10003 = 27482;
      var10004 = 6065010442586420079L ^ a;
      a.ebx = new bes("Max Range", 1.0F, 0.0F, 10.0F, 0.1F);
      var10003 = 7838;
      var10004 = 6703776832139888296L ^ a;
      a.gmb = new bes("Duration", 1.0F, 0.0F, 10000.0F, 1.0F);
      var10003 = 15866;
      var10004 = 7671041104979666376L ^ a;
      a.fwk = new gbp("Ignore Teammates", false);
      var10003 = 20388;
      var10004 = 9071504607634020240L ^ a;
      a.dsp = new gbp("ESP", false);
      a.ese = new cbm();
      a.gqa = null;
      short var10001 = 30689;
      long var10002 = 4767600771092009284L ^ a;
      a.bfi(new ffn[]{a.fsf, a.abj, a.ebx, a.gmb, a.fwk, a.dsp});
   }

   private boolean hjv(class_1309 a) {
      long ax = AutoCrystal.a ^ 56100581011423L;
      int[] axx = dar.abu();
      Object var10000 = chi.field_1724;
      if (axx != null) {
         if (chi.field_1724 == null) {
            return false;
         }

         var10000 = a;
      }

      if (var10000 != null) {
         double axxx = chi.field_1724.method_18798().field_1352;
         double axxxx = chi.field_1724.method_18798().field_1350;
         double var27 = Math.sqrt(axxx * axxx + axxxx * axxxx);
         double var10001 = 0.1;
         if (axx != null) {
            if (var27 < 0.1) {
               return false;
            }

            var27 = a.method_23317();
            var10001 = chi.field_1724.method_23317();
         }

         double axxxxx = var27 - var10001;
         double axxxxxx = a.method_23321() - chi.field_1724.method_23321();
         double axxxxxxx = Math.sqrt(axxx * axxx + axxxx * axxxx);
         double axxxxxxxx = Math.sqrt(axxxxx * axxxxx + axxxxxx * axxxxxx);
         double axxxxxxxxx = axxx / axxxxxxx;
         double axxxxxxxxxx = axxxx / axxxxxxx;
         double axxxxxxxxxxx = axxxxx / axxxxxxxx;
         double axxxxxxxxxxxx = axxxxxx / axxxxxxxx;
         double axxxxxxxxxxxxx = axxxxxxxxx * axxxxxxxxxxx + axxxxxxxxxx * axxxxxxxxxxxx;
         double var29;
         int var28 = (var29 = axxxxxxxxxxxxx - 0.0) == 0.0 ? 0 : (var29 < 0.0 ? -1 : 1);
         if (axx != null) {
            var28 = var28 > 0 ? 1 : 0;
         }

         return (boolean)var28;
      } else {
         return false;
      }
   }

   @Override
   public void frg() {
      dar.gqy().ccv().gne(bhw.class).fxn();
      super.frg();
   }

   @gdz
   public void dko(fxx event) {
      bhw var13;
      label155: {
         long ax = AutoCrystal.a ^ 3836798160443L;
         float var10001 = a.gmb.dnp().floatValue();
         short var10002 = 30253;
         long var10003 = 3542806165748023968L ^ ax;
         a.efe(var10001 + "ms");
         int[] var10000 = dar.abu();
         bhw axx = dar.gqy().ccv().gne(bhw.class);
         class_1309 axxx = bav.elv(false, false, a.fwk.dnp(), true, false, a.fsf.dnp().floatValue()).getFirst();
         int[] axxxx = var10000;
         AutoCrystal var12 = a;
         if (axxxx != null) {
            if (a.ese.fsc(a.gmb.dnp().longValue())) {
               var13 = axx;
               if (axxxx == null) {
                  break label155;
               }

               if (axx.bsw()) {
                  var13 = axx;
                  break label155;
               }
            }

            var12 = a;
         }

         label160: {
            var14 = var12.fqj;
            label129:
            if (axxxx != null) {
               label141: {
                  if (var12.fqj != null) {
                     var15 = a;
                     if (axxxx == null) {
                        break label160;
                     }

                     if (!a.fqj.method_5805()) {
                        break label141;
                     }

                     var15 = a;
                     if (axxxx == null) {
                        break label160;
                     }

                     if (a.fqj.method_29504()) {
                        break label141;
                     }

                     var14 = a.fqj;
                     if (axxxx == null) {
                        break label129;
                     }

                     if (a.fqj.method_6032() <= 0.0F) {
                        break label141;
                     }
                  }

                  a.fqj = axxx;
                  var14 = a.fqj;
                  break label129;
               }

               short var20 = 27540;
               long var22 = 8628164469930630936L ^ ax;
               bpa.bez("dead");
               axx.fxn();
               a.gqa = null;
               var15 = a;
               break label160;
            }

            if (axxxx != null) {
               if (var14 == null) {
                  short var19 = 27425;
                  long var21 = 3445034840735457198L ^ ax;
                  bpa.bez("dead");
                  axx.fxn();
                  a.gqa = null;
                  return;
               }

               var14 = a.fqj;
            }

            float[] axxxxx = dgq.dxs(var14);
            AutoCrystal var16 = a;
            if (axxxx != null) {
               if (a.elz(axxxxx[0], chi.field_1724.method_36454()) > 100.0F) {
                  axx.fxn();
                  a.gqa = null;
                  return;
               }

               var16 = a;
            }

            double axxxxxx = dgq.flj(var16.fqj);
            float axxxxxxx = Math.min(a.abj.dnp().floatValue(), a.ebx.dnp().floatValue());
            float axxxxxxxx = Math.max(a.abj.dnp().floatValue(), a.ebx.dnp().floatValue());
            double var23;
            var17 = (var23 = axxxxxx - axxxxxxxx) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1);
            label118:
            if (axxxx != null) {
               if (var17 <= 0) {
                  double var24;
                  var17 = (var24 = axxxxxx - axxxxxxx) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
                  if (axxxx == null) {
                     break label118;
                  }

                  if (var17 >= 0) {
                     var17 = axx.bsw();
                     if (axxxx == null) {
                        break label118;
                     }

                     if (var17 == 0) {
                        var17 = a.hjv(a.fqj);
                        if (axxxx == null) {
                           break label118;
                        }

                        if (var17 != 0) {
                           class_7422 var18 = a.gqa;
                           if (axxxx != null) {
                              if (a.gqa == null) {
                                 a.gqa = new class_7422();
                              }

                              var18 = a.gqa;
                           }

                           var18.method_43494(chi.field_1724.method_73189());
                           axx.ckv();
                           a.ese.glr();
                        }
                     }
                  }
               }

               double var25;
               var17 = (var25 = axxxxxx - axxxxxxxx) == 0.0 ? 0 : (var25 < 0.0 ? -1 : 1);
            }

            if (var17 > 0) {
               axx.fxn();
               a.gqa = null;
            }

            return;
         }

         var15.fqj = null;
         return;
      }

      var13.fxn();
      a.gqa = null;
   }

   private float elz(float a, float a) {
      long ax = AutoCrystal.a ^ 133911492069613L;
      int[] var10000 = dar.abu();
      float axx = (a - a) % 360.0F;
      int[] axxx = var10000;
      float var10;
      int var7 = (var10 = axx - 180.0F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
      if (axxx != null) {
         if (var7 > 0) {
            return Math.abs(axx - 360.0F);
         }

         if (axxx == null) {
            return Math.abs(axx + -180.0F);
         }

         float var11;
         var7 = (var11 = axx - -180.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
      }

      return var7 >= 0 ? Math.abs(axx) : Math.abs(axx + 360.0F);
   }

   @gdz
   public void gby(bsm event) {
      long ax = AutoCrystal.a ^ 114747300612576L;
      int[] axx = dar.abu();
      AutoCrystal var10000 = a;
      if (axx != null) {
         if (a.fqj == null) {
            return;
         }

         var10000 = a;
      }

      Object var7 = var10000.gqa;
      if (axx != null) {
         if (var10000.gqa == null) {
            return;
         }

         var7 = a.dsp.dnp();
      }

      boolean var8 = (Boolean)var7;
      if (axx != null) {
         if (!var8) {
            return;
         }

         var8 = chi.field_1690.method_31044().method_31034();
      }

      if (!var8) {
         class_4048 axxx = a.fqj.method_18377(a.fqj.method_18376());
         class_238 axxxx = axxx.method_30757(a.gqa.method_60933());
         var7 = a.bus();
         class_238 var10001 = axxxx.method_1014(0.08);
         Color var10002 = dar.gqy().deo();
         short var10003 = 25983;
         long var10004 = 1589169852964595900L ^ ax;
         bqf.hjf((class_4587)var7, var10001, var10002, 150);
      }
   }

   static {
      long var11 = a ^ 43329298611326L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[9];
      int var18 = 0;
      String var17 = "\\\u0088Ð¶ekb\u0085ÀÈU:<©bÀ\u0010Ò\u001f\u009a\u009b\u0086=Ñ×@\u0085q\u0015Y\u0095#\u0019(¨ÝÔÊÁ2&\u0011¡x[\u0090\u009c\u0016ÝÕP°¬áOµûHâU`\u0014Ðc\u007fZü\u0094ÓåÓ*bh\u0010Ð\u0007Ò\u007f\u009c\u00180ÙÉ'e\u000b1ØQÑ\u0010\u0097XçÙ\u0004\u0010ãìE!\u001b=&,\u0094. ì¾Õ_EþÚµëZVÖÛ\u0004\u0082±æËÉ-tÜ\u001eoüthÒ\u009f\u0091ûN\u0018\u0012\u0089ÝíoÈ\nXò\u008fé\fD`²%\u0092~kÐ*ÒúÒ";
      int var19 = "\\\u0088Ð¶ekb\u0085ÀÈU:<©bÀ\u0010Ò\u001f\u009a\u009b\u0086=Ñ×@\u0085q\u0015Y\u0095#\u0019(¨ÝÔÊÁ2&\u0011¡x[\u0090\u009c\u0016ÝÕP°¬áOµûHâU`\u0014Ðc\u007fZü\u0094ÓåÓ*bh\u0010Ð\u0007Ò\u007f\u009c\u00180ÙÉ'e\u000b1ØQÑ\u0010\u0097XçÙ\u0004\u0010ãìE!\u001b=&,\u0094. ì¾Õ_EþÚµëZVÖÛ\u0004\u0082±æËÉ-tÜ\u001eoüthÒ\u009f\u0091ûN\u0018\u0012\u0089ÝíoÈ\nXò\u008fé\fD`²%\u0092~kÐ*ÒúÒ"
         .length();
      char var16 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = d(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     g = var20;
                     h = new String[9];
                     r = new HashMap(13);
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
                     String var4 = "\u0092ª\u001dz\tþ¥¢ß\u008ezÿs¹úi";
                     int var5 = "\u0092ª\u001dz\tþ¥¢ß\u008ezÿs¹úi".length();
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

                     p = var6;
                     q = new Integer[2];
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

                  var17 = "» ¢\u001c\u001e\u0017\u0012pHp`5¿í7µ\u0016«\u009f²[\u000e¬î R+\u0010Ý\u001ae1\u00835~v\u001aw8\u008e±e\u0096#od\u001a\u0003h\u0002mÉU-Ð©\u008e";
                  var19 = "» ¢\u001c\u001e\u0017\u0012pHp`5¿í7µ\u0016«\u009f²[\u000e¬î R+\u0010Ý\u001ae1\u00835~v\u001aw8\u008e±e\u0096#od\u001a\u0003h\u0002mÉU-Ð©\u008e"
                     .length();
                  var16 = 24;
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5769;
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
            throw new RuntimeException("cc/astralis/cuu", var10);
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
         throw new RuntimeException("cc/astralis/cuu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10268;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/cuu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
   }

   private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/cuu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
