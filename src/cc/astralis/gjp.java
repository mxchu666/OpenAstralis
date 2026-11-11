package cc.astralis;

import com.google.gson.JsonObject;
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

public class gjp extends brc {
   private int cx;
   private static int hgp;
   private static final String[] b;
   private static final long c = 51391893102721L;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public gjp() {
      super(0);
   }

   public gjp(int uid) {
      super(0);
      a.cx = a;
   }

   @Override
   public void etg(JsonObject json) {
      a.cps(a);
      a.cx = a.get(b[1]).getAsInt();
   }

   @Override
   public String cql() {
      JsonObject a = a.fdo();
      Object[] var10002 = new Object[2];
      String[] var2 = b;
      var10002[0] = var2[3];
      var10002[1] = a.cx;
      a.eqw(a, var10002);
      return fz.dvr(a.toString(), cni.fsi(var2[0]), cni.fsi(var2[2]));
   }

   public int fak() {
      return a.cx;
   }

   public static void fml(int var0) {
      hgp = var0;
   }

   public static int fzo() {
      return hgp;
   }

   public static int epr() {
      long var0 = c ^ 32903265593993L;
      int[] var2 = dar.abu();
      int var3 = fzo();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            return a<"f">(4148, 4863650260271729561L ^ var0);
         }

         var10000 = 0;
      }

      return var10000;
   }

   static {
      long var20 = c ^ 95958747644823L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[2];
      int var17 = 0;
      String var16 = "o\u0084LD\u0085â|A\"\u0081@ÏÉ¤î\u0086\u001bf_ÔE9Ø\u0013i\u000f\u0005\u0003Ê\u0094\t\u0080û*ê\u0013\u0000¾ø~1\u0018ài\u0099xe\u0096\u0087$Ì¨\tÿ,\u0018h,+>\u0099\u0099=,ç\u001d·\u0088\u0093\u0088U\u008b\fMhrÊaP²ö\u0010©5Å¾\u0080Å¯®¦Ë©\u0003;E\u0085j\u007f\u00adÇ\u0006\u0017Ôø\u008f<4ñØ\u009e7Ï¯\u008c®^ \u0091ÒÔ\bÀ£H³Ïe\u0003I\u000f¤û?\u0002l\u0014\u0080m\u0081\u008ca>\u0005ì\u001dZíµx\u0092Y4\u0018±\u001a¨±Lci";
      int var18 = "o\u0084LD\u0085â|A\"\u0081@ÏÉ¤î\u0086\u001bf_ÔE9Ø\u0013i\u000f\u0005\u0003Ê\u0094\t\u0080û*ê\u0013\u0000¾ø~1\u0018ài\u0099xe\u0096\u0087$Ì¨\tÿ,\u0018h,+>\u0099\u0099=,ç\u001d·\u0088\u0093\u0088U\u008b\fMhrÊaP²ö\u0010©5Å¾\u0080Å¯®¦Ë©\u0003;E\u0085j\u007f\u00adÇ\u0006\u0017Ôø\u008f<4ñØ\u009e7Ï¯\u008c®^ \u0091ÒÔ\bÀ£H³Ïe\u0003I\u000f¤û?\u0002l\u0014\u0080m\u0081\u008ca>\u0005ì\u001dZíµx\u0092Y4\u0018±\u001a¨±Lci"
         .length();
      char var15 = '8';
      int var14 = -1;

      while (true) {
         byte[] var19 = var12.doFinal(var16.substring(++var14, var14 + var15).getBytes("ISO-8859-1"));
         String var49 = b(var19).intern();
         int var10001 = -1;
         var11[var17++] = var49;
         if ((var14 += var15) >= var18) {
            i = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[12];
            int var3 = 0;
            String var4 = "ø\"´Ôâ\u00ad\f>Ô\u0080Ã©\u007f>\"bV\u0095ºþÅíSÔ\u0011¬#Á\u0088\u0002Íßgç²\u0083\u0016÷yc\u0085º\u0083ÑEf/\u000bKø=á³ú\u0094\u0007\u0096k*\u0097bÍ×,6%}tþÆ\u00ad\u0089\u0015»\"ämà\"Ì";
            int var5 = "ø\"´Ôâ\u00ad\f>Ô\u0080Ã©\u007f>\"bV\u0095ºþÅíSÔ\u0011¬#Á\u0088\u0002Íßgç²\u0083\u0016÷yc\u0085º\u0083ÑEf/\u000bKø=á³ú\u0094\u0007\u0096k*\u0097bÍ×,6%}tþÆ\u00ad\u0089\u0015»\"ämà\"Ì"
               .length();
            byte var2 = 0;

            label54:
            while (true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var33 = var6;
               var10001 = var3++;
               long var52 = (var7[0] & 255L) << 56
                  | (var7[1] & 255L) << 48
                  | (var7[2] & 255L) << 40
                  | (var7[3] & 255L) << 32
                  | (var7[4] & 255L) << 24
                  | (var7[5] & 255L) << 16
                  | (var7[6] & 255L) << 8
                  | var7[7] & 255L;
               byte var58 = -1;

               while (true) {
                  long var8 = var52;
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
                  long var60 = (var10[0] & 255L) << 56
                     | (var10[1] & 255L) << 48
                     | (var10[2] & 255L) << 40
                     | (var10[3] & 255L) << 32
                     | (var10[4] & 255L) << 24
                     | (var10[5] & 255L) << 16
                     | (var10[6] & 255L) << 8
                     | var10[7] & 255L;
                  switch (var58) {
                     case 0:
                        var33[var10001] = var60;
                        if (var2 >= var5) {
                           g = var6;
                           h = new Integer[12];
                           String[] var27 = new String[4];
                           short var34 = 1658;
                           int var25 = 0;
                           long var44 = 4735195827136246986L ^ var20;
                           String var24;
                           int var26 = (var24 = var11[0]).length();
                           int var23 = a<"f">(27269, 3225371172348876855L ^ var20);
                           fml(7);
                           int var31 = -1;

                           label44:
                           while (true) {
                              short var35 = 19569;
                              long var45 = 3746623174941146829L ^ var20;
                              byte var36 = 37;
                              String var46 = var24.substring(++var31, var31 + var23);
                              byte var54 = -1;

                              while (true) {
                                 String var37 = b(var36, b(var46));
                                 switch (var54) {
                                    case 0:
                                       var27[var25++] = var37;
                                       if ((var31 += var23) >= var26) {
                                          b = var27;
                                          return;
                                       }

                                       var23 = var24.charAt(var31);
                                       break;
                                    default:
                                       var27[var25++] = var37;
                                       if ((var31 += var23) < var26) {
                                          var23 = var24.charAt(var31);
                                          continue label44;
                                       }

                                       var26 = (var24 = var11[1]).length();
                                       short var38 = 9312;
                                       long var47 = 1256547504662648543L ^ var20;
                                       var23 = 96;
                                       var31 = -1;
                                 }

                                 short var39 = 1156;
                                 long var48 = 4442451349904111167L ^ var20;
                                 var36 = 69;
                                 var46 = var24.substring(++var31, var31 + var23);
                                 var54 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var33[var10001] = var60;
                        if (var2 < var5) {
                           continue label54;
                        }

                        var4 = "\u0015=Ix½\t\u001bI\u0001©Ó5¾cæ±";
                        var5 = "\u0015=Ix½\t\u001bI\u0001©Ó5¾cæ±".length();
                        var2 = 0;
                  }

                  byte var43 = var2;
                  var2 += 8;
                  var7 = var4.substring(var43, var2).getBytes("ISO-8859-1");
                  var33 = var6;
                  var10001 = var3++;
                  var52 = (var7[0] & 255L) << 56
                     | (var7[1] & 255L) << 48
                     | (var7[2] & 255L) << 40
                     | (var7[3] & 255L) << 32
                     | (var7[4] & 255L) << 24
                     | (var7[5] & 255L) << 16
                     | (var7[6] & 255L) << 8
                     | var7[7] & 255L;
                  var58 = 0;
               }
            }
         }

         var15 = var16.charAt(var14);
      }
   }

   private static char[] b(String var0) {
      long var1 = c ^ 28286319973065L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 8435;
         long var10005 = 1297687109463458576L ^ var1;
         var10000[0] = (char)(var10003 ^ 7);
      }

      return var10000;
   }

   private static String b(int var0, char[] var1) {
      long var2 = c ^ 65298742759346L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 8435;
         long var10009 = 1297719861278695019L ^ var2;
         var10001[var4] = (char)(var10005 ^ var10002 ^ switch (var4 % 7) {
            case 0 -> {
               short var15 = 24516;
               long var21 = 3416558613871862104L ^ var2;
               yield 86;
            }
            case 1 -> 4;
            case 2 -> {
               short var14 = 23279;
               long var20 = 3391837693973832816L ^ var2;
               yield 67;
            }
            case 3 -> {
               short var13 = 14269;
               long var19 = 5185468358465308960L ^ var2;
               yield 111;
            }
            case 4 -> {
               short var12 = 20229;
               long var18 = 8963648104230957457L ^ var2;
               yield 28;
            }
            case 5 -> {
               short var11 = 3318;
               long var17 = 2153927497381671533L ^ var2;
               yield 55;
            }
            default -> {
               short var10007 = 8435;
               long var16 = 1297719861278695019L ^ var2;
               yield 7;
            }
         });
      }

      return new String(var10001).intern();
   }

   private static String b(byte[] var0) {
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20911;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/gjp", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
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
         throw new RuntimeException("cc/astralis/gjp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
