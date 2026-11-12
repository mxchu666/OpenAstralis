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

public class hhm extends brc {
   private ago fxt;
   private static String[] bzn;
   private static final String[] c;
   private static final long b = 35443067040940L;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;
   private static final long m;

   public hhm() {
      long a = b ^ 101514945219836L;
      short var10001 = 19539;
      long var10002 = 1317063441052354666L ^ a;
      super(11);
   }

   public hhm(ago cloudConfig) {
      long ax = b ^ 45273524609001L;
      short var10001 = 2540;
      long var10002 = 3461204636810632917L ^ ax;
      super(11);
      a.fxt = a;
   }

   @Override
   public void etg(JsonObject json) {
      a.cps(a);
      a.fxt = hbo.bdi(a);
   }

   @Override
   public String cql() {
      long a = b ^ 39217580348302L;
      int[] var10000 = dar.abu();
      long ax = m;
      int[] axx = var10000;
      JsonObject axxx = a.fdo();
      var10000 = fxc.gty();
      short var10003 = 28334;
      long var10004 = 5864924312071681504L ^ a;
      Object[] var12 = new Object[14];
      String[] var8 = c;
      var12[0] = var8[0];
      var12[1] = a.fxt.amx();
      var12[2] = var8[2];
      var12[3] = a.fxt.chb();
      var12[4] = var8[4];
      var12[5] = a.fxt.ayq().cfs();
      short var10005 = 28219;
      long var10006 = 6153832401776850279L ^ a;
      var12[6] = var8[3];
      var10005 = 18331;
      var10006 = 7652797158611590359L ^ a;
      var12[7] = a.fxt.ayq().eus();
      var10005 = 23536;
      var10006 = 1269474455927750838L ^ a;
      short var10007 = 22477;
      long var10008 = 978421058410318988L ^ a;
      var12[8] = var8[6];
      var10005 = 17605;
      var10006 = 1459668393748471710L ^ a;
      var12[9] = a.fxt.bsl();
      var10005 = 7495;
      var10006 = 1657667260348417540L ^ a;
      var12[10] = var8[5];
      var10005 = 2540;
      var10006 = 3461194165908427442L ^ a;
      var12[11] = a.fxt.cna();
      var10005 = 5986;
      var10006 = 1062228305958390842L ^ a;
      var10007 = 30302;
      var10008 = 777112952374996241L ^ a;
      var12[12] = var8[8];
      var10005 = 7085;
      var10006 = 5751501757916594418L ^ a;
      var12[13] = a.fxt.dvu().toString();
      a.eqw(axxx, var12);
      int[] axxxx = var10000;
      String var10 = axxx.toString();
      String[] var10001 = var8;
      if (axx != null) {
         byte[] var11 = cni.fsi(var8[1]);
         var10003 = 18331;
         var10004 = 7652797158611590359L ^ a;
         var10 = fz.dvr(var10, var11, cni.fsi(var8[7]));
         if (axxxx == null) {
            return var10;
         }

         var10001 = new String[4];
      }

      cdr.apm(var10001);
      return var10;
   }

   public ago eqn() {
      return a.fxt;
   }

   public static void feb(String[] var0) {
      bzn = var0;
   }

   public static String[] btp() {
      return bzn;
   }

   static {
      long var25 = b ^ 8622372509394L;
      Cipher var17;
      Cipher var10000 = var17 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var18 = 1; var18 < 8; var18++) {
         var10003[var18] = (byte)(var25 << var18 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var16 = new String[2];
      int var22 = 0;
      String var21 = "3\u0099\u00944\u000f\u0018\u0091VÄ\u0088JâA¼>\u0081\u008dëßG\u0099\u0088\u0013\r\u0001\u0088\u009a\u000b¤b\u0093|\u0096ÉZ\u0001\u0089ÀÊ\u0005O\u0094&\u0089MÁH-\u008b#)î/ÝRÙP\u0094;'\u0081\u0099{KÙmeÔ|pM\fõM\u0089Á,Q^\u0006g¹\u00074\u001bÆ¨¡\u0093Óñ\u007f\b\u000b\"úF¦Jù\u00104ê \u0084¹\u0083qt§Û\u0088hMjôõw\u000bû\u0097A\u008c8p¤\u0086VRâ^/uC{bGò±ë/\u0099\u00ad'ÀÕ\u0092º¤©\u0011\u0099ÇÎª$6GRæ\u0002Û&O\u0085\u009aníý¼Åß\u0085\u001bã^®TòJç\u0010PèÖpäø\u0085\u0086§²pEÝU\u001eÀp6\u0090k \u0086i\u0006\u0081\u009c\u009a,\u0082è¹\u0011¬êß";
      int var23 = "3\u0099\u00944\u000f\u0018\u0091VÄ\u0088JâA¼>\u0081\u008dëßG\u0099\u0088\u0013\r\u0001\u0088\u009a\u000b¤b\u0093|\u0096ÉZ\u0001\u0089ÀÊ\u0005O\u0094&\u0089MÁH-\u008b#)î/ÝRÙP\u0094;'\u0081\u0099{KÙmeÔ|pM\fõM\u0089Á,Q^\u0006g¹\u00074\u001bÆ¨¡\u0093Óñ\u007f\b\u000b\"úF¦Jù\u00104ê \u0084¹\u0083qt§Û\u0088hMjôõw\u000bû\u0097A\u008c8p¤\u0086VRâ^/uC{bGò±ë/\u0099\u00ad'ÀÕ\u0092º¤©\u0011\u0099ÇÎª$6GRæ\u0002Û&O\u0085\u009aníý¼Åß\u0085\u001bã^®TòJç\u0010PèÖpäø\u0085\u0086§²pEÝU\u001eÀp6\u0090k \u0086i\u0006\u0081\u009c\u009a,\u0082è¹\u0011¬êß"
         .length();
      char var20 = 'p';
      int var19 = -1;

      while (true) {
         byte[] var24 = var17.doFinal(var21.substring(++var19, var19 + var20).getBytes("ISO-8859-1"));
         String var56 = b(var24).intern();
         int var10001 = -1;
         var16[var22++] = var56;
         if ((var19 += var20) >= var23) {
            i = new HashMap(13);
            Cipher var5;
            var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var6 = 1; var6 < 8; var6++) {
               var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var11 = new long[24];
            int var8 = 0;
            String var9 = "\u0015\u008b\\õÍT\u009fóÃýË\u001f\u0082Úñ4\u0014BøLdÒï_S-¶\u009bpÄ¡åÆÔ¸\u008a¸¸iTOT[\u0091z´\u0085ÎÔ*\t\u0083Ëð<_\u00ad\u0004Â#yÏv<ÊW\u001dh\u0002â\u0017AÄFVÍ%ÈÕ\\6UÖ¿¼½¯år\u0096Öã¹\u0018½ÌkÄ\u001f}U+\nLÃ\u0091²F\u0006¡ªKÆ£\u0088{Cp¥»\u00adèõ>\u0082]Ä\u008f\u00adM\u0012Ë\u009fÔy¿\u000bS\"\u0094²\u0015<\\\u0014Biy\u0095W\u0013p\u0011\u008e\u0011h\u0012~/\u0089ß\u00adÂ{\u0014î\u0093åg\u0084Ðì\u0086\u008e\u008f\u0088";
            int var10 = "\u0015\u008b\\õÍT\u009fóÃýË\u001f\u0082Úñ4\u0014BøLdÒï_S-¶\u009bpÄ¡åÆÔ¸\u008a¸¸iTOT[\u0091z´\u0085ÎÔ*\t\u0083Ëð<_\u00ad\u0004Â#yÏv<ÊW\u001dh\u0002â\u0017AÄFVÍ%ÈÕ\\6UÖ¿¼½¯år\u0096Öã¹\u0018½ÌkÄ\u001f}U+\nLÃ\u0091²F\u0006¡ªKÆ£\u0088{Cp¥»\u00adèõ>\u0082]Ä\u008f\u00adM\u0012Ë\u009fÔy¿\u000bS\"\u0094²\u0015<\\\u0014Biy\u0095W\u0013p\u0011\u008e\u0011h\u0012~/\u0089ß\u00adÂ{\u0014î\u0093åg\u0084Ðì\u0086\u008e\u008f\u0088"
               .length();
            byte var7 = 0;

            label66:
            while (true) {
               var10001 = var7;
               var7 += 8;
               byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
               long[] var38 = var11;
               var10001 = var8++;
               long var59 = (var12[0] & 255L) << 56
                  | (var12[1] & 255L) << 48
                  | (var12[2] & 255L) << 40
                  | (var12[3] & 255L) << 32
                  | (var12[4] & 255L) << 24
                  | (var12[5] & 255L) << 16
                  | (var12[6] & 255L) << 8
                  | var12[7] & 255L;
               byte var67 = -1;

               while (true) {
                  long var13 = var59;
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
                  long var70 = (var15[0] & 255L) << 56
                     | (var15[1] & 255L) << 48
                     | (var15[2] & 255L) << 40
                     | (var15[3] & 255L) << 32
                     | (var15[4] & 255L) << 24
                     | (var15[5] & 255L) << 16
                     | (var15[6] & 255L) << 8
                     | var15[7] & 255L;
                  switch (var67) {
                     case 0:
                        var38[var10001] = var70;
                        if (var7 >= var10) {
                           g = var11;
                           h = new Integer[24];
                           Cipher var0;
                           var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                           var10002 = SecretKeyFactory.getInstance("DES");
                           var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var1 = 1; var1 < 8; var1++) {
                              var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           long var2 = 6937483341130420316L;
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
                           long var62 = (var4[0] & 255L) << 56
                              | (var4[1] & 255L) << 48
                              | (var4[2] & 255L) << 40
                              | (var4[3] & 255L) << 32
                              | (var4[4] & 255L) << 24
                              | (var4[5] & 255L) << 16
                              | (var4[6] & 255L) << 8
                              | var4[7] & 255L;
                           byte var50 = -1;
                           m = var62;
                           short var40 = 24194;
                           long var51 = 3869172886596370590L ^ var25;
                           String[] var32 = new String[9];
                           int var30 = 0;
                           String var29;
                           int var31 = (var29 = var16[1]).length();
                           char var28 = 4;
                           feb(null);
                           int var36 = -1;

                           label50:
                           while (true) {
                              short var41 = 3093;
                              long var52 = 5019591219822793216L ^ var25;
                              byte var42 = 125;
                              String var53 = var29.substring(++var36, var36 + var28);
                              byte var63 = -1;

                              while (true) {
                                 String var43 = b(var42, b(var53));
                                 switch (var63) {
                                    case 0:
                                       var32[var30++] = var43;
                                       if ((var36 += var28) >= var31) {
                                          c = var32;
                                          return;
                                       }

                                       var28 = var29.charAt(var36);
                                       break;
                                    default:
                                       var32[var30++] = var43;
                                       if ((var36 += var28) < var31) {
                                          var28 = var29.charAt(var36);
                                          continue label50;
                                       }

                                       var31 = (var29 = var16[0]).length();
                                       short var44 = 18371;
                                       long var54 = 720896131896039874L ^ var25;
                                       var28 = '`';
                                       var36 = -1;
                                 }

                                 short var45 = 7938;
                                 long var55 = 703046185069084935L ^ var25;
                                 var42 = 82;
                                 var53 = var29.substring(++var36, var36 + var28);
                                 var63 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var38[var10001] = var70;
                        if (var7 < var10) {
                           continue label66;
                        }

                        var9 = "&{\nV¬\u009e¸)\u009bãëµ\u0013);Æ";
                        var10 = "&{\nV¬\u009e¸)\u009bãëµ\u0013);Æ".length();
                        var7 = 0;
                  }

                  byte var49 = var7;
                  var7 += 8;
                  var12 = var9.substring(var49, var7).getBytes("ISO-8859-1");
                  var38 = var11;
                  var10001 = var8++;
                  var59 = (var12[0] & 255L) << 56
                     | (var12[1] & 255L) << 48
                     | (var12[2] & 255L) << 40
                     | (var12[3] & 255L) << 32
                     | (var12[4] & 255L) << 24
                     | (var12[5] & 255L) << 16
                     | (var12[6] & 255L) << 8
                     | var12[7] & 255L;
                  var67 = 0;
               }
            }
         }

         var20 = var21.charAt(var19);
      }
   }

   private static char[] b(String var0) {
      long var1 = b ^ 109301114022425L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 1352;
         long var10005 = 3758113059531057048L ^ var1;
         var10000[0] = (char)(var10003 ^ ',');
      }

      return var10000;
   }

   private static String b(int var0, char[] var1) {
      long var2 = b ^ 94206035305220L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 6985;
         long var10009 = 2321050720990818457L ^ var2;
         var10001[var4] = (char)(var10005 ^ var10002 ^ switch (var4 % 7) {
            case 0 -> {
               short var15 = 13947;
               long var21 = 725997364666391996L ^ var2;
               yield 106;
            }
            case 1 -> {
               short var14 = 20313;
               long var20 = 6525462161704395929L ^ var2;
               yield 95;
            }
            case 2 -> {
               short var13 = 2110;
               long var19 = 554854143618671601L ^ var2;
               yield 105;
            }
            case 3 -> {
               short var12 = 10441;
               long var18 = 326571531759993601L ^ var2;
               yield 110;
            }
            case 4 -> 2;
            case 5 -> {
               short var11 = 24082;
               long var17 = 4597877569967338972L ^ var2;
               yield 48;
            }
            default -> {
               short var10007 = 10672;
               long var16 = 2720342697306505842L ^ var2;
               yield 44;
            }
         });
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31855;
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
            throw new RuntimeException("cc/astralis/hhm", var14);
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
         throw new RuntimeException("cc/astralis/hhm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
