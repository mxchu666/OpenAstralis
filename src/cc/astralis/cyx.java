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

public class cyx extends ffn<hcr> {
   private final HashMap<String, hcr> aqo;
   private static String gvx;
   private static final long a = 7582954100446L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public cyx(String name, hcr... classes) {
      long ax = cyx.a ^ 119726206910525L;
      int[] axx = dar.abu();
      super(a, a.length > 0 ? a[0] : null);
      a.aqo = new HashMap<>();
      HashMap var10000 = a.aqo;
      short var10001 = 359;
      long var10002 = 6447907438698330606L ^ ax;
      guu var10004 = a.dnp().clv();
      short var10005 = 25294;
      long var10006 = 7995192767999875653L ^ ax;
      var10000.put("None", new hcr(var10004, "None"));
      hcr[] var6 = a;
      int var7 = a.length;
      int var8 = 0;

      while (true) {
         if (var8 < var7) {
            hcr axxx = var6[var8];
            a.aqo.put(axxx.akm(), axxx);
            var8++;
            if (axx == null) {
               break;
            }

            if (axx != null) {
               continue;
            }
         }

         Object var10 = a.ajf().get();
         if (axx != null) {
            if (!var10) {
               break;
            }

            var10 = a.dnp();
         }

         if (axx != null) {
            if (var10 == null) {
               break;
            }

            var10 = a.dnp();
         }

         var10 = ((hcr)var10).clv();
         if (axx != null) {
            if (!((guu)var10).dsv()) {
               break;
            }

            a.dnp().hkh(true);
            var10 = a.dnp();
         }

         ((hcr)var10).frr(true);
         break;
      }
   }

   public void biz(hcr newMode) {
      int[] var4;
      boolean var6;
      label57: {
         label56: {
            label55: {
               label60: {
                  long ax = cyx.a ^ 61801631822741L;
                  var4 = dar.abu();
                  Object var10000 = a.dnp();
                  if (var4 != null) {
                     if (var10000 != null) {
                        var5 = a.dnp();
                        if (var4 == null) {
                           break label55;
                        }

                        if (var5 != a) {
                           break label60;
                        }
                     }

                     var10000 = a.ajf().get();
                  }

                  var6 = (Boolean)var10000;
                  if (var4 == null) {
                     break label57;
                  }

                  if (var6) {
                     break label56;
                  }
               }

               var5 = a.dnp();
            }

            ((hcr)var5).hkh(false);
         }

         super.gbf(a);
         var6 = a.clv().dsv();
      }

      if (var4 != null) {
         if (!var6) {
            return;
         }

         var6 = a.ajf().get();
      }

      if (var6) {
         a.hkh(true);
      }
   }

   public boolean cmt(String name) {
      return a.dnp().akm().equalsIgnoreCase(a);
   }

   public HashMap<String, hcr> ajs() {
      return a.aqo;
   }

   public static void aev(String var0) {
      gvx = var0;
   }

   public static String fig() {
      return gvx;
   }

   static {
      long var9 = a ^ 114662500299322L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "Ì(`IèVT×\u0016oQþe«è\u0007\u0010ò\u000eç\u0017\u009b\u0091\u0093\u0005Ä'Æâ´9j/\u0010\"\u0082ÆÂ\u0090ø.s&kÂ\u0004p>â6";
      int var6 = "Ì(`IèVT×\u0016oQþe«è\u0007\u0010ò\u000eç\u0017\u009b\u0091\u0093\u0005Ä'Æâ´9j/\u0010\"\u0082ÆÂ\u0090ø.s&kÂ\u0004p>â6".length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var15 = a(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var15;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[3];
            if (fig() != null) {
               short var12 = 18814;
               long var14 = 3007871539377521651L ^ var9;
               aev("nScQCc");
            }

            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28264;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/cyx", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("cc/astralis/cyx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
