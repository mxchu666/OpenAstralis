package cc.astralis;

import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public class dgq implements dlc {
   private static final long a = 138038499286463L;

   public static float gz(float from, float to, float speed) {
      long ax = dgq.a ^ 117183610906690L;
      int[] var10000 = dar.abu();
      float axx = class_3532.method_15393(a - a);
      int[] axxx = var10000;
      float var9;
      int var7 = (var9 = axx - a) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
      if (axxx != null) {
         if (var7 > 0) {
            axx = a;
         }

         float var10001 = -a;
         if (axxx == null) {
            return axx + var10001;
         }

         float var10;
         var7 = (var10 = axx - var10001) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
      }

      if (var7 < 0) {
         axx = -a;
      }

      return a + axx;
   }

   public static float[] ewm(float[] rotations, float[] lastRotations) {
      float ax = a[0];
      float axx = a[1];
      float axxx = a[0];
      float axxxx = a[1];
      float axxxxx = (float)((Double)chi.field_1690.method_42495().method_41753() * 0.6F + 0.2F);
      float axxxxxx = axxxxx * axxxxx * axxxxx * 1.2F;
      float axxxxxxx = ax - axxx;
      float axxxxxxxx = axx - axxxx;
      float axxxxxxxxx = axxxxxxx - axxxxxxx % axxxxxx;
      float axxxxxxxxxx = axxxxxxxx - axxxxxxxx % axxxxxx;
      float axxxxxxxxxxx = axxx + axxxxxxxxx;
      float axxxxxxxxxxxx = axxxx + axxxxxxxxxx;
      return new float[]{axxxxxxxxxxx, axxxxxxxxxxxx};
   }

   public static class_243 grq(class_1297 entity) {
      long ax = dgq.a ^ 78744874373492L;
      class_243 axx = byh();
      float axxx = dar.gqy().aws().diy(bdh.class).ftx.dnp() ? 0.1F : 0.0F;
      class_238 axxxx = a.method_5829().method_1014(axxx);
      double axxxxx = class_3532.method_15350(axx.method_10216(), axxxx.field_1323, axxxx.field_1320);
      double axxxxxx = class_3532.method_15350(axx.method_10214(), axxxx.field_1322, axxxx.field_1325);
      double axxxxxxx = class_3532.method_15350(axx.method_10215(), axxxx.field_1321, axxxx.field_1324);
      return new class_243(axxxxx, axxxxxx, axxxxxxx);
   }

   public static class_243 fgs(class_1297 entity) {
      long ax = dgq.a ^ 13764418050933L;
      class_243 axx = byh();
      float axxx = dar.gqy().aws().diy(bdh.class).ftx.dnp() ? 0.1F : 0.0F;
      class_238 axxxx = a.method_5829().method_1014(axxx);
      double axxxxx = class_3532.method_15350(axx.method_10216(), axxxx.field_1323, axxxx.field_1320);
      double axxxxxx = class_3532.method_15350(axx.method_10214(), axxxx.field_1322, axxxx.field_1325);
      double axxxxxxx = class_3532.method_15350(axx.method_10215(), axxxx.field_1321, axxxx.field_1324);
      return new class_243(axxxxx, axxxxxx, axxxxxxx);
   }

   public static float[] dxs(class_1297 entity) {
      class_243 ax = fgs(a);
      return gah(ax);
   }

   public static float[] gah(class_243 vec3d) {
      double ax = a.field_1352 - chi.field_1724.method_23317();
      double axx = a.field_1351 - byh().field_1351;
      double axxx = a.field_1350 - chi.field_1724.method_23321();
      double axxxx = class_3532.method_15355((float)(ax * ax + axxx * axxx));
      float axxxxx = (float)(Math.atan2(axxx, ax) * 180.0 / Math.PI - 90.0);
      float axxxxxx = (float)(-(Math.atan2(axx, axxxx) * 180.0 / Math.PI));
      return new float[]{
         (chi.field_1724.method_36454() + class_3532.method_15393(axxxxx - chi.field_1724.method_36454())) % 360.0F,
         (chi.field_1724.method_36455() + class_3532.method_15393(axxxxxx - chi.field_1724.method_36455())) % 360.0F
      };
   }

   public static class_243 byh() {
      long a = dgq.a ^ 113941391650944L;
      float ax = dar.gqy().aws().diy(bdh.class).ecl.dnp() ? chi.field_1724.method_18381(chi.field_1724.method_18376()) : chi.field_1724.method_17682() * 0.85F;
      return new class_243(chi.field_1724.method_23317(), chi.field_1724.method_23318() + ax, chi.field_1724.method_23321());
   }

   public static double flj(class_1297 entity) {
      class_243 ax = byh();
      class_243 axx = grq(a);
      double axxx = Math.abs(axx.field_1352 - ax.field_1352);
      double axxxx = Math.abs(axx.field_1351 - ax.field_1351);
      double axxxxx = Math.abs(axx.field_1350 - ax.field_1350);
      return Math.sqrt(Math.pow(axxx, 2.0) + Math.pow(axxxx, 2.0) + Math.pow(axxxxx, 2.0));
   }

   public static double etv(class_243 pos) {
      return a.method_1022(byh());
   }
}
