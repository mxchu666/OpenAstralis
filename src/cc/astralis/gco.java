package cc.astralis;

import com.google.gson.JsonObject;
import imgui.type.ImFloat;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gco {
   private static final long a = 22188368898511L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static JsonObject bbm() {
      JsonObject a = new JsonObject();
      dar.gqy().aws().dmc().forEach(axxxxxx -> {
         long ax = gco.a ^ 125634464445993L;
         int[] var10000 = dar.abu();
         JsonObject axx = new JsonObject();
         int[] axxx = var10000;
         JsonObject axxxx = new JsonObject();
         short var10001 = 10085;
         long var10002 = 273540217901235381L ^ ax;
         axx.addProperty("toggled", axxxxxx.dsv());
         var10001 = 9700;
         var10002 = 2340630653832019509L ^ ax;
         axx.addProperty("bind", axxxxxx.glr());
         var10001 = 15780;
         var10002 = 6306225765565802111L ^ ax;
         axx.addProperty("hide", axxxxxx.aov());
         axxxxxx.cbf().forEach(axxxxxxxxxxxxx -> {
            long ax;
            label70: {
               int[] axx;
               label58: {
                  label57: {
                     label56: {
                        label55: {
                           label54: {
                              label53: {
                                 label52: {
                                    label51: {
                                       ax = gco.a ^ 107868343869134L;
                                       int[] var10000x = dar.abu();
                                       Objects.requireNonNull(axxxxxxxxxxxxx);
                                       axx = var10000x;
                                       var10000x = (int[])axxxxxxxxxxxxx;
                                       if (axx != null) {
                                          switch (axxxxxxxxxxxxx) {
                                             case bes var17:
                                                var10000x = (int[])axxxxxxxxxxxxx;
                                                break;
                                             case adu var18:
                                                break label51;
                                             case cyx var19:
                                                break label52;
                                             case gbp var20:
                                                break label53;
                                             case dxl var21:
                                                break label54;
                                             case acn var22:
                                                break label55;
                                             case ale var23:
                                                break label56;
                                             case ejm var24:
                                                break label57;
                                             case epo var25:
                                                break label58;
                                             default:
                                                break label70;
                                          }
                                       }

                                       bes axxx = (bes)var10000x;
                                       axx.addProperty(axxx.fah(), axxx.dnp().floatValue());
                                       if (axx != null) {
                                          return;
                                       }
                                    }

                                    adu axxx = (adu)axxxxxxxxxxxxx;
                                    axx.addProperty(axxx.fah(), axxx.dnp());
                                    if (axx != null) {
                                       return;
                                    }
                                 }

                                 cyx axxx = (cyx)axxxxxxxxxxxxx;
                                 axx.addProperty(axxx.fah(), axxx.dnp().akm());
                                 if (axx != null) {
                                    return;
                                 }
                              }

                              gbp axxx = (gbp)axxxxxxxxxxxxx;
                              axx.addProperty(axxx.fah(), axxx.dnp());
                              if (axx != null) {
                                 return;
                              }
                           }

                           dxl axxx = (dxl)axxxxxxxxxxxxx;
                           axx.addProperty(axxx.fah(), axxx.dnp());
                           if (axx != null) {
                              return;
                           }
                        }

                        acn axxx = (acn)axxxxxxxxxxxxx;
                        axx.addProperty(axxx.fah(), axxx.dnp().getRGB());
                        if (axx != null) {
                           return;
                        }
                     }

                     ale axxx = (ale)axxxxxxxxxxxxx;
                     axx.addProperty(axxx.fah(), axxx.dnp().toString());
                     if (axx != null) {
                        return;
                     }
                  }

                  ejm axxx = (ejm)axxxxxxxxxxxxx;
                  axx.addProperty(axxx.fah(), axxx.dnp());
                  if (axx != null) {
                     return;
                  }
               }

               epo axxx = (epo)axxxxxxxxxxxxx;
               axx.addProperty(axxx.fah(), axxx.dnp());
               if (axx != null) {
                  return;
               }
            }

            String var10002x = axxxxxxxxxxxxx.fah();
            short var10003 = 9387;
            long var10004 = 5250300152430090133L ^ ax;
            throw new IllegalStateException("Unknown Property Type! " + var10002x);
         });
         JsonObject var7 = axxxx;
         if (axxx != null) {
            if (!axxxx.isEmpty()) {
               var10001 = 15934;
               var10002 = 6690535777129440739L ^ ax;
               axx.add("properties", axxxx);
            }

            var7 = a;
         }

         var7.add(axxxxxx.clp(), axx);
      });
      return a;
   }

   public static void axu(JsonObject jsonObject) {
      dar.gqy().aws().dmc().forEach(axxxxxxxx -> {
         long ax = gco.a ^ 135054407764900L;
         int[] var10000 = dar.abu();
         JsonObject axx = a.getAsJsonObject(axxxxxxxx.clp());
         int[] axxx = var10000;
         JsonObject var9 = axx;
         if (axxx != null) {
            if (axx == null) {
               return;
            }

            short var10001 = 13544;
            long var10002 = 4494982755194884794L ^ ax;
            var9 = axx.getAsJsonObject("properties");
         }

         JsonObject axxxx = var9;
         short var12 = 9872;
         long var14 = 3523596786893996225L ^ ax;
         boolean axxxxx = axx.get("toggled").getAsBoolean();
         boolean var10 = axxxxxxxx.dsv();
         if (axxx != null) {
            if (var10 != axxxxx) {
               axxxxxxxx.fga(axxxxx);
            }

            var12 = 1188;
            var14 = 2846994107369480947L ^ ax;
            var10 = axx.get("hide").getAsBoolean();
         }

         boolean axxxxxx = var10;
         guu var11 = axxxxxxxx;
         if (axxx != null) {
            if (axxxxxxxx.aov() != axxxxxx) {
               axxxxxxxx.atd(axxxxxx);
            }

            short var16 = 1266;
            long var10003 = 5451011034384261793L ^ ax;
            axxxxxxxx.hge(axx.get("bind").getAsInt());
            var11 = axxxxxxxx;
         }

         var11.cbf().forEach(axxxxxxxxxxxxxxxxxxxxxxx -> {
            long ax = gco.a ^ 113920100120892L;
            int[] var10000x = dar.abu();
            Object axx = axxxxxxxx.ct(axxxxxxxxxxxxxxxxxxxxxxx.fah());
            int[] axxx = var10000x;
            if (axx != null && axxxx != null && axxxx.has(((ffn)axx).fah())) {
               label70: {
                  label69: {
                     label68: {
                        label76: {
                           label66: {
                              label65: {
                                 label64: {
                                    Objects.requireNonNull(axx);
                                    var10000x = (int[])axx;
                                    if (axxx != null) {
                                       switch (axx) {
                                          case gbp var20:
                                             var10000x = (int[])axx;
                                             break;
                                          case bes var21:
                                             break label64;
                                          case adu var22:
                                             break label65;
                                          case cyx var23:
                                             break label66;
                                          case dxl var24:
                                             break label76;
                                          case acn var25:
                                             break label68;
                                          case epo var26:
                                             break label69;
                                          default:
                                             break label70;
                                       }
                                    }

                                    gbp axxxx = (gbp)var10000x;
                                    axxxx.gbf(axxxx.get(axxxx.fah()).getAsBoolean());
                                    if (axxx != null) {
                                       return;
                                    }
                                 }

                                 bes axxxx = (bes)axx;
                                 axxxx.gbf(new ImFloat(axxxx.get(axxxx.fah()).getAsFloat()));
                                 if (axxx != null) {
                                    return;
                                 }
                              }

                              adu axxxx = (adu)axx;
                              axxxx.gbf(axxxx.get(axxxx.fah()).getAsString());
                              if (axxx != null) {
                                 return;
                              }
                           }

                           label49: {
                              cyx axxxx = (cyx)axx;
                              String axxxxx = axxxx.get(axxxx.fah()).getAsString();
                              hcr axxxxxx = axxxx.ajs().get(axxxxx);
                              hcr var19 = axxxxxx;
                              if (axxx != null) {
                                 if (axxxxxx == null) {
                                    break label49;
                                 }

                                 axxxx.biz(axxxxxx);
                                 var19 = axxxx.dnp();
                              }

                              var19.frr(true);
                           }

                           if (axxx != null) {
                              return;
                           }
                        }

                        dxl axxxx = (dxl)axx;
                        axxxx.gbf(axxxx.get(axxxx.fah()).getAsString());
                        if (axxx != null) {
                           return;
                        }
                     }

                     acn axxxx = (acn)axx;
                     axxxx.gbf(dec.bst(axxxx.get(axxxx.fah()).getAsInt()));
                     if (axxx != null) {
                        return;
                     }
                  }

                  epo axxxx = (epo)axx;
                  axxxx.gbf(axxxx.get(axxxx.fah()).getAsString());
                  if (axxx != null) {
                     return;
                  }
               }

               short var10001x = 2034;
               long var10002x = 3413017093127492415L ^ ax;
               System.out.printf("Test %s%n", ((ffn)axx).fah());
            }
         });
      });
   }

   static {
      long var0 = a ^ 94872636117782L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "\u0085ÕX\u0010V\u0002ì\u0019¹Ë4\u001dlhþÇV¤\u001e\u000bËì\u009eÊ\u0002\u0016þ/ÊCã\u0093®\u0012%r\bsP,\u0018s\u0095%\u0090\u0089u\u0088\u008cÍ]·\u009b\u0098Ê\u0005Ø\u001a»òW5\u001e¿ô\u0010¨\fÇß\u0017 v\b-mçÝ«:\u0019;\u0010|\u0084\u0089/³£Ýj\u0090j\u0012 ±Y&Z\u0018\n\u0001;\u0005\u0017P\u0018\"&cp\u0093&\u001f/Ì~6\u0015\u0084\u001fB¸1\u0010\u0091Àµj\u0082¼\u0017ô1N\u0002Ñ\u0086Ëzf Ý\r-\u007fö?mº¦*YþB\u0015sx\n¾Rû\u0017dð/WE\u0098¼8ãàå\u0010ßR\u008cÅÊû\u00ad\u0083Ã½\u0090¶\u0092\u008b\u001b¤";
      int var8 = "\u0085ÕX\u0010V\u0002ì\u0019¹Ë4\u001dlhþÇV¤\u001e\u000bËì\u009eÊ\u0002\u0016þ/ÊCã\u0093®\u0012%r\bsP,\u0018s\u0095%\u0090\u0089u\u0088\u008cÍ]·\u009b\u0098Ê\u0005Ø\u001a»òW5\u001e¿ô\u0010¨\fÇß\u0017 v\b-mçÝ«:\u0019;\u0010|\u0084\u0089/³£Ýj\u0090j\u0012 ±Y&Z\u0018\n\u0001;\u0005\u0017P\u0018\"&cp\u0093&\u001f/Ì~6\u0015\u0084\u001fB¸1\u0010\u0091Àµj\u0082¼\u0017ô1N\u0002Ñ\u0086Ëzf Ý\r-\u007fö?mº¦*YþB\u0015sx\n¾Rû\u0017dð/WE\u0098¼8ãàå\u0010ßR\u008cÅÊû\u00ad\u0083Ã½\u0090¶\u0092\u008b\u001b¤"
         .length();
      char var5 = '(';
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
                     b = var9;
                     c = new String[10];
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

                  var6 = "Bê\u001c\u0098f¡üù\u008c\u0014ZCä\u001f\u0092\u0083\u0010Xý±'òH\\\u0017ºÆ\u00adwòe¡Æ";
                  var8 = "Bê\u001c\u0098f¡üù\u008c\u0014ZCä\u001f\u0092\u0083\u0010Xý±'òH\\\u0017ºÆ\u00adwòe¡Æ".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17471;
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
            throw new RuntimeException("cc/astralis/gco", var10);
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
         throw new RuntimeException("cc/astralis/gco" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
