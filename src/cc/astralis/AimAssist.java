package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1268;
import net.minecraft.class_1674;
import net.minecraft.class_238;

public class AimAssist extends guu {
   private final bes fsn;
   private final gbp fmo;
   private final bes cts;
   private final bes gsl;
   private final bes ceb;
   public class_1674 bvh;
   public List<class_1674> gif;
   private final cbm cuf;
   private static final long a = 44590357192287L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public AimAssist() {
      long a = AimAssist.a ^ 106561042914098L;
      super(bfm.COMBAT);
      short var10003 = 3528;
      long var10004 = 7210878921415089198L ^ a;
      a.fsn = new bes("Range", 5.0F, 1.0F, 6.0F, 0.1F);
      var10003 = 6958;
      var10004 = 721233996133452494L ^ a;
      a.fmo = new gbp("1.8 Swing Order", false);
      var10003 = 28235;
      var10004 = 6051667497571172265L ^ a;
      a.cts = new bes("Hit Cool Down", 200.0F, 0.0F, 1000.0F, 1.0F);
      var10003 = 16333;
      var10004 = 3731740550070398508L ^ a;
      a.gsl = new bes("Min Rotation Speed", 100.0F, 0.0F, 180.0F, 1.0F);
      var10003 = 2340;
      var10004 = 5366684964885747911L ^ a;
      a.ceb = new bes("Max Rotation Speed", 100.0F, 0.0F, 180.0F, 1.0F);
      a.gif = new ArrayList<>();
      a.cuf = new cbm();
      a.bfi(new ffn[]{a.fsn, a.fmo, a.cts, a.gsl, a.ceb});
   }

   @gdz
   public void dpl(fxx event) {
      long ax = AimAssist.a ^ 42189072159581L;
      a.efe(a.fsn.dnp().toString());
      int[] var10000 = dar.abu();
      a.gif = chi.field_1687
         .method_8390(class_1674.class, new class_238(chi.field_1724.method_24515()).method_1014(a.fsn.dnp().floatValue()), axx -> true)
         .stream()
         .filter(axx -> {
            long ax = AimAssist.a ^ 134402361620836L;
            return axx.method_24921() != chi.field_1724;
         })
         .sorted(Comparator.comparingDouble(axx -> chi.field_1724.method_5739(axx)))
         .collect(Collectors.toList());
      int[] axx = var10000;
      List var7 = a.gif;
      if (axx != null) {
         if (a.gif.isEmpty()) {
            a.bvh = null;
         }

         var7 = a.gif;
      }

      for (class_1674 axxx : var7) {
         label75: {
            float var10;
            int var8 = (var10 = chi.field_1724.method_5739(axxx) - a.fsn.dnp().floatValue()) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
            if (axx != null) {
               if (var8 > 0) {
                  break label75;
               }

               var8 = a.cuf.fsc(a.cts.dnp().longValue());
            }

            if (axx != null) {
               if (var8 == 0) {
                  break label75;
               }

               a.bvh = axxx;
               dqq.cms(dgq.dxs(a.bvh), a.gsl.dnp().floatValue(), a.ceb.dnp().floatValue());
               var8 = a.fmo.dnp();
            }

            label76: {
               if (axx != null) {
                  if (var8 != 0) {
                     chi.field_1724.method_6104(class_1268.field_5808);
                  }

                  chi.field_1761.method_2918(chi.field_1724, a.bvh);
                  var9 = a;
                  if (axx == null) {
                     break label76;
                  }

                  var8 = a.fmo.dnp();
               }

               if (var8 == 0) {
                  chi.field_1724.method_6104(class_1268.field_5808);
               }

               var9 = a;
            }

            var9.cuf.glr();
         }

         if (axx == null) {
            break;
         }
      }
   }

   static {
      long var0 = a ^ 49752005328982L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "®\u0093þüp\u0081çß\u0001m(XX8\u008e\u009eþä|D\u001c2\u0082*(éx\u0093ò¶\fCAË\u0000E\u001elaÿ<ÅÓ¾TÌ\n\u001fêvZ\u0089ìÙäþ\u0010í0 §¢&í& ñÅZqeÉUr`Õ^\u009b\u009aog\u0089Ý\u0015Lµlã9\u0096¯Neí:¿\\\u0096";
      int var8 = "®\u0093þüp\u0081çß\u0001m(XX8\u008e\u009eþä|D\u001c2\u0082*(éx\u0093ò¶\fCAË\u0000E\u001elaÿ<ÅÓ¾TÌ\n\u001fêvZ\u0089ìÙäþ\u0010í0 §¢&í& ñÅZqeÉUr`Õ^\u009b\u009aog\u0089Ý\u0015Lµlã9\u0096¯Neí:¿\\\u0096"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = d(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     g = var9;
                     h = new String[5];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "U\u0086i \u0086`7:\u000e¦R_\"£\u00959É§Ic\u009f\u00917ÿæ\u0006\u008c^×\u008eúñLKå\u0089àÂÎ\u000f\u0010\u000f\u001df\u0086Z\u0019\u0019ì\u0004÷\u0007³¬7<\u0016";
                  var8 = "U\u0086i \u0086`7:\u000e¦R_\"£\u00959É§Ic\u009f\u00917ÿæ\u0006\u008c^×\u008eúñLKå\u0089àÂÎ\u000f\u0010\u000f\u001df\u0086Z\u0019\u0019ì\u0004÷\u0007³¬7<\u0016"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21647;
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
            throw new RuntimeException("cc/astralis/exz", var10);
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
         throw new RuntimeException("cc/astralis/exz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
