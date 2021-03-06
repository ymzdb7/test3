 package com.myoa.util.ipUtil;
 
 import com.myoa.util.common.StringUtils;

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.io.PrintStream;
 import java.net.InetAddress;
 import java.net.NetworkInterface;
 import java.net.SocketException;
 import java.net.UnknownHostException;
 import java.util.ArrayList;
 import java.util.Enumeration;
import java.util.List;
 
 public class MachineCode
 {
   public static List<String> getMacIds()
   {
     InetAddress ip = null;
     NetworkInterface ni = null;
     List macList = new ArrayList();
     try {
       Enumeration netInterfaces = NetworkInterface.getNetworkInterfaces();
 
       while (netInterfaces.hasMoreElements()) {
         ni = (NetworkInterface)netInterfaces.nextElement();
 
         Enumeration ips = ni.getInetAddresses();
         while (ips.hasMoreElements()) {
           ip = (InetAddress)ips.nextElement();
           if ((ip.isLoopbackAddress()) || (!ip.getHostAddress().matches("(\\d{1,3}\\.){3}\\d{1,3}"))) {
             continue;
           }
           macList.add(getMacFromBytes(ni.getHardwareAddress()));
         }
       }
     }
     catch (Exception e)
     {
     }
     return macList;
   }
 
   public static List<String> get16CharMacs() {
     List list16Macs = new ArrayList();
     String osName = System.getProperty("os.name");
     List<String> macIds = new ArrayList<String>();
     if (osName.toLowerCase().startsWith("win")) {
       String config = getWindowsMACAddress();
       macIds.add(config);
     } else {
       macIds = getMacIds();
     }
     for (String macId : macIds) {
       StringBuffer sb = new StringBuffer();
       char[] chars = macId.toCharArray();
 
       for (char aChar : chars) {
         if ((('0' > aChar) || (aChar > '9')) && (('A' > aChar) || (aChar > 'Z')) && (('a' > aChar) || (aChar > 'z'))) {
           continue;
         }
         sb.append(aChar);
       }
 
       while (sb.length() < 12) {
         sb.append("A");
       }
       if (sb.length() > 12) {
         sb.substring(0, 12);
       }
       list16Macs.add(sb.toString());
     }
 
     return list16Macs;
   }
 
   public static List<String> get16CharMacsType() {
     List list16Macs = new ArrayList();
     String osName = System.getProperty("os.name");
     List<String> macIds = new ArrayList<String>();
     if (osName.toLowerCase().startsWith("win")) {
       String config = getWindowsMACAddress();
       macIds.add(config);
     } else {
       macIds = getMacIds();
     }
     for (String macId : macIds)
     {
       StringBuffer sb = new StringBuffer();
       char[] chars = macId.toCharArray();
 
       for (char aChar : chars) {
         if ((('0' > aChar) || (aChar > '9')) && (('A' > aChar) || (aChar > 'Z')) && (('a' > aChar) || (aChar > 'z'))) {
           continue;
         }
         sb.append(aChar);
       }
 
       while ((!StringUtils.checkNull(sb.toString()).booleanValue()) && (sb.length() < 16)) {
         String a1 = sb.substring(0, 1);
         String a2 = sb.substring(2, 3);
         String a3 = sb.substring(4, 5);
         String a4 = sb.substring(6, 7);
         sb.append(a1);
         sb.append(a2);
         sb.append(a3);
         sb.append(a4);
       }
       if (sb.length() > 16) {
         sb.substring(0, 16);
       }
       list16Macs.add(sb.toString());
     }
 
     return list16Macs;
   }
 
   private static String getMacFromBytes(byte[] bytes) {
     StringBuffer mac = new StringBuffer();
 
     boolean first = false;
     for (byte b : bytes) {
       if (first) {
         mac.append("-");
       }
       byte currentByte = (byte)((b & 0xF0) >> 4);
       mac.append(Integer.toHexString(currentByte));
       currentByte = (byte)(b & 0xF);
       mac.append(Integer.toHexString(currentByte));
       first = true;
     }
     return mac.toString().toUpperCase();
   }
 
   public static String getWindowsMACAddress()
   {
     String mac = null;
     BufferedReader bufferedReader = null;
     Process process = null;
     try
     {
       process = Runtime.getRuntime().exec("ipconfig /all");
       bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "gbk"));
 
       String line = null;
       int index = -1;
       while ((line = bufferedReader.readLine()) != null) {
         System.out.println(line);
 
         index = line.toLowerCase().indexOf("physical address");
 
         if (index >= 0) {
           index = line.indexOf(":");
           if (index >= 0) {
             System.out.println(mac);
 
             mac = line.substring(index + 1).trim();
           }
         }
 
         index = line.toLowerCase().indexOf("物理地址");
         if (index >= 0) {
           index = line.indexOf(":");
           if (index < 0) break;
           System.out.println(mac);
 
           mac = line.substring(index + 1).trim();
         }
       }
     }
     catch (IOException e1)
     {
       e1.printStackTrace();
     } finally {
       try {
         if (bufferedReader != null)
           bufferedReader.close();
       }
       catch (IOException e1) {
         e1.printStackTrace();
       }
       bufferedReader = null;
       process = null;
     }
 
     return mac;
   }
 
   private static void getLocalMac(InetAddress ia)
     throws SocketException
   {
     byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();
     System.out.println("mac数组长度：" + mac.length);
     StringBuffer sb = new StringBuffer("");
 
     for (int i = 0; i < mac.length; i++) {
       if (i != 0) {
         sb.append("-");
       }
 
       int temp = mac[i] & 0xFF;
       String str = Integer.toHexString(temp);
       System.out.println("每8位:" + str);
       if (str.length() == 1)
         sb.append("0" + str);
       else {
         sb.append(str);
       }
     }
     System.out.println("本机MAC地址:" + sb.toString().toUpperCase());
   }
 
   public static void main(String[] args)
     throws UnknownHostException, SocketException
   {
     System.out.println(getWindowsMACAddress());
   }
 }
