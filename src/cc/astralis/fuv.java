package cc.astralis;

import com.sun.jna.platform.win32.Advapi32;
import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.Win32Exception;
import com.sun.jna.platform.win32.WinReg;
import com.sun.jna.platform.win32.WinReg.HKEYByReference;
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
import net.minecraft.class_5611;

public class fuv extends cdr implements dlc {
   public static final String arh;
   public static final String gah;
   public static chz eqf;
   private static final long a = 96468447915235L;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;
   private static final long i;

   public static void dfe(fll uifontrenderer, String text, float x, float y, Color firstColor, Color secondColor, boolean shadow) {
      fhp(a, a, a, a, 0.0F, a, a, a);
   }

   public static void fhp(fll uifontrenderer, String text, float x, float y, float spaceBetweenLetters, Color firstColor, Color secondColor, boolean shadow) {
      long ax = fuv.a ^ 114105052704049L;
      ezv axx = dar.gqy().aws().diy(ezv.class);
      int[] var10000 = dar.abu();
      String var13 = axx.eqi.dnp();
      int[] axxx = var10000;
      byte var14 = -1;
      int var15 = var13.hashCode();
      if (axxx != null) {
         switch (var15) {
            case -1656737386:
               short var10001 = 20122;
               long var10002 = 3460019570379604850L ^ ax;
               var15 = var13.equals("Rainbow");
               if (axxx == null) {
                  break;
               }

               if (var15 != 0) {
                  var14 = 0;
               }
            default:
               var15 = var14;
         }
      }
      Color axxxx = switch (var15) {
         case 0 -> ezv.gbq(i, (int)(a * 32.0F), 0.7F, 1.0F);
         default -> dec.fbp(new class_5611(a * 32.0F, 6.0F), a, a);
      };
      if (axxx != null) {
         if (a) {
            a.aof(a, a, a, axxxx);
         } else {
            a.dsq().gvv(a, a, a, true, axxxx);
         }
      }
   }

   public static boolean bfm(double mouseX, double mouseY, float x, float y, float width, float height) {
      long ax = fuv.a ^ 32453869936251L;
      int[] var10 = dar.abu();
      double var12;
      int var10000 = (var12 = a - a) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
      if (var10 != null) {
         if (var10000 < 0) {
            return false;
         }

         double var13;
         var10000 = (var13 = a - (a + a)) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
      }

      return var10000 <= 0 && a >= a && a <= a + a;
   }

   public static void bjb() {
      long var0 = a ^ 63373729875053L;
      float var10002 = chi.method_22683().method_4486();
      float var10003 = chi.method_22683().method_4502();
      short var10006 = 18706;
      long var10007 = 8784380675666299127L ^ var0;
      short var2 = 16714;
      long var10008 = 4893122930469519533L ^ var0;
      short var4 = 16714;
      long var10009 = 4893122930469519533L ^ var0;
      Color var10004 = new Color(20, 20, 20);
      short var3 = 22316;
      var10008 = 3744988011433809610L ^ var0;
      dmp.dyl(
         0.0F, 0.0F, var10002, var10003, var10004, new Color(50, b<"b">(10661, 6198190784085567558L ^ var0), b<"b">(10661, 6198190784085567558L ^ var0)), false
      );
   }

   public static int awv(HKEYByReference hKey) {
      long ax = fuv.a ^ 99564293824809L;
      short var10002 = 17700;
      long var10003 = 8065731846701860054L ^ ax;
      return Advapi32.INSTANCE.RegOpenKeyEx(WinReg.HKEY_CURRENT_USER, "Control Panel\\Desktop", 0, b<"b">(17285, 2213599364454491941L ^ ax), a);
   }

   public static void dgg(int registryAccessResult) {
      long ax = fuv.a ^ 109797631327410L;
      if (a != 0) {
         throw new Win32Exception(a);
      }
   }

   public static String cv() {
      long var0 = a ^ 60460546743530L;
      short var10001 = 18830;
      long var10002 = 5360178432264811964L ^ var0;
      short var2 = 22659;
      long var10003 = 931582210116035766L ^ var0;
      return Advapi32Util.registryGetStringValue(WinReg.HKEY_CURRENT_USER, "Control Panel\\Desktop", "WallPaper");
   }

   static {
      long var16 = a ^ 139748126533953L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var19 = 1; var19 < 8; var19++) {
         var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[6];
      int var23 = 0;
      String var22 = "áñ-4fßÒ\tC»\u0002\u000bÝ«¤ê½u§\\pÃ\u0002âa1\u008aM\u001cTàõ\u001d\u000b\u00031}\f\u0019\u00027\u009b\u0004]d±vÚ(\u0082øStÆ]Z$gñ\u00115mhÕÛÀÑôí\u0000|]-#{~/·«ÜT£ùÆ8çbtÔ\u0010da\u001b\fUá\u0097\u0082\u000f'\r]e\u0013´Õ(7\u0088[<Ù?«VñqÚñ\u009d{·\u0018ú\fµ¯M\u0010Ý\u0017~2µï\u00926U½>ÿ\u0006²ó\u0094\b\u008c";
      int var24 = "áñ-4fßÒ\tC»\u0002\u000bÝ«¤ê½u§\\pÃ\u0002âa1\u008aM\u001cTàõ\u001d\u000b\u00031}\f\u0019\u00027\u009b\u0004]d±vÚ(\u0082øStÆ]Z$gñ\u00115mhÕÛÀÑôí\u0000|]-#{~/·«ÜT£ùÆ8çbtÔ\u0010da\u001b\fUá\u0097\u0082\u000f'\r]e\u0013´Õ(7\u0088[<Ù?«VñqÚñ\u009d{·\u0018ú\fµ¯M\u0010Ý\u0017~2µï\u00926U½>ÿ\u0006²ó\u0094\b\u008c"
         .length();
      char var21 = '0';
      int var29 = -1;

      label64:
      while (true) {
         String var30 = var22.substring(++var29, var29 + var21);
         int var10001 = -1;

         while (true) {
            byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
            String var47 = a(var26).intern();
            switch (var10001) {
               case 0:
                  var25[var23++] = var47;
                  if ((var29 += var21) >= var24) {
                     c = var25;
                     d = new String[6];
                     short var32 = 5684;
                     long var40 = 4428726658944606127L ^ var16;
                     arh = "Control Panel\\Desktop";
                     short var33 = 605;
                     long var41 = 5174007519589764034L ^ var16;
                     gah = "WallPaper";
                     h = new HashMap(13);
                     Cipher var5;
                     var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var6 = 1; var6 < 8; var6++) {
                        var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[5];
                     int var8 = 0;
                     String var9 = "6®Ju¹Í#·¯'Wî{«g\u0016V\u0016ó\u0016î\rÕi";
                     int var10 = "6®Ju¹Í#·¯'Wî{«g\u0016V\u0016ó\u0016î\rÕi".length();
                     byte var7 = 0;

                     label46:
                     while (true) {
                        var10001 = var7;
                        var7 += 8;
                        byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                        long[] var35 = var11;
                        var10001 = var8++;
                        long var51 = (var12[0] & 255L) << 56
                           | (var12[1] & 255L) << 48
                           | (var12[2] & 255L) << 40
                           | (var12[3] & 255L) << 32
                           | (var12[4] & 255L) << 24
                           | (var12[5] & 255L) << 16
                           | (var12[6] & 255L) << 8
                           | var12[7] & 255L;
                        byte var56 = -1;

                        while (true) {
                           long var13 = var51;
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
                           long var59 = (var15[0] & 255L) << 56
                              | (var15[1] & 255L) << 48
                              | (var15[2] & 255L) << 40
                              | (var15[3] & 255L) << 32
                              | (var15[4] & 255L) << 24
                              | (var15[5] & 255L) << 16
                              | (var15[6] & 255L) << 8
                              | var15[7] & 255L;
                           switch (var56) {
                              case 0:
                                 var35[var10001] = var59;
                                 if (var7 >= var10) {
                                    f = var11;
                                    g = new Integer[5];
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long var2 = 8229133311411804333L;
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
                                    long var54 = (var4[0] & 255L) << 56
                                       | (var4[1] & 255L) << 48
                                       | (var4[2] & 255L) << 40
                                       | (var4[3] & 255L) << 32
                                       | (var4[4] & 255L) << 24
                                       | (var4[5] & 255L) << 16
                                       | (var4[6] & 255L) << 8
                                       | var4[7] & 255L;
                                    byte var45 = -1;
                                    i = var54;
                                    return;
                                 }
                                 break;
                              default:
                                 var35[var10001] = var59;
                                 if (var7 < var10) {
                                    continue label46;
                                 }

                                 var9 = "\u0088´\u009fÁôêÎIz¤çYesÒC";
                                 var10 = "\u0088´\u009fÁôêÎIz¤çYesÒC".length();
                                 var7 = 0;
                           }

                           byte var44 = var7;
                           var7 += 8;
                           var12 = var9.substring(var44, var7).getBytes("ISO-8859-1");
                           var35 = var11;
                           var10001 = var8++;
                           var51 = (var12[0] & 255L) << 56
                              | (var12[1] & 255L) << 48
                              | (var12[2] & 255L) << 40
                              | (var12[3] & 255L) << 32
                              | (var12[4] & 255L) << 24
                              | (var12[5] & 255L) << 16
                              | (var12[6] & 255L) << 8
                              | var12[7] & 255L;
                           var56 = 0;
                        }
                     }
                  }

                  var21 = var22.charAt(var29);
                  break;
               default:
                  var25[var23++] = var47;
                  if ((var29 += var21) < var24) {
                     var21 = var22.charAt(var29);
                     continue label64;
                  }

                  var22 = "çè¹T×\u0000y¿þ\u008b(ÙÕ5C\u0090r±\u0092\u009a\u0019¡\u0011\u0099\u0018§B\u009bäý7l1!\u0090\u0007ò/ÆTp8lÁ\u0013Jígd";
                  var24 = "çè¹T×\u0000y¿þ\u008b(ÙÕ5C\u0090r±\u0092\u009a\u0019¡\u0011\u0099\u0018§B\u009bäý7l1!\u0090\u0007ò/ÆTp8lÁ\u0013Jígd".length();
                  var21 = 24;
                  var29 = -1;
            }

            var30 = var22.substring(++var29, var29 + var21);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19512;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/fuv", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("cc/astralis/fuv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10601;
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
            throw new RuntimeException("cc/astralis/fuv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("cc/astralis/fuv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
