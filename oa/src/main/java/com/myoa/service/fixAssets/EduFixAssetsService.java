 package com.myoa.service.fixAssets;
 
 import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.fixAssets.EduFixAssetsMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.department.Department;
import com.myoa.model.fixAssets.EduFixAssets;
import com.myoa.model.users.Users;
import com.myoa.util.DateFormat;
import com.myoa.util.ExcelUtil;
import com.myoa.util.FileUploadUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.page.PageParams;

 import java.io.File;
 import java.io.FileInputStream;
 import java.io.InputStream;
 import java.io.OutputStream;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import java.util.ResourceBundle;
 import java.util.UUID;
 import javax.annotation.Resource;
 import javax.servlet.ServletContext;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.ss.usermodel.Cell;
 import org.apache.poi.ss.usermodel.Row;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
 
 @Service
 public class EduFixAssetsService
 {
 
   @Resource
   private EduFixAssetsMapper eduFixAssetsMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Resource
   private DepartmentMapper departmentMapper;
 
   public ToJson<EduFixAssets> selFixAssetsByCond(int condition, int output, EduFixAssets eduFixAssets, HttpServletRequest request, HttpServletResponse response, HttpSession session, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson json = new ToJson(1, "error");
     try
     {
       PageParams pageParams = new PageParams();
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       pageParams.setUseFlag(Boolean.valueOf(useFlag));
       Map map = new HashMap();
       map.put("page", pageParams);
       map.put("eduFixAssets", eduFixAssets);
       List<EduFixAssets> eduFixAssetsList = new ArrayList();
       if (condition == 1) {
         eduFixAssetsList = this.eduFixAssetsMapper.selFixAssetsByNameLike(map);
         json.setTotleNum(Integer.valueOf(this.eduFixAssetsMapper.selFixAssetsTotalByNameLike(eduFixAssets)));
       } else if (condition == 2) {
         eduFixAssetsList = this.eduFixAssetsMapper.selFixAssetsByCond(map);
         json.setTotleNum(Integer.valueOf(this.eduFixAssetsMapper.selFixAssetsTotalByCond(eduFixAssets)));
       } else {
         eduFixAssetsList = this.eduFixAssetsMapper.selFixAssetsByOrCond(map);
         json.setTotleNum(Integer.valueOf(this.eduFixAssetsMapper.selFixAssetsTotalByOrCond(eduFixAssets)));
       }
 
       if (eduFixAssetsList.size() > 0) {
         for (EduFixAssets fixAssets : eduFixAssetsList) {
           if ((!StringUtils.checkNull(fixAssets.getCustodion()).booleanValue()) && 
             (this.usersMapper.findUsersByuserId(fixAssets.getCustodion()) != null)) {
             fixAssets.setCustodionName(this.usersMapper.findUsersByuserId(fixAssets.getCustodion()).getUserName());
           }
 
           if ((!StringUtils.checkNull(fixAssets.getCreater()).booleanValue()) && 
             (this.usersMapper.findUsersByuserId(fixAssets.getCreater()) != null)) {
             fixAssets.setCreaterName(this.usersMapper.findUsersByuserId(fixAssets.getCreater()).getUserName());
           }
 
           if ((!StringUtils.checkNull(fixAssets.getLocationAddress()).booleanValue()) && 
             (this.departmentMapper.getDeptById(Integer.parseInt(fixAssets.getLocationAddress())) != null)) {
             fixAssets.setLocationAddressName(this.departmentMapper.getDeptById(Integer.parseInt(fixAssets.getLocationAddress())).getDeptName());
           }
         }
 
       }
 
       if (output == 1) {
         HSSFWorkbook tableWork = ExcelUtil.makeExcelHead("固定资产信息表", 12);
         String[] secondTitles = { "固定资产编号", "资产名称", "购买时间", "品牌—型号", "数量", "所在位置", "使用保管人", "物品状态", "备注", "创建人", "创建时间" };
         HSSFWorkbook excelWork = ExcelUtil.makeSecondHead(tableWork, secondTitles);
         String[] beanProperty = { "id", "assetsName", "buyTime", "info", "number", "locationAddressName", "custodionName", "status", "remake", "creater", "createrTime" };
         HSSFWorkbook workbook = ExcelUtil.exportExcelData(excelWork, eduFixAssetsList, beanProperty);
         response.setContentType("text/html;charset=UTF-8");
         OutputStream out = response.getOutputStream();
 
         String filename = "固定资产信息表.xls";
         filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
 
         response.setContentType("application/vnd.ms-excel");
         response.setHeader("content-disposition", "attachment;filename=" + filename);
 
         workbook.write(out);
         out.flush();
         out.close();
       }
       json.setObj(eduFixAssetsList);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "EduFixAssetsService selFixAssetsByCond:" + e });
       e.printStackTrace();
     }
     return json;
   }
 
   @Transactional
   public synchronized ToJson<EduFixAssets> insertFixAssets(HttpServletRequest request, MultipartFile imageFile, MultipartFile QRcodeFile, EduFixAssets eduFixAssets)
   {
     ToJson json = new ToJson(1, "error");
     try
     {
       int imgResult = uploadImg(request, eduFixAssets, imageFile, QRcodeFile);
       if (imgResult != 0) {
         json.setMsg(String.valueOf(imgResult));
         return json;
       }
       int count = this.eduFixAssetsMapper.insertFixAssets(eduFixAssets);
       if (count > 0) {
         json.setObject(eduFixAssets);
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "EduFixAssetsService insertFixAssets:" + e });
       e.printStackTrace();
     }
     return json;
   }
 
   @Transactional
   public ToJson<EduFixAssets> updateFixAssetsById(HttpServletRequest request, MultipartFile imageFile, MultipartFile QRcodeFile, EduFixAssets eduFixAssets)
   {
     ToJson json = new ToJson(1, "error");
     try
     {
       int imgResult = uploadImg(request, eduFixAssets, imageFile, QRcodeFile);
       if (imgResult != 0) {
         json.setMsg(String.valueOf(imgResult));
         return json;
       }
       int count = this.eduFixAssetsMapper.updateFixAssetsById(eduFixAssets);
       if (count > 0) {
         json.setObject(eduFixAssets);
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "EduFixAssetsService updateFixAssetsById:" + e });
       e.printStackTrace();
     }
     return json;
   }
 
   @Transactional
   public ToJson<EduFixAssets> deleteFixAssetsById(String id)
   {
     ToJson json = new ToJson(1, "error");
     try {
       int count = this.eduFixAssetsMapper.deleteFixAssetsById(id);
       if (count > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "EduFixAssetsService deleteFixAssetsById:" + e });
       e.printStackTrace();
     }
     return json;
   }
 
   @Transactional
   public ToJson<EduFixAssets> inputFixAsserts(HttpServletRequest request, HttpServletResponse response, MultipartFile file, HttpSession session)
   {
     ToJson json = new ToJson(1, "error");
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
         return json;
       }
       String fileName = file.getOriginalFilename();
       if ((fileName.endsWith(".xls")) || (fileName.endsWith(".xlsx"))) {
         String uuid = UUID.randomUUID().toString();
         uuid = uuid.replaceAll("-", "");
         int pos = fileName.indexOf(".");
         String extName = fileName.substring(pos);
         String newFileName = uuid + extName;
         File dest = new File(path.toString(), newFileName);
 
         String readPath = path.append(newFileName).toString();
         InputStream in = new FileInputStream(readPath);
         HSSFWorkbook excelObj = new HSSFWorkbook(in);
         HSSFSheet sheetObj = excelObj.getSheetAt(0);
         Row rowObj = null;
         int lastRowNum = sheetObj.getLastRowNum();
         int inputFail = 0;
         int inputSuccess = 0;
         String faillReason = "";
         for (int i = 2; i <= lastRowNum; i++) {
           rowObj = sheetObj.getRow(i);
           if (rowObj != null) {
             Cell c0 = rowObj.getCell(0);
             Cell c1 = rowObj.getCell(1);
             Cell c2 = rowObj.getCell(2);
             Cell c3 = rowObj.getCell(3);
             Cell c4 = rowObj.getCell(4);
             Cell c5 = rowObj.getCell(5);
             Cell c6 = rowObj.getCell(6);
             Cell c7 = rowObj.getCell(7);
             Cell c8 = rowObj.getCell(8);
             Cell c9 = rowObj.getCell(9);
             Cell c10 = rowObj.getCell(10);
             if ((c0.getStringCellValue() != "") && (c1.getStringCellValue() != "") && (c2.getStringCellValue() != "")) {
               EduFixAssets eduFixAssets = new EduFixAssets();
               eduFixAssets.setId(c0.getStringCellValue());
               eduFixAssets.setAssetsName(c1.getStringCellValue());
               eduFixAssets.setBuyTime(DateFormat.DateToStr(c2.getStringCellValue()));
               eduFixAssets.setInfo(c3.getStringCellValue());
               if (!StringUtils.checkNull(c4.getStringCellValue()).booleanValue()) {
                 eduFixAssets.setNumber(Integer.valueOf(c4.getStringCellValue()));
               }
               if ((!StringUtils.checkNull(c5.getStringCellValue()).booleanValue()) && 
                 (this.departmentMapper.getDeptById(Integer.parseInt(c5.getStringCellValue())) != null)) {
                 eduFixAssets.setLocationAddress(this.departmentMapper.getDeptById(Integer.parseInt(c5.getStringCellValue())).getDeptName());
               }
 
               if ((!StringUtils.checkNull(c6.getStringCellValue()).booleanValue()) && 
                 (this.usersMapper.findUsersByuserId(c6.getStringCellValue()) != null)) {
                 eduFixAssets.setCustodion(this.usersMapper.findUsersByuserId(c6.getStringCellValue()).getUserId());
               }
 
               eduFixAssets.setInfo(c7.getStringCellValue());
               eduFixAssets.setRemake(c8.getStringCellValue());
               if ((!StringUtils.checkNull(c9.getStringCellValue()).booleanValue()) && 
                 (this.usersMapper.findUsersByuserId(c9.getStringCellValue()) != null)) {
                 eduFixAssets.setCreater(this.usersMapper.findUsersByuserId(c9.getStringCellValue()).getUserId());
               }
 
               if (!StringUtils.checkNull(c10.getStringCellValue()).booleanValue()) {
                 eduFixAssets.setCreaterTime(DateFormat.DateToStr(c10.getStringCellValue()));
               }
               if (this.eduFixAssetsMapper.selFixAssetsById(c0.getStringCellValue()) != null) {
                 this.eduFixAssetsMapper.insert(eduFixAssets);
                 inputSuccess++;
               } else {
                 inputFail++;
                 faillReason = faillReason + c0.getStringCellValue() + ",";
               }
             }
           }
         }
 
         EduFixAssets temp = new EduFixAssets();
         temp.setInputFail(inputFail);
         temp.setInputSuccess(inputSuccess);
         temp.setInputFailReason(faillReason);
         json.setFlag(0);
         json.setMsg("ok");
         dest.delete();
       } else {
         json.setMsg("0");
         return json;
       }
     }
     catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "EduFixAssetsService inputFixAsserts:" + e });
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<EduFixAssets> selFixAssetsById(String id)
   {
     ToJson json = new ToJson(1, "error");
     try {
       EduFixAssets eduFixAssets = this.eduFixAssetsMapper.selFixAssetsById(id);
       if ((!StringUtils.checkNull(eduFixAssets.getCustodion()).booleanValue()) && 
         (this.usersMapper.findUsersByuserId(eduFixAssets.getCustodion()) != null)) {
         eduFixAssets.setCustodionName(this.usersMapper.findUsersByuserId(eduFixAssets.getCustodion()).getUserName());
       }
 
       if ((!StringUtils.checkNull(eduFixAssets.getCreater()).booleanValue()) && 
         (this.usersMapper.findUsersByuserId(eduFixAssets.getCreater()) != null)) {
         eduFixAssets.setCreaterName(this.usersMapper.findUsersByuserId(eduFixAssets.getCreater()).getUserName());
       }
 
       if ((!StringUtils.checkNull(eduFixAssets.getLocationAddress()).booleanValue()) && 
         (this.departmentMapper.getDeptById(Integer.parseInt(eduFixAssets.getLocationAddress())) != null)) {
         eduFixAssets.setLocationAddressName(this.departmentMapper.getDeptById(Integer.parseInt(eduFixAssets.getLocationAddress())).getDeptName());
       }
 
       json.setObject(eduFixAssets);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "EduFixAssetsService selFixAssetsById:" + e });
       e.printStackTrace();
     }
     return json;
   }
 
   public int uploadImg(HttpServletRequest request, EduFixAssets eduFixAssets, MultipartFile imageFile, MultipartFile QRcodeFile)
   {
     int resultFlag = 0;
     try
     {
       if (imageFile != null) {
         String imageType = imageFile.getContentType();
         boolean b = FileUploadUtil.allowUpload(imageType);
         if (!b) {
           resultFlag = 1;
         }
       }
       if (QRcodeFile != null) {
         String QRcodeType = QRcodeFile.getContentType();
         boolean b = FileUploadUtil.allowUpload(QRcodeType);
         if (!b) {
           resultFlag = 2;
         }
       }
       String realPath = request.getSession().getServletContext().getRealPath("/");
       String resourcePath = "uiedu/eduFixAssets";
 
       EduFixAssets temp = this.eduFixAssetsMapper.selFixAssetsById(eduFixAssets.getId());
       if (temp != null) {
         if (!StringUtils.checkNull(temp.getImage()).booleanValue()) {
           File temp1 = new File(realPath + resourcePath + temp.getImage());
           if (temp1.exists()) {
             temp1.delete();
           }
         }
         if (!StringUtils.checkNull(temp.getQrCode()).booleanValue()) {
           File temp2 = new File(realPath + resourcePath + temp.getQrCode());
           if (temp2.exists()) {
             temp2.delete();
           }
         }
       }
 
       if ((imageFile != null) && 
         (FileUploadUtil.allowUpload(imageFile.getContentType()))) {
         String fileName = FileUploadUtil.rename(imageFile.getOriginalFilename());
         File dir = new File(realPath + resourcePath);
         if (!dir.exists()) {
           dir.mkdirs();
         }
         File file = new File(dir, fileName);
         imageFile.transferTo(file);
         eduFixAssets.setImage(fileName);
       }
 
       if ((QRcodeFile != null) && 
         (FileUploadUtil.allowUpload(QRcodeFile.getContentType()))) {
         String fileName = FileUploadUtil.rename(QRcodeFile.getOriginalFilename());
         File dir = new File(realPath + resourcePath);
         if (!dir.exists()) {
           dir.mkdirs();
         }
         File file = new File(dir, fileName);
         QRcodeFile.transferTo(file);
         eduFixAssets.setQrCode(fileName);
       }
     }
     catch (Exception e) {
       L.e(new Object[] { "EduFixAssetsService selFixAssetsById:" + e });
       e.printStackTrace();
     }
     return resultFlag;
   }
 
   public ToJson<EduFixAssets> getFixAssetsId()
   {
     ToJson json = new ToJson(1, "error");
     try {
       String maxId = this.eduFixAssetsMapper.selMaxId();
       String OriginId = "00001";
       if (!StringUtils.checkNull(maxId).booleanValue()) {
         String tempId = String.valueOf(Integer.valueOf(maxId.substring(12, maxId.length())).intValue() + 1);
         String zeroStr = "";
         for (int i = tempId.length(); i < 6 - tempId.length(); i++) {
           zeroStr = zeroStr + "0";
         }
         OriginId = zeroStr + tempId;
       }
       String IdStr = "GDZC" + DateFormat.getDatestr(new Date()) + OriginId;
       EduFixAssets eduFixAssets = new EduFixAssets();
       eduFixAssets.setId(IdStr.replaceAll("-", ""));
       eduFixAssets.setCreaterTime(new Date());
       json.setMsg("ok");
       json.setObject(eduFixAssets);
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "EduFixAssetsService getFixAssetsId:" + e });
       e.printStackTrace();
     }
     return json;
   }
 }

