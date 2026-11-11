package cc.astralis;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_124;

public class djc {
   private static final List<djc> ev = new ArrayList<>();
   private final String dqz;
   private final String cil;
   private final class_124 gza;

   public djc(String id, String name, class_124 color) {
      a.dqz = a;
      a.cil = a;
      a.gza = a;
      ev.add(a);
   }

   public static List<djc> esp() {
      return ev;
   }

   public static djc anc(String name) {
      return ev.stream().filter(axx -> axx.cil.equalsIgnoreCase(a)).findFirst().orElse(null);
   }

   public String cxy() {
      return a.dqz;
   }

   public String bjs() {
      return a.cil;
   }

   public class_124 fcy() {
      return a.gza;
   }
}
