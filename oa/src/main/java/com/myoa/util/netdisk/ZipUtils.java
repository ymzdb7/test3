 package com.myoa.util.netdisk;
 
 import java.io.File;
 import java.io.FileInputStream;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import java.util.zip.ZipEntry;
 import java.util.zip.ZipOutputStream;
 
 public class ZipUtils
 {
   public static void doCompress(String srcFile, String zipFile)
     throws Exception
   {
     doCompress(new File(srcFile), new File(zipFile));
   }
 
   public static void doCompress(File srcFile, File destFile)
     throws Exception
   {
     ZipOutputStream out = new ZipOutputStream(new FileOutputStream(destFile));
     if (srcFile.isDirectory()) {
       File[] files = srcFile.listFiles();
       for (File file : files)
         doCompress(file, out);
     }
     else {
       doCompress(srcFile, out);
     }
   }
 
   public static void doCompress(String pathname, ZipOutputStream out) throws IOException {
     doCompress(new File(pathname), out);
   }
 
   public static void doCompress(File file, ZipOutputStream out) throws IOException {
     if (file.exists()) {
       byte[] buffer = new byte[1024];
       FileInputStream fis = new FileInputStream(file);
       out.putNextEntry(new ZipEntry(file.getName()));
       int len = 0;
 
       while ((len = fis.read(buffer)) > 0) {
         out.write(buffer, 0, len);
       }
       out.flush();
       out.closeEntry();
       fis.close();
     }
   }
 
   public static void zip(String inName, String outName)
   {
     File file = new File(inName);
     int length = (int)file.length();
     byte[] b = new byte[length];
     try {
       InputStream in = new FileInputStream(file);
       in.read(b);
       in.close();
     } catch (Exception e) {
       e.printStackTrace();
     }
     try
     {
       ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(new File(outName)));
       zout.setLevel(9);
       ZipEntry zipEntry = new ZipEntry(file.getName());
       zout.putNextEntry(zipEntry);
       zout.write(b);
       zout.finish();
       zout.close();
     } catch (Exception e) {
       e.printStackTrace();
     }
   }
 
   public static double getM(double k)
   {
     double m = k / 1024.0D;
     return m;
   }
 
   public static double getKB(double b)
   {
     double kb = b / 1024.0D;
     return kb;
   }
 }

