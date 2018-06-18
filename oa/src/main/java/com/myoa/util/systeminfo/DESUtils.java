 package com.myoa.util.systeminfo;
import java.io.UnsupportedEncodingException;
 
import java.security.Key;
import java.security.SecureRandom;
 import java.util.Random;
 import javax.crypto.BadPaddingException;
 import javax.crypto.Cipher;
 import javax.crypto.IllegalBlockSizeException;
 import javax.crypto.SecretKey;
 import javax.crypto.SecretKeyFactory;
 import javax.crypto.spec.DESKeySpec;
 
public class DESUtils
 {
  public static final String MY_KEY = "abcdefg123456789";
  public static final String KEY_ALGORITHM = "DES";
 public static final String CIPHER_ALGORITHM = "DES/ECB/NoPadding";
 
 private static SecretKey keyGenerator(String keyStr)
     throws Exception
  {
     byte[] input = HexString2Bytes(keyStr);
    DESKeySpec desKey = new DESKeySpec(input);

    SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
    SecretKey securekey = keyFactory.generateSecret(desKey);
     return securekey;
  }
 
   private static int parse(char c) {
    if (c >= 'a') return c - 'a' + 10 & 0xF;
    if (c >= 'A') return c - 'A' + 10 & 0xF;
    return c - '0' & 0xF;
  }
 
  public static byte[] HexString2Bytes(String hexstr)
  {
  byte[] b = new byte[hexstr.length() / 2];
     int j = 0;
   for (int i = 0; i < b.length; i++) {
      char c0 = hexstr.charAt(j++);
     char c1 = hexstr.charAt(j++);
       b[i] = (byte)(parse(c0) << 4 | parse(c1));
     }
    return b;
  }

  public static String myEncrypt(String data, String key)
     throws Exception
  {
    int count = 0;
    while (data.getBytes().length % 8 != 0) {
     data = data + "0";
      count++;
     }
 
    Key deskey = keyGenerator(key);

    Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
    SecureRandom random = new SecureRandom();
 
    cipher.init(1, deskey, random);
    byte[] results = cipher.doFinal(data.getBytes());

     for (int i = 0; i < results.length; i++);
   return count + Base64.encodeBase64String(results);
  }
 
  public static String encrypt(String data, String key)
     throws Exception
  {
     Key deskey = keyGenerator(key);

   Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
     SecureRandom random = new SecureRandom();

   cipher.init(1, deskey, random);
     try
    {
     byte[] results = cipher.doFinal(data.trim().getBytes());
 
      return Base64.encodeBase64String(results);
     } catch (IllegalBlockSizeException e) {
       e.printStackTrace();
      throw new Exception("IllegalBlockSizeException", e);
    } catch (BadPaddingException e) {
      e.printStackTrace();
                throw new Exception("BadPaddingException", e);
    }
   }

 public static String myDecrypt(String data, String key)
    throws Exception
  {
     String num = data.substring(0, 1);

    data = data.substring(1, data.length());
     Key deskey = keyGenerator(key);
    Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");

    cipher.init(2, deskey);
 
   String msg = new String(cipher.doFinal(Base64.decodeBase64(data)));

    String publicMsg = new String(cipher.doFinal(Base64.decodeBase64(data)));
 
    publicMsg = publicMsg.substring(0, publicMsg.length() - Integer.parseInt(num));

    return publicMsg;
  }

  public static String chineseCrpt(String chineseStr)
{
			    byte[] bytes;
				try {
					bytes = chineseStr.getBytes("GBK");
					StringBuffer sb = new StringBuffer();
					for (byte aByte : bytes) {
						sb.append(aByte).append(",");
					}
					String s1 = sb.toString();
		
					return s1;
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
      return "";
   }

  public static String chineseDec(String chineseStr)
  {
    String[] stringArr = chineseStr.split(",");
     byte[] mybytes = new byte[stringArr.length];
    for (int i = 0; i < stringArr.length; i++)
  {
       byte b = (byte)Integer.parseInt(stringArr[i]);
      mybytes[i] = b;
    }
    String str = "";
    try {
       str = new String(mybytes, "GBK");
    } catch (Exception e) {
     e.printStackTrace();
    }
 
    return str;
  }

  public static String finalEncry(String chineseStr, String notchineseStr, String macode) {
    String noChinesePwd = null;
    try {
      noChinesePwd = myEncrypt(notchineseStr, MY_KEY);
   } catch (Exception e) {
      e.printStackTrace();
    }
   String chinesePwd = chineseCrpt(chineseStr);

     String finalCrptStr = MY_KEY + chinesePwd + "@123456789qwertyuiopasdfghjklzxcvbnm,.-@" + noChinesePwd;

    return finalCrptStr;
  }

   public static String get16Char()
 {
    String str = new String("0123456789QWERTYUIOPLKJHGFDSAZXCVBNM");
    Random random = new Random();
  int i = random.nextInt(36);
   char[] chars = str.toCharArray();
 
    StringBuffer sb = new StringBuffer();
    for (int j = 0; j < 16; j++) {
       sb.append(chars[i]);
   }
    return sb.toString();
  }
 
  public static String finalDec(String pwd) {
    String[] allPwd = pwd.split("\\@shjkhhghkjkwquu7765xw,\\.-\\@");
     String chinesePwd = allPwd[0];
    String nochinesePwd = allPwd[1];

    String mykey = pwd.substring(0, 16);
   chinesePwd = chinesePwd.substring(16, chinesePwd.length());
    String chineseMsg = chineseDec(chinesePwd);
    String noChineseMsg = null;
   try
     {
	            nochinesePwd = nochinesePwd.substring(16, nochinesePwd.length());
      noChineseMsg = myDecrypt(nochinesePwd, MY_KEY);
    } catch (Exception e) {
     e.printStackTrace();
     }
 
    String finalMsgStr = chineseMsg + noChineseMsg;
   return finalMsgStr;
  }

   public static String decrypt(String data, String key)
    throws Exception
  {
    Key deskey = keyGenerator(key);
    Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");

  cipher.init(2, deskey);

     return new String(cipher.doFinal(Base64.decodeBase64(data)));
  }

  public static void main(String[] args)
     throws Exception
   {
	          System.out.println(chineseCrpt("南京总公司"));
   String source = "oa,1,150,2017-06-30,2025-01-01,xoa17-12345678-1234,60F67735B7636F73,30";
 
    String key = MY_KEY;
     String encryptData = myEncrypt(source, key);
     System.out.println(encryptData);
    String decryptData = myDecrypt(encryptData, key);
   System.out.println(decryptData);
    String[] split = decryptData.split(",");
System.out.println(DESUtils.finalDec("abcdefg123456789-60,-49,-66,-87,-41,-36,-71,-85,-53,-66,@shjkhhghkjkwquu7765xw,.-@abcdefg1234567892h2gyrqa2RRQMrstqqARYhd9m0DFdb3gfFsI0A1t9/Dpa3ZcG6Zz3SKmRbsanqlAhEha21i9HxrqnfPgeg/xKcebXEMJJamve"));
  
MachineUtil.getEncryptMacCode();
}
}

//哈哈贵贵哥