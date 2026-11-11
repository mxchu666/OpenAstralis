package cc.astralis;

import com.mojang.util.UndashedUuid;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_320;

public class gfv {
   private blg ez = new blg();
   private String goz;
   private String dyh;
   private String ezo;
   private boolean gmr;
   private static String gr;
   private static final long a = 3456503866442L;

   public gfv(String name, String token, String uuid, boolean premium) {
      a.ezo = a;
      a.goz = a;
      a.dyh = a;
      a.gmr = a;
   }

   public gfv(String name, String token, String uuid) {
      a.ezo = a;
      a.goz = a;
      a.dyh = a;
      a.gmr = false;
   }

   public gfv(class_320 session) {
      long ax = gfv.a ^ 52702147181746L;
      super();
      a.ez = new blg();
      a.ezo = a.method_1676();
      int[] var10000 = dar.abu();
      a.goz = a.method_1674();
      int[] var4 = var10000;
      a.dyh = UndashedUuid.toString(a.method_44717());
      boolean var10001 = a.method_1674().isEmpty();
      if (var4 != null) {
         var10001 = !var10001;
      }

      a.gmr = var10001;
   }

   public UUID dic() {
      return ehy.duo(a.dyh);
   }

   public blg ern() {
      return a.ez;
   }

   public String gpj() {
      return a.goz;
   }

   public String hal() {
      return a.dyh;
   }

   public String gwo() {
      return a.ezo;
   }

   public boolean cit() {
      return a.gmr;
   }

   public void fxi(blg altGUI) {
      a.ez = a;
   }

   public void gfe(String token) {
      a.goz = a;
   }

   public void gtk(String uuid) {
      a.dyh = a;
   }

   public void ayw(String name) {
      a.ezo = a;
   }

   public void apq(boolean premium) {
      a.gmr = a;
   }

   public static void dsc(String var0) {
      gr = var0;
   }

   public static String btd() {
      return gr;
   }

   static {
      long var4 = a ^ 139717225077163L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var4 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var4 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("GGRd9b".getBytes("ISO-8859-1"));
      String var6 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var6;
      if (btd() != null) {
         dsc(var0);
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
