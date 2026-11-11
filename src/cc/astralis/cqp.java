package cc.astralis;

import java.awt.Color;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cqp {
   private static final long a = 96545418076514L;
   private static final String b;

   public static String gdu() {
      long a = cqp.a ^ 51023890517648L;
      Color ax = dar.gqy().deo();
      float axx = ax.getRed() / 255.0F;
      float axxx = ax.getGreen() / 255.0F;
      float axxxx = ax.getBlue() / 255.0F;
      float axxxxx = 2.0F;
      return b.formatted(axx, axxx, axxxx, axxxxx);
   }

   static {
      long var0 = a ^ 109540472997876L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "õyW8ifR\u001c<J\u0011ò\u008f\u000e^©#\u0015¡+¡\u0091¢W+Ï\u0087Ì\u000ea'ÂS¬ïfÄ\u0082{\u0087Us\u0093PÆkT\u0002ÌÛ¿)*ñ5\u008a\u0094Æã\u0014[\u0086\u0006\u008d\u008fE}\u0080Á'õÊ\n9Z\nZ¨ý¶C\u0014a\u0091åß¦¥MQõüÄF}íp\u0091o\u0086¹uÛE;6ØÂÏ£>\u008es\u0097 ÂKÃ\u000eø\u0080\u0015f¶G\u0092s|5é\u001aáñ)ÊiÊØ©\u0097¬ç\u0011À\u0011\u009f_å>±\u0010ô´þaóV\u0089<)\u0017\u0085´ewÆ\u0088>3sZ°(d\u000bgÇõ¼ÁxDlbÎ8ôÍc\u008b\u0014ñí\u001f¬#(?T\u0001%I\u0094çt\u0001Z\\F|¶,Ýs?vhÝ=ä³ÔK,ç\r\u0099Æè\u001bñÃ÷\u00ad2¸t\u0099\u0010\u0080h)R,Ï\u0006?P#k®\t¸\u008bt\u009fc¶hr\u0013PR\u0000¨C\u0017éÍ£ñÑkÁò\u0098ô\u000f]ö]\f®èhýï2Öðç¯\u008b%õmÿgX\u0013\u0016á\u0002är\fóF^TTì2\u0003Jtx{ï#\\ú\u0083/4\u0014¯Ðå\u008c\rÅ»·\u001a!Ð¤\u001e\u0088ÒQ\u0096\u0095¡\u009a\"p>FÁñÓÙi\u0092|Ý\u0019*V.ÑS\u0007W_c\u0091ò'h\u009dëÉ\u0080ËÉXò¤Á\u0003\u0016@Î¤º¦_~ÎÔ\u001f§¾È\u0001\u000e9»ab\u008c\u0016!çüã\u009c»Â¬\u0099\u001c÷å«|Q-\u0081Ð\u0091e^K¢[a¡M\u000b\u0095^nV\u0084W\u0084\u001b\u0091-Ö_Û»²Öcê\r\u00adã\u0011\u008aÅSßZ³\u0000öÅÍ[àºYl\t-³Í¼\tí\u0094b¼â\u009aê\u001a|ÖÀR\f\u0087D\u0019Qk\u001déL¯è÷\u0003\u0012\u001a\u0004ü\u0085¥\u0095ãf[åèÁíJg\u001cÝ%³\u0087ì\u0081ýX÷¼9¾æ\u00862f&Ø¦\u000fýý\u001d\u0087ôÆ&\u0090$7Dx\u001b\u007fÐ\u008e?\u001bjÑ\u008fÎF\u001f\u0016\u0017X\u000eúb\u0011GäñÇö\u0011\u009aÐÂkÅÍK¸\u0005\t2\u0018\u0013w\u008dÐxgÏ°¦\u001aëÝP\u008d\u0014àÚ\u00920\u0081LT\u0080\u0014çR\u0014Éiö©n¢! \u001e!×,O\u0018û\u0089Ù²\"j#Î¹ñvæ2°²\u0082\u001e¹0¯«\u008c³\u0007¢\"\u0098÷·go\u001f5Ñl²d=65Õµ³ nER¯g\u008bo\\\u001764\u0089\u008a\n0\u000e\u009f\u000e¬½µBu\u009dwæM±B\u001b±\u0086NÌK $~SgÑ\u000e<\"ú7[\u009bGBh6,¬m\u0015\u0085¾\u0092\u007f\u0091ìùX\u001eäå¯8ëpÄw6\u0019Y\u00823\u000e\u0001F§\u0096i¦íG\u0082b¾N{\u008dîNo\u0018¹©Ôï(\n$¬\u0093²ñùÜÞ³%Ã\u0014ª%*\u0087kÏá¹\b\u0019ù\u0018Ø\u0019ÑÚÂ\"Ïê\u000e\u007f§åw¦mºo\u0003\u001fì\u0011v8\u0087}\u0087þ¯\u0098B\u0017}¿h\u0085pë\u008d\u0081\u001c@\u0089xVÉ2£þ\u0018í®ÔGÝÒ&>:{\u0085fztnh\u0013R\u0002\u0091º.v]ö¬é¾m ÜãaHpSdù\u008fd¤¾Ì\u0096ç\u008fò\u000b_Çæº\u0012\u0002GÒç\u009cÖ\u0018õ\u0094Û7zE\u0005\u0001f\të\u0091&\u000eiÒ|°7;V.?ÆG\u0098\u0087¾\u0084Zdk\u0011\u0084$\u0003\u0018NyW\u0091ág\u0014ðìÁ^¢ÂÑÝ'\u009bm8\u0017\u0000\u0000Y=J\\°\u0098°\n\u00060\u0015Å\t\u0005\u008a\u0016·\u0095Ð\\\u001fã\u0096RRË*R\u0016\u000b¤eî\u0014\u001cf\u0089#0\u0081\u0082\u0003\u0000\u000fÞ\u0012\u0087¾\u000b¾É¢!ã\u0096é\n\u0001\u0002ÝSº\u0093\u0086¨ÉÂ{æ\u0018\u001b)Zà=\u0019&ZãH\u0080\u0095:aí¸¢ò\u009b÷Làl\u0092\u008bC²<Ð;\u0016xí~\u0082q>E©\u008d\u0001Ï\r|\u0082_\u001f\u0015)ßÚçv\u0015Æ#^·û!l\u0005\u0081¸Ü\u0006&¦ôeDÀÛÒÀê\u007f4}geQOªÞ²*p?\u0092´\u008df$e\u0089±O¿\u00adö½m\u0011\u0016qE\u0096+\u0092î\\\u00adr½\u0091b´DãÆ\u009e×íh]RÞ¡yù.;(8$Hof}Ñû\u0087\u0001\u0098æ\u001a\u0000\"ül\u008dlæÝb(³¿\u0092Ä\u0005oV)â\u0013Ò\u008cà\u0005j³\u0097È'UÌ_[\\èÇ%\u001d\r\u009d×\u000bRÇ$\u0011oX\u0080ì\u0012±\u0089\u0017çm3\\Y[BüÃNs|\u0016+UN&&µô\u009c\u0090\u0083\u0002±åÄ,¯µ\u008f½^ÑRAOW_\u0006s»ùÎâ\u0083\u0089\u0080w0\u0005$\u0084}^Tì\u0091'd\u001f8_®\u0006B\t¾Í\u009f7Î\u0099ÊØ\u0001Êç\u0085\u0019\u000fèÐ@ý¼\u0000\u008bÔ§£{}¬å\u001e%Ò\u001f\u001eç\u009cÎé{q\u0007ü\u0089âaì¥+Y!\" ²w@d£Ç\u001fïqç&¿;Ô\u0086ÔM\u000bd\u001cõæ\\_rtû¶=Ô<K\u00011?=ôÆ\u000b\u0094ãk\u0005§Ëáó\u001d¤Nj\u0086\u00896®{\u0081\rFAÁ_øÈ½\u0082,\u008fP\u0082Oób÷=è\u0004¶µj\u0012ùù°¿>\u0096$N\u009bOà+K\u009c|é÷c\ftG'\u0084ý\u009b\u0004Ìr¿\u0015°è±·)\u0016Á@³Ê\u0096òË&\r¿ñ'\u009cØÑQ\"LuÉ\u007fçÐS§6\\ ãÃµ»a¢»k8\u0092õ\u0089\r\u0090,¹ä\u0085=Õ#z[\u0013'Qët·=-`Þ&@¼\u001dËz](C´\u0013#{á«×\u0095\u0015ä\u0097Ø\u0003 Õ¹z\bvÑýZ\u0016ü\u009aÄ\u00872«]\u0080,\u0000(kã\u0002\u0004fÞáL\u009e¡Ñ\u008dÜñão\u008a`?3è\u008d76\u001cö\u000b\u001a¤î2¢i¿0NË\u001a :QòÎ ô%í\u0090Z.H^ú\u008bQÂ\u0007v¦ð\u0084õ\u0093<îe\u0000uP\u0098S¢0\u0017rqÙ¸\u001e]´®Ç4\u009fE>Â>e5Ò-á.\u0010j1©q\u000fÂ\r\u0091=ãü/ÿ²\u0001î\u0098 \u001e<ÓÝ_Ñ\u0083\u001f`/ÙdIx\u0096·gl\u0098\u008cD¥ô=Z s^:þ@\u009f\u0091nÆ~K\u0091[\u0088\bÕ*C\u001c¶\u0003Md´A¹êr %\u0083\u001c\u008aÙ¡\u0082E9âÙû)\u0005G~1êRíW\u009aôÝÃõ'à\nLd#\u0080\u0089Ô\u0015\r:%9úbk×W\u001eØwÿ¹1\u0086ì,yï\u0082\\\u0019`Í\u009fû¡\u0099Ó\u001fb+(ÁËX¤\u00ad\u0087tïÏÅ\u009fr\u0006º\u000b·º\u0094Xr0@*~l9æÿ\u001eê\u0083g³\u0097ÏRì\u0097\u0094\n|#QBíð\u009eä!ÌºÐ¸c\r¹]TÒ½ªÞ(ÏãIÁ@ý\t\u009d,LÏ,ÿu\u0081Ý\u001a°TÄÅ\rª\u0003ÞÂ·ÝEú6ÞsYQ\u0007f/¾¾3¢n\u0083Ü\u0080ßGÓÂ\u008a\u008d\u0097\u0014~\\Ð?\u000eX¦Ú>³Ü\u001cð¶ë\u0094á\u000b\u0003ßsí\u0005d\u0093ñ\u001aä®®éiAO\u0099\u008d_|Ü\u0017ðª%¯fâ\u008fÓ?í+úÊ.ê\u0004\u0084ó8î\u008aX\u0087A\u0003\u0007èr\b£\u0003TËÑ×y=~3¡\u009aÍÓËRµ\u0011yiZG9«\u0011\u009cN%3ÖT×é\u007fâ¼3xÞ\u0081`\u001cnñO\t\u008dc~¤ò:oæD\u001fE)OÿØº \u001eJÛY\u009e\"ý\u009e\u008bÃ_Öý\u0012¸äh\u00192k4P§\fÙ¼¾²äTCÏ\u0016÷\u009dÆ÷ê°\u008a²ÒÖE\u007f}æÁ\u009b<Õð\u000eU\u00ad\u0083ÏÀ\u0017BÂÿXe\u0080}rð\u008fyÞ7BñÓû{y\u008d\u0090¼jý\u0087®^\u0091\u0086ûËR-¹õlÜ :´Äh\u0082û\u0010®oCÌÜ\fQªðT»\u001f\u0010 \u000fÂ¸\u009f¿+j)6ä\u001cu.\u000e_¿$µÞCO\u0080å\u000bE\u00178\bA\u0007\u0089\b\u001e\u009dK!mÇ«ÓCúl\u0089\u0089\u0000À¬d\u0096Ä\u00adìP}\u00adÙ\u0016â\u009a·º\u0093ÁóXáÿ4!ñ ÙÚÿËY²÷û0üxÙjòp5å¤.Æ13=½Ý"
            .getBytes("ISO-8859-1")
      );
      String var5 = a(var4).intern();
      byte var10001 = -1;
      b = var5;
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
}
