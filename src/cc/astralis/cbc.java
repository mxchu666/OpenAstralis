package cc.astralis;

import java.awt.Color;
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
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cbc extends bmd {
   private final guu cca;
   private boolean aks;
   private static final Color gb;
   private static final Color crk;
   public static final Color fgl;
   public static final int elx;
   public static final int gsu;
   public static final int eas;
   private static final String czp;
   private final List<dcg> gaw;
   private final erp beq;
   private final erp bxz;
   private static final long a = 62933262188176L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long[] h;
   private static final Long[] i;
   private static final Map j;

   public cbc(guu module, float width, float height) {
      long ax = cbc.a ^ 79183929778877L;
      int[] var10000 = dar.abu();
      super();
      a.gaw = new ArrayList<>();
      int[] axx = var10000;
      a.beq = new erp(dtw.EASE_IN_OUT_SINE, c<"r">(4345, 9160063788821229682L ^ ax));
      a.bxz = new erp(dtw.EASE_IN_OUT_SINE, c<"r">(32520, 8220452856284635010L ^ ax));
      a.cca = a;
      a.fqg(a);
      a.fuo(a);
      short var17 = 1194;
      long var10001 = 8893480117252632943L ^ ax;
      int axxx = 16;

      for (ffn<?> axxxx : a.cbf()) {
         label41: {
            label40: {
               label39: {
                  label38: {
                     label37: {
                        Objects.requireNonNull(axxxx);
                        var10000 = (int[])axxxx;
                        if (axx != null) {
                           switch (axxxx) {
                              case gbp var19:
                                 var10000 = (int[])axxxx;
                                 break;
                              case adu var20:
                                 break label37;
                              case cyx var21:
                                 break label38;
                              case bes var22:
                                 break label39;
                              case acn var23:
                                 break label40;
                              default:
                                 break label41;
                           }
                        }

                        gbp axxxxx = (gbp)var10000;
                        a.gaw.add(new dcg(axxxx, new fal(axxxxx, a.arq(), 16.0F)));
                        if (axx != null) {
                           break label41;
                        }
                     }

                     adu axxxxx = (adu)axxxx;
                     a.gaw.add(new dcg(axxxx, new hcd(axxxxx, a.arq(), 16.0F)));
                     if (axx != null) {
                        break label41;
                     }
                  }

                  cyx axxxxx = (cyx)axxxx;
                  a.gaw.add(new dcg(axxxx, new biu(axxxxx, a.arq(), 16.0F)));
                  if (axx != null) {
                     break label41;
                  }
               }

               bes axxxxx = (bes)axxxx;
               a.gaw.add(new dcg(axxxx, new ffz(axxxxx, a.arq(), 16.0F)));
               if (axx != null) {
                  break label41;
               }
            }

            acn axxxxx = (acn)axxxx;
            a.gaw.add(new dcg(axxxx, new crb(axxxxx, a.arq(), 16.0F)));
         }

         if (axx == null) {
            break;
         }
      }
   }

   @Override
   public void ckn(float x, float y, float mouseX, float mouseY) {
      long ax = cbc.a ^ 37889293474419L;
      int[] var10000 = dar.abu();
      a.fji(a);
      int[] axx = var10000;
      a.axc(a);
      float axxx = a + 6.0F - 2.0F;
      a.beq.dwm(a.aks ? 1.0 : 0.0);
      short var12 = 27955;
      dmp.cpp(a, a, a.arq(), a.ajg(), 5.0F, gb);
      long var10001 = 3648109378523621489L ^ ax;
      dmp.cpp(a, a, a.arq(), super.ajg(), 5.0F, crk);
      short var19 = 16714;
      long var10002 = 5895515782007327814L ^ ax;
      bxc.emc("Sf-Ui", 11).aof(a.cca.clp(), a + 6.0F, axxx, Color.white.darker());
      String axxxx = a.cca.epz();
      String var13 = axxxx;
      if (axx != null) {
         int var14 = axxxx.length();
         short var20 = 4399;
         var10002 = 4745630967335083050L ^ ax;
         if (var14 > 60) {
            short var26 = 10716;
            long var10003 = 5101288115960145106L ^ ax;
            short var29 = 22347;
            long var10004 = 1546223269843718664L ^ ax;
            String var15 = axxxx.substring(0, 60 - "...".length());
            short var21 = 31640;
            var10002 = 6828968594870566622L ^ ax;
            axxxx = var15 + "...";
         }

         short var16 = 498;
         var10001 = 1296937962295067827L ^ ax;
         var13 = "Sf-Ui";
      }

      short var23 = 20579;
      var10002 = 7721822871290027365L ^ ax;
      bxc.emc(var13, 10).aof(axxxx, a + 6.0F, axxx + 11.0F, fgl);
      float axxxxx = super.ajg() - 12.0F;
      float var17 = a + a.arq() - (axxxxx + 6.0F);
      float var24 = a + 6.0F;
      short var10007 = 19049;
      long var10008 = 3378823903697274720L ^ ax;
      short var30 = 2370;
      long var10009 = 5116010269914350657L ^ ax;
      short var31 = 2370;
      long var10010 = 5116010269914350657L ^ ax;
      dmp.cpp(var17, var24, axxxxx, axxxxx, 4.0F, new Color(28, 28, 28));
      int var18 = a.cca.dsv();
      if (axx != null) {
         if (var18 != 0) {
            ezv axxxxxx = dar.gqy().aws().diy(ezv.class);
            dmp.dsm(a + a.arq() - (axxxxx + 6.0F), a + 6.0F, axxxxx, axxxxx, 4.0F, axxxxxx.ehf.dnp(), axxxxxx.aoz.dnp());
         }

         double var32;
         var18 = (var32 = a.beq.hjo() - 0.0) == 0.0 ? 0 : (var32 < 0.0 ? -1 : 1);
      }

      if (var18 > 0) {
         dmp.abh(a, a, a.arq(), a.ajg(), () -> {
            long ax = cbc.a ^ 138558959876021L;
            int[] var10000x = dar.abu();
            float axx = a + super.ajg() + 3.0F;
            Iterator var9x = a.gaw.iterator();
            int[] axxx = var10000x;

            while (var9x.hasNext()) {
               label22: {
                  dcg axxxx = (dcg)var9x.next();
                  dcg var11x = axxxx;
                  if (axxx != null) {
                     if (!axxxx.eyr.ajf().get()) {
                        break label22;
                     }

                     var11x = axxxx;
                  }

                  var11x.cpk().ckn(a, axx, a, a);
                  axx += axxxx.cpk.ajg() + 4.0F;
               }

               if (axxx == null) {
                  break;
               }
            }
         });
      }
   }

   @Override
   public void gdj(double mouseX, double mouseY, int button) {
      long ax = cbc.a ^ 39734471383039L;
      int[] axx = dar.abu();
      int var10000 = fuv.bfm(a, a, a.aqy(), a.gpn(), a.arq(), super.ajg());
      if (axx != null) {
         if (var10000) {
            label84: {
               var10000 = a;
               if (axx != null) {
                  if (a == 0) {
                     a.cca.gxo();
                     if (axx != null) {
                        return;
                     }
                  }

                  var12 = a;
                  if (axx == null) {
                     break label84;
                  }

                  var10000 = a.gaw.isEmpty();
               }

               if (var10000 != 0) {
                  return;
               }

               var12 = a;
            }

            boolean var10001 = a.aks;
            if (axx != null) {
               var10001 = !a.aks;
            }

            var12.aks = var10001;
            a.beq.bpt(a.beq.hjo());
            if (axx != null) {
               return;
            }
         }

         var10000 = fuv.bfm(a, a, a.aqy(), a.gpn() + super.ajg(), a.arq(), a.ajg());
      }

      if (var10000) {
         for (dcg axxx : a.gaw) {
            label56: {
               dcg var13 = axxx;
               if (axx != null) {
                  if (!axxx.eyr.ajf().get()) {
                     break label56;
                  }

                  var13 = axxx;
               }

               var13.cpk.gdj(a, a, a);
            }

            if (axx == null) {
               break;
            }
         }
      }
   }

   @Override
   public void euk(double mouseX, double mouseY, int button) {
      long ax = cbc.a ^ 123651154587484L;
      int[] var10000 = dar.abu();
      Iterator var9 = a.gaw.iterator();
      int[] axx = var10000;

      while (var9.hasNext()) {
         label22: {
            dcg axxx = (dcg)var9.next();
            dcg var11 = axxx;
            if (axx != null) {
               if (!axxx.eyr.ajf().get()) {
                  break label22;
               }

               var11 = axxx;
            }

            var11.cpk().euk(a, a, a);
         }

         if (axx == null) {
            break;
         }
      }
   }

   @Override
   public float ajg() {
      long a = cbc.a ^ 64975060597874L;
      int[] var10000 = dar.abu();
      float ax = 0.0F;
      int[] axx = var10000;
      double var7 = a.beq.hjo();
      double var10001 = 0.0;
      if (axx != null) {
         label45: {
            if (var7 > 0.0) {
               var8 = a;
               if (axx == null) {
                  break label45;
               }

               if (!a.gaw.isEmpty()) {
                  label39: {
                     for (dcg axxx : a.gaw) {
                        if (axx == null) {
                           break label39;
                        }

                        if (axxx.eyr.ajf().get()) {
                           ax += axxx.cpk.ajg() + 4.0F;
                        }

                        if (axx == null) {
                           break;
                        }
                     }

                     ax += 6.0F;
                  }

                  ax -= 4.0F;
               }
            }

            var8 = a;
         }

         var7 = var8.ajg();
         var10001 = ax * a.beq.hjo();
      }

      return (float)(var7 + var10001);
   }

   static {
      long var31 = a ^ 77363940181577L;
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var23 = 1; var23 < 8; var23++) {
         var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[5];
      int var27 = 0;
      String var26 = "Þ\u0097×kè'ÕG0iÑ®ê«zY\u0010\u0092Ð&û\u0093å\u000fò(Q|Ò\u0081\u0097¢Í\u0010Ìñ[ÇG\u001a>c\u0016D\u0003þ\u0098i¬P";
      int var28 = "Þ\u0097×kè'ÕG0iÑ®ê«zY\u0010\u0092Ð&û\u0093å\u000fò(Q|Ò\u0081\u0097¢Í\u0010Ìñ[ÇG\u001a>c\u0016D\u0003þ\u0098i¬P".length();
      char var25 = 16;
      int var35 = -1;

      label72:
      while (true) {
         String var36 = var26.substring(++var35, var35 + var25);
         int var10001 = -1;

         while (true) {
            byte[] var30 = var22.doFinal(var36.getBytes("ISO-8859-1"));
            String var56 = a(var30).intern();
            switch (var10001) {
               case 0:
                  var29[var27++] = var56;
                  if ((var35 += var25) >= var28) {
                     b = var29;
                     c = new String[5];
                     short var38 = 14837;
                     long var47 = 1647303624595382415L ^ var31;
                     czp = "...";
                     g = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[16];
                     int var14 = 0;
                     String var15 = "-<¨\u000e#\u0013\u0093Î\u0017<\tÙUí~ØÚ\u008bdVÕ\u0017¤äR(a¨¥bû\u0016jÏË(±\u0098gR\u0015,Ò¡Ä/çh\u0088ÔßPèPä$óxÄ\r\u0097È²H\u00ad_!\u0083\"ñ_\u009f\u000b\b\u0090\u0004G¨Ô\"Ñ\u0004f+[ã>®Î\u008fx¬(·çj×\u0087\u0082\u001e\u0011©\u0093Þ\u008cê~ |\u009fbc";
                     int var16 = "-<¨\u000e#\u0013\u0093Î\u0017<\tÙUí~ØÚ\u008bdVÕ\u0017¤äR(a¨¥bû\u0016jÏË(±\u0098gR\u0015,Ò¡Ä/çh\u0088ÔßPèPä$óxÄ\r\u0097È²H\u00ad_!\u0083\"ñ_\u009f\u000b\b\u0090\u0004G¨Ô\"Ñ\u0004f+[ã>®Î\u008fx¬(·çj×\u0087\u0082\u001e\u0011©\u0093Þ\u008cê~ |\u009fbc"
                        .length();
                     byte var13 = 0;

                     label54:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var40 = var17;
                        var10001 = var14++;
                        long var60 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var67 = -1;

                        while (true) {
                           long var19 = var60;
                           byte[] var21 = var11.doFinal(
                              new byte[]{
                                 (byte)(var19 >>> 56),
                                 (byte)(var19 >>> 48),
                                 (byte)(var19 >>> 40),
                                 (byte)(var19 >>> 32),
                                 (byte)(var19 >>> 24),
                                 (byte)(var19 >>> 16),
                                 (byte)(var19 >>> 8),
                                 (byte)var19
                              }
                           );
                           long var76 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var67) {
                              case 0:
                                 var40[var10001] = var76;
                                 if (var13 >= var16) {
                                    e = var17;
                                    f = new Integer[16];
                                    short var41 = 18500;
                                    long var51 = var31 ^ 2965449311517219185L;
                                    elx = 4;
                                    short var42 = 9707;
                                    long var52 = var31 ^ 700732302808577243L;
                                    gsu = 6;
                                    eas = b<"f">(27654, var31 ^ 6887966977629437244L);
                                    j = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var31 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[2];
                                    int var3 = 0;
                                    String var4 = "±yõ éð\u0015\u001aOþ«\u0095\u0093bÝ]";
                                    int var5 = "±yõ éð\u0015\u001aOþ«\u0095\u0093bÝ]".length();
                                    byte var2 = 0;

                                    do {
                                       int var53 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var53, var2).getBytes("ISO-8859-1");
                                       var53 = var3++;
                                       long var8 = (var7[0] & 255L) << 56
                                          | (var7[1] & 255L) << 48
                                          | (var7[2] & 255L) << 40
                                          | (var7[3] & 255L) << 32
                                          | (var7[4] & 255L) << 24
                                          | (var7[5] & 255L) << 16
                                          | (var7[6] & 255L) << 8
                                          | var7[7] & 255L;
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
                                       var76 = (var10[0] & 255L) << 56
                                          | (var10[1] & 255L) << 48
                                          | (var10[2] & 255L) << 40
                                          | (var10[3] & 255L) << 32
                                          | (var10[4] & 255L) << 24
                                          | (var10[5] & 255L) << 16
                                          | (var10[6] & 255L) << 8
                                          | var10[7] & 255L;
                                       byte var70 = -1;
                                       var6[var53] = var76;
                                    } while (var2 < var5);

                                    h = var6;
                                    i = new Long[2];
                                    int var63 = b<"f">(23559, 8411112501445201212L ^ var31);
                                    short var71 = 20950;
                                    var76 = 163263822954791147L ^ var31;
                                    short var79 = 20950;
                                    long var10005 = 163263822954791147L ^ var31;
                                    gb = new Color(var63, 30, 30);
                                    short var64 = 31001;
                                    long var72 = 1136647800637270059L ^ var31;
                                    short var73 = 130;
                                    var76 = 6360019278598427068L ^ var31;
                                    short var81 = 130;
                                    var10005 = 6360019278598427068L ^ var31;
                                    crk = new Color(33, 33, 33);
                                    short var65 = 24063;
                                    long var74 = 1413486048155700424L ^ var31;
                                    short var75 = 15348;
                                    var76 = 8199838361593866956L ^ var31;
                                    short var83 = 15348;
                                    var10005 = 8199838361593866956L ^ var31;
                                    fgl = new Color(180, 180, 180).darker();
                                    return;
                                 }
                                 break;
                              default:
                                 var40[var10001] = var76;
                                 if (var13 < var16) {
                                    continue label54;
                                 }

                                 var15 = "¡\f©_#L|2YöýLÑ\u009fÄÿ";
                                 var16 = "¡\f©_#L|2YöýLÑ\u009fÄÿ".length();
                                 var13 = 0;
                           }

                           byte var50 = var13;
                           var13 += 8;
                           var18 = var15.substring(var50, var13).getBytes("ISO-8859-1");
                           var40 = var17;
                           var10001 = var14++;
                           var60 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var67 = 0;
                        }
                     }
                  }

                  var25 = var26.charAt(var35);
                  break;
               default:
                  var29[var27++] = var56;
                  if ((var35 += var25) < var28) {
                     var25 = var26.charAt(var35);
                     continue label72;
                  }

                  var26 = ";+Êa\u0096õ\u0099ÖôÙì)\u0002ã\u00adõ\u0010\fà\u0011\u0084\u0090ÖµÝ§ÍO2ìyÅÇ";
                  var28 = ";+Êa\u0096õ\u0099ÖôÙì)\u0002ã\u00adõ\u0010\fà\u0011\u0084\u0090ÖµÝ§ÍO2ìyÅÇ".length();
                  var25 = 16;
                  var35 = -1;
            }

            var36 = var26.substring(++var35, var35 + var25);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24993;
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
            throw new RuntimeException("cc/astralis/cbc", var10);
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
         throw new RuntimeException("cc/astralis/cbc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10732;
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
            throw new RuntimeException("cc/astralis/cbc", var14);
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
         throw new RuntimeException("cc/astralis/cbc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15526;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/cbc", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/cbc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
