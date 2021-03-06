 package com.myoa.service.officesupplies;
 
 import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.edu.eduUser.EduUserMapper;
import com.myoa.dao.officesupplies.OfficeDepositoryMapper;
import com.myoa.dao.officesupplies.OfficeProductsMapper;
import com.myoa.dao.officesupplies.OfficeTypeMapper;
import com.myoa.model.edu.eduUser.EduUser;
import com.myoa.model.officesupplies.OfficeDepositoryWithBLOBs;
import com.myoa.model.officesupplies.OfficeProductsWithBLOBs;
import com.myoa.model.officesupplies.OfficeType;
import com.myoa.model.users.Users;
import com.myoa.util.ExcelUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.common.session.SessionUtils;

 import java.io.File;
 import java.io.FileInputStream;
 import java.io.InputStream;
 import java.io.OutputStream;
 import java.math.BigDecimal;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import java.util.ResourceBundle;
 import java.util.UUID;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.ss.usermodel.Cell;
 import org.apache.poi.ss.usermodel.Row;
 import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
 
 @Service
 public class OfficeProductService
 {
 
   @Resource
   private OfficeProductsMapper officeProductsMapper;
 
   @Resource
   private EduUserMapper eduUserMapper;
 
   @Resource
   private OfficeDepositoryMapper officeDepositoryMapper;
 
   @Resource
   private OfficeTypeMapper officeTypeMapper;
 
   @Resource
   private DepartmentMapper departmentMapper;
 
   public ToJson<Object> addOfficeProducts(OfficeProductsWithBLOBs officeProductsWithBLOBs)
   {
     ToJson json = new ToJson(1, "err");
     try {
       int i = this.officeProductsMapper.insertSelective(officeProductsWithBLOBs);
       if (i > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       json.setFlag(1);
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Object> editOfficeProducts(OfficeProductsWithBLOBs officeProductsWithBLOBs)
   {
     ToJson json = new ToJson(1, "err");
     try {
       int i = this.officeProductsMapper.updateByPrimaryKeySelective(officeProductsWithBLOBs);
       if (i > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       json.setFlag(1);
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Object> deleteOfficeProductById(Integer proId)
   {
     ToJson json = new ToJson(1, "err");
     try {
       int i = this.officeProductsMapper.deleteByPrimaryKey(proId);
       if (i > 0) {
         json.setFlag(0);
         json.setMsg("ok");
       }
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Object> deleteOfficeProducts(String[] proIds)
   {
     ToJson json = new ToJson(1, "err");
     try {
       this.officeProductsMapper.deleteOfficeProducts(proIds);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<OfficeProductsWithBLOBs> getOfficeProductById(Integer proId)
   {
     ToJson json = new ToJson(1, "err");
     try {
       OfficeProductsWithBLOBs officeProductsWithBLOBs = this.officeProductsMapper.selectByPrimaryKey(proId);
       StringBuffer sb = new StringBuffer();
       StringBuffer sbdept = new StringBuffer();
       if (officeProductsWithBLOBs != null) {
         if (!StringUtils.checkNull(officeProductsWithBLOBs.getProManager()).booleanValue()) {
           String[] split = officeProductsWithBLOBs.getProManager().split(",");
           for (String s : split) {
             EduUser byuserId = this.eduUserMapper.getByuserId(s);
             sb.append(byuserId.getUserName());
           }
           officeProductsWithBLOBs.setProManagerName(sb.toString());
         }
 
         if (!StringUtils.checkNull(officeProductsWithBLOBs.getProDept()).booleanValue()) {
           if (officeProductsWithBLOBs.getProDept().equals("ALL_DEPT")) {
             officeProductsWithBLOBs.setProDeptName("全体部门");
           } else {
             String[] split = officeProductsWithBLOBs.getProDept().split(",");
             for (String s : split) {
               String deptNameByDeptId = this.departmentMapper.getDeptNameByDeptId(Integer.valueOf(s));
               sbdept.append(deptNameByDeptId);
             }
             officeProductsWithBLOBs.setProDeptName(sbdept.toString());
           }
         }
         if (!StringUtils.checkNull(officeProductsWithBLOBs.getProCreator()).booleanValue()) {
           EduUser byuserId = this.eduUserMapper.getByuserId(officeProductsWithBLOBs.getProCreator());
           officeProductsWithBLOBs.setProCreatorName(byuserId.getUserName());
         }
         if (!StringUtils.checkNull(officeProductsWithBLOBs.getOfficeProtype()).booleanValue()) {
           OfficeType depositoryByProType = this.officeTypeMapper.selectOffTypeByProType(officeProductsWithBLOBs.getOfficeProtype());
           officeProductsWithBLOBs.setOfficeDepositoryId(String.valueOf(depositoryByProType.getTypeDepository()));
         }
       }
 
       json.setFlag(0);
       json.setMsg("ok");
       json.setObject(officeProductsWithBLOBs);
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<OfficeProductsWithBLOBs> selectOfficeProducts(HttpServletRequest request, HttpServletResponse response, String id, String typeId, String proId, String export)
   {
     ToJson json = new ToJson(1, "err");
     if (export == null) {
       export = "0";
     }
     Map map = new HashMap();
     map.put("id", id);
     map.put("typeId", typeId);
     map.put("proId", proId);
     List<OfficeProductsWithBLOBs> officeProductsWithBLOBs = null;
     try {
       officeProductsWithBLOBs = this.officeProductsMapper.selectOfficeProducts(map);
       for (OfficeProductsWithBLOBs officeProductsWithBLOBs1 : officeProductsWithBLOBs) {
         if (officeProductsWithBLOBs1 != null) {
           if ((officeProductsWithBLOBs1.getProCreator() != null) && (officeProductsWithBLOBs1.getProCreator() != "")) {
             EduUser byuserId = this.eduUserMapper.getByuserId(officeProductsWithBLOBs1.getProCreator());
             if (byuserId != null) {
               officeProductsWithBLOBs1.setProCreatorName(byuserId.getUserName());
             }
           }
           if ((officeProductsWithBLOBs1.getProAuditer() != null) && (officeProductsWithBLOBs1.getProAuditer() != "")) {
             EduUser byuserId = this.eduUserMapper.getByuserId(officeProductsWithBLOBs1.getProAuditer().substring(0, officeProductsWithBLOBs1.getProAuditer().length() - 1));
             if (byuserId != null) {
               officeProductsWithBLOBs1.setProAuditerName(byuserId.getUserName());
             }
           }
         }
       }
       json.setObj(officeProductsWithBLOBs);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       json.setFlag(1);
       e.printStackTrace();
     }
 
     if (export.equals("1")) {
       HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("办公用品信息表", 9);
       String[] secondTitles = { "办公用品名称", "办公用品类别", "计量单位", "供应商", "警戒库存", "当前库存", "创建人", "审批人" };
       HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
       String[] beanProperty = { "proName", "typeName", "proUnit", "proSupplier", "proLowstock", "proStock", "proCreatorName", "proAuditerName" };
       HSSFWorkbook workbook = null;
       try {
         workbook = ExcelUtil.exportExcelData(workbook2, officeProductsWithBLOBs, beanProperty);
         OutputStream out = response.getOutputStream();
         String filename = "办公用品信息表.xls";
         filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
         response.setContentType("application/vnd.ms-excel;charset=UTF-8");
         response.setHeader("content-disposition", "attachment;filename=" + filename);
         workbook.write(out);
         out.close();
       } catch (Exception e) {
         e.printStackTrace();
       }
     }
 
     return json;
   }
 
   public ToJson<Object> importOfficeProducts(MultipartFile file, HttpServletRequest request, HttpServletResponse response, HttpSession session)
   {
     ToJson json = new ToJson(1, "err");
 
     Integer successCount = Integer.valueOf(0);
     try
     {
       ResourceBundle rb = ResourceBundle.getBundle("upload");
       String osName = System.getProperty("os.name");
       StringBuffer path = new StringBuffer();
       if (osName.toLowerCase().startsWith("win"))
         path = path.append(rb.getString("upload.win"));
       else {
         path = path.append(rb.getString("upload.linux"));
       }
 
       if (file.isEmpty()) {
         json.setMsg("请上传文件！");
         json.setFlag(1);
         return json;
       }
       String fileName = file.getOriginalFilename();
       if ((fileName.endsWith(".xls")) || (fileName.endsWith(".xlsx"))) {
         String uuid = UUID.randomUUID().toString().replaceAll("-", "");
         int pos = fileName.indexOf(".");
         String extName = fileName.substring(pos);
         String newFileName = uuid + extName;
         File dest = new File(path.toString(), newFileName);
         file.transferTo(dest);
 
         String readPath = path.append("\\" + newFileName).toString();
         InputStream in = new FileInputStream(readPath);
         HSSFWorkbook excelObj = new HSSFWorkbook(in);
         HSSFSheet sheetObj = excelObj.getSheetAt(0);
         Row row = sheetObj.getRow(0);
         int colNum = row.getPhysicalNumberOfCells();
         int lastRowNum = sheetObj.getLastRowNum();
         List saveList = new ArrayList();
         OfficeProductsWithBLOBs officeProductsWithBLOBs = null;
         Cell cell;
         for (int i = 1; i <= lastRowNum; i++) {
           OfficeDepositoryWithBLOBs officeDepositoryWithBLOBs = new OfficeDepositoryWithBLOBs();
           OfficeType officeType = new OfficeType();
           officeProductsWithBLOBs = new OfficeProductsWithBLOBs();
           row = sheetObj.getRow(i);
           if (row != null)
           {
             EduUser byuserName;
             for (int j = 0; j < colNum; j++) {
               cell = row.getCell(j);
               if (cell != null) {
                 switch (j)
                 {
                 case 0:
                   officeProductsWithBLOBs.setProName(cell.getStringCellValue());
                   break;
                 case 1:
                   officeDepositoryWithBLOBs = this.officeDepositoryMapper.selDepositoryByName(cell.getStringCellValue());
                   break;
                 case 2:
                   officeType = this.officeTypeMapper.selectByName(cell.getStringCellValue());
                   officeProductsWithBLOBs.setOfficeProtype(String.valueOf(officeType.getId()));
                   break;
                 case 3:
                   officeProductsWithBLOBs.setOfficeProductType(Integer.valueOf((int)cell.getNumericCellValue()));
                   break;
                 case 4:
                   officeProductsWithBLOBs.setProCode(String.valueOf(cell.getNumericCellValue()));
                   break;
                 case 5:
                   officeProductsWithBLOBs.setProPrice(BigDecimal.valueOf(cell.getNumericCellValue()));
                   break;
                 case 6:
                   officeProductsWithBLOBs.setProUnit(cell.getStringCellValue());
                   break;
                 case 7:
                   officeProductsWithBLOBs.setProSupplier(cell.getStringCellValue());
                   break;
                 case 8:
                   officeProductsWithBLOBs.setProLowstock(Integer.valueOf((int)cell.getNumericCellValue()));
                   break;
                 case 9:
                   officeProductsWithBLOBs.setProMaxstock(Integer.valueOf((int)cell.getNumericCellValue()));
                   break;
                 case 10:
                   officeProductsWithBLOBs.setProStock(Integer.valueOf((int)cell.getNumericCellValue()));
                   break;
                 case 11:
                   byuserName = this.eduUserMapper.getByuserName(cell.getStringCellValue());
                   if (byuserName == null) continue;
                   officeProductsWithBLOBs.setProCreator(byuserName.getUserId()); break;
                 case 12:
                   String Name = cell.getStringCellValue();
                   if (Name == null) continue;
                   String[] split = Name.split(",");
                   for (String s : split) {
                     EduUser byuserName2 = this.eduUserMapper.getByuserName(s);
                     if (byuserName2 != null) {
                       officeProductsWithBLOBs.setProManager(byuserName2.getUserId());
                     }
                   }
                   break;
                 case 13:
                   EduUser byuserName3 = this.eduUserMapper.getByuserName(cell.getStringCellValue());
                   if (byuserName3 == null) continue;
                   officeProductsWithBLOBs.setProManager(byuserName3.getUserId() + ",");
                 }
 
               }
 
             }
 
             OfficeProductsWithBLOBs officeProductsWithBLOBs1 = this.officeProductsMapper.selectSingleOfficeProducts(officeProductsWithBLOBs);
             if (officeProductsWithBLOBs1 != null) {
               officeProductsWithBLOBs1.setProId(officeProductsWithBLOBs1.getProId());
               this.officeProductsMapper.updateByPrimaryKeySelective(officeProductsWithBLOBs1);
              // cell = successCount;
			//			byuserName = successCount = Integer.valueOf(successCount.intValue() + 1);
                         successCount = successCount = Integer.valueOf(successCount.intValue() + 1);
             } else {
               addOfficeProducts(officeProductsWithBLOBs);
         //      cell = successCount; 
          //              byuserName = successCount = Integer.valueOf(successCount.intValue() + 1);
                          successCount = successCount = Integer.valueOf(successCount.intValue() + 1);
             }
           }
         }
       }
       else
       {
         json.setMsg("file type error!");
         json.setFlag(1);
         return json;
       }
 
       json.setTotleNum(successCount);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<OfficeDepositoryWithBLOBs> selDepositoryByDept(HttpServletRequest request)
   {
     ToJson json = new ToJson(1, "error");
     try {
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       List<OfficeDepositoryWithBLOBs> list = this.officeDepositoryMapper.selDepositoryByDept(users.getUserId());
       for (OfficeDepositoryWithBLOBs officeDepository : list) {
         List<OfficeType> typeList = this.officeTypeMapper.selectDownObject(String.valueOf(officeDepository.getId()));
         officeDepository.setOfficeTypeList(typeList);
         for (OfficeType officeType : typeList) {
           List officeProductsList = this.officeProductsMapper.selectDownObject(String.valueOf(officeType.getId()));
           officeType.setOfficeProductsList(officeProductsList);
         }
       }
       json.setObj(list);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "OfficeProductService selDepositoryByDept:" + e });
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<OfficeProductsWithBLOBs> selProductByType(String typeId)
   {
     ToJson json = new ToJson(1, "error");
     try {
       List<OfficeProductsWithBLOBs> officeProductsList = this.officeProductsMapper.selectDownObject(typeId);
       for (OfficeProductsWithBLOBs temp : officeProductsList) {
         if (temp != null) {
           if ((temp.getProCreator() != null) && (temp.getProCreator() != "")) {
             EduUser byuserId = this.eduUserMapper.getByuserId(temp.getProCreator());
             if (byuserId != null) {
               temp.setProCreatorName(byuserId.getUserName());
             }
           }
           if ((temp.getProAuditer() != null) && (temp.getProAuditer() != "")) {
             EduUser byuserId = this.eduUserMapper.getByuserId(temp.getProAuditer().substring(0, temp.getProAuditer().length() - 1));
             if (byuserId != null) {
               temp.setProAuditerName(byuserId.getUserName());
             }
           }
           if (!StringUtils.checkNull(temp.getOfficeProtype()).booleanValue()) {
             OfficeType type = this.officeTypeMapper.selectByPrimaryKey(Integer.valueOf(temp.getOfficeProtype()));
             if (type != null) {
               temp.setOfficeProtypeName(type.getTypeName());
             }
           }
         }
       }
 
       json.setObj(officeProductsList);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "OfficeProductService selProductByType:" + e });
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<OfficeProductsWithBLOBs> transferProduct(HttpServletRequest request, int orgDepository, int orgType, int orgProduct, int count, int destDepository, int destType, int destProduct)
   {
     ToJson json = new ToJson(1, "error");
     try
     {
       if ((orgDepository == destDepository) && (orgType == destType)) {
         return json;
       }
 
       OfficeProductsWithBLOBs officeProductsWithBLOBs = this.officeProductsMapper.selectByPrimaryKey(Integer.valueOf(orgProduct));
       if (officeProductsWithBLOBs != null) {
         if (officeProductsWithBLOBs.getProLowstock() != null) {
           if (officeProductsWithBLOBs.getProStock().intValue() - count < officeProductsWithBLOBs.getProLowstock().intValue()) {
             json.setMsg("stockNotEnough");
             return json;
           }
         }
         else if (officeProductsWithBLOBs.getProStock().intValue() < count) {
           json.setMsg("stockNotEnough");
           return json;
         }
 
       }
 
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       if (!officeProductsWithBLOBs.getProKeeper().contains(users.getUserId())) {
         return json;
       }
       int num = 0;
 
       officeProductsWithBLOBs.setAllocation(Boolean.valueOf(true));
       if (officeProductsWithBLOBs.getProStock().intValue() - count == 0) {
         officeProductsWithBLOBs.setOfficeProtype(String.valueOf(destType));
         num += this.officeProductsMapper.updateByPrimaryKey(officeProductsWithBLOBs);
       } else {
         officeProductsWithBLOBs.setProStock(Integer.valueOf(officeProductsWithBLOBs.getProStock().intValue() - count));
         num += this.officeProductsMapper.updateByPrimaryKey(officeProductsWithBLOBs);
         officeProductsWithBLOBs.setProId(null);
         officeProductsWithBLOBs.setProStock(Integer.valueOf(count));
         num += this.officeProductsMapper.insertSelective(officeProductsWithBLOBs);
       }
       if (destProduct != 0) {
         OfficeProductsWithBLOBs destOfficeProduct = this.officeProductsMapper.selectByPrimaryKey(Integer.valueOf(destProduct));
         destOfficeProduct.setOfficeProtype(String.valueOf(orgType));
         num += this.officeProductsMapper.updateByPrimaryKey(destOfficeProduct);
       }
       if (num > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "OfficeProductService transferProduct:" + e });
       e.printStackTrace();
     }
     return json;
   }
   public ToJson<OfficeProductsWithBLOBs> getInfo(HttpServletRequest request) {
     ToJson json = new ToJson();
     Date date = null;
     try
     {
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       date = new Date();
       OfficeProductsWithBLOBs officeProductsWithBLOBs = new OfficeProductsWithBLOBs();
       officeProductsWithBLOBs.setProCode(String.valueOf(date.getTime()));
       officeProductsWithBLOBs.setProCreator(users.getUserId());
       officeProductsWithBLOBs.setProCreatorName(users.getUserName());
       json.setObject(officeProductsWithBLOBs);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
 
     return json;
   }
 }

