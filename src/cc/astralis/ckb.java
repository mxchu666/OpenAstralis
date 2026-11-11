package cc.astralis;

import com.google.gson.JsonObject;
import imgui.ImGui;
import imgui.ImGuiViewport;
import imgui.type.ImString;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ckb implements dlc {
   private final ImString ebg;
   private final ImString fhe;
   private boolean efy;
   private static final float bgb = 280.0F;
   private static final float hjn = 180.0F;
   private static final float ahc = 16.0F;
   private static final float eqb = 12.0F;
   private boolean bba;
   private boolean bwn;
   private float bt;
   private float hbr;
   private float eej;
   private float azm;
   private static final float hae = 450.0F;
   private static final float ggk = 20.0F;
   private static final float gpt = 480.0F;
   private static final float emm = 320.0F;
   private static final long a = 112855209803819L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public ckb() {
      long a = ckb.a ^ 131765600874432L;
      super();
      short var10003 = 348;
      long var10004 = 2197084243329895132L ^ a;
      a.ebg = new ImString(-1209565262);
      var10003 = 32400;
      var10004 = 8673657251804624137L ^ a;
      a.fhe = new ImString(-1853596182);
      a.efy = false;
      a.bba = true;
      a.bwn = false;
      a.bt = -1.0F;
      a.hbr = -1.0F;
      a.eej = 1000.0F;
      a.azm = 700.0F;
   }

   public void fqb() {
      long a;
      int[] ax;
      List<ago> axx;
      a = ckb.a ^ 130307932118206L;
      int[] var10000 = dar.abu();
      axx = aml.cic;
      ImGuiViewport axxx = ImGui.getMainViewport();
      ax = var10000;
      float axxxx = 1000.0F;
      float axxxxx = 700.0F;
      float axxxxxx = axxx.getWorkPosX() + Math.max(0.0F, (axxx.getWorkSizeX() - 1000.0F) * 0.5F);
      float axxxxxxx = axxx.getWorkPosY() + Math.max(0.0F, (axxx.getWorkSizeY() - 700.0F) * 0.5F);
      ImGui.setNextWindowPos(axxxxxx, axxxxxxx, 4);
      ImGui.setNextWindowSize(1000.0F, 700.0F, 4);
      label243:
      if (ax != null) {
         if (a.bwn) {
            if (ax == null) {
               break label243;
            }

            if (!a.bba) {
               float[] axxxxxxxx = a.grc(a.bt, a.hbr, a.eej, a.azm);
               ImGui.setNextWindowPos(axxxxxxxx[0], axxxxxxxx[1], 1);
               ImGui.setNextWindowSize(axxxxxxxx[2], axxxxxxxx[3], 1);
            }
         }

         short var19 = 18963;
         long var10001 = 3771002034601636581L ^ a;
         int var20 = 705645796;
      }

      short var21 = 9540;
      long var41 = 7305192894815226072L ^ a;
      short var42 = 6619;
      long var10002 = 757983650714345766L ^ a;
      boolean var22 = ImGui.begin("Cloud Configurations##main", 555694684);
      if (ax != null) {
         label165:
         if (var22) {
            label232: {
               label247: {
                  label230: {
                     label248: {
                        azx.gab(false, 2.0F);
                        boolean var23 = a.bba;
                        if (ax != null) {
                           if (a.bba) {
                              float[] axxxxxxxx = a.grc(ImGui.getWindowPosX(), ImGui.getWindowPosY(), 450.0F, 20.0F);
                              ImGui.setWindowPos(axxxxxxxx[0], axxxxxxxx[1]);
                              ImGui.setWindowSize(450.0F, 20.0F);
                              if (ax != null) {
                                 break label247;
                              }
                           }

                           var24 = a;
                           if (ax == null) {
                              break label248;
                           }

                           var23 = a.bwn;
                        }

                        if (!var23) {
                           break label230;
                        }

                        var24 = a;
                     }

                     var24.bwn = false;
                  }

                  label250: {
                     float[] axxxxxxxx;
                     float var18;
                     label251: {
                        float var17;
                        label214: {
                           float axxxxxxxxx = ImGui.getWindowPosX();
                           float axxxxxxxxxx = ImGui.getWindowPosY();
                           float axxxxxxxxxxx = ImGui.getWindowWidth();
                           float axxxxxxxxxxxx = ImGui.getWindowHeight();
                           var17 = Math.max(axxxxxxxxxxx, 480.0F);
                           var18 = Math.max(axxxxxxxxxxxx, 320.0F);
                           axxxxxxxx = a.grc(axxxxxxxxx, axxxxxxxxxx, var17, var18);
                           float var25 = axxxxxxxx[0];
                           float var43 = axxxxxxxxx;
                           if (ax != null) {
                              if (var25 == axxxxxxxxx) {
                                 float var57;
                                 var26 = (var57 = axxxxxxxx[1] - axxxxxxxxxx) == 0.0F ? 0 : (var57 < 0.0F ? -1 : 1);
                                 if (ax == null) {
                                    break label251;
                                 }

                                 if (!var26) {
                                    break label214;
                                 }
                              }

                              var25 = axxxxxxxx[0];
                              var43 = axxxxxxxx[1];
                           }

                           ImGui.setWindowPos(var25, var43);
                        }

                        var27 = axxxxxxxx[2];
                        var44 = var17;
                        if (ax == null) {
                           break label250;
                        }

                        float var58;
                        var26 = (var58 = var27 - var17) == 0.0F ? 0 : (var58 < 0.0F ? -1 : 1);
                     }

                     if (!var26) {
                        float var59;
                        var28 = (var59 = axxxxxxxx[3] - var18) == 0.0F ? 0 : (var59 < 0.0F ? -1 : 1);
                        if (ax == null) {
                           break label232;
                        }

                        if (!var28) {
                           break label247;
                        }
                     }

                     var27 = axxxxxxxx[2];
                     var44 = axxxxxxxx[3];
                  }

                  ImGui.setWindowSize(var27, var44);
               }

               var28 = ImGui.beginMenuBar();
            }

            if (ax != null) {
               if (var28) {
                  short var29 = 22235;
                  var41 = 4278689733943278423L ^ a;
                  ImGui.text("Cloud Configurations");
                  ImGui.sameLine();
                  int var46 = aml.cic.size();
                  short var55 = 12145;
                  long var10003 = 6008520105782526709L ^ a;
                  ImGui.textDisabled("(" + var46 + " configs)");
                  ImGui.sameLine(ImGui.getWindowWidth() - (a.bba ? 210.0F : 110.0F));
                  String var31;
                  if (a.bba) {
                     short var30 = 8439;
                     var41 = 1963740242281319798L ^ a;
                     var31 = "Maximize";
                  } else {
                     short var32 = 29546;
                     var41 = 6693875795615194875L ^ a;
                     var31 = "Minimize";
                  }

                  boolean var33 = ImGui.smallButton(var31);
                  if (ax != null) {
                     if (var33) {
                        a.aor();
                     }

                     var33 = a.bba;
                  }

                  label253: {
                     if (ax != null) {
                        if (!var33) {
                           break label253;
                        }

                        ImGui.sameLine();
                        short var34 = 2236;
                        var41 = 7165112022488802617L ^ a;
                        var33 = ImGui.smallButton("Refresh");
                     }

                     label254: {
                        if (ax != null) {
                           if (var33) {
                              new fxc().dak(dar.gqy().gp());
                           }

                           ImGui.sameLine();
                           if (ax == null) {
                              break label254;
                           }

                           short var35 = 10886;
                           var41 = 2527718479529625353L ^ a;
                           var33 = ImGui.smallButton("Add");
                        }

                        if (!var33) {
                           break label253;
                        }

                        a.efy = true;
                        a.ebg.set("");
                     }

                     a.fhe.set("");
                  }

                  ImGui.endMenuBar();
               }

               var28 = a.bba;
            }

            label256: {
               if (ax != null) {
                  if (var28) {
                     ImGui.pushStyleColor(0, 0.7F, 0.75F, 0.85F, 1.0F);
                     short var36 = 30410;
                     ImGui.setCursorPosY(ImGui.getCursorPosY() + 6.0F);
                     var41 = 4279831169416633173L ^ a;
                     ImGui.textDisabled("Mini mode — drag to move, click Restore to expand");
                     ImGui.popStyleColor();
                     if (ax != null) {
                        break label165;
                     }
                  }

                  var37 = a;
                  if (ax == null) {
                     break label256;
                  }

                  a.eik();
                  ImGui.separator();
                  ImGui.spacing();
                  var28 = axx.isEmpty();
               }

               if (var28) {
                  a.eoy();
                  if (ax != null) {
                     break label165;
                  }
               }

               var37 = a;
            }

            var37.cgx(axx);
         }

         ImGui.end();
         short var38 = 7840;
         var41 = 8304237541993116457L ^ a;
         short var53 = 24164;
         var10002 = 6763342704861652608L ^ a;
         var22 = ImGui.beginPopupModal("Add New Config", -1542715716);
      }

      label258: {
         if (ax != null) {
            if (var22) {
               a.gkl();
               ImGui.endPopup();
            }

            var39 = a;
            if (ax == null) {
               break label258;
            }

            var22 = a.efy;
         }

         if (!var22) {
            return;
         }

         short var40 = 13841;
         var41 = 858710863213419419L ^ a;
         ImGui.openPopup("Add New Config");
         var39 = a;
      }

      var39.efy = false;
   }

   private void aor() {
      long a = ckb.a ^ 38246892070053L;
      int[] var3 = dar.abu();
      ckb var10000 = a;
      if (var3 != null) {
         if (!a.bba) {
            a.bt = ImGui.getWindowPosX();
            a.hbr = ImGui.getWindowPosY();
            a.eej = Math.max(ImGui.getWindowWidth(), 480.0F);
            a.azm = Math.max(ImGui.getWindowHeight(), 320.0F);
            a.bba = true;
            if (var3 != null) {
               return;
            }
         }

         a.bba = false;
         var10000 = a;
      }

      var10000.bwn = true;
   }

   private float[] grc(float a, float a, float a, float a) {
      ImGuiViewport ax = ImGui.getMainViewport();
      float axx = ax.getWorkPosX();
      float axxx = ax.getWorkPosY();
      float axxxx = ax.getWorkSizeX();
      float axxxxx = ax.getWorkSizeY();
      float axxxxxx = Math.max(480.0F, Math.min(a, axxxx));
      float axxxxxxx = Math.max(320.0F, Math.min(a, axxxxx));
      float axxxxxxxx = axx + axxxx - axxxxxx;
      float axxxxxxxxx = axxx + axxxxx - axxxxxxx;
      float axxxxxxxxxx = Math.max(axx, Math.min(a, axxxxxxxx));
      float axxxxxxxxxxx = Math.max(axxx, Math.min(a, axxxxxxxxx));
      return new float[]{axxxxxxxxxx, axxxxxxxxxxx, axxxxxx, axxxxxxx};
   }

   private void eik() {
      long a = ckb.a ^ 60350680687786L;
      int[] var10000 = dar.abu();
      float ax = 120.0F;
      float axx = 8.0F;
      int[] axxx = var10000;
      float axxxx = ax * 2.0F + axx;
      short var7 = 8975;
      long var10001 = 7413258574918416005L ^ a;
      short var10002 = 16977;
      long var10003 = 7511545356815532725L ^ a;
      byte var8 = ImGui.beginTable("cfg_header", 2, -591446221);
      if (axxx != null) {
         if (var8 == 0) {
            return;
         }

         short var9 = 5791;
         var10001 = 9160653874624086815L ^ a;
         short var14 = 14072;
         long var20 = 4933797853562926615L ^ a;
         ImGui.tableSetupColumn("left", -2067402092);
         short var10 = 29775;
         var10001 = 5899100787747987904L ^ a;
         short var16 = 14119;
         long var21 = 2049652500848900032L ^ a;
         ImGui.tableSetupColumn("right", -958500376, axxxx);
         short var11 = 24987;
         ImGui.tableNextRow();
         var10001 = 8059277840117969922L ^ a;
         ImGui.tableSetColumnIndex(0);
         ImGui.tableSetColumnIndex(1);
         var8 = ImGui.button("Refresh", ax, 0.0F);
      }

      if (axxx != null) {
         if (var8 != 0) {
            new fxc().dak(dar.gqy().gp());
         }

         ImGui.sameLine(0.0F, axx);
         short var12 = 11852;
         short var18 = 28818;
         long var22 = 2523517212450205810L ^ a;
         ImGui.pushStyleColor(244496913, 0.2F, 0.7F, 0.2F, 1.0F);
         var10001 = 5995520233134980033L ^ a;
         var10002 = 3223;
         var10003 = 2326137316762242175L ^ a;
         ImGui.pushStyleColor(172275743, 0.3F, 0.8F, 0.3F, 1.0F);
         var10002 = 22038;
         var10003 = 7466711997441971959L ^ a;
         ImGui.pushStyleColor(-789396224, 0.1F, 0.6F, 0.1F, 1.0F);
         var8 = ImGui.button("Add Config", ax, 0.0F);
      }

      if (axxx != null) {
         if (var8 != 0) {
            a.efy = true;
            a.ebg.set("");
            a.fhe.set("");
         }

         var8 = 3;
      }

      ImGui.popStyleColor(var8);
      ImGui.endTable();
   }

   private void eoy() {
      long a = ckb.a ^ 13521309569094L;
      float ax = ImGui.getContentRegionAvail().x;
      float axx = ImGui.getContentRegionAvail().y;
      ImGui.setCursorPosX((ax - 300.0F) * 0.5F);
      ImGui.setCursorPosY((axx - 100.0F) * 0.5F);
      short var10000 = 16856;
      long var10001 = 2580801672026939578L ^ a;
      short var10004 = 1638;
      long var10005 = 4403331941189300847L ^ a;
      ImGui.beginChild("EmptyState", 300.0F, 100.0F, false, 996469566);
      ImGui.pushStyleColor(0, 0.6F, 0.6F, 0.6F, 1.0F);
      var10000 = 24785;
      var10001 = 2703091494135611834L ^ a;
      ImGui.text("No configurations found");
      ImGui.spacing();
      var10000 = 7202;
      var10001 = 7240412955691400525L ^ a;
      ImGui.text("Click 'Add Config' to create your first configuration");
      ImGui.popStyleColor();
      ImGui.endChild();
   }

   private void cgx(List<ago> a) {
      long ax = ckb.a ^ 52168381964810L;
      int[] var10000 = dar.abu();
      float axx = ImGui.getContentRegionAvail().x;
      int axxx = Math.max(1, (int)((axx + 16.0F) / 296.0F));
      int[] axxxx = var10000;
      float axxxxx = axxx * 280.0F + (axxx - 1) * 16.0F;
      float var11;
      int var9 = (var11 = axxxxx - axx) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
      if (axxxx != null) {
         if (var9 > 0) {
            axxx = Math.max(1, axxx - 1);
         }

         short var10 = 17596;
         long var10001 = 2871802238152103841L ^ ax;
         short var10004 = 14072;
         long var10005 = 4933770980338282679L ^ ax;
         ImGui.beginChild("ConfigGrid", 0.0F, 0.0F, false, -2067402092);
         ImGui.setCursorPosY(ImGui.getCursorPosY() + 10.0F);
         var9 = 0;
      }

      int axxxxxx = var9;

      while (true) {
         if (axxxxxx < a.size()) {
            if (axxxx == null) {
               break;
            }

            if (axxxxxx % axxx != 0) {
               ImGui.sameLine(0.0F, 16.0F);
            }

            a.daj(a.get(axxxxxx), axxxxxx);
            axxxxxx++;
            if (axxxx != null) {
               continue;
            }
         }

         ImGui.endChild();
         break;
      }
   }

   private void daj(ago a, int a) {
      long ax = ckb.a ^ 79132061669324L;
      int[] var10000 = dar.abu();
      int var10001 = a.cna();
      short var10002 = 7452;
      long var10003 = 2992967464934554616L ^ ax;
      ImGui.pushID("card_" + var10001);
      ImGui.setCursorPosX(ImGui.getCursorPosX() + 10.0F);
      int[] axx = var10000;
      short var11 = 3240;
      long var26 = 5792873254082690856L ^ ax;
      ImGui.pushStyleVar(1942542535, 8.0F);
      short var12 = 14072;
      long var27 = 4933744084305872241L ^ ax;
      ImGui.pushStyleVar(-2067402092, 1.0F);
      ImGui.pushStyleColor(3, 0.12F, 0.12F, 0.15F, 1.0F);
      ImGui.pushStyleColor(5, 0.3F, 0.3F, 0.4F, 0.5F);
      short var28 = 7982;
      long var38 = 3562819167261407732L ^ ax;
      String var13 = "ConfigCard##" + a;
      short var10004 = 13915;
      long var10005 = 5935978981564646863L ^ ax;
      byte var14 = ImGui.beginChild(var13, 280.0F, 180.0F, true, -1787920998);
      if (axx != null) {
         if (var14 != 0) {
            label63: {
               String axxx;
               label62: {
                  short var15 = 7179;
                  long var29 = 3202796861745082254L ^ ax;
                  ImGui.pushStyleVar(-1765776652, 4.0F, 6.0F);
                  ImGui.pushStyleColor(0, 0.9F, 0.95F, 1.0F, 1.0F);
                  String var30 = a.amx();
                  var10002 = 1364;
                  var10003 = 5854046863530407644L ^ ax;
                  ImGui.text(a.fdn(var30, 5092324));
                  ImGui.popStyleColor();
                  ImGui.pushStyleColor(0, 0.7F, 0.7F, 0.8F, 1.0F);
                  axxx = a.chb();
                  String var16 = axxx;
                  if (axx != null) {
                     if (axxx != null) {
                        var17 = axxx.isEmpty();
                        if (axx == null) {
                           break label63;
                        }

                        if (var17 == 0) {
                           break label62;
                        }
                     }

                     short var18 = 16564;
                     long var31 = 4324731085161064014L ^ ax;
                     var16 = "No description provided";
                  }

                  axxx = var16;
               }

               var10002 = 5276;
               var10003 = 4437194233272477457L ^ ax;
               ImGui.textWrapped(a.fdn(axxx, 105659638));
               short var19 = 30942;
               ImGui.popStyleColor();
               long var32 = 8427028331351203375L ^ ax;
               ImGui.separator();
               ImGui.spacing();
               ImGui.pushStyleColor(0, 0.6F, 0.8F, 1.0F, 1.0F);
               ImGui.text("User: ");
               ImGui.sameLine();
               var17 = 0;
            }

            ImGui.pushStyleColor(var17, 0.8F, 0.8F, 0.9F, 1.0F);
            ImGui.text(a.ayq().eus());
            ImGui.popStyleColor();
            var10002 = 24813;
            var10003 = 1386539672165303825L ^ ax;
            SimpleDateFormat axxx = new SimpleDateFormat("MMM dd, yyyy");
            short var20 = 10781;
            long var33 = 1187664902222384381L ^ ax;
            ImGui.text("Date: ");
            short var21 = 20839;
            ImGui.sameLine();
            long var34 = 1462092862481037214L ^ ax;
            ImGui.pushStyleColor(0, 0.8F, 0.8F, 0.9F, 1.0F);
            ImGui.text(axxx.format(new Date(a.bsl())));
            ImGui.popStyleColor(2);
            ImGui.pushStyleColor(0, 0.6F, 0.8F, 1.0F, 1.0F);
            ImGui.text("ID: ");
            ImGui.sameLine();
            ImGui.pushStyleColor(0, 0.8F, 0.8F, 0.9F, 1.0F);
            ImGui.text(String.valueOf(a.cna()));
            ImGui.popStyleColor(2);
            ImGui.spacing();
            ImGui.separator();
            float axxxx = 256.0F;
            short var22 = 17187;
            long var35 = 2065094630061600936L ^ ax;
            ImGui.pushStyleColor(1430266547, 0.1F, 0.4F, 0.8F, 1.0F);
            short var23 = 15037;
            var28 = 28449;
            long var42 = 8024556627124542646L ^ ax;
            ImGui.pushStyleColor(-1696452560, 0.2F, 0.5F, 0.9F, 1.0F);
            long var37 = 829751540866653274L ^ ax;
            var10002 = 32030;
            var10003 = 3871583568860728980L ^ ax;
            ImGui.pushStyleColor(-274304818, 0.05F, 0.3F, 0.7F, 1.0F);
            byte var24 = ImGui.button("Load Config", axxxx, 0.0F);
            if (axx != null) {
               if (var24 != 0) {
                  try {
                     JsonObject axxxxx = a.dvu();
                     JsonObject var25 = axxxxx;
                     if (axx != null) {
                        if (axxxxx == null) {
                           return;
                        }

                        var25 = axxxxx;
                     }

                     gco.axu(var25);
                  } catch (Exception var10) {
                     var10.printStackTrace();
                  }
               }

               var24 = 3;
            }

            ImGui.popStyleColor(var24);
            ImGui.popStyleVar();
         }

         ImGui.endChild();
         ImGui.popStyleColor(2);
         var14 = 2;
      }

      ImGui.popStyleVar(var14);
      ImGui.popID();
   }

   private void gkl() {
      long a = ckb.a ^ 54992456513117L;
      int[] var10000 = dar.abu();
      float var10001 = ImGui.getMainViewport().getCenterX();
      float var10002 = ImGui.getMainViewport().getCenterY();
      short var10003 = 14072;
      long var10004 = 4933794415690147040L ^ a;
      ImGui.setNextWindowPos(var10001, var10002, -2067402092, 0.5F, 0.5F);
      var10003 = 14072;
      var10004 = 4933794415690147040L ^ a;
      ImGui.setNextWindowSize(400.0F, 300.0F, -2067402092);
      short var18 = 25885;
      long var27 = 2411996731870257788L ^ a;
      ImGui.text("Config Name:");
      int[] ax = var10000;
      ImGui.setNextItemWidth(-1.0F);
      short var8 = 21627;
      long var19 = 6923607767596667653L ^ a;
      ImGui.inputText("##name", a.ebg);
      boolean var9 = a.ebg.get().isEmpty();
      if (ax != null) {
         if (var9) {
            ImGui.pushStyleColor(0, 1.0F, 0.4F, 0.4F, 1.0F);
            short var10 = 8088;
            long var20 = 714209837269244157L ^ a;
            ImGui.text("Name is required");
            ImGui.popStyleColor();
         }

         ImGui.spacing();
         short var11 = 10610;
         long var21 = 5791898110529433097L ^ a;
         ImGui.text("Description (optional):");
         short var12 = 18103;
         ImGui.setNextItemWidth(-1.0F);
         long var22 = 8602164864674660804L ^ a;
         ImGui.inputTextMultiline("##desc", a.fhe, 0.0F, 80.0F);
      }

      ImGui.spacing();
      ImGui.separator();
      ImGui.spacing();
      float axx = 80.0F;
      float axxx = 8.0F;
      float axxxx = axx * 2.0F + axxx;
      ImGui.setCursorPosX((ImGui.getWindowWidth() - axxxx) * 0.5F);
      boolean var13 = a.ebg.get().trim().isEmpty();
      if (ax != null) {
         var13 = !var13;
      }

      boolean axxxxx = var13;
      boolean var14 = axxxxx;
      if (ax != null) {
         if (!axxxxx) {
            ImGui.pushStyleVar(0, 0.5F);
         }

         short var15 = 28818;
         long var23 = 2523512674564317829L ^ a;
         ImGui.pushStyleColor(244496913, 0.2F, 0.7F, 0.2F, 1.0F);
         short var16 = 25545;
         short var24 = 3223;
         long var28 = 2326141574969515656L ^ a;
         ImGui.pushStyleColor(172275743, 0.3F, 0.8F, 0.3F, 1.0F);
         long var25 = 2763936203538900097L ^ a;
         var14 = ImGui.button("Create", axx, 0.0F);
      }

      label66:
      if (ax != null) {
         if (var14) {
            var14 = axxxxx;
            if (ax == null) {
               break label66;
            }

            if (axxxxx) {
               new hhm(new hbo(a.ebg.get().trim(), a.fhe.get().trim(), aml.hjr.cfs(), aml.hjr.eus(), gco.bbm())).dak(dar.gqy().gp());
               new fxc().dak(dar.gqy().gp());
               ImGui.closeCurrentPopup();
            }
         }

         ImGui.popStyleColor(2);
         var14 = axxxxx;
      }

      if (ax != null) {
         if (!var14) {
            ImGui.popStyleVar();
         }

         ImGui.sameLine();
         short var17 = 6812;
         long var26 = 6649234974760492536L ^ a;
         var14 = ImGui.button("Cancel", axx, 0.0F);
      }

      if (var14) {
         ImGui.closeCurrentPopup();
      }
   }

   private String fdn(String a, int a) {
      long ax = ckb.a ^ 35415495862466L;
      int[] var5 = dar.abu();
      String var10000 = a;
      if (var5 != null) {
         if (a != null) {
            if (var5 == null) {
               return a;
            }

            if (a.length() > a) {
               var10000 = a.substring(0, a - 3);
               short var10001 = 5725;
               long var10002 = 1355063363967405985L ^ ax;
               return var10000 + "...";
            }
         }

         var10000 = a;
      }

      if (var5 != null) {
         var10000 = var10000 != null ? a : "";
      }

      return var10000;
   }

   static {
      long var11 = a ^ 83542756496019L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[35];
      int var18 = 0;
      String var17 = "Ô\u0095\u001f.\u0014½Ë\u0093u^gÇJ¬D¬9Rù§\u00988{_Ãó\u0098\u0003\u009d\rÌ70\u0091×|ÎÕoó\u0090[êÐ\u008aªëüI'\u008c£\u0007©z\"=\u0014B mÐ9\u0007¨b®\"\fÅÕ=6\u0099\u00021\fö\u0099\u000fï\u0010åè3Ç}_w\u0019\u001e\u0090«ßI<<\u008d\u00187´\u00857JÇ«ä?x(£®i¾\u0000ú±\u0091ÓÇÖ\u0018\u0004\u0010BÓTÕÌù\b\u0094|}\u009e¢O¢D[(ñ©à2fåì¾r\u0099ÚÄ\u009cóµ\u0093øÒ¾Je~\u0002w\u0084¡hà?LÃù°!lM+\u0012>f\u0010Ä\u0006Ã`§Ï\\\u0013(N¾æ\u0090t\u001a~ p\u0016õ\r$ûzÖ\u000bª¦l@\u0082\u0083»cÁØ¢\u009bÒ\u008bèT\u009bìã\u0099Íó¶ î\u009d\u0080ð.¢^'(Ð3^³î\u001f¼\u0089(ü©´ûã\u009c\u0080\u001dÛÞ\t§í}\u0010Bt¬\u009cyÍ\u0010©£ò¹*$H»o\u0010\u0088ú\u001aIé&\u009díeú\u007fåf¨\u0004ø F\u0096Bªn\u0083-5ö\u00995W\u0019¶«*ÿtYK¶¶\u009b\u001bÌù%y7ð~l\u0010/t\u0090J±\u008d\u001aÝ^\u0004ðCÊ¯OO ÿ\u0007\u0084f.\u001aû;6½b\u0017¢HHnW\u008dÞïÁ\u0099\u0091(Þv\u0083Dbh>[\u0010ó|Þþ\u0098+¦Õ\u0017å]¯\u0085ñFÿ(\u0015¼¡Ê )ek¡U]øM°\u0096\\\u001b\u0012Õ¾)\u009f°½3QÙïú2Â«\u0094È}û0\\øW\u0018õÇH\u009c,`\u0016'¦ÔnõÐ\u0015\u0002ê¾ò\u000e\u0014Õ\u0085\u0086ë(BÞÏB\u0014ó<â\u0019õ_\u009ai\u0089ëo²°Ó³\u0013a Ó\u0013eÊñ¸²Í_2XUN®Åaé\u0010Z\u008e\u0001/},µ07z¯<½Û³¢ H\u0017\u001cpRÙ\u0088;K\u008e;ç\u008d\u008fQ\u0007n¯\u001d\u009fM5é«®\u0092\u0087ð\u0012¯´à\u0010´°/ÄÐ»fQ4\u001a;^½M\u009c#8]|\u0004(kÇ®\u0080khNT\u008f¼æ¢ÝPgÈhÖtÒÈ\u0004Þ\u0097¯#Ù vrøÑõ5u/`¢ÿV\\±¤\u0097\u008dReào~]¬P¸j\u0019þ\thJcÌ\rb\u0005\u008d B-\u0081ÍFVÓ\u00070ò!N`vü¤\u001c/4ÖÑ\u0095ò\t¼áAT\u0006À\u0090`\u009f5Ø]\u009bçEüÿÃ8*\u008cä\u001cîæíÂÂ\u0001\u007fæµáÛó2L}õµ3Î\u0018è\u0091\u0093íwQ}zT\u0081Y\u0086¨Dè'\u008b\u0085N\u0085Ûð\u0017M\u0018\u0090T6\u0082\u00062íÏ/i\u009c1¿Êf\u0013C~\u0000\u009dÐøN\u0081\u0010X=ÞP¥I!CÒ{\u0084®Ì\u0015\u0007U(1q\u0081¼#êu@üSnÌ\u0016VZ\u0086\u001fEýv\u0012¬¯F\t\u0088/=Ä\u009eå]\u0005s\u000eÂÿ»ïO\u0010ìÑ\u001b*z¼\u0093Cø'\u0017¸óO\u0018n\u0018éc\u008f²òtô\u000b\u0082+q2w\u00881o\u009a\u009c}Ð\u009d\t\u00ad)\u0010¹\u0085°\u0004\nlZÿ³\u001eüý\tç¾ÊX\u008e\u0011\\f\u0091OX9Â@'Ú\u00adVèGÊ?]\t'²núà,W\u0094\u000b¡#\u000b\u0018\u0002\u0097\u001e±3H«íìNÍª\u0003ªß´×\u0097zWBÏÏ\u008e«\u0091NxT\u0015Éx\u00141X\u0088öa\u0004C\\ª/b¡d^\u009eÓÛûYÕ\u0097P\u0010¬]d\u008dÉ-æñxQó6\u0017h¯»\u0018î³\\uuÛ\u0098\u000b>E\u0081à)ë\u0015~\u009c33Ýo¢\u0089z";
      int var19 = "Ô\u0095\u001f.\u0014½Ë\u0093u^gÇJ¬D¬9Rù§\u00988{_Ãó\u0098\u0003\u009d\rÌ70\u0091×|ÎÕoó\u0090[êÐ\u008aªëüI'\u008c£\u0007©z\"=\u0014B mÐ9\u0007¨b®\"\fÅÕ=6\u0099\u00021\fö\u0099\u000fï\u0010åè3Ç}_w\u0019\u001e\u0090«ßI<<\u008d\u00187´\u00857JÇ«ä?x(£®i¾\u0000ú±\u0091ÓÇÖ\u0018\u0004\u0010BÓTÕÌù\b\u0094|}\u009e¢O¢D[(ñ©à2fåì¾r\u0099ÚÄ\u009cóµ\u0093øÒ¾Je~\u0002w\u0084¡hà?LÃù°!lM+\u0012>f\u0010Ä\u0006Ã`§Ï\\\u0013(N¾æ\u0090t\u001a~ p\u0016õ\r$ûzÖ\u000bª¦l@\u0082\u0083»cÁØ¢\u009bÒ\u008bèT\u009bìã\u0099Íó¶ î\u009d\u0080ð.¢^'(Ð3^³î\u001f¼\u0089(ü©´ûã\u009c\u0080\u001dÛÞ\t§í}\u0010Bt¬\u009cyÍ\u0010©£ò¹*$H»o\u0010\u0088ú\u001aIé&\u009díeú\u007fåf¨\u0004ø F\u0096Bªn\u0083-5ö\u00995W\u0019¶«*ÿtYK¶¶\u009b\u001bÌù%y7ð~l\u0010/t\u0090J±\u008d\u001aÝ^\u0004ðCÊ¯OO ÿ\u0007\u0084f.\u001aû;6½b\u0017¢HHnW\u008dÞïÁ\u0099\u0091(Þv\u0083Dbh>[\u0010ó|Þþ\u0098+¦Õ\u0017å]¯\u0085ñFÿ(\u0015¼¡Ê )ek¡U]øM°\u0096\\\u001b\u0012Õ¾)\u009f°½3QÙïú2Â«\u0094È}û0\\øW\u0018õÇH\u009c,`\u0016'¦ÔnõÐ\u0015\u0002ê¾ò\u000e\u0014Õ\u0085\u0086ë(BÞÏB\u0014ó<â\u0019õ_\u009ai\u0089ëo²°Ó³\u0013a Ó\u0013eÊñ¸²Í_2XUN®Åaé\u0010Z\u008e\u0001/},µ07z¯<½Û³¢ H\u0017\u001cpRÙ\u0088;K\u008e;ç\u008d\u008fQ\u0007n¯\u001d\u009fM5é«®\u0092\u0087ð\u0012¯´à\u0010´°/ÄÐ»fQ4\u001a;^½M\u009c#8]|\u0004(kÇ®\u0080khNT\u008f¼æ¢ÝPgÈhÖtÒÈ\u0004Þ\u0097¯#Ù vrøÑõ5u/`¢ÿV\\±¤\u0097\u008dReào~]¬P¸j\u0019þ\thJcÌ\rb\u0005\u008d B-\u0081ÍFVÓ\u00070ò!N`vü¤\u001c/4ÖÑ\u0095ò\t¼áAT\u0006À\u0090`\u009f5Ø]\u009bçEüÿÃ8*\u008cä\u001cîæíÂÂ\u0001\u007fæµáÛó2L}õµ3Î\u0018è\u0091\u0093íwQ}zT\u0081Y\u0086¨Dè'\u008b\u0085N\u0085Ûð\u0017M\u0018\u0090T6\u0082\u00062íÏ/i\u009c1¿Êf\u0013C~\u0000\u009dÐøN\u0081\u0010X=ÞP¥I!CÒ{\u0084®Ì\u0015\u0007U(1q\u0081¼#êu@üSnÌ\u0016VZ\u0086\u001fEýv\u0012¬¯F\t\u0088/=Ä\u009eå]\u0005s\u000eÂÿ»ïO\u0010ìÑ\u001b*z¼\u0093Cø'\u0017¸óO\u0018n\u0018éc\u008f²òtô\u000b\u0082+q2w\u00881o\u009a\u009c}Ð\u009d\t\u00ad)\u0010¹\u0085°\u0004\nlZÿ³\u001eüý\tç¾ÊX\u008e\u0011\\f\u0091OX9Â@'Ú\u00adVèGÊ?]\t'²núà,W\u0094\u000b¡#\u000b\u0018\u0002\u0097\u001e±3H«íìNÍª\u0003ªß´×\u0097zWBÏÏ\u008e«\u0091NxT\u0015Éx\u00141X\u0088öa\u0004C\\ª/b¡d^\u009eÓÛûYÕ\u0097P\u0010¬]d\u008dÉ-æñxQó6\u0017h¯»\u0018î³\\uuÛ\u0098\u000b>E\u0081à)ë\u0015~\u009c33Ýo¢\u0089z"
         .length();
      char var16 = ' ';
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
                     c = new String[35];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[20];
                     int var3 = 0;
                     String var4 = "ëw¼\u001cÛ\u0083g¾$\u008fôÿP¼\u0080«¬HÖæu³-pøy][Ü\u0005\\üìk\u0016'£\u008d2ô»\\\u008cRE¹V\u0080-ê3D2ÂÇ\u009côy\u008f\u0005Á\u00816\u0084zèë¶\u0080\u0014\u0084ÀIU\u008bË¯ª\u008c\n%X\u0007±òpó,Ô\u0010\n\u001cü`¡Íl\u001a\u009ejè\u0092´g£\u0012cµ;v[\u0093(o³§Ù\b\u0091GØÄãÞgDª´ô\u0085LÞÂä¥Ð\u0087®\u001bÝAÈ)\u0019";
                     int var5 = "ëw¼\u001cÛ\u0083g¾$\u008fôÿP¼\u0080«¬HÖæu³-pøy][Ü\u0005\\üìk\u0016'£\u008d2ô»\\\u008cRE¹V\u0080-ê3D2ÂÇ\u009côy\u008f\u0005Á\u00816\u0084zèë¶\u0080\u0014\u0084ÀIU\u008bË¯ª\u008c\n%X\u0007±òpó,Ô\u0010\n\u001cü`¡Íl\u001a\u009ejè\u0092´g£\u0012cµ;v[\u0093(o³§Ù\b\u0091GØÄãÞgDª´ô\u0085LÞÂä¥Ð\u0087®\u001bÝAÈ)\u0019"
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
                                    f = new Integer[20];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u009c\t0\u0004îi8\u0096¢\u009b:;\u0011·ñ?";
                                 var5 = "\u009c\t0\u0004îi8\u0096¢\u009b:;\u0011·ñ?".length();
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

                  var17 = "è\u000bæÀ+\u001f\u0007ñ\u0095¬Á\u0088÷å«õ>ë¹ô/¦D\u009cS\u0011âÏè\\¤N\u0010æ\u0090¼T\u0017\u0006¢'yx°já±Ë\u0088";
                  var19 = "è\u000bæÀ+\u001f\u0007ñ\u0095¬Á\u0088÷å«õ>ë¹ô/¦D\u009cS\u0011âÏè\\¤N\u0010æ\u0090¼T\u0017\u0006¢'yx°já±Ë\u0088".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12572;
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
            throw new RuntimeException("cc/astralis/ckb", var10);
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
         throw new RuntimeException("cc/astralis/ckb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9315;
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
            throw new RuntimeException("cc/astralis/ckb", var14);
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
         throw new RuntimeException("cc/astralis/ckb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
