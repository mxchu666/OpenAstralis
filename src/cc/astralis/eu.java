package cc.astralis;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import imgui.ImFont;
import imgui.ImGui;
import imgui.ImGuiIO;
import imgui.extension.implot.ImPlot;
import imgui.gl3.ImGuiImplGl3;
import imgui.glfw.ImGuiImplGlfw;
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
import net.minecraft.class_10865;
import net.minecraft.class_10868;
import net.minecraft.class_276;
import net.minecraft.class_310;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;

public class eu {
   private static final ImGuiImplGlfw dcx;
   private static final ImGuiImplGl3 fxf;
   private static ImFont dbl;
   public static final char fzp;
   public static final char hfo;
   public static final char gkz;
   public static final char asc;
   public static final char cxh;
   public static final char dlf;
   public static final char gft;
   private static final long a = 64055840184024L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public static void djp(long handle) {
      long ax = eu.a ^ 140231752306064L;
      ImGui.createContext();
      ImPlot.createContext();
      ImGuiIO axx = ImGui.getIO();
      short var10001 = 18490;
      long var10002 = 2631163871316884357L ^ ax;
      axx.setIniFilename("astralis.ini");
      var10001 = 5912;
      var10002 = 8946247549978370534L ^ ax;
      axx.setConfigFlags(1088);
      axx.setFontGlobalScale(1.0F);
      grv(axx);
      dbz(axx);
      axx.getFonts().build();
      dcx.init(a, true);
      fxf.init();
   }

   private static void grv(ImGuiIO param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic cc/astralis/eu.a J
      // 03: ldc2_w 116632062826189
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic cc/astralis/dar.abu ()[I
      // 0b: astore 3
      // 0c: ldc cc/astralis/eu
      // 0e: sipush 5970
      // 11: ldc2_w 476252899167780790
      // 14: lload 1
      // 15: lxor
      // 16: pop2
      // 17: pop
      // 18: ldc "/assets/astralis/fonts/Product Sans Regular.ttf"
      // 1a: invokevirtual java/lang/Class.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
      // 1d: astore 4
      // 1f: aload 4
      // 21: aload 3
      // 22: ifnull 31
      // 25: ifnull 46
      // 28: goto 2f
      // 2b: invokestatic cc/astralis/eu.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 4
      // 31: invokevirtual java/io/InputStream.readAllBytes ()[B
      // 34: astore 5
      // 36: aload 0
      // 37: invokevirtual imgui/ImGuiIO.getFonts ()Limgui/ImFontAtlas;
      // 3a: aload 5
      // 3c: ldc 16.5
      // 3e: invokevirtual imgui/ImFontAtlas.addFontFromMemoryTTF ([BF)Limgui/ImFont;
      // 41: pop
      // 42: aload 3
      // 43: ifnonnull 5f
      // 46: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 49: sipush 9162
      // 4c: ldc2_w 589661498567297833
      // 4f: lload 1
      // 50: lxor
      // 51: pop2
      // 52: pop
      // 53: ldc "Product Sans font not found."
      // 55: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 58: goto 5f
      // 5b: invokestatic cc/astralis/eu.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: aload 4
      // 61: aload 3
      // 62: ifnull 71
      // 65: ifnull a1
      // 68: goto 6f
      // 6b: invokestatic cc/astralis/eu.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: aload 4
      // 71: invokevirtual java/io/InputStream.close ()V
      // 74: goto a1
      // 77: invokestatic cc/astralis/eu.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a: athrow
      // 7b: astore 5
      // 7d: aload 4
      // 7f: aload 3
      // 80: ifnull 8f
      // 83: ifnull 9e
      // 86: goto 8d
      // 89: invokestatic cc/astralis/eu.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: aload 4
      // 8f: invokevirtual java/io/InputStream.close ()V
      // 92: goto 9e
      // 95: astore 6
      // 97: aload 5
      // 99: aload 6
      // 9b: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 9e: aload 5
      // a0: athrow
      // a1: goto b8
      // a4: astore 4
      // a6: getstatic java/lang/System.err Ljava/io/PrintStream;
      // a9: sipush 5542
      // ac: ldc2_w 4797217699273489734
      // af: lload 1
      // b0: lxor
      // b1: pop2
      // b2: pop
      // b3: ldc "Failed to load main font"
      // b5: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // b8: return
   }

   private static void dbz(ImGuiIO param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic cc/astralis/eu.a J
      // 003: ldc2_w 115496496480836
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic cc/astralis/dar.abu ()[I
      // 00b: astore 3
      // 00c: ldc cc/astralis/eu
      // 00e: sipush 31225
      // 011: ldc2_w 2555171788158928278
      // 014: lload 1
      // 015: lxor
      // 016: pop2
      // 017: pop
      // 018: ldc "/assets/astralis/fonts/fontawesome-webfont.ttf"
      // 01a: invokevirtual java/lang/Class.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
      // 01d: astore 4
      // 01f: aload 4
      // 021: aload 3
      // 022: ifnull 031
      // 025: ifnull 1b8
      // 028: goto 02f
      // 02b: invokestatic cc/astralis/eu.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: aload 4
      // 031: invokevirtual java/io/InputStream.readAllBytes ()[B
      // 034: astore 5
      // 036: sipush 5638
      // 039: new imgui/ImFontConfig
      // 03c: dup
      // 03d: invokespecial imgui/ImFontConfig.<init> ()V
      // 040: astore 6
      // 042: ldc2_w 1939476553466998585
      // 045: lload 1
      // 046: lxor
      // 047: aload 6
      // 049: bipush 1
      // 04a: invokevirtual imgui/ImFontConfig.setMergeMode (Z)V
      // 04d: aload 6
      // 04f: ldc 14.0
      // 051: invokevirtual imgui/ImFontConfig.setGlyphMinAdvanceX (F)V
      // 054: aload 6
      // 056: bipush 1
      // 057: invokevirtual imgui/ImFontConfig.setPixelSnapH (Z)V
      // 05a: pop2
      // 05b: pop
      // 05c: ldc 15
      // 05e: newarray 9
      // 060: dup
      // 061: bipush 0
      // 062: sipush 14126
      // 065: ldc2_w 6307720288118361613
      // 068: lload 1
      // 069: lxor
      // 06a: pop2
      // 06b: pop
      // 06c: ldc -3973
      // 06e: sastore
      // 06f: dup
      // 070: bipush 1
      // 071: sipush 6385
      // 074: ldc2_w 7621929222196224471
      // 077: lload 1
      // 078: lxor
      // 079: pop2
      // 07a: pop
      // 07b: ldc -3973
      // 07d: sastore
      // 07e: dup
      // 07f: bipush 2
      // 080: sipush 1653
      // 083: ldc2_w 5015549544592605020
      // 086: lload 1
      // 087: lxor
      // 088: pop2
      // 089: pop
      // 08a: ldc -3749
      // 08c: sastore
      // 08d: dup
      // 08e: bipush 3
      // 08f: sipush 16861
      // 092: ldc2_w 7411523702614800619
      // 095: lload 1
      // 096: lxor
      // 097: pop2
      // 098: pop
      // 099: ldc -3749
      // 09b: sastore
      // 09c: dup
      // 09d: bipush 4
      // 09e: sipush 23990
      // 0a1: ldc2_w 7273151322966467755
      // 0a4: lload 1
      // 0a5: lxor
      // 0a6: invokedynamic n (IJ)I bsm=cc/astralis/eu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: sastore
      // 0ac: dup
      // 0ad: bipush 5
      // 0ae: sipush 22498
      // 0b1: ldc2_w 6759389814039457474
      // 0b4: lload 1
      // 0b5: lxor
      // 0b6: pop2
      // 0b7: pop
      // 0b8: ldc -3643
      // 0ba: sastore
      // 0bb: dup
      // 0bc: sipush 14800
      // 0bf: ldc2_w 3190859003127349454
      // 0c2: lload 1
      // 0c3: lxor
      // 0c4: invokedynamic n (IJ)I bsm=cc/astralis/eu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: sipush 9099
      // 0cc: ldc2_w 3935098994765519535
      // 0cf: lload 1
      // 0d0: lxor
      // 0d1: pop2
      // 0d2: pop
      // 0d3: ldc -3639
      // 0d5: sastore
      // 0d6: dup
      // 0d7: sipush 29096
      // 0da: ldc2_w 6824331306312796317
      // 0dd: lload 1
      // 0de: lxor
      // 0df: pop2
      // 0e0: pop
      // 0e1: ldc 7
      // 0e3: sipush 19860
      // 0e6: ldc2_w 3240023916553057453
      // 0e9: lload 1
      // 0ea: lxor
      // 0eb: pop2
      // 0ec: pop
      // 0ed: ldc -3639
      // 0ef: sastore
      // 0f0: dup
      // 0f1: sipush 17419
      // 0f4: ldc2_w 4763721117243424055
      // 0f7: lload 1
      // 0f8: lxor
      // 0f9: pop2
      // 0fa: pop
      // 0fb: ldc 8
      // 0fd: sipush 25823
      // 100: ldc2_w 2568457933472669178
      // 103: lload 1
      // 104: lxor
      // 105: pop2
      // 106: pop
      // 107: ldc -3641
      // 109: sastore
      // 10a: dup
      // 10b: sipush 28827
      // 10e: ldc2_w 5926615685454072252
      // 111: lload 1
      // 112: lxor
      // 113: pop2
      // 114: pop
      // 115: ldc 9
      // 117: sipush 32729
      // 11a: ldc2_w 2861075969856014021
      // 11d: lload 1
      // 11e: lxor
      // 11f: pop2
      // 120: pop
      // 121: ldc -3641
      // 123: sastore
      // 124: dup
      // 125: sipush 23767
      // 128: ldc2_w 7578106333620020732
      // 12b: lload 1
      // 12c: lxor
      // 12d: pop2
      // 12e: pop
      // 12f: ldc 10
      // 131: sipush 30569
      // 134: ldc2_w 6190473326508150340
      // 137: lload 1
      // 138: lxor
      // 139: pop2
      // 13a: pop
      // 13b: ldc -3640
      // 13d: sastore
      // 13e: dup
      // 13f: sipush 25717
      // 142: ldc2_w 7629044139860434247
      // 145: lload 1
      // 146: lxor
      // 147: pop2
      // 148: pop
      // 149: ldc 11
      // 14b: sipush 32653
      // 14e: ldc2_w 3996312100771137207
      // 151: lload 1
      // 152: lxor
      // 153: pop2
      // 154: pop
      // 155: ldc -3640
      // 157: sastore
      // 158: dup
      // 159: sipush 17701
      // 15c: ldc2_w 8903729425396677636
      // 15f: lload 1
      // 160: lxor
      // 161: pop2
      // 162: pop
      // 163: ldc_w 12
      // 166: sipush 22093
      // 169: ldc2_w 4615938922767757174
      // 16c: lload 1
      // 16d: lxor
      // 16e: pop2
      // 16f: pop
      // 170: ldc_w -3642
      // 173: sastore
      // 174: dup
      // 175: sipush 3293
      // 178: ldc2_w 76196134443382249
      // 17b: lload 1
      // 17c: lxor
      // 17d: pop2
      // 17e: pop
      // 17f: ldc_w 13
      // 182: sipush 2669
      // 185: ldc2_w 1948122758473511770
      // 188: lload 1
      // 189: lxor
      // 18a: pop2
      // 18b: pop
      // 18c: ldc_w -3642
      // 18f: sastore
      // 190: dup
      // 191: sipush 4355
      // 194: ldc2_w 5429569391288346657
      // 197: lload 1
      // 198: lxor
      // 199: pop2
      // 19a: pop
      // 19b: ldc_w 14
      // 19e: bipush 0
      // 19f: sastore
      // 1a0: astore 7
      // 1a2: aload 0
      // 1a3: invokevirtual imgui/ImGuiIO.getFonts ()Limgui/ImFontAtlas;
      // 1a6: aload 5
      // 1a8: ldc 14.0
      // 1aa: aload 6
      // 1ac: aload 7
      // 1ae: invokevirtual imgui/ImFontAtlas.addFontFromMemoryTTF ([BFLimgui/ImFontConfig;[S)Limgui/ImFont;
      // 1b1: putstatic cc/astralis/eu.dbl Limgui/ImFont;
      // 1b4: aload 3
      // 1b5: ifnonnull 1d2
      // 1b8: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 1bb: sipush 10260
      // 1be: ldc2_w 2498394924788929658
      // 1c1: lload 1
      // 1c2: lxor
      // 1c3: pop2
      // 1c4: pop
      // 1c5: ldc_w "FontAwesome font not found."
      // 1c8: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 1cb: goto 1d2
      // 1ce: invokestatic cc/astralis/eu.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d1: athrow
      // 1d2: aload 4
      // 1d4: aload 3
      // 1d5: ifnull 1e4
      // 1d8: ifnull 214
      // 1db: goto 1e2
      // 1de: invokestatic cc/astralis/eu.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e1: athrow
      // 1e2: aload 4
      // 1e4: invokevirtual java/io/InputStream.close ()V
      // 1e7: goto 214
      // 1ea: invokestatic cc/astralis/eu.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ed: athrow
      // 1ee: astore 5
      // 1f0: aload 4
      // 1f2: aload 3
      // 1f3: ifnull 202
      // 1f6: ifnull 211
      // 1f9: goto 200
      // 1fc: invokestatic cc/astralis/eu.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ff: athrow
      // 200: aload 4
      // 202: invokevirtual java/io/InputStream.close ()V
      // 205: goto 211
      // 208: astore 6
      // 20a: aload 5
      // 20c: aload 6
      // 20e: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 211: aload 5
      // 213: athrow
      // 214: goto 22c
      // 217: astore 4
      // 219: getstatic java/lang/System.err Ljava/io/PrintStream;
      // 21c: sipush 18828
      // 21f: ldc2_w 9025809826641917408
      // 222: lload 1
      // 223: lxor
      // 224: pop2
      // 225: pop
      // 226: ldc_w "Failed to load Font Awesome"
      // 229: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 22c: return
   }

   public static void ady() {
      long var0 = a ^ 73721584807261L;
      int[] var2 = dar.abu();
      ImFont var10000 = dbl;
      if (var2 != null) {
         if (dbl == null) {
            return;
         }

         var10000 = dbl;
      }

      ImGui.pushFont(var10000);
   }

   public static void efl() {
      long var0 = a ^ 133744743723178L;
      if (dbl != null) {
         ImGui.popFont();
      }
   }

   public static void alu(eqs runnable) {
      long ax = eu.a ^ 116888107744878L;
      class_276 axx = class_310.method_1551().method_1522();
      int axxx = ((class_10868)axx.method_30277()).method_68426(((class_10865)RenderSystem.getDevice()).method_68401(), null);
      short var10000 = 9278;
      long var10001 = 8527509887210447141L ^ ax;
      GlStateManager._glBindFramebuffer(36160, axxx);
      GL11.glViewport(0, 0, axx.field_1482, axx.field_1481);
      dcx.newFrame();
      ImGui.newFrame();
      a.fqj(ImGui.getIO());
      ImGui.render();
      fxf.renderDrawData(ImGui.getDrawData());
      var10000 = 18525;
      var10001 = 592116332130798936L ^ ax;
      GlStateManager._glBindFramebuffer(36160, axxx);
      ImGuiIO var8 = ImGui.getIO();
      short var10 = 13419;
      long var10002 = 6723523933268668786L ^ ax;
      if (var8.hasConfigFlags(1024)) {
         long axxxx = GLFW.glfwGetCurrentContext();
         ImGui.updatePlatformWindows();
         ImGui.renderPlatformWindowsDefault();
         GLFW.glfwMakeContextCurrent(axxxx);
      }
   }

   public static void fcq() {
   }

   static {
      long var11 = a ^ 58622211497175L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[7];
      int var18 = 0;
      String var17 = "á)#\nÄµ@µÍh\u007f\u0007\u001bøWä\u0087\u0007\u0091\f\u0080\u008b\u0090\u008bÇp¯µ]V\u009dº\u0007ÂÒs´îñ¤¹\u00945z\u0096\u0006\u001fc'j¥V0O¿\u0097Ì^\u0090\u008b.£à\u009bða&\u0093ë\u008c±÷ÄìG7\b\u0012vý8»Òp\u007fr\u0095\u0014µ¡½ôÏ¸\u001a?52¢\u0083T7Z\u0019UÄwap\u0012Ï:\u001cÀ\u0090r©\u0005\u0099lHÕÌ«GË·âÕ\u0003WÄcýÿm\u009aPËâ\t5ÂØ8n\u0014ª6\u0015UáêèQðÄó~\foeÇ\u0093s\u0080Ü3\u001fD\u009fº\u001d$ü\u0007\u009eé*¾Ì\u0086ÑÌñõh\u001b\u0097£Ç\u0019Á\u008e¥5\u0084nu\u008bì\u0001Ål\u0012\u000fj»y\u0004Æî¼+Áµ\u001e#8Ì%°\u0001\f\u0094Ì%ZÞ\n§\u0016ùÿ\u0081à)rr\u00ad¤\u008a\u0098\u009d¸4r³ÑªÔ\u0080Û\u0095]&\u009aI\u001eæ¡Êlùv,B\u00adÊíÏBêÒ) \u008c5ñ\u0095¨Ix¯5²_5\u009bv²º\u0084u«GË2\u001b\u0014\u00935\n\u001fcwt:";
      int var19 = "á)#\nÄµ@µÍh\u007f\u0007\u001bøWä\u0087\u0007\u0091\f\u0080\u008b\u0090\u008bÇp¯µ]V\u009dº\u0007ÂÒs´îñ¤¹\u00945z\u0096\u0006\u001fc'j¥V0O¿\u0097Ì^\u0090\u008b.£à\u009bða&\u0093ë\u008c±÷ÄìG7\b\u0012vý8»Òp\u007fr\u0095\u0014µ¡½ôÏ¸\u001a?52¢\u0083T7Z\u0019UÄwap\u0012Ï:\u001cÀ\u0090r©\u0005\u0099lHÕÌ«GË·âÕ\u0003WÄcýÿm\u009aPËâ\t5ÂØ8n\u0014ª6\u0015UáêèQðÄó~\foeÇ\u0093s\u0080Ü3\u001fD\u009fº\u001d$ü\u0007\u009eé*¾Ì\u0086ÑÌñõh\u001b\u0097£Ç\u0019Á\u008e¥5\u0084nu\u008bì\u0001Ål\u0012\u000fj»y\u0004Æî¼+Áµ\u001e#8Ì%°\u0001\f\u0094Ì%ZÞ\n§\u0016ùÿ\u0081à)rr\u00ad¤\u008a\u0098\u009d¸4r³ÑªÔ\u0080Û\u0095]&\u009aI\u001eæ¡Êlùv,B\u00adÊíÏBêÒ) \u008c5ñ\u0095¨Ix¯5²_5\u009bv²º\u0084u«GË2\u001b\u0014\u00935\n\u001fcwt:"
         .length();
      char var16 = 'P';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var50 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var50;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[7];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[35];
                     int var3 = 0;
                     String var4 = "V\r\u001aý\u0080#\u001c\u007f5&Phýhë¥\u008e¶Ü=[ÎOÞÒ;zo\"\u0095Á\nQ(\u001d\u000b¹äpuØêÝ\u0006;\u008dïñ\u001fm\u0098#^D\u0090´·'#PÜq<8sñqø\u0095QÖ¾»Î\u000f\u00040e\u0006TùÃÜ7pñ}ã£J=\u009aS\u008a£GTîDú×ÀêÜ\u0090\u0095\u0098\u00180\u0013\u0002ëQ\u0086\u0006ï;Ï\u0093¼\u0086ÆJ\u0019\u000f\u0081ñößjûgD\u0081\u009c«è\u009e\u008b\u0082{u\u0094\u000b\n\u009c\u0083LxÞ\u0085~~\u009fí\u000fÃ°ª\u008d\u0007\u0001qÆ\u0005ôòV¼L\u0091ï¨\u0086\u000eñu§+³u§\u000eÒÙ\nQy´LOó\u009e\u008a\u0086r}!he=I^I/v·\u0093\u0096\u009d}\u0093Ñ\u001d\u0003\u0098&ì\"ç9Ã¿2ÿ\u0010ÎÂwèýk\u009cqò;×Î\f<væ»å´\u0007\u0006\u0015C\u0094ßSúÂñc\u00948\u001c,`¿]³";
                     int var5 = "V\r\u001aý\u0080#\u001c\u007f5&Phýhë¥\u008e¶Ü=[ÎOÞÒ;zo\"\u0095Á\nQ(\u001d\u000b¹äpuØêÝ\u0006;\u008dïñ\u001fm\u0098#^D\u0090´·'#PÜq<8sñqø\u0095QÖ¾»Î\u000f\u00040e\u0006TùÃÜ7pñ}ã£J=\u009aS\u008a£GTîDú×ÀêÜ\u0090\u0095\u0098\u00180\u0013\u0002ëQ\u0086\u0006ï;Ï\u0093¼\u0086ÆJ\u0019\u000f\u0081ñößjûgD\u0081\u009c«è\u009e\u008b\u0082{u\u0094\u000b\n\u009c\u0083LxÞ\u0085~~\u009fí\u000fÃ°ª\u008d\u0007\u0001qÆ\u0005ôòV¼L\u0091ï¨\u0086\u000eñu§+³u§\u000eÒÙ\nQy´LOó\u009e\u008a\u0086r}!he=I^I/v·\u0093\u0096\u009d}\u0093Ñ\u001d\u0003\u0098&ì\"ç9Ã¿2ÿ\u0010ÎÂwèýk\u009cqò;×Î\f<væ»å´\u0007\u0006\u0015C\u0094ßSúÂñc\u00948\u001c,`¿]³"
                        .length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var54 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte var57 = -1;

                        while (true) {
                           long var8 = var54;
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
                           long var59 = (var10[0] & 255L) << 56
                              | (var10[1] & 255L) << 48
                              | (var10[2] & 255L) << 40
                              | (var10[3] & 255L) << 32
                              | (var10[4] & 255L) << 24
                              | (var10[5] & 255L) << 16
                              | (var10[6] & 255L) << 8
                              | var10[7] & 255L;
                           switch (var57) {
                              case 0:
                                 var28[var10001] = var59;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[35];
                                    short var29 = 1727;
                                    long var42 = var11 ^ 7365522018522898688L;
                                    gft = '\uf1c6';
                                    short var30 = 3316;
                                    long var43 = var11 ^ 4456187824770952026L;
                                    cxh = '\uf1c7';
                                    short var31 = 25994;
                                    long var44 = var11 ^ 6088773017277153833L;
                                    hfo = '\uf15b';
                                    short var32 = 15103;
                                    long var45 = var11 ^ 1679287343772245330L;
                                    fzp = '\uf07b';
                                    short var33 = 8116;
                                    long var46 = var11 ^ 5557172828068362249L;
                                    asc = '\uf1c9';
                                    short var34 = 22251;
                                    long var47 = var11 ^ 4763378458352841024L;
                                    dlf = '\uf1c8';
                                    short var35 = 4674;
                                    long var48 = var11 ^ 6162144582555579897L;
                                    gkz = '\uf1c5';
                                    dcx = new ImGuiImplGlfw();
                                    fxf = new ImGuiImplGl3();
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var59;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "Ó&µ¡\u000f\u0002N¥\u009c\u009càª\rp\u009d©";
                                 var5 = "Ó&µ¡\u000f\u0002N¥\u009c\u009càª\rp\u009d©".length();
                                 var2 = 0;
                           }

                           byte var41 = var2;
                           var2 += 8;
                           var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var54 = (var7[0] & 255L) << 56
                              | (var7[1] & 255L) << 48
                              | (var7[2] & 255L) << 40
                              | (var7[3] & 255L) << 32
                              | (var7[4] & 255L) << 24
                              | (var7[5] & 255L) << 16
                              | (var7[6] & 255L) << 8
                              | var7[7] & 255L;
                           var57 = 0;
                        }
                     }
                  }

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var50;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "[K\u0082x__ÿtñeüOOæÅ\u0010^Ý¶\u0011AY6ÍÂ©[\u009bµ¥\rPaæLæKeÖâN\u009f!®\u0011J \u0083\u000f\u001b\u008b¡(¿\u0091\u007f09¶\f;w¹¬\n\u0084ßpØZæ\u000b\u00ad.µ-\u0019C\u009cíøÎj¢Î«ðÝ\u0010<ü/5\u0088}8t ÝÒyø°7d";
                  var19 = "[K\u0082x__ÿtñeüOOæÅ\u0010^Ý¶\u0011AY6ÍÂ©[\u009bµ¥\rPaæLæKeÖâN\u009f!®\u0011J \u0083\u000f\u001b\u008b¡(¿\u0091\u007f09¶\f;w¹¬\n\u0084ßpØZæ\u000b\u00ad.µ-\u0019C\u009cíøÎj¢Î«ðÝ\u0010<ü/5\u0088}8t ÝÒyø°7d"
                     .length();
                  var16 = '8';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10483;
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
            throw new RuntimeException("cc/astralis/eu", var10);
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
         throw new RuntimeException("cc/astralis/eu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11680;
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
            throw new RuntimeException("cc/astralis/eu", var14);
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
         throw new RuntimeException("cc/astralis/eu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
