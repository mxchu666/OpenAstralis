package cc.astralis;

import astralis.mixin.accessor.EntityVelocityUpdateS2CPacketAccessor;
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
import net.minecraft.class_2596;
import net.minecraft.class_2743;

public class cfj extends hcr {
   private final bes bwu;
   private static final long a = 124560963000567L;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public cfj(guu parentClass) {
      long ax = cfj.a ^ 69355607627878L;
      short var10002 = 19653;
      long var10003 = 4349185308392838679L ^ ax;
      super(a, "Air");
      short var4 = 20911;
      long var10004 = 7515658968407296892L ^ ax;
      a.bwu = new bes("Horizontal Velocity", 0.0F, 0.0F, 100.0F, 1.0F);
      a.ebu(a.bwu);
   }

   @gdz
   public void cnd(amo event) {
      long ax = cfj.a ^ 18859610646576L;
      int[] axx = dar.abu();
      amo var10000 = a;
      if (axx != null) {
         if (a.cud() != gpy.RECEIVE) {
            return;
         }

         var10000 = a;
      }

      class_2596 axxx = var10000.bed();
      class_2596 var8 = axxx;
      if (axx != null) {
         if (!(axxx instanceof class_2743)) {
            return;
         }

         var8 = axxx;
      }

      class_2743 axxxx = (class_2743)var8;
      EntityVelocityUpdateS2CPacketAccessor axxxxx = (EntityVelocityUpdateS2CPacketAccessor)axxxx;
      int var9 = axxxxx.getEntityId();
      if (axx != null) {
         if (var9 != chi.field_1724.method_5628()) {
            return;
         }

         var9 = chi.field_1724.method_24828();
      }

      if (var9 != 0) {
         axxxxx.setVelocity(
            ajv.ett(axxxxx.getVelocity())
               .eab(axxxxx.getVelocity().field_1352 * (a.bwu.dnp().intValue() / 100.0))
               .cxp(axxxxx.getVelocity().field_1350 * (a.bwu.dnp().intValue() / 100.0))
               .gwt()
         );
         if (axx != null) {
            return;
         }
      }

      a.gmm(true);
   }

   static {
      long var0 = a ^ 94037249335010L;
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
      String var6 = "n]R¸\tz\u0082I\u008a¦\u0017¿Ð@Yº£`8Ýå Õ\u0005þ·³wÒl\u0080+>aÈ\u0018g\u000fÈ\u009fÈ»$åm\u0092\u0087G\u0010\fÉjDðOäÇ\u0081\nÖ\fáv\u0014\u0092";
      int var8 = "n]R¸\tz\u0082I\u008a¦\u0017¿Ð@Yº£`8Ýå Õ\u0005þ·³wÒl\u0080+>aÈ\u0018g\u000fÈ\u009fÈ»$åm\u0092\u0087G\u0010\fÉjDðOäÇ\u0081\nÖ\fáv\u0014\u0092"
         .length();
      char var5 = '0';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23106;
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
            throw new RuntimeException("cc/astralis/cfj", var10);
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
         throw new RuntimeException("cc/astralis/cfj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
