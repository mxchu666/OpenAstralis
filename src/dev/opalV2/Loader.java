package dev.opalV2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Loader {
   public static native void registerNativesForClass(int var0, Class<?> var1);

   static {
      String osName = System.getProperty("os.name").toLowerCase();
      String platform = System.getProperty("os.arch").toLowerCase();
      String platformTypeName;
      switch (platform) {
         case "x86_64":
         case "amd64":
            platformTypeName = "x64";
            break;
         case "aarch64":
            platformTypeName = "aarch64";
            break;
         case "arm":
            platformTypeName = "aarch32";
            break;
         case "x86":
            platformTypeName = "x86";
            break;
         default:
            platformTypeName = platform;
      }

      String osTypeName;
      if (osName.contains("nix") || osName.contains("nux") || osName.contains("aix")) {
         osTypeName = "linux.so";
      } else if (osName.contains("win")) {
         osTypeName = "windows.dll";
      } else if (osName.contains("mac")) {
         osTypeName = "macos.dylib";
      } else {
         osTypeName = osName;
      }

      String libFileName = String.format("/%s/%s-%s", Loader.class.getName().replace('.', '/').replace("/Loader", ""), platformTypeName, osTypeName);

      File libFile;
      try {
         libFile = File.createTempFile("lib", null);
         libFile.deleteOnExit();
         if (!libFile.exists()) {
            throw new IOException();
         }
      } catch (IOException var16) {
         throw new UnsatisfiedLinkError("Failed to create temp file");
      }

      byte[] arrayOfByte = new byte[2048];

      try {
         InputStream inputStream = Loader.class.getResourceAsStream(libFileName);
         if (inputStream == null) {
            throw new UnsatisfiedLinkError(String.format("Failed to open lib file: %s", libFileName));
         }

         try {
            FileOutputStream fileOutputStream = new FileOutputStream(libFile);

            try {
               int size;
               while ((size = inputStream.read(arrayOfByte)) != -1) {
                  fileOutputStream.write(arrayOfByte, 0, size);
               }

               fileOutputStream.close();
            } catch (Throwable var13) {
               try {
                  fileOutputStream.close();
               } catch (Throwable var12) {
                  var13.addSuppressed(var12);
               }

               throw var13;
            }

            inputStream.close();
         } catch (Throwable var14) {
            try {
               inputStream.close();
            } catch (Throwable var11) {
               var14.addSuppressed(var11);
            }

            throw var14;
         }
      } catch (IOException var15) {
         throw new UnsatisfiedLinkError(String.format("Failed to copy file: %s", var15.getMessage()));
      }

      System.load(libFile.getAbsolutePath());
   }
}
