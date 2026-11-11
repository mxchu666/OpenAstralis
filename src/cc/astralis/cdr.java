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
import net.minecraft.class_332;
import net.minecraft.class_4587;

public abstract class cdr {
   public static int hjr;
   public static int gig;
   public static int bni;
   public static int gqd;
   public static float aal;
   public static final cbm bna;
   public static class_332 hbz;
   public static class_4587 dtv;
   private static String[] cu;
   private static cdr[] acj;
   private static int dbe;
   private static String dxq;
   private static int[] azr;
   private static String[] apn;
   private static int hfw;
   private static String azt;
   private static int[] chv;
   private static cdr[] eun;
   private static String bnt;
   private static String[] atw;
   private static String[] eye;
   private static int fv;
   private static int dtl;
   private static int ckd;
   private static int czc;
   private static String[] atg;
   private static int[] efe;
   private static boolean fxy;
   private static String[] bft;
   private static String[] evr;
   private static int[] giv;
   private static String afw;
   private static int edk;
   private static int[] dbz;
   private static String ajh;
   private static cdr[] bpt;
   private static boolean btf;
   private static String ecu;
   private static String[] aza;
   private static int[] bbv;
   private static int[] fec;
   private static int gio;
   private static String dwt;
   private static int dxl;
   private static String[] eos;
   private static boolean ase;
   private static String[] cwg;
   private static final long b = 5166950912505L;
   private static final long[] j;
   private static final Integer[] k;
   private static final Map l;

   static {
      long var20 = b ^ 75053432907920L;
      if (fbr() != null) {
         amv(new String[5]);
      }

      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[5];
      int var17 = 0;
      String var16 = "o=\u0002ÝÏÛ¼Ë\bÌi'#×ÖÕð\bw9ø,~©,J";
      int var18 = "o=\u0002ÝÏÛ¼Ë\bÌi'#×ÖÕð\bw9ø,~©,J".length();
      char var15 = '\b';
      int var24 = -1;

      label58:
      while (true) {
         String var25 = var16.substring(++var24, var24 + var15);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var12.doFinal(var25.getBytes("ISO-8859-1"));
            String var37 = b(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var37;
                  if ((var24 += var15) >= var18) {
                     l = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[11];
                     int var3 = 0;
                     String var4 = "©Òd&\u0006\u0016;e\u0081,Ã\u0089ËÕâ\"Îã1\u001dò¾Ü\u009dg.\u009d\u0099Íô¯\u008dßª\u0089[\u001a\u0085Î\u0092y!ÙQ\u008eé\u001b|¶\u0000AùÂ²]V±ÉP_\u009eHw\t©=ÀM¦ê.;";
                     int var5 = "©Òd&\u0006\u0016;e\u0081,Ã\u0089ËÕâ\"Îã1\u001dò¾Ü\u009dg.\u009d\u0099Íô¯\u008dßª\u0089[\u001a\u0085Î\u0092y!ÙQ\u008eé\u001b|¶\u0000AùÂ²]V±ÉP_\u009eHw\t©=ÀM¦ê.;"
                        .length();
                     byte var2 = 0;

                     label40:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var41 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte var44 = -1;

                        while (true) {
                           long var8 = var41;
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
                           long var46 = (var10[0] & 255L) << 56
                              | (var10[1] & 255L) << 48
                              | (var10[2] & 255L) << 40
                              | (var10[3] & 255L) << 32
                              | (var10[4] & 255L) << 24
                              | (var10[5] & 255L) << 16
                              | (var10[6] & 255L) << 8
                              | var10[7] & 255L;
                           switch (var44) {
                              case 0:
                                 var28[var10001] = var46;
                                 if (var2 >= var5) {
                                    j = var6;
                                    k = new Integer[11];
                                    String var29 = var11[2];
                                    hjr = 0;
                                    adf(var29);
                                    int var47 = c<"r">(15040, 8260500375291495672L ^ var20);
                                    cdr[] var10005 = new cdr[3];
                                    String[] var10006 = new String[3];
                                    String var10007 = var11[3];
                                    short var10011 = 6453;
                                    long var10012 = 1002206762459703043L ^ var20;
                                    String var10013 = var11[1];
                                    int[] var10014 = new int[2];
                                    String[] var10015 = new String[4];
                                    String var10017 = var11[0];
                                    String[] var10018 = new String[2];
                                    String var10019 = var11[4];
                                    short var10024 = 27643;
                                    long var10025 = 6286032918803895756L ^ var20;
                                    String[] var10026 = new String[5];
                                    short var10028 = 24671;
                                    long var10029 = 6932028929893654122L ^ var20;
                                    gig = 0;
                                    cdr[] var10031 = new cdr[2];
                                    int[] var10032 = new int[4];
                                    bni = 0;
                                    gqd = 0;
                                    aal = 1.0F;
                                    esr(null);
                                    glf(null);
                                    ew(var10032);
                                    drx(var10031);
                                    gvw(null);
                                    gyq(null);
                                    har(120);
                                    fns(0);
                                    apm(var10026);
                                    fuw(null);
                                    gwo(56);
                                    String[] var48 = new String[4];
                                    bna = new cbm();
                                    fom(var48);
                                    hbe(0);
                                    egh(null);
                                    dji(false);
                                    dmu(null);
                                    blk(null);
                                    gll(var10019);
                                    fif(var10018);
                                    ebo(var10017);
                                    gvs(null);
                                    gpo(var10015);
                                    ebo(var10014);
                                    gwy(var10013);
                                    beu(0);
                                    fqm(122);
                                    buc(false);
                                    asw(0);
                                    blz(null);
                                    arw(var10007);
                                    bur(var10006);
                                    gii(var10005);
                                    cqg(var47);
                                    fpd(null);
                                    fsz(0);
                                    hek(null);
                                    fed(true);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var2 < var5) {
                                    continue label40;
                                 }

                                 var4 = "Ë\u0013\u0006tN¡º\u001eC\u0092q~a¥hb";
                                 var5 = "Ë\u0013\u0006tN¡º\u001eC\u0092q~a¥hb".length();
                                 var2 = 0;
                           }

                           byte var35 = var2;
                           var2 += 8;
                           var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var41 = (var7[0] & 255L) << 56
                              | (var7[1] & 255L) << 48
                              | (var7[2] & 255L) << 40
                              | (var7[3] & 255L) << 32
                              | (var7[4] & 255L) << 24
                              | (var7[5] & 255L) << 16
                              | (var7[6] & 255L) << 8
                              | var7[7] & 255L;
                           var44 = 0;
                        }
                     }
                  }

                  var15 = var16.charAt(var24);
                  break;
               default:
                  var11[var17++] = var37;
                  if ((var24 += var15) < var18) {
                     var15 = var16.charAt(var24);
                     continue label58;
                  }

                  var16 = "té\u0094\u0092\u0092\u008aúV\bt\u0083\u001f²âm:M";
                  var18 = "té\u0094\u0092\u0092\u008aúV\bt\u0083\u001f²âm:M".length();
                  var15 = '\b';
                  var24 = -1;
            }

            var25 = var16.substring(++var24, var24 + var15);
            var10001 = 0;
         }
      }
   }

   public static void apm(String[] var0) {
      cu = var0;
   }

   public static String[] haa() {
      return cu;
   }

   public static void drx(cdr[] var0) {
      acj = var0;
   }

   public static cdr[] bim() {
      return acj;
   }

   public static void cqg(int var0) {
      dbe = var0;
   }

   public static int cub() {
      return dbe;
   }

   public static int eqg() {
      long var0 = b ^ 82939838242018L;
      int[] var2 = dar.abu();
      int var3 = cub();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            return c<"r">(21448, 7013959633889909121L ^ var0);
         }

         var10000 = 0;
      }

      return var10000;
   }

   public static void arw(String var0) {
      dxq = var0;
   }

   public static String dpp() {
      return dxq;
   }

   public static void egh(int[] var0) {
      azr = var0;
   }

   public static int[] fzw() {
      return azr;
   }

   public static void glf(String[] var0) {
      apn = var0;
   }

   public static String[] cdo() {
      return apn;
   }

   public static void gwo(int var0) {
      hfw = var0;
   }

   public static int hgn() {
      return hfw;
   }

   public static int fra() {
      long var0 = b ^ 35647653519787L;
      int[] var2 = dar.abu();
      int var3 = hgn();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            short var4 = 28323;
            long var10001 = 5278095071406348712L ^ var0;
            return 99;
         }

         var10000 = 0;
      }

      return var10000;
   }

   public static void gwy(String var0) {
      azt = var0;
   }

   public static String dpg() {
      return azt;
   }

   public static void blk(int[] var0) {
      chv = var0;
   }

   public static int[] fn() {
      return chv;
   }

   public static void gii(cdr[] var0) {
      eun = var0;
   }

   public static cdr[] aey() {
      return eun;
   }

   public static void gll(String var0) {
      bnt = var0;
   }

   public static String gei() {
      return bnt;
   }

   public static void fif(String[] var0) {
      atw = var0;
   }

   public static String[] abz() {
      return atw;
   }

   public static void fom(String[] var0) {
      eye = var0;
   }

   public static String[] ezq() {
      return eye;
   }

   public static void hbe(int var0) {
      fv = var0;
   }

   public static int fjm() {
      return fv;
   }

   public static int cag() {
      long var0 = b ^ 69604596111538L;
      int[] var2 = dar.abu();
      int var3 = fjm();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            short var4 = 16048;
            long var10001 = 7688783323299934368L ^ var0;
            return 110;
         }

         var10000 = 0;
      }

      return var10000;
   }

   public static void fsz(int var0) {
      dtl = var0;
   }

   public static int bsq() {
      return dtl;
   }

   public static int hdt() {
      long var0 = b ^ 935920719558L;
      int[] var2 = dar.abu();
      int var3 = bsq();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            short var4 = 810;
            long var10001 = 7146670185374925638L ^ var0;
            return 113;
         }

         var10000 = 0;
      }

      return var10000;
   }

   public static void asw(int var0) {
      ckd = var0;
   }

   public static int afr() {
      return ckd;
   }

   public static int hbi() {
      long var0 = b ^ 65388045966112L;
      int[] var2 = dar.abu();
      int var3 = afr();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            short var4 = 2526;
            long var10001 = 2925293874262803549L ^ var0;
            return 10;
         }

         var10000 = 0;
      }

      return var10000;
   }

   public static void beu(int var0) {
      czc = var0;
   }

   public static int abn() {
      return czc;
   }

   public static int feu() {
      long var0 = b ^ 132016595838372L;
      int[] var2 = dar.abu();
      int var3 = abn();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            short var4 = 30095;
            long var10001 = 5186627646252205706L ^ var0;
            return 109;
         }

         var10000 = 0;
      }

      return var10000;
   }

   public static void gpo(String[] var0) {
      atg = var0;
   }

   public static String[] clq() {
      return atg;
   }

   public static void fpd(int[] var0) {
      efe = var0;
   }

   public static int[] aab() {
      return efe;
   }

   public static void dji(boolean var0) {
      fxy = var0;
   }

   public static boolean ef() {
      return fxy;
   }

   public static boolean ace() {
      long var0 = b ^ 135675603999464L;
      int[] var2 = dar.abu();
      boolean var3 = ef();
      boolean var10000 = var3;
      if (var2 != null) {
         if (!var3) {
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   public static void bur(String[] var0) {
      bft = var0;
   }

   public static String[] gfb() {
      return bft;
   }

   public static void gyq(String[] var0) {
      evr = var0;
   }

   public static String[] cjg() {
      return evr;
   }

   public static void esr(int[] var0) {
      giv = var0;
   }

   public static int[] dfy() {
      return giv;
   }

   public static void ebo(String var0) {
      afw = var0;
   }

   public static String bhx() {
      return afw;
   }

   public static void fqm(int var0) {
      edk = var0;
   }

   public static int acc() {
      return edk;
   }

   public static int gjt() {
      long var0 = b ^ 80259332826961L;
      int[] var2 = dar.abu();
      int var3 = acc();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            short var4 = 21488;
            long var10001 = 4736734176917103109L ^ var0;
            return 48;
         }

         var10000 = 0;
      }

      return var10000;
   }

   public static void ebo(int[] var0) {
      dbz = var0;
   }

   public static int[] akj() {
      return dbz;
   }

   public static void fuw(String var0) {
      ajh = var0;
   }

   public static String ftw() {
      return ajh;
   }

   public static void gvw(cdr[] var0) {
      bpt = var0;
   }

   public static cdr[] bof() {
      return bpt;
   }

   public static void buc(boolean var0) {
      btf = var0;
   }

   public static boolean fhj() {
      return btf;
   }

   public static boolean afn() {
      long var0 = b ^ 121745326324615L;
      int[] var2 = dar.abu();
      boolean var3 = fhj();
      boolean var10000 = var3;
      if (var2 != null) {
         if (!var3) {
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   public static void adf(String var0) {
      ecu = var0;
   }

   public static String agf() {
      return ecu;
   }

   public static void blz(String[] var0) {
      aza = var0;
   }

   public static String[] bgd() {
      return aza;
   }

   public static void gvs(int[] var0) {
      bbv = var0;
   }

   public static int[] fyk() {
      return bbv;
   }

   public static void ew(int[] var0) {
      fec = var0;
   }

   public static int[] crm() {
      return fec;
   }

   public static void har(int var0) {
      gio = var0;
   }

   public static int gcc() {
      return gio;
   }

   public static int ezl() {
      long var0 = b ^ 50570077722662L;
      int[] var2 = dar.abu();
      int var3 = gcc();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            return 3;
         }

         var10000 = 0;
      }

      return var10000;
   }

   public static void dmu(String var0) {
      dwt = var0;
   }

   public static String gnj() {
      return dwt;
   }

   public static void fns(int var0) {
      dxl = var0;
   }

   public static int drn() {
      return dxl;
   }

   public static int cze() {
      long var0 = b ^ 89776538577395L;
      int[] var2 = dar.abu();
      int var3 = drn();
      int var10000 = var3;
      if (var2 != null) {
         if (var3 == 0) {
            return 2;
         }

         var10000 = 0;
      }

      return var10000;
   }

   public static void hek(String[] var0) {
      eos = var0;
   }

   public static String[] cap() {
      return eos;
   }

   public static void fed(boolean var0) {
      ase = var0;
   }

   public static boolean cge() {
      return ase;
   }

   public static boolean dpc() {
      long var0 = b ^ 41905196242023L;
      int[] var2 = dar.abu();
      boolean var3 = cge();
      boolean var10000 = var3;
      if (var2 != null) {
         if (!var3) {
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   public static void amv(String[] var0) {
      cwg = var0;
   }

   public static String[] fbr() {
      return cwg;
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

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1883;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("cc/astralis/cdr", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("cc/astralis/cdr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
