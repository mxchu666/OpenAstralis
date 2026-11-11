package cc.astralis;

import astralis.mixin.accessor.EntityVelocityUpdateS2CPacketAccessor;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2596;
import net.minecraft.class_2743;

public class heo extends hcr {
   private final adu fsb;
   private final bes ggt;
   private boolean bth;
   private int fqf;
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public heo(guu parentClass) {
      long ax = heo.a ^ 102234937253593L;
      short var10002 = 28680;
      long var10003 = 7208581237298988871L ^ ax;
      super(a, "Watchdog Fireball");
      short var4 = 31839;
      long var10004 = 562284155678690072L ^ ax;
      short var6 = 10186;
      long var10005 = 8678038681501061250L ^ ax;
      String[] var8 = new String[5];
      short var10008 = 25478;
      long var10009 = 1961991825402959053L ^ ax;
      var8[0] = "Boost";
      var10008 = 30616;
      var10009 = 5342108095321538774L ^ ax;
      var8[1] = "Flat";
      var10008 = 1725;
      var10009 = 7346473342842860028L ^ ax;
      var8[2] = "Opal";
      var10008 = 10473;
      var10009 = 8224925327334662061L ^ ax;
      var8[3] = "Chef";
      var10008 = 9598;
      var10009 = 6290308645009183288L ^ ax;
      var8[4] = "Chef-High";
      a.fsb = new adu("Mode", "Boost", var8);
      short var5 = 16379;
      var10004 = 1166545441157597371L ^ ax;
      a.ggt = new bes("Speed", 1.5F, 0.0F, 10.0F, 0.1F);
      a.dxe(new ffn[]{a.fsb, a.ggt});
   }

   @Override
   public void dil() {
      long a = heo.a ^ 110285652525833L;
      int[] var10000 = dar.abu();
      a.fqf = 0;
      int[] var3 = var10000;
      if (var3 != null) {
         if (dar.gqy().aws().diy(dqk.class).dsv()) {
            dar.gqy().aws().diy(dqk.class).fga(false);
            short var4 = 30032;
            long var10001 = 1900502418661400515L ^ a;
            bpa.dhu("Velocity module was disabled to prevent conflicts.");
         }

         super.dil();
      }
   }

   @Override
   public void cbw() {
      long a = heo.a ^ 71140425762012L;
      int[] var3 = dar.abu();
      if (var3 != null) {
         if (!dar.gqy().aws().diy(dqk.class).dsv()) {
            dar.gqy().aws().diy(dqk.class).fga(true);
         }

         a.fqf = 0;
         a.bth = false;
         super.cbw();
      }
   }

   @gdz
   public void gub(fxx event) {
      long ax;
      int[] axx;
      Object var7;
      label261: {
         ax = heo.a ^ 13109707303017L;
         axx = dar.abu();
         int var10000 = chi.field_1724.field_6235;
         if (axx != null) {
            if (chi.field_1724.field_6235 >= 3) {
               a.bth = true;
            }

            var7 = a;
            if (axx == null) {
               break label261;
            }

            var10000 = a.bth;
         }

         if (var10000 != 0) {
            a.fqf++;
         }

         var7 = a.fsb.dnp();
      }

      String var5 = (String)var7;
      byte var6 = -1;
      var8 = var5.hashCode();
      label251:
      if (axx != null) {
         switch (var8) {
            case 2192281:
               short var10001 = 10065;
               long var10002 = 2963629894454339243L ^ ax;
               var8 = var5.equals("Flat");
               if (axx == null) {
                  break label251;
               }

               if (var8 == 0) {
                  break;
               }

               var6 = 0;
               if (axx != null) {
                  break;
               }
            case 2464236:
               short var10 = 32380;
               long var20 = 6229714018358247310L ^ ax;
               var8 = var5.equals("Opal");
               if (axx == null) {
                  break label251;
               }

               if (var8 == 0) {
                  break;
               }

               var6 = 1;
               if (axx != null) {
                  break;
               }
            case 2099174:
               short var11 = 23482;
               long var21 = 4722431185437399619L ^ ax;
               var8 = var5.equals("Chef");
               if (axx == null) {
                  break label251;
               }

               if (var8 == 0) {
                  break;
               }

               var6 = 2;
               if (axx != null) {
                  break;
               }
            case -1864144055:
               short var12 = 12560;
               long var22 = 3249769772129939693L ^ ax;
               var8 = var5.equals("Chef-High");
               if (axx == null) {
                  break label251;
               }

               if (var8 != 0) {
                  var6 = 3;
               }
         }

         var8 = var6;
      }

      label227:
      if (axx != null) {
         label266: {
            label276: {
               switch (var8) {
                  case 0:
                     int var14;
                     label269: {
                        var8 = a.fqf;
                        if (axx != null) {
                           if (a.fqf > 0) {
                              var8 = a.fqf;
                              short var13 = 11881;
                              long var23 = 4679312769892686908L ^ ax;
                              var14 = 30;
                              if (axx == null) {
                                 break label269;
                              }

                              if (a.fqf < 30) {
                                 chi.field_1724.method_18800(chi.field_1724.method_18798().field_1352, 0.01, chi.field_1724.method_18798().field_1350);
                                 if (axx != null) {
                                    break label266;
                                 }
                              }
                           }

                           var8 = a.fqf;
                        }

                        if (axx == null) {
                           break label227;
                        }

                        var14 = b<"q">(11243, 741294005178079675L ^ ax);
                     }

                     if (var8 < var14) {
                        break label266;
                     }

                     a.clv().gxo();
                     if (axx != null) {
                        break label266;
                     }
                  case 1:
                     if (a.fqf == 1) {
                        chi.field_1724
                           .method_18800(
                              chi.field_1724.method_18798().field_1352,
                              chi.field_1724.method_18798().field_1351 + 0.061,
                              chi.field_1724.method_18798().field_1350
                           );
                        if (axx != null) {
                           break label266;
                        }
                     }

                     chi.field_1724
                        .method_18800(
                           chi.field_1724.method_18798().field_1352,
                           chi.field_1724.method_18798().field_1351 + 0.0283,
                           chi.field_1724.method_18798().field_1350
                        );
                     if (axx != null) {
                        break label266;
                     }
                  case 2:
                     break;
                  case 3:
                     break label276;
                  default:
                     break label266;
               }

               int var15;
               var8 = a.fqf;
               var15 = 1;
               label207:
               if (axx != null) {
                  if (a.fqf >= 1) {
                     var8 = a.fqf;
                     var15 = b<"q">(21839, 7976565332477732638L ^ ax);
                     if (axx == null) {
                        break label207;
                     }

                     if (var8 <= var15) {
                        chi.field_1724.method_18800(chi.field_1724.method_18798().field_1352, 0.7 - a.fqf * 0.015, chi.field_1724.method_18798().field_1350);
                        if (axx != null) {
                           break label266;
                        }
                     }
                  }

                  var8 = a.fqf;
                  if (axx == null) {
                     break label227;
                  }

                  short var16 = 11463;
                  long var24 = 2943661761614651028L ^ ax;
                  var15 = 33;
               }

               if (var8 <= var15) {
                  break label266;
               }

               a.clv().gxo();
               if (axx != null) {
                  break label266;
               }
            }

            short var17;
            var8 = a.fqf;
            var17 = 1;
            label185:
            if (axx != null) {
               if (a.fqf >= 1) {
                  var8 = a.fqf;
                  var17 = 9375;
                  long var25 = 1653456697773364937L ^ ax;
                  var17 = 28;
                  if (axx == null) {
                     break label185;
                  }

                  if (a.fqf <= 28) {
                     chi.field_1724
                        .method_18800(
                           chi.field_1724.method_18798().field_1352, (evd.dbj() ? 0.85 : 1.25) - a.fqf * 0.016, chi.field_1724.method_18798().field_1350
                        );
                     if (axx != null) {
                        break label266;
                     }
                  }
               }

               var8 = a.fqf;
               if (axx == null) {
                  break label227;
               }

               var17 = 10279;
               long var26 = 1101827452964575859L ^ ax;
               var17 = 28;
            }

            if (var8 > var17) {
               a.clv().gxo();
            }
         }

         var8 = chi.field_1724.method_24828();
      }

      label272: {
         if (axx != null) {
            if (var8 == 0) {
               return;
            }

            var7 = a;
            if (axx == null) {
               break label272;
            }

            var8 = a.fqf;
         }

         if (var8 <= 5) {
            return;
         }

         var7 = a;
      }

      ((heo)var7).clv().gxo();
   }

   @gdz
   public void azn(elx event) {
      long ax = heo.a ^ 11283878428559L;
      int[] var4 = dar.abu();
      int var10000 = a.bth;
      if (var4 != null) {
         if (!a.bth) {
            return;
         }

         var10000 = evd.dbj();
      }

      if (var4 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = chi.field_1724.field_6235;
      }

      label112: {
         short var10001 = 10966;
         long var10002 = 3537298817153421159L ^ ax;
         short var8 = 9;
         if (var4 != null) {
            label95: {
               label94:
               if (var10000 == 9) {
                  label92: {
                     label91: {
                        label115: {
                           var8 = 25478;
                           var10002 = 1961937297814582683L ^ ax;
                           var10000 = a.fsb.emb("Boost");
                           if (var4 != null) {
                              if (var10000 != 0) {
                                 break label115;
                              }

                              var8 = 32380;
                              var10002 = 6229712262049917032L ^ ax;
                              var10000 = a.fsb.emb("Opal");
                           }

                           if (var4 == null) {
                              break label92;
                           }

                           if (var10000 == 0) {
                              break label91;
                           }
                        }

                        evd.fdo(a, a.ggt.dnp().floatValue());
                        if (var4 != null) {
                           break label94;
                        }
                     }

                     var8 = 10065;
                     var10002 = 2963628041907941709L ^ ax;
                     var10000 = a.fsb.emb("Flat");
                  }

                  if (var4 != null) {
                     if (var10000 != 0) {
                        short var5 = 1806;
                        long var12 = 2745933319000559901L ^ ax;
                        bpa.dhu("flat");
                        if (var4 != null) {
                           break label94;
                        }
                     }

                     String var6 = a.fsb.dnp();
                     var8 = 23482;
                     var10002 = 4722432729019043237L ^ ax;
                     var10000 = var6.contains("Chef");
                  }

                  if (var4 == null) {
                     break label95;
                  }

                  if (var10000 != 0) {
                     short var7 = 27671;
                     long var14 = 2658335181150714381L ^ ax;
                     bpa.dhu("cjef");
                     evd.fdo(a, 1.4);
                  }
               }

               var10000 = chi.field_1724.field_6235;
            }

            if (var4 == null) {
               break label112;
            }

            var8 = 25385;
            var10002 = 3578041145376736925L ^ ax;
            var8 = 8;
         }

         if (var10000 != var8) {
            return;
         }

         var8 = 10065;
         var10002 = 2963628041907941709L ^ ax;
         var10000 = a.fsb.emb("Flat");
      }

      if (var10000 != 0) {
         evd.fdo(a, 1.6);
      }
   }

   @gdz
   public void emz(amo event) {
      long ax = heo.a ^ 50753275424618L;
      int[] var10000 = dar.abu();
      class_2596 axx = a.bed();
      int[] axxx = var10000;
      class_2596 var8 = axx;
      if (axxx != null) {
         if (!(axx instanceof class_2743)) {
            return;
         }

         var8 = axx;
      }

      class_2743 axxxx = (class_2743)var8;
      EntityVelocityUpdateS2CPacketAccessor axxxxx = (EntityVelocityUpdateS2CPacketAccessor)axxxx;
      if (axxxxx.getEntityId() == chi.field_1724.method_5628()) {
         ;
      }
   }

   static {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at org.jetbrains.java.decompiler.util.collections.SFormsFastMapDirect.getCopy(SFormsFastMapDirect.java:57)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.getFilteredOutMap(SFormsConstructor.java:282)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.mergeInVarMaps(SFormsConstructor.java:241)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.ssaStatements(SFormsConstructor.java:107)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:94)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SSAUConstructorSparseEx.splitVariables(SSAUConstructorSparseEx.java:43)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:65)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:299)
      //
      // Bytecode:
      // 000: ldc2_w 111049558493083
      // 003: putstatic cc/astralis/heo.a J
      // 006: new java/util/HashMap
      // 009: dup
      // 00a: bipush 13
      // 00c: invokespecial java/util/HashMap.<init> (I)V
      // 00f: putstatic cc/astralis/heo.f Ljava/util/Map;
      // 012: getstatic cc/astralis/heo.a J
      // 015: ldc2_w 25988019469809
      // 018: lxor
      // 019: lstore 11
      // 01b: ldc_w "DES/CBC/PKCS5Padding"
      // 01e: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 021: dup
      // 022: astore 13
      // 024: bipush 2
      // 025: ldc_w "DES"
      // 028: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 02b: bipush 8
      // 02d: newarray 8
      // 02f: dup
      // 030: bipush 0
      // 031: lload 11
      // 033: bipush 56
      // 035: lushr
      // 036: l2i
      // 037: i2b
      // 038: bastore
      // 039: bipush 1
      // 03a: istore 14
      // 03c: iload 14
      // 03e: bipush 8
      // 040: if_icmpge 05a
      // 043: dup
      // 044: iload 14
      // 046: lload 11
      // 048: iload 14
      // 04a: bipush 8
      // 04c: imul
      // 04d: lshl
      // 04e: bipush 56
      // 050: lushr
      // 051: l2i
      // 052: i2b
      // 053: bastore
      // 054: iinc 14 1
      // 057: goto 03c
      // 05a: new javax/crypto/spec/DESKeySpec
      // 05d: dup_x1
      // 05e: swap
      // 05f: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 062: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 065: new javax/crypto/spec/IvParameterSpec
      // 068: dup
      // 069: bipush 8
      // 06b: newarray 8
      // 06d: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 070: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 073: bipush 16
      // 075: anewarray 50
      // 078: astore 20
      // 07a: bipush 0
      // 07b: istore 18
      // 07d: ldc_w "`ð\u008dO\n:\u009aE\u0011\u0012\u0093|ÑCçé\u0010\u0084VF\u008a¥_\u0082\u0004ÑÄâ£¦HÇI\u0010ç\u0000\u0013åLN¿âäÃyäû\u0005ÖzXkô;\u0011²\u0095ú\u0096bò-·\u0019!tz\u0005§EJ\u0003|í\u001a+MÅTâ<\u0004\u008d\u0014&¸\u0099è\u0084\t\u009b·´?ÑT\u008dþú«:«\u0096\u0088\u0091Çð4\u0019\u0017ep¦),S\u001c=.Ò!\u0002ðÝ\u0085ÎgC\u0014¥¢G\u009c0£AíÂÔ\u0010¡À6;ëýYµ\u0013²\u008ck'ý§²\u0010õªFåt´·}¢éË {\u000b.È\u0018ÁÍ3\u009a8\u0084\u0010\u0097A\u0088¹¡§ËÌ\u009b\u0093º/ð«\n\u0006\u0001\u0010Øm¤\u0091\u0097å:¡\u0010Ìo'×þÉ\u0080\u0010Åîâ\u001f\u001awXvÔ\u00004µ)\u0092U\u009a\u0010¿\u0015ù\u00916u \u00adø($û;ãÄO\u0010¤\u007fÛ§W\u0083!R^Cd\u00809\u001c\ri\u0010ð1aÓM.d\u001cZr\u0018b\fó¸H\u0010{n^\fy\u008f§-Ö:AöÔ¡áL\u0018\u009e J\u0089ý£m\u009eºE\u009aÔ|ôÏø\u0005\n\u008a×[\u0083\u001b$"
      // 080: dup
      // 081: astore 17
      // 083: invokevirtual java/lang/String.length ()I
      // 086: istore 19
      // 088: bipush 16
      // 08a: istore 16
      // 08c: bipush -1
      // 08d: istore 15
      // 08f: iinc 15 1
      // 092: aload 17
      // 094: iload 15
      // 096: dup
      // 097: iload 16
      // 099: iadd
      // 09a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 09d: bipush -1
      // 09e: goto 11b
      // 0a1: aload 20
      // 0a3: swap
      // 0a4: iload 18
      // 0a6: iinc 18 1
      // 0a9: swap
      // 0aa: aastore
      // 0ab: iload 15
      // 0ad: iload 16
      // 0af: iadd
      // 0b0: dup
      // 0b1: istore 15
      // 0b3: iload 19
      // 0b5: if_icmpge 0c4
      // 0b8: aload 17
      // 0ba: iload 15
      // 0bc: invokevirtual java/lang/String.charAt (I)C
      // 0bf: istore 16
      // 0c1: goto 08f
      // 0c4: ldc_w "`ÎE«L`=ýòú\u0003ï9åÚ\u0084({îá7Q\u0086¹\u0095Ã\u008c\n\n$´ \u0011\u001b^ctÉ¢\u0002Ø\u00031m\u0093û \u001c¼\u009eøu¢ñÛÈ\u0011"
      // 0c7: dup
      // 0c8: astore 17
      // 0ca: invokevirtual java/lang/String.length ()I
      // 0cd: istore 19
      // 0cf: bipush 16
      // 0d1: istore 16
      // 0d3: bipush -1
      // 0d4: istore 15
      // 0d6: iinc 15 1
      // 0d9: aload 17
      // 0db: iload 15
      // 0dd: dup
      // 0de: iload 16
      // 0e0: iadd
      // 0e1: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0e4: bipush 0
      // 0e5: goto 11b
      // 0e8: aload 20
      // 0ea: swap
      // 0eb: iload 18
      // 0ed: iinc 18 1
      // 0f0: swap
      // 0f1: aastore
      // 0f2: iload 15
      // 0f4: iload 16
      // 0f6: iadd
      // 0f7: dup
      // 0f8: istore 15
      // 0fa: iload 19
      // 0fc: if_icmpge 10b
      // 0ff: aload 17
      // 101: iload 15
      // 103: invokevirtual java/lang/String.charAt (I)C
      // 106: istore 16
      // 108: goto 0d6
      // 10b: aload 20
      // 10d: putstatic cc/astralis/heo.d [Ljava/lang/String;
      // 110: bipush 16
      // 112: anewarray 50
      // 115: putstatic cc/astralis/heo.e [Ljava/lang/String;
      // 118: goto 144
      // 11b: swap
      // 11c: ldc_w "ISO-8859-1"
      // 11f: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 122: aload 13
      // 124: swap
      // 125: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 128: astore 21
      // 12a: aload 21
      // 12c: invokestatic cc/astralis/heo.a ([B)Ljava/lang/String;
      // 12f: invokevirtual java/lang/String.intern ()Ljava/lang/String;
      // 132: swap
      // 133: tableswitch -146 0 0 -75
      // 144: new java/util/HashMap
      // 147: dup
      // 148: bipush 13
      // 14a: invokespecial java/util/HashMap.<init> (I)V
      // 14d: putstatic cc/astralis/heo.i Ljava/util/Map;
      // 150: ldc_w "DES/CBC/NoPadding"
      // 153: invokestatic javax/crypto/Cipher.getInstance (Ljava/lang/String;)Ljavax/crypto/Cipher;
      // 156: dup
      // 157: astore 0
      // 158: bipush 2
      // 159: ldc_w "DES"
      // 15c: invokestatic javax/crypto/SecretKeyFactory.getInstance (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
      // 15f: bipush 8
      // 161: newarray 8
      // 163: dup
      // 164: bipush 0
      // 165: lload 11
      // 167: bipush 56
      // 169: lushr
      // 16a: l2i
      // 16b: i2b
      // 16c: bastore
      // 16d: bipush 1
      // 16e: istore 1
      // 16f: iload 1
      // 170: bipush 8
      // 172: if_icmpge 18a
      // 175: dup
      // 176: iload 1
      // 177: lload 11
      // 179: iload 1
      // 17a: bipush 8
      // 17c: imul
      // 17d: lshl
      // 17e: bipush 56
      // 180: lushr
      // 181: l2i
      // 182: i2b
      // 183: bastore
      // 184: iinc 1 1
      // 187: goto 16f
      // 18a: new javax/crypto/spec/DESKeySpec
      // 18d: dup_x1
      // 18e: swap
      // 18f: invokespecial javax/crypto/spec/DESKeySpec.<init> ([B)V
      // 192: invokevirtual javax/crypto/SecretKeyFactory.generateSecret (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
      // 195: new javax/crypto/spec/IvParameterSpec
      // 198: dup
      // 199: bipush 8
      // 19b: newarray 8
      // 19d: invokespecial javax/crypto/spec/IvParameterSpec.<init> ([B)V
      // 1a0: invokevirtual javax/crypto/Cipher.init (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      // 1a3: bipush 8
      // 1a5: newarray 11
      // 1a7: astore 6
      // 1a9: bipush 0
      // 1aa: istore 3
      // 1ab: ldc_w "SãpÏùZä7Ý*'\u0098Z¦\u0018Ôè¶\u0095¬PIÆêng\u0018\u009a\u0005\u001e¤ºþ\u009e¿sp«wR\u0088\u0086\u0082°\t\u0014V\u0098"
      // 1ae: dup
      // 1af: astore 4
      // 1b1: invokevirtual java/lang/String.length ()I
      // 1b4: istore 5
      // 1b6: bipush 0
      // 1b7: istore 2
      // 1b8: aload 4
      // 1ba: iload 2
      // 1bb: iinc 2 8
      // 1be: iload 2
      // 1bf: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1c2: ldc_w "ISO-8859-1"
      // 1c5: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 1c8: astore 7
      // 1ca: aload 6
      // 1cc: iload 3
      // 1cd: iinc 3 1
      // 1d0: aload 7
      // 1d2: bipush 0
      // 1d3: baload
      // 1d4: i2l
      // 1d5: ldc2_w 255
      // 1d8: land
      // 1d9: bipush 56
      // 1db: lshl
      // 1dc: aload 7
      // 1de: bipush 1
      // 1df: baload
      // 1e0: i2l
      // 1e1: ldc2_w 255
      // 1e4: land
      // 1e5: bipush 48
      // 1e7: lshl
      // 1e8: lor
      // 1e9: aload 7
      // 1eb: bipush 2
      // 1ec: baload
      // 1ed: i2l
      // 1ee: ldc2_w 255
      // 1f1: land
      // 1f2: bipush 40
      // 1f4: lshl
      // 1f5: lor
      // 1f6: aload 7
      // 1f8: bipush 3
      // 1f9: baload
      // 1fa: i2l
      // 1fb: ldc2_w 255
      // 1fe: land
      // 1ff: bipush 32
      // 201: lshl
      // 202: lor
      // 203: aload 7
      // 205: bipush 4
      // 206: baload
      // 207: i2l
      // 208: ldc2_w 255
      // 20b: land
      // 20c: bipush 24
      // 20e: lshl
      // 20f: lor
      // 210: aload 7
      // 212: bipush 5
      // 213: baload
      // 214: i2l
      // 215: ldc2_w 255
      // 218: land
      // 219: bipush 16
      // 21b: lshl
      // 21c: lor
      // 21d: aload 7
      // 21f: bipush 6
      // 221: baload
      // 222: i2l
      // 223: ldc2_w 255
      // 226: land
      // 227: bipush 8
      // 229: lshl
      // 22a: lor
      // 22b: aload 7
      // 22d: bipush 7
      // 22f: baload
      // 230: i2l
      // 231: ldc2_w 255
      // 234: land
      // 235: lor
      // 236: bipush -1
      // 237: goto 2e7
      // 23a: lastore
      // 23b: iload 2
      // 23c: iload 5
      // 23e: if_icmplt 1b8
      // 241: ldc_w "\u0089Då<[Ê!\u0082þ\t\u0011\u0097M±*Ý"
      // 244: dup
      // 245: astore 4
      // 247: invokevirtual java/lang/String.length ()I
      // 24a: istore 5
      // 24c: bipush 0
      // 24d: istore 2
      // 24e: aload 4
      // 250: iload 2
      // 251: iinc 2 8
      // 254: iload 2
      // 255: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 258: ldc_w "ISO-8859-1"
      // 25b: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 25e: astore 7
      // 260: aload 6
      // 262: iload 3
      // 263: iinc 3 1
      // 266: aload 7
      // 268: bipush 0
      // 269: baload
      // 26a: i2l
      // 26b: ldc2_w 255
      // 26e: land
      // 26f: bipush 56
      // 271: lshl
      // 272: aload 7
      // 274: bipush 1
      // 275: baload
      // 276: i2l
      // 277: ldc2_w 255
      // 27a: land
      // 27b: bipush 48
      // 27d: lshl
      // 27e: lor
      // 27f: aload 7
      // 281: bipush 2
      // 282: baload
      // 283: i2l
      // 284: ldc2_w 255
      // 287: land
      // 288: bipush 40
      // 28a: lshl
      // 28b: lor
      // 28c: aload 7
      // 28e: bipush 3
      // 28f: baload
      // 290: i2l
      // 291: ldc2_w 255
      // 294: land
      // 295: bipush 32
      // 297: lshl
      // 298: lor
      // 299: aload 7
      // 29b: bipush 4
      // 29c: baload
      // 29d: i2l
      // 29e: ldc2_w 255
      // 2a1: land
      // 2a2: bipush 24
      // 2a4: lshl
      // 2a5: lor
      // 2a6: aload 7
      // 2a8: bipush 5
      // 2a9: baload
      // 2aa: i2l
      // 2ab: ldc2_w 255
      // 2ae: land
      // 2af: bipush 16
      // 2b1: lshl
      // 2b2: lor
      // 2b3: aload 7
      // 2b5: bipush 6
      // 2b7: baload
      // 2b8: i2l
      // 2b9: ldc2_w 255
      // 2bc: land
      // 2bd: bipush 8
      // 2bf: lshl
      // 2c0: lor
      // 2c1: aload 7
      // 2c3: bipush 7
      // 2c5: baload
      // 2c6: i2l
      // 2c7: ldc2_w 255
      // 2ca: land
      // 2cb: lor
      // 2cc: bipush 0
      // 2cd: goto 2e7
      // 2d0: lastore
      // 2d1: iload 2
      // 2d2: iload 5
      // 2d4: if_icmplt 24e
      // 2d7: aload 6
      // 2d9: putstatic cc/astralis/heo.g [J
      // 2dc: bipush 8
      // 2de: anewarray 439
      // 2e1: putstatic cc/astralis/heo.h [Ljava/lang/Integer;
      // 2e4: goto 3c0
      // 2e7: dup_x2
      // 2e8: pop
      // 2e9: lstore 8
      // 2eb: bipush 8
      // 2ed: newarray 8
      // 2ef: dup
      // 2f0: bipush 0
      // 2f1: lload 8
      // 2f3: bipush 56
      // 2f5: lushr
      // 2f6: l2i
      // 2f7: i2b
      // 2f8: bastore
      // 2f9: dup
      // 2fa: bipush 1
      // 2fb: lload 8
      // 2fd: bipush 48
      // 2ff: lushr
      // 300: l2i
      // 301: i2b
      // 302: bastore
      // 303: dup
      // 304: bipush 2
      // 305: lload 8
      // 307: bipush 40
      // 309: lushr
      // 30a: l2i
      // 30b: i2b
      // 30c: bastore
      // 30d: dup
      // 30e: bipush 3
      // 30f: lload 8
      // 311: bipush 32
      // 313: lushr
      // 314: l2i
      // 315: i2b
      // 316: bastore
      // 317: dup
      // 318: bipush 4
      // 319: lload 8
      // 31b: bipush 24
      // 31d: lushr
      // 31e: l2i
      // 31f: i2b
      // 320: bastore
      // 321: dup
      // 322: bipush 5
      // 323: lload 8
      // 325: bipush 16
      // 327: lushr
      // 328: l2i
      // 329: i2b
      // 32a: bastore
      // 32b: dup
      // 32c: bipush 6
      // 32e: lload 8
      // 330: bipush 8
      // 332: lushr
      // 333: l2i
      // 334: i2b
      // 335: bastore
      // 336: dup
      // 337: bipush 7
      // 339: lload 8
      // 33b: l2i
      // 33c: i2b
      // 33d: bastore
      // 33e: aload 0
      // 33f: swap
      // 340: invokevirtual javax/crypto/Cipher.doFinal ([B)[B
      // 343: astore 10
      // 345: aload 10
      // 347: bipush 0
      // 348: baload
      // 349: i2l
      // 34a: ldc2_w 255
      // 34d: land
      // 34e: bipush 56
      // 350: lshl
      // 351: aload 10
      // 353: bipush 1
      // 354: baload
      // 355: i2l
      // 356: ldc2_w 255
      // 359: land
      // 35a: bipush 48
      // 35c: lshl
      // 35d: lor
      // 35e: aload 10
      // 360: bipush 2
      // 361: baload
      // 362: i2l
      // 363: ldc2_w 255
      // 366: land
      // 367: bipush 40
      // 369: lshl
      // 36a: lor
      // 36b: aload 10
      // 36d: bipush 3
      // 36e: baload
      // 36f: i2l
      // 370: ldc2_w 255
      // 373: land
      // 374: bipush 32
      // 376: lshl
      // 377: lor
      // 378: aload 10
      // 37a: bipush 4
      // 37b: baload
      // 37c: i2l
      // 37d: ldc2_w 255
      // 380: land
      // 381: bipush 24
      // 383: lshl
      // 384: lor
      // 385: aload 10
      // 387: bipush 5
      // 388: baload
      // 389: i2l
      // 38a: ldc2_w 255
      // 38d: land
      // 38e: bipush 16
      // 390: lshl
      // 391: lor
      // 392: aload 10
      // 394: bipush 6
      // 396: baload
      // 397: i2l
      // 398: ldc2_w 255
      // 39b: land
      // 39c: bipush 8
      // 39e: lshl
      // 39f: lor
      // 3a0: aload 10
      // 3a2: bipush 7
      // 3a4: baload
      // 3a5: i2l
      // 3a6: ldc2_w 255
      // 3a9: land
      // 3aa: lor
      // 3ab: dup2_x1
      // 3ac: pop2
      // 3ad: tableswitch -371 0 0 -221
      // 3c0: return
   }

   private static String a(byte[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 1
      // 02: aload 0
      // 03: arraylength
      // 04: dup
      // 05: istore 2
      // 06: newarray 5
      // 08: astore 3
      // 09: bipush 0
      // 0a: istore 4
      // 0c: iload 4
      // 0e: iload 2
      // 0f: if_icmpge b2
      // 12: sipush 255
      // 15: aload 0
      // 16: iload 4
      // 18: baload
      // 19: iand
      // 1a: dup
      // 1b: istore 5
      // 1d: sipush 192
      // 20: if_icmpge 2f
      // 23: aload 3
      // 24: iload 1
      // 25: iinc 1 1
      // 28: iload 5
      // 2a: i2c
      // 2b: castore
      // 2c: goto ac
      // 2f: iload 5
      // 31: sipush 224
      // 34: if_icmpge 63
      // 37: iload 5
      // 39: bipush 31
      // 3b: iand
      // 3c: i2c
      // 3d: bipush 6
      // 3f: ishl
      // 40: i2c
      // 41: istore 6
      // 43: aload 0
      // 44: iinc 4 1
      // 47: iload 4
      // 49: baload
      // 4a: istore 5
      // 4c: iload 6
      // 4e: iload 5
      // 50: bipush 63
      // 52: iand
      // 53: i2c
      // 54: ior
      // 55: i2c
      // 56: istore 6
      // 58: aload 3
      // 59: iload 1
      // 5a: iinc 1 1
      // 5d: iload 6
      // 5f: castore
      // 60: goto ac
      // 63: iload 4
      // 65: iload 2
      // 66: bipush 2
      // 67: isub
      // 68: if_icmpge ac
      // 6b: iload 5
      // 6d: bipush 15
      // 6f: iand
      // 70: i2c
      // 71: bipush 12
      // 73: ishl
      // 74: i2c
      // 75: istore 6
      // 77: aload 0
      // 78: iinc 4 1
      // 7b: iload 4
      // 7d: baload
      // 7e: istore 5
      // 80: iload 6
      // 82: iload 5
      // 84: bipush 63
      // 86: iand
      // 87: i2c
      // 88: bipush 6
      // 8a: ishl
      // 8b: ior
      // 8c: i2c
      // 8d: istore 6
      // 8f: aload 0
      // 90: iinc 4 1
      // 93: iload 4
      // 95: baload
      // 96: istore 5
      // 98: iload 6
      // 9a: iload 5
      // 9c: bipush 63
      // 9e: iand
      // 9f: i2c
      // a0: ior
      // a1: i2c
      // a2: istore 6
      // a4: aload 3
      // a5: iload 1
      // a6: iinc 1 1
      // a9: iload 6
      // ab: castore
      // ac: iinc 4 1
      // af: goto 0c
      // b2: new java/lang/String
      // b5: dup
      // b6: aload 3
      // b7: bipush 0
      // b8: iload 1
      // b9: invokespecial java/lang/String.<init> ([CII)V
      // bc: areturn
   }

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11778;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cc/astralis/heo", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("cc/astralis/heo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23972;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/heo", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("cc/astralis/heo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
