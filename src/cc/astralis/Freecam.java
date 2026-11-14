package cc.astralis;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_310;
import org.lwjgl.glfw.GLFW;

public class Freecam extends guu {
   private float dfu = 0.0F;
   private float gsr = 0.0F;
   private float eyw = 0.0F;
   private static final long a = 118555617952967L;
   private static final long g;

   public Freecam() {
      super(bfm.VISUAL);
   }

   @Override
   public void auj() {
      a.eyw = ((Integer)chi.field_1690.method_41808().method_41753()).intValue();
      a.dfu = a.eyw;
      a.gsr = a.eyw;
      super.auj();
   }

   @Override
   public void frg() {
      a.dfu = a.eyw;
      a.gsr = a.eyw;
      super.frg();
   }

   public float czi(float currentFov) {
      long ax = Freecam.a ^ 45607865081044L;
      int[] axx = dar.abu();
      class_310 var10000 = chi;
      if (axx != null) {
         if (chi.field_1755 != null) {
            return a;
         }

         var10000 = chi;
      }

      int var7 = GLFW.glfwGetKey(var10000.method_22683().method_4490(), (int)g);
      if (axx != null) {
         var7 = var7 == 1 ? 1 : 0;
      }

      boolean axxx = (boolean)var7;
      float var9;
      int var8 = (var9 = a.eyw - 0.0F) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
      if (axx != null) {
         if (var8 == 0) {
            a.eyw = a;
            a.dfu = a;
         }

         var8 = axxx;
      }

      if (var8 != 0) {
         a.gsr = 30.0F;
         float axxxx = 0.05F;
         a.dfu = a.dfu + (a.gsr - a.dfu) * axxxx;
         return a.dfu;
      } else {
         a.dfu = a;
         return a;
      }
   }

   static {
      long var0 = a ^ 133071262311824L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -5631985844232665685L;
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
      g = var7;
   }
}
