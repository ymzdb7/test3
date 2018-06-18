 package com.myoa.util.ipUtil;


 import com.myoa.util.CusAccessObjectUtil;

 import java.net.Inet4Address;
 import java.net.InetAddress;
 import java.net.NetworkInterface;
 import java.net.SocketException;
 import java.util.Enumeration;
 import javax.servlet.http.HttpServletRequest;
 import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


 public class IpAddr
 {
	 private static final Logger LOG = LoggerFactory.getLogger(IpAddr.class);

	
	 public static String getIpAddr(HttpServletRequest request)
	 {
		 String ip = request.getHeader("x-forwarded-for");
		 if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
			 ip = request.getHeader("Proxy-Client-IP");
			 }
		 if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
			 ip = request.getHeader("WL-Proxy-Client-IP");
			 }
		 if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
			 ip = request.getRemoteAddr();
			 }
		 return ip;
		 }

	
	 public static String getIpAddress(HttpServletRequest request)
	 {
		 String ip = request.getHeader("X-Forwarded-For");
		 if (LOG.isInfoEnabled()) {
			 LOG.info("getIpAddress(HttpServletRequest) - X-Forwarded-For - String ip=" + ip);
			 }
		 if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
			 if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
				 ip = request.getHeader("Proxy-Client-IP");
				 if (LOG.isInfoEnabled()) {
					 LOG.info("getIpAddress(HttpServletRequest) - Proxy-Client-IP - String ip=" + ip);
					 }
				 }
			 if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
				 ip = request.getHeader("WL-Proxy-Client-IP");
				 if (LOG.isInfoEnabled()) {
					 LOG.info("getIpAddress(HttpServletRequest) - WL-Proxy-Client-IP - String ip=" + ip);
					 }
				 }
			 if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
				 ip = request.getHeader("HTTP_CLIENT_IP");
				 if (LOG.isInfoEnabled()) {
					 LOG.info("getIpAddress(HttpServletRequest) - HTTP_CLIENT_IP - String ip=" + ip);
					 }
				 }
			 if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
				 ip = request.getHeader("HTTP_X_FORWARDED_FOR");
				 if (LOG.isInfoEnabled()) {
					 LOG.info("getIpAddress(HttpServletRequest) - HTTP_X_FORWARDED_FOR - String ip=" + ip);
					 }
				 }
			 if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
				 ip = request.getRemoteAddr();
				 if (LOG.isInfoEnabled())
					 LOG.info("getIpAddress(HttpServletRequest) - getRemoteAddr - String ip=" + ip);
				 }
			 }
		 else if (ip.length() > 15) {
			 String[] ips = ip.split(",");
			 for (int index = 0; index < ips.length; index++) {
				 String strIp = ips[index];
				 if (!"unknown".equalsIgnoreCase(strIp)) {
					 ip = strIp;
					 break;
					 }
				 }
			 }
		 return ip;
		 }

	
	 public static InetAddress getCurrentIp() {
		 try {
			 Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
			 while (networkInterfaces.hasMoreElements()) {
				 NetworkInterface ni = (NetworkInterface) networkInterfaces.nextElement();
				 Enumeration nias = ni.getInetAddresses();
				 while (nias.hasMoreElements()) {
					 InetAddress ia = (InetAddress) nias.nextElement();
					 if ((!ia.isLinkLocalAddress()) && (!ia.isLoopbackAddress())
							&& ((ia instanceof Inet4Address)))
						 return ia;
					 }
				 }
			 }
		 catch (SocketException e) {
			 }
		 return null;
		 }

	
	 public static String getInternetIp()
	 {
		 try
		 {
			 Enumeration networks = NetworkInterface.getNetworkInterfaces();
			 while (true) {
				InetAddress ip = null;
				 while (true) {
					 if (networks.hasMoreElements())
					 {
						 Enumeration addrs = ((NetworkInterface) networks.nextElement()).getInetAddresses();
						 if (!addrs.hasMoreElements())
							 continue;
						 ip = (InetAddress) addrs.nextElement();
						
						 if ((ip == null) || (!(ip instanceof Inet4Address)) || (!ip.isSiteLocalAddress())
								|| (ip.getHostAddress().equals(CusAccessObjectUtil.INTRANET_IP)))
						 {
							 break;
							 }
						
						 return ip.getHostAddress();
						 }
					 }
				
				 }
			
	//		 return CusAccessObjectUtil.INTRANET_IP;
		} catch (Exception e) {
			throw new RuntimeException(e);
			 }
		 
		 }

	
	 public static String getV4IP()
	 {
		 String localip = null;
		 String netip = null;
		
		 Enumeration netInterfaces = null;
		 try {
			 netInterfaces = NetworkInterface.getNetworkInterfaces();
			 } catch (SocketException e) {
			 e.printStackTrace();
			 }
		 InetAddress ip = null;
		 boolean finded = false;
		 while ((netInterfaces.hasMoreElements()) && (!finded)) {
			 NetworkInterface ni = (NetworkInterface) netInterfaces.nextElement();
			 Enumeration address = ni.getInetAddresses();
			 while (address.hasMoreElements()) {
				 ip = (InetAddress) address.nextElement();
				 if ((!ip.isSiteLocalAddress()) && (!ip.isLoopbackAddress())
						&& (ip.getHostAddress().indexOf(":") == -1)) {
					 netip = ip.getHostAddress();
					 finded = true;
					 break;
					 }
				if ((!ip.isSiteLocalAddress()) || (ip.isLoopbackAddress()) || (ip.getHostAddress().indexOf(":") != -1))
					 continue;
				 localip = ip.getHostAddress();
				 }
			
			 }
		
		 if ((netip != null) && (!"".equals(netip))) {
			 return netip;
			 }
		 return localip;
		 }
	 }

