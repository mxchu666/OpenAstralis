package astralis.mixin.game;

import cc.astralis.avx;
import cc.astralis.ayd;
import cc.astralis.bav;
import cc.astralis.cdr;
import cc.astralis.dar;
import cc.astralis.dgk;
import cc.astralis.dlc;
import cc.astralis.eji;
import cc.astralis.ejt;
import cc.astralis.ekb;
import cc.astralis.eu;
import cc.astralis.fnt;
import cc.astralis.gpy;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
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
import net.minecraft.class_1041;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_542;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_239.class_240;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_310.class})
public class MixinMinecraftClient implements dlc {
   @Shadow
   @Nullable
   public class_239 field_1765;
   @Shadow
   @Nullable
   public class_746 field_1724;
   @Shadow
   private int field_1752;
   @Shadow
   @Final
   private class_1041 field_1704;
   @Unique
   private boolean serenity$shown = false;
   private static final String[] a;
   private static final long b = 85363882636715L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   @Inject(
      method = {"handleInputEvents"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z",
         ordinal = 0,
         shift = Shift.AFTER
      )}
   )
   private void hookLegitClickEvent(CallbackInfo a) {
      class_746 ax = ((class_310)a).field_1724;
      if (ax != null) {
         eji axx = new eji();
         dar.gqy().fyf().brx(axx);
      }
   }

   @Inject(
      method = {"<init>"},
      at = {@At("RETURN")}
   )
   private void init(class_542 a, CallbackInfo a) {
      int[] ax = new int[]{1};
      int[] axx = new int[]{1};
      GLFW.glfwGetFramebufferSize(chi.method_22683().method_4490(), ax, axx);
      dar.gqy().bav().dxy(ax[0] > 0 ? ax[0] : 1, axx[0] > 0 ? axx[0] : 1);
   }

   @Inject(
      method = {"<init>"},
      at = {@At("RETURN")}
   )
   public void initImGui(class_542 args, CallbackInfo ci) {
      eu.djp(a.field_1704.method_4490());
   }

   @Inject(
      method = {"close"},
      at = {@At("HEAD")}
   )
   public void closeImGui(CallbackInfo ci) {
      eu.fcq();
   }

   @Inject(
      method = {"<init>"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/MinecraftClient;onResolutionChanged()V"
      )}
   )
   private void startClient(CallbackInfo a) {
      dar.gqy().er();
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   public void hookEventTickPre(CallbackInfo ci) {
      if (chi.field_1724 != null) {
         cdr.hjr = chi.field_1724.method_24828() ? 0 : ++cdr.hjr;
         cdr.gig = !chi.field_1724.method_24828() ? 0 : ++cdr.gig;
         if (chi.field_1724.method_24828()) {
            cdr.bna.glr();
         }
      }

      dar.gqy().fyf().brx(new fnt(gpy.PRE));
   }

   @Inject(
      method = {"render"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gl/Framebuffer;blitToScreen()V",
         shift = Shift.AFTER
      )}
   )
   private void hookGuiRender(boolean a, CallbackInfo a) {
   }

   @Inject(
      method = {"tick"},
      at = {@At("TAIL")}
   )
   public void hookEventTickPost(CallbackInfo ci) {
      dar.gqy().fyf().brx(new fnt(gpy.POST));
   }

   @Inject(
      method = {"setWorld"},
      at = {@At("HEAD")}
   )
   private void hookWorldChangeEvent(class_638 a, CallbackInfo a) {
      if (a != null) {
         dar.gqy().fyf().brx(new dgk());
      }
   }

   @Redirect(
      method = {"handleInputEvents"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/option/KeyBinding;isPressed()Z",
         ordinal = 2
      )
   )
   private boolean hookKillAuraAutoBlock(class_304 a) {
      ekb ax = dar.gqy().aws().diy(ekb.class);
      class_310 axx = (class_310)a;
      if (!a.method_1434()) {
         if (ax.dsv() && ax.gvw != null) {
            String[] var4 = MixinMinecraftClient.a;
            if (!ax.dhq.emb(var4[0]) && !ax.dhq.emb(var4[2]) && !ax.dhq.emb(var4[1]) && bav.dtz(ax.gvw, ax.bjd.dnp().floatValue()) && ax.boi.dnp()) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @ModifyExpressionValue(
      method = {"doAttack"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/MinecraftClient;attackCooldown:I",
         ordinal = 0
      )}
   )
   private int injectNoMissCooldown(int a) {
      avx ax = dar.gqy().aws().diy(avx.class);
      return ax.dsv() && ax.dpg.dnp() ? 0 : a;
   }

   @WrapWithCondition(
      method = {"doAttack"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/MinecraftClient;attackCooldown:I",
         ordinal = 1
      )}
   )
   private boolean noClickCooldown(class_310 a, int a) {
      avx ax = dar.gqy().aws().diy(avx.class);
      return !ax.dsv() || !ax.dpg.dnp();
   }

   @Inject(
      method = {"doAttack"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void injectswingCancel(CallbackInfoReturnable<Boolean> a) {
      avx ax = dar.gqy().aws().diy(avx.class);
      if (ax.dsv() || a.field_1724 == null || a.field_1765 == null) {
         if (ax.ccp.dnp() && !bav.glo()) {
            return;
         }

         class_240 axx = a.field_1765.method_17783();
         if (ax.gav.dnp() && (axx == class_240.field_1333 && !ax.czi.dnp() || axx == class_240.field_1332 && !ax.dzj.dnp())) {
            a.setReturnValue(true);
         }
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void onClientTick(CallbackInfo a) {
      class_310 ax = class_310.method_1551();
      if (!a.serenity$shown && ax.field_1687 == null) {
         a.serenity$shown = true;
         class_437 axx = dar.gqy().azc();
         ax.method_1507(axx);
      }
   }

   @Redirect(
      method = {"hasOutline"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;isGlowing()Z"
      )
   )
   public boolean hookGlow(class_1297 entity) {
      boolean ax = a.method_5851();
      ayd axx = dar.gqy().aws().diy(ayd.class);
      return axx.dsv() && a instanceof class_1657 && !ejt.cnv((class_1657)a) ? true : ax;
   }

   static {
      long var15 = b ^ 87778535056227L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var15 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var14 = var12.doFinal("®\u0012\u008c²«¤å@\u009bØÂ\u0099f\u0018Ü3éaR\u0096\u001fI7¯Bs5~À&öï".getBytes("ISO-8859-1"));
      String var36 = a(var14).intern();
      int var10001 = -1;
      String var11 = var36;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var15 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[11];
      int var3 = 0;
      String var4 = "\u000fÔ\u0088\u0091\u0019A\u0095\u0002G,\fPJÖ\u0093¹\u001fìBbjÎØ§ä\u009bO\u008e±ì¨w2\u0090ÕV\u0003°\"Ç©ÄN\u0004\u0012|Ä?\u001d\u0019[è%\u0003\u0083iô¦/0R]¸Ï<ÊU²í\u0091º(";
      int var5 = "\u000fÔ\u0088\u0091\u0019A\u0095\u0002G,\fPJÖ\u0093¹\u001fìBbjÎØ§ä\u009bO\u008e±ì¨w2\u0090ÕV\u0003°\"Ç©ÄN\u0004\u0012|Ä?\u001d\u0019[è%\u0003\u0083iô¦/0R]¸Ï<ÊU²í\u0091º("
         .length();
      byte var2 = 0;

      label40:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var26 = var6;
         var10001 = var3++;
         long var38 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var43 = -1;

         while (true) {
            long var8 = var38;
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
            long var45 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var43) {
               case 0:
                  var26[var10001] = var45;
                  if (var2 >= var5) {
                     c = var6;
                     d = new Integer[11];
                     String[] var22 = new String[3];
                     short var27 = 2572;
                     int var20 = 0;
                     long var32 = 8567582312742115005L ^ var15;
                     String var19 = var11;
                     int var21 = var11.length();
                     char var18 = 20;
                     int var17 = -1;

                     while (true) {
                        short var28 = 17175;
                        long var33 = 5422982059636924325L ^ var15;
                        String var40 = a(30, a(var19.substring(++var17, var17 + var18)));
                        byte var34 = -1;
                        var22[var20++] = var40;
                        if ((var17 += var18) >= var21) {
                           a = var22;
                           return;
                        }

                        var18 = var19.charAt(var17);
                     }
                  }
                  break;
               default:
                  var26[var10001] = var45;
                  if (var2 < var5) {
                     continue label40;
                  }

                  var4 = "Ú\u0091¯áæ¹\u001aÑuBÔße\u000e\u0014\u0006";
                  var5 = "Ú\u0091¯áæ¹\u001aÑuBÔße\u000e\u0014\u0006".length();
                  var2 = 0;
            }

            byte var31 = var2;
            var2 += 8;
            var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
            var26 = var6;
            var10001 = var3++;
            var38 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var43 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      long var1 = b ^ 124624095474897L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 10861;
         long var10005 = 4873099594159038820L ^ var1;
         var10000[0] = (char)(var10003 ^ 'N');
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 8819445693742L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 23422;
         long var10009 = 4854242228639816079L ^ var2;
         byte var10;
         switch (var4 % 7) {
            case 0:
               var10 = 31517;
               long var23 = 6156418384615766499L ^ var2;
               var10 = 56;
               break;
            case 1:
               var10 = 7983;
               long var22 = 774448056870051293L ^ var2;
               var10 = 91;
               break;
            case 2:
               var10 = 11842;
               long var21 = 4483751090282802358L ^ var2;
               var10 = 107;
               break;
            case 3:
               var10 = 22103;
               long var20 = 6445612879106495652L ^ var2;
               var10 = 14;
               break;
            case 4:
               var10 = 9412;
               long var19 = 5831988916384671283L ^ var2;
               var10 = 82;
               break;
            case 5:
               var10 = 22328;
               long var18 = 3633077934430705096L ^ var2;
               var10 = 72;
               break;
            default:
               var10 = 3229;
               long var17 = 4117806273565986408L ^ var2;
               var10 = 78;
         }

         var10001[var4] = (char)(var10005 ^ var10002 ^ var10);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19059;
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
            throw new RuntimeException("astralis/mixin/game/MixinMinecraftClient", var14);
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
         throw new RuntimeException("astralis/mixin/game/MixinMinecraftClient" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
