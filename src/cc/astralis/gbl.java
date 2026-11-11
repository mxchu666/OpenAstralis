package cc.astralis;

import io.github.humbleui.skija.BackendRenderTarget;
import io.github.humbleui.skija.impl.Stats;
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
import org.jetbrains.annotations.NotNull;

public final class gbl extends BackendRenderTarget {
   private final duz hhu;
   private final long adm;
   private static final long a = 42381225352908L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private gbl(@NotNull duz a, long a) {
      super(a);
      a.hhu = a;
      a.adm = a;
   }

   public static gbl gri(@NotNull duz specs) {
      Stats.onNativeCall();
      long ax = BackendRenderTarget._nMakeGL(a.gqz(), a.bqx(), a.cjo(), a.cjq(), a.bmo(), a.frs().bui());
      return new gbl(a, ax);
   }

   public int brx() {
      return a.hhu.gqz();
   }

   public int eng() {
      return a.hhu.bqx();
   }

   public String toString() {
      long a = gbl.a ^ 77789937911721L;
      int var10000 = a.hhu.gqz();
      int var10001 = a.hhu.bqx();
      int var10002 = a.hhu.cjo();
      int var10003 = a.hhu.cjq();
      int var10004 = a.hhu.bmo();
      String var10005 = String.valueOf(a.hhu.frs());
      String ax = Long.toHexString(a.adm);
      String axx = var10005;
      int axxx = var10004;
      int axxxx = var10003;
      int axxxxx = var10002;
      int axxxxxx = var10001;
      int var9 = var10000;
      short var10 = 12211;
      long var11 = 7387848985714903186L ^ a;
      short var12 = 31969;
      long var13 = 4647290611729603521L ^ a;
      short var10006 = 15922;
      long var10007 = 4389493273020553493L ^ a;
      short var10008 = 28132;
      long var10009 = 783479373163465410L ^ a;
      short var10010 = 21825;
      long var10011 = 5697619961700004450L ^ a;
      short var10012 = 19210;
      long var10013 = 7310025904538037288L ^ a;
      return "GLBackendTarget{size="
         + var9
         + "x"
         + axxxxxx
         + ", samples="
         + axxxxx
         + ", stencilBits="
         + axxxx
         + ", fbId="
         + axxx
         + ", fbFormat="
         + axx
         + ", ptr=0x"
         + ax
         + "}";
   }

   static {
      long var0 = a ^ 113045573207513L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "Gî¢l\u008eG4í\u0083¸\u0080Gþ/Áú:¡èTjâ\u0011H \u0015d\u009c\u008f©¨·\u008e5ô\u00934ÅFñ7þ²D\u0003M\u0082\u0080`>ñ;æçD\u0098§ \u0096Y]º^ü4þwL\tLíÈx½ð¢b( »<¼]d\u0019»}^9ã(\u0086\u0003ä\u001a\u0016Å}+±Ôh'\u0011ÙZ¦û\u0090¡\u009bÜ\\ÿ\bÇ&ÍÔåLvT\u0080\u008dO\u0082øú_:";
      int var8 = "Gî¢l\u008eG4í\u0083¸\u0080Gþ/Áú:¡èTjâ\u0011H \u0015d\u009c\u008f©¨·\u008e5ô\u00934ÅFñ7þ²D\u0003M\u0082\u0080`>ñ;æçD\u0098§ \u0096Y]º^ü4þwL\tLíÈx½ð¢b( »<¼]d\u0019»}^9ã(\u0086\u0003ä\u001a\u0016Å}+±Ôh'\u0011ÙZ¦û\u0090¡\u009bÜ\\ÿ\bÇ&ÍÔåLvT\u0080\u008dO\u0082øú_:"
         .length();
      char var5 = 24;
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
                     b = var9;
                     c = new String[6];
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

                  var6 = "»pmJ\u0010\u0088xë;\u0084]¸l\u0081Õ\u008c »ë8«dµ\u0085\u008d1Þ+\u0019èL\\NÞËd8D\u0001IWsd\u000fk»Ê%Õ";
                  var8 = "»pmJ\u0010\u0088xë;\u0084]¸l\u0081Õ\u008c »ë8«dµ\u0085\u008d1Þ+\u0019èL\\NÞËd8D\u0001IWsd\u000fk»Ê%Õ".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32327;
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
            throw new RuntimeException("cc/astralis/gbl", var10);
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
         throw new RuntimeException("cc/astralis/gbl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
