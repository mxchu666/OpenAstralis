package cc.astralis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONObject;

public class fno extends guu {
   private final bes bav;
   private static final String bxf;
   private final cbm bmk;
   private final cbm fea;
   private int fvg;
   private int dqb;
   private int cnk;
   private int fvo;
   private int ecp;
   private int fbj;
   private static final long a = 93971876294491L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;
   private static final long v;

   public fno() {
      long a = fno.a ^ 83615123284411L;
      super(bfm.EXPLOIT);
      short var10003 = 10089;
      long var10004 = 98703816258245991L ^ a;
      a.bav = new bes("Delay In Between Checks", 2000.0F, 0.0F, 10000.0F, 1.0F);
      a.bmk = new cbm();
      a.fea = new cbm();
      a.fvg = -1;
      a.dqb = 0;
      a.cnk = -1;
      a.fvo = 0;
      a.ecp = 0;
      a.fbj = 0;
      a.beb(a.bav);
   }

   @gdz
   public void fhp(fxx event) {
      dkw.dwk(() -> {
         long ax = fno.a ^ 122315026112748L;
         int[] ax = dar.abu();

         try {
            fno var6;
            label38: {
               boolean var10000 = a.bmk.fsc(a.bav.dnp().longValue());
               if (ax != null) {
                  if (var10000) {
                     a.bjd();
                  }

                  var6 = a;
                  if (ax == null) {
                     break label38;
                  }

                  var10000 = a.fea.fsc(v);
               }

               if (!var10000) {
                  return;
               }

               var6 = a;
            }

            var6.axk();
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      });
   }

   public void bjd() throws Exception {
      long a = fno.a ^ 88959017441592L;
      int[] var10000 = dar.abu();
      JSONObject ax = a.fwt();
      int[] axx = var10000;
      int var10001 = 32392;
      long var10002 = 6537227079242183686L ^ a;
      int axxx = ax.getInt("watchdog_total");
      var10001 = (short)32406;
      var10002 = 6032828368978736150L ^ a;
      int axxxx = ax.getInt("staff_total");
      fno var9 = a;
      if (axx != null) {
         label66:
         if (a.fvg != -1) {
            int var10 = a.cnk;
            var10001 = -1;
            if (axx != null) {
               if (a.cnk == -1) {
                  break label66;
               }

               var10 = axxx;
               var10001 = a.fvg;
            }

            int axxxxx = var10 - var10001;
            int axxxxxx = axxxx - a.cnk;
            int var11 = axxxxx;
            if (axx != null) {
               if (axxxxx > 0) {
                  a.dqb += axxxxx;
                  a.ecp += axxxxx;
               }

               var11 = axxxxxx;
            }

            if (axx != null) {
               if (var11 > 0) {
                  a.fvo += axxxxxx;
                  a.fbj += axxxxxx;
               }

               a.fvg = axxx;
               a.cnk = axxxx;
               if (axx == null) {
                  return;
               }

               var11 = axxxxx;
            }

            if (var11 > 0 || axxxxxx > 0) {
               a.fea.glr();
            }

            return;
         }

         a.fvg = axxx;
         var9 = a;
      }

      var9.cnk = axxxx;
   }

   private void axk() {
      long a = fno.a ^ 20980541353177L;
      int[] ax = dar.abu();
      int var10000 = a.ecp;
      if (ax != null) {
         if (a.ecp > 0) {
            fnb var10 = fnb.hcp();
            String var10002 = a.ecp > 1 ? "s" : "";
            int axx = a.dqb;
            String axxx = var10002;
            int axxxx = a.ecp;
            short var10001 = 23118;
            long var17 = 7623283973639562532L ^ a;
            short var10003 = 9117;
            long var10004 = 9098169026649726203L ^ a;
            short var10005 = 26537;
            long var10006 = 2186047997018134733L ^ a;
            fnb var11 = var10.ael("Watchdog Banned " + axxxx + " player" + axxx + " in the past 15 seconds , total " + axx, gge.WARNING);
            var10001 = 15843;
            long var18 = 9149787464410439944L ^ a;
            var11.bvw(4000).evs();
            a.ecp = 0;
         }

         var10000 = a.fbj;
      }

      if (var10000 > 0) {
         fnb var12 = fnb.hcp();
         String var19 = a.fbj > 1 ? "s" : "";
         int axx = a.fvo;
         String axxx = var19;
         int var9 = a.fbj;
         short var15 = 15821;
         long var20 = 7264895354786611878L ^ a;
         short var22 = 30946;
         long var23 = 4153397346987493258L ^ a;
         short var24 = 22241;
         long var25 = 914574339066653059L ^ a;
         fnb var13 = var12.ael("Staff Banned " + var9 + " player" + axxx + " in the past 15 seconds , total " + axx, gge.WARNING);
         var15 = 27800;
         long var21 = 8472981014656020594L ^ a;
         var13.bvw(4000).evs();
         a.fbj = 0;
      }
   }

   private JSONObject fwt() throws Exception {
      long a = fno.a ^ 25646731020055L;
      int[] var10000 = dar.abu();
      short var10003 = 1269;
      long var10004 = 4981963544153919579L ^ a;
      URL ax = new URL("https://api.plancke.io/hypixel/v1/punishmentStats");
      HttpURLConnection axx = (HttpURLConnection)ax.openConnection();
      short var10002 = 3035;
      long var12 = 1692242152538414966L ^ a;
      axx.setRequestMethod("GET");
      var10002 = 25879;
      long var13 = 8108173564591698364L ^ a;
      var10003 = 27889;
      var10004 = 4764643256927778902L ^ a;
      axx.setRequestProperty("User-Agent", "kwayservices.top");
      int[] axxx = var10000;
      BufferedReader axxxx = new BufferedReader(new InputStreamReader(axx.getInputStream()));
      StringBuilder axxxxx = new StringBuilder();

      while (true) {
         String axxxxxx;
         if ((axxxxxx = axxxx.readLine()) != null) {
            axxxxx.append(axxxxxx);
            if (axxx != null) {
               continue;
            }
            break;
         }

         axxxx.close();
         axx.disconnect();
         break;
      }

      JSONObject axxxxxx = new JSONObject(axxxxx.toString());
      byte var10001 = 104;
      long var11 = 5094626355071128776L ^ a;
      return axxxxxx.getJSONObject("record");
   }

   static {
      long var16 = a ^ 78361837535383L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var19 = 1; var19 < 8; var19++) {
         var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[15];
      int var23 = 0;
      String var22 = "ëT6L\u0089Ø\u0082{3§¢aÉ\u001a½\b(¥\u0081÷\u00964\fF\u0094u¯ÏwÖ7®·dÌs£_\u0082\u00ad_\u000bÔ¿Q\u009b·Aý#ÔI\u0010\u008a\u0099>ô(\u0098FÞÈ^Ä\u0001\u0080^|Å?\u0002\u0006¶w·TÐfx\u009co\u009f\u0015)Û\u0010Fì\u0010A?¼8ò\u0012\u0016ò\u0097 a\u008d\u0094]y\th\u0003ßç*UÕ\u0082`xÞ\u00929\u0092Oõ+}Íje\u0085óy\u0093\u0000(\u009e\u0007_§\"/~E\u0090|ë|©)ËàQé~\u008cC(o÷ÑÀ\u009f\u0013X\u0089þ\b_çß{¬\u009eR¯XF$'R2SM%A\u001cq]ø(âÝ®f\u0019¯\u001fæüô\u0093\u00937Ãv\u0018\u008cÙzõ/ÑAþ¢|\u0087`Å\"r¡©\u008b\u00ad\u0089\u0016\u009c\u009e\u0004«\u0012Óp\u0089+gõú«I}Ë2$\u0080\bj¸7µ¼¦ñ\u00153\fÆXEn\u001fT \u0010è\f`þ\u008a\u0012¦U\u008eÅz\u009f©zÃ\u0001\u0018\u001fáÞðôêð§Ë\u0093¦Å¸vh×\u0085¡Z\u0002ºÅ\u009b\u0015X\u00887;\u008aå´\u0001n,\u007f\u009fbT\\Ðp\"\u001f\u009b»L¬æ½\u00adI2\u0013Ý@vÏðíù\u001bmÓxÔè\u0003¢è´#\u00ad8ÆÑ\u0082ñ\u0099\u0092\rÎÓ\u001bøw\u0087\u0003Å>r£\u008a\rü7\u0089Äc$~¡\u0085uzÙå=\u0095éoíæw \u0085A;A\u001cv\u0014x\u008b\u0081G\u0001mä\u0013\u001c1·\u00ad}ë\u0096mîÒávÐ±\u009a1±@\u0099ÈF\u0081T\u000fÉ%Ô=oC%Ò\u001d\u009cl\u0095\u00065\u0003éF\u008e\u0005!öH`ÚòÆØ\u001fìg1Þ\u0014\u0017Új9¿pK°\u00ad\u0091\u0096'~)µÁ\u009f\u007f\u0099Q1Ì9\u0085\u008e\u0010LD\u001b\u0015\u007f@§3¨f\u007fÐfcg\u0090HY ¤vUð;,} lÇ/KqE¯\u0083\u0013õH`!þØYtíHæ\u00029µX\u008e&»¾ÒiÃò\u0090[\u0001×¦ãËë\u0016Ø\u001fïk\u001fxJÒ\u0090l4`.\u008dKl{\u0006Q÷\"";
      int var24 = "ëT6L\u0089Ø\u0082{3§¢aÉ\u001a½\b(¥\u0081÷\u00964\fF\u0094u¯ÏwÖ7®·dÌs£_\u0082\u00ad_\u000bÔ¿Q\u009b·Aý#ÔI\u0010\u008a\u0099>ô(\u0098FÞÈ^Ä\u0001\u0080^|Å?\u0002\u0006¶w·TÐfx\u009co\u009f\u0015)Û\u0010Fì\u0010A?¼8ò\u0012\u0016ò\u0097 a\u008d\u0094]y\th\u0003ßç*UÕ\u0082`xÞ\u00929\u0092Oõ+}Íje\u0085óy\u0093\u0000(\u009e\u0007_§\"/~E\u0090|ë|©)ËàQé~\u008cC(o÷ÑÀ\u009f\u0013X\u0089þ\b_çß{¬\u009eR¯XF$'R2SM%A\u001cq]ø(âÝ®f\u0019¯\u001fæüô\u0093\u00937Ãv\u0018\u008cÙzõ/ÑAþ¢|\u0087`Å\"r¡©\u008b\u00ad\u0089\u0016\u009c\u009e\u0004«\u0012Óp\u0089+gõú«I}Ë2$\u0080\bj¸7µ¼¦ñ\u00153\fÆXEn\u001fT \u0010è\f`þ\u008a\u0012¦U\u008eÅz\u009f©zÃ\u0001\u0018\u001fáÞðôêð§Ë\u0093¦Å¸vh×\u0085¡Z\u0002ºÅ\u009b\u0015X\u00887;\u008aå´\u0001n,\u007f\u009fbT\\Ðp\"\u001f\u009b»L¬æ½\u00adI2\u0013Ý@vÏðíù\u001bmÓxÔè\u0003¢è´#\u00ad8ÆÑ\u0082ñ\u0099\u0092\rÎÓ\u001bøw\u0087\u0003Å>r£\u008a\rü7\u0089Äc$~¡\u0085uzÙå=\u0095éoíæw \u0085A;A\u001cv\u0014x\u008b\u0081G\u0001mä\u0013\u001c1·\u00ad}ë\u0096mîÒávÐ±\u009a1±@\u0099ÈF\u0081T\u000fÉ%Ô=oC%Ò\u001d\u009cl\u0095\u00065\u0003éF\u008e\u0005!öH`ÚòÆØ\u001fìg1Þ\u0014\u0017Új9¿pK°\u00ad\u0091\u0096'~)µÁ\u009f\u007f\u0099Q1Ì9\u0085\u008e\u0010LD\u001b\u0015\u007f@§3¨f\u007fÐfcg\u0090HY ¤vUð;,} lÇ/KqE¯\u0083\u0013õH`!þØYtíHæ\u00029µX\u008e&»¾ÒiÃò\u0090[\u0001×¦ãËë\u0016Ø\u001fïk\u001fxJÒ\u0090l4`.\u008dKl{\u0006Q÷\""
         .length();
      char var21 = 16;
      int var28 = -1;

      label56:
      while (true) {
         String var29 = var22.substring(++var28, var28 + var21);
         int var10001 = -1;

         while (true) {
            byte[] var26 = var18.doFinal(var29.getBytes("ISO-8859-1"));
            String var42 = d(var26).intern();
            switch (var10001) {
               case 0:
                  var25[var23++] = var42;
                  if ((var28 += var21) >= var24) {
                     g = var25;
                     h = new String[15];
                     short var31 = 6867;
                     long var37 = 680935480088316400L ^ var16;
                     bxf = "https://api.plancke.io/hypixel/v1/punishmentStats";
                     r = new HashMap(13);
                     Cipher var5;
                     var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var6 = 1; var6 < 8; var6++) {
                        var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[2];
                     int var8 = 0;
                     String var9 = "\rG\u000bFjWqÁ2Û\u0084úØj\u0094[";
                     int var10 = "\rG\u000bFjWqÁ2Û\u0084úØj\u0094[".length();
                     byte var7 = 0;

                     do {
                        var10001 = var7;
                        var7 += 8;
                        byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                        var10001 = var8++;
                        long var13 = (var12[0] & 255L) << 56
                           | (var12[1] & 255L) << 48
                           | (var12[2] & 255L) << 40
                           | (var12[3] & 255L) << 32
                           | (var12[4] & 255L) << 24
                           | (var12[5] & 255L) << 16
                           | (var12[6] & 255L) << 8
                           | var12[7] & 255L;
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
                        long var10004 = (var15[0] & 255L) << 56
                           | (var15[1] & 255L) << 48
                           | (var15[2] & 255L) << 40
                           | (var15[3] & 255L) << 32
                           | (var15[4] & 255L) << 24
                           | (var15[5] & 255L) << 16
                           | (var15[6] & 255L) << 8
                           | var15[7] & 255L;
                        byte var49 = -1;
                        var11[var10001] = var10004;
                     } while (var7 < var10);

                     p = var11;
                     q = new Integer[2];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 6942310808842366615L;
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
                     long var47 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     byte var40 = -1;
                     v = var47;
                     return;
                  }

                  var21 = var22.charAt(var28);
                  break;
               default:
                  var25[var23++] = var42;
                  if ((var28 += var21) < var24) {
                     var21 = var22.charAt(var28);
                     continue label56;
                  }

                  var22 = "¡ÙÀ Ü!$ÄùÈÉ\u001a\fUðÆÿ£¬%V,CB_qaV\u0091â¹%\u0010.\u0013×1B½\u008d/\u009c\u0092 \u0093Ó2Ï\u0000";
                  var24 = "¡ÙÀ Ü!$ÄùÈÉ\u001a\fUðÆÿ£¬%V,CB_qaV\u0091â¹%\u0010.\u0013×1B½\u008d/\u009c\u0092 \u0093Ó2Ï\u0000".length();
                  var21 = ' ';
                  var28 = -1;
            }

            var29 = var22.substring(++var28, var28 + var21);
            var10001 = 0;
         }
      }
   }

   private static String d(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31978;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/fno", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("cc/astralis/fno" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24425;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/fno", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
   }

   private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/fno" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
