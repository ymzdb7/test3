 package com.myoa.util.netdisk;
 
 import com.myoa.model.netdisk.Catalog;
import com.myoa.model.netdisk.EasyUiDiskModel;
import com.myoa.model.netdisk.MyNetdisk;

 import java.io.File;
 import java.io.FileInputStream;
 import java.io.FileNotFoundException;
 import java.io.PrintStream;
 import java.text.DecimalFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
import java.util.ResourceBundle;
 
 public class ReadFile
 {
   public static boolean mkDirectory(String path)
   {
	          boolean bool = false;
     File file = null;
     try {
       file = new File(path);
       if (!file.exists()) {
         bool = file.mkdirs();
         return bool;
       } 
       return bool; } catch (Exception e) { } finally { file = null;
     }
     return false;
   }
 
   public static Catalog getFiles(String dirPath) throws Exception {
     File file = new File(dirPath);
     Catalog catalog = null;
     if (file.exists()) {
       catalog = new Catalog();
       String dirSize = "";
       int catalogcount = 0;
       List myNetdiskList = new ArrayList();
       if (file.isDirectory()) {
         File[] files = file.listFiles();
         for (File fi : files) {
           MyNetdisk myNetdisk = new MyNetdisk();
           String path = fi.getAbsolutePath();
           myNetdisk.setPath(path);
           myNetdisk.setNeName(getFileName(path));
           myNetdisk.setTime(getFileTime(fi));
           if (fi.isDirectory()) {
             myNetdisk.setType("DIR");
             myNetdisk.setSize("");
           } else {
             myNetdisk.setType(getFileType(path));
             myNetdisk.setSize(FormetFileSize(getFileSizes(fi)));
           }
           myNetdiskList.add(myNetdisk);
         }
       }
       else {
         dirSize = FormetFileSize(getFileSizes(file));
       }
 
       catalog.setCatalogcount(catalogcount);
       catalog.setCatalogSize(dirSize);
       catalog.setCatalogPath(dirPath);
       catalog.setMyNetdiskList(myNetdiskList);
     }
 
     return catalog;
   }
 
   public static String getFileType(String fileName)
   {
     return fileName.substring(fileName.lastIndexOf(".") + 1).toUpperCase();
   }
 
   public static String getFileName(String filePath) {
     String fileName = "";
 
     ResourceBundle rb = ResourceBundle.getBundle("upload");
     String osName = System.getProperty("os.name");
     StringBuffer sb = new StringBuffer();
     if (osName.toLowerCase().startsWith("win")) {
       String[] fileItems = filePath.split("\\\\");
       fileName = fileItems[(fileItems.length - 1)];
     } else {
       String[] fileItems = filePath.split("/");
       fileName = fileItems[(fileItems.length - 1)];
     }
 
     return fileName;
   }
 
   public static Date getFileTime(File file) {
     if ((file == null) || (!file.exists())) {
       return new Date();
     }
     return new Date(file.lastModified());
   }
 
   public static Date getFileTime(String filePath) {
     File file = new File(filePath);
     if (!file.exists()) {
       return new Date();
     }
     return new Date(file.lastModified());
   }
 
   public static long getFileSizes(File f) throws Exception {
     long s = 0L;
     if (f.exists()) {
       FileInputStream fis = null;
       fis = new FileInputStream(f);
       s = fis.available();
     } else {
       System.out.println("文件不存在");
     }
     return s;
   }
 
   public static long getFileSize(File f) throws Exception
   {
     long size = 0L;
     File[] flist = f.listFiles();
     for (int i = 0; i < flist.length; i++)
     {
       if (flist[i].isDirectory())
       {
         size += getFileSize(flist[i]);
       }
       else {
         size += flist[i].length();
       }
     }
     return size;
   }
   public static String FormetFileSize(long fileS) {
     DecimalFormat df = new DecimalFormat("#.00");
     String fileSizeString = "";
     if (fileS == 0L) {
       return "0.00B";
     }
     if (fileS < 1024L)
       fileSizeString = df.format(fileS) + "B";
     else if (fileS < 1048576L)
       fileSizeString = df.format(fileS / 1024.0D) + "KB";
     else if (fileS < 1073741824L)
       fileSizeString = df.format(fileS / 1048576.0D) + "M";
     else {
       fileSizeString = df.format(fileS / 1073741824.0D) + "G";
     }
     return fileSizeString;
   }
 
   public static long getlist(File f)
   {
     long size = 0L;
     File[] flist = f.listFiles();
     size = flist.length;
     for (int i = 0; i < flist.length; i++) {
       if (flist[i].isDirectory()) {
         size += getlist(flist[i]);
         size -= 1L;
       }
     }
     return size;
   }
 
   public static List<EasyUiDiskModel> getDirs(String dirPath) throws Exception {
     List res = null;
     File file = new File(dirPath);
     if ((file.exists()) && 
       (file.isDirectory())) {
       res = new ArrayList();
       File[] files = file.listFiles();
       int i = 0;
       for (File fi : files) {
         if (fi.isDirectory()) {
           EasyUiDiskModel myNetdisk = new EasyUiDiskModel();
           String path = fi.getAbsolutePath();
           Map attr = new HashMap();
           attr.put("url", path);
           myNetdisk.setAttributes(attr);
           myNetdisk.setText(getFileName(path));
           myNetdisk.setId(Integer.valueOf(i++));
           res.add(myNetdisk);
         }
       }
     }
 
     return res;
   }
 
   public static List<MyNetdisk> getFilesInPath(String path) throws Exception {
     List res = null;
     File file = new File(path);
     if ((file.exists()) && 
       (file.isDirectory())) {
       res = new ArrayList();
       File[] files = file.listFiles();
       int i = 0;
       for (File fi : files) {
         if (fi.isFile()) {
           MyNetdisk myNetdisk = new MyNetdisk();
           String filepath = fi.getAbsolutePath();
           myNetdisk.setPath(filepath);
           myNetdisk.setSize(FormetFileSize(getFileSizes(fi)));
           myNetdisk.setNeName(getFileName(filepath));
           myNetdisk.setTime(getFileLastModifed(fi));
           myNetdisk.setType(getFileType(filepath));
           res.add(myNetdisk);
         }
       }
     }
 
     return res;
   }
 
   public static Date getFileLastModifed(File file) throws FileNotFoundException {
     if (!file.exists()) {
       throw new FileNotFoundException();
     }
     long time = file.lastModified();
     Date date = new Date(time);
     return date;
   }
 }

