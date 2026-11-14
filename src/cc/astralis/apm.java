package cc.astralis;

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
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2664;
import net.minecraft.class_2680;
import net.minecraft.class_310;

public class apm extends hcr {
   private final adu esl;
   private final bes aqu;
   private final bes eso;
   private final bes faq;
   private final gbp gke;
   private final gbp fqj;
   private final bes hhq;
   private final gbp bhq;
   private final gbp fbw;
   private final gbp gzc;
   private final gbp fig;
   private boolean fsf;
   private boolean csp;
   private boolean elr;
   private boolean hat;
   private final cbm fz;
   private static final long a = 6024875101655L;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;
   private static final long m;

   public apm(guu parentClass) {
      long ax = apm.a ^ 66956390447690L;
      short var10002 = 4147;
      long var10003 = 1911081787515655524L ^ ax;
      super(a, "Watchdog");
      short var6 = 27717;
      long var10004 = 5555591364281510167L ^ ax;
      short var22 = 19591;
      long var10005 = 566627575360457177L ^ ax;
      String[] var38 = new String[3];
      short var10008 = 28591;
      long var10009 = 833987858671839994L ^ ax;
      var38[0] = "Strafe";
      var10008 = 28620;
      var10009 = 5178970481519471236L ^ ax;
      var38[1] = "Update";
      var10008 = 2411;
      var10009 = 6445935139474394168L ^ ax;
      var38[2] = "Correction";
      a.esl = new adu("Event Mode", "Strafe", var38);
      short var7 = 19307;
      var10004 = 6514986611216059962L ^ ax;
      a.aqu = new bes("Ground Speed (No Speed Pot)", 0.45F, 0.0F, 2.0F, 0.01F);
      short var8 = 6282;
      var10004 = 7626723083527216599L ^ ax;
      a.eso = new bes("Ground Speed (Speed One)", 0.45F, 0.0F, 2.0F, 0.01F);
      short var9 = 5846;
      var10004 = 1352205209990386573L ^ ax;
      a.faq = new bes("Ground Speed (Speed Two)", 0.45F, 0.0F, 2.0F, 0.01F);
      short var10 = 5430;
      var10004 = 7458380975114801277L ^ ax;
      a.gke = new gbp("Air Strafe", true);
      short var11 = 12293;
      var10004 = 522686211129800029L ^ ax;
      a.fqj = new gbp("Air Strafe Extra", true);
      short var12 = 30542;
      var10004 = 5633061931968082455L ^ ax;
      a.hhq = new bes("Air Strafe Tolerance", 80.0F, 50.0F, 90.0F, 5.0F);
      short var13 = 23904;
      var10004 = 5258305086722152496L ^ ax;
      a.bhq = new gbp("Watchdog Strafe", true);
      short var14 = 23987;
      var10004 = 3579372040444483815L ^ ax;
      a.fbw = new gbp("Watchdog Low Hop", true);
      short var15 = 15254;
      var10004 = 4181318975943999180L ^ ax;
      a.gzc = new gbp("Seven Tick", true);
      short var16 = 13061;
      var10004 = 8677643050215274073L ^ ax;
      a.fig = new gbp("Experimental Strafe Chech", true);
      a.fsf = false;
      a.fz = new cbm();
      short var10001 = 3523;
      long var5 = 5421636931912018995L ^ ax;
      ffn[] var4 = new ffn[]{a.esl, a.aqu, a.eso, a.faq, a.gke, a.hhq.bih(a.gke::dnp), null, null, null, null, null};
      short var17 = 32496;
      var10004 = 2533730566020423437L ^ ax;
      var4[6] = a.bhq;
      short var18 = 12818;
      var10004 = 7866335641628972000L ^ ax;
      var4[7] = a.fbw;
      short var19 = 28482;
      var10004 = 810754723440676538L ^ ax;
      var4[8] = a.gzc;
      short var20 = 1956;
      var10004 = 4012348149488920158L ^ ax;
      var4[9] = a.fqj.bih(a.gke::dnp);
      short var21 = 26746;
      var10004 = 4552583090135812483L ^ ax;
      var4[10] = a.fig;
      a.dxe(var4);
   }

   @Override
   public void dil() {
      long a = apm.a ^ 6359149070661L;
      int[] var3 = dar.abu();
      if (var3 != null) {
         if (chi.field_1724 != null) {
            a.hat = false;
            a.fsf = false;
         }

         super.dil();
      }
   }

   @gdz
   public void ak(eih event) {
      long ax;
      int[] axx;
      class_310 var7;
      label180: {
         label179: {
            ax = apm.a ^ 97459270558745L;
            axx = dar.abu();
            boolean var10000 = ((fhd)dar.gqy().aws().diy(fhd.class)).dsv();
            if (axx != null) {
               if (!var10000) {
                  break label179;
               }

               var7 = chi;
               if (axx == null) {
                  break label180;
               }

               var10000 = chi.field_1690.field_1903.method_1434();
            }

            if (var10000) {
               return;
            }
         }

         var7 = chi;
      }

      label170: {
         label169: {
            label184: {
               class_2248 axxx = var7.field_1687.method_8320(chi.field_1724.method_24515().method_10074()).method_26204();
               String var8 = axxx.method_63499();
               short var10001 = 11747;
               long var10002 = 6997317501394286329L ^ ax;
               var9 = var8.contains("stairs");
               if (axx != null) {
                  if (var9 != 0) {
                     break label184;
                  }

                  String var10 = axxx.method_63499();
                  var10001 = 5532;
                  var10002 = 4974993320487472773L ^ ax;
                  var9 = var10.contains("slab");
               }

               if (axx == null) {
                  break label170;
               }

               if (var9 == 0) {
                  break label169;
               }
            }

            a.fz.glr();
         }

         var9 = chi.field_1724.method_24828();
      }

      label157:
      if (axx != null) {
         if (var9 != 0) {
            var9 = a.clv().dsv();
            if (axx == null) {
               break label157;
            }

            if (var9 != 0) {
               a.csp = a.elr = false;
               chi.field_1724.method_6043();
               var9 = a.fz.fsc(m);
               if (axx == null) {
                  break label157;
               }

               if (var9 != 0) {
                  evd.dek(evd.cqz(a.aqu.dnp().floatValue(), a.eso.dnp().floatValue(), a.faq.dnp().floatValue()));
               }
            }
         }

         a.dji();
         var9 = chi.field_1724.field_5976;
      }

      label147:
      if (axx != null) {
         if (var9 != 0) {
            var9 = evd.dbj();
            if (axx == null) {
               break label147;
            }

            if (var9 == 0) {
               return;
            }
         }

         var9 = a.fbw.dnp();
      }

      if (axx != null) {
         if (var9 == 0) {
            return;
         }

         var9 = a.gzc.dnp();
      }

      if (axx != null) {
         if (var9 != 0) {
            return;
         }

         var9 = (int)Math.round(chi.field_1724.method_23318() % 1.0 * 10000.0);
      }

      int axxxx = var9;
      int var11 = axxxx;
      if (axx != null) {
         switch (axxxx) {
            case 13:
               bav.fym(bav.hai() - 0.02483);
               if (axx != null) {
                  break;
               }
            case 2000:
               bav.fym(bav.hai() - 0.1913);
         }

         var11 = axxxx;
      }

      if (axx != null) {
         short var13 = 10841;
         long var16 = 6979273872067499505L ^ ax;
         if (var11 == 13) {
            a.elr = true;
         }

         var11 = a.elr;
      }

      if (axx != null) {
         if (var11 != 0) {
            a.ewz(a.eil() - 1.0E-5);
         }

         var11 = axxxx;
      }

      if (axx != null) {
         short var14 = 29945;
         long var17 = 6711695964553169750L ^ ax;
         if (var11 == 3426) {
            a.csp = true;
         }

         var11 = a.csp;
      }

      if (var11 != 0) {
         evd.dek(evd.fzm());
      }
   }

   @gdz
   public void aet(fxx event) {
      long ax = apm.a ^ 48699050739404L;
      int[] var4 = dar.abu();
      boolean var10000 = a.fqj.dnp();
      if (var4 != null) {
         if (var10000) {
            a.dji();
         }

         short var10001 = 4153;
         long var10002 = 8484114981538507232L ^ ax;
         var10000 = a.esl.emb("Update");
      }

      if (var4 != null) {
         if (var10000) {
            a.enj();
         }

         var10000 = a.gzc.dnp();
      }

      if (var4 != null) {
         if (!var10000) {
            return;
         }

         var10000 = a.fbw.dnp();
      }

      if (var10000) {
         bav.fym(bav.hai() + switch (hjr) {
            case 1 -> 0.05;
            case 2 -> 0.012;
            case 3 -> chi.field_1724.field_6235 != 0 ? -0.13 : -0.135;
            case 4 -> -0.2;
            default -> 0.0;
         });
      }
   }

   @gdz
   public void evm(epn event) {
      apm var5;
      label29: {
         long ax = apm.a ^ 60072743000882L;
         int[] var4 = dar.abu();
         boolean var10000 = a.fqj.dnp();
         if (var4 != null) {
            if (var10000) {
               a.dji();
            }

            var5 = a;
            if (var4 == null) {
               break label29;
            }

            short var10001 = 23880;
            long var10002 = 9137857934452586878L ^ ax;
            var10000 = a.esl.emb("Correction");
         }

         if (!var10000) {
            return;
         }

         var5 = a;
      }

      var5.enj();
   }

   @gdz
   public void hbw(dgp event) {
      apm var5;
      label29: {
         long ax = apm.a ^ 117133098857506L;
         int[] var4 = dar.abu();
         boolean var10000 = a.fqj.dnp();
         if (var4 != null) {
            if (var10000) {
               a.dji();
            }

            var5 = a;
            if (var4 == null) {
               break label29;
            }

            short var10001 = 28591;
            long var10002 = 833937671129539730L ^ ax;
            var10000 = a.esl.emb("Strafe");
         }

         if (!var10000) {
            return;
         }

         var5 = a;
      }

      var5.enj();
   }

   @gdz
   public void chw(amo event) {
      apm var5;
      label30: {
         long ax = apm.a ^ 38496918790519L;
         int[] var4 = dar.abu();
         boolean var10000 = a.bed() instanceof class_2664;
         if (var4 != null) {
            if (!var10000) {
               return;
            }

            var5 = a;
            if (var4 == null) {
               break label30;
            }

            var10000 = a.hat;
         }

         if (var10000) {
            return;
         }

         a.hat = true;
         var5 = a;
      }

      var5.fz.glr();
   }

   private void enj() {
      long a = apm.a ^ 60611332032346L;
      int[] ax = dar.abu();
      int var10000 = a.bhq.dnp();
      if (ax != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = chi.field_1724.method_24828();
      }

      if (ax != null) {
         if (var10000 != 0) {
            a.fsf = false;
            if (ax != null) {
               return;
            }
         }

         var10000 = hjr;
      }

      if (var10000 == 1) {
         double axx = evd.cqz(0.33F, 0.4F, 0.48F);
         evd.dek(Math.max(axx, evd.chd()));
      }

      double axx;
      label188: {
         label201: {
            axx = bav.beh();
            double axxx = ftb.hbp(axx, 2);
            double var11;
            var10000 = (var11 = axxx - 0.0) == 0.0 ? 0 : (var11 < 0.0 ? -1 : 1);
            if (ax != null) {
               if (var10000 >= 0) {
                  double var12;
                  var10000 = (var12 = axxx - (a.fbw.dnp() ? 1.2 : 1.3)) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
                  if (ax == null) {
                     break label188;
                  }

                  if (var10000 <= 0) {
                     break label201;
                  }

                  var10000 = ((efx)dar.gqy().aws().diy(efx.class)).dsv();
                  if (ax == null) {
                     break label188;
                  }

                  if (var10000 != 0) {
                     break label201;
                  }
               }

               var10000 = a.fig.dnp();
            }

            if (ax == null) {
               break label188;
            }

            if (var10000 != 0) {
               return;
            }
         }

         var10000 = a.hjl(
            chi.field_1724.method_23317(), chi.field_1724.method_23318() + chi.field_1724.method_18798().field_1351, chi.field_1724.method_23321()
         );
      }

      label203: {
         byte var10001;
         label204: {
            if (ax != null) {
               if (var10000 != 0) {
                  var10000 = hjr;
                  var10001 = 2;
                  if (ax == null) {
                     break label204;
                  }

                  if (hjr > 2) {
                     evd.dyv();
                  }
               }

               var10000 = hjr;
            }

            if (ax == null) {
               break label203;
            }

            var10001 = 2;
         }

         if (var10000 < var10001) {
            return;
         }

         var10000 = a.hjl(
            chi.field_1724.method_23317(), chi.field_1724.method_23318() + chi.field_1724.method_18798().field_1351 * 3.0, chi.field_1724.method_23321()
         );
      }

      label155:
      if (ax != null) {
         if (var10000 == 0) {
            var10000 = hjr;
            if (ax == null) {
               break label155;
            }

            if (hjr != b<"w">(3549, 1260860728370024766L ^ a)) {
               return;
            }
         }

         double var13;
         var10000 = (var13 = axx - 0.0) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
      }

      label146: {
         label205: {
            label206: {
               label207: {
                  if (ax != null) {
                     if (var10000 >= 0) {
                        double var14;
                        var10000 = (var14 = axx - 1.0) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
                        if (ax == null) {
                           break label206;
                        }

                        if (var10000 < 0) {
                           break label207;
                        }
                     }

                     var10000 = a.fig.dnp();
                  }

                  if (ax == null) {
                     break label206;
                  }

                  if (var10000 == 0) {
                     var10000 = ((fhd)dar.gqy().aws().diy(fhd.class)).dsv();
                     if (ax == null) {
                        break label206;
                     }

                     if (var10000 == 0) {
                        bpa.bez(a<"u">(27879, 4247857584248968353L ^ a) + axx);
                     }
                  }
               }

               var10 = a;
               if (ax == null) {
                  break label205;
               }

               var10000 = a.fsf;
            }

            if (var10000 == 0) {
               chi.field_1724.method_18799(chi.field_1724.method_18798().method_1031(0.0, 0.075, 0.0));
               a.fsf = true;
               if (ax != null) {
                  break label146;
               }
            }

            var10 = a;
         }

         var10.fsf = false;
      }

      evd.dyv();
   }

   private void dji() {
      long a = apm.a ^ 58721561096870L;
      int[] ax = dar.abu();
      int var10000 = a.gke.dnp();
      if (ax != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = chi.field_1724.method_24828();
      }

      if (ax != null) {
         if (var10000 != 0) {
            return;
         }

         var10000 = chi.field_1724.field_6235;
      }

      if (ax != null) {
         if (var10000 >= 3) {
            return;
         }

         double var16;
         var10000 = (var16 = chi.field_1724.method_18798().field_1352 - 0.0) == 0.0 ? 0 : (var16 < 0.0 ? -1 : 1);
      }

      label86: {
         if (ax != null) {
            if (var10000 != 0) {
               break label86;
            }

            double var17;
            var10000 = (var17 = chi.field_1724.method_18798().field_1350 - 0.0) == 0.0 ? 0 : (var17 < 0.0 ? -1 : 1);
         }

         if (var10000 == 0) {
            return;
         }
      }

      label102: {
         float axx = evd.gep();
         float axxx = a.gyy();
         float axxxx = a.fqj.dnp() ? Math.abs((axx - axxx + 540.0F) % 360.0F - 180.0F) : Math.abs(axx - axxx);
         int axxxxx = a.hhq.dnp().intValue();
         var10000 = a.fqj.dnp();
         if (ax != null) {
            if (var10000 != 0) {
               short var11 = 11516;
               long var14 = 6917789389888914926L ^ a;
               float var18;
               var10000 = (var18 = axxxx - (180 - axxxxx)) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
               if (ax != null) {
                  if (var10000 < 0) {
                     return;
                  }

                  var11 = 26841;
                  var14 = 4703996900315513290L ^ a;
                  float var19;
                  var10000 = (var19 = axxxx - (180 + axxxxx)) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
               }

               if (var10000 > 0) {
                  return;
               }
               break label102;
            }

            short var10001 = 26841;
            long var10002 = 4703996900315513290L ^ a;
            float var20;
            var10000 = (var20 = axxxx - (180 - axxxxx)) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
         }

         if (ax != null) {
            if (var10000 <= 0) {
               return;
            }

            short var10 = 26841;
            long var13 = 4703996900315513290L ^ a;
            float var21;
            var10000 = (var21 = axxxx - (180 + axxxxx)) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1);
         }

         if (var10000 >= 0) {
            return;
         }
      }

      chi.field_1724
         .method_18800(
            -chi.field_1724.method_18798().field_1352 * 0.85, chi.field_1724.method_18798().field_1351, -chi.field_1724.method_18798().field_1350 * 0.85
         );
   }

   private float gyy() {
      long a = apm.a ^ 118856625984381L;
      int[] var10000 = dar.abu();
      float ax = (float)Math.toDegrees(Math.atan2(-chi.field_1724.method_18798().field_1352, chi.field_1724.method_18798().field_1350));
      int[] axx = var10000;
      float var5 = ax;
      if (axx != null) {
         if (ax < 0.0F) {
            ax += 360.0F;
         }

         var5 = ax;
      }

      return var5;
   }

   private boolean hjl(double a, double a, double a) {
      long ax = apm.a ^ 43128275981271L;
      class_2338 axx = class_2338.method_49637(a, a, a);
      class_2680 axxx = chi.field_1687.method_8320(axx);
      class_265 axxxx = axxx.method_26220(chi.field_1687, axx);
      return axxxx == class_259.method_1077();
   }

   static {
      long var16 = a ^ 44639500142018L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var19 = 1; var19 < 8; var19++) {
         var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[21];
      int var23 = 0;
      String var22 = "*!fÔ6ª¦\u0000Enr\u009f?®\u00ad\u001esÿM\u0088t\n\u0081ó8¡õ_BJ/ÈCÓ\u001aåx3mÀÝ§À\bYØ#U §Ýù0´\u001bp\\>\u0099ë¿Vb1ëÈp^\u0081¨ûæõ\u0003\u0089\u0012y?QÙü(²<W½é§\n\b}ýMGèh\u008436àÌÙÒåÀÅ\u001bÞÀÿ\u0096B\u001cz\u0014\u0091\u00118ñßåù0¤\u0005Êi\u008a¨Så%Y\f]Pã¿8Ä>\u009a¥w!3»Hc/o¨é/£\u007fà6Rúº½\u0014u\u0087iN%v¥·\u0010F\u0000°ç\u0095\u0018\u0097\u0090×¯\u009f;\u0096\u0096H,\u0010²ß+\u008cñÒÒ\u0082¯´\u0081Ï\u00918~\u00078Ã\u0082Ø \u00997\u001a^¿\u0017hSäGÌÜ\u001axJÃ \u009c®t°Çý\u0007[°ãk\u009bM²·c\u008bx\u0096ÒDîu¥&,Jè\u0081\f±¯*8l0Þ\u007fAÙÀâ_\\¥Ü\u008aBYoOw\u000b\fD^QTç\u009bÚ\u001fº´N\t0Ý\u009d¨\u0017rL2\u0095D[©\u008bmÌÇ©\u0002 èÅ»Eü\u0096É¾P«û\u001c¥\u0095\u0083\u0000ÉÃv>8½\u009cÑ¡JÆ\u000f\u0084ã¬Ã fìùØX\u001d\u0097*\u001f¤êÐk\u0080`¸e«\u008cÒa wZ¼º@;=Ô1æ \u0092ô\u001eóË?Ú,èè¿\u009fvò\u0019.}Ä¨»âSzÀ\u000b\"/æ\u0086\u0016ÿA8Ñ8\b^QÌ¹qæ\u001eÛ½|!\u0002©\u0088%\rpr\\\u0099\u0016<\u0004{KödI±ï\u000fÎ;îG¯ó)C¶(åCÈ\u009d_\u0014Óm\u0087\u0013Y~ C\u00960É1²&9OGÃC\u009a\u0096$×Ì\u008c¨\u0014 2Í\u0088\u000bòV\u0014×T´¬\u0018£fæ¹eý£a¼Dd\u0019Ô55Yú-þ]à\u00ad\u0088\u00170òâú±\u0085§«ãµ# \u0094\u0082 j\u008bCCø^ðzº\u0083aXEs#T-\u009d¸ofûN²Ïb6p&\u0004d²Eð\u0010õ´\u0016¨\u0082a\u00adá+\u0085lQ\u0083â±#\u0010Vüæ\u0014\u008aÚò\u0003\u0018$´uY®KÕ )\u0094Ë~ùw\u008a(\u007f!õ\u0082Ãïÿ\\Ê<=\u0091Í\u001e\u00adHjìÞ\u0003Ý/Oë\u0010´\u0005.î8\u001c\u0096úw&«'¿z\u0000½";
      int var24 = "*!fÔ6ª¦\u0000Enr\u009f?®\u00ad\u001esÿM\u0088t\n\u0081ó8¡õ_BJ/ÈCÓ\u001aåx3mÀÝ§À\bYØ#U §Ýù0´\u001bp\\>\u0099ë¿Vb1ëÈp^\u0081¨ûæõ\u0003\u0089\u0012y?QÙü(²<W½é§\n\b}ýMGèh\u008436àÌÙÒåÀÅ\u001bÞÀÿ\u0096B\u001cz\u0014\u0091\u00118ñßåù0¤\u0005Êi\u008a¨Så%Y\f]Pã¿8Ä>\u009a¥w!3»Hc/o¨é/£\u007fà6Rúº½\u0014u\u0087iN%v¥·\u0010F\u0000°ç\u0095\u0018\u0097\u0090×¯\u009f;\u0096\u0096H,\u0010²ß+\u008cñÒÒ\u0082¯´\u0081Ï\u00918~\u00078Ã\u0082Ø \u00997\u001a^¿\u0017hSäGÌÜ\u001axJÃ \u009c®t°Çý\u0007[°ãk\u009bM²·c\u008bx\u0096ÒDîu¥&,Jè\u0081\f±¯*8l0Þ\u007fAÙÀâ_\\¥Ü\u008aBYoOw\u000b\fD^QTç\u009bÚ\u001fº´N\t0Ý\u009d¨\u0017rL2\u0095D[©\u008bmÌÇ©\u0002 èÅ»Eü\u0096É¾P«û\u001c¥\u0095\u0083\u0000ÉÃv>8½\u009cÑ¡JÆ\u000f\u0084ã¬Ã fìùØX\u001d\u0097*\u001f¤êÐk\u0080`¸e«\u008cÒa wZ¼º@;=Ô1æ \u0092ô\u001eóË?Ú,èè¿\u009fvò\u0019.}Ä¨»âSzÀ\u000b\"/æ\u0086\u0016ÿA8Ñ8\b^QÌ¹qæ\u001eÛ½|!\u0002©\u0088%\rpr\\\u0099\u0016<\u0004{KödI±ï\u000fÎ;îG¯ó)C¶(åCÈ\u009d_\u0014Óm\u0087\u0013Y~ C\u00960É1²&9OGÃC\u009a\u0096$×Ì\u008c¨\u0014 2Í\u0088\u000bòV\u0014×T´¬\u0018£fæ¹eý£a¼Dd\u0019Ô55Yú-þ]à\u00ad\u0088\u00170òâú±\u0085§«ãµ# \u0094\u0082 j\u008bCCø^ðzº\u0083aXEs#T-\u009d¸ofûN²Ïb6p&\u0004d²Eð\u0010õ´\u0016¨\u0082a\u00adá+\u0085lQ\u0083â±#\u0010Vüæ\u0014\u008aÚò\u0003\u0018$´uY®KÕ )\u0094Ë~ùw\u008a(\u007f!õ\u0082Ãïÿ\\Ê<=\u0091Í\u001e\u00adHjìÞ\u0003Ý/Oë\u0010´\u0005.î8\u001c\u0096úw&«'¿z\u0000½"
         .length();
      char var21 = 24;
      int var29 = -1;

      label64:
      while (true) {
         String var30 = var22.substring(++var29, var29 + var21);
         int var10001 = -1;

         while (true) {
            byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
            String var43 = a(var26).intern();
            switch (var10001) {
               case 0:
                  var25[var23++] = var43;
                  if ((var29 += var21) >= var24) {
                     d = var25;
                     e = new String[21];
                     i = new HashMap(13);
                     Cipher var5;
                     var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var6 = 1; var6 < 8; var6++) {
                        var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[11];
                     int var8 = 0;
                     String var9 = "âX´¤\u0081øN^è«Ù\u001d\u0015ý\u0013\u001c2| Sù\u0015¸Dmû\u0018ñ±B¤FG/¶D\u0005mOv\u0007aÚÙÑÎ\u0005ë¡*Yð~\u000e¬%(A\fjE\u008d\u0014øb\u0083\u007fëH'\u001cÄ";
                     int var10 = "âX´¤\u0081øN^è«Ù\u001d\u0015ý\u0013\u001c2| Sù\u0015¸Dmû\u0018ñ±B¤FG/¶D\u0005mOv\u0007aÚÙÑÎ\u0005ë¡*Yð~\u000e¬%(A\fjE\u008d\u0014øb\u0083\u007fëH'\u001cÄ"
                        .length();
                     byte var7 = 0;

                     label46:
                     while (true) {
                        var10001 = var7;
                        var7 += 8;
                        byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                        long[] var33 = var11;
                        var10001 = var8++;
                        long var47 = (var12[0] & 255L) << 56
                           | (var12[1] & 255L) << 48
                           | (var12[2] & 255L) << 40
                           | (var12[3] & 255L) << 32
                           | (var12[4] & 255L) << 24
                           | (var12[5] & 255L) << 16
                           | (var12[6] & 255L) << 8
                           | var12[7] & 255L;
                        byte var52 = -1;

                        while (true) {
                           long var13 = var47;
                           byte[] var15 = var5.doFinal(
                              new byte[]{
                                 (byte)(var13 >>> 56),
                                 (byte)(var13 >>> 48),
                                 (byte)(var13 >>> 40),
                                 (byte)(var13 >>> 32),
                                 (byte)(var13 >>> 24),
                                 (byte)(var13 >>> 16),
                                 (byte)(var13 >>> 8),
                                 (byte)var13
                              }
                           );
                           long var55 = (var15[0] & 255L) << 56
                              | (var15[1] & 255L) << 48
                              | (var15[2] & 255L) << 40
                              | (var15[3] & 255L) << 32
                              | (var15[4] & 255L) << 24
                              | (var15[5] & 255L) << 16
                              | (var15[6] & 255L) << 8
                              | var15[7] & 255L;
                           switch (var52) {
                              case 0:
                                 var33[var10001] = var55;
                                 if (var7 >= var10) {
                                    g = var11;
                                    h = new Integer[11];
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long var2 = 5860012828059080846L;
                                    byte[] var4 = var0.doFinal(
                                       new byte[]{
                                          (byte)(var2 >>> 56),
                                          (byte)(var2 >>> 48),
                                          (byte)(var2 >>> 40),
                                          (byte)(var2 >>> 32),
                                          (byte)(var2 >>> 24),
                                          (byte)(var2 >>> 16),
                                          (byte)(var2 >>> 8),
                                          (byte)var2
                                       }
                                    );
                                    long var50 = (var4[0] & 255L) << 56
                                       | (var4[1] & 255L) << 48
                                       | (var4[2] & 255L) << 40
                                       | (var4[3] & 255L) << 32
                                       | (var4[4] & 255L) << 24
                                       | (var4[5] & 255L) << 16
                                       | (var4[6] & 255L) << 8
                                       | var4[7] & 255L;
                                    byte var41 = -1;
                                    m = var50;
                                    return;
                                 }
                                 break;
                              default:
                                 var33[var10001] = var55;
                                 if (var7 < var10) {
                                    continue label46;
                                 }

                                 var9 = "w\u009dEÊJF^µ\u0003ù\u00027~\u0088Ã\u0011";
                                 var10 = "w\u009dEÊJF^µ\u0003ù\u00027~\u0088Ã\u0011".length();
                                 var7 = 0;
                           }

                           byte var40 = var7;
                           var7 += 8;
                           var12 = var9.substring(var40, var7).getBytes("ISO-8859-1");
                           var33 = var11;
                           var10001 = var8++;
                           var47 = (var12[0] & 255L) << 56
                              | (var12[1] & 255L) << 48
                              | (var12[2] & 255L) << 40
                              | (var12[3] & 255L) << 32
                              | (var12[4] & 255L) << 24
                              | (var12[5] & 255L) << 16
                              | (var12[6] & 255L) << 8
                              | var12[7] & 255L;
                           var52 = 0;
                        }
                     }
                  }

                  var21 = var22.charAt(var29);
                  break;
               default:
                  var25[var23++] = var43;
                  if ((var29 += var21) < var24) {
                     var21 = var22.charAt(var29);
                     continue label64;
                  }

                  var22 = "\u0005\u009b´\u0001ÞÚ`Â\u009eÍ\u0018«¯º¥A JÇ\u001bÃJ\u008ay\u0082¾V®¯Á-7`\fJ:þ\u0011æx¾\u009aÉ´þÊø\u0099>";
                  var24 = "\u0005\u009b´\u0001ÞÚ`Â\u009eÍ\u0018«¯º¥A JÇ\u001bÃJ\u008ay\u0082¾V®¯Á-7`\fJ:þ\u0011æx¾\u009aÉ´þÊø\u0099>".length();
                  var21 = 16;
                  var29 = -1;
            }

            var30 = var22.substring(++var29, var29 + var21);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12999;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/apm", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("cc/astralis/apm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22119;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/apm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("cc/astralis/apm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
