 package com.myoa.util.http;
 
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStream;
 import java.io.InputStreamReader;
 import java.security.cert.CertificateException;
 import java.security.cert.X509Certificate;
 import javax.net.ssl.SSLContext;
 import javax.net.ssl.TrustManager;
 import javax.net.ssl.X509TrustManager;
 import org.apache.http.conn.ClientConnectionManager;
 import org.apache.http.conn.scheme.Scheme;
 import org.apache.http.conn.scheme.SchemeRegistry;
 import org.apache.http.conn.ssl.SSLSocketFactory;
 import org.apache.http.impl.client.DefaultHttpClient;
 
 public class SSLClient extends DefaultHttpClient
 {
   public SSLClient()
     throws Exception
   {
     SSLContext ctx = SSLContext.getInstance("TLS");
     X509TrustManager tm = new X509TrustManager()
     {
       public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException
       {
       }
 
       public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException
       {
       }
 
       public X509Certificate[] getAcceptedIssuers() {
         return null;
       }
     };
     ctx.init(null, new TrustManager[] { tm }, null);
     SSLSocketFactory ssf = new SSLSocketFactory(ctx, SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
     ClientConnectionManager ccm = getConnectionManager();
     SchemeRegistry sr = ccm.getSchemeRegistry();
     sr.register(new Scheme("https", 443, ssf));
   }
 
   public static String convertStreamToString(InputStream is) {
     BufferedReader reader = new BufferedReader(new InputStreamReader(is));
     StringBuilder sb = new StringBuilder();
 
     String line = null;
     try {
       while ((line = reader.readLine()) != null)
         sb.append(new StringBuilder().append(line).append("\n").toString());
     }
     catch (IOException e) {
       e.printStackTrace();
     } finally {
       try {
         is.close();
       } catch (IOException e) {
         e.printStackTrace();
       }
     }
     return sb.toString();
   }
 }

