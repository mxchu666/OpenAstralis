package cc.astralis;

import imgui.ImGui;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fkc {
   private String gcd;
   private final String gzv;
   private String cap;
   private boolean guz = false;
   private String awl = null;
   private final List<eix> cmi = new ArrayList<>();
   private final Stack<String> equ = new Stack<>();
   private final Stack<String> cod = new Stack<>();
   private boolean ase = false;
   private static final long a = 60487388769246L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public fkc(String initialPath, String fileExtensionFilter) {
      a.gcd = Paths.get(a).toAbsolutePath().toString();
      a.gzv = a;
      a.ftu();
   }

   public void dut() {
      long a = fkc.a ^ 21986926510196L;
      int[] var10000 = dar.abu();
      short var10002 = 32473;
      long var10003 = 3212377921903654942L ^ a;
      ImGui.text("Current Path: " + a.gcd);
      int[] ax = var10000;
      ImGui.separator();
      ImGui.beginDisabled(a.equ.isEmpty());
      short var7 = 26064;
      long var10001 = 9003453280101032731L ^ a;
      boolean var8 = ImGui.button("Back");
      if (ax != null) {
         if (var8) {
            a.ecf();
         }

         ImGui.endDisabled();
         short var9 = 6798;
         ImGui.sameLine();
         var10001 = 2080679810883787846L ^ a;
         ImGui.beginDisabled(a.cod.isEmpty());
         var8 = ImGui.button("Forward");
      }

      if (ax != null) {
         if (var8) {
            a.got();
         }

         ImGui.endDisabled();
         short var10 = 14854;
         ImGui.sameLine();
         var10001 = 2668466015368395979L ^ a;
         var8 = ImGui.button("Up");
      }

      label187:
      if (ax != null) {
         if (var8) {
            var8 = a.gcd.equals("/");
            if (ax == null) {
               break label187;
            }

            if (!var8) {
               a.axr();
            }
         }

         ImGui.sameLine();
         short var11 = 12130;
         var10001 = 5992011543584450983L ^ a;
         var8 = ImGui.button("Refresh");
      }

      if (ax != null) {
         if (var8) {
            a.ftu();
         }

         ImGui.separator();
         short var12 = 28608;
         var10001 = 219671248133351692L ^ a;
         var8 = ImGui.beginChild("Directory Contents", 0.0F, 300.0F, true);
      }

      label179:
      if (ax != null) {
         if (var8) {
            for (eix axx : new ArrayList<>(a.cmi)) {
               var8 = a.gzv.equalsIgnoreCase(axx.ewu);
               if (ax == null) {
                  break label179;
               }

               label171:
               if (ax != null) {
                  if (!var8) {
                     var8 = axx.fde;
                     if (ax == null) {
                        break label171;
                     }

                     if (!axx.fde) {
                        var8 = a.gzv.isBlank();
                        if (ax == null) {
                           break label171;
                        }

                        if (!var8 && ax != null) {
                           continue;
                        }
                     }
                  }

                  eu.ady();
                  ImGui.text(String.valueOf(axx.aof));
                  ImGui.sameLine();
                  eu.efl();
                  var8 = axx.fde;
               }

               label161: {
                  if (ax != null) {
                     if (var8) {
                        if (!ImGui.selectable(axx.cnk + "/", false, 1)) {
                           break label161;
                        }

                        a.dfw(axx.fcf.toString());
                        if (ax != null) {
                           break label161;
                        }
                     }

                     var8 = ImGui.selectable(axx.cnk, Objects.equals(a.cap, axx.fcf.toString()));
                  }

                  if (var8) {
                     a.awl = axx.fcf.toString();
                     a.guz = true;
                  }
               }

               if (ax == null) {
                  break;
               }
            }

            ImGui.endChild();
         }

         var8 = a.guz;
      }

      if (ax != null) {
         if (!var8) {
            return;
         }

         short var13 = 5518;
         var10001 = 4215718464471962432L ^ a;
         ImGui.openPopup("Confirm Selection");
         short var14 = 16097;
         ImGui.setNextWindowSize(400.0F, 140.0F);
         var10001 = 2886831284377008167L ^ a;
         var8 = ImGui.beginPopupModal("Confirm Selection", 2);
      }

      if (ax != null) {
         if (!var8) {
            return;
         }

         short var15 = 21661;
         var10001 = 1999263471998554708L ^ a;
         ImGui.text("Confirm selection of:");
         short var16 = 28241;
         ImGui.textWrapped(a.awl);
         var10001 = 6180644424099129502L ^ a;
         ImGui.dummy(0.0F, 5.0F);
         ImGui.separator();
         ImGui.dummy(0.0F, 5.0F);
         var8 = ImGui.button("Confirm", 120.0F, 0.0F);
      }

      label132: {
         label196: {
            if (ax != null) {
               if (var8) {
                  a.cap = a.awl;
                  a.ase = true;
                  a.guz = false;
                  ImGui.closeCurrentPopup();
               }

               ImGui.sameLine();
               if (ax == null) {
                  break label196;
               }

               short var17 = 25066;
               var10001 = 2030890861579331360L ^ a;
               var8 = ImGui.button("Cancel", 120.0F, 0.0F);
            }

            if (!var8) {
               break label132;
            }

            a.awl = null;
            a.guz = false;
         }

         ImGui.closeCurrentPopup();
      }

      ImGui.endPopup();
   }

   private void dfw(String a) {
      long ax = fkc.a ^ 5134428675849L;
      int[] var10000 = dar.abu();
      Path axx = Paths.get(a).normalize().toAbsolutePath();
      int[] axxx = var10000;
      String var6 = axx.toString();
      if (axxx != null) {
         if (var6.equals(a.gcd)) {
            return;
         }

         a.equ.push(a.gcd);
      }

      a.cod.clear();
      a.gcd = axx.toString();
      dar.ecj.error(a.gcd);
      a.ftu();
   }

   private void ecf() {
      long a = fkc.a ^ 101865857157960L;
      int[] var3 = dar.abu();
      if (var3 != null) {
         if (a.equ.isEmpty()) {
            return;
         }

         a.cod.push(a.gcd);
      }

      a.gcd = a.equ.pop();
      a.ftu();
   }

   private void got() {
      long a = fkc.a ^ 14730001056871L;
      int[] var3 = dar.abu();
      if (var3 != null) {
         if (a.cod.isEmpty()) {
            return;
         }

         a.equ.push(a.gcd);
      }

      a.gcd = a.cod.pop();
      a.ftu();
   }

   private void axr() {
      long a = fkc.a ^ 72590540080077L;
      Path ax = Paths.get(a.gcd).getParent();
      if (ax != null) {
         a.dfw(ax.toString());
      }
   }

   private synchronized void ftu() {
      long a = fkc.a ^ 3377093693234L;
      ArrayList ax = new ArrayList();
      int[] var10000 = dar.abu();
      a.cap = null;
      File axx = new File(a.gcd);
      int[] axxx = var10000;
      boolean var13 = axx.exists();
      if (axxx != null) {
         if (var13) {
            boolean var14 = axx.isDirectory();
            if (axxx == null) {
               return;
            }

            if (var14) {
               File[] axxxx = axx.listFiles();
               if (axxx == null) {
                  return;
               }

               if (axxxx != null) {
                  File[] var7 = axxxx;
                  int var8 = axxxx.length;
                  int var9 = 0;

                  label76: {
                     while (var9 < var8) {
                        File axxxxx = var7[var9];
                        if (axxx != null) {
                           var15 = axxxxx.isDirectory();
                           if (axxx == null) {
                              break label76;
                           }

                           if (var15 != 0) {
                              ax.add(new eix(axxxxx.getName(), true, axxxxx.toPath()));
                           }

                           var9++;
                        }

                        if (axxx == null) {
                           break;
                        }
                     }

                     var7 = axxxx;
                     var8 = axxxx.length;
                     var15 = 0;
                  }

                  var9 = var15;

                  while (var9 < var8) {
                     File axxxxxx = var7[var9];
                     if (axxx != null) {
                        boolean var16 = axxxxxx.isDirectory();
                        if (axxx == null) {
                           return;
                        }

                        if (!var16) {
                           ax.add(new eix(axxxxxx.getName(), false, axxxxxx.toPath()));
                        }

                        var9++;
                     }

                     if (axxx == null) {
                        break;
                     }
                  }
               }
            }
         }

         a.cmi.clear();
         a.cmi.addAll(ax);
      }
   }

   public void bla() {
      a.ase = false;
      a.cap = null;
   }

   public String aes() {
      return a.cap;
   }

   public boolean etz() {
      return a.guz;
   }

   public boolean abc() {
      return a.ase;
   }

   static {
      long var0 = a ^ 62456499422113L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "×ÑðvÖ¬ +ÕÚå;è \u0099÷(±n\u0094ü\u00039r§Í\u0003}\u009f\u0081é)É\u0084c\u001c\u0010\u0015=iÑ\u008c»´æT\u0004rºâ\u0019\u0016\u0002ó×SP\u0010Éº×R}éòüìµ£ìã3'$(HDL]zGÎ\u0004\u0003`Ò\u0095H(ï[@¤?wÓ\u008e\u00ad\u00830Ç'\u0099\u0081_y2\u0083E\u0094¸ç\u0098\u001aD\u0010\u009dñ/Ðå\u0099[gV\u0088Zs[úq\u0099\u0010/ÏÍzW=o\u0089!Qg¬\u0092°ñ\u0084(\u0097\u0087æX\u008bbUï/\u0014\u008d.\u0016)D§W¹v¿\u0001GNÐ¤K6?\u0006YµXZ\u000e^\u0098\u001d~l\r\u0010gwÑYt³AYW®©{¬<tZ ò\u007f\u001bE\f\u0084¶Eä¿\u0080÷>¶7\u0018q3Ü\u009dï{é×RÝ\u00912y\u0089Û\u001e";
      int var8 = "×ÑðvÖ¬ +ÕÚå;è \u0099÷(±n\u0094ü\u00039r§Í\u0003}\u009f\u0081é)É\u0084c\u001c\u0010\u0015=iÑ\u008c»´æT\u0004rºâ\u0019\u0016\u0002ó×SP\u0010Éº×R}éòüìµ£ìã3'$(HDL]zGÎ\u0004\u0003`Ò\u0095H(ï[@¤?wÓ\u008e\u00ad\u00830Ç'\u0099\u0081_y2\u0083E\u0094¸ç\u0098\u001aD\u0010\u009dñ/Ðå\u0099[gV\u0088Zs[úq\u0099\u0010/ÏÍzW=o\u0089!Qg¬\u0092°ñ\u0084(\u0097\u0087æX\u008bbUï/\u0014\u008d.\u0016)D§W¹v¿\u0001GNÐ¤K6?\u0006YµXZ\u000e^\u0098\u001d~l\r\u0010gwÑYt³AYW®©{¬<tZ ò\u007f\u001bE\f\u0084¶Eä¿\u0080÷>¶7\u0018q3Ü\u009dï{é×RÝ\u00912y\u0089Û\u001e"
         .length();
      char var5 = 16;
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
                     c = new String[11];
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

                  var6 = "*5Õ`å\u0080ÜµE8?ñÁ\u001a½G©\u009fÏ<f\u001aR>áÓ¥\u009bÊØa®é\u009d:°¤ê\u0013Å\u0010ª>¥LÔT ZNt\u000e\u0004÷~\u008a\u008e";
                  var8 = "*5Õ`å\u0080ÜµE8?ñÁ\u001a½G©\u009fÏ<f\u001aR>áÓ¥\u009bÊØa®é\u009d:°¤ê\u0013Å\u0010ª>¥LÔT ZNt\u000e\u0004÷~\u008a\u008e".length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28005;
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
            throw new RuntimeException("cc/astralis/fkc", var10);
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
         throw new RuntimeException("cc/astralis/fkc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
