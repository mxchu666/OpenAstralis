package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_476;

public class ChestStealer extends guu {
   private final bes auy;
   private final gbp avy;
   private final gbp eh;
   private final dxl cam;
   private long ebb;
   private static final long a = 47939717910427L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long p;

   public ChestStealer() {
      long a = ChestStealer.a ^ 119405682871492L;
      super(bfm.PLAYER);
      short var10003 = 1846;
      long var10004 = 768658066698653175L ^ a;
      a.auy = new bes("Delay", 100.0F, 0.0F, 500.0F, 1.0F);
      short var3 = 101;
      var10004 = 2143970710884108965L ^ a;
      a.avy = new gbp("Auto Close", true);
      var3 = 24323;
      var10004 = 8929555761156789700L ^ a;
      a.eh = new gbp("Check title", true);
      var3 = 16091;
      var10004 = 7012683392751596568L ^ a;
      short var9 = 2926;
      long var10005 = 7459371068532343212L ^ a;
      a.cam = (dxl)new dxl("Title to check for", "Chest").bih(a.eh::dnp);
      a.bfi(new ffn[]{a.auy, a.avy, a.eh, a.cam});
   }

   @gdz
   public void dwo(bsm event) {
      long ax = ChestStealer.a ^ 128213283915996L;
      int[] axx = dar.abu();
      class_310 var10000 = chi;
      if (axx != null) {
         if (chi.field_1724 == null) {
            return;
         }

         var10000 = chi;
      }

      if (axx != null) {
         if (var10000.field_1761 == null) {
            return;
         }

         var10000 = chi;
      }

      if (axx != null) {
         if (var10000.field_1687 == null) {
            return;
         }

         var10000 = chi;
      }

      class_437 axxx = var10000.field_1755;
      class_437 var18 = axxx;
      if (axx != null) {
         if (!(axxx instanceof class_476)) {
            return;
         }

         var18 = axxx;
      }

      class_476 axxxx = (class_476)var18;
      if (axx != null) {
         a = (class_1707)axxxx.method_17577();
         var19 = a.eh.dnp();
         label146:
         if (axx != null) {
            if (var19 != 0) {
               String axxxxx = axxxx.method_25440().getString();
               var19 = axxxxx.toLowerCase().contains(a.cam.dnp().toLowerCase());
               if (axx == null) {
                  break label146;
               }

               if (var19 == 0) {
                  return;
               }
            }

            var19 = a.field_7761.size() - (int)p;
         }

         int axxxxxx = var19;
         boolean axxxxxxx = true;
         int axxxxxxxx = axxxxxx;

         while (true) {
            label136:
            if (axxxxxxxx < a.field_7761.size()) {
               var20 = a.field_7761;
               if (axx == null) {
                  break;
               }

               label133: {
                  byte var21 = ((class_1735)a.field_7761.get(axxxxxxxx)).method_7677().method_7960();
                  if (axx != null) {
                     if (var21 == 0) {
                        break label133;
                     }

                     var21 = 0;
                  }

                  axxxxxxx = (boolean)var21;
                  if (axx != null) {
                     break label136;
                  }
               }

               axxxxxxxx++;
               if (axx != null) {
                  continue;
               }
            }

            var20 = chi.field_1724.field_7512.field_7761;
            break;
         }

         int axxxxxxxxx;
         cxs axxxxxxxxxx = cwp.dwm(var20);
         List<class_1735> axxxxxxxxxxx = axxxxxxxxxx.dsa();
         List<class_1735> axxxxxxxxxxxx = new ArrayList<>(chi.field_1724.field_7512.field_7761.stream().filter(axxxxxxxxxxxxx -> {
            long ax = ChestStealer.a ^ 101289144067153L;
            int[] var4x = dar.abu();
            class_1735 var10000x = axxxxxxxxxxxxx;
            if (var4x != null) {
               if (axxxxxxxxxxxxx.field_7871 == chi.field_1724.method_31548()) {
                  return false;
               }

               var10000x = axxxxxxxxxxxxx;
            }

            boolean var5x = var10000x.method_7681();
            if (var4x != null) {
               if (!var5x) {
                  return false;
               }

               var5x = a.contains(axxxxxxxxxxxxx);
            }

            return var4x == null ? var5x : !var5x;
         }).toList());
         boolean axxxxxxxxxxxxx = axxxxxxxxxxxx.isEmpty();
         axxxxxxxxx = a.auy.dnp().intValue();
         var22 = axxxxxxxxxxxxx;
         label121:
         if (axx != null) {
            if (axxxxxxxxxxxxx == 0) {
               var22 = axxxxxxx;
               if (axx == null) {
                  break label121;
               }

               if (axxxxxxx == 0) {
                  if (System.currentTimeMillis() - a.ebb < axxxxxxxxx) {
                     return;
                  }

                  a.ebb = System.currentTimeMillis();
                  Collections.shuffle(axxxxxxxxxxxx);
                  class_1735 axxxxxxxxxxxxxx = axxxxxxxxxxxx.remove(0);
                  chi.field_1761.method_2906(chi.field_1724.field_7512.field_7763, axxxxxxxxxxxxxx.field_7874, 0, class_1713.field_7794, chi.field_1724);
                  if (axx != null) {
                     return;
                  }
               }
            }

            var22 = axxxxxxxxxxxxx;
         }

         label109:
         if (axx != null) {
            if (var22 == 0) {
               var22 = axxxxxxx;
               if (axx == null) {
                  break label109;
               }

               if (axxxxxxx == 0) {
                  return;
               }
            }

            var22 = a.avy.dnp();
         }

         if (axx != null) {
            if (var22 == 0) {
               return;
            }

            long var23;
            var22 = (var23 = System.currentTimeMillis() - a.ebb - axxxxxxxxx) == 0L ? 0 : (var23 < 0L ? -1 : 1);
         }

         if (var22 >= 0) {
            a.ebb = System.currentTimeMillis();
            chi.field_1724.method_7346();
         }
      }
   }

   static {
      long var5 = a ^ 36437890828267L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[5];
      int var12 = 0;
      String var11 = "l¼+æÅt\u0000\u0002\u0001`¿vx9]Ð!\u0096·Ç\u0091¢ôü=\u0013íP\u00adm\u0001±\u008e¿¸\n\u0002dÆÀ\u0010-»¤\u0088\u009cP}'\u0087myþ÷\u001aëv\u0010\u0088rÜ[ù`Æ\u0091ñ·ÏKß3ÌU";
      int var13 = "l¼+æÅt\u0000\u0002\u0001`¿vx9]Ð!\u0096·Ç\u0091¢ôü=\u0013íP\u00adm\u0001±\u008e¿¸\n\u0002dÆÀ\u0010-»¤\u0088\u009cP}'\u0087myþ÷\u001aëv\u0010\u0088rÜ[ù`Æ\u0091ñ·ÏKß3ÌU"
         .length();
      char var10 = '(';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = d(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     g = var14;
                     h = new String[5];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -5651726540171902256L;
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
                     long var30 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     var10001 = -1;
                     p = var30;
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = "GF\u0003Þ¿\u009b²¬Qá®-å\u008aC\u0089/^\u0095¯\bGÛ¼É\u00929\u008e\u0098íL\u0088 \t\u0088R>»\u0085\\×\u009cK\u0005\u00075t&û*§\u001f<÷ïÈà\u001aä\u008d\u0000F\u0091\u0089ÿ";
                  var13 = "GF\u0003Þ¿\u009b²¬Qá®-å\u008aC\u0089/^\u0095¯\bGÛ¼É\u00929\u008e\u0098íL\u0088 \t\u0088R>»\u0085\\×\u009cK\u0005\u00075t&û*§\u001f<÷ïÈà\u001aä\u008d\u0000F\u0091\u0089ÿ"
                     .length();
                  var10 = ' ';
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18844;
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
            throw new RuntimeException("cc/astralis/hdw", var10);
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
         throw new RuntimeException("cc/astralis/hdw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
