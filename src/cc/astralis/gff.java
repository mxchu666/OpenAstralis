package cc.astralis;

import java.io.File;
import java.io.PrintStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_310;

public class gff extends fso {
   private static final long a = 114465874048425L;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public gff() {
      long a = gff.a ^ 38744700719775L;
      String[] var10001 = new String[2];
      short var10004 = 4316;
      long var10005 = 7237026483239792523L ^ a;
      var10001[0] = "config";
      var10001[1] = "c";
      short var10002 = 13480;
      long var10003 = 5178008016899247097L ^ a;
      super(var10001, "Manages configurations: .config <save|relod|load|delete> <name>");
   }

   @Override
   public void aov(String[] args, String message) {
      long ax = gff.a ^ 110944152391548L;
      int[] var10000 = dar.abu();
      String[] axx = a.split(" ");
      int[] axxx = var10000;
      String[] var15 = axx;
      if (axxx != null) {
         if (axx.length < 2) {
            byte var30 = 87;
            long var45 = 6629974957502866150L ^ ax;
            bpa.dhu("Usage: #config <save|load|delete|reload|folder|list> <name>");
            return;
         }

         var15 = axx;
      }

      String axxxx;
      String axxxxx = var15[1].toLowerCase();
      axxxx = axx.length > 2 ? a.substring(a.indexOf(axxxxx) + axxxxx.length()).trim() : null;
      dar.gqy().dy().adk();
      byte var10 = -1;
      var16 = axxxxx.hashCode();
      label212:
      if (axxx != null) {
         switch (var16) {
            case -1268966290:
               short var10001 = 6203;
               long var10002 = 5218928349400316548L ^ ax;
               var16 = axxxxx.equals("folder");
               if (axxx == null) {
                  break label212;
               }

               if (var16 == 0) {
                  break;
               }

               var10 = 0;
               if (axxx != null) {
                  break;
               }
            case 3322014:
               short var31 = 3387;
               long var46 = 4972604608414953366L ^ ax;
               var16 = axxxxx.equals("list");
               if (axxx == null) {
                  break label212;
               }

               if (var16 == 0) {
                  break;
               }

               var10 = 1;
               if (axxx != null) {
                  break;
               }
            case 3522941:
               short var32 = 26838;
               long var47 = 3028612015508998766L ^ ax;
               var16 = axxxxx.equals("save");
               if (axxx == null) {
                  break label212;
               }

               if (var16 == 0) {
                  break;
               }

               var10 = 2;
               if (axxx != null) {
                  break;
               }
            case 3327206:
               short var33 = 27384;
               long var48 = 6653493794660304965L ^ ax;
               var16 = axxxxx.equals("load");
               if (axxx == null) {
                  break label212;
               }

               if (var16 == 0) {
                  break;
               }

               var10 = 3;
               if (axxx != null) {
                  break;
               }
            case -1335458389:
               short var34 = 2832;
               long var49 = 7485278084647430591L ^ ax;
               var16 = axxxxx.equals("delete");
               if (axxx == null) {
                  break label212;
               }

               if (var16 != 0) {
                  var10 = 4;
               }
         }

         var16 = var10;
      }

      label183: {
         label238: {
            label228: {
               label178: {
                  switch (var16) {
                     case 0:
                        if (bam.eta() == fxm.WIN) {
                           File var50 = class_310.method_1551().field_1697;
                           short var10003 = 16886;
                           long var10004 = 6371118911065842502L ^ ax;
                           String var57 = "Astralis".toLowerCase();
                           short var10005 = 18317;
                           long var10006 = 2956026333063111988L ^ ax;
                           File axxxxxx = new File(var50, "/" + var57 + "/Configs");

                           try {
                              Runtime var18 = Runtime.getRuntime();
                              String var36 = axxxxxx.getAbsolutePath();
                              short var52 = 19410;
                              long var56 = 2616925448406133089L ^ ax;
                              var18.exec("explorer.exe  /select," + var36);
                           } catch (Exception var13) {
                              PrintStream var17 = System.out;
                              String var35 = String.valueOf(var13);
                              short var51 = 8156;
                              long var55 = 6391698234486537586L ^ ax;
                              var17.println("Error - " + var35);
                           }

                           if (axxx != null) {
                              return;
                           }
                        }

                        short var19 = 27322;
                        long var37 = 2796145351794903052L ^ ax;
                        bpa.dhu("This command is only available for windows users.");
                        if (axxx != null) {
                           return;
                        }
                     case 1:
                        short var20 = 8155;
                        long var38 = 5827808602945305953L ^ ax;
                        bpa.dhu("available configs: ");
                        Iterator var14 = dar.gqy().dy().ddp.keySet().iterator();

                        while (true) {
                           if (var14.hasNext()) {
                              String axxxxxx = (String)var14.next();
                              bpa.dhu(axxxxxx);
                              if (axxx == null) {
                                 return;
                              }

                              if (axxx != null) {
                                 continue;
                              }
                           }

                           if (axxx != null) {
                              return;
                           }
                           break;
                        }
                     case 2:
                        var21 = axxxx;
                        if (axxx == null) {
                           break label183;
                        }

                        if (axxxx == null) {
                           break label178;
                        }

                        String var22 = axxxx;
                        if (axxx != null) {
                           if (axxxx.isEmpty()) {
                              break label178;
                           }

                           dar.gqy().dy().flb(axxxx);
                           short var39 = 676;
                           long var53 = 5302275016287821832L ^ ax;
                           var22 = "Saved config: " + axxxx;
                        }

                        bpa.dhu(var22);
                        if (axxx != null) {
                           return;
                        }
                     case 3:
                        var23 = axxxx;
                        if (axxx == null) {
                           break label238;
                        }

                        if (axxxx == null || axxxx.isEmpty()) {
                           short var28 = 23858;
                           long var43 = 2514845573192056711L ^ ax;
                           var23 = "Usage: #config load <name>";
                           break label238;
                        }

                        dar.gqy().dy().esg(axxxx);
                        if (axxx != null) {
                           return;
                        }
                     case 4:
                        var24 = axxxx;
                        if (axxx == null) {
                           break label228;
                        }

                        if (axxxx == null) {
                           break;
                        }

                        String var25 = axxxx;
                        if (axxx != null) {
                           if (axxxx.isEmpty()) {
                              break;
                           }

                           dar.gqy().dy().bgb(axxxx);
                           short var40 = 31643;
                           long var54 = 6500870510009866540L ^ ax;
                           var25 = "Deleted config: " + axxxx;
                        }

                        bpa.dhu(var25);
                        if (axxx != null) {
                           return;
                        }
                     default:
                        short var26 = 8839;
                        long var41 = 4460061637204639804L ^ ax;
                        bpa.dhu("Invalid action. Use save, load, delete, folder, or list");
                        return;
                  }

                  short var27 = 4497;
                  long var42 = 4172305524207629103L ^ ax;
                  var24 = "Usage: #config delete <name>";
                  break label228;
               }

               short var29 = 10775;
               long var44 = 2254543061898594475L ^ ax;
               var21 = "Usage: #config save <name>";
               break label183;
            }

            bpa.dhu(var24);
            return;
         }

         bpa.dhu(var23);
         return;
      }

      bpa.dhu(var21);
   }

   static {
      long var0 = a ^ 35677835800774L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[20];
      int var7 = 0;
      String var6 = "@Ý\u0013\f'¼\u008b\u0092Ê³ä\u000e?8æ\u001c\u0092\u008aÒÌ^S$\u0093â\u0098u\rï¦DqÙª@+\u001bÅì=Åøô\f\u008a¿\u008b\u001cê\\øVï\u0016\u009cÐ\u0010\u001f?P\u0011\u001a6\u000ec*-2+rÝÅ\u00808\u0094¨ÄæW.ø^;UW&=Ø\u0099|·\u001ag¦\u0080æ øj»\u00057\u00169°ÿÔ¼è\u0083rH\u001f\u0005\u0081ï_ªbüQ\u0080\u0003Ä<!Æp/w\u0010Ö\u0086\u0019¼D\u008dè\u009eq_0\u0081ó§i\u0019\u0018\u0085\u0017FÌ\u0001äÃ\u0094Ý\u001f¥\u0014¡íNI·iéã\u0018\u0013kB m\u0094}ù\u009bájZ\u0000\rÃOÛ¬Rc\u000bÛHb\u00adOjí\u00959\u0093\u001có§v³(RÄ\u00154HÇ\u000e/g\u0012ÿ8;\u00ad\u009eí_Þðt eª·\u000bR ïñ\u0014ÝÈÇ\u0007'¡b\u0017\u009f8X\u008c·ëÀB\u0007òôÊGa hò7GyÐ¦mo\u0013@GÐ\u0013Áe\f«|©%ý\u001e\u009eçq~üÙ0ç\u00020\u0000k\u0016\u0097®¿Ùm¢µ\b|\u0012I(\u0013»\u009a!iQ\u007f´J\u000fàVátºñ\u0096|\u009füÆDÀþ(\u0087×ß\u0010\tão&LaÙhê9Ï\u0003bI¼x0\u008aÒà2ìßÝ\r;5\u009fà6N»Ø¸*\u000e½Þ\u008e3\u0089.\u009cê\u0085Ãý\u0093f\u009c\u0082G¾\u0000\u0092QîY\u0087Ê\u0004ìm\u0007õX\u000faP2fä@è\u0004¢þ\u0019Ój\"`\u0090ó\u0004\r¬Ï\u008a\u0086\u0094«Àz&ÜK\u001d\u00020-ÈdÍFÇà\u0016On\u0003\u0006jó\u0003N\u008bN\u009cÇÝ\u009e¦T2PUêd*®ðJ_¾IHnz¥HG\u0086\u0015.\u001b3û ç\u0095Þ~\u007f0°z\u009a\u0005x\u0000r\u008ccyÅôö\u00107\u0010wv\t²æ#\u0099\u001f\u0087\u009f\u0005O\u009bÞ:Ò³x|\u009aîÓ\u0089\u0080\u000et´2V\u000blë TÖq's\u00ad§\u008bMuõ¨W\u0006¦\u008f\u0019\u0006¿\u0087ºíNûm\u001c$¼\u0000x\u001dChyZ\u0015St\u007f\u0012¬\u0082ßEån$!±\u0011\u0002m%\bB\u00103\u00806:òU\nÙ\u008cAbÞ6 F\u009b´ÿ\u009b¼\u0016ËZÝhM®D\u001b\u0013\u008ceâóÌôU$<\u008fUÊ\u009dauE/sP÷^\u0018\u009dzÝ¬PFø_\u0082øûÜ#´ÿenâ ß|Öa/7\u008d0ó\u0081hÍÅe»ÙKm¹Ñ\u0091¿6èC\u0019\u0015z\u008dhÜ\u009eÈÏî«@\u001aeÖ7\u001f\u008cÅ&¦x\u009eÝ\u001aßý¸\u001aÿ6(V\u008fYF«:]â@\u0090!ÝMÔÄÕñ\u0004\u008cØD¢ LR\u009dõd5\u0016\n\u0015¡04õÍ_\u0080¼~9 Xvõ\u007fY\u001c1Öã+*vïFÉ(\u009e\u008c\u0004W\u008c^ña\u0091\u008b¼á\u001a\u0084¬ª^ïC\u001b\u0013fë>l÷ÇdvßoJ¤Ìá\u0010\u0011@]\u0096 ~wÝ&`\u0013\u0007þ¤ü\u001eõæ\u0013\u00053X`·\u0097\u0096Ã[±cêÁ³;¼\u0092a\u0010¦J3ÁãOhó<[Ã\u0013¬rÜÏ";
      int var8 = "@Ý\u0013\f'¼\u008b\u0092Ê³ä\u000e?8æ\u001c\u0092\u008aÒÌ^S$\u0093â\u0098u\rï¦DqÙª@+\u001bÅì=Åøô\f\u008a¿\u008b\u001cê\\øVï\u0016\u009cÐ\u0010\u001f?P\u0011\u001a6\u000ec*-2+rÝÅ\u00808\u0094¨ÄæW.ø^;UW&=Ø\u0099|·\u001ag¦\u0080æ øj»\u00057\u00169°ÿÔ¼è\u0083rH\u001f\u0005\u0081ï_ªbüQ\u0080\u0003Ä<!Æp/w\u0010Ö\u0086\u0019¼D\u008dè\u009eq_0\u0081ó§i\u0019\u0018\u0085\u0017FÌ\u0001äÃ\u0094Ý\u001f¥\u0014¡íNI·iéã\u0018\u0013kB m\u0094}ù\u009bájZ\u0000\rÃOÛ¬Rc\u000bÛHb\u00adOjí\u00959\u0093\u001có§v³(RÄ\u00154HÇ\u000e/g\u0012ÿ8;\u00ad\u009eí_Þðt eª·\u000bR ïñ\u0014ÝÈÇ\u0007'¡b\u0017\u009f8X\u008c·ëÀB\u0007òôÊGa hò7GyÐ¦mo\u0013@GÐ\u0013Áe\f«|©%ý\u001e\u009eçq~üÙ0ç\u00020\u0000k\u0016\u0097®¿Ùm¢µ\b|\u0012I(\u0013»\u009a!iQ\u007f´J\u000fàVátºñ\u0096|\u009füÆDÀþ(\u0087×ß\u0010\tão&LaÙhê9Ï\u0003bI¼x0\u008aÒà2ìßÝ\r;5\u009fà6N»Ø¸*\u000e½Þ\u008e3\u0089.\u009cê\u0085Ãý\u0093f\u009c\u0082G¾\u0000\u0092QîY\u0087Ê\u0004ìm\u0007õX\u000faP2fä@è\u0004¢þ\u0019Ój\"`\u0090ó\u0004\r¬Ï\u008a\u0086\u0094«Àz&ÜK\u001d\u00020-ÈdÍFÇà\u0016On\u0003\u0006jó\u0003N\u008bN\u009cÇÝ\u009e¦T2PUêd*®ðJ_¾IHnz¥HG\u0086\u0015.\u001b3û ç\u0095Þ~\u007f0°z\u009a\u0005x\u0000r\u008ccyÅôö\u00107\u0010wv\t²æ#\u0099\u001f\u0087\u009f\u0005O\u009bÞ:Ò³x|\u009aîÓ\u0089\u0080\u000et´2V\u000blë TÖq's\u00ad§\u008bMuõ¨W\u0006¦\u008f\u0019\u0006¿\u0087ºíNûm\u001c$¼\u0000x\u001dChyZ\u0015St\u007f\u0012¬\u0082ßEån$!±\u0011\u0002m%\bB\u00103\u00806:òU\nÙ\u008cAbÞ6 F\u009b´ÿ\u009b¼\u0016ËZÝhM®D\u001b\u0013\u008ceâóÌôU$<\u008fUÊ\u009dauE/sP÷^\u0018\u009dzÝ¬PFø_\u0082øûÜ#´ÿenâ ß|Öa/7\u008d0ó\u0081hÍÅe»ÙKm¹Ñ\u0091¿6èC\u0019\u0015z\u008dhÜ\u009eÈÏî«@\u001aeÖ7\u001f\u008cÅ&¦x\u009eÝ\u001aßý¸\u001aÿ6(V\u008fYF«:]â@\u0090!ÝMÔÄÕñ\u0004\u008cØD¢ LR\u009dõd5\u0016\n\u0015¡04õÍ_\u0080¼~9 Xvõ\u007fY\u001c1Öã+*vïFÉ(\u009e\u008c\u0004W\u008c^ña\u0091\u008b¼á\u001a\u0084¬ª^ïC\u001b\u0013fë>l÷ÇdvßoJ¤Ìá\u0010\u0011@]\u0096 ~wÝ&`\u0013\u0007þ¤ü\u001eõæ\u0013\u00053X`·\u0097\u0096Ã[±cêÁ³;¼\u0092a\u0010¦J3ÁãOhó<[Ã\u0013¬rÜÏ"
         .length();
      char var5 = '8';
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
                     d = new String[20];
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

                  var6 = "ï(\u0015L»Z\u008d3\u000fñ\u0091ãUßk£Ö\u0081Gi\u001fový\u0010\u001cHð\u0092ï\u008ekÚ\"|\u009a\u0013Áê#Ä";
                  var8 = "ï(\u0015L»Z\u008d3\u000fñ\u0091ãUßk£Ö\u0081Gi\u001fový\u0010\u001cHð\u0092ï\u008ekÚ\"|\u009a\u0013Áê#Ä".length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22633;
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
            throw new RuntimeException("cc/astralis/gff", var10);
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
         throw new RuntimeException("cc/astralis/gff" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
