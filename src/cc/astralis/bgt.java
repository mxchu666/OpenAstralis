package cc.astralis;

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
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL45;

public class bgt {
   private final int erc;
   private final bti avp;
   private static final long a = 92896614117560L;
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public bgt(int glVersion) {
      a.erc = a;
      a.avp = new bti();
   }

   public final bgt fag() {
      long a;
      int[] var3;
      int var8;
      label60: {
         label59: {
            a = bgt.a ^ 62566708988284L;
            int var10000 = 12034;
            long var10001 = 1291454044214445567L ^ a;
            GL45.glGetIntegerv(34016, a.avp.hdz());
            var10000 = (short)8641;
            var10001 = 3799691013244504862L ^ a;
            GL45.glActiveTexture(33984);
            int[] var5 = dar.abu();
            short var43 = 3768;
            long var10002 = 3720821660291490895L ^ a;
            GL45.glGetIntegerv(35725, a.avp.cgd());
            var3 = var5;
            var10000 = (short)12788;
            var10001 = 4768728832559110912L ^ a;
            GL45.glGetIntegerv(32873, a.avp.ddr());
            var10000 = a.erc;
            if (var3 != null) {
               short var45 = 29477;
               var10002 = 3938181704017189366L ^ a;
               if (a.erc < 330) {
                  var8 = GL.getCapabilities().GL_ARB_sampler_objects;
                  if (var3 == null) {
                     break label60;
                  }

                  if (var8 == 0) {
                     break label59;
                  }
               }

               short var9 = 12720;
               var10001 = 2027261614798429049L ^ a;
               var10000 = 35097;
            }

            GL45.glGetIntegerv(var10000, a.avp.foi());
         }

         short var10 = 22348;
         long var47 = 6411904697212648840L ^ a;
         GL45.glGetIntegerv(34964, a.avp.atr());
         var10 = 25324;
         var47 = 5859090135889479698L ^ a;
         GL45.glGetIntegerv(34229, a.avp.byw());
         var8 = a.erc;
      }

      short var49 = 20313;
      long var91 = 5710749811052258695L ^ a;
      var49 = 200;
      if (var3 != null) {
         if (var8 >= 200) {
            GL45.glGetIntegerv(a<"h">(9760, 5930954708961414274L ^ a), a.avp.chb());
         }

         short var12 = 31171;
         long var51 = 2213053560823059254L ^ a;
         GL45.glGetIntegerv(2978, a.avp.fnj());
         var12 = 28682;
         long var52 = 1858513178501356232L ^ a;
         GL45.glGetIntegerv(3088, a.avp.fhh());
         var12 = 9732;
         long var53 = 4393767138100956329L ^ a;
         GL45.glGetIntegerv(32969, a.avp.cxn());
         var12 = 14613;
         long var54 = 2204673735427085248L ^ a;
         GL45.glGetIntegerv(32968, a.avp.asf());
         var12 = 31727;
         long var55 = 715638982145708301L ^ a;
         GL45.glGetIntegerv(32971, a.avp.bsz());
         var12 = 13149;
         long var56 = 459926822029842861L ^ a;
         GL45.glGetIntegerv(32970, a.avp.cas());
         var12 = 17730;
         long var57 = 5450562247484256169L ^ a;
         GL45.glGetIntegerv(32777, a.avp.beb());
         var12 = 25191;
         long var58 = 5697086186979559580L ^ a;
         GL45.glGetIntegerv(34877, a.avp.eyq());
         var49 = 22319;
         var91 = 8038568794120633743L ^ a;
         a.avp.gg(GL45.glIsEnabled(3042));
         var49 = 7872;
         var91 = 1131825208440058907L ^ a;
         a.avp.ffi(GL45.glIsEnabled(2884));
         var49 = 18466;
         var91 = 415819330865472244L ^ a;
         a.avp.caa(GL45.glIsEnabled(2929));
         var49 = 6531;
         var91 = 3617000753995740017L ^ a;
         a.avp.aqd(GL45.glIsEnabled(2960));
         var49 = 16426;
         var91 = 6195904678232697551L ^ a;
         a.avp.fmt(GL45.glIsEnabled(3089));
         var8 = a.erc;
         var49 = 1785;
         var91 = 2324462247730637884L ^ a;
         var49 = 310;
      }

      if (var3 != null) {
         if (var8 >= var49) {
            var49 = 21256;
            var91 = 5120495071002737116L ^ a;
            a.avp.ffc(GL45.glIsEnabled(36765));
         }

         var49 = 20848;
         var91 = 5636080512761772984L ^ a;
         a.avp.dag(GL45.glGetBoolean(2930));
         short var20 = 31083;
         long var67 = 689888381970092951L ^ a;
         GL45.glGetIntegerv(35055, a.avp.eb());
         var20 = 14657;
         long var68 = 4627241689649927080L ^ a;
         GL45.glBindBuffer(35052, 0);
         var20 = 4732;
         long var69 = 4304464320030898358L ^ a;
         GL45.glGetIntegerv(3328, a.avp.bjm());
         var20 = 22540;
         long var70 = 6304394811692724930L ^ a;
         GL45.glGetIntegerv(3329, a.avp.hhg());
         var20 = 26338;
         long var71 = 1487335425411746888L ^ a;
         GL45.glGetIntegerv(3330, a.avp.bph());
         var20 = 4576;
         long var72 = 5875884563290848048L ^ a;
         GL45.glGetIntegerv(3332, a.avp.fq());
         var20 = 28056;
         long var73 = 3223853774809958247L ^ a;
         GL45.glGetIntegerv(3331, a.avp.ara());
         var20 = 5320;
         long var74 = 1032532097961033234L ^ a;
         GL45.glGetIntegerv(3333, a.avp.cb());
         var20 = 22735;
         long var75 = 1433442780643930721L ^ a;
         GL45.glGetIntegerv(3312, a.avp.brm());
         var20 = 16006;
         long var76 = 5263864901618848876L ^ a;
         GL45.glGetIntegerv(3313, a.avp.con());
         var20 = 7779;
         long var77 = 6242448426885739673L ^ a;
         GL45.glGetIntegerv(3317, a.avp.gvg());
         var20 = 2227;
         long var78 = 9117235776685531672L ^ a;
         GL45.glGetIntegerv(3314, a.avp.evg());
         var20 = 31788;
         long var79 = 7230093654839596756L ^ a;
         GL45.glGetIntegerv(3316, a.avp.deb());
         var20 = 16967;
         long var80 = 3996248098799528070L ^ a;
         GL45.glGetIntegerv(3315, a.avp.gzz());
         var8 = a.erc;
         var49 = 15484;
         var91 = 5178878031520028319L ^ a;
         var49 = 120;
      }

      if (var3 != null) {
         if (var8 >= var49) {
            short var34 = 29840;
            long var82 = 6182854763190296141L ^ a;
            GL45.glGetIntegerv(32876, a.avp.glh());
            var34 = 19409;
            long var83 = 7958556446562820405L ^ a;
            GL45.glGetIntegerv(32875, a.avp.hcl());
            var34 = 15607;
            long var84 = 2968374515314710072L ^ a;
            GL45.glGetIntegerv(32878, a.avp.cwc());
            var34 = 4976;
            long var85 = 9140221848463342044L ^ a;
            GL45.glGetIntegerv(32877, a.avp.eul());
         }

         short var38 = 7779;
         long var86 = 6242448426885739673L ^ a;
         GL45.glPixelStorei(3317, 1);
         var38 = 2227;
         long var87 = 9117235776685531672L ^ a;
         GL45.glPixelStorei(3314, 0);
         var38 = 31788;
         long var88 = 7230093654839596756L ^ a;
         GL45.glPixelStorei(3316, 0);
         var38 = 16967;
         long var89 = 3996248098799528070L ^ a;
         var8 = 3315;
         var49 = 0;
      }

      GL45.glPixelStorei(var8, var49);
      return a;
   }

   public final bgt hjq() {
      long a;
      int[] var3;
      int var6;
      label164: {
         label163: {
            a = bgt.a ^ 45585830316362L;
            int[] var10000 = dar.abu();
            GL45.glUseProgram(a.avp.cgd()[0]);
            var3 = var10000;
            var6 = (short)30816;
            long var10001 = 2221206674303537808L ^ a;
            GL45.glBindTexture(3553, a.avp.ddr()[0]);
            var6 = a.erc;
            short var43 = 284;
            long var10002 = 4376086038178769910L ^ a;
            int var44 = 330;
            if (var3 != null) {
               if (a.erc < 330) {
                  var6 = GL.getCapabilities().GL_ARB_sampler_objects;
                  if (var3 == null) {
                     break label164;
                  }

                  if (var6 == 0) {
                     break label163;
                  }
               }

               var6 = 0;
               var44 = a.avp.foi()[0];
            }

            GL45.glBindSampler(var6, var44);
         }

         GL45.glActiveTexture(a.avp.hdz()[0]);
         short var7 = 18217;
         GL45.glBindVertexArray(a.avp.byw()[0]);
         long var45 = 3940147669720002022L ^ a;
         GL45.glBindBuffer(34962, a.avp.atr()[0]);
         GL45.glBlendEquationSeparate(a.avp.beb()[0], a.avp.eyq()[0]);
         GL45.glBlendFuncSeparate(a.avp.cxn()[0], a.avp.asf()[0], a.avp.bsz()[0], a.avp.cas()[0]);
         var6 = a.avp.cdz();
      }

      label153: {
         if (var3 != null) {
            if (var6 != 0) {
               short var8 = 30692;
               long var46 = 1789257156398308608L ^ a;
               GL45.glEnable(3042);
               if (var3 != null) {
                  break label153;
               }
            }

            short var9 = 22319;
            long var47 = 8038549477190434233L ^ a;
            var6 = 3042;
         }

         GL45.glDisable(var6);
      }

      label146: {
         short var10 = a.avp.dep();
         if (var3 != null) {
            if (var10 != 0) {
               var10 = 2054;
               long var48 = 5931709286486155984L ^ a;
               GL45.glEnable(2884);
               if (var3 != null) {
                  break label146;
               }
            }

            var10 = 7872;
            long var49 = 1131842309737493549L ^ a;
            var10 = 2884;
         }

         GL45.glDisable(var10);
      }

      label139: {
         short var13 = a.avp.dpc();
         if (var3 != null) {
            if (var13 != 0) {
               var13 = 14567;
               long var50 = 2439881666960232960L ^ a;
               GL45.glEnable(2929);
               if (var3 != null) {
                  break label139;
               }
            }

            var13 = 18466;
            long var51 = 415836297407881922L ^ a;
            var13 = 2929;
         }

         GL45.glDisable(var13);
      }

      label132: {
         short var16 = a.avp.ghw();
         if (var3 != null) {
            if (var16 != 0) {
               var16 = 9413;
               long var52 = 3336722538035908096L ^ a;
               GL45.glEnable(2960);
               if (var3 != null) {
                  break label132;
               }
            }

            var16 = 6531;
            long var53 = 3617017871272751943L ^ a;
            var16 = 2960;
         }

         GL45.glDisable(var16);
      }

      label125: {
         short var19 = a.avp.dwg();
         if (var3 != null) {
            if (var19 != 0) {
               var19 = 22130;
               long var54 = 1797337549110017155L ^ a;
               GL45.glEnable(3089);
               if (var3 != null) {
                  break label125;
               }
            }

            var19 = 16426;
            long var55 = 6195923845416905465L ^ a;
            var19 = 3089;
         }

         GL45.glDisable(var19);
      }

      var6 = a.erc;
      short var56 = 29107;
      long var79 = 8793977175177124686L ^ a;
      var56 = 310;
      if (var3 != null) {
         label115:
         if (a.erc >= 310) {
            char var23 = a.avp.euz();
            if (var3 != null) {
               if (var23 != 0) {
                  short var24 = 17071;
                  long var58 = 2419198128547588181L ^ a;
                  GL45.glEnable(36765);
                  if (var3 != null) {
                     break label115;
                  }
               }

               short var25 = 21256;
               long var59 = 5120512174817442282L ^ a;
               var23 = '辝';
            }

            GL45.glDisable(var23);
         }

         var6 = a.erc;
         var56 = 8338;
         var79 = 2165981576535935570L ^ a;
         var56 = 200;
      }

      label168: {
         if (var3 != null) {
            if (var6 >= var56) {
               short var26 = 25617;
               long var61 = 4933433844941573834L ^ a;
               GL45.glPolygonMode(1032, a.avp.chb()[0]);
            }

            GL45.glViewport(a.avp.fnj()[0], a.avp.fnj()[1], a.avp.fnj()[2], a.avp.fnj()[3]);
            short var27 = 21713;
            GL45.glScissor(a.avp.fhh()[0], a.avp.fhh()[1], a.avp.fhh()[2], a.avp.fhh()[3]);
            long var62 = 3546040357192203776L ^ a;
            GL45.glPixelStorei(3328, a.avp.bjm()[0]);
            var27 = 30410;
            long var63 = 5848047446167542821L ^ a;
            GL45.glPixelStorei(3329, a.avp.hhg()[0]);
            var27 = 3391;
            long var64 = 717142486928992160L ^ a;
            GL45.glPixelStorei(3330, a.avp.bph()[0]);
            var27 = 16396;
            long var65 = 4106666152755489529L ^ a;
            GL45.glPixelStorei(3332, a.avp.fq()[0]);
            var27 = 3561;
            long var66 = 2531321326878172935L ^ a;
            GL45.glPixelStorei(3331, a.avp.ara()[0]);
            var27 = 19095;
            long var67 = 8866176888931344457L ^ a;
            GL45.glPixelStorei(3333, a.avp.cb()[0]);
            var27 = 15759;
            long var68 = 3197954781327923060L ^ a;
            GL45.glBindBuffer(35052, a.avp.eb()[0]);
            var27 = 23794;
            long var69 = 4792770359000397355L ^ a;
            GL45.glPixelStorei(3312, a.avp.brm()[0]);
            var27 = 29589;
            long var70 = 7769492727567505763L ^ a;
            GL45.glPixelStorei(3313, a.avp.con()[0]);
            var27 = 10167;
            long var71 = 2393310732121902422L ^ a;
            GL45.glPixelStorei(3317, a.avp.gvg()[0]);
            var27 = 30286;
            long var72 = 7113053722821876884L ^ a;
            GL45.glPixelStorei(3314, a.avp.evg()[0]);
            var27 = 22263;
            long var73 = 7455556299613699120L ^ a;
            GL45.glPixelStorei(3316, a.avp.deb()[0]);
            var27 = 9259;
            long var74 = 1861444149688241907L ^ a;
            GL45.glPixelStorei(3315, a.avp.gzz()[0]);
            var6 = a.erc;
            if (var3 == null) {
               break label168;
            }

            var56 = 12755;
            var79 = 8019354642002516739L ^ a;
            var56 = 120;
         }

         if (var6 >= var56) {
            short var40 = 14090;
            long var76 = 8385958319854394845L ^ a;
            GL45.glPixelStorei(32876, a.avp.glh()[0]);
            GL45.glPixelStorei(a<"h">(28687, 1455526891380071064L ^ a), a.avp.hcl()[0]);
            var40 = 15408;
            long var77 = 5755788281645373102L ^ a;
            GL45.glPixelStorei(32878, a.avp.cwc()[0]);
            var40 = 29364;
            long var78 = 2712936460080535597L ^ a;
            GL45.glPixelStorei(32877, a.avp.eul()[0]);
         }

         var6 = a.avp.cbk();
      }

      GL45.glDepthMask((boolean)var6);
      return a;
   }

   static {
      long var0 = a ^ 111024653590882L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[75];
      int var5 = 0;
      String var6 = "x:TÄ\u00976þM\u0095whÉ5\u0080\u001fJ\rñ.ì -y\u0001þp;ÉI²qa\u0098ÜAÚ\u001a\u0097Ûµ{\u0081'eô{c®'kÞFa`\u0089B\u001dä\u001eÅ\u0080¼Y¶/\u0084Óø6q9÷¯ÎZ_q\u008c,ª\u0082\u009eã£+\u0088g\u008d*ý¶\u001a\u001b¡¤\u0004\u0084\u001d6a^g\u0080y\u00126\u009cíg\u0082É³.Á\u0019Sû{÷ë°\u0095\u0090EüùAµs\u001a\u0002\u0097\u0085há@ó7\u0082ú»\u008aÃ\u008fÿPp\u0018rµxtmkC\u0017¡¬Å\u0087SÐ}\u0001ÐÂ\u0095W×À\u0092\u008b\u009e(8o\u0092\"¬ê\u0014é\u001az\u000bG»Q\"Tâ²¾ú^\u00863_Îàä½´½4<x\u00896ú\u001aÊ¶Æ\u0096m\u0006\u0087\u0086J¿è¾g\u009f½æ\u009b¦¡ü¢©\u0092èdHþÒ½¸;\u0088P,î|6Y+¯»\u0003\u001dh:N\u000f\u0002§Ãëì\u0096ÿl\u009dj_Ö¨`\u009d\rBäkù\u007f+s¡hA±öLø\u009dA\u0081K\u009c¥N¯\u0085¶f\u00959ÏÂ\u0082]%Tã»ºa®È\u008cÉô\u0090Üà4>¢½\u0082¸\u0091É\u0092q\u000e\u0013\u0092XÒÔã(2µq¡\u0016rKs»\u0093ËÈÿÂp\u009aÛpã3¨a?N¥\u0085!\fh\u0090[åyZ\u0087þ\u008e\u0012úfIBÃÊ\u0080AÚ\u0012\u0001]4AæÃÂ=£\u008b\u0000Ë,ÊF\u000b\u009e«EB/+øv P2Ç{éåi=êY(±\u001a\u0094E\u000b«fÕ5§tÝOgk\u0095óH)ð¼ê\u0095\\Q,\u0007¢Ï\u0082\u00931Dë\u0088sÞ¶=\u0087¸&fu¢#\u007f4ÀøÃI[\u0097\u0000èt\t+\u0085\u000fe]\u0014D\u000b \u009b\u0090êÚåØ\u009eöGªUü\u0098\"\u0081»6Ô\u009c\u0002¿4Ü_AÂÕ$þ\u0002¶Oõ&úì\u000e\u0094\n~\u0015×âj\u0000e\u0084<1²3v\u008cõ\u0004\u0006\u0001Æb\u0095o¹û©3\u0098ôdÙUÓ:/\u0010\u0004´\u0007\u0083\u008di½·dô\u008aRÚ\u0019Ü\u00076!\u0087²æú";
      int var7 = "x:TÄ\u00976þM\u0095whÉ5\u0080\u001fJ\rñ.ì -y\u0001þp;ÉI²qa\u0098ÜAÚ\u001a\u0097Ûµ{\u0081'eô{c®'kÞFa`\u0089B\u001dä\u001eÅ\u0080¼Y¶/\u0084Óø6q9÷¯ÎZ_q\u008c,ª\u0082\u009eã£+\u0088g\u008d*ý¶\u001a\u001b¡¤\u0004\u0084\u001d6a^g\u0080y\u00126\u009cíg\u0082É³.Á\u0019Sû{÷ë°\u0095\u0090EüùAµs\u001a\u0002\u0097\u0085há@ó7\u0082ú»\u008aÃ\u008fÿPp\u0018rµxtmkC\u0017¡¬Å\u0087SÐ}\u0001ÐÂ\u0095W×À\u0092\u008b\u009e(8o\u0092\"¬ê\u0014é\u001az\u000bG»Q\"Tâ²¾ú^\u00863_Îàä½´½4<x\u00896ú\u001aÊ¶Æ\u0096m\u0006\u0087\u0086J¿è¾g\u009f½æ\u009b¦¡ü¢©\u0092èdHþÒ½¸;\u0088P,î|6Y+¯»\u0003\u001dh:N\u000f\u0002§Ãëì\u0096ÿl\u009dj_Ö¨`\u009d\rBäkù\u007f+s¡hA±öLø\u009dA\u0081K\u009c¥N¯\u0085¶f\u00959ÏÂ\u0082]%Tã»ºa®È\u008cÉô\u0090Üà4>¢½\u0082¸\u0091É\u0092q\u000e\u0013\u0092XÒÔã(2µq¡\u0016rKs»\u0093ËÈÿÂp\u009aÛpã3¨a?N¥\u0085!\fh\u0090[åyZ\u0087þ\u008e\u0012úfIBÃÊ\u0080AÚ\u0012\u0001]4AæÃÂ=£\u008b\u0000Ë,ÊF\u000b\u009e«EB/+øv P2Ç{éåi=êY(±\u001a\u0094E\u000b«fÕ5§tÝOgk\u0095óH)ð¼ê\u0095\\Q,\u0007¢Ï\u0082\u00931Dë\u0088sÞ¶=\u0087¸&fu¢#\u007f4ÀøÃI[\u0097\u0000èt\t+\u0085\u000fe]\u0014D\u000b \u009b\u0090êÚåØ\u009eöGªUü\u0098\"\u0081»6Ô\u009c\u0002¿4Ü_AÂÕ$þ\u0002¶Oõ&úì\u000e\u0094\n~\u0015×âj\u0000e\u0084<1²3v\u008cõ\u0004\u0006\u0001Æb\u0095o¹û©3\u0098ôdÙUÓ:/\u0010\u0004´\u0007\u0083\u008di½·dô\u008aRÚ\u0019Ü\u00076!\u0087²æú"
         .length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = (var9[0] & 255L) << 56
            | (var9[1] & 255L) << 48
            | (var9[2] & 255L) << 40
            | (var9[3] & 255L) << 32
            | (var9[4] & 255L) << 24
            | (var9[5] & 255L) << 16
            | (var9[6] & 255L) << 8
            | var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
            byte[] var12 = var2.doFinal(
               new byte[]{
                  (byte)(var10 >>> 56),
                  (byte)(var10 >>> 48),
                  (byte)(var10 >>> 40),
                  (byte)(var10 >>> 32),
                  (byte)(var10 >>> 24),
                  (byte)(var10 >>> 16),
                  (byte)(var10 >>> 8),
                  (byte)var10
               }
            );
            long var21 = (var12[0] & 255L) << 56
               | (var12[1] & 255L) << 48
               | (var12[2] & 255L) << 40
               | (var12[3] & 255L) << 32
               | (var12[4] & 255L) << 24
               | (var12[5] & 255L) << 16
               | (var12[6] & 255L) << 8
               | var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[75];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = " ÔÚ:\u00adf¶»Éúm\u009f\fÝûÃ";
                  var7 = " ÔÚ:\u00adf¶»Éúm\u009f\fÝûÃ".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = (var9[0] & 255L) << 56
               | (var9[1] & 255L) << 48
               | (var9[2] & 255L) << 40
               | (var9[3] & 255L) << 32
               | (var9[4] & 255L) << 24
               | (var9[5] & 255L) << 16
               | (var9[6] & 255L) << 8
               | var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21292;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/bgt", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("cc/astralis/bgt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
