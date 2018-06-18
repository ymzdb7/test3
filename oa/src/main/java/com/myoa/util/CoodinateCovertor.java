 package com.myoa.util;
 
 import com.myoa.model.footprint.LngLat;

 import java.io.PrintStream;
import java.math.BigDecimal;
 
 public class CoodinateCovertor
 {
   private static double x_pi = 52.359877559829883D;
 
   static double dataDigit(int digit, double in)
   {
     return new BigDecimal(in).setScale(6, 4).doubleValue();
   }
 
   public static LngLat bd_encrypt(LngLat lngLat_gd)
   {
     double x = lngLat_gd.getLongitude(); double y = lngLat_gd.getLantitude();
     double z = Math.sqrt(x * x + y * y) + 2.E-005D * Math.sin(y * x_pi);
     double theta = Math.atan2(y, x) + 3.E-006D * Math.cos(x * x_pi);
     return new LngLat(dataDigit(6, z * Math.cos(theta) + 0.0065D), dataDigit(6, z * Math.sin(theta) + 0.006D));
   }
 
   static LngLat bd_decrypt(LngLat lngLat_bd)
   {
     double x = lngLat_bd.getLongitude() - 0.0065D; double y = lngLat_bd.getLantitude() - 0.006D;
     double z = Math.sqrt(x * x + y * y) - 2.E-005D * Math.sin(y * x_pi);
     double theta = Math.atan2(y, x) - 3.E-006D * Math.cos(x * x_pi);
     return new LngLat(dataDigit(6, z * Math.cos(theta)), dataDigit(6, z * Math.sin(theta)));
   }
 
   public static void main(String[] args)
   {
     LngLat lngLat_bd = new LngLat(120.153192D, 30.258970000000001D);
     System.out.println(bd_encrypt(lngLat_bd));
   }
 }
