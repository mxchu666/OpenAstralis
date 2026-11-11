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
import net.minecraft.class_2828;

public class fpn extends guu {
   private final adu bub;
   private static final long a = 36101488060136L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public fpn() {
      long a = fpn.a ^ 68946068907723L;
      super(bfm.PLAYER);
      byte var10003 = 56;
      long var10004 = 778548568468693975L ^ a;
      short var3 = 9077;
      long var10005 = 8736234284701614233L ^ a;
      String[] var4 = new String[3];
      short var10008 = 18896;
      long var10009 = 1105986237570279993L ^ a;
      var4[0] = "Cancel";
      var10008 = 27377;
      var10009 = 2085765559664527644L ^ a;
      var4[1] = "Stop";
      var10008 = 30737;
      var10009 = 503399316458167290L ^ a;
      var4[2] = "Stop 2";
      a.bub = new adu("Mode", "Cancel", var4);
      a.beb(a.bub);
   }

   @gdz
   public void ehh(fxx event) {
      int[] ax;
      int var7;
      long axx = fpn.a ^ 1975195525712L;
      int[] var10000 = dar.abu();
      String var5 = a.bub.dnp();
      ax = var10000;
      byte var6 = -1;
      var7 = var5.hashCode();
      label59:
      if (ax != null) {
         switch (var7) {
            case 2011110042:
               short var10001 = 18896;
               long var10002 = 1106055786565021346L ^ axx;
               var7 = var5.equals("Cancel");
               if (ax == null) {
                  break label59;
               }

               if (var7 == 0) {
                  break;
               }

               var6 = 0;
               if (ax != null) {
                  break;
               }
            case 2587682:
               short var8 = 27377;
               long var10 = 2085764516576857479L ^ axx;
               var7 = var5.equals("Stop");
               if (ax == null) {
                  break label59;
               }

               if (var7 == 0) {
                  break;
               }

               var6 = 1;
               if (ax != null) {
                  break;
               }
            case -1808203852:
               short var9 = 30737;
               long var11 = 503365760430120801L ^ axx;
               var7 = var5.equals("Stop 2");
               if (ax == null) {
                  break label59;
               }

               if (var7 != 0) {
                  var6 = 2;
               }
         }

         var7 = var6;
      }

      switch (var7) {
         case 0:
            a.gmm(true);
            if (ax != null) {
               break;
            }
         case 1:
         case 2:
            chi.field_1724.method_18800(0.0, 0.0, 0.0);
      }
   }

   @gdz
   public void atu(etk event) {
      long ax = fpn.a ^ 49840035966693L;
      int[] var4 = dar.abu();
      if (var4 != null) {
         short var10001 = 27377;
         long var10002 = 2085786036060668210L ^ ax;
         if (!a.bub.emb("Stop")) {
            return;
         }

         a.dab = false;
         a.eeq = false;
         a.fgh = false;
         a.gvc = false;
         a.coh = false;
         a.bxg = false;
      }

      a.aky = false;
   }

   @gdz
   public void big(eih event) {
      long ax = fpn.a ^ 139785576645143L;
      short var10001 = 23996;
      long var10002 = 5790139900416088714L ^ ax;
      if (a.bub.emb("Stop")) {
         a.gmm(true);
      }
   }

   @gdz
   public void gon(amo event) {
      long ax = fpn.a ^ 89612487379753L;
      int[] var4 = dar.abu();
      if (a.cud() != gpy.RECEIVE && chi.field_1687 != null) {
         amo var5;
         label38: {
            short var10001 = 5467;
            long var10002 = 2207333581263723351L ^ ax;
            boolean var10000 = a.bub.emb("Stop 2");
            if (var4 != null) {
               if (!var10000) {
                  return;
               }

               var5 = a;
               if (var4 == null) {
                  break label38;
               }

               var10000 = a.bed() instanceof class_2828;
            }

            if (!var10000) {
               return;
            }

            var5 = a;
         }

         var5.gmm(true);
      }
   }

   static {
      long var0 = a ^ 84033249182965L;
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
      String var6 = "\u00016\b\u009fi_ÇÜ?±\ti\u008b\u0003Ï.\u0010'\u0082àe\u008fS\u0018\u0018\u0011j\u007f÷\u0099]Y?\u0010ÁØ\u0019\u0080\u0092\u001dÎ ù\u009fç\u007f·\u008e£Y\u0010Ýß\u0003ùäJ_\u008fhì\u0088Ã\u009euÏÿ\u0010\u0087A®ýQ+ØE\u00ad\u000e\u0090³©j\u000bb";
      int var8 = "\u00016\b\u009fi_ÇÜ?±\ti\u008b\u0003Ï.\u0010'\u0082àe\u008fS\u0018\u0018\u0011j\u007f÷\u0099]Y?\u0010ÁØ\u0019\u0080\u0092\u001dÎ ù\u009fç\u007f·\u008e£Y\u0010Ýß\u0003ùäJ_\u008fhì\u0088Ã\u009euÏÿ\u0010\u0087A®ýQ+ØE\u00ad\u000e\u0090³©j\u000bb"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = d(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     g = var9;
                     h = new String[7];
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

                  var6 = "ø$áâr\u0004l\u008d¬¡\u0019%P×bì\u0010`¢É_öeÙ\u000b9Ær&)B\u009b§";
                  var8 = "ø$áâr\u0004l\u008d¬¡\u0019%P×bì\u0010`¢É_öeÙ\u000b9Ær&)B\u009b§".length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9164;
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
            throw new RuntimeException("cc/astralis/fpn", var10);
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
         throw new RuntimeException("cc/astralis/fpn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
