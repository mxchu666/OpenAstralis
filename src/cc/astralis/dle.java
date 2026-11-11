package cc.astralis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;

public class dle {
   private static Set<String> gid;
   private static final long a = 126133003634164L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public static void gxa() {
      long a = dle.a ^ 80084598799787L;
      int[] var10000 = dar.abu();
      short var10001 = 27970;
      long var10002 = 3580083014314543230L ^ a;
      String ax = "MTIxMDU3NjQzNTg0OTE5OTY0Ng.REDACTED";
      int[] axx = var10000;
      short var22 = 14845;
      long var27 = 5314707247802227918L ^ a;
      String axxx = "1253949752119136312";

      try {
         short var10003 = 12771;
         long var10004 = 703158102457750739L ^ a;
         short var59 = 320;
         long var10005 = 1245004298323403903L ^ a;
         URL axxxx = new URL("https://discord.com/api/v10/channels/" + axxx + "/messages?limit=1");
         HttpURLConnection axxxxx = (HttpURLConnection)axxxx.openConnection();
         var10001 = 27790;
         var10002 = 7687099837902014899L ^ a;
         axxxxx.setRequestMethod("GET");
         var10001 = 28073;
         var10002 = 7894690797138757789L ^ a;
         var10003 = 20573;
         var10004 = 5914751803226649959L ^ a;
         axxxxx.setRequestProperty("Authorization", "Bot " + ax);
         var10001 = 5228;
         var10002 = 4373773844596437337L ^ a;
         short var43 = 19768;
         long var55 = 3650933184198207488L ^ a;
         axxxxx.setRequestProperty("Content-Type", "application/json");
         int axxxxxx = axxxxx.getResponseCode();
         if (axxxxxx == (int)e) {
            BufferedReader axxxxxxx = new BufferedReader(new InputStreamReader(axxxxx.getInputStream()));
            StringBuilder axxxxxxxx = new StringBuilder();

            do {
               String axxxxxxxxx;
               if ((axxxxxxxxx = axxxxxxx.readLine()) == null) {
                  axxxxxxx.close();
                  break;
               }

               axxxxxxxx.append(axxxxxxxxx);
            } while (axx != null);

            label88: {
               label108: {
                  JSONArray axxxxxxxxx = new JSONArray(axxxxxxxx.toString());
                  JSONArray var23 = axxxxxxxxx;
                  if (axx != null) {
                     if (axxxxxxxxx.isEmpty()) {
                        break label108;
                     }

                     var23 = axxxxxxxxx;
                  }

                  StringBuilder axxxxxxxxxx;
                  JSONObject axxxxxxxxxxx = var23.getJSONObject(0);
                  var10001 = 9872;
                  var10002 = 2495791611768144821L ^ a;
                  String axxxxxxxxxxxx = axxxxxxxxxxx.getString("id");
                  var10001 = 3477;
                  var10002 = 2103711890287175854L ^ a;
                  String axxxxxxxxxxxxx = axxxxxxxxxxx.getString("content");
                  axxxxxxxxxx = new StringBuilder(axxxxxxxxxxxxx);
                  label71:
                  if (axx != null) {
                     var10001 = 14758;
                     var10002 = 3534306585137781912L ^ a;
                     if (axxxxxxxxxxx.has("embeds")) {
                        var10001 = 6639;
                        var10002 = 3873791700228553950L ^ a;
                        JSONArray axxxxxxxxxxxxxx = axxxxxxxxxxx.getJSONArray("embeds");
                        int axxxxxxxxxxxxxxx = 0;

                        while (axxxxxxxxxxxxxxx < axxxxxxxxxxxxxx.length()) {
                           JSONObject axxxxxxxxxxxxxxxx = axxxxxxxxxxxxxx.getJSONObject(axxxxxxxxxxxxxxx);
                           if (axx == null) {
                              break label71;
                           }

                           if (axx != null) {
                              var10001 = 570;
                              var10002 = 1117613628099438364L ^ a;
                              if (axxxxxxxxxxxxxxxx.has("description")) {
                                 StringBuilder var24 = axxxxxxxxxx.append("\n");
                                 short var49 = 1969;
                                 long var56 = 6774501550258889366L ^ a;
                                 var24.append(axxxxxxxxxxxxxxxx.getString("description"));
                              }

                              axxxxxxxxxxxxxxx++;
                           }

                           if (axx == null) {
                              break;
                           }
                        }
                     }

                     var10001 = 6683;
                     var10002 = 3959309562500103981L ^ a;
                     dar.ecj.error("Fetching Commit ID");
                     dar.enk = axxxxxxxxxx.toString();
                  }

                  short var25 = 24337;
                  long var37 = 7365564396660095526L ^ a;
                  Pattern axxxxxxxxxxxxxx = Pattern.compile("`([a-f0-9]{7})`");
                  Matcher axxxxxxxxxxxxxxx = axxxxxxxxxxxxxx.matcher(axxxxxxxxxx.toString());
                  if (axx != null) {
                     if (axxxxxxxxxxxxxxx.find()) {
                        dar.dul = axxxxxxxxxxxxxxx.group(1);
                     }

                     Logger var26 = dar.ecj;
                     String var38 = axxxxxxxxxx.toString();
                     short var51 = 28247;
                     long var57 = 3177232035308817267L ^ a;
                     var26.error("Found Commit ID: " + var38);
                  }

                  if (axx != null) {
                     break label88;
                  }
               }

               byte var39 = 51;
               var10002 = 279583783573759233L ^ a;
               dar.ecj.error("No messages found in the channel.");
            }

            if (axx != null) {
               return;
            }
         }

         short var53 = 15407;
         long var58 = 2330130779818989846L ^ a;
         dar.ecj.error("Error: Received HTTP response code " + axxxxxx);
      } catch (Exception var19) {
         var19.printStackTrace();
      }
   }

   static {
      long var5 = a ^ 104014058229465L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[20];
      int var12 = 0;
      String var11 = "}c÷\u0002\u0092ù]DE]\u0084n\u00934\u00adW°K9Öúì§\u001b\u0018Vl`Å9ös=?i7ùj¹\u0081?\u0099}\u0084¹ûYNY yõ)å\u008a6ßæ\u001dÜ\u0017¯=OÑù+z;\u0015\u0016Ð}×Å\u001e\u0094\u0084³tíµ(ÈÓuï0fÎÃ\u0016n\u0081\u0000÷ÜÇ¦g\u007f5Õ\u0005¿½<\u0002jJ°¼;ðtd-rß}ÖÎ\u0019\u0010ªçeÑ$¨¾Ï\u000e\u0016\u0000×%)Û0@\u0001ÓT|!>\"Mæ\u001a\u001fÜ\u009c<<\u0019³>¶ \u0012\u001e´\u0098I\u001déT\u001aa¸o£BÈí4½¿Ro*÷2\u00adkÄ8äÁ´¨c¡É¬\u008a\u0011\u009c\u001c\u0007YJ\u008f0\u008f·\u00120mµ\u009a%xWú½\u009eHÍ\u0014låµ\u0084C{\u000f\u0092kpj¢ÿ\u0090\u008c&;±ÀÝ§Kü\u009a\u001b¿(0\u008e»¶\u0082HÓ¥B\u0090ãÐ×cÓÚ\u0007\u0010p\"\u0081uEþeÃ\u0017Ë®~®\u0000EhFÀ¢cU\u0099¦÷1´|M \u0006P\u008f\u0086Ú\u0017s~àìV\rftfáþ\u0018Ë/¯µå&røHÜK\u001fX\u0010Ük\u009e\u000f°\u008b¶\u008f\u000bLÃ8£÷Ã\u0091xc\u0090Õ÷¼Ëñ\bÒÂ\u0003\tò¤vY1ë\u000f\u001c\u0000ÝéUþ\u000b\u00934#\u008däMS\u008aà½·\fwÀÒoûl\u009a\u000eù\u0004Ëå_¥\u0094ïÑ\u00189ÎO/\nt^\fuÇÃî\u0017\u0017W¥¨*m\u0080_f\u0085=ìü¼¶\u0014\u001ec÷À\fÔYxa\u0088\u0098Þ/hÿ6ô:ók<\u0018wÏ}'Ö/\u001fsêc÷®§(\u001dà±ì~['\u0082\u007f\u0090ç\bÇ\u0006Ì\u0080\u0086*\u009b>4×?\u000f\u0088Dc\u0007éfI\u008d/<Å@û\u0080Ìm\u0010\u0019±Ìx\u0006\\i\\H¶)Eï_A\u0082@Ìoa7ÐB\u0011*¡ÿ\u000bÏ\u0016ß\u0007êJ\b\u0093\u0089\u009f\u0099\u009f~@·Ø!\u0097\u0098m0ÈæL\u001f9ò¾Ì\u001bü!ÆÑ\u0014òøu\u0095E\u0015!æ©B\u0010\u0018Éa\u008c3¼;(\u008cT<dýK\\ÅÆsÅèÐ8aHïÓ:\\¿£e|O?á\u00adx»q÷\u0082\u009aØ4\u009b\u0086\u008d\u000b\u0010\u00adúKá\u0083\u008eJ+E\u001bÆ\u0082«¥þ¢\u0010\u000bªøp\u0085\u0006dÅ[WN¼\u0003R\u001aH\u0010gÙ\u0006¨uó]äÔSÌ\u0091ÊHW¦ \u0084Ù\u0002Â\u00899ÿsJõÜ«)\u0005_\u0004\u000f]\r\u0082wÑm|\\¡À#\u0098ç\u0088T";
      int var13 = "}c÷\u0002\u0092ù]DE]\u0084n\u00934\u00adW°K9Öúì§\u001b\u0018Vl`Å9ös=?i7ùj¹\u0081?\u0099}\u0084¹ûYNY yõ)å\u008a6ßæ\u001dÜ\u0017¯=OÑù+z;\u0015\u0016Ð}×Å\u001e\u0094\u0084³tíµ(ÈÓuï0fÎÃ\u0016n\u0081\u0000÷ÜÇ¦g\u007f5Õ\u0005¿½<\u0002jJ°¼;ðtd-rß}ÖÎ\u0019\u0010ªçeÑ$¨¾Ï\u000e\u0016\u0000×%)Û0@\u0001ÓT|!>\"Mæ\u001a\u001fÜ\u009c<<\u0019³>¶ \u0012\u001e´\u0098I\u001déT\u001aa¸o£BÈí4½¿Ro*÷2\u00adkÄ8äÁ´¨c¡É¬\u008a\u0011\u009c\u001c\u0007YJ\u008f0\u008f·\u00120mµ\u009a%xWú½\u009eHÍ\u0014låµ\u0084C{\u000f\u0092kpj¢ÿ\u0090\u008c&;±ÀÝ§Kü\u009a\u001b¿(0\u008e»¶\u0082HÓ¥B\u0090ãÐ×cÓÚ\u0007\u0010p\"\u0081uEþeÃ\u0017Ë®~®\u0000EhFÀ¢cU\u0099¦÷1´|M \u0006P\u008f\u0086Ú\u0017s~àìV\rftfáþ\u0018Ë/¯µå&røHÜK\u001fX\u0010Ük\u009e\u000f°\u008b¶\u008f\u000bLÃ8£÷Ã\u0091xc\u0090Õ÷¼Ëñ\bÒÂ\u0003\tò¤vY1ë\u000f\u001c\u0000ÝéUþ\u000b\u00934#\u008däMS\u008aà½·\fwÀÒoûl\u009a\u000eù\u0004Ëå_¥\u0094ïÑ\u00189ÎO/\nt^\fuÇÃî\u0017\u0017W¥¨*m\u0080_f\u0085=ìü¼¶\u0014\u001ec÷À\fÔYxa\u0088\u0098Þ/hÿ6ô:ók<\u0018wÏ}'Ö/\u001fsêc÷®§(\u001dà±ì~['\u0082\u007f\u0090ç\bÇ\u0006Ì\u0080\u0086*\u009b>4×?\u000f\u0088Dc\u0007éfI\u008d/<Å@û\u0080Ìm\u0010\u0019±Ìx\u0006\\i\\H¶)Eï_A\u0082@Ìoa7ÐB\u0011*¡ÿ\u000bÏ\u0016ß\u0007êJ\b\u0093\u0089\u009f\u0099\u009f~@·Ø!\u0097\u0098m0ÈæL\u001f9ò¾Ì\u001bü!ÆÑ\u0014òøu\u0095E\u0015!æ©B\u0010\u0018Éa\u008c3¼;(\u008cT<dýK\\ÅÆsÅèÐ8aHïÓ:\\¿£e|O?á\u00adx»q÷\u0082\u009aØ4\u009b\u0086\u008d\u000b\u0010\u00adúKá\u0083\u008eJ+E\u001bÆ\u0082«¥þ¢\u0010\u000bªøp\u0085\u0006dÅ[WN¼\u0003R\u001aH\u0010gÙ\u0006¨uó]äÔSÌ\u0091ÊHW¦ \u0084Ù\u0002Â\u00899ÿsJõÜ«)\u0005_\u0004\u000f]\r\u0082wÑm|\\¡À#\u0098ç\u0088T"
         .length();
      char var10 = 24;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = a(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     b = var14;
                     c = new String[20];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 1714794876161990406L;
                     byte[] var4 = var0.doFinal(
                        new byte[]{
                           (byte)(var2 >>> 56),
                           (byte)(var2 >>> 48),
                           (byte)(var2 >>> 40),
                           (byte)(var2 >>> 32),
                           (byte)(var2 >>> 24),
                           (byte)(var2 >>> 16),
                           (byte)(var2 >>> 8),
                           (byte)var2
                        }
                     );
                     long var30 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     var10001 = -1;
                     e = var30;
                     gid = new HashSet<>();
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = "ÎNR¹\u0092¶\u009cíÈ\u001e\u007f\u0098(6\\A¨.&\n¤öøu ¦Á\u0097o\n\\I§1èø\u001b]K=Ûã\u0081²W\u009fi\u0001\u008dif¼\u0013)\u0091Ëf";
                  var13 = "ÎNR¹\u0092¶\u009cíÈ\u001e\u007f\u0098(6\\A¨.&\n¤öøu ¦Á\u0097o\n\\I§1èø\u001b]K=Ûã\u0081²W\u009fi\u0001\u008dif¼\u0013)\u0091Ëf"
                     .length();
                  var10 = 24;
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23914;
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
            throw new RuntimeException("cc/astralis/dle", var10);
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
         throw new RuntimeException("cc/astralis/dle" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
