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

public class foz extends guu {
   public final gbp hex;
   public final gbp grq;
   public final gbp fkl;
   public final acn bpn;
   public final acn bxw;
   public final acn ghl;
   private czo aev;
   private static final long a = 116879302526307L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long p;

   public foz() {
      long a = foz.a ^ 109933033485574L;
      super(bfm.VISUAL);
      short var10003 = 25724;
      long var10004 = 2578900222552021332L ^ a;
      a.hex = new gbp("No Score Board", false);
      var10003 = 22816;
      var10004 = 4018155900930302986L ^ a;
      a.grq = new gbp("No Score", true);
      var10003 = 19603;
      var10004 = 6153885259631866296L ^ a;
      a.fkl = new gbp("Change Color", false);
      var10003 = 6577;
      var10004 = 7602985318440002712L ^ a;
      a.bpn = (acn)new acn("Head Color", Color.white).bih(a.fkl::dnp);
      var10003 = 28481;
      var10004 = 7563008660172608109L ^ a;
      a.bxw = (acn)new acn("Body Color", Color.white).bih(a.fkl::dnp);
      var10003 = 28522;
      var10004 = 7484672953785782855L ^ a;
      a.ghl = (acn)new acn("Score Color", Color.red).bih(a.fkl::dnp);
      ffn[] var10001 = new ffn[(int)p];
      var10001[0] = a.hex;
      var10001[1] = a.grq;
      var10001[2] = a.fkl;
      var10001[3] = a.bpn;
      var10001[4] = a.bxw;
      var10001[5] = a.ghl;
      a.bfi(var10001);
   }

   @gdz
   public void dgc(eel event) {
      long ax = foz.a ^ 29779799075010L;
      if (a.aev != null) {
         ;
      }
   }

   public void beb(czo bounds) {
      a.aev = a;
   }

   static {
      long var5 = a ^ 90539083494921L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[6];
      int var12 = 0;
      String var11 = "=Ë\u0010\u0081ó\u000fÆÄ\u007f\u0017\u0086ÊÅþ¶µiq3:O«©1¸üàíN{\u0088Í\u0018^±¹\u0007Þ\u0094\u0094¶@]_ÖÅëóçVyô\u008cw~E\u0005\u0018»IcÙÕ\u00adç¬·m\u0085\u009b\u0095ß\u0005m»=S.x\u007fø: ì5YNÉª\u0081!OPPÜ\"¤\u001e9Ñ|»\u007fL\u008c\u0011Õ&\u009aIAî\u0012Ò#";
      int var13 = "=Ë\u0010\u0081ó\u000fÆÄ\u007f\u0017\u0086ÊÅþ¶µiq3:O«©1¸üàíN{\u0088Í\u0018^±¹\u0007Þ\u0094\u0094¶@]_ÖÅëóçVyô\u008cw~E\u0005\u0018»IcÙÕ\u00adç¬·m\u0085\u009b\u0095ß\u0005m»=S.x\u007fø: ì5YNÉª\u0081!OPPÜ\"¤\u001e9Ñ|»\u007fL\u008c\u0011Õ&\u009aIAî\u0012Ò#"
         .length();
      char var10 = ' ';
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
                     h = new String[6];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -4420283754059087639L;
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

                  var11 = "ø'\u009dTÅ\u0018\u0097o\u0084\u0096\u0083\t¼~^¤Ê\u0099?æÉ\u0085Ï\u0098\u0095vk¥ã\u008a$\u008c \u001aÏ\u0098ÒÙNÒh\u00adüÑs\u0087\u0005ÆñX=×ÿÓVõÎ\u009bbh`\u0086áÎW";
                  var13 = "ø'\u009dTÅ\u0018\u0097o\u0084\u0096\u0083\t¼~^¤Ê\u0099?æÉ\u0085Ï\u0098\u0095vk¥ã\u008a$\u008c \u001aÏ\u0098ÒÙNÒh\u00adüÑs\u0087\u0005ÆñX=×ÿÓVõÎ\u009bbh`\u0086áÎW"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3405;
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
            throw new RuntimeException("cc/astralis/foz", var10);
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
         throw new RuntimeException("cc/astralis/foz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
