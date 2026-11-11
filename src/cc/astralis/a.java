package cc.astralis;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_638;

public class a extends guu {
   public final gbp bwv;
   public final gbp gfh;
   public final gbp esz;
   private final List<String> gfp;
   private final Pattern gro;
   private final Set<String> cke;
   private final HashMap<String, fwu> dmq;
   private final Map<UUID, alz> ezd;
   private static final long a = 129397321569703L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long p;

   public a() {
      long a = cc.astralis.a.a ^ 63128029353857L;
      super(bfm.CLIENT);
      short var10003 = 10159;
      long var10004 = 7641413934940890321L ^ a;
      a.bwv = new gbp("Send Chat message", false);
      var10003 = 18088;
      var10004 = 4095742163759285717L ^ a;
      a.gfh = new gbp("Send Notification", false);
      var10003 = 4501;
      var10004 = 3603990733480858338L ^ a;
      a.esz = new gbp("Alert if Suspicious Name", true);
      int[] var10000 = dar.abu();
      String[] var10002 = new String[4];
      short var10005 = 6975;
      long var10006 = 3051663235284113472L ^ a;
      var10002[0] = "Mikan_";
      var10005 = 4225;
      var10006 = 5888447920174863357L ^ a;
      var10002[1] = "tzi_";
      var10005 = 21138;
      var10006 = 7920773619021894121L ^ a;
      var10002[2] = "EKKOREE_";
      var10005 = 17797;
      var10006 = 3944886547694175996L ^ a;
      var10002[3] = "zzxgp_";
      a.gfp = Arrays.asList(var10002);
      short var7 = 25330;
      long var10 = 8003815479889224072L ^ a;
      a.gro = Pattern.compile("^([a-zA-Z]+_[a-zA-Z0-9]{5}_\\d{2}_\\d{2}$)|^[a-zA-Z0-9]{3}_[a-zA-Z0-9]{4}_[a-zA-Z0-9]{3}$|(^[a-zA-Z]{7}_[a-zA-Z]{7}\\d{2}$)");
      a.cke = new HashSet<>();
      int[] ax = var10000;
      a.dmq = new HashMap<>();
      a.ezd = new HashMap<>();
      a.bfi(new ffn[]{a.gfh, a.bwv, a.esz});

      for (fwu axx : List.of(new get(), new csy(), new cgk(), new cyn())) {
         a.dmq.put(axx.bmv(), axx);
         if (ax == null) {
            break;
         }
      }
   }

   @Override
   public void auj() {
      a.cke.clear();
      a.ezd.clear();
      super.auj();
   }

   @gdz
   public void cjn(eih event) {
      long ax = cc.astralis.a.a ^ 8715781592457L;
      int[] axx = dar.abu();
      class_638 var10000 = chi.field_1687;
      if (axx != null) {
         if (chi.field_1687 == null) {
            return;
         }

         var10000 = chi.field_1687;
      }

      for (class_1657 axxx : var10000.method_18456()) {
         class_1657 var14 = axxx;
         if (axx != null) {
            if (axxx == chi.field_1724) {
               continue;
            }

            var14 = axxx;
         }

         if (axx != null) {
            if (var14.method_29504()) {
               continue;
            }

            var14 = axxx;
         }

         String axxxx = var14.method_5477().getString();
         UUID axxxxx = axxx.method_5667();
         var10000 = a.esz.dnp();
         label123:
         if (axx != null) {
            label121:
            if (var10000) {
               var16 = a.gfp.stream().anyMatch(axxxxxx -> a.toLowerCase().startsWith(axxxxxx.toLowerCase()));
               label118:
               if (axx != null) {
                  if (!var16) {
                     var16 = a.gro.matcher(axxxx).matches();
                     if (axx == null) {
                        break label118;
                     }

                     if (!var16) {
                        var16 = false;
                        break label118;
                     }
                  }

                  var16 = true;
               }

               boolean axxxxxx = var16;
               boolean var17 = axxxxxx;
               if (axx != null) {
                  if (!axxxxxx) {
                     break label121;
                  }

                  var10000 = a.cke;
                  if (axx == null) {
                     break label123;
                  }

                  var17 = a.cke.contains(axxxx);
               }

               if (!var17) {
                  short var10001 = 31406;
                  long var10002 = 6458132913422990302L ^ ax;
                  String axxxxxxx = "Suspicious player name detected: " + axxxx;
                  boolean var18 = a.gfh.dnp();
                  if (axx != null) {
                     if (var18) {
                        fnb.hcp().ael(axxxxxxx, gge.WARNING).bvw((int)p).evs();
                     }

                     var18 = a.bwv.dnp();
                  }

                  if (axx != null) {
                     if (var18) {
                        bpa.dhu(axxxxxxx);
                     }

                     a.cke.add(axxxx);
                  }
               }
            }

            var10000 = a.ezd.computeIfAbsent(axxxxx, axxxxxxxx -> new alz());
         }

         alz axxxxxxxx = (alz)var10000;
         axxxxxxxx.efg(axxx);
         axxxxxxxx.auw(axxx);
         axxxxxxxx.doa(axxx);
         Iterator var13 = a.dmq.values().iterator();

         while (true) {
            if (var13.hasNext()) {
               fwu axxxxxxxxx = (fwu)var13.next();
               axxxxxxxxx.acc(axxxxxxxx);
               axxxxxxxxx.ayy(a);
               if (axx == null) {
                  break;
               }

               if (axx != null) {
                  continue;
               }
            }

            if (axx == null) {
               return;
            }
            break;
         }
      }
   }

   static {
      long var5 = a ^ 125011503518150L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[9];
      int var12 = 0;
      String var11 = "¹r\u0013êt\u0085l\u001dqì\u00058\u0017d]½(9qGýL\u001fV+ÁÉ>\u000fÊM¸\u008c¤È±5Çr\u0096\"Èug\u0096\u0014LÑ/\u0016\u001a¿U\u000b\u0094ÝW(\u009c\u001dÇÀ\u008chYéF\u0094\u0095\"\u0012by\u007f\u0005!\u008aù\"éG¸\u001a,'vs\u0010ÄB\u009d&#A*o\"M\u0010½\u000ez\u001bPMµ\u001d9\u008c\u0003\u0013Ï7ª\u001e ]\u0014nØ»ô>ËîP}\u00ad·A+ÚI¯\u0080¾~-v\u0084702ÉÇ\u009bV÷ÐÏî>Þ\u0085x:\u0086;¨\u0010èót*\u00043B\u0081FW[¢¹¼KE\r\u0002/\u0012é ã£.\u009fË±\u0083O\u0089ºY6!2JÏ\u008dÔ\u008c/È¤tÛã\u009e\u0097Ë2,¶\"F5ª\u0007Ùg\u008d*Ú?D\u00ad¿çªôýÐyí\u0093*ì\u0004(¾\u0018CEÆ\u000b\u000eÝK¤àj\u000b\u0095hOPò\u008fÎf¸~ËA\u0097\u000b\u0017\u009a_9$,\r?A>\b\u0012ÜÖö\u0090¸¸\u0094í$/3çf\u008cT\u0010\u008dèÓ\u00127Ü*¾<\u001d#V\u009cëfMÃ\u009f\u0090°oVÀÔñ\u0090îØliÀ\u007fA\u0085\\\b*HóyÄ1®6¦\u009b¼\u0084\u0000Ô×\u0092åV\"d¿Å\u0086\"ä\u008a}\u0010\u0080\u008eh\u001d¿Ø|\u001c\u001f5«ïø×¿à";
      int var13 = "¹r\u0013êt\u0085l\u001dqì\u00058\u0017d]½(9qGýL\u001fV+ÁÉ>\u000fÊM¸\u008c¤È±5Çr\u0096\"Èug\u0096\u0014LÑ/\u0016\u001a¿U\u000b\u0094ÝW(\u009c\u001dÇÀ\u008chYéF\u0094\u0095\"\u0012by\u007f\u0005!\u008aù\"éG¸\u001a,'vs\u0010ÄB\u009d&#A*o\"M\u0010½\u000ez\u001bPMµ\u001d9\u008c\u0003\u0013Ï7ª\u001e ]\u0014nØ»ô>ËîP}\u00ad·A+ÚI¯\u0080¾~-v\u0084702ÉÇ\u009bV÷ÐÏî>Þ\u0085x:\u0086;¨\u0010èót*\u00043B\u0081FW[¢¹¼KE\r\u0002/\u0012é ã£.\u009fË±\u0083O\u0089ºY6!2JÏ\u008dÔ\u008c/È¤tÛã\u009e\u0097Ë2,¶\"F5ª\u0007Ùg\u008d*Ú?D\u00ad¿çªôýÐyí\u0093*ì\u0004(¾\u0018CEÆ\u000b\u000eÝK¤àj\u000b\u0095hOPò\u008fÎf¸~ËA\u0097\u000b\u0017\u009a_9$,\r?A>\b\u0012ÜÖö\u0090¸¸\u0094í$/3çf\u008cT\u0010\u008dèÓ\u00127Ü*¾<\u001d#V\u009cëfMÃ\u009f\u0090°oVÀÔñ\u0090îØliÀ\u007fA\u0085\\\b*HóyÄ1®6¦\u009b¼\u0084\u0000Ô×\u0092åV\"d¿Å\u0086\"ä\u008a}\u0010\u0080\u008eh\u001d¿Ø|\u001c\u001f5«ïø×¿à"
         .length();
      char var10 = 16;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = d(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     g = var14;
                     h = new String[9];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 8375617473835291990L;
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
                     p = var30;
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

                  var11 = "*[ðèA¹\u0011ÛïC&É\u009aÎT\fº%Sá\rù·.à\u0099#\u0080Åpê¾Qå-Gß\u0095\u009aí´C\u0080¾ZÊ÷\u001d\u0003\u009dÚÞÒ¶DTÈUÇ´}_\u0007w0æç;x©41û\r\u009fÙ\u001cv·ç%üv>\u000b\u008d\u0012\u0000Úõ¥ÖÝ\u0007\u008dq4$j#\u0087ùFnñìe¶\r÷«$ä";
                  var13 = "*[ðèA¹\u0011ÛïC&É\u009aÎT\fº%Sá\rù·.à\u0099#\u0080Åpê¾Qå-Gß\u0095\u009aí´C\u0080¾ZÊ÷\u001d\u0003\u009dÚÞÒ¶DTÈUÇ´}_\u0007w0æç;x©41û\r\u009fÙ\u001cv·ç%üv>\u000b\u008d\u0012\u0000Úõ¥ÖÝ\u0007\u008dq4$j#\u0087ùFnñìe¶\r÷«$ä"
                     .length();
                  var10 = '@';
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16729;
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
            throw new RuntimeException("cc/astralis/a", var10);
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
         throw new RuntimeException("cc/astralis/a" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
