package cc.astralis;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
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

public class dnu extends brc {
   private List<ago> god;
   private static int[] dzg;
   private static final String[] b;
   private static final long c = 81605941906580L;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;
   private static final long[] m;
   private static final Long[] n;
   private static final Map o;

   public dnu() {
      long a = c ^ 41608648435440L;
      short var10001 = 16534;
      long var10002 = 4790158256532737073L ^ a;
      super(10);
      a.god = new ArrayList<>();
   }

   public dnu(List<ago> cloudConfigList) {
      long ax = c ^ 109510342705154L;
      short var10001 = 16534;
      long var10002 = 4790222244979665603L ^ ax;
      super(10);
      a.god = new ArrayList<>();
      a.god = a;
   }

   @Override
   public void etg(JsonObject json) {
      long ax = c ^ 62223174061464L;
      int[] var10000 = dar.abu();
      short var10001 = 1566;
      long var10002 = 963153233694900291L ^ ax;
      long axx = 32630151548704L;
      int[] var15 = fxc.gty();
      a.cps(a);
      int[] axxx = var15;
      int[] axxxx = var10000;
      JsonObject var13 = a;
      String[] var12 = b;
      short var17 = 31205;
      long var10003 = 8929640590784962081L ^ ax;
      String var16 = var12[9];
      if (axxxx != null) {
         if (!a.has(var16)) {
            return;
         }

         var13 = a;
         short var18 = 31205;
         var10003 = 8929640590784962081L ^ ax;
         var16 = b[9];
      }

      JsonArray axxxxx = var13.getAsJsonArray(var16);
      JsonArray var14 = axxxxx;
      if (axxxx != null) {
         if (axxxxx == null) {
            return;
         }

         var14 = axxxxx;
      }

      for (JsonElement axxxxxx : var14) {
         JsonObject axxxxxxx = axxxxxx.getAsJsonObject();
         a.god.add(hbo.bdi(axxxxxxx));
         if (axxx != null) {
            break;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public String cql() {
      long a = c ^ 81017775090614L;
      short var10000 = 10448;
      long var10001 = 6120296671581980834L ^ a;
      long ax = 30288795586497L;
      JsonObject axx = a.fdo();
      int[] var16 = dar.abu();
      int[] var21 = fxc.gty();
      JsonArray axxx = new JsonArray();
      Iterator var9 = a.god.iterator();
      int[] axxxx = var21;
      int[] axxxxx = var16;

      label33:
      while (true) {
         Object var17;
         if (var9.hasNext()) {
            var17 = var9.next();
         } else {
            var17 = axx;
            String[] var12 = b;
            if (axxxxx != null) {
               short var24 = 29063;
               long var26 = 7842092293403881589L ^ a;
               axx.add(fz.dsg(var12[8], a.fkm, a.cis), axxx);
               break;
            }
         }

         String[] var14;
         do {
            ago axxxxxx = (ago)var17;
            JsonObject axxxxxxx = new JsonObject();
            short var10002 = 12761;
            long var10003 = 3648930001471402043L ^ a;
            Object[] var22 = new Object[14];
            var14 = b;
            var22[0] = var14[4];
            var22[1] = axxxxxx.amx();
            var22[2] = var14[3];
            var22[3] = axxxxxx.chb();
            short var10006 = 23207;
            long var10007 = 410959420196428616L ^ a;
            var22[4] = var14[7];
            var22[5] = axxxxxx.ayq().cfs();
            short var10004 = 24681;
            long var10005 = 9162117506651005326L ^ a;
            var22[6] = var14[0];
            var10004 = 12986;
            var10005 = 1889205266959594332L ^ a;
            var22[7] = axxxxxx.ayq().eus();
            var10004 = 17695;
            var10005 = 8003695236462445814L ^ a;
            var22[8] = var14[5];
            var10004 = 4120;
            var10005 = 3856357529017733622L ^ a;
            var22[9] = axxxxxx.bsl();
            var10004 = 25036;
            var10005 = 1628160420341325856L ^ a;
            var10006 = 27899;
            var10007 = 1365750128521751827L ^ a;
            var22[10] = var14[6];
            var10004 = 24082;
            var10005 = 5835743926397411314L ^ a;
            var22[11] = axxxxxx.cna();
            var10004 = 6375;
            var10005 = 4310529379551467778L ^ a;
            var10006 = 16534;
            var10007 = 4790251065054855543L ^ a;
            var22[12] = var14[10];
            var10004 = 11496;
            var10005 = 5055723908829343003L ^ a;
            var22[13] = axxxxxx.dvu().toString();
            a.eqw(axxxxxxx, var22);
            axxx.add(axxxxxxx);
            int[] var18 = axxxx;
            if (axxxxx != null) {
               if (axxxx != null) {
                  break label33;
               }

               var18 = axxxx;
            }

            if (var18 == null) {
               continue label33;
            }

            var17 = axx;
            var14 = b;
         } while (axxxxx == null);

         short var23 = 29063;
         long var25 = 7842092293403881589L ^ a;
         axx.add(fz.dsg(var14[8], a.fkm, a.cis), axxx);
         break;
      }

      String var19 = axx.toString();
      String[] var15 = b;
      String var20 = fz.dvr(var19, cni.fsi(var15[1]), cni.fsi(var15[2]));
      if (cdr.haa() == null) {
         fxc.dsm(new int[4]);
      }

      return var20;
   }

   public List<ago> dtt() {
      return a.god;
   }

   public static void gcv(int[] var0) {
      dzg = var0;
   }

   public static int[] eso() {
      return dzg;
   }

   static {
      long var31 = c ^ 40754929589349L;
      Cipher var23;
      Cipher var10000 = var23 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var24 = 1; var24 < 8; var24++) {
         var10003[var24] = (byte)(var31 << var24 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var22 = new String[2];
      int var28 = 0;
      String var27 = "\t\u001e9\u0097\u008e\u0004PæN~Ñþ\u0092Ý¼\u008d\u0017ª:/\u0081\u001fM\u0093Ñ¥ÝågF\u0012uÄë\u0091%Ìm\u0085\u0004W@¯¯0+\u0015\u0004ê]pÙ|åôÛ£\u0002gr¸Q\u0089\u0017F\u0086\u0081\u000b\u0011çâ;½\u0007\u00908¸\u000b\u00887,+(\u0080|24>ôO¼!²%{9×É£,R>ª\u0084º\u001b5DO\u0018äõÍ¤lj\u001c»\u007f\u0083æ|\u0018\t\u0098I\r5Ö¹¬\u009e\\mÄ¥s\u000e\u0097G\u0085T6[©ô\u008d<\u007f\u00ad\r{ð\u0083¥E.÷9ÕC\u0099W\u0014qG7÷\u0003òÿâª\u00867\râºÁ\rÂÐ\u0092%\u007f-ÎTÚñ½ó\u008d;L\f¯\u0002=g](cÞ\u0098bë£\u0018\u0085eNÀYtE®öÛ(z\\07á\u009bÄÍ>#u\u0083É";
      int var29 = "\t\u001e9\u0097\u008e\u0004PæN~Ñþ\u0092Ý¼\u008d\u0017ª:/\u0081\u001fM\u0093Ñ¥ÝågF\u0012uÄë\u0091%Ìm\u0085\u0004W@¯¯0+\u0015\u0004ê]pÙ|åôÛ£\u0002gr¸Q\u0089\u0017F\u0086\u0081\u000b\u0011çâ;½\u0007\u00908¸\u000b\u00887,+(\u0080|24>ôO¼!²%{9×É£,R>ª\u0084º\u001b5DO\u0018äõÍ¤lj\u001c»\u007f\u0083æ|\u0018\t\u0098I\r5Ö¹¬\u009e\\mÄ¥s\u000e\u0097G\u0085T6[©ô\u008d<\u007f\u00ad\r{ð\u0083¥E.÷9ÕC\u0099W\u0014qG7÷\u0003òÿâª\u00867\râºÁ\rÂÐ\u0092%\u007f-ÎTÚñ½ó\u008d;L\f¯\u0002=g](cÞ\u0098bë£\u0018\u0085eNÀYtE®öÛ(z\\07á\u009bÄÍ>#u\u0083É"
         .length();
      char var26 = 208;
      int var25 = -1;

      while (true) {
         byte[] var30 = var23.doFinal(var27.substring(++var25, var25 + var26).getBytes("ISO-8859-1"));
         String var66 = b(var30).intern();
         int var10001 = -1;
         var22[var28++] = var66;
         if ((var25 += var26) >= var29) {
            i = new HashMap(13);
            Cipher var11;
            var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var12 = 1; var12 < 8; var12++) {
               var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var17 = new long[23];
            int var14 = 0;
            String var15 = "¾sÒû\u0098÷®=?S@0\u009ep$5`@vÓXEÔ\u0085Oy¦X\u0093Û7Î*C_\u001eÅ\u008d¼û\u008a\u00ad¾-ª\u00adÇ*Ãyhò·ð÷\u0080S£íè®+¢C\u001b\u0012&÷ç½Ì¦h]\u0094\u0098p§ãÏ0ä\u0081f\b\u0093¾Ä\u0012X,£l\u001c\u0018¸ÿ)L?\u0099äÃÙ\u0000ñ\u0093^÷NÐ'\u0093tçäCl-ñw\u0007!Ô*f\u0099\u001e\u00932:ëÐh\u0018tMÍ_Öc)\u009a\u0083ãÙ`9ç\u0006äaÂj\rã\u001el÷\u000f\u0083kÛU,¢AÆ";
            int var16 = "¾sÒû\u0098÷®=?S@0\u009ep$5`@vÓXEÔ\u0085Oy¦X\u0093Û7Î*C_\u001eÅ\u008d¼û\u008a\u00ad¾-ª\u00adÇ*Ãyhò·ð÷\u0080S£íè®+¢C\u001b\u0012&÷ç½Ì¦h]\u0094\u0098p§ãÏ0ä\u0081f\b\u0093¾Ä\u0012X,£l\u001c\u0018¸ÿ)L?\u0099äÃÙ\u0000ñ\u0093^÷NÐ'\u0093tçäCl-ñw\u0007!Ô*f\u0099\u001e\u00932:ëÐh\u0018tMÍ_Öc)\u009a\u0083ãÙ`9ç\u0006äaÂj\rã\u001el÷\u000f\u0083kÛU,¢AÆ"
               .length();
            byte var13 = 0;

            label73:
            while (true) {
               var10001 = var13;
               var13 += 8;
               byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
               long[] var44 = var17;
               var10001 = var14++;
               long var69 = (var18[0] & 255L) << 56
                  | (var18[1] & 255L) << 48
                  | (var18[2] & 255L) << 40
                  | (var18[3] & 255L) << 32
                  | (var18[4] & 255L) << 24
                  | (var18[5] & 255L) << 16
                  | (var18[6] & 255L) << 8
                  | var18[7] & 255L;
               byte var76 = -1;

               while (true) {
                  long var19 = var69;
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
                  long var80 = (var21[0] & 255L) << 56
                     | (var21[1] & 255L) << 48
                     | (var21[2] & 255L) << 40
                     | (var21[3] & 255L) << 32
                     | (var21[4] & 255L) << 24
                     | (var21[5] & 255L) << 16
                     | (var21[6] & 255L) << 8
                     | var21[7] & 255L;
                  switch (var76) {
                     case 0:
                        var44[var10001] = var80;
                        if (var13 >= var16) {
                           g = var17;
                           h = new Integer[23];
                           o = new HashMap(13);
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
                           String var4 = "x\n\u008dý\u0085Öi\u0018.T\u0011p¢¡.¡";
                           int var5 = "x\n\u008dý\u0085Öi\u0018.T\u0011p¢¡.¡".length();
                           byte var2 = 0;

                           do {
                              int var57 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var57, var2).getBytes("ISO-8859-1");
                              var57 = var3++;
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
                              var80 = (var10[0] & 255L) << 56
                                 | (var10[1] & 255L) << 48
                                 | (var10[2] & 255L) << 40
                                 | (var10[3] & 255L) << 32
                                 | (var10[4] & 255L) << 24
                                 | (var10[5] & 255L) << 16
                                 | (var10[6] & 255L) << 8
                                 | var10[7] & 255L;
                              byte var79 = -1;
                              var6[var57] = var80;
                           } while (var2 < var5);

                           m = var6;
                           n = new Long[2];
                           short var46 = 9272;
                           long var59 = 7411541392451359232L ^ var31;
                           String[] var38 = new String[11];
                           short var47 = 29063;
                           int[] var60 = new int[4];
                           int var36 = 0;
                           gcv(var60);
                           long var61 = 7842132389278451622L ^ var31;
                           String var35;
                           int var37 = (var35 = var22[0]).length();
                           char var34 = '\b';
                           int var42 = -1;

                           label52:
                           while (true) {
                              short var48 = 9272;
                              long var62 = 7411541392451359232L ^ var31;
                              byte var49 = 11;
                              String var63 = var35.substring(++var42, var42 + var34);
                              byte var72 = -1;

                              while (true) {
                                 String var50 = b(var49, b(var63));
                                 switch (var72) {
                                    case 0:
                                       var38[var36++] = var50;
                                       if ((var42 += var34) >= var37) {
                                          b = var38;
                                          return;
                                       }

                                       var34 = var35.charAt(var42);
                                       break;
                                    default:
                                       var38[var36++] = var50;
                                       if ((var42 += var34) < var37) {
                                          var34 = var35.charAt(var42);
                                          continue label52;
                                       }

                                       var37 = (var35 = var22[1]).length();
                                       short var51 = 12986;
                                       long var64 = 1889157315987358863L ^ var31;
                                       var34 = 7;
                                       var42 = -1;
                                 }

                                 short var52 = 11800;
                                 long var65 = 1291130502983604271L ^ var31;
                                 var49 = 49;
                                 var63 = var35.substring(++var42, var42 + var34);
                                 var72 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var44[var10001] = var80;
                        if (var13 < var16) {
                           continue label73;
                        }

                        var15 = "ä\u0019ÌYT3\u0015xU\u0083ÒîþÎ«u";
                        var16 = "ä\u0019ÌYT3\u0015xU\u0083ÒîþÎ«u".length();
                        var13 = 0;
                  }

                  byte var56 = var13;
                  var13 += 8;
                  var18 = var15.substring(var56, var13).getBytes("ISO-8859-1");
                  var44 = var17;
                  var10001 = var14++;
                  var69 = (var18[0] & 255L) << 56
                     | (var18[1] & 255L) << 48
                     | (var18[2] & 255L) << 40
                     | (var18[3] & 255L) << 32
                     | (var18[4] & 255L) << 24
                     | (var18[5] & 255L) << 16
                     | (var18[6] & 255L) << 8
                     | var18[7] & 255L;
                  var76 = 0;
               }
            }
         }

         var26 = var27.charAt(var25);
      }
   }

   private static char[] b(String var0) {
      long var1 = c ^ 66347520976099L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 1094;
         long var10005 = 7594356931948858085L ^ var1;
         var10000[0] = (char)(var10003 ^ '\f');
      }

      return var10000;
   }

   private static String b(int var0, char[] var1) {
      long var2 = c ^ 41770788908983L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 12986;
         long var10009 = 1889157224888072029L ^ var2;
         byte var10;
         switch (var4 % 7) {
            case 0:
               var10 = 12602;
               long var23 = 4203011402002560203L ^ var2;
               var10 = 66;
               break;
            case 1:
               var10 = 6532;
               long var22 = 5653372394116078708L ^ var2;
               var10 = 40;
               break;
            case 2:
               var10 = 9721;
               long var21 = 8552124684801794061L ^ var2;
               var10 = 93;
               break;
            case 3:
               var10 = 3452;
               long var20 = 5618595096313186448L ^ var2;
               var10 = 106;
               break;
            case 4:
               var10 = 15855;
               long var19 = 3108511126683547673L ^ var2;
               var10 = 50;
               break;
            case 5:
               var10 = 644;
               long var18 = 5452083905075595110L ^ var2;
               var10 = 23;
               break;
            default:
               var10 = 1094;
               long var17 = 7594347491759604145L ^ var2;
               var10 = 12;
         }

         var10001[var4] = (char)(var10005 ^ var10002 ^ var10);
      }

      return new String(var10001).intern();
   }

   private static String b(byte[] var0) {
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26305;
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
            throw new RuntimeException("cc/astralis/dnu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
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
         throw new RuntimeException("cc/astralis/dnu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18257;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/dnu", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         n[var3] = var15;
      }

      return n[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = d(var4, var5);
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
         throw new RuntimeException("cc/astralis/dnu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
