package cc.astralis;

import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_10192;
import net.minecraft.class_10590;
import net.minecraft.class_1322;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1743;
import net.minecraft.class_1755;
import net.minecraft.class_1759;
import net.minecraft.class_1779;
import net.minecraft.class_1786;
import net.minecraft.class_1792;
import net.minecraft.class_1794;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1820;
import net.minecraft.class_1821;
import net.minecraft.class_1826;
import net.minecraft.class_1887;
import net.minecraft.class_1893;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_5134;
import net.minecraft.class_6880;
import net.minecraft.class_9274;
import net.minecraft.class_9285;
import net.minecraft.class_9334;
import net.minecraft.class_9424;
import net.minecraft.class_1304.class_1305;
import net.minecraft.class_1322.class_1323;
import net.minecraft.class_9285.class_9287;

public class cwp implements dlc {
   private static final long a = 72821445792396L;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public static hcp bos(class_1799 itemStack) {
      long ax = cwp.a ^ 107965391225558L;
      class_1792 axx = a.method_7909();
      int[] var10000 = dar.abu();
      class_9424 axxx = (class_9424)a.method_58694(class_9334.field_50077);
      int[] axxxx = var10000;
      class_9424 var8 = axxx;
      if (axxxx != null) {
         if (axxx == null) {
            return null;
         }

         var8 = axxx;
      }

      var10000 = (int[])var8.comp_2498().stream();
      if (axxxx != null) {
         if (var10000.noneMatch(axxxxx -> {
            long axxxxxx = cwp.a ^ 1726914224685L;
            int[] var3x = dar.abu();
            boolean var10000x = axxxxx.comp_2503().isPresent();
            if (var3x != null) {
               if (!var10000x) {
                  return false;
               }

               var10000x = (Boolean)axxxxx.comp_2503().get();
            }

            return var3x == null ? var10000x : var10000x;
         })) {
            return null;
         }

         var10000 = (int[])a.method_58694(class_9334.field_55878);
      }

      class_10590 axxxxx = (class_10590)var10000;
      boolean var10 = axx instanceof class_1743;
      if (axxxx != null) {
         if (var10) {
            return hcp.Axe;
         }

         var10 = axx instanceof class_1794;
      }

      if (axxxx != null) {
         if (var10) {
            return hcp.Hoe;
         }

         var10 = axx instanceof class_1821;
      }

      if (axxxx != null) {
         if (var10) {
            return hcp.Shovel;
         }

         var10 = axx instanceof class_1820;
      }

      if (var10) {
         return hcp.Shears;
      } else {
         class_10590 var11 = axxxxx;
         if (axxxx != null) {
            if (axxxxx == null) {
               return null;
            }

            var11 = axxxxx;
         }

         int axxxxxx = var11.comp_3481();
         int var12 = axxxxxx;
         byte var10001 = 2;
         if (axxxx != null) {
            if (axxxxxx == 2) {
               return hcp.Pickaxe;
            }

            var12 = axxxxxx;
            var10001 = 1;
         }

         return var12 == var10001 ? hcp.Sword : null;
      }
   }

   public static boolean gvl(class_1799 itemStack) {
      long ax = cwp.a ^ 130500206570239L;
      int[] var10000 = dar.abu();
      class_10192 axx = (class_10192)a.method_58694(class_9334.field_54196);
      int[] axxx = var10000;
      class_10192 var5 = axx;
      if (axxx != null) {
         if (axx == null) {
            return false;
         }

         var5 = axx;
      }

      return var5.comp_3174().method_5925() == class_1305.field_6178;
   }

   public static int bzt(class_1799 itemStack) {
      long ax = cwp.a ^ 111135477460683L;
      int[] var10000 = dar.abu();
      int axx = 0;
      Iterator var5 = ((class_9285)a.method_58695(class_9334.field_49636, class_9285.field_49326)).comp_2393().iterator();
      int[] axxx = var10000;

      while (var5.hasNext()) {
         label27: {
            class_9287 axxxx = (class_9287)var5.next();
            class_9287 var7 = axxxx;
            if (axxx != null) {
               if (axxxx.comp_2395() != class_5134.field_23724) {
                  break label27;
               }

               var7 = axxxx;
            }

            if (var7.comp_2396().comp_2450() == class_1323.field_6328) {
               axx += (int)axxxx.comp_2396().comp_2449();
               if (axxx != null) {
                  break;
               }
            }
         }

         if (axxx == null) {
            break;
         }
      }

      return axx;
   }

   public static float fsw(class_1799 itemStack) {
      long ax = cwp.a ^ 39912462180996L;
      short var10001 = 6706;
      long var10002 = 5881014513754064343L ^ ax;
      float axx = 20.0F * (25 - bzt(a)) / 25.0F;
      int[] var10000 = dar.abu();
      int axxx = 0;
      int[] axxxx = var10000;
      Iterator var6 = a.method_58657().method_57539().iterator();

      while (true) {
         if (var6.hasNext()) {
            Entry<class_6880<class_1887>> axxxxx = (Entry<class_6880<class_1887>>)var6.next();
            var11 = ((class_6880)axxxxx.getKey()).method_40225(class_1893.field_9111);
            if (axxxx == null) {
               break;
            }

            label75: {
               if (axxxx != null) {
                  if (var11 == 0) {
                     break label75;
                  }

                  var11 = axxxxx.getIntValue();
               }

               int axxxxxx = var11;
               short var12 = 367;
               long var14 = 5404457736760385160L ^ ax;
               float axxxxxxx = (6 + axxxxxx * axxxxxx) / 3.0F * 0.75F;
               int axxxxxxxx = (int)axxxxxxx;
               float var15;
               int var13 = (var15 = axxxxxxx - axxxxxxxx) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
               if (axxxx != null) {
                  if (var13 < 0) {
                     axxxxxxxx--;
                  }

                  var13 = axxx + axxxxxxxx;
               }

               axxx = var13;
            }

            if (axxxx != null) {
               continue;
            }
         }

         var11 = axxx;
         break;
      }

      label56: {
         label76: {
            if (axxxx != null) {
               if (var11 > a<"p">(12169, 5545812246706286699L ^ ax)) {
                  axxx = a<"p">(12169, 5545812246706286699L ^ ax);
                  if (axxxx != null) {
                     break label76;
                  }
               }

               var11 = axxx;
            }

            if (axxxx == null) {
               break label56;
            }

            if (var11 < 0) {
               axxx = 0;
            }
         }

         axxx = axxx + 1 >> 1;
         var11 = axxx;
      }

      if (var11 > 0) {
         axx = axx * (a<"p">(12169, 5545812246706286699L ^ ax) - axxx) / 25.0F;
      }

      return axx;
   }

   public static float ept(class_1799 itemStack) {
      long ax = cwp.a ^ 79988925092350L;
      int[] var10000 = dar.abu();
      float axx = Optional.ofNullable((class_9424)a.method_58694(class_9334.field_50077)).map(axxx -> axxx.comp_2498().stream().filter(axxxx -> {
         long axxxxx = cwp.a ^ 126770399731966L;
         int[] var3x = dar.abu();
         boolean var10000x = axxxx.comp_2503().isPresent();
         if (var3x != null) {
            if (!var10000x) {
               return false;
            }

            var10000x = (Boolean)axxxx.comp_2503().get();
         }

         if (var3x != null) {
            if (!var10000x) {
               return false;
            }

            var10000x = axxxx.comp_2502().isPresent();
         }

         return var3x == null ? var10000x : var10000x;
      }).map(axxxx -> (Float)axxxx.comp_2502().get()).findAny().orElse(0.0F)).orElse(0.0F);
      int[] axxx = var10000;
      float var6 = axx;
      if (axxx != null) {
         if (axx > 1.0F) {
            Optional<Integer> axxxx = a.method_58657()
               .method_57539()
               .stream()
               .filter(axxxxx -> ((class_6880)axxxxx.getKey()).method_40225(class_1893.field_9131))
               .<Integer>map(Entry::getIntValue)
               .max(Comparator.comparingInt(axxxxx -> axxxxx));
            if (axxxx.isPresent()) {
               axx += class_3532.method_34954(axxxx.get()) + 1;
            }
         }

         var6 = axx;
      }

      return var6;
   }

   public static double dw(class_1799 itemStack) {
      long ax = cwp.a ^ 87171128751661L;
      int[] var10000 = dar.abu();
      float axx = 0.0F;
      Iterator axxx = ((class_9285)a.method_58695(class_9334.field_49636, class_9285.field_49326)).comp_2393().iterator();
      int[] axxxx = var10000;

      while (axxx.hasNext()) {
         label92: {
            class_9287 axxxxx = (class_9287)axxx.next();
            class_9287 var10 = axxxxx;
            if (axxxx != null) {
               if (axxxxx.comp_2395() != class_5134.field_23721) {
                  break label92;
               }

               var10 = axxxxx;
            }

            if (axxxx != null) {
               if (var10.comp_2397() != class_9274.field_49217) {
                  break label92;
               }

               var10 = axxxxx;
            }

            class_1322 var11 = var10.comp_2396();
            if (axxxx != null) {
               if (var11.comp_2447() != class_1792.field_8006) {
                  break label92;
               }

               var11 = axxxxx.comp_2396();
            }

            if (axxxx != null) {
               if (var11.comp_2450() != class_1323.field_6328) {
                  break label92;
               }

               var11 = axxxxx.comp_2396();
            }

            axx = (float)var11.comp_2449();
            if (axxxx != null) {
               break;
            }
         }

         if (axxxx == null) {
            break;
         }
      }

      float axxxxxx = 0.0F;

      for (Entry<class_6880<class_1887>> axxxxxxx : a.method_58657().method_57539()) {
         label55: {
            int var12 = ((class_6880)axxxxxxx.getKey()).method_40225(class_1893.field_9118);
            if (axxxx != null) {
               if (var12 == 0) {
                  break label55;
               }

               var12 = axxxxxxx.getIntValue();
            }

            axxxxxx = var12 * 1.25F;
            if (axxxx != null) {
               break;
            }
         }

         if (axxxx == null) {
            break;
         }
      }

      return axx + axxxxxx;
   }

   public static boolean cxo(class_1735 slot, class_1735 slotO) {
      long ax = cwp.a ^ 30672606068927L;
      int[] var10000 = dar.abu();
      class_1799 axx = a.method_7677();
      int[] axxx = var10000;
      class_1799 axxxx = a.method_7677();
      int axxxxx = axx.method_7919();
      int axxxxxx = axxxx.method_7919();
      int var15 = axxxxx;
      if (axxx != null) {
         var15 = axxxxx == axxxxxx ? 1 : 0;
      }

      boolean axxxxxxx;
      hcp axxxxxxxx;
      hcp axxxxxxxxx;
      label230: {
         label229: {
            axxxxxxx = (boolean)var15;
            axxxxxxxx = bos(axx);
            axxxxxxxxx = bos(axxxx);
            hcp var16 = axxxxxxxx;
            hcp var10001 = hcp.Sword;
            if (axxx != null) {
               if (axxxxxxxx != hcp.Sword) {
                  break label229;
               }

               var16 = axxxxxxxxx;
               var10001 = hcp.Sword;
            }

            if (var16 == var10001) {
               double[] axxxxxxxxxx = new double[]{dw(axx), dw(axxxx)};
               double var29;
               var17 = (var29 = axxxxxxxxxx[0] - axxxxxxxxxx[1]) == 0.0 ? 0 : (var29 < 0.0 ? -1 : 1);
               if (axxx != null) {
                  if (var17 != 0) {
                     double var30;
                     int var18 = (var30 = axxxxxxxxxx[0] - axxxxxxxxxx[1]) == 0.0 ? 0 : (var30 < 0.0 ? -1 : 1);
                     if (axxx != null) {
                        var18 = var18 > 0 ? 1 : 0;
                     }

                     return (boolean)var18;
                  }

                  var17 = axxxxxxx;
               }

               if (axxx == null) {
                  break label230;
               }

               if (var17 != 0) {
                  var17 = a.field_7874;
                  if (axxx == null) {
                     break label230;
                  }

                  short var25 = 5421;
                  long var10002 = 7002312950616500464L ^ ax;
                  if (a.field_7874 == 36) {
                     return true;
                  }
               }
            }
         }

         var17 = gvl(axx);
      }

      label236: {
         if (axxx != null) {
            if (var17 == 0) {
               break label236;
            }

            var17 = gvl(axxxx);
         }

         if (axxx != null) {
            if (var17 == 0) {
               break label236;
            }

            var17 = 2;
         }

         double[] var19 = new double[var17];
         var19[0] = fsw(axx);
         var19[1] = fsw(axxxx);
         double[] axxxxxxxxxxx = var19;
         double var31;
         int var20 = (var31 = axxxxxxxxxxx[0] - axxxxxxxxxxx[1]) == 0.0 ? 0 : (var31 < 0.0 ? -1 : 1);
         if (axxx != null) {
            if (var20 != 0) {
               double var32;
               int var21 = (var32 = axxxxxxxxxxx[0] - axxxxxxxxxxx[1]) == 0.0 ? 0 : (var32 < 0.0 ? -1 : 1);
               if (axxx != null) {
                  var21 = var21 < 0 ? 1 : 0;
               }

               return (boolean)var21;
            }

            var20 = axxxxxxx;
         }

         if (axxx != null) {
            if (var20 == 0) {
               break label236;
            }

            var20 = a.field_7874;
         }

         if (axxx == null) {
            return (boolean)var20;
         }

         short var26 = 22621;
         long var28 = 532514951895246210L ^ ax;
         if (var20 < 9) {
            return (boolean)1;
         }
      }

      label192: {
         label238: {
            hcp var22 = axxxxxxxx;
            if (axxx != null) {
               if (axxxxxxxx == null) {
                  break label238;
               }

               var22 = axxxxxxxxx;
            }

            if (axxx != null) {
               if (var22 == null) {
                  break label238;
               }

               var22 = axxxxxxxx;
            }

            var23 = var22.gnc();
            if (axxx == null) {
               break label192;
            }

            if (var23 != 0) {
               var23 = axxxxxxxxx.gnc();
               if (axxx == null) {
                  break label192;
               }

               if (var23 != 0) {
                  double[] axxxxxxxxxxxx = new double[]{ept(axx), ept(axxxx)};
                  double var33;
                  var23 = (var33 = axxxxxxxxxxxx[0] - axxxxxxxxxxxx[1]) == 0.0 ? 0 : (var33 < 0.0 ? -1 : 1);
                  if (axxx != null) {
                     if (var23 != 0) {
                        double var34;
                        int var24 = (var34 = axxxxxxxxxxxx[0] - axxxxxxxxxxxx[1]) == 0.0 ? 0 : (var34 < 0.0 ? -1 : 1);
                        if (axxx != null) {
                           var24 = var24 > 0 ? 1 : 0;
                        }

                        return (boolean)var24;
                     }

                     var23 = axxxxxxx;
                  }

                  if (axxx == null) {
                     break label192;
                  }

                  if (var23 != 0) {
                     int var35 = a.field_7874;
                     int var27 = a<"p">(9557, 9105485325104748685L ^ ax) + axxxxxxxx.ckz();
                     if (axxx == null) {
                        return (boolean)(var35 < var27 ? 1 : 0);
                     }

                     if (var35 == var27) {
                        return true;
                     }
                  }
               }
            }
         }

         var23 = axxxxx;
      }

      if (axxx == null) {
         return (boolean)var23;
      } else {
         return (boolean)(var23 < axxxxxx ? 1 : 0);
      }
   }

   public static cxs dwm(List<class_1735> slots) {
      List<class_1735> ax = new ArrayList<>();
      class_1735[] axx = new class_1735[1];
      class_1735[] axxx = new class_1735[4];
      class_1735[] axxxx = new class_1735[3];
      a.stream()
         .filter(class_1735::method_7681)
         .forEach(
            axxxxxxxxxxxxxx -> {
               int[] ax;
               class_1799 ax;
               class_1792 axxxxxxx;
               hcp axxxx;
               long axxxxxxxx = cwp.a ^ 102944967830772L;
               ax = axxxxxxxxxxxxxx.method_7677();
               axxxxxxx = ax.method_7909();
               int[] var10000 = dar.abu();
               axxxx = bos(ax);
               ax = var10000;
               label233:
               if (axxxx == hcp.Sword) {
                  label230: {
                     byte var10001;
                     label236: {
                        class_1735 var16 = a[0];
                        if (ax != null) {
                           if (var16 != null) {
                              boolean var17 = cxo(axxxxxxxxxxxxxx, a[0]);
                              if (ax == null) {
                                 break label233;
                              }

                              if (!var17) {
                                 break label230;
                              }
                           }

                           var18 = a;
                           var10001 = 0;
                           if (ax == null) {
                              break label236;
                           }

                           var16 = a[0];
                        }

                        if (var16 != null) {
                           a.add(a[0]);
                        }

                        var18 = a;
                        var10001 = 0;
                     }

                     var18[var10001] = axxxxxxxxxxxxxx;
                     if (ax != null) {
                        break label233;
                     }
                  }

                  a.add(axxxxxxxxxxxxxx);
               }

               label244: {
                  var10000 = (int[])ax;
                  if (ax != null) {
                     if (!gvl(ax)) {
                        break label244;
                     }

                     var10000 = (int[])ax.method_58694(class_9334.field_54196);
                  }

                  label208: {
                     class_10192 axxxxxxxxx = (class_10192)var10000;
                     class_10192 var20 = axxxxxxxxx;
                     if (ax != null) {
                        if (axxxxxxxxx == null) {
                           var21 = -1;
                           break label208;
                        }

                        var20 = axxxxxxxxx;
                     }

                     var21 = var20.comp_3174().method_5927();
                  }

                  label239: {
                     int axxxxxx = var21;
                     class_1735 axxxxxxxxx = a[axxxxxx];
                     class_1735 var22 = axxxxxxxxx;
                     if (ax != null) {
                        if (axxxxxxxxx != null) {
                           boolean var23 = cxo(axxxxxxxxxxxxxx, axxxxxxxxx);
                           if (ax == null) {
                              break label244;
                           }

                           if (!var23) {
                              break label239;
                           }
                        }

                        var22 = axxxxxxxxx;
                     }

                     if (var22 != null) {
                        a.add(axxxxxxxxx);
                     }

                     a[axxxxxx] = axxxxxxxxxxxxxx;
                     if (ax != null) {
                        break label244;
                     }
                  }

                  a.add(axxxxxxxxxxxxxx);
               }

               label188: {
                  label240: {
                     hcp var24 = axxxx;
                     if (ax != null) {
                        if (axxxx == null) {
                           break label240;
                        }

                        var24 = axxxx;
                     }

                     var25 = var24.gnc();
                     if (ax == null) {
                        break label188;
                     }

                     if (var25) {
                        int axxxxxxxx = axxxx.ckz();
                        label179:
                        if (ax != null) {
                           if (axxxxxxxx >= 0) {
                              label174: {
                                 label242: {
                                    class_1735 axxxxxxxxxxxxx = a[axxxxxxxx];
                                    class_1735 var26 = axxxxxxxxxxxxx;
                                    if (ax != null) {
                                       if (axxxxxxxxxxxxx != null) {
                                          boolean var27 = cxo(axxxxxxxxxxxxxx, axxxxxxxxxxxxx);
                                          if (ax == null) {
                                             break label174;
                                          }

                                          if (!var27) {
                                             break label242;
                                          }
                                       }

                                       var26 = axxxxxxxxxxxxx;
                                    }

                                    if (var26 != null) {
                                       a.add(axxxxxxxxxxxxx);
                                    }

                                    a[axxxxxxxx] = axxxxxxxxxxxxxx;
                                    if (ax != null) {
                                       break label174;
                                    }
                                 }

                                 a.add(axxxxxxxxxxxxxx);
                              }

                              if (ax != null) {
                                 break label179;
                              }
                           }

                           a.add(axxxxxxxxxxxxxx);
                        }
                     }
                  }

                  var25 = axxxxxxx instanceof class_1826;
               }

               if (ax != null
                  && (
                     var25
                        || ax != null
                           && (
                              axxxxxxx instanceof class_1786
                                 || ax != null
                                    && (
                                       axxxxxxx instanceof class_1779
                                          || ax != null
                                             && (
                                                axxxxxxx instanceof class_1759
                                                   || ax != null && (axxxxxxx instanceof class_1755 || axxxxxxx == class_1802.field_8428)
                                             )
                                    )
                           )
                  )) {
                  a.add(axxxxxxxxxxxxxx);
               }
            }
         );
      return new cxs(ax, axx, axxx, axxxx);
   }

   public static void gmh(int index, int button, class_1713 type) {
      long ax = cwp.a ^ 18548511318529L;
      int[] var5 = dar.abu();
      class_310 var10000 = chi;
      if (var5 != null) {
         if (chi.field_1761 == null) {
            return;
         }

         var10000 = chi;
      }

      if (var5 != null) {
         if (var10000.field_1724 == null) {
            return;
         }

         var10000 = chi;
      }

      var10000.field_1761.method_2906(chi.field_1724.field_7512.field_7763, a, a, a, chi.field_1724);
   }

   static {
      long var0 = a ^ 14029539059221L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[6];
      int var5 = 0;
      String var6 = "\u007f2\u009bµ%ÕsSÊ>ðØ\u0098íÅØN¸4ÍÑ¹½ñHQ/\u0018è\u0089\u008cÖ";
      int var7 = "\u007f2\u009bµ%ÕsSÊ>ðØ\u0098íÅØN¸4ÍÑ¹½ñHQ/\u0018è\u0089\u008cÖ".length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
            byte[] var12 = var2.doFinal(
               new byte[]{
                  (byte)(var10 >>> 56),
                  (byte)(var10 >>> 48),
                  (byte)(var10 >>> 40),
                  (byte)(var10 >>> 32),
                  (byte)(var10 >>> 24),
                  (byte)(var10 >>> 16),
                  (byte)(var10 >>> 8),
                  (byte)var10
               }
            );
            long var21 = (var12[0] & 255L) << 56
               | (var12[1] & 255L) << 48
               | (var12[2] & 255L) << 40
               | (var12[3] & 255L) << 32
               | (var12[4] & 255L) << 24
               | (var12[5] & 255L) << 16
               | (var12[6] & 255L) << 8
               | var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "\u0004Ø9pM·ÍØE7ÔÀÞç½\u009d";
                  var7 = "\u0004Ø9pM·ÍØE7ÔÀÞç½\u009d".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = (var9[0] & 255L) << 56
               | (var9[1] & 255L) << 48
               | (var9[2] & 255L) << 40
               | (var9[3] & 255L) << 32
               | (var9[4] & 255L) << 24
               | (var9[5] & 255L) << 16
               | (var9[6] & 255L) << 8
               | var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12270;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/cwp", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
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
         throw new RuntimeException("cc/astralis/cwp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
