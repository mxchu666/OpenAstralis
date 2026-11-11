package astralis.mixin.render;

import cc.astralis.dar;
import cc.astralis.gsn;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_338;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({class_338.class})
public class MixinChatHud {
   private static final long a = 98080950347098L;
   private static final long b;

   @ModifyExpressionValue(
      method = {"addVisibleMessage", "addMessage", "addToMessageHistory"},
      at = {@At(
         value = "CONSTANT",
         args = {"intValue=100"}
      )}
   )
   public int changeMaxHistory(int original) {
      long ax = MixinChatHud.a ^ 46140281890461L;
      gsn axx = dar.gqy().aws().diy(gsn.class);
      return axx.dsv() ? a + (int)b : a;
   }

   static {
      long var0 = a ^ 108116157994702L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 4984291086055205242L;
      byte[] var6 = var2.doFinal(
         new byte[]{
            (byte)(var4 >>> 56),
            (byte)(var4 >>> 48),
            (byte)(var4 >>> 40),
            (byte)(var4 >>> 32),
            (byte)(var4 >>> 24),
            (byte)(var4 >>> 16),
            (byte)(var4 >>> 8),
            (byte)var4
         }
      );
      long var7 = (var6[0] & 255L) << 56
         | (var6[1] & 255L) << 48
         | (var6[2] & 255L) << 40
         | (var6[3] & 255L) << 32
         | (var6[4] & 255L) << 24
         | (var6[5] & 255L) << 16
         | (var6[6] & 255L) << 8
         | var6[7] & 255L;
      byte var10001 = -1;
      b = var7;
   }
}
