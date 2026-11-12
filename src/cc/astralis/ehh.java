package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1268;
import net.minecraft.class_2244;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2742;
import net.minecraft.class_2846;
import net.minecraft.class_2868;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_2350.class_2353;
import net.minecraft.class_2846.class_2847;

public class ehh extends guu {
   private final bes asm;
   private final gbp ghd;
   private final gbp ej;
   private final gbp amp;
   private class_2338 gzm;
   private boolean dhu;
   public boolean asx;
   public final gcs gdd;
   private static final long a = 115823253240788L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public ehh() {
      long a = ehh.a ^ 82241625146415L;
      super(bfm.WORLD);
      short var10003 = 9896;
      long var10004 = 4334275524495057927L ^ a;
      a.asm = new bes("Break Range", 5.5F, 1.0F, 6.0F, 0.5F);
      var10003 = 20527;
      var10004 = 341002767938376327L ^ a;
      a.ghd = new gbp("Rotate", true);
      var10003 = 6192;
      var10004 = 5067548009474497181L ^ a;
      a.ej = new gbp("Break Block surrounding", true);
      var10003 = 1497;
      var10004 = 7169687091015190389L ^ a;
      a.amp = new gbp("Keep Rotation", false);
      a.asx = false;
      a.gdd = new gcs();
      a.bfi(new ffn[]{a.asm, a.ghd, a.ej, a.amp});
   }

   @Override
   public void auj() {
      a.dhu = false;
      a.gdd.glu();
      a.asx = false;
      super.auj();
   }

   @Override
   public void frg() {
      long a = ehh.a ^ 117243917036864L;
      int[] var3 = dar.abu();
      if (var3 != null) {
         gcs var10000;
         label65: {
            if (chi.field_1724 != null) {
               var10000 = a.gdd;
               if (var3 == null) {
                  break label65;
               }

               if (a.gdd.dsv) {
                  label70: {
                     class_2338 var4 = a.gdd.ack;
                     if (var3 != null) {
                        if (a.gdd.ack != null) {
                           chi.field_1687.method_8517(chi.field_1724.method_5628(), a.gdd.ack, -1);
                           a.fkj(a.gdd.ack, a.gdd.alr);
                        }

                        var10000 = a.gdd;
                        if (var3 == null) {
                           break label70;
                        }

                        var4 = a.gdd.bzj;
                     }

                     if (var4 != null) {
                        a.fkj(a.gdd.bzj, a.gdd.gdn);
                     }

                     var10000 = a.gdd;
                  }

                  if (var3 == null) {
                     break label65;
                  }

                  if (var10000.dyk != -1) {
                     var10000 = a.gdd;
                     if (var3 == null) {
                        break label65;
                     }

                     if (a.gdd.dyk != chi.field_1724.method_31548().method_67532()) {
                        gix.eex(new class_2868(a.gdd.dyk));
                        chi.field_1724.method_31548().method_61496(a.gdd.dyk);
                     }
                  }
               }
            }

            var10000 = a.gdd;
         }

         var10000.glu();
         a.asx = false;
         gxk.hil();
         super.frg();
      }
   }

   @gdz
   public void fjw(amo event) {
      int[] ax;
      class_2596 var6;
      label58: {
         long axx = ehh.a ^ 91257612064151L;
         ax = dar.abu();
         boolean var10000 = a.gdd.dsv;
         if (ax != null) {
            if (!a.gdd.dsv) {
               return;
            }

            var6 = a.bed();
            if (ax == null) {
               break label58;
            }

            var10000 = var6 instanceof class_2846;
         }

         if (!var10000) {
            return;
         }

         var6 = a.bed();
      }

      label60: {
         class_2846 axxx = (class_2846)var6;
         class_2847 var7 = axxx.method_12363();
         class_2847 var10001 = class_2847.field_12968;
         if (ax != null) {
            if (var7 == class_2847.field_12968) {
               break label60;
            }

            var7 = axxx.method_12363();
            var10001 = class_2847.field_12971;
         }

         if (ax != null) {
            if (var7 == var10001) {
               break label60;
            }

            var7 = axxx.method_12363();
            var10001 = class_2847.field_12973;
         }

         if (var7 != var10001) {
            return;
         }
      }

      a.gmm(true);
   }

   @gdz
   public void dni(dgk event) {
      a.dhu = false;
   }

   @gdz
   public void dao(fnt event) {
      long ax = ehh.a ^ 45179422147563L;
      int[] axx = dar.abu();
      if (a.cud() != gpy.POST) {
         class_310 var10000 = chi;
         if (axx != null) {
            if (chi.field_1724 == null) {
               return;
            }

            var10000 = chi;
         }

         label281: {
            label280: {
               label286: {
                  gcs var10 = var10000.field_1687;
                  if (axx != null) {
                     if (var10000.field_1687 == null) {
                        return;
                     }

                     var11 = a;
                     if (axx == null) {
                        break label286;
                     }

                     var10 = a.ghd.dnp();
                  }

                  if ((Boolean)var10) {
                     var11 = a;
                     if (axx == null) {
                        break label286;
                     }

                     if (a.amp.dnp()) {
                        var12 = a.gdd;
                        if (axx == null) {
                           break label280;
                        }

                        if (a.gdd.dsv) {
                           label266: {
                              var10 = a.gdd;
                              if (axx != null) {
                                 if (a.gdd.bzj != null) {
                                    var10 = a.gdd.bzj;
                                    break label266;
                                 }

                                 var10 = a.gdd;
                              }

                              var10 = var10.ack;
                           }

                           class_2338 axxx = (class_2338)var10;
                           var15 = axxx;
                           if (axx == null) {
                              break label281;
                           }

                           if (axxx != null) {
                              float[] axxxx = a.fwy(axxx);
                              dqq.edu(axxxx[0], axxxx[1], 180.0F, 180.0F);
                              a.asx = true;
                           }
                        }
                     }
                  }

                  var11 = a;
               }

               var12 = var11.gdd;
            }

            var15 = var12.ack;
         }

         label245: {
            label301: {
               label243:
               if (axx != null) {
                  if (var15 == null) {
                     class_2338 axxxx = a.bcm(chi.field_1724.method_24515(), (int)a.asm.dnp().floatValue());
                     var15 = axxxx;
                     if (axx == null) {
                        break label243;
                     }

                     label239:
                     if (axxxx != null) {
                        class_2680 axxxxx = chi.field_1687.method_8320(axxxx);
                        class_2680 var16 = axxxxx;
                        if (axx != null) {
                           if (!(axxxxx.method_26204() instanceof class_2244)) {
                              break label239;
                           }

                           a.gdd.ack = axxxx;
                           var16 = axxxxx;
                        }

                        label231: {
                           class_2338 axxxxxx = var16.method_11654(class_2244.field_9967) == class_2742.field_12560
                              ? axxxx.method_10093(((class_2350)axxxxx.method_11654(class_2244.field_11177)).method_10153())
                              : axxxx.method_10093((class_2350)axxxxx.method_11654(class_2244.field_11177));
                           var17 = a;
                           label230:
                           if (axx != null) {
                              if (a.cll(axxxx)) {
                                 var17 = a;
                                 if (axx == null) {
                                    break label230;
                                 }

                                 if (a.cll(axxxxxx)) {
                                    var17 = a;
                                    if (axx == null) {
                                       break label230;
                                    }

                                    if (a.ej.dnp()) {
                                       a.gdd.bzj = a.axa(axxxx, axxxxxx);
                                       if (axx != null) {
                                          break label231;
                                       }
                                    }
                                 }
                              }

                              var17 = a;
                           }

                           var17.gdd.bzj = null;
                        }

                        a.gdd.ddc = 0;
                     }
                  }

                  var18 = a.gdd;
                  if (axx == null) {
                     break label301;
                  }

                  var15 = a.gdd.ack;
               }

               if (var15 != null) {
                  var19 = chi.field_1687.method_8320(a.gdd.ack).method_26215();
                  if (axx == null) {
                     break label245;
                  }

                  if (var19 == 0) {
                     double var23;
                     var19 = (
                              var23 = a.asm.dnp().floatValue() * 10.0F
                                 - chi.field_1724
                                    .method_73189()
                                    .method_1022(new class_243(a.gdd.ack.method_10263() + 0.5, a.gdd.ack.method_10264(), a.gdd.ack.method_10260() + 0.5))
                           )
                           == 0.0
                        ? 0
                        : (var23 < 0.0 ? -1 : 1);
                     if (axx == null) {
                        break label245;
                     }

                     if (var19 >= 0) {
                        label294: {
                           label209: {
                              a.gdd.dsv = true;
                              gcs var20 = a.gdd;
                              if (axx != null) {
                                 if (a.gdd.bzj != null) {
                                    var21 = chi.field_1687.method_8320(a.gdd.bzj).method_26215();
                                    if (axx == null) {
                                       break label209;
                                    }

                                    if (var21 == 0) {
                                       double var24;
                                       var21 = (
                                                var24 = a.asm.dnp().floatValue() * 10.0F
                                                   - chi.field_1724
                                                      .method_73189()
                                                      .method_1022(
                                                         new class_243(a.gdd.bzj.method_10263() + 0.5, a.gdd.bzj.method_10264(), a.gdd.bzj.method_10260() + 0.5)
                                                      )
                                             )
                                             == 0.0
                                          ? 0
                                          : (var24 < 0.0 ? -1 : 1);
                                       if (axx == null) {
                                          break label209;
                                       }

                                       if (var21 >= 0) {
                                          a.ham(a.gdd.bzj, true);
                                          if (axx != null) {
                                             return;
                                          }
                                       }
                                    }
                                 }

                                 var22 = a;
                                 if (axx == null) {
                                    break label294;
                                 }

                                 var20 = a.gdd;
                              }

                              var21 = var20.gdn;
                           }

                           if (var21 != 0) {
                              var22 = a;
                              if (axx == null) {
                                 break label294;
                              }

                              if (a.gdd.bzj != null) {
                                 a.fkj(a.gdd.bzj, false);
                                 a.gdd.bzj = null;
                                 a.gdd.gdn = false;
                                 a.gdd.ddc = 0;
                              }
                           }

                           var22 = a;
                        }

                        var22.ham(a.gdd.ack, false);
                        if (axx != null) {
                           return;
                        }
                     }
                  }
               }

               var18 = a.gdd;
            }

            var19 = var18.dsv;
         }

         if (axx != null) {
            if (var19 == 0) {
               return;
            }

            a.fkj(a.gdd.bzj, true);
            a.fkj(a.gdd.ack, true);
            a.gdd.glu();
            var19 = a.gdd.dyk;
         }

         if (var19 != -1 && chi.field_1724 != null && a.gdd.dyk != chi.field_1724.method_31548().method_67532()) {
            gix.eex(new class_2868(a.gdd.dyk));
            chi.field_1724.method_31548().method_61496(a.gdd.dyk);
         }
      }
   }

   private void ham(class_2338 a, boolean a) {
      long ax = ehh.a ^ 128121266005640L;
      int[] axx = dar.abu();
      class_310 var10000 = chi;
      if (axx != null) {
         if (chi.field_1724 == null) {
            return;
         }

         var10000 = chi;
      }

      if (var10000.field_1687 != null) {
         label115: {
            ehh var10 = a;
            if (axx != null) {
               a.enn(a);
               if (a) {
                  var11 = a.gdd.gdn;
                  break label115;
               }

               var10 = a;
            }

            var11 = var10.gdd.alr;
         }

         boolean axxx = var11;
         String var13;
         if (a) {
            short var12 = 14006;
            long var10001 = 6678002971635488440L ^ ax;
            var13 = "Support";
         } else {
            short var14 = 8984;
            long var19 = 8900979591655686929L ^ ax;
            var13 = "Bed";
         }

         short var20 = 19720;
         long var10002 = 2228289552209898766L ^ ax;
         String axxxx = "Breaking: " + var13;
         if (axx != null) {
            if (!axxx) {
               a.gdd.agx = bav.faa(a, chi.field_1724.method_6047());
               a.gdd.ddc = 0;
               String var15 = String.valueOf(a);
               short var21 = 8631;
               long var10003 = 6692314996161872314L ^ ax;
               short var22 = 25710;
               long var10004 = 885972144065430626L ^ ax;
               bpa.bez("Starting break: " + var15 + " | Max ticks: " + a.gdd.agx);
            }

            gxk.fcv(axxxx);
         }

         float axxxxx;
         label125: {
            axxxxx = Math.min(1.0F, a.gdd.ddc / a.gdd.agx);
            gxk.gbu(axxxx, axxxxx);
            boolean var16 = axxx;
            if (axx != null) {
               if (!axxx) {
                  var17 = a.ghd.dnp();
                  label102:
                  if (axx != null) {
                     if (var17) {
                        var17 = a.amp.dnp();
                        if (axx == null) {
                           break label102;
                        }

                        if (!var17) {
                           float[] axxxxxx = a.fwy(a);
                           dqq.edu(axxxxxx[0], axxxxxx[1], 180.0F, 180.0F);
                           a.asx = true;
                        }
                     }

                     gix.eex(new class_2846(class_2847.field_12968, a, class_2350.field_11036));
                     var17 = a.amp.dnp();
                  }

                  if (axx != null) {
                     if (!var17) {
                        a.asx = false;
                     }

                     var17 = a;
                  }

                  if (var17) {
                     a.gdd.gdn = true;
                     if (axx != null) {
                        return;
                     }
                  }

                  a.gdd.alr = true;
                  if (axx != null) {
                     return;
                  }
               }

               var18 = chi.field_1687;
               if (axx == null) {
                  break label125;
               }

               var16 = chi.field_1687.method_8320(a).method_26215();
            }

            if (!var16) {
               a.gdd.ddc++;
            }

            a.ejp(new class_3965(new class_243(a.method_10263() + 0.5, a.method_10264(), a.method_10260() + 0.5), class_2350.field_11036, a, false));
            var18 = chi.field_1687;
         }

         var18.method_8517(chi.field_1724.method_5628(), a, (int)(axxxxx * 10.0F));
      }
   }

   private void fkj(class_2338 a, boolean a) {
      long ax = ehh.a ^ 65597726125656L;
      int[] axx = dar.abu();
      if (a != null) {
         class_310 var10000 = chi;
         if (axx != null) {
            if (chi.field_1724 == null) {
               return;
            }

            var10000 = chi;
         }

         label84: {
            label95: {
               class_638 var7 = var10000.field_1687;
               if (axx != null) {
                  if (var10000.field_1687 == null) {
                     return;
                  }

                  gxk.hil();
                  if (axx == null) {
                     break label95;
                  }

                  var7 = chi.field_1687;
               }

               if (var7.method_8320(a).method_26215()) {
                  var8 = a.ghd.dnp();
                  label74:
                  if (axx != null) {
                     if (var8) {
                        var8 = a.amp.dnp();
                        if (axx == null) {
                           break label74;
                        }

                        if (!var8) {
                           float[] axxx = a.fwy(a);
                           dqq.edu(axxx[0], axxx[1], 180.0F, 180.0F);
                           a.asx = true;
                        }
                     }

                     gix.eex(new class_2846(class_2847.field_12973, a, class_2350.field_11036));
                     var8 = a.amp.dnp();
                  }

                  if (axx != null) {
                     if (!var8) {
                        a.asx = false;
                     }

                     chi.field_1724.method_6104(class_1268.field_5808);
                     chi.field_1761.method_2899(a);
                  }

                  if (axx != null) {
                     break label84;
                  }
               }

               gix.eex(new class_2846(class_2847.field_12971, a, class_2350.field_11036));
            }

            a.asx = false;
         }

         if (a) {
            a.gdd.ddc = 0;
            a.gdd.agx = 0.0F;
         }
      }
   }

   private class_2338 bcm(class_2338 a, int a) {
      long ax = ehh.a ^ 122153907694199L;
      class_2338 axx = null;
      int[] var10000 = dar.abu();
      double axxx = Double.MAX_VALUE;
      int[] axxxx = var10000;
      int axxxxx = -a;

      label77:
      while (true) {
         int var16 = axxxxx;

         label75:
         while (var16 <= a) {
            int axxxxxx = -a;

            label72:
            while (true) {
               int var17 = axxxxxx;

               label70:
               while (true) {
                  if (var17 > a) {
                     break label72;
                  }

                  var16 = -a;
                  if (axxxx == null) {
                     continue label75;
                  }

                  int axxxxxxx = var16;

                  while (axxxxxxx <= a) {
                     class_2338 axxxxxxxx = a.method_10069(axxxxx, axxxxxx, axxxxxxx);
                     class_2680 axxxxxxxxx = chi.field_1687.method_8320(axxxxxxxx);
                     label64:
                     if (axxxx != null) {
                        var17 = axxxxxxxxx.method_26204() instanceof class_2244;
                        if (axxxx == null) {
                           continue label70;
                        }

                        if (var17 != 0) {
                           double axxxxxxxxxx = chi.field_1724
                              .method_73189()
                              .method_1022(new class_243(axxxxxxxx.method_10263() + 0.5, axxxxxxxx.method_10264() + 0.5, axxxxxxxx.method_10260() + 0.5));
                           if (axxxx == null) {
                              break label64;
                           }

                           label59:
                           if (axxxxxxxxxx < axxx) {
                              double var18 = a.asm.dnp().floatValue() * 10.0F;
                              if (axxxx != null) {
                                 if (!(var18 >= axxxxxxxxxx)) {
                                    break label59;
                                 }

                                 var18 = axxxxxxxxxx;
                              }

                              axxx = var18;
                              axx = axxxxxxxx;
                           }
                        }

                        axxxxxxx++;
                     }

                     if (axxxx == null) {
                        break;
                     }
                  }

                  axxxxxx++;
                  if (axxxx == null) {
                     break label72;
                  }
                  break;
               }
            }

            axxxxx++;
            if (axxxx == null) {
               return axx;
            }
            continue label77;
         }

         return axx;
      }
   }

   private class_2338 axa(class_2338 a, class_2338 a) {
      long ax = ehh.a ^ 5064342350702L;
      int[] var10000 = dar.abu();
      class_2338[] var10001 = new class_2338[e<"f">(3000, 7627687406845998569L ^ ax)];
      var10001[0] = a.method_10084();
      var10001[1] = a.method_10095();
      var10001[2] = a.method_10072();
      var10001[3] = a.method_10078();
      var10001[4] = a.method_10067();
      var10001[5] = a.method_10084();
      var10001[e<"f">(32654, 4675488387251716573L ^ ax)] = a.method_10095();
      var10001[e<"f">(22515, 3379150607648680356L ^ ax)] = a.method_10072();
      var10001[e<"f">(27532, 177423836830258652L ^ ax)] = a.method_10078();
      var10001[e<"f">(30, 1575126741365505612L ^ ax)] = a.method_10067();
      class_2338[] axx = var10001;
      int[] axxx = var10000;
      class_2338 axxxx = null;
      float axxxxx = Float.MAX_VALUE;
      double axxxxxx = Double.MAX_VALUE;
      List<class_2338> axxxxxxx = new ArrayList<>();
      class_2338[] var12 = axx;
      int axxxxxxxx = axx.length;
      int axxxxxxxxx = 0;

      while (axxxxxxxxx < axxxxxxxx) {
         class_2338 axxxxxxxxxx = var12[axxxxxxxxx];
         class_2680 axxxxxxxxxxx = chi.field_1687.method_8320(axxxxxxxxxx);
         if (axxx != null) {
            label84:
            if (!axxxxxxxxxxx.method_26215() && !(axxxxxxxxxxx.method_26204() instanceof class_2244)) {
               double axxxxxxxxxxxx;
               float axxxxxxxxxxxxx = bav.faa(axxxxxxxxxx, chi.field_1724.method_6047());
               axxxxxxxxxxxx = chi.field_1724
                  .method_73189()
                  .method_1022(new class_243(axxxxxxxxxx.method_10263() + 0.5, axxxxxxxxxx.method_10264() + 0.5, axxxxxxxxxx.method_10260() + 0.5));
               float var26;
               var23 = (var26 = axxxxxxxxxxxxx - axxxxx) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
               label91:
               if (axxx != null) {
                  if (var23 < 0) {
                     double var27;
                     var23 = (var27 = a.asm.dnp().floatValue() * 10.0F - axxxxxxxxxxxx) == 0.0 ? 0 : (var27 < 0.0 ? -1 : 1);
                     if (axxx == null) {
                        break label91;
                     }

                     if (var23 >= 0) {
                        axxxxx = axxxxxxxxxxxxx;
                        axxxxxxx.clear();
                        axxxxxxx.add(axxxxxxxxxx);
                        axxxxxx = axxxxxxxxxxxx;
                        if (axxx != null) {
                           break label84;
                        }
                     }
                  }

                  float var28;
                  var23 = (var28 = axxxxxxxxxxxxx - axxxxx) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
               }

               if (axxx != null) {
                  if (var23 != 0) {
                     break label84;
                  }

                  double var29;
                  var23 = (var29 = a.asm.dnp().floatValue() * 10.0F - axxxxxxxxxxxx) == 0.0 ? 0 : (var29 < 0.0 ? -1 : 1);
               }

               if (axxx != null) {
                  if (var23 < 0) {
                     break label84;
                  }

                  axxxxxxx.add(axxxxxxxxxx);
               }

               axxxxxx = Math.min(axxxxxx, axxxxxxxxxxxx);
            }

            axxxxxxxxx++;
         }

         if (axxx == null) {
            break;
         }
      }

      Iterator var20 = axxxxxxx.iterator();

      while (true) {
         if (var20.hasNext()) {
            var24 = (class_2338)var20.next();
            if (axxx == null) {
               break;
            }

            label61: {
               class_2338 axxxxxxxxxxxxxx = var24;
               double axxxxxxxxxxxxxxx = chi.field_1724
                  .method_73189()
                  .method_1022(new class_243(axxxxxxxxxxxxxx.method_10263() + 0.5, axxxxxxxxxxxxxx.method_10264() + 0.5, axxxxxxxxxxxxxx.method_10260() + 0.5));
               double var25 = axxxxxxxxxxxxxxx;
               if (axxx != null) {
                  if (!(axxxxxxxxxxxxxxx <= axxxxxx)) {
                     break label61;
                  }

                  var25 = axxxxxxxxxxxxxxx;
               }

               axxxxxx = var25;
               axxxx = axxxxxxxxxxxxxx;
            }

            if (axxx != null) {
               continue;
            }
         }

         var24 = axxxx;
         break;
      }

      return var24;
   }

   private void enn(class_2338 a) {
      long ax = ehh.a ^ 134604357294357L;
      int[] axx = dar.abu();
      class_310 var10000 = chi;
      if (axx != null) {
         if (chi.field_1724 == null) {
            return;
         }

         var10000 = chi;
      }

      if (var10000.field_1687 != null) {
         int axxx = 0;
         class_2680 axxxx = chi.field_1687.method_8320(a);
         int axxxxx = 0;

         while (true) {
            short var10001 = 10841;
            long var10002 = 4218699521653630580L ^ ax;
            if (axxxxx < 9) {
               float var11;
               var8 = (
                        var11 = chi.field_1724.method_31548().method_5438(axxxxx).method_7924(axxxx)
                           - chi.field_1724.method_31548().method_5438(axxx).method_7924(axxxx)
                     )
                     == 0.0F
                  ? 0
                  : (var11 < 0.0F ? -1 : 1);
               if (axx == null) {
                  break;
               }

               label62: {
                  if (axx != null) {
                     if (var8 <= 0) {
                        break label62;
                     }

                     var8 = axxxxx;
                  }

                  axxx = var8;
               }

               axxxxx++;
               if (axx != null) {
                  continue;
               }
            }

            var8 = axxx;
            break;
         }

         label52: {
            label79: {
               int var10 = chi.field_1724.method_31548().method_67532();
               if (axx != null) {
                  if (var8 == var10) {
                     return;
                  }

                  var9 = a.gdd;
                  if (axx == null) {
                     break label79;
                  }

                  var8 = a.gdd.dyk;
                  var10 = -1;
               }

               if (var8 != var10) {
                  break label52;
               }

               var9 = a.gdd;
            }

            var9.dyk = chi.field_1724.method_31548().method_67532();
         }

         chi.field_1724.method_31548().method_61496(axxx);
      }
   }

   private float[] fwy(class_2338 a) {
      double ax = a.method_10263() + 0.5 - chi.field_1724.method_23317();
      double axx = a.method_10264() + 0.5 - (chi.field_1724.method_23318() + chi.field_1724.method_18381(chi.field_1724.method_18376()));
      double axxx = a.method_10260() + 0.5 - chi.field_1724.method_23321();
      double axxxx = Math.sqrt(ax * ax + axxx * axxx);
      float axxxxx = chi.field_1724.method_36455() + class_3532.method_15393((float)(-Math.toDegrees(Math.atan2(axx, axxxx))) - chi.field_1724.method_36455());
      float axxxxxx = chi.field_1724.method_36454()
         + class_3532.method_15393((float)Math.toDegrees(Math.atan2(axxx, ax)) - 90.0F - chi.field_1724.method_36454());
      float[] axxxxxxx = new float[]{axxxxxx, axxxxx};
      float[] axxxxxxxx = new float[]{dqq.gwi(), dqq.bzj()};
      return dgq.ewm(axxxxxxx, axxxxxxxx);
   }

   private void ejp(class_3965 a) {
      long ax = ehh.a ^ 64513601166101L;
      int[] var10000 = dar.abu();
      class_2350 axx = a.method_17780();
      class_2338 axxx = a.method_17777();
      int[] axxxx = var10000;
      class_310 var7 = chi;
      if (axxxx != null) {
         if (!chi.field_1761.method_2902(axxx, axx)) {
            return;
         }

         var7 = chi;
      }

      var7.field_1724.method_6104(class_1268.field_5808);
   }

   private boolean cll(class_2338 a) {
      long ax = ehh.a ^ 127331631792200L;
      int[] axx = dar.abu();
      boolean var10000 = chi.field_1687.method_8320(a.method_10084()).method_26215();
      if (axx != null) {
         if (!var10000) {
            Iterator var5 = class_2353.field_11062.iterator();

            while (true) {
               if (var5.hasNext()) {
                  class_2350 axxx = (class_2350)var5.next();
                  var10000 = chi.field_1687.method_8320(a.method_10093(axxx)).method_26215();
                  if (axx == null) {
                     break;
                  }

                  if (axx == null) {
                     return var10000;
                  }

                  if (var10000) {
                     return false;
                  }

                  if (axx != null) {
                     continue;
                  }
               }

               var10000 = true;
               break;
            }

            return var10000;
         }

         var10000 = false;
      }

      return var10000;
   }

   static {
      long var11 = a ^ 83473401394046L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[9];
      int var18 = 0;
      String var17 = "6Bì\u009c>¾ï\u001dÛ\u0004#@²\u00ada±\u0010oåú®6ÇÚ[cspó\u0090ð:p ©ø\u007f\u008cÙ\u0013-\u0094b\u0005;§]\u0083Ç\u0000\u0089º\u0013QõdN ÈÐo><\\Û\u001b(A7Q í®Áªá(U\u009aË\u007fZÑ¯Ka4\fV!\u0004Ï×\u0000Pòrò\u0005ìµÄòä{Ý\\(Jà¡\u0013Uð³õ\u0005ô\u009a[\u0012åTé\\\u0091V½\u0093`B¡/\u0082\u008bûUÕ\u0001a·\u000b\u0095\u000bÒH\u001es\u0018Ï/\u000e=$|,ÝD\u0013\u0019Q<{\u0087\u00858Kw$ÑÖ-\\ ïb\u0007©Y\u001c\u0007\u0087¢Æ\u009aì\u0011ÃåUÌ\u000e$2iÉ\u001b'\u001e\fF\u0019M×]p";
      int var19 = "6Bì\u009c>¾ï\u001dÛ\u0004#@²\u00ada±\u0010oåú®6ÇÚ[cspó\u0090ð:p ©ø\u007f\u008cÙ\u0013-\u0094b\u0005;§]\u0083Ç\u0000\u0089º\u0013QõdN ÈÐo><\\Û\u001b(A7Q í®Áªá(U\u009aË\u007fZÑ¯Ka4\fV!\u0004Ï×\u0000Pòrò\u0005ìµÄòä{Ý\\(Jà¡\u0013Uð³õ\u0005ô\u009a[\u0012åTé\\\u0091V½\u0093`B¡/\u0082\u008bûUÕ\u0001a·\u000b\u0095\u000bÒH\u001es\u0018Ï/\u000e=$|,ÝD\u0013\u0019Q<{\u0087\u00858Kw$ÑÖ-\\ ïb\u0007©Y\u001c\u0007\u0087¢Æ\u009aì\u0011ÃåUÌ\u000e$2iÉ\u001b'\u001e\fF\u0019M×]p"
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = d(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     g = var20;
                     h = new String[9];
                     r = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "|Â \u0099Ò\u0096\rp9=(8\tYs\u0017+Å×Mªçd\u000e \u0086Ï\u0014\u008b1Ó`";
                     int var5 = "|Â \u0099Ò\u0096\rp9=(8\tYs\u0017+Å×Mªçd\u000e \u0086Ï\u0014\u008b1Ó`".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
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
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    p = var6;
                                    q = new Integer[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "Û\u0003I^ßÞNâ~eÜ~t§}«";
                                 var5 = "Û\u0003I^ßÞNâ~eÜ~t§}«".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = (var7[0] & 255L) << 56
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

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "T\u0018\u00182\u001a÷\u0091×}6Y|¦É\u008b?\u0018¹å\nª:\u0085!´£T\u0092AC««Æ]Ýßsej\u0092\u0081";
                  var19 = "T\u0018\u00182\u001a÷\u0091×}6Y|¦É\u008b?\u0018¹å\nª:\u0085!´£T\u0092AC««Æ]Ýßsej\u0092\u0081".length();
                  var16 = 16;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static String d(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32082;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/ehh", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/ehh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12009;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/ehh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
   }

   private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/ehh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
