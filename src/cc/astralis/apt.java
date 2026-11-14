package cc.astralis;

import astralis.mixin.accessor.EntityVelocityUpdateS2CPacketAccessor;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2596;
import net.minecraft.class_2708;
import net.minecraft.class_2743;
import net.minecraft.class_2827;
import net.minecraft.class_6374;

public class apt extends hcr {
   private final gbp fjl;
   private final ArrayList<class_2596<?>> ejj;
   private int bjz;
   private static final long a = 39927351380487L;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public apt(guu parentClass) {
      long ax = apt.a ^ 73884371062733L;
      short var10002 = 16520;
      long var10003 = 536406135794612936L ^ ax;
      super(a, "Watchdog Air");
      short var4 = 29731;
      long var10004 = 5146032032142364257L ^ ax;
      a.fjl = new gbp("Breaker", true);
      a.ejj = new ArrayList<>();
      a.bjz = 0;
      a.ebu(a.fjl);
   }

   @Override
   public void cbw() {
      long a = apt.a ^ 121755044160L;
      int[] var3 = dar.abu();
      apt var10000 = a;
      if (var3 != null) {
         if (!a.ejj.isEmpty()) {
            a.ejj.forEach(gix::eex);
            a.ejj.clear();
         }

         var10000 = a;
      }

      var10000.cbw();
   }

   @gdz
   public void emb(amo event) {
      long ax;
      int[] axx;
      amo var10000;
      label149: {
         label150: {
            ax = apt.a ^ 6817821984162L;
            axx = dar.abu();
            var10000 = a;
            if (axx != null) {
               if (a.cud() == gpy.RECEIVE) {
                  class_2596 axxx = a.bed();
                  var8 = axxx instanceof class_2743;
                  if (axx == null) {
                     break label150;
                  }

                  label129:
                  if (var8) {
                     class_2743 axxxx = (class_2743)axxx;
                     EntityVelocityUpdateS2CPacketAccessor axxxxx = (EntityVelocityUpdateS2CPacketAccessor)a.bed();
                     int var9 = axxxxx.getEntityId();
                     if (axx != null) {
                        if (var9 != chi.field_1724.method_5628()) {
                           return;
                        }

                        var9 = ((dtd)dar.gqy().aws().diy(dtd.class)).dsv();
                     }

                     if (axx != null) {
                        if (var9 != 0) {
                           return;
                        }

                        a.gmm(true);
                        float var14;
                        var9 = (var14 = bav.beh() - 3.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
                     }

                     label137: {
                        if (axx != null) {
                           if (var9 >= 0) {
                              break label137;
                           }

                           var9 = chi.field_1724.method_24828();
                        }

                        if (var9 == 0) {
                           a.bjz = 1;
                           if (axx != null) {
                              break label129;
                           }
                        }
                     }

                     bav.fym(axxxx.method_73085().field_1351);
                  }
               }

               var10000 = a;
            }

            if (axx == null) {
               break label149;
            }

            var8 = var10000.bed() instanceof class_2708;
         }

         if (var8) {
            short var10001 = 25549;
            long var10002 = 4561243480554657741L ^ ax;
            a.bjz = 2;
         }

         var10000 = a;
      }

      if (axx != null) {
         if (var10000.cud() != gpy.SEND) {
            return;
         }

         var10000 = a;
      }

      var10 = var10000.bed() instanceof class_6374;
      label113:
      if (axx != null) {
         if (var10 == 0) {
            var10 = a.bed() instanceof class_2827;
            if (axx == null) {
               break label113;
            }

            if (var10 == 0) {
               return;
            }
         }

         var10 = a.bjz;
      }

      if (axx != null) {
         if (var10 < 1) {
            return;
         }

         var10 = a.fmc();
      }

      label153: {
         if (axx != null) {
            if (var10 != 0) {
               return;
            }

            a.gmm(true);
            short var11 = 25418;
            long var13 = 3446567388579500902L ^ ax;
            bpa.bez("add");
            a.ejj.add(a.bed());
            var12 = a;
            if (axx == null) {
               break label153;
            }

            var10 = a.bjz;
         }

         if (var10 != 2) {
            return;
         }

         a.bjz = 0;
         a.ejj.forEach(gix::eex);
         var12 = a;
      }

      var12.ejj.clear();
   }

   @gdz
   public void gak(eih event) {
      long ax;
      apt var5;
      label54: {
         byte var10001;
         label50: {
            label55: {
               int[] var4;
               label56: {
                  ax = apt.a ^ 87393331697700L;
                  var4 = dar.abu();
                  var10000 = hjr;
                  var10001 = 2;
                  if (var4 != null) {
                     if (hjr <= 2) {
                        var10000 = chi.field_1724.method_24828();
                        if (var4 == null) {
                           break label55;
                        }

                        if (var10000 == 0) {
                           break label56;
                        }
                     }

                     var10000 = hjr;
                     var10001 = 3;
                  }

                  if (var4 == null) {
                     break label50;
                  }

                  if (var10000 <= var10001) {
                     return;
                  }
               }

               var5 = a;
               if (var4 == null) {
                  break label54;
               }

               var10000 = a.bjz;
            }

            var10001 = 1;
         }

         if (var10000 != var10001) {
            return;
         }

         var5 = a;
      }

      short var6 = 25636;
      long var10002 = 1993418919339658659L ^ ax;
      var5.bjz = 2;
   }

   static {
      long var11 = a ^ 61286347448062L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[3];
      int var18 = 0;
      String var17 = "=\u0083ß4ÊIÉÄU\u001cTlµ\rG\u0016\u0010ËEß\u0003Ì\fIk#ÓßÒdï_ñ\u0018%\u008c,£Ë©\u0012Tí\u0088\u0088æ\u0011\u0083àÀ;m\u0007&vçs½";
      int var19 = "=\u0083ß4ÊIÉÄU\u001cTlµ\rG\u0016\u0010ËEß\u0003Ì\fIk#ÓßÒdï_ñ\u0018%\u008c,£Ë©\u0012Tí\u0088\u0088æ\u0011\u0083àÀ;m\u0007&vçs½".length();
      char var16 = 16;
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var27 = a(var21).intern();
         int var10001 = -1;
         var20[var18++] = var27;
         if ((var15 += var16) >= var19) {
            d = var20;
            e = new String[3];
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
            String var4 = "J\u0016¢%£\u009e\"\u0098Ó.\u0095)¢\u0014Ô\u0002";
            int var5 = "J\u0016¢%£\u009e\"\u0098Ó.\u0095)¢\u0014Ô\u0002".length();
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
               byte var31 = -1;
               var6[var10001] = var10004;
            } while (var2 < var5);

            g = var6;
            h = new Integer[2];
            return;
         }

         var16 = var17.charAt(var15);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32648;
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
            throw new RuntimeException("cc/astralis/apt", var10);
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
         throw new RuntimeException("cc/astralis/apt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15269;
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
            throw new RuntimeException("cc/astralis/apt", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("cc/astralis/apt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
