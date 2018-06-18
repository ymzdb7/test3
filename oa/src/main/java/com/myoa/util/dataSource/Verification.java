 package com.myoa.util.dataSource;
 
 import com.ibatis.common.resources.Resources;
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.ResultSet;
 import java.sql.Statement;
 import java.util.Properties;
 
 public class Verification
 {
   public static boolean CheckIsExistTable(Connection connection, String driver, String url, String username, String password, String tableName)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SHOW TABLES LIKE '" + tableName + "'";
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistfield(Connection connection, String driver, String url, String username, String password, String tableName, String fieldName)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "show columns from " + tableName + " like " + "'" + fieldName + "'";
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistMenu(Connection connection, String driver, String url, String username, String password, String menuId)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM sys_menu WHERE MENU_ID ='" + menuId + "'";
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistFunction(Connection connection, String driver, String url, String username, String password, String functionId)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM sys_function WHERE FUNC_ID =" + functionId;
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistIndex(Connection connection, String driver, String url, String username, String password, String tableName, String fieldName)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SHOW INDEX FROM " + tableName + " WHERE column_name LIKE" + "'" + fieldName + "'";
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistCode(Connection connection, String driver, String url, String username, String password, String codeNo, String parentNo)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM sys_code WHERE CODE_NO ='" + codeNo + "'" + " and PARENT_NO =" + "'" + parentNo + "'";
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckCode(Connection connection, String driver, String url, String username, String password, String codeId)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM sys_code WHERE CODE_ID ='" + codeId + "'";
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistParam(Connection connection, String driver, String url, String username, String password, String paramName)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM sys_para WHERE  PARA_NAME ='" + paramName + "'";
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistThing(Connection connection, String driver, String url, String username, String password, String id)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM flow_trigger WHERE ID =" + id;
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistUserPriv(Connection connection, String driver, String url, String username, String password, String userPriv)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM user_priv WHERE USER_PRIV =" + userPriv;
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistUserFunction(Connection connection, String driver, String url, String username, String password, String uid)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM user_function WHERE uid =" + uid;
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistKgSign(Connection connection, String driver, String url, String username, String password, String relation_Id)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM kg_relation_keysign WHERE RELATION_ID =" + relation_Id;
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistKgkeyUser(Connection connection, String driver, String url, String username, String password, String key_UserId)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM kg_relation_keyuser WHERE KEY_USER_ID =" + key_UserId;
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistkgSignature(Connection connection, String driver, String url, String username, String password, String SignNature_ID)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM kg_signature WHERE SIGNATURE_ID =" + SignNature_ID;
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistkgSignKey(Connection connection, String driver, String url, String username, String password, String signKey_Id)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM kg_signkey WHERE SIGNKEY_ID =" + signKey_Id;
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistInfoCenter(Connection connection, String driver, String url, String username, String password, String infoId)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM info_center WHERE INFO_ID =" + infoId;
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistWidget(Connection connection, String driver, String url, String username, String password, String id)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM widget WHERE ID =" + id;
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistSysPara(Connection connection, String driver, String url, String username, String password, String paraName)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM sys_para WHERE PARA_NAME ='" + paraName + "'";
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistUser(Connection connection, String driver, String url, String username, String password, String uid)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM user WHERE uid ='" + uid + "'";
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistPor(Connection connection, String driver, String url, String username, String password, String portalsId)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM portals WHERE portals_id ='" + portalsId + "'";
 
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 
   public static boolean CheckIsExistDepartment(Connection connection, String driver, String url, String username, String password, String deptId)
   {
     Boolean flag = Boolean.valueOf(false);
     try {
       Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
       Class.forName(driver);
       connection = DriverManager.getConnection(url, username, password);
       String sql = "SELECT * FROM department WHERE DEPT_ID ='" + deptId + "'";
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while (rs.next()) {
         flag = Boolean.valueOf(true);
       }
       rs.close();
       st.close();
     }
     catch (Exception e) {
       e.printStackTrace();
     }
     return flag.booleanValue();
   }
 }

