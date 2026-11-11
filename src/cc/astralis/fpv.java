package cc.astralis;

import astralis.mixin.accessor.AccessorClientPlayerInteractionManager;
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
import net.minecraft.class_310;
import net.minecraft.class_636;

public class fpv extends guu {
   private final adu fhl;
   private final bes gay;
   private final gbp cct;
   private final bes aca;
   private boolean dii;
   private static final long a = 25423068547531L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public fpv() {
      long a = fpv.a ^ 133023791272449L;
      super(bfm.WORLD);
      short var10003 = 27297;
      long var10004 = 7748155856222243330L ^ a;
      short var6 = 17761;
      long var10005 = 2252666071476659655L ^ a;
      String[] var10 = new String[2];
      short var10008 = 16633;
      long var10009 = 5778108025322922072L ^ a;
      var10[0] = "Packet";
      var10008 = 3391;
      var10009 = 8593896371784232344L ^ a;
      var10[1] = "Timer";
      a.fhl = new adu("Mode", "Packet", var10);
      var10003 = 5443;
      var10004 = 3294362775103026663L ^ a;
      a.gay = new bes("Speed", 1.25F, 1.0F, 5.0F, 0.05F);
      var10003 = 11348;
      var10004 = 3074739062760475892L ^ a;
      a.cct = new gbp("Mining Cooldown", true);
      var10003 = 6637;
      var10004 = 190158067090143567L ^ a;
      a.aca = (bes)new bes("Cooldown", 0.0F, 0.0F, 5.0F, 1.0F).bih(a.cct::dnp);
      a.dii = false;
      a.bfi(new ffn[]{a.fhl, a.gay, a.cct, a.aca});
   }

   @gdz
   public void bmj(fxx event) {
      long ax = fpv.a ^ 18228237445537L;
      int[] axx = dar.abu();
      class_310 var10000 = chi;
      if (axx != null) {
         if (chi.field_1761 == null) {
            return;
         }

         var10000 = chi;
      }

      if (axx != null) {
         if (var10000.field_1724 == null) {
            return;
         }

         var10000 = chi;
      }

      AccessorClientPlayerInteractionManager var9 = var10000.field_1687;
      if (axx != null) {
         if (var10000.field_1687 == null) {
            return;
         }

         a.efe(a.fhl.dnp() + " " + a.gay.dnp().floatValue());
         var9 = a.cct.dnp();
      }

      var9 = (Boolean)var9;
      label140:
      if (axx != null) {
         if (var9) {
            class_636 var6 = chi.field_1761;
            var9 = var6;
            if (axx == null) {
               break label140;
            }

            if (var6 instanceof AccessorClientPlayerInteractionManager axxx) {
               axxx.setBreakingCooldown(a.aca.dnp().intValue());
            }
         }

         var9 = a.fhl.dnp();
      }

      String var7 = (String)var9;
      byte var8 = -1;
      var11 = var7.hashCode();
      label133:
      if (axx != null) {
         switch (var11) {
            case -1911998296:
               short var10001 = 16633;
               long var10002 = 5778011440438418424L ^ ax;
               var11 = var7.equals("Packet");
               if (axx == null) {
                  break label133;
               }

               if (var11 == 0) {
                  break;
               }

               var8 = 0;
               if (axx != null) {
                  break;
               }
            case 80811813:
               short var15 = 10361;
               long var16 = 737274680739656572L ^ ax;
               var11 = var7.equals("Timer");
               if (axx == null) {
                  break label133;
               }

               if (var11 != 0) {
                  var8 = 1;
               }
         }

         var11 = var8;
      }

      label159: {
         if (axx != null) {
            switch (var11) {
               case 0:
                  var11 = chi.field_1761.method_2923();
                  break;
               case 1:
                  break label159;
               default:
                  return;
            }
         }

         label160: {
            if (axx != null) {
               if (var11 == 0) {
                  return;
               }

               var9 = (AccessorClientPlayerInteractionManager)chi.field_1761;
               if (axx == null) {
                  break label160;
               }

               float var17;
               var11 = (var17 = var9.getCurrentBreakingProgress() - 1.0F / a.gay.dnp().floatValue()) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
            }

            if (var11 < 0) {
               return;
            }

            var9 = (AccessorClientPlayerInteractionManager)chi.field_1761;
         }

         var9.setCurrentBreakingProgress(1.0F);
         if (axx != null) {
            return;
         }
      }

      label162: {
         boolean var13 = chi.field_1761.method_2923();
         if (axx != null) {
            if (var13) {
               aal = a.gay.dnp().floatValue();
               a.dii = true;
               if (axx != null) {
                  return;
               }
            }

            var14 = a;
            if (axx == null) {
               break label162;
            }

            var13 = a.dii;
         }

         if (!var13) {
            return;
         }

         aal = 1.0F;
         var14 = a;
      }

      var14.dii = false;
   }

   static {
      long var0 = a ^ 110584801726754L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "×°\f*\u009eöÈæDI\u0088Û7#\nZ\u008a+÷Ò\u0014cö\u0084\u0010\u009b-ð\u009c¨àTkÅçäZÝ\fQ\u0014 )Á9\u0081\u001d\u0099²Ê[·f¿SáH\u0086£7ÇbZ%}\u0085\u009dIgP²XÀ¹\u0010\u009bx\t\u0003[ÿù£UPdQCd~\u009d\u0010èlñy=OH²\u0004³f\u0014\u00adoò\u0019\u0010²p¦\u008b\b \u0090\u008aMçÌ48\\¯(";
      int var8 = "×°\f*\u009eöÈæDI\u0088Û7#\nZ\u008a+÷Ò\u0014cö\u0084\u0010\u009b-ð\u009c¨àTkÅçäZÝ\fQ\u0014 )Á9\u0081\u001d\u0099²Ê[·f¿SáH\u0086£7ÇbZ%}\u0085\u009dIgP²XÀ¹\u0010\u009bx\t\u0003[ÿù£UPdQCd~\u009d\u0010èlñy=OH²\u0004³f\u0014\u00adoò\u0019\u0010²p¦\u008b\b \u0090\u008aMçÌ48\\¯("
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
                     h = new String[8];
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

                  var6 = "´ö\u009f²\u000b¦µ<rMv\u0094\u009aÆ×à\u0010ä¸ä\u008dÇ£Kñ\u0083\u001b«Gú¥Õ/";
                  var8 = "´ö\u009f²\u000b¦µ<rMv\u0094\u009aÆ×à\u0010ä¸ä\u008dÇ£Kñ\u0083\u001b«Gú¥Õ/".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15208;
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
            throw new RuntimeException("cc/astralis/fpv", var10);
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
         throw new RuntimeException("cc/astralis/fpv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
