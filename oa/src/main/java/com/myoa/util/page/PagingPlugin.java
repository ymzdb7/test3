 package com.myoa.util.page;
 
 import com.myoa.util.common.L;

 import java.beans.PropertyDescriptor;
 import java.lang.reflect.Field;
 import java.lang.reflect.Method;
 import java.sql.Connection;
 import java.sql.ParameterMetaData;
 import java.sql.PreparedStatement;
 import java.sql.ResultSet;
 import java.util.Iterator;
 import java.util.Map;
 import java.util.Properties;
 import java.util.ResourceBundle;
 import java.util.Set;
 import javax.transaction.NotSupportedException;
 import org.apache.ibatis.executor.parameter.ParameterHandler;
 import org.apache.ibatis.executor.statement.StatementHandler;
 import org.apache.ibatis.mapping.BoundSql;
 import org.apache.ibatis.mapping.MappedStatement;
 import org.apache.ibatis.plugin.Interceptor;
 import org.apache.ibatis.plugin.Intercepts;
 import org.apache.ibatis.plugin.Invocation;
 import org.apache.ibatis.plugin.Plugin;
 import org.apache.ibatis.reflection.MetaObject;
 import org.apache.ibatis.reflection.SystemMetaObject;
 import org.apache.ibatis.scripting.defaults.DefaultParameterHandler;
import org.apache.ibatis.session.Configuration;
 
 @Intercepts({@org.apache.ibatis.plugin.Signature(type=StatementHandler.class, method="prepare", args={Connection.class})})
 public class PagingPlugin
   implements Interceptor
 {
   public static final String[] TABLE_NAME_STR = { "ADDRESS", "ADDRESS_GROUP", "AFFAIR", "ATTACHMENT", "ATTACHMENT_EDIT", "ATTACHMENT_MODULE", "ATTACHMENT_POSITION", "ATTEND_ASK_DUTY", "ATTEND_CONFIG", "ATTEND_DUTY", "ATTEND_DUTY_SHIFT", "ATTEND_EVECTION", "ATTEND_HOLIDAY", "ATTEND_LEAVE", "ATTEND_LEAVE_MANAGER", "ATTEND_MACHINE", "ATTEND_MANAGER", "ATTEND_MOBILE", "ATTEND_OUT", "ATTENDANCE_OVERTIME", "CALENDAR", "DATA_SRC", "DEPARTMENT", "DEPT_MAP", "DIARY", "DIARY_COMMENT", "DIARY_COMMENT_REPLY", "DIARY_SHARE", "DIARY_TOP", "EMAIL", "EMAIL_BODY", "EMAIL_BOX", "EMAIL_BOXGROUP", "EMAIL_KEYWORD", "EMAIL_NAME", "EMAIL_TAG", "EXT_DEPT", "EXT_USER", "FIELD_DATE", "FIELDSETTING", "FILE_COMMENT", "FILE_CONTENT", "FILE_SCORE", "FILE_SORT", "FLOW_CONTROLS", "FLOW_DATA_1", "FLOW_DATA_27", "FLOW_FEEDBACK_COMMON", "FLOW_FORM_TYPE", "FLOW_FORM_VERSION", "FLOW_HOOK", "FLOW_MANAGE_LOG", "FLOW_PRINT_TPL", "FLOW_PRIV", "FLOW_PROCESS", "FLOW_QUERY_TPL", "FLOW_REPORT", "FLOW_REPORT_PRIV", "FLOW_RULE", "FLOW_RUN", "FLOW_RUN_ATTACH", "FLOW_RUN_DATA", "FLOW_RUN_FEEDBACK", "FLOW_RUN_HOOK", "FLOW_RUN_LOG", "FLOW_RUN_PRCS", "FLOW_SORT", "FLOW_TIMER", "FLOW_TRIGGER", "FLOW_TYPE", "FLOW_VERSION", "FORM_SORT", "GBT_CONF", "HELP_QUESTION", "HELP_SORT", "IM_CHAT_LIST", "IM_MESSAGE", "IM_ROOM", "INTERFACE", "IP_RULE", "LOGIN_APP", "MEETING", "MEETING_COMMENT", "MEETING_EQUIPMENT", "MEETING_ROOM", "MEETING_RULE", "MOBILE_APP", "MODULE_MANAGE", "MODULE_PRIV", "MYTABLE", "NETCHAT", "NETDISK", "NEWS", "NEWS_COMMENT", "NOTES", "NOTIFY", "OA_CYCLESOURCE_USED", "OA_SOURCE", "OA_SOURCE_USED", "OFFICE_DEPOSITORY", "OFFICE_LOG", "OFFICE_PRODUCTS", "OFFICE_TASK", "OFFICE_TRANSHISTORY", "OFFICE_TYPE", "ORG_MANAGE", "PICTURE", "PLAN_TYPE", "PORTAL_TEMPLATES", "PORTALS", "REMINDERS", "SAL_DATA", "SAL_FLOW", "SAL_ITEM", "SD_FILE", "SD_SORT", "SEAL", "SEAL_LOG", "SESSION", "SMS", "SMS2", "SMS2_PRIV", "SMS_BODY", "SYS_CODE", "SYS_FUNCTION", "SYS_LOG", "SYS_MENU", "SYS_PARA", "TASK", "TASKCENTER", "TERP_SERVER", "TRAFFIC_RESTRICTION", "UNIT", "URL", "USER_", "USER_EXT", "USER_FUNCTION", "USER_GROUP", "USER_JPUSH", "USER_MAP", "USER_MOBILE_DEVICES", "USER_ONLINE", "USER_PRIV", "USER_WEIXINQY", "VEHICLE", "VEHICLE_MAINTENANCE", "VEHICLE_OIL_CARD", "VEHICLE_OIL_USE", "VEHICLE_OPERATOR", "VEHICLE_USAGE", "VERSION", "VI_FLOW_RUN", "VOTE_DATA", "VOTE_ITEM", "VOTE_TITLE", "WEBMAIL", "WEBMAIL_BODY", "WEIXUN_SHARE", "WEIXUN_SHARE_FOLLOW", "WEIXUN_SHARE_TOPIC", "WINEXE", "WORK_DETAIL", "WORK_PERSON", "WORK_PLAN", "document" };
   private Integer defaultPage;
   private Integer defaultPageSize;
   private Boolean defaultUseFlag;
   private Boolean defaultCheckFlag;
   private Boolean defaultCleanOrderBy;
   private static final String DB_TYPE_MYSQL = "mysql";
   private static final String DB_TYPE_ORACLE = "oracle";
   private static final String DB_TYPE_SQLSERVER = "sqlserver";
   private static final String DB_TYPE_DMSQL = "dmsql";
 
   public Object intercept(Invocation invocation)
     throws Throwable
   {
     StatementHandler stmtHandler = (StatementHandler)getUnProxyObject(invocation.getTarget());
 
     MetaObject metaStatementHandler = SystemMetaObject.forObject(stmtHandler);
     String sql = (String)metaStatementHandler.getValue("delegate.boundSql.sql");
 
     MappedStatement mappedStatement = (MappedStatement)metaStatementHandler.getValue("delegate.mappedStatement");
 
     String dbType = returnSqlType();
 
     BoundSql boundSql = (BoundSql)metaStatementHandler.getValue("delegate.boundSql");
 
     if (!checkSelect(sql)) {
       L.d(new Object[] { "you sql is not select ,pleasecheck" });
       if ("dmsql".equals(dbType)) {
         return preDmSQL(invocation, metaStatementHandler, boundSql);
       }
       return invocation.proceed();
     }
 
     Object parameterObject = boundSql.getParameterObject();
     PageParams pageParams = getPageParamsForParamObj(parameterObject);
     if (pageParams == null)
     {
       if ("dmsql".equals(dbType)) {
         return preDmSQL(invocation, metaStatementHandler, boundSql);
       }
       return invocation.proceed();
     }
 
     Boolean useFlag = pageParams.getUseFlag() == null ? this.defaultUseFlag : pageParams.getUseFlag();
     if (!useFlag.booleanValue()) {
       L.d(new Object[] { new StringBuilder().append("useFlag").append(useFlag).toString() });
       if ("dmsql".equals(dbType)) {
         return preDmSQL(invocation, metaStatementHandler, boundSql);
       }
       return invocation.proceed();
     }
 
     Integer pageNum = pageParams.getPage() == null ? this.defaultPage : pageParams.getPage();
     Integer pageSize = pageParams.getPageSize() == null ? this.defaultPageSize : pageParams.getPageSize();
     Boolean checkFlag = pageParams.getCheckFlag() == null ? this.defaultCheckFlag : pageParams.getCheckFlag();
     Boolean cleanOrderBy = pageParams.getCleanOrderBy() == null ? this.defaultCleanOrderBy : pageParams.getCleanOrderBy();
 
     int total = getTotal(invocation, metaStatementHandler, boundSql, cleanOrderBy, dbType);
 
     pageParams.setTotal(Integer.valueOf(total));
 
     int totalPage = total % pageSize.intValue() == 0 ? total / pageSize.intValue() : total / pageSize.intValue() + 1;

     pageParams.setTotalPage(Integer.valueOf(totalPage));
 
     checkPage(checkFlag, pageNum, Integer.valueOf(totalPage));
 
     return preparedSQL(invocation, metaStatementHandler, boundSql, pageNum.intValue(), pageSize.intValue(), dbType);
   }
 
   public PageParams getPageParamsForParamObj(Object parameterObject)
     throws Exception
   {
     PageParams pageParams = null;
     if (parameterObject == null) {
       return null;
     }
 
     if ((parameterObject instanceof Map))
     {
       Map paramMap = (Map)parameterObject;
       Set keySet = paramMap.keySet();
       Iterator iterator = keySet.iterator();
       while (iterator.hasNext()) {
         String key = (String)iterator.next();
         Object value = paramMap.get(key);
         if ((value instanceof PageParams))
           return (PageParams)value;
       }
     } else {
       if ((parameterObject instanceof PageParams)) {
         return (PageParams)parameterObject;
       }
       Field[] fields = parameterObject.getClass().getDeclaredFields();
 
       for (Field field : fields) {
         if (field.getType() == PageParams.class) {
           PropertyDescriptor pd = new PropertyDescriptor(field.getName(), parameterObject.getClass());
           Method method = pd.getReadMethod();
           return (PageParams)method.invoke(parameterObject, new Object[0]);
         }
       }
     }
     return pageParams;
   }
 
   private boolean checkSelect(String sql)
   {
     String trimSql = sql.trim();
     int idx = trimSql.toLowerCase().indexOf("select");
     return idx == 0;
   }
 
   private void checkPage(Boolean checkFlag, Integer pageNum, Integer pageTotal)
     throws Throwable
   {
     if (checkFlag.booleanValue())
     {
       if (pageNum.intValue() > pageTotal.intValue())
         throw new Exception(new StringBuilder().append("查询失败，查询页码【").append(pageNum).append("】大于总页数【").append(pageTotal).append("】！！").toString());
     }
   }
 
   private Object preparedSQL(Invocation invocation, MetaObject metaStatementHandler, BoundSql boundSql, int pageNum, int pageSize, String dbType)
     throws Exception
   {
     String sql = boundSql.getSql();
     String newSql = getPageDataSQL(sql, dbType);
 
     metaStatementHandler.setValue("delegate.boundSql.sql", newSql);
 
     Object statementObj = invocation.proceed();
 
     preparePageDataParams((PreparedStatement)statementObj, pageNum, pageSize, dbType);
     return statementObj;
   }
 
   private String preDmStrSql(String sql) {
     String currSql = sql;
     currSql = currSql.toUpperCase();
     currSql = currSql.replaceAll("`", "");
     currSql = currSql.replaceAll("USER ", "USER_ ");
     for (String a : TABLE_NAME_STR) {
       currSql = currSql.replaceAll(new StringBuilder().append(" ").append(a).append(" ").toString(), new StringBuilder().append(" XOA1004.").append(a).append(" ").toString());
       currSql = currSql.replaceAll(new StringBuilder().append(",").append(a).append(" ").toString(), new StringBuilder().append(",XOA1004.").append(a).append(" ").toString());
       currSql = currSql.replaceAll(new StringBuilder().append(" ").append(a).append(".").toString(), new StringBuilder().append(" XOA1004.").append(a).append(".").toString());
     }
     L.s(new Object[] { "renderSql:", currSql });
     return currSql;
   }
   private Object preDmSQL(Invocation invocation, MetaObject metaStatementHandler, BoundSql boundSql) throws Exception {
     String sql = boundSql.getSql();
 
     metaStatementHandler.setValue("delegate.boundSql.sql", preDmStrSql(sql));
 
     Object statementObj = invocation.proceed();
     return statementObj;
   }
 
   private int getTotal(Invocation ivt, MetaObject metaStatementHandler, BoundSql boundSql, Boolean cleanOrderBy, String dbType)
     throws Throwable
   {
     MappedStatement mappedStatement = (MappedStatement)metaStatementHandler.getValue("delegate.mappedStatement");
 
     Configuration cfg = mappedStatement.getConfiguration();
 
     String sql = (String)metaStatementHandler.getValue("delegate.boundSql.sql");
 
     if (cleanOrderBy.booleanValue()) {
       sql = cleanOrderByForSql(sql);
     }
     String countSql = getTotalSQL(sql, dbType);
 
     Connection connection = (Connection)ivt.getArgs()[0];
     PreparedStatement ps = null;
     int total = 0;
     try
     {
       ps = connection.prepareStatement(countSql);
 
       BoundSql countBoundSql = new BoundSql(cfg, countSql, boundSql.getParameterMappings(), boundSql.getParameterObject());
 
       ParameterHandler handler = new DefaultParameterHandler(mappedStatement, boundSql.getParameterObject(), countBoundSql);
 
       handler.setParameters(ps);
 
       ResultSet rs = ps.executeQuery();
       while (rs.next())
         total = rs.getInt("total");
     }
     finally
     {
       if (ps != null) {
         ps.close();
       }
     }
     return total;
   }
 
   private String cleanOrderByForSql(String sql) {
     StringBuilder sb = new StringBuilder(sql);
     String newSql = sql.toLowerCase();
 
     if (newSql.indexOf("order") == -1) {
       return sql;
     }
     int idx = newSql.lastIndexOf("order");
     return sb.substring(0, idx).toString();
   }
 
   private Object getUnProxyObject(Object target)
   {
     MetaObject metaStatementHandler = SystemMetaObject.forObject(target);
 
     Object object = null;
     while (metaStatementHandler.hasGetter("h")) {
       object = metaStatementHandler.getValue("h");
     }
     if (object == null) {
       return target;
     }
     return object;
   }
 
   public Object plugin(Object statementHandler)
   {
     return Plugin.wrap(statementHandler, this);
   }
 
   public void setProperties(Properties props)
   {
     String strDefaultPage = props.getProperty("default.page", "1");
     String strDefaultPageSize = props.getProperty("default.pageSize", "10");
     String strDefaultUseFlag = props.getProperty("default.useFlag", "false");
     String strDefaultCheckFlag = props.getProperty("default.checkFlag", "false");
     String StringDefaultCleanOrderBy = props.getProperty("default.cleanOrderBy", "false");
 
     this.defaultPage = Integer.valueOf(Integer.parseInt(strDefaultPage));
     this.defaultPageSize = Integer.valueOf(Integer.parseInt(strDefaultPageSize));
     this.defaultUseFlag = Boolean.valueOf(Boolean.parseBoolean(strDefaultUseFlag));
     this.defaultCheckFlag = Boolean.valueOf(Boolean.parseBoolean(strDefaultCheckFlag));
     this.defaultCleanOrderBy = Boolean.valueOf(Boolean.parseBoolean(StringDefaultCleanOrderBy));
   }
 
   private String getTotalSQL(String currSql, String dbType)
     throws NotSupportedException
   {
     if ("mysql".equals(dbType))
       return new StringBuilder().append("select count(*) as total from (").append(currSql).append(") $_paging").toString();
     if ("oracle".equals(dbType))
       return new StringBuilder().append("select count(*) as total from (").append(currSql).append(")").toString();
     if ("dmsql".equals(dbType)) {
       currSql = preDmStrSql(currSql);
       return new StringBuilder().append("select count(*) as total from (").append(currSql).append(")").toString().toUpperCase();
     }
     throw new NotSupportedException("当前插件未支持此类型数据库");
   }
 
   private String getPageDataSQL(String currSql, String dbType)
     throws NotSupportedException
   {
     if ("mysql".equals(dbType))
     {
       return new StringBuilder().append("select * from (").append(currSql).append(") $_paging_table limit ?, ?").toString();
     }if ("oracle".equals(dbType))
       return new StringBuilder().append(" select * from (select cur_sql_result.*, rownum rn from (").append(currSql).append(") cur_sql_result  where rownum <= ?) where rn > ?").toString();
     if ("dmsql".equals(dbType)) {
       currSql = preDmStrSql(currSql);
       return new StringBuilder().append(" select * from (select cur_sql_result.*, rownum rn from (").append(currSql).append(") cur_sql_result  where rownum <= ?) where rn > ?").toString().toUpperCase();
     }
     throw new NotSupportedException("当前插件未支持此类型数据库");
   }
 
   private void preparePageDataParams(PreparedStatement ps, int pageNum, int pageSize, String dbType)
     throws Exception
   {
     int idx = ps.getParameterMetaData().getParameterCount();
     if ("mysql".equals(dbType))
     {
       ps.setInt(idx - 1, (pageNum - 1) * pageSize);
       ps.setInt(idx, pageSize);
     } else if ("oracle".equals(dbType)) {
       ps.setInt(idx - 1, pageNum * pageSize);
       ps.setInt(idx, (pageNum - 1) * pageSize);
     } else if ("dmsql".equals(dbType)) {
       ps.setInt(idx - 1, pageNum * pageSize);
       ps.setInt(idx, (pageNum - 1) * pageSize);
     } else {
       throw new NotSupportedException("当前插件未支持此类型数据库");
     }
   }
 
   public String returnSqlType()
   {
     String retrunSql = "";
 
     String name = ResourceBundle.getBundle("jdbc-sql").getString("driverClassName");
     if ("com.mysql.jdbc.Driver".equals(name.trim()))
       retrunSql = "mysql";
     else if ("oracle.jdbc.driver.OracleDriver".equals(name.trim()))
       retrunSql = "oracle";
     else if ("com.microsoft.sqlserver.jdbc.SQLServerDriver".equals(name.trim()))
       retrunSql = "sqlserver";
     else if ("dm.jdbc.driver.DmDriver".equals(name.trim())) {
       retrunSql = "dmsql";
     }
     return retrunSql;
   }
 }