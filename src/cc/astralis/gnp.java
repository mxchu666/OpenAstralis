package cc.astralis;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gnp extends bmd {
   private final bfm cvu;
   private static final Map<bfm, gcf> cxc;
   private static final long a = 13170958512620L;
   private static final String b;

   public gnp(bfm category, int size) {
      a.cvu = a;
      a.fqg(a);
      a.fuo(a);
   }

   @Override
   public void ckn(float x, float y, float mouseX, float mouseY) {
      gcf ax;
      float axx;
      label29: {
         label28: {
            int[] axxx;
            label27: {
               label26: {
                  long axxxx = gnp.a ^ 18363553273103L;
                  a.fji(a);
                  a.axc(a);
                  int[] var10000 = dar.abu();
                  ezv axxxxx = dar.gqy().aws().diy(ezv.class);
                  dmp.dsm(a, a, a.arq(), a.ajg(), 5.0F, axxxxx.ehf.dnp(), axxxxx.aoz.dnp());
                  ax = cxc.get(a.cvu);
                  axxx = var10000;
                  axx = 0.0F;
                  if (axxx != null) {
                     switch (dcm.azt[a.cvu.ordinal()]) {
                        case 4:
                           axx = 2.0F;
                           break;
                        case 5:
                           break label27;
                        case 6:
                           break label26;
                        case 7:
                           break label28;
                        default:
                           break label29;
                     }
                  }

                  if (axxx != null) {
                     break label29;
                  }
               }

               axx = 1.5F;
               if (axxx != null) {
                  break label29;
               }
            }

            axx = 1.0F;
            if (axxx != null) {
               break label29;
            }
         }

         axx = 0.5F;
      }

      fll axxxxxx = bxc.emc(b, ax.asw);
      axxxxxx.aof(ax.ejr, a + a.arq() / 2.0F - axxxxxx.biu(ax.ejr) / 2.0F + axx, a + a.ajg() / 2.0F - axxxxxx.biu(ax.ejr) / 2.0F, Color.white);
   }

   @Override
   public void df() {
   }

   public boolean efu(double mouseX, double mouseY) {
      return fuv.bfm(a, a, a.aqy(), a.gpn(), a.arq(), a.ajg());
   }

   static {
      long a = gnp.a ^ 123020935868930L;
      Cipher ax;
      Cipher var10000 = ax = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(a >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int axx = 1; axx < 8; axx++) {
         var10003[axx] = (byte)(a << axx * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] axx = ax.doFinal("Icons-Regular".getBytes("ISO-8859-1"));
      String var28 = a(axx).intern();
      int var10001 = -1;
      b = var28;
      Cipher axxx;
      var10000 = axxx = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)(a >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int axxxx = 1; axxxx < 8; axxxx++) {
         var10003[axxxx] = (byte)(a << axxxx * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] axxxx = new long[6];
      int axxxxx = 0;
      String axxxxxx = "X\u009a¿\b\u0092îíUÈ%]ý-t¢\u009dØü\u0006Õ\u001aNiº\u0090\u008dq+Ó\u008aÕÍ";
      int axxxxxxx = "X\u009a¿\b\u0092îíUÈ%]ý-t¢\u009dØü\u0006Õ\u001aNiº\u0090\u008dq+Ó\u008aÕÍ".length();
      int axxxxxxxx = 0;

      label50:
      while (true) {
         var10001 = axxxxxxxx;
         axxxxxxxx += 8;
         byte[] axxxxxxxxx = axxxxxx.substring(var10001, axxxxxxxx).getBytes("ISO-8859-1");
         long[] var23 = axxxx;
         var10001 = axxxxx++;
         long var30 = (axxxxxxxxx[0] & 255L) << 56
            | (axxxxxxxxx[1] & 255L) << 48
            | (axxxxxxxxx[2] & 255L) << 40
            | (axxxxxxxxx[3] & 255L) << 32
            | (axxxxxxxxx[4] & 255L) << 24
            | (axxxxxxxxx[5] & 255L) << 16
            | (axxxxxxxxx[6] & 255L) << 8
            | axxxxxxxxx[7] & 255L;
         byte var33 = -1;

         while (true) {
            long axxxxxxxxxx = var30;
            byte[] axxxxxxxxxxx = axxx.doFinal(
               new byte[]{
                  (byte)(axxxxxxxxxx >>> 56),
                  (byte)(axxxxxxxxxx >>> 48),
                  (byte)(axxxxxxxxxx >>> 40),
                  (byte)(axxxxxxxxxx >>> 32),
                  (byte)(axxxxxxxxxx >>> 24),
                  (byte)(axxxxxxxxxx >>> 16),
                  (byte)(axxxxxxxxxx >>> 8),
                  (byte)axxxxxxxxxx
               }
            );
            long var35 = (axxxxxxxxxxx[0] & 255L) << 56
               | (axxxxxxxxxxx[1] & 255L) << 48
               | (axxxxxxxxxxx[2] & 255L) << 40
               | (axxxxxxxxxxx[3] & 255L) << 32
               | (axxxxxxxxxxx[4] & 255L) << 24
               | (axxxxxxxxxxx[5] & 255L) << 16
               | (axxxxxxxxxxx[6] & 255L) << 8
               | axxxxxxxxxxx[7] & 255L;
            switch (var33) {
               case 0:
                  var23[var10001] = var35;
                  if (axxxxxxxx >= axxxxxxx) {
                     cxc = new HashMap<>();

                     for (bfm axxxxxxxxxxxx : bfm.values()) {
                        gcf axxxxxxxxxxxxx = switch (dcm.azt[axxxxxxxxxxxx.ordinal()]) {
                           case 1 -> new gcf("S", 0.0F, 0.5F, (int)axxxx[5]);
                           case 2 -> new gcf("T", 0.0F, 0.5F, (int)axxxx[4]);
                           case 3 -> new gcf("U", 0.0F, 1.0F, (int)axxxx[4]);
                           case 4 -> new gcf("G", 0.4F, 0.6F, (int)axxxx[0]);
                           case 5 -> new gcf("K", 0.0F, 0.5F, (int)axxxx[1]);
                           case 6 -> new gcf("A", 0.5F, (int)axxxx[2]);
                           case 7 -> new gcf("O", 0.0F, (int)axxxx[3]);
                           default -> throw new MatchException(null, null);
                        };
                        cxc.put(axxxxxxxxxxxx, axxxxxxxxxxxxx);
                     }

                     return;
                  }
                  break;
               default:
                  var23[var10001] = var35;
                  if (axxxxxxxx < axxxxxxx) {
                     continue label50;
                  }

                  axxxxxx = "\u0017$¼%\u008a\u008fW\u0017Ý\u0088ùÁÉÿ\u0006L";
                  axxxxxxx = "\u0017$¼%\u008a\u008fW\u0017Ý\u0088ùÁÉÿ\u0006L".length();
                  axxxxxxxx = 0;
            }

            byte var27 = axxxxxxxx;
            axxxxxxxx += 8;
            axxxxxxxxx = axxxxxx.substring(var27, axxxxxxxx).getBytes("ISO-8859-1");
            var23 = axxxx;
            var10001 = axxxxx++;
            var30 = (axxxxxxxxx[0] & 255L) << 56
               | (axxxxxxxxx[1] & 255L) << 48
               | (axxxxxxxxx[2] & 255L) << 40
               | (axxxxxxxxx[3] & 255L) << 32
               | (axxxxxxxxx[4] & 255L) << 24
               | (axxxxxxxxx[5] & 255L) << 16
               | (axxxxxxxxx[6] & 255L) << 8
               | axxxxxxxxx[7] & 255L;
            var33 = 0;
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
