package astralis.mixin.render;

import cc.astralis.cdr;
import cc.astralis.coc;
import cc.astralis.czo;
import cc.astralis.dar;
import cc.astralis.dlc;
import cc.astralis.dmr;
import cc.astralis.foz;
import cc.astralis.gaf;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2583;
import net.minecraft.class_266;
import net.minecraft.class_268;
import net.minecraft.class_269;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_5250;
import net.minecraft.class_9011;
import net.minecraft.class_9020;
import net.minecraft.class_9022;
import net.minecraft.class_9025;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_329.class})
public class MixinInGameHud {
   private static final String a;
   private static final long b;
   private static final long c = 79406596857538L;
   private static final long[] d;
   private static final Integer[] e;
   private static final Map f;
   private static final long[] g;
   private static final Long[] h;
   private static final Map i;

   @Inject(
      method = {"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderScoreboardSidebarHook(class_332 a, class_266 a, CallbackInfo a) {
      foz ax = dar.gqy().aws().diy(foz.class);
      if (ax.dsv() && ax.hex.dnp()) {
         a.cancel();
      }
   }

   @ModifyArg(
      method = {"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/DrawContext;fill(IIIII)V",
         ordinal = 0
      ),
      index = 4
   )
   private int changeHeaderColor(int a) {
      foz ax = dar.gqy().aws().diy(foz.class);
      return ax.dsv() && ax.fkl.dnp() ? ax.bpn.dnp().getRGB() : a;
   }

   @ModifyArg(
      method = {"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/DrawContext;fill(IIIII)V",
         ordinal = 1
      ),
      index = 4
   )
   private int changeBodyColor(int a) {
      foz ax = dar.gqy().aws().diy(foz.class);
      return ax.dsv() && ax.fkl.dnp() ? ax.bxw.dnp().getRGB() : a;
   }

   @Inject(
      method = {"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V"},
      at = {@At("HEAD")}
   )
   private void onRenderScoreboardSidebar(class_332 a, class_266 a, CallbackInfo a) {
      long ax = c ^ 87397680898961L;
      long axx = b<"q">(29677, 4781066639527951049L ^ ax);
      if (a != null) {
         class_310 axxx = class_310.method_1551();
         class_269 axxxx = a.method_1117();
         class_327 axxxxx = axxx.field_1772;
         List<class_9011> axxxxxx = axxxx.method_1184(a).stream().filter(axxxxxxx -> !axxxxxxx.method_55385()).limit(b).toList();
         int axxxxxxx = axxxxx.method_27525(a.method_1114());
         int axxxxxxxx = axxxxx.method_1727(MixinInGameHud.a);

         for (class_9011 axxxxxxxxx : axxxxxx) {
            class_268 axxxxxxxxxx = axxxx.method_1164(axxxxxxxxx.comp_2127());
            class_5250 axxxxxxxxxxx = class_268.method_1142(axxxxxxxxxx, axxxxxxxxx.method_55387());
            class_5250 axxxxxxxxxxxx = axxxxxxxxx.method_55386(a.method_55380(class_9025.field_47567));
            axxxxxxx = Math.max(
               axxxxxxx, axxxxx.method_27525(axxxxxxxxxxx) + (axxxxx.method_27525(axxxxxxxxxxxx) > 0 ? axxxxxxxx + axxxxx.method_27525(axxxxxxxxxxxx) : 0)
            );
         }

         int var21 = axxx.method_22683().method_4486();
         int var10000 = 22435;
         int var22 = axxx.method_22683().method_4502();
         long var10001 = 4064989108573791192L ^ ax;
         int axxxxxxxxx = 9;
         int axxxxxxxxxx = axxxxxx.size();
         int axxxxxxxxxxx = axxxxxxxxxx * axxxxxxxxx;
         int axxxxxxxxxxxx = var21 - axxxxxxx - 3;
         var10000 = var22 / 2 + axxxxxxxxxxx / 3;
         short var10002 = 19234;
         long var10003 = 902945074178817887L ^ ax;
         int axxxxxxxxxxxxx = var10000 - axxxxxxxxxx * 9;
         dar.gqy().aws().diy(foz.class).beb(new czo(axxxxxxxxxxxx, axxxxxxxxxxxxx, axxxxxxx, axxxxxxxxxxx));
      }
   }

   @ModifyVariable(
      method = {"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V"},
      at = @At(
         value = "STORE",
         ordinal = 0
      )
   )
   private class_9022 removeScore(class_9022 a, class_332 a, class_266 a) {
      foz ax = dar.gqy().aws().diy(foz.class);
      return (class_9022)(ax.dsv() && ax.grq.dnp() ? class_9020.field_47557 : a);
   }

   @ModifyExpressionValue(
      method = {"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/scoreboard/ScoreboardObjective;getNumberFormatOr(Lnet/minecraft/scoreboard/number/NumberFormat;)Lnet/minecraft/scoreboard/number/NumberFormat;"
      )}
   )
   private class_9022 changeScoreColor(class_9022 a) {
      foz ax = dar.gqy().aws().diy(foz.class);
      if (ax.dsv() && ax.fkl.dnp()) {
         return (class_9022)(a == class_9020.field_47557 ? a : new class_9025(class_2583.field_24360.method_36139(ax.ghl.dnp().getRGB())));
      } else {
         return a;
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void render(class_332 a, class_9779 a, CallbackInfo a) {
   }

   @Inject(
      method = {"renderPlayerList(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V"},
      at = {@At("TAIL")}
   )
   private void handleRenderPlayerList(class_332 a, class_9779 a, CallbackInfo a) {
      cdr.hbz = a;
   }

   @Inject(
      method = {"renderCrosshair"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderCrosshair(class_332 a, class_9779 a, CallbackInfo a) {
      if (dlc.chi.field_1755 instanceof dmr || dlc.chi.field_1755 instanceof coc || dlc.chi.field_1755 instanceof gaf) {
         a.cancel();
      }
   }

   static {
      long var26 = c ^ 31623912921658L;
      Cipher var23;
      Cipher var10000 = var23 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var26 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var24 = 1; var24 < 8; var24++) {
         var10003[var24] = (byte)(var26 << var24 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var25 = var23.doFinal("ÂW\u000bÖA\u000f¶\u0017".getBytes("ISO-8859-1"));
      String var43 = a(var25).intern();
      int var10001 = -1;
      String var22 = var43;
      f = new HashMap(13);
      Cipher var11;
      var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var26 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var26 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var17 = new long[12];
      int var14 = 0;
      String var15 = ";5»Á¸\u008c\u0015WTKCº47O\u009fÛè a¡~\u009d\u0005Uf\u009a!i?¦å\u0012BÑØ;u¯\u0018ª\u0098=\rÙÚy\b8\u001a'xîÏ\u0014ÞÿÄ´-¨¡\u0006R\f»Yj¶^\u008c¨i\u009eÜi'ípø";
      int var16 = ";5»Á¸\u008c\u0015WTKCº47O\u009fÛè a¡~\u009d\u0005Uf\u009a!i?¦å\u0012BÑØ;u¯\u0018ª\u0098=\rÙÚy\b8\u001a'xîÏ\u0014ÞÿÄ´-¨¡\u0006R\f»Yj¶^\u008c¨i\u009eÜi'ípø"
         .length();
      byte var13 = 0;

      label47:
      while (true) {
         var10001 = var13;
         var13 += 8;
         byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
         long[] var32 = var17;
         var10001 = var14++;
         long var45 = (var18[0] & 255L) << 56
            | (var18[1] & 255L) << 48
            | (var18[2] & 255L) << 40
            | (var18[3] & 255L) << 32
            | (var18[4] & 255L) << 24
            | (var18[5] & 255L) << 16
            | (var18[6] & 255L) << 8
            | var18[7] & 255L;
         byte var51 = -1;

         while (true) {
            long var19 = var45;
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
            long var55 = (var21[0] & 255L) << 56
               | (var21[1] & 255L) << 48
               | (var21[2] & 255L) << 40
               | (var21[3] & 255L) << 32
               | (var21[4] & 255L) << 24
               | (var21[5] & 255L) << 16
               | (var21[6] & 255L) << 8
               | var21[7] & 255L;
            switch (var51) {
               case 0:
                  var32[var10001] = var55;
                  if (var13 >= var16) {
                     d = var17;
                     e = new Integer[12];
                     i = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var26 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var26 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "\u0003ó¬\\pLÓcl\u0094ã0GÃ\u0001+\"WZï\u008aDW\u0005";
                     int var5 = "\u0003ó¬\\pLÓcl\u0094ã0GÃ\u0001+\"WZï\u008aDW\u0005".length();
                     byte var2 = 0;

                     do {
                        int var38 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
                        var38 = var3++;
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
                        var55 = (var10[0] & 255L) << 56
                           | (var10[1] & 255L) << 48
                           | (var10[2] & 255L) << 40
                           | (var10[3] & 255L) << 32
                           | (var10[4] & 255L) << 24
                           | (var10[5] & 255L) << 16
                           | (var10[6] & 255L) << 8
                           | var10[7] & 255L;
                        byte var54 = -1;
                        var6[var38] = var55;
                     } while (var2 < var5);

                     g = var6;
                     h = new Long[3];
                     short var34 = 16323;
                     long var40 = 2287480718963601936L ^ var26;
                     String var48 = a(101, a(var22));
                     byte var41 = -1;
                     a = var48;
                     long var28 = b<"q">(8521, 401959129352212932L ^ var26);
                     long var49 = b<"q">(11200, 5592378988781476686L ^ var26) ^ var28;
                     var41 = -1;
                     b = var49;
                     return;
                  }
                  break;
               default:
                  var32[var10001] = var55;
                  if (var13 < var16) {
                     continue label47;
                  }

                  var15 = "\u0014õ\u000faSÏ\u008f\u0010¸9\u0088ÍMN\u009f\u009f";
                  var16 = "\u0014õ\u000faSÏ\u008f\u0010¸9\u0088ÍMN\u009f\u009f".length();
                  var13 = 0;
            }

            byte var37 = var13;
            var13 += 8;
            var18 = var15.substring(var37, var13).getBytes("ISO-8859-1");
            var32 = var17;
            var10001 = var14++;
            var45 = (var18[0] & 255L) << 56
               | (var18[1] & 255L) << 48
               | (var18[2] & 255L) << 40
               | (var18[3] & 255L) << 32
               | (var18[4] & 255L) << 24
               | (var18[5] & 255L) << 16
               | (var18[6] & 255L) << 8
               | var18[7] & 255L;
            var51 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      long var1 = c ^ 104212011951749L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 1972;
         long var10005 = 4480320397704951518L ^ var1;
         var10000[0] = (char)(var10003 ^ 'Q');
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = c ^ 93456275545239L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         var10001[var4] = (char)(var10001[var4] ^ var10002 ^ switch (var4 % a<"i">(4170, 5208904133450652474L ^ var2)) {
            case 0 -> {
               short var15 = 12766;
               long var20 = 6407735514516159148L ^ var2;
               yield 56;
            }
            case 1 -> {
               short var14 = 11254;
               long var19 = 4536317651072049290L ^ var2;
               yield 91;
            }
            case 2 -> {
               short var13 = 6994;
               long var18 = 5409375770166513704L ^ var2;
               yield 88;
            }
            case 3 -> {
               short var12 = 25229;
               long var17 = 8522280359220029950L ^ var2;
               yield 87;
            }
            case 4 -> {
               short var11 = 5237;
               long var16 = 5983613682928148236L ^ var2;
               yield 120;
            }
            case 5 -> {
               short var10 = 18379;
               long var10008 = 4543745952340905140L ^ var2;
               yield 75;
            }
            default -> a<"i">(10450, 3881758834009236387L ^ var2);
         });
      }

      return new String(var10001).intern();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18735;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("astralis/mixin/render/MixinInGameHud", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
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
         throw new RuntimeException("astralis/mixin/render/MixinInGameHud" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13431;
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
            throw new RuntimeException("astralis/mixin/render/MixinInGameHud", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         h[var3] = var15;
      }

      return h[var3];
   }

   private static long b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = b(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
         throw new RuntimeException("astralis/mixin/render/MixinInGameHud" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
