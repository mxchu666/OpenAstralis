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
import net.minecraft.class_310;
import net.minecraft.class_746;

public class bjw extends fso {
   private static final long a = 20841868153162L;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public bjw() {
      long a = bjw.a ^ 116151994332183L;
      String[] var10001 = new String[2];
      short var10004 = 1278;
      long var10005 = 2921197932119241556L ^ a;
      var10001[0] = "hclip";
      var10004 = 21726;
      var10005 = 37941560520729463L ^ a;
      var10001[1] = "hc";
      short var10002 = 1860;
      long var10003 = 2783413238019371243L ^ a;
      super(var10001, "Teleports you horizontally forward/backward.");
   }

   @Override
   public void aov(String[] args, String message) {
      long ax = bjw.a ^ 33022848805791L;
      int[] var10000 = dar.abu();
      String[] axx = a.split(" ");
      int[] axxx = var10000;
      String[] var17 = axx;
      if (axxx != null) {
         if (axx.length < 2) {
            short var21 = 1073;
            long var25 = 3387845798669691922L ^ ax;
            bpa.dhu("Wrong Usage .hclip <amount>");
            return;
         }

         var17 = axx;
      }

      String axxxx = var17[1];

      double axxxxx;
      try {
         axxxxx = Double.parseDouble(axxxx);
      } catch (NumberFormatException var16) {
         short var10001 = 20370;
         long var10002 = 2389665104045270967L ^ ax;
         bpa.dhu("Invalid number: " + axxxx);
         return;
      }

      if (Math.abs(axxxxx) > 10.0) {
         short var20 = 31762;
         long var24 = 7647240224697799730L ^ ax;
         bpa.dhu("§cAmount too large. Max ±10 blocks.");
      } else {
         class_746 axxxxxx = class_310.method_1551().field_1724;
         class_746 var18 = axxxxxx;
         if (axxx != null) {
            if (axxxxxx == null) {
               short var19 = 1883;
               long var23 = 8289172396125171569L ^ ax;
               bpa.dhu("§cPlayer not found.");
               return;
            }

            var18 = axxxxxx;
         }

         float axxxxxxx = var18.method_36454() * (float) Math.PI / 180.0F;
         double axxxxxxxx = -Math.sin(axxxxxxx) * axxxxx;
         double axxxxxxxxx = Math.cos(axxxxxxx) * axxxxx;
         axxxxxx.method_30634(axxxxxx.method_23317() + axxxxxxxx, axxxxxx.method_23318(), axxxxxx.method_23321() + axxxxxxxxx);
         short var22 = 3477;
         long var26 = 5733421704566580657L ^ ax;
         short var27 = 24709;
         long var10003 = 8774623950540884131L ^ ax;
         bpa.dhu("§aHclipped " + axxxxx + " blocks.");
      }
   }

   static {
      long var0 = a ^ 121873732820910L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "\u0089ïÃ\u009dÅmß-ºU À\u0007J^M0¼?H^\t4¡]¾,BPÃßµÙs¢\u001fë\u001d\u0006Ë\u0013su\u0083M\u00158Ç¢SpUVí\u0007\u0003RÂîÑPuqÖ*8m:\u0083M²\\r\u0013I´\u0096\u001f[O²¶;øhiÿÙ6@ê\u008c\u0017<\u0094þ·ûhíKÈRL:\u009b\n\u009c\u0007ÄÄ\\¤U\u0097$Ù)êýwö\u0010T\u0082\u0091qÞð\u001d5\u0019ôÅOkPEÅ\u0018`J3;gêzQ\u0012\u0014;H\u0010öond3nAÐV²\u0092P¹b\u0017Ù\u0019\u008a\"\u0001\u0013\u0003ÄJo&d]\u00049e5ÞW§kVO±×Ï :â¨á¦W\u0099ÄX3Õ\u0000<x÷s©èÿÿ<\u008döÈ4\u0011c;'?\u0011È\nCv@¢àC\u0006\\\u0092þ\u0019=7\u008d0\u0006w º\u0096éf,l\"xH§Ö\u0094ë\u0099\u008cÊî³e\u0098£¿¸Ã\u0013èÆ\u0017!\u008dl\u0012";
      int var8 = "\u0089ïÃ\u009dÅmß-ºU À\u0007J^M0¼?H^\t4¡]¾,BPÃßµÙs¢\u001fë\u001d\u0006Ë\u0013su\u0083M\u00158Ç¢SpUVí\u0007\u0003RÂîÑPuqÖ*8m:\u0083M²\\r\u0013I´\u0096\u001f[O²¶;øhiÿÙ6@ê\u008c\u0017<\u0094þ·ûhíKÈRL:\u009b\n\u009c\u0007ÄÄ\\¤U\u0097$Ù)êýwö\u0010T\u0082\u0091qÞð\u001d5\u0019ôÅOkPEÅ\u0018`J3;gêzQ\u0012\u0014;H\u0010öond3nAÐV²\u0092P¹b\u0017Ù\u0019\u008a\"\u0001\u0013\u0003ÄJo&d]\u00049e5ÞW§kVO±×Ï :â¨á¦W\u0099ÄX3Õ\u0000<x÷s©èÿÿ<\u008döÈ4\u0011c;'?\u0011È\nCv@¢àC\u0006\\\u0092þ\u0019=7\u008d0\u0006w º\u0096éf,l\"xH§Ö\u0094ë\u0099\u008cÊî³e\u0098£¿¸Ã\u0013èÆ\u0017!\u008dl\u0012"
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
                     c = var9;
                     d = new String[9];
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

                  var6 = "©\u0096\u0017\u0010Ïx°àÊépÿÔV¤\u008d\u0017¾\u000bð\u008aC@Ê5£uòX\r9.\u0013\u000fßo*\u0005Äµ(\u0099nG\u0086\u008að \u0099BP¦ÐR|By<Òàä\u0016·¹\u009e]\u0010'Â\u0081Å\u009fn¥³¼¯A\u0087\"Ö";
                  var8 = "©\u0096\u0017\u0010Ïx°àÊépÿÔV¤\u008d\u0017¾\u000bð\u008aC@Ê5£uòX\r9.\u0013\u000fßo*\u0005Äµ(\u0099nG\u0086\u008að \u0099BP¦ÐR|By<Òàä\u0016·¹\u009e]\u0010'Â\u0081Å\u009fn¥³¼¯A\u0087\"Ö"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21239;
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
            throw new RuntimeException("cc/astralis/bjw", var10);
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
         throw new RuntimeException("cc/astralis/bjw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
