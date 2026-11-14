package cc.astralis;

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
import net.minecraft.class_1292;
import net.minecraft.class_1293;

public class PotionStatus extends guu {
   private final env enk;
   private static final long a = 21126104831531L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public PotionStatus() {
      long a = PotionStatus.a ^ 73035754367783L;
      super(bfm.VISUAL);
      short var10003 = 14920;
      long var10004 = 7591804132217979527L ^ a;
      a.enk = new env("Potion Indicator", 4.0F, 50.0F, 100.0F, 100.0F);
      fjk.bfv.add(a.enk);
   }

   @gdz
   public void cql(ctt event) {
      long ax = PotionStatus.a ^ 75410712877390L;
      int[] var10000 = dar.abu();
      float axx = a.enk.grp();
      float axxx = a.enk.azb();
      int[] axxxx = var10000;
      float axxxxx = 100.0F;
      float axxxxxx = 15.0F;
      int axxxxxxx = (int)(axxx + 15.0F);
      int axxxxxxxx = 0;
      int axxxxxxxxx = fey.epm().size();
      short var10002 = 17374;
      long var10003 = 8297806235342848318L ^ ax;
      short var19 = 4452;
      long var10004 = 44215967688037253L ^ ax;
      short var20 = 4452;
      long var10005 = 44215967688037253L ^ ax;
      Color axxxxxxxxxx = new Color(30, 30, 30);
      float axxxxxxxxxxx = !chi.field_1724.method_6026().isEmpty() ? 0.0F : 3.0F;
      dmp.caz(axx, axxx, 100.0F, 15.0F, 3.0F, 3.0F, axxxxxxxxxxx, axxxxxxxxxxx, dar.gqy().deo());
      short var10001 = 26661;
      long var18 = 3665357341656769154L ^ ax;
      ety.hbb("Active Potion Effects", axx, axxx, 100.0F, 15.0F, Color.white);

      for (class_1293 axxxxxxxxxxxx : chi.field_1724.method_6026()) {
         label33: {
            label32: {
               if (axxxx != null) {
                  if (axxxxxxxx == axxxxxxxxx - 1) {
                     break label32;
                  }

                  dmp.euv(axx, axxxxxxx, 100.0F, 10.0F, axxxxxxxxxx);
               }

               if (axxxx != null) {
                  break label33;
               }
            }

            dmp.caz(axx, axxxxxxx, 100.0F, 12.0F, 0.0F, 0.0F, 3.0F, 3.0F, axxxxxxxxxx);
         }

         String axxxxxxxxxxxxx = fey.esz(axxxxxxxxxxxx).getString();
         String axxxxxxxxxxxxxx = class_1292.method_5577(axxxxxxxxxxxx, 1.0F, chi.field_1687.method_54719().method_54748()).getString();
         ety.hbb(axxxxxxxxxxxxx + " " + axxxxxxxxxxxxxx, axx, axxxxxxx, 100.0F, 10.0F, Color.white);
         axxxxxxx += 10;
         axxxxxxxx++;
         if (axxxx == null) {
            break;
         }
      }
   }

   static {
      long var11 = a ^ 114063817016481L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[2];
      int var18 = 0;
      String var17 = "\u000euå×\u0095\u0098ó®\u009e©b\u008a\u0095Rã2\u0093ÕÅ\u008byd\u0003Ok)üà§uóÑ÷\u0089\u000bÿ\u0097éT³(4;5\"§\u0093ê\u0082ÔàbGB×ê\u009eÄ];ð\u0003\u000fë`\u0002Wf×Ú@Ð«\u0090\u0011Ô·\u008a§Ù\u008e";
      int var19 = "\u000euå×\u0095\u0098ó®\u009e©b\u008a\u0095Rã2\u0093ÕÅ\u008byd\u0003Ok)üà§uóÑ÷\u0089\u000bÿ\u0097éT³(4;5\"§\u0093ê\u0082ÔàbGB×ê\u009eÄ];ð\u0003\u000fë`\u0002Wf×Ú@Ð«\u0090\u0011Ô·\u008a§Ù\u008e"
         .length();
      char var16 = '(';
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var27 = d(var21).intern();
         int var10001 = -1;
         var20[var18++] = var27;
         if ((var15 += var16) >= var19) {
            g = var20;
            h = new String[2];
            r = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "X\u001c\u0090\u0015\u008e>¬\u0016¸\u0092[aV`^Ì";
            int var5 = "X\u001c\u0090\u0015\u008e>¬\u0016¸\u0092[aV`^Ì".length();
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
               byte var31 = -1;
               var6[var10001] = var10004;
            } while (var2 < var5);

            p = var6;
            q = new Integer[2];
            return;
         }

         var16 = var17.charAt(var15);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1474;
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
            throw new RuntimeException("cc/astralis/dad", var10);
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
         throw new RuntimeException("cc/astralis/dad" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3460;
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
            throw new RuntimeException("cc/astralis/dad", var14);
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
         throw new RuntimeException("cc/astralis/dad" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
