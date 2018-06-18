 package com.myoa.util;
 
 import java.io.IOException;
 import java.io.InputStream;
 import java.text.DecimalFormat;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import org.apache.poi.hssf.usermodel.HSSFCell;
 import org.apache.poi.hssf.usermodel.HSSFDateUtil;
 import org.apache.poi.hssf.usermodel.HSSFRow;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.ss.usermodel.DateUtil;
 import org.apache.poi.xssf.usermodel.XSSFCell;
 import org.apache.poi.xssf.usermodel.XSSFRow;
 import org.apache.poi.xssf.usermodel.XSSFSheet;
 import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 import org.springframework.web.multipart.MultipartFile;
 
 public class ExcelRead
 {
   public int totalRows;
   public static int totalCells;
   public static final String OFFICE_EXCEL_2003_POSTFIX = "xls";
   public static final String OFFICE_EXCEL_2010_POSTFIX = "xlsx";
   public static final String EMPTY = "";
   public static final String POINT = ".";
   public static SimpleDateFormat sdf = new SimpleDateFormat("yyyydd");
 
   public List<Map<String, Object>> readExcel(MultipartFile file)
     throws IOException
   {
     if ((file == null) || ("".equals(file.getOriginalFilename().trim()))) {
       return null;
     }
     String postfix = getPostfix(file.getOriginalFilename());
     if (!"".equals(postfix)) {
       if ("xls".equals(postfix))
         return readXls(file);
       if ("xlsx".equals(postfix)) {
         return readXlsx(file);
       }
       return null;
     }
 
     return null;
   }
 
   public List<Map<String, Object>> readXlsx(MultipartFile file) {
     List list = new ArrayList();
     List maps = new ArrayList();
 
     InputStream input = null;
     XSSFWorkbook wb = null;
     ArrayList rowList = null;
     try {
       input = file.getInputStream();
 
       wb = new XSSFWorkbook(input);
 
       for (int numSheet = 0; numSheet < wb.getNumberOfSheets(); numSheet++) {
         XSSFSheet xssfSheet = wb.getSheetAt(numSheet);
         if (xssfSheet == null) {
           continue;
         }
         this.totalRows = xssfSheet.getLastRowNum();
 
         for (int rowNum = 0; rowNum <= this.totalRows; rowNum++) {
           XSSFRow xssfRow = xssfSheet.getRow(rowNum);
 
           XSSFRow xssfRow1 = xssfSheet.getRow(0);
           if (xssfRow != null) {
             rowList = new ArrayList();
             Map map = new HashMap();
             totalCells = xssfRow.getLastCellNum();
 
             for (int c = 0; c < totalCells; c++) {
               XSSFCell cell = xssfRow.getCell(c);
               if (cell != null) {
                 map.put(getXValue(xssfRow1.getCell(c)).trim(), getXValue(cell).trim());
               }
               if (cell == null) {
                 map.put(getXValue(xssfRow1.getCell(c)).trim(), "");
                 rowList.add("");
               }
               else {
                 rowList.add(getXValue(cell).trim());
               }
             }
             list.add(rowList);
             maps.add(map);
           }
         }
       }
       return maps;
     }
     catch (IOException e)
     {
       e.printStackTrace();
     } finally {
       try {
         input.close();
       } catch (IOException e) {
         e.printStackTrace();
       }
     }
     return null;
   }
 
   public List<Map<String, Object>> readXls(MultipartFile file)
   {
     List list = new ArrayList();
     List maps = new ArrayList();
 
     InputStream input = null;
     HSSFWorkbook wb = null;
     ArrayList rowList = null;
     try {
       input = file.getInputStream();
 
       wb = new HSSFWorkbook(input);
 
       for (int numSheet = 0; numSheet < wb.getNumberOfSheets(); numSheet++) {
         HSSFSheet hssfSheet = wb.getSheetAt(numSheet);
         if (hssfSheet == null) {
           continue;
         }
         this.totalRows = hssfSheet.getLastRowNum();
         totalCells = hssfSheet.getRow(0).getLastCellNum();
 
         for (int rowNum = 1; rowNum <= this.totalRows; rowNum++)
         {
           HSSFRow hssfRow1 = hssfSheet.getRow(0);
           HSSFRow hssfRow = hssfSheet.getRow(rowNum);
           if (hssfRow != null) {
             rowList = new ArrayList();
             Map map = new HashMap();
 
             for (int c = 0; c < totalCells; c++) {
               HSSFCell cell = hssfRow.getCell(c);
               if (cell != null) {
                 map.put(getHValue(hssfRow1.getCell(c)).trim(), getHValue(cell).trim());
               }
               if (cell == null) {
                 map.put(getHValue(hssfRow1.getCell(c)).trim(), "");
                 rowList.add("");
               }
               else {
                 rowList.add(getHValue(cell).trim());
               }
             }
             maps.add(map);
             list.add(rowList);
           }
         }
       }
       return maps;
     }
     catch (IOException e)
     {
       e.printStackTrace();
     } finally {
       try {
         input.close();
       } catch (IOException e) {
         e.printStackTrace();
       }
     }
     return null;
   }
 
   public static String getPostfix(String path)
   {
     if ((path == null) || ("".equals(path.trim()))) {
       return "";
     }
     if (path.contains(".")) {
       return path.substring(path.lastIndexOf(".") + 1, path.length());
     }
     return "";
   }
 
   public static String getHValue(HSSFCell hssfCell)
   {
     if (hssfCell.getCellType() == 4)
       return String.valueOf(hssfCell.getBooleanCellValue());
     if (hssfCell.getCellType() == 0) {
       String cellValue = "";
       if (HSSFDateUtil.isCellDateFormatted(hssfCell)) {
         Date date = HSSFDateUtil.getJavaDate(hssfCell.getNumericCellValue());
         cellValue = sdf.format(date);
       } else {
         DecimalFormat df = new DecimalFormat("#.##");
         cellValue = df.format(hssfCell.getNumericCellValue());
         String strArr = cellValue.substring(cellValue.lastIndexOf(".") + 1, cellValue.length());
         if (strArr.equals("00")) {
           cellValue = cellValue.substring(0, cellValue.lastIndexOf("."));
         }
       }
       return cellValue;
     }
     return String.valueOf(hssfCell.getStringCellValue());
   }
 
   public static String getXValue(XSSFCell xssfCell)
   {
     if (xssfCell.getCellType() == 4)
       return String.valueOf(xssfCell.getBooleanCellValue());
     if (xssfCell.getCellType() == 0) {
       String cellValue = "";
       if (DateUtil.isCellDateFormatted(xssfCell)) {
         Date date = DateUtil.getJavaDate(xssfCell.getNumericCellValue());
         cellValue = sdf.format(date);
       } else {
         DecimalFormat df = new DecimalFormat("#.##");
         cellValue = df.format(xssfCell.getNumericCellValue());
         String strArr = cellValue.substring(cellValue.lastIndexOf(".") + 1, cellValue.length());
         if (strArr.equals("00")) {
           cellValue = cellValue.substring(0, cellValue.lastIndexOf("."));
         }
       }
       return cellValue;
     }
     return String.valueOf(xssfCell.getStringCellValue());
   }
 }

