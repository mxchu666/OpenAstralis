package cc.astralis;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hee {
   private static final String akf;
   public static final Map<String, String[]> bhs;
   private static String[] fax;
   private static final long a = 129346013750140L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static String[] asu(String gifPath) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic cc/astralis/hee.a J
      // 003: ldc2_w 139962005950186
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic cc/astralis/dar.abu ()[I
      // 00b: astore 3
      // 00c: aload 3
      // 00d: ifnull 053
      // 010: getstatic cc/astralis/hee.bhs Ljava/util/Map;
      // 013: aload 0
      // 014: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 019: ifeq 038
      // 01c: goto 023
      // 01f: invokestatic cc/astralis/hee.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: getstatic cc/astralis/hee.bhs Ljava/util/Map;
      // 026: aload 0
      // 027: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 02c: checkcast [Ljava/lang/String;
      // 02f: areturn
      // 030: invokestatic cc/astralis/hee.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: invokestatic cc/astralis/hee.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: sipush 18439
      // 03b: ldc2_w 1103214486121822892
      // 03e: lload 1
      // 03f: lxor
      // 040: pop2
      // 041: pop
      // 042: ldc "astralis/gif_frames/"
      // 044: bipush 0
      // 045: anewarray 67
      // 048: invokestatic java/nio/file/Paths.get (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
      // 04b: bipush 0
      // 04c: anewarray 74
      // 04f: invokestatic java/nio/file/Files.createDirectories (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
      // 052: pop
      // 053: aload 0
      // 054: invokestatic cc/astralis/hee.ccs (Ljava/lang/String;)Ljava/lang/String;
      // 057: astore 4
      // 059: sipush 8056
      // 05c: ldc2_w 30977065745345988
      // 05f: lload 1
      // 060: lxor
      // 061: pop2
      // 062: pop
      // 063: ldc "gif"
      // 065: invokestatic javax/imageio/ImageIO.getImageReadersByFormatName (Ljava/lang/String;)Ljava/util/Iterator;
      // 068: astore 5
      // 06a: aload 5
      // 06c: aload 3
      // 06d: ifnull 0a2
      // 070: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 075: ifne 09b
      // 078: goto 07f
      // 07b: invokestatic cc/astralis/hee.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: new java/io/IOException
      // 082: dup
      // 083: sipush 13665
      // 086: ldc2_w 8579593928863958980
      // 089: lload 1
      // 08a: lxor
      // 08b: pop2
      // 08c: pop
      // 08d: ldc "No GIF reader found"
      // 08f: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 092: athrow
      // 093: invokestatic cc/astralis/hee.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: invokestatic cc/astralis/hee.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: aload 5
      // 09d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a2: checkcast javax/imageio/ImageReader
      // 0a5: astore 6
      // 0a7: new java/io/File
      // 0aa: dup
      // 0ab: aload 0
      // 0ac: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0af: invokestatic javax/imageio/ImageIO.createImageInputStream (Ljava/lang/Object;)Ljavax/imageio/stream/ImageInputStream;
      // 0b2: astore 7
      // 0b4: aload 6
      // 0b6: aload 7
      // 0b8: invokevirtual javax/imageio/ImageReader.setInput (Ljava/lang/Object;)V
      // 0bb: aload 6
      // 0bd: bipush 1
      // 0be: invokevirtual javax/imageio/ImageReader.getNumImages (Z)I
      // 0c1: istore 8
      // 0c3: iload 8
      // 0c5: anewarray 67
      // 0c8: astore 9
      // 0ca: aconst_null
      // 0cb: astore 10
      // 0cd: bipush 0
      // 0ce: istore 11
      // 0d0: bipush 0
      // 0d1: istore 12
      // 0d3: aload 6
      // 0d5: invokevirtual javax/imageio/ImageReader.getStreamMetadata ()Ljavax/imageio/metadata/IIOMetadata;
      // 0d8: astore 13
      // 0da: aload 13
      // 0dc: aload 3
      // 0dd: ifnull 0ec
      // 0e0: ifnull 1a4
      // 0e3: goto 0ea
      // 0e6: invokestatic cc/astralis/hee.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e9: athrow
      // 0ea: aload 13
      // 0ec: sipush 2548
      // 0ef: ldc2_w 1358304294722599771
      // 0f2: lload 1
      // 0f3: lxor
      // 0f4: pop2
      // 0f5: pop
      // 0f6: ldc "javax_imageio_gif_stream_1.0"
      // 0f8: invokevirtual javax/imageio/metadata/IIOMetadata.getAsTree (Ljava/lang/String;)Lorg/w3c/dom/Node;
      // 0fb: astore 14
      // 0fd: aload 14
      // 0ff: invokeinterface org/w3c/dom/Node.getChildNodes ()Lorg/w3c/dom/NodeList; 1
      // 104: astore 15
      // 106: bipush 0
      // 107: istore 16
      // 109: iload 16
      // 10b: aload 15
      // 10d: invokeinterface org/w3c/dom/NodeList.getLength ()I 1
      // 112: if_icmpge 1a4
      // 115: aload 15
      // 117: iload 16
      // 119: invokeinterface org/w3c/dom/NodeList.item (I)Lorg/w3c/dom/Node; 2
      // 11e: astore 17
      // 120: aload 3
      // 121: ifnull 1a0
      // 124: aload 17
      // 126: invokeinterface org/w3c/dom/Node.getNodeName ()Ljava/lang/String; 1
      // 12b: sipush 9618
      // 12e: ldc2_w 1803284819139548975
      // 131: lload 1
      // 132: lxor
      // 133: pop2
      // 134: pop
      // 135: ldc "LogicalScreenDescriptor"
      // 137: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 13a: aload 3
      // 13b: ifnull 1a5
      // 13e: goto 145
      // 141: invokestatic cc/astralis/hee.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 144: athrow
      // 145: ifeq 196
      // 148: goto 14f
      // 14b: invokestatic cc/astralis/hee.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: aload 17
      // 151: invokeinterface org/w3c/dom/Node.getAttributes ()Lorg/w3c/dom/NamedNodeMap; 1
      // 156: astore 18
      // 158: aload 18
      // 15a: sipush 3029
      // 15d: ldc2_w 4911208774407190892
      // 160: lload 1
      // 161: lxor
      // 162: pop2
      // 163: pop
      // 164: ldc "logicalScreenWidth"
      // 166: invokeinterface org/w3c/dom/NamedNodeMap.getNamedItem (Ljava/lang/String;)Lorg/w3c/dom/Node; 2
      // 16b: invokeinterface org/w3c/dom/Node.getNodeValue ()Ljava/lang/String; 1
      // 170: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 173: istore 11
      // 175: aload 18
      // 177: sipush 1485
      // 17a: ldc2_w 346026573914175342
      // 17d: lload 1
      // 17e: lxor
      // 17f: pop2
      // 180: pop
      // 181: ldc "logicalScreenHeight"
      // 183: invokeinterface org/w3c/dom/NamedNodeMap.getNamedItem (Ljava/lang/String;)Lorg/w3c/dom/Node; 2
      // 188: invokeinterface org/w3c/dom/Node.getNodeValue ()Ljava/lang/String; 1
      // 18d: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 190: istore 12
      // 192: aload 3
      // 193: ifnonnull 1a4
      // 196: iinc 16 1
      // 199: goto 1a0
      // 19c: invokestatic cc/astralis/hee.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19f: athrow
      // 1a0: aload 3
      // 1a1: ifnonnull 109
      // 1a4: bipush 0
      // 1a5: istore 14
      // 1a7: iload 14
      // 1a9: iload 8
      // 1ab: if_icmpge 471
      // 1ae: aload 6
      // 1b0: iload 14
      // 1b2: invokevirtual javax/imageio/ImageReader.read (I)Ljava/awt/image/BufferedImage;
      // 1b5: astore 15
      // 1b7: sipush 18502
      // 1ba: aload 6
      // 1bc: iload 14
      // 1be: invokevirtual javax/imageio/ImageReader.getImageMetadata (I)Ljavax/imageio/metadata/IIOMetadata;
      // 1c1: astore 16
      // 1c3: ldc2_w 8084797395267992302
      // 1c6: lload 1
      // 1c7: lxor
      // 1c8: pop2
      // 1c9: pop
      // 1ca: ldc "none"
      // 1cc: astore 17
      // 1ce: bipush 0
      // 1cf: istore 18
      // 1d1: bipush 0
      // 1d2: istore 19
      // 1d4: aload 15
      // 1d6: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 1d9: istore 20
      // 1db: aload 15
      // 1dd: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 1e0: istore 21
      // 1e2: aload 16
      // 1e4: sipush 21308
      // 1e7: ldc2_w 2583792638892286342
      // 1ea: lload 1
      // 1eb: lxor
      // 1ec: pop2
      // 1ed: pop
      // 1ee: ldc "javax_imageio_gif_image_1.0"
      // 1f0: invokevirtual javax/imageio/metadata/IIOMetadata.getAsTree (Ljava/lang/String;)Lorg/w3c/dom/Node;
      // 1f3: astore 22
      // 1f5: aload 22
      // 1f7: invokeinterface org/w3c/dom/Node.getChildNodes ()Lorg/w3c/dom/NodeList; 1
      // 1fc: astore 23
      // 1fe: aload 3
      // 1ff: ifnull 47d
      // 202: bipush 0
      // 203: istore 24
      // 205: iload 24
      // 207: aload 23
      // 209: invokeinterface org/w3c/dom/NodeList.getLength ()I 1
      // 20e: if_icmpge 30f
      // 211: aload 23
      // 213: iload 24
      // 215: invokeinterface org/w3c/dom/NodeList.item (I)Lorg/w3c/dom/Node; 2
      // 21a: astore 25
      // 21c: aload 25
      // 21e: invokeinterface org/w3c/dom/Node.getNodeName ()Ljava/lang/String; 1
      // 223: sipush 20350
      // 226: ldc2_w 3780262408449965534
      // 229: lload 1
      // 22a: lxor
      // 22b: pop2
      // 22c: pop
      // 22d: ldc "ImageDescriptor"
      // 22f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 232: aload 3
      // 233: ifnull 1a9
      // 236: aload 3
      // 237: ifnull 2e2
      // 23a: ifeq 2c1
      // 23d: goto 244
      // 240: invokestatic cc/astralis/hee.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 243: athrow
      // 244: aload 25
      // 246: invokeinterface org/w3c/dom/Node.getAttributes ()Lorg/w3c/dom/NamedNodeMap; 1
      // 24b: astore 26
      // 24d: aload 26
      // 24f: sipush 25365
      // 252: ldc2_w 6690595142873256369
      // 255: lload 1
      // 256: lxor
      // 257: pop2
      // 258: pop
      // 259: ldc "imageLeftPosition"
      // 25b: invokeinterface org/w3c/dom/NamedNodeMap.getNamedItem (Ljava/lang/String;)Lorg/w3c/dom/Node; 2
      // 260: invokeinterface org/w3c/dom/Node.getNodeValue ()Ljava/lang/String; 1
      // 265: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 268: istore 18
      // 26a: aload 26
      // 26c: sipush 4838
      // 26f: ldc2_w 5152556626722676816
      // 272: lload 1
      // 273: lxor
      // 274: pop2
      // 275: pop
      // 276: ldc "imageTopPosition"
      // 278: invokeinterface org/w3c/dom/NamedNodeMap.getNamedItem (Ljava/lang/String;)Lorg/w3c/dom/Node; 2
      // 27d: invokeinterface org/w3c/dom/Node.getNodeValue ()Ljava/lang/String; 1
      // 282: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 285: istore 19
      // 287: aload 26
      // 289: sipush 4174
      // 28c: ldc2_w 6437650131806118636
      // 28f: lload 1
      // 290: lxor
      // 291: pop2
      // 292: pop
      // 293: ldc "imageWidth"
      // 295: invokeinterface org/w3c/dom/NamedNodeMap.getNamedItem (Ljava/lang/String;)Lorg/w3c/dom/Node; 2
      // 29a: invokeinterface org/w3c/dom/Node.getNodeValue ()Ljava/lang/String; 1
      // 29f: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 2a2: istore 20
      // 2a4: aload 26
      // 2a6: sipush 28571
      // 2a9: ldc2_w 3713066158313643301
      // 2ac: lload 1
      // 2ad: lxor
      // 2ae: pop2
      // 2af: pop
      // 2b0: ldc "imageHeight"
      // 2b2: invokeinterface org/w3c/dom/NamedNodeMap.getNamedItem (Ljava/lang/String;)Lorg/w3c/dom/Node; 2
      // 2b7: invokeinterface org/w3c/dom/Node.getNodeValue ()Ljava/lang/String; 1
      // 2bc: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 2bf: istore 21
      // 2c1: aload 25
      // 2c3: aload 3
      // 2c4: ifnull 2e7
      // 2c7: invokeinterface org/w3c/dom/Node.getNodeName ()Ljava/lang/String; 1
      // 2cc: sipush 3253
      // 2cf: ldc2_w 329842528694271516
      // 2d2: lload 1
      // 2d3: lxor
      // 2d4: pop2
      // 2d5: pop
      // 2d6: ldc "GraphicControlExtension"
      // 2d8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2db: goto 2e2
      // 2de: invokestatic cc/astralis/hee.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e1: athrow
      // 2e2: ifeq 308
      // 2e5: aload 25
      // 2e7: invokeinterface org/w3c/dom/Node.getAttributes ()Lorg/w3c/dom/NamedNodeMap; 1
      // 2ec: astore 26
      // 2ee: aload 26
      // 2f0: sipush 13224
      // 2f3: ldc2_w 6514306955746459918
      // 2f6: lload 1
      // 2f7: lxor
      // 2f8: pop2
      // 2f9: pop
      // 2fa: ldc "disposalMethod"
      // 2fc: invokeinterface org/w3c/dom/NamedNodeMap.getNamedItem (Ljava/lang/String;)Lorg/w3c/dom/Node; 2
      // 301: invokeinterface org/w3c/dom/Node.getNodeValue ()Ljava/lang/String; 1
      // 306: astore 17
      // 308: iinc 24 1
      // 30b: aload 3
      // 30c: ifnonnull 205
      // 30f: aload 10
      // 311: aload 3
      // 312: ifnull 381
      // 315: ifnonnull 37f
      // 318: goto 31f
      // 31b: invokestatic cc/astralis/hee.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31e: athrow
      // 31f: new java/awt/image/BufferedImage
      // 322: dup
      // 323: iload 11
      // 325: ifle 338
      // 328: goto 32f
      // 32b: invokestatic cc/astralis/hee.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32e: athrow
      // 32f: iload 11
      // 331: goto 33d
      // 334: invokestatic cc/astralis/hee.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 337: athrow
      // 338: aload 15
      // 33a: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 33d: iload 12
      // 33f: ifle 347
      // 342: iload 12
      // 344: goto 34c
      // 347: aload 15
      // 349: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 34c: bipush 2
      // 34d: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 350: astore 10
      // 352: aload 10
      // 354: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
      // 357: astore 24
      // 359: aload 24
      // 35b: new java/awt/Color
      // 35e: dup
      // 35f: bipush 0
      // 360: bipush 0
      // 361: bipush 0
      // 362: bipush 0
      // 363: invokespecial java/awt/Color.<init> (IIII)V
      // 366: invokevirtual java/awt/Graphics2D.setBackground (Ljava/awt/Color;)V
      // 369: aload 24
      // 36b: bipush 0
      // 36c: bipush 0
      // 36d: aload 10
      // 36f: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 372: aload 10
      // 374: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 377: invokevirtual java/awt/Graphics2D.clearRect (IIII)V
      // 37a: aload 24
      // 37c: invokevirtual java/awt/Graphics2D.dispose ()V
      // 37f: aload 10
      // 381: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
      // 384: astore 24
      // 386: aload 24
      // 388: aload 15
      // 38a: iload 18
      // 38c: iload 19
      // 38e: aconst_null
      // 38f: invokevirtual java/awt/Graphics2D.drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
      // 392: pop
      // 393: aload 24
      // 395: invokevirtual java/awt/Graphics2D.dispose ()V
      // 398: new java/awt/image/BufferedImage
      // 39b: dup
      // 39c: aload 10
      // 39e: invokevirtual java/awt/image/BufferedImage.getColorModel ()Ljava/awt/image/ColorModel;
      // 3a1: aload 10
      // 3a3: aconst_null
      // 3a4: invokevirtual java/awt/image/BufferedImage.copyData (Ljava/awt/image/WritableRaster;)Ljava/awt/image/WritableRaster;
      // 3a7: aload 10
      // 3a9: invokevirtual java/awt/image/BufferedImage.isAlphaPremultiplied ()Z
      // 3ac: aconst_null
      // 3ad: invokespecial java/awt/image/BufferedImage.<init> (Ljava/awt/image/ColorModel;Ljava/awt/image/WritableRaster;ZLjava/util/Hashtable;)V
      // 3b0: astore 25
      // 3b2: aload 4
      // 3b4: iload 14
      // 3b6: sipush 26031
      // 3b9: ldc2_w 5298345933166941953
      // 3bc: lload 1
      // 3bd: lxor
      // 3be: pop2
      // 3bf: pop
      // 3c0: ldc "astralis/gif_frames/"
      // 3c2: dup_x2
      // 3c3: pop
      // 3c4: sipush 7156
      // 3c7: ldc2_w 3193684922832808275
      // 3ca: lload 1
      // 3cb: lxor
      // 3cc: pop2
      // 3cd: pop
      // 3ce: ldc_w "_frame_"
      // 3d1: swap
      // 3d2: sipush 19267
      // 3d5: ldc2_w 828446140701030894
      // 3d8: lload 1
      // 3d9: lxor
      // 3da: pop2
      // 3db: pop
      // 3dc: ldc_w ".png"
      // 3df: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 3e4: astore 26
      // 3e6: aload 25
      // 3e8: sipush 26961
      // 3eb: ldc2_w 3378185610447657961
      // 3ee: lload 1
      // 3ef: lxor
      // 3f0: pop2
      // 3f1: pop
      // 3f2: ldc_w "png"
      // 3f5: new java/io/File
      // 3f8: dup
      // 3f9: aload 26
      // 3fb: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 3fe: invokestatic javax/imageio/ImageIO.write (Ljava/awt/image/RenderedImage;Ljava/lang/String;Ljava/io/File;)Z
      // 401: pop
      // 402: aload 9
      // 404: iload 14
      // 406: aload 26
      // 408: aastore
      // 409: aload 17
      // 40b: sipush 644
      // 40e: ldc2_w 6679307204533973038
      // 411: lload 1
      // 412: lxor
      // 413: pop2
      // 414: pop
      // 415: ldc_w "restoreToBackgroundColor"
      // 418: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 41b: aload 3
      // 41c: ifnull 467
      // 41f: ifeq 44e
      // 422: goto 429
      // 425: invokestatic cc/astralis/hee.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 428: athrow
      // 429: aload 10
      // 42b: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
      // 42e: astore 27
      // 430: aload 27
      // 432: getstatic java/awt/AlphaComposite.Clear Ljava/awt/AlphaComposite;
      // 435: invokevirtual java/awt/Graphics2D.setComposite (Ljava/awt/Composite;)V
      // 438: aload 27
      // 43a: iload 18
      // 43c: iload 19
      // 43e: iload 20
      // 440: iload 21
      // 442: invokevirtual java/awt/Graphics2D.fillRect (IIII)V
      // 445: aload 27
      // 447: invokevirtual java/awt/Graphics2D.dispose ()V
      // 44a: aload 3
      // 44b: ifnonnull 46a
      // 44e: aload 17
      // 450: sipush 17957
      // 453: ldc2_w 6915643153607799962
      // 456: lload 1
      // 457: lxor
      // 458: pop2
      // 459: pop
      // 45a: ldc_w "restoreToPrevious"
      // 45d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 460: goto 467
      // 463: invokestatic cc/astralis/hee.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 466: athrow
      // 467: ifeq 46a
      // 46a: iinc 14 1
      // 46d: aload 3
      // 46e: ifnonnull 1a7
      // 471: getstatic cc/astralis/hee.bhs Ljava/util/Map;
      // 474: aload 0
      // 475: aload 9
      // 477: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 47c: pop
      // 47d: aload 9
      // 47f: astore 14
      // 481: aload 3
      // 482: ifnull 4a4
      // 485: aload 7
      // 487: ifnull 49f
      // 48a: goto 491
      // 48d: invokestatic cc/astralis/hee.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 490: athrow
      // 491: aload 7
      // 493: invokeinterface javax/imageio/stream/ImageInputStream.close ()V 1
      // 498: goto 49f
      // 49b: invokestatic cc/astralis/hee.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49e: athrow
      // 49f: aload 6
      // 4a1: invokevirtual javax/imageio/ImageReader.dispose ()V
      // 4a4: aload 14
      // 4a6: areturn
      // 4a7: astore 8
      // 4a9: aload 7
      // 4ab: aload 3
      // 4ac: ifnull 4bb
      // 4af: ifnull 4cc
      // 4b2: goto 4b9
      // 4b5: invokestatic cc/astralis/hee.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b8: athrow
      // 4b9: aload 7
      // 4bb: invokeinterface javax/imageio/stream/ImageInputStream.close ()V 1
      // 4c0: goto 4cc
      // 4c3: astore 9
      // 4c5: aload 8
      // 4c7: aload 9
      // 4c9: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 4cc: aload 8
      // 4ce: athrow
      // 4cf: astore 28
      // 4d1: aload 6
      // 4d3: invokevirtual javax/imageio/ImageReader.dispose ()V
      // 4d6: aload 28
      // 4d8: athrow
   }

   private static String ccs(String a) {
      long ax = hee.a ^ 118759768804771L;
      String axx = new File(a).getName();
      short var10001 = 18449;
      long var10002 = 3686098036767980020L ^ ax;
      String var10000 = axx.replaceAll("[^a-zA-Z0-9_-]", "");
      var10001 = 31622;
      var10002 = 874930749314976372L ^ ax;
      return var10000.replace(".gif", "");
   }

   public static void fnu() throws IOException {
      long a = hee.a ^ 137535479093331L;
      int[] var10000 = dar.abu();
      short var10001 = 26031;
      long var10002 = 5298348419814293944L ^ a;
      Path ax = Paths.get("astralis/gif_frames/");
      int[] axx = var10000;
      Path var4 = ax;
      byte var5 = 0;
      if (axx != null) {
         if (!Files.exists(ax)) {
            return;
         }

         var4 = ax;
         var5 = 0;
      }

      Files.walk(var4).sorted((axxx, axxxx) -> axxxx.compareTo(axxx)).map(Path::toFile).forEach(File::delete);
   }

   static {
      long var0 = a ^ 95350901950692L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[25];
      int var7 = 0;
      String var6 = "\u0090y\u0016¹\u0014³\u000b\u0096\u008e\u0082\u0085üÁ\u008e;ú\u0097Â\u009då}ÿ\u008b«\u0004\u0016z\u0014ù:þÈ\u0096êÇ\u0011½+ja8i¢ó\u001b0N\u0007Áø\u0097\u009d\u009b\u0019\u0084\u0096WÿUJþNÊxQ\u001dÁÑ\u0088\u0080ýÝ¢taM;ñÞÜh<Ó\u0094$(fI>5\u009c\u001fükÍx¢ gA\u0016ú@g\u0014{ôcO$ô\u000fbA½\r},u\u000e\u0080\u0098\u0092d#ã\u0015éh\r\u0010\u009eq£<SX\u0000vÔêÛL\u0004Ø#H8ßh`Ù¥K\u0099nç¡\u0001xÆ\u0095\\+&87'\u001bÖ\u001df\u0081æÄvâÄß`\u001a»\nåéÝõAÕê'\u0080¬\u0006©Û\u0086Meþ¨_Q\u0081(ð\t\u0088Ó\u0087\u0094O\u008e,Õ\u0002Ë\u0095\u0000¤p\bpùÝ¯\u0085\u0085l¶§IòÃ\u0085T\u0016&ó½\u009dt5\u0082»\u0010é\u0016(\u008b#Þ`S\u0083NªÁÍ¡n\u009f(\u009cÖ\u0091Võq!1¢Õ\u0090\u001bH\u0087\u0095Ôé\\\u0000{VAÓ\u0016à\u0000°¦8\u0080\u0001¿/\u000fu\t\u008cè\u008b¯\u0018ÃJÆ×ÊôHCa\u0015EKNÍìZ¥\u008d\u008eÒ±pXE\u0010h§]\u000fºùþ@ \u001bê¸¹OY9(êÛ2Ùp\u009aÖh1UE#ëV&©þ\u008dù\u0094£ãðcÂ\u0014¶\u0087|\u009fE\u0092e~\u008b0»ÞìÇ \u0091\u0003fÞ\u0089\u009c;ºgüLðý1üÁ\u0095í4¢ëUQ\u0006÷x¨¦þ\u009c|î FÞhÕoÇJ}ÿb^R,l\\wxL\u000b¦Ý\u0019\u0087¥ô\u008fÜÝ\u0004¿Áç(A\u0086\u001c¸Ô\u0012Í¤rê1ud)QÞwf\u0002<½õ]çVìÁi\u0001Õª<Ð%\u0002aù?µ]\u0018²\n]@4\u007fX6Ýçúb,\u0084MPjîöRá\u0099Êx(ãKì5\u0007+i\u007fS\u0013¨a<4Å.\u0085ngmpu\u008fâcb\u00ad\u0098S[\u008f\u0098®*\u0082 t'öú\u0018\"L)g\u0096®Å¹?»\u0011Ò\u0090®ÉxWî¢\u0095\u0012}[\u00ad(\u0097(>\u001f´Âò\u001do\u001eÕ-Îáà\u0091)Ù\u001a\u0004\u009ehâs\u0013\u0018ù¬§WP\u0016¯\u008d Ä4ß¦ç\u0010\u001e3\u0006\u0015&\u0010\u0098¦Í\u0001t\u0010K\u0082'\u0087(ý>¼ztÙ\u008a\u0004ü\u009f\u009fºM?3ÎPvN{´'\u0087\u000b>\"\u007f?ê\u0086ÿ\u0007\u0087Á&¹[<û/0Øbu\u0005vä½ ÞwJ>X\u0084I\u008f\u0085Ýc\u0085\u008eù\u0099Æ\u0015\u000fÒ^¶Ô,ZÆ«C\u0085Ú\u001dè\u0088©ÉYàR\u0094x)\u0010G)4:G±Ï_èß´ã\u008cÇ×z\u0010õñ\u0096Ôµ\u009fþ×J«\u0003K>®\u0016ä";
      int var8 = "\u0090y\u0016¹\u0014³\u000b\u0096\u008e\u0082\u0085üÁ\u008e;ú\u0097Â\u009då}ÿ\u008b«\u0004\u0016z\u0014ù:þÈ\u0096êÇ\u0011½+ja8i¢ó\u001b0N\u0007Áø\u0097\u009d\u009b\u0019\u0084\u0096WÿUJþNÊxQ\u001dÁÑ\u0088\u0080ýÝ¢taM;ñÞÜh<Ó\u0094$(fI>5\u009c\u001fükÍx¢ gA\u0016ú@g\u0014{ôcO$ô\u000fbA½\r},u\u000e\u0080\u0098\u0092d#ã\u0015éh\r\u0010\u009eq£<SX\u0000vÔêÛL\u0004Ø#H8ßh`Ù¥K\u0099nç¡\u0001xÆ\u0095\\+&87'\u001bÖ\u001df\u0081æÄvâÄß`\u001a»\nåéÝõAÕê'\u0080¬\u0006©Û\u0086Meþ¨_Q\u0081(ð\t\u0088Ó\u0087\u0094O\u008e,Õ\u0002Ë\u0095\u0000¤p\bpùÝ¯\u0085\u0085l¶§IòÃ\u0085T\u0016&ó½\u009dt5\u0082»\u0010é\u0016(\u008b#Þ`S\u0083NªÁÍ¡n\u009f(\u009cÖ\u0091Võq!1¢Õ\u0090\u001bH\u0087\u0095Ôé\\\u0000{VAÓ\u0016à\u0000°¦8\u0080\u0001¿/\u000fu\t\u008cè\u008b¯\u0018ÃJÆ×ÊôHCa\u0015EKNÍìZ¥\u008d\u008eÒ±pXE\u0010h§]\u000fºùþ@ \u001bê¸¹OY9(êÛ2Ùp\u009aÖh1UE#ëV&©þ\u008dù\u0094£ãðcÂ\u0014¶\u0087|\u009fE\u0092e~\u008b0»ÞìÇ \u0091\u0003fÞ\u0089\u009c;ºgüLðý1üÁ\u0095í4¢ëUQ\u0006÷x¨¦þ\u009c|î FÞhÕoÇJ}ÿb^R,l\\wxL\u000b¦Ý\u0019\u0087¥ô\u008fÜÝ\u0004¿Áç(A\u0086\u001c¸Ô\u0012Í¤rê1ud)QÞwf\u0002<½õ]çVìÁi\u0001Õª<Ð%\u0002aù?µ]\u0018²\n]@4\u007fX6Ýçúb,\u0084MPjîöRá\u0099Êx(ãKì5\u0007+i\u007fS\u0013¨a<4Å.\u0085ngmpu\u008fâcb\u00ad\u0098S[\u008f\u0098®*\u0082 t'öú\u0018\"L)g\u0096®Å¹?»\u0011Ò\u0090®ÉxWî¢\u0095\u0012}[\u00ad(\u0097(>\u001f´Âò\u001do\u001eÕ-Îáà\u0091)Ù\u001a\u0004\u009ehâs\u0013\u0018ù¬§WP\u0016¯\u008d Ä4ß¦ç\u0010\u001e3\u0006\u0015&\u0010\u0098¦Í\u0001t\u0010K\u0082'\u0087(ý>¼ztÙ\u008a\u0004ü\u009f\u009fºM?3ÎPvN{´'\u0087\u000b>\"\u007f?ê\u0086ÿ\u0007\u0087Á&¹[<û/0Øbu\u0005vä½ ÞwJ>X\u0084I\u008f\u0085Ýc\u0085\u008eù\u0099Æ\u0015\u000fÒ^¶Ô,ZÆ«C\u0085Ú\u001dè\u0088©ÉYàR\u0094x)\u0010G)4:G±Ï_èß´ã\u008cÇ×z\u0010õñ\u0096Ôµ\u009fþ×J«\u0003K>®\u0016ä"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var22 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var22;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[25];
                     short var15 = 13823;
                     long var20 = 6681130904718901584L ^ var0;
                     akf = "astralis/gif_frames/";
                     String[] var16 = new String[2];
                     bhs = new HashMap<>();
                     bjc(var16);
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var22;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\u0080~úq¬d¹2\u009aØÚei\u0086+Ö©³ÏåãÌ\u0012d\u0097má\u0018¸&\u0093¶(ê\u0017ÞÂ\u0013\u00ad$PÌù\u0012\u008bë \u0081ë¡\u0093+\u0083\u009e\t\u008b\u0082\u0093\u0098\u0097FBË\u0098\u000e\u00986W?\u00925\u0085¬";
                  var8 = "\u0080~úq¬d¹2\u009aØÚei\u0086+Ö©³ÏåãÌ\u0012d\u0097má\u0018¸&\u0093¶(ê\u0017ÞÂ\u0013\u00ad$PÌù\u0012\u008bë \u0081ë¡\u0093+\u0083\u009e\t\u008b\u0082\u0093\u0098\u0097FBË\u0098\u000e\u00986W?\u00925\u0085¬"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   public static void bjc(String[] var0) {
      fax = var0;
   }

   public static String[] hgm() {
      return fax;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7992;
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
            throw new RuntimeException("cc/astralis/hee", var10);
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
         throw new RuntimeException("cc/astralis/hee" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
