package cc.astralis;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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

public class hbo implements ago {
   private String gtr;
   private String emq;
   private long fzx;
   private JsonObject exe;
   private int djp;
   private bvc fun;
   private static int[] ghe;
   private static final String[] a;
   private static final long b = 124159745746027L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;
   private static final long[] f;
   private static final Long[] g;
   private static final Map h;

   public hbo(String name, String description, int userUid, String userName, JsonObject configData) {
      a.gtr = a;
      a.emq = a;
      a.exe = a;
      a.fzx = System.currentTimeMillis();
      a.fun = new dtk(a, a);
      a.djp = (a + a + a + a.fzx).hashCode();
   }

   public hbo(String name, String description, int userUid, String userName, long uploadDate, JsonObject configData, int configId) {
      a.gtr = a;
      a.emq = a;
      a.fzx = a;
      a.exe = a;
      a.djp = a;
      a.fun = new dtk(a, a);
   }

   @Override
   public JsonObject dpp() {
      long a = b ^ 133664549034906L;
      short var10000 = 17879;
      long var10001 = 4231808444612171347L ^ a;
      long ax = 40343903085086L;
      int[] var9 = dar.abu();
      int[] var11 = gfb();
      JsonObject axx = new JsonObject();
      int[] axxx = var11;
      String[] var8 = hbo.a;
      short var10003 = 2131;
      long var10004 = 947603908344708799L ^ a;
      axx.addProperty(var8[12], a.gtr);
      axx.addProperty(var8[3], a.emq);
      var10003 = 27368;
      var10004 = 204769060249377798L ^ a;
      axx.addProperty(var8[9], a.fun.cfs());
      int[] axxxx = var9;
      short var10002 = 4740;
      long var15 = 1473157769758925935L ^ a;
      axx.addProperty(var8[7], a.fun.eus());
      var10002 = 5189;
      long var16 = 5336278411202814636L ^ a;
      axx.addProperty(var8[10], a.fzx);
      axx.addProperty(var8[4], a.djp);
      JsonObject var10 = axx;
      String[] var12 = var8;
      if (axxxx != null) {
         axx.add(var8[5], a.exe);
         var10 = axx;
         if (axxx == null) {
            return axx;
         }

         var12 = new String[2];
      }

      cdr.apm(var12);
      return var10;
   }

   public static hbo bdi(JsonObject obj) {
      long ax;
      Object axx;
      label67: {
         ax = b ^ 71618489369922L;
         int[] var10000 = dar.abu();
         short var10001 = 21312;
         long var10002 = 5570404258585599517L ^ ax;
         long axxx = 107215070774941L;
         int[] axxxx = var10000;
         var10000 = gfb();
         axx = new JsonObject();
         int[] axxxxx = var10000;
         JsonObject var14 = a;
         String[] var10 = hbo.a;
         String var18 = var10[0];
         if (axxxx != null) {
            if (!a.has(var18)) {
               break label67;
            }

            var14 = a;
            var18 = var10[0];
         }

         JsonElement axxxxxx = var14.get(var18);
         boolean var15 = axxxxxx.isJsonObject();
         if (axxxx != null) {
            label56: {
               if (var15) {
                  var16 = axxxxxx.getAsJsonObject();
                  if (axxxx == null) {
                     break label56;
                  }

                  axx = var16;
                  if (axxxxx == null) {
                     break label67;
                  }
               }

               var16 = axxxxxx;
            }

            var15 = var16.isJsonPrimitive();
         }

         if (var15 && axxxxxx.getAsJsonPrimitive().isString()) {
            try {
               axx = JsonParser.parseString(axxxxxx.getAsString()).getAsJsonObject();
            } catch (Exception var11) {
               axx = new JsonObject();
            }
         }
      }

      hbo var17 = new hbo;
      int var10004 = 28691;
      long var10005 = 1002758090568407080L ^ ax;
      String var19 = a.get(hbo.a[6]).getAsString();
      String var10003 = a.has(hbo.a[2]) ? a.get(hbo.a[2]).getAsString() : "";
      String[] var12 = hbo.a;
      short var10006 = 17215;
      long var10007 = 8227478947638455058L ^ ax;
      var10004 = a.get(var12[11]).getAsInt();
      String var21 = a.get(var12[1]).getAsString();
      int var10008 = 2757;
      long var10009 = 1387088706498290413L ^ ax;
      long var22 = a.get(var12[13]).getAsLong();
      short var10010 = 10511;
      long var10011 = 8540865520194502968L ^ ax;
      if (a.has(var12[8])) {
         var10010 = 23765;
         var10011 = 2316025335216747749L ^ ax;
         var10008 = a.get(var12[8]).getAsInt();
      } else {
         var10008 = -1;
      }

      var17./* $VF: Unable to resugar constructor */<init>(var19, var10003, var10004, var21, var22, (JsonObject)axx, var10008);
      if (cdr.haa() == null) {
         aui(new int[4]);
      }

      return var17;
   }

   @Override
   public String amx() {
      return a.gtr;
   }

   @Override
   public String chb() {
      return a.emq;
   }

   @Override
   public long bsl() {
      return a.fzx;
   }

   @Override
   public JsonObject dvu() {
      return a.exe;
   }

   @Override
   public int cna() {
      return a.djp;
   }

   @Override
   public bvc ayq() {
      return a.fun;
   }

   @Override
   public void bn(String name) {
      a.gtr = a;
   }

   @Override
   public void dnv(String description) {
      a.emq = a;
   }

   @Override
   public void ewm(long uploadDate) {
      a.fzx = a;
   }

   @Override
   public void bq(JsonObject configData) {
      a.exe = a;
   }

   public void god(int configId) {
      a.djp = a;
   }

   public void grt(bvc user) {
      a.fun = a;
   }

   public static void aui(int[] var0) {
      ghe = var0;
   }

   public static int[] gfb() {
      return ghe;
   }

   static {
      long var31 = b ^ 13848085896356L;
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
      String var27 = "Õ\u000b:MØÛ\u000f¼+½\u0006Ô\u0018~Ã£·Üï\u001cvQ\u008c÷\u0082\u008ek¨8\u0099\u008a\u0089¢_KWÙCå:T\u0081\nf\u0010\u0000½Pûî«\u001dô·\u009dÑ\u0090>%_©\u00ad\u0095¹\u0004N,\u008e©\u008c\u0018~\u0017M£\u00133ëja\u0097¢\u0015\u009f¡Sf>÷\u009f'ë§-Ó-Î\u008dM\\\u0019\u008cÆ;Â.¯\u0014\\êÙAû|ñF\u0018Iã+\u0010MÔÜ¦6ÖKÐ\u0010g/÷Ó)p¸";
      int var29 = "Õ\u000b:MØÛ\u000f¼+½\u0006Ô\u0018~Ã£·Üï\u001cvQ\u008c÷\u0082\u008ek¨8\u0099\u008a\u0089¢_KWÙCå:T\u0081\nf\u0010\u0000½Pûî«\u001dô·\u009dÑ\u0090>%_©\u00ad\u0095¹\u0004N,\u008e©\u008c\u0018~\u0017M£\u00133ëja\u0097¢\u0015\u009f¡Sf>÷\u009f'ë§-Ó-Î\u008dM\\\u0019\u008cÆ;Â.¯\u0014\\êÙAû|ñF\u0018Iã+\u0010MÔÜ¦6ÖKÐ\u0010g/÷Ó)p¸"
         .length();
      char var26 = 'x';
      int var25 = -1;

      while (true) {
         byte[] var30 = var23.doFinal(var27.substring(++var25, var25 + var26).getBytes("ISO-8859-1"));
         String var63 = a(var30).intern();
         int var10001 = -1;
         var22[var28++] = var63;
         if ((var25 += var26) >= var29) {
            e = new HashMap(13);
            Cipher var11;
            var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var12 = 1; var12 < 8; var12++) {
               var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var17 = new long[22];
            int var14 = 0;
            String var15 = ",\u0096!\u0083j1\u001cß\u0013áþcX^½ËV\u00ad\u0085¦ó,ôÌ(\u008eHÏUimú.ÃDy\u008cÎ§Ò³ý«\u0090\u0005\u008cU\u0083:#8¼Zý,n?\u0010-¹Ú\u0003:h\n|\u0098äÛ>S \u009c×\"ø¾yTsqm8¬ÊIÖ`÷\u001aråÞFÅ\u009añÈF\u009c\u0089\u0011eTNP\u009d}\u0085|óUÜ4\u0097\u009a\u0012 µ\br\u0080\u0082b\u008eI5Üâ\u0019\u0014!sÅT\t\u0012\u0019wªF\u0099ü\u0080\rw:'\u00920\u0006*ÉN\u0014ýÃ¶\u009eæ";
            int var16 = ",\u0096!\u0083j1\u001cß\u0013áþcX^½ËV\u00ad\u0085¦ó,ôÌ(\u008eHÏUimú.ÃDy\u008cÎ§Ò³ý«\u0090\u0005\u008cU\u0083:#8¼Zý,n?\u0010-¹Ú\u0003:h\n|\u0098äÛ>S \u009c×\"ø¾yTsqm8¬ÊIÖ`÷\u001aråÞFÅ\u009añÈF\u009c\u0089\u0011eTNP\u009d}\u0085|óUÜ4\u0097\u009a\u0012 µ\br\u0080\u0082b\u008eI5Üâ\u0019\u0014!sÅT\t\u0012\u0019wªF\u0099ü\u0080\rw:'\u00920\u0006*ÉN\u0014ýÃ¶\u009eæ"
               .length();
            byte var13 = 0;

            label73:
            while (true) {
               var10001 = var13;
               var13 += 8;
               byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
               long[] var44 = var17;
               var10001 = var14++;
               long var66 = (var18[0] & 255L) << 56
                  | (var18[1] & 255L) << 48
                  | (var18[2] & 255L) << 40
                  | (var18[3] & 255L) << 32
                  | (var18[4] & 255L) << 24
                  | (var18[5] & 255L) << 16
                  | (var18[6] & 255L) << 8
                  | var18[7] & 255L;
               byte var73 = -1;

               while (true) {
                  long var19 = var66;
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
                  long var77 = (var21[0] & 255L) << 56
                     | (var21[1] & 255L) << 48
                     | (var21[2] & 255L) << 40
                     | (var21[3] & 255L) << 32
                     | (var21[4] & 255L) << 24
                     | (var21[5] & 255L) << 16
                     | (var21[6] & 255L) << 8
                     | var21[7] & 255L;
                  switch (var73) {
                     case 0:
                        var44[var10001] = var77;
                        if (var13 >= var16) {
                           c = var17;
                           d = new Integer[22];
                           h = new HashMap(13);
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
                           String var4 = "x\u0005\u009fk¦~4È5ý\u0089\b\u008b°\u0094®";
                           int var5 = "x\u0005\u009fk¦~4È5ý\u0089\b\u008b°\u0094®".length();
                           byte var2 = 0;

                           do {
                              int var56 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var56, var2).getBytes("ISO-8859-1");
                              var56 = var3++;
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
                              var77 = (var10[0] & 255L) << 56
                                 | (var10[1] & 255L) << 48
                                 | (var10[2] & 255L) << 40
                                 | (var10[3] & 255L) << 32
                                 | (var10[4] & 255L) << 24
                                 | (var10[5] & 255L) << 16
                                 | (var10[6] & 255L) << 8
                                 | var10[7] & 255L;
                              byte var76 = -1;
                              var6[var56] = var77;
                           } while (var2 < var5);

                           f = var6;
                           g = new Long[2];
                           short var46 = 21276;
                           long var58 = 7131078218415366870L ^ var31;
                           String[] var38 = new String[14];
                           short var47 = 32740;
                           int var36 = 0;
                           aui(null);
                           long var59 = 8084038930845093421L ^ var31;
                           String var35;
                           int var37 = (var35 = var22[0]).length();
                           char var34 = '\n';
                           int var42 = -1;

                           label52:
                           while (true) {
                              short var48 = 9581;
                              long var60 = 4723721711661618357L ^ var31;
                              byte var49 = 27;
                              String var61 = var35.substring(++var42, var42 + var34);
                              byte var69 = -1;

                              while (true) {
                                 String var50 = a(var49, a(var61));
                                 switch (var69) {
                                    case 0:
                                       var38[var36++] = var50;
                                       if ((var42 += var34) >= var37) {
                                          a = var38;
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
                                       var34 = 4;
                                       var42 = -1;
                                 }

                                 short var51 = 22254;
                                 long var62 = 1289457728986113842L ^ var31;
                                 var49 = 124;
                                 var61 = var35.substring(++var42, var42 + var34);
                                 var69 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var44[var10001] = var77;
                        if (var13 < var16) {
                           continue label73;
                        }

                        var15 = "jEu>Ô÷9bt\u00151=±÷Ìu";
                        var16 = "jEu>Ô÷9bt\u00151=±÷Ìu".length();
                        var13 = 0;
                  }

                  byte var55 = var13;
                  var13 += 8;
                  var18 = var15.substring(var55, var13).getBytes("ISO-8859-1");
                  var44 = var17;
                  var10001 = var14++;
                  var66 = (var18[0] & 255L) << 56
                     | (var18[1] & 255L) << 48
                     | (var18[2] & 255L) << 40
                     | (var18[3] & 255L) << 32
                     | (var18[4] & 255L) << 24
                     | (var18[5] & 255L) << 16
                     | (var18[6] & 255L) << 8
                     | var18[7] & 255L;
                  var73 = 0;
               }
            }
         }

         var26 = var27.charAt(var25);
      }
   }

   private static char[] a(String var0) {
      long var1 = b ^ 84892593056877L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 17987;
         long var10005 = 7427963694540523348L ^ var1;
         var10000[0] = (char)(var10003 ^ 'K');
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 55158575537826L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 1080;
         long var10009 = 1211827958379984868L ^ var2;
         byte var10;
         switch (var4 % 7) {
            case 0:
               var10 = 13145;
               long var23 = 2167527503867936919L ^ var2;
               var10 = 120;
               break;
            case 1:
               var10 = 14018;
               long var22 = 3569790838778365213L ^ var2;
               var10 = 84;
               break;
            case 2:
               var10 = 2351;
               long var21 = 825670173231758066L ^ var2;
               var10 = 121;
               break;
            case 3:
               var10 = 2135;
               long var20 = 810477674781686661L ^ var2;
               var10 = 42;
               break;
            case 4:
               var10 = 28875;
               long var19 = 497867256335123202L ^ var2;
               var10 = 101;
               break;
            case 5:
               var10 = 17654;
               long var18 = 1434292684646709027L ^ var2;
               var10 = 34;
               break;
            default:
               var10 = 23688;
               long var17 = 3733088916422258513L ^ var2;
               var10 = 75;
         }

         var10001[var4] = (char)(var10005 ^ var10002 ^ var10);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18708;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/hbo", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
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
         throw new RuntimeException("cc/astralis/hbo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11381;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/hbo", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("cc/astralis/hbo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
