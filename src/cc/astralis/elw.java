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

public class elw implements fgh {
   private final cfg axm;
   private final String akt;
   private double guo;
   private static String[] hcq;
   private static final String a;
   private static final long b = 111258105214604L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;
   private static final long f;

   public elw(cfg type, double version) {
      a.axm = a;
      a.akt = elw.a;
      a.guo = a;
   }

   @Override
   public boolean fvo(elw other) {
      long ax = b ^ 18978658724578L;
      int[] var10000 = dar.abu();
      long axx = f;
      int[] axxx = var10000;
      elw var7 = a;
      if (axxx != null) {
         if (a == null) {
            return false;
         }

         var7 = a;
      }

      if (axxx != null) {
         if (var7.axm != a.axm) {
            return (boolean)0;
         }

         var7 = a;
      }

      int var8 = Double.compare(var7.guo, a.guo);
      if (axxx != null) {
         if (var8 != 0) {
            return (boolean)0;
         }

         var8 = a.akt.equals(a.akt);
      }

      if (axxx == null) {
         return (boolean)var8;
      } else {
         return (boolean)(var8 != 0 ? 1 : 0);
      }
   }

   @Override
   public cfg hjp() {
      return a.axm;
   }

   @Override
   public String fpo() {
      return a.akt;
   }

   @Override
   public double bml() {
      return a.guo;
   }

   @Override
   public void gfj(double version) {
      a.guo = a;
   }

   public static void azb(String[] var0) {
      hcq = var0;
   }

   public static String[] hit() {
      return hcq;
   }

   static {
      long var20 = b ^ 114369472090715L;
      Cipher var17;
      Cipher var10000 = var17 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var18 = 1; var18 < 8; var18++) {
         var10003[var18] = (byte)(var20 << var18 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var19 = var17.doFinal(
         "¥,ù\u001f´\u0082Ê,\u0004\u0006B-)îïÿu \u0089\u008eG\u000f\nò\u000eENÃ«¯¹~ ôð\u0014E\u0003X´TlxÑíNV\u008bÀ\u000bÔUD?üâL\u009b\u008f?V\u00ad\u0013öð\u009b\u0096¥\u008ar\u0097L¥\u0087:;úPÃ+ÛR\u008féÅ\u008a¶¬ÛXKQæ\u0001+Q;\u0082ØÆÿ\u00ad?ù;m\u0092a¾\u009b\u0000gªx)\u0098Ï\u0010¸&¦ÌK¯×=æ=Fì(CF\u008e\u0081Ñ"
            .getBytes("ISO-8859-1")
      );
      String var33 = a(var19).intern();
      int var10001 = -1;
      String var16 = var33;
      e = new HashMap(13);
      Cipher var5;
      var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var6 = 1; var6 < 8; var6++) {
         var10003[var6] = (byte)(var20 << var6 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var11 = new long[10];
      int var8 = 0;
      String var9 = "\rS6\u009c½NDhz\u0011wÓ\u0088ÍÈöß\u0099\u009f\u0094\u0097\r·\u0012ñ2n\u000eë3RX³Pý\u0018\u0090\u0011Å\u0018bã/§È\u0014t\u001e9Ý\u0010ß\u0087\u009a\u00adµF\nïQ½\u001e\u009fi";
      int var10 = "\rS6\u009c½NDhz\u0011wÓ\u0088ÍÈöß\u0099\u009f\u0094\u0097\r·\u0012ñ2n\u000eë3RX³Pý\u0018\u0090\u0011Å\u0018bã/§È\u0014t\u001e9Ý\u0010ß\u0087\u009a\u00adµF\nïQ½\u001e\u009fi"
         .length();
      byte var7 = 0;

      label47:
      while (true) {
         var10001 = var7;
         var7 += 8;
         byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
         long[] var24 = var11;
         var10001 = var8++;
         long var35 = (var12[0] & 255L) << 56
            | (var12[1] & 255L) << 48
            | (var12[2] & 255L) << 40
            | (var12[3] & 255L) << 32
            | (var12[4] & 255L) << 24
            | (var12[5] & 255L) << 16
            | (var12[6] & 255L) << 8
            | var12[7] & 255L;
         byte var41 = -1;

         while (true) {
            long var13 = var35;
            byte[] var15 = var5.doFinal(
               new byte[]{
                  (byte)(var13 >>> 56),
                  (byte)(var13 >>> 48),
                  (byte)(var13 >>> 40),
                  (byte)(var13 >>> 32),
                  (byte)(var13 >>> 24),
                  (byte)(var13 >>> 16),
                  (byte)(var13 >>> 8),
                  (byte)var13
               }
            );
            long var44 = (var15[0] & 255L) << 56
               | (var15[1] & 255L) << 48
               | (var15[2] & 255L) << 40
               | (var15[3] & 255L) << 32
               | (var15[4] & 255L) << 24
               | (var15[5] & 255L) << 16
               | (var15[6] & 255L) << 8
               | var15[7] & 255L;
            switch (var41) {
               case 0:
                  var24[var10001] = var44;
                  if (var7 >= var10) {
                     c = var11;
                     d = new Integer[10];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -2351687464169885033L;
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
                     long var38 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     byte var30 = -1;
                     f = var38;
                     if (hit() == null) {
                        azb(new String[2]);
                     }

                     short var26 = 8233;
                     long var31 = 1015148107494917210L ^ var20;
                     String var39 = a(18, a(var16));
                     var30 = -1;
                     a = var39;
                     return;
                  }
                  break;
               default:
                  var24[var10001] = var44;
                  if (var7 < var10) {
                     continue label47;
                  }

                  var9 = "Peèä\u009f9ê]\u0011\u0081¹æ\u008dÊíÇ";
                  var10 = "Peèä\u009f9ê]\u0011\u0081¹æ\u008dÊíÇ".length();
                  var7 = 0;
            }

            byte var29 = var7;
            var7 += 8;
            var12 = var9.substring(var29, var7).getBytes("ISO-8859-1");
            var24 = var11;
            var10001 = var8++;
            var35 = (var12[0] & 255L) << 56
               | (var12[1] & 255L) << 48
               | (var12[2] & 255L) << 40
               | (var12[3] & 255L) << 32
               | (var12[4] & 255L) << 24
               | (var12[5] & 255L) << 16
               | (var12[6] & 255L) << 8
               | var12[7] & 255L;
            var41 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      long var1 = b ^ 88422268919610L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 7307;
         long var10005 = 1693011804541138330L ^ var1;
         var10000[0] = (char)(var10003 ^ 'M');
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 68760722993364L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 17362;
         long var10009 = 6465315773144876331L ^ var2;
         byte var10;
         switch (var4 % 7) {
            case 0:
               var10 = 3509;
               long var23 = 1162981201546061L ^ var2;
               var10 = 26;
               break;
            case 1:
               var10 = 13761;
               long var22 = 9130358018166469434L ^ var2;
               var10 = 18;
               break;
            case 2:
               var10 = 29530;
               long var21 = 3516429486645507492L ^ var2;
               var10 = 85;
               break;
            case 3:
               var10 = 28050;
               long var20 = 7375806199827786600L ^ var2;
               var10 = 104;
               break;
            case 4:
               var10 = 2047;
               long var19 = 4070501898561552642L ^ var2;
               var10 = 121;
               break;
            case 5:
               var10 = 19799;
               long var18 = 8625208819494308771L ^ var2;
               var10 = 14;
               break;
            default:
               var10 = 18946;
               long var17 = 8283346560408669431L ^ var2;
               var10 = 77;
         }

         var10001[var4] = (char)(var10005 ^ var10002 ^ var10);
      }

      return new String(var10001).intern();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 164;
      if (d[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = c[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/elw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("cc/astralis/elw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
