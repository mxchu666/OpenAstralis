package cc.astralis;

import astralis.mixin.accessor.MinecraftClientSessionAccessor;
import imgui.ImGui;
import java.awt.Color;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2561;
import net.minecraft.class_320;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_342;
import net.minecraft.class_4185;
import net.minecraft.class_437;
import net.minecraft.class_4185.class_7840;

public class cv extends class_437 implements dlc, cds {
   private class_342 axb;
   private final boolean gbd;
   private fkc ebz;
   private boolean gmy;
   private djc hbv;
   private static final long a = 79310009907682L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public cv(boolean addAlt) {
      long ax = cv.a ^ 124665015100214L;
      String var4;
      if (a) {
         short var10001 = 9026;
         long var10002 = 5589425619569333481L ^ ax;
         var4 = "Add Alt Gui";
      } else {
         short var5 = 30126;
         long var6 = 5832174689014055428L ^ ax;
         var4 = "Direct Login";
      }

      super(class_2561.method_30163(var4));
      a.gmy = false;
      a.gbd = a;
      a.hbv = cds.gll;
   }

   public void method_25426() {
      long a = cv.a ^ 68206361917496L;
      short var10000 = 14455;
      long var10001 = 6228347402867969561L ^ a;
      int ax = 200;
      var10000 = 19285;
      var10001 = 8374851498329603382L ^ a;
      int axx = 20;
      int var10005 = 20309;
      long var10006 = 1741609813749233971L ^ a;
      int var10004 = (a.field_22789 - 200) / 2;
      short var88 = 24983;
      long var10007 = 3382530022852024309L ^ a;
      var10005 = (a.field_22790 - 20) / 2;
      short var89 = 27840;
      var10007 = 2829166101903825569L ^ a;
      var10005 -= 25;
      short var90 = 20309;
      var10007 = 1741609813749233971L ^ a;
      short var93 = 24983;
      long var10008 = 3382530022852024309L ^ a;
      short var94 = 30618;
      long var10009 = 1061343696284212025L ^ a;
      a.axb = new class_342(a.field_22793, var10004, var10005, 200, 20, class_2561.method_43470("Name"));
      var10000 = 20309;
      var10001 = 1741609813749233971L ^ a;
      int axxx = 200;
      var10000 = 24983;
      var10001 = 3382530022852024309L ^ a;
      int axxxx = 20;
      class_7840 var15 = class_4185.method_46430(a.c(), axxxxx -> {
         int ax = djc.esp().indexOf(a.hbv);
         int axx = (ax + 1) % djc.esp().size();
         a.hbv = djc.esp().get(axx);
         axxxxx.method_25355(a.c());
      });
      short var27 = 20309;
      long var10002 = 1741609813749233971L ^ a;
      short var36 = 24983;
      long var10003 = 3382530022852024309L ^ a;
      class_7840 axxxxx = var15.method_46437(200, 20);
      var10000 = 32408;
      var10001 = 6988327924001460792L ^ a;
      class_7840 var17 = class_4185.method_46430(class_2561.method_43470("Browser Login"), axxxxxx -> gxg.eru(ax -> {
         long ax = cv.a ^ 109422521694663L;
         if (ax != null) {
            new Thread(() -> {
               long ax = cv.a ^ 128916039901237L;
               int[] var10000x = dar.abu();
               afc axx = hhl.cwa(a, a.hbv.cxy());
               int[] axxx = var10000x;
               if (axxx != null && a.gbd) {
                  crv.emo().add(new gfv(axx.av, axx.aqg, axx.acp, true));
               }
            }).start();
         }
      }, a.hbv.cxy()));
      short var29 = 20309;
      var10002 = 1741609813749233971L ^ a;
      short var38 = 24983;
      var10003 = 3382530022852024309L ^ a;
      class_7840 axxxxxx = var17.method_46437(200, 20);
      var10000 = 16078;
      var10001 = 7351117020629865071L ^ a;
      class_7840 var19 = class_4185.method_46430(class_2561.method_43470("Cracked Login"), axxxxxxx -> {
         long ax = cv.a ^ 31405397784749L;
         int[] var10000x = dar.abu();
         ehy.ckh(new gfv(a.axb.method_1882(), "", ""));
         int[] var4x = var10000x;
         if (var4x != null && a.gbd) {
            crv.emo().add(new gfv(chi.method_1548().method_1676(), "", "", false));
         }
      });
      short var31 = 20309;
      var10002 = 1741609813749233971L ^ a;
      short var40 = 24983;
      var10003 = 3382530022852024309L ^ a;
      class_7840 axxxxxxx = var19.method_46437(200, 20);
      var10000 = 18844;
      var10001 = 2975180556490990897L ^ a;
      class_7840 var21 = class_4185.method_46430(class_2561.method_43470("Token Login"), axxxxxxxx -> {
         long ax = cv.a ^ 62785265808911L;
         int[] var10000x = dar.abu();
         MinecraftClientSessionAccessor axx = (MinecraftClientSessionAccessor)chi;
         int[] axxx = var10000x;

         try {
            String axxxx = chi.field_1774.method_1460();
            if (axxx != null) {
               label46:
               if (axxxx != null) {
                  String var12x = axxxx;
                  if (axxx != null) {
                     if (axxxx.isEmpty()) {
                        break label46;
                     }

                     short var13x = 9183;
                     long var15x = 406157482244997440L ^ ax;
                     var12x = axxxx.replaceAll("[^A-Za-z0-9\\-_.]", "");
                  }

                  String axxxxx = var12x;
                  String[] axxxxxx = ehy.evy(axxxxx);
                  UUID axxxxxxx = ehy.duo(axxxxxx[1]);
                  class_320 axxxxxxxx = new class_320(axxxxxx[0], axxxxxxx, axxxxx, Optional.empty(), Optional.empty());
                  if (axxx != null) {
                     if (a.gbd) {
                        crv.emo().add(new gfv(axxxxxx[0], axxxxx, axxxxxx[1], true));
                     }

                     axx.setSession(axxxxxxxx);
                  }

                  return;
               }

               short var14x = 28506;
               long var16x = 3785414276768517575L ^ ax;
               dar.ecj.error("Clipboard is empty");
            }
         } catch (Exception var11x) {
            short var10001x = 25656;
            long var10002x = 7823018177984382624L ^ ax;
            dar.ecj.error("fail");
         }
      });
      short var33 = 20309;
      var10002 = 1741609813749233971L ^ a;
      short var42 = 24983;
      var10003 = 3382530022852024309L ^ a;
      class_7840 axxxxxxxx = var21.method_46437(200, 20);
      var10000 = 17602;
      var10001 = 2642345098655590508L ^ a;
      class_7840 var23 = class_4185.method_46430(class_2561.method_43470("Cookie Login"), axxxxxxxxx -> {
         long ax = cv.a ^ 6439628851425L;
         short var10003x = 3001;
         long var10004x = 5312809427093477324L ^ ax;
         String var4x = System.getProperty("user.home");
         short var5x = 2438;
         long var10005x = 7486289711820592637L ^ ax;
         a.ebz = new fkc(var4x, "txt");
         a.gmy = true;
      });
      short var35 = 20309;
      var10002 = 1741609813749233971L ^ a;
      short var44 = 24983;
      var10003 = 3382530022852024309L ^ a;
      class_7840 axxxxxxxxx = var23.method_46437(200, 20);
      a.method_25429(a.axb);
      short var54 = 20309;
      long var63 = 1741609813749233971L ^ a;
      int var45 = (a.field_22789 - 200) / 2;
      short var64 = 24983;
      long var79 = 3382530022852024309L ^ a;
      int var55 = (a.field_22790 - 20) / 2;
      var64 = 4279;
      long var80 = 3231486598321186515L ^ a;
      a.method_37063(axxxxx.method_46433(var45, var55 - 60).method_46431());
      short var56 = 20309;
      long var66 = 1741609813749233971L ^ a;
      int var46 = (a.field_22789 - 200) / 2;
      var64 = 24983;
      long var81 = 3382530022852024309L ^ a;
      a.method_37063(axxxxxxx.method_46433(var46, (a.field_22790 - 20) / 2).method_46431());
      short var57 = 20309;
      long var68 = 1741609813749233971L ^ a;
      int var47 = (a.field_22789 - 200) / 2;
      var64 = 24983;
      long var82 = 3382530022852024309L ^ a;
      int var58 = (a.field_22790 - 20) / 2;
      var64 = 30614;
      long var83 = 8313423470350909937L ^ a;
      a.method_37063(axxxxxx.method_46433(var47, var58 + 25).method_46431());
      short var59 = 20309;
      long var71 = 1741609813749233971L ^ a;
      int var48 = (a.field_22789 - 200) / 2;
      var64 = 24983;
      long var84 = 3382530022852024309L ^ a;
      int var60 = (a.field_22790 - 20) / 2;
      var64 = 13095;
      long var85 = 5757410930407408967L ^ a;
      a.method_37063(axxxxxxxx.method_46433(var48, var60 + 50).method_46431());
      short var61 = 20309;
      long var74 = 1741609813749233971L ^ a;
      int var49 = (a.field_22789 - 200) / 2;
      var64 = 24983;
      long var86 = 3382530022852024309L ^ a;
      int var62 = (a.field_22790 - 20) / 2;
      var64 = 6512;
      long var87 = 6100719801063452447L ^ a;
      a.method_37063(axxxxxxxxx.method_46433(var49, var62 + 75).method_46431());
   }

   private class_2561 c() {
      return class_2561.method_43470(a.hbv.fcy() + a.hbv.bjs());
   }

   public void method_25420(class_332 context, int mouseX, int mouseY, float delta) {
   }

   public void method_25394(class_332 context, int mouseX, int mouseY, float delta) {
      cv var8;
      long ax = cv.a ^ 73671847829882L;
      int[] var10000 = dar.abu();
      super.method_25394(a, a, a, a);
      int[] var7 = var10000;
      var8 = a;
      label42:
      if (var7 != null) {
         if (a.ebz != null) {
            var8 = a;
            if (var7 == null) {
               break label42;
            }

            if (a.gmy) {
               eu.alu(axx -> {
                  long ax = cv.a ^ 103622112932679L;
                  int[] var4 = dar.abu();
                  short var10000x = 28348;
                  long var10001x = 7509785487302560101L ^ ax;
                  boolean var5x = ImGui.begin("File Explorer");
                  if (var4 != null) {
                     if (!var5x) {
                        return;
                     }

                     var5x = false;
                  }

                  azx.gab(var5x, 3.0F);
                  a.ebz.dut();
                  ImGui.end();
               });
               var8 = a;
               if (var7 == null) {
                  break label42;
               }

               if (a.ebz.aes() != null) {
                  var8 = a;
                  if (var7 == null) {
                     break label42;
                  }

                  if (a.ebz.abc()) {
                     a.gmy = false;
                     Runnable var10002 = () -> {
                        long axx = cv.a ^ 75135116124190L;

                        try {
                           File ax = new File(a.ebz.aes());
                           ehy.crq(ax, a.gbd);
                           a.ebz.bla();
                        } catch (Exception var4) {
                           short var10001x = 7049;
                           long var10002x = 490164217383563014L ^ axx;
                           dar.ecj.error("Cookie login failed", var4);
                        }
                     };
                     short var10003 = 31698;
                     long var10004 = 4997855164836875835L ^ ax;
                     new Thread(var10002, "Cookie Login Thread").start();
                  }
               }
            }
         }

         class_327 var10001 = chi.field_1772;
         class_2561 var10 = a.method_25440();
         int var12 = a.field_22789 / 2;
         short var14 = 2316;
         long var10005 = 1046752367517525547L ^ ax;
         a.method_27534(var10001, var10, var12, 10, -1);
         var10001 = chi.field_1772;
         String var11 = chi.method_1548().method_1676();
         short var13 = 9739;
         long var15 = 8096632353239585774L ^ ax;
         a.method_51433(var10001, "Logged In With " + var11, 3, 3, Color.white.getRGB(), true);
         var8 = a;
      }

      var8.axb.method_25394(a, a, a, a);
   }

   static {
      long var11 = a ^ 60233001835052L;
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
      String var17 = "÷Æû\u007fkóç\u001c\"\u001bããò¤!\r à\u0080\u0090Z\u0094r Q.\u0016·ä\u009exâë,æN\u001cÇ\u009fDï\u001bZ?[Ý£øÛ ROÔ\u009c©¹ÌÇöuË\u0083\u0099\u000e*>\u009av4õ°Yé»¿ äËØSÆå Ò\u0017ê<n\u0093¶\u007f¿1\u0082\\L[Ø\u001cÅµáGL6i:~Îu\u001e\tÒ\u0091ý(4ë\u009e]ÁDe5ê8Qì\u00117M\u0010\u0090Ä\u009a\u008cCßÓ\u0090\u0097\u008c¿hbé\u009eñ¯¥\u0018ÏvY$¸(ûp\u0089\u0084Sm+\u0088\u0006é(\u0014Ùõ0ÿ¦\u0011·¤\u009b³ ÿ¼\u0010~`±_¡F8\u000bK\u0019û \u0095\u009e0g\ra\u0006\u009aÏ\u0096§\u000e\u0018ëá.\u0004\u0010$+3vq\u0089~ë.}Â*\u0010V \u001dZ\u0019>Ö¦\u0085mø\u009aÛ(yÛç6\bw(DûV{JÊ}ÿ`\f\tC`W\u008fK_-\u0002´\u0094aPª\u008d\u009f\u001b\u0090°2\u0091Kuc¸VÏl\f¼ \u00ad@!\u008bêÄ\u0092\u0082ë\u001cÑ6¢ÿRÿ\u0016Ü_/\u0010mÊ\u0092\u0018±\u009e\u008c×½\u0098~ ð\u000bÝÆ\"5O+¡\u0004\u0091\u0003ËàçH\u0088fg°<\u0084æ:k^æ\u008cà\u0016\u0082\u0097 M\u00ad3Ny=î\u0015!&@/B¤´\u0090/ÊØÿ¸\u001a£\u0010P7m\u0013w\u009d]¾\u0018o&óòêñò\u001bñÑ³.²à¼\u0084´\u0001R}\u0014Þ\u000e¼\u0010IÔ\u007fþEâ\u00ad\u0085@¶°v8\u0018C\u0086\u0010\"´©*c_-3\u0003ÂÐ¢ÿ\u001fm1";
      int var19 = "÷Æû\u007fkóç\u001c\"\u001bããò¤!\r à\u0080\u0090Z\u0094r Q.\u0016·ä\u009exâë,æN\u001cÇ\u009fDï\u001bZ?[Ý£øÛ ROÔ\u009c©¹ÌÇöuË\u0083\u0099\u000e*>\u009av4õ°Yé»¿ äËØSÆå Ò\u0017ê<n\u0093¶\u007f¿1\u0082\\L[Ø\u001cÅµáGL6i:~Îu\u001e\tÒ\u0091ý(4ë\u009e]ÁDe5ê8Qì\u00117M\u0010\u0090Ä\u009a\u008cCßÓ\u0090\u0097\u008c¿hbé\u009eñ¯¥\u0018ÏvY$¸(ûp\u0089\u0084Sm+\u0088\u0006é(\u0014Ùõ0ÿ¦\u0011·¤\u009b³ ÿ¼\u0010~`±_¡F8\u000bK\u0019û \u0095\u009e0g\ra\u0006\u009aÏ\u0096§\u000e\u0018ëá.\u0004\u0010$+3vq\u0089~ë.}Â*\u0010V \u001dZ\u0019>Ö¦\u0085mø\u009aÛ(yÛç6\bw(DûV{JÊ}ÿ`\f\tC`W\u008fK_-\u0002´\u0094aPª\u008d\u009f\u001b\u0090°2\u0091Kuc¸VÏl\f¼ \u00ad@!\u008bêÄ\u0092\u0082ë\u001cÑ6¢ÿRÿ\u0016Ü_/\u0010mÊ\u0092\u0018±\u009e\u008c×½\u0098~ ð\u000bÝÆ\"5O+¡\u0004\u0091\u0003ËàçH\u0088fg°<\u0084æ:k^æ\u008cà\u0016\u0082\u0097 M\u00ad3Ny=î\u0015!&@/B¤´\u0090/ÊØÿ¸\u001a£\u0010P7m\u0013w\u009d]¾\u0018o&óòêñò\u001bñÑ³.²à¼\u0084´\u0001R}\u0014Þ\u000e¼\u0010IÔ\u007fþEâ\u00ad\u0085@¶°v8\u0018C\u0086\u0010\"´©*c_-3\u0003ÂÐ¢ÿ\u001fm1"
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[16];
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
                     String var4 = "×§H ´G\u00ad><G:\"©Õ\u0091ë\u0093Üb&tpÀò\u0016\u0092°Ð~\u0016\u009fª\u0095\u0017\u00182ØK\u0095\u009b2)\u0003'î\u0083\u0005\u001b³*\u00ad\u0014\u000eÒé6\u009bö¤\u0094 ucº";
                     int var5 = "×§H ´G\u00ad><G:\"©Õ\u0091ë\u0093Üb&tpÀò\u0016\u0092°Ð~\u0016\u009fª\u0095\u0017\u00182ØK\u0095\u009b2)\u0003'î\u0083\u0005\u001b³*\u00ad\u0014\u000eÒé6\u009bö¤\u0094 ucº"
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

                                 var4 = "\u008d>\u001d§9Ö\u00ad`\u001bXÚ\b\u009e¡\b=";
                                 var5 = "\u008d>\u001d§9Ö\u00ad`\u001bXÚ\b\u009e¡\b=".length();
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

                  var17 = "-}:\u0000+ØìôÇ°}\u009fÿ:ùùæ-w[JÅ²d \u0090\\ê\u0097{\u008e°//eTG\r\u0007ô\u0097=¶%À\u00adÃ§b£2³o\u0098Ó±á";
                  var19 = "-}:\u0000+ØìôÇ°}\u009fÿ:ùùæ-w[JÅ²d \u0090\\ê\u0097{\u008e°//eTG\r\u0007ô\u0097=¶%À\u00adÃ§b£2³o\u0098Ó±á".length();
                  var16 = 24;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11637;
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
            throw new RuntimeException("cc/astralis/cv", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("cc/astralis/cv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14268;
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
            throw new RuntimeException("cc/astralis/cv", var14);
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
         throw new RuntimeException("cc/astralis/cv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
