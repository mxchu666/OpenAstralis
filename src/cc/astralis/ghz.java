package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ghz extends fso {
   private static final long a = 103713060117054L;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public ghz() {
      long a = ghz.a ^ 18553199456414L;
      String[] var10001 = new String[2];
      short var10004 = 31975;
      long var10005 = 2567254588783537116L ^ a;
      var10001[0] = "irc";
      var10001[1] = "i";
      short var10002 = 32480;
      long var10003 = 1396937140499392986L ^ a;
      super(var10001, "Sends a message to all client users (.irc <message>");
   }

   @Override
   public void aov(String[] args, String message) {
      long ax = ghz.a ^ 90913973117163L;
      int[] axx = dar.abu();
      if (axx != null) {
         if (a.length >= 1) {
            String axxx = String.join(" ", Arrays.copyOfRange(a, 1, a.length));
            new cse(axxx).dak(dar.gqy().gp());
            new dfg(axxx).dak(dar.gqy().gp());
            return;
         }

         short var10000 = 4462;
         long var10001 = 5395278367228237347L ^ ax;
         bpa.dhu("Wrong Usage .irc <Message>");
      }
   }

   static {
      long var0 = a ^ 19749746218886L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "øPñ\u0010U4-\n?Ú^ \u009bW\u009fcé1ÅK=\u008cl\u0099êô\t\u001fp\u001bØoB\u0013\u0083â\u009b\u0091\u0091\u000bVuR\u007fëJ\u0090#(}\u0098:\u0006î<E\u008e\u0014`o{ÇÙe\b3éØ¼e¤>Ú/Êq\u008fèQË:gA®(òpa\u0010\u000f¦ÐæwGt\u000b\u0080\u0093µ\u001b\u001a\u009eµ\u00928\u009d\u001faÆÖ\u0099¨$õ}l÷¿[ÖH\u0096Èí¡i\u0018îC\u0005Ør\u008a¹Lf\u0019Ê\u00964Î\u0094\u000f)f:\u0096\u008b`:\u007f\u0091Ùf\u0014Cç\u0005ýÐ\u0016";
      int var8 = "øPñ\u0010U4-\n?Ú^ \u009bW\u009fcé1ÅK=\u008cl\u0099êô\t\u001fp\u001bØoB\u0013\u0083â\u009b\u0091\u0091\u000bVuR\u007fëJ\u0090#(}\u0098:\u0006î<E\u008e\u0014`o{ÇÙe\b3éØ¼e¤>Ú/Êq\u008fèQË:gA®(òpa\u0010\u000f¦ÐæwGt\u000b\u0080\u0093µ\u001b\u001a\u009eµ\u00928\u009d\u001faÆÖ\u0099¨$õ}l÷¿[ÖH\u0096Èí¡i\u0018îC\u0005Ør\u008a¹Lf\u0019Ê\u00964Î\u0094\u000f)f:\u0096\u008b`:\u007f\u0091Ùf\u0014Cç\u0005ýÐ\u0016"
         .length();
      char var5 = 'X';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            c = var9;
            d = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32154;
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
            throw new RuntimeException("cc/astralis/ghz", var10);
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
         throw new RuntimeException("cc/astralis/ghz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
