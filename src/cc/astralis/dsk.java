package cc.astralis;

import com.google.gson.JsonObject;
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

public class dsk extends brc {
   private long dfy;
   private long exy;
   private String hfi;
   private static String dzt;
   private static final String[] b;
   private static final long c = 84420642998573L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] m;
   private static final Integer[] n;
   private static final Map o;
   private static final long s;

   public dsk() {
      super(2);
   }

   public dsk(String sessionToken) {
      super(2);
      a.hfi = a;
   }

   @Override
   public void etg(JsonObject jsonObject) {
      a.cps(a);
      String[] var2 = b;
      a.exy = a.get(var2[5]).getAsLong();
      a.dfy = System.currentTimeMillis();
      a.hfi = a.get(var2[3]).getAsString();
   }

   @Override
   public String cql() {
      long a = c ^ 87207178776079L;
      long ax = s;
      int[] var10000 = dar.abu();
      dve.bvt();
      JsonObject axx = a.fdo();
      int[] axxx = var10000;
      Object[] var10002 = new Object[4];
      String[] var8 = b;
      var10002[0] = var8[1];
      var10002[1] = System.currentTimeMillis();
      var10002[2] = var8[0];
      String var10005 = a.hfi;
      if (axxx != null) {
         var10005 = a.hfi != null ? a.hfi : "";
      }

      var10002[3] = var10005;
      a.eqw(axx, var10002);
      String var10 = axx.toString();
      var8 = b;
      String var10001 = var8[4];
      if (axxx != null) {
         var10 = fz.dvr(var10, cni.fsi(var10001), cni.fsi(var8[2]));
         if (cdr.haa() != null) {
            return var10;
         }

         short var11 = 19508;
         long var12 = 5387999027866796797L ^ a;
         var10001 = "ijDdV";
      }

      dve.hby(var10001);
      return var10;
   }

   public long edq() {
      return a.dfy;
   }

   public long ehk() {
      return a.exy;
   }

   public String dat() {
      return a.hfi;
   }

   public static void bm(String var0) {
      dzt = var0;
   }

   public static String gih() {
      return dzt;
   }

   static {
      long var25 = c ^ 72247744368569L;
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var17 = 1; var17 < 8; var17++) {
         var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[4];
      int var21 = 0;
      String var20 = "\u009b^·.#6Ø\u0011i8\u0013\u0007'<¨\u001f\u0010º\u0012\u0094¨näÚÚA7dW\u008aÐ|é";
      int var22 = "\u009b^·.#6Ø\u0011i8\u0013\u0007'<¨\u001f\u0010º\u0012\u0094¨näÚÚA7dW\u008aÐ|é".length();
      char var19 = 16;
      int var35 = -1;

      label88:
      while (true) {
         String var38 = var20.substring(++var35, var35 + var19);
         int var10001 = -1;

         while (true) {
            byte[] var24 = var16.doFinal(var38.getBytes("ISO-8859-1"));
            String var68 = b(var24).intern();
            switch (var10001) {
               case 0:
                  var23[var21++] = var68;
                  if ((var35 += var19) >= var22) {
                     g = var23;
                     h = new String[4];
                     o = new HashMap(13);
                     Cipher var5;
                     var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var6 = 1; var6 < 8; var6++) {
                        var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[13];
                     int var8 = 0;
                     String var9 = "\u000fÊ¼\u008d\u0094^Ñ\u0017\u00adôã\u0019\u0011\u0090\u009aL\u0090\u0018EIe5IV8KØC8\u0094\u0011LÒQ±mäØ\u001dü\u0006h\u0007\u0014þa\f¢g¬ VNï¿ýõ\u008d&ìy\u0090Ñ9q;î\u0012¬J\u008aá\u0007T\u0016ëµ¯:¢Lq°9rÌÝ\u0019";
                     int var10 = "\u000fÊ¼\u008d\u0094^Ñ\u0017\u00adôã\u0019\u0011\u0090\u009aL\u0090\u0018EIe5IV8KØC8\u0094\u0011LÒQ±mäØ\u001dü\u0006h\u0007\u0014þa\f¢g¬ VNï¿ýõ\u008d&ìy\u0090Ñ9q;î\u0012¬J\u008aá\u0007T\u0016ëµ¯:¢Lq°9rÌÝ\u0019"
                        .length();
                     byte var7 = 0;

                     label70:
                     while (true) {
                        var10001 = var7;
                        var7 += 8;
                        byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                        long[] var41 = var11;
                        var10001 = var8++;
                        long var72 = (var12[0] & 255L) << 56
                           | (var12[1] & 255L) << 48
                           | (var12[2] & 255L) << 40
                           | (var12[3] & 255L) << 32
                           | (var12[4] & 255L) << 24
                           | (var12[5] & 255L) << 16
                           | (var12[6] & 255L) << 8
                           | var12[7] & 255L;
                        byte var80 = -1;

                        while (true) {
                           long var13 = var72;
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
                           long var83 = (var15[0] & 255L) << 56
                              | (var15[1] & 255L) << 48
                              | (var15[2] & 255L) << 40
                              | (var15[3] & 255L) << 32
                              | (var15[4] & 255L) << 24
                              | (var15[5] & 255L) << 16
                              | (var15[6] & 255L) << 8
                              | var15[7] & 255L;
                           switch (var80) {
                              case 0:
                                 var41[var10001] = var83;
                                 if (var7 >= var10) {
                                    m = var11;
                                    n = new Integer[13];
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long var2 = 5131475804332185782L;
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
                                    long var75 = (var4[0] & 255L) << 56
                                       | (var4[1] & 255L) << 48
                                       | (var4[2] & 255L) << 40
                                       | (var4[3] & 255L) << 32
                                       | (var4[4] & 255L) << 24
                                       | (var4[5] & 255L) << 16
                                       | (var4[6] & 255L) << 8
                                       | var4[7] & 255L;
                                    byte var58 = -1;
                                    s = var75;
                                    short var43 = 8975;
                                    long var59 = 5804354244666499006L ^ var25;
                                    String[] var32 = new String[6];
                                    short var44 = 18896;
                                    long var60 = 2219711106811307694L ^ var25;
                                    int var30 = 0;
                                    bm("vS0wVb");
                                    short var45 = 24540;
                                    long var61 = 1555697115087646881L ^ var25;
                                    String var29 = "Rk6_3\bUa3N\t\u0000uC`wR\u0013l\u000e,JoR\bJ\u0017:)he<\u007f1?JcV\u001fi\bPLuA\u000fp\tY^rV\u0018R\u001f<(tM\fl\u0013 JcB\tk\b;LuB\u000b\u007f\f?VoV\u0019Yh?LNN\u000f\u000b9;Jsgnu\u001b/MtR9r\f<tcVm\u007f`\u0005Rk6_3";
                                    int var31 = "Rk6_3\bUa3N\t\u0000uC`wR\u0013l\u000e,JoR\bJ\u0017:)he<\u007f1?JcV\u001fi\bPLuA\u000fp\tY^rV\u0018R\u001f<(tM\fl\u0013 JcB\tk\b;LuB\u000b\u007f\f?VoV\u0019Yh?LNN\u000f\u000b9;Jsgnu\u001b/MtR9r\f<tcVm\u007f`\u0005Rk6_3"
                                       .length();
                                    char var28 = 5;
                                    int var37 = -1;

                                    label54:
                                    while (true) {
                                       short var46 = 9665;
                                       long var62 = 1173489918890350963L ^ var25;
                                       byte var47 = 9;
                                       String var63 = var29.substring(++var37, var37 + var28);
                                       byte var76 = -1;

                                       while (true) {
                                          String var48 = b(var47, b(var63));
                                          switch (var76) {
                                             case 0:
                                                var32[var30++] = var48;
                                                if ((var37 += var28) >= var31) {
                                                   b = var32;
                                                   return;
                                                }

                                                var28 = var29.charAt(var37);
                                                break;
                                             default:
                                                var32[var30++] = var48;
                                                if ((var37 += var28) < var31) {
                                                   var28 = var29.charAt(var37);
                                                   continue label54;
                                                }

                                                short var49 = 2357;
                                                long var64 = 2439905453357164105L ^ var25;
                                                var29 = "[\u001ep\u0000Up4\u0000\u0018}Hga\u0005\f|=\u001f%\u0012+\u0018\u0016~Hwj|9\u0005c\u0003Xaf*w'=F{<(r\b\u001e*x\u0005BK>\b";
                                                var31 = "[\u001ep\u0000Up4\u0000\u0018}Hga\u0005\f|=\u001f%\u0012+\u0018\u0016~Hwj|9\u0005c\u0003Xaf*w'=F{<(r\b\u001e*x\u0005BK>\b"
                                                   .length();
                                                short var50 = 1463;
                                                long var65 = 8067382785058519300L ^ var25;
                                                var28 = ',';
                                                var37 = -1;
                                          }

                                          short var51 = 13634;
                                          long var66 = 1389946495335139830L ^ var25;
                                          var47 = 66;
                                          var63 = var29.substring(++var37, var37 + var28);
                                          var76 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var41[var10001] = var83;
                                 if (var7 < var10) {
                                    continue label70;
                                 }

                                 var9 = "GY¹#²mr\u008bU\u0084m2rW\u0099@";
                                 var10 = "GY¹#²mr\u008bU\u0084m2rW\u0099@".length();
                                 var7 = 0;
                           }

                           byte var57 = var7;
                           var7 += 8;
                           var12 = var9.substring(var57, var7).getBytes("ISO-8859-1");
                           var41 = var11;
                           var10001 = var8++;
                           var72 = (var12[0] & 255L) << 56
                              | (var12[1] & 255L) << 48
                              | (var12[2] & 255L) << 40
                              | (var12[3] & 255L) << 32
                              | (var12[4] & 255L) << 24
                              | (var12[5] & 255L) << 16
                              | (var12[6] & 255L) << 8
                              | var12[7] & 255L;
                           var80 = 0;
                        }
                     }
                  }

                  var19 = var20.charAt(var35);
                  break;
               default:
                  var23[var21++] = var68;
                  if ((var35 += var19) < var22) {
                     var19 = var20.charAt(var35);
                     continue label88;
                  }

                  var20 = "§ÿ8\u0082º6\bBÜs\u0083¨\u009f9£\u008a\r\u008f*_ÝÙ\u001eV+_H´\u000bôQ¨¾öWI¸D/v\u00162yÄ\u008dÞö¾\u0086SO\u000e¥É\u00ad²#5\u001e\u000fJ\u0089\u0080ÿ@0Û\u008b\u0011\u001d\b\u0088Êâ\u009cB ¸ÅIgb¯-\u0088Vîèdt¹\u0092!cöù\u009a&TÞ\u008b\u0003àjÿ\u0089ª\u008c5P\u001e\u0082C\u0018êz\u008f\u000e¶Â£é\u0088ÄM5BK\u0089A|rÌ\u00ad\u009b\bt³\u00031\u008f µè&Þ\u0084±Y;qFµ´\u0012xßóy¥n\bhEº\rX\u0094z\u0003dÀ¦;\u0007Ö#e\u009f#VO\u0010\u000bX\u0084Õÿg+îã9¹ e\u000bO¤^³æôA#\u00176\u009bAÛ'LXâ\u0098\bñTèêª\u00166¢Ãt\u001ar0~\u0012\u0002G0év\u0012Ñø´\u0086Õí#èÖË\b\u0086ÁÐÕè\u0081\u0086[FvEWSYÈÓ¯d2y\u0082\txJ|";
                  var22 = "§ÿ8\u0082º6\bBÜs\u0083¨\u009f9£\u008a\r\u008f*_ÝÙ\u001eV+_H´\u000bôQ¨¾öWI¸D/v\u00162yÄ\u008dÞö¾\u0086SO\u000e¥É\u00ad²#5\u001e\u000fJ\u0089\u0080ÿ@0Û\u008b\u0011\u001d\b\u0088Êâ\u009cB ¸ÅIgb¯-\u0088Vîèdt¹\u0092!cöù\u009a&TÞ\u008b\u0003àjÿ\u0089ª\u008c5P\u001e\u0082C\u0018êz\u008f\u000e¶Â£é\u0088ÄM5BK\u0089A|rÌ\u00ad\u009b\bt³\u00031\u008f µè&Þ\u0084±Y;qFµ´\u0012xßóy¥n\bhEº\rX\u0094z\u0003dÀ¦;\u0007Ö#e\u009f#VO\u0010\u000bX\u0084Õÿg+îã9¹ e\u000bO¤^³æôA#\u00176\u009bAÛ'LXâ\u0098\bñTèêª\u00166¢Ãt\u001ar0~\u0012\u0002G0év\u0012Ñø´\u0086Õí#èÖË\b\u0086ÁÐÕè\u0081\u0086[FvEWSYÈÓ¯d2y\u0082\txJ|"
                     .length();
                  var19 = 184;
                  var35 = -1;
            }

            var38 = var20.substring(++var35, var35 + var19);
            var10001 = 0;
         }
      }
   }

   private static char[] b(String var0) {
      long var1 = c ^ 76647290765752L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 14974;
         long var10005 = 2436862952822769866L ^ var1;
         var10000[0] = (char)(var10003 ^ 17);
      }

      return var10000;
   }

   private static String b(int var0, char[] var1) {
      long var2 = c ^ 115426347321232L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 7631;
         long var10009 = 1811263173515880784L ^ var2;
         byte var10;
         switch (var4 % 7) {
            case 0:
               var10 = 16814;
               long var23 = 2134785050857403709L ^ var2;
               var10 = 47;
               break;
            case 1:
               var10 = 32261;
               long var22 = 6735919504840968849L ^ var2;
               var10 = 13;
               break;
            case 2:
               var10 = 25440;
               long var21 = 8651574883728611321L ^ var2;
               var10 = 84;
               break;
            case 3:
               var10 = 6388;
               long var20 = 3768405943617072226L ^ var2;
               var10 = 51;
               break;
            case 4:
               var10 = 234;
               long var19 = 4438453795649565821L ^ var2;
               var10 = 84;
               break;
            case 5:
               var10 = 6967;
               long var18 = 6032859657825202089L ^ var2;
               var10 = 96;
               break;
            default:
               var10 = 18563;
               long var17 = 3746814663919926294L ^ var2;
               var10 = 17;
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27115;
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
            throw new RuntimeException("cc/astralis/dsk", var10);
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
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
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
         throw new RuntimeException("cc/astralis/dsk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14882;
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
            throw new RuntimeException("cc/astralis/dsk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
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
         throw new RuntimeException("cc/astralis/dsk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
