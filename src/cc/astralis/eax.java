package cc.astralis;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

class eax implements HttpHandler {
   private final String aci;
   private static final long a = 26267343901161L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public eax(String clientID) {
      a.aci = a;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void handle(HttpExchange req) throws IOException {
      long ax = eax.a ^ 67987027169335L;
      int[] axx = dar.abu();
      boolean var12 = false /* VF: Semaphore variable */;

      label137: {
         label138: {
            try {
               var12 = true;
               HttpExchange var10000 = a;
               if (axx != null) {
                  if (!a.getRequestMethod().equalsIgnoreCase(a<"i">(5686, 6084209368123752556L ^ ax))) {
                     a.dat(a, a<"i">(10519, 4784016594927714119L ^ ax));
                     var12 = false;
                     break label137;
                  }

                  var10000 = a;
               }

               List<NameValuePair> axxx = URLEncodedUtils.parse(var10000.getRequestURI(), StandardCharsets.UTF_8.name());
               String axxxx = null;

               for (NameValuePair axxxxx : axxx) {
                  if (axx == null) {
                     var12 = false;
                     return;
                  }

                  String var21 = a<"i">(27754, 1633537872151886392L ^ ax);
                  if (axx != null) {
                     if (!var21.equals(axxxxx.getName())) {
                        continue;
                     }

                     var21 = axxxxx.getValue();
                  }

                  axxxx = var21;
                  break;
               }

               label118: {
                  String var22 = axxxx;
                  if (axx != null) {
                     if (axxxx == null) {
                        break label118;
                     }

                     var22 = axxxx;
                  }

                  if (!var22.isEmpty()) {
                     a.goa(axxxx, a.aci);
                     a.dat(a, a<"i">(6764, 6692171457900006457L ^ ax));
                     var12 = false;
                     break label138;
                  }
               }

               a.dat(a, a<"i">(7640, 7898083051785091L ^ ax));
               var12 = false;
               break label138;
            } catch (Exception var13) {
               var13.printStackTrace();
               a.dat(a, a<"i">(22522, 3444238444152193454L ^ ax));
               var12 = false;
            } finally {
               if (var12) {
                  gxg.fug();
               }
            }

            gxg.fug();
            return;
         }

         gxg.fug();
         return;
      }

      gxg.fug();
   }

   private void goa(String a, String a) {
      fhm ax;
      label20: {
         long axx = eax.a ^ 6394416772884L;
         String axxx = hhl.grf(
            a<"i">(20553, 8974198722346819899L ^ axx),
            a<"i">(27580, 3386098294238911180L ^ axx) + a + a<"i">(8749, 6695207213825282902L ^ axx) + a + a<"i">(30916, 408054166047426993L ^ axx),
            false
         );
         int[] var10000 = dar.abu();
         ax = (fhm)gxg.djb.fromJson(axxx, fhm.class);
         int[] axxxx = var10000;
         if (axxxx != null) {
            if (ax != null) {
               break label20;
            }

            gxg.evv.accept(null);
         }

         if (axxxx != null) {
            return;
         }
      }

      gxg.evv.accept(ax.fot);
   }

   private void dat(HttpExchange a, String a) throws IOException {
      long ax = eax.a ^ 36560835725293L;
      OutputStream axx = a.getResponseBody();
      a.getResponseHeaders().add(a<"i">(23680, 8719002569688079629L ^ ax), a<"i">(24998, 6065118130400714789L ^ ax));
      a.sendResponseHeaders((int)e, a.length());
      axx.write(a.getBytes(StandardCharsets.UTF_8));
      axx.flush();
      axx.close();
   }

   static {
      long var5 = a ^ 139521544285176L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[12];
      int var12 = 0;
      String var11 = "ã¼¤%>BLÀô\u001e¾ø\u0017}§*\u00ad\u0080;\u0086À¹Íe\r\u0012a\u0093£úI¹Þû\u00837\u0088\u007f»\u0003õÚéH*\u0097?púEÒû \u0096û\u0089Û¥;Ä\u001aÇ\t\u0099^¯\u001bca\u0001ñCêç\u0092õ\u000fúÝ;Û\"\u0085\t5ÿ\u0015è\u0080K´47Å\u0083ûP¿i°BS\u00ad\u008co1\u009aKØ _ê¯f£lH\u001dHt\u0005x\u0010.^0²´)\u000foðíáý<\u0098\u0014B =û\u009b@\u000eñ\u00ad(\u001fªß\u001aÒâFò$\u0015l(³y.-#\u008eô[;\u00adfì'Ý\u00ad¥#\u0010\u0005U*dÔk\u0099þ\b©Í\u008b[URB \u0017Ó a2è\u009c`\u0010Èÿ\u008còå~\u0082\u001fM¶\u0089'¬+\u0002ÇØÏÆ\u0019Ü\u0094\u008a`\u0091e\u0087²\u000b\u009dLvµÌë¼}ôFë¿\u0096\b}\u0085A©\u0093é\u000b0\u0006\u0006Jüè&i\u008c-ýùêý±ò»H(ÊÖ\bàú¬ì\u0094á«;ø\u009d\u008d\u000f9¾~\u001d\u0090*ßqQ\u0099`Uf_.ÌôU°ù5ølã¢-ù\u0096\u009cÊ)\u001a:\u009f`íƐ2\u0010tF&\u0000|\u009f¹ÀNsõ\u0085%YüÈà÷ÝìÂ\u0092Z\u009d§\u0081#ûÚ\u001cÀ\u0095zþláÇX\u000bÏ1«\rä\u0004÷(ï*Le0\u0002\u009aY ¥\u0011s{\u00935\u0085«Ü{nÂá\u0007_P¡\u0007îÈIHËFÙ\u008d9Ó¨|Å¦\u0084\u0013\u001b¶î[\u008f\u0010)~±ÜÑ\u0003¥\tÃ\u0088`\u009eRX6·\u0002\u0085û`ä£*BZWÎJ4¶\u000fXÅpWÊ\u008e/°þCMî¡.\u0097ý òu\u0013v\u009d6+_\u000b¢\u0096¶.^4\u009f\"êã{Ríã6ÝªB\u009e\u008eÎ\u0099\u008d×r\u008eùY\u009cÐÝ\u009c{ÿØ[çSÔ\u001aîÇ\u000fÿþt\u0007r µRì)klzPeÃ$p\u0015#SR7Õ®¦;eÅrÝA9ï\f¿A[íih[msÁôz\u009fùkÿfº/\u0006\u0013ýÿÕÈþM{_×1ðöÈ{\u0016vgy1®^¨\u008eF.þÂà©×Ä\u0093÷æ\u0017\u000e\u0018'\u009b8a\u000f!\tØK´]Äbñc¨Èß\f8\u0099áL²Ö\u00ad¤\u0012µ\u000bÒüÊ\u008c×\u0006\u0014n(é}·\u0096Ä\u008d ´»å\u0092j\u0012öpé\u008eêm\u0093-GÎ¨ËÎýD>\u0017²w\u008e\u007f\u0017ìÇË\u008e\u001dY\u0013M´4½\u0097xTm¦~Æ$gs¼^0\u0089pª\u0099\n ûSN¶Kp\u008eß\n\u0082÷wl¢\u008cqý¢Ñé\u0010ÞâGG¼\u00ad\u0094ÆÛ¸ð\t,74MÊë??TÂ%\u001f-îÊ\u0019¯«Ñw\u0088ÙR8Ð\u008a¼5ø\u0013\u0004\u0086\u0015Û¸\u0005B¢\u0000%x=\u0094p ¿\u0016h\u008boÝ\u0001k\u0083ºPó\u007f(\u000bó\u009ajÏ\"ò\u007fÔõf*\u0088DýR ¤5×\u0093Dþ¯\u0001\u00ad\u0018Ü\u008aR«\u0002\u008di\u008eV\u0003\u0016¿\\\u008foQL+_Z¬pãí\u0010¯Æ\u0007¿\u0099¼wJo^*ûék0ô8\"\u0082\u0095ØýÄ$'\bÛxß&\u0018\u0005ÊÝPØ.\u008b\fv ¤Ü(J¾]Å!r\u000bN\u00adï\u001fØ;ï>ý¹0\u0095\u0082ÎF\u008e\"\u00871Qv\u000f";
      int var13 = "ã¼¤%>BLÀô\u001e¾ø\u0017}§*\u00ad\u0080;\u0086À¹Íe\r\u0012a\u0093£úI¹Þû\u00837\u0088\u007f»\u0003õÚéH*\u0097?púEÒû \u0096û\u0089Û¥;Ä\u001aÇ\t\u0099^¯\u001bca\u0001ñCêç\u0092õ\u000fúÝ;Û\"\u0085\t5ÿ\u0015è\u0080K´47Å\u0083ûP¿i°BS\u00ad\u008co1\u009aKØ _ê¯f£lH\u001dHt\u0005x\u0010.^0²´)\u000foðíáý<\u0098\u0014B =û\u009b@\u000eñ\u00ad(\u001fªß\u001aÒâFò$\u0015l(³y.-#\u008eô[;\u00adfì'Ý\u00ad¥#\u0010\u0005U*dÔk\u0099þ\b©Í\u008b[URB \u0017Ó a2è\u009c`\u0010Èÿ\u008còå~\u0082\u001fM¶\u0089'¬+\u0002ÇØÏÆ\u0019Ü\u0094\u008a`\u0091e\u0087²\u000b\u009dLvµÌë¼}ôFë¿\u0096\b}\u0085A©\u0093é\u000b0\u0006\u0006Jüè&i\u008c-ýùêý±ò»H(ÊÖ\bàú¬ì\u0094á«;ø\u009d\u008d\u000f9¾~\u001d\u0090*ßqQ\u0099`Uf_.ÌôU°ù5ølã¢-ù\u0096\u009cÊ)\u001a:\u009f`íƐ2\u0010tF&\u0000|\u009f¹ÀNsõ\u0085%YüÈà÷ÝìÂ\u0092Z\u009d§\u0081#ûÚ\u001cÀ\u0095zþláÇX\u000bÏ1«\rä\u0004÷(ï*Le0\u0002\u009aY ¥\u0011s{\u00935\u0085«Ü{nÂá\u0007_P¡\u0007îÈIHËFÙ\u008d9Ó¨|Å¦\u0084\u0013\u001b¶î[\u008f\u0010)~±ÜÑ\u0003¥\tÃ\u0088`\u009eRX6·\u0002\u0085û`ä£*BZWÎJ4¶\u000fXÅpWÊ\u008e/°þCMî¡.\u0097ý òu\u0013v\u009d6+_\u000b¢\u0096¶.^4\u009f\"êã{Ríã6ÝªB\u009e\u008eÎ\u0099\u008d×r\u008eùY\u009cÐÝ\u009c{ÿØ[çSÔ\u001aîÇ\u000fÿþt\u0007r µRì)klzPeÃ$p\u0015#SR7Õ®¦;eÅrÝA9ï\f¿A[íih[msÁôz\u009fùkÿfº/\u0006\u0013ýÿÕÈþM{_×1ðöÈ{\u0016vgy1®^¨\u008eF.þÂà©×Ä\u0093÷æ\u0017\u000e\u0018'\u009b8a\u000f!\tØK´]Äbñc¨Èß\f8\u0099áL²Ö\u00ad¤\u0012µ\u000bÒüÊ\u008c×\u0006\u0014n(é}·\u0096Ä\u008d ´»å\u0092j\u0012öpé\u008eêm\u0093-GÎ¨ËÎýD>\u0017²w\u008e\u007f\u0017ìÇË\u008e\u001dY\u0013M´4½\u0097xTm¦~Æ$gs¼^0\u0089pª\u0099\n ûSN¶Kp\u008eß\n\u0082÷wl¢\u008cqý¢Ñé\u0010ÞâGG¼\u00ad\u0094ÆÛ¸ð\t,74MÊë??TÂ%\u001f-îÊ\u0019¯«Ñw\u0088ÙR8Ð\u008a¼5ø\u0013\u0004\u0086\u0015Û¸\u0005B¢\u0000%x=\u0094p ¿\u0016h\u008boÝ\u0001k\u0083ºPó\u007f(\u000bó\u009ajÏ\"ò\u007fÔõf*\u0088DýR ¤5×\u0093Dþ¯\u0001\u00ad\u0018Ü\u008aR«\u0002\u008di\u008eV\u0003\u0016¿\\\u008foQL+_Z¬pãí\u0010¯Æ\u0007¿\u0099¼wJo^*ûék0ô8\"\u0082\u0095ØýÄ$'\bÛxß&\u0018\u0005ÊÝPØ.\u008b\fv ¤Ü(J¾]Å!r\u000bN\u00adï\u001fØ;ï>ý¹0\u0095\u0082ÎF\u008e\"\u00871Qv\u000f"
         .length();
      char var10 = '`';
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
                     c = new String[12];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 6853577754295378365L;
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

                  var11 = "ÅB4\u0096rS\u0012\u0013©\u0084y{\f¨9\u0085xDäÐP×)Þ\u0091jÐ\u001eq!YJÃò%`\u00ad©\u007fã\u008aë«Îû\u0091\u0089R\u0085æ\u0088{)Öå Mpdr@\u00ad2G¼â\u0083%¹\u0014N¤Lïð¾È\u0090qÈ\u0006\u000fQ\u0086\u0083Â\u009fÈù\u001e\u0088Í\u0089\u0090ö¯Ý\u0087=\u0087\u008bL\r\u0086è«÷9\u000fÑ\\¤\u0091^Õð\u0001=\u000ff\u008a\u001b\u009cÿßø\u008fß¿2/C\u0094z·\u008c\u008d";
                  var13 = "ÅB4\u0096rS\u0012\u0013©\u0084y{\f¨9\u0085xDäÐP×)Þ\u0091jÐ\u001eq!YJÃò%`\u00ad©\u007fã\u008aë«Îû\u0091\u0089R\u0085æ\u0088{)Öå Mpdr@\u00ad2G¼â\u0083%¹\u0014N¤Lïð¾È\u0090qÈ\u0006\u000fQ\u0086\u0083Â\u009fÈù\u001e\u0088Í\u0089\u0090ö¯Ý\u0087=\u0087\u008bL\r\u0086è«÷9\u000fÑ\\¤\u0091^Õð\u0001=\u000ff\u008a\u001b\u009cÿßø\u008fß¿2/C\u0094z·\u008c\u008d"
                     .length();
                  var10 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6030;
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
            throw new RuntimeException("cc/astralis/eax", var10);
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
         throw new RuntimeException("cc/astralis/eax" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
