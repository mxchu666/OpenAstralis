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

public class ClickGuiStyle extends guu {
   private final adu btx;
   public bes ejf;
   public gbp cof;
   public gbp hhk;
   public bes eo;
   public gbp fik;
   public gbp cvi;
   public bes giq;
   public acn clb;
   public acn eem;
   private final gaf bja;
   private coc gac;
   private dmr aca;
   private static final long a = 20532836023902L;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] p;
   private static final Integer[] q;
   private static final Map r;

   public ClickGuiStyle() {
      long a = ClickGuiStyle.a ^ 88186770967055L;
      short var10002 = 27467;
      long var10003 = 7384325445755836013L ^ a;
      super(bfm.VISUAL, 344);
      short var5 = 18107;
      long var10004 = 2759237807182245576L ^ a;
      short var19 = 11930;
      long var10005 = 228222474198714092L ^ a;
      String[] var33 = new String[3];
      short var10008 = 11942;
      long var10009 = 3647115420588279511L ^ a;
      var33[0] = "Imgui";
      var10008 = 25356;
      var10009 = 4286326299898923902L ^ a;
      var33[1] = "Dropdown";
      var10008 = 11930;
      var10009 = 228222474198714092L ^ a;
      var33[2] = "Astralis";
      a.btx = new adu("Mode", "Astralis", var33);
      short var6 = 29036;
      var10004 = 7207955339131509016L ^ a;
      a.ejf = new bes("Imgui Alpha", 240.0F, 0.0F, 255.0F, 1.0F);
      short var7 = 602;
      var10004 = 3071866221391358511L ^ a;
      a.cof = new gbp("Blur", true);
      short var8 = 738;
      var10004 = 7101460557567371925L ^ a;
      a.hhk = new gbp("Only Blur Imgui", false);
      short var9 = 21288;
      var10004 = 2126014252662389592L ^ a;
      a.eo = new bes("Blur Radius", 7.0F, 1.0F, 50.0F, 1.0F);
      short var10 = 11711;
      var10004 = 1875536054612919748L ^ a;
      a.fik = new gbp("Gradient", true);
      short var11 = 4301;
      var10004 = 3706392816434526389L ^ a;
      a.cvi = new gbp("Only Gradient With Imgui", false);
      short var12 = 5918;
      var10004 = 617682022817152864L ^ a;
      a.giq = new bes("Gradient Alpha", 55.0F, 1.0F, 255.0F, 1.0F);
      short var13 = 18356;
      var10004 = 6121195337136566216L ^ a;
      short var10006 = 14569;
      long var10007 = 3045534332942140871L ^ a;
      short var35 = 14942;
      long var40 = 7604280631087875953L ^ a;
      var10008 = 3368;
      var10009 = 5893150852530630661L ^ a;
      a.clb = new acn("Color", new Color(78, 73, 165));
      short var14 = 16265;
      var10004 = 3378872232881821686L ^ a;
      var10006 = 12125;
      var10007 = 4309550962764206712L ^ a;
      short var37 = 20000;
      long var42 = 4050273958091698948L ^ a;
      var10008 = 5715;
      var10009 = 1397662354952907640L ^ a;
      a.eem = new acn("Hover Color", new Color(66, 61, 140));
      a.bja = new gaf();
      short var10001 = 1241;
      long var4 = 4661484237782710768L ^ a;
      ffn[] var3 = new ffn[]{a.btx, a.cof.bih(() -> {
         long ax = ClickGuiStyle.a ^ 120699933667943L;
         short var10001x = 11942;
         long var10002x = 3647095277451509439L ^ ax;
         return a.btx.emb("Imgui");
      }), a.hhk.bih(() -> {
         long ax = ClickGuiStyle.a ^ 114858229195629L;
         int[] var3x = dar.abu();
         boolean var10000 = a.cof.dnp();
         if (var3x != null) {
            if (!var10000) {
               return false;
            }

            var10000 = a.cof.ajf().get();
         }

         if (var3x == null) {
            return var10000;
         } else {
            return var10000 ? true : false;
         }
      }), a.eo.bih(() -> {
         long ax = ClickGuiStyle.a ^ 4044534049864L;
         int[] var3x = dar.abu();
         boolean var10000 = a.cof.dnp();
         if (var3x != null) {
            if (!var10000) {
               return false;
            }

            var10000 = a.cof.ajf().get();
         }

         if (var3x == null) {
            return var10000;
         } else {
            return var10000 ? true : false;
         }
      }), a.fik.bih(() -> {
         long ax = ClickGuiStyle.a ^ 95707338832579L;
         short var10001x = 11942;
         long var10002x = 3647123061280683547L ^ ax;
         return a.btx.emb("Imgui");
      }), a.cvi.bih(() -> {
         long ax = ClickGuiStyle.a ^ 80135056288609L;
         int[] var3x = dar.abu();
         boolean var10000 = a.fik.dnp();
         if (var3x != null) {
            if (!var10000) {
               return false;
            }

            var10000 = a.fik.ajf().get();
         }

         if (var3x == null) {
            return var10000;
         } else {
            return var10000 ? true : false;
         }
      }), null, null, null, null};
      short var15 = 30832;
      var10004 = 3302555396282418519L ^ a;
      var3[6] = a.giq.bih(() -> {
         long ax = ClickGuiStyle.a ^ 120778519841586L;
         int[] var3x = dar.abu();
         boolean var10000 = a.fik.dnp();
         if (var3x != null) {
            if (!var10000) {
               return false;
            }

            var10000 = a.fik.ajf().get();
         }

         if (var3x == null) {
            return var10000;
         } else {
            return var10000 ? true : false;
         }
      });
      short var16 = 20814;
      var10004 = 2682155171491753058L ^ a;
      var3[7] = a.ejf.bih(() -> {
         long ax = ClickGuiStyle.a ^ 80752484212380L;
         short var10001x = 11942;
         long var10002x = 3647125578421178948L ^ ax;
         return a.btx.emb("Imgui");
      });
      short var17 = 24297;
      var10004 = 660778176315302849L ^ a;
      var3[8] = a.clb.bih(() -> {
         long ax = ClickGuiStyle.a ^ 100365317949299L;
         short var10001x = 11942;
         long var10002x = 3647110144056363947L ^ ax;
         return a.btx.emb("Imgui");
      });
      short var18 = 9138;
      var10004 = 1120345234682470040L ^ a;
      var3[9] = a.eem.bih(() -> {
         long ax = ClickGuiStyle.a ^ 45034611254153L;
         short var10001x = 11942;
         long var10002x = 3647160227350605649L ^ ax;
         return a.btx.emb("Imgui");
      });
      a.bfi(var3);
   }

   @Override
   public void auj() {
      int[] a;
      int var6;
      long ax = ClickGuiStyle.a ^ 28323620880281L;
      int[] var10000 = dar.abu();
      String var4 = a.btx.dnp();
      byte var5 = -1;
      a = var10000;
      var6 = var4.hashCode();
      label90:
      if (a != null) {
         switch (var6) {
            case 70766967:
               short var10001 = 10178;
               long var10002 = 5108993456514841133L ^ ax;
               var6 = var4.equals("Imgui");
               if (a == null) {
                  break label90;
               }

               if (var6 == 0) {
                  break;
               }

               var5 = 0;
               if (a != null) {
                  break;
               }
            case -268477211:
               short var9 = 3278;
               long var11 = 4079359511127429410L ^ ax;
               var6 = var4.equals("Astralis");
               if (a == null) {
                  break label90;
               }

               if (var6 == 0) {
                  break;
               }

               var5 = 1;
               if (a != null) {
                  break;
               }
            case -367417295:
               short var10 = 6085;
               long var12 = 4834107428238428718L ^ ax;
               var6 = var4.equals("Dropdown");
               if (a == null) {
                  break label90;
               }

               if (var6 != 0) {
                  var5 = 2;
               }
         }

         var6 = var5;
      }

      switch (var6) {
         case 0:
            chi.method_1507(a.bja);
            if (a != null) {
               break;
            }
         case 1:
            label68: {
               ClickGuiStyle var7 = a;
               if (a != null) {
                  if (a.gac != null) {
                     break label68;
                  }

                  var7 = a;
               }

               var7.gac = new coc();
            }

            chi.method_1507(a.gac);
            if (a != null) {
               break;
            }
         case 2:
            label59: {
               ClickGuiStyle var8 = a;
               if (a != null) {
                  if (a.aca != null) {
                     break label59;
                  }

                  var8 = a;
               }

               var8.aca = new dmr();
            }

            dar.gqy().fyf().glu(a.aca);
            chi.method_1507(a.aca);
      }

      a.gxo();
      super.auj();
   }

   @Override
   public void frg() {
      super.frg();
   }

   static {
      long var11 = a ^ 15379464828946L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[16];
      int var18 = 0;
      String var17 = "\u0010ïì³\u0016RäQ8\u009bC=rzS\t\u0013\u0091w¡ø\u0019»©\u0083ì\u001aÂ'\u000b¥\u009b\u0010È³u\u00adÀiì:Ìq¹í¶áûK Ð\u0099\u0013Rê\u008aÅâ3 ZXÈM7£`Qåéý;\u0097ßê\n\u0004?X~\u0083A\u0010$uÙ\u0004¥¼(T»\u0084.@\u008f\u0085.ã \u0084*~¼*¤(²Þ:èFm\u0014Öy\u0097\u0003hté\u0084¶zÁNbIBÕË\t \u00adCðy¤\u0088.Ó\u000b8if,ÊIöLoô*]Â)\u0002&.%Ûë®\u009d\u0080\u0018oÜ \u0095yUË\u0002ëyÛ,NÃ\u0097\u0094\u009dï±æ>xÍA\u0010PéînCí×À¼\u008aUäN¶\u008by \u0004$¡ßÆeÿ\u0010ÆYÇ\u0016.#é!Ä&\\{\u0016¦,$\u0010\u0002¬+Ö´\u0007î 6´\u0089÷\u009ba\u001b¢lkû\u007fe$4#å_°ÊÖK Ñç\u0095Hl\u0013XEB0Ó'È\u00022\u0014Ç\f\u0011¶ZK¶\u001fIkE5°\u0097\u0001\u0094R]\u0094Ñ\u0013\u008d¾¦\u0004¡¶\u0011ð6Ú¨\u0081\u0013\fCÙ<\u0000<ÈH\u0010ÞÉ±\u0093\u001dÿ\u0088bªM6Ûâ'ó<\u0018ÝØWl\u008d-Ìr_`\u001b\\\n¸|ÿÖN\tÖ-y7H\u0018y\u0094\bÎ\u008a)Ì\u009e\tG\u008e\u0016ÜJr\u0000Äáìº>ûí)";
      int var19 = "\u0010ïì³\u0016RäQ8\u009bC=rzS\t\u0013\u0091w¡ø\u0019»©\u0083ì\u001aÂ'\u000b¥\u009b\u0010È³u\u00adÀiì:Ìq¹í¶áûK Ð\u0099\u0013Rê\u008aÅâ3 ZXÈM7£`Qåéý;\u0097ßê\n\u0004?X~\u0083A\u0010$uÙ\u0004¥¼(T»\u0084.@\u008f\u0085.ã \u0084*~¼*¤(²Þ:èFm\u0014Öy\u0097\u0003hté\u0084¶zÁNbIBÕË\t \u00adCðy¤\u0088.Ó\u000b8if,ÊIöLoô*]Â)\u0002&.%Ûë®\u009d\u0080\u0018oÜ \u0095yUË\u0002ëyÛ,NÃ\u0097\u0094\u009dï±æ>xÍA\u0010PéînCí×À¼\u008aUäN¶\u008by \u0004$¡ßÆeÿ\u0010ÆYÇ\u0016.#é!Ä&\\{\u0016¦,$\u0010\u0002¬+Ö´\u0007î 6´\u0089÷\u009ba\u001b¢lkû\u007fe$4#å_°ÊÖK Ñç\u0095Hl\u0013XEB0Ó'È\u00022\u0014Ç\f\u0011¶ZK¶\u001fIkE5°\u0097\u0001\u0094R]\u0094Ñ\u0013\u008d¾¦\u0004¡¶\u0011ð6Ú¨\u0081\u0013\fCÙ<\u0000<ÈH\u0010ÞÉ±\u0093\u001dÿ\u0088bªM6Ûâ'ó<\u0018ÝØWl\u008d-Ìr_`\u001b\\\n¸|ÿÖN\tÖ-y7H\u0018y\u0094\bÎ\u008a)Ì\u009e\tG\u008e\u0016ÜJr\u0000Äáìº>ûí)"
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
                     h = new String[16];
                     r = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[12];
                     int var3 = 0;
                     String var4 = "\u0000>e¶Gvéþk¿\u008a!qÑÒÞÑÓ\u0012\u0017\u008b\f\u001eÇ\u008c\u009b\u0002\u0017O£v×áÄùÁhNE\u007f\u0012°yþ°áO¹%\u0093eKI¦ñ¾Æü\u0018²i¼²\b\u001dÇÿOq5\u0089\u0011ÅS\u00adÑÞ\u008b2w";
                     int var5 = "\u0000>e¶Gvéþk¿\u008a!qÑÒÞÑÓ\u0012\u0017\u008b\f\u001eÇ\u008c\u009b\u0002\u0017O£v×áÄùÁhNE\u007f\u0012°yþ°áO¹%\u0093eKI¦ñ¾Æü\u0018²i¼²\b\u001dÇÿOq5\u0089\u0011ÅS\u00adÑÞ\u008b2w"
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
                                    q = new Integer[12];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "Nò#e[Ås\u0015vð\u0014*\u0014RÂ\"";
                                 var5 = "Nò#e[Ås\u0015vð\u0014*\u0014RÂ\"".length();
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

                  var17 = "\fÜ#\u0095'~!ó|\u0090\u000b\u008aÅÎ¼È\u0018rùxÂ<\u000f,=Ø«¶xAÑ\"5®ê©üÈ6cä";
                  var19 = "\fÜ#\u0095'~!ó|\u0090\u000b\u008aÅÎ¼È\u0018rùxÂ<\u000f,=Ø«¶xAÑ\"5®ê©üÈ6cä".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23587;
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
            throw new RuntimeException("cc/astralis/daw", var10);
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
         throw new RuntimeException("cc/astralis/daw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2431;
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
            throw new RuntimeException("cc/astralis/daw", var14);
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
         throw new RuntimeException("cc/astralis/daw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
