package cc.astralis;

import java.awt.event.KeyEvent;
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

public class hbi extends fso {
   private static final long a = 24923610395159L;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public hbi() {
      long a = hbi.a ^ 124624865858924L;
      String[] var10001 = new String[3];
      short var10004 = 26472;
      long var10005 = 6628921519714998875L ^ a;
      var10001[0] = "bind";
      var10001[1] = "b";
      var10004 = 30414;
      var10005 = 1213964827203865590L ^ a;
      var10001[2] = "keyboard";
      short var10002 = 4017;
      long var10003 = 5770322223061103238L ^ a;
      super(var10001, "Binds Modules (.bind <module> <bind>)");
   }

   @Override
   public void aov(String[] args, String message) {
      long ax = hbi.a ^ 28960460654786L;
      int[] var10000 = dar.abu();
      String[] axx = a.split(" ");
      int[] axxx = var10000;
      String[] var14 = axx;
      if (axxx != null) {
         if (axx.length < 2) {
            short var21 = 16969;
            long var27 = 7817309040170164947L ^ ax;
            bpa.dhu("Wrong Usage .bind <module> <bind>");
            return;
         }

         var14 = axx;
      }

      String axxxx;
      label85: {
         axxxx = var14[1].toLowerCase();
         short var10001 = 30337;
         long var10002 = 9144354741782828565L ^ ax;
         int var15 = axxxx.equalsIgnoreCase("list");
         if (axxx != null) {
            if (var15 != 0) {
               for (guu axxxxx : dar.gqy().aws().dmc()) {
                  label69: {
                     label89: {
                        String axxxxxx = KeyEvent.getKeyText(axxxxx.glr());
                        int var19 = axxxxx.glr();
                        if (axxx != null) {
                           if (var19 == 0) {
                              break label69;
                           }

                           var20 = axxxxxx;
                           var10001 = 370;
                           var10002 = 4215142453344674281L ^ ax;
                           var26 = "Unknown";
                           if (axxx == null) {
                              break label89;
                           }

                           var19 = axxxxxx.startsWith("Unknown");
                        }

                        if (var19 != 0) {
                           break label69;
                        }

                        var20 = axxxxx.clp();
                        var26 = axxxxxx;
                     }

                     short var31 = 12846;
                     long var33 = 7057078726599348918L ^ ax;
                     bpa.dhu(var20 + " is bound to " + var26);
                  }

                  if (axxx == null) {
                     break;
                  }
               }

               return;
            }

            var16 = axx;
            if (axxx == null) {
               break label85;
            }

            var15 = axx.length;
         }

         if (var15 < 3) {
            short var17 = 29588;
            long var22 = 7854700883126702856L ^ ax;
            bpa.dhu("Wrong Usage .bind <module> <bind>");
            return;
         }

         var16 = axx;
      }

      String axxxxx = var16[2];
      guu axxxxxxx = dar.gqy().aws().gvx(axxxx);
      if (axxx != null) {
         if (axxxxxxx != null) {
            int axxxxxxxx = ctv.gmz(axxxxx);
            axxxxxxx.hge(axxxxxxxx);
            String var18 = axxxxxxx.clp();
            String var24 = axxxxx.toUpperCase();
            short var29 = 32067;
            long var10003 = 7662762697216384477L ^ ax;
            short var32 = 1552;
            long var10004 = 6655003910435874447L ^ ax;
            bpa.dhu("Bound " + var18 + " to " + var24);
            return;
         }

         short var23 = 20270;
         long var28 = 678782074070724539L ^ ax;
         bpa.dhu("Non-Existing Module " + axxxx);
      }
   }

   static {
      long var0 = a ^ 43982049040632L;
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
      String var6 = "ª\u0082bh ¬×È\u000bôQï\u008b¢\u0093àÄÛ_Süîîï«qüÑ¿óEBä3ú´\u0002í½y¨Â\u0098UFP¦]ù\u0018üµS:\u0088|\u0083\u0083ï\u0005+ P±\u0010\u007fH¡î\"WÞÄG\u0097Í³H\u0005ìS\u0010D\u000f\u0086ªm\u0091Ø|ë_Nq\b\u009b\u001a\u0090\u0010\u001aT\u0001A§jw\u001d\f\u009bÎãû,\u009dO \u001b\u001c\u009f\nx\u0010e\u008e\u0080E*9Êzø\u0007To\u009fCfC\u0083¾\b¶Ì\u0001ÕÁk$@y¥Ô®\u0001(\u009bü\\îÔQ}V\u0083PG#ÿ~\tª\u0082\u009bÏ\u0081æj\u00983\u0016\u0085\u0090ú\u008d\u0004:p¡ÙéY\r\u0007Ùo\u001bbç©Ëc¤ý\u0000N0\u001fÉU\f¢5$@øî\u0011ÍdµqaIø¿½A\u007f\u0002\u0019\u0091µ pàmG\u0095¡ùq\u001cID.Øj\u001bê \u0006IZ{\u0004\f×ÒÚ²â`2*6fà\u001fõW\u0096\u0019\nË¢+<È\u0010Ò\u008fLN\u0000\u001c\u009fïqúcÀÿxX\u008c\u0010tÅ\u0092Ñ!h\u0084Eð\u0004¡5=¨\u0011Ð";
      int var8 = "ª\u0082bh ¬×È\u000bôQï\u008b¢\u0093àÄÛ_Süîîï«qüÑ¿óEBä3ú´\u0002í½y¨Â\u0098UFP¦]ù\u0018üµS:\u0088|\u0083\u0083ï\u0005+ P±\u0010\u007fH¡î\"WÞÄG\u0097Í³H\u0005ìS\u0010D\u000f\u0086ªm\u0091Ø|ë_Nq\b\u009b\u001a\u0090\u0010\u001aT\u0001A§jw\u001d\f\u009bÎãû,\u009dO \u001b\u001c\u009f\nx\u0010e\u008e\u0080E*9Êzø\u0007To\u009fCfC\u0083¾\b¶Ì\u0001ÕÁk$@y¥Ô®\u0001(\u009bü\\îÔQ}V\u0083PG#ÿ~\tª\u0082\u009bÏ\u0081æj\u00983\u0016\u0085\u0090ú\u008d\u0004:p¡ÙéY\r\u0007Ùo\u001bbç©Ëc¤ý\u0000N0\u001fÉU\f¢5$@øî\u0011ÍdµqaIø¿½A\u007f\u0002\u0019\u0091µ pàmG\u0095¡ùq\u001cID.Øj\u001bê \u0006IZ{\u0004\f×ÒÚ²â`2*6fà\u001fõW\u0096\u0019\nË¢+<È\u0010Ò\u008fLN\u0000\u001c\u009fïqúcÀÿxX\u008c\u0010tÅ\u0092Ñ!h\u0084Eð\u0004¡5=¨\u0011Ð"
         .length();
      char var5 = '@';
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

                  var6 = "d \u008cÃX\u001aÇqÏ\u0082ÔHÄ¡®BhÍ\u001b¿W¡\u0093Ù\u000f\u009d\u008cN×:HuVI?)\u0094)H0 =\u001cÑ\u0091\u0007.\\\u009dd¿ñåO\n\u0016êÔ´\bÀ\u0018\u0086ÛfÞ\u001fà\u0099Á6æ\u008b";
                  var8 = "d \u008cÃX\u001aÇqÏ\u0082ÔHÄ¡®BhÍ\u001b¿W¡\u0093Ù\u000f\u009d\u008cN×:HuVI?)\u0094)H0 =\u001cÑ\u0091\u0007.\\\u009dd¿ñåO\n\u0016êÔ´\bÀ\u0018\u0086ÛfÞ\u001fà\u0099Á6æ\u008b"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23113;
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
            throw new RuntimeException("cc/astralis/hbi", var10);
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
         throw new RuntimeException("cc/astralis/hbi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
