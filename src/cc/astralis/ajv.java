package cc.astralis;

import net.minecraft.class_243;

public class ajv {
   private double dzl;
   private double foz;
   private double fzv;

   private ajv(class_243 a) {
      a.dzl = a.field_1352;
      a.foz = a.field_1351;
      a.fzv = a.field_1350;
   }

   public static ajv ett(class_243 base) {
      return new ajv(a);
   }

   public ajv eab(double x) {
      a.dzl = a;
      return a;
   }

   public ajv aou(double y) {
      a.foz = a;
      return a;
   }

   public ajv cxp(double z) {
      a.fzv = a;
      return a;
   }

   public ajv cwe(double factor) {
      a.dzl *= a;
      a.foz *= a;
      a.fzv *= a;
      return a;
   }

   public class_243 gwt() {
      return new class_243(a.dzl, a.foz, a.fzv);
   }
}
