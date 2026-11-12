package cc.astralis;

import astralis.mixin.accessor.PlayerListHudAccessor;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2561;
import net.minecraft.class_268;
import net.minecraft.class_310;
import net.minecraft.class_640;

public class adv extends guu {
   private final env cqc;
   private float cxg = 225.0F;
   private static final long a = 117926962893282L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public adv() {
      super(bfm.VISUAL);
      a.cqc = new env(a.clp(), 300.0F, 20.0F, 200.0F, 20.0F);
      fjk.bfv.add(a.cqc);
   }

   public CopyOnWriteArrayList<class_640> drj() {
      long a = adv.a ^ 20044821381342L;
      int[] ax = dar.abu();
      if (chi.method_1562() == null) {
         return new CopyOnWriteArrayList<>();
      } else {
         List<class_640> axx = new ArrayList<>(chi.method_1562().method_45732());
         axx.sort(PlayerListHudAccessor.getEntryOrdering());
         CopyOnWriteArrayList<class_640> axxx = new CopyOnWriteArrayList<>();

         for (class_640 axxxx : axx) {
            boolean var10000 = ejt.dtl(axxxx);
            if (ax != null) {
               if (var10000 && ax != null) {
                  continue;
               }

               axxx.add(axxxx);
            }

            if (ax == null) {
               break;
            }
         }

         return axxx;
      }
   }

   public String gal(class_640 playerEntry) {
      long ax = adv.a ^ 42812861451205L;
      int[] axx = dar.abu();
      class_640 var10000 = a;
      if (axx != null) {
         if (a == null) {
            return "";
         }

         var10000 = a;
      }

      String axxx;
      label46: {
         if (axx != null) {
            if (var10000.method_2971() != null) {
               axxx = a.method_2971().getString();
               if (axx != null) {
                  break label46;
               }
            }

            var10000 = a;
         }

         String axxxx;
         label35: {
            class_268 axxxxx = var10000.method_2955();
            axxxx = a.method_2966().name();
            class_268 var10 = axxxxx;
            if (axx != null) {
               if (axxxxx == null) {
                  break label35;
               }

               var10 = axxxxx;
            }

            class_2561 axxxxxx = class_268.method_1142(var10, class_2561.method_43470(axxxx));
            axxx = axxxxxx.getString();
            if (axx != null) {
               break label46;
            }
         }

         axxx = axxxx;
      }

      short var10001 = 31516;
      long var10002 = 7580693767144908645L ^ ax;
      String var11 = axxx.replaceAll("§[0-9a-fk-or]", "");
      var10001 = 11156;
      var10002 = 7227364561625675758L ^ ax;
      axxx = var11.replaceAll("(?<=\\s|^)[RBGYAWPS](?=\\s|$)", "");
      return axxx.trim();
   }

   @gdz
   public void egc(ctt event) {
      long ax = adv.a ^ 16408705693645L;
      int[] axx = dar.abu();
      class_310 var10000 = chi;
      if (axx != null) {
         if (chi.field_1724 == null) {
            return;
         }

         var10000 = chi;
      }

      if (!var10000.method_1542()) {
         CopyOnWriteArrayList axxx = a.drj();
         short var25 = 10273;
         int axxxx = (int)a.cqc.grp();
         long var10001 = 2525214255992993135L ^ ax;
         int axxxxx = (int)a.cqc.azb();
         byte axxxxxx = 16;
         short var26 = 1479;
         var10001 = 6585732651650570383L ^ ax;
         int axxxxxxx = 14;
         float axxxxxxxx = !axxx.isEmpty() ? 0.0F : 4.0F;
         dmp.cdw(axxxx, axxxxx, a.cxg, 16.0F, 4.0F, 4.0F, axxxxxxxx, axxxxxxxx, dar.gqy().deo(), dar.gqy().cxj(), false);
         short var34 = 20272;
         long var10002 = 1718594227093532480L ^ ax;
         float var39 = axxxx + a.cxg / 2.0F;
         int var10004 = 23220;
         long var10005 = 7057990570960586742L ^ ax;
         cbl.fau("Player List", var39, axxxxx + 8, Color.white);
         int axxxxxxxxx = 0;
         short var35 = 15399;
         var10002 = 6493424605422281064L ^ ax;
         int axxxxxxxxxx = axxxxx + 16;
         short var41 = 18812;
         long var10003 = 7817701897261913146L ^ ax;
         short var49 = 29341;
         long var60 = 3659303743490437082L ^ ax;
         var10004 = (short)6182;
         var10005 = 7251501269994685795L ^ ax;
         short var74 = 31510;
         long var10006 = 1481225835179746911L ^ ax;
         Color axxxxxxxxxxx = new Color(20, 20, 30, 200);
         float var27 = axxxx;
         short var42 = 15399;
         var10003 = 6493424605422281064L ^ ax;
         float var36 = axxxxx + 16;
         float var43 = a.cxg;
         short var51 = 15399;
         long var62 = 6493424605422281064L ^ ax;
         var10004 = axxx.size();
         short var75 = 8773;
         var10006 = 1747425755470987032L ^ ax;
         dmp.caz(var27, var36, var43, 16 + var10004 * 14, 0.0F, 0.0F, 4.0F, 4.0F, axxxxxxxxxxx);

         for (class_640 axxxxxxxxxxxx : axxx) {
            Color var28;
            if (axxxxxxxxx % 2 == 0) {
               short var44 = 9861;
               var10003 = 2425495590748617672L ^ ax;
               short var53 = 9861;
               long var64 = 2425495590748617672L ^ ax;
               short var65 = 25313;
               var10005 = 7987175015740686250L ^ ax;
               short var77 = 26383;
               var10006 = 5871838397451156044L ^ ax;
               var28 = new Color(30, 30, 40, 200);
            } else {
               short var45 = 25120;
               var10003 = 1917375843065872254L ^ ax;
               short var55 = 17076;
               long var66 = 3597060678373056496L ^ ax;
               short var67 = 12866;
               var10005 = 1063303717227261704L ^ ax;
               short var79 = 26383;
               var10006 = 5871838397451156044L ^ ax;
               var28 = new Color(25, 25, 35, 200);
            }

            String[] axxxxxxxxxxxxx;
            label74: {
               Color axxxxxxxxxxxxxx = var28;
               short var29 = 3317;
               dmp.euv(axxxx, axxxxxxxxxx, a.cxg, 14.0F, axxxxxxxxxxxxxx);
               var10001 = 8086787995189662137L ^ ax;
               String axxxxxxxxxxxxxxx = a.gal(axxxxxxxxxxxx);
               axxxxxxxxxxxxx = new String[9];
               axxxxxxxxxxxxx[0] = axxxxxxxxxxxxxxx;
               String[] axxxxxxxxxxxxxxxx = hbc.daf(axxxxxxxxxxxxxxx);
               String[] var30 = axxxxxxxxxxxxxxxx;
               if (axx != null) {
                  if (axxxxxxxxxxxxxxxx != null) {
                     var10004 = axxxxxxxxxxxxxxxx.length;
                     short var80 = 29160;
                     var10006 = 2258057138106248372L ^ ax;
                     System.arraycopy(axxxxxxxxxxxxxxxx, 0, axxxxxxxxxxxxx, 1, Math.min(var10004, 8));
                     if (axx != null) {
                        break label74;
                     }
                  }

                  var30 = axxxxxxxxxxxxx;
               }

               short var46 = 1868;
               var10003 = 2757597912358771213L ^ ax;
               short var57 = 1232;
               long var69 = 8097550380903933091L ^ ax;
               Arrays.fill(var30, 1, 9, "Loading");
               hbc.bfk(axxxxxxxxxxxxxxx);
            }

            int axxxxxxxxxxxxxx = axxxx + 3;
            float axxxxxxxxxxxxxxx = 0.0F;
            int axxxxxxxxxxxxxxxx = 0;

            while (true) {
               if (axxxxxxxxxxxxxxxx < axxxxxxxxxxxxx.length) {
                  var31 = axxxxxxxxxxxxxxxx;
                  if (axx == null) {
                     break;
                  }

                  Color var32;
                  if (axxxxxxxxxxxxxxxx == 0) {
                     var32 = Color.WHITE;
                  } else {
                     short var47 = 26591;
                     var10003 = 860499297971649159L ^ ax;
                     short var59 = 32697;
                     long var70 = 8089459117452632825L ^ ax;
                     short var71 = 32697;
                     var10005 = 8089459117452632825L ^ ax;
                     var32 = new Color(180, 180, 180);
                  }

                  Color axxxxxxxxxxxxxxxxx = var32;
                  float axxxxxxxxxxxxxxxxxx = cbl.eq(axxxxxxxxxxxxx[axxxxxxxxxxxxxxxx]);
                  axxxxxxxxxxxxxxx += axxxxxxxxxxxxxxxxxx + 12.0F;
                  String var38 = axxxxxxxxxxxxx[axxxxxxxxxxxxxxxx];
                  float var48 = axxxxxxxxxxxxxx;
                  short var72 = 27877;
                  var10005 = 4666177605936460218L ^ ax;
                  cbl.ebb(var38, var48, axxxxxxxxxx + 7 - 5, axxxxxxxxxxxxxxxxx);
                  axxxxxxxxxxxxxx += (int)(axxxxxxxxxxxxxxxxxx + 12.0F);
                  axxxxxxxxxxxxxxxx++;
                  if (axx != null) {
                     continue;
                  }
               }

               float var87;
               var31 = (var87 = axxxxxxxxxxxxxxx - a.cxg) == 0.0F ? 0 : (var87 < 0.0F ? -1 : 1);
               break;
            }

            if (var31 > 0) {
               a.cxg = axxxxxxxxxxxxxxx;
            }

            axxxxxxxxxx += 14;
            axxxxxxxxx++;
            if (axx == null) {
               break;
            }
         }
      }
   }

   static {
      long var11 = a ^ 2675288346973L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[4];
      int var18 = 0;
      String var17 = "¬D±\u000f\u0016ÕQý¹7æ\u0003U\u009e7µêZ\u0001Ö'T4à\u0094\u0092÷.åDh9 pNYÊlÔRH\u001c¢Àeµ¯@\u0007\u0017PóNMy[\u0018Y9\u009fÑ\b\u009bê\u0094";
      int var19 = "¬D±\u000f\u0016ÕQý¹7æ\u0003U\u009e7µêZ\u0001Ö'T4à\u0094\u0092÷.åDh9 pNYÊlÔRH\u001c¢Àeµ¯@\u0007\u0017PóNMy[\u0018Y9\u009fÑ\b\u009bê\u0094"
         .length();
      char var16 = ' ';
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
                     h = new String[4];
                     r = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[21];
                     int var3 = 0;
                     String var4 = "Ì\u000e'-ßÆÅÈtqê¥8i\u009cì\u000e\u007f\u001f\u0011Êv\u0099Ü¿Ýê¥\u0098\u001fû\u0015\"\u0002Ö1Mÿ»\u001c\fo\u0006ÎÐ\u0099ÿ´p\u0014çgâ\u0004\u0083aå¡¿$\u009b\u001ab\u001dºÎùû5Oê\u0013-\u009aEQ\t\u009d\u00027\u0099õäÇ¸¶\u0016Ìo\u001b\"V]Ïìdò\u001c}ÿúâ>[\u0015õ{ö\u000bL³È:©õVù\u0001»4\u0090¢\"A\u009a\u000bÃ\u0012¦¨\u0088\u0095j\u0014}RÞ\u000f\u009eçxö}\u0081`ù°+\u0081Ú\u0088l";
                     int var5 = "Ì\u000e'-ßÆÅÈtqê¥8i\u009cì\u000e\u007f\u001f\u0011Êv\u0099Ü¿Ýê¥\u0098\u001fû\u0015\"\u0002Ö1Mÿ»\u001c\fo\u0006ÎÐ\u0099ÿ´p\u0014çgâ\u0004\u0083aå¡¿$\u009b\u001ab\u001dºÎùû5Oê\u0013-\u009aEQ\t\u009d\u00027\u0099õäÇ¸¶\u0016Ìo\u001b\"V]Ïìdò\u001c}ÿúâ>[\u0015õ{ö\u000bL³È:©õVù\u0001»4\u0090¢\"A\u009a\u000bÃ\u0012¦¨\u0088\u0095j\u0014}RÞ\u000f\u009eçxö}\u0081`ù°+\u0081Ú\u0088l"
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
                                    q = new Integer[21];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "%#¦\u0094d¾êèíßXcÅÞît";
                                 var5 = "%#¦\u0094d¾êèíßXcÅÞît".length();
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

                  var17 = "Ö\u0085E<\u0085+\u008bç\u008c¤ÙPõ\u0089\r\u00860\t>\u001fDô[J\u0095 +\u0099c,dl\nÝªBÐùÚR\u009a¶å£ïZö#\u000fL`T\u0094\u001e©\u0087)Ã1½Ñ\u0080{É\u0092";
                  var19 = "Ö\u0085E<\u0085+\u008bç\u008c¤ÙPõ\u0089\r\u00860\t>\u001fDô[J\u0095 +\u0099c,dl\nÝªBÐùÚR\u009a¶å£ïZö#\u000fL`T\u0094\u001e©\u0087)Ã1½Ñ\u0080{É\u0092"
                     .length();
                  var16 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18014;
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
            throw new RuntimeException("cc/astralis/adv", var10);
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
         throw new RuntimeException("cc/astralis/adv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15203;
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
            throw new RuntimeException("cc/astralis/adv", var14);
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
         throw new RuntimeException("cc/astralis/adv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
