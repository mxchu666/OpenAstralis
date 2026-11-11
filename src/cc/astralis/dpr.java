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

public class dpr extends fso {
   private static int[] fry;
   private static final long a = 58715239136647L;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public dpr() {
      long a = dpr.a ^ 105160891441473L;
      String[] var10001 = new String[2];
      short var10004 = 9192;
      long var10005 = 4837790490037560912L ^ a;
      var10001[0] = "vclip";
      var10004 = 15673;
      var10005 = 814823212602407046L ^ a;
      var10001[1] = "vc";
      short var10002 = 2336;
      long var10003 = 7360935678985440410L ^ a;
      super(var10001, "Teleports you vertically by the amount you said.");
   }

   @Override
   public void aov(String[] args, String message) {
      long ax = dpr.a ^ 63336539572050L;
      int[] var10000 = dar.abu();
      String[] axx = a.split(" ");
      int[] axxx = var10000;
      String[] var12 = axx;
      if (axxx != null) {
         if (axx.length < 2) {
            short var16 = 9264;
            long var20 = 4053944234751575962L ^ ax;
            bpa.dhu("Wrong Usage .vclip <amount>");
            return;
         }

         var12 = axx;
      }

      String axxxx = var12[1];

      double axxxxx;
      try {
         axxxxx = Double.parseDouble(axxxx);
      } catch (NumberFormatException var11) {
         short var10001 = 20366;
         long var10002 = 7408722112693480481L ^ ax;
         bpa.dhu("Invalid number: " + axxxx);
         return;
      }

      if (Math.abs(axxxxx) > 10.0) {
         short var15 = 14683;
         long var19 = 7973593759115893493L ^ ax;
         bpa.dhu("§cAmount too large. Max ±10 blocks.");
      } else {
         class_746 axxxxxx = class_310.method_1551().field_1724;
         class_746 var13 = axxxxxx;
         if (axxx != null) {
            if (axxxxxx == null) {
               short var14 = 16376;
               long var18 = 1451884504277900381L ^ ax;
               bpa.dhu("§cPlayer not found.");
               return;
            }

            var13 = axxxxxx;
         }

         var13.method_30634(axxxxxx.method_23317(), axxxxxx.method_23318() + axxxxx, axxxxxx.method_23321());
         short var17 = 16858;
         long var21 = 3069032798055015026L ^ ax;
         short var22 = 7556;
         long var10003 = 8334221155401858601L ^ ax;
         bpa.dhu("§aVclipped " + axxxxx + " blocks.");
      }
   }

   public static void aut(int[] var0) {
      fry = var0;
   }

   public static int[] akx() {
      return fry;
   }

   static {
      long var0 = a ^ 109206103331750L;
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
      String var6 = "ªó\u009b'G\u0007\u008fâ°ç\u0093\u0010\u000bI\u0002OÆ \u009fOgæ\u001db\u0010\u009bÈ\u0001ì½\u0080Å\u001d>o\u000b\u009d\u001cö\u0095\u0084(§·2çú»vÔ0©\u0006\rçë³hü¹á\u0019¤[µ¶E\u0097æ\u0018¹Þ\u0083Ë;75Aq°q0@\u0016X;v\u0082¸ô\u0016Ï,\u0099\u001fªÉ{\u0086c°÷\u0093Ó\u0082Ô\u0097ën\u007f»\u008b´ro++¿u\u0002¡\u000bá.\u0014ðó³\u008diQì\u0011\u001f\u0090\u008aí6\u0080×Ô·\u000e\u0084I¸3`Kc½áÆð~ñ\u0084Ö \u0002¦úèzU3¾\u008b\u001a\u0014\u008fÏq\u008fåò\u009fe´þø¯¡õ!ý\u0087jýÇËl&\"aO\u0090,C´«\u0000¸\u009fØÄ\u008cIâ\u001e\u00857´HMâv\u009fó\t¼\u001f£\u00ad¨§!à¯.ü´Y\u009e\u00adJ\u0002\u0094Éa\u0089\u001cÇ+ %Çä°w^Ñ¦ä×=P\u0095\u0095ÍP\u0007K\r\u0001-+ö\u001eÁ®\u0016\u009fø\u008cÝÊ\u0010â\u009f$È½Bë\u009a©\u0013CPÐ¶%ß";
      int var8 = "ªó\u009b'G\u0007\u008fâ°ç\u0093\u0010\u000bI\u0002OÆ \u009fOgæ\u001db\u0010\u009bÈ\u0001ì½\u0080Å\u001d>o\u000b\u009d\u001cö\u0095\u0084(§·2çú»vÔ0©\u0006\rçë³hü¹á\u0019¤[µ¶E\u0097æ\u0018¹Þ\u0083Ë;75Aq°q0@\u0016X;v\u0082¸ô\u0016Ï,\u0099\u001fªÉ{\u0086c°÷\u0093Ó\u0082Ô\u0097ën\u007f»\u008b´ro++¿u\u0002¡\u000bá.\u0014ðó³\u008diQì\u0011\u001f\u0090\u008aí6\u0080×Ô·\u000e\u0084I¸3`Kc½áÆð~ñ\u0084Ö \u0002¦úèzU3¾\u008b\u001a\u0014\u008fÏq\u008fåò\u009fe´þø¯¡õ!ý\u0087jýÇËl&\"aO\u0090,C´«\u0000¸\u009fØÄ\u008cIâ\u001e\u00857´HMâv\u009fó\t¼\u001f£\u00ad¨§!à¯.ü´Y\u009e\u00adJ\u0002\u0094Éa\u0089\u001cÇ+ %Çä°w^Ñ¦ä×=P\u0095\u0095ÍP\u0007K\r\u0001-+ö\u001eÁ®\u0016\u009fø\u008cÝÊ\u0010â\u009f$È½Bë\u009a©\u0013CPÐ¶%ß"
         .length();
      char var5 = 24;
      int var12 = -1;

      label33:
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
                     if (akx() == null) {
                        aut(new int[3]);
                     }

                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label33;
                  }

                  var6 = ";?$¯ÌÞï\u0017mº,s|ÄØÙÊ\u0014qOd£ÞÁ3sú0\u00ad£»\u0012Îû[\u007f¬\u00112ÙO¤ËÐÊ¡+\u00150º\u0088+Qe\u0015W\u009b§\u008cwòìâ\f\u000bFf\u008d\u00867\u0019éU\u0015}Ùo\u00adÍd4\u0095VÎªZS\u0010TíÀì!\u0011\u0019\u0091w";
                  var8 = ";?$¯ÌÞï\u0017mº,s|ÄØÙÊ\u0014qOd£ÞÁ3sú0\u00ad£»\u0012Îû[\u007f¬\u00112ÙO¤ËÐÊ¡+\u00150º\u0088+Qe\u0015W\u009b§\u008cwòìâ\f\u000bFf\u008d\u00867\u0019éU\u0015}Ùo\u00adÍd4\u0095VÎªZS\u0010TíÀì!\u0011\u0019\u0091w"
                     .length();
                  var5 = '0';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6520;
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
            throw new RuntimeException("cc/astralis/dpr", var10);
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
         throw new RuntimeException("cc/astralis/dpr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
