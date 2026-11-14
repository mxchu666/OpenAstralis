package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class HitMarker extends guu {
   private final bes cff;
   private final bes dxe;
   private final ArrayList<eeh> eoa;
   private boolean hec;
   private static final long a = 38840377645629L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long p;

   public HitMarker() {
      long a = HitMarker.a ^ 99362707610927L;
      super(bfm.VISUAL);
      short var10003 = 14388;
      long var10004 = 7915451378124553841L ^ a;
      a.cff = new bes("Circle Duration", 500.0F, 0.0F, 10000.0F, 1.0F);
      var10003 = 32070;
      var10004 = 2312897168833690370L ^ a;
      a.dxe = new bes("Max Radius", 3.0F, 0.0F, 10.0F, 0.1F);
      a.eoa = new ArrayList<>();
      a.hec = false;
      a.bfi(new ffn[]{a.cff, a.dxe});
   }

   @gdz
   public void hdo(eih event) {
      label26: {
         long ax = HitMarker.a ^ 95335315014646L;
         int[] axx = dar.abu();
         boolean var10000 = chi.field_1724.method_24828();
         if (axx != null) {
            if (!var10000) {
               break label26;
            }

            var10000 = a.hec;
         }

         if (var10000) {
            return;
         }

         erp axxx = new erp(dtw.EASE_OUT_BACK, a.cff.dnp().longValue());
         axxx.bpt(0.0);
         axxx.gbi(a.dxe.dnp().floatValue());
         axxx.dsw();
         a.eoa.add(new eeh(chi.field_1724.method_73189(), axxx));
         a.hec = true;
         if (axx != null) {
            return;
         }
      }

      a.hec = false;
   }

   @gdz
   public void esu(bsm event) {
      long ax = HitMarker.a ^ 137140300897637L;
      int[] var10000 = dar.abu();
      Iterator axx = a.eoa.iterator();
      int[] axxx = var10000;

      while (axx.hasNext()) {
         eeh axxxx;
         label47: {
            label46: {
               axxxx = (eeh)axx.next();
               boolean var10 = axxxx.csd;
               if (axxx != null) {
                  if (!axxxx.csd) {
                     axxxx.aee.dwm(axxxx.aee.hfn());
                     var11 = axxxx.aee;
                     if (axxx == null) {
                        break label47;
                     }

                     if (!axxxx.aee.flo()) {
                        break label46;
                     }

                     axxxx.csd = true;
                     double axxxxx = axxxx.aee.hjo();
                     axxxx.aee.bpt(axxxxx);
                     axxxx.aee.gbi(0.0);
                     axxxx.aee.dsw();
                     if (axxx != null) {
                        break label46;
                     }
                  }

                  axxxx.aee.dwm(axxxx.aee.hfn());
                  var11 = axxxx.aee;
                  if (axxx == null) {
                     break label47;
                  }

                  var10 = axxxx.aee.flo();
               }

               if (var10) {
                  axx.remove();
                  if (axxx != null) {
                     continue;
                  }
               }
            }

            var11 = axxxx.aee;
         }

         float axxxxx = (float)var11.hjo();
         bqf.dd(a.bus(), axxxx.gid, axxxxx, (int)p);
         if (axxx == null) {
            break;
         }
      }
   }

   static {
      long var5 = a ^ 45246430821350L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[2];
      int var12 = 0;
      String var11 = ".Ê\u0010¸\u008c¼\u0004Ù\u0001ïñ%¥\\ÐW¾#\u0092à2)ô) òü\rcÄñ¶å´Ë1<y\u0017H½`t\u0018QÅ\u0018\u0098îËù\u00ad ¾ßÍ ";
      int var13 = ".Ê\u0010¸\u008c¼\u0004Ù\u0001ïñ%¥\\ÐW¾#\u0092à2)ô) òü\rcÄñ¶å´Ë1<y\u0017H½`t\u0018QÅ\u0018\u0098îËù\u00ad ¾ßÍ ".length();
      char var10 = 24;
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var20 = d(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var20;
         if ((var9 += var10) >= var13) {
            g = var14;
            h = new String[2];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -1418010788024020611L;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16726;
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
            throw new RuntimeException("cc/astralis/eny", var10);
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
         throw new RuntimeException("cc/astralis/eny" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
