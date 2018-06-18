 package com.myoa.util.netdisk;
 
 import java.io.File;
 import java.io.PrintStream;
 
 public class DeleteFile
 {
   public static int count = 0;
 
   public static void refreshFileList(String strPath) { File dir = new File(strPath);
     File[] files = dir.listFiles();
     if (files == null)
     {
       System.out.println("该目录下没有任何一个文件！");
       boolean result = dir.delete();
       int tryCount = 0;
       while ((!result) && (tryCount++ < 10)) {
         System.gc();
         result = dir.delete();
       }
       return;
     }
     for (int i = 0; i < files.length; i++) {
       if (files[i].isDirectory()) {
         refreshFileList(files[i].getAbsolutePath());
       } else {
         String strFileName = files[i].getAbsolutePath().toLowerCase();
         if (strFileName.endsWith(".txt")) {
           System.out.println("正在删除：" + strFileName);
           boolean result = files[i].delete();
           int tryCount = 0;
           while ((!result) && (tryCount++ < 10)) {
             System.gc();
             result = files[i].delete();
           }
           count += 1;
         }
       }
     }
     boolean result = dir.delete();
     int tryCount = 0;
     while ((!result) && (tryCount++ < 10)) {
       System.gc();
       result = dir.delete();
     }
   }
 }

