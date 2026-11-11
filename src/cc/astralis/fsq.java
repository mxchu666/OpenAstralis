package cc.astralis;

import imgui.ImGui;
import imgui.type.ImString;
import java.io.File;
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

public class fsq {
   private ImString eqo;
   private static final long a = 117792821924803L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void gdt() {
      long a;
      int[] ax;
      short var10;
      a = fsq.a ^ 77706811313535L;
      ax = dar.abu();
      var10 = 12703;
      long var10001 = 8604352959202894198L ^ a;
      var10 = ImGui.beginChild("ConfigFilesChild", 200.0F, 200.0F, true);
      label110:
      if (ax != null) {
         if (var10) {
            label113: {
               label114: {
                  File axx = dar.gqy().dy().ail;
                  boolean var11 = axx.exists();
                  if (ax != null) {
                     if (!var11) {
                        break label113;
                     }

                     var12 = axx;
                     if (ax == null) {
                        break label114;
                     }

                     var11 = axx.isDirectory();
                  }

                  if (!var11) {
                     break label113;
                  }

                  var12 = Objects.requireNonNull(axx.listFiles());
               }

               File[] var5 = (File[])var12;
               int var6 = var5.length;
               int var7 = 0;

               while (var7 < var6) {
                  File axxx = var5[var7];
                  label95:
                  if (ax != null) {
                     var10 = axxx.isFile();
                     if (ax == null) {
                        break label110;
                     }

                     label92:
                     if (var10) {
                        String var13 = axxx.toString();
                        short var18 = 20414;
                        long var10002 = 5371550862686445402L ^ a;
                        String var19 = ".astralis";
                        if (ax != null) {
                           if (!var13.endsWith(".astralis")) {
                              break label92;
                           }

                           var13 = axxx.getName();
                           short var20 = 30984;
                           var10002 = 5900396633846442473L ^ a;
                           var19 = ".astralis";
                        }

                        String axxxx = var13.replace(var19, "");
                        short var27 = 20902;
                        long var10003 = 5590400694350659909L ^ a;
                        boolean var14 = ImGui.button(axxxx + "##" + axxxx);
                        if (ax != null) {
                           if (var14) {
                              dar.gqy().dy().esg(axxxx);
                           }

                           ImGui.sameLine();
                           if (ax == null) {
                              break label95;
                           }

                           short var21 = 10545;
                           var10002 = 4488698029325793751L ^ a;
                           var14 = ImGui.button("Delete##" + axxxx);
                        }

                        if (var14) {
                           dar.gqy().dy().bgb(axxxx);
                        }
                     }

                     var7++;
                  }

                  if (ax == null) {
                     break;
                  }
               }
            }

            ImGui.endChild();
         }

         var10 = 16136;
         var10001 = 915769361631064045L ^ a;
         short var23 = 32000;
         long var29 = 8158801995588726240L ^ a;
         ImGui.inputTextWithHint("##ConfigName", "Config Name", a.eqo, 0);
         var10 = 3560;
         ImGui.sameLine();
         var10001 = 5099271495099096335L ^ a;
         var10 = ImGui.button("Save");
      }

      if (ax != null) {
         if (var10) {
            dar.gqy().dy().flb(a.eqo.get());
            dar.gqy().dy().adk();
         }

         ImGui.sameLine();
         var10 = 19276;
         var10001 = 620432401471069102L ^ a;
         var10 = ImGui.button("Load");
      }

      if (var10) {
         dar.gqy().dy().esg(a.eqo.get());
      }
   }

   public fsq(ImString configName) {
      a.eqo = a;
   }

   static {
      long var0 = a ^ 71601054441276L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "\u0082=»\u0005b\u0014Ï¶K\u0097\b(;\u009d\t;å|\u0086cF´+\\\u0018ØÔ\u0081|5\u0088\u0092<(Ø\u001b\u0089²ü\\ð\u0091\u009a$2zI\u0083d\u0010FT-\u0004~\u0097e\u0016Éàmè¦\u0097GB\u0010'ë\u001b4ÈÜ\u0011ú\u0084eð¬à.M_ G\u007f\u0083Û\u009e\u0003Áç[E\u0085o¼]r{Ve\u0089¼\u009a°\u0017ÅúxÅÊk\u001aÑ= ÎS÷} dÂýtÊ-g×Ñl\u0013LêK]\u000fö\u0087/ÈÌCj\u001d`Bµ\u0010\u0004r×V$\f©\u007f?\u0095\u001b¢²Q\u0007\b";
      int var8 = "\u0082=»\u0005b\u0014Ï¶K\u0097\b(;\u009d\t;å|\u0086cF´+\\\u0018ØÔ\u0081|5\u0088\u0092<(Ø\u001b\u0089²ü\\ð\u0091\u009a$2zI\u0083d\u0010FT-\u0004~\u0097e\u0016Éàmè¦\u0097GB\u0010'ë\u001b4ÈÜ\u0011ú\u0084eð¬à.M_ G\u007f\u0083Û\u009e\u0003Áç[E\u0085o¼]r{Ve\u0089¼\u009a°\u0017ÅúxÅÊk\u001aÑ= ÎS÷} dÂýtÊ-g×Ñl\u0013LêK]\u000fö\u0087/ÈÌCj\u001d`Bµ\u0010\u0004r×V$\f©\u007f?\u0095\u001b¢²Q\u0007\b"
         .length();
      char var5 = 24;
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
                     c = new String[9];
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

                  var6 = "qúÁì¤±U!ÙZÄ£Fó\u0006»\u0097}ä\u0092\u0016Õ\u009cÓ½\u001f©òNc5\u001f(¸ÇÕÿä\u0018Ç\u0007\u008e\u0093ó\u0005zïp\\êzß?\u0018\u0014ÛtP(ù]»EÏé»÷Il,ªK\u0085";
                  var8 = "qúÁì¤±U!ÙZÄ£Fó\u0006»\u0097}ä\u0092\u0016Õ\u009cÓ½\u001f©òNc5\u001f(¸ÇÕÿä\u0018Ç\u0007\u008e\u0093ó\u0005zïp\\êzß?\u0018\u0014ÛtP(ù]»EÏé»÷Il,ªK\u0085"
                     .length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20061;
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
            throw new RuntimeException("cc/astralis/fsq", var10);
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
         throw new RuntimeException("cc/astralis/fsq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
