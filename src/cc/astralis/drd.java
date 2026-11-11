package cc.astralis;

import java.io.File;
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

public class drd implements dlc {
   public final File ail;
   public HashMap<String, flh> ddp;
   private static final long a = 43493858903677L;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public drd() {
      long a = drd.a ^ 7331617082099L;
      super();
      File var10003 = chi.field_1697;
      short var10004 = 7721;
      long var10005 = 6477308756884743199L ^ a;
      String var3 = "Astralis".toLowerCase();
      short var10006 = 19264;
      long var10007 = 870974033757254004L ^ a;
      a.ail = new File(var10003, "/" + var3 + "/Configs");
      a.ddp = new HashMap<>();
   }

   public void adk() {
      long a = drd.a ^ 79905176227196L;
      int[] var10000 = dar.abu();
      File[] ax = a.ail.listFiles();
      int[] axx = var10000;
      File[] var10 = ax;
      if (axx != null) {
         if (ax == null) {
            return;
         }

         var10 = ax;
      }

      File[] var5 = var10;
      int var6 = var5.length;
      int var7 = 0;

      while (var7 < var6) {
         File axxx = var5[var7];
         if (axx != null) {
            label40:
            if (axxx.isFile()) {
               String var11 = axxx.getName();
               if (axx != null) {
                  short var10001 = 4476;
                  long var10002 = 1343871686962441411L ^ a;
                  if (!var11.endsWith(".astralis")) {
                     break label40;
                  }

                  String var12 = axxx.getName();
                  int var13 = axxx.getName().length();
                  short var10003 = 4476;
                  long var10004 = 1343871686962441411L ^ a;
                  var11 = var12.substring(0, var13 - ".astralis".length());
               }

               String axxxx = var11;
               a.ddp.put(axxxx, new flh(axxxx));
            }

            var7++;
         }

         if (axx == null) {
            break;
         }
      }
   }

   public void ecy() {
      long a;
      drd var4;
      label34: {
         a = drd.a ^ 60769721817397L;
         int[] var3 = dar.abu();
         boolean var10000 = a.ail.exists();
         if (var3 != null) {
            if (!var10000) {
               a.ail.mkdirs();
            }

            a.adk();
            var4 = a;
            if (var3 == null) {
               break label34;
            }

            short var10001 = 2214;
            long var10002 = 8522950748590432593L ^ a;
            var10000 = a.ddp.containsKey("default");
         }

         if (!var10000) {
            a.faw();
            if (var3 != null) {
               return;
            }
         }

         var4 = a;
      }

      short var5 = 7181;
      long var6 = 1062651074254927353L ^ a;
      var4.esg("default");
   }

   public void faw() {
      long a = drd.a ^ 100210367624802L;
      short var10001 = 7181;
      long var10002 = 1062611899970296494L ^ a;
      a.flb("default");
   }

   public void esg(String configName) {
      long ax = drd.a ^ 67231101388452L;
      int[] var10000 = dar.abu();
      flh axx = a.ddp.get(a);
      int[] axxx = var10000;
      flh var6 = axx;
      if (axxx != null) {
         if (axx == null) {
            short var7 = 7907;
            long var8 = 2659416874129418371L ^ ax;
            bpa.dhu("Failed To Load Config " + a);
            return;
         }

         short var10001 = 13193;
         long var10002 = 1296906134030796269L ^ ax;
         bpa.dhu("Loaded Config " + a);
         var6 = axx;
      }

      var6.fme();
   }

   public void flb(String configName) {
      long ax = drd.a ^ 88624493588217L;
      int[] var10000 = dar.abu();
      flh axx = a.ddp.get(a);
      int[] axxx = var10000;
      flh var6 = axx;
      if (axxx != null) {
         if (axx == null) {
            axx = new flh(a);
            a.ddp.put(a, axx);
         }

         var6 = axx;
      }

      var6.apo();
   }

   public void bgb(String configName) {
      long ax = drd.a ^ 66735366116018L;
      int[] var10000 = dar.abu();
      flh axx = a.ddp.get(a);
      int[] axxx = var10000;
      if (axx != null) {
         short var10004 = 5410;
         long var10005 = 8160617137561466710L ^ ax;
         File axxxx = new File(a.ail, a + ".astralis");
         boolean var7 = axxxx.exists();
         if (axxx != null) {
            if (!var7 || axxx == null) {
               return;
            }

            var7 = axxxx.delete();
         }

         if (var7) {
            a.ddp.remove(a);
         }
      }
   }

   static {
      long var0 = a ^ 91468895430042L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "fôÍ\u0015\u0001ÊÉë*~#\u008b>;`â\u0018\u0091Ê#Á\u000fQK\u0005Ê\u000e\r³Í\u0098.<ü\u0000y0\u0015\u0080 Î\u0018/¶¹LV¨\u009d\u000fîÝ¸¶quÆB¨þ\u009ba\u008b\u009bþ\u0085\u0010_é³\u009bµÆX\u00ad\u0011%Ë\u0088âsâØ \u0093WFô\u0081êè\u00189\b\u0085\u001c½Í\u0011Æ\u001dØæ*ì:Ró\b^\fN.g:5(p¡t<\u0000:\rÏ½\u000f²\u0085B]/\u0092ìc\u001aà#e\u0085ó>\u001a(]\u009fºZ?Ê\f°X¨8ô[";
      int var8 = "fôÍ\u0015\u0001ÊÉë*~#\u008b>;`â\u0018\u0091Ê#Á\u000fQK\u0005Ê\u000e\r³Í\u0098.<ü\u0000y0\u0015\u0080 Î\u0018/¶¹LV¨\u009d\u000fîÝ¸¶quÆB¨þ\u009ba\u008b\u009bþ\u0085\u0010_é³\u009bµÆX\u00ad\u0011%Ë\u0088âsâØ \u0093WFô\u0081êè\u00189\b\u0085\u001c½Í\u0011Æ\u001dØæ*ì:Ró\b^\fN.g:5(p¡t<\u0000:\rÏ½\u000f²\u0085B]/\u0092ìc\u001aà#e\u0085ó>\u001a(]\u009fºZ?Ê\f°X¨8ô["
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
                     c = new String[8];
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

                  var6 = "=\u0083÷/Ù£\u009e\u0011ëE¿³ê¦\u0004\u009950\u007fjÒ\u0015h\u0006\u001aNÖß\u0089ôÉè nÇÝ\u0011ÛL#V¤½r¹\u0087õ+ô\u009cé:\rjvs\t\u0019}§[ðÙÙG";
                  var8 = "=\u0083÷/Ù£\u009e\u0011ëE¿³ê¦\u0004\u009950\u007fjÒ\u0015h\u0006\u001aNÖß\u0089ôÉè nÇÝ\u0011ÛL#V¤½r¹\u0087õ+ô\u009cé:\rjvs\t\u0019}§[ðÙÙG"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30396;
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
            throw new RuntimeException("cc/astralis/drd", var10);
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
         throw new RuntimeException("cc/astralis/drd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
