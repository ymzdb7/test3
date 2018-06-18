 package com.myoa.service.salary.bonusmsg;
 
 import com.myoa.dao.salary.bonus.BonusMapper;
import com.myoa.dao.salary.bonusmsg.BonusMsgMapper;
import com.myoa.model.salary.bonusmsg.BonusMsg;
import com.myoa.model.users.Users;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.page.PageParams;

 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.ss.usermodel.Cell;
 import org.apache.poi.ss.usermodel.Row;
 import org.apache.poi.ss.usermodel.Sheet;
 import org.apache.poi.ss.usermodel.Workbook;
 import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
 
 @Service
 public class BonusMsgService
 {
 
   @Autowired
   private BonusMsgMapper bonusMsgMapper;
 
   @Autowired
   private BonusMapper bonusMapper;
 
   @Transactional
   public ToJson bmImport(MultipartFile mFile, HttpServletRequest request, HttpServletResponse response, String time, Integer type)
   {
     ToJson toJson = new ToJson(1, "err");
     int totalRows = 0;
     int totalCells = 0;
     List bonusmsg = new ArrayList();
     String fileName = mFile.getOriginalFilename();
     Workbook wb = null;
     try {
       if (fileName.matches("^.+\\.(?i)(xls)$")) {
         wb = new HSSFWorkbook(mFile.getInputStream());
       }
       else if (fileName.matches("^.+\\.(?i)(xlsx)$"))
         wb = new XSSFWorkbook(mFile.getInputStream());
       else {
         return null;
       }
 
       Sheet sheet = wb.getSheetAt(0);
 
       totalRows = sheet.getPhysicalNumberOfRows();
 
       if ((totalRows > 1) && (sheet.getRow(0) != null)) {
         totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
       }
       String[] datas = new String[totalCells + 1];
       String[] head = new String[totalCells + 1];
       datas[0] = "HEAD_ID";
       head[0] = ("'" + time + "'");
       Row row1 = sheet.getRow(0);
       for (int c = 0; c < totalCells; c++) {
         head[(c + 1)] = ("'" + row1.getCell(c).getStringCellValue() + "'");
         datas[(c + 1)] = ("DATA_" + String.valueOf(c + 1));
       }
       for (int r = 1; r < totalRows; r++) {
         Row row = sheet.getRow(r);
         if (row == null) {
           continue;
         }
         String[] bm = new String[totalCells + 1];
         bm[0] = ("'" + time + "'");
         for (int c = 0; c < totalCells; c++) {
           bm[(c + 1)] = ("'" + row.getCell(c).getStringCellValue() + "'");
         }
         bonusmsg.add(bm);
       }
 
       boolean condition = this.bonusMapper.selectByType(1) == null;
       if (condition)
       {
         Map map = new HashMap();
         map.put("datas", datas);
         map.put("head", head);
         map.put("type", type);
         this.bonusMapper.insertHead(map);
       }
 
       Map map1 = new HashMap();
       map1.put("bonusmsg", bonusmsg);
       datas[0] = "HEAD";
       map1.put("datas", datas);
       map1.put("type", type);
       int succ = this.bonusMsgMapper.inserMsg(map1);
       if (succ > 0) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     } catch (Exception e) {
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { e });
       e.printStackTrace();
     }
     return toJson;
   }
 
   @Transactional
   public ToJson<BonusMsg> queryBMsg(BonusMsg bonusMsg, Integer page, Integer pageSize, boolean useFlag, HttpServletRequest request) {
     ToJson toJson = new ToJson(1, "err");
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
 
     bonusMsg.setData2(null);
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     Map map = new HashMap();
     map.put("page", pageParams);
     map.put("bg", bonusMsg);
     if ("admin".equals(user.getUserId()))
       map.put("userName", null);
     else {
       map.put("userName", user.getUserName());
     }
     List relist = new ArrayList();
     try {
       if ("1".equals(bonusMsg.getData50()))
         relist = this.bonusMsgMapper.queryBo(map);
       else {
         relist = this.bonusMsgMapper.queryBo2(map);
       }
       toJson.setFlag(0);
       toJson.setMsg("ok");
       toJson.setObj(relist);
       toJson.setTotleNum(pageParams.getTotal());
     } catch (Exception e) {
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { e });
       e.printStackTrace();
     }
 
     return toJson;
   }
 }

