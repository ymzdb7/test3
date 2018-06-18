 package com.myoa.util;
 
 import com.myoa.model.enclosure.Attachment;

 import java.awt.Graphics;
 import java.awt.Image;
 import java.awt.image.BufferedImage;
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import java.io.PrintStream;
 import java.net.URL;
 import java.util.Arrays;
 import java.util.List;
import javax.imageio.ImageIO;
 
 public class FileUploadUtil
 {
   public static final List<String> ALLOW_TYPES = Arrays.asList(new String[] { "imagejpeg", "imagegif" });
 
   public static String rename(String fileName)
   {
     int i = fileName.lastIndexOf(".");
     String str = fileName.substring(i);
 
     return Math.abs((int)System.currentTimeMillis()) + str;
   }
 
   public static String rename(String fileName, String freeName) {
     int i = fileName.lastIndexOf(".");
     String str = fileName.substring(0, i);
     String str1 = fileName.substring(i);
 
     return str + freeName + str1;
   }
 
   public static boolean allowUpload(String postfix)
   {
     return ALLOW_TYPES.contains(postfix);
   }
 
   public static Object[] reAttachment(List<Attachment> list) {
     StringBuffer id = new StringBuffer();
     StringBuffer name = new StringBuffer();
     for (Attachment attachment : list) {
       int aid = attachment.getAid().intValue();
       int attachId = attachment.getAttachId().intValue();
       String ym = attachment.getYm();
       String attachName = attachment.getAttachName();
       String all = aid + "@" + ym + "_" + attachId;
       id.append(all).append(",");
       name.append(attachName).append("*");
     }
     Object[] o = new Object[2];
     o[0] = id.toString();
     o[1] = name.toString();
     return o;
   }
 
   public static Object[] reAttachmentAll(List<Attachment> list)
   {
     StringBuffer id = new StringBuffer();
     StringBuffer name = new StringBuffer();
     for (Attachment attachment : list) {
       int aid = attachment.getAid().intValue();
       int attachId = attachment.getAttachId().intValue();
       String ym = attachment.getYm();
       String attachName = attachment.getAttachName();
       String fileSize = attachment.getFileSize();
       String time = attachment.getTime();
       String all = aid + "@" + ym + "_" + attachId + "*" + fileSize + "|" + time;
       id.append(all).append(",");
       name.append(attachName).append("*");
     }
     Object[] o = new Object[2];
     o[0] = id.toString();
     o[1] = name.toString();
     return o;
   }
 
   public static String zipImageFile(String oldFile, int width, int height, float quality, String smallIcon, String dirurl)
   {
     if (oldFile == null) {
       return null;
     }
     String newImage = null;
     try
     {
       Image srcFile = ImageIO.read(new File(oldFile));
 
       BufferedImage tag = new BufferedImage(width, height, 1);
       tag.getGraphics().drawImage(srcFile, 0, 0, width, height, null);
 
       newImage = dirurl + System.getProperty("file.separator") + smallIcon;
 
       System.out.println("0=||=============>newimage:" + newImage);
       File file = new File(newImage);
       if (file.exists()) {
         System.out.println("0=||=============>文件存在不处理:" + newImage);
         return "";
       }
 
       FileOutputStream out = new FileOutputStream(newImage);
 
       ImageIO.write(tag, "jpeg", out);
       out.close();
     } catch (FileNotFoundException e) {
       e.printStackTrace();
     } catch (IOException e) {
       System.out.println("buzhidao shisha +" + e.getMessage());
       e.printStackTrace();
     }
 
     return newImage;
   }
 
   public static String writeFile(String fileName, InputStream is)
   {
     if ((fileName == null) || (fileName.trim().length() == 0)) {
       return null;
     }
     try
     {
       FileOutputStream fos = new FileOutputStream(fileName);
       byte[] readBytes = new byte[512];
       int readed = 0;
       while ((readed = is.read(readBytes)) > 0) {
         fos.write(readBytes, 0, readed);
       }
 
       fos.close();
 
       is.close();
     }
     catch (FileNotFoundException e)
     {
       e.printStackTrace();
     }
     catch (IOException e) {
       e.printStackTrace();
     }
 
     return fileName;
   }
 
   public static void saveMinPhoto(String srcURL, String deskURL, double comBase, double scale)
     throws Exception
   {
     File srcFile = new File(srcURL);
     Image src = ImageIO.read(srcFile);
     int srcHeight = src.getHeight(null);
     int srcWidth = src.getWidth(null);
     int deskHeight = 0;
     int deskWidth = 0;
     double srcScale = srcHeight / srcWidth;
 
     if ((srcHeight > comBase) || (srcWidth > comBase)) {
       if ((srcScale >= scale) || (1.0D / srcScale > scale)) {
         if (srcScale >= scale) {
           deskHeight = (int)comBase;
           deskWidth = srcWidth * deskHeight / srcHeight;
         } else {
           deskWidth = (int)comBase;
           deskHeight = srcHeight * deskWidth / srcWidth;
         }
       }
       else if (srcHeight > comBase) {
         deskHeight = (int)comBase;
         deskWidth = srcWidth * deskHeight / srcHeight;
       } else {
         deskWidth = (int)comBase;
         deskHeight = srcHeight * deskWidth / srcWidth;
       }
     }
     else {
       deskHeight = srcHeight;
       deskWidth = srcWidth;
     }
     BufferedImage tag = new BufferedImage(deskWidth, deskHeight, 5);
     tag.getGraphics().drawImage(src, 0, 0, deskWidth, deskHeight, null);
     File file = new File(deskURL);
     if (!file.exists()) {
       file.createNewFile();
     }
 
     FileOutputStream deskImage = new FileOutputStream(deskURL);
     ImageIO.write(tag, "jpeg", deskImage);
     deskImage.close();
   }
 
   public static String getRootPath() {
     String classPath = FileUploadUtil.class.getClassLoader().getResource("/").getPath();
     String rootPath = "";
 
     if ("\\".equals(File.separator)) {
       rootPath = classPath.substring(1, classPath.indexOf("classes"));
       rootPath = rootPath.replace("/", "\\");
     }
 
     if ("/".equals(File.separator)) {
       rootPath = classPath.substring(0, classPath.indexOf("classes"));
       rootPath = rootPath.replace("\\", "/");
     }
     return rootPath;
   }
 }
