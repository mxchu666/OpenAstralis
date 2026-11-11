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
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_2848;
import net.minecraft.class_746;
import net.minecraft.class_2848.class_2849;

public class gey extends guu {
   private final adu cnd;
   private final bes cyl;
   private final bes evs;
   private boolean hdk;
   private static final long a = 68628767459009L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public gey() {
      long a = gey.a ^ 90487867948822L;
      super(bfm.COMBAT);
      short var10003 = 23415;
      long var10004 = 3908225119537099050L ^ a;
      short var5 = 16209;
      long var10005 = 9096016147769693455L ^ a;
      String[] var8 = new String[3];
      short var10008 = 16209;
      long var10009 = 9096016147769693455L ^ a;
      var8[0] = "W-Tap";
      var10008 = 13750;
      var10009 = 4919897966801035247L ^ a;
      var8[1] = "S-Tap";
      var10008 = 24268;
      var10009 = 2668477629523260564L ^ a;
      var8[2] = "Packet";
      a.cnd = new adu("Mode", "W-Tap", var8);
      var10003 = 21377;
      var10004 = 5403763523543759323L ^ a;
      a.cyl = (bes)new bes("Packets", 2.0F, 2.0F, 10.0F, 1.0F).bih(() -> {
         long ax = gey.a ^ 89174231249996L;
         short var10001 = 24268;
         long var10002 = 2668476315712536526L ^ ax;
         return a.cnd.emb("Packet");
      });
      var10003 = 27261;
      var10004 = 295775842987130913L ^ a;
      a.evs = new bes("Max Hurt Time", 1.0F, 1.0F, 10.0F, 1.0F);
      a.hdk = false;
      a.bfi(new ffn[]{a.cnd, a.cyl, a.evs});
   }

   @gdz
   public void dqa(fxx event) {
      a.hdk = false;
   }

   @gdz
   public void fav(eov event) {
      long ax = gey.a ^ 29104552126045L;
      int[] var10000 = dar.abu();
      class_1297 axx = a.hfw();
      int[] axxx = var10000;
      class_1297 var26 = axx;
      if (axxx != null) {
         if (!(axx instanceof class_1309)) {
            return;
         }

         var26 = axx;
      }

      class_1309 axxxx = (class_1309)var26;
      if (axxx != null) {
         int var27 = axxxx.method_5805();
         if (axxx != null) {
            if (var27 == 0) {
               return;
            }

            var27 = axxxx.field_6235;
         }

         if (var27 < a.evs.dnp().intValue()) {
            class_746 axxxxx = chi.field_1724;
            var10000 = (int[])axxxxx;
            if (axxx != null) {
               if (axxxxx == null) {
                  return;
               }

               var10000 = (int[])a.cnd.dnp();
            }

            String var7 = (String)var10000;
            byte var8 = -1;
            var29 = var7.hashCode();
            label223:
            if (axxx != null) {
               switch (var29) {
                  case -1911998296:
                     var29 = var7.equals(b<"b">(26056, 3045140631998027475L ^ ax));
                     if (axxx == null) {
                        break label223;
                     }

                     if (var29 == 0) {
                        break;
                     }

                     var8 = 0;
                     if (axxx != null) {
                        break;
                     }
                  case 81770765:
                     var29 = var7.equals(b<"b">(16209, 9096077497237474372L ^ ax));
                     if (axxx == null) {
                        break label223;
                     }

                     if (var29 == 0) {
                        break;
                     }

                     var8 = 1;
                     if (axxx != null) {
                        break;
                     }
                  case 78076681:
                     var29 = var7.equals(b<"b">(13750, 4919818750738532004L ^ ax));
                     if (axxx == null) {
                        break label223;
                     }

                     if (var29 != 0) {
                        var8 = 2;
                     }
               }

               var29 = var8;
            }

            label244: {
               if (axxx != null) {
                  switch (var29) {
                     case 0:
                        var29 = axxxxx.method_5624();
                        break;
                     case 1:
                     case 2:
                        break label244;
                     default:
                        return;
                  }
               }

               if (axxx != null) {
                  if (var29 != 0) {
                     gix.dsd(new class_2848(axxxxx, class_2849.field_12985));
                  }

                  var29 = 0;
               }

               int axxxxxx = var29;

               label195: {
                  while (axxxxxx < a.cyl.dnp().intValue() - 2) {
                     var30 = axxxxxx % 2;
                     if (axxx == null) {
                        break label195;
                     }

                     class_2849 axxxxxxx = var30 == 0 ? class_2849.field_12981 : class_2849.field_12985;
                     gix.dsd(new class_2848(axxxxx, axxxxxxx));
                     axxxxxx++;
                     if (axxx == null) {
                        break;
                     }
                  }

                  var30 = axxxxx.method_5624();
               }

               if (var30 != 0) {
                  return;
               }

               gix.dsd(new class_2848(axxxxx, class_2849.field_12981));
               if (axxx != null) {
                  return;
               }
            }

            label180: {
               label179: {
                  label246: {
                     double var40;
                     int var31 = (var40 = axxxxx.field_6014 - 0.0) == 0.0 ? 0 : (var40 < 0.0 ? -1 : 1);
                     if (axxx != null) {
                        if (var31) {
                           break label179;
                        }

                        var32 = axxxxx;
                        if (axxx == null) {
                           break label246;
                        }

                        double var41;
                        var31 = (var41 = axxxxx.field_5969 - 0.0) == 0.0 ? 0 : (var41 < 0.0 ? -1 : 1);
                     }

                     if (var31) {
                        break label179;
                     }

                     var32 = axxxxx;
                  }

                  var33 = var32.method_73189();
                  break label180;
               }

               var33 = new class_243(axxxxx.field_6014, axxxxx.field_6036, axxxxx.field_5969);
            }

            class_243 axxxxxx;
            class_243 axxxxxxx;
            label166: {
               label165: {
                  label248: {
                     axxxxxx = var33;
                     axxxxxxx = axxxxx.method_73189();
                     double var42;
                     int var34 = (var42 = axxxx.field_6014 - 0.0) == 0.0 ? 0 : (var42 < 0.0 ? -1 : 1);
                     if (axxx != null) {
                        if (var34) {
                           break label165;
                        }

                        var35 = axxxx;
                        if (axxx == null) {
                           break label248;
                        }

                        double var43;
                        var34 = (var43 = axxxx.field_5969 - 0.0) == 0.0 ? 0 : (var43 < 0.0 ? -1 : 1);
                     }

                     if (var34) {
                        break label165;
                     }

                     var35 = axxxx;
                  }

                  var36 = var35.method_73189();
                  break label166;
               }

               var36 = new class_243(axxxx.field_6014, axxxx.field_6036, axxxx.field_5969);
            }

            class_243 axxxxxxxx = var36;
            class_243 axxxxxxxxx = axxxx.method_73189();
            double axxxxxxxxxx = axxxxxxxxx.method_1020(axxxxxx).method_37267();
            double axxxxxxxxxxx = axxxxxxxxx.method_1020(axxxxxxx).method_37267();
            double axxxxxxxxxxxx = axxxxxxx.method_1020(axxxxxxxx).method_37267();
            double axxxxxxxxxxxxx = axxxxxxx.method_1020(axxxxxxxxx).method_37267();
            double var44;
            int var37 = (var44 = axxxxxxxxxx - axxxxxxxxxxx) == 0.0 ? 0 : (var44 < 0.0 ? -1 : 1);
            if (axxx != null) {
               var37 = var37 > 0 ? 1 : 0;
            }

            boolean axxxxxxxxxxxxxx = (boolean)var37;
            double var45;
            int var38 = (var45 = axxxxxxxxxxxx - axxxxxxxxxxxxx) == 0.0 ? 0 : (var45 < 0.0 ? -1 : 1);
            if (axxx != null) {
               var38 = var38 > 0 ? 1 : 0;
            }

            boolean axxxxxxxxxxxxxxx = (boolean)var38;
            int var39 = axxxxxxxxxxxxxx;
            if (axxx != null) {
               if (axxxxxxxxxxxxxx == 0) {
                  return;
               }

               var39 = axxxxxxxxxxxxxxx;
            }

            if (var39 != 0) {
               a.hdk = true;
            }
         }
      }
   }

   @gdz
   public void gfv(dfa event) {
      long ax = gey.a ^ 86134256942529L;
      int[] axx = dar.abu();
      Object var10000 = a;
      if (axx != null) {
         if (!a.hdk) {
            return;
         }

         var10000 = a.cnd.dnp();
      }

      String var5 = (String)var10000;
      byte var6 = -1;
      var7 = var5.hashCode();
      label57:
      if (axx != null) {
         switch (var7) {
            case 81770765:
               short var10001 = 21727;
               long var10002 = 3474723481049136211L ^ ax;
               var7 = var5.equals("W-Tap");
               if (axx == null) {
                  break label57;
               }

               if (var7 == 0) {
                  break;
               }

               var6 = 0;
               if (axx != null) {
                  break;
               }
            case 78076681:
               short var8 = 14334;
               long var9 = 7674222688626450294L ^ ax;
               var7 = var5.equals("S-Tap");
               if (axx == null) {
                  break label57;
               }

               if (var7 != 0) {
                  var6 = 1;
               }
         }

         var7 = var6;
      }

      switch (var7) {
         case 0:
            a.avm(0.0F);
            a.brl(0.0F);
            if (axx != null) {
               break;
            }
         case 1:
            a.avm(a.aop() * -1.0F);
            a.brl(a.eyl() * -1.0F);
      }
   }

   static {
      long var0 = a ^ 37061451399146L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "\\ÔW\u008ct\u0088\u0081\u0012\u0099ÅhÜ>\u0096»É\u0010ß´þ]#ë¼\u0092ðÔÐrÿ¥²_\u0010Zm\u009brl;\u0000á,\u009an b\\Lí\u0010¬ÑuWðN\u0082ßúYoì¾S¶J\u0018HA6¨¢\u001cl\u00898\u0097¥È²Lì\u0097x°ãHlÏax\u0010\u001aÃÓ\u0004Ñ(Ö\u009f«á\u009aNëðÌ|\u0010]m\u009dªã¼$\\\u0094-J®5\u001eïf";
      int var8 = "\\ÔW\u008ct\u0088\u0081\u0012\u0099ÅhÜ>\u0096»É\u0010ß´þ]#ë¼\u0092ðÔÐrÿ¥²_\u0010Zm\u009brl;\u0000á,\u009an b\\Lí\u0010¬ÑuWðN\u0082ßúYoì¾S¶J\u0018HA6¨¢\u001cl\u00898\u0097¥È²Lì\u0097x°ãHlÏax\u0010\u001aÃÓ\u0004Ñ(Ö\u009f«á\u009aNëðÌ|\u0010]m\u009dªã¼$\\\u0094-J®5\u001eïf"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = d(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     g = var9;
                     h = new String[9];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\u0017d_\u0095PrS~\u009a×N\u0010I\u001fö\u0086\u0010ì@h\u009b@%\u007f³\u000f\u0092o°2ðª\u008e";
                  var8 = "\u0017d_\u0095PrS~\u009a×N\u0010I\u001fö\u0086\u0010ì@h\u009b@%\u007f³\u000f\u0092o°2ðª\u008e".length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21391;
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
            throw new RuntimeException("cc/astralis/gey", var10);
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
         throw new RuntimeException("cc/astralis/gey" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
