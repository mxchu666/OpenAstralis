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

public class fcc extends fso {
   private static final long a = 69632267355404L;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public fcc() {
      long a = fcc.a ^ 133351423437701L;
      String[] var10001 = new String[2];
      short var10004 = 15966;
      long var10005 = 8214458016402256837L ^ a;
      var10001[0] = "hide";
      var10001[1] = "h";
      short var10002 = 10117;
      long var10003 = 7197521098603309597L ^ a;
      super(var10001, "Hide Modules (.hide <module>)");
   }

   @Override
   public void aov(String[] args, String message) {
      long ax = fcc.a ^ 56799290359769L;
      int[] axx = dar.abu();
      if (axx != null) {
         if (a.length >= 2) {
            guu axxx = dar.gqy().aws().gvx(a[1]);
            if (axx != null) {
               if (axxx != null) {
                  boolean axxxx;
                  label59: {
                     int var9 = a.length;
                     if (axx != null) {
                        if (var9 >= 3) {
                           axxxx = Boolean.parseBoolean(a[2].toLowerCase());
                           if (axx != null) {
                              break label59;
                           }
                        }

                        var9 = axxx.aov();
                     }

                     if (axx != null) {
                        var9 = var9 == 0 ? 1 : 0;
                     }

                     axxxx = (boolean)var9;
                  }

                  axxx.atd(axxxx);
                  String var11;
                  if (axxxx != 0) {
                     short var10 = 21570;
                     long var14 = 2813763128974495111L ^ ax;
                     var11 = "Hid ";
                  } else {
                     short var12 = 12821;
                     long var15 = 8909720006624947157L ^ ax;
                     var11 = "Unhid ";
                  }

                  String var16 = axxx.clp();
                  short var17 = 6707;
                  long var10003 = 5310723181293241329L ^ ax;
                  bpa.dhu(var11 + var16 + " module.");
                  return;
               }

               String var8 = a[1];
               short var13 = 2939;
               long var10002 = 4452516233748615864L ^ ax;
               bpa.dhu("Module not found: " + var8);
            }

            return;
         }

         short var10000 = 3508;
         long var10001 = 2716407474982229106L ^ ax;
         bpa.dhu("Wrong Usage: .hide <module>");
      }
   }

   static {
      long var0 = a ^ 107071091092498L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "\u001f\u0088\u009bC\u0081ºé\u0002Ú\n¸Ù \u0012EÛ;\u001a;\u0018\u0013Û\u0014\u0014_WX¾~½ê\u0092°\u009c\u008fÓ\u009aª¦ØkìSÞ\u008e\u0015\u0000\u001b\u0010é\u0085\u0012ÿÏvqlõS¼ï±\u008aç\b8Æ£Ò\u009aS¼\u00165\\õÛCã\b\u001b\n1\fï\u000f³ª<Û¶:\u0089\u0082\u0015¸\u0098g$\u00ad¸\u0007K\fà5Ø\u0080î\u008f80\u0091\u008f\u0081ÒCûË\u0099}Ç\u0010X¤¾¨N]ä\u0095=\u009b&Áy4XR o\u001bÐ¶¤\u001c\u0000}æ½4Î\u0099g\u0014*ç\u0001¸¼ç5R*\u001bQâ\u008d\u0007½d@";
      int var8 = "\u001f\u0088\u009bC\u0081ºé\u0002Ú\n¸Ù \u0012EÛ;\u001a;\u0018\u0013Û\u0014\u0014_WX¾~½ê\u0092°\u009c\u008fÓ\u009aª¦ØkìSÞ\u008e\u0015\u0000\u001b\u0010é\u0085\u0012ÿÏvqlõS¼ï±\u008aç\b8Æ£Ò\u009aS¼\u00165\\õÛCã\b\u001b\n1\fï\u000f³ª<Û¶:\u0089\u0082\u0015¸\u0098g$\u00ad¸\u0007K\fà5Ø\u0080î\u008f80\u0091\u008f\u0081ÒCûË\u0099}Ç\u0010X¤¾¨N]ä\u0095=\u009b&Áy4XR o\u001bÐ¶¤\u001c\u0000}æ½4Î\u0099g\u0014*ç\u0001¸¼ç5R*\u001bQâ\u008d\u0007½d@"
         .length();
      char var5 = '0';
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
                     d = new String[7];
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

                  var6 = "«n.Á\u000e=`½ÆoT\"¬ÑÂ=¯Uw\u008e\u0090Ô<Ç'ÿÿuxóL\u0082\u0014\u001aF\u0096Üx\u001eg\u0010KÊ\u0089\u0084$þê³GÍ\u0090×\u0093\\ùq";
                  var8 = "«n.Á\u000e=`½ÆoT\"¬ÑÂ=¯Uw\u008e\u0090Ô<Ç'ÿÿuxóL\u0082\u0014\u001aF\u0096Üx\u001eg\u0010KÊ\u0089\u0084$þê³GÍ\u0090×\u0093\\ùq"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25363;
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
            throw new RuntimeException("cc/astralis/fcc", var10);
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
         throw new RuntimeException("cc/astralis/fcc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
