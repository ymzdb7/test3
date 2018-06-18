 package com.myoa.util.systeminfo;
 
 import java.io.PrintStream;
 import java.net.InetAddress;
 import java.net.NetworkInterface;
 import java.net.SocketException;
 import java.util.ArrayList;
 import java.util.Enumeration;
 import java.util.List;
 
 public class MachineUtil
 {
   public static final String MY_KEY = "gaosuboisnumber1";
 
   public static void main(String[] args)
     throws Exception
   {
     String macId = getMacId();
     System.out.println(macId);
     System.out.println("获得服务器的MAC地址:" + getMacId());
     System.out.println("获得服务器的MAC地址(多网卡):" + getMacIds());
     System.out.println("处理后的的MAC地址（未加密）：" + get16CharMacs());
     System.out.println("处理后的的MAC地址（加密）：" + getEncryptMacCode());
   }
 
   public static String getMacId()
   {
     String macId = "";
     InetAddress ip = null;
     NetworkInterface ni = null;
     try {
       boolean bFindIP = false;
       Enumeration netInterfaces = NetworkInterface.getNetworkInterfaces();
 
       while ((netInterfaces.hasMoreElements()) && 
         (!bFindIP))
       {
         ni = (NetworkInterface)netInterfaces.nextElement();
 
         Enumeration ips = ni.getInetAddresses();
         while (ips.hasMoreElements()) {
           ip = (InetAddress)ips.nextElement();
           if ((ip.isLoopbackAddress()) || (!ip.getHostAddress().matches("(\\d{1,3}\\.){3}\\d{1,3}"))) {
             continue;
           }
           bFindIP = true;
         }
       }
     }
     catch (Exception e)
     {
     }
 
     if (null != ip)
       try {
         macId = getMacFromBytes(ni.getHardwareAddress());
       }
       catch (SocketException e)
       {
       }
     return macId;
   }
 
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
 
   public static List<String> get16CharMacs() {
     List list16Macs = new ArrayList();
 
     List<String> macIds = getMacIds();
     for (String macId : macIds) {
       StringBuffer sb = new StringBuffer();
       char[] chars = macId.toCharArray();
 
       for (char aChar : chars) {
         if ((('0' > aChar) || (aChar > '9')) && (('A' > aChar) || (aChar > 'Z')) && (('a' > aChar) || (aChar > 'z'))) {
           continue;
         }
         sb.append(aChar);
       }
 
       while (sb.length() < 16) {
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
 
   public static List<String> getEncryptMacCode() throws Exception {
     List<String> charMacs = get16CharMacs();
     List<String> macCodeEncryptList = new ArrayList<String>();
     for (String charMac : charMacs) {
       String encrypt = DESUtils.encrypt(charMac, DESUtils.MY_KEY);
 
       macCodeEncryptList.add(encrypt);
     }
 
     return macCodeEncryptList;
   }
 }

