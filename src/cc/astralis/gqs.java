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
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gqs extends blz {
   private final File boa;
   private static final long b = 33044126901290L;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public gqs() {
      long a = b ^ 139950668338483L;
      super();
      short var10004 = 5335;
      long var10005 = 7741881176100800887L ^ a;
      a.boa = new File(a.bf, "drag.json");
   }

   @Override
   public void apo() {
      long a = b ^ 75099877944037L;
      JsonObject ax = new JsonObject();
      int[] var10000 = dar.abu();
      Iterator var5 = fjk.bfv.iterator();
      int[] axx = var10000;

      while (true) {
         if (var5.hasNext()) {
            env axxx = (env)var5.next();
            JsonObject axxxx = new JsonObject();
            short var10001 = 22608;
            long var10002 = 2977320769443052069L ^ a;
            axxxx.addProperty("xPos", axxx.grp());
            var10001 = 24152;
            var10002 = 4359651582824856623L ^ a;
            axxxx.addProperty("yPos", axxx.azb());
            ax.add(axxx.cdc(), axxxx);
            if (axx == null) {
               break;
            }

            if (axx != null) {
               continue;
            }
         }

         dvt.exy(ax, a.boa.getAbsolutePath());
         break;
      }
   }

   @Override
   public void fme() {
      long a = b ^ 38807284714361L;
      int[] ax = dar.abu();

      try (Reader axx = new FileReader(a.boa.getAbsolutePath())) {
         JsonElement axxx = JsonParser.parseReader(axx);
         if (ax == null) {
            return;
         }

         if (axxx.isJsonObject()) {
            JsonObject axxxx = axxx.getAsJsonObject();
            Iterator var7 = axxxx.entrySet().iterator();

            label71:
            do {
               boolean var10000 = var7.hasNext();

               while (var10000) {
                  Entry<String, JsonElement> axxxxx = (Entry<String, JsonElement>)var7.next();
                  String axxxxxx = axxxxx.getKey();
                  JsonObject axxxxxxx = axxxxx.getValue().getAsJsonObject();
                  if (ax == null) {
                     return;
                  }

                  Iterator var11 = fjk.bfv.iterator();

                  while (true) {
                     if (!var11.hasNext()) {
                        continue label71;
                     }

                     label63: {
                        env axxxxxxxx = (env)var11.next();
                        env var16 = axxxxxxxx;
                        if (ax != null) {
                           var10000 = axxxxxxxx.cdc().equalsIgnoreCase(axxxxxx);
                           if (ax == null) {
                              break;
                           }

                           if (!var10000) {
                              break label63;
                           }

                           short var10002 = 23553;
                           long var10003 = 2560621379103465449L ^ a;
                           axxxxxxxx.biu(axxxxxxx.get("xPos").getAsFloat());
                           var16 = axxxxxxxx;
                        }

                        short var17 = 30049;
                        long var18 = 7811853833831790222L ^ a;
                        var16.dfy(axxxxxxx.get("yPos").getAsFloat());
                     }

                     if (ax == null) {
                        continue label71;
                     }
                  }
               }
               break;
            } while (ax != null);
         }
      } catch (IOException var15) {
         var15.printStackTrace();
      }
   }

   static {
      long var0 = b ^ 96926754492684L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "tÿ'wß|XË¿\u0006RØTK*û\u0018Àú\u0082¡Û\u0019¬\u0012â\u000bÉùó\u0019\u0012§ÛËcPó\u0010mF\u0010\u000ffø\u0004ëO\u001d\u0091&\u0083ø\u0080\u000bçC¹";
      int var8 = "tÿ'wß|XË¿\u0006RØTK*û\u0018Àú\u0082¡Û\u0019¬\u0012â\u000bÉùó\u0019\u0012§ÛËcPó\u0010mF\u0010\u000ffø\u0004ëO\u001d\u0091&\u0083ø\u0080\u000bçC¹"
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
                     g = new String[5];
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

                  var6 = "£è\u0084¾KxoL\u0002hþ´TX\u009bF\u0010^£Ã\u0010_»1dª½ O»A\u001dÅ";
                  var8 = "£è\u0084¾KxoL\u0002hþ´TX\u009bF\u0010^£Ã\u0010_»1dª½ O»A\u001dÅ".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27832;
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
            throw new RuntimeException("cc/astralis/gqs", var10);
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
         throw new RuntimeException("cc/astralis/gqs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
