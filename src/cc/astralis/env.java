package cc.astralis;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class env {
   private final String gdl;
   private float ema;
   private float cgf;
   private float ffq;
   private float eoy;
   private static String eik;

   public void evg(double mouseX, double mouseY) {
      a.biu((float)a);
      a.dfy((float)a);
   }

   public String cdc() {
      return a.gdl;
   }

   public float grp() {
      return a.ema;
   }

   public float azb() {
      return a.cgf;
   }

   public float cxc() {
      return a.ffq;
   }

   public float evg() {
      return a.eoy;
   }

   public void biu(float x) {
      a.ema = a;
   }

   public void dfy(float y) {
      a.cgf = a;
   }

   public void faq(float width) {
      a.ffq = a;
   }

   public void del(float height) {
      a.eoy = a;
   }

   public env(String name, float x, float y, float width, float height) {
      a.gdl = a;
      a.ema = a;
      a.cgf = a;
      a.ffq = a;
      a.eoy = a;
   }

   public static void fbv(String var0) {
      eik = var0;
   }

   public static String fnf() {
      return eik;
   }

   static {
      long var4 = gls.a(-3704739937896541746L, -767313843929166285L, MethodHandles.lookup().lookupClass()).a(173053378125004L) ^ 136881323500074L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var4 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var4 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u0088\u0019¦\u0098\u0007ÐÅØ".getBytes("ISO-8859-1"));
      String var6 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var6;
      if (fnf() == null) {
         fbv(var0);
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
}
