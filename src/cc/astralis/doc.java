package cc.astralis;

import imgui.type.ImFloat;
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
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_3675;
import net.minecraft.class_746;

public class doc extends guu {
   private final bes bco;
   private final bes egq;
   private final gbp gvd;
   private static final long a = 49298318435946L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long p;

   public doc() {
      long a = doc.a ^ 37547127334459L;
      super(bfm.MOVEMENT);
      short var10003 = 27406;
      long var10004 = 6143420582507021700L ^ a;
      a.bco = new bes("Speed", 1.5F, 0.1F, 5.0F, 0.1F);
      var10003 = 29997;
      var10004 = 2298224377786604454L ^ a;
      a.egq = new bes("Vertical Speed", 0.8F, 0.1F, 2.0F, 0.1F);
      var10003 = 15865;
      var10004 = 3468241735569199984L ^ a;
      a.gvd = new gbp("Only With Elytra", true);
      a.bfi(new ffn[]{a.bco, a.egq, a.gvd});
   }

   @gdz
   public void btd(fnt event) {
      long ax = doc.a ^ 47451484599422L;
      int[] var4 = dar.abu();
      if (var4 != null) {
         if (!a.ekn()) {
            return;
         }

         chi.field_1690.field_1832.method_23481(false);
      }
   }

   @gdz
   public void cfz(elx event) {
      long ax = doc.a ^ 60824303240505L;
      int[] axx = dar.abu();
      Object var10000 = a;
      if (axx != null) {
         if (!a.ekn()) {
            return;
         }

         var10000 = a.bco.dnp();
      }

      float axxx = ((ImFloat)var10000).floatValue();
      double axxxx = Math.toRadians(chi.field_1724.method_36454());
      int var16 = chi.field_1690.field_1894.method_1434();
      if (axx != null) {
         var16 = var16 != 0 ? 1 : 0;
      }

      int var10001 = chi.field_1690.field_1881.method_1434();
      if (axx != null) {
         var10001 = var10001 != 0 ? 1 : 0;
      }

      int axxxxx = var16 - var10001;
      int var17 = chi.field_1690.field_1849.method_1434();
      if (axx != null) {
         var17 = var17 != 0 ? -1 : 0;
      }

      var10001 = chi.field_1690.field_1913.method_1434();
      if (axx != null) {
         var10001 = var10001 != 0 ? -1 : 0;
      }

      double axxxxxx;
      double axxxxxxx;
      double axxxxxxxx;
      label64: {
         int axxxxxxxxx = var17 - var10001;
         axxxxxx = (axxxxx * -Math.sin(axxxx) + axxxxxxxxx * Math.cos(axxxx)) * axxx;
         axxxxxxx = (axxxxx * Math.cos(axxxx) + axxxxxxxxx * Math.sin(axxxx)) * axxx;
         axxxxxxxx = 0.0;
         boolean var18 = chi.field_1690.field_1903.method_1434();
         if (axx != null) {
            if (var18) {
               axxxxxxxx = a.egq.dnp().floatValue();
               if (axx != null) {
                  break label64;
               }
            }

            var18 = class_3675.method_15987(chi.method_22683(), (int)p);
         }

         if (var18) {
            axxxxxxxx -= a.egq.dnp().floatValue();
         }
      }

      a.dof(axxxxxx);
      a.ftl(axxxxxxxx);
      a.gni(axxxxxxx);
   }

   @Override
   public void auj() {
      long a = doc.a ^ 43671764068269L;
      int[] var3 = dar.abu();
      doc var10000 = a;
      if (var3 != null) {
         label24:
         if (a.ekn()) {
            class_746 var4 = chi.field_1724;
            if (var3 != null) {
               if (chi.field_1724.method_6128()) {
                  break label24;
               }

               var4 = chi.field_1724;
            }

            var4.method_23669();
         }

         var10000 = a;
      }

      var10000.auj();
   }

   @Override
   public void frg() {
      long a = doc.a ^ 51818261999870L;
      int[] var3 = dar.abu();
      if (var3 != null) {
         if (chi.field_1724 != null) {
            evd.eeo();
         }

         super.frg();
      }
   }

   private boolean ekn() {
      long a = doc.a ^ 130055069722257L;
      int[] ax = dar.abu();
      Object var10000 = chi.field_1724;
      if (ax != null) {
         if (chi.field_1724 == null) {
            return false;
         }

         var10000 = a.gvd.dnp();
      }

      boolean var5 = (Boolean)var10000;
      if (ax != null) {
         if (var5) {
            class_1799 axx = chi.field_1724.method_6118(class_1304.field_6174);
            var10000 = axx;
            if (ax != null) {
               if (axx == null) {
                  return false;
               }

               var10000 = axx;
            }

            if (var10000.method_7909() != class_1802.field_8833) {
               return false;
            }
         }

         var5 = chi.field_1724.method_6128();
      }

      return var5;
   }

   static {
      long var5 = a ^ 135115252463864L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[3];
      int var12 = 0;
      String var11 = "ÿ\u00ad\u0003\u0010\u009d\u0017H\u0011ýèº\u0086\"8\u0097§½¾6Ñº'äx\u009f×a´iW\u0019\"\u0010ó\n\u000eç&ý»ü\u009c\u0095\u0007³\u0090\u00995\u00980i|\u009aê7Þò¶ç\u001e~ÛÌQUå[Ï\u0080Â»ª¤\u0087lrõ%\u0094uäÀ¡\u0089\u0090\u009dXØ4ëõË~KÍ¨\u0088{";
      int var13 = "ÿ\u00ad\u0003\u0010\u009d\u0017H\u0011ýèº\u0086\"8\u0097§½¾6Ñº'äx\u009f×a´iW\u0019\"\u0010ó\n\u000eç&ý»ü\u009c\u0095\u0007³\u0090\u00995\u00980i|\u009aê7Þò¶ç\u001e~ÛÌQUå[Ï\u0080Â»ª¤\u0087lrõ%\u0094uäÀ¡\u0089\u0090\u009dXØ4ëõË~KÍ¨\u0088{"
         .length();
      char var10 = ' ';
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var20 = d(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var20;
         if ((var9 += var10) >= var13) {
            g = var14;
            h = new String[3];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = 1910046113377809723L;
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
            long var23 = (var4[0] & 255L) << 56
               | (var4[1] & 255L) << 48
               | (var4[2] & 255L) << 40
               | (var4[3] & 255L) << 32
               | (var4[4] & 255L) << 24
               | (var4[5] & 255L) << 16
               | (var4[6] & 255L) << 8
               | var4[7] & 255L;
            var10001 = -1;
            p = var23;
            return;
         }

         var10 = var11.charAt(var9);
      }
   }

   private static String d(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11994;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/doc", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
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
         throw new RuntimeException("cc/astralis/doc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
