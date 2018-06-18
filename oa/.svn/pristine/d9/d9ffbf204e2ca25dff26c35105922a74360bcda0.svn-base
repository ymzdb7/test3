 package com.myoa.service.im;
 
 import java.awt.geom.AffineTransform;
 import java.awt.image.AffineTransformOp;
 import java.awt.image.BufferedImage;
 import java.io.File;
 import java.io.PrintStream;
 import javax.imageio.ImageIO;
 
 public class CompressImg
 {
   public static void compressImg(File oldfi, File newfo)
   {
     int size = 0;
     try {
       int nw = 500;
 
       AffineTransform transform = new AffineTransform();
       BufferedImage bis = ImageIO.read(oldfi);
       int w = bis.getWidth();
       int h = bis.getHeight();
 
       int nh = nw * h / w;
       double sx = nw / w;
       double sy = nh / h;
       transform.setToScale(sx, sy);
       System.out.println(w + " " + h);
 
       AffineTransformOp ato = new AffineTransformOp(transform, null);
       BufferedImage bid = new BufferedImage(nw, nh, 5);
 
       ato.filter(bis, bid);
       ImageIO.write(bid, "jpeg", newfo);
     } catch (Exception e) {
       e.printStackTrace();
     }
   }
 }

