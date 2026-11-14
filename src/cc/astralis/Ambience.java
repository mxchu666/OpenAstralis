package cc.astralis;

import java.awt.Color;
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
import net.minecraft.class_2761;
import net.minecraft.class_638;

public class Ambience extends guu {
   private final gbp guf;
   private final bes dij;
   public final gbp eth;
   public final gbp eyj;
   public final gbp dsk;
   public final acn beo;
   public final acn els;
   public final acn axb;
   public final acn fct;
   public final bes elv;
   public final bes gum;
   public final bes cmv;
   public final bes gri;
   public final bes ddd;
   public final bes cic;
   public final gbp chd;
   public final bes fcg;
   private long ce;
   private static final long a = 32449271379789L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public Ambience() {
      long a = Ambience.a ^ 55227491240949L;
      super(bfm.VISUAL);
      short var10003 = 13467;
      long var10004 = 2765046709502648470L ^ a;
      a.guf = new gbp("Time Changer", true);
      var10003 = 22465;
      var10004 = 6441670863606727631L ^ a;
      a.dij = new bes("Time", 21000.0F, 0.0F, 23000.0F, 1.0F);
      var10003 = 6434;
      var10004 = 3829968054762409256L ^ a;
      a.eth = new gbp("Fog Modifier", true);
      var10003 = 6594;
      var10004 = 4809672536104799687L ^ a;
      a.eyj = new gbp("Sky Modifier", true);
      var10003 = 14169;
      var10004 = 893117831813735256L ^ a;
      a.dsk = new gbp("Custom Gradient", true);
      var10003 = 23539;
      var10004 = 8160343596350197745L ^ a;
      short var10008 = 27839;
      long var10009 = 1146394140392989515L ^ a;
      a.beo = (acn)new acn("Gradient Top", new Color(0, 0, 255)).bih(a.dsk::dnp);
      var10003 = 19873;
      var10004 = 2527785179439552930L ^ a;
      var10008 = 27424;
      var10009 = 6159611198596359381L ^ a;
      a.els = (acn)new acn("Gradient Bottom", new Color(0, 0, 128)).bih(a.dsk::dnp);
      var10003 = 15563;
      var10004 = 8708838756967688387L ^ a;
      a.axb = (acn)new acn("Sky Color", Color.cyan).bih(a.eyj::dnp);
      var10003 = 29722;
      var10004 = 4925710792211292182L ^ a;
      a.fct = (acn)new acn("Fog Color", Color.cyan).bih(a.eth::dnp);
      var10003 = 21531;
      var10004 = 4394670592498319365L ^ a;
      a.elv = (bes)new bes("Fog Start", 0.0F, 0.0F, 256.0F, 1.0F).bih(a.eth::dnp);
      var10003 = 15518;
      var10004 = 8047764252060264597L ^ a;
      a.gum = (bes)new bes("Fog End", 64.0F, 10.0F, 256.0F, 1.0F).bih(a.eth::dnp);
      var10003 = 16072;
      var10004 = 8249318234562669262L ^ a;
      a.cmv = (bes)new bes("Environmental Start", 0.0F, 0.0F, 256.0F, 1.0F).bih(a.eth::dnp);
      var10003 = 22885;
      var10004 = 1091304126416768353L ^ a;
      a.gri = (bes)new bes("Environmental End", 64.0F, 10.0F, 256.0F, 1.0F).bih(a.eth::dnp);
      var10003 = 2224;
      var10004 = 2467485482539457712L ^ a;
      a.ddd = (bes)new bes("Top Alpha", 1.0F, 0.0F, 1.0F, 0.01F).bih(a.dsk::dnp);
      var10003 = 21818;
      var10004 = 5617551332712333629L ^ a;
      a.cic = (bes)new bes("Bottom Alpha", 1.0F, 0.0F, 1.0F, 0.01F).bih(a.dsk::dnp);
      var10003 = 4017;
      var10004 = 5159754715532565438L ^ a;
      a.chd = new gbp("Custom Blur", false);
      var10003 = 32204;
      var10004 = 3891461813362223557L ^ a;
      a.fcg = (bes)new bes("Blur Strength", 5.0F, 0.0F, 20.0F, 1.0F).bih(a.chd::dnp);
      short var10001 = 10818;
      long var10002 = 6469465487533958579L ^ a;
      ffn[] var3 = new ffn[]{a.guf, a.dij, a.eth, a.fct, a.elv, a.cmv, null, null, null, null, null, null, null, null, null, null, null};
      var10003 = 21293;
      var10004 = 7721654968886762711L ^ a;
      var3[6] = a.gri;
      var10003 = 7344;
      var10004 = 5403493380685517639L ^ a;
      var3[7] = a.gum;
      var10003 = 8251;
      var10004 = 4629688388051857344L ^ a;
      var3[8] = a.eyj;
      var10003 = 10295;
      var10004 = 3952577142263834561L ^ a;
      var3[9] = a.axb;
      var10003 = 32537;
      var10004 = 4603509233258836203L ^ a;
      var3[10] = a.dsk;
      var10003 = 4025;
      var10004 = 9161484964981719113L ^ a;
      var3[11] = a.beo;
      var10003 = 7975;
      var10004 = 3546635446695350494L ^ a;
      var3[12] = a.els;
      var10003 = 14104;
      var10004 = 8415877388112328933L ^ a;
      var3[13] = a.ddd;
      var10003 = 3523;
      var10004 = 4991271747465953840L ^ a;
      var3[14] = a.cic;
      var10003 = 3536;
      var10004 = 8474721840981000744L ^ a;
      var3[15] = a.chd;
      var10003 = 8188;
      var10004 = 4588258484141346816L ^ a;
      var3[16] = a.fcg;
      a.bfi(var3);
   }

   @Override
   public void auj() {
      long a = Ambience.a ^ 25207573247626L;
      int[] var3 = dar.abu();
      if (var3 != null) {
         if (chi.field_1687 != null) {
            a.ce = chi.field_1687.method_8510();
         }

         super.auj();
      }
   }

   @Override
   public void frg() {
      long a = Ambience.a ^ 33491728228825L;
      int[] var3 = dar.abu();
      if (var3 != null) {
         if (chi.field_1687 != null) {
            chi.field_1687.method_28104().method_165(a.ce);
         }

         super.frg();
      }
   }

   @gdz
   public void bgx(amo event) {
      long ax = Ambience.a ^ 82745216906421L;
      int[] var4 = dar.abu();
      amo var10000 = a;
      if (var4 != null) {
         if (a.cud() != gpy.RECEIVE) {
            return;
         }

         var10000 = a;
      }

      if (var4 != null) {
         if (!(var10000.bed() instanceof class_2761)) {
            return;
         }

         a.ce = ((class_2761)a.bed()).comp_3220();
         var10000 = a;
      }

      var10000.gmm(true);
      chi.field_1687.method_28104().method_165(a.dij.dnp().longValue());
   }

   @gdz
   public void ezs(fnt e) {
      long ax = Ambience.a ^ 7926361623453L;
      int[] var4 = dar.abu();
      if (a.guf.dnp()) {
         class_638 var10000 = chi.field_1687;
         if (var4 != null) {
            if (chi.field_1687 == null) {
               return;
            }

            var10000 = chi.field_1687;
         }

         var10000.method_28104().method_165(a.dij.dnp().longValue());
      }
   }

   static {
      long var11 = a ^ 118593389692327L;
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
      String var17 = "_$ÌI5<Ù¬\u0002\u0088D\u0094àqê} íÎ¢=D\u0084\u0099 WÉ\u0086ô¡É9¢Ðuk¬óK\u0092\rY{L÷\u0004\u009b\u0081\u0080 ´\u001fõ\u0091¢Yn¨Ò´\u0013È\u0082\"\r+\u0005/Ð*`²\u0007\u009dcÀÈÎkS5Y àr\u0001¹©í`vÕ»ÎÐÈNWà-Í6i×À\"OÄþ\t\u0016 OÑ\u0081 C9_\u007f9RªVpbÉ\u000fá8¯±súA\u0006\u0097\u0092gv\u0003óÕ\u0007ìZ*L\u00108üusÖ\u009d~ºVD\u0094ú6ÀÈ  ô\n\u000b¸a\u00ad¡mu\u0092ßùó\u0085±Å8p©Í\u0007\u008aCoJ¾7\u00adæ\frØ ï\u001aCË\"\u008cf¡YùHs0Dþ+w<p¤Á|I *ÿæNEòTX(.°{úi\u008a\u0087\u001e\u0093Ùu\u001c¶3\u0086O\";\u001cØgá+4,WÄÉ\u0083\u0082%\u0092\u0088\u0006<DÏ²\b\u0013\u00185ÚÉ\u0004\u0094»2Ã>¡[\u00ad c_\u0089H\u0085Ü\u0089Ù\u001aëe(F.rÙè.Å<¸µÒgWWê²q\u001f9Å+;t¬Ý\u009f\u0099\u0097x\u0080V6f9+Ãüíé \u0018T\u001fË\u0088y,!P5\u0017í\u0080¿\\¼\u0007}bàáC¬¨- Â÷\u001dì\u008dâ¤¡\u0018\u0015_÷M\u0003%;GQå\u0002ù3OÛTqÃcÁ{bQ\u0018\u0005Qw\u000bè}|nÑ1t½\u0016l\u0092\u0091·R \u0099ÆNN_\u0018\nJµh\u008c@¡\u008dÐaB±6×\u0095Seï\u007fB_¡ê\u0098";
      int var19 = "_$ÌI5<Ù¬\u0002\u0088D\u0094àqê} íÎ¢=D\u0084\u0099 WÉ\u0086ô¡É9¢Ðuk¬óK\u0092\rY{L÷\u0004\u009b\u0081\u0080 ´\u001fõ\u0091¢Yn¨Ò´\u0013È\u0082\"\r+\u0005/Ð*`²\u0007\u009dcÀÈÎkS5Y àr\u0001¹©í`vÕ»ÎÐÈNWà-Í6i×À\"OÄþ\t\u0016 OÑ\u0081 C9_\u007f9RªVpbÉ\u000fá8¯±súA\u0006\u0097\u0092gv\u0003óÕ\u0007ìZ*L\u00108üusÖ\u009d~ºVD\u0094ú6ÀÈ  ô\n\u000b¸a\u00ad¡mu\u0092ßùó\u0085±Å8p©Í\u0007\u008aCoJ¾7\u00adæ\frØ ï\u001aCË\"\u008cf¡YùHs0Dþ+w<p¤Á|I *ÿæNEòTX(.°{úi\u008a\u0087\u001e\u0093Ùu\u001c¶3\u0086O\";\u001cØgá+4,WÄÉ\u0083\u0082%\u0092\u0088\u0006<DÏ²\b\u0013\u00185ÚÉ\u0004\u0094»2Ã>¡[\u00ad c_\u0089H\u0085Ü\u0089Ù\u001aëe(F.rÙè.Å<¸µÒgWWê²q\u001f9Å+;t¬Ý\u009f\u0099\u0097x\u0080V6f9+Ãüíé \u0018T\u001fË\u0088y,!P5\u0017í\u0080¿\\¼\u0007}bàáC¬¨- Â÷\u001dì\u008dâ¤¡\u0018\u0015_÷M\u0003%;GQå\u0002ù3OÛTqÃcÁ{bQ\u0018\u0005Qw\u000bè}|nÑ1t½\u0016l\u0092\u0091·R \u0099ÆNN_\u0018\nJµh\u008c@¡\u008dÐaB±6×\u0095Seï\u007fB_¡ê\u0098"
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = d(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     g = var20;
                     h = new String[17];
                     r = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[14];
                     int var3 = 0;
                     String var4 = "\u001d.&¦L¼tõ¯r¶qúaM\u009c°\u0006ª³ñîµ÷Ô¬\u0003\u008f\u009dªF\u000eÛØ¨YS\u008c1#Û\u0082ÎS\u001e\u0094C\u0019\u0099\u0011ë\u001cØ\\ÉºT¡\u00145#Z¤ïÇðgîþóò&\u0006X%\u00989ÌÒ\u0000âþ¸\u0006îÀaJ:\u000eG¤ð¶*¿";
                     int var5 = "\u001d.&¦L¼tõ¯r¶qúaM\u009c°\u0006ª³ñîµ÷Ô¬\u0003\u008f\u009dªF\u000eÛØ¨YS\u008c1#Û\u0082ÎS\u001e\u0094C\u0019\u0099\u0011ë\u001cØ\\ÉºT¡\u00145#Z¤ïÇðgîþóò&\u0006X%\u00989ÌÒ\u0000âþ¸\u0006îÀaJ:\u000eG¤ð¶*¿"
                        .length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
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
                           long var45 = (var10[0] & 255L) << 56
                              | (var10[1] & 255L) << 48
                              | (var10[2] & 255L) << 40
                              | (var10[3] & 255L) << 32
                              | (var10[4] & 255L) << 24
                              | (var10[5] & 255L) << 16
                              | (var10[6] & 255L) << 8
                              | var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    p = var6;
                                    q = new Integer[14];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "ìtï¬õß\u008c~(.è\u0002\u00adï\u0086V";
                                 var5 = "ìtï¬õß\u008c~(.è\u0002\u00adï\u0086V".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = (var7[0] & 255L) << 56
                              | (var7[1] & 255L) << 48
                              | (var7[2] & 255L) << 40
                              | (var7[3] & 255L) << 32
                              | (var7[4] & 255L) << 24
                              | (var7[5] & 255L) << 16
                              | (var7[6] & 255L) << 8
                              | var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "ÿ¶Ä\f\u0000\u0000h¥H*\u000e0ñVº\u008eüµ\u0001\u0090\u0004ñf(&÷ªñôò¦\u0001\u0018\u001a'¨> \u0014À°\u0097ÚÛ7'2æðúz\u0080\u001b·úÒ\u0000";
                  var19 = "ÿ¶Ä\f\u0000\u0000h¥H*\u000e0ñVº\u008eüµ\u0001\u0090\u0004ñf(&÷ªñôò¦\u0001\u0018\u001a'¨> \u0014À°\u0097ÚÛ7'2æðúz\u0080\u001b·úÒ\u0000"
                     .length();
                  var16 = ' ';
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26806;
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
            throw new RuntimeException("cc/astralis/dk", var10);
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
         throw new RuntimeException("cc/astralis/dk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13129;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/dk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
   }

   private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/dk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
