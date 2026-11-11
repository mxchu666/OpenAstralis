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
import net.minecraft.class_1268;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_3966;

public class czm extends guu {
   private final adu efl;
   private final bes hex;
   private final bes coh;
   private final bes hiy;
   private final gbp cri;
   private final gbp glx;
   private long ezv;
   private static final long a = 49745545731703L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long p;
   private static final long[] q;
   private static final Long[] r;
   private static final Map v;

   public czm() {
      long a = czm.a ^ 2043033759863L;
      super(bfm.COMBAT);
      short var10003 = 9076;
      long var10004 = 5356549808580439478L ^ a;
      short var8 = 6642;
      long var10005 = 6446341466144216884L ^ a;
      String[] var14 = new String[3];
      short var10008 = 6642;
      long var10009 = 6446341466144216884L ^ a;
      var14[0] = "Off";
      var10008 = 628;
      var10009 = 7791546791348636861L ^ a;
      var14[1] = "Normal";
      var10008 = 28690;
      var10009 = 6350117597079535315L ^ a;
      var14[2] = "Force";
      a.efl = new adu("Wait for Crit", "Off", var14);
      var10003 = 22458;
      var10004 = 8532009439681370481L ^ a;
      a.hex = new bes("Percentage", 0.95F, 0.1F, 1.0F, 0.01F);
      var10003 = 31624;
      var10004 = 8977105846861460813L ^ a;
      a.coh = new bes("Reaction Time", 0.0F, 0.0F, 500.0F, 10.0F);
      var10003 = 29576;
      var10004 = 1534976261945589058L ^ a;
      a.hiy = new bes("Miss Chance", 0.0F, 0.0F, 1.0F, 0.01F);
      var10003 = 2032;
      var10004 = 1448528257776879923L ^ a;
      a.cri = new gbp("Weapon Only", true);
      var10003 = 12211;
      var10004 = 7407302441493930355L ^ a;
      a.glx = new gbp("Ignore Teammates", false);
      a.ezv = e<"r">(3134, 4021388828736521324L ^ a);
      ffn[] var10001 = new ffn[(int)p];
      var10001[0] = a.efl;
      var10001[1] = a.hex;
      var10001[2] = a.coh;
      var10001[3] = a.hiy;
      var10001[4] = a.cri;
      var10001[5] = a.glx;
      a.bfi(var10001);
   }

   @gdz
   public void bql(fxx event) {
      long ax;
      czm var10;
      label94: {
         label97: {
            ax = czm.a ^ 116892835401495L;
            int[] var10000 = dar.abu();
            a.efe(a.hex.dnp() + "");
            class_239 axx = chi.field_1765;
            int[] axxx = var10000;
            class_239 var9 = axx;
            if (axxx != null) {
               if (!(axx instanceof class_3966)) {
                  break label97;
               }

               var9 = axx;
            }

            class_3966 axxxx = (class_3966)var9;
            var10 = a;
            if (axxx == null) {
               break label94;
            }

            if (a.cdw(axxxx)) {
               long axxxxx = System.currentTimeMillis();
               long var13;
               int var11 = (var13 = a.ezv - e<"r">(21220, 6586477740099184087L ^ ax)) == 0L ? 0 : (var13 < 0L ? -1 : 1);
               if (axxx != null) {
                  if (var11 == 0) {
                     a.ezv = axxxxx;
                  }

                  long var14;
                  var11 = (var14 = axxxxx - a.ezv - a.coh.dnp().intValue()) == 0L ? 0 : (var14 < 0L ? -1 : 1);
               }

               if (axxx != null) {
                  if (var11 < 0) {
                     return;
                  }

                  float var15;
                  var11 = (var15 = chi.field_1724.method_7261(0.0F) - a.hex.dnp().floatValue()) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
               }

               if (axxx != null) {
                  if (var11 < 0) {
                     return;
                  }

                  var11 = chi.field_1690.field_1904.method_1434();
               }

               if (axxx != null) {
                  if (var11 != 0) {
                     return;
                  }

                  double var16;
                  var11 = (var16 = Math.random() - a.hiy.dnp().floatValue()) == 0.0 ? 0 : (var16 < 0.0 ? -1 : 1);
               }

               label99: {
                  if (axxx != null) {
                     if (var11 < 0) {
                        chi.field_1724.method_6104(class_1268.field_5808);
                        a.ezv = e<"r">(3134, 4021358633315203852L ^ ax);
                        return;
                     }

                     var10 = a;
                     if (axxx == null) {
                        break label99;
                     }

                     var11 = a.fpf();
                  }

                  if (var11 != 0) {
                     return;
                  }

                  chi.field_1761.method_2925();
                  chi.field_1761.method_2918(chi.field_1724, axxxx.method_17782());
                  chi.field_1724.method_6104(class_1268.field_5808);
                  var10 = a;
               }

               var10.ezv = e<"r">(3134, 4021358633315203852L ^ ax);
               return;
            }
         }

         var10 = a;
      }

      var10.ezv = e<"r">(3134, 4021358633315203852L ^ ax);
   }

   private boolean cdw(class_3966 a) {
      long ax = czm.a ^ 26632573649742L;
      int[] var10000 = dar.abu();
      class_1297 var6 = a.method_17782();
      int[] axx = var10000;
      boolean var7 = var6 instanceof class_1657;
      if (axx != null) {
         label74:
         if (var7) {
            class_1657 axxx = (class_1657)var6;
            boolean var8 = axxx.method_5805();
            if (axx != null) {
               if (!var8) {
                  break label74;
               }

               var8 = a.cri.dnp();
            }

            label64:
            if (axx != null) {
               if (var8) {
                  var8 = bav.glo();
                  if (axx == null) {
                     break label64;
                  }

                  if (!var8) {
                     return false;
                  }
               }

               var8 = a.glx.dnp();
            }

            label82: {
               if (axx != null) {
                  if (!var8) {
                     break label82;
                  }

                  var8 = hav.ab(axxx);
               }

               if (axx == null) {
                  return var8;
               }

               if (var8) {
                  return false;
               }
            }

            if (chi.field_1755 != null) {
               return false;
            }

            return true;
         }

         var7 = false;
      }

      return var7;
   }

   private boolean fpf() {
      int[] a;
      int var6;
      long ax = czm.a ^ 39215603629272L;
      String var4 = a.efl.dnp();
      int[] var10000 = dar.abu();
      byte var5 = -1;
      a = var10000;
      var6 = var4.hashCode();
      label88:
      if (a != null) {
         switch (var6) {
            case 79183:
               short var10001 = 24310;
               long var10002 = 5493645326630345873L ^ ax;
               var6 = var4.equals("Off");
               if (a == null) {
                  break label88;
               }

               if (var6 == 0) {
                  break;
               }

               var5 = 0;
               if (a != null) {
                  break;
               }
            case -1955878649:
               short var7 = 32471;
               long var9 = 4757825016235982015L ^ ax;
               var6 = var4.equals("Normal");
               if (a == null) {
                  break label88;
               }

               if (var6 == 0) {
                  break;
               }

               var5 = 1;
               if (a != null) {
                  break;
               }
            case 68065995:
               short var8 = 19470;
               long var10 = 3585388668287209061L ^ ax;
               var6 = var4.equals("Force");
               if (a == null) {
                  break label88;
               }

               if (var6 != 0) {
                  var5 = 2;
               }
         }

         var6 = var5;
      }

      if (a != null) {
         switch (var6) {
            case 0:
               var6 = 0;
               break;
            case 1:
               var6 = chi.field_1724.method_24828();
               if (a != null) {
                  if (var6 == 0) {
                     boolean var11 = a.bkd();
                     if (a == null) {
                        return var11;
                     }

                     if (!var11) {
                        return (boolean)1;
                     }
                  }

                  var6 = 0;
               }
               break;
            case 2:
               var6 = a.bkd();
               if (a != null) {
                  var6 = var6 == 0 ? 1 : 0;
               }
               break;
            default:
               var6 = 0;
         }
      }

      return (boolean)var6;
   }

   private boolean bkd() {
      long a = czm.a ^ 137567773090250L;
      int[] var3 = dar.abu();
      double var4;
      int var10000 = (var4 = chi.field_1724.field_6017 - 0.1F) == 0.0 ? 0 : (var4 < 0.0 ? -1 : 1);
      if (var3 != null) {
         if (var10000 <= 0) {
            return (boolean)0;
         }

         var10000 = chi.field_1724.method_24828();
      }

      if (var3 != null) {
         if (var10000 != 0) {
            return (boolean)0;
         }

         var10000 = chi.field_1724.method_6101();
      }

      if (var3 != null) {
         if (var10000 != 0) {
            return (boolean)0;
         }

         var10000 = chi.field_1724.method_5721();
      }

      if (var3 != null) {
         if (var10000 != 0) {
            return (boolean)0;
         }

         var10000 = chi.field_1724.method_6059(class_1294.field_5919);
      }

      if (var3 != null) {
         if (var10000 != 0) {
            return (boolean)0;
         }

         var10000 = chi.field_1724.method_6059(class_1294.field_5909);
      }

      if (var3 != null) {
         if (var10000 != 0) {
            return (boolean)0;
         }

         var10000 = chi.field_1724.method_5765();
      }

      if (var3 == null) {
         return (boolean)var10000;
      } else {
         return (boolean)(var10000 == 0 ? 1 : 0);
      }
   }

   static {
      long var16 = a ^ 27440367891141L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var19 = 1; var19 < 8; var19++) {
         var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[12];
      int var23 = 0;
      String var22 = "\u008f\u0013¤bN©\u000e¢v´\u0085\u00823/W\u0098Æ»_\u0095\fX!\u0089\u0018\fÓ¸+j\u001bó\rf\u0015#;ÅôZq\u0086r\"1¤,\\|\u0010S·Å÷³ý\u0089RG\u0093ñ«®:>l(·\u0088Ñáe]Ü\n.¿\u001em´\u009aÕyI\u0002tB«\u0016§ðK·º{\u0086=\u0004rVäA0{qug\u0010¡Ø\u0019\f\u0083È]ñ`(K\u008dT¯kp\u0010C{ºrEÝÁó\u00adÓóF\u0089âi®\u0018ss!\u0003_ð\u0012rØß¡¨¬ñ\u009c\u0090³\b\"2Ä\u008aG\u008b\u0010ÒýÄ\u001e\u0005-8±BMv\u001b\tÁÀ¼ \u0007º\u0094ó\u0088d\u008eª-\u007f{\b\u0096\u007füçH¸ot÷ïÎ\u0093r\u0090@E¾\u0018Ò: k¢»\u001dµ7j\u008fëåÊ\u0011Çiàô¨\u0018\u0099\u0005^^\u0014\u00831uC\u0090S¼\u001cu";
      int var24 = "\u008f\u0013¤bN©\u000e¢v´\u0085\u00823/W\u0098Æ»_\u0095\fX!\u0089\u0018\fÓ¸+j\u001bó\rf\u0015#;ÅôZq\u0086r\"1¤,\\|\u0010S·Å÷³ý\u0089RG\u0093ñ«®:>l(·\u0088Ñáe]Ü\n.¿\u001em´\u009aÕyI\u0002tB«\u0016§ðK·º{\u0086=\u0004rVäA0{qug\u0010¡Ø\u0019\f\u0083È]ñ`(K\u008dT¯kp\u0010C{ºrEÝÁó\u00adÓóF\u0089âi®\u0018ss!\u0003_ð\u0012rØß¡¨¬ñ\u009c\u0090³\b\"2Ä\u008aG\u008b\u0010ÒýÄ\u001e\u0005-8±BMv\u001b\tÁÀ¼ \u0007º\u0094ó\u0088d\u008eª-\u007f{\b\u0096\u007füçH¸ot÷ïÎ\u0093r\u0090@E¾\u0018Ò: k¢»\u001dµ7j\u008fëåÊ\u0011Çiàô¨\u0018\u0099\u0005^^\u0014\u00831uC\u0090S¼\u001cu"
         .length();
      char var21 = 24;
      int var28 = -1;

      label57:
      while (true) {
         String var29 = var22.substring(++var28, var28 + var21);
         int var10001 = -1;

         while (true) {
            byte[] var26 = var18.doFinal(var29.getBytes("ISO-8859-1"));
            String var40 = d(var26).intern();
            switch (var10001) {
               case 0:
                  var25[var23++] = var40;
                  if ((var28 += var21) >= var24) {
                     g = var25;
                     h = new String[12];
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var16 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var13 = 1567494157998697417L;
                     byte[] var15 = var11.doFinal(
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
                     long var44 = (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L;
                     var10001 = (byte)-1;
                     p = var44;
                     v = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "%E\u0088.[39ô74\u0003\u008ad\u0085Hª";
                     int var5 = "%E\u0088.[39ô74\u0003\u008ad\u0085Hª".length();
                     byte var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
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
                        long var10004 = (var10[0] & 255L) << 56
                           | (var10[1] & 255L) << 48
                           | (var10[2] & 255L) << 40
                           | (var10[3] & 255L) << 32
                           | (var10[4] & 255L) << 24
                           | (var10[5] & 255L) << 16
                           | (var10[6] & 255L) << 8
                           | var10[7] & 255L;
                        byte var48 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     q = var6;
                     r = new Long[2];
                     return;
                  }

                  var21 = var22.charAt(var28);
                  break;
               default:
                  var25[var23++] = var40;
                  if ((var28 += var21) < var24) {
                     var21 = var22.charAt(var28);
                     continue label57;
                  }

                  var22 = "\"ÿþö\u001d\u0089Ïs\u008f\u0004\u000fÈ\u0093J¨½\u0010Z³\u0089ÇC¾]\bÕ\u009d÷\u0093S®!\u0080";
                  var24 = "\"ÿþö\u001d\u0089Ïs\u008f\u0004\u000fÈ\u0093J¨½\u0010Z³\u0089ÇC¾]\bÕ\u009d÷\u0093S®!\u0080".length();
                  var21 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8387;
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
            throw new RuntimeException("cc/astralis/czm", var10);
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
         throw new RuntimeException("cc/astralis/czm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9811;
      if (r[var3] == null) {
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
         long var5 = q[var3];
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
         Object[] var9 = (Object[])v.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               v.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/czm", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         r[var3] = var15;
      }

      return r[var3];
   }

   private static long e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = e(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
         throw new RuntimeException("cc/astralis/czm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
