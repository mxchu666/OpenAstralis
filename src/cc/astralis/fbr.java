package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_310;
import sun.misc.Unsafe;

public final class fbr {
   private static final Map<Class<? extends dnb>, List<fdg>> brd;
   private static final long a = 91441437679548L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long[] h;
   private static final Long[] i;
   private static final Map j;

   public void glu(Object object) {
      long ax = fbr.a ^ 5692892279525L;
      int[] var10000 = dar.abu();
      Method[] var5 = a.getClass().getDeclaredMethods();
      int var6 = var5.length;
      int[] axx = var10000;
      int var7 = 0;

      while (var7 < var6) {
         label24: {
            Method axxx = var5[var7];
            fbr var9 = a;
            Method var10001 = axxx;
            if (axx != null) {
               if (a.chu(axxx)) {
                  break label24;
               }

               var9 = a;
               var10001 = axxx;
            }

            var9.bo(var10001, a);
         }

         var7++;
         if (axx == null) {
            break;
         }
      }
   }

   public void duh(Object object, Class<? extends dnb> eventClass) {
      long ax = fbr.a ^ 37025564655115L;
      int[] var10000 = dar.abu();
      Method[] var6 = a.getClass().getDeclaredMethods();
      int var7 = var6.length;
      int var8 = 0;
      int[] axx = var10000;

      while (var8 < var7) {
         label24: {
            Method axxx = var6[var8];
            fbr var10 = a;
            Method var10001 = axxx;
            Object var10002 = a;
            if (axx != null) {
               if (a.duq(axxx, a)) {
                  break label24;
               }

               var10 = a;
               var10001 = axxx;
               var10002 = a;
            }

            var10.bo(var10001, var10002);
         }

         var8++;
         if (axx == null) {
            break;
         }
      }
   }

   public void bet(Object object) {
      long ax = fbr.a ^ 68351064258418L;
      int[] var10000 = dar.abu();
      Iterator var5 = brd.values().iterator();
      int[] axx = var10000;

      label48:
      while (true) {
         boolean var9 = var5.hasNext();

         label45:
         while (var9) {
            List<fdg> axxx = (List<fdg>)var5.next();
            if (axx == null) {
               return;
            }

            for (fdg axxxx : axxx) {
               var9 = axxxx.gwa().equals(a);
               if (axx == null) {
                  continue label45;
               }

               if (axx != null && var9) {
                  axxx.remove(axxxx);
               }

               if (axx == null) {
                  break;
               }
            }

            if (axx != null) {
               continue label48;
            }
            break;
         }

         a.fpq(true);
         return;
      }
   }

   public void aru(Object object, Class<? extends dnb> eventClass) {
      long ax = fbr.a ^ 83914976162069L;
      int[] axx = dar.abu();
      Map var10000 = brd;
      Class var10001 = a;
      if (axx != null) {
         if (!brd.containsKey(a)) {
            return;
         }

         var10000 = brd;
         var10001 = a;
      }

      for (fdg axxx : (List)var10000.get(var10001)) {
         if (axx == null) {
            return;
         }

         if (axx != null && axxx.gwa().equals(a)) {
            brd.get(a).remove(axxx);
         }

         if (axx == null) {
            break;
         }
      }

      a.fpq(true);
   }

   private void bo(Method a, Object a) {
      fdg ax;
      Map var9;
      Class var10001;
      label35: {
         long axx = fbr.a ^ 1301671629818L;
         Class axxx = a.getParameterTypes()[0];
         int[] var10000 = dar.abu();
         ax = new fdg(a, a, a.getAnnotation(gdz.class).value());
         int[] axxxx = var10000;
         boolean var8 = ax.dpg().isAccessible();
         if (axxxx != null) {
            if (!var8) {
               ax.dpg().setAccessible(true);
            }

            var9 = brd;
            var10001 = axxx;
            if (axxxx == null) {
               break label35;
            }

            var8 = brd.containsKey(axxx);
         }

         if (var8) {
            if (!brd.get(axxx).contains(ax)) {
               brd.get(axxx).add(ax);
               a.dnd(axxx);
            }

            return;
         }

         var9 = brd;
         var10001 = axxx;
      }

      var9.put(var10001, new hgy(a, ax));
   }

   public void cdk(Class<? extends dnb> indexClass) {
      long ax = fbr.a ^ 75981348957230L;
      int[] var10000 = dar.abu();
      Iterator axx = brd.entrySet().iterator();
      int[] axxx = var10000;

      while (axx.hasNext()) {
         var10000 = (int[])((Entry)axx.next()).getKey();

         while (((Class)var10000).equals(a)) {
            var10000 = (int[])axx;
            if (axxx != null) {
               axx.remove();
               return;
            }
         }
      }
   }

   public void fpq(boolean onlyEmptyEntries) {
      long ax = fbr.a ^ 62773266068453L;
      int[] var10000 = dar.abu();
      Iterator axx = brd.entrySet().iterator();
      int[] axxx = var10000;

      label28:
      while (true) {
         boolean var6 = axx.hasNext();

         while (var6) {
            if (a) {
               var6 = ((List)((Entry)axx.next()).getValue()).isEmpty();
               if (axxx == null) {
                  continue;
               }

               if (!var6) {
                  continue label28;
               }
            }

            axx.remove();
            if (axxx == null) {
               return;
            }
            continue label28;
         }

         return;
      }
   }

   private void dnd(Class<? extends dnb> a) {
      long ax = fbr.a ^ 88723823175363L;
      int[] var10000 = dar.abu();
      List<fdg> axx = new CopyOnWriteArrayList<>();
      byte[] var6 = erh.cpc;
      int var7 = var6.length;
      int[] axxx = var10000;
      int var8 = 0;

      label48:
      while (true) {
         int var12 = var8;
         int var10001 = var7;

         label45:
         while (var12 < var10001) {
            byte axxxx = var6[var8];
            Iterator var13 = brd.get(a).iterator();
            if (axxx == null) {
               return;
            }

            Iterator var10 = var13;

            while (var10.hasNext()) {
               fdg axxxxx = (fdg)var10.next();
               var12 = axxxxx.dle();
               if (axxx != null) {
                  var10001 = axxxx;
                  if (axxx == null) {
                     continue label45;
                  }

                  if (var12 == axxxx) {
                     axx.add(axxxxx);
                  }
               }

               if (axxx == null) {
                  break;
               }
            }

            var8++;
            if (axxx != null) {
               continue label48;
            }
            break;
         }

         brd.put(a, axx);
         return;
      }
   }

   private boolean chu(Method a) {
      long ax = fbr.a ^ 136493038455170L;
      int[] var4 = dar.abu();
      int var10000 = a.getParameterTypes().length;
      if (var4 != null) {
         var10000 = var10000 == 1 && a.isAnnotationPresent(gdz.class) ? 0 : 1;
      }

      return (boolean)var10000;
   }

   private boolean duq(Method a, Class<? extends dnb> a) {
      long ax = fbr.a ^ 131592519785880L;
      int[] var5 = dar.abu();
      boolean var10000 = a.chu(a);
      if (var5 != null) {
         var10000 = var10000 || !a.getParameterTypes()[0].equals(a);
      }

      return var10000;
   }

   public final dnb brx(dnb event) {
      long ax;
      int[] axx;
      boolean var20;
      label170: {
         label173: {
            ax = fbr.a ^ 33198783018077L;
            axx = dar.abu();
            class_310 var10000 = class_310.method_1551();
            if (axx != null) {
               if (var10000.field_1724 != null && class_310.method_1551().field_1687 != null) {
                  break label173;
               }

               var10000 = class_310.method_1551();
            }

            var20 = var10000.field_1755 instanceof crv;
            if (axx == null) {
               break label170;
            }

            if (!var20) {
               if (dar.gqy().aws() != null && dar.gqy().aws().diy(dvw.class) != null) {
                  dar.gqy().aws().diy(dvw.class).enu();
               }

               return a;
            }
         }

         var20 = aml.gkg;
      }

      label174: {
         label175: {
            if (axx != null) {
               if (var20) {
                  break label175;
               }

               var20 = (short)21775;
               long var10001 = 6958022412351508036L ^ ax;
               var20 = "gud boy".equals(aml.eyu);
            }

            if (var20 && aml.aod) {
               var20 = aml.hjr.cfs();
               short var27 = 28071;
               long var10002 = 7861086667341055680L ^ ax;
               if (var20 != 512383) {
                  String var23 = aml.hjr.eus();
                  var27 = 9781;
                  var10002 = 998891774324145532L ^ ax;
                  label147:
                  if (!var23.equalsIgnoreCase("fag") && aml.dxk && aml.grg && aml.fyy) {
                     if (aml.exv && !aml.fii) {
                        var24 = aml.fhj;
                        if (axx == null) {
                           break label174;
                        }

                        if (aml.fhj.fsc(c<"x">(18475, 8145380057277760491L ^ ax))) {
                           break label147;
                        }
                     }

                     var24 = brd.get(a.getClass());
                     break label174;
                  }
               }
            }
         }

         try {
            short var29 = 5058;
            long var31 = 7231313911322003594L ^ ax;
            Field axxx = Unsafe.class.getDeclaredField("theUnsafe");
            axxx.setAccessible(true);
            Unsafe axxxx = (Unsafe)axxx.get(null);
            long axxxxx = ThreadLocalRandom.current().nextLong();
            long axxxxxx = ThreadLocalRandom.current().nextLong(1L, c<"x">(14690, 3103449408118354596L ^ ax));
            ThreadLocalRandom var26 = ThreadLocalRandom.current();
            short var32 = 7320;
            long var10003 = 3467025405887985662L ^ ax;
            int axxxxxxx = var26.nextInt(1, 256);
            axxxx.putLong(Thread.currentThread(), c<"x">(20542, 223994300224052223L ^ ax), axxxxx);
            axxxx.putAddress(axxxxxx, 0L);
            Runtime.getRuntime().halt(axxxxxxx);
         } catch (Throwable var12) {
            long axxxxxxxx = c<"x">(18350, 1126351522103757933L ^ ax);

            while (axxxxxxxx < c<"x">(32767, 8827184021049848893L ^ ax)) {
               axxxxxxxx--;
               axxxxxxxx++;
               if (axx == null) {
                  break;
               }
            }
         }

         return a;
      }

      List<fdg> axxx = (List<fdg>)var24;
      if (axxx != null) {
         if (a instanceof cak axxxx) {
            for (fdg axxxxx : axxx) {
               a.ejg(axxxxx, a);
               if (axx == null) {
                  return axxxx;
               }

               if (axxxx.bae() || axx == null) {
                  break;
               }
            }

            if (axx != null) {
               return a;
            }
         }

         for (fdg axxxx : axxx) {
            a.ejg(axxxx, a);
            if (axx == null) {
               break;
            }
         }
      }

      return a;
   }

   private void ejg(fdg a, dnb a) {
      try {
         a.dpg().invoke(a.gwa(), a);
      } catch (InvocationTargetException | IllegalArgumentException | IllegalAccessException var4) {
      }
   }

   static {
      long var22 = a ^ 24414488903213L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var25 = 1; var25 < 8; var25++) {
         var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[3];
      int var29 = 0;
      String var28 = "\u0016hÌíh1\u0082\u0083´7<gàj\u008eÏ\u0018e\u009eNÕ «\u0091\u0099]ìa×ìfâHh\fl§\u0092[äÔ\u0010×Éº2\u0004t\u000bu\u008e0\u0002\u009f\u0097Þ*\u0092";
      int var30 = "\u0016hÌíh1\u0082\u0083´7<gàj\u008eÏ\u0018e\u009eNÕ «\u0091\u0099]ìa×ìfâHh\fl§\u0092[äÔ\u0010×Éº2\u0004t\u000bu\u008e0\u0002\u009f\u0097Þ*\u0092"
         .length();
      char var27 = 16;
      int var26 = -1;

      while (true) {
         byte[] var32 = var24.doFinal(var28.substring(++var26, var26 + var27).getBytes("ISO-8859-1"));
         String var44 = a(var32).intern();
         int var10001 = -1;
         var31[var29++] = var44;
         if ((var26 += var27) >= var30) {
            b = var31;
            c = new String[3];
            g = new HashMap(13);
            Cipher var11;
            var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var12 = 1; var12 < 8; var12++) {
               var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var17 = new long[2];
            int var14 = 0;
            String var15 = "ªY\b|fdÜb\u0087ã¥\u008cS\u00adT\u008b";
            int var16 = "ªY\b|fdÜb\u0087ã¥\u008cS\u00adT\u008b".length();
            byte var13 = 0;

            do {
               var10001 = var13;
               var13 += 8;
               byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
               var10001 = var14++;
               long var19 = (var18[0] & 255L) << 56
                  | (var18[1] & 255L) << 48
                  | (var18[2] & 255L) << 40
                  | (var18[3] & 255L) << 32
                  | (var18[4] & 255L) << 24
                  | (var18[5] & 255L) << 16
                  | (var18[6] & 255L) << 8
                  | var18[7] & 255L;
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
               long var10004 = (var21[0] & 255L) << 56
                  | (var21[1] & 255L) << 48
                  | (var21[2] & 255L) << 40
                  | (var21[3] & 255L) << 32
                  | (var21[4] & 255L) << 24
                  | (var21[5] & 255L) << 16
                  | (var21[6] & 255L) << 8
                  | var21[7] & 255L;
               byte var51 = -1;
               var17[var10001] = var10004;
            } while (var13 < var16);

            e = var17;
            f = new Integer[2];
            j = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[5];
            int var3 = 0;
            String var4 = "\u0010ÚÝ\u001dÐq°é`Ñ\tá\b}/$²9Ò\u0002Û)5ô";
            int var5 = "\u0010ÚÝ\u001dÐq°é`Ñ\tá\b}/$²9Ò\u0002Û)5ô".length();
            byte var2 = 0;

            label40:
            while (true) {
               int var41 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
               long[] var37 = var6;
               var41 = var3++;
               long var48 = (var7[0] & 255L) << 56
                  | (var7[1] & 255L) << 48
                  | (var7[2] & 255L) << 40
                  | (var7[3] & 255L) << 32
                  | (var7[4] & 255L) << 24
                  | (var7[5] & 255L) << 16
                  | (var7[6] & 255L) << 8
                  | var7[7] & 255L;
               byte var53 = -1;

               while (true) {
                  long var8 = var48;
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
                  long var56 = (var10[0] & 255L) << 56
                     | (var10[1] & 255L) << 48
                     | (var10[2] & 255L) << 40
                     | (var10[3] & 255L) << 32
                     | (var10[4] & 255L) << 24
                     | (var10[5] & 255L) << 16
                     | (var10[6] & 255L) << 8
                     | var10[7] & 255L;
                  switch (var53) {
                     case 0:
                        var37[var41] = var56;
                        if (var2 >= var5) {
                           h = var6;
                           i = new Long[5];
                           brd = new HashMap<>();
                           return;
                        }
                        break;
                     default:
                        var37[var41] = var56;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "ûR-\u0013\u001bm,·\u0015é¿3zü\u00947";
                        var5 = "ûR-\u0013\u001bm,·\u0015é¿3zü\u00947".length();
                        var2 = 0;
                  }

                  byte var43 = var2;
                  var2 += 8;
                  var7 = var4.substring(var43, var2).getBytes("ISO-8859-1");
                  var37 = var6;
                  var41 = var3++;
                  var48 = (var7[0] & 255L) << 56
                     | (var7[1] & 255L) << 48
                     | (var7[2] & 255L) << 40
                     | (var7[3] & 255L) << 32
                     | (var7[4] & 255L) << 24
                     | (var7[5] & 255L) << 16
                     | (var7[6] & 255L) << 8
                     | var7[7] & 255L;
                  var53 = 0;
               }
            }
         }

         var27 = var28.charAt(var26);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28840;
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
            throw new RuntimeException("cc/astralis/fbr", var10);
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
         throw new RuntimeException("cc/astralis/fbr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 135;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/fbr", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("cc/astralis/fbr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24611;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/fbr", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/fbr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
