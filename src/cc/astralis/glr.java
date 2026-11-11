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

public class glr extends fso {
   private static final long a = 126729170895275L;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public glr() {
      long a = glr.a ^ 12088196285052L;
      String[] var10001 = new String[2];
      short var10004 = 7380;
      long var10005 = 6008974301153967196L ^ a;
      var10001[0] = "friend";
      var10001[1] = "f";
      short var10002 = 13989;
      long var10003 = 4130451193389389356L ^ a;
      super(var10001, "Whitelists ppl from certain modules (.friend <add or remove> <name>");
   }

   @Override
   public void aov(String[] args, String message) {
      long ax = glr.a ^ 140455970814846L;
      int[] var10000 = dar.abu();
      String[] axx = a.split(" ");
      avo axxx = dar.gqy().cgu();
      int[] axxxx = var10000;
      String[] var10 = axx;
      if (axxxx != null) {
         if (axx.length < 2) {
            short var14 = 23854;
            long var18 = 6780305658331202721L ^ ax;
            bpa.dhu("Wrong Usage .friend <add or remove> <name>");
            return;
         }

         var10 = axx;
      }

      String var8 = var10[1];
      byte var9 = -1;
      var11 = var8.hashCode();
      label57:
      if (axxxx != null) {
         switch (var11) {
            case 96417:
               short var10001 = 16899;
               long var10002 = 2619334338978487178L ^ ax;
               var11 = var8.equals("add");
               if (axxxx == null) {
                  break label57;
               }

               if (var11 == 0) {
                  break;
               }

               var9 = 0;
               if (axxxx != null) {
                  break;
               }
            case -934610812:
               short var15 = 10989;
               long var19 = 1289906935986320229L ^ ax;
               var11 = var8.equals("remove");
               if (axxxx == null) {
                  break label57;
               }

               if (var11 != 0) {
                  var9 = 1;
               }
         }

         var11 = var9;
      }

      switch (var11) {
         case 0:
            axxx.gxx(axx[2]);
            String var12 = axx[2];
            short var16 = 12677;
            long var20 = 1518962656344074244L ^ ax;
            short var21 = 28292;
            long var10003 = 2561441403244787464L ^ ax;
            bpa.dhu("Added " + var12 + " As a Friend");
            if (axxxx != null) {
               break;
            }
         case 1:
            axxx.cnd(axx[2]);
            String var13 = axx[2];
            short var17 = 32526;
            long var22 = 7728981200989693568L ^ ax;
            short var23 = 4758;
            long var24 = 3579243285278903067L ^ ax;
            bpa.dhu("Removed " + var13 + " From Friends List");
      }
   }

   static {
      long var0 = a ^ 125220922441756L;
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
      String var6 = "Ñý\u0015þ\u0083U3ü\u0019\u0086i+ÜD\u008a¶\u0010«<r\"×jÀ\u0099\u008f\u0085\r;Áó¶\u008cp#Ö\u009dN\u0090Ü¨Ã\u0018(ÕÔ¼:1ÚVy\u008cô\u0088\u000eöõØAÄ\u0010Ë\u0081\u008eÓ\u001b>é¹Câ§Ê8ú8¸\røß£,ËR&2Î\u0002»¹±&\u000f\u0093ÿBÁÄ\u0080\u008b\u008bº&$Å[ðíÐN°T\u007fì¥¸ßQL7\u0099[Î\u0017\u0018\tâ\u0007\u000b\u007fé+\u0083Ø)®Y\u001b§`æ¨\u0083ml\u0010\u001b8Mê\u0092.\u001f\u0001\u0018hâ©È#ÍÊ(@ôI\u0002bÀ\u009fÉ±åõ\u001f\r\u009d®xáõ¸ëÅ\u0092\u0091\u0083¸tjmÖÅ\u007fùs\u0095ï\"\u001b;ª»\u0018Å]©ZÖ\u0086\u0087\u0012\u000fWP\u0088¢íöÃ\u0091´¸¯s¥!pH6É\u009eïë\u0085ú|\u0080t\u009b\u009aãL\u0005\u0001\t\\^\u001f\u009f_ n\u008d¹\u0013\u009dÁºÅºH1\r\u008e\u000e\u0002AQ\u009d´]¢[O\u009a¼£°BÝZ*\u0083D¶ãOãÚù\u0007cVxo\u0017Cñ\u0006\u001d";
      int var8 = "Ñý\u0015þ\u0083U3ü\u0019\u0086i+ÜD\u008a¶\u0010«<r\"×jÀ\u0099\u008f\u0085\r;Áó¶\u008cp#Ö\u009dN\u0090Ü¨Ã\u0018(ÕÔ¼:1ÚVy\u008cô\u0088\u000eöõØAÄ\u0010Ë\u0081\u008eÓ\u001b>é¹Câ§Ê8ú8¸\røß£,ËR&2Î\u0002»¹±&\u000f\u0093ÿBÁÄ\u0080\u008b\u008bº&$Å[ðíÐN°T\u007fì¥¸ßQL7\u0099[Î\u0017\u0018\tâ\u0007\u000b\u007fé+\u0083Ø)®Y\u001b§`æ¨\u0083ml\u0010\u001b8Mê\u0092.\u001f\u0001\u0018hâ©È#ÍÊ(@ôI\u0002bÀ\u009fÉ±åõ\u001f\r\u009d®xáõ¸ëÅ\u0092\u0091\u0083¸tjmÖÅ\u007fùs\u0095ï\"\u001b;ª»\u0018Å]©ZÖ\u0086\u0087\u0012\u000fWP\u0088¢íöÃ\u0091´¸¯s¥!pH6É\u009eïë\u0085ú|\u0080t\u009b\u009aãL\u0005\u0001\t\\^\u001f\u009f_ n\u008d¹\u0013\u009dÁºÅºH1\r\u008e\u000e\u0002AQ\u009d´]¢[O\u009a¼£°BÝZ*\u0083D¶ãOãÚù\u0007cVxo\u0017Cñ\u0006\u001d"
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

                  var6 = "¸W\u001af%¶Þh\u0003\u0092\u0017¶ð\u008cëÔpoç9i¼\u001e\u0019ê\n\u0084.=\u0015\u001ev\u0010YÿôµÏQ,4¼\n\"\u00adC\u0004\u009ae";
                  var8 = "¸W\u001af%¶Þh\u0003\u0092\u0017¶ð\u008cëÔpoç9i¼\u001e\u0019ê\n\u0084.=\u0015\u001ev\u0010YÿôµÏQ,4¼\n\"\u00adC\u0004\u009ae".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9052;
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
            throw new RuntimeException("cc/astralis/glr", var10);
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
         throw new RuntimeException("cc/astralis/glr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
