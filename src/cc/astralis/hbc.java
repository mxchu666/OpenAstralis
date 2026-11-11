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
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hbc {
   private static final String eig;
   private static final ConcurrentHashMap<String, String[]> bbb;
   private static final long a = 52666524224574L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public static String[] daf(String playerName) {
      return bbb.get(a);
   }

   public static void bfk(String playerName) {
      long ax = hbc.a ^ 41957258549451L;
      if (a != null && !bbb.containsKey(a)) {
         dkw.dwk(() -> {
            long ax = hbc.a ^ 7484457796756L;

            try {
               String axx = bja(a);
               short var6 = 22654;
               long var10001 = 4853617845030836019L ^ ax;
               String[] var7 = new String[8];
               String var11 = dcp(axx);
               short var21 = 13179;
               long var37 = 1937966954650272654L ^ ax;
               var7[0] = "Wins: " + var11;
               var11 = bnx(axx);
               var21 = 21199;
               var37 = 6825205353822609967L ^ ax;
               var7[1] = "Loses: " + var11;
               var11 = aay(axx);
               var21 = 1075;
               var37 = 2993323807215596746L ^ ax;
               var7[2] = "GP: " + var11;
               var11 = bqa(axx);
               var21 = 32142;
               var37 = 5835103928910400873L ^ ax;
               var7[3] = "W/L: " + var11;
               var11 = fgu(axx);
               var21 = 23109;
               var37 = 8721047181668248225L ^ ax;
               var7[4] = "KDR: " + var11;
               var11 = deq(axx);
               var21 = 4922;
               var37 = 6026889307722490826L ^ ax;
               var7[5] = "FKDR: " + var11;
               int var9 = b<"h">(18801, 1001266152511194680L ^ ax);
               var11 = hfg(axx);
               var21 = 23833;
               var37 = 5871799421620186616L ^ ax;
               var7[var9] = "BBLR: " + var11;
               short var10 = 12199;
               long var18 = 5815761919543451880L ^ ax;
               var11 = dek(axx);
               var21 = 10226;
               var37 = 1774692908064085780L ^ ax;
               var7[7] = "WS: " + var11;
               String[] axxx = var7;
               bbb.put(a, axxx);
            } catch (Exception var5) {
               ConcurrentHashMap var10000 = bbb;
               short var10002 = 12323;
               long var10003 = 5916950017812086639L ^ ax;
               String[] var8 = new String[8];
               short var10005 = 7940;
               long var10006 = 8137570425328119791L ^ ax;
               var8[0] = "N/A";
               var10005 = 7940;
               var10006 = 8137570425328119791L ^ ax;
               var8[1] = "N/A";
               var10005 = 7940;
               var10006 = 8137570425328119791L ^ ax;
               var8[2] = "N/A";
               var10005 = 7940;
               var10006 = 8137570425328119791L ^ ax;
               var8[3] = "N/A";
               var10005 = 7940;
               var10006 = 8137570425328119791L ^ ax;
               var8[4] = "N/A";
               var10005 = 7940;
               var10006 = 8137570425328119791L ^ ax;
               var8[5] = "N/A";
               int var10004 = b<"h">(15243, 4989353501248926915L ^ ax);
               var10005 = 7940;
               var10006 = 8137570425328119791L ^ ax;
               var8[var10004] = "N/A";
               short var20 = 30009;
               long var35 = 2661459634036767351L ^ ax;
               var10005 = 7940;
               var10006 = 8137570425328119791L ^ ax;
               var8[7] = "N/A";
               var10000.put(a, var8);
            }
         });
      }
   }

   private static String bja(String a) throws Exception {
      long ax = hbc.a ^ 98795060949189L;
      String var10002 = ek.gkf(a);
      short var10003 = 18298;
      long var10004 = 497544371882279900L ^ ax;
      URL axx = new URL("https://bwstats.shivam.pro/user/" + var10002);
      HttpURLConnection axxx = (HttpURLConnection)axx.openConnection();
      int[] var10000 = dar.abu();
      short var9 = 4079;
      long var10 = 2753727920270019404L ^ ax;
      axxx.setRequestMethod("GET");
      BufferedReader axxxx = new BufferedReader(new InputStreamReader(axxx.getInputStream()));
      int[] axxxxx = var10000;
      StringBuilder axxxxxx = new StringBuilder();

      while (true) {
         String axxxxxxx;
         if ((axxxxxxx = axxxx.readLine()) != null) {
            axxxxxx.append(axxxxxxx);
            if (axxxxx != null) {
               continue;
            }
            break;
         }

         axxxx.close();
         break;
      }

      return axxxxxx.toString();
   }

   private static String dcp(String a) {
      long ax = hbc.a ^ 62146259332798L;
      short var10001 = 29790;
      long var10002 = 2683599314061438602L ^ ax;
      return djn(a, "Wins: ", ",");
   }

   private static String bnx(String a) {
      long ax = hbc.a ^ 108171970093533L;
      short var10001 = 22845;
      long var10002 = 8609067176738917515L ^ ax;
      return djn(a, "Losses: ", ",");
   }

   private static String aay(String a) {
      long ax = hbc.a ^ 52545578574393L;
      short var10001 = 30190;
      long var10002 = 4796575461769356208L ^ ax;
      return djn(a, "Games Played: ", ",");
   }

   private static String bqa(String a) {
      long ax = hbc.a ^ 92310006933642L;
      short var10001 = 17878;
      long var10002 = 9134394407823153459L ^ ax;
      short var3 = 1078;
      long var10003 = 5257249553354217675L ^ ax;
      return djn(a, "Win/Loss Ratio: ", " /");
   }

   private static String fgu(String a) {
      long ax = hbc.a ^ 115578074724808L;
      short var10001 = 32291;
      long var10002 = 1989232721191728009L ^ ax;
      return djn(a, "K/D Ratio (KDR): ", ",");
   }

   private static String deq(String a) {
      long ax = hbc.a ^ 68283268706563L;
      short var10001 = 24341;
      long var10002 = 6120567249511193203L ^ ax;
      short var3 = 22964;
      long var10003 = 4598143476816911558L ^ ax;
      return djn(a, "Final K/D Ratio (FKDR): ", " /");
   }

   private static String hfg(String a) {
      long ax = hbc.a ^ 140128063303329L;
      short var10001 = 25606;
      long var10002 = 6266969688721669839L ^ ax;
      short var3 = 1078;
      long var10003 = 5257297375629795040L ^ ax;
      return djn(a, "Beds B/L Ratio (BBLR): ", " /");
   }

   private static String dek(String a) {
      long ax = hbc.a ^ 122869543638042L;
      short var10001 = 21151;
      long var10002 = 6506634859605734117L ^ ax;
      return djn(a, "Winstreak: ", ",");
   }

   private static String djn(String a, String a, String a) {
      long ax = hbc.a ^ 84755650176298L;
      int[] var10000 = dar.abu();
      int axx = a.indexOf(a);
      int[] axxx = var10000;
      int var9 = axx;
      int var10001 = -1;
      if (axxx != null) {
         if (axx == -1) {
            short var13 = 2803;
            long var16 = 5421338615863810999L ^ ax;
            return "N/A";
         }

         var9 = axx;
         var10001 = a.length();
      }

      axx = var9 + var10001;
      int axxxx = a.indexOf(a, axx);
      int var10 = axxxx;
      if (axxx != null) {
         if (axxxx == -1) {
            axxxx = a.length();
         }

         String var11 = a.substring(axx, axxxx).trim();
         if (axxx == null) {
            return var11;
         }

         short var14 = 7139;
         long var10002 = 158117422365837989L ^ ax;
         var10 = var11.equals("Infinity");
      }

      if (var10 != 0) {
         short var12 = 4683;
         long var15 = 5278581231148499720L ^ ax;
         return "NA";
      } else {
         return a.substring(axx, axxxx).trim();
      }
   }

   static {
      long var11 = a ^ 137073504147802L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[25];
      int var18 = 0;
      String var17 = "¼½0$Dn8\u009bd4\u007f\u0097\u0001nÔhÓl\u001fì£Ê\u0007\"\u0010uÅ}\u0017\u009eOÛ!.ÔpDx\u0001\n£8P\u0099\u0087\u0091O1F\u000b\bÒ\u001fÍ°c5\"¿\u009d÷E§#3\u009f\u0086\u0080ø>\tT@ëÙöô´K\u000b·\u0097aà\u0091øêùj5l\rÀYË$*û\u0010ç\u0085VN|ÿ»\u0085,k\u0093å]9Ué@(â\u0006·\u0097Ëqµ\nl5\u0015pï<¼Ü\u0000ñóOäRÏ1$ØN\rÙG\u0011\u0088g#>nª\\ud»\u0000Èb\u00908\u0081\u0094Ô\u0082ûNo\u0007>]\u0004EäV\u0082?O(r\u0089â\u0016X<`lq\u0082\u0085x\u008cà°\u0011,ÿkIQÐþù n³\u008c£55p\t\u001bOËÝ=Ý\u000f\u0010m%r\u0019uu4¤Zg\u0095\u0006\u0006\u0088×\u009a µ\u001e\u0086}[»¯½\u000bãx°·ÚØ\"L¥/]X@×õc\u009bWÒ\u009b\u0085¾a(ð'»P\u0019îûêqÛH7\u0094ey\u0019Ð &\u0001pjî'\u001f\u009b\u009cÆ\u0001Ìü\u009a\u0006\u0080ÁÓéÈQ\u0092\u0010\u001b$¨{¦\u0095øõ\u001d+Û\u0007-,Ûh\u0010ópÝüýì×\u0015\u009b§ \u000b \u0006\u009f\u0098 ÖÛ\u0096!\u0011z;Pq}\u001d!¹ôì{\ny#±\u001fê~\u0092ºBèm\u009f\u0007\u0083T\u0018Ø·\u000e\u001cTåþAwY*kþG;iáK±Ö5$Ê\u0014\u0018n\u008cÎJ\t!I=YUÎ^aM´Oñ¬}\u009c\u009f©mÆ\u0010d\u0086~Ô¶\u000fk\u0005@\u0095K\fÆWÂ\u009e(óf=o1Å»w\u009f×RÚ9§ô\u0016³\u009f%´\u0093èL\u009e{ûqÛ(¥\\µ\u0092#5JR\u009fÞZ\u0010b\u009d\u00ad\u0006)}\u0094\u001b^\u009bý\u0085WÜò6@çÎ\n,F°·è\u001d\u009e¶_äÒ\u009e\u0082\u001aæ\u000bvÙ\u0002|\u0011ª\u0099ä\r\u00066ÑÖõÙ^çóùÝ\u007fMoW\u0080¥S¾ø\b\u001b_v\u000bªÐ7Èñ\u0013Ó\u0003\u0086ï¦\u0010 \u009b\u0004\u0091\bS_Ê2\"\u008b×cx`\u0011\u0010'2Cm\u009f\u0000\u0095kUµa¿1ÏìT\u0010\u00adËêPÈ\u009dþÞÐ\u008aÑ#ÁÖ\u0091ä\u0010.\u001a¥ÞDL\u0013\u001foãÔ\u009e8 ÓÔ\u0010¬=]§N]Ø\u0001\u0003\t<\u0083ð\u008fp#";
      int var19 = "¼½0$Dn8\u009bd4\u007f\u0097\u0001nÔhÓl\u001fì£Ê\u0007\"\u0010uÅ}\u0017\u009eOÛ!.ÔpDx\u0001\n£8P\u0099\u0087\u0091O1F\u000b\bÒ\u001fÍ°c5\"¿\u009d÷E§#3\u009f\u0086\u0080ø>\tT@ëÙöô´K\u000b·\u0097aà\u0091øêùj5l\rÀYË$*û\u0010ç\u0085VN|ÿ»\u0085,k\u0093å]9Ué@(â\u0006·\u0097Ëqµ\nl5\u0015pï<¼Ü\u0000ñóOäRÏ1$ØN\rÙG\u0011\u0088g#>nª\\ud»\u0000Èb\u00908\u0081\u0094Ô\u0082ûNo\u0007>]\u0004EäV\u0082?O(r\u0089â\u0016X<`lq\u0082\u0085x\u008cà°\u0011,ÿkIQÐþù n³\u008c£55p\t\u001bOËÝ=Ý\u000f\u0010m%r\u0019uu4¤Zg\u0095\u0006\u0006\u0088×\u009a µ\u001e\u0086}[»¯½\u000bãx°·ÚØ\"L¥/]X@×õc\u009bWÒ\u009b\u0085¾a(ð'»P\u0019îûêqÛH7\u0094ey\u0019Ð &\u0001pjî'\u001f\u009b\u009cÆ\u0001Ìü\u009a\u0006\u0080ÁÓéÈQ\u0092\u0010\u001b$¨{¦\u0095øõ\u001d+Û\u0007-,Ûh\u0010ópÝüýì×\u0015\u009b§ \u000b \u0006\u009f\u0098 ÖÛ\u0096!\u0011z;Pq}\u001d!¹ôì{\ny#±\u001fê~\u0092ºBèm\u009f\u0007\u0083T\u0018Ø·\u000e\u001cTåþAwY*kþG;iáK±Ö5$Ê\u0014\u0018n\u008cÎJ\t!I=YUÎ^aM´Oñ¬}\u009c\u009f©mÆ\u0010d\u0086~Ô¶\u000fk\u0005@\u0095K\fÆWÂ\u009e(óf=o1Å»w\u009f×RÚ9§ô\u0016³\u009f%´\u0093èL\u009e{ûqÛ(¥\\µ\u0092#5JR\u009fÞZ\u0010b\u009d\u00ad\u0006)}\u0094\u001b^\u009bý\u0085WÜò6@çÎ\n,F°·è\u001d\u009e¶_äÒ\u009e\u0082\u001aæ\u000bvÙ\u0002|\u0011ª\u0099ä\r\u00066ÑÖõÙ^çóùÝ\u007fMoW\u0080¥S¾ø\b\u001b_v\u000bªÐ7Èñ\u0013Ó\u0003\u0086ï¦\u0010 \u009b\u0004\u0091\bS_Ê2\"\u008b×cx`\u0011\u0010'2Cm\u009f\u0000\u0095kUµa¿1ÏìT\u0010\u00adËêPÈ\u009dþÞÐ\u008aÑ#ÁÖ\u0091ä\u0010.\u001a¥ÞDL\u0013\u001foãÔ\u009e8 ÓÔ\u0010¬=]§N]Ø\u0001\u0003\t<\u0083ð\u008fp#"
         .length();
      char var16 = 24;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var38 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var38;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[25];
                     short var27 = 5197;
                     long var33 = 4305338764328221025L ^ var11;
                     eig = "https://bwstats.shivam.pro/user/";
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "\u0088þLZÍwa\b\f\u0003ìo¯Y'\u0093\u008f\u0097hn()[\u0015p¢<3ú\u0091\u0014W";
                     int var5 = "\u0088þLZÍwa\b\f\u0003ìo¯Y'\u0093\u008f\u0097hn()[\u0015p¢<3ú\u0091\u0014W".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var29 = var6;
                        var10001 = var3++;
                        long var42 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var8 = var42;
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
                           long var47 = (var10[0] & 255L) << 56
                              | (var10[1] & 255L) << 48
                              | (var10[2] & 255L) << 40
                              | (var10[3] & 255L) << 32
                              | (var10[4] & 255L) << 24
                              | (var10[5] & 255L) << 16
                              | (var10[6] & 255L) << 8
                              | var10[7] & 255L;
                           switch (var45) {
                              case 0:
                                 var29[var10001] = var47;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[6];
                                    bbb = new ConcurrentHashMap<>();
                                    return;
                                 }
                                 break;
                              default:
                                 var29[var10001] = var47;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "4ê\u0091}!\u0081¸\u0000\u0012\u0013\u0006\f\u0093J¿\u009c";
                                 var5 = "4ê\u0091}!\u0081¸\u0000\u0012\u0013\u0006\f\u0093J¿\u009c".length();
                                 var2 = 0;
                           }

                           byte var36 = var2;
                           var2 += 8;
                           var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                           var29 = var6;
                           var10001 = var3++;
                           var42 = (var7[0] & 255L) << 56
                              | (var7[1] & 255L) << 48
                              | (var7[2] & 255L) << 40
                              | (var7[3] & 255L) << 32
                              | (var7[4] & 255L) << 24
                              | (var7[5] & 255L) << 16
                              | (var7[6] & 255L) << 8
                              | var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var38;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "µëøH\u0000ÓÖ >\u0011\u000eÐ\u008a Y\u0083\u0010»çë\u0084VpÍÍ\u009a\u008e\u009e5~nºV";
                  var19 = "µëøH\u0000ÓÖ >\u0011\u000eÐ\u008a Y\u0083\u0010»çë\u0084VpÍÍ\u009a\u008e\u009e5~nºV".length();
                  var16 = 16;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14425;
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
            throw new RuntimeException("cc/astralis/hbc", var10);
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
         throw new RuntimeException("cc/astralis/hbc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2023;
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
            throw new RuntimeException("cc/astralis/hbc", var14);
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
         throw new RuntimeException("cc/astralis/hbc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
