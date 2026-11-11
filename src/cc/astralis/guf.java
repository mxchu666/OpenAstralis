package cc.astralis;

import net.minecraft.class_243;
import net.minecraft.class_4184;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class guf implements dlc {
   public static Matrix4f gqp;
   public static Matrix4f gky;

   public static class_243 at(class_243 vector) {
      class_4184 ax = chi.field_1773.method_19418();
      class_243 axx = ax.method_19326();
      class_243 axxx = a.method_1020(axx);
      Vector4f axxxx = new Vector4f((float)axxx.field_1352, (float)axxx.field_1351, (float)axxx.field_1350, 1.0F);
      gqp.transform(axxxx);
      gky.transform(axxxx);
      axxxx.div(axxxx.w);
      float axxxxx = (axxxx.x + 1.0F) * chi.method_22683().method_4480() * 0.5F;
      float axxxxxx = (1.0F - axxxx.y) * chi.method_22683().method_4507() * 0.5F;
      float axxxxxxx = chi.method_22683().method_4495();
      return new class_243(axxxxx / axxxxxxx, axxxxxx / axxxxxxx, axxxx.z);
   }
}
