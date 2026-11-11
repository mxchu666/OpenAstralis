package astralis.mixin.render;

import astralis.mixin.accessor.HeldItemRendererAccessor;
import cc.astralis.bma;
import cc.astralis.dar;
import cc.astralis.dlc;
import cc.astralis.ekb;
import cc.astralis.fhd;
import cc.astralis.hin;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
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
import net.minecraft.class_11659;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1819;
import net.minecraft.class_1839;
import net.minecraft.class_310;
import net.minecraft.class_3489;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_759;
import net.minecraft.class_7833;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_759.class})
public abstract class MixinHeldItemRenderer implements dlc {
   @Shadow
   @Final
   private static float field_32740;
   private static final String a;
   private static final long b = 83186170126428L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   @Inject(
      method = {"updateHeldItems"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onUpdateHeldItems(CallbackInfo a) {
      fhd ax = dar.gqy().aws().diy(fhd.class);
      if (ax.eru != -1 && ax.euy.dnp()) {
         if (chi.field_1724 != null) {
            class_1799 axx = chi.field_1724.method_31548().method_5438(ax.eru);
            ((HeldItemRendererAccessor)a).setMainHand(axx);
         }

         a.cancel();
      }
   }

   @Inject(
      method = {"renderFirstPersonItem"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/util/math/MatrixStack;push()V",
         shift = Shift.AFTER
      )}
   )
   private void hookRenderFirstPersonItem(
      class_742 a, float a, float a, class_1268 a, float a, class_1799 a, float a, class_4587 a, class_11659 a, int a, CallbackInfo a
   ) {
      if (class_1268.field_5808 == a && dar.gqy().aws().diy(hin.class).dsv()) {
         a.method_46416(hin.don.dnp().floatValue() / 10.0F, hin.boo.dnp().floatValue() / 10.0F, hin.djx.dnp().floatValue() / 10.0F);
         a.method_22907(class_7833.field_40714.rotationDegrees(hin.aqe.dnp().floatValue()));
         a.method_22907(class_7833.field_40716.rotationDegrees(hin.afc.dnp().floatValue()));
         a.method_22907(class_7833.field_40718.rotationDegrees(hin.bak.dnp().floatValue()));
      }
   }

   @Inject(
      method = {"renderFirstPersonItem"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/HeldItemRenderer;applyEquipOffset(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/util/Arm;F)V",
         ordinal = 2
      )},
      cancellable = true
   )
   private void onBlockTransform(
      class_742 a, float a, float a, class_1268 a, float a, class_1799 a, float a, class_4587 a, class_11659 a, int a, CallbackInfo a
   ) {
      if (a.method_7976() == class_1839.field_8949) {
         a.cancel();
      }
   }

   @Inject(
      method = {"renderFirstPersonItem"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideShield(class_742 a, float a, float a, class_1268 a, float a, class_1799 a, float a, class_4587 a, class_11659 a, int a, CallbackInfo a) {
      bma ax = dar.gqy().aws().diy(bma.class);
      if (a.method_7909() instanceof class_1819 && ax.dsv()) {
         a.cancel();
      }
   }

   @ModifyArg(
      method = {"applyEquipOffset"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/util/math/MatrixStack;translate(FFF)V"
      ),
      index = 1
   )
   private float injectDisableEquipOffset(float a) {
      return bma.fga.dnp() && dar.gqy().aws().diy(bma.class).dsv() ? field_32740 : a;
   }

   @ModifyExpressionValue(
      method = {"renderFirstPersonItem"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/item/ItemStack;getItem()Lnet/minecraft/item/Item;"
      )}
   )
   private class_1792 preventConflictingCode(class_1792 a) {
      return chi.field_1724.method_31548().method_7391().method_31573(class_3489.field_42611) && !bma.diq.emb(MixinHeldItemRenderer.a)
         ? class_1802.field_8255
         : a;
   }

   @Redirect(
      method = {"renderFirstPersonItem"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/item/ItemStack;getUseAction()Lnet/minecraft/item/consume/UseAction;",
         ordinal = 0
      )
   )
   private class_1839 hookUseAction(class_1799 a) {
      class_1792 ax = a.method_7909();
      return chi.field_1724.method_31548().method_7391().method_31573(class_3489.field_42611)
            && (dar.gqy().aws().diy(ekb.class).dsv() && dar.gqy().aws().diy(ekb.class).dfb() || class_310.method_1551().field_1690.field_1904.method_1434())
            && dar.gqy().aws().diy(bma.class).dsv()
         ? class_1839.field_8949
         : a.method_7976();
   }

   @Redirect(
      method = {"renderFirstPersonItem"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/AbstractClientPlayerEntity;isUsingItem()Z",
         ordinal = 1
      )
   )
   private boolean hookIsUseItem(class_742 a) {
      class_1792 ax = a.method_6047().method_7909();
      return chi.field_1724.method_31548().method_7391().method_31573(class_3489.field_42611)
            && (dar.gqy().aws().diy(ekb.class).dsv() && dar.gqy().aws().diy(ekb.class).dfb() || class_310.method_1551().field_1690.field_1904.method_1434())
            && dar.gqy().aws().diy(bma.class).dsv()
         ? true
         : a.method_6115();
   }

   @Redirect(
      method = {"renderFirstPersonItem"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/AbstractClientPlayerEntity;getActiveHand()Lnet/minecraft/util/Hand;",
         ordinal = 1
      )
   )
   private class_1268 hookActiveHand(class_742 a) {
      class_1792 ax = a.method_6047().method_7909();
      return chi.field_1724.method_31548().method_7391().method_31573(class_3489.field_42611)
            && (dar.gqy().aws().diy(ekb.class).dsv() && dar.gqy().aws().diy(ekb.class).dfb() || class_310.method_1551().field_1690.field_1904.method_1434())
            && dar.gqy().aws().diy(bma.class).dsv()
         ? class_1268.field_5808
         : a.method_6058();
   }

   @Redirect(
      method = {"renderFirstPersonItem"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/AbstractClientPlayerEntity;getItemUseTimeLeft()I",
         ordinal = 2
      )
   )
   private int hookItemUseItem(class_742 a) {
      long ax = b ^ 74993991210494L;
      class_1792 axx = a.method_6047().method_7909();
      if (chi.field_1724.method_31548().method_7391().method_31573(class_3489.field_42611)
         && (dar.gqy().aws().diy(ekb.class).dsv() && dar.gqy().aws().diy(ekb.class).dfb() || class_310.method_1551().field_1690.field_1904.method_1434())
         && dar.gqy().aws().diy(bma.class).dsv()) {
         short var10000 = 6266;
         long var10001 = 1730933265298518147L ^ ax;
         return 7200;
      } else {
         return a.method_6014();
      }
   }

   @ModifyArg(
      method = {"renderFirstPersonItem"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/HeldItemRenderer;applyEquipOffset(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/util/Arm;F)V",
         ordinal = 4
      ),
      index = 2
   )
   private float applyEquipOffset(float a) {
      return dar.gqy().aws().diy(bma.class).dsv() ? 0.0F : a;
   }

   @Inject(
      method = {"renderFirstPersonItem"},
      slice = {@Slice(
         from = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/item/ItemStack;getUseAction()Lnet/minecraft/item/consume/UseAction;"
         )
      )},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/HeldItemRenderer;applyEquipOffset(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/util/Arm;F)V",
         ordinal = 2,
         shift = Shift.AFTER
      )}
   )
   private void transformLegacyBlockAnimations(
      class_742 a, float a, float a, class_1268 a, float a, class_1799 a, float a, class_4587 a, class_11659 a, int a, CallbackInfo a
   ) {
      if (dar.gqy().aws().diy(bma.class).dsv() && chi.field_1724.method_31548().method_7391().method_31573(class_3489.field_42611)) {
         class_1306 ax = a == class_1268.field_5808 ? a.method_6068() : a.method_6068().method_5928();
         bma.apw(a, ax, a, a);
      }
   }

   static {
      long var15 = b ^ 48565333345477L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var15 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var15 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var14 = var12.doFinal("\u009eZÃ²\u0015\u009d+\u0091".getBytes("ISO-8859-1"));
      String var24 = a(var14).intern();
      int var10001 = -1;
      String var11 = var24;
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
      String var4 = "j\u009cÁ¦#é÷$\u0080 \u007fÐëã\u008bq\u0011°©/lm+ò\u008a\u0099\u0011^.$\u0002®«\\-\t_m1ù¹·ôø\u009cq?\u0006\u0006\u00158H6é÷k\u0086\u0088ý\t\u0012@¢m\u0093Az[ò!l±";
      int var5 = "j\u009cÁ¦#é÷$\u0080 \u007fÐëã\u008bq\u0011°©/lm+ò\u008a\u0099\u0011^.$\u0002®«\\-\t_m1ù¹·ôø\u009cq?\u0006\u0006\u00158H6é÷k\u0086\u0088ý\t\u0012@¢m\u0093Az[ò!l±"
         .length();
      byte var2 = 0;

      label29:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var19 = var6;
         var10001 = var3++;
         long var26 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var30 = -1;

         while (true) {
            long var8 = var26;
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
            long var32 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var30) {
               case 0:
                  var19[var10001] = var32;
                  if (var2 >= var5) {
                     c = var6;
                     d = new Integer[11];
                     String var28 = a(a<"f">(11440, 7215797520650950010L ^ var15), a(var11));
                     byte var23 = -1;
                     a = var28;
                     return;
                  }
                  break;
               default:
                  var19[var10001] = var32;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "V\u007f\u008e¬ªo/³\u000f\u0019Ü\u0080\u001cðÃ\u008e";
                  var5 = "V\u007f\u008e¬ªo/³\u000f\u0019Ü\u0080\u001cðÃ\u008e".length();
                  var2 = 0;
            }

            byte var22 = var2;
            var2 += 8;
            var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
            var19 = var6;
            var10001 = var3++;
            var26 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var30 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      long var1 = b ^ 133007511137147L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 25750;
         long var10005 = 7499021880331760366L ^ var1;
         var10000[0] = (char)(var10003 ^ '}');
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 82255047694890L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 12001;
         long var10009 = 82365125065968075L ^ var2;
         var10001[var4] = (char)(var10005 ^ var10002 ^ switch (var4 % 7) {
            case 0 -> {
               short var15 = 13763;
               long var21 = 1106514694935417579L ^ var2;
               yield 15;
            }
            case 1 -> {
               short var14 = 13204;
               long var20 = 4561897809750594746L ^ var2;
               yield 8;
            }
            case 2 -> {
               short var13 = 486;
               long var19 = 884208686705256141L ^ var2;
               yield 85;
            }
            case 3 -> a<"f">(29721, 3302264232958645055L ^ var2);
            case 4 -> {
               short var12 = 10697;
               long var18 = 2862932416919768806L ^ var2;
               yield 27;
            }
            case 5 -> {
               short var11 = 16428;
               long var17 = 877729036326725376L ^ var2;
               yield 42;
            }
            default -> {
               short var10007 = 4080;
               long var16 = 6578167294206191828L ^ var2;
               yield 125;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23898;
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
            throw new RuntimeException("astralis/mixin/render/MixinHeldItemRenderer", var14);
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
         throw new RuntimeException("astralis/mixin/render/MixinHeldItemRenderer" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
