package cc.astralis;

import astralis.mixin.accessor.IdentifierAccessor;
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
import net.minecraft.class_1109;
import net.minecraft.class_1113;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3414;
import net.minecraft.class_7923;

public class enu extends guu {
   private final adu bjz;
   private static final long a = 45272832844673L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public enu() {
      long a = enu.a ^ 72392632810428L;
      super(bfm.VISUAL);
      short var10003 = 6494;
      long var10004 = 5185726529625701891L ^ a;
      short var3 = 15360;
      long var10005 = 2519458506714618709L ^ a;
      String[] var4 = new String[3];
      short var10008 = 12269;
      long var10009 = 523875040060410036L ^ a;
      var4[0] = "Skeet";
      var10008 = 25542;
      var10009 = 3931451828202456221L ^ a;
      var4[1] = "Never Lose";
      var10008 = 30272;
      var10009 = 1084860117712818455L ^ a;
      var4[2] = "Dark loves them";
      a.bjz = new adu("Hit Sound", "Skeet", var4);
      a.beb(a.bjz);
   }

   @gdz
   public void ana(eov event) {
      long ax = enu.a ^ 1574698828899L;
      int[] var10000 = dar.abu();
      class_3414 axx = (class_3414)class_7923.field_41172.method_63535(a.bqv());
      int[] axxx = var10000;
      class_3414 var7 = axx;
      if (axxx != null) {
         if (axx == null) {
            short var10001 = 11848;
            long var10002 = 8993025369223984840L ^ ax;
            System.out.println("Sound Event is null.");
            return;
         }

         var7 = axx;
      }

      class_1113 axxxx = class_1109.method_4757(var7, 1.0F, 1.0F);
      class_310.method_1551().method_1483().method_4873(axxxx);
   }

   public class_2960 bqv() {
      long a;
      int var6;
      a = enu.a ^ 14397752065821L;
      int[] var10000 = dar.abu();
      String var4 = a.bjz.dnp();
      int[] ax = var10000;
      byte var5 = -1;
      var6 = var4.hashCode();
      label59:
      if (ax != null) {
         switch (var6) {
            case 79940188:
               short var10001 = 12269;
               long var10002 = 523931986951310357L ^ a;
               var6 = var4.equals("Skeet");
               if (ax == null) {
                  break label59;
               }

               if (var6 == 0) {
                  break;
               }

               var5 = 0;
               if (ax != null) {
                  break;
               }
            case 1919939689:
               short var11 = 30864;
               long var19 = 4366202651409865583L ^ a;
               var6 = var4.equals("Never Lose");
               if (ax == null) {
                  break label59;
               }

               if (var6 == 0) {
                  break;
               }

               var5 = 1;
               if (ax != null) {
                  break;
               }
            case 1560244837:
               short var12 = 3023;
               long var20 = 592413705146542130L ^ a;
               var6 = var4.equals("Dark loves them");
               if (ax == null) {
                  break label59;
               }

               if (var6 != 0) {
                  var5 = 2;
               }
         }

         var6 = var5;
      }

      class_2960 var8;
      switch (var6) {
         case 0:
            short var10 = 8091;
            long var17 = 5306279200361856098L ^ a;
            short var18 = 15034;
            long var24 = 6781058299394103631L ^ a;
            var8 = IdentifierAccessor.createIdentifier("astralis", "effects.skeet");
            break;
         case 1:
            short var9 = 7125;
            long var15 = 3490749196669073454L ^ a;
            short var16 = 6114;
            long var23 = 1016160835100554259L ^ a;
            var8 = IdentifierAccessor.createIdentifier("astralis", "effects.neverlose");
            break;
         case 2:
            short var7 = 7125;
            long var13 = 3490749196669073454L ^ a;
            short var14 = 20876;
            long var22 = 5743831444235580027L ^ a;
            var8 = IdentifierAccessor.createIdentifier("astralis", "effects.dark");
            break;
         default:
            String var21 = a.bjz.dnp();
            short var10003 = 16698;
            long var10004 = 3769124419073237706L ^ a;
            throw new IllegalStateException("Unexpected value: " + var21);
      }

      return var8;
   }

   static {
      long var0 = a ^ 117317331875560L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[14];
      int var7 = 0;
      String var6 = "»tÇµ86nþ³t\u0085ía´\u0098\u0001H\u0090bW\u0086k\u000f¥`ÖÅ[Ð£ø\u0005 \u009e.í`'ã\u001aàcØ<ï\u0018Ô\u008d®ØAÈüØùÏ\u009cÇf¶(}xÐ\u0010(\u0014×0\u0002çþúb\u001eæ\u0001;\u00ad¯\u0099 [K¹¹\u001eèÞ\u0097<:,\u0004Þ\u0006·\u0084ò¨¾\u0013\u0095SqI ú\u000e\u0002K÷|õÖ\u0016OÚøÛà\u001f1]Íùú*~\u0095lÇ\u00adÞ\u001eu5ª1\u0010fq ×¯®ûw¿ÈrþÝ¾\u009a$ ¡\u000ehE\u00adÄE\u001f¬4vúð\u0007ìTC\u009c'ÊïN\u001e\u0017\u001b\u0094\u0001\u008e\tïø\u0003 \u0002È\u000b\rÏ±h¿!ü\u00ad Ó®b±ff\u009d\u0019YEþ_·>ý· á\u009fp \rô\u0095\u0019ñ\"7\u0094fwodx;\u0015n«\u0091ªo°|;\u0080¬ªx¹x*Öé\u0010ÖÛ¥¥câÕ#nÍ\u0019·-\u008e3Ç ãI\u000b\u0016Ca\u0089C\u0000\u000b\u000bµ\u0019¾\r3ÕnXÐÉ\u0080£p¯\u008aD9\u009ezô¯ \rHVá\u001d<y¤9\u0099Tµ µÞ\u0098%k\u0088åx\u0083\u0083X\u0097üK\u00ad§ÆÇ\u0006 \u0013*)ê¯x\b¤îÕâûxÙ\u0083\u008a¢n¤>ÜVÝ\u0015rØôaº±\u0013\u009f";
      int var8 = "»tÇµ86nþ³t\u0085ía´\u0098\u0001H\u0090bW\u0086k\u000f¥`ÖÅ[Ð£ø\u0005 \u009e.í`'ã\u001aàcØ<ï\u0018Ô\u008d®ØAÈüØùÏ\u009cÇf¶(}xÐ\u0010(\u0014×0\u0002çþúb\u001eæ\u0001;\u00ad¯\u0099 [K¹¹\u001eèÞ\u0097<:,\u0004Þ\u0006·\u0084ò¨¾\u0013\u0095SqI ú\u000e\u0002K÷|õÖ\u0016OÚøÛà\u001f1]Íùú*~\u0095lÇ\u00adÞ\u001eu5ª1\u0010fq ×¯®ûw¿ÈrþÝ¾\u009a$ ¡\u000ehE\u00adÄE\u001f¬4vúð\u0007ìTC\u009c'ÊïN\u001e\u0017\u001b\u0094\u0001\u008e\tïø\u0003 \u0002È\u000b\rÏ±h¿!ü\u00ad Ó®b±ff\u009d\u0019YEþ_·>ý· á\u009fp \rô\u0095\u0019ñ\"7\u0094fwodx;\u0015n«\u0091ªo°|;\u0080¬ªx¹x*Öé\u0010ÖÛ¥¥câÕ#nÍ\u0019·-\u008e3Ç ãI\u000b\u0016Ca\u0089C\u0000\u000b\u000bµ\u0019¾\r3ÕnXÐÉ\u0080£p¯\u008aD9\u009ezô¯ \rHVá\u001d<y¤9\u0099Tµ µÞ\u0098%k\u0088åx\u0083\u0083X\u0097üK\u00ad§ÆÇ\u0006 \u0013*)ê¯x\b¤îÕâûxÙ\u0083\u008a¢n¤>ÜVÝ\u0015rØôaº±\u0013\u009f"
         .length();
      char var5 = ' ';
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
                     h = new String[14];
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

                  var6 = "Ú\u0003Î\u001d\u0095ê\u0082\u0099fÌÂ\u0092!\u0019³ ÕîÙ\u008c\u0086dÙc\u0085sßçm\u000f!=\u0011YW´RNöô(\u0003«\u009f\u007f÷¼e×[?ï} \u0006ÄµY÷\u0087Å$*wV\u009aþ\u00ad\u00ad\u009dÎ\u0082\u0004\u000e[<9Rb3À";
                  var8 = "Ú\u0003Î\u001d\u0095ê\u0082\u0099fÌÂ\u0092!\u0019³ ÕîÙ\u008c\u0086dÙc\u0085sßçm\u000f!=\u0011YW´RNöô(\u0003«\u009f\u007f÷¼e×[?ï} \u0006ÄµY÷\u0087Å$*wV\u009aþ\u00ad\u00ad\u009dÎ\u0082\u0004\u000e[<9Rb3À"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16224;
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
            throw new RuntimeException("cc/astralis/enu", var10);
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
         throw new RuntimeException("cc/astralis/enu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
