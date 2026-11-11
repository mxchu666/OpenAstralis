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
import net.minecraft.class_2596;
import net.minecraft.class_7439;

public class chx extends cec {
   private static final long a = 67448729663455L;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   @gdz
   public void bcm(amo packetEvent) {
      long ax = chx.a ^ 27689445078950L;
      int[] var10000 = dar.abu();
      class_2596 var6 = a.bed();
      int[] axx = var10000;
      class_2596 var7 = var6;
      if (axx != null) {
         if (!(var6 instanceof class_7439)) {
            return;
         }

         var7 = var6;
      }

      class_7439 axxx = (class_7439)var7;
      String var8 = axxx.comp_763().getString();
      if (axx != null) {
         short var10001 = 13400;
         long var10002 = 8428692100059697602L ^ ax;
         if (!var8.equalsIgnoreCase("An exception occurred in your connection, so you have been routed to limbo!")) {
            return;
         }

         long var9 = System.currentTimeMillis();
         var10001 = 25962;
         var10002 = 4373542943987351793L ^ ax;
         var8 = "Limbo Detected at" + var9;
      }

      bpa.dhu(var8);
   }

   static {
      long var0 = a ^ 22740105799372L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "÷·D\u0088Ä\u009ap}H\u0011»\u00ad\u0092;Ø<\u008b\u001c?>\u0087\u0005b\u0087ËusÄ\u008ada»öâ~\u0080\u0012\u008a\u001c\u001f\u0084\u0007\u0093\u0002ÿL=c·ºñß\u0001D\u001d;i\bX\u001cÙi\u0000\u0092\u0095Ú\u0094PbßRb\u0099\u000eØÿf\u0085v¸§8\u009d7ä4\u0007\u0094Â¢Rê\u0090\u0012*GU½Cä|dC*¦uS3èè,bi\u0090wIÈoVí(2ôÑF¤Ýw\u0016à\u00047)O?HÃ¿/uaþ\u0015é¯äIx\u008dslª×¦\u0019\u009eV(\u0005uÁ";
      int var8 = "÷·D\u0088Ä\u009ap}H\u0011»\u00ad\u0092;Ø<\u008b\u001c?>\u0087\u0005b\u0087ËusÄ\u008ada»öâ~\u0080\u0012\u008a\u001c\u001f\u0084\u0007\u0093\u0002ÿL=c·ºñß\u0001D\u001d;i\bX\u001cÙi\u0000\u0092\u0095Ú\u0094PbßRb\u0099\u000eØÿf\u0085v¸§8\u009d7ä4\u0007\u0094Â¢Rê\u0090\u0012*GU½Cä|dC*¦uS3èè,bi\u0090wIÈoVí(2ôÑF¤Ýw\u0016à\u00047)O?HÃ¿/uaþ\u0015é¯äIx\u008dslª×¦\u0019\u009eV(\u0005uÁ"
         .length();
      char var5 = 'x';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            c = var9;
            d = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26083;
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
            throw new RuntimeException("cc/astralis/chx", var10);
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
         d[var5] = c(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("cc/astralis/chx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
