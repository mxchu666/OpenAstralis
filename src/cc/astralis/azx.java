package cc.astralis;

import imgui.ImGui;
import imgui.ImGuiStyle;
import java.awt.Color;
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

public class azx {
   private static Map<String, Integer> gul;
   private static final long a = 114726295743167L;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public static void gab(boolean invisibleButtonBg, float spacing) {
      long ax = azx.a ^ 111566331583509L;
      short var10002 = 6061;
      long var10003 = 8539488871288970741L ^ ax;
      bfn(a, a, 240);
   }

   public static void bfn(boolean invisibleButtonBg, float spacing, int alpha) {
      long ax;
      int[] axx;
      ImGuiStyle axxx;
      int axxxx;
      int axxxxx;
      int axxxxxx;
      int axxxxxxx;
      Color var13;
      label34: {
         ax = azx.a ^ 66384874029556L;
         axxx = ImGui.getStyle();
         axxx.setWindowRounding(8.0F);
         axxx.setFrameRounding(6.0F);
         int[] var10000 = dar.abu();
         axxx.setGrabRounding(6.0F);
         axxx.setPopupRounding(8.0F);
         axxx.setScrollbarRounding(6.0F);
         axxx.setTabRounding(6.0F);
         axxx.setWindowPadding(12.0F, 12.0F);
         axxx.setFramePadding(8.0F, 4.0F);
         axxx.setItemSpacing(8.0F, 6.0F);
         axx = var10000;
         axxx.setItemInnerSpacing(6.0F, 6.0F);
         axxx.setTouchExtraPadding(2.0F, 2.0F);
         short var10002 = 1532;
         long var10003 = 1420144875567370834L ^ ax;
         short var74 = 6500;
         long var10004 = 6991349264198127349L ^ ax;
         short var81 = 6500;
         long var10005 = 6991349264198127349L ^ ax;
         axxxx = new Color(18, 18, 18, a).getRGB();
         var10002 = 31834;
         var10003 = 3191891434232949749L ^ ax;
         short var76 = 5356;
         var10004 = 7738643992860476241L ^ ax;
         short var83 = 5356;
         var10005 = 7738643992860476241L ^ ax;
         axxxxx = new Color(12, 12, 12).getRGB();
         var10002 = 3718;
         var10003 = 8428869054465530148L ^ ax;
         short var78 = 6061;
         var10004 = 8539391116243451924L ^ ax;
         short var85 = 6061;
         var10005 = 8539391116243451924L ^ ax;
         axxxxxx = new Color(240, 240, 240).getRGB();
         var10002 = 953;
         var10003 = 3530603694321751076L ^ ax;
         short var80 = 12738;
         var10004 = 1889000627451586136L ^ ax;
         short var87 = 12738;
         var10005 = 1889000627451586136L ^ ax;
         axxxxxxx = new Color(180, 180, 180).getRGB();
         var13 = dar.gqy().aws().diy(daw.class);
         if (axx != null) {
            if (var13 == null) {
               var13 = Color.blue;
               break label34;
            }

            var13 = dar.gqy().aws().diy(daw.class).clb.dnp();
         }

         var13 = var13;
      }

      int axxxxxxxx;
      label28: {
         axxxxxxxx = dec.brp(var13);
         axxx.setItemSpacing(6.0F, a);
         short var10001 = 1425;
         long var45 = 9110002610658431521L ^ ax;
         short var88 = 32496;
         long var109 = 6143350545201113446L ^ ax;
         short var110 = 24380;
         long var10006 = 6383000324080240772L ^ ax;
         short var143 = 24380;
         long var10007 = 6383000324080240772L ^ ax;
         axxx.setColor(33, new Color(35, 35, 35).getRGB());
         var10001 = 22528;
         var45 = 1625477482015920036L ^ ax;
         axxx.setColor(34, axxxxxxxx);
         var10001 = 24380;
         var45 = 6383000324080240772L ^ ax;
         var88 = 24380;
         var109 = 6383000324080240772L ^ ax;
         short var112 = 24380;
         var10006 = 6383000324080240772L ^ ax;
         short var145 = 24380;
         var10007 = 6383000324080240772L ^ ax;
         axxx.setColor(35, new Color(35, 35, 35).getRGB());
         axxx.setColor(0, axxxxxx);
         axxx.setColor(1, axxxxxxx);
         axxx.setColor(2, axxxx);
         axxx.setColor(3, axxxxx);
         axxx.setColor(4, axxxx);
         var88 = 4273;
         var109 = 7469790492711995195L ^ ax;
         short var114 = 27728;
         var10006 = 6961748502708698107L ^ ax;
         short var147 = 27728;
         var10007 = 6961748502708698107L ^ ax;
         axxx.setColor(5, new Color(45, 45, 45).getRGB());
         var10001 = 7364;
         var45 = 665866720188025708L ^ ax;
         axxx.setColor(6, new Color(0, 0, 0, 0).getRGB());
         var10001 = 30370;
         var45 = 6022350060719677751L ^ ax;
         var88 = 15898;
         var109 = 5354621621706877355L ^ ax;
         axxx.setColor(7, new Color(30, a<"p">(8427, 5969924834265233254L ^ ax), a<"p">(8427, 5969924834265233254L ^ ax)).getRGB());
         var10001 = 10924;
         var45 = 8021280300006407487L ^ ax;
         var88 = 27728;
         var109 = 6961748502708698107L ^ ax;
         short var117 = 27728;
         var10006 = 6961748502708698107L ^ ax;
         short var149 = 27728;
         var10007 = 6961748502708698107L ^ ax;
         axxx.setColor(8, new Color(45, 45, 45).getRGB());
         var10001 = 23240;
         var45 = 3938969705264385378L ^ ax;
         var88 = 24380;
         var109 = 6383000324080240772L ^ ax;
         short var119 = 24380;
         var10006 = 6383000324080240772L ^ ax;
         short var151 = 24380;
         var10007 = 6383000324080240772L ^ ax;
         axxx.setColor(9, new Color(35, 35, 35).getRGB());
         var10001 = 6500;
         var45 = 6991349264198127349L ^ ax;
         axxx.setColor(18, axxxxxxxx);
         var10001 = 29287;
         var45 = 4314400978070709747L ^ ax;
         axxx.setColor(19, axxxxxxxx);
         var10001 = 13437;
         var45 = 79610762293502919L ^ ax;
         axxx.setColor(20, axxxxxxxx);
         if (axx != null) {
            if (a) {
               var10001 = 30101;
               var45 = 1756292408804319801L ^ ax;
               axxx.setColor(21, 0);
               var10001 = 1984;
               var45 = 1974993056138317950L ^ ax;
               axxx.setColor(22, 0);
               var10001 = 4910;
               var45 = 3583030450375214222L ^ ax;
               axxx.setColor(23, 0);
               if (axx != null) {
                  break label28;
               }
            }

            var10001 = 23288;
            var45 = 294448399051558211L ^ ax;
            var88 = 24380;
            var109 = 6383000324080240772L ^ ax;
            short var121 = 24380;
            var10006 = 6383000324080240772L ^ ax;
            short var153 = 24380;
            var10007 = 6383000324080240772L ^ ax;
            axxx.setColor(21, new Color(35, 35, 35).getRGB());
            var10001 = 2870;
            var45 = 8065836117033933971L ^ ax;
            axxx.setColor(22, axxxxxxxx);
         }

         var10001 = 32328;
         var45 = 6362057760344910279L ^ ax;
         axxx.setColor(23, axxxxxxxx);
      }

      short var29 = 27106;
      long var61 = 5633914795510218307L ^ ax;
      int var95 = 2908;
      long var122 = 5448240559477382341L ^ ax;
      short var123 = 20920;
      long var154 = 2828980574030693918L ^ ax;
      short var155 = 20920;
      long var179 = 2828980574030693918L ^ ax;
      axxx.setColor(24, new Color(40, 40, 40).getRGB());
      var29 = 13366;
      var61 = 5930322214573859712L ^ ax;
      axxx.setColor(25, axxxxxxxx);
      var29 = 15377;
      var61 = 2421619425313975174L ^ ax;
      axxx.setColor(26, axxxxxxxx);
      var29 = 10405;
      var61 = 3524080320745701173L ^ ax;
      var95 = (short)11186;
      var122 = 2415290558512200764L ^ ax;
      short var125 = 11186;
      var154 = 2415290558512200764L ^ ax;
      short var157 = 11186;
      var179 = 2415290558512200764L ^ ax;
      axxx.setColor(10, new Color(20, 20, 20).getRGB());
      var29 = 2806;
      var61 = 5704889483568962889L ^ ax;
      var95 = (short)8702;
      var122 = 4405586146542253676L ^ ax;
      short var127 = 8702;
      var154 = 4405586146542253676L ^ ax;
      short var159 = 8702;
      var179 = 4405586146542253676L ^ ax;
      axxx.setColor(11, new Color(25, 25, 25).getRGB());
      var29 = 5356;
      var61 = 7738643992860476241L ^ ax;
      var95 = (short)28913;
      var122 = 1902665679202035525L ^ ax;
      short var129 = 20938;
      var154 = 6222693609590163049L ^ ax;
      short var161 = 20938;
      var179 = 6222693609590163049L ^ ax;
      axxx.setColor(12, new Color(15, 15, 15).getRGB());
      var29 = 10863;
      var61 = 6570886439680081395L ^ ax;
      var95 = (short)20938;
      var122 = 6222693609590163049L ^ ax;
      short var131 = 20938;
      var154 = 6222693609590163049L ^ ax;
      short var163 = 20938;
      var179 = 6222693609590163049L ^ ax;
      axxx.setColor(14, new Color(15, 15, 15).getRGB());
      var29 = 20938;
      var61 = 6222693609590163049L ^ ax;
      var95 = (short)29540;
      var122 = 4303174744157562093L ^ ax;
      short var133 = 29581;
      var154 = 6856607892781868054L ^ ax;
      short var165 = 29581;
      var179 = 6856607892781868054L ^ ax;
      axxx.setColor(15, new Color(50, 50, 50).getRGB());
      var29 = 27393;
      var61 = 2968735501929233576L ^ ax;
      var95 = (short)32507;
      var122 = 587500573995706716L ^ ax;
      short var135 = 21980;
      var154 = 3175267889707418196L ^ ax;
      short var167 = 21980;
      var179 = 3175267889707418196L ^ ax;
      axxx.setColor(16, new Color(60, 60, 60).getRGB());
      var29 = 25538;
      var61 = 5324604476209280126L ^ ax;
      var95 = (short)30200;
      var122 = 8350492477862748749L ^ ax;
      axxx.setColor(17, new Color(70, a<"p">(2068, 6435668299488092056L ^ ax), a<"p">(2068, 6435668299488092056L ^ ax)).getRGB());
      var29 = 23754;
      var61 = 697106684600683346L ^ ax;
      short var137 = 10573;
      var154 = 443898791000833747L ^ ax;
      var95 = axxxxxxxx & 16777215;
      short var138 = 11248;
      var154 = 6324692778126015559L ^ ax;
      axxx.setColor(49, new Color(var95 | 855638016).getRGB());
      var29 = 8253;
      var61 = 7513838405884573582L ^ ax;
      short var139 = 3228;
      var154 = 1580250438439230211L ^ ax;
      var95 = axxxxxxxx & 16777215;
      short var140 = 22123;
      var154 = 5432617172862894560L ^ ax;
      axxx.setColor(51, new Color(var95 | 1711276032).getRGB());
      var29 = 23261;
      var61 = 5960012817460792688L ^ ax;
      short var105 = 8840;
      var122 = 3010853333644571962L ^ ax;
      short var142 = 8840;
      var154 = 3010853333644571962L ^ ax;
      short var173 = 8840;
      var179 = 3010853333644571962L ^ ax;
      short var187 = 12738;
      long var10008 = 1889000627451586136L ^ ax;
      axxx.setColor(54, new Color(10, 10, 10, 180).getRGB());
   }

   public static void gtc() {
   }

   static {
      long var0 = a ^ 48680868555764L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[56];
      int var5 = 0;
      String var6 = "É'(\u00ad \u0005±\u0084\"õ\f\u0095\u0090¼KÔ¸\u0084luVØ|}g%î\u0081(^Ú\u0094Sy\u001fw\u008f\u001fìßKÕ.¹ÐÈ<µÛÏÿ\r°ÀðÜPo÷\u0013\u0086ãSñqè\u0084_:Ñi/ú\u0015¿s6©\u001du\u0007(R<\u0012\u001aãç¬\u007f$Õà\u009dÞ¢¡\u008aæ¹Ù+±_L\"1,3Ê²é$íÇ1Û(\u0093X\u009b\u0081êË\u008dKT+ÎØ\rPm4V<\f´3ÎÍe hU\u0080ðXï Ø³ámø/{\u008ehâË\u001eÅíß#\u0086¬\u00adªPCÌk\u0091ï\u0098\u009fRëÙ3w\u000e\u0002\u00867\u0086TUþ\u0015h|\u008aÝÍT³îEDò7\u001a\u0004\u0091í8f\u001eàÖ`cöÑ\u00adQ¬·\u008a;3÷`ç°`\t\u008e\rXõ«âû¸'ËëI4~Ñf¤\u0000\u0098.>\u008a±ò\u0015Dìu¼:y¢\u0094\u008bvfæ\u0099Tºû¥Ni0\u009b\u0085íóU7Åð\u009c(eñ9Ü²íGUZY´X\u0004Ørº\u001c\u008b\u0099E\u0007\u001a\u0082\th\"Q³dÆDÂ\u0012õÝ\u0006¾Ñ\u0084ò/\u007fr\u0092\u0097£\u0097\b÷¸\u0007¹»·¸\u008bâgì®\u0005Ú\u0004\u0099ù®\tiò\u0088 ì\u0094©t\u0000\u0006©'8\u0090i¡¡æ\u0003¾\u0098\u0088£ª©\u0083ÚÔ1õ¯4Ñ\u0092»Qîþ{ä:Ð:°\nc¾e\u0089\u0018\u0002+Ç'\u0081\u0084\u008dÁqÊÁ\u009e\u0097gR\u0019oèú°lï\f\u0096{ê4Î\u0016\u000b";
      int var7 = "É'(\u00ad \u0005±\u0084\"õ\f\u0095\u0090¼KÔ¸\u0084luVØ|}g%î\u0081(^Ú\u0094Sy\u001fw\u008f\u001fìßKÕ.¹ÐÈ<µÛÏÿ\r°ÀðÜPo÷\u0013\u0086ãSñqè\u0084_:Ñi/ú\u0015¿s6©\u001du\u0007(R<\u0012\u001aãç¬\u007f$Õà\u009dÞ¢¡\u008aæ¹Ù+±_L\"1,3Ê²é$íÇ1Û(\u0093X\u009b\u0081êË\u008dKT+ÎØ\rPm4V<\f´3ÎÍe hU\u0080ðXï Ø³ámø/{\u008ehâË\u001eÅíß#\u0086¬\u00adªPCÌk\u0091ï\u0098\u009fRëÙ3w\u000e\u0002\u00867\u0086TUþ\u0015h|\u008aÝÍT³îEDò7\u001a\u0004\u0091í8f\u001eàÖ`cöÑ\u00adQ¬·\u008a;3÷`ç°`\t\u008e\rXõ«âû¸'ËëI4~Ñf¤\u0000\u0098.>\u008a±ò\u0015Dìu¼:y¢\u0094\u008bvfæ\u0099Tºû¥Ni0\u009b\u0085íóU7Åð\u009c(eñ9Ü²íGUZY´X\u0004Ørº\u001c\u008b\u0099E\u0007\u001a\u0082\th\"Q³dÆDÂ\u0012õÝ\u0006¾Ñ\u0084ò/\u007fr\u0092\u0097£\u0097\b÷¸\u0007¹»·¸\u008bâgì®\u0005Ú\u0004\u0099ù®\tiò\u0088 ì\u0094©t\u0000\u0006©'8\u0090i¡¡æ\u0003¾\u0098\u0088£ª©\u0083ÚÔ1õ¯4Ñ\u0092»Qîþ{ä:Ð:°\nc¾e\u0089\u0018\u0002+Ç'\u0081\u0084\u008dÁqÊÁ\u009e\u0097gR\u0019oèú°lï\f\u0096{ê4Î\u0016\u000b"
         .length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
            byte[] var12 = var2.doFinal(
               new byte[]{
                  (byte)(var10 >>> 56),
                  (byte)(var10 >>> 48),
                  (byte)(var10 >>> 40),
                  (byte)(var10 >>> 32),
                  (byte)(var10 >>> 24),
                  (byte)(var10 >>> 16),
                  (byte)(var10 >>> 8),
                  (byte)var10
               }
            );
            long var21 = (var12[0] & 255L) << 56
               | (var12[1] & 255L) << 48
               | (var12[2] & 255L) << 40
               | (var12[3] & 255L) << 32
               | (var12[4] & 255L) << 24
               | (var12[5] & 255L) << 16
               | (var12[6] & 255L) << 8
               | var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[56];
                     gul = new HashMap<>();
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "Ú\u0086\u0083¥Ôé_Q\u0090wôm¨:×N";
                  var7 = "Ú\u0086\u0083¥Ôé_Q\u0090wôm¨:×N".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = (var9[0] & 255L) << 56
               | (var9[1] & 255L) << 48
               | (var9[2] & 255L) << 40
               | (var9[3] & 255L) << 32
               | (var9[4] & 255L) << 24
               | (var9[5] & 255L) << 16
               | (var9[6] & 255L) << 8
               | var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15601;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/azx", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
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
         throw new RuntimeException("cc/astralis/azx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
