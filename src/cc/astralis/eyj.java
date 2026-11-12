package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class eyj {
   private static final int fzm;
   private static final int ake;
   private static final int cwg;
   private static final int brr;
   private static int ctr;
   private static final String[] a;
   private static final long b = 57311106350770L;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;
   private static final long[] f;
   private static final Long[] g;
   private static final Map h;

   public static byte[] ere(byte[] data, byte[] key, byte[] aad) {
      long ax = b ^ 32817759257641L;
      int[] var10000 = dar.abu();
      short var10001 = 26606;
      long var10002 = 94864507093876089L ^ ax;
      long axx = 39663199728497L;
      cdr[] axxx = fz.dtf();
      int[] axxxx = var10000;
      int var15 = a.length;
      var10001 = 27690;
      var10002 = 4445649265426780332L ^ ax;
      if (var15 != 32) {
         throw new IllegalArgumentException(eyj.a[2]);
      } else {
         SecureRandom axxxxx = new SecureRandom();
         short var16 = 18958;
         long var19 = 5478525291565053593L ^ ax;
         byte[] axxxxxx = new byte[12];
         axxxxx.nextBytes(axxxxxx);
         ayk axxxxxxx = new ayk(a, axxxxxx, a);
         byte[] axxxxxxxx = axxxxxxx.cjj(a);
         byte[] axxxxxxxxx = axxxxxxx.arj();
         ByteBuffer axxxxxxxxxx = ByteBuffer.allocate(axxxxxx.length + axxxxxxxx.length + axxxxxxxxx.length);
         axxxxxxxxxx.put(axxxxxx);
         axxxxxxxxxx.put(axxxxxxxx);
         axxxxxxxxxx.put(axxxxxxxxx);
         byte[] var17 = axxxxxxxxxx.array();
         if (axxxx != null && cdr.haa() == null) {
            fz.gpz(new cdr[5]);
         }

         return var17;
      }
   }

   public static byte[] cws(byte[] data, byte[] key, byte[] aad) throws Exception {
      long ax;
      int[] axx;
      byte[] var15;
      label43: {
         ax = b ^ 61017601237987L;
         int[] var10000 = dar.abu();
         short var10001 = 19555;
         long var10002 = 6272531962212233533L ^ ax;
         long axxx = 103815411965598L;
         axx = var10000;
         int var14 = a.length;
         var10001 = 27690;
         var10002 = 4445673875143735142L ^ ax;
         short var18 = 32;
         if (axx != null) {
            if (var14 != 32) {
               throw new IllegalArgumentException(eyj.a[3]);
            }

            var15 = a;
            if (axx == null) {
               break label43;
            }

            var14 = a.length;
            var18 = 5134;
            var10002 = 5632226735327235905L ^ ax;
            var18 = 28;
         }

         if (var14 < var18) {
            throw new IllegalArgumentException(eyj.a[0]);
         }

         short var24 = 23782;
         long var10003 = 2955801729960347582L ^ ax;
         var15 = Arrays.copyOfRange(a, 0, 12);
      }

      byte[] axxxx = var15;
      int var20 = 18958;
      long var25 = 5478500440572825939L ^ ax;
      int var26 = a.length;
      short var28 = 1922;
      long var10004 = 529720263864638666L ^ ax;
      byte[] axxxxx = Arrays.copyOfRange(a, 12, var26 - 16);
      var20 = a.length;
      short var27 = 1922;
      long var29 = 529720263864638666L ^ ax;
      byte[] axxxxxx = Arrays.copyOfRange(a, var20 - 16, a.length);
      ayk axxxxxxx = new ayk(a, axxxx, a);
      byte[] axxxxxxxx = axxxxxxx.fcr(axxxxx);
      byte[] axxxxxxxxx = axxxxxxx.arj();
      var15 = axxxxxx;
      if (axx != null) {
         if (!Arrays.equals(axxxxxx, axxxxxxxxx)) {
            throw new cpu(eyj.a[1]);
         }

         var15 = axxxxxxxx;
      }

      return var15;
   }

   public static void btm(int var0) {
      ctr = var0;
   }

   public static int ceu() {
      return ctr;
   }

   public static int cyq() {
      long var0 = b ^ 67117233346639L;
      int[] var2 = dar.abu();
      int var3 = ceu();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            short var4 = 28029;
            long var10001 = 8536017375575821718L ^ var0;
            return 43;
         }

         var10000 = 0;
      }

      return var10000;
   }

   static {
      long var31 = b ^ 23500722342389L;
      Cipher var23;
      Cipher var10000 = var23 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var24 = 1; var24 < 8; var24++) {
         var10003[var24] = (byte)(var31 << var24 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var22 = new String[6];
      int var28 = 0;
      String var27 = "\tÉ\u0013Ø\u0002áèÖ.\u001e\u0001ë\u009dôùV,\u0011'9íBD#\u0010 /X°0·\u0094>IÉ×ÄÑjWy\u0010 /X°0·\u0094>IÉ×ÄÑjWyP\u009bB\u008d\u009cÃÈc\u0016êI\u0080«\u0092v^\u0017t\u0005Qc©YÆ\u000e\u0015\u00ad74³¢AåßüZ5Í\u0004Ìi\u009cPxì´ü\u0089È\t½tB\u001b8§\u0013òÞ>#³â»\u0012f°\u000fg\u0081\n¨M¶\u0005m\u0092=³\u0012\u0084";
      int var29 = "\tÉ\u0013Ø\u0002áèÖ.\u001e\u0001ë\u009dôùV,\u0011'9íBD#\u0010 /X°0·\u0094>IÉ×ÄÑjWy\u0010 /X°0·\u0094>IÉ×ÄÑjWyP\u009bB\u008d\u009cÃÈc\u0016êI\u0080«\u0092v^\u0017t\u0005Qc©YÆ\u000e\u0015\u00ad74³¢AåßüZ5Í\u0004Ìi\u009cPxì´ü\u0089È\t½tB\u001b8§\u0013òÞ>#³â»\u0012f°\u000fg\u0081\n¨M¶\u0005m\u0092=³\u0012\u0084"
         .length();
      char var26 = 24;
      int var50 = -1;

      label121:
      while (true) {
         String var54 = var27.substring(++var50, var50 + var26);
         int var10001 = -1;

         while (true) {
            byte[] var30 = var23.doFinal(var54.getBytes("ISO-8859-1"));
            String var88 = a(var30).intern();
            switch (var10001) {
               case 0:
                  var22[var28++] = var88;
                  if ((var50 += var26) >= var29) {
                     e = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[33];
                     int var14 = 0;
                     String var15 = "Í=\u008f¥ë~ÿp9\n\u0097f3\u0088}6$ØÓ \u0098\f¸\u0098K¤Ú¿l\u009c\u008dD|¼<¤\fë\u000b\f¦¤ãÁ|{®Ý\"\u0089\u0011Ý\u001c;\tò÷Ðp/\u0082\u009cw\u001b÷\u001e.\u008cà\u001dÍÁì\u001a\u008cc}W\n\u0086\u0080.*jÐ\u008cêUU\u0092»&\f\u0007©éü\t,JGgÛa\u001b?dXB\u0019\u000fÞ¬#\u0007<\u0084vra\u0087|¹ù¯\u000er\u0016©ÌGë\u0000Hno&ÜE\u0015Ýä\u008dñ\u0089\u0097\u009fï\"Ôª¦\u0088ÄÕ÷$@\u009dq\u00907;f `ý=Ã\u0082` pVã`IQb]sZ2\u00061r'ÒE\u0093\f\u0014Â·çð{\u0006UÿHÉ\u001e/À)\u008a¶¸æ\u008flÎF\u008c\u0002\u001f,ºáN\u008dZghÍe_â¾\u0089}W\u0002\b\u0001´\u0086T~i\u0081\u001b\b+6¬¶";
                     int var16 = "Í=\u008f¥ë~ÿp9\n\u0097f3\u0088}6$ØÓ \u0098\f¸\u0098K¤Ú¿l\u009c\u008dD|¼<¤\fë\u000b\f¦¤ãÁ|{®Ý\"\u0089\u0011Ý\u001c;\tò÷Ðp/\u0082\u009cw\u001b÷\u001e.\u008cà\u001dÍÁì\u001a\u008cc}W\n\u0086\u0080.*jÐ\u008cêUU\u0092»&\f\u0007©éü\t,JGgÛa\u001b?dXB\u0019\u000fÞ¬#\u0007<\u0084vra\u0087|¹ù¯\u000er\u0016©ÌGë\u0000Hno&ÜE\u0015Ýä\u008dñ\u0089\u0097\u009fï\"Ôª¦\u0088ÄÕ÷$@\u009dq\u00907;f `ý=Ã\u0082` pVã`IQb]sZ2\u00061r'ÒE\u0093\f\u0014Â·çð{\u0006UÿHÉ\u001e/À)\u008a¶¸æ\u008flÎF\u008c\u0002\u001f,ºáN\u008dZghÍe_â¾\u0089}W\u0002\b\u0001´\u0086T~i\u0081\u001b\b+6¬¶"
                        .length();
                     byte var13 = 0;

                     label103:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var57 = var17;
                        var10001 = var14++;
                        long var92 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var122 = -1;

                        while (true) {
                           long var19 = var92;
                           byte[] var21 = var11.doFinal(
                              new byte[]{
                                 (byte)(var19 >>> 56),
                                 (byte)(var19 >>> 48),
                                 (byte)(var19 >>> 40),
                                 (byte)(var19 >>> 32),
                                 (byte)(var19 >>> 24),
                                 (byte)(var19 >>> 16),
                                 (byte)(var19 >>> 8),
                                 (byte)var19
                              }
                           );
                           long var159 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var122) {
                              case 0:
                                 var57[var10001] = var159;
                                 if (var13 >= var16) {
                                    c = var17;
                                    d = new Integer[33];
                                    h = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var31 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[5];
                                    int var3 = 0;
                                    String var4 = "\u008ftô]\u001d9Oú\u001aâ~±\rv\u009d\u0088è¼l\u0099*;ìØ";
                                    int var5 = "\u008ftô]\u001d9Oú\u001aâ~±\rv\u009d\u0088è¼l\u0099*;ìØ".length();
                                    byte var2 = 0;

                                    label87:
                                    while (true) {
                                       int var74 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var74, var2).getBytes("ISO-8859-1");
                                       long[] var59 = var6;
                                       var74 = var3++;
                                       long var95 = (var7[0] & 255L) << 56
                                          | (var7[1] & 255L) << 48
                                          | (var7[2] & 255L) << 40
                                          | (var7[3] & 255L) << 32
                                          | (var7[4] & 255L) << 24
                                          | (var7[5] & 255L) << 16
                                          | (var7[6] & 255L) << 8
                                          | var7[7] & 255L;
                                       byte var125 = -1;

                                       while (true) {
                                          long var8 = var95;
                                          byte[] var10 = var0.doFinal(
                                             new byte[]{
                                                (byte)(var8 >>> 56),
                                                (byte)(var8 >>> 48),
                                                (byte)(var8 >>> 40),
                                                (byte)(var8 >>> 32),
                                                (byte)(var8 >>> 24),
                                                (byte)(var8 >>> 16),
                                                (byte)(var8 >>> 8),
                                                (byte)var8
                                             }
                                          );
                                          var159 = (var10[0] & 255L) << 56
                                             | (var10[1] & 255L) << 48
                                             | (var10[2] & 255L) << 40
                                             | (var10[3] & 255L) << 32
                                             | (var10[4] & 255L) << 24
                                             | (var10[5] & 255L) << 16
                                             | (var10[6] & 255L) << 8
                                             | var10[7] & 255L;
                                          switch (var125) {
                                             case 0:
                                                var59[var74] = var159;
                                                if (var2 >= var5) {
                                                   f = var6;
                                                   g = new Long[5];
                                                   String[] var46 = new String[4];
                                                   short var60 = 23883;
                                                   int var44 = 0;
                                                   long var77 = 187693645871639566L ^ var31;
                                                   String var43;
                                                   int var45 = (var43 = var22[3]).length();
                                                   short var78 = 819;
                                                   long var97 = 8270077634656383585L ^ var31;
                                                   char var42 = 14;
                                                   int var53 = -1;
                                                   btm(99);

                                                   label77:
                                                   while (true) {
                                                      short var61 = 2196;
                                                      long var79 = 759552652796049877L ^ var31;
                                                      byte var62 = 49;
                                                      String var80 = var43.substring(++var53, var53 + var42);
                                                      byte var98 = -1;

                                                      while (true) {
                                                         String var63 = a(var62, a(var80));
                                                         switch (var98) {
                                                            case 0:
                                                               var46[var44++] = var63;
                                                               if ((var53 += var42) >= var45) {
                                                                  a = var46;
                                                                  short var66 = 1555;
                                                                  long var83 = 8996788490322612575L ^ var31;
                                                                  long var34 = 83412247915482L;
                                                                  long[] var33 = new long[4];
                                                                  int var37 = 0;
                                                                  String var38;
                                                                  int var39 = (var38 = var22[0]).length();
                                                                  byte var36 = 0;

                                                                  label65:
                                                                  while (true) {
                                                                     int var84 = var36;
                                                                     var36 += 8;
                                                                     byte[] var40 = var38.substring(var84, var36).getBytes(var22[2]);
                                                                     long[] var67 = var33;
                                                                     var84 = var37++;
                                                                     long var101 = var40[0];
                                                                     short var127 = 32465;
                                                                     var159 = 412039183104633240L ^ var31;
                                                                     long var102 = var101 & 255L;
                                                                     short var128 = 32088;
                                                                     var159 = 2073061184486886411L ^ var31;
                                                                     long var103 = var102 << 56;
                                                                     long var129 = var40[1];
                                                                     short var164 = 523;
                                                                     long var10005 = 2123954221876548929L ^ var31;
                                                                     long var130 = var129 & 255L;
                                                                     short var165 = 32455;
                                                                     var10005 = 7487980780483596171L ^ var31;
                                                                     long var104 = var103 | var130 << 48;
                                                                     long var131 = var40[2];
                                                                     short var166 = 523;
                                                                     var10005 = 2123954221876548929L ^ var31;
                                                                     long var132 = var131 & 255L;
                                                                     short var167 = 8696;
                                                                     var10005 = 1946576384652480695L ^ var31;
                                                                     long var105 = var104 | var132 << 40;
                                                                     long var133 = var40[3];
                                                                     short var168 = 523;
                                                                     var10005 = 2123954221876548929L ^ var31;
                                                                     long var134 = var133 & 255L;
                                                                     short var169 = 25318;
                                                                     var10005 = 5917516071802753981L ^ var31;
                                                                     long var106 = var105 | var134 << 32;
                                                                     long var135 = var40[4];
                                                                     short var170 = 523;
                                                                     var10005 = 2123954221876548929L ^ var31;
                                                                     long var136 = var135 & 255L;
                                                                     short var171 = 18218;
                                                                     var10005 = 2497456839895250530L ^ var31;
                                                                     long var107 = var106 | var136 << 24;
                                                                     long var137 = var40[5];
                                                                     short var172 = 523;
                                                                     var10005 = 2123954221876548929L ^ var31;
                                                                     long var138 = var137 & 255L;
                                                                     short var173 = 12657;
                                                                     var10005 = 8566598667261116475L ^ var31;
                                                                     long var108 = var107 | var138 << 16;
                                                                     short var174 = 24007;
                                                                     var10005 = 4449466405632044186L ^ var31;
                                                                     long var139 = var40[6];
                                                                     short var175 = 523;
                                                                     var10005 = 2123954221876548929L ^ var31;
                                                                     long var140 = var139 & 255L;
                                                                     short var176 = 6875;
                                                                     var10005 = 340781299861597105L ^ var31;
                                                                     long var109 = var108 | var140 << 8;
                                                                     short var177 = 29270;
                                                                     var10005 = 468409036160779029L ^ var31;
                                                                     long var141 = var40[7];
                                                                     short var178 = 523;
                                                                     var10005 = 2123954221876548929L ^ var31;
                                                                     long var110 = var109 | var141 & 255L;
                                                                     byte var142 = -1;

                                                                     while (true) {
                                                                        var159 = var110 ^ var34;
                                                                        switch (var142) {
                                                                           case 0:
                                                                              var67[var84] = var159;
                                                                              if (var36 >= var39) {
                                                                                 fzm = (int)var33[1];
                                                                                 brr = (int)var33[3];
                                                                                 ake = (int)var33[0];
                                                                                 cwg = (int)var33[2];
                                                                                 return;
                                                                              }
                                                                              break;
                                                                           default:
                                                                              var67[var84] = var159;
                                                                              if (var36 < var39) {
                                                                                 continue label65;
                                                                              }

                                                                              var39 = (var38 = var22[4]).length();
                                                                              var36 = 0;
                                                                        }

                                                                        byte var86 = var36;
                                                                        var36 += 8;
                                                                        var40 = var38.substring(var86, var36).getBytes(var22[1]);
                                                                        var67 = var33;
                                                                        var84 = var37++;
                                                                        long var112 = var40[0];
                                                                        short var144 = 523;
                                                                        var159 = 2123954221876548929L ^ var31;
                                                                        long var113 = var112 & 255L;
                                                                        short var145 = 5088;
                                                                        var159 = 3717377508304691892L ^ var31;
                                                                        long var114 = var113 << 56;
                                                                        long var146 = var40[1];
                                                                        short var183 = 523;
                                                                        var10005 = 2123954221876548929L ^ var31;
                                                                        long var147 = var146 & 255L;
                                                                        short var184 = 32455;
                                                                        var10005 = 7487980780483596171L ^ var31;
                                                                        long var115 = var114 | var147 << 48;
                                                                        long var148 = var40[2];
                                                                        short var185 = 523;
                                                                        var10005 = 2123954221876548929L ^ var31;
                                                                        long var149 = var148 & 255L;
                                                                        short var186 = 21110;
                                                                        var10005 = 2382517511976837934L ^ var31;
                                                                        long var116 = var115 | var149 << 40;
                                                                        long var150 = var40[3];
                                                                        short var187 = 523;
                                                                        var10005 = 2123954221876548929L ^ var31;
                                                                        long var151 = var150 & 255L;
                                                                        short var188 = 27690;
                                                                        var10005 = 4445641022204697968L ^ var31;
                                                                        long var117 = var116 | var151 << 32;
                                                                        long var152 = var40[4];
                                                                        short var189 = 523;
                                                                        var10005 = 2123954221876548929L ^ var31;
                                                                        long var153 = var152 & 255L;
                                                                        short var190 = 18218;
                                                                        var10005 = 2497456839895250530L ^ var31;
                                                                        long var118 = var117 | var153 << 24;
                                                                        long var154 = var40[5];
                                                                        short var191 = 523;
                                                                        var10005 = 2123954221876548929L ^ var31;
                                                                        long var155 = var154 & 255L;
                                                                        short var192 = 1922;
                                                                        var10005 = 529687409709627100L ^ var31;
                                                                        long var119 = var118 | var155 << 16;
                                                                        short var193 = 18998;
                                                                        var10005 = 2658505270407428978L ^ var31;
                                                                        long var156 = var40[6];
                                                                        short var194 = 523;
                                                                        var10005 = 2123954221876548929L ^ var31;
                                                                        long var157 = var156 & 255L;
                                                                        short var195 = 16625;
                                                                        var10005 = 5122046421115597230L ^ var31;
                                                                        long var120 = var119 | var157 << 8;
                                                                        short var196 = 29270;
                                                                        var10005 = 468409036160779029L ^ var31;
                                                                        long var158 = var40[7];
                                                                        short var197 = 523;
                                                                        var10005 = 2123954221876548929L ^ var31;
                                                                        var110 = var120 | var158 & 255L;
                                                                        var142 = 0;
                                                                     }
                                                                  }
                                                               }

                                                               var42 = var43.charAt(var53);
                                                               break;
                                                            default:
                                                               var46[var44++] = var63;
                                                               if ((var53 += var42) < var45) {
                                                                  var42 = var43.charAt(var53);
                                                                  continue label77;
                                                               }

                                                               var45 = (var43 = var22[5]).length();
                                                               short var64 = 28743;
                                                               long var81 = 2889829350399361303L ^ var31;
                                                               var42 = 25;
                                                               var53 = -1;
                                                         }

                                                         short var65 = 19017;
                                                         long var82 = 2351748291599072000L ^ var31;
                                                         var62 = 24;
                                                         var80 = var43.substring(++var53, var53 + var42);
                                                         var98 = 0;
                                                      }
                                                   }
                                                }
                                                break;
                                             default:
                                                var59[var74] = var159;
                                                if (var2 < var5) {
                                                   continue label87;
                                                }

                                                var4 = "Âq0¹Ãù5ÎMwíd¢\u0017ö\"";
                                                var5 = "Âq0¹Ãù5ÎMwíd¢\u0017ö\"".length();
                                                var2 = 0;
                                          }

                                          byte var76 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var76, var2).getBytes("ISO-8859-1");
                                          var59 = var6;
                                          var74 = var3++;
                                          var95 = (var7[0] & 255L) << 56
                                             | (var7[1] & 255L) << 48
                                             | (var7[2] & 255L) << 40
                                             | (var7[3] & 255L) << 32
                                             | (var7[4] & 255L) << 24
                                             | (var7[5] & 255L) << 16
                                             | (var7[6] & 255L) << 8
                                             | var7[7] & 255L;
                                          var125 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var57[var10001] = var159;
                                 if (var13 < var16) {
                                    continue label103;
                                 }

                                 var15 = "úërsyãÛÛ\u001a*ü°íN[\"";
                                 var16 = "úërsyãÛÛ\u001a*ü°íN[\"".length();
                                 var13 = 0;
                           }

                           byte var73 = var13;
                           var13 += 8;
                           var18 = var15.substring(var73, var13).getBytes("ISO-8859-1");
                           var57 = var17;
                           var10001 = var14++;
                           var92 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var122 = 0;
                        }
                     }
                  }

                  var26 = var27.charAt(var50);
                  break;
               default:
                  var22[var28++] = var88;
                  if ((var50 += var26) < var29) {
                     var26 = var27.charAt(var50);
                     continue label121;
                  }

                  var27 = "·Qmvl\u008aûo×\u0010\u0086xª\u009fÜ³\u0081m\u000f'K\u0081S\u0010:1rþÄØën8\u007fÙF\u001cÕ\u0094ß\u00134ÍÊ¬Úß¬\u0096wç\u000b_Jð=S\rÁ\u009f'\u0004½Ðv6èò\u009e\"\u0005 }RT{G\u009cü\u0082\u00ad=l´<\u0001\u0002|«";
                  var29 = "·Qmvl\u008aûo×\u0010\u0086xª\u009fÜ³\u0081m\u000f'K\u0081S\u0010:1rþÄØën8\u007fÙF\u001cÕ\u0094ß\u00134ÍÊ¬Úß¬\u0096wç\u000b_Jð=S\rÁ\u009f'\u0004½Ðv6èò\u009e\"\u0005 }RT{G\u009cü\u0082\u00ad=l´<\u0001\u0002|«"
                     .length();
                  var26 = ' ';
                  var50 = -1;
            }

            var54 = var27.substring(++var50, var50 + var26);
            var10001 = 0;
         }
      }
   }

   private static char[] a(String var0) {
      long var1 = b ^ 139595493684081L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 24742;
         long var10005 = 4057344677327924079L ^ var1;
         var10000[0] = (char)(var10003 ^ 'W');
      }

      return var10000;
   }

   private static String a(int var0, char[] var1) {
      long var2 = b ^ 115757907486244L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 20726;
         long var10009 = 8080306047715102309L ^ var2;
         byte var10;
         switch (var4 % 7) {
            case 0:
               var10 = 32255;
               long var23 = 8210007303128048507L ^ var2;
               var10 = 82;
               break;
            case 1:
               var10 = 3364;
               long var22 = 1868044255950771106L ^ var2;
               var10 = 70;
               break;
            case 2:
               var10 = 23340;
               long var21 = 3398831615060559275L ^ var2;
               var10 = 48;
               break;
            case 3:
               var10 = 18543;
               long var20 = 5580076419487946494L ^ var2;
               var10 = 33;
               break;
            case 4:
               var10 = 28618;
               long var19 = 2402252901379338588L ^ var2;
               var10 = 110;
               break;
            case 5:
               var10 = 9710;
               long var18 = 2814572074637638499L ^ var2;
               var10 = 47;
               break;
            default:
               var10 = 24028;
               long var17 = 7211053002585981771L ^ var2;
               var10 = 87;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1549;
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
            throw new RuntimeException("cc/astralis/eyj", var14);
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
         throw new RuntimeException("cc/astralis/eyj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8207;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/eyj", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static long b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = b(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/eyj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
