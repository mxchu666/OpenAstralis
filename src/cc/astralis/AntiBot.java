package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_124;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_640;

public class AntiBot extends guu {
   private static final gbp emm;
   private static final gbp bim;
   private static final gbp cih;
   private static final gbp dly;
   private static final gbp epc;
   private static final String ewr;
   private static final long a = 51241945858063L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long p;

   public AntiBot() {
      super(bfm.COMBAT);
      a.bfi(new ffn[]{emm, bim, cih, dly, epc});
   }

   public static boolean cnv(class_1657 entityPlayer) {
      long ax = AntiBot.a ^ 123270302018317L;
      int[] var10000 = dar.abu();
      AntiBot axx = dar.gqy().aws().diy(AntiBot.class);
      int[] axxx = var10000;
      AntiBot var7 = axx;
      if (axxx != null) {
         if (axx == null) {
            return false;
         }

         var7 = axx;
      }

      boolean var8 = var7.dsv();
      if (axxx == null) {
         return var8;
      } else if (!var8) {
         return false;
      } else if (a == null) {
         return true;
      } else {
         class_640 axxxx;
         axxxx = chi.method_1562().method_2871(a.method_5667());
         var9 = dly.dnp();
         label176:
         if (axxx != null) {
            if (var9 != 0) {
               var9 = a.field_6012;
               if (axxx == null) {
                  break label176;
               }

               if (a.field_6012 < (int)p) {
                  return true;
               }
            }

            var9 = emm.dnp();
         }

         label167:
         if (axxx != null) {
            if (var9 != 0) {
               class_640 var10 = axxxx;
               if (axxx != null) {
                  if (axxxx == null) {
                     return true;
                  }

                  var10 = axxxx;
               }

               var9 = dst(var10);
               if (axxx == null) {
                  break label167;
               }

               if (var9 == 0) {
                  return true;
               }
            }

            var9 = epc.dnp();
         }

         label153: {
            if (var9 != 0) {
               var11 = axxxx;
               if (axxx == null) {
                  break label153;
               }

               if (axxxx != null) {
                  var11 = axxxx;
                  if (axxx == null) {
                     break label153;
                  }

                  if (axxxx.method_2959() == 0) {
                     return true;
                  }
               }
            }

            var11 = axxxx;
         }

         label144: {
            if (axxx != null) {
               if (var11 == null) {
                  var12 = null;
                  break label144;
               }

               var11 = axxxx;
            }

            var12 = var11.method_2966().name();
         }

         String axxxxx = var12;
         if (bim.dnp()) {
            String var13 = axxxxx;
            if (axxx != null) {
               if (axxxxx == null) {
                  return true;
               }

               var13 = axxxxx;
            }

            short var10001 = 26689;
            long var10002 = 5827507264661338143L ^ ax;
            boolean var14 = var13.matches("^[a-zA-Z0-9_]{1,16}+$");
            if (axxx == null) {
               return var14;
            } else {
               if (var14) {
                  boolean var17 = axxxxx.contains(" ");
                  if (axxx == null) {
                     return var17;
                  }

                  if (!var17) {
                     boolean var18 = axxxxx.startsWith("§");
                     if (axxx == null) {
                        return var18;
                     }

                     if (!var18) {
                        var10001 = 10585;
                        var10002 = 3825618323374438656L ^ ax;
                        boolean var19 = axxxxx.contains("NPC");
                        if (axxx == null) {
                           return var19;
                        }

                        if (!var19) {
                           return axxxx == null;
                        }
                     }
                  }
               }

               return true;
            }
         } else {
            return axxxx == null;
         }
      }
   }

   public static boolean dtl(class_640 playerInfo) {
      long ax = AntiBot.a ^ 65589964621998L;
      int[] var10000 = dar.abu();
      AntiBot axx = dar.gqy().aws().diy(AntiBot.class);
      int[] axxx = var10000;
      AntiBot var5 = axx;
      if (axxx != null) {
         if (axx == null) {
            return false;
         }

         var5 = axx;
      }

      boolean var6 = var5.dsv();
      if (axxx == null) {
         return var6;
      } else if (var6) {
         var10000 = (int[])a;
         if (axxx != null) {
            if (a == null) {
               return true;
            }

            var10000 = (int[])emm.dnp();
         }

         var8 = (Boolean)var10000;
         label90:
         if (axxx != null) {
            if (var8) {
               var8 = dst(a);
               if (axxx == null) {
                  break label90;
               }

               if (!var8) {
                  return true;
               }
            }

            var8 = cih.dnp();
         }

         label83:
         if (axxx != null) {
            if (var8) {
               short var10001 = 11478;
               long var10002 = 2159591559372840746L ^ ax;
               var8 = dcu(a, "[NPC] ");
               if (axxx == null) {
                  break label83;
               }

               if (var8) {
                  return true;
               }
            }

            var8 = bim.dnp();
         }

         if (axxx != null) {
            if (!var8) {
               return false;
            }

            String var9 = a.method_2966().name();
            short var10 = 18019;
            long var11 = 4939064493432927644L ^ ax;
            var8 = var9.matches("^[a-zA-Z0-9_]{1,16}+$");
         }

         return axxx == null ? var8 : !var8;
      } else {
         return false;
      }
   }

   private static boolean dst(class_640 a) {
      long ax = AntiBot.a ^ 57983003000838L;
      int[] var10000 = dar.abu();
      Iterator var4 = chi.method_1562().method_2880().iterator();
      int[] axx = var10000;

      while (true) {
         if (var4.hasNext()) {
            class_640 axxx = (class_640)var4.next();
            var6 = axxx.method_2966().id().compareTo(a.method_2966().id());
            if (axx == null) {
               break;
            }

            if (axx == null) {
               return (boolean)var6;
            }

            if (var6 == 0) {
               return (boolean)1;
            }

            if (axx != null) {
               continue;
            }
         }

         var6 = 0;
         break;
      }

      return (boolean)var6;
   }

   private static boolean dcu(class_640 a, String a) {
      long ax = AntiBot.a ^ 8946743455655L;
      int[] var4 = dar.abu();
      class_2561 var10000 = a.method_2971();
      if (var4 != null) {
         if (var10000 == null) {
            return false;
         }

         var10000 = a.method_2971();
      }

      boolean var5 = class_124.method_539(var10000.getString()).startsWith(a);
      return var4 == null ? var5 : var5;
   }

   static {
      long var14 = a ^ 76413060841054L;
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var6 = 1; var6 < 8; var6++) {
         var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[10];
      int var10 = 0;
      String var9 = "\u0012í\u0089ª\u0094\u0012ià>¿ïþ;½\u008af(êUÓ\u001b\u0016úñ³½Ë¨âr¬Ð$$a·±Û\u001f\u0091p½ÏäÍq\u0095YÙÖ8Ý÷û^\u001c\u000e\u00184¤\u0006\\\n\u0014w|nÒõ¾\fê½&\u0096>qPó\u0084\u0015U(*ÃZRQ\u008e4ÅV\u0088Fg\u0096KÒ\u001f\b\rc&IÇ\u0080\u0001\u0019Ab\u001cy\r*\u0091M¯\"¶ÝL¨\u001f(«\\\u0088©Òç\u0088nÇê½\u0006?z\u0012/ß?\u001be`\u009b{ToÊ\u0099\u0004\u008f\u009a\fÂ\u0092Qs\rxá\u0080\u0082\u0010;í.\u001c\u008b\b¾2Ïwu\u000bBM##\u0010H\u0019\u0083$\u008cöWþ«\u008eó¡v¥Yw0[¿\u009e\u001f\u009a\u0093ÿ\u0091ñ\u0094Täà_6>;:\u0012'G\u0088V´pÞ©NÀAè-j!\u0090è\u0089Z\u0082\u0084ºë)UN\u0007¾\f";
      int var11 = "\u0012í\u0089ª\u0094\u0012ià>¿ïþ;½\u008af(êUÓ\u001b\u0016úñ³½Ë¨âr¬Ð$$a·±Û\u001f\u0091p½ÏäÍq\u0095YÙÖ8Ý÷û^\u001c\u000e\u00184¤\u0006\\\n\u0014w|nÒõ¾\fê½&\u0096>qPó\u0084\u0015U(*ÃZRQ\u008e4ÅV\u0088Fg\u0096KÒ\u001f\b\rc&IÇ\u0080\u0001\u0019Ab\u001cy\r*\u0091M¯\"¶ÝL¨\u001f(«\\\u0088©Òç\u0088nÇê½\u0006?z\u0012/ß?\u001be`\u009b{ToÊ\u0099\u0004\u008f\u009a\fÂ\u0092Qs\rxá\u0080\u0082\u0010;í.\u001c\u008b\b¾2Ïwu\u000bBM##\u0010H\u0019\u0083$\u008cöWþ«\u008eó¡v¥Yw0[¿\u009e\u001f\u009a\u0093ÿ\u0091ñ\u0094Täà_6>;:\u0012'G\u0088V´pÞ©NÀAè-j!\u0090è\u0089Z\u0082\u0084ºë)UN\u0007¾\f"
         .length();
      char var8 = 16;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var9.substring(++var17, var17 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var13 = var5.doFinal(var18.getBytes("ISO-8859-1"));
            String var28 = d(var13).intern();
            switch (var10001) {
               case 0:
                  var12[var10++] = var28;
                  if ((var17 += var8) >= var11) {
                     g = var12;
                     h = new String[10];
                     short var20 = 16937;
                     long var25 = 6116523479614965537L ^ var14;
                     ewr = "^[a-zA-Z0-9_]{1,16}+$";
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -7038938266478171742L;
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
                     long var32 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     var10001 = -1;
                     p = var32;
                     short var33 = 19729;
                     long var39 = 2620087375076870165L ^ var14;
                     emm = new gbp("Is In Tablist", true);
                     short var34 = 17008;
                     long var40 = 2278501836810962814L ^ var14;
                     bim = new gbp("Valid Name", true);
                     short var35 = 13167;
                     long var41 = 5915192580595889764L ^ var14;
                     cih = new gbp("Name Starts With", true);
                     short var36 = 16216;
                     long var42 = 1855627448400362077L ^ var14;
                     dly = new gbp("Age", true);
                     short var37 = 4326;
                     long var43 = 6004747749489251823L ^ var14;
                     epc = new gbp("Latency", true);
                     return;
                  }

                  var8 = var9.charAt(var17);
                  break;
               default:
                  var12[var10++] = var28;
                  if ((var17 += var8) < var11) {
                     var8 = var9.charAt(var17);
                     continue label37;
                  }

                  var9 = "º\u0099fë5\u000b\u009c÷ø\u0006Üéo\u0087\u0080\u000eìv\u0014\rw®:\u001dfU\u0098-D¬\u00921\u0010Ù\u008c>Í{¬E´Â\u009fà\u0002\u0090Ë\u0089ÿ";
                  var11 = "º\u0099fë5\u000b\u009c÷ø\u0006Üéo\u0087\u0080\u000eìv\u0014\rw®:\u001dfU\u0098-D¬\u00921\u0010Ù\u008c>Í{¬E´Â\u009fà\u0002\u0090Ë\u0089ÿ"
                     .length();
                  var8 = ' ';
                  var17 = -1;
            }

            var18 = var9.substring(++var17, var17 + var8);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31581;
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
            throw new RuntimeException("cc/astralis/ejt", var10);
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
         throw new RuntimeException("cc/astralis/ejt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
