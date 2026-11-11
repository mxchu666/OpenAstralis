package cc.astralis;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class frf extends fig {
   private final cyx dmp;
   private static final long a = 84070762282225L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public frf(cyx classModeProperty) {
      a.dmp = a;
      a.dtq(a);
      a.hh(130.0F);
      a.cje(15.0F);
   }

   @Override
   public void bfi(float mouseX, float mouseY) {
      long ax;
      String var10;
      label16: {
         ax = frf.a ^ 52700898939586L;
         int[] var10000 = dar.abu();
         hcr axx = a.dmp.dnp();
         int[] axxx = var10000;
         hcr var9 = axx;
         if (axxx != null) {
            if (axx == null) {
               short var11 = 29065;
               long var10001 = 1918809685412497757L ^ ax;
               var10 = "None";
               break label16;
            }

            var9 = axx;
         }

         var10 = var9.akm();
      }

      String axx = var10;
      var10 = a.dmp.fah();
      short var10002 = 3553;
      long var10003 = 508038111866565940L ^ ax;
      String axxx = var10 + ": " + axx;
      ety.ebb(axxx, a.hjg() + 4.0F, a.dtt() + 3.0F, Color.WHITE);
   }

   @Override
   public void apy(double mouseX, double mouseY, int button) {
      long ax;
      int[] axx;
      hcr axxx;
      String var17;
      label31: {
         ax = frf.a ^ 98653601920566L;
         int[] var10000 = dar.abu();
         axxx = a.dmp.dnp();
         axx = var10000;
         hcr var16 = axxx;
         if (axx != null) {
            if (axxx == null) {
               short var18 = 28668;
               long var10001 = 5310277267603813343L ^ ax;
               var17 = "None";
               break label31;
            }

            var16 = axxx;
         }

         var17 = var16.akm();
      }

      String axxxx = var17;
      var17 = a.dmp.fah();
      short var10002 = 13699;
      long var10003 = 7208630740358179233L ^ ax;
      String axxxxx = var17 + ": " + axxxx;
      if (fuv.bfm(a, a, a.hjg() + 4.0F, a.dtt() + 2.0F, ety.eq(axxxxx), ety.biu(axxxxx))) {
         List<hcr> axxxxxx = new ArrayList<>(a.dmp.ajs().values());
         int axxxxxxx = axxxxxx.indexOf(axxx);
         int axxxxxxxx = (axxxxxxx + 1) % axxxxxx.size();
         hcr axxxxxxxxx = axxxxxx.get(axxxxxxxx);
         hcr var20 = axxx;
         if (axx != null) {
            if (axxx != null) {
               axxx.frr(false);
            }

            var20 = axxxxxxxxx;
         }

         var20.frr(true);
         a.dmp.biz(axxxxxxxxx);
      }
   }

   static {
      long var0 = a ^ 87528666650379L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "Ïër\u0095¶\u0088¤ÜvhQ{Ä)\u0015Ò\u0010\u0084øùá\u0006û\u0000}'Aä¤WV^Ó";
      int var8 = "Ïër\u0095¶\u0088¤ÜvhQ{Ä)\u0015Ò\u0010\u0084øùá\u0006û\u0000}'Aä¤WV^Ó".length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[4];
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

                  var6 = "e5CÄ÷E*2¹>\rRJ6½J\u0010Iæ³QªÒyë2y´ñ\f|~¿";
                  var8 = "e5CÄ÷E*2¹>\rRJ6½J\u0010Iæ³QªÒyë2y´ñ\f|~¿".length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5863;
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
            throw new RuntimeException("cc/astralis/frf", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("cc/astralis/frf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
