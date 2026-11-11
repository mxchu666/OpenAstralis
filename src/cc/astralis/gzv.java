package cc.astralis;

import imgui.type.ImFloat;
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
import net.minecraft.class_746;

public class gzv extends guu {
   private final adu dzu;
   private final bes evg;
   private double egn;
   private int hjl;
   private static final long a = 64724251734711L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public gzv() {
      long a = gzv.a ^ 80977404320595L;
      super(bfm.COMBAT);
      short var10003 = 1829;
      long var10004 = 1830790340972771012L ^ a;
      short var4 = 26535;
      long var10005 = 3465249545336886853L ^ a;
      String[] var6 = new String[3];
      short var10008 = 26535;
      long var10009 = 3465249545336886853L ^ a;
      var6[0] = "Watchdog 2";
      var10008 = 7336;
      var10009 = 1908268595998584141L ^ a;
      var6[1] = "Legit";
      var10008 = 8801;
      var10009 = 1591752869445129094L ^ a;
      var6[2] = "Vanilla";
      a.dzu = new adu("Mode", "Watchdog 2", var6);
      var10003 = 12749;
      var10004 = 6075134535112966190L ^ a;
      a.evg = new bes("Critical On Ticks", 3.0F, 1.0F, 10.0F, 1.0F);
      a.egn = 0.0;
      a.hjl = 0;
      a.bfi(new ffn[]{a.dzu, a.evg.bih(() -> {
         long ax = gzv.a ^ 31193653851423L;
         short var10001 = 32325;
         long var10002 = 4665311666502492655L ^ ax;
         return a.dzu.emb("Watchdog 2");
      })});
   }

   @gdz
   public void acq(eih event) {
      int[] ax;
      ekb axx;
      int var9;
      long axxx = gzv.a ^ 120540669197222L;
      a.efe(a.dzu.dnp());
      axx = dar.gqy().aws().diy(ekb.class);
      int[] var10000 = dar.abu();
      a.bvc();
      ax = var10000;
      String var6 = a.dzu.dnp();
      byte var7 = -1;
      var9 = var6.hashCode();
      label121:
      if (ax != null) {
         switch (var9) {
            case 73298841:
               short var10001 = 1174;
               long var10002 = 7174899041585403267L ^ axxx;
               var9 = var6.equals("Legit");
               if (ax == null) {
                  break label121;
               }

               if (var9 == 0) {
                  break;
               }

               var7 = 0;
               if (ax != null) {
                  break;
               }
            case 1898048255:
               short var15 = 26535;
               long var16 = 3465289142610196144L ^ axxx;
               var9 = var6.equals("Watchdog 2");
               if (ax == null) {
                  break label121;
               }

               if (var9 != 0) {
                  var7 = 1;
               }
         }

         var9 = var7;
      }

      label126: {
         label127: {
            if (ax != null) {
               switch (var9) {
                  case 0:
                     var10 = axx;
                     if (ax == null) {
                        break label127;
                     }

                     var9 = axx.dsv();
                     break;
                  case 1:
                     break label126;
                  default:
                     return;
               }
            }

            if (var9 == 0) {
               return;
            }

            var10 = axx;
         }

         if (var10.gvw == null) {
            return;
         }

         class_746 var11 = chi.field_1724;
         if (ax != null) {
            if (!chi.field_1724.method_24828()) {
               return;
            }

            var11 = chi.field_1724;
         }

         var11.method_6043();
         if (ax != null) {
            return;
         }
      }

      ekb var12 = axx;
      if (ax != null) {
         if (!axx.dsv()) {
            return;
         }

         var12 = axx;
      }

      Object var13 = var12.gvw;
      if (ax != null) {
         if (var12.gvw == null) {
            return;
         }

         var13 = a.evg.dnp();
      }

      int axxxx = ((ImFloat)var13).intValue();
      a.hjl = (a.hjl + 1) % (axxxx + 1);
      var9 = a.hjl;
      if (ax != null) {
         if (a.hjl >= axxxx) {
            return;
         }

         double var17;
         var9 = (var17 = bav.hai() - a.egn) == 0.0 ? 0 : (var17 < 0.0 ? -1 : 1);
      }

      if (var9 == 0) {
         a.dad(false);
      }

      a.egn = bav.hai();
   }

   private void bvc() {
      long a = gzv.a ^ 194095783829L;
      int[] var10000 = dar.abu();
      class_1309 ax = dar.gqy().aws().diy(ekb.class).gvw;
      int[] axx = var10000;
      if (ax != null) {
         class_746 var5 = chi.field_1724;
         if (axx != null) {
            if (!chi.field_1724.field_6252) {
               return;
            }

            var5 = chi.field_1724;
         }

         var5.method_7277(ax);
      }
   }

   static {
      long var0 = a ^ 81239192393905L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "\u0012\u009f\u0090?ùhËµ×sÚêoÅP2\u00195\u0080P \u001aóúéÊn÷\u009e\u007f³L/ªÞ\f[¢p\u0081 Í:Ç]Äz7\u0082Rf\u0090É~Y¯o\u0086Q¼»yi.«Êª?Ë}PØX\u0010ÊUIþÔ\u009bk¸\u0014Z¹\f\u0097.M\u0090\u0010ÿCÇûÁ\u0001\u0012Y6§É6P\u000bpç\u0010Ft3q\u000fÂá¼]UÊ)ï\u0006Ôÿ";
      int var8 = "\u0012\u009f\u0090?ùhËµ×sÚêoÅP2\u00195\u0080P \u001aóúéÊn÷\u009e\u007f³L/ªÞ\f[¢p\u0081 Í:Ç]Äz7\u0082Rf\u0090É~Y¯o\u0086Q¼»yi.«Êª?Ë}PØX\u0010ÊUIþÔ\u009bk¸\u0014Z¹\f\u0097.M\u0090\u0010ÿCÇûÁ\u0001\u0012Y6§É6P\u000bpç\u0010Ft3q\u000fÂá¼]UÊ)ï\u0006Ôÿ"
         .length();
      char var5 = '(';
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
                     h = new String[7];
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

                  var6 = "û®}g{\u0082äÊ¸íUÑ®ÊïT&?ÚK\u0014\u001eoo\u0010\u009dXÁµf A\u0085¦\u0007\u009fHK.öô";
                  var8 = "û®}g{\u0082äÊ¸íUÑ®ÊïT&?ÚK\u0014\u001eoo\u0010\u009dXÁµf A\u0085¦\u0007\u009fHK.öô".length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22535;
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
            throw new RuntimeException("cc/astralis/gzv", var10);
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
         throw new RuntimeException("cc/astralis/gzv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
