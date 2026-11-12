package cc.astralis;

import astralis.mixin.accessor.EntityVelocityUpdateS2CPacketAccessor;
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
import net.minecraft.class_2596;
import net.minecraft.class_2743;

public class heo extends hcr {
   private final adu fsb;
   private final bes ggt;
   private boolean bth;
   private int fqf;
   private static final long a = 111049558493083L;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public heo(guu parentClass) {
      long ax = heo.a ^ 102234937253593L;
      short var10002 = 28680;
      long var10003 = 7208581237298988871L ^ ax;
      super(a, "Watchdog Fireball");
      short var4 = 31839;
      long var10004 = 562284155678690072L ^ ax;
      short var6 = 10186;
      long var10005 = 8678038681501061250L ^ ax;
      String[] var8 = new String[5];
      short var10008 = 25478;
      long var10009 = 1961991825402959053L ^ ax;
      var8[0] = "Boost";
      var10008 = 30616;
      var10009 = 5342108095321538774L ^ ax;
      var8[1] = "Flat";
      var10008 = 1725;
      var10009 = 7346473342842860028L ^ ax;
      var8[2] = "Opal";
      var10008 = 10473;
      var10009 = 8224925327334662061L ^ ax;
      var8[3] = "Chef";
      var10008 = 9598;
      var10009 = 6290308645009183288L ^ ax;
      var8[4] = "Chef-High";
      a.fsb = new adu("Mode", "Boost", var8);
      short var5 = 16379;
      var10004 = 1166545441157597371L ^ ax;
      a.ggt = new bes("Speed", 1.5F, 0.0F, 10.0F, 0.1F);
      a.dxe(new ffn[]{a.fsb, a.ggt});
   }

   @Override
   public void dil() {
      long a = heo.a ^ 110285652525833L;
      int[] var10000 = dar.abu();
      a.fqf = 0;
      int[] var3 = var10000;
      if (var3 != null) {
         if (dar.gqy().aws().diy(dqk.class).dsv()) {
            dar.gqy().aws().diy(dqk.class).fga(false);
            short var4 = 30032;
            long var10001 = 1900502418661400515L ^ a;
            bpa.dhu("Velocity module was disabled to prevent conflicts.");
         }

         super.dil();
      }
   }

   @Override
   public void cbw() {
      long a = heo.a ^ 71140425762012L;
      int[] var3 = dar.abu();
      if (var3 != null) {
         if (!dar.gqy().aws().diy(dqk.class).dsv()) {
            dar.gqy().aws().diy(dqk.class).fga(true);
         }

         a.fqf = 0;
         a.bth = false;
         super.cbw();
      }
   }

   @gdz
   public void gub(fxx event) {
      long ax;
      int[] axx;
      Object var7;
      label261: {
         ax = heo.a ^ 13109707303017L;
         axx = dar.abu();
         int var10000 = chi.field_1724.field_6235;
         if (axx != null) {
            if (chi.field_1724.field_6235 >= 3) {
               a.bth = true;
            }

            var7 = a;
            if (axx == null) {
               break label261;
            }

            var10000 = a.bth;
         }

         if (var10000 != 0) {
            a.fqf++;
         }

         var7 = a.fsb.dnp();
      }

      String var5 = (String)var7;
      byte var6 = -1;
      var8 = var5.hashCode();
      label251:
      if (axx != null) {
         switch (var8) {
            case 2192281:
               short var10001 = 10065;
               long var10002 = 2963629894454339243L ^ ax;
               var8 = var5.equals("Flat");
               if (axx == null) {
                  break label251;
               }

               if (var8 == 0) {
                  break;
               }

               var6 = 0;
               if (axx != null) {
                  break;
               }
            case 2464236:
               short var10 = 32380;
               long var22 = 6229714018358247310L ^ ax;
               var8 = var5.equals("Opal");
               if (axx == null) {
                  break label251;
               }

               if (var8 == 0) {
                  break;
               }

               var6 = 1;
               if (axx != null) {
                  break;
               }
            case 2099174:
               short var11 = 23482;
               long var23 = 4722431185437399619L ^ ax;
               var8 = var5.equals("Chef");
               if (axx == null) {
                  break label251;
               }

               if (var8 == 0) {
                  break;
               }

               var6 = 2;
               if (axx != null) {
                  break;
               }
            case -1864144055:
               short var12 = 12560;
               long var24 = 3249769772129939693L ^ ax;
               var8 = var5.equals("Chef-High");
               if (axx == null) {
                  break label251;
               }

               if (var8 != 0) {
                  var6 = 3;
               }
         }

         var8 = var6;
      }

      label227:
      if (axx != null) {
         label266: {
            label276: {
               switch (var8) {
                  case 0:
                     short var14;
                     label269: {
                        var8 = a.fqf;
                        if (axx != null) {
                           if (a.fqf > 0) {
                              var8 = a.fqf;
                              var14 = 11881;
                              long var25 = 4679312769892686908L ^ ax;
                              var14 = 30;
                              if (axx == null) {
                                 break label269;
                              }

                              if (a.fqf < 30) {
                                 chi.field_1724.method_18800(chi.field_1724.method_18798().field_1352, 0.01, chi.field_1724.method_18798().field_1350);
                                 if (axx != null) {
                                    break label266;
                                 }
                              }
                           }

                           var8 = a.fqf;
                        }

                        if (axx == null) {
                           break label227;
                        }

                        var14 = 11243;
                        long var26 = 741294005178079675L ^ ax;
                        var14 = 31;
                     }

                     if (var8 < var14) {
                        break label266;
                     }

                     a.clv().gxo();
                     if (axx != null) {
                        break label266;
                     }
                  case 1:
                     if (a.fqf == 1) {
                        chi.field_1724
                           .method_18800(
                              chi.field_1724.method_18798().field_1352,
                              chi.field_1724.method_18798().field_1351 + 0.061,
                              chi.field_1724.method_18798().field_1350
                           );
                        if (axx != null) {
                           break label266;
                        }
                     }

                     chi.field_1724
                        .method_18800(
                           chi.field_1724.method_18798().field_1352,
                           chi.field_1724.method_18798().field_1351 + 0.0283,
                           chi.field_1724.method_18798().field_1350
                        );
                     if (axx != null) {
                        break label266;
                     }
                  case 2:
                     break;
                  case 3:
                     break label276;
                  default:
                     break label266;
               }

               short var16;
               var8 = a.fqf;
               var16 = 1;
               label207:
               if (axx != null) {
                  if (a.fqf >= 1) {
                     var8 = a.fqf;
                     var16 = 21839;
                     long var27 = 7976565332477732638L ^ ax;
                     var16 = 33;
                     if (axx == null) {
                        break label207;
                     }

                     if (a.fqf <= 33) {
                        chi.field_1724.method_18800(chi.field_1724.method_18798().field_1352, 0.7 - a.fqf * 0.015, chi.field_1724.method_18798().field_1350);
                        if (axx != null) {
                           break label266;
                        }
                     }
                  }

                  var8 = a.fqf;
                  if (axx == null) {
                     break label227;
                  }

                  var16 = 11463;
                  long var28 = 2943661761614651028L ^ ax;
                  var16 = 33;
               }

               if (var8 <= var16) {
                  break label266;
               }

               a.clv().gxo();
               if (axx != null) {
                  break label266;
               }
            }

            short var19;
            var8 = a.fqf;
            var19 = 1;
            label185:
            if (axx != null) {
               if (a.fqf >= 1) {
                  var8 = a.fqf;
                  var19 = 9375;
                  long var29 = 1653456697773364937L ^ ax;
                  var19 = 28;
                  if (axx == null) {
                     break label185;
                  }

                  if (a.fqf <= 28) {
                     chi.field_1724
                        .method_18800(
                           chi.field_1724.method_18798().field_1352, (evd.dbj() ? 0.85 : 1.25) - a.fqf * 0.016, chi.field_1724.method_18798().field_1350
                        );
                     if (axx != null) {
                        break label266;
                     }
                  }
               }

               var8 = a.fqf;
               if (axx == null) {
                  break label227;
               }

               var19 = 10279;
               long var30 = 1101827452964575859L ^ ax;
               var19 = 28;
            }

            if (var8 > var19) {
               a.clv().gxo();
            }
         }

         var8 = chi.field_1724.method_24828();
      }

      label272: {
         if (axx != null) {
            if (var8 == 0) {
               return;
            }

            var7 = a;
            if (axx == null) {
               break label272;
            }

            var8 = a.fqf;
         }

         if (var8 <= 5) {
            return;
         }

         var7 = a;
      }

      ((heo)var7).clv().gxo();
   }

   @gdz
   public void azn(elx event) {
      long ax = heo.a ^ 11283878428559L;
      int[] var4 = dar.abu();
      int var10000 = a.bth;
      if (var4 != null) {
         if (!a.bth) {
            return;
         }

         var10000 = evd.dbj();
      }

      if (var4 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = chi.field_1724.field_6235;
      }

      label112: {
         short var10001 = 10966;
         long var10002 = 3537298817153421159L ^ ax;
         short var8 = 9;
         if (var4 != null) {
            label95: {
               label94:
               if (var10000 == 9) {
                  label92: {
                     label91: {
                        label115: {
                           var8 = 25478;
                           var10002 = 1961937297814582683L ^ ax;
                           var10000 = a.fsb.emb("Boost");
                           if (var4 != null) {
                              if (var10000 != 0) {
                                 break label115;
                              }

                              var8 = 32380;
                              var10002 = 6229712262049917032L ^ ax;
                              var10000 = a.fsb.emb("Opal");
                           }

                           if (var4 == null) {
                              break label92;
                           }

                           if (var10000 == 0) {
                              break label91;
                           }
                        }

                        evd.fdo(a, a.ggt.dnp().floatValue());
                        if (var4 != null) {
                           break label94;
                        }
                     }

                     var8 = 10065;
                     var10002 = 2963628041907941709L ^ ax;
                     var10000 = a.fsb.emb("Flat");
                  }

                  if (var4 != null) {
                     if (var10000 != 0) {
                        short var5 = 1806;
                        long var12 = 2745933319000559901L ^ ax;
                        bpa.dhu("flat");
                        if (var4 != null) {
                           break label94;
                        }
                     }

                     String var6 = a.fsb.dnp();
                     var8 = 23482;
                     var10002 = 4722432729019043237L ^ ax;
                     var10000 = var6.contains("Chef");
                  }

                  if (var4 == null) {
                     break label95;
                  }

                  if (var10000 != 0) {
                     short var7 = 27671;
                     long var14 = 2658335181150714381L ^ ax;
                     bpa.dhu("cjef");
                     evd.fdo(a, 1.4);
                  }
               }

               var10000 = chi.field_1724.field_6235;
            }

            if (var4 == null) {
               break label112;
            }

            var8 = 25385;
            var10002 = 3578041145376736925L ^ ax;
            var8 = 8;
         }

         if (var10000 != var8) {
            return;
         }

         var8 = 10065;
         var10002 = 2963628041907941709L ^ ax;
         var10000 = a.fsb.emb("Flat");
      }

      if (var10000 != 0) {
         evd.fdo(a, 1.6);
      }
   }

   @gdz
   public void emz(amo event) {
      long ax = heo.a ^ 50753275424618L;
      int[] var10000 = dar.abu();
      class_2596 axx = a.bed();
      int[] axxx = var10000;
      class_2596 var8 = axx;
      if (axxx != null) {
         if (!(axx instanceof class_2743)) {
            return;
         }

         var8 = axx;
      }

      class_2743 axxxx = (class_2743)var8;
      EntityVelocityUpdateS2CPacketAccessor axxxxx = (EntityVelocityUpdateS2CPacketAccessor)axxxx;
      if (axxxxx.getEntityId() == chi.field_1724.method_5628()) {
         ;
      }
   }

   static {
      long var11 = a ^ 25988019469809L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[16];
      int var18 = 0;
      String var17 = "`ð\u008dO\n:\u009aE\u0011\u0012\u0093|ÑCçé\u0010\u0084VF\u008a¥_\u0082\u0004ÑÄâ£¦HÇI\u0010ç\u0000\u0013åLN¿âäÃyäû\u0005ÖzXkô;\u0011²\u0095ú\u0096bò-·\u0019!tz\u0005§EJ\u0003|í\u001a+MÅTâ<\u0004\u008d\u0014&¸\u0099è\u0084\t\u009b·´?ÑT\u008dþú«:«\u0096\u0088\u0091Çð4\u0019\u0017ep¦),S\u001c=.Ò!\u0002ðÝ\u0085ÎgC\u0014¥¢G\u009c0£AíÂÔ\u0010¡À6;ëýYµ\u0013²\u008ck'ý§²\u0010õªFåt´·}¢éË {\u000b.È\u0018ÁÍ3\u009a8\u0084\u0010\u0097A\u0088¹¡§ËÌ\u009b\u0093º/ð«\n\u0006\u0001\u0010Øm¤\u0091\u0097å:¡\u0010Ìo'×þÉ\u0080\u0010Åîâ\u001f\u001awXvÔ\u00004µ)\u0092U\u009a\u0010¿\u0015ù\u00916u \u00adø($û;ãÄO\u0010¤\u007fÛ§W\u0083!R^Cd\u00809\u001c\ri\u0010ð1aÓM.d\u001cZr\u0018b\fó¸H\u0010{n^\fy\u008f§-Ö:AöÔ¡áL\u0018\u009e J\u0089ý£m\u009eºE\u009aÔ|ôÏø\u0005\n\u008a×[\u0083\u001b$";
      int var19 = "`ð\u008dO\n:\u009aE\u0011\u0012\u0093|ÑCçé\u0010\u0084VF\u008a¥_\u0082\u0004ÑÄâ£¦HÇI\u0010ç\u0000\u0013åLN¿âäÃyäû\u0005ÖzXkô;\u0011²\u0095ú\u0096bò-·\u0019!tz\u0005§EJ\u0003|í\u001a+MÅTâ<\u0004\u008d\u0014&¸\u0099è\u0084\t\u009b·´?ÑT\u008dþú«:«\u0096\u0088\u0091Çð4\u0019\u0017ep¦),S\u001c=.Ò!\u0002ðÝ\u0085ÎgC\u0014¥¢G\u009c0£AíÂÔ\u0010¡À6;ëýYµ\u0013²\u008ck'ý§²\u0010õªFåt´·}¢éË {\u000b.È\u0018ÁÍ3\u009a8\u0084\u0010\u0097A\u0088¹¡§ËÌ\u009b\u0093º/ð«\n\u0006\u0001\u0010Øm¤\u0091\u0097å:¡\u0010Ìo'×þÉ\u0080\u0010Åîâ\u001f\u001awXvÔ\u00004µ)\u0092U\u009a\u0010¿\u0015ù\u00916u \u00adø($û;ãÄO\u0010¤\u007fÛ§W\u0083!R^Cd\u00809\u001c\ri\u0010ð1aÓM.d\u001cZr\u0018b\fó¸H\u0010{n^\fy\u008f§-Ö:AöÔ¡áL\u0018\u009e J\u0089ý£m\u009eºE\u009aÔ|ôÏø\u0005\n\u008a×[\u0083\u001b$"
         .length();
      char var16 = 16;
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
                     d = var20;
                     e = new String[16];
                     i = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "SãpÏùZä7Ý*'\u0098Z¦\u0018Ôè¶\u0095¬PIÆêng\u0018\u009a\u0005\u001e¤ºþ\u009e¿sp«wR\u0088\u0086\u0082°\t\u0014V\u0098";
                     int var5 = "SãpÏùZä7Ý*'\u0098Z¦\u0018Ôè¶\u0095¬PIÆêng\u0018\u009a\u0005\u001e¤ºþ\u009e¿sp«wR\u0088\u0086\u0082°\t\u0014V\u0098".length();
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
                                    g = var6;
                                    h = new Integer[8];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0089Då<[Ê!\u0082þ\t\u0011\u0097M±*Ý";
                                 var5 = "\u0089Då<[Ê!\u0082þ\t\u0011\u0097M±*Ý".length();
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

                  var17 = "`ÎE«L`=ýòú\u0003ï9åÚ\u0084({îá7Q\u0086¹\u0095Ã\u008c\n\n$´ \u0011\u001b^ctÉ¢\u0002Ø\u00031m\u0093û \u001c¼\u009eøu¢ñÛÈ\u0011";
                  var19 = "`ÎE«L`=ýòú\u0003ï9åÚ\u0084({îá7Q\u0086¹\u0095Ã\u008c\n\n$´ \u0011\u001b^ctÉ¢\u0002Ø\u00031m\u0093û \u001c¼\u009eøu¢ñÛÈ\u0011"
                     .length();
                  var16 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11778;
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
            throw new RuntimeException("cc/astralis/heo", var10);
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
         throw new RuntimeException("cc/astralis/heo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23972;
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
            throw new RuntimeException("cc/astralis/heo", var14);
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
         throw new RuntimeException("cc/astralis/heo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
