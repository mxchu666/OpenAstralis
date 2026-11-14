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
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2428;
import net.minecraft.class_2680;

public class NoteBlock extends guu {
   private static final long a = 71063387027887L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public NoteBlock() {
      super(bfm.WORLD);
   }

   @gdz
   public void hco(fxx event) {
      long ax = NoteBlock.a ^ 83204338705242L;
      class_2338 axx = chi.field_1724.method_24515();
      int[] var10000 = dar.abu();
      byte axxx = 5;
      int[] axxxx = var10000;

      for (class_2338 axxxxx : class_2338.method_10097(axx.method_10069(-axxx, -axxx, -axxx), axx.method_10069(axxx, axxx, axxx))) {
         label22: {
            class_2680 axxxxxx = chi.field_1687.method_8320(axxxxx);
            class_2680 var11 = axxxxxx;
            if (axxxx != null) {
               if (axxxxxx.method_26204() != class_2246.field_10179) {
                  break label22;
               }

               var11 = axxxxxx;
            }

            int axxxxxxx = (Integer)var11.method_11654(class_2428.field_11324);
            String var12 = axxxxx.method_23854();
            short var10002 = 18469;
            long var10003 = 8737794438074922389L ^ ax;
            short var13 = 2741;
            long var10004 = 755552152946358020L ^ ax;
            bpa.bez("Note block at " + var12 + " has note value: " + axxxxxxx);
         }

         if (axxxx == null) {
            break;
         }
      }
   }

   static {
      long var0 = a ^ 27500080224624L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "$A\u0088¹\u0088\u0090Á\u0019U\u001du\u0090\u0095\u008fG·µ®\u00adP\u008b]*\u0004(»N·\u0096\u007f\u009ceüé\u009f%\u001fÿnÐµø;°\u0090K\u00169\u007fk\u0007!Êï\u001a\u009a|\u001f]¶µµ\u0094\u0094¦";
      int var8 = "$A\u0088¹\u0088\u0090Á\u0019U\u001du\u0090\u0095\u008fG·µ®\u00adP\u008b]*\u0004(»N·\u0096\u007f\u009ceüé\u009f%\u001fÿnÐµø;°\u0090K\u00169\u007fk\u0007!Êï\u001a\u009a|\u001f]¶µµ\u0094\u0094¦"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = d(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            g = var9;
            h = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26437;
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
            throw new RuntimeException("cc/astralis/bqo", var10);
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
         throw new RuntimeException("cc/astralis/bqo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
