package cc.astralis;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cwr extends blz {
   private final File acu;
   private final boolean ggp;
   private static final long b = 96179620453212L;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public cwr(boolean encryption) {
      long ax = b ^ 56516710639459L;
      super();
      short var10004 = 1752;
      long var10005 = 8612507555200828002L ^ ax;
      a.acu = new File(a.bf, "alts.json");
      a.ggp = a;
   }

   @Override
   public void apo() {
      JsonObject a = new JsonObject();
      crv.emo().forEach(ax -> {
         long ax = b ^ 65553175828308L;
         JsonObject axx = new JsonObject();
         short var10001 = 18465;
         long var10002 = 321103447597759656L ^ ax;
         axx.addProperty("token", ax.gpj());
         var10001 = 16609;
         var10002 = 1700701466379465839L ^ ax;
         axx.addProperty("uuid", ax.hal());
         var10001 = 6460;
         var10002 = 9144243220897754548L ^ ax;
         axx.addProperty("encryption", a.ggp);
         a.add(ax.gwo(), axx);
      });
      dvt.exy(a, a.acu.getAbsolutePath());
   }

   @Override
   public void fme() {
      long a = b ^ 116821919609871L;
      int[] ax = dar.abu();

      try (Reader axx = new FileReader(a.acu.getAbsolutePath())) {
         JsonElement axxx = JsonParser.parseReader(axx);
         if (ax == null) {
            return;
         }

         if (axxx.isJsonObject()) {
            JsonObject axxxx = axxx.getAsJsonObject();

            for (Entry<String, JsonElement> axxxxx : axxxx.entrySet()) {
               String axxxxxx = axxxxx.getKey();
               JsonObject axxxxxxx = axxxxx.getValue().getAsJsonObject();
               if (ax == null) {
                  return;
               }

               short var10004 = 4525;
               long var10005 = 6637561768706573945L ^ a;
               String var10003 = axxxxxxx.get("token").getAsString();
               short var16 = 30628;
               long var10006 = 7856314742019186803L ^ a;
               String var15 = axxxxxxx.get("uuid").getAsString();
               short var17 = 4525;
               long var10007 = 6637561768706573945L ^ a;
               gfv axxxxxxxx = new gfv(axxxxxx, var10003, var15, !axxxxxxx.get("token").getAsString().isEmpty());
               crv.emo().add(axxxxxxxx);
               if (ax == null) {
                  break;
               }
            }
         }
      } catch (IOException var14) {
         var14.printStackTrace();
      }
   }

   static {
      long var0 = b ^ 125674887631148L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "j!=\u0006\u0016\u0017¢\r¾(«J\u0099\u0002+8\u0018\u009e!êI²s\u00ad\u0080\u0013\u001b\u007f\u0086\u0087óÎ\u0013ùÖ@)IJ0\u000e\u0010\"R¾DÈ\u0000\u001bY°ÃËÓÚ\u0092|¢\u0010¦<Æv¬Ý\u008f×èJê±ÑÞ\u0002ý";
      int var8 = "j!=\u0006\u0016\u0017¢\r¾(«J\u0099\u0002+8\u0018\u009e!êI²s\u00ad\u0080\u0013\u001b\u007f\u0086\u0087óÎ\u0013ùÖ@)IJ0\u000e\u0010\"R¾DÈ\u0000\u001bY°ÃËÓÚ\u0092|¢\u0010¦<Æv¬Ý\u008f×èJê±ÑÞ\u0002ý"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     f = var9;
                     g = new String[6];
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

                  var6 = "\u009còÊõ¬\u00933óÉ¡\u008a\u0093ÝÊ\u001b1Sg\u0007\u001f\u001a\u0011Öfg\u009c\u001dº*Ö\u0092d\u0010Y.l×\u009c\u00897¢eK´Ñ\u001a\u001e³\u0097";
                  var8 = "\u009còÊõ¬\u00933óÉ¡\u008a\u0093ÝÊ\u001b1Sg\u0007\u001f\u001a\u0011Öfg\u009c\u001dº*Ö\u0092d\u0010Y.l×\u009c\u00897¢eK´Ñ\u001a\u001e³\u0097"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14468;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/cwr", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("cc/astralis/cwr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
