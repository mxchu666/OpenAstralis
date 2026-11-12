package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class eix {
   final String cnk;
   final boolean fde;
   final Path fcf;
   final char aof;
   final String ewu;
   private static final long a = 90788453701476L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   eix(String a, boolean a, Path a) {
      long ax = eix.a ^ 67193418523315L;
      super();
      a.cnk = a;
      a.fde = a;
      a.fcf = a;
      short var10003 = 29522;
      long var10004 = 8537269858867758135L ^ ax;
      a.ewu = a.substring(a.lastIndexOf(46) + 1).toLowerCase();
      a.aof = a.dch(a.ewu);
   }

   private char dch(String a) {
      long ax = eix.a ^ 135648585550375L;
      int[] axx = dar.abu();
      int var10000 = a.fde;
      if (axx != null) {
         if (!a.fde) {
            byte var6 = -1;
            var10000 = a.hashCode();
            label235:
            if (axx != null) {
               switch (var10000) {
                  case 111145:
                     short var26 = 8775;
                     long var10002 = 3633275468652047852L ^ ax;
                     var10000 = a.equals("png");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     var6 = 0;
                     if (axx != null) {
                        break;
                     }
                  case 105441:
                     short var27 = 19632;
                     long var60 = 2344456372454916889L ^ ax;
                     var10000 = a.equals("jpg");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     var6 = 1;
                     if (axx != null) {
                        break;
                     }
                  case 3268712:
                     short var28 = 4798;
                     long var61 = 2520540147046440219L ^ ax;
                     var10000 = a.equals("jpeg");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     var6 = 2;
                     if (axx != null) {
                        break;
                     }
                  case 102340:
                     short var29 = 22686;
                     long var62 = 1072576003968374586L ^ ax;
                     var10000 = a.equals("gif");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     var6 = 3;
                     if (axx != null) {
                        break;
                     }
                  case 115312:
                     short var30 = 687;
                     long var63 = 378980311802596608L ^ ax;
                     var10000 = a.equals("txt");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     var6 = 4;
                     if (axx != null) {
                        break;
                     }
                  case 110834:
                     short var31 = 28998;
                     long var64 = 3378200234704322286L ^ ax;
                     var10000 = a.equals("pdf");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     var6 = 5;
                     if (axx != null) {
                        break;
                     }
                  case 99640:
                     short var32 = 31621;
                     long var65 = 555433404368925734L ^ ax;
                     var10000 = a.equals("doc");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     short var9 = 4425;
                     long var33 = 3393199556181167798L ^ ax;
                     var6 = 6;
                     if (axx != null) {
                        break;
                     }
                  case 3088960:
                     short var34 = 1868;
                     long var66 = 5249341773272860908L ^ ax;
                     var10000 = a.equals("docx");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     short var10 = 24028;
                     long var35 = 4348461621965242924L ^ ax;
                     var6 = 7;
                     if (axx != null) {
                        break;
                     }
                  case 108272:
                     short var36 = 16585;
                     long var67 = 3552561947448315751L ^ ax;
                     var10000 = a.equals("mp3");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     short var11 = 7322;
                     long var37 = 8917801791690310500L ^ ax;
                     var6 = 8;
                     if (axx != null) {
                        break;
                     }
                  case 117484:
                     short var38 = 14891;
                     long var68 = 648098655627867527L ^ ax;
                     var10000 = a.equals("wav");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     short var12 = 30803;
                     long var39 = 1162420689773881248L ^ ax;
                     var6 = 9;
                     if (axx != null) {
                        break;
                     }
                  case 109967:
                     short var40 = 24272;
                     long var69 = 1100953719707472247L ^ ax;
                     var10000 = a.equals("ogg");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     short var13 = 30829;
                     long var41 = 1177195536722651013L ^ ax;
                     var6 = 10;
                     if (axx != null) {
                        break;
                     }
                  case 108273:
                     short var42 = 14102;
                     long var70 = 2583138282399955127L ^ ax;
                     var10000 = a.equals("mp4");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     short var14 = 8107;
                     long var43 = 8929929638015533149L ^ ax;
                     var6 = 11;
                     if (axx != null) {
                        break;
                     }
                  case 108308:
                     short var44 = 10432;
                     long var71 = 6388317527681001318L ^ ax;
                     var10000 = a.equals("mov");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     short var15 = 9227;
                     long var45 = 1591762715950234608L ^ ax;
                     var6 = 12;
                     if (axx != null) {
                        break;
                     }
                  case 96980:
                     short var46 = 3288;
                     long var72 = 1844626459427488629L ^ ax;
                     var10000 = a.equals("avi");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     short var16 = 30002;
                     long var47 = 772337298435566282L ^ ax;
                     var6 = 13;
                     if (axx != null) {
                        break;
                     }
                  case 120609:
                     short var48 = 16292;
                     long var73 = 7077936643310972934L ^ ax;
                     var10000 = a.equals("zip");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     short var17 = 14557;
                     long var49 = 3118209063781312292L ^ ax;
                     var6 = 14;
                     if (axx != null) {
                        break;
                     }
                  case 112675:
                     short var50 = 8780;
                     long var74 = 7748462555183050231L ^ ax;
                     var10000 = a.equals("rar");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 == 0) {
                        break;
                     }

                     short var18 = 32609;
                     long var51 = 794271239406149787L ^ ax;
                     var6 = 15;
                     if (axx != null) {
                        break;
                     }
                  case 1827:
                     short var52 = 16482;
                     long var75 = 195841116168720328L ^ ax;
                     var10000 = a.equals("7z");
                     if (axx == null) {
                        break label235;
                     }

                     if (var10000 != 0) {
                        short var19 = 30927;
                        long var53 = 3214871298347820858L ^ ax;
                        var6 = 16;
                     }
               }

               var10000 = var6;
            }

            if (axx != null) {
               switch (var10000) {
                  case 0:
                  case 1:
                  case 2:
                  case 3:
                     short var25 = 25566;
                     long var59 = 1362603960259640364L ^ ax;
                     var10000 = 61893;
                     break;
                  case 4:
                  case 5:
                  case 6:
                  case 7:
                     short var24 = 7764;
                     long var58 = 341763653969052072L ^ ax;
                     var10000 = 61897;
                     break;
                  case 8:
                  case 9:
                  case 10:
                     short var23 = 26200;
                     long var57 = 2715921617528682929L ^ ax;
                     var10000 = 61895;
                     break;
                  case 11:
                  case 12:
                  case 13:
                     short var22 = 19173;
                     long var56 = 8460899882559493394L ^ ax;
                     var10000 = 61896;
                     break;
                  case 14:
                  case 15:
                  case 16:
                     short var21 = 32031;
                     long var55 = 4509506179949126388L ^ ax;
                     var10000 = 61894;
                     break;
                  default:
                     short var20 = 14126;
                     long var54 = 6460001774187948250L ^ ax;
                     var10000 = 61787;
               }
            }

            return (char)var10000;
         }

         short var7 = 14332;
         long var10001 = 2756939705664481281L ^ ax;
         var10000 = 61563;
      }

      return (char)var10000;
   }

   static {
      long var11 = a ^ 130768623234827L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[17];
      int var18 = 0;
      String var17 = "\u008e\bõt\u0000ÑHN¹Ç\f\u001a\u008fÅ\u008b¸\u0010Æ2\u008dÐ\u009aø(±\tçNôåMô\u001b\u0010ef¬ ä3÷_°MìèFîWV\u0010\u001eP#(<b%\u0085D\u001d\u0018kHãåÎ\u0010Á\fl¯¦áÏT5be;\u00885è5\u0010ÝfI\u0087ÂÄÐ8\u0094Ò¾.D\u0098¯\u0091\u0010#9\u0006\u0099jî\u009dã1_O\u0096\u008f(Y%\u0010\u0016\u00877w¤b\u0001ôÄQRÌ\u001f\u0094Ù]\u0010Ë\u0085)©\u0097\u0094Agð\u0099Ù`\u001a\u009e²z\u0010û]eÆËÓ,\u000eú#øÎ }f«\u0010Áã÷\u0000\u0083\u0018\u0094ºÁï\f\u0016\u0003å+\u008b\u0010ø\bãuØZx¤bÉ;Û^À¦$\u0010ùb\u0091]¯\u008f\u008fÖ\u0083\u0003\u0080Ç§\u0014çU\u0010\u008d]Ø\u009b¶×\u008bb¸v\u0093\u000fRe\u0098~\u0010Ý³¡©pè~`$i(`t\u0005\u0091\u0084";
      int var19 = "\u008e\bõt\u0000ÑHN¹Ç\f\u001a\u008fÅ\u008b¸\u0010Æ2\u008dÐ\u009aø(±\tçNôåMô\u001b\u0010ef¬ ä3÷_°MìèFîWV\u0010\u001eP#(<b%\u0085D\u001d\u0018kHãåÎ\u0010Á\fl¯¦áÏT5be;\u00885è5\u0010ÝfI\u0087ÂÄÐ8\u0094Ò¾.D\u0098¯\u0091\u0010#9\u0006\u0099jî\u009dã1_O\u0096\u008f(Y%\u0010\u0016\u00877w¤b\u0001ôÄQRÌ\u001f\u0094Ù]\u0010Ë\u0085)©\u0097\u0094Agð\u0099Ù`\u001a\u009e²z\u0010û]eÆËÓ,\u000eú#øÎ }f«\u0010Áã÷\u0000\u0083\u0018\u0094ºÁï\f\u0016\u0003å+\u008b\u0010ø\bãuØZx¤bÉ;Û^À¦$\u0010ùb\u0091]¯\u008f\u008fÖ\u0083\u0003\u0080Ç§\u0014çU\u0010\u008d]Ø\u009b¶×\u008bb¸v\u0093\u000fRe\u0098~\u0010Ý³¡©pè~`$i(`t\u0005\u0091\u0084"
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
                     b = var20;
                     c = new String[17];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[19];
                     int var3 = 0;
                     String var4 = "\u0080\u0095:È()|ð£\r\u0083Ü§F\u0016O0d×\u0092GY¿åG4tø\u0018z«ÝVÝ\u0002\u009c\t\u0000@ÕÓ\u0001á'0aÉDUÎ\u008bZº÷Ò)\u0081&1 »²ºeR_ÏQÃ\u00859wAÞÓÜ}8\u001f~\u00987\u001aÑ¬IáxÆ\u0087dñ\u000f\u0013ú\u009cGïIB+ú\u0001|\u0097/wå£TÔ\u0081>µJ¯G\u0087Æ\u0092Ì$\u001d\t\u008cÆ°\u0018ì\u0010\u0097\rÞ\u0098pc";
                     int var5 = "\u0080\u0095:È()|ð£\r\u0083Ü§F\u0016O0d×\u0092GY¿åG4tø\u0018z«ÝVÝ\u0002\u009c\t\u0000@ÕÓ\u0001á'0aÉDUÎ\u008bZº÷Ò)\u0081&1 »²ºeR_ÏQÃ\u00859wAÞÓÜ}8\u001f~\u00987\u001aÑ¬IáxÆ\u0087dñ\u000f\u0013ú\u009cGïIB+ú\u0001|\u0097/wå£TÔ\u0081>µJ¯G\u0087Æ\u0092Ì$\u001d\t\u008cÆ°\u0018ì\u0010\u0097\rÞ\u0098pc"
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
                                    f = new Integer[19];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "Ó\u0094ë¬\u0006*OÄnêl<Â\u00145é";
                                 var5 = "Ó\u0094ë¬\u0006*OÄnêl<Â\u00145é".length();
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

                  var17 = "\u0098jÆ`Ê¥ê\u0088\u0092\u0012\u0095\u0085\u0089\u008b\u0010°\u0010¬\u001e<\u009e\u0092üd\u001eóÀ\u0012G_O\u0081ì";
                  var19 = "\u0098jÆ`Ê¥ê\u0088\u0092\u0012\u0095\u0085\u0089\u008b\u0010°\u0010¬\u001e<\u009e\u0092üd\u001eóÀ\u0012G_O\u0081ì".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4840;
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
            throw new RuntimeException("cc/astralis/eix", var10);
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
         throw new RuntimeException("cc/astralis/eix" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17082;
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
            throw new RuntimeException("cc/astralis/eix", var14);
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
         throw new RuntimeException("cc/astralis/eix" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
