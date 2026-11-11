package cc.astralis;

import imgui.ImGui;
import imgui.ImVec2;
import imgui.type.ImString;
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
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;

public class gaf extends class_437 implements dlc {
   private final ImString eam;
   private final ImString bny;
   private boolean dx;
   private boolean bqb;
   private boolean bst;
   private boolean grb;
   private fkc bwg;
   private ale geq;
   private bfm ckc;
   private guu czb;
   private String fxh;
   private static final long a = 15556751632921L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public gaf() {
      long a = gaf.a ^ 58819516425926L;
      short var10001 = 31476;
      long var10002 = 3697508701264203402L ^ a;
      super(class_2561.method_30163("Click Gui Window"));
      short var10003 = 29836;
      long var10004 = 4977305159266815347L ^ a;
      a.eam = new ImString(500);
      var10003 = 29836;
      var10004 = 4977305159266815347L ^ a;
      a.bny = new ImString(500);
      a.dx = false;
      a.bqb = false;
      a.bst = false;
      a.fxh = "";
   }

   public void method_25394(class_332 context, int mouseX, int mouseY, float delta) {
      daw ax = dar.gqy().aws().diy(daw.class);
      eu.alu(axx -> {
         long ax = gaf.a ^ 111935415032346L;
         int[] var10000 = dar.abu();
         ImGui.setNextWindowSize(1300.0F, 600.0F);
         int[] axx = var10000;
         short var45 = 31518;
         long var10001 = 6692506432832943037L ^ ax;
         if (ImGui.begin("Click Gui", 2)) {
            label561: {
               label562: {
                  ImVec2 axxx = ImGui.getWindowPos();
                  ImVec2 axxxx = ImGui.getWindowSize();
                  short var46 = 17806;
                  var10001 = 4320218848758926640L ^ ax;
                  boolean var47 = ImGui.beginTabBar("Categories");
                  if (axx != null) {
                     if (var47) {
                        bfm[] var10 = bfm.values();
                        int axxxxx = var10.length;
                        int axxxxxx = 0;

                        while (true) {
                           if (axxxxxx < axxxxx) {
                              bfm axxxxxxx = var10[axxxxxx];
                              if (axx != null) {
                                 String var48 = axxxxxxx.eai();
                                 short var80 = 1119;
                                 long var10002 = 3439419101627698408L ^ ax;
                                 var49 = ImGui.beginTabItem(var48 + "##tab");
                                 if (axx == null) {
                                    break;
                                 }

                                 if (var49) {
                                    a.fxh = axxxxxxx.eai();
                                    a.ckc = axxxxxxx;
                                    ImGui.endTabItem();
                                 }

                                 axxxxxx++;
                              }

                              if (axx != null) {
                                 continue;
                              }
                           }

                           short var50 = 14729;
                           var10001 = 631673763045208383L ^ ax;
                           var49 = ImGui.beginTabItem("Configs");
                           break;
                        }

                        label541: {
                           if (axx != null) {
                              if (!var49) {
                                 break label541;
                              }

                              short var82 = 12572;
                              long var105 = 3388894822204438950L ^ ax;
                              a.fxh = "Configs";
                              a.ckc = null;
                              var49 = false;
                           }

                           azx.bfn(var49, 3.0F, a.ejf.dnp().intValue());
                           ffm.fpp().emf(a, a);
                           ImGui.endTabItem();
                        }

                        ImGui.endTabBar();
                     }

                     var51 = a;
                     if (axx == null) {
                        break label562;
                     }

                     short var83 = 12572;
                     long var106 = 3388894822204438950L ^ ax;
                     var47 = a.fxh.equals("Configs");
                  }

                  if (var47) {
                     break label561;
                  }

                  var51 = a;
               }

               label350:
               if (var51.ckc != null) {
                  label528: {
                     label566: {
                        label567: {
                           label568: {
                              ImGui.columns(2);
                              short var52 = 15879;
                              ImGui.setColumnWidth(0, 175.0F);
                              var10001 = 2330484551872804514L ^ ax;
                              short var10004 = 10430;
                              long var10005 = 4247373786070969756L ^ ax;
                              boolean var53 = ImGui.beginChild("ModulesList", 0.0F, 0.0F, false, 128);
                              if (axx != null) {
                                 if (!var53) {
                                    break label568;
                                 }

                                 var53 = false;
                              }

                              azx.bfn(var53, 6.0F, a.ejf.dnp().intValue());

                              for (guu axxxxx : dar.gqy().aws().gtd(a.ckc)) {
                                 ImGui.pushID(axxxxx.clp());
                                 var54 = a.czb;
                                 var85 = axxxxx;
                                 if (axx == null) {
                                    break label567;
                                 }

                                 label570: {
                                    boolean axxxxxx = a.czb == axxxxx;
                                    ImGui.beginDisabled(axxxxxx);
                                    float axxxxxxxx = ImGui.getContentRegionAvail().x;
                                    boolean var55 = ImGui.button(axxxxx.clp(), axxxxxxxx, 25.0F);
                                    if (axx != null) {
                                       if (var55) {
                                          a.czb = axxxxx;
                                       }

                                       ImGui.endDisabled();
                                       if (axx == null) {
                                          break label570;
                                       }

                                       var55 = ImGui.isItemHovered();
                                    }

                                    if (var55) {
                                       ImGui.setTooltip(axxxxx.epz());
                                    }

                                    ImGui.popID();
                                 }

                                 if (axx == null) {
                                    break;
                                 }
                              }

                              ImGui.endChild();
                           }

                           if (a.czb == null) {
                              break label350;
                           }

                           ImGui.nextColumn();
                           short var56 = 26960;
                           var10001 = 3150980916572070371L ^ ax;
                           short var117 = 31854;
                           long var121 = 7152392721447500111L ^ ax;
                           var57 = ImGui.beginChild("ModuleOptions", 0.0F, 0.0F, true, 128);
                           if (axx != null) {
                              if (var57 == 0) {
                                 break label350;
                              }

                              azx.bfn(false, 3.0F, a.ejf.dnp().intValue());
                              short var58 = 438;
                              var10001 = 6181424506410420497L ^ ax;
                              var57 = ImGui.checkbox("Toggle", a.czb.dsv());
                           }

                           if (axx != null) {
                              if (var57 != 0) {
                                 a.czb.gxo();
                              }

                              ImGui.sameLine();
                              short var59 = 17063;
                              var10001 = 7966326157514902023L ^ ax;
                              var57 = ImGui.checkbox("Hidden", a.czb.aov());
                           }

                           if (axx == null) {
                              break label528;
                           }

                           if (var57 == 0) {
                              break label566;
                           }

                           var54 = a.czb;
                           var85 = a.czb;
                        }

                        boolean var89 = var85.aov();
                        if (axx != null) {
                           var89 = !var89;
                        }

                        var54.atd(var89);
                     }

                     ImGui.dummy(0.0F, 1.0F);
                     ImGui.separator();
                     ImGui.dummy(0.0F, 1.0F);
                     var57 = a.czb.cbf().isEmpty();
                  }

                  label490: {
                     if (axx != null) {
                        if (var57 == 0) {
                           for (ffn<?> axxxxx : a.czb.cbf()) {
                              if (axx == null) {
                                 break label490;
                              }

                              boolean var60 = axxxxx.ajf().get();
                              if (axx != null) {
                                 if (!var60) {
                                    continue;
                                 }

                                 ImGui.pushID(axxxxx.fah());
                                 var60 = axxxxx instanceof gbp;
                              }

                              label482:
                              if (axx != null) {
                                 if (var60) {
                                    gbp axxxxxxxxx = (gbp)axxxxx;
                                    var60 = ImGui.checkbox(axxxxx.fah(), axxxxxxxxx.dnp());
                                    if (axx == null) {
                                       break label482;
                                    }

                                    if (var60) {
                                       boolean var90 = axxxxxxxxx.dnp();
                                       if (axx != null) {
                                          var90 = !var90;
                                       }

                                       axxxxxxxxx.gbf(var90);
                                    }
                                 }

                                 var60 = axxxxx instanceof bes;
                              }

                              if (axx != null) {
                                 if (var60) {
                                    bes axxxxxxxxxx = (bes)axxxxx;
                                    float[] axxxxxxxxxxx = axxxxxxxxxx.dnp().getData();
                                    String var61 = axxxxxxxxxx.fah();
                                    short var91 = 12788;
                                    long var107 = 705915862377953604L ^ ax;
                                    String axxxxxxxxxxxx = "##" + var61;
                                    String var62 = axxxxxxxxxx.fah();
                                    short var92 = 18774;
                                    var107 = 2782296628564656612L ^ ax;
                                    String axxxxxxxxxxxxx = var62 + " %.3f";
                                    boolean var63 = ImGui.sliderFloat(axxxxxxxxxxxx, axxxxxxxxxxx, axxxxxxxxxx.cpl(), axxxxxxxxxx.hgz(), axxxxxxxxxxxxx);
                                    if (axx != null) {
                                       if (var63) {
                                          axxxxxxxxxx.agb(axxxxxxxxxxx[0], true);
                                       }

                                       var63 = ImGui.isItemEdited();
                                    }

                                    if (var63) {
                                       axxxxxxxxxx.agb(axxxxxxxxxxx[0], false);
                                    }

                                    axxxxxxxxxx.dnp().getData()[0] = axxxxxxxxxx.dnp().floatValue();
                                 }

                                 var60 = axxxxx instanceof ejm;
                              }

                              if (axx != null) {
                                 if (var60) {
                                    ejm axxxxxxxxxxxxxx = (ejm)axxxxx;
                                    ImGui.text(axxxxxxxxxxxxxx.dnp());
                                 }

                                 var60 = axxxxx instanceof acn;
                              }

                              label472:
                              if (axx != null) {
                                 if (var60) {
                                    acn axxxxxxxxxxxxxx = (acn)axxxxx;
                                    float[] axxxxxxxxxxxxxxx = dec.eul(axxxxxxxxxxxxxx.dnp().getRGB());
                                    var60 = ImGui.colorEdit4(axxxxx.fah(), axxxxxxxxxxxxxxx, b<"m">(17364, 1019599977911944956L ^ ax));
                                    if (axx == null) {
                                       break label472;
                                    }

                                    if (var60) {
                                       axxxxxxxxxxxxxx.gbf(dec.gry(axxxxxxxxxxxxxxx));
                                    }
                                 }

                                 var60 = axxxxx instanceof dxl;
                              }

                              label465:
                              if (axx != null) {
                                 if (var60) {
                                    dxl axxxxxxxxxxxxxxxx = (dxl)axxxxx;
                                    String var64 = axxxxx.fah();
                                    short var93 = 24447;
                                    long var109 = 6853390998819706820L ^ ax;
                                    var60 = ImGui.inputTextWithHint(var64, "You May Type Whatever You Wish Here <3", axxxxxxxxxxxxxxxx.gbs(), 0);
                                    if (axx == null) {
                                       break label465;
                                    }

                                    if (var60) {
                                       axxxxxxxxxxxxxxxx.gbf(axxxxxxxxxxxxxxxx.gbs().get());
                                    }
                                 }

                                 var60 = axxxxx instanceof adu;
                              }

                              label458:
                              if (axx != null) {
                                 if (var60) {
                                    adu axxxxxxxxxxxxxxxxx = (adu)axxxxx;
                                    var60 = ImGui.beginCombo(axxxxxxxxxxxxxxxxx.fah(), axxxxxxxxxxxxxxxxx.dnp());
                                    if (axx == null) {
                                       break label458;
                                    }

                                    if (var60) {
                                       String var65 = axxxxxxxxxxxxxxxxx.dnp();
                                       short var94 = 30809;
                                       long var110 = 473417143126110433L ^ ax;
                                       String var66 = "##" + var65;
                                       short var95 = 30421;
                                       var110 = 8072764772912250472L ^ ax;
                                       ImGui.inputTextWithHint(var66, "Search For Modes.", a.eam, 0);
                                       String axxxxxxxxxxxxxxxxxx = a.eam.get().toLowerCase();

                                       for (String axxxxxxxxxxxxxxxxxxx : axxxxxxxxxxxxxxxxx.ape()) {
                                          var60 = axxxxxxxxxxxxxxxxxx.isEmpty();
                                          if (axx == null) {
                                             break label458;
                                          }

                                          label448: {
                                             label447:
                                             if (axx != null) {
                                                if (!var60) {
                                                   var60 = axxxxxxxxxxxxxxxxxxx.toLowerCase().contains(axxxxxxxxxxxxxxxxxx);
                                                   if (axx == null) {
                                                      break label447;
                                                   }

                                                   if (!var60) {
                                                      break label448;
                                                   }
                                                }

                                                var60 = ImGui.selectable(axxxxxxxxxxxxxxxxxxx);
                                             }

                                             if (var60) {
                                                axxxxxxxxxxxxxxxxx.gbf(axxxxxxxxxxxxxxxxxxx);
                                                a.eam.set(new ImString(b<"m">(6449, 2599013598174075928L ^ ax)));
                                             }
                                          }

                                          if (axx == null) {
                                             break;
                                          }
                                       }

                                       ImGui.endCombo();
                                    }
                                 }

                                 var60 = axxxxx instanceof cyx;
                              }

                              label430:
                              if (axx != null) {
                                 if (var60) {
                                    cyx axxxxxxxxxxxxxxxxxx;
                                    hcr axxxxxxxxxxxxxxxxxxx;
                                    label426: {
                                       axxxxxxxxxxxxxxxxxx = (cyx)axxxxx;
                                       axxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxxx.dnp();
                                       hcr var67 = axxxxxxxxxxxxxxxxxxx;
                                       if (axx != null) {
                                          if (axxxxxxxxxxxxxxxxxxx == null) {
                                             short var69 = 21703;
                                             var10001 = 2286179119578586227L ^ ax;
                                             var68 = "None";
                                             break label426;
                                          }

                                          var67 = axxxxxxxxxxxxxxxxxxx;
                                       }

                                       var68 = var67.akm();
                                    }

                                    String axxxxxxxxxxxxxxxxxxxx = var68;
                                    var60 = ImGui.beginCombo(axxxxxxxxxxxxxxxxxx.fah(), axxxxxxxxxxxxxxxxxxxx);
                                    if (axx == null) {
                                       break label430;
                                    }

                                    if (var60) {
                                       short var70 = 20221;
                                       var10001 = 4221771265720813145L ^ ax;
                                       short var98 = 29825;
                                       long var112 = 1375848795933097021L ^ ax;
                                       ImGui.inputTextWithHint("##search", "Search modes...", a.eam);
                                       String axxxxxxxxxxxxxxxxxxxxx = a.eam.get().toLowerCase();

                                       for (hcr axxxxxxxxxxxxxxxxxxxxxx : axxxxxxxxxxxxxxxxxx.ajs().values()) {
                                          String axxxxxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxxxxxxx.akm();
                                          var60 = axxxxxxxxxxxxxxxxxxxxx.isEmpty();
                                          if (axx == null) {
                                             break label430;
                                          }

                                          label580: {
                                             label413: {
                                                if (axx != null) {
                                                   if (var60) {
                                                      break label413;
                                                   }

                                                   var60 = axxxxxxxxxxxxxxxxxxxxxxx.toLowerCase().contains(axxxxxxxxxxxxxxxxxxxxx);
                                                }

                                                if (!var60) {
                                                   break label580;
                                                }
                                             }

                                             boolean axxxxxxxxxxxxxxxxxxxxxxxx = axxxxxxxxxxxxxxxxxxxxxx == axxxxxxxxxxxxxxxxxxx;
                                             boolean var71 = ImGui.selectable(axxxxxxxxxxxxxxxxxxxxxxx, axxxxxxxxxxxxxxxxxxxxxxxx);
                                             if (axx != null) {
                                                if (!var71) {
                                                   break label580;
                                                }

                                                var71 = axxxxxxxxxxxxxxxxxxxxxxxx;
                                             }

                                             if (!var71) {
                                                axxxxxxxxxxxxxxxxxx.biz(axxxxxxxxxxxxxxxxxxxxxx);
                                                hcr var72 = axxxxxxxxxxxxxxxxxxx;
                                                if (axx != null) {
                                                   if (axxxxxxxxxxxxxxxxxxx != null) {
                                                      axxxxxxxxxxxxxxxxxxx.frr(false);
                                                   }

                                                   var72 = axxxxxxxxxxxxxxxxxxxxxx;
                                                }

                                                var72.frr(true);
                                                a.eam.set("");
                                             }
                                          }

                                          if (axx == null) {
                                             break;
                                          }
                                       }

                                       ImGui.endCombo();
                                    }
                                 }

                                 var60 = axxxxx instanceof epo;
                              }

                              label391: {
                                 label581: {
                                    label389:
                                    if (axx != null) {
                                       label387:
                                       if (var60) {
                                          epo axxxxxxxxxxxxxxxxxxxxx = (epo)axxxxx;
                                          var60 = a.bst;
                                          if (axx != null) {
                                             if (!a.bst) {
                                                String var73 = axxxxxxxxxxxxxxxxxxxxx.dnp();
                                                short var99 = 16954;
                                                long var113 = 463842939381222044L ^ ax;
                                                ImGui.text("Current Path: " + var73);
                                                short var74 = 14133;
                                                var10001 = 1848765986878193546L ^ ax;
                                                var60 = ImGui.button("Choose Path");
                                                if (axx == null) {
                                                   break label389;
                                                }

                                                if (!var60) {
                                                   break label387;
                                                }

                                                a.bst = true;
                                                short var10003 = 30856;
                                                long var118 = 7959907644631232553L ^ ax;
                                                a.bwg = new fkc(System.getProperty("user.home"), axxxxxxxxxxxxxxxxxxxxx.cof());
                                                if (axx != null) {
                                                   break label387;
                                                }
                                             }

                                             short var75 = 32133;
                                             var10001 = 152954637903082812L ^ ax;
                                             var60 = ImGui.button("Cancel Selection");
                                          }

                                          if (axx != null) {
                                             if (var60) {
                                                a.bst = false;
                                                a.bwg.bla();
                                             }

                                             a.bwg.dut();
                                             var60 = a.bwg.abc();
                                          }

                                          if (axx == null) {
                                             break label389;
                                          }

                                          if (var60) {
                                             axxxxxxxxxxxxxxxxxxxxx.gbf(a.bwg.aes());
                                             a.bst = false;
                                             a.bwg.bla();
                                          }
                                       }

                                       var76 = axxxxx;
                                       if (axx == null) {
                                          break label581;
                                       }

                                       var60 = axxxxx instanceof ale;
                                    }

                                    if (!var60) {
                                       break label391;
                                    }

                                    var76 = axxxxx;
                                 }

                                 ale axxxxxxxxxxxxxxxxxxxxxx = (ale)var76;
                                 String var77 = ek.bzp(axxxxxxxxxxxxxxxxxxxxxx.dnp().toString());
                                 short var102 = 24654;
                                 long var114 = 7398687513824897279L ^ ax;
                                 ImGui.text("Currently Aiming For The " + var77);
                                 a.bqb = true;
                                 a.geq = axxxxxxxxxxxxxxxxxxxxxx;
                              }

                              ImGui.popID();
                              ImGui.spacing();
                              if (axx == null) {
                                 break;
                              }
                           }

                           if (axx != null) {
                              break label490;
                           }
                        }

                        short var78 = 23142;
                        var10001 = 2425838697477349184L ^ ax;
                        var57 = 255;
                     }

                     short var104 = 23828;
                     long var115 = 6889450674529572913L ^ ax;
                     short var116 = 9849;
                     long var119 = 7695384583290807133L ^ ax;
                     short var120 = 5716;
                     long var122 = 5955563335458021089L ^ ax;
                     ImGui.textColored(var57, 165, 0, 255, "This module has no settings");
                  }

                  ImGui.endChild();
               }
            }

            ImGui.end();
         }
      });
      dfr.bmt(() -> ffm.fpp().emf(a, a));
   }

   public boolean method_25402(class_11909 click, boolean doubled) {
      long ax = gaf.a ^ 125300886010768L;
      int[] var5 = dar.abu();
      boolean var10000 = ffm.fpp().gkk(a, a);
      if (var5 != null) {
         if (var10000) {
            return true;
         }

         var10000 = super.method_25402(a, a);
      }

      return var10000;
   }

   public boolean method_25403(class_11909 click, double offsetX, double offsetY) {
      long ax = gaf.a ^ 1018221509601L;
      int[] var8 = dar.abu();
      boolean var10000 = ffm.fpp().fgn(a, a, a);
      if (var8 != null) {
         if (var10000) {
            return true;
         }

         var10000 = super.method_25403(a, a, a);
      }

      return var10000;
   }

   public boolean method_25401(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      long ax = gaf.a ^ 60312397469979L;
      int[] var11 = dar.abu();
      boolean var10000 = ffm.fpp().dmj(a, a, a, a);
      if (var11 != null) {
         if (var10000) {
            return true;
         }

         var10000 = super.method_25401(a, a, a, a);
      }

      return var10000;
   }

   public boolean method_25404(class_11908 input) {
      long ax = gaf.a ^ 85937761655127L;
      int[] var4 = dar.abu();
      int var10000 = ffm.fpp().chz(a);
      if (var4 != null) {
         if (var10000 != 0) {
            return true;
         }

         var10000 = a.method_74228();
      }

      label62:
      if (var4 != null) {
         short var10001 = 22111;
         long var10002 = 4987383857852387378L ^ ax;
         if (var10000 == 256) {
            var10000 = a.dx;
            if (var4 == null) {
               break label62;
            }

            if (!a.dx) {
               chi.method_1507(null);
            }
         }

         var10000 = a.dx;
      }

      if (var4 != null) {
         if (var10000 != 0) {
            int var8;
            label51: {
               var5 = a.czb;
               class_11908 var6 = a;
               if (var4 != null) {
                  var8 = a.method_74228();
                  short var9 = 3905;
                  long var10003 = 1923578164894779691L ^ ax;
                  if (var8 == 256) {
                     var8 = 0;
                     break label51;
                  }

                  var6 = a;
               }

               var8 = var6.method_74228();
            }

            var5.hge(var8);
            a.dx = false;
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   public boolean method_25400(class_11905 input) {
      long ax = gaf.a ^ 38125706985611L;
      int[] var4 = dar.abu();
      boolean var10000 = ffm.fpp().flf(a);
      if (var4 != null) {
         if (var10000) {
            return true;
         }

         var10000 = super.method_25400(a);
      }

      return var10000;
   }

   public void method_25420(class_332 context, int mouseX, int mouseY, float delta) {
   }

   public boolean method_25421() {
      return false;
   }

   static {
      long var11 = a ^ 79269166036277L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[24];
      int var18 = 0;
      String var17 = "\u009c\u0085²÷¯zw¥\u0016*\u0004{ÄØ\u0013¦U\u008a}°\u0082]zãó\tÌDKÈ\u0089jÃCò\u0093çæ¸\bf\u0000¥R7#ybÒò\u0013Äi;¿ö\u00106Ù°~§\u0094!Ù¥ã~GúW\u0087\u000e\u0010ðàÏ}\u0019?\u0015\u0017á!!ÖÇ/:J\u0010ãC\"Í\\Ý(@\u008bÍyÀ<\\\u0089B8\u0007¸j»Ë°\u0093ãîw/Ë\u0083¿]rWÍ*õë-wÁð\u001c£8@<\u000bÙØªÓ$}ä\u008c5T\u009d\u00863Dn\f¬;gPqH\u000bìd\u0010$ôa#Éx¬\u0099¤\u00022&\u0091Ã1f\u0018Ú Æ\u0003\u001fÛ¬\u000e°I\u0088n\u0001BÊ?\n[]#ØB\u001c\u0016\u001016e«\u0018\u001e/\u0010\u0082¡Í\u0000{ó¿Å <>á\u0007±Z~j\n\u0096²:lñé¹Ây¢\u0012¬x7\u009e¥¦È\u008c\u0013wS\u0012\u0018dd\u0016jÏ¸\u008e6ÿE\u008c[\f\u000by\u00012÷ôä]â¶\f\u0018b=¥I¸6bvd©2Zâ|\u0080\u0099\u0099ïý\r\u0096ùb0\u0018WU£¾%â\u000b\u009d\u0082Z\u0083åÈü\u0018±)-\u009a\u00034=±r(î·¤Âém\u00851÷y©i°Á\u009d_\u000fö¹\u0017×)úqì0äv{!²\u0007¾Ö&\u0007&v\u0090¡\u0010ÈYoÎün¨pa½Ø\u0081\u007f²>9@Ië`\u0080PQÞ\t\u0084±4¶àº¤½ók4\u0095\u0081\u0011µ/\u009c*æ~\u0089ý'þÉ¡ìe\u0006,a\u008eçe\u0096Rm\f\u0088\u001c÷Ô5ùõp!ÙMÑ\u0003\u0088¶[çÀ\u0010w\u0093\u001b»¿¤vmrñÏ\u0080\u008e\u008bo\u0089\u0018¥FýYÒSA\u0004X³L\u0080÷\u0094\u0018p \u000fÜ|L\u008cÁ] \u0098rÇ;o!\u0088©×YR\u0095Àè\u0082Ü\tª\u0011Ê¡ì\tÌ\u0091pÕ\u0084y4u\u0011\u0010\u0010¬Ë²mk?}Fy,Ï\u0019[\u0014! eÚ²\u0097¤£\u0019]1O3îHÄÎ\u0088M¹N\u0094\u001d\u0010\u001d\\\u008a8'¡\u0082Ã\u0007\u008c Iezë\u00954?ç'\u0000PS1\u008fÒº\u0080É\u0093{\u001eø\"\u0086C\u0095úd\u0092~\u0083\u0083\u0010H_×Kçhÿp4k\r\u0086jªzX";
      int var19 = "\u009c\u0085²÷¯zw¥\u0016*\u0004{ÄØ\u0013¦U\u008a}°\u0082]zãó\tÌDKÈ\u0089jÃCò\u0093çæ¸\bf\u0000¥R7#ybÒò\u0013Äi;¿ö\u00106Ù°~§\u0094!Ù¥ã~GúW\u0087\u000e\u0010ðàÏ}\u0019?\u0015\u0017á!!ÖÇ/:J\u0010ãC\"Í\\Ý(@\u008bÍyÀ<\\\u0089B8\u0007¸j»Ë°\u0093ãîw/Ë\u0083¿]rWÍ*õë-wÁð\u001c£8@<\u000bÙØªÓ$}ä\u008c5T\u009d\u00863Dn\f¬;gPqH\u000bìd\u0010$ôa#Éx¬\u0099¤\u00022&\u0091Ã1f\u0018Ú Æ\u0003\u001fÛ¬\u000e°I\u0088n\u0001BÊ?\n[]#ØB\u001c\u0016\u001016e«\u0018\u001e/\u0010\u0082¡Í\u0000{ó¿Å <>á\u0007±Z~j\n\u0096²:lñé¹Ây¢\u0012¬x7\u009e¥¦È\u008c\u0013wS\u0012\u0018dd\u0016jÏ¸\u008e6ÿE\u008c[\f\u000by\u00012÷ôä]â¶\f\u0018b=¥I¸6bvd©2Zâ|\u0080\u0099\u0099ïý\r\u0096ùb0\u0018WU£¾%â\u000b\u009d\u0082Z\u0083åÈü\u0018±)-\u009a\u00034=±r(î·¤Âém\u00851÷y©i°Á\u009d_\u000fö¹\u0017×)úqì0äv{!²\u0007¾Ö&\u0007&v\u0090¡\u0010ÈYoÎün¨pa½Ø\u0081\u007f²>9@Ië`\u0080PQÞ\t\u0084±4¶àº¤½ók4\u0095\u0081\u0011µ/\u009c*æ~\u0089ý'þÉ¡ìe\u0006,a\u008eçe\u0096Rm\f\u0088\u001c÷Ô5ùõp!ÙMÑ\u0003\u0088¶[çÀ\u0010w\u0093\u001b»¿¤vmrñÏ\u0080\u008e\u008bo\u0089\u0018¥FýYÒSA\u0004X³L\u0080÷\u0094\u0018p \u000fÜ|L\u008cÁ] \u0098rÇ;o!\u0088©×YR\u0095Àè\u0082Ü\tª\u0011Ê¡ì\tÌ\u0091pÕ\u0084y4u\u0011\u0010\u0010¬Ë²mk?}Fy,Ï\u0019[\u0014! eÚ²\u0097¤£\u0019]1O3îHÄÎ\u0088M¹N\u0094\u001d\u0010\u001d\\\u008a8'¡\u0082Ã\u0007\u008c Iezë\u00954?ç'\u0000PS1\u008fÒº\u0080É\u0093{\u001eø\"\u0086C\u0095úd\u0092~\u0083\u0083\u0010H_×Kçhÿp4k\r\u0086jªzX"
         .length();
      char var16 = '8';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[24];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[10];
                     int var3 = 0;
                     String var4 = "\u0098x;E\u0005 \u008986÷\u0018\u009f\u0010\u001c\u008aeÜCÈ;O\"¼{Yè\u008f?\u0003ÿ25{>Â,¡PèOrÐ¢}m\u0099\u0001ªÓDâ\u0005ÚmQ9û¹B\u001cøýÌ¹";
                     int var5 = "\u0098x;E\u0005 \u008986÷\u0018\u009f\u0010\u001c\u008aeÜCÈ;O\"¼{Yè\u008f?\u0003ÿ25{>Â,¡PèOrÐ¢}m\u0099\u0001ªÓDâ\u0005ÚmQ9û¹B\u001cøýÌ¹"
                        .length();
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
                                    e = var6;
                                    f = new Integer[10];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "h?\u0082r\u0012À\u001a\u0002k\u008fû@µRK\t";
                                 var5 = "h?\u0082r\u0012À\u001a\u0002k\u008fû@µRK\t".length();
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

                  var17 = "®\u0083®§´éä\u0087yn\u0017;÷cJ-ÛFp?uægl~pS\u0010\u0080\u000f¡Ð \b\u0080Å H\u0093ýÃ>\nh²l\u0091ü¤bé\u0095DH\u0082gõbÜV/\u001b§ñ\u007f";
                  var19 = "®\u0083®§´éä\u0087yn\u0017;÷cJ-ÛFp?uægl~pS\u0010\u0080\u000f¡Ð \b\u0080Å H\u0093ýÃ>\nh²l\u0091ü¤bé\u0095DH\u0082gõbÜV/\u001b§ñ\u007f"
                     .length();
                  var16 = ' ';
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30902;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/gaf", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("cc/astralis/gaf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29986;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/gaf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("cc/astralis/gaf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
