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

public class bam {
   private static final fxm cd;
   private static final long a = 44757174269551L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static String asl() {
      return cd.fty();
   }

   public static String aeb() {
      long var0 = a ^ 23824308007983L;
      short var10000 = 4351;
      long var10001 = 6089988196863010849L ^ var0;
      short var2 = 23870;
      long var10002 = 7065520277129897447L ^ var0;
      return System.getProperty("os.arch", "unknown");
   }

   public static String gzo() {
      long var0 = a ^ 34445384367260L;
      short var10000 = 471;
      long var10001 = 8123427758929260990L ^ var0;
      short var2 = 13002;
      long var10002 = 210834575314584225L ^ var0;
      return System.getProperty("os.version", "unknown");
   }

   public static int bma() {
      return Runtime.getRuntime().availableProcessors();
   }

   public static String dvt() {
      long var0 = a ^ 11605368731074L;
      short var10000 = 10905;
      long var10001 = 6195216438724449191L ^ var0;
      short var2 = 29398;
      long var10002 = 2575587421017967593L ^ var0;
      return System.getProperty("user.language", "en");
   }

   public static String hfo(String key) {
      long ax = bam.a ^ 88894671104933L;
      int[] var10000 = dar.abu();
      String axx = System.getenv(a);
      int[] axxx = var10000;
      String var5 = axx;
      if (axxx != null) {
         var5 = axx != null ? axx : "";
      }

      return var5;
   }

   public static fxm eta() {
      long a = bam.a ^ 66399396095811L;
      short var10000 = 10633;
      long var10001 = 2058080369554244152L ^ a;
      String ax = System.getProperty("os.name", "").toLowerCase();
      short var3 = 8954;
      long var10002 = 622210307559704903L ^ a;
      if (ax.contains("win")) {
         return fxm.WIN;
      } else {
         short var4 = 29765;
         var10002 = 8524591600682901494L ^ a;
         if (ax.contains("mac")) {
            return fxm.MAC;
         } else {
            short var5 = 13406;
            var10002 = 5660592022499876841L ^ a;
            if (!ax.contains("nux")) {
               short var6 = 9574;
               var10002 = 8256284140443389654L ^ a;
               if (!ax.contains("nix")) {
                  short var7 = 29771;
                  var10002 = 3306278641067073527L ^ a;
                  if (!ax.contains("aix")) {
                     return fxm.UNK;
                  }
               }
            }

            return fxm.LNX;
         }
      }
   }

   static {
      long var0 = a ^ 133548391433036L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "F Ò]\u001bå\u001d\u0098Ù_øL¤ÔôZ\u0010è\fùøãê1ö*ñ¿ZÈ¶Éh\u0010Ð²\u0096AÐZ\u0012ì{\u008fýÖj°P@ ÀÚÍù@FÆ\u001a\u008ez\u0002\u0091Ub(\u0091\u009b\u0015\u0092!Æ§\u0090·ß\u008aþ¶M\u0001:Z\u0010r\u009b^æ9\u0014l\u0010þ.öü«¢\u0010\u0011\u0018\\´\r·n\rF+H'\u0016Ò![ó0\bIGû\u001c\u00971m\u0010î[ÊÒÁ\u0090MÎ\u0001¬\u0085VtA\u0000-\u0010ÂÍW\u001dá\u009e\u0004á4mµ|\u0099ñuÆ\u0010-\u001d£H\u00924²ÉQ\u0091T,tf\u0015©\u0010¸àÉÄ\u0005ÝÁ\u0082Ceã\u0016\u0098\u009a\u0086k";
      int var8 = "F Ò]\u001bå\u001d\u0098Ù_øL¤ÔôZ\u0010è\fùøãê1ö*ñ¿ZÈ¶Éh\u0010Ð²\u0096AÐZ\u0012ì{\u008fýÖj°P@ ÀÚÍù@FÆ\u001a\u008ez\u0002\u0091Ub(\u0091\u009b\u0015\u0092!Æ§\u0090·ß\u008aþ¶M\u0001:Z\u0010r\u009b^æ9\u0014l\u0010þ.öü«¢\u0010\u0011\u0018\\´\r·n\rF+H'\u0016Ò![ó0\bIGû\u001c\u00971m\u0010î[ÊÒÁ\u0090MÎ\u0001¬\u0085VtA\u0000-\u0010ÂÍW\u001dá\u009e\u0004á4mµ|\u0099ñuÆ\u0010-\u001d£H\u00924²ÉQ\u0091T,tf\u0015©\u0010¸àÉÄ\u0005ÝÁ\u0082Ceã\u0016\u0098\u009a\u0086k"
         .length();
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
                     b = var9;
                     c = new String[12];
                     cd = eta();
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

                  var6 = ";ºä\u0014Ûrí\u0017ß(~Uúøo\u0006\u001e]¼í\u0090*ÒvH¯/\u008ad\u009dÅ`\u0010-%<\u008cÒ\u0097÷\u0092ì\u009f'O,\u008b§Þ";
                  var8 = ";ºä\u0014Ûrí\u0017ß(~Uúøo\u0006\u001e]¼í\u0090*ÒvH¯/\u008ad\u009dÅ`\u0010-%<\u008cÒ\u0097÷\u0092ì\u009f'O,\u008b§Þ".length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15001;
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
            throw new RuntimeException("cc/astralis/bam", var10);
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
         throw new RuntimeException("cc/astralis/bam" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
