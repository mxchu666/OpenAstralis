package cc.astralis;

import com.google.gson.JsonObject;
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

public class gqi extends brc {
   private String dsg;
   private String agk;
   private double acv;
   private String eyj;
   private static int euu;
   private static final String[] b;
   private static final long c = 46207917586889L;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;
   private static final long m;

   public gqi() {
      super(3);
   }

   public gqi(String clientTypeName, String hwid, String hash, double version) {
      super(3);
      a.dsg = a;
      a.agk = a;
      a.acv = a;
      a.eyj = a;
   }

   @Override
   public void etg(JsonObject json) {
      long ax = c ^ 97485917878469L;
      a.cps(a);
      String[] var4 = b;
      a.dsg = a.get(var4[4]).getAsString();
      a.agk = a.get(var4[3]).getAsString();
      a.acv = a.get(var4[2]).getAsDouble();
      short var10003 = 9929;
      long var10004 = 3229030423147356822L ^ ax;
      a.eyj = a.get(var4[7]).getAsString();
   }

   @Override
   public String cql() {
      long a = c ^ 45705567330027L;
      long ax = m;
      int[] var10000 = dar.abu();
      JsonObject axx = a.fdo();
      String var10001 = dve.bvt();
      short var10004 = 15109;
      long var10005 = 4204834332572588384L ^ a;
      Object[] var11 = new Object[8];
      String[] var8 = b;
      short var10008 = 22238;
      long var10009 = 9171832980323923110L ^ a;
      var11[0] = var8[9];
      var11[1] = a.dsg;
      var11[2] = var8[1];
      var11[3] = a.agk;
      var10008 = 7382;
      var10009 = 8634972646862700209L ^ a;
      var11[4] = var8[6];
      var11[5] = String.valueOf(a.acv);
      short var10006 = 1357;
      long var10007 = 5863596817538099001L ^ a;
      var11[6] = var8[0];
      var10006 = 18089;
      var10007 = 2825670087809066207L ^ a;
      var11[7] = a.eyj;
      a.eqw(axx, var11);
      String axxx = var10001;
      int[] axxxx = var10000;
      String var9 = axx.toString();
      String[] var10 = var8;
      if (axxxx != null) {
         short var10002 = 3210;
         long var10003 = 1183972553122688759L ^ a;
         var9 = fz.dvr(var9, cni.fsi(var8[8]), cni.fsi(var8[5]));
         if (axxx != null) {
            return var9;
         }

         var10 = new String[2];
      }

      cdr.apm(var10);
      return var9;
   }

   public String bdg() {
      return a.dsg;
   }

   public String ajt() {
      return a.agk;
   }

   public double czr() {
      return a.acv;
   }

   public String gxv() {
      return a.eyj;
   }

   public static void gll(int var0) {
      euu = var0;
   }

   public static int bdb() {
      return euu;
   }

   public static int cuv() {
      long var0 = c ^ 17093096052433L;
      int[] var2 = dar.abu();
      int var3 = bdb();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            short var4 = 27920;
            long var10001 = 6199770210951464788L ^ var0;
            return 57;
         }

         var10000 = 0;
      }

      return var10000;
   }

   static {
      long var25 = c ^ 44833857203537L;
      Cipher var17;
      Cipher var10000 = var17 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var18 = 1; var18 < 8; var18++) {
         var10003[var18] = (byte)(var25 << var18 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var16 = new String[2];
      int var22 = 0;
      String var21 = "7íy²íß\u009a}\u0000½¿+\u001d]½\u001a÷4\u0089pìõR÷Dbwny\u0084î#¤+Ó\u0014v{XèÂ\"ºebÛ43ÃÛ$ÂP´Wc\u008a1tNC(Ì\u0003\u00909\u0087Ú\u000f©ÑfC¾\u008b\u0080\u008fâþnÔ-\u0089\u0000è\u001e²Y\u0089©¾L`ÏM4ãP\u0085\u0019Úä<\u001aF>´zÂ\u0093Q|0zMÃ\u0010f\u0015\u00043Ì\u0082R\u001e\u00806©\u0090\u008e\u001eÕÀ(\u0087\u000e\u008aî³R\u001d¾uõ½\u0095\u0018\u0096`\u009d\u009c»íH¯[\u0006\u0010º&È¨{Ýø8l%\u0084\u0087_U$>ÑÑ\u0001Ø6}\u0082K\u0092\u0086,Å\u001cJÍR¬æ\u0006\u001eVg\u009f©\u0014\u001f@ò¸aê%Iêù";
      int var23 = "7íy²íß\u009a}\u0000½¿+\u001d]½\u001a÷4\u0089pìõR÷Dbwny\u0084î#¤+Ó\u0014v{XèÂ\"ºebÛ43ÃÛ$ÂP´Wc\u008a1tNC(Ì\u0003\u00909\u0087Ú\u000f©ÑfC¾\u008b\u0080\u008fâþnÔ-\u0089\u0000è\u001e²Y\u0089©¾L`ÏM4ãP\u0085\u0019Úä<\u001aF>´zÂ\u0093Q|0zMÃ\u0010f\u0015\u00043Ì\u0082R\u001e\u00806©\u0090\u008e\u001eÕÀ(\u0087\u000e\u008aî³R\u001d¾uõ½\u0095\u0018\u0096`\u009d\u009c»íH¯[\u0006\u0010º&È¨{Ýø8l%\u0084\u0087_U$>ÑÑ\u0001Ø6}\u0082K\u0092\u0086,Å\u001cJÍR¬æ\u0006\u001eVg\u009f©\u0014\u001f@ò¸aê%Iêù"
         .length();
      char var20 = '@';
      int var19 = -1;

      while (true) {
         byte[] var24 = var17.doFinal(var21.substring(++var19, var19 + var20).getBytes("ISO-8859-1"));
         String var58 = b(var24).intern();
         int var10001 = -1;
         var16[var22++] = var58;
         if ((var19 += var20) >= var23) {
            i = new HashMap(13);
            Cipher var5;
            var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var6 = 1; var6 < 8; var6++) {
               var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var11 = new long[20];
            int var8 = 0;
            String var9 = "/$ôu¾:HZb\u0084]#\u0006ªõ\u0087ýJß¦õÜ_¢´Íog\u008c<v£\u00ad^6ñ\u009ab\u009f\u0014º\ne)ó\u0086«Þ\u0095\u0091ýa\u009b÷´ÉÇ¤\u0099Ú\u0016¶¤,Â\u008c\u00155e\u0093;\u000eÂÁ¸\u001aR\u001d\"Ãê®ï\"\bj,\u0001Xãºkî³©w\nKrCð\u009bÍ\u0006\u009fk`Ú\u0096ßå\u007fiPÇº\u0097ýÈJs\u0001|RúÂÓ\u0011v5*É0\u0011V-ÏÓ%\u0084ø_\\¶";
            int var10 = "/$ôu¾:HZb\u0084]#\u0006ªõ\u0087ýJß¦õÜ_¢´Íog\u008c<v£\u00ad^6ñ\u009ab\u009f\u0014º\ne)ó\u0086«Þ\u0095\u0091ýa\u009b÷´ÉÇ¤\u0099Ú\u0016¶¤,Â\u008c\u00155e\u0093;\u000eÂÁ¸\u001aR\u001d\"Ãê®ï\"\bj,\u0001Xãºkî³©w\nKrCð\u009bÍ\u0006\u009fk`Ú\u0096ßå\u007fiPÇº\u0097ýÈJs\u0001|RúÂÓ\u0011v5*É0\u0011V-ÏÓ%\u0084ø_\\¶"
               .length();
            byte var7 = 0;

            label66:
            while (true) {
               var10001 = var7;
               var7 += 8;
               byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
               long[] var38 = var11;
               var10001 = var8++;
               long var61 = (var12[0] & 255L) << 56
                  | (var12[1] & 255L) << 48
                  | (var12[2] & 255L) << 40
                  | (var12[3] & 255L) << 32
                  | (var12[4] & 255L) << 24
                  | (var12[5] & 255L) << 16
                  | (var12[6] & 255L) << 8
                  | var12[7] & 255L;
               byte var69 = -1;

               while (true) {
                  long var13 = var61;
                  byte[] var15 = var5.doFinal(
                     new byte[]{
                        (byte)(var13 >>> 56),
                        (byte)(var13 >>> 48),
                        (byte)(var13 >>> 40),
                        (byte)(var13 >>> 32),
                        (byte)(var13 >>> 24),
                        (byte)(var13 >>> 16),
                        (byte)(var13 >>> 8),
                        (byte)var13
                     }
                  );
                  long var72 = (var15[0] & 255L) << 56
                     | (var15[1] & 255L) << 48
                     | (var15[2] & 255L) << 40
                     | (var15[3] & 255L) << 32
                     | (var15[4] & 255L) << 24
                     | (var15[5] & 255L) << 16
                     | (var15[6] & 255L) << 8
                     | var15[7] & 255L;
                  switch (var69) {
                     case 0:
                        var38[var10001] = var72;
                        if (var7 >= var10) {
                           g = var11;
                           h = new Integer[20];
                           Cipher var0;
                           var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                           var10002 = SecretKeyFactory.getInstance("DES");
                           var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var1 = 1; var1 < 8; var1++) {
                              var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           long var2 = -1744426903004070027L;
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
                           long var64 = (var4[0] & 255L) << 56
                              | (var4[1] & 255L) << 48
                              | (var4[2] & 255L) << 40
                              | (var4[3] & 255L) << 32
                              | (var4[4] & 255L) << 24
                              | (var4[5] & 255L) << 16
                              | (var4[6] & 255L) << 8
                              | var4[7] & 255L;
                           byte var51 = -1;
                           m = var64;
                           short var40 = 12216;
                           long var52 = 3900526843075411576L ^ var25;
                           String[] var32 = new String[10];
                           short var41 = 31042;
                           int var30 = 0;
                           long var53 = 292245359504451723L ^ var25;
                           String var29;
                           int var31 = (var29 = var16[1]).length();
                           char var28 = 4;
                           gll(109);
                           int var36 = -1;

                           label50:
                           while (true) {
                              short var42 = 4021;
                              long var54 = 3195598781410647668L ^ var25;
                              byte var43 = 124;
                              String var55 = var29.substring(++var36, var36 + var28);
                              byte var65 = -1;

                              while (true) {
                                 String var44 = b(var43, b(var55));
                                 switch (var65) {
                                    case 0:
                                       var32[var30++] = var44;
                                       if ((var36 += var28) >= var31) {
                                          b = var32;
                                          return;
                                       }

                                       var28 = var29.charAt(var36);
                                       break;
                                    default:
                                       var32[var30++] = var44;
                                       if ((var36 += var28) < var31) {
                                          var28 = var29.charAt(var36);
                                          continue label50;
                                       }

                                       var31 = (var29 = var16[0]).length();
                                       short var45 = 11688;
                                       long var56 = 8286527734154673262L ^ var25;
                                       var28 = ',';
                                       var36 = -1;
                                 }

                                 short var46 = 15678;
                                 long var57 = 3642025467535797499L ^ var25;
                                 var43 = 12;
                                 var55 = var29.substring(++var36, var36 + var28);
                                 var65 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var38[var10001] = var72;
                        if (var7 < var10) {
                           continue label66;
                        }

                        var9 = "\u0086\fd\u0017rd\u0014\u0094\u0091·NV·µO\u0015";
                        var10 = "\u0086\fd\u0017rd\u0014\u0094\u0091·NV·µO\u0015".length();
                        var7 = 0;
                  }

                  byte var50 = var7;
                  var7 += 8;
                  var12 = var9.substring(var50, var7).getBytes("ISO-8859-1");
                  var38 = var11;
                  var10001 = var8++;
                  var61 = (var12[0] & 255L) << 56
                     | (var12[1] & 255L) << 48
                     | (var12[2] & 255L) << 40
                     | (var12[3] & 255L) << 32
                     | (var12[4] & 255L) << 24
                     | (var12[5] & 255L) << 16
                     | (var12[6] & 255L) << 8
                     | var12[7] & 255L;
                  var69 = 0;
               }
            }
         }

         var20 = var21.charAt(var19);
      }
   }

   private static char[] b(String var0) {
      long var1 = c ^ 4579996030725L;
      char[] var10000 = var0.toCharArray();
      if (var10000.length < 2) {
         char var10003 = var10000[0];
         short var10004 = 13171;
         long var10005 = 5830107710806661369L ^ var1;
         var10000[0] = (char)(var10003 ^ 'i');
      }

      return var10000;
   }

   private static String b(int var0, char[] var1) {
      long var2 = c ^ 23053637289370L;
      int var10003 = var1.length;
      int var10002 = var0;
      char[] var10001 = var1;
      int var10000 = var10003;

      for (int var4 = 0; var10000 > var4; var4++) {
         char var10005 = var10001[var4];
         short var10008 = 18089;
         long var10009 = 2825716980920106926L ^ var2;
         byte var10;
         switch (var4 % 7) {
            case 0:
               var10 = 593;
               long var23 = 9153406339077045081L ^ var2;
               var10 = 73;
               break;
            case 1:
               var10 = 27018;
               long var22 = 3663967933246017675L ^ var2;
               var10 = 116;
               break;
            case 2:
               var10 = 25694;
               long var21 = 5950993263371918665L ^ var2;
               var10 = 30;
               break;
            case 3:
               var10 = 14937;
               long var20 = 2833509821990519642L ^ var2;
               var10 = 74;
               break;
            case 4:
               var10 = 18089;
               long var19 = 2825716980920106926L ^ var2;
               var10 = 7;
               break;
            case 5:
               var10 = 22911;
               long var18 = 8271324242943680635L ^ var2;
               var10 = 14;
               break;
            default:
               var10 = 25850;
               long var17 = 7272405050716364284L ^ var2;
               var10 = 105;
         }

         var10001[var4] = (char)(var10005 ^ var10002 ^ var10);
      }

      return new String(var10001).intern();
   }

   private static String b(byte[] var0) {
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1366;
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
            throw new RuntimeException("cc/astralis/gqi", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
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
         throw new RuntimeException("cc/astralis/gqi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
