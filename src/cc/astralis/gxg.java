package cc.astralis;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gxg implements cds {
   private static final ExecutorService ful;
   private static final int hfa;
   private static HttpServer ai;
   private static Consumer<String> evv;
   private static final Gson djb;
   private static final long a = 50263293942617L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private static void aar(String a) {
      hhl.fua(a);
   }

   public static void eru(Consumer<String> callback, String clientID) {
      long ax = gxg.a ^ 38121891001888L;
      evv = a;
      dqe(a);
      short var10001 = 128;
      long var10002 = 5424017728243974396L ^ ax;
      short var4 = 14943;
      long var10003 = 6419173560684411438L ^ ax;
      aar(
         "https://login.live.com/oauth20_authorize.srf?client_id="
            + a
            + "&response_type=code&redirect_uri=http://localhost:8247&scope=XboxLive.signin%20offline_access"
      );
   }

   public static afc ar(String refreshToken, String clientID) {
      long ax = gxg.a ^ 140318556806502L;
      int[] var10000 = dar.abu();
      short var10002 = 1878;
      long var10003 = 862103739667704941L ^ ax;
      short var10005 = 20246;
      long var10006 = 7085560927993472041L ^ ax;
      short var32 = 10018;
      long var10007 = 3775789489686760464L ^ ax;
      short var34 = 31973;
      long var10008 = 6068863071981377500L ^ ax;
      fhm axx = (fhm)djb.fromJson(
         hhl.grf(
            "https://login.live.com/oauth20_token.srf",
            "client_id=" + a + "&refresh_token=" + a + "&grant_type=refresh_token&redirect_uri=http://localhost:8247",
            false
         ),
         fhm.class
      );
      int[] axxx = var10000;
      fhm var12 = axx;
      if (axxx != null) {
         if (axx == null) {
            return new afc();
         }

         var12 = axx;
      }

      String axxxx = var12.hdm;
      a = axx.fot;
      short var10001 = 13155;
      long var19 = 4037019536189904978L ^ ax;
      short var23 = 142;
      long var10004 = 5178791941661060010L ^ ax;
      short var25 = 17939;
      long var29 = 8533222658118266147L ^ ax;
      hgq axxxxx = (hgq)djb.fromJson(
         hhl.grf(
            "https://user.auth.xboxlive.com/user/authenticate",
            "{\"Properties\":{\"AuthMethod\":\"RPS\",\"SiteName\":\"user.auth.xboxlive.com\",\"RpsTicket\":\"d="
               + axxxx
               + "\"},\"RelyingParty\":\"http://auth.xboxlive.com\",\"TokenType\":\"JWT\"}",
            true
         ),
         hgq.class
      );
      hgq var13 = axxxxx;
      if (axxx != null) {
         if (axxxxx == null) {
            return new afc();
         }

         var10001 = 4799;
         long var20 = 6300585953573534090L ^ ax;
         short var24 = 22750;
         var10004 = 6007907726201893864L ^ ax;
         short var27 = 1935;
         long var30 = 4703966948649626812L ^ ax;
         var13 = (hgq)djb.fromJson(
            hhl.grf(
               "https://xsts.auth.xboxlive.com/xsts/authorize",
               "{\"Properties\":{\"SandboxId\":\"RETAIL\",\"UserTokens\":[\""
                  + axxxxx.ajg
                  + "\"]},\"RelyingParty\":\"rp://api.minecraftservices.com/\",\"TokenType\":\"JWT\"}",
               true
            ),
            hgq.class
         );
      }

      hgq axxxxxx = var13;
      var10000 = (int[])axxxxxx;
      if (axxx != null) {
         if (axxxxxx == null) {
            return new afc();
         }

         var10001 = 23078;
         long var21 = 8642188113130533150L ^ ax;
         short var28 = 27365;
         long var31 = 8418433594899399131L ^ ax;
         short var33 = 10873;
         var10007 = 1081605702488113485L ^ ax;
         var10000 = (int[])djb.fromJson(
            hhl.grf(
               "https://api.minecraftservices.com/authentication/login_with_xbox",
               "{\"identityToken\":\"XBL3.0 x=" + axxxxx.fek.clf[0].avz + ";" + axxxxxx.ajg + "\"}",
               true
            ),
            fqw.class
         );
      }

      fqw axxxxxxx = (fqw)var10000;
      var10000 = (int[])axxxxxxx;
      if (axxx != null) {
         if (axxxxxxx == null) {
            return new afc();
         }

         var10001 = 17217;
         long var22 = 6859803953963051133L ^ ax;
         var10000 = (int[])djb.fromJson(hhl.bvs("https://api.minecraftservices.com/minecraft/profile", axxxxxxx.dzg), dlk.class);
      }

      dlk axxxxxxxx = (dlk)var10000;
      return axxxxxxxx == null ? new afc() : new afc(axxxxxxx.dzg, a, axxxxxxxx.atp, axxxxxxxx.hck);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static void dqe(String a) {
      long ax = gxg.a ^ 120663044394061L;
      int[] axx = dar.abu();
      HttpServer var10000 = ai;
      if (axx == null) {
         try {
            var10000.start();
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      } else if (ai == null) {
         label22:
         try {
            short var10002 = 21026;
            long var10003 = 2173881591705724980L ^ ax;
            short var7 = 20298;
            long var10004 = 2625259000675813555L ^ ax;
            ai = HttpServer.create(new InetSocketAddress("localhost", 8247), 0);
            ai.createContext("/", new eax(a));
            ai.setExecutor(ful);
            var10000 = ai;
            break label22;
         } catch (IOException var6) {
            var6.printStackTrace();
         }
      }
   }

   private static void fug() {
      long var0 = a ^ 109443735120650L;
      int[] var2 = dar.abu();
      HttpServer var10000 = ai;
      if (var2 != null) {
         if (ai == null) {
            return;
         }

         var10000 = ai;
      }

      var10000.stop(0);
      ai = null;
      evv = null;
   }

   static {
      long var11 = a ^ 56599193502779L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[17];
      int var18 = 0;
      String var17 = "\bLm7oj\u008f1\u0000Ù\u00035\u0082aþ^P=Q\u000f\\ë\u00030ªë87\u0095En¸Í´¡Â0\rNÃ\bL³\u0007Ü\u001b®+Çâ\u000e/Õ¤©g\tu\u0014eâ\u000ebã0\u008eþM\u0091c\u0003o¿vL:y\u000eê\u0016\u008b\u001e×\u0084¸©\u0019Ü÷ï\u009f\"®*û[{P@µ\u00880©ªd\u0011ÐÔ\fê\u0080ÁÓdtóªçÈ@kÉ~\u0094u\u0080(\u0088\u0007·\u009eY0¸/\u0091æY9\u0080¦å\u001f÷§\u009e8|×U\u0011¸Êºø\u0084±\u000bÂÁ\u000bRez\u008b\u008cÎ[âÆ¼ ï?\u009dº¿¦\u0098[w6YÉ(Dò}\u0001/8òL$Ë³\u0007p\u0000,;oZ\u0013\u0093r\u0085ý\u009aÈ'm¾'µÙ\u001e\u000b¼§å^\u0098³Ø(ÂØ\u008c¢ÙçVK©Ç\u0087x\u008e\u0096ïËnÝ\u0080\u0018ÂK£\u0000d\u0081\u0014=)\u0096\u00049ÜÃÖAâº\u0090ïþ\u0090(Å£ë¼Wr`t*\u001c±Ç\u0087ð8gÔc\u000eÜ\u0014ßé¬\u0007\u008c4uPe\r\u0099\u009eÀç\u001b Ô/\u0090¿ÍX¯f\u000f\u000bKL\u0016_:½=Â\u0085È3\u0017¬:üh)g\u00874½<tFËÆ:\u0013^\u0004\u0091\b\u0017\u0004xí/`8z+\fL?\u0080N*ÆÇ\u0016æLE×Y×\u0005Êj\u000b\u0089i\u0003îy>w\u001d\u000e\u001fùãÿ\u009c¨ P±\u0084%£D\u0018ÇlÃÑ\u0085á`¿¶q±Er¼\u0087ÒN\\î\tÈc\u0013C¡mî¥á·|Õ7Ê%ï\u0083XæJ¤\u009fZ\u0001`\u001c\u0010¿¶{Kq]uúí\u008c\u0091»\u0085Ýzc\u0018=\u001dÍa \u0011F<\u009fèø]¯ô³Í 7êñPàúQÁÃ&\u0095jÑþA/â4GF\u009a÷)\u0092¹\u008a\tRÞº\u008f\u008aná÷Þ\u0018¨\u0093\u0002+q\u0096&Ë Ã= ²ä\fÃn#4öÜ\u009a\u0017\b\u0012H\u0003\u009dE¤KH\u009c\u0099Ík¡ªË:LpK\u0098\u0083Å*\u008b§c\u009bõ\u008b\u0092³Çiô~ &õÉ=ä'\b\u0093\u0017pI\u0089\u0091/új\u001c<Ä!ªB=Ê¥¡\u0086 \u0007pYe^¢N\u0080k±ê\u0086^8aJ 5®ª?òØä\u0095\u0015a54R\\8r\u008c\u009emC\u0002\u0087ÿËÈ6ó\u0011íçcEüè\u0005\u008a<×\u001e\fXÙ\u0094Ü\u0007LÑ´rXÄÈ[\u001f\u0017îýüÆÌe)9ßê*êvÈ*í!\u0000é¯v?Bz*yä\u000ew\u0083Ê\u000e\u0016FH]\u0018@\u00024¦ÉU:Iu\u009e\u001d\u008a\n\u0007.h,p¡d\u0085\tTZð¤êý\u0006#\u000e33Ö\u0015éîí' ²5o\u009c\u0086L\u0018\u0018É¦÷\u008fhô0|B¦\u009d\tÌTÓà\u009cÌÒÏ\u0001Ù²8ÖJ\u000b+\u0098¾\u008d\u0082\u0005¤\f4È\t ÙÝÃ{òô\u0094ïÉ&>ÔÞÐlÂA\u000bºýV\u009e\u001c\u0091©\\wqs \u0086Ú\u008f®\u0003\flU\u0097\u0084\u0013 \u0010~\u001f\u0093O\u0080;\u008e\u0005Òd[ðWï\u001e\u009ftco\u009c×üË\u0098¿|£5Â´<p\u0019*§QÂÿèÖy:\u0002Hb|cûh3?S\u008b\u0098dt¤\f1!ôD\u000b`@ç\u001f\u000f\u0011\u0018\u0018&\u0093\u0011z»\u0015é×\u001e½\u0016\\¸ ¤\u0093º\u001e\f\u0010pJ?åL,L-¤ü[hmÞ1Gø Q\u008b\u0014³d\u008e@\u009b\n8/Û$\u009em\u0088\u008aüfPL¹Ù)¤\u0018\u008d\u0004Á \u0010\\å¶^hà\u000f³¯Q»Ð&¹\bâ\u0017=x¿2\b\u001a\u009fmÂ|Ï\u0084\u000bf¤\\í¾ö\u0092Y *ÇB÷*Ú\u0091\r\u001eÎ\tF>\u0093@íV`Ù\u0004pC<\u0098÷÷Uª\u008fK\u0093\u000bÞ1\u0006ån<\u0097*ª´\u0095Â:\u001aÒ\u0087\u0094\u0099åÂÏUL>ñä\f\u0089ÑAârF=Q\u0095¯;X\u001dT\u0000d¡0FuË%\neð.O'ø\u008f;w=òU¨,I\u001cEèï+ÿ&@·\u008d]}ï\u008aEÔ\u001dÝâÌ\u0099âÅ\u008bÝßÍ®!xq¶L\u009eí\u0085h\u000bé®\u0001ðÒ,íl\u001a\u001b\t;^\u0014\u000eü\u0080¨¦\u008a¼\u0092µ@";
      int var19 = "\bLm7oj\u008f1\u0000Ù\u00035\u0082aþ^P=Q\u000f\\ë\u00030ªë87\u0095En¸Í´¡Â0\rNÃ\bL³\u0007Ü\u001b®+Çâ\u000e/Õ¤©g\tu\u0014eâ\u000ebã0\u008eþM\u0091c\u0003o¿vL:y\u000eê\u0016\u008b\u001e×\u0084¸©\u0019Ü÷ï\u009f\"®*û[{P@µ\u00880©ªd\u0011ÐÔ\fê\u0080ÁÓdtóªçÈ@kÉ~\u0094u\u0080(\u0088\u0007·\u009eY0¸/\u0091æY9\u0080¦å\u001f÷§\u009e8|×U\u0011¸Êºø\u0084±\u000bÂÁ\u000bRez\u008b\u008cÎ[âÆ¼ ï?\u009dº¿¦\u0098[w6YÉ(Dò}\u0001/8òL$Ë³\u0007p\u0000,;oZ\u0013\u0093r\u0085ý\u009aÈ'm¾'µÙ\u001e\u000b¼§å^\u0098³Ø(ÂØ\u008c¢ÙçVK©Ç\u0087x\u008e\u0096ïËnÝ\u0080\u0018ÂK£\u0000d\u0081\u0014=)\u0096\u00049ÜÃÖAâº\u0090ïþ\u0090(Å£ë¼Wr`t*\u001c±Ç\u0087ð8gÔc\u000eÜ\u0014ßé¬\u0007\u008c4uPe\r\u0099\u009eÀç\u001b Ô/\u0090¿ÍX¯f\u000f\u000bKL\u0016_:½=Â\u0085È3\u0017¬:üh)g\u00874½<tFËÆ:\u0013^\u0004\u0091\b\u0017\u0004xí/`8z+\fL?\u0080N*ÆÇ\u0016æLE×Y×\u0005Êj\u000b\u0089i\u0003îy>w\u001d\u000e\u001fùãÿ\u009c¨ P±\u0084%£D\u0018ÇlÃÑ\u0085á`¿¶q±Er¼\u0087ÒN\\î\tÈc\u0013C¡mî¥á·|Õ7Ê%ï\u0083XæJ¤\u009fZ\u0001`\u001c\u0010¿¶{Kq]uúí\u008c\u0091»\u0085Ýzc\u0018=\u001dÍa \u0011F<\u009fèø]¯ô³Í 7êñPàúQÁÃ&\u0095jÑþA/â4GF\u009a÷)\u0092¹\u008a\tRÞº\u008f\u008aná÷Þ\u0018¨\u0093\u0002+q\u0096&Ë Ã= ²ä\fÃn#4öÜ\u009a\u0017\b\u0012H\u0003\u009dE¤KH\u009c\u0099Ík¡ªË:LpK\u0098\u0083Å*\u008b§c\u009bõ\u008b\u0092³Çiô~ &õÉ=ä'\b\u0093\u0017pI\u0089\u0091/új\u001c<Ä!ªB=Ê¥¡\u0086 \u0007pYe^¢N\u0080k±ê\u0086^8aJ 5®ª?òØä\u0095\u0015a54R\\8r\u008c\u009emC\u0002\u0087ÿËÈ6ó\u0011íçcEüè\u0005\u008a<×\u001e\fXÙ\u0094Ü\u0007LÑ´rXÄÈ[\u001f\u0017îýüÆÌe)9ßê*êvÈ*í!\u0000é¯v?Bz*yä\u000ew\u0083Ê\u000e\u0016FH]\u0018@\u00024¦ÉU:Iu\u009e\u001d\u008a\n\u0007.h,p¡d\u0085\tTZð¤êý\u0006#\u000e33Ö\u0015éîí' ²5o\u009c\u0086L\u0018\u0018É¦÷\u008fhô0|B¦\u009d\tÌTÓà\u009cÌÒÏ\u0001Ù²8ÖJ\u000b+\u0098¾\u008d\u0082\u0005¤\f4È\t ÙÝÃ{òô\u0094ïÉ&>ÔÞÐlÂA\u000bºýV\u009e\u001c\u0091©\\wqs \u0086Ú\u008f®\u0003\flU\u0097\u0084\u0013 \u0010~\u001f\u0093O\u0080;\u008e\u0005Òd[ðWï\u001e\u009ftco\u009c×üË\u0098¿|£5Â´<p\u0019*§QÂÿèÖy:\u0002Hb|cûh3?S\u008b\u0098dt¤\f1!ôD\u000b`@ç\u001f\u000f\u0011\u0018\u0018&\u0093\u0011z»\u0015é×\u001e½\u0016\\¸ ¤\u0093º\u001e\f\u0010pJ?åL,L-¤ü[hmÞ1Gø Q\u008b\u0014³d\u008e@\u009b\n8/Û$\u009em\u0088\u008aüfPL¹Ù)¤\u0018\u008d\u0004Á \u0010\\å¶^hà\u000f³¯Q»Ð&¹\bâ\u0017=x¿2\b\u001a\u009fmÂ|Ï\u0084\u000bf¤\\í¾ö\u0092Y *ÇB÷*Ú\u0091\r\u001eÎ\tF>\u0093@íV`Ù\u0004pC<\u0098÷÷Uª\u008fK\u0093\u000bÞ1\u0006ån<\u0097*ª´\u0095Â:\u001aÒ\u0087\u0094\u0099åÂÏUL>ñä\f\u0089ÑAârF=Q\u0095¯;X\u001dT\u0000d¡0FuË%\neð.O'ø\u008f;w=òU¨,I\u001cEèï+ÿ&@·\u008d]}ï\u008aEÔ\u001dÝâÌ\u0099âÅ\u008bÝßÍ®!xq¶L\u009eí\u0085h\u000bé®\u0001ðÒ,íl\u001a\u001b\t;^\u0014\u000eü\u0080¨¦\u008a¼\u0092µ@"
         .length();
      char var16 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var35 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var35;
                  if ((var23 += var16) >= var19) {
                     b = var20;
                     c = new String[17];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "\u008f{\u0087Â\u0018\u001d(:Hâ©eáé\\f";
                     int var5 = "\u008f{\u0087Â\u0018\u001d(:Hâ©eáé\\f".length();
                     byte var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte[] var10 = var0.doFinal(
                           new byte[]{
                              (byte)(var8 >>> 56),
                              (byte)(var8 >>> 48),
                              (byte)(var8 >>> 40),
                              (byte)(var8 >>> 32),
                              (byte)(var8 >>> 24),
                              (byte)(var8 >>> 16),
                              (byte)(var8 >>> 8),
                              (byte)var8
                           }
                        );
                        long var10004 = (var10[0] & 255L) << 56
                           | (var10[1] & 255L) << 48
                           | (var10[2] & 255L) << 40
                           | (var10[3] & 255L) << 32
                           | (var10[4] & 255L) << 24
                           | (var10[5] & 255L) << 16
                           | (var10[6] & 255L) << 8
                           | var10[7] & 255L;
                        byte var40 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     e = var6;
                     f = new Integer[2];
                     short var27 = 19188;
                     long var33 = var11 ^ 6957080074988193146L;
                     hfa = 8247;
                     ful = Executors.newSingleThreadExecutor();
                     djb = new Gson();
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var35;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "L´Óx³¥$ñ0\u0092Hþðtÿt\u0099É\u0017P3\u009böè\u0013\u0017=ÊôB\u0087¿MÞ'\u0016'JÓ\u001eà+/\u0010\u0095\u001anö\u0007ïÈ{,:\u0010O}Ë¸à./Î\\¢c\u0003ËtVÝ\u0095\u0090@ðû\u008e\u0083Ò\"»\u0085}\u0088%88#ý\u008c\u009b\u0090\u000b\u0083gô²µ#õS<a\u009f8õ\u0013«[\u0096^Þ#ÎD;\u0001\u0006E¨\u008b\u008aí\"\r\u0013¯!üu\u009e\u0083à#X\u0087!\u0012\u008f¨Ó\u0002´\u0094\b¯\u0099\u000fE½,ÙñMÁ\u001bC¯J\u0090zÇë(]xè\u009d^\\ú¯\u0087\u0091¡ æN\u008cBWÇÞ\u008fÄËÅ>K×qÃ\u009dN\"\u0091\u008dJ\u0003=\u0005-\u000eÜz\u00adûE\u0096P{_°ÈFûï";
                  var19 = "L´Óx³¥$ñ0\u0092Hþðtÿt\u0099É\u0017P3\u009böè\u0013\u0017=ÊôB\u0087¿MÞ'\u0016'JÓ\u001eà+/\u0010\u0095\u001anö\u0007ïÈ{,:\u0010O}Ë¸à./Î\\¢c\u0003ËtVÝ\u0095\u0090@ðû\u008e\u0083Ò\"»\u0085}\u0088%88#ý\u008c\u009b\u0090\u000b\u0083gô²µ#õS<a\u009f8õ\u0013«[\u0096^Þ#ÎD;\u0001\u0006E¨\u008b\u008aí\"\r\u0013¯!üu\u009e\u0083à#X\u0087!\u0012\u008f¨Ó\u0002´\u0094\b¯\u0099\u000fE½,ÙñMÁ\u001bC¯J\u0090zÇë(]xè\u009d^\\ú¯\u0087\u0091¡ æN\u008cBWÇÞ\u008fÄËÅ>K×qÃ\u009dN\"\u0091\u008dJ\u0003=\u0005-\u000eÜz\u00adûE\u0096P{_°ÈFûï"
                     .length();
                  var16 = 'H';
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27915;
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
            throw new RuntimeException("cc/astralis/gxg", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("cc/astralis/gxg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20717;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = e[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/gxg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("cc/astralis/gxg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
