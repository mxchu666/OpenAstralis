package cc.astralis;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_124;

public interface cds {
   djc gll;
   djc bbq;
   djc dxu;
   djc cjz;
   djc aza;
   djc fla;

   static {
      long var9 = gls.a(-6181349559580059966L, -3986765559680426494L, MethodHandles.lookup().lookupClass()).a(111600861177038L) ^ 118531559335965L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[12];
      int var6 = 0;
      String var5 = "Ô\u009c\u001cX \u001d8Æ\b\u0096]©¯\re1ë(6\u0012r\u001dXúõ »5±A½ù\n;µÆ\u0090PvÕ\u0019Í/²õ\u009c\fyGçKq\u001b·\u0080:gÐ\u0010[z§õh\\É\byAÂ7\u0093¥l;(æ\u0004×)\u009c\u0011\n\u008c`d¶\u0095¨\u000e&6£«Ñé\u0085\u0004C\"$>Ýä\u008a(\u0085®\u0019Ù\u0088¹\u0087%¾^(»Ý\u001cBw\u0017ÂrÐ\u0005 #=¨\u0088¡\u0090Å0\u0017>Q>\u0002p\rT\u0085~¥i)\u0012&Ë\u008dRDMQ(àÒ\u0003\u009eEÆ?G'\u009cDÕ²ÀèÃ Î\u001b\u0096;å\tbÜFc9GqÛ±P×ZìfyHÈ\b_\u009b4\ró¾nÜ(·×Í\u008f\u0011y6ï\u0010¦CÓÐÉ|\u0083«}uq¦ÍÒÝ\u0080\u001aY\u0080\u0099\u001eiAt'Ô\u0082õ½\u0003¨\b{\u0002.ì\u0007¿«Å";
      int var7 = "Ô\u009c\u001cX \u001d8Æ\b\u0096]©¯\re1ë(6\u0012r\u001dXúõ »5±A½ù\n;µÆ\u0090PvÕ\u0019Í/²õ\u009c\fyGçKq\u001b·\u0080:gÐ\u0010[z§õh\\É\byAÂ7\u0093¥l;(æ\u0004×)\u009c\u0011\n\u008c`d¶\u0095¨\u000e&6£«Ñé\u0085\u0004C\"$>Ýä\u008a(\u0085®\u0019Ù\u0088¹\u0087%¾^(»Ý\u001cBw\u0017ÂrÐ\u0005 #=¨\u0088¡\u0090Å0\u0017>Q>\u0002p\rT\u0085~¥i)\u0012&Ë\u008dRDMQ(àÒ\u0003\u009eEÆ?G'\u009cDÕ²ÀèÃ Î\u001b\u0096;å\tbÜFc9GqÛ±P×ZìfyHÈ\b_\u009b4\ró¾nÜ(·×Í\u008f\u0011y6ï\u0010¦CÓÐÉ|\u0083«}uq¦ÍÒÝ\u0080\u001aY\u0080\u0099\u001eiAt'Ô\u0082õ½\u0003¨\b{\u0002.ì\u0007¿«Å"
         .length();
      char var4 = '\b';
      int var12 = -1;

      label28:
      while (true) {
         String var13 = var5.substring(++var12, var12 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var19;
                  if ((var12 += var4) >= var7) {
                     gll = new djc(var0[5], var0[0], class_124.field_1061);
                     bbq = new djc(var0[8], var0[7], class_124.field_1060);
                     dxu = new djc(var0[2], var0[1], class_124.field_1078);
                     cjz = new djc(var0[4], var0[11], class_124.field_1065);
                     aza = new djc(var0[6], var0[9], class_124.field_1079);
                     fla = new djc(var0[10], var0[3], class_124.field_1077);
                     return;
                  }

                  var4 = var5.charAt(var12);
                  break;
               default:
                  var0[var6++] = var19;
                  if ((var12 += var4) < var7) {
                     var4 = var5.charAt(var12);
                     continue label28;
                  }

                  var5 = "û/ î\u0012³4\u0085 Àbß¬ÈÀÄFmB`ùàØjÍØ½òµ%\u008c!\u001cZ82\u0084\u008fa¿\b,¥ª\u008cN\u008a\u0012Ì";
                  var7 = "û/ î\u0012³4\u0085 Àbß¬ÈÀÄFmB`ùàØjÍØ½òµ%\u008c!\u001cZ82\u0084\u008fa¿\b,¥ª\u008cN\u008a\u0012Ì".length();
                  var4 = '(';
                  var12 = -1;
            }

            var13 = var5.substring(++var12, var12 + var4);
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
}
