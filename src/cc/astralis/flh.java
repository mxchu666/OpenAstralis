package cc.astralis;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import java.io.EOFException;
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
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class flh extends blz {
   private final String eee;
   private static final long b = 58168959103719L;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public flh(String configName) {
      a.eee = a;
   }

   @Override
   public void apo() {
      long a = b ^ 121666337963048L;
      JsonObject var10000 = gco.bbm();
      short var10005 = 14767;
      long var10006 = 8486359464600203736L ^ a;
      dvt.exy(var10000, new File(a.evx, a.eee + ".astralis").getAbsolutePath());
   }

   @Override
   public void fme() {
      long a = b ^ 10590000864692L;
      int[] var10000 = dar.abu();
      short var10005 = 4722;
      long var10006 = 5103131200851868566L ^ a;
      File ax = new File(a.evx, a.eee + ".astralis");
      int[] axx = var10000;
      if (axx != null) {
         if (ax.exists()) {
            try {
               try (Reader axxx = new FileReader(ax)) {
                  JsonReader axxxx;
                  label119: {
                     axxxx = new JsonReader(axxx);

                     try {
                        label113: {
                           axxxx.setLenient(true);
                           JsonElement axxxxx = JsonParser.parseReader(axxxx);
                           if (axx == null) {
                              return;
                           }

                           label86:
                           if (axxxxx != null) {
                              JsonElement var22 = axxxxx;
                              if (axx != null) {
                                 if (!axxxxx.isJsonObject()) {
                                    break label86;
                                 }

                                 var22 = axxxxx;
                              }

                              JsonObject axxxxxx = var22.getAsJsonObject();
                              gco.axu(axxxxxx);
                              break label113;
                           }

                           short var26 = 27390;
                           long var32 = 4843911849552741145L ^ a;
                           dar.ecj.error("Config {} is not a JSON object. Skipping.", ax.getName());
                           break label119;
                        }
                     } catch (Throwable var15) {
                        try {
                           axxxx.close();
                        } catch (Throwable var14) {
                           var15.addSuppressed(var14);
                        }

                        throw var15;
                     }

                     axxxx.close();
                     return;
                  }

                  axxxx.close();
               }

               return;
            } catch (EOFException | JsonSyntaxException var17) {
               Exception axxx = var17;

               try {
                  String var29 = ax.getAbsolutePath();
                  short var10003 = 11087;
                  long var10004 = 6805561719609377445L ^ a;
                  File axxxx = new File(var29 + ".corrupt");
                  short var21 = 24390;
                  Files.copy(ax.toPath(), axxxx.toPath(), StandardCopyOption.REPLACE_EXISTING);
                  long var25 = 8608469340927112873L ^ a;
                  var29 = a.eee;
                  String var33 = axxx.getMessage();
                  String axxxxxx = axxxx.getName();
                  String axxxxxxx = var33;
                  String var11 = var29;
                  short var31 = 28612;
                  long var34 = 5208834812878652962L ^ a;
                  short var35 = 3332;
                  long var36 = 6786813595354817770L ^ a;
                  short var37 = 25172;
                  long var10007 = 3543200972539005885L ^ a;
                  bpa.dhu("§cConfig '" + var11 + "' is corrupted (" + axxxxxxx + "). A backup was saved as '" + axxxxxx + "'. Loading defaults.");
               } catch (IOException var12) {
                  short var24 = 330;
                  long var28 = 1014031380662118567L ^ a;
                  dar.ecj.error("Failed to backup corrupt config: {}", var12.getMessage());
               }

               a.apo();
            } catch (IOException var18) {
               short var23 = 2675;
               long var27 = 3480254912185787295L ^ a;
               dar.ecj.error("Failed to load config '{}': {}", ax.getName(), var18.getMessage());
            }

            return;
         }

         short var10001 = 14421;
         long var10002 = 6060134679806431677L ^ a;
         dar.ecj.warn("Config file {} not found, skipping load.", ax.getAbsolutePath());
      }
   }

   static {
      long var0 = b ^ 4154756074766L;
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
      String var6 = "\u008f7Äp\b\u0018\u009e\u000b\u0015Áð´K\u0096ä\u0017'(>9´j1£è\u0084OL\u0081×ì\u0094gA¾ECL´ÎÔú\u009b÷ß'<S]\u0012XQ\u0084O4½ \rL\u0016\u0010Ò*²ü\u0013ªß¶Ä÷\u001d#´\u008cíj¹\u0004*6¦î ÆûßÅ\u001e8Ð\u0007\u0013¾\u008f\u0080\u0080*ª¦\u0088\u0097§n\u0096*Î\u00168jZ\u0086ÛµtbZSb\u0010Go\u0080\u0007[%GèI\u008b\u008b\u001eôöÊb9\u0013id\f§Ìõ¦5@\u009d»Ý_\u0017E\u009fD Uü\u0004èày©ÏrLýX<83gü/\u001d8µaØÄêÉ.\u0083\u00ad¼Q=°Ð%ÕãRQhýýÅÿ\u0094D¸\u009e7\u0084ï¬\u0019¢Ò ¹V\u009d]`¢H¼d\u0094½\u0090\t\"ó²\u0092¾J\u00051ûJ\u00978.ýê\u0096±Rc Ý²\n@(Áö\u0087NR$v*Æ#0\n´[è¤\u0004¢©Ö\u001dª_\u0098\u000e9¡PÈÕ-Lï\u008c\u00918\u009dêhx\t9\u001fz.d,\u009fÙ;Õ\u0096\u0097]Î\r\u0006ù\\ó\u0088ÇÏ(÷ãÏ\u0098\u0007 P=k'\u0004\u008cõR¼\u001a\u008dºcÎ/x\u009aÜÉï®ÿ\u0019\u000b§,\u0000°\u0015sc¿þø=\u0080¦4(í®ÇÁ¡hQ\u009c1Q\u0010çó\u0096,,ðAP!\u001fB\u0007l\u0088\u008fá\u008fÐË\u0013\u008begU\u0006È\u0005\u0010o(/\bÜ\u000b¬ÿñE4±\u0019\u001eÛ$¬\n\u0086M\u0002\u008e\u0081àa\u008c°Þ.Ë>å4\u0082ÆÒ=\u009e7óV.";
      int var8 = "\u008f7Äp\b\u0018\u009e\u000b\u0015Áð´K\u0096ä\u0017'(>9´j1£è\u0084OL\u0081×ì\u0094gA¾ECL´ÎÔú\u009b÷ß'<S]\u0012XQ\u0084O4½ \rL\u0016\u0010Ò*²ü\u0013ªß¶Ä÷\u001d#´\u008cíj¹\u0004*6¦î ÆûßÅ\u001e8Ð\u0007\u0013¾\u008f\u0080\u0080*ª¦\u0088\u0097§n\u0096*Î\u00168jZ\u0086ÛµtbZSb\u0010Go\u0080\u0007[%GèI\u008b\u008b\u001eôöÊb9\u0013id\f§Ìõ¦5@\u009d»Ý_\u0017E\u009fD Uü\u0004èày©ÏrLýX<83gü/\u001d8µaØÄêÉ.\u0083\u00ad¼Q=°Ð%ÕãRQhýýÅÿ\u0094D¸\u009e7\u0084ï¬\u0019¢Ò ¹V\u009d]`¢H¼d\u0094½\u0090\t\"ó²\u0092¾J\u00051ûJ\u00978.ýê\u0096±Rc Ý²\n@(Áö\u0087NR$v*Æ#0\n´[è¤\u0004¢©Ö\u001dª_\u0098\u000e9¡PÈÕ-Lï\u008c\u00918\u009dêhx\t9\u001fz.d,\u009fÙ;Õ\u0096\u0097]Î\r\u0006ù\\ó\u0088ÇÏ(÷ãÏ\u0098\u0007 P=k'\u0004\u008cõR¼\u001a\u008dºcÎ/x\u009aÜÉï®ÿ\u0019\u000b§,\u0000°\u0015sc¿þø=\u0080¦4(í®ÇÁ¡hQ\u009c1Q\u0010çó\u0096,,ðAP!\u001fB\u0007l\u0088\u008fá\u008fÐË\u0013\u008begU\u0006È\u0005\u0010o(/\bÜ\u000b¬ÿñE4±\u0019\u001eÛ$¬\n\u0086M\u0002\u008e\u0081àa\u008c°Þ.Ë>å4\u0082ÆÒ=\u009e7óV."
         .length();
      char var5 = '8';
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
                     g = new String[11];
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

                  var6 = "Zá\u0007\u008e2ñhÙ\u0016\u0015&\u0087[O{Å²\u0091Ü\u0003 ¨ù{\u007f+\u009d@¿¶êDF\u0082ñ88Öcä¯|\u008bkýhè4|Ì\u001fÎ2\r÷ÝØ\u0091ÚÃxØ\u0085\u0005Ï*Ù\u0090kM\u0015\u007f,¡CIé`Ø7 ¨\u008fJÎ\u009cò\u0082Q\u008aö\u001fòh®ªûd\u0012ÜW¤´Þè¹v2\u0019\u000bø\u0083Ë";
                  var8 = "Zá\u0007\u008e2ñhÙ\u0016\u0015&\u0087[O{Å²\u0091Ü\u0003 ¨ù{\u007f+\u009d@¿¶êDF\u0082ñ88Öcä¯|\u008bkýhè4|Ì\u001fÎ2\r÷ÝØ\u0091ÚÃxØ\u0085\u0005Ï*Ù\u0090kM\u0015\u007f,¡CIé`Ø7 ¨\u008fJÎ\u009cò\u0082Q\u008aö\u001fòh®ªûd\u0012ÜW¤´Þè¹v2\u0019\u000bø\u0083Ë"
                     .length();
                  var5 = 'P';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18109;
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
            throw new RuntimeException("cc/astralis/flh", var10);
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
         throw new RuntimeException("cc/astralis/flh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
