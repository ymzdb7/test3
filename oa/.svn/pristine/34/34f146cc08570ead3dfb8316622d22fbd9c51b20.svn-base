  package com.myoa.service.common.impl;
  
  import com.ibatis.common.jdbc.ScriptRunner;
  import com.ibatis.common.resources.Resources;
import com.myoa.dao.common.SysCodeMapper;
import com.myoa.dao.common.SysParaMapper;
import com.myoa.dao.strstatus.StrstatusMapper;
import com.myoa.dao.users.OrgManageMapper;
import com.myoa.dao.version.VersionMapper;
import com.myoa.model.common.SysCode;
import com.myoa.model.common.SysPara;
import com.myoa.model.strstatus.Strstatus;
import com.myoa.model.users.OrgManage;
import com.myoa.model.version.Version;
import com.myoa.service.common.SysCodeService;
import com.myoa.service.users.OrgManageService;
import com.myoa.util.Constant;
import com.myoa.util.DBPropertiesUtils;
import com.myoa.util.ExcelUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.dataSource.Verification;

  import java.io.BufferedInputStream;
  import java.io.BufferedReader;
  import java.io.File;
  import java.io.FileInputStream;
  import java.io.IOException;
  import java.io.InputStream;
  import java.io.InputStreamReader;
  import java.io.OutputStream;
  import java.io.OutputStreamWriter;
  import java.net.URL;
  import java.sql.Connection;
  import java.sql.DriverManager;
  import java.sql.ResultSet;
  import java.sql.SQLException;
  import java.sql.Statement;
  import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.HashMap;
  import java.util.Iterator;
  import java.util.List;
  import java.util.Map;
  import java.util.Properties;
  import java.util.ResourceBundle;
  import javax.annotation.Resource;
  import javax.servlet.ServletContext;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse;
  import javax.servlet.http.HttpSession;
  import net.sf.json.JSONObject;
  import org.apache.commons.collections.map.HashedMap;
  import org.apache.log4j.Logger;
  import org.apache.poi.hssf.usermodel.HSSFSheet;
  import org.apache.poi.hssf.usermodel.HSSFWorkbook;
  import org.apache.poi.ss.usermodel.Cell;
  import org.apache.poi.ss.usermodel.Row;
  import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
  
  @Service
  public class SysCodeServiceImpl
    implements SysCodeService
  {
    Logger logger = Logger.getLogger(SysCodeServiceImpl.class);
  
    @Resource
    private OrgManageService orgManageService;
  
    @Resource
    private VersionMapper versionMapper;
  
    @Resource
    private StrstatusMapper strstatusMapper;
  
    @Resource
    SysParaMapper sysParaMapper;
  
    @Resource
    private SysCodeMapper sysCodeMapper;
  
    @Resource
    private OrgManageMapper orgManageMapper;
  
    @Transactional
    public ToJson editisCodeNoExits(SysCode sysCode, String oldCodeNo) { ToJson toJson = new ToJson(1, "error");
      try
      {
        List sysCodesList;
        if ((sysCode != null) && (("".equals(sysCode.getParentNo())) || (sysCode.getParentNo() == null))) {
          sysCodesList = this.sysCodeMapper.isSysCodeNoExits(sysCode);
        } else {
          if ((sysCode != null) && 
            (sysCode.getParentNo().equals("NOTIFY"))) {
            String singleNewsArr = this.sysParaMapper.selectNotifySingleNew();
            if (singleNewsArr.contains(oldCodeNo + "-")) {
              int oldPos = singleNewsArr.indexOf(oldCodeNo + "-");
              String headStr = singleNewsArr.substring(0, oldPos);
              String bodyStr = singleNewsArr.substring(oldPos, singleNewsArr.length());
              int bodyStartPos = bodyStr.indexOf(",");
              String tailStr = bodyStr.substring(bodyStartPos + 1, bodyStr.length());
              singleNewsArr = headStr.concat(tailStr);
            }
            String newSysPara = singleNewsArr.concat(sysCode.getCodeNo() + "-0,");
            SysPara sysPara = new SysPara();
            sysPara.setParaName("NOTIFY_AUDITING_SINGLE_NEW");
            sysPara.setParaValue(newSysPara);
            this.sysParaMapper.updateSysPara(sysPara);
          }
  
          sysCodesList = this.sysCodeMapper.isChildCodeNoExits(sysCode);
        }
  
        if ((sysCodesList != null) && (sysCodesList.size() == 1) && 
          (oldCodeNo != null))
        {
          String dbCodeNo = ((SysCode)sysCodesList.get(0)).getCodeNo();
  
          if (oldCodeNo.equals(dbCodeNo)) {
            toJson.setFlag(1);
            toJson.setMsg("ok");
            return toJson;
          }
  
        }
  
        if ((sysCodesList != null) && (sysCodesList.size() >= 1)) {
          toJson.setFlag(0);
          toJson.setMsg("ok");
        }
      } catch (Exception e) {
        toJson.setFlag(1);
        toJson.setMsg("err");
        L.e(new Object[] { "SysCodeServiceImpleditisCodeNoExits：" + e });
      }
  
      return toJson;
    }
  
    public ToJson<SysCode> getSysCode(String parentNo)
    {
      ToJson codeJson = new ToJson();
      try {
        List code = this.sysCodeMapper.getSysCode(parentNo);
        codeJson.setObj(code);
        codeJson.setFlag(0);
        codeJson.setMsg("ok");
      } catch (Exception e) {
        codeJson.setFlag(1);
        codeJson.setMsg("err");
      }
      return codeJson;
    }
  
    public List<SysCode> getAllSysCode()
    {
      List list = this.sysCodeMapper.getAllSysCode();
      return list;
    }
  
    public void update(SysCode sysCode)
    {
      this.sysCodeMapper.update(sysCode);
    }
  
    public List<SysCode> getLogType()
    {
      String[] type = { "登录日志", "登录密码错误", "退出系统" };
      List sysCodeList = this.sysCodeMapper.getLogType("PARENT_NO");
      Iterator it = sysCodeList.iterator();
      while (it.hasNext()) {
        SysCode sysCode = (SysCode)it.next();
        if (Arrays.asList(type).contains(sysCode.getCodeName())) {
          continue;
        }
        it.remove();
      }
  
      return sysCodeList;
    }
  
    public String getLogNameByNo(String codeNo)
    {
      String logTypeName = this.sysCodeMapper.getLogNameByNo(codeNo);
  
      return logTypeName;
    }
  
    public void deleteSysCode(SysCode sysCode)
    {
      String codeByCodeId = this.sysCodeMapper.getCodeByCodeId(sysCode.getCodeId());
  
      if ("".equals(codeByCodeId))
        this.sysCodeMapper.delete(sysCode);
      else
        this.sysCodeMapper.deleteChild(sysCode);
    }
  
    public void addSysMainCode(SysCode sysCode)
    {
      sysCode.setCodeExt("");
      this.sysCodeMapper.addSysMainCode(sysCode);
    }
  
    public Boolean isCodeOrderExits(SysCode sysCode)
    {
      List sysCodesList;
      if ((sysCode != null) && (("".equals(sysCode.getParentNo())) || (sysCode.getParentNo() == null)))
        sysCodesList = this.sysCodeMapper.isSysCodeOrderExits(sysCode);
      else {
        sysCodesList = this.sysCodeMapper.isChildCodeOrderExits(sysCode);
      }
  
      if ((sysCodesList != null) && (sysCodesList.size() > 0)) {
        return Boolean.valueOf(true);
      }
  
      return Boolean.valueOf(false);
    }
  
    public Boolean isCodeNoExits(SysCode sysCode)
    {
      List sysCodesList;
      if ((sysCode != null) && (("".equals(sysCode.getParentNo())) || (sysCode.getParentNo() == null))) {
        sysCodesList = this.sysCodeMapper.isSysCodeNoExits(sysCode);
      }
      else
      {
        sysCodesList = this.sysCodeMapper.isChildCodeNoExits(sysCode);
      }
  
      if ((sysCodesList != null) && (sysCodesList.size() > 0)) {
        return Boolean.valueOf(true);
      }
      return Boolean.valueOf(false);
    }
  
    public Boolean iseditCodeNoExits(SysCode sysCode)
    {
      List<SysCode> sysCodesList;
      if ((sysCode != null) && (("".equals(sysCode.getParentNo())) || (sysCode.getParentNo() == null))) {
          sysCodesList = this.sysCodeMapper.iseditSysCodeNoExits(sysCode);
        if ((sysCodesList != null) && (sysCodesList.size() == 1)) {
          if ((((SysCode)sysCodesList.get(0)).getParentNo() != null) && (!((SysCode)sysCodesList.get(0)).getParentNo().equals(sysCode.getCodeNo())))
          {
            return Boolean.valueOf(true);
          }
          return Boolean.valueOf(false);
        }
      }
      else
      {
        sysCodesList = this.sysCodeMapper.isChildCodeNoExits(sysCode);
      }
  
      if ((sysCodesList != null) && (sysCodesList.size() > 0)) {
        return Boolean.valueOf(true);
      }
      return Boolean.valueOf(false);
    }
  
    public Boolean ChildisCodeNoExits(SysCode sysCode)
    {
      List childCodeNoExits = this.sysCodeMapper.isChildCodeNoExits(sysCode);
      boolean flag;
      if ((childCodeNoExits != null) && (childCodeNoExits.size() > 0))
        flag = true;
      else {
        flag = false;
      }
      return Boolean.valueOf(flag);
    }
  
    public void addChildSysCode(SysCode sysCode)
    {
      Boolean codeNoExits = isCodeNoExits(sysCode);
      Boolean codeOrderExits = isCodeOrderExits(sysCode);
      if ((sysCode != null) && 
        (sysCode.getParentNo().equals("NOTIFY"))) {
        String singleNewsArr = this.sysParaMapper.selectNotifySingleNew();
        String newSysPara = singleNewsArr.concat(sysCode.getCodeNo() + "-0,");
        SysPara sysPara = new SysPara();
        sysPara.setParaName("NOTIFY_AUDITING_SINGLE_NEW");
        sysPara.setParaValue(newSysPara);
        this.sysParaMapper.updateSysPara(sysPara);
      }
  
      if ((sysCode != null) && (sysCode.getParentNo() != null) && (!codeNoExits.booleanValue()) && (!codeOrderExits.booleanValue()))
      {
        sysCode.setCodeExt("");
        sysCode.setCodeFlag("1");
        this.sysCodeMapper.addSysChildCode(sysCode);
      }
    }
  
    public List<SysCode> getChildSysCode(SysCode sysCode)
    {
      if ((sysCode != null) && (sysCode.getParentNo() != null)) {
        return this.sysCodeMapper.getSysCode(sysCode.getParentNo());
      }
  
      return null;
    }
  
    public SysCode getCodeByCodeNo(SysCode sysCode)
    {
      return this.sysCodeMapper.getCodeByCodeNo(sysCode);
    }
  
    public ToJson<List<SysCode>> getErrSysCode()
    {
      List<SysCode> list = new ArrayList<SysCode>();
  
      List<SysCode> errlist = new ArrayList<SysCode>();
      ToJson<List<SysCode>> json = new ToJson<List<SysCode>>();
      try
      {
        List<SysCode> mainCode = this.sysCodeMapper.getMainCode();
  
        for (SysCode sysCode : mainCode) {
          list.add(sysCode);
          List<SysCode> childCode = this.sysCodeMapper.getChildCode(sysCode.getCodeNo());
  
          for (SysCode sysCode1 : childCode) {
            list.add(sysCode1);
          }
        }
  
        StringBuffer sb = new StringBuffer();
  
        List<SysCode> allCode = this.sysCodeMapper.getAllCode();
        for (SysCode sysCode : list) {
          Integer codeId = sysCode.getCodeId();
          sb.append(",").append(codeId).append(",");
        }
  
        for (int i = 0; i < allCode.size(); i++) {
          Integer id = ((SysCode)allCode.get(i)).getCodeId();
          if (!sb.toString().contains("," + id + ",")) {
            errlist.add(allCode.get(i));
          }
  
        }
  
        json.setObject(errlist);
        json.setFlag(0);
        json.setMsg("ok");
      }
      catch (Exception e)
      {
        json.setFlag(1);
        json.setMsg("err");
      }
      return json;
    }
  
    public ToJson<Object> recoverCode(HttpServletRequest request, String path)
    {
      String sqlType = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
  
      ToJson json = new ToJson();
      String username = (String)DBPropertiesUtils.getDbMsg(request).get("username");
      String password = (String)DBPropertiesUtils.getDbMsg(request).get("password");
      String host = (String)DBPropertiesUtils.getDbMsg(request).get("ip");
  
      String realPath = request.getSession().getServletContext().getRealPath("/");
      String Topath = realPath + "\\ui\\lib";
      String loginCommand = new StringBuffer().append(" share bin/mysql -u").append(username).append(" -p").append(password).append(" -h").append(host).toString();
  
      String switchCommand = new StringBuffer("use ").append(sqlType).toString();
  
      String charsetCommand = new StringBuffer("set names utf8;").toString();
  
      String importCommand = new StringBuffer("source ").append(path).toString();
  
      String[] commands = { loginCommand, switchCommand, charsetCommand, importCommand };
      try {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(commands[0]);
  
        OutputStream os = process.getOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(os);
  
        writer.write(commands[1] + "\r\n");
        Thread.sleep(300L);
        writer.write(commands[2] + "\r\n");
        Thread.sleep(300L);
        writer.write(commands[3]);
        Thread.sleep(300L);
        json.setFlag(0);
        json.setMsg("ok");
        writer.flush();
        writer.close();
        os.close();
      }
      catch (IOException e)
      {
        File file;
        json.setFlag(1);
        json.setMsg("err");
        e.printStackTrace();
      }
      catch (InterruptedException e)
      {
        File file;
        e.printStackTrace();
      }
      finally
      {
        try
        { 
          File file = new File(path);
          file.delete();
        }
        catch (Exception e)
        {
        }
      }
  
      return json;
    }
  
    public void exportCode(HttpServletRequest request, HttpServletResponse response)
    {
      ResourceBundle rb = ResourceBundle.getBundle("jdbc-sql");
  
      String sqlType = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
  
      String realPath = request.getSession().getServletContext().getRealPath("/");
      String username = (String)DBPropertiesUtils.getDbMsg(request).get("username");
      String password = (String)DBPropertiesUtils.getDbMsg(request).get("password");
      String host = (String)DBPropertiesUtils.getDbMsg(request).get("ip");
      String tablename = "sys_code";
      String exportPath = realPath;
      String fileName = "sys_code.sql";
      String path = exportPath + "\\ui\\lib";
      String[] command = { " sh ", "-c ", " bin/mysqldump -h" + host + " -u" + username + " -p" + password, sqlType + " " + tablename + " -r" + exportPath };
      try {
        Process runtimeProcess = Runtime.getRuntime().exec(command);
        int processComplete = runtimeProcess.waitFor();
        File file = new File(exportPath + fileName);
        Thread.sleep(300L);
        if (file.exists()) {
          response.setContentType("multipart/form-data");
  
          response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);
  
          byte[] buffer = new byte[1024];
          FileInputStream fis = null;
          BufferedInputStream bis = null;
          try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            OutputStream os = response.getOutputStream();
            int i = bis.read(buffer);
            while (i != -1) {
              os.write(buffer, 0, i);
              i = bis.read(buffer);
            }
          }
          catch (Exception e) {
            e.printStackTrace();
          }
          if (bis != null) {
            try {
              bis.close();
            }
            catch (IOException e) {
              e.printStackTrace();
            }
          }
          if (fis != null)
            try {
              fis.close();
            }
            catch (IOException e) {
              e.printStackTrace();
            }
        }
      }
      catch (Exception e)
      {
        File file1;
        e.printStackTrace();
      }
      finally
      {
        try
        {
          File file1;
          Thread.sleep(300L);
          file1 = new File(exportPath + fileName);
          Thread.sleep(300L);
          if (file1.exists())
            file1.delete();
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  
    public ToJson<SysCode> getErrInfo(String CodeId)
    {
      ToJson json = new ToJson();
      try {
        if (CodeId != null) {
          SysCode codeByCodeId = this.sysCodeMapper.getCodeByCodeIds(Integer.valueOf(CodeId));
          json.setObject(codeByCodeId);
          json.setFlag(0);
          json.setMsg("ok");
        }
      } catch (Exception e) {
        e.printStackTrace();
        json.setFlag(1);
        json.setMsg("err");
      }
      return json;
    }
  
    public ToJson<SysCode> deleteErrCode(String CodeId)
    {
      ToJson json = new ToJson();
      if (CodeId != null) {
        try {
          this.sysCodeMapper.deleteErrCode(Integer.valueOf(CodeId));
          json.setFlag(0);
          json.setMsg("ok");
        } catch (NumberFormatException e) {
          e.printStackTrace();
          json.setFlag(1);
          json.setMsg("err");
        }
      }
      return json;
    }
  
    public ToJson<List<SysCode>> getAllCode()
    {
      ToJson<List<SysCode>> json = new ToJson<List<SysCode>>();
      List<SysCode> list = new ArrayList<SysCode>();
      try
      {
        List<SysCode> mainCode = this.sysCodeMapper.getMainCode();
  
        for (SysCode sysCode : mainCode) {
          list.add(sysCode);
        }
        json.setObject(list);
        json.setMsg("ok");
        json.setFlag(0);
      } catch (Exception e) {
        e.printStackTrace();
        json.setObject(null);
        json.setMsg("err");
        json.setFlag(1);
      }
      return json;
    }
  
    public JSONObject DropDownBoxs(String[] CodeId)
    {
      JSONObject jsonObject = null;
      List list = new ArrayList();
      Map map = new HashMap();
      try
      {
        for (String s : CodeId) {
          List sysCode = this.sysCodeMapper.getSysCode(s);
          map.put(s, sysCode);
        }
      } catch (NumberFormatException e) {
        e.printStackTrace();
      }
  
      jsonObject = JSONObject.fromObject(map);
      return jsonObject;
    }
  
    public ToJson<Object> updateDabase()
    {
      ToJson json = new ToJson(1, "err");
      try {
        String classpath = getClass().getResource("/").getPath();
        String webappRoot = classpath.replaceAll("WEB-INF ", "ui update/");
        File file = new File(webappRoot);
  
        if (!file.exists()) {
          file.mkdir();
        }
  
        if (file.isDirectory()) {
          String[] files = file.list();
          if (files.length > 0) {
            for (int j = 0; j < files.length; j++) {
              ToJson zh_cn = this.orgManageService.queryId("zh_CN");
              List obj = zh_cn.getObj();
              int size = obj.size();
              for (int i = 0; i < size; i++) {
                Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
                String url = props.getProperty("url" + ((OrgManage)obj.get(i)).getOid());
                String driver = props.getProperty("driverClassName");
                String username = props.getProperty("uname" + ((OrgManage)obj.get(i)).getOid());
                String password = props.getProperty("password" + ((OrgManage)obj.get(i)).getOid());
                Class.forName(driver).newInstance();
                Connection conn = DriverManager.getConnection(url, username, password);
                ScriptRunner runner = new ScriptRunner(conn, false, false);
                runner.setErrorLogWriter(null);
                runner.setLogWriter(null);
                runner.runScript(new InputStreamReader(new FileInputStream(webappRoot + "/" + files[j]), "utf-8"));
              }
              json.setMsg("ok");
              json.setFlag(0);
            }
          } else {
            json.setMsg("不存在更新文件");
            json.setFlag(0);
          }
        }
      }
      catch (Exception e)
      {
        json.setMsg(e.getMessage());
        json.setFlag(1);
        e.printStackTrace();
      }
      return json;
    }
  
    public ToJson<Object> editDabase(HttpServletRequest request, HttpServletResponse response)
    {
      ToJson json = new ToJson(1, "err");
      String classpath = getClass().getResource("/").getPath();
      String webappRoot = classpath.replaceAll("WEB-INF ", "ui update/");
      StringBuffer stringBuffer = new StringBuffer();
      String urltd_oa = new String();
      String unametd_oa = new String();
      String passwordtd_oa = new String();
      String proRoot = classpath.replaceAll("WEB-INF ", "ui properties/");
      try {
        File file1 = new File(proRoot + "jdbc.txt");
  
        if ((file1.isFile()) && (file1.exists()))
        {
          InputStreamReader read = new InputStreamReader(new FileInputStream(file1));
  
          BufferedReader bufferedReader = new BufferedReader(read);
          String lineTxt = null;
          int i = 1;
          while ((lineTxt = bufferedReader.readLine()) != null) {
            if (i == 1) {
              urltd_oa = lineTxt;
            }
            else if (i == 2)
              unametd_oa = lineTxt;
            else {
              passwordtd_oa = lineTxt;
            }
            i++;
          }
          read.close();
        }
  
        Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
        String url = urltd_oa;
        String driver = props.getProperty("driverClassName");
        String username = unametd_oa;
        String password = passwordtd_oa;
        Class.forName(driver).newInstance();
        Connection conn = DriverManager.getConnection(url, username, password);
  
        String crsql = "CREATE TABLE `str_status` (\n  `ID` int(11) NOT NULL AUTO_INCREMENT,\n  `CONTENT` varchar(255) DEFAULT NULL COMMENT '汉语表述',\n  `STATE` varchar(255) DEFAULT '0' COMMENT '成功0.错误1',\n  `STRING_SQL` text COMMENT 'SQL',\n  PRIMARY KEY (`ID`)\n) ENGINE=InnoDB DEFAULT CHARSET=utf8;";
  
        Statement st1 = conn.createStatement();
        st1.executeUpdate(crsql);
        File file = new File(webappRoot);
        if (file.isDirectory()) {
          String[] files = file.list();
          if (files.length > 0) {
            for (int z = 0; z < files.length; z++) {
              InputStream in = new FileInputStream(webappRoot + "/" + files[z]);
              HSSFWorkbook excelObj = new HSSFWorkbook(in);
              HSSFSheet sheetObj = excelObj.getSheetAt(0);
              Row row = sheetObj.getRow(0);
              int colNum = row.getPhysicalNumberOfCells();
              int lastRowNum = sheetObj.getLastRowNum();
              for (int i = 0; i <= lastRowNum; i++) {
                row = sheetObj.getRow(i);
                if (row != null) {
                  for (int j = 0; j < colNum; j++) {
                    Cell cell = row.getCell(j);
                    if (cell != null) {
                      switch (j)
                      {
                      case 0:
                        try
                        {
                          String sql = cell.getStringCellValue();
                          Statement st = conn.createStatement();
                          st.executeUpdate(sql);
                          String s = sql.replaceAll("'", "\"");
                          String sql_1 = "INSERT INTO `str_status` ( `CONTENT`, `STATE`, `STRING_SQL`) VALUES ( NULL, '0', '" + s + "');";
                          st.executeUpdate(sql_1);
                          json.setMsg("ok");
                          json.setFlag(0);
                        } catch (SQLException e) {
                          json.setMsg("err");
                          json.setFlag(1);
                          String sql = cell.getStringCellValue();
                          Statement st = conn.createStatement();
                          String s = sql.replaceAll("'", "\"");
                          String sql_1 = "INSERT INTO `str_status` ( `CONTENT`, `STATE`, `STRING_SQL`) VALUES ( NULL, '1', '" + s + "');";
                          st.executeUpdate(sql_1);
                          String sql_2 = "select * from str_status where STATE =1";
                          ResultSet rs = st.executeQuery(sql_2);
                          List strstatus = new ArrayList();
                          Object object1 = new Object();
                          Object object2 = new Object();
                          while (rs.next()) {
                            Strstatus strstatus1 = new Strstatus();
                            object1 = rs.getObject(1);
                            object2 = rs.getObject(2);
                            strstatus1.setId(Integer.valueOf(((Integer)object1).intValue()));
                            strstatus1.setStringSql(object2.toString());
                            strstatus.add(strstatus1);
                          }
                          HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("异常sql语句", 9);
                          String[] secondTitles = { "序号", "异常语句" };
                          HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
                          String[] beanProperty = { "id", "stringSql" };
                          HSSFWorkbook workbook = null;
                          workbook = ExcelUtil.exportExcelData(workbook2, strstatus, beanProperty);
                          OutputStream out = response.getOutputStream();
                          String filename = "异常sql语句.xls";
                          filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
                          response.setContentType("application/vnd.ms-excel;charset=UTF-8");
                          response.setHeader("content-disposition", "attachment;filename=" + filename);
                          workbook.write(out);
                          out.close();
                        }
                      }
                    }
                  }
                }
              }
            }
          }
  
        }
  
        OrgManage orgManage = new OrgManage();
        orgManage.setOid(Integer.valueOf(1000));
        int i = this.orgManageMapper.editOid(orgManage);
  
        String sql = "UPDATE version SET VER= '2018.03.16.1'";
        Statement st = conn.createStatement();
        st.execute(sql);
        conn.close();
        json.setMsg("ok");
        json.setFlag(0);
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        json.setFlag(1);
      }
      return json;
    }
  
    public ToJson<Object> getObjects()
    {
      ToJson json = new ToJson(1, "err");
      int count = 0;
      int total = 0;
      try {
        String classpath = getClass().getResource("/").getPath();
        String webappRoot = classpath.replaceAll("WEB-INF ", "ui properties/");
  
        count = 0;
        total = 0;
        File file = new File(webappRoot + "jdbc.txt");
        String urltd_oa = new String();
        String unametd_oa = new String();
        String passwordtd_oa = new String();
  
        if ((file.isFile()) && (file.exists()))
        {
          InputStreamReader read = new InputStreamReader(new FileInputStream(file));
  
          BufferedReader bufferedReader = new BufferedReader(read);
          String lineTxt = null;
          int i = 1;
          while ((lineTxt = bufferedReader.readLine()) != null) {
            if (i == 1) {
              urltd_oa = lineTxt;
            }
            else if (i == 2)
              unametd_oa = lineTxt;
            else {
              passwordtd_oa = lineTxt;
            }
            i++;
          }
          read.close();
        }
        if (file.isDirectory()) {
          String[] files = file.list();
          if (files.length > 0) {
            for (int z = 0; z < files.length; z++)
              try {
                InputStream in = new FileInputStream(webappRoot + "/" + files[z]);
                HSSFWorkbook excelObj = null;
                excelObj = new HSSFWorkbook(in);
                HSSFSheet sheetObj = excelObj.getSheetAt(0);
                Row row = sheetObj.getRow(0);
                int colNum = row.getPhysicalNumberOfCells();
                int lastRowNum = sheetObj.getLastRowNum();
  
                count = lastRowNum + 1;
                Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
                String url = urltd_oa;
                String driver = props.getProperty("driverClassName");
                String username = unametd_oa;
                String password = passwordtd_oa;
                Class.forName(driver).newInstance();
                Connection conn = DriverManager.getConnection(url, username, password);
                String sql = "SELECT  count(*) as count FROM  str_status";
                Statement st = conn.createStatement();
                ResultSet resultSet = st.executeQuery(sql);
  
                if (resultSet.next())
                  total = Integer.valueOf(resultSet.getString(1)).intValue();
              }
              catch (Exception e)
              {
                json.setFlag(1);
                json.setMsg(e.getMessage());
                e.printStackTrace();
              }
          }
        }
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
      Map map = new HashedMap();
      map.put("count", Integer.valueOf(count));
      map.put("total", Integer.valueOf(total));
      json.setFlag(0);
      json.setObject(map);
      json.setMsg("ok");
      return json;
    }
  
    public ToJson<Object> getObjectdetail()
    {
      ToJson json = new ToJson();
      List correctList = new ArrayList();
      List errorList = new ArrayList();
      try {
        String classpath = getClass().getResource("/").getPath();
        String webappRoot = classpath.replaceAll("WEB-INF ", "ui properties/");
        File file = new File(webappRoot + "jdbc.txt");
        String urltd_oa = new String();
        String unametd_oa = new String();
        String passwordtd_oa = new String();
  
        if ((file.isFile()) && (file.exists()))
        {
          InputStreamReader read = new InputStreamReader(new FileInputStream(file));
  
          BufferedReader bufferedReader = new BufferedReader(read);
          String lineTxt = null;
          int i = 1;
          while ((lineTxt = bufferedReader.readLine()) != null) {
            if (i == 1) {
              urltd_oa = lineTxt;
            }
            else if (i == 2)
              unametd_oa = lineTxt;
            else {
              passwordtd_oa = lineTxt;
            }
            i++;
          }
          read.close();
        }
        Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
        String url = urltd_oa;
        String driver = props.getProperty("driverClassName");
        String username = unametd_oa;
        String password = passwordtd_oa;
        Class.forName(driver).newInstance();
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT  * FROM  str_status where STATE =0";
        Statement st = conn.createStatement();
        ResultSet resultSet = st.executeQuery(sql);
  
        while (resultSet.next()) {
          Strstatus strstatus = new Strstatus();
          strstatus.setId(Integer.valueOf(resultSet.getString(1)));
          strstatus.setContent(resultSet.getString(2));
          strstatus.setState(resultSet.getString(3));
          strstatus.setStringSql(resultSet.getString(4));
          correctList.add(strstatus);
        }
  
        String errsql = "SELECT  * FROM  str_status where STATE =1";
        ResultSet errorresultSet = st.executeQuery(errsql);
        while (errorresultSet.next()) {
          Strstatus strstatus = new Strstatus();
          strstatus.setId(Integer.valueOf(errorresultSet.getString(1)));
          strstatus.setContent(errorresultSet.getString(2));
          strstatus.setState(errorresultSet.getString(3));
          strstatus.setStringSql(errorresultSet.getString(4));
          errorList.add(strstatus);
        }
        errorresultSet.last();
        Map map = new HashedMap();
        map.put("errorList", errorList);
        map.put("correctList", correctList);
        json.setObject(map);
        json.setMsg("ok");
        json.setFlag(0);
      }
      catch (Exception e) {
        json.setMsg(e.getMessage());
        json.setFlag(1);
        e.printStackTrace();
      }
      return json;
    }
  
    public List<OrgManage> queryId() {
      List list = this.orgManageMapper.queryId();
      return list;
    }
  
    public boolean isAppNewVersion(String webVersion, String dataVersion)
    {
      boolean flag = false;
  
      if (webVersion.equals(dataVersion)) {
        flag = false;
        return false;
      }
      String[] webArray = webVersion.split("\\.");
      String[] dataArray = dataVersion.split("\\.");
  
      int length = webArray.length < dataArray.length ? webArray.length : dataArray.length;
  
      for (int i = 0; i < length; i++) {
        if (Integer.parseInt(dataArray[i]) < Integer.parseInt(webArray[i])) {
          flag = true;
          return true;
        }if (Integer.parseInt(dataArray[i]) > Integer.parseInt(webArray[i])) {
          flag = false;
          return false;
        }
  
      }
  
      return flag;
    }
  
    public ToJson<Object> updateResource()
    {
      ToJson json = new ToJson(0, "ok");
      try
      {
        String webVersion = "2018.03.16.1";
  
        String dataversion = this.versionMapper.selectVer();
        boolean flag = isAppNewVersion(webVersion, dataversion);
  
        if (flag == true)
        {
          ToJson zh_cn = this.orgManageService.queryId("zh_CN");
          List obj = zh_cn.getObj();
          int size = obj.size();
          for (int i = 0; i < size; i++)
          {
            if (i < 1) {
              Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
              String url = props.getProperty("url" + ((OrgManage)obj.get(i)).getOid());
              String driver = props.getProperty("driverClassName");
              String username = props.getProperty("uname" + ((OrgManage)obj.get(i)).getOid());
              String password = props.getProperty("password" + ((OrgManage)obj.get(i)).getOid());
              Class.forName(driver).newInstance();
              Connection conn = DriverManager.getConnection(url, username, password);
  
              boolean isExistPara_1 = Verification.CheckIsExistSysPara(conn, driver, url, username, password, "APP_PC_DownUrl");
              if (isExistPara_1 == true) {
                String sql = "DELETE FROM sys_para where PARA_NAME = 'APP_PC_DownUrl';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
                sql = "INSERT INTO `sys_para` (`PARA_NAME`, `PARA_VALUE`) VALUES ('APP_PC_DownUrl', ' pc/ispirit_xoa.exe');";
                st.executeUpdate(sql);
              }
  
              boolean isExistPara_2 = Verification.CheckIsExistSysPara(conn, driver, url, username, password, "APP_PC_Version");
              if (isExistPara_2 == true) {
                String sql = "DELETE FROM sys_para where PARA_NAME = 'APP_PC_Version';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
                sql = "INSERT INTO `sys_para` (`PARA_NAME`, `PARA_VALUE`) VALUES ('APP_PC_Version', '2018.03.16.1');";
                st.executeUpdate(sql);
              }
  
              boolean isExistPara_3 = Verification.CheckIsExistSysPara(conn, driver, url, username, password, "APP_Android_Version");
              if (isExistPara_3 == true) {
                String sql = "UPDATE `sys_para` SET `PARA_NAME`='APP_Android_Version', `PARA_VALUE`='2018.03.16.1' WHERE (`PARA_NAME`='APP_Android_Version');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistPara_4 = Verification.CheckIsExistSysPara(conn, driver, url, username, password, "APP_IOS_Version");
              if (isExistPara_4 == true) {
                String sql = "UPDATE `sys_para` SET `PARA_NAME`='APP_IOS_Version', `PARA_VALUE`='2018.03.16.1' WHERE (`PARA_NAME`='APP_IOS_Version');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistTable_1 = Verification.CheckIsExistTable(conn, driver, url, username, password, "office_transhistory");
              if (!isExistTable_1) {
                String sql = "CREATE TABLE IF NOT EXISTS  `office_transhistory` (\n  `TRANS_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一自增ID',\n  `PRO_ID` int(11) DEFAULT '0' COMMENT '办公用品ID',\n  `BORROWER` varchar(20) DEFAULT NULL COMMENT '申请人',\n  `TRANS_FLAG` varchar(20) DEFAULT '' COMMENT '登记类型',\n  `TRANS_QTY` int(11) DEFAULT '0' COMMENT '申请时的数量',\n  `PRICE` decimal(10,2) DEFAULT '0.00' COMMENT '物品价格',\n  `REMARK` text COMMENT '备注',\n  `TRANS_DATE` date DEFAULT '0000-00-00' COMMENT '申请时间',\n  `OPERATOR` varchar(20) DEFAULT '' COMMENT '操作员',\n  `TRANS_STATE` varchar(20) DEFAULT '' COMMENT '申请的状态标志(01-待部门审批人审批,02-待库管理员审批,1-同意,21-部门审批驳回，22-库管员驳回)',\n  `FACT_QTY` int(11) DEFAULT '0' COMMENT '实际的申请数量',\n  `REASON` text COMMENT '不同意理由',\n  `COMPANY` varchar(20) DEFAULT NULL COMMENT '厂家',\n  `BAND` varchar(20) DEFAULT NULL COMMENT '品牌',\n  `CYCLE_NO` int(11) DEFAULT '0' COMMENT '批量申请的ID',\n  `CYCLE` char(1) DEFAULT NULL COMMENT '批量申请标记',\n  `DEPT_ID` int(11) DEFAULT NULL COMMENT '部门ID',\n  `PRO_KEEPER` varchar(20) DEFAULT NULL COMMENT '物品调度员',\n  `GRANTOR` varchar(20) DEFAULT NULL COMMENT '发放物品的操作员',\n  `GRANT_STATUS` char(1) DEFAULT '0' COMMENT '物品发放处理状态(0-未处理,1-已处理)',\n  `DEPT_MANAGER` varchar(200) DEFAULT NULL COMMENT '部门审批人',\n  `DEPT_STATUS` int(1) DEFAULT '1' COMMENT '部门审批状态标志',\n  `RETURN_STATUS` int(1) DEFAULT '0' COMMENT '归还状态',\n  `RETURN_DATE` date DEFAULT '0000-00-00' COMMENT '归还时间',\n  `RETURN_REASON` text COMMENT '归还不同意理由',\n  PRIMARY KEY (`TRANS_ID`)\n) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='物品登记申请记录表';";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistTable_2 = Verification.CheckIsExistTable(conn, driver, url, username, password, "office_depository");
              if (!isExistTable_2) {
                String sql = "CREATE TABLE IF NOT EXISTS  `office_depository`(\n  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一自增ID',\n  `DEPOSITORY_NAME` varchar(200) DEFAULT NULL COMMENT '库名称',\n  `OFFICE_TYPE_ID` text COMMENT '物品类表ID',\n  `DEPT_ID` text COMMENT '所属部门',\n  `MANAGER` text COMMENT '仓库管理员',\n  `PRO_KEEPER` text COMMENT '物品调度员',\n  `PRIV_ID` varchar(50) DEFAULT NULL,\n  `RETURN_STATUS` int(1) DEFAULT '0' COMMENT '归还状态',\n  `RETURN_DATE` date DEFAULT '0000-00-00' COMMENT '归还时间',\n  `RETURN_REASON` text COMMENT '归还不同意理由',\n  PRIMARY KEY (`ID`)\n) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='物品库表';";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistTable_3 = Verification.CheckIsExistTable(conn, driver, url, username, password, "office_products");
              if (!isExistTable_3) {
                String sql = "CREATE TABLE IF NOT EXISTS  `office_products`(\n  `PRO_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一自增ID',\n  `PRO_NAME` varchar(200) DEFAULT '' COMMENT '办公用品名称',\n  `PRO_DESC` text COMMENT '办公用品描述',\n  `OFFICE_PROTYPE` varchar(20) DEFAULT '' COMMENT '物品所属类别ID',\n  `PRO_CODE` varchar(20) DEFAULT '' COMMENT '办公用品编码',\n  `PRO_UNIT` varchar(20) DEFAULT '' COMMENT '计量单位',\n  `PRO_PRICE` decimal(10,2) DEFAULT '0.00' COMMENT '单价',\n  `PRO_SUPPLIER` text COMMENT '供应商',\n  `PRO_LOWSTOCK` int(11) DEFAULT '0' COMMENT '最低警戒库存',\n  `PRO_MAXSTOCK` int(11) DEFAULT '0' COMMENT '最高警戒库存',\n  `PRO_STOCK` int(11) DEFAULT '0' COMMENT '当前库存',\n  `PRO_DEPT` text COMMENT '登记权限部门',\n  `PRO_MANAGER` text COMMENT '登记权限用户',\n  `PRO_CREATOR` varchar(20) DEFAULT '' COMMENT '创建人',\n  `PRO_AUDITER` text COMMENT '审批权限用户',\n  `PRO_ORDER` varchar(2) DEFAULT NULL COMMENT '排序号',\n  `ATTACHMENT_ID` text COMMENT '附件ID串',\n  `ATTACHMENT_NAME` text COMMENT '附件名称串',\n  `OFFICE_PRODUCT_TYPE` int(11) DEFAULT '2' COMMENT '办公用品类型(1-领用, 2-借用)',\n  `ALLOCATION` tinyint(1) DEFAULT '0' COMMENT '调拨属性',\n  PRIMARY KEY (`PRO_ID`)\n) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='物品信息表';";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistTable_4 = Verification.CheckIsExistTable(conn, driver, url, username, password, "office_type");
              if (!isExistTable_4) {
                String sql = "CREATE TABLE IF NOT EXISTS  `office_type` (\n  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一自增ID',\n  `TYPE_NAME` varchar(200) DEFAULT '' COMMENT '类别名称',\n  `TYPE_ORDER` varchar(200) DEFAULT '' COMMENT '排序号',\n  `TYPE_PARENT_ID` int(10) unsigned DEFAULT '0' COMMENT '父类型ID',\n  `TYPE_DEPOSITORY` int(10) unsigned DEFAULT '1' COMMENT '所属库的库ID',\n  PRIMARY KEY (`ID`)\n) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='物品类别表';";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistFunction_1 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "126");
              if (!isExistFunction_1) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`) VALUES ('126', '6060', '办公用品', 'Office Supplies', '辦公用品', NULL, NULL, NULL, '@officeSupplies', '');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistFunction_2 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "179");
              if (!isExistFunction_2) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`) VALUES ('179', '606001', '办公用品申领', 'Office supplies', '辦公用品申領', NULL, NULL, NULL, 'officetransHistory/OfficeProductApplyIndex', '');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistFunction_3 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "607");
              if (!isExistFunction_3) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`) VALUES ('607', '606002', '办公用品审批', 'Office supplies approval', '辦公用品審批', NULL, NULL, NULL, 'officetransHistory/approvalIndex', '');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistFunction_4 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "539");
              if (!isExistFunction_4) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`) VALUES ('539', '606003', '办公用品发放', 'Office supplies', '辦公用品發放', NULL, NULL, NULL, 'officetransHistory/productRelease', '');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistFunction_5 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "238");
              if (!isExistFunction_5) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`) VALUES ('238', '606006', '办公用品库管理', 'Office supplies library management', '辦公用品庫管理', NULL, NULL, NULL, 'officeDepository/index', '');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistFunction_6 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "128");
              if (!isExistFunction_6) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`) VALUES ('128', '606007', '办公用品库存管理', 'Office supplies inventory management', '辦公用品庫存管理', NULL, NULL, NULL, 'officetransHistory/stockIndex', '');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistFunction_7 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "131");
              if (!isExistFunction_7) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`) VALUES ('131', '1030', '工作查询', 'Job query', '工作査詢', NULL, NULL, NULL, 'workflow/query', '');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistfield = Verification.CheckIsExistfield(conn, driver, url, username, password, "unit", "UNIT_ID");
              if (!checkIsExistfield) {
                String sql = "alter table unit add column UNIT_ID  int not null auto_increment primary key comment '主键' first;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistTable = Verification.CheckIsExistTable(conn, driver, url, username, password, "flow_form_type");
              if (checkIsExistTable == true) {
                String sql = "alter table flow_form_type convert to character set utf8;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistfield_2 = Verification.CheckIsExistfield(conn, driver, url, username, password, "sys_function", "ISOPEN_NEW");
              if (!checkIsExistfield_2) {
                String sql = "ALTER TABLE sys_function add ISOPEN_NEW varchar(10) null;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistFunction_8 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "57");
              if (!isExistFunction_8) {
                String sql = "INSERT INTO `sys_function` VALUES ('57', 'z008', '行政办公设置', 'Administrative office setting', '行政辦公設定', null, null, null, '@system', '', null);";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistFunction_9 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "196");
              if (!isExistFunction_9) {
                String sql = "INSERT INTO `sys_function` VALUES ('196', '2008', '公告通知审批', 'Approval of notice', '公告通知審批', null, null, null, 'notify/auditing', '', null);";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistFunction_10 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "197");
              if (!isExistFunction_10) {
                String sql = "INSERT INTO `sys_function` VALUES ('197', 'z00830', '公告通知设置', 'Setting of notice', '公告通知設定', null, null, null, 'system/notify', '', null);";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistfield_1 = Verification.CheckIsExistfield(conn, driver, url, username, password, "user", "POST");
              if (!checkIsExistfield_1) {
                String sql = "alter table `user` add POST varchar(255) comment'岗位';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistfield_3 = Verification.CheckIsExistfield(conn, driver, url, username, password, "user", "AVATAR_128");
              if (!checkIsExistfield_3) {
                String sql = "alter table `user` add AVATAR_128 varchar(255) comment'128头像';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistfield_4 = Verification.CheckIsExistfield(conn, driver, url, username, password, "email", "withdraw_flag");
              if (!checkIsExistfield_4) {
                String sql = "alter table `email` add withdraw_flag  varchar(1) default 0 comment'撤回状态（0-未撤回，1-撤回)';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistfield_5 = Verification.CheckIsExistfield(conn, driver, url, username, password, "sms_body", "IS_ATTACH");
              if (!checkIsExistfield_5) {
                String sql = "alter table `sms_body` add IS_ATTACH varchar(255) comment'附件标识';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistfield_6 = Verification.CheckIsExistfield(conn, driver, url, username, password, "im_message", "REAL_URL");
              if (!checkIsExistfield_6) {
                String sql = "alter table `im_message` add REAL_URL varchar(255) comment'真实路径';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistFunction_11 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2043");
              if (!isExistFunction_11) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`, `ISOPEN_NEW`) VALUES ('2043', '5010', '足迹查询', 'Footprint query', '足迹査詢', NULL, NULL, NULL, 'footprint/index', '', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistFunction_12 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2044");
              if (!isExistFunction_12) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`, `ISOPEN_NEW`) VALUES ('2044', '0139', '消息历史记录', 'Chat record', '消息歷史記錄', NULL, NULL, NULL, 'spirit/webChatRecord', '', NULL);";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistTable_5 = Verification.CheckIsExistTable(conn, driver, url, username, password, "im_chatlist");
              if (!isExistTable_5) {
                String sql = "CREATE TABLE IF NOT EXISTS  `im_chatlist` (\n  `LIST_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '云办公用户UID',\n  `FROM_UID` varchar(255) DEFAULT NULL COMMENT '云办公发消息人UID',\n  `TO_UID` varchar(255) DEFAULT NULL COMMENT '云办公接收消息人UID',\n  `OF_FROM` varchar(255) DEFAULT NULL COMMENT 'OF发消息人UID',\n  `OF_TO` varchar(255) DEFAULT NULL COMMENT 'OF收消息人UID',\n  `LAST_TIME` varchar(255) DEFAULT NULL COMMENT '最后消息时间',\n  `LAST_ATIME` varchar(255) DEFAULT NULL COMMENT '入库时间',\n  `LAST_CONTENT` text COMMENT '最后消息内容',\n  `LAST_FILE_ID` varchar(255) DEFAULT NULL,\n  `LAST_FILE_NAME` varchar(255) DEFAULT NULL,\n  `LAST_THUMBNAIL_URL` varchar(255) DEFAULT NULL,\n  `TYPE` varchar(255) DEFAULT NULL,\n  `MSG_TYPE` char(1) DEFAULT '1' COMMENT '会话类型（0单聊，1群聊）',\n  `UID_IGNORE` varchar(255) DEFAULT NULL COMMENT '会话列表忽略标记',\n  `UUID` varchar(255) DEFAULT NULL,\n  `msg_free` varchar(255) DEFAULT NULL,\n  PRIMARY KEY (`LIST_ID`),\n  KEY `LAST_TIME` (`LAST_TIME`),\n  KEY `FROM_UID` (`FROM_UID`),\n  KEY `TO_UID` (`TO_UID`)\n) ENGINE=InnoDB AUTO_INCREMENT=219 DEFAULT CHARSET=utf8 COMMENT='会话列表';";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistFunction_13 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "3023");
              if (!isExistFunction_13) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`, `ISOPEN_NEW`) VALUES ('3023', '2001', '邮件统计', 'Mail statistics', '\\r\\n邮件统计\\r\\n郵件統計', NULL, NULL, NULL, 'email/eamilStatis', '', NULL);";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistfield = Verification.CheckIsExistfield(conn, driver, url, username, password, "interface", "ATTACHMENT_ID3");
              if (!isExistfield) {
                String sql = "alter table `interface` add ATTACHMENT_ID3 text comment'app界面附件';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistfield_1 = Verification.CheckIsExistfield(conn, driver, url, username, password, "interface", "ATTACHMENT_NAME3");
              if (!isExistfield_1) {
                String sql = "alter table `interface` add ATTACHMENT_NAME3 text comment'app界面附件';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistfield_2 = Verification.CheckIsExistfield(conn, driver, url, username, password, "interface", "ATTACHMENT_ID4");
              if (!isExistfield_2) {
                String sql = "alter table `interface` add ATTACHMENT_ID4 text comment'apps首页附件';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistfield_3 = Verification.CheckIsExistfield(conn, driver, url, username, password, "interface", "ATTACHMENT_NAME4");
              if (!isExistfield_3) {
                String sql = "alter table `interface` add ATTACHMENT_NAME4 text comment'apps首页附件';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2005");
              if (checkIsExistFunction == true) {
                String sql = "update sys_function set MENU_ID ='0138' where FUNC_ID=2005;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction_1 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2031");
              if (checkIsExistFunction_1 == true) {
                String sql = "update sys_function set MENU_ID ='2030' where FUNC_ID=2031;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction_2 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2032");
              if (checkIsExistFunction_2 == true) {
                String sql = "update sys_function set MENU_ID ='203001' where FUNC_ID=2032;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction_3 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2033");
              if (checkIsExistFunction_3 == true) {
                String sql = "update sys_function set MENU_ID ='203002' where FUNC_ID=2033;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction_4 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2034");
              if (checkIsExistFunction_4 == true) {
                String sql = "update sys_function set MENU_ID ='203003' where FUNC_ID=2034;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction_5 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2024");
              if (checkIsExistFunction_5 == true) {
                String sql = "update sys_function set MENU_ID ='2020' where FUNC_ID=2024;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction_6 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2025");
              if (checkIsExistFunction_6 == true) {
                String sql = "update sys_function set MENU_ID ='202001' where FUNC_ID=2025;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction_7 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2026");
              if (checkIsExistFunction_7 == true) {
                String sql = "update sys_function set MENU_ID ='202002' where FUNC_ID=2026;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction_8 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2013");
              if (checkIsExistFunction_8 == true) {
                String sql = "update sys_function set MENU_ID ='2040' where FUNC_ID=2013;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction_9 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2014");
              if (checkIsExistFunction_9 == true) {
                String sql = "update sys_function set MENU_ID ='204001' where FUNC_ID=2014;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction_10 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2015");
              if (checkIsExistFunction_10 == true) {
                String sql = "update sys_function set MENU_ID ='204002' where FUNC_ID=2015;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction_11 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2040");
              if (checkIsExistFunction_11 == true) {
                String sql = "update sys_function set MENU_ID ='6065' where FUNC_ID=2040;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction_12 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2041");
              if (checkIsExistFunction_12 == true) {
                String sql = "update sys_function set MENU_ID ='606501' where FUNC_ID=2041;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction_13 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "3022");
              if (!checkIsExistFunction_13) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`, `ISOPEN_NEW`) VALUES ('3022', '1040', '工作监控', 'Work monitoring', '工作監控', NULL, NULL, NULL, 'workflow/workMonitoring', '', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistMenu = Verification.CheckIsExistMenu(conn, driver, url, username, password, "70");
              if (!isExistMenu) {
                String sql = "INSERT INTO `sys_menu` (`MENU_ID`, `MENU_NAME`, `MENU_NAME1`, `MENU_NAME2`, `MENU_NAME3`, `MENU_NAME4`, `MENU_NAME5`, `MENU_EXT`, `IMAGE`) VALUES ('70', '档案管理', 'file management', '檔案管理', '', '', '', '', 'resource');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existFunction_4 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "3024");
              if (!existFunction_4) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`, `ISOPEN_NEW`) VALUES ('3024', '7001', '卷库管理', '\\r\\nLibrary management', '卷庫管理', NULL, NULL, NULL, 'rmsRollRoom/manage', '', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existFunction = Verification.CheckIsExistFunction(conn, driver, url, username, password, "3026");
              if (!existFunction) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`, `ISOPEN_NEW`) VALUES ('3026', '7002', '案卷管理', NULL, NULL, NULL, NULL, NULL, 'rmsRoll/index', '', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existFunction_1 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "3027");
              if (!existFunction_1) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`, `ISOPEN_NEW`) VALUES ('3027', '7003', '文件管理', NULL, NULL, NULL, NULL, NULL, 'rmsFile/index', '', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existFunction_2 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "3028");
              if (!existFunction_2) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`, `ISOPEN_NEW`) VALUES ('3028', '7004', '档案销毁', NULL, NULL, NULL, NULL, NULL, 'rmsFile/toDestroyed', '', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistTable = Verification.CheckIsExistTable(conn, driver, url, username, password, "rms_file");
              if (!isExistTable) {
                String sql = "CREATE TABLE IF NOT EXISTS `rms_file` (\n  `FILE_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',\n  `ROLL_ID` int(11) NOT NULL DEFAULT '0' COMMENT '对应RMS_ROLL表ROLL_ID',\n  `ADD_USER` varchar(20) NOT NULL DEFAULT '' COMMENT '添加人',\n  `ADD_TIME` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '添加时间',\n  `DEL_USER` varchar(20) NOT NULL DEFAULT '' COMMENT '删除人',\n  `DEL_TIME` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '删除时间',\n  `MOD_USER` varchar(20) NOT NULL DEFAULT '' COMMENT '修改人',\n  `MOD_TIME` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',\n  `CONFIRM_USER` varchar(20) NOT NULL DEFAULT '' COMMENT '预留',\n  `FILE_CODE` varchar(200) NOT NULL DEFAULT '' COMMENT '文件号',\n  `FILE_TITLE` varchar(200) NOT NULL DEFAULT '' COMMENT '文件标题',\n  `FILE_TITLE0` varchar(200) NOT NULL DEFAULT '' COMMENT '文件辅标题',\n  `FILE_SUBJECT` varchar(200) NOT NULL DEFAULT '' COMMENT '文件主题词',\n  `SEND_UNIT` varchar(200) NOT NULL DEFAULT '' COMMENT '发文单位',\n  `SEND_DATE` date NOT NULL DEFAULT '0000-00-00' COMMENT '发文日期',\n  `SECRET` varchar(200) NOT NULL DEFAULT '' COMMENT '密级(1-普密,4-秘密,3-机密,2-绝密)',\n  `URGENCY` varchar(200) NOT NULL DEFAULT '' COMMENT '紧急等级(1-员工类型,2-普级)',\n  `FILE_KIND` varchar(200) NOT NULL DEFAULT '' COMMENT '公文类别(1-A,2-B,3-C,4-D)',\n  `FILE_TYPE` varchar(200) NOT NULL DEFAULT '' COMMENT '文件分类(1-公文,2-资料)',\n  `FILE_PAGE` varchar(20) NOT NULL DEFAULT '' COMMENT '文件页数',\n  `PRINT_PAGE` varchar(20) NOT NULL DEFAULT '' COMMENT '打印页数',\n  `BORROW` char(1) NOT NULL DEFAULT '0' COMMENT '借阅审批(0-否,1-是)',\n  `REMARK` varchar(200) NOT NULL DEFAULT '' COMMENT '备注',\n  `ATTACHMENT_ID` text NOT NULL COMMENT '附件ID',\n  `ATTACHMENT_NAME` text NOT NULL COMMENT '附件名称',\n  `BORROW_STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '预留',\n  `CONFIRM_STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '预留',\n  `DOWNLOAD_YN` int(1) NOT NULL DEFAULT '1' COMMENT '预留',\n  `ISAUDIT` char(1) NOT NULL DEFAULT '1' COMMENT '查看附件是否需要审批(0-否,1-是)',\n  `DOWNLOAD` int(1) NOT NULL DEFAULT '1' COMMENT '允许下载Office附件(0-否,1-是)',\n  `PRINT` int(1) NOT NULL DEFAULT '1' COMMENT '允许打印Office附件(0-否,1-是)',\n  PRIMARY KEY (`FILE_ID`),\n  KEY `ROLL_ID` (`ROLL_ID`),\n  KEY `ADD_USER` (`ADD_USER`),\n  KEY `DEL_USER` (`DEL_USER`)\n) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=gbk COMMENT='文件管理';";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistTable_10 = Verification.CheckIsExistTable(conn, driver, url, username, password, "rms_lend");
              if (!isExistTable_10) {
                String sql = "CREATE TABLE IF NOT EXISTS `rms_lend` (\n  `LEND_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',\n  `FILE_ID` int(11) NOT NULL DEFAULT '0' COMMENT '对应RMS_FILE表FILE_ID',\n  `USER_ID` varchar(20) NOT NULL DEFAULT '' COMMENT '借阅人',\n  `ADD_TIME` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '添加时间',\n  `LEND_TIME` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '申请时间',\n  `RETURN_TIME` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '归还时间',\n  `ALLOW_TIME` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '审批时间',\n  `ALLOW` char(1) NOT NULL DEFAULT '0' COMMENT '允许状态(0-待批准借阅,1-已批准借阅,2-未批准借阅,3-已归还借阅)',\n  `APPROVE` varchar(254) NOT NULL COMMENT '借阅人',\n  `DELETE_FLAG` char(1) NOT NULL DEFAULT '0' COMMENT '删除状态(0-未删除,1-已删除)',\n  `OPERATOR` varchar(254) NOT NULL COMMENT '审批人',\n  PRIMARY KEY (`LEND_ID`)\n) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=gbk COMMENT='文件借阅';";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistTable_11 = Verification.CheckIsExistTable(conn, driver, url, username, password, "rms_roll");
              if (!isExistTable_11) {
                String sql = "CREATE TABLE IF NOT EXISTS `rms_roll` (\n  `ROLL_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',\n  `ROOM_ID` int(11) NOT NULL DEFAULT '0' COMMENT '对应RMS_ROLL_ROOM表ROOM_ID',\n  `DEPT_ID` int(11) NOT NULL DEFAULT '0' COMMENT '部门ID',\n  `ROLL_CODE` varchar(200) NOT NULL DEFAULT '' COMMENT '案卷号',\n  `ROLL_NAME` varchar(200) NOT NULL DEFAULT '' COMMENT '案卷名称',\n  `YEARS` varchar(100) NOT NULL DEFAULT '' COMMENT '归卷年代',\n  `BEGIN_DATE` date NOT NULL DEFAULT '0000-00-00' COMMENT '起始日期',\n  `END_DATE` date NOT NULL DEFAULT '0000-00-00' COMMENT '终止日期',\n  `DEADLINE` varchar(100) NOT NULL DEFAULT '' COMMENT '保管期限',\n  `SECRET` varchar(200) NOT NULL DEFAULT '' COMMENT '案卷密级(1-普密,4-秘密,3-机密,2-绝密)',\n  `CATEGORY_NO` varchar(100) NOT NULL DEFAULT '' COMMENT '全宗号',\n  `CATALOG_NO` varchar(100) NOT NULL DEFAULT '' COMMENT '目录号',\n  `ARCHIVE_NO` varchar(100) NOT NULL DEFAULT '' COMMENT '档案馆号',\n  `BOX_NO` varchar(100) NOT NULL DEFAULT '' COMMENT '保险箱号',\n  `MICRO_NO` varchar(100) NOT NULL DEFAULT '' COMMENT '缩微号',\n  `CERTIFICATE_KIND` varchar(200) NOT NULL DEFAULT '' COMMENT '凭证类别(1-XXX1,2-XXX2)',\n  `CERTIFICATE_START` varchar(200) NOT NULL DEFAULT '' COMMENT '起始凭证编号',\n  `CERTIFICATE_END` varchar(200) NOT NULL DEFAULT '' COMMENT '截至凭证编号',\n  `ROLL_PAGE` varchar(200) NOT NULL DEFAULT '' COMMENT '页数',\n  `BORROW` char(1) NOT NULL DEFAULT '0' COMMENT '借阅审批(0-否,1-是)',\n  `REMARK` varchar(200) NOT NULL DEFAULT '' COMMENT '备注',\n  `MANAGE_USER` text NOT NULL COMMENT '预留',\n  `READ_USER` text NOT NULL COMMENT '预留',\n  `ADD_USER` varchar(20) NOT NULL DEFAULT '' COMMENT '添加人',\n  `ADD_TIME` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '添加时间',\n  `DEL_USER` varchar(20) NOT NULL DEFAULT '' COMMENT '删除人',\n  `DEL_TIME` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '删除时间',\n  `MOD_USER` varchar(20) NOT NULL DEFAULT '' COMMENT '修改人',\n  `STATUS` char(1) NOT NULL DEFAULT '0' COMMENT '案卷状态(0-未封卷,1-已封卷)',\n  `MOD_TIME` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',\n  `BZJG` varchar(254) NOT NULL COMMENT '预留',\n  `MANAGER` varchar(254) NOT NULL COMMENT '案卷管理员',\n  `EDIT_DEPT` varchar(200) NOT NULL COMMENT '编制机构',\n  PRIMARY KEY (`ROLL_ID`),\n  KEY `ROOM_ID` (`ROOM_ID`),\n  KEY `MANAGER` (`MANAGER`)\n) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=gbk COMMENT='案卷表';";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistTable_12 = Verification.CheckIsExistTable(conn, driver, url, username, password, "rms_roll_room");
              if (!isExistTable_12) {
                String sql = "CREATE TABLE IF NOT EXISTS `rms_roll_room` (\n  `ROOM_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',\n  `DEPT_ID` int(11) NOT NULL DEFAULT '0' COMMENT '所属部门',\n  `ROOM_CODE` varchar(200) NOT NULL DEFAULT '' COMMENT '卷库号',\n  `ROOM_NAME` varchar(200) NOT NULL DEFAULT '' COMMENT '卷库名称',\n  `CATEGORY_NO` varchar(100) NOT NULL DEFAULT '' COMMENT '全宗号',\n  `CATALOG_NO` varchar(100) NOT NULL DEFAULT '' COMMENT '目录号',\n  `REMARK` varchar(200) NOT NULL DEFAULT '' COMMENT '备注',\n  `MANAGE_USER` text NOT NULL COMMENT '卷库管理员',\n  `ADD_USER` varchar(20) NOT NULL DEFAULT '' COMMENT '添加人',\n  `ADD_TIME` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '添加时间',\n  `DEL_USER` varchar(20) NOT NULL DEFAULT '' COMMENT '删除人',\n  `DEL_TIME` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '删除时间',\n  `MOD_USER` varchar(20) NOT NULL DEFAULT '' COMMENT '修改人',\n  `MOD_TIME` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',\n  `VIEW_DEPT_ID` text COMMENT '卷库内文件的借阅范围',\n  PRIMARY KEY (`ROOM_ID`),\n  UNIQUE KEY `ROOM_ID` (`ROOM_ID`),\n  KEY `ROOM_ID_2` (`ROOM_ID`,`ROOM_CODE`)\n) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=gbk COMMENT='卷库表';";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
              boolean checkIsExistfield1 = Verification.CheckIsExistfield(conn, driver, url, username, password, "seal", "DEPT_ID");
              if (checkIsExistfield1 == true) {
                String sql = "alter table seal modify DEPT_ID  varchar(255);";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existfield = Verification.CheckIsExistfield(conn, driver, url, username, password, "im_room", "RNAMR");
              if (existfield == true) {
                String sql = "ALTER TABLE im_room MODIFY COLUMN RNAMR text;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
              boolean existfield_1 = Verification.CheckIsExistfield(conn, driver, url, username, password, "im_room", "RMEMBER_UID");
              if (existfield_1 == true) {
                String sql = "ALTER TABLE im_room MODIFY COLUMN RMEMBER_UID text;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
              boolean existfield_2 = Verification.CheckIsExistfield(conn, driver, url, username, password, "user", "POST_ID");
              if (!existfield_2) {
                String sql = "alter table `user` add POST_ID int(255) comment'职务ID 对应user_post表';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
              boolean existfield_3 = Verification.CheckIsExistfield(conn, driver, url, username, password, "user", "JOB_ID");
              if (!existfield_3) {
                String sql = "alter table `user` add JOB_ID int(11) comment'岗位ID 对应user_job表';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistThing = Verification.CheckIsExistThing(conn, driver, url, username, password, "340");
              boolean isExistThing_1 = Verification.CheckIsExistThing(conn, driver, url, username, password, "341");
              boolean isExistThing_2 = Verification.CheckIsExistThing(conn, driver, url, username, password, "342");
              boolean isExistThing_3 = Verification.CheckIsExistThing(conn, driver, url, username, password, "343");
              if ((isExistThing == true) && (isExistThing_1 == true) && (isExistThing_2 == true) && (isExistThing_3 == true)) {
                String sql = "UPDATE flow_trigger SET `PLUGIN`=0 WHERE ID=340 OR ID=341 OR ID=342 OR ID=343;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
              boolean existUserPriv = Verification.CheckIsExistUserPriv(conn, driver, url, username, password, "1");
              if (existUserPriv == true) {
                String sql = "update `user_priv` set FUNC_ID_STR='1,4,147,148,7,8,9,16,2011,2005,2044,11,130,5,131,3022,134,37,135,136,2002,2003,3023,24,196,105,119,80,2024,2025,2026,2031,2032,2033,2034,2013,2014,2015,43,17,18,19,15,36,76,77,27,60,481,502,504,505,503,26,506,508,2043,85,86,2006,88,87,138,89,222,137,126,179,607,539,127,238,128,2040,2041,90,91,92,93,94,95,96,118,3001,3002,3003,3004,3005,3006,3007,3008,3009,3010,3011,3012,3013,3014,3015,3016,3024,3026,3027,3028,3017,3018,3019,3020,56,2001,30,31,33,32,3029,3030,2007,2008,2009,2010,57,197,78,2047,178,104,121,99,2042,2004,626,38,' where USER_PRIV ='1';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
              boolean isExistUserFunction = Verification.CheckIsExistUserFunction(conn, driver, url, username, password, "1");
              if (isExistUserFunction == true) {
                String sql = "UPDATE `user_function` SET `user_func_id_str`='1,4,147,148,7,8,9,16,2011,2005,2044,11,130,5,131,3022,134,37,135,136,2002,2003,3023,24,196,105,119,80,2024,2025,2026,2031,2032,2033,2034,2013,2014,2015,43,17,18,19,15,36,76,77,27,60,481,502,504,505,503,26,506,508,2043,85,86,2006,88,87,138,89,222,137,126,179,607,539,127,238,128,2040,2041,90,91,92,93,94,95,96,118,3001,3002,3003,3004,3005,3006,3007,3008,3009,3010,3011,3012,3013,3014,3015,3016,3024,3026,3027,3028,3017,3018,3019,3020,56,2001,30,31,33,32,3029,3030,2007,2008,2009,2010,57,197,78,2047,178,104,121,99,2042,2004,626,38,' WHERE `uid`='1';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistAttend = Verification.CheckIsExistfield(conn, driver, url, username, password, "attachment", "SIZE");
              if (!checkIsExistAttend) {
                String sql = "alter table `attachment` add SIZE varchar(255) comment'附件大小';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existTable = Verification.CheckIsExistTable(conn, driver, url, username, password, "htmldocument");
              if (!existTable) {
                String sql = "CREATE TABLE IF NOT EXISTS `htmldocument` (\n  `AutoNo` int(11) NOT NULL AUTO_INCREMENT,\n  `DocumentID` varchar(50) DEFAULT NULL,\n  `XYBH` varchar(64) DEFAULT NULL,\n  `BMJH` varchar(20) DEFAULT NULL,\n  `JF` varchar(128) DEFAULT NULL,\n  `YF` varchar(128) DEFAULT NULL,\n  `HZNR` text,\n  `QLZR` text,\n  `CPMC` varchar(254) DEFAULT NULL,\n  `DGSL` varchar(254) DEFAULT NULL,\n  `DGRQ` varchar(254) DEFAULT NULL,\n  PRIMARY KEY (`AutoNo`)\n) ENGINE=InnoDB DEFAULT CHARSET=utf8;";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existTable_1 = Verification.CheckIsExistTable(conn, driver, url, username, password, "htmlhistory");
              if (!existTable_1) {
                String sql = "CREATE TABLE IF NOT EXISTS `htmlhistory` (\n  `AutoNo` int(11) NOT NULL AUTO_INCREMENT,\n  `DocumentID` varchar(50) DEFAULT NULL,\n  `SignatureID` varchar(50) DEFAULT NULL,\n  `SignatureName` varchar(50) DEFAULT NULL,\n  `SignatureUnit` varchar(50) DEFAULT NULL,\n  `SignatureUser` varchar(50) DEFAULT NULL,\n  `KeySN` varchar(50) DEFAULT NULL,\n  `SignatureSN` varchar(200) DEFAULT NULL,\n  `SignatureGUID` varchar(50) DEFAULT NULL,\n  `IP` varchar(50) DEFAULT NULL,\n  `LogType` varchar(20) DEFAULT NULL,\n  `LogTime` varchar(20) DEFAULT NULL,\n  PRIMARY KEY (`AutoNo`)\n) ENGINE=InnoDB DEFAULT CHARSET=utf8;";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existTable_2 = Verification.CheckIsExistTable(conn, driver, url, username, password, "htmlsignature");
              if (!existTable_2) {
                String sql = "CREATE TABLE IF NOT EXISTS `htmlsignature` (\n  `DocumentID` varchar(254) DEFAULT NULL,\n  `Signature` text,\n  `SignatureID` varchar(64) DEFAULT NULL\n) ENGINE=InnoDB DEFAULT CHARSET=utf8;";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existTable_3 = Verification.CheckIsExistTable(conn, driver, url, username, password, "htmlsignature");
              if (!existTable_3) {
                String sql = "CREATE TABLE IF NOT EXISTS `htmlsignature` (\n  `DocumentID` varchar(254) DEFAULT NULL,\n  `Signature` text,\n  `SignatureID` varchar(64) DEFAULT NULL\n) ENGINE=InnoDB DEFAULT CHARSET=utf8;";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existTable_4 = Verification.CheckIsExistTable(conn, driver, url, username, password, "kg_relation_keysign");
              if (!existTable_4)
              {
                String sql = "CREATE TABLE IF NOT EXISTS `kg_relation_keysign` (\n  `RELATION_ID` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '关系ID',  `KEY_ID` int(11) DEFAULT NULL,  `SIGN_ID` int(11) DEFAULT NULL,  PRIMARY KEY (`RELATION_ID`)) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean b = Verification.CheckIsExistKgSign(conn, driver, url, username, password, "1");
              if (!b) {
                String sql = "INSERT INTO `kg_relation_keysign` VALUES ('1', '1', '1');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean check_1 = Verification.CheckIsExistKgSign(conn, driver, url, username, password, "1");
              if (!check_1) {
                String sql = "INSERT INTO `kg_relation_keysign` VALUES ('1', '1', '1');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean check_2 = Verification.CheckIsExistKgSign(conn, driver, url, username, password, "2");
              if (!check_2) {
                String sql = "INSERT INTO `kg_relation_keysign` VALUES ('2', '1', '2');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean check_3 = Verification.CheckIsExistKgSign(conn, driver, url, username, password, "3");
              if (!check_3) {
                String sql = "INSERT INTO `kg_relation_keysign` VALUES ('3', '1', '3');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean check_4 = Verification.CheckIsExistKgSign(conn, driver, url, username, password, "4");
              if (!check_4) {
                String sql = "INSERT INTO `kg_relation_keysign` VALUES ('4', '1', '5');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean check_5 = Verification.CheckIsExistKgSign(conn, driver, url, username, password, "5");
              if (!check_5) {
                String sql = "INSERT INTO `kg_relation_keysign` VALUES ('5', '2', '4');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existTable_5 = Verification.CheckIsExistTable(conn, driver, url, username, password, "kg_relation_keyuser");
              if (!existTable_5) {
                String sql = "CREATE TABLE IF NOT EXISTS `kg_relation_keyuser` (\n  `KEY_USER_ID` int(11) unsigned NOT NULL AUTO_INCREMENT,\n  `USER_ID` int(11) DEFAULT NULL COMMENT '用户UID',\n  `KEY_ID` int(11) DEFAULT NULL COMMENT 'keyId',\n  PRIMARY KEY (`KEY_USER_ID`)\n) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean check_6 = Verification.CheckIsExistKgkeyUser(conn, driver, url, username, password, "1");
              if (!check_6) {
                String sql = "INSERT INTO `kg_relation_keyuser` VALUES ('1', '1', '1');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean check_7 = Verification.CheckIsExistKgkeyUser(conn, driver, url, username, password, "2");
              if (!check_7) {
                String sql = "INSERT INTO `kg_relation_keyuser` VALUES ('2', '1', '2');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existTable_6 = Verification.CheckIsExistTable(conn, driver, url, username, password, "kg_signature");
              if (!existTable_6) {
                String sql = "CREATE TABLE IF NOT EXISTS `kg_signature` (\n  `SIGNATURE_ID` int(11) unsigned NOT NULL AUTO_INCREMENT,\n  `SIGNATURE_NAME` varchar(255) DEFAULT NULL COMMENT '签章名称',\n  `SIGNATURE_KGID` varchar(255) DEFAULT NULL COMMENT '金格签章id',\n  `SIGNATURE_STATUS` int(4) DEFAULT '0' COMMENT '使用状态 0正常 -1禁制使用',\n  PRIMARY KEY (`SIGNATURE_ID`)\n) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean check_8 = Verification.CheckIsExistkgSignature(conn, driver, url, username, password, "1");
              if (!check_8) {
                String sql = "INSERT INTO `kg_signature` VALUES ('1', '金格演示公章', 'BCxhL9mkEgv2dFTcpQHz8uUtNiqIXG35+rYJj1lfeb/KO4=yaWV0DSAPnw67oZsRM', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean check_12 = Verification.CheckIsExistkgSignature(conn, driver, url, username, password, "2");
              if (!check_12) {
                String sql = "INSERT INTO `kg_signature` VALUES ('2', '金格演示合同章', 'M=dUfvWPYlTLAOt70V9p1x5nRFm2aizZc3b/w+8SGhXj6JEoIQyNHCkrsguDeqB4K', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean check_9 = Verification.CheckIsExistkgSignature(conn, driver, url, username, password, "3");
              if (!check_9) {
                String sql = "INSERT INTO `kg_signature` VALUES ('3', '金格科技私章1X2.24', '0myIz5atpgOPbM8wYqiLWnAuBJXDrSjE9U376VFkT=KxeRhf+vosNC1Gc4/HdZQl2', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean check_10 = Verification.CheckIsExistkgSignature(conn, driver, url, username, password, "4");
              if (!check_10) {
                String sql = "INSERT INTO `kg_signature` VALUES ('4', '金格演示发票专用章', '0wAeTICLvyhqi1KJkOgsarYNQ5BUGEmSV8Z23P94lfno=M6pjFDdxuz+/cX7bHWRt', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean check_11 = Verification.CheckIsExistkgSignature(conn, driver, url, username, password, "5");
              if (!check_11) {
                String sql = "INSERT INTO `kg_signature` VALUES ('5', '金格演示合同章1', '8x2=rAUbHvF3/4dQDaptogRz70mfMI6LNCsnKV9SqYiPWXZE1euhyTkj+JOwlGB5c', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existTable_7 = Verification.CheckIsExistTable(conn, driver, url, username, password, "kg_signkey");
              if (!existTable_7) {
                String sql = "CREATE TABLE IF NOT EXISTS `kg_signkey` (\n  `SIGNKEY_ID` int(11) unsigned NOT NULL AUTO_INCREMENT,\n  `SIGNKEY_NAME` varchar(255) DEFAULT NULL COMMENT '名称',\n  `SIGNKEY_KEYSN` varchar(255) DEFAULT NULL COMMENT '金格签章keysn',\n  `SIGNKEY_STATUS` int(4) DEFAULT '0' COMMENT '使用状态 0正常 -1 停止使用',\n  PRIMARY KEY (`SIGNKEY_ID`)\n) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean check_13 = Verification.CheckIsExistkgSignKey(conn, driver, url, username, password, "1");
              if (!check_13) {
                String sql = "INSERT INTO `kg_signkey` VALUES ('1', '测试盘1', 'C84CF78C359E757E', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean check_14 = Verification.CheckIsExistkgSignKey(conn, driver, url, username, password, "2");
              if (!check_14) {
                String sql = "INSERT INTO `kg_signkey` VALUES ('2', '测试盘2', '44871127553E5D00', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existfield1 = Verification.CheckIsExistfield(conn, driver, url, username, password, "user_ext", "EMAIL_RECENT_LINKMAN");
              if (existfield1 == true) {
                String sql = "ALTER TABLE user_ext  MODIFY COLUMN EMAIL_RECENT_LINKMAN mediumtext NOT NULL;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean infoCenterOrder = Verification.CheckIsExistTable(conn, driver, url, username, password, "info_center");
              if (!infoCenterOrder) {
                String sql = "CREATE TABLE IF NOT EXISTS `info_center` (\n  `INFO_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增',\n  `INFO_NO` int(11) NOT NULL DEFAULT '0' COMMENT '默认应用序号',\n  `INFO_NAME1` varchar(50) NOT NULL COMMENT '应用名称（简体中文）',\n  `INFO_NAME2` varchar(50) NOT NULL COMMENT '应用名称（英文）',\n  `INFO_NAME3` varchar(50) NOT NULL COMMENT '应用名称（繁体中文）',\n  `INFO_NAME4` varchar(50) NOT NULL COMMENT '应用名称',\n  `INFO_NAME5` varchar(50) NOT NULL COMMENT '应用名称',\n  `INFO_FUNC_ID` int(11) NOT NULL DEFAULT '0' COMMENT '对应的FUNC_ID',\n  PRIMARY KEY (`INFO_ID`)\n) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='首页信息表';";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean infoCenter = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "1");
              if (!infoCenter) {
                String sql = "INSERT INTO `info_center` VALUES ('1', '1', '公告通知', 'Notice', '公告通知', '', '', '4');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean infoCenter2 = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "2");
              if (!infoCenter2) {
                String sql = "INSERT INTO `info_center` VALUES ('2', '2', '新闻', 'News', '新聞', '', '', '147');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean infoCenter3 = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "3");
              if (!infoCenter3) {
                String sql = "INSERT INTO `info_center` VALUES ('3', '3', '邮件箱', 'Email', '郵件箱', '', '', '1');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean infoCenter4 = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "4");
              if (!infoCenter4) {
                String sql = "INSERT INTO `info_center` VALUES ('4', '4', '待办流程', 'Backlog process', '待辦流程', '', '', '5');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean infoCenter5 = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "5");
              if (!infoCenter5) {
                String sql = "INSERT INTO `info_center` VALUES ('5', '5', '日程安排', 'Schedule', '日程安排', '', '', '8');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean infoCenter6 = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "6");
              if (!infoCenter6) {
                String sql = "INSERT INTO `info_center` VALUES ('6', '6', '常用功能', 'Common function', '常用功能', '', '', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean infoCenter7 = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "7");
              if (!infoCenter7) {
                String sql = "INSERT INTO `info_center` VALUES ('7', '7', '日志', 'Log', '日誌', '', '', '9');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean infoCenter8 = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "8");
              if (!infoCenter8) {
                String sql = "INSERT INTO `info_center` VALUES ('8', '8', '文件柜', 'File Cabinet', '文件櫃', '', '', '15');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean infoCenter9 = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "9");
              if (!infoCenter9) {
                String sql = "INSERT INTO `info_center` VALUES ('9', '9', '网络硬盘', 'Network Disk', '網絡硬盤', '', '', '76');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean b1 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "attend_out", "LEADER_ID");
              if (b1 == true) {
                String sql = "DROP INDEX LEADER_ID ON attend_out;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existInfoCenter = Verification.CheckIsExistfield(conn, driver, url, username, password, "attend_out", "LEADER_ID");
              if (existInfoCenter == true) {
                String sql = "ALTER TABLE attend_out  MODIFY COLUMN LEADER_ID text NOT NULL;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean b2 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "attend_leave", "LEADER_ID");
              if (b2 == true) {
                String sql = "DROP INDEX LEADER_ID ON attend_leave;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existInfoCenter2 = Verification.CheckIsExistfield(conn, driver, url, username, password, "attend_leave", "LEADER_ID");
              if (existInfoCenter2 == true) {
                String sql = "ALTER TABLE attend_leave  MODIFY COLUMN LEADER_ID text NOT NULL;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existInfoCenter3 = Verification.CheckIsExistfield(conn, driver, url, username, password, "attend_evection", "LEADER_ID");
              if (existInfoCenter3 == true) {
                String sql = "ALTER TABLE attend_evection  MODIFY COLUMN LEADER_ID text NOT NULL;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean widget = Verification.CheckIsExistWidget(conn, driver, url, username, password, "8");
              if (!widget) {
                String sql = "INSERT INTO `widget` (`ID`, `NAME`, `AID`, `TID`, `DATA`, `IS_SET`, `IS_ON`, `NO`) VALUES ('8', '公文', '0', '0', 'document', '1', '1', '7');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean user_1 = Verification.CheckIsExistUser(conn, driver, url, username, password, "1");
              if (user_1 == true) {
                String sql = "UPDATE user SET NOT_MOBILE_LOGIN  = 0 WHERE UID =1;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean user_2 = Verification.CheckIsExistUser(conn, driver, url, username, password, "106");
              if (user_2 == true) {
                String sql = "UPDATE user SET NOT_MOBILE_LOGIN  = 0 WHERE UID =106;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean user_3 = Verification.CheckIsExistUser(conn, driver, url, username, password, "107");
              if (user_3 == true) {
                String sql = "UPDATE user SET NOT_MOBILE_LOGIN  = 0 WHERE UID =107;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean user_4 = Verification.CheckIsExistUser(conn, driver, url, username, password, "108");
              if (user_4 == true) {
                String sql = "UPDATE user SET NOT_MOBILE_LOGIN  = 0 WHERE UID =108;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean user_5 = Verification.CheckIsExistUser(conn, driver, url, username, password, "109");
              if (user_5 == true) {
                String sql = "UPDATE user SET NOT_MOBILE_LOGIN  = 0 WHERE UID =109;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean user_6 = Verification.CheckIsExistUser(conn, driver, url, username, password, "110");
              if (user_6 == true) {
                String sql = "UPDATE user SET NOT_MOBILE_LOGIN  = 0 WHERE UID =110;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean user_7 = Verification.CheckIsExistUser(conn, driver, url, username, password, "111");
              if (user_7 == true) {
                String sql = "UPDATE user SET NOT_MOBILE_LOGIN  = 0 WHERE UID =111;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean user_8 = Verification.CheckIsExistUser(conn, driver, url, username, password, "112");
              if (user_8 == true) {
                String sql = "UPDATE user SET NOT_MOBILE_LOGIN  = 0 WHERE UID =112;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean user_9 = Verification.CheckIsExistUser(conn, driver, url, username, password, "113");
              if (user_9 == true) {
                String sql = "UPDATE user SET NOT_MOBILE_LOGIN  = 0 WHERE UID =113;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean user_10 = Verification.CheckIsExistUser(conn, driver, url, username, password, "114");
              if (user_10 == true) {
                String sql = "UPDATE user SET NOT_MOBILE_LOGIN  = 0 WHERE UID =114;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistFunction = Verification.CheckIsExistFunction(conn, driver, url, username, password, "56");
              if (isExistFunction == true) {
                String sql = "UPDATE sys_function SET FUNC_CODE ='@unitsetup' WHERE FUNC_ID =56;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistFunction1 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "57");
              if (isExistFunction1 == true) {
                String sql = "UPDATE sys_function SET FUNC_CODE ='@officesetting' WHERE FUNC_ID =57;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existFunction1 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "134");
              if (existFunction1 == true) {
                String sql = "UPDATE sys_function SET FUNC_CODE ='@workflowsetting' WHERE FUNC_ID =134;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existFunction2 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2007");
              if (existFunction2 == true) {
                String sql = "UPDATE sys_function SET FUNC_CODE ='@mechanismsetting' WHERE FUNC_ID =2007;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existFunction3 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "3006");
              if (existFunction3 == true) {
                String sql = "UPDATE sys_function SET FUNC_CODE ='@receiptmanagement' WHERE FUNC_ID =3006;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existFunction5 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "502");
              if (existFunction5 == true) {
                String sql = "UPDATE sys_function SET FUNC_CODE ='@hr plan' WHERE FUNC_ID =502;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean table = Verification.CheckIsExistTable(conn, driver, url, username, password, "app_log");
              if (!table) {
                String sql = "CREATE TABLE IF NOT EXISTS `app_log` (\n  `LOG_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一自增ID',\n  `USER_ID` varchar(20) NOT NULL DEFAULT '' COMMENT 'OA用户名',\n  `TIME` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '操作时间',\n  `MODULE` varchar(10) NOT NULL DEFAULT '' COMMENT '模块id',\n  `OPP_ID` varchar(20) NOT NULL DEFAULT '' COMMENT '操作记录的id',\n  `TYPE` varchar(10) NOT NULL DEFAULT '' COMMENT '操作类型',\n  `REMARK` mediumtext NOT NULL COMMENT '备注',\n  PRIMARY KEY (`LOG_ID`),\n  KEY `MODULE_OPP_USER_TYPE` (`MODULE`,`OPP_ID`,`USER_ID`,`TYPE`)\n) ENGINE=InnoDB AUTO_INCREMENT=1301 DEFAULT CHARSET=gbk COMMENT='各模块操作日志表';";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistCode = Verification.CheckIsExistCode(conn, driver, url, username, password, "function", "");
              if (!isExistCode) {
                String sql = "INSERT INTO `sys_code` (`CODE_NO`, `CODE_NAME`, `CODE_NAME1`, `CODE_NAME2`, `CODE_NAME3`, `CODE_NAME4`, `CODE_NAME5`, `CODE_NAME6`, `CODE_ORDER`, `PARENT_NO`, `CODE_FLAG`, `CODE_EXT`) VALUES ('function', '职能', NULL, NULL, NULL, NULL, NULL, NULL, '01', '', '0', '');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistCode1 = Verification.CheckIsExistCode(conn, driver, url, username, password, "1", "function");
              if (!isExistCode1) {
                String sql = "INSERT INTO `sys_code` (`CODE_NO`, `CODE_NAME`, `CODE_NAME1`, `CODE_NAME2`, `CODE_NAME3`, `CODE_NAME4`, `CODE_NAME5`, `CODE_NAME6`, `CODE_ORDER`, `PARENT_NO`, `CODE_FLAG`, `CODE_EXT`) VALUES ('1', '管理', NULL, NULL, NULL, NULL, NULL, NULL, '01', 'function', '0', '');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistCode2 = Verification.CheckIsExistCode(conn, driver, url, username, password, "2", "function");
              if (!isExistCode2) {
                String sql = "INSERT INTO `sys_code` (`CODE_NO`, `CODE_NAME`, `CODE_NAME1`, `CODE_NAME2`, `CODE_NAME3`, `CODE_NAME4`, `CODE_NAME5`, `CODE_NAME6`, `CODE_ORDER`, `PARENT_NO`, `CODE_FLAG`, `CODE_EXT`) VALUES ('2', '技术', NULL, NULL, NULL, NULL, NULL, NULL, '02', 'function', '0', '');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistCode3 = Verification.CheckIsExistCode(conn, driver, url, username, password, "3", "function");
              if (!isExistCode3) {
                String sql = "INSERT INTO `sys_code` (`CODE_NO`, `CODE_NAME`, `CODE_NAME1`, `CODE_NAME2`, `CODE_NAME3`, `CODE_NAME4`, `CODE_NAME5`, `CODE_NAME6`, `CODE_ORDER`, `PARENT_NO`, `CODE_FLAG`, `CODE_EXT`) VALUES ('3', '行政', NULL, NULL, NULL, NULL, NULL, NULL, '03', 'function', '0', '');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existFunctionfu = Verification.CheckIsExistFunction(conn, driver, url, username, password, "3029");
              if (!existFunctionfu) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`, `ISOPEN_NEW`) VALUES ('3029', 'z00411', '岗位管理', 'post management', '崗位管理', NULL, NULL, NULL, 'sys/getPostmanagement', '', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existFunction4 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "3030");
              if (!existFunction4) {
                String sql = "INSERT INTO `sys_function` (`FUNC_ID`, `MENU_ID`, `FUNC_NAME`, `FUNC_NAME1`, `FUNC_NAME2`, `FUNC_NAME3`, `FUNC_NAME4`, `FUNC_NAME5`, `FUNC_CODE`, `FUNC_EXT`, `ISOPEN_NEW`) VALUES ('3030', 'z00412', '职务管理', 'Job management', '職務管理', NULL, NULL, NULL, 'duties/dutiesjsp', '', NULL);";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistTablez = Verification.CheckIsExistTable(conn, driver, url, username, password, "user_post");
              if (!isExistTablez) {
                String sql = "CREATE TABLE IF NOT EXISTS `user_post` (\n  `POST_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',\n  `POST_NAME` varchar(255) DEFAULT NULL COMMENT '职务名称',\n  `TYPE` int(11) DEFAULT NULL COMMENT '职务类型',\n  `LEVEL` varchar(255) DEFAULT NULL COMMENT '职务级别',\n  `POST_NO` varchar(255) DEFAULT NULL COMMENT '职务编号',\n  `DEPT_ID` int(11) DEFAULT NULL COMMENT '所属部门',\n  `DUTY` varchar(255) DEFAULT NULL COMMENT '职责',\n  `DESCRIPTION` text COMMENT '职务描述',\n  `ATTACHMENT_ID` varchar(255) DEFAULT NULL COMMENT '附件id',\n  `ATTACHMENT_NAME` varchar(255) DEFAULT NULL COMMENT '附件名称',\n  PRIMARY KEY (`POST_ID`)\n) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistJob = Verification.CheckIsExistTable(conn, driver, url, username, password, "user_job");
              if (!isExistJob) {
                String sql = "CREATE TABLE IF NOT EXISTS `user_job` (\n  `JOB_ID` int(11) NOT NULL AUTO_INCREMENT,\n  `JOB_NAME` varchar(255) DEFAULT NULL,\n  `TYPE` int(11) DEFAULT NULL,\n  `LEVEL` varchar(255) DEFAULT NULL,\n  `JOB_NO` varchar(255) DEFAULT NULL,\n  `DEPT_ID` int(11) DEFAULT NULL,\n  `JOB_PLAN` varchar(255) DEFAULT NULL,\n  `DUTY` varchar(255) DEFAULT NULL,\n  `DESCRIPTION` text,\n  `ATTACHMENT_ID` varchar(255) DEFAULT NULL,\n  `ATTACHMENT_NAME` varchar(255) DEFAULT NULL,\n  PRIMARY KEY (`JOB_ID`)\n) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;\n";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean existCode = Verification.CheckCode(conn, driver, url, username, password, "976");
              if (!existCode) {
                String sql = "INSERT INTO `sys_code` VALUES ('976', '141', '加班申请', null, null, null, null, null, null, '141', 'KQQJTYPE', '0', '');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean function = Verification.CheckIsExistFunction(conn, driver, url, username, password, "539");
              if (function == true) {
                String sql = "UPDATE sys_function SET FUNC_NAME1='Office Distribution' WHERE FUNC_ID =539;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunctionq = Verification.CheckIsExistFunction(conn, driver, url, username, password, "179");
              if (checkIsExistFunctionq == true) {
                String sql = "UPDATE sys_function SET FUNC_NAME1='Office supplies application' WHERE FUNC_ID =179;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction1 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "3026");
              if (checkIsExistFunction1 == true) {
                String sql = "UPDATE sys_function SET FUNC_NAME1='supervision of the record',FUNC_NAME2='案卷管理' WHERE FUNC_ID =3026;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction2 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "3027");
              if (checkIsExistFunction2 == true) {
                String sql = "UPDATE sys_function SET FUNC_NAME1='file management',FUNC_NAME2='文件管理' WHERE FUNC_ID =3027;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction3 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "3028");
              if (checkIsExistFunction3 == true) {
                String sql = "UPDATE sys_function SET FUNC_NAME1='Archives destruction',FUNC_NAME2='檔案銷毀' WHERE FUNC_ID =3028;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistFunction4 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "3023");
              if (checkIsExistFunction4 == true) {
                String sql = "UPDATE sys_function SET FUNC_NAME2='郵件統計' WHERE FUNC_ID =3023;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistfield_10 = Verification.CheckIsExistfield(conn, driver, url, username, password, "user", "MYTABLE_MID");
              if (!isExistfield_10) {
                String sql = "alter table `user` add MYTABLE_MID varchar(200) DEFAULT 'ALL' comment'中间的桌面模块';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistfield_11 = Verification.CheckIsExistfield(conn, driver, url, username, password, "user", "ID_NUMBER");
              if (!isExistfield_11) {
                String sql = "alter table `user` add ID_NUMBER varchar(100) DEFAULT NULL comment'身份证号';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistfield_12 = Verification.CheckIsExistfield(conn, driver, url, username, password, "user", "TRA_NUMBER");
              if (!isExistfield_12) {
                String sql = "alter table `user` add TRA_NUMBER varchar(100) DEFAULT NULL comment'培训编号';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistfield_13 = Verification.CheckIsExistfield(conn, driver, url, username, password, "user", "SUBJECT");
              if (!isExistfield_13) {
                String sql = "alter table `user` add SUBJECT varchar(100) DEFAULT NULL comment'学科';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean IMexist = Verification.CheckIsExistfield(conn, driver, url, username, password, "im_room", "ROOM_STATUS");
              if (!IMexist) {
                String sql = "alter table im_room add ROOM_STATUS int default 0 comment '群状态（0：正常，-1：群解散）';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean spaceLimit = Verification.CheckIsExistfield(conn, driver, url, username, password, "file_sort", "SPACE_LIMIT");
              if (!spaceLimit) {
                String sql = "alter table file_sort add SPACE_LIMIT int(11)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean fileSort = Verification.CheckIsExistfield(conn, driver, url, username, password, "file_content", "FILE_SIZE");
              if (!fileSort) {
                String sql = "alter table file_content add FILE_SIZE varchar(255) DEFAULT NULL COMMENT '文件大小'";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean sys_function = Verification.CheckIsExistFunction(conn, driver, url, username, password, "3014");
              if (sys_function == true) {
                String sql = "UPDATE sys_function SET FUNC_CODE ='@document/setting' WHERE FUNC_ID =3014;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean drop_table = Verification.CheckIsExistTable(conn, driver, url, username, password, "kg_signature");
              if (drop_table == true) {
                String sql = "DROP TABLE IF EXISTS `kg_signature`;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean create_table = Verification.CheckIsExistTable(conn, driver, url, username, password, "kg_signature");
              if (!create_table) {
                String sql = "CREATE TABLE IF NOT EXISTS `kg_signature` (\n  `SIGNATURE_ID` int(11) unsigned NOT NULL AUTO_INCREMENT,\n  `SIGNATURE_NAME` varchar(255) DEFAULT NULL COMMENT '签章名称',\n  `SIGNATURE_UNIT` varchar(255) DEFAULT NULL COMMENT '单位名称',\n  `SIGNATURE_KGID` varchar(255) DEFAULT NULL COMMENT '金格签章id',\n  `SIGNATURE_STATUS` int(4) DEFAULT '0' COMMENT '使用状态 0正常，1禁制使用，-1删除',\n  PRIMARY KEY (`SIGNATURE_ID`)\n) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean insert = Verification.CheckIsExistkgSignature(conn, driver, url, username, password, "1");
              if (!insert) {
                String sql = "INSERT INTO `kg_signature` VALUES ('1', '金格演示公章', '北京高速波科技有限公司', 'BCxhL9mkEgv2dFTcpQHz8uUtNiqIXG35+rYJj1lfeb/KO4=yaWV0DSAPnw67oZsRM', '-1');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean insert_1 = Verification.CheckIsExistkgSignature(conn, driver, url, username, password, "2");
              if (!insert_1) {
                String sql = "INSERT INTO `kg_signature` VALUES ('2', '金格演示合同章', '北京高速波科技有限公司', 'M=dUfvWPYlTLAOt70V9p1x5nRFm2aizZc3b/w+8SGhXj6JEoIQyNHCkrsguDeqB4K', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean insert_2 = Verification.CheckIsExistkgSignature(conn, driver, url, username, password, "3");
              if (!insert_2) {
                String sql = "INSERT INTO `kg_signature` VALUES ('3', '金格科技私章1X2.24', '北京高速波科技有限公司', '0myIz5atpgOPbM8wYqiLWnAuBJXDrSjE9U376VFkT=KxeRhf+vosNC1Gc4/HdZQl2', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean insert_3 = Verification.CheckIsExistkgSignature(conn, driver, url, username, password, "4");
              if (!insert_3) {
                String sql = "INSERT INTO `kg_signature` VALUES ('4', '金格演示发票专用章', '北京高速波科技有限公司', '0wAeTICLvyhqi1KJkOgsarYNQ5BUGEmSV8Z23P94lfno=M6pjFDdxuz+/cX7bHWRt', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean insert_4 = Verification.CheckIsExistkgSignature(conn, driver, url, username, password, "5");
              if (!insert_4) {
                String sql = "INSERT INTO `kg_signature` VALUES ('5', '金格演示合同章1', '北京高速波科技有限公司', '8x2=rAUbHvF3/4dQDaptogRz70mfMI6LNCsnKV9SqYiPWXZE1euhyTkj+JOwlGB5c', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean insert_5 = Verification.CheckIsExistkgSignature(conn, driver, url, username, password, "6");
              if (!insert_5) {
                String sql = "INSERT INTO `kg_signature` VALUES ('6', '演示公章', '南京有限公司', '3KLmcTy0VR5FjgoAWeb7YBO24C1JsU8iqfzrQ9dNanu=MG/Sxk6ZwhtDEHXvlP+Ip', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean insert_6 = Verification.CheckIsExistkgSignature(conn, driver, url, username, password, "7");
              if (!insert_6) {
                String sql = "INSERT INTO `kg_signature` VALUES ('7', '演示发票专用章', '有限公司', 'PFxBSYkjo80hi4H15=mfzdM97bX6GK3URc/+ENOnDAqQIvsTtaJZLwuyeglrWCVp2', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean insert_7 = Verification.CheckIsExistkgSignature(conn, driver, url, username, password, "8");
              if (!insert_7) {
                String sql = "INSERT INTO `kg_signature` VALUES ('8', '演示合同章', '科技有限公司', 'xytDQgAwfJ23=GvXWd1jShRl7BEeMib0+No/4UK9aT8CpcHm6VsOkqIuP5nLFYrzZ', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean Code = Verification.CheckIsExistCode(conn, driver, url, username, password, "01", "NOTIFY");
              if (Code == true) {
                String sql = "UPDATE `sys_code` SET`CODE_NO`='02', `CODE_ORDER`='02' WHERE `CODE_ID`='545';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean Code_1 = Verification.CheckIsExistCode(conn, driver, url, username, password, "02", "NOTIFY");
              if (Code_1 == true) {
                String sql = "UPDATE `sys_code` SET`CODE_NO`='01', `CODE_ORDER`='01' WHERE `CODE_ID`='546';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean sys_menu = Verification.CheckIsExistMenu(conn, driver, url, username, password, "70");
              if (sys_menu == true) {
                String sql = "UPDATE `sys_menu` SET`IMAGE`='record' WHERE `MENU_ID`='70';";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean num_1infoCenter = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "1");
              if (num_1infoCenter == true) {
                String sql = "UPDATE `info_center` SET `INFO_ID`='1', `INFO_NO`='1', `INFO_NAME1`='公告通知', `INFO_NAME2`='Notice', `INFO_NAME3`='公告通知', `INFO_NAME4`='', `INFO_NAME5`='', `INFO_FUNC_ID`='4' WHERE (`INFO_ID`='1');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean num_2infoCenter = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "2");
              if (num_2infoCenter == true) {
                String sql = "UPDATE `info_center` SET `INFO_ID`='2', `INFO_NO`='2', `INFO_NAME1`='新闻', `INFO_NAME2`='News', `INFO_NAME3`='新聞', `INFO_NAME4`='', `INFO_NAME5`='', `INFO_FUNC_ID`='147' WHERE (`INFO_ID`='2');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean num_3infoCenter = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "3");
              if (num_3infoCenter == true) {
                String sql = "UPDATE `info_center` SET `INFO_ID`='3', `INFO_NO`='3', `INFO_NAME1`='邮件箱', `INFO_NAME2`='Email', `INFO_NAME3`='郵件箱', `INFO_NAME4`='', `INFO_NAME5`='', `INFO_FUNC_ID`='1' WHERE (`INFO_ID`='3');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean num_4infoCenter = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "4");
              if (num_4infoCenter == true) {
                String sql = "UPDATE `info_center` SET `INFO_ID`='4', `INFO_NO`='4', `INFO_NAME1`='待办流程', `INFO_NAME2`='Backlog process', `INFO_NAME3`='待辦流程', `INFO_NAME4`='', `INFO_NAME5`='', `INFO_FUNC_ID`='5' WHERE (`INFO_ID`='4');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean num_5infoCenter = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "5");
              if (num_5infoCenter == true) {
                String sql = "UPDATE `info_center` SET `INFO_ID`='5', `INFO_NO`='5', `INFO_NAME1`='日程安排', `INFO_NAME2`='Schedule', `INFO_NAME3`='日程安排', `INFO_NAME4`='', `INFO_NAME5`='', `INFO_FUNC_ID`='8' WHERE (`INFO_ID`='5');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean num_6infoCenter = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "6");
              if (num_6infoCenter == true) {
                String sql = "UPDATE `info_center` SET `INFO_ID`='6', `INFO_NO`='6', `INFO_NAME1`='常用功能', `INFO_NAME2`='Common function', `INFO_NAME3`='常用功能', `INFO_NAME4`='', `INFO_NAME5`='', `INFO_FUNC_ID`='0' WHERE (`INFO_ID`='6');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean num_7infoCenter = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "7");
              if (num_7infoCenter == true) {
                String sql = "UPDATE `info_center` SET `INFO_ID`='7', `INFO_NO`='7', `INFO_NAME1`='日志', `INFO_NAME2`='Log', `INFO_NAME3`='日誌', `INFO_NAME4`='', `INFO_NAME5`='', `INFO_FUNC_ID`='9' WHERE (`INFO_ID`='7');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean num_8infoCenter = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "8");
              if (num_8infoCenter == true) {
                String sql = "UPDATE `info_center` SET `INFO_ID`='8', `INFO_NO`='8', `INFO_NAME1`='文件柜', `INFO_NAME2`='File Cabinet', `INFO_NAME3`='文件櫃', `INFO_NAME4`='', `INFO_NAME5`='', `INFO_FUNC_ID`='15' WHERE (`INFO_ID`='8');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean num_9infoCenter = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "9");
              if (num_9infoCenter == true) {
                String sql = "UPDATE `info_center` SET `INFO_ID`='9', `INFO_NO`='9', `INFO_NAME1`='网络硬盘', `INFO_NAME2`='Network Disk', `INFO_NAME3`='網絡硬盤', `INFO_NAME4`='', `INFO_NAME5`='', `INFO_FUNC_ID`='76' WHERE (`INFO_ID`='9');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean num_10infoCenter = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "10");
              if (!num_10infoCenter) {
                String sql = "INSERT INTO `info_center` (`INFO_ID`, `INFO_NO`, `INFO_NAME1`, `INFO_NAME2`, `INFO_NAME3`, `INFO_NAME4`, `INFO_NAME5`, `INFO_FUNC_ID`) VALUES ('10', '10', '会议通知', 'Meeting notice', '會議通知', '', '', '-1');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean num_11infoCenter = Verification.CheckIsExistInfoCenter(conn, driver, url, username, password, "11");
              if (!num_11infoCenter) {
                String sql = "INSERT INTO `info_center` VALUES ('11', '11', '待办公文', 'To do document', '待辦公文', '', '', '3003');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistfield2 = Verification.CheckIsExistfield(conn, driver, url, username, password, "schedule", "schedule_type");
              if (checkIsExistfield2 == true) {
                String sql = "ALTER TABLE `schedule`MODIFY COLUMN `schedule_type`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动类别' AFTER `create_time`;";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistportals = Verification.CheckIsExistTable(conn, driver, url, username, password, "portals1");
              if (!checkIsExistportals) {
                String sql = "alter table portals rename portals1";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistportals2 = Verification.CheckIsExistTable(conn, driver, url, username, password, "portals");
              if (!checkIsExistportals2) {
                String sql = "CREATE TABLE IF NOT EXISTS `portals` (\n  `portals_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',\n  `portals_no` int(11) DEFAULT NULL COMMENT '排序号',\n  `portal_name` varchar(255) DEFAULT NULL COMMENT '门户名称',\n  `portal_type` int(11) DEFAULT NULL COMMENT '门户类型（0：系统门户；1：自定义门户）',\n  `portal_link` varchar(255) DEFAULT NULL COMMENT '系统门户关联地址',\n  `module_id` varchar(255) DEFAULT NULL COMMENT '自定义门户关联id',\n  `use_flag` int(11) DEFAULT NULL COMMENT '启用标记(0-停用,1-启用)',\n  `access_priv_dept` varchar(255) DEFAULT NULL COMMENT '授权部门',\n  `access_priv_priv` varchar(255) DEFAULT NULL COMMENT '授权角色',\n  `access_priv_user` varchar(255) DEFAULT NULL COMMENT '授权用户',\n  `access_priv` int(1) DEFAULT '0' COMMENT '是否授权（0所有人1指定授权）',\n  PRIMARY KEY (`portals_id`)\n) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean checkIsExistPriv = Verification.CheckIsExistfield(conn, driver, url, username, password, "portals", "access_priv");
              if (!checkIsExistPriv) {
                String sql = "alter table `portals` add access_priv int(1) DEFAULT '0' comment'是否授权（0所有人1指定授权）'";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean CheckIsExistPara = Verification.CheckIsExistParam(conn, driver, url, username, password, "PORTALS_TIME");
              if (!CheckIsExistPara) {
                String sql = "INSERT INTO `sys_para` (`PARA_NAME`, `PARA_VALUE`) VALUES ('PORTALS_TIME', '0');";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean IsExistfiled = Verification.CheckIsExistfield(conn, driver, url, username, password, "office_products", "PRO_ORDER");
              if (IsExistfiled == true) {
                String sql = "ALTER TABLE office_products  MODIFY COLUMN PRO_ORDER VARCHAR(11)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean IsExistfiled_1 = Verification.CheckIsExistfield(conn, driver, url, username, password, "edu_training_plan", "T_BCWS");
              if (IsExistfiled_1 == true) {
                String sql = "ALTER TABLE edu_training_plan  MODIFY COLUMN T_BCWS decimal(65)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean por_1 = Verification.CheckIsExistPor(conn, driver, url, username, password, "1");
              if (!por_1) {
                String sql = "INSERT INTO `portals` VALUES ('1', '1', '内网门户', '0', '', '', '1', '', '', '', '0')";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean por_2 = Verification.CheckIsExistPor(conn, driver, url, username, password, "2");
              if (!por_2) {
                String sql = "INSERT INTO `portals` VALUES ('2', '2', '工作门户', '0', '', '', '1', '', '', '', '0')";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean por_3 = Verification.CheckIsExistPor(conn, driver, url, username, password, "3");
              if (!por_3) {
                String sql = "INSERT INTO `portals` VALUES ('3', '3', '应用门户', '0', '', '', '1', '', '', '', '0')";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean por_4 = Verification.CheckIsExistPor(conn, driver, url, username, password, "4");
              if (!por_4) {
                String sql = "INSERT INTO `portals` VALUES ('4', '4', '管理门户', '0', '', '', '1', '', '', '', '0')";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean function1 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2042");
              if (!function1) {
                String sql = "INSERT INTO `sys_function` VALUES ('2042', 'z070', '短信设置', 'SMS settings', '簡訊設定', '', '', '', 'smsSettings/index', '', '0')";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean function2 = Verification.CheckIsExistFunction(conn, driver, url, username, password, "2047");
              if (!function2) {
                String sql = "INSERT INTO `sys_function` VALUES ('2047', 'z032', '门户设置', 'Portal settings', '門戶設定', null, null, null, 'portals/index', '', '0')";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean table_exist = Verification.CheckIsExistTable(conn, driver, url, username, password, "document_org");
              String sql;
              if (!table_exist) {
                sql = "CREATE TABLE IF NOT EXISTS `document_org` (\n  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增字段',\n  `title` varchar(255) DEFAULT NULL COMMENT '标题',\n  `key_word` varchar(255) DEFAULT NULL COMMENT '主题词',\n  `unit` varchar(255) DEFAULT NULL COMMENT '来文单位/发文单位',\n  `doc_no` varchar(255) DEFAULT NULL COMMENT '文号',\n  `urgency` varchar(255) DEFAULT NULL COMMENT '紧急程度(0急件1特急2加急)',\n  `secrecy` varchar(255) DEFAULT NULL COMMENT '机密等级(0秘密1机密2绝密)',\n  `main_delivery` varchar(255) DEFAULT NULL COMMENT '主送',\n  `copy_delivery` varchar(255) DEFAULT NULL COMMENT '抄送',\n  `deadline` int(11) DEFAULT NULL COMMENT '保存期限',\n  `copies` int(11) DEFAULT NULL COMMENT '份数',\n  `remark` text COMMENT '附注',\n  `creater` varchar(255) DEFAULT NULL COMMENT '发文人',\n  `create_dept` varchar(255) DEFAULT NULL COMMENT '发文部门',\n  `print_dept` varchar(255) DEFAULT NULL COMMENT '印发机关',\n  `print_date` date DEFAULT NULL COMMENT '印发日期',\n  `document_type` varchar(255) DEFAULT NULL COMMENT '公文类型(1收文0发文)',\n  `dispatch_type` varchar(255) DEFAULT NULL COMMENT '公文种类(公告、通告、通知。。。)',\n  `main_file` varchar(255) DEFAULT NULL COMMENT '正文ID',\n  `main_file_name` varchar(255) DEFAULT NULL COMMENT '正文名称',\n  `pages` int(11) DEFAULT NULL COMMENT '正文页数',\n  `content` text COMMENT '正文内容',\n  `main_aip_file` varchar(255) DEFAULT NULL COMMENT '版式正文ID',\n  `main_aip_file_name` varchar(255) DEFAULT NULL COMMENT '版式正文名称',\n  `public_flag` varchar(255) DEFAULT NULL COMMENT '拟公开属性（0不予公开1依申请公开2主动公开）',\n  `print_copies` int(11) DEFAULT NULL COMMENT '打印份数',\n  `print_user` varchar(11) DEFAULT NULL COMMENT '打印人',\n  `flow_id` int(11) DEFAULT NULL COMMENT '流程类型',\n  `run_id` int(11) DEFAULT NULL COMMENT '流水号',\n  `flow_run_name` varchar(255) DEFAULT NULL COMMENT '流程名称',\n  `flow_status` varchar(255) DEFAULT '0' COMMENT '流程状态（办理中0、已结束1）',\n  `flow_prcs` varchar(255) DEFAULT '1' COMMENT '流程步骤（当前处于什么步骤）',\n  `cur_user_id` varchar(255) DEFAULT NULL COMMENT '当前经办人id',\n  `all_user_id` varchar(255) DEFAULT NULL COMMENT '全部经办人id',\n  `transfer_flag` int(1) DEFAULT NULL COMMENT '转交状态(0-未转交 1-已转交)',\n  `org_flag` int(1) DEFAULT NULL COMMENT '是否是上级组织（0-不是上级组织 1-上级组织）',\n  `transfer_org` varchar(255) DEFAULT NULL COMMENT '转交组织',\n  `transfer_user` varchar(255) DEFAULT NULL COMMENT '转交人',\n  `transfer_receive_org` varchar(255) DEFAULT NULL COMMENT '转交后的接收组织',\n  `transfer_receive_user` varchar(255) DEFAULT NULL COMMENT '转交后的接收人',\n  `transfer_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '转交时间',\n  PRIMARY KEY (`id`)\n) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;";
              }
  
              boolean isExistTable_6 = Verification.CheckIsExistTable(conn, driver, url, username, password, "sms_settings");
              if (!isExistTable_6) {
                sql = "CREATE TABLE IF NOT EXISTS `sms_settings` (\n  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',\n  `NAME` varchar(255) DEFAULT NULL COMMENT '网关名称',\n  `PROTOCOL` varchar(255) DEFAULT NULL COMMENT '协议',\n  `HOST` varchar(255) DEFAULT NULL COMMENT '主机',\n  `PORT` varchar(255) DEFAULT '' COMMENT '接口',\n  `USERNAME` varchar(255) DEFAULT '' COMMENT '账号参数名',\n  `PWD` varchar(255) DEFAULT NULL COMMENT '密码参数名',\n  `CONTENT_FIELD` varchar(255) DEFAULT NULL COMMENT '内容字段参数名',\n  `CODE` varchar(255) DEFAULT NULL COMMENT '内容编码参数名',\n  `MOBILE` varchar(255) DEFAULT NULL COMMENT '接收号码参数名',\n  `TIME_CONTENT` varchar(20) DEFAULT NULL,\n  `SIGN` varchar(255) DEFAULT NULL COMMENT '签名参数名',\n  `LOCATION` varchar(100) DEFAULT NULL COMMENT '签名位置',\n  `EXTEND_1` varchar(255) DEFAULT '' COMMENT '扩展参数1:',\n  `EXTEND_2` varchar(255) DEFAULT NULL COMMENT '扩展参数2:',\n  `EXTEND_3` varchar(255) DEFAULT NULL COMMENT '扩展参数3',\n  `EXTEND_4` varchar(255) DEFAULT NULL COMMENT '扩展参数4',\n  `EXTEND_5` varchar(255) DEFAULT NULL COMMENT '扩展参数5',\n  `STATE` varchar(100) DEFAULT '' COMMENT '状态',\n  PRIMARY KEY (`ID`)\n) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;";
  
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_1 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "flow_run_prcs", "OP_FLAG");
              if (!index_1) {
                sql = "ALTER TABLE `flow_run_prcs` ADD INDEX OP_FLAG (`OP_FLAG`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_2 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "flow_run_prcs", "TIME_OUT_FLAG");
              if (!index_2) {
                sql = "ALTER TABLE `flow_run_prcs` ADD INDEX TIME_OUT_FLAG (`TIME_OUT_FLAG`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_3 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "flow_run_prcs", "CHILD_RUN");
              if (!index_3) {
                sql = "ALTER TABLE `flow_run_prcs` ADD INDEX CHILD_RUN (`CHILD_RUN`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_4 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "flow_run_prcs", "TIME_OUT");
              if (!index_4) {
                sql = "ALTER TABLE `flow_run_prcs` ADD INDEX TIME_OUT (`TIME_OUT`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_5 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "file_sort", "SORT_TYPE");
              if (!index_5) {
                sql = "ALTER TABLE `file_sort` ADD INDEX SORT_TYPE (`SORT_TYPE`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_6 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "flow_run", "DEL_FLAG");
              if (!index_6) {
                  sql = "ALTER TABLE `flow_run` ADD INDEX DEL_FLAG (`DEL_FLAG`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_7 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "user", "DEPT_ID_OTHER");
              if (!index_7) {
                sql = "ALTER TABLE `user` ADD INDEX DEPT_ID_OTHER (`DEPT_ID_OTHER`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_8 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "file_content", "CREATER");
              if (!index_8) {
                  sql = "ALTER TABLE `file_content` ADD INDEX CREATER (`CREATER`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_9 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "email", "READ_FLAG");
              if (!index_9) {
                sql = "ALTER TABLE `email` ADD INDEX READ_FLAG (`READ_FLAG`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_10 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "attend_config", "DUTY_TYPE");
              if (!index_10) {
                  sql = "ALTER TABLE `attend_config` ADD INDEX DUTY_TYPE (`DUTY_TYPE`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_11 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "attend", "UID");
              if (!index_11) {
                sql = "ALTER TABLE `attend` ADD INDEX UID (`UID`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_12 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "attend", "DATE");
              if (!index_12) {
                sql = "ALTER TABLE `attend` ADD INDEX DATE (`DATE`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_13 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "attendance_overtime", "RUN_ID");
              if (!index_13) {
                sql = "ALTER TABLE `attendance_overtime` ADD INDEX RUN_ID (`RUN_ID`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_14 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "attendance_overtime", "ALLOW");
              if (!index_14) {
                sql = "ALTER TABLE `attendance_overtime` ADD INDEX ALLOW (`ALLOW`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_15 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "news", "PUBLISH");
              if (!index_15) {
               sql = "ALTER TABLE `news` ADD INDEX PUBLISH (`PUBLISH`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_16 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "attend_evection", "RUN_ID");
              if (!index_16) {
                sql = "ALTER TABLE `attend_evection` ADD INDEX RUN_ID (`RUN_ID`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_17 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "attend_evection", "ALLOW");
              if (!index_17) {
                 sql = "ALTER TABLE `attend_evection` ADD INDEX ALLOW (`ALLOW`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_18 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "attend_leave", "RUN_ID");
              if (!index_18) {
                 sql = "ALTER TABLE `attend_leave` ADD INDEX RUN_ID (`RUN_ID`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_19 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "attend_leave", "ALLOW");
              if (!index_19) {
                 sql = "ALTER TABLE `attend_leave` ADD INDEX ALLOW (`ALLOW`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_20 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "attend_out", "RUN_ID");
              if (!index_20) {
                 sql = "ALTER TABLE `attend_out` ADD INDEX RUN_ID (`RUN_ID`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean index_21 = Verification.CheckIsExistIndex(conn, driver, url, username, password, "attend_out", "ALLOW");
              if (!index_21) {
                 sql = "ALTER TABLE `attend_out` ADD INDEX ALLOW (`ALLOW`)";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              boolean isExistfield1 = Verification.CheckIsExistfield(conn, driver, url, username, password, "department", "DEPT_CODE");
              if (!isExistfield1) {
                 sql = "ALTER TABLE department ADD DEPT_CODE VARCHAR(255) comment '部门编码'";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
              }
  
              Version version = new Version();
              version.setVer("2018.03.16.1");
              this.versionMapper.editVer(version);
  
              conn.close();
            }
          }
        }
      } catch (Exception e) {
        json.setFlag(1);
        json.setMsg(e.getMessage());
        e.printStackTrace();
        L.e(new Object[] { "updateResourceLog:" + e });
      }
  
      return json;
    }
  
    public void downLog(HttpServletResponse response, HttpServletRequest request)
    {
      try {
        String classpath = getClass().getResource("/").getPath();
        String webappRoot = classpath.replaceAll("WEB-INF ", "ui properties/");
        File file = new File(webappRoot + "jdbc.txt");
        String urltd_oa = new String();
        String unametd_oa = new String();
        String passwordtd_oa = new String();
  
        if ((file.isFile()) && (file.exists()))
        {
          InputStreamReader read = new InputStreamReader(new FileInputStream(file));
  
          BufferedReader bufferedReader = new BufferedReader(read);
          String lineTxt = null;
          int i = 1;
          while ((lineTxt = bufferedReader.readLine()) != null) {
            if (i == 1) {
              urltd_oa = lineTxt;
            }
            else if (i == 2)
              unametd_oa = lineTxt;
            else {
              passwordtd_oa = lineTxt;
            }
            i++;
          }
          read.close();
        }
        Properties props = Resources.getResourceAsProperties("jdbc-sql.properties");
        String url = urltd_oa;
        String driver = props.getProperty("driverClassName");
        String username = unametd_oa;
        String password = passwordtd_oa;
        Class.forName(driver).newInstance();
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement st = conn.createStatement();
        String sql_2 = "select * from str_status where STATE =1";
        ResultSet rs = st.executeQuery(sql_2);
        List strstatus = new ArrayList();
        Object object1 = new Object();
        Object object2 = new Object();
        while (rs.next()) {
          Strstatus strstatus1 = new Strstatus();
          object1 = rs.getObject(1);
          object2 = rs.getObject(4);
          strstatus1.setId(Integer.valueOf(((Integer)object1).intValue()));
          strstatus1.setStringSql(object2.toString());
          strstatus.add(strstatus1);
        }
        HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("异常sql语句", 9);
        String[] secondTitles = { "序号", "异常语句" };
        HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
        String[] beanProperty = { "id", "stringSql" };
        HSSFWorkbook workbook = null;
        workbook = ExcelUtil.exportExcelData(workbook2, strstatus, beanProperty);
        OutputStream out = response.getOutputStream();
        String filename = "异常sql语句.xls";
        filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
        response.setContentType("application/vnd.ms-excel;charset=UTF-8");
        response.setHeader("content-disposition", "attachment;filename=" + filename);
        workbook.write(out);
        out.close();
      }
      catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

