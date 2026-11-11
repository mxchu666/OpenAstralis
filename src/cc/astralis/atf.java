package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_156;
import net.minecraft.class_1657;

public class atf extends fso {
   private static final long a = 105656070692894L;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public atf() {
      long a = atf.a ^ 86875414428372L;
      String[] var10001 = new String[2];
      short var10004 = 25246;
      long var10005 = 9080863292494585504L ^ a;
      var10001[0] = "teleport";
      var10004 = 14313;
      var10005 = 5970246710358264799L ^ a;
      var10001[1] = "tp";
      short var10002 = 25070;
      long var10003 = 2675609426424700369L ^ a;
      super(var10001, "Teleports you to a player or coordinates");
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @Override
   public void aov(String[] args, String message) {
      long ax = atf.a ^ 119760390331083L;
      int[] var10000 = dar.abu();
      String[] axx = a.split(" ");
      int[] axxx = var10000;
      if (axxx != null) {
         if (axx.length >= 2) {
            label64: {
               UUID axxxx = dlc.chi.method_31320().method_31407(axx[1]);
               UUID var18 = axxxx;
               if (axxx != null) {
                  if (axxxx == null) {
                     break label64;
                  }

                  var18 = axxxx;
               }

               if (var18 != class_156.field_25140) {
                  class_1657 axxxxx = dlc.chi.field_1687.method_18470(axxxx);
                  if (axxx != null) {
                     if (axxxxx != null) {
                        dlc.chi.field_1724.method_33574(axxxxx.method_73189());
                        String var19 = axx[1];
                        short var27 = 6816;
                        long var10002 = 4711507222744827526L ^ ax;
                        bpa.dhu("Teleported you to player " + var19);
                     } else {
                        String var20 = axx[1];
                        short var28 = 3584;
                        long var34 = 82463910738891301L ^ ax;
                        bpa.dhu("Player not found: " + var20);
                     }
                  }

                  return;
               }
            }

            String[] var21 = axx;
            if (axxx != null) {
               if (axx.length < 4) {
                  short var26 = 17501;
                  long var33 = 8507411468909238394L ^ ax;
                  bpa.dhu("Wrong Usage .tp <x> <y> <z>");
                  return;
               }

               try {
                  dlc.chi.field_1724.method_5814(Double.parseDouble(axx[1]), Double.parseDouble(axx[2]), Double.parseDouble(axx[3]));
                  var21 = axx;
               } catch (NumberFormatException var16) {
                  short var22 = 12671;
                  long var29 = 4548503032664894804L ^ ax;
                  bpa.dhu("Invalid coordinates.");
                  return;
               }
            }

            try {
               double var24 = Double.parseDouble(var21[1]);
               double var31 = Double.parseDouble(axx[2]);
               double axxxxx = Double.parseDouble(axx[3]);
               double axxxxxx = var31;
               double axxxxxxx = var24;
               short var25 = 18574;
               long var32 = 7376550711035319466L ^ ax;
               short var35 = 7734;
               long var10003 = 5533298317848609310L ^ ax;
               short var10004 = 517;
               long var10005 = 8359812544859217447L ^ ax;
               bpa.dhu("Teleported to coordinates: " + axxxxxxx + ", " + axxxxxx + ", " + axxxxx);
            } catch (NumberFormatException var15) {
               short var23 = 12671;
               long var30 = 4548503032664894804L ^ ax;
               bpa.dhu("Invalid coordinates.");
            }

            return;
         }

         short var17 = 19353;
         long var10001 = 3155851139086997434L ^ ax;
         bpa.dhu("Wrong Usage .tp <x> <y> <z> | .tp <player>");
      }
   }

   static {
      long var0 = a ^ 111964848438617L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "\u008cn\u0083\u009f\u0088\u0019qÄ?NYç;\u0001r/cÙ°´&fû~\u0084×\u001aó¸¥WÿPI\u0014\u007fu8\u0099\u0017b\u0004\u001e{×]\u0092C^öÇMC(¸Ña\u0016\u00ad×Id\u0080çóh½TÿßÝ[Þ¼\u008bb;ÍÝñYË+ñt¶¹\u0083\u001eØ±¿ß§äàñT®+¶þ\u0085qÜÅÐ-\u0012\u0017ô~\u0087Hí]¼TÝÇK\u009ai\u0015?\u0001F$*P±þ\u001f¢ó{¦%\u0081~\u0082\búm\u0000\u0097\n×û5¤Ó¬\u0001b¸+Z8tý:Iê_\u0094\u009d\u0080Ï\u0010\u0096\u001d é.RØ&\u001b\u008f±1,òçØ\u0010\u001agËte\u007f¥Þ\u0004\u0099\rþ±ÎXV(B\u00ad*LïZ±7î\u0017ú7J$Yª\u0087\u001f\u0014zmÄnKj\u0097®\u0080yÂ\u001a!\"²ÖM³m\u0095í8\u0093b\u0001\u0094Ý$Rè\t\u001d\u0090àµõdK\u0003Â.-\u009f}Ò\u0087\f\u008eÃbÞ ]\u0012\"h\u008ajÉÎ¬ÓBÇt³û-\u0019¾:\u008f°e\u008e÷L]8\"[ø\u0003ËÊì\u0096\u008dåÝJ\u0003ç¿wE\u0094÷'gà\u0015\u008a\u0084è2Óæn´\u001fj\u007f\nß\"6Å¼A\u008eû5`Ï/\u0083Mw?H?\u0010B^8UÚ-\u000e\u0013mvF«TOÌé\u0097Þ²û\u0015\u0088ßSp=nëA\u0086Ì=\u0006\u001b\u008d³à#öp©¤\u009cv\u001dlÄ\u00ad\u0002\u001f²$ýë÷\u0014ÔôA\u0010¿T\"ðÎøÎå\u0005#päLv\u0019n";
      int var8 = "\u008cn\u0083\u009f\u0088\u0019qÄ?NYç;\u0001r/cÙ°´&fû~\u0084×\u001aó¸¥WÿPI\u0014\u007fu8\u0099\u0017b\u0004\u001e{×]\u0092C^öÇMC(¸Ña\u0016\u00ad×Id\u0080çóh½TÿßÝ[Þ¼\u008bb;ÍÝñYË+ñt¶¹\u0083\u001eØ±¿ß§äàñT®+¶þ\u0085qÜÅÐ-\u0012\u0017ô~\u0087Hí]¼TÝÇK\u009ai\u0015?\u0001F$*P±þ\u001f¢ó{¦%\u0081~\u0082\búm\u0000\u0097\n×û5¤Ó¬\u0001b¸+Z8tý:Iê_\u0094\u009d\u0080Ï\u0010\u0096\u001d é.RØ&\u001b\u008f±1,òçØ\u0010\u001agËte\u007f¥Þ\u0004\u0099\rþ±ÎXV(B\u00ad*LïZ±7î\u0017ú7J$Yª\u0087\u001f\u0014zmÄnKj\u0097®\u0080yÂ\u001a!\"²ÖM³m\u0095í8\u0093b\u0001\u0094Ý$Rè\t\u001d\u0090àµõdK\u0003Â.-\u009f}Ò\u0087\f\u008eÃbÞ ]\u0012\"h\u008ajÉÎ¬ÓBÇt³û-\u0019¾:\u008f°e\u008e÷L]8\"[ø\u0003ËÊì\u0096\u008dåÝJ\u0003ç¿wE\u0094÷'gà\u0015\u008a\u0084è2Óæn´\u001fj\u007f\nß\"6Å¼A\u008eû5`Ï/\u0083Mw?H?\u0010B^8UÚ-\u000e\u0013mvF«TOÌé\u0097Þ²û\u0015\u0088ßSp=nëA\u0086Ì=\u0006\u001b\u008d³à#öp©¤\u009cv\u001dlÄ\u00ad\u0002\u001f²$ýë÷\u0014ÔôA\u0010¿T\"ðÎøÎå\u0005#päLv\u0019n"
         .length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     d = new String[11];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "&K\u0011º®\u000eî\u001bö#>\u0011\u0091\u009bx=(\u0095\u009eNÀVïs)\u000fí\u001f\n\u0087Í<&ÐØ\u0086\u0092aøuT\u001aÔ\u0086¶\"_\u0007v[¤§Ö\u0087ÈÃµ";
                  var8 = "&K\u0011º®\u000eî\u001bö#>\u0011\u0091\u009bx=(\u0095\u009eNÀVïs)\u000fí\u001f\n\u0087Í<&ÐØ\u0086\u0092aøuT\u001aÔ\u0086¶\"_\u0007v[¤§Ö\u0087ÈÃµ"
                     .length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26356;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/atf", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("cc/astralis/atf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
