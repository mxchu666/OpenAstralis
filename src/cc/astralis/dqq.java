package cc.astralis;

import dev.opalV2.Loader;
import dev.opalV2.hidden.Hidden0;

public class dqq extends cec {
   public static float[] cit;
   public static float[] bgj;
   public static float[] djj;
   public static float[] ezi;
   public static float ahd;
   public static float epd;
   public static float eiu;
   public static boolean hjx;
   private static float ejv;
   private static float adu;
   public static boolean fzm;
   private static final long a;

   public static void edu(float yaw, float pitch, float yawSpeed, float pitchSpeed) {
      djj = new float[]{a, a};
      ejv = a;
      adu = a;
      bzx = true;
      fwh();
   }

   public static void cms(float[] rotations, float yawSpeed, float pitchSpeed) {
      djj = a;
      ejv = a;
      adu = a;
      bzx = true;
      fwh();
   }

   @gdz
   public void byw(fxx event) {
      label59: {
         float[] var5;
         label58: {
            long ax = dqq.a ^ 120975774689185L;
            int[] var4 = dar.abu();
            byte var10000 = bzx;
            if (var4 != null) {
               if (bzx) {
                  var5 = cit;
                  if (var4 == null) {
                     break label58;
                  }

                  if (cit != null) {
                     var5 = bgj;
                     if (var4 == null) {
                        break label58;
                     }

                     if (bgj != null) {
                        var5 = djj;
                        if (var4 == null) {
                           break label58;
                        }

                        if (djj != null) {
                           var5 = ezi;
                           if (var4 == null) {
                              break label58;
                           }

                           if (ezi != null) {
                              break label59;
                           }
                        }
                     }
                  }
               }

               var10000 = 2;
            }

            var5 = new float[var10000];
            var5[0] = chi.field_1724.method_36454();
            var5[1] = chi.field_1724.method_36455();
            ezi = var5;
            djj = var5;
            bgj = var5;
         }

         cit = var5;
      }

      if (bzx) {
         fwh();
      }
   }

   @gdz
   public void dss(etk event) {
      long ax = dqq.a ^ 102816784197647L;
      int[] var4 = dar.abu();
      if (bzx && cit != null) {
         boolean var10000 = fzm;
         if (var4 != null) {
            if (!fzm) {
               return;
            }

            var10000 = ((eky)dar.gqy().aws().diy(eky.class)).dsv();
         }

         if (var4 != null) {
            if (var10000) {
               return;
            }

            var10000 = dar.gqy().aws().diy(bni.class).dsv();
         }

         if (!var10000) {
            evd.dnu(a, ev());
            return;
         }
      }
   }

   @gdz
   public void brv(epn event) {
      long ax = dqq.a ^ 43290619774351L;
      if (bzx && cit != null && fzm) {
         a.dbe(ev());
      }
   }

   @gdz
   public void aon(goc event) {
      long ax = dqq.a ^ 70005653876115L;
      if (bzx && cit != null && fzm) {
         a.clu(ev());
      }
   }

   @gdz
   public void dfy(eih event) {
      label54: {
         float[] var7;
         label53: {
            long ax = dqq.a ^ 100174301201549L;
            int[] axx = dar.abu();
            byte var10000 = bzx;
            if (axx != null) {
               if (bzx) {
                  var7 = cit;
                  if (axx == null) {
                     break label53;
                  }

                  if (cit != null) {
                     float axxx = cit[0];
                     float axxxx = cit[1];
                     a.gty(axxx);
                     a.bqy(axxxx);
                     fzm = dar.gqy().aws().diy(bdh.class).fsr.dnp();
                     ezi = new float[]{axxx, axxxx};
                     var7 = cit;
                     label48:
                     if (axx != null) {
                        if (Math.abs((cit[0] - chi.field_1724.method_36454()) % 360.0F) < 1.0F) {
                           var7 = cit;
                           if (axx == null) {
                              break label48;
                           }

                           if (Math.abs(cit[1] - chi.field_1724.method_36455()) < 1.0F) {
                              bzx = false;
                           }
                        }

                        var7 = cit;
                     }

                     bgj = var7;
                     if (axx != null) {
                        break label54;
                     }
                  }
               }

               var10000 = 2;
            }

            var7 = new float[var10000];
            var7[0] = chi.field_1724.method_36454();
            var7[1] = chi.field_1724.method_36455();
         }

         bgj = var7;
      }

      djj = new float[]{chi.field_1724.method_36454(), chi.field_1724.method_36455()};
   }

   public static void fwh() {
      long a = dqq.a ^ 45871283185384L;
      int[] var10000 = dar.abu();
      ahf();
      int[] ax = var10000;
      float[] var8 = bgj;
      if (ax != null) {
         if (bgj == null) {
            return;
         }

         var8 = djj;
      }

      if (ax != null) {
         if (var8 == null) {
            return;
         }

         var8 = bgj;
      }

      float axx = var8[0];
      float axxx = bgj[1];
      float axxxx = djj[0];
      float axxxxx = djj[1];
      float var11;
      int var9 = (var11 = ejv - 180.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
      if (ax != null) {
         if (var9 != 0) {
            axxxx = dgq.gz(axx, axxxx, ejv);
         }

         float var12;
         var9 = (var12 = adu - 180.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
      }

      if (ax != null) {
         if (var9 != 0) {
            axxxxx = dgq.gz(axxx, axxxxx, adu);
         }

         var9 = 2;
      }

      float[] var10 = new float[var9];
      var10[0] = axxxx;
      var10[1] = axxxxx;
      float[] axxxxxx = dgq.ewm(var10, new float[]{axx, axxx});
      cit = new float[]{axxxxxx[0], axxxxxx[1]};
      if (ax != null) {
         if (hjx) {
            return;
         }

         ahd = axxxxxx[0];
      }

      epd = axxxxxx[1];
   }

   private static native void ahf();

   public static float ev() {
      return cit[0];
   }

   public static float czi() {
      return cit[1];
   }

   public static void bje(float[] rotations) {
      cit = a;
   }

   public static void gay(float[] lastRotations) {
      bgj = a;
   }

   public static void eyz(float[] targetRotations) {
      djj = a;
   }

   public static void bbp(float[] lastServerRotations) {
      ezi = a;
   }

   public static float[] dgo() {
      return cit;
   }

   public static float[] dul() {
      return bgj;
   }

   public static float[] gkr() {
      return djj;
   }

   public static float[] emk() {
      return ezi;
   }

   public static void gns(float fakeYaw) {
      ahd = a;
   }

   public static void eya(float fakePitch) {
      epd = a;
   }

   public static void bff(float randomisedRotationSpeed) {
      eiu = a;
   }

   public static float gwi() {
      return ahd;
   }

   public static float bzj() {
      return epd;
   }

   public static float bif() {
      return eiu;
   }

   public static boolean bvv() {
      return hjx;
   }

   public static void axd(boolean spoofRotations) {
      hjx = a;
   }

   public static float cvk() {
      return ejv;
   }

   public static float eag() {
      return adu;
   }

   public static void hjd(float yawSpeed) {
      ejv = a;
   }

   public static void gkv(float pitchSpeed) {
      adu = a;
   }

   static {
      Loader.registerNativesForClass(0, dqq.class);
      Hidden0.special_clinit_0_320(dqq.class);
   }
}
