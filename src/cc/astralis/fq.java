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

public class fq extends fso {
   private static final long a = 46681459363062L;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public fq() {
      long a = fq.a ^ 97405649313660L;
      String[] var10001 = new String[3];
      short var10004 = 8094;
      long var10005 = 4588032124191278531L ^ a;
      var10001[0] = "ign";
      var10004 = 22663;
      var10005 = 3709508675311944411L ^ a;
      var10001[1] = "name";
      var10001[2] = "n";
      short var10002 = 13841;
      long var10003 = 5126942123791854671L ^ a;
      super(var10001, "Shows you your current name and copies it to youre clip board (.ign)");
   }

   @Override
   public void aov(String[] args, String message) {
      long ax = fq.a ^ 42368858617379L;
      dlc.chi.field_1774.method_1455(dlc.chi.method_1548().method_1676());
      String var10000 = dlc.chi.method_1548().method_1676();
      short var10001 = 5034;
      long var10002 = 7729960818191933610L ^ ax;
      bpa.dhu("Your name is: " + var10000);
   }

   static {
      long var0 = a ^ 120977773717745L;
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
      String var6 = "_äU\u00116\u0010Wä\u0084´6Òèt§Ù\u0010ÎüH{\b#C\u0003ô\u0095\u0014ß{´\u0007a";
      int var8 = "_äU\u00116\u0010Wä\u0084´6Òèt§Ù\u0010ÎüH{\b#C\u0003ô\u0095\u0014ß{´\u0007a".length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     d = new String[4];
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

                  var6 = "\u0082Büÿ\u0086>\u0094\u009aJ4²»RPxÃ1\u0095o³lI»7«\u0003$Ø¡\u0001b \u001e¿ivÞü^kEò\tD\u007fø±û\u0081\u009dïÕKÉýìf·e\u0090\u0011\u009fÏHX$:ù7\\Ña¤\b\bß\u0093\u0087LÒâú\u0091l\u000b\u008ev\u00adý@M\u000b\u0096\u0098\u0088\u0090Mt~8\u0098\u001e)© .\u0083õÙ³/Í\u0085¢ñ¦ô¦A\u000ewX\u008b\u0006øÅ\b\u0087¥«Ââ$6\u009cèÙ";
                  var8 = "\u0082Büÿ\u0086>\u0094\u009aJ4²»RPxÃ1\u0095o³lI»7«\u0003$Ø¡\u0001b \u001e¿ivÞü^kEò\tD\u007fø±û\u0081\u009dïÕKÉýìf·e\u0090\u0011\u009fÏHX$:ù7\\Ña¤\b\bß\u0093\u0087LÒâú\u0091l\u000b\u008ev\u00adý@M\u000b\u0096\u0098\u0088\u0090Mt~8\u0098\u001e)© .\u0083õÙ³/Í\u0085¢ñ¦ô¦A\u000ewX\u008b\u0006øÅ\b\u0087¥«Ââ$6\u009cèÙ"
                     .length();
                  var5 = 'h';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18902;
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
            throw new RuntimeException("cc/astralis/fq", var10);
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
         throw new RuntimeException("cc/astralis/fq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
