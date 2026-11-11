package cc.astralis;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_1923;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2586;
import net.minecraft.class_2595;
import net.minecraft.class_2611;
import net.minecraft.class_2818;
import net.minecraft.class_310;
import net.minecraft.class_3719;
import net.minecraft.class_4184;

public class fki {
   private static final Long2ObjectOpenHashMap<ObjectArrayList<class_2338>> coo = new Long2ObjectOpenHashMap();
   private static boolean dkx = false;
   private static final Predicate<class_2586> bdu = a -> {
      long ax = fki.a ^ 20578281769080L;
      int[] var3 = dar.abu();
      boolean var10000 = a instanceof class_2595;
      if (var3 != null) {
         if (!var10000) {
            var10000 = a instanceof class_2611;
            if (var3 == null) {
               return var10000;
            }

            if (!var10000) {
               var10000 = a instanceof class_3719;
               if (var3 == null) {
                  return var10000;
               }

               if (!var10000) {
                  return false;
               }
            }
         }

         var10000 = true;
      }

      return var10000;
   };
   private static final long a = 129703166143723L;

   private fki() {
   }

   public static void dxj() {
      coo.clear();
   }

   public static void asf() {
      long a = fki.a ^ 89765998071511L;
      int[] ax = dar.abu();
      boolean var10000 = dkx;
      if (ax != null) {
         if (!dkx) {
            return;
         }

         var10000 = gur();
      }

      if (var10000) {
         class_310 axx = class_310.method_1551();
         class_310 var12 = axx;
         if (ax != null) {
            if (axx.field_1687 == null) {
               return;
            }

            var12 = axx;
         }

         Object var13 = var12.field_1724;
         if (ax != null) {
            if (var12.field_1724 == null) {
               return;
            }

            var13 = axx.field_1690.method_42503().method_41753();
         }

         int axxx = (Integer)var13;
         int axxxx = Math.max(2, axxx + 2);
         class_1923 axxxxx = new class_1923(axx.field_1724.method_24515());
         int axxxxxx = -axxxx;

         while (axxxxxx <= axxxx) {
            int axxxxxxx = -axxxx;

            while (true) {
               if (axxxxxxx <= axxxx) {
                  int axxxxxxxx = axxxxx.field_9181 + axxxxxx;
                  int axxxxxxxxx = axxxxx.field_9180 + axxxxxxx;
                  class_2818 axxxxxxxxxx = axx.field_1687.method_2935().method_21730(axxxxxxxx, axxxxxxxxx);
                  if (ax == null) {
                     break;
                  }

                  if (ax != null) {
                     if (axxxxxxxxxx != null) {
                        edf(axxxxxxxxxx);
                     }

                     axxxxxxx++;
                  }

                  if (ax != null) {
                     continue;
                  }
               }

               axxxxxx++;
               break;
            }

            if (ax == null) {
               break;
            }
         }
      }
   }

   public static void edf(class_2818 chunk) {
      long ax = fki.a ^ 137387267177157L;
      int[] axx = dar.abu();
      if (dkx) {
         long axxx = a.method_12004().method_8324();
         ObjectArrayList<class_2338> axxxx = new ObjectArrayList();
         Iterator var7 = a.method_12214().values().iterator();

         while (true) {
            if (var7.hasNext()) {
               class_2586 axxxxx = (class_2586)var7.next();
               if (axx == null) {
                  break;
               }

               if (axx != null && bdu.test(axxxxx)) {
                  axxxx.add(axxxxx.method_11016().method_10062());
               }

               if (axx != null) {
                  continue;
               }
            }

            coo.put(axxx, axxxx);
            break;
         }
      }
   }

   public static void an(class_1923 pos) {
      coo.remove(a.method_8324());
   }

   public static void afq(class_2818 chunk, class_2586 be) {
      long ax = fki.a ^ 138673823005015L;
      int[] axx = dar.abu();
      boolean var10000 = dkx;
      if (axx != null) {
         if (!dkx) {
            return;
         }

         var10000 = bdu.test(a);
      }

      if (var10000) {
         long axxx = a.method_12004().method_8324();
         ((ObjectArrayList)coo.computeIfAbsent(axxx, axxxx -> new ObjectArrayList())).add(a.method_11016().method_10062());
      }
   }

   public static void gd(class_2818 chunk, class_2338 pos) {
      long ax = fki.a ^ 72606352039590L;
      int[] axx = dar.abu();
      if (dkx) {
         long axxx = a.method_12004().method_8324();
         ObjectArrayList<class_2338> axxxx = (ObjectArrayList<class_2338>)coo.get(axxx);
         if (axxxx != null) {
            int axxxxx = 0;

            boolean var9;
            while (true) {
               label55:
               if (axxxxx < axxxx.size()) {
                  label53: {
                     class_2338 var10000 = (class_2338)axxxx.get(axxxxx);
                     if (axx != null) {
                        var9 = var10000.equals(a);
                        if (axx == null) {
                           break;
                        }

                        if (!var9) {
                           break label53;
                        }

                        axxxx.remove(axxxxx);
                     }

                     if (axx != null) {
                        break label55;
                     }
                  }

                  axxxxx++;
                  if (axx != null) {
                     continue;
                  }
               }

               if (axx == null) {
                  return;
               }

               var9 = axxxx.isEmpty();
               break;
            }

            if (var9) {
               coo.remove(axxx);
            }
         }
      }
   }

   public static ObjectArrayList<class_2338> fvc() {
      long a = fki.a ^ 8846617091774L;
      ObjectArrayList ax = new ObjectArrayList();
      int[] var10000 = dar.abu();
      ObjectIterator var4 = coo.values().iterator();
      int[] axx = var10000;

      while (true) {
         if (var4.hasNext()) {
            List<class_2338> axxx = (List<class_2338>)var4.next();
            var6 = ax;
            if (axx == null) {
               break;
            }

            ax.addAll(axxx);
            if (axx != null) {
               continue;
            }
         }

         var6 = ax;
         break;
      }

      return var6;
   }

   public static ObjectArrayList<class_2338> ewx(class_4184 cam, double maxDistSq, Predicate<class_238> frustumVisible) {
      long ax = fki.a ^ 135646295396630L;
      int[] var10000 = dar.abu();
      ObjectArrayList<class_2338> axx = new ObjectArrayList();
      double axxx = a.method_19326().field_1352;
      double axxxx = a.method_19326().field_1351;
      int[] axxxxx = var10000;
      double axxxxxx = a.method_19326().field_1350;
      ObjectIterator var14 = coo.values().iterator();

      label43:
      while (true) {
         int var25 = var14.hasNext();

         label41:
         while (var25 != 0) {
            List<class_2338> axxxxxxx = (List<class_2338>)var14.next();

            for (class_2338 axxxxxxxx : axxxxxxx) {
               double axxxxxxxxx = axxxxxxxx.method_10263() + 0.5 - axxx;
               double axxxxxxxxxx = axxxxxxxx.method_10264() + 0.5 - axxxx;
               double axxxxxxxxxxx = axxxxxxxx.method_10260() + 0.5 - axxxxxx;
               double var27;
               var25 = (var27 = axxxxxxxxx * axxxxxxxxx + axxxxxxxxxx * axxxxxxxxxx + axxxxxxxxxxx * axxxxxxxxxxx - a) == 0.0 ? 0 : (var27 < 0.0 ? -1 : 1);
               if (axxxxx == null) {
                  continue label41;
               }

               if (var25 <= 0) {
                  class_238 axxxxxxxxxxxx = new class_238(axxxxxxxx);
                  boolean var26 = a.test(axxxxxxxxxxxx);
                  if (axxxxx != null) {
                     if (!var26) {
                        continue;
                     }

                     axx.add(axxxxxxxx);
                  }

                  if (axxxxx == null) {
                     break;
                  }
               }
            }

            if (axxxxx == null) {
               return axx;
            }
            continue label43;
         }

         return axx;
      }
   }

   public static boolean gur() {
      long var0 = a ^ 108280439256770L;
      return class_310.method_1551().field_1687 != null;
   }

   public static void gdu(boolean collectData) {
      dkx = a;
   }

   public static boolean ces() {
      return dkx;
   }
}
