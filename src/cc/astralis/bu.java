package cc.astralis;

import java.util.ArrayDeque;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1713;
import net.minecraft.class_2596;
import net.minecraft.class_2678;
import net.minecraft.class_2708;
import net.minecraft.class_2813;
import net.minecraft.class_2815;
import net.minecraft.class_2827;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_6374;
import net.minecraft.class_746;
import org.apache.commons.lang3.ArrayUtils;

public class bu extends hcr {
   private final dke afu;
   private final class_1713[] ajv;
   private boolean ahg;
   private final ArrayDeque<class_2596<?>> arf;
   private static int[] gtx;
   private static final long a = 55658646787484L;
   private static final String d;

   public bu(guu parentClass) {
      long ax = bu.a ^ 95402119186085L;
      super(a, d);
      a.ajv = new class_1713[]{class_1713.field_7794, class_1713.field_7791, class_1713.field_7795};
      a.ahg = false;
      a.arf = new ArrayDeque<>();
      a.afu = (dke)a;
   }

   @gdz
   public void gnj(fxx e) {
      long ax = bu.a ^ 10263836890538L;
      int[] var10000 = dar.abu();
      ekb axx = dar.gqy().aws().diy(ekb.class);
      int[] axxx = var10000;
      class_746 var7 = chi.field_1724;
      if (axxx != null) {
         if (chi.field_1724 == null) {
            return;
         }

         var7 = chi.field_1724;
      }

      boolean var8 = var7.method_6115();
      if (axxx != null) {
         if (var8) {
            return;
         }

         var8 = chi.field_1724.method_6039();
      }

      if (axxx != null) {
         if (var8) {
            return;
         }

         var8 = axx.bfx.isEmpty();
      }

      if (var8) {
         class_437 axxxx = chi.field_1755;
         if (axxxx != null && a.afu.ech()) {
            class_304.method_1424();
         }
      }
   }

   @gdz
   public void czv(amo e) {
      long ax = bu.a ^ 1210635627323L;
      int[] var10000 = dar.abu();
      ekb axx = dar.gqy().aws().diy(ekb.class);
      int[] axxx = var10000;
      class_310 var8 = chi;
      if (axxx != null) {
         if (chi.field_1724 == null) {
            return;
         }

         var8 = chi;
      }

      if (axxx != null) {
         if (var8.field_1687 == null) {
            return;
         }

         var8 = chi;
      }

      boolean var9 = var8.field_1724.method_6115();
      if (axxx != null) {
         if (var9) {
            return;
         }

         var9 = chi.field_1724.method_6039();
      }

      if (axxx != null) {
         if (var9) {
            return;
         }

         var9 = axx.bfx.isEmpty();
      }

      if (var9) {
         label185: {
            class_2596 var7 = a.bed();
            boolean var10 = var7 instanceof class_2813;
            if (axxx != null) {
               if (var10) {
                  class_2813 axxxx = (class_2813)var7;
                  if (axxx != null) {
                     label152: {
                        if (axxxx.comp_3842() == chi.field_1724.field_7498.field_7763) {
                           var11 = a;
                           if (axxx == null) {
                              break label152;
                           }

                           if (ArrayUtils.contains(a.ajv, axxxx.comp_3846())) {
                              gix.dsd(new class_2815(axxxx.comp_3842()));
                              if (axxx != null) {
                                 break label185;
                              }
                           }
                        }

                        var11 = a;
                     }

                     var11.ahg = true;
                  }

                  if (axxx != null) {
                     break label185;
                  }
               }

               var10 = a.bed() instanceof class_2815;
            }

            if (axxx != null) {
               if (var10) {
                  a.ahg = false;
                  if (axxx != null) {
                     break label185;
                  }
               }

               var10 = a.bed() instanceof class_2678;
            }

            label134: {
               label133: {
                  label187: {
                     if (axxx != null) {
                        if (var10) {
                           break label187;
                        }

                        var10 = a.bed() instanceof class_2708;
                     }

                     if (axxx == null) {
                        break label134;
                     }

                     if (!var10) {
                        break label133;
                     }
                  }

                  a.arf.clear();
                  a.ahg = false;
                  if (axxx != null) {
                     break label185;
                  }
               }

               var10 = a.ahg;
            }

            label120:
            if (var10) {
               amo var12 = a;
               if (axxx != null) {
                  if (a.cud() != gpy.SEND) {
                     break label120;
                  }

                  var12 = a;
               }

               boolean var13 = var12.bed() instanceof class_2827;
               if (axxx != null) {
                  if (var13) {
                     break label120;
                  }

                  var13 = a.bed() instanceof class_6374;
               }

               if (axxx != null) {
                  if (var13) {
                     break label120;
                  }

                  a.arf.add(a.bed());
               }

               a.gmm(true);
            }
         }

         if (chi.field_1755 == null) {
            a.ahg = false;
            a.akl();
         }
      }
   }

   private void akl() {
      long a = bu.a ^ 140399343396283L;
      int[] ax = dar.abu();
      if (!a.ahg) {
         if (chi.method_1562() != null) {
            while (!a.arf.isEmpty()) {
               label29: {
                  class_2596<?> axx = a.arf.pollFirst();
                  class_2596 var10000 = axx;
                  if (ax != null) {
                     if (axx == null) {
                        break label29;
                     }

                     var10000 = axx;
                  }

                  gix.eex(var10000);
               }

               if (ax == null) {
                  break;
               }
            }
         }
      }
   }

   public static void cjm(int[] var0) {
      gtx = var0;
   }

   public static int[] gjz() {
      return gtx;
   }

   static {
      long var0 = a ^ 2973530287795L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Modern Watchdog".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      d = var5;
      if (gjz() == null) {
         cjm(new int[4]);
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
}
