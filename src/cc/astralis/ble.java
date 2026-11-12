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
import net.minecraft.class_243;

public class ble extends hcr {
   private final efx ftw;
   private final adu fob;
   private cbm cce;
   private int bzg;
   private final long dgm;
   final double gip;
   private final long ccb;
   private static final long a = 94519210455217L;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] g;
   private static final Long[] h;
   private static final Map i;

   public ble(guu parentClass) {
      long ax = ble.a ^ 42158442428908L;
      short var10002 = 10629;
      long var10003 = 8872405426394427322L ^ ax;
      super(a, "Watchdog");
      a.ftw = (efx)a.clv();
      short var7 = 855;
      long var10004 = 6210375185528702314L ^ ax;
      short var8 = 28558;
      long var10005 = 6000472842251315637L ^ ax;
      String[] var9 = new String[2];
      short var10008 = 28558;
      long var10009 = 6000472842251315637L ^ ax;
      var9[0] = "Jump";
      var10008 = 32419;
      var10009 = 4303097045069510813L ^ ax;
      var9[1] = "Bypass";
      a.fob = new adu("Watchdog Sprint Mode", "Jump", var9);
      a.cce = new cbm();
      a.bzg = 0;
      short var10001 = 18672;
      long var5 = 8424798808615980287L ^ ax;
      a.dgm = -10000000000000000L;
      a.gip = 1.0E18;
      var10001 = 8001;
      long var6 = 2276793660206111567L ^ ax;
      a.ccb = 111111111111111111L;
      a.ebu(a.fob);
   }

   @Override
   public void dil() {
      long a = ble.a ^ 93753426490403L;
      int[] ax = dar.abu();
      if (ax != null) {
         label52:
         if (chi.field_1724 != null) {
            Object var6;
            label79: {
               boolean var10000 = chi.field_1724.method_24828();
               if (ax != null) {
                  if (!var10000) {
                     break label52;
                  }

                  var6 = dar.gqy().aws().diy(eky.class);
                  if (ax == null) {
                     break label79;
                  }

                  var10000 = ((eky)var6).dsv();
               }

               if (var10000) {
                  break label52;
               }

               var6 = a.fob.dnp();
            }

            String var4 = (String)var6;
            byte var5 = -1;
            var7 = var4.hashCode();
            label65:
            if (ax != null) {
               switch (var7) {
                  case 2320462:
                     short var10001 = 9430;
                     long var10002 = 3961098849009168165L ^ a;
                     var7 = var4.equals("Jump");
                     if (ax == null) {
                        break label65;
                     }

                     if (var7 == 0) {
                        break;
                     }

                     var5 = 0;
                     if (ax != null) {
                        break;
                     }
                  case 2004703496:
                     short var8 = 6839;
                     long var9 = 8682833187815641408L ^ a;
                     var7 = var4.equals("Bypass");
                     if (ax == null) {
                        break label65;
                     }

                     if (var7 != 0) {
                        var5 = 1;
                     }
               }

               var7 = var5;
            }

            switch (var7) {
               case 0:
                  chi.field_1724.method_6043();
               case 1:
            }
         }

         a.bzg = 0;
         a.ftw.fwx = true;
         super.dil();
      }
   }

   @Override
   public void cbw() {
      a.cce.glr();
      evd.eeo();
      super.cbw();
   }

   @gdz
   public void eqw(eih event) {
      long ax = ble.a ^ 52429121917897L;
      int[] axx = dar.abu();
      int var10000 = evd.bpi();
      if (axx != null) {
         if (var10000 != 0) {
            chi.field_1724
               .method_18800(
                  chi.field_1724.method_18798().field_1352 * 0.95, chi.field_1724.method_18798().field_1351, chi.field_1724.method_18798().field_1350 * 0.95
               );
         }

         var10000 = dar.gqy().aws().diy(eky.class).dsv();
      }

      if (axx != null) {
         if (var10000 != 0) {
            return;
         }

         var10000 = chi.field_1690.field_1903.method_1434();
      }

      if (axx != null) {
         if (var10000 != 0) {
            return;
         }

         var10000 = evd.dbj();
      }

      if (axx != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = a.ftw.bza.dnp();
      }

      if (axx != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = a.ftw.gnd;
      }

      if (axx != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = a.ftw.dsv();
      }

      if (axx != null) {
         if (var10000 == 0) {
            return;
         }

         short var10001 = 6773;
         long var10002 = 8582267627961906793L ^ ax;
         bpa.bez("opffset " + chi.field_1724.field_6012);
         var10000 = chi.field_1724.method_24828();
      }

      if (axx != null) {
         if (var10000 != 0) {
            double axxx = 1.0E-10 + Math.random() * 1.0E-35;
            a.ewz(a.eil() + axxx);
            float axxxx = evd.bpi() ? 0.27F : 0.275F;
            evd.dek(evd.cqz(evd.bpi() ? 0.21F : 0.275F, 0.25F, axxxx));
            class_243 axxxxx = chi.field_1724.method_73189();
            double axxxxxx = -0.01;
            chi.field_1724.method_5814(axxxxx.field_1352, axxxxx.field_1351 + axxxxxx, axxxxx.field_1350);
            double axxxxxxx = 0.1111111111111111;
            chi.field_1724.method_5814(axxxxx.field_1352, axxxxx.field_1351 + axxxxxxx, axxxxx.field_1350);
            a.dad(false);
            if (axx != null) {
               return;
            }
         }

         var10000 = evd.bpi();
      }

      if (var10000 == 0) {
         evd.dek(evd.cqz(0.23F, 0.24F, 0.27F));
      }
   }

   static {
      long var11 = a ^ 122640780095902L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[7];
      int var18 = 0;
      String var17 = "ZT\u009eM¼áøwk\u009c\u0083\u0082zi´v\u0001\u0084\u001bÖz\u0095¹ç\u007fÚ\u0084õs7å P\u0083'\u0082¨U\u0007Ç\u0010\u008e!\u0099¯QZ%ò%\u0089çMÃ]\u0007X\u0018À)Ò\\:p\u0011øã\u0018\u0002þVÒùé\u0081\u0011,ø\u0081ßQA\u0010\u008dµ\fÞÛ\u008eßý\u0097Ñ5R÷UçL\u0018Æ\u0012Ø\u001fT¶)\u001cè¸òóÆ\u0001\u0082Iâöm'\u008f©4\u0015";
      int var19 = "ZT\u009eM¼áøwk\u009c\u0083\u0082zi´v\u0001\u0084\u001bÖz\u0095¹ç\u007fÚ\u0084õs7å P\u0083'\u0082¨U\u0007Ç\u0010\u008e!\u0099¯QZ%ò%\u0089çMÃ]\u0007X\u0018À)Ò\\:p\u0011øã\u0018\u0002þVÒùé\u0081\u0011,ø\u0081ßQA\u0010\u008dµ\fÞÛ\u008eßý\u0097Ñ5R÷UçL\u0018Æ\u0012Ø\u001fT¶)\u001cè¸òóÆ\u0001\u0082Iâöm'\u008f©4\u0015"
         .length();
      char var16 = '(';
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     d = var20;
                     e = new String[7];
                     i = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "ø\"\u009dtxé´\u008c£H\u000f\u009csz$ö";
                     int var5 = "ø\"\u009dtxé´\u008c£H\u000f\u009csz$ö".length();
                     byte var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
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
                        long var10004 = (var10[0] & 255L) << 56
                           | (var10[1] & 255L) << 48
                           | (var10[2] & 255L) << 40
                           | (var10[3] & 255L) << 32
                           | (var10[4] & 255L) << 24
                           | (var10[5] & 255L) << 16
                           | (var10[6] & 255L) << 8
                           | var10[7] & 255L;
                        byte var38 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     g = var6;
                     h = new Long[2];
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var33;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "Â*\u0090hÊzý*P2N\u0019.F\u0098\u0013\u0010\u0098ÈÍÔÍh^Q\u0091\u001ds\u0092Ëæ\u0088\u00ad";
                  var19 = "Â*\u0090hÊzý*P2N\u0019.F\u0098\u0013\u0010\u0098ÈÍÔÍh^Q\u0091\u001ds\u0092Ëæ\u0088\u00ad".length();
                  var16 = 16;
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20320;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/ble", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("cc/astralis/ble" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19794;
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
            throw new RuntimeException("cc/astralis/ble", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("cc/astralis/ble" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
