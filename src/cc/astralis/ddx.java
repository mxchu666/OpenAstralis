package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2596;
import net.minecraft.class_2670;
import net.minecraft.class_2743;
import net.minecraft.class_6373;
import net.minecraft.class_746;

public class ddx extends hcr {
   private final bes bry;
   private final gbp bvm;
   private final ConcurrentLinkedQueue<g> dqh;
   private boolean bke;
   private boolean frf;
   private static final long a = 126251483459805L;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public ddx(guu parent) {
      long ax = ddx.a ^ 100952926615412L;
      short var10002 = 29225;
      long var10003 = 4708768181004186458L ^ ax;
      super(a, "Delay");
      short var4 = 16220;
      long var10004 = 1909131713692925484L ^ ax;
      a.bry = new bes("Delay Timeout", 400.0F, 0.0F, 1000.0F, 50.0F);
      short var5 = 20800;
      var10004 = 2121564146251862065L ^ ax;
      a.bvm = new gbp("Release on Ground", true);
      a.dqh = new ConcurrentLinkedQueue<>();
      a.ebu(a.bry);
      a.ebu(a.bvm);
   }

   @gdz
   public void fqr(amo event) {
      long ax = ddx.a ^ 32610541417813L;
      int[] axx = dar.abu();
      amo var10000 = a;
      if (axx != null) {
         if (a.cud() == gpy.SEND) {
            return;
         }

         var10000 = a;
      }

      class_2596<?> axxx = var10000.bed();
      int var7 = axxx instanceof class_2670;
      if (axx != null) {
         if (var7 != 0) {
            a.frf = true;
         }

         var7 = axxx instanceof class_2743;
      }

      label100:
      if (axx != null) {
         if (var7 != 0) {
            class_2743 axxxx = (class_2743)axxx;
            var7 = axxxx.method_11818();
            if (axx == null) {
               break label100;
            }

            if (var7 == chi.field_1724.method_5628()) {
               var7 = a.frf;
               if (axx != null) {
                  if (a.frf) {
                     a.frf = false;
                     return;
                  }

                  var7 = a.ccg();
               }

               if (axx == null) {
                  break label100;
               }

               if (var7 != 0) {
                  a.bke = true;
               }
            }
         }

         var7 = a.bke;
      }

      if (axx != null) {
         if (var7 == 0) {
            return;
         }

         var7 = axxx instanceof class_2743;
      }

      label88:
      if (axx != null) {
         if (var7 == 0) {
            boolean var8 = axxx instanceof class_6373;
            if (axx == null) {
               break label88;
            }

            if (!var8) {
               boolean var9 = axxx instanceof class_2670;
               if (axx == null) {
                  break label88;
               }

               if (!var9) {
                  return;
               }
            }
         }

         a.dqh.add(new g(axxx, System.currentTimeMillis()));
      }

      a.gmm(true);
   }

   @gdz
   public void dkt(fnt event) {
      long ax = ddx.a ^ 116756999987007L;
      int[] axx = dar.abu();
      int var10000 = a.dqh.isEmpty();
      if (axx != null) {
         if (var10000) {
            return;
         }

         var10000 = 0;
      }

      boolean axxx = (boolean)var10000;
      Iterator var6 = a.dqh.iterator();

      while (true) {
         label93:
         if (var6.hasNext()) {
            g axxxx = (g)var6.next();
            float var10;
            var10000 = (var10 = (float)(System.currentTimeMillis() - axxxx.dgk()) - a.bry.dnp().floatValue()) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
            if (axx == null) {
               break;
            }

            label90: {
               if (axx != null) {
                  if (var10000 < 0) {
                     break label90;
                  }

                  var10000 = 1;
               }

               axxx = (boolean)var10000;
               if (axx != null) {
                  break label93;
               }
            }

            if (axx != null) {
               continue;
            }
         }

         var10000 = axxx;
         break;
      }

      if (axx != null) {
         if (var10000 != 0) {
            a.dux();
         }

         var10000 = a.bvm.dnp();
      }

      label77: {
         label76: {
            label75:
            if (axx != null) {
               if (var10000 != 0) {
                  var10000 = chi.field_1724.method_24828();
                  if (axx == null) {
                     break label75;
                  }

                  if (var10000 != 0) {
                     break label76;
                  }
               }

               var9 = a;
               if (axx == null) {
                  break label77;
               }

               var10000 = a.beh();
            }

            if (var10000 != 0 && chi.field_1724 != null) {
               return;
            }
         }

         var9 = a;
      }

      var9.hco();
   }

   private void dux() {
      long a = ddx.a ^ 106828800348943L;
      int[] var10000 = dar.abu();
      g ax = a.dqh.poll();
      int[] axx = var10000;
      g var5 = ax;
      if (axx != null) {
         if (ax == null) {
            return;
         }

         var5 = ax;
      }

      gix.fcd(var5.gci());
   }

   private void hco() {
      long a = ddx.a ^ 93254435607507L;
      int[] var3 = dar.abu();

      while (true) {
         if (!a.dqh.isEmpty()) {
            a.dux();
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         a.bke = false;
         break;
      }
   }

   private boolean ccg() {
      long a = ddx.a ^ 26762403790806L;
      int[] var3 = dar.abu();
      class_746 var10000 = chi.field_1724;
      if (var3 != null) {
         if (chi.field_1724 == null) {
            return false;
         }

         var10000 = chi.field_1724;
      }

      boolean var4 = var10000.method_31549().field_7479;
      if (var3 != null) {
         if (var4) {
            return false;
         }

         var4 = true;
      }

      return var4;
   }

   private boolean beh() {
      long a = ddx.a ^ 32818408046412L;
      int[] var10000 = dar.abu();
      Iterator var4 = a.dqh.iterator();
      int[] ax = var10000;

      while (true) {
         if (var4.hasNext()) {
            label46: {
               g axx = (g)var4.next();
               class_2596 var7 = axx.gci();
               class_2596 var8 = var7;
               if (ax != null) {
                  var9 = var7 instanceof class_2743;
                  if (ax == null) {
                     break;
                  }

                  if (!var9) {
                     break label46;
                  }

                  var8 = var7;
               }

               class_2743 axxx = (class_2743)var8;
               int var10 = axxx.method_11818();
               if (ax == null) {
                  return (boolean)var10;
               }

               if (var10 == chi.field_1724.method_5628()) {
                  return (boolean)1;
               }
            }

            if (ax != null) {
               continue;
            }
         }

         var9 = false;
         break;
      }

      return var9;
   }

   @Override
   public void cbw() {
      a.dqh.clear();
      a.bke = false;
      a.frf = false;
      super.cbw();
   }

   static {
      long var0 = a ^ 68111556027462L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "{Ð3Â¼\u001c\u0084\u009a\u0098±IÉ ÎlÉ4d$Ó¯±Ô\tàB\u0000\u000f\u000b.ÅD\u0019\u0005\u001b\u009aOÊ©\u0012\u0018V\u009f\u0090ò·ö\u0094\u008e+\u009a¨ºÔ§/Ë\u008fÓ\u0086«#`\u0000\u0019\u0010\u0001 íÉç\u0017\u009aïwR\u008aüã_<±";
      int var8 = "{Ð3Â¼\u001c\u0084\u009a\u0098±IÉ ÎlÉ4d$Ó¯±Ô\tàB\u0000\u000f\u000b.ÅD\u0019\u0005\u001b\u009aOÊ©\u0012\u0018V\u009f\u0090ò·ö\u0094\u008e+\u009a¨ºÔ§/Ë\u008fÓ\u0086«#`\u0000\u0019\u0010\u0001 íÉç\u0017\u009aïwR\u008aüã_<±"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[3];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18136;
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
            throw new RuntimeException("cc/astralis/ddx", var10);
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
         throw new RuntimeException("cc/astralis/ddx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
