package cc.astralis;

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

public class cni {
   private static final long a = 25312250360544L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public static String bsg(byte[] data) {
      long ax = cni.a ^ 76472031037848L;
      int[] axx = dar.abu();
      byte[] var10000 = a;
      if (axx != null) {
         if (a == null) {
            return "";
         }

         var10000 = a;
      }

      if (var10000.length != 0) {
         short var25 = 16009;
         long var10001 = 7344966756849182710L ^ ax;
         char[] axxx = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
         int axxxx = (a.length + 2) / 3 * 4;
         char[] axxxxx = new char[axxxx];
         int axxxxxx = 0;
         int axxxxxxx = 0;
         int axxxxxxxx = a.length / 3;
         int axxxxxxxxx = 0;

         while (true) {
            if (axxxxxxxxx < axxxxxxxx) {
               byte var26 = a[axxxxxx++];
               short var36 = 17784;
               long var10002 = 2426835039441621035L ^ ax;
               int var27 = var26 & 255;
               short var37 = 30909;
               var10002 = 1594674663491120609L ^ ax;
               int var28 = var27 << 16;
               byte var38 = a[axxxxxx++];
               short var61 = 15140;
               long var10003 = 5721342868325723766L ^ ax;
               int var39 = var38 & 255;
               short var62 = 8911;
               var10003 = 4437280008756000670L ^ ax;
               int var29 = var28 | var39 << 8;
               byte var40 = a[axxxxxx++];
               short var64 = 15140;
               var10003 = 5721342868325723766L ^ ax;
               int axxxxxxxxxx = var29 | var40 & 255;
               int var41 = axxxxxxx++;
               short var10004 = 26037;
               long var10005 = 2587118354015891695L ^ ax;
               int var74 = axxxxxxxxxx >>> 18;
               var10004 = 8336;
               var10005 = 8190335096457557453L ^ ax;
               axxxxx[var41] = axxx[var74 & 63];
               int var42 = axxxxxxx++;
               var10004 = 26323;
               var10005 = 1587794694602863494L ^ ax;
               int var75 = axxxxxxxxxx >>> 12;
               var10004 = 26516;
               var10005 = 2188537449220551373L ^ ax;
               axxxxx[var42] = axxx[var75 & 63];
               int var43 = axxxxxxx++;
               var10004 = 30245;
               var10005 = 3666171489820025713L ^ ax;
               int var76 = axxxxxxxxxx >>> 6;
               var10004 = 26516;
               var10005 = 2188537449220551373L ^ ax;
               axxxxx[var43] = axxx[var76 & 63];
               int var44 = axxxxxxx++;
               var10004 = 26516;
               var10005 = 2188537449220551373L ^ ax;
               axxxxx[var44] = axxx[axxxxxxxxxx & 63];
               axxxxxxxxx++;
               if (axx == null) {
                  break;
               }

               if (axx != null) {
                  continue;
               }
            }

            axxxxxxxxx = a.length % 3;
            break;
         }

         int var30 = axxxxxxxxx;
         int var45 = 1;
         if (axx != null) {
            if (axxxxxxxxx == 1) {
               byte var31 = a[axxxxxx];
               short var46 = 15140;
               long var65 = 5721342868325723766L ^ ax;
               int var32 = var31 & 255;
               short var47 = 22862;
               var65 = 2582961514440133649L ^ ax;
               int axxxxxxxxxxx = var32 << 16;
               int var48 = axxxxxxx++;
               int var77 = axxxxxxxxxxx >>> b<"f">(29467, 8973148763454776915L ^ ax);
               short var91 = 26516;
               long var105 = 2188537449220551373L ^ ax;
               axxxxx[var48] = axxx[var77 & 63];
               int var49 = axxxxxxx++;
               var91 = 25735;
               var105 = 984979974781514204L ^ ax;
               var77 = axxxxxxxxxxx >>> 12;
               var91 = 26516;
               var105 = 2188537449220551373L ^ ax;
               axxxxx[var49] = axxx[var77 & 63];
               int var50 = axxxxxxx++;
               short var67 = 2751;
               long var79 = 7384973899082948583L ^ ax;
               axxxxx[var50] = '=';
               axxxxx[axxxxxxx] = (char)b<"f">(2355, 1682564752022527098L ^ ax);
               if (axx != null) {
                  return new String(axxxxx);
               }
            }

            var30 = axxxxxxxxx;
            var45 = 2;
         }

         if (axx != null) {
            if (var30 != var45) {
               return new String(axxxxx);
            }

            byte var33 = a[axxxxxx++];
            short var52 = 15140;
            long var68 = 5721342868325723766L ^ ax;
            int var34 = var33 & 255;
            short var53 = 22862;
            var68 = 2582961514440133649L ^ ax;
            var30 = var34 << 16;
            byte var54 = a[axxxxxx];
            short var70 = 15140;
            long var80 = 5721342868325723766L ^ ax;
            int var55 = var54 & 255;
            short var71 = 14946;
            var80 = 1288033907858370354L ^ ax;
            var45 = var55 << 8;
         }

         int axxxxxxxxxxx = var30 | var45;
         int var56 = axxxxxxx++;
         int var82 = axxxxxxxxxxx >>> b<"f">(29467, 8973148763454776915L ^ ax);
         short var94 = 26516;
         long var108 = 2188537449220551373L ^ ax;
         axxxxx[var56] = axxx[var82 & 63];
         int var57 = axxxxxxx++;
         var94 = 25735;
         var108 = 984979974781514204L ^ ax;
         var82 = axxxxxxxxxxx >>> 12;
         var94 = 26516;
         var108 = 2188537449220551373L ^ ax;
         axxxxx[var57] = axxx[var82 & 63];
         int var58 = axxxxxxx++;
         var94 = 18860;
         var108 = 5392428626633792754L ^ ax;
         var82 = axxxxxxxxxxx >>> 6;
         var94 = 26516;
         var108 = 2188537449220551373L ^ ax;
         axxxxx[var58] = axxx[var82 & 63];
         axxxxx[axxxxxxx] = (char)b<"f">(2355, 1682564752022527098L ^ ax);
         return new String(axxxxx);
      } else {
         return "";
      }
   }

   public static byte[] fsi(String base64) {
      long ax = cni.a ^ 12701095064907L;
      if (a != null && !a.isEmpty()) {
         int axx = 0;

         for (int axxx = 0; axxx < a.length(); axxx++) {
            char axxxx = a.charAt(axxx);
            if (!Character.isWhitespace(axxxx)) {
               axx++;
            }
         }

         if (axx % 4 != 0) {
            short var46 = 3106;
            long var54 = 8265652289542908300L ^ ax;
            throw new IllegalArgumentException("Invalid Base64!");
         } else {
            int var10000 = 17303;
            long var10001 = 6544987420145624634L ^ ax;
            String var17 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
            var10000 = (short)14907;
            var10001 = 7866746240636474303L ^ ax;
            int[] axxxx = new int[256];
            int axxxxx = 0;

            while (true) {
               short var26 = 17303;
               long var10002 = 6544987420145624634L ^ ax;
               if (axxxxx >= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".length()) {
                  axxxx[b<"f">(2355, 1682628523088011433L ^ ax)] = 0;
                  axxxxx = 0;
                  int axxxxxx = a.length() - 1;

                  while (axxxxxx >= 0 && Character.isWhitespace(a.charAt(axxxxxx))) {
                     axxxxxx--;
                  }

                  if (axxxxxx >= 0 && a.charAt(axxxxxx) == b<"f">(2355, 1682628523088011433L ^ ax)) {
                     axxxxx++;
                     axxxxxx--;
                     if (axxxxxx >= 0 && a.charAt(axxxxxx) == b<"f">(2355, 1682628523088011433L ^ ax)) {
                        axxxxx++;
                     }
                  }

                  short var28 = 18860;
                  var10002 = 5392373650049146913L ^ ax;
                  var10000 = axx * 6;
                  short var29 = 14946;
                  var10002 = 1288110874148656097L ^ ax;
                  int axxxxxxx = var10000 / 8 - axxxxx;
                  byte[] axxxxxxxx = new byte[axxxxxxx];
                  int[] axxxxxxxxx = new int[4];
                  int axxxxxxxxxx = 0;
                  int axxxxxxxxxxx = 0;

                  for (int axxxxxxxxxxxx = 0; axxxxxxxxxxxx < a.length(); axxxxxxxxxxxx++) {
                     char axxxxxxxxxxxxx = a.charAt(axxxxxxxxxxxx);
                     if (!Character.isWhitespace(axxxxxxxxxxxxx)) {
                        short var30 = 6360;
                        var10002 = 593649965193392477L ^ ax;
                        if (axxxxxxxxxxxxx >= 256) {
                           short var45 = 19407;
                           long var53 = 8788414097033866848L ^ ax;
                           throw new IllegalArgumentException("Invalid Base64 character");
                        }

                        int axxxxxxxxxxxxxx = axxxx[axxxxxxxxxxxxx];
                        axxxxxxxxx[axxxxxxxxxxx++] = axxxxxxxxxxxxxx;
                        if (axxxxxxxxxxx == 4) {
                           var10000 = axxxxxxxxx[0] << b<"f">(29467, 8973221330611182208L ^ ax);
                           int var32 = axxxxxxxxx[1];
                           short var41 = 25735;
                           long var10003 = 984903009974947087L ^ ax;
                           var10000 |= var32 << 12;
                           int var33 = axxxxxxxxx[2];
                           short var42 = 18860;
                           var10003 = 5392373650049146913L ^ ax;
                           int axxxxxxxxxxxxxxx = var10000 | var33 << 6 | axxxxxxxxx[3];
                           if (axxxxxxxxxx < axxxxxxx) {
                              int var34 = axxxxxxxxxx++;
                              short var48 = 22862;
                              long var10004 = 2583038479651385538L ^ ax;
                              int var43 = axxxxxxxxxxxxxxx >>> 16;
                              short var49 = 15140;
                              var10004 = 5721265902712279717L ^ ax;
                              axxxxxxxx[var34] = (byte)(var43 & 0xFF);
                           }

                           if (axxxxxxxxxx < axxxxxxx) {
                              int var35 = axxxxxxxxxx++;
                              short var50 = 14946;
                              long var56 = 1288110874148656097L ^ ax;
                              int var44 = axxxxxxxxxxxxxxx >>> 8;
                              short var51 = 15140;
                              var56 = 5721265902712279717L ^ ax;
                              axxxxxxxx[var35] = (byte)(var44 & 0xFF);
                           }

                           if (axxxxxxxxxx < axxxxxxx) {
                              int var36 = axxxxxxxxxx++;
                              short var52 = 15140;
                              long var58 = 5721265902712279717L ^ ax;
                              axxxxxxxx[var36] = (byte)(axxxxxxxxxxxxxxx & 0xFF);
                           }

                           axxxxxxxxxxx = 0;
                        }
                     }
                  }

                  return axxxxxxxx;
               }

               short var27 = 17303;
               var10002 = 6544987420145624634L ^ ax;
               axxxx["ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(axxxxx)] = axxxxx++;
            }
         }
      } else {
         return new byte[0];
      }
   }

   static {
      long var11 = a ^ 58136057747720L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[4];
      int var18 = 0;
      String var17 = "Úïü\t\u000eº`~\u008fk\u007f\u0097}'Ä\u00adÇ^h\u0013hò\\Î«\bz\u0096\u000el+Âîä¿ôOõµé\u0017\u008ac%Q-÷©\u001a²\u001a\u0002ÏtlÎ4¼\u0018\u0000n¬æ nÆ{\u009aHò9t\"ÚêÔd¾\u0092Ì[\u0084§7MÕ\u0011\u0011\u009aP\u0091£~\u00110JÇf\u0081ö\u0011ï8?4¤\u0094¦îâé¯hà¦EE\u0081ÌNuOÑø\u0082n\u0096\u00905\u008eÙ¾&Ó\u0088\u0096d\u0003å,}K\u009eÞ\u009fw\u0090÷ÖoåF¾í¨Ò\u008boFððü\u0019×w\u0000\u000esÀÖ¾5|Ágé\u001b\u0097\u00167p\u009cz\u0002ÿÊ±Ï\u0004Hw-~cGà\u008eVÒ84kúÀ\u0000\u0014\u0000P\\Åã\u0014¼\u00adì\u009b)";
      int var19 = "Úïü\t\u000eº`~\u008fk\u007f\u0097}'Ä\u00adÇ^h\u0013hò\\Î«\bz\u0096\u000el+Âîä¿ôOõµé\u0017\u008ac%Q-÷©\u001a²\u001a\u0002ÏtlÎ4¼\u0018\u0000n¬æ nÆ{\u009aHò9t\"ÚêÔd¾\u0092Ì[\u0084§7MÕ\u0011\u0011\u009aP\u0091£~\u00110JÇf\u0081ö\u0011ï8?4¤\u0094¦îâé¯hà¦EE\u0081ÌNuOÑø\u0082n\u0096\u00905\u008eÙ¾&Ó\u0088\u0096d\u0003å,}K\u009eÞ\u009fw\u0090÷ÖoåF¾í¨Ò\u008boFððü\u0019×w\u0000\u000esÀÖ¾5|Ágé\u001b\u0097\u00167p\u009cz\u0002ÿÊ±Ï\u0004Hw-~cGà\u008eVÒ84kúÀ\u0000\u0014\u0000P\\Åã\u0014¼\u00adì\u009b)"
         .length();
      char var16 = 'p';
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
                     c = new String[4];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[18];
                     int var3 = 0;
                     String var4 = "8eEÜ\u001e¨e¹Ù2Í\u000f\u0092cåñÊÎ£]XÖÞóºy\u001d£\u008fÌ\u0019u\u0098\u0094~}{\u0005»¶r\u0085¿zZÒ[¶£Ñ©ûä\u001e©ðX\u0085W\\\u0001H\u0099þ\u0088&pf,ùés·Dá°t\u009b¸\u0005Ëî\u009fP\u0094EìS,\u00ad\u000bõZÒ×\u0091ÇMh\u0093*{-\u0086ð\u0014è\reÃôÙû\u009f?L\u0004Á\u001a\u0085[(HFä\u009aT\u0084";
                     int var5 = "8eEÜ\u001e¨e¹Ù2Í\u000f\u0092cåñÊÎ£]XÖÞóºy\u001d£\u008fÌ\u0019u\u0098\u0094~}{\u0005»¶r\u0085¿zZÒ[¶£Ñ©ûä\u001e©ðX\u0085W\\\u0001H\u0099þ\u0088&pf,ùés·Dá°t\u009b¸\u0005Ëî\u009fP\u0094EìS,\u00ad\u000bõZÒ×\u0091ÇMh\u0093*{-\u0086ð\u0014è\reÃôÙû\u009f?L\u0004Á\u001a\u0085[(HFä\u009aT\u0084"
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
                                    f = new Integer[18];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "`\";Fx\u0088Ô|¤\u008b\u00106ôtåå";
                                 var5 = "`\";Fx\u0088Ô|¤\u008b\u00106ôtåå".length();
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

                  var17 = "<¡D\u000b2¾Û«èÎ<þaG!þ§Áô¾}ç\u008e\u001fî\u00804>Y7\u007fZ8\bï)J*¨u\u001c\u008db\u0001I\n\u009cÄg\u009f)ãh\u001bØ0&VqXº\u00959ÿ\u001f%\u0003.r\u000f¿\u000b\u0016ßõ=\"5K<2Å¨\u0087â\u0016Ù¬\u008e";
                  var19 = "<¡D\u000b2¾Û«èÎ<þaG!þ§Áô¾}ç\u008e\u001fî\u00804>Y7\u007fZ8\bï)J*¨u\u001c\u008db\u0001I\n\u009cÄg\u009f)ãh\u001bØ0&VqXº\u00959ÿ\u001f%\u0003.r\u000f¿\u000b\u0016ßõ=\"5K<2Å¨\u0087â\u0016Ù¬\u008e"
                     .length();
                  var16 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25095;
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
            throw new RuntimeException("cc/astralis/cni", var10);
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
         throw new RuntimeException("cc/astralis/cni" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28192;
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
            throw new RuntimeException("cc/astralis/cni", var14);
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
         throw new RuntimeException("cc/astralis/cni" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
