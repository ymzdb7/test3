 package com.myoa.service.file.impl;
 
 import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.file.FileContentMapper;
import com.myoa.dao.file.FileSortMapper;
import com.myoa.model.department.Department;
import com.myoa.model.enclosure.Attachment;
import com.myoa.model.file.FileContentModel;
import com.myoa.model.file.FileSortModel;
import com.myoa.model.users.Users;
import com.myoa.service.enclosure.EnclosureService;
import com.myoa.service.enclosure.impl.EnclosureServiceImplDemo;
import com.myoa.service.file.FileContentService;
import com.myoa.service.file.FileSortService;
import com.myoa.service.users.UsersService;
import com.myoa.util.Constant;
import com.myoa.util.DateFormat;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ModuleEnum;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;
import com.myoa.util.netdisk.ZipUtils;
import com.myoa.util.treeUtil.CheckTree;
import com.myoa.util.treeUtil.FileCommSortTreeUtil;
import com.myoa.util.treeUtil.TreeNode;

 import java.io.BufferedInputStream;
 import java.io.BufferedOutputStream;
 import java.io.File;
 import java.io.FileInputStream;
 import java.io.FileNotFoundException;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import java.io.OutputStream;
 import java.io.PrintStream;
 import java.io.UnsupportedEncodingException;
 import java.math.BigDecimal;
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.HashMap;
 import java.util.Hashtable;
 import java.util.Iterator;
 import java.util.LinkedList;
 import java.util.List;
 import java.util.Map;
 import java.util.ResourceBundle;
 import java.util.UUID;
 import java.util.zip.ZipEntry;
 import java.util.zip.ZipOutputStream;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
 
 @Service
 public class FileContentServiceImpl
   implements FileContentService
 {
 
   @Resource
   private FileContentMapper file_ContentMapper;
 
   @Resource
   private FileSortMapper fileSortMapper;
 
   @Resource
   private EnclosureServiceImplDemo demo;
 
   @Resource
   private EnclosureService enclosureService;
 
   @Resource
   private FileSortService fileSortService;
 
   @Resource
   private DepartmentMapper departmentMapper;
 
   @Resource
   private UsersService usersService;
 
   public int deleteBySortId(int sort_id)
   {
     return this.file_ContentMapper.deleteBySort_id(sort_id);
   }
 
   public List<FileContentModel> getFileConBySortid(int tempNo, HttpServletRequest request)
   {
     int sortType = Integer.parseInt(String.valueOf(request.getAttribute("sortType") == null ? "0" : request.getAttribute("sortType")));
     int sortMode = Integer.parseInt(String.valueOf(request.getAttribute("sortMode") == null ? "0" : request.getAttribute("sortMode")));
 
     Map mapValue = new HashMap();
     mapValue.put("tempNo", Integer.valueOf(tempNo));
 
     String sortSqlString = null;
     if (sortType == 1) {
       if (sortMode == 1)
         sortSqlString = " order by SEND_TIME  desc";
       else if (sortMode == 2)
         sortSqlString = " order by SEND_TIME  asc";
       else
         sortSqlString = "order by CONTENT_NO asc";
     }
     else if (sortType == 2) {
       if (sortMode == 1)
         sortSqlString = " order by CONTENT_NO  desc";
       else if (sortMode == 2)
         sortSqlString = " order by CONTENT_NO asc";
       else
         sortSqlString = "order by CONTENT_NO asc";
     }
     else {
       sortSqlString = "order by CONTENT_NO asc";
     }
     String userId = request.getSession().getAttribute("userId").toString();
     mapValue.put("sortSqlString", sortSqlString);
     mapValue.put("userId", userId);
     List<FileContentModel> FileContentList = this.file_ContentMapper.getFileConBySortid(mapValue);
     for (FileContentModel fcm : FileContentList) {
       String temp = fcm.getSendTime().substring(0, 19);
       fcm.setSendTime(temp);
       fcm.setReaders(readerFlag(userId, fcm.getReaders()));
     }
     return FileContentList;
   }
 
   public static String readerFlag(String userId, String readers)
   {
     if ((readers != null) && (!"".equals(readers))) {
       String[] readersStrings = readers.split(",");
       List userList = Arrays.asList(readersStrings);
       if (userList.contains(userId)) {
         return "1";
       }
       return "0";
     }
 
     return "0";
   }
 
   public FileContentModel getFileConByContentId(String contentId, HttpServletRequest request)
   {
     FileContentModel fc = this.file_ContentMapper.getFileConByContentId(contentId);
     String temp = "";
     if (fc.getSendTime() != null) {
       temp = fc.getSendTime().substring(0, 19);
     }
     fc.setSendTime(temp);
     String userID = request.getSession().getAttribute("userId").toString();
     if ("0".equals(readerFlag(userID, fc.getReaders()))) {
       FileContentModel fcm = new FileContentModel();
       fcm.setContentId(fc.getContentId());
       if (fc.getReaders() != null)
         fcm.setReaders(new StringBuilder().append(fc.getReaders()).append(userID).append(",").toString());
       else {
         fcm.setReaders(new StringBuilder().append(userID).append(",").toString());
       }
       this.file_ContentMapper.updateFileCon(fcm);
     }
     return fc;
   }
 
   public int saveContent(FileContentModel fileContentModel)
   {
     return this.file_ContentMapper.saveContent(fileContentModel);
   }
 
   public int deleteByConId(Map<String, Object> fileConMap)
   {
     return this.file_ContentMapper.deleteByConId(fileConMap);
   }
 
   public int updateFileCon(FileContentModel fcm)
   {
     System.out.println(new StringBuilder().append("--").append(fcm.getContent()).toString());
     return this.file_ContentMapper.updateFileCon(fcm);
   }
 
   public BaseWrapper batchDeleteConId(Integer[] conId) {
     BaseWrapper wrapper = new BaseWrapper();
     if ((conId == null) || (conId.length < 1)) {
       wrapper.setMsg("无效的请求参数");
       wrapper.setStatus(true);
       wrapper.setFlag(false);
       return wrapper;
     }
     int res = this.file_ContentMapper.batchDeleteConId(conId);
     if (res > 0) {
       wrapper.setMsg("请求成功");
       wrapper.setStatus(true);
       wrapper.setFlag(true);
     }
     else {
       wrapper.setMsg("操作失败");
       wrapper.setStatus(true);
       wrapper.setFlag(false);
     }
     return wrapper;
   }
 
   public BaseWrappers queryBySearchValue(HttpServletRequest req, Integer sortId, Integer sortType, String subjectName, String[] creater, Integer contentNo, String contentValue1, String contentValue2, String contentValue3, String atiachmentDesc, String atiachmentName, String atiachmentCont, String crStartDate, String crEndDate, Integer pageNo, Integer pageSize)
   {
     BaseWrappers wrappers = new BaseWrappers();
     wrappers.setFlag(false);
     wrappers.setStatus(true);
     List<FileContentModel> datas = new ArrayList();
     if (pageNo == null) {
       pageNo = Integer.valueOf(0);
     }
     StringBuffer createrArray = null;
     String createrArrayStr = null;
     if ((creater != null) && (creater.length > 0)) {
       createrArray = new StringBuffer();
       for (String value : creater) {
         createrArray.append(value);
         createrArray.append(",");
       }
       createrArrayStr = createrArray.toString();
     }
     if (StringUtils.checkNull(subjectName).booleanValue()) {
       subjectName = null;
     }
     if (StringUtils.checkNull(contentValue1).booleanValue()) {
       contentValue1 = null;
     }
     if (StringUtils.checkNull(contentValue2).booleanValue()) {
       contentValue2 = null;
     }
     if (StringUtils.checkNull(contentValue3).booleanValue()) {
       contentValue3 = null;
     }
     if (StringUtils.checkNull(atiachmentDesc).booleanValue())
       atiachmentDesc = null;
     if (StringUtils.checkNull(atiachmentName).booleanValue())
       atiachmentName = null;
     if (StringUtils.checkNull(atiachmentCont).booleanValue()) {
       atiachmentCont = null;
     }
     if (StringUtils.checkNull(crStartDate).booleanValue()) {
       crStartDate = null;
     }
     if (StringUtils.checkNull(crEndDate).booleanValue()) {
       crEndDate = null;
     }
     if ((sortId.intValue() == 0) && (sortType.intValue() == 4))
       datas = this.file_ContentMapper.rootqueryBySearchValue(sortId, subjectName, createrArrayStr, contentNo, contentValue1, contentValue2, contentValue3, atiachmentDesc, atiachmentName, atiachmentCont, crStartDate, crEndDate, pageNo, pageSize);
     else {
       datas = this.file_ContentMapper.queryBySearchValue(sortId, sortType, subjectName, createrArrayStr, contentNo, contentValue1, contentValue2, contentValue3, atiachmentDesc, atiachmentName, atiachmentCont, crStartDate, crEndDate, pageNo, pageSize);
     }
     for (FileContentModel fc : datas) {
       List attachmentList = new ArrayList();
       if ((fc.getAttachmentName() != null) && (!"".equals(fc.getAttachmentName()))) {
         attachmentList = GetAttachmentListUtil.returnAttachment(fc.getAttachmentName(), fc.getAttachmentId(), new StringBuilder().append(Constant.MYOA).append((String)req.getSession().getAttribute("loginDateSouse")).toString(), "file_folder");
       }
       fc.setSendTime(fc.getSendTime().substring(0, 19));
       fc.setAttachmentList(attachmentList);
     }
     if (datas.size() > 0) {
       wrappers.setDatas(datas);
       wrappers.setFlag(true);
       wrappers.setMsg("获取数据成功");
     } else {
       wrappers.setFlag(false);
       wrappers.setMsg("查询无结果");
     }
     return wrappers;
   }
 
   public BaseWrapper copyAndParse(Integer copyId, Integer witchSortId)
   {
     BaseWrapper wrapper = new BaseWrapper();
     wrapper.setFlag(false);
     wrapper.setStatus(true);
     wrapper.setMsg("操作失败");
 
     if (copyId == null) {
       return wrapper;
     }
     FileContentModel fileContentModel = this.file_ContentMapper.selectFileById(copyId);
     if (fileContentModel != null)
     {
       if (witchSortId == null) {
         wrapper.setMsg("无效的复制路径");
         return wrapper;
       }
 
       if (witchSortId.intValue() != 0) {
         FileSortModel sortModel = this.fileSortMapper.getNowFileSortAuth(witchSortId);
         if (sortModel == null) {
           wrapper.setMsg("无效的复制路径");
           return wrapper;
         }
       }
       fileContentModel.setSortId(witchSortId);
       fileContentModel.setContentId(null);
       int res = this.file_ContentMapper.saveContent(fileContentModel);
       if (res > 0) {
         wrapper.setFlag(true);
         wrapper.setStatus(true);
         wrapper.setMsg("操作成功");
       } else {
         wrapper.setFlag(false);
         wrapper.setStatus(true);
         wrapper.setMsg("操作失败");
       }
     } else {
       return wrapper;
     }
 
     return wrapper;
   }
 
   public ToJson contentCut(HttpServletRequest req, String[] contentId)
   {
     ToJson tojson = new ToJson();
     String sortId = req.getParameter("sortId");
 
     if ((contentId.length == 0) || (sortId == null) || ("".equals(sortId))) {
       tojson.setFlag(1);
       tojson.setMsg("参数错误");
       return tojson;
     }
     Map map = new HashMap();
     map.put("sortId", sortId);
     map.put("contentId", contentId);
     int result = this.file_ContentMapper.contentCut(sortId, contentId);
     if (result == contentId.length) {
       tojson.setFlag(0);
       tojson.setMsg("修改成功");
     } else {
       tojson.setFlag(1);
       tojson.setMsg("修改失败");
     }
     return tojson;
   }
 
   public BaseWrappers uploadFile(MultipartFile[] files, HttpServletRequest request)
   {
     BaseWrappers baseWrappers = new BaseWrappers();
     baseWrappers.setFlag(false);
     baseWrappers.setMsg("操作失败");
     int a = 0;
     try {
       String company = (String)request.getSession().getAttribute("loginDateSouse");
 
       if (company != null)
         company = new StringBuilder().append(Constant.MYOA).append(company).toString();
       else {
         company = "xoa1001";
       }
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       if ((users != null) && (users.getUserId() != null)) {
         List<Attachment> list = this.enclosureService.upload(files, company, "file_folder");
         if ((list != null) && (list.size() > 0)) {
           for (Attachment attachment : list) {
             FileContentModel fileContentModel = new FileContentModel();
             Integer sort = Integer.valueOf(Integer.parseInt(request.getParameter("sortId")));
             if (sort.intValue() != 0) {
               FileSortModel file1 = new FileSortModel();
               file1.setSortId(sort);
               FileSortModel fileSortModel = this.fileSortService.getFileSortBySortIds(file1);
               if ("5".equals(fileSortModel.getSortType())) {
                 double filerSize = 0.0D;
                 if (!StringUtils.checkNull(attachment.getFileSize()).booleanValue()) {
                   if (attachment.getFileSize().indexOf("MB") != -1) {
                     String file = attachment.getFileSize().replace("MB", "");
                     double size = Double.valueOf(file).doubleValue();
                     filerSize += size;
                   } else if (attachment.getFileSize().indexOf("KB") != -1) {
                     String file = attachment.getFileSize().replace("KB", "");
                     double size = Double.valueOf(file).doubleValue();
                     double sizeFile = ZipUtils.getM(size);
                     BigDecimal b = new BigDecimal(sizeFile);
                     double f1 = b.setScale(2, 4).doubleValue();
                     filerSize += f1;
                   } else if (attachment.getFileSize().indexOf("B") != -1) {
                     String file = attachment.getFileSize().replace("B", "");
                     double size = Double.valueOf(file).doubleValue();
                     double sizeFile = ZipUtils.getKB(size);
                     double sizeFile1 = ZipUtils.getM(sizeFile);
                     BigDecimal b = new BigDecimal(sizeFile1);
                     double f1 = b.setScale(2, 4).doubleValue();
                     filerSize += f1;
                   }
                 }
 
                 if (sort.intValue() != 0) {
                   StringBuffer stringBuffer = new StringBuffer();
                   FileSortModel file = new FileSortModel();
                   file.setSortId(sort);
                   List<FileSortModel> FileSortModels = getfilesDeleteList(file);
 
                   FileSortModels.add(fileSortModel);
 
                   for (FileSortModel treeNode : FileSortModels) {
                     stringBuffer.append(treeNode.getSortId());
                     if (FileSortModels.size() > 1) {
                       stringBuffer.append(",");
                     }
                   }
 
                   List fileContentModels = new ArrayList();
                   String sortId = "";
                   if (!StringUtils.checkNull(stringBuffer.toString()).booleanValue()) {
                     if (FileSortModels.size() > 1)
                       sortId = stringBuffer.substring(0, stringBuffer.length() - 1);
                     else {
                       sortId = stringBuffer.toString();
                     }
                     fileContentModels = selectFileSortList(sortId);
                   }
                   double fileListSize = 0.0D;
                   for (int i = 0; i < fileContentModels.size(); i++) {
                     fileListSize += Double.parseDouble(((FileContentModel)fileContentModels.get(i)).getFileSize());
                   }
                   BaseWrapper bassWrapper = this.fileSortService.getFileAuthBySortId(sort, request);
                   if ((bassWrapper != null) && 
                     (bassWrapper.getData() != null) && ((bassWrapper.getData() instanceof FileSortModel))) {
                     FileSortModel model = (FileSortModel)bassWrapper.getData();
                     if (!StringUtils.checkNull(String.valueOf(model.getSpaceLimit())).booleanValue())
                     {
                       double size = Double.valueOf(model.getSpaceLimit().intValue()).doubleValue();
                       if ((fileListSize + filerSize >= size) && (size != 0.0D))
                       {
                         baseWrappers.setStatus(true);
                         baseWrappers.setFlag(false);
                         baseWrappers.setMsg("文件已经到最大容量");
                         return baseWrappers;
                       }
                     }
                   }
 
                 }
 
                 fileContentModel.setFileSize(String.valueOf(filerSize));
               }
             }
 
             String subjectName = attachment.getAttachName();
 
             fileContentModel.setAttachmentId(new StringBuilder().append(attachment.getAid()).append("@").append(attachment.getYm()).append("_").append(attachment.getAttachId()).append(",").toString());
             fileContentModel.setSortId(Integer.valueOf(Integer.parseInt(request.getParameter("sortId"))));
             fileContentModel.setAttachmentName(new StringBuilder().append(subjectName).append("*").toString());
             fileContentModel.setSubject(subjectName.substring(0, subjectName.lastIndexOf(".")));
             fileContentModel.setContentNo("0");
             fileContentModel.setCreater(users.getUserId());
             fileContentModel.setSendTime(DateFormat.getCurrentTime());
 
             a += this.file_ContentMapper.saveContent(fileContentModel);
             if (a > 0) {
               baseWrappers.setStatus(true);
               baseWrappers.setFlag(true);
               baseWrappers.setMsg("上传成功");
             } else {
               baseWrappers.setStatus(true);
               baseWrappers.setFlag(true);
               baseWrappers.setMsg("上传成功，保存失败");
             }
           }
         }
         else {
           baseWrappers.setStatus(false);
           baseWrappers.setMsg("上传失败");
           return baseWrappers;
         }
       } else {
         return baseWrappers;
       }
     }
     catch (Exception e) {
       e.printStackTrace();
       baseWrappers.setStatus(false);
       baseWrappers.setMsg("文件异常");
       return baseWrappers;
     }
 
     return baseWrappers;
   }
 
   public BaseWrapper newFileInBox(String fileType, String path)
   {
     BaseWrapper wrapper = new BaseWrapper();
     String fileName = UUID.randomUUID().toString();
     try {
       File file = new File(new StringBuilder().append(path).append("/").append(fileName).append(".").append(fileType).toString());
       if (!file.exists())
       {
         file.createNewFile();
       }
 
       Attachment rets = this.demo.upload(file, "xoa1001", "model");
 
       wrapper.setData(rets);
       wrapper.setStatus(true);
       wrapper.setFlag(true);
     }
     catch (Exception e)
     {
       e.printStackTrace();
     }
 
     return wrapper;
   }
 
   public ToJson<?> downFileContent(HttpServletRequest request, HttpServletResponse response, String[] cIds)
   {
     ToJson tojson = new ToJson();
     String sortName = request.getParameter("sortName");
     if (("".equals(sortName)) || (sortName == null)) {
       sortName = "null";
     }
 
     String company = new StringBuilder().append(Constant.MYOA).append((String)request.getSession().getAttribute("loginDateSouse")).toString();
     String reqPath = request.getRealPath("/");
     String basePath = new StringBuilder().append(reqPath).append("tempFile").append(File.separator).toString();
     String allPath = new StringBuilder().append(reqPath).append("tempFile").append(File.separator).append(sortName).append(File.separator).toString();
     for (int i = 0; i < cIds.length; i++)
     {
       FileContentModel fileContentModel = this.file_ContentMapper.getFileConByContentId(cIds[i]);
 
       String contentPath = new StringBuilder().append(allPath).append(fileContentModel.getSubject()).append(File.separator).append(fileContentModel.getSubject()).append(".html").toString();
 
       String attPath = new StringBuilder().append(allPath).append(fileContentModel.getSubject()).append(File.separator).append("附件").append(File.separator).toString();
       createDir(contentPath);
       createDir(attPath);
 
       StringBuilder cententString = new StringBuilder("<html><head><title>");
       cententString.append(fileContentModel.getSubject());
       cententString.append("<head><style>body{font-size:12px;} table{border:1px #000 solid;border-collapse:collapse;} table td{border:1px #000 solid;}</style><body><table width='70%' align='center'><tr><td align='center' colspan='2'><b><span class='big'>");
       cententString.append(fileContentModel.getSubject());
       cententString.append("&nbsp;<b><tr><tr><td height='250' valign='top' colspan='2'>");
       cententString.append(fileContentModel.getContent());
       cententString.append("&nbsp;<tr><tr class=small><td width='100'>创建人：</td><td width='400'>");
       cententString.append(fileContentModel.getCreater());
       cententString.append("&nbsp;<tr><body></html>");
       writeContent(cententString, contentPath);
 
       if ((fileContentModel.getAttachmentId() == null) || ("".equals(fileContentModel.getAttachmentId())))
         continue;
       String[] ids = fileContentModel.getAttachmentId().split(",");
       for (int a = 0; a < ids.length; a++) {
         Attachment att = null;
         StringBuilder sysPath = getPath();
         try {
           att = this.enclosureService.findByAttachId(Integer.parseInt(ids[a].split("_")[1]));
           sysPath.append(getLessPath(att, company));
         } catch (Exception e) {
           e.printStackTrace();
           tojson.setFlag(1);
           tojson.setMsg(new StringBuilder().append("文件\"").append(fileContentModel.getSubject()).append("\"获取附件信息失败！").toString());
           File filefolder = new File(new StringBuilder().append(basePath).append(File.separator).append(sortName).append(File.separator).toString());
           deleteFile(filefolder);
           return tojson;
         }
 
         boolean flag = copy(sysPath.toString(), attPath);
 
         if (!flag) {
           tojson.setFlag(1);
           tojson.setMsg(new StringBuilder().append("文件\"").append(fileContentModel.getSubject()).append("\"附件以损坏！").toString());
           File filefolder = new File(new StringBuilder().append(basePath).append(File.separator).append(sortName).append(File.separator).toString());
           deleteFile(filefolder);
           return tojson;
         }
       }
     }
     try
     {
       doZip(allPath, new StringBuilder().append(basePath).append(File.separator).append(sortName).append(".zip").toString());
       tojson.setFlag(1);
       tojson.setMsg("文件压缩成功 但未下载成功");
       Boolean flag = down(new StringBuilder().append(basePath).append(File.separator).append(sortName).append(".zip").toString(), response, new StringBuilder().append(sortName).append(".zip").toString());
       if (flag.booleanValue()) {
         tojson.setFlag(0);
         tojson.setMsg("文件压缩成功 下载成功");
         File filefolder = new File(new StringBuilder().append(basePath).append(File.separator).append(sortName).append(File.separator).toString());
         deleteFile(filefolder);
         File file = new File(new StringBuilder().append(basePath).append(File.separator).append(sortName).append(".zip").toString());
         deleteFile(file);
       }
       return tojson;
     } catch (UnsupportedEncodingException e) {
       e.printStackTrace();
       L.a(new Object[] { "文件下载编码错误！" });
       tojson.setFlag(1);
       tojson.setMsg("文件下载编码错误！");
       return tojson;
     } catch (IOException e) {
       e.printStackTrace();
       L.a(new Object[] { "压缩文件失败！" });
       tojson.setFlag(1);
       tojson.setMsg("文件压缩获取失败");
     }return tojson;
   }
 
   private static Boolean down(String string, HttpServletResponse response, String stringName) throws UnsupportedEncodingException {
     response.setCharacterEncoding("utf-8");
 
     response.setContentType("multipart/form-data");
     byte[] bytes = stringName.getBytes("UTF-8");
     stringName = new String(bytes, "ISO-8859-1");
     response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", new Object[] { stringName }));
     try
     {
       InputStream inputStream = new FileInputStream(new File(string));
       OutputStream os = response.getOutputStream();
       byte[] b = new byte[2048];
       int length;
       while ((length = inputStream.read(b)) > 0) {
         os.write(b, 0, length);
       }
       os.flush();
       os.close();
       inputStream.close();
       return Boolean.valueOf(true);
     } catch (FileNotFoundException e) {
       e.printStackTrace();
       return Boolean.valueOf(false);
     } catch (IOException e) {
       e.printStackTrace();
     }return Boolean.valueOf(false);
   }
 
   public static void deleteFile(File file)
   {
     if (file.isFile()) {
       file.delete();
       return;
     }
     File[] fileList = file.listFiles();
     for (int i = 0; (fileList != null) && (i < fileList.length); i++) {
       deleteFile(fileList[i]);
     }
     file.delete();
   }
 
   private StringBuffer getLessPath(Attachment att, String company)
   {
     StringBuffer lessPath = new StringBuffer();
     String moduleID = null;
     for (ModuleEnum em : ModuleEnum.values()) {
       if (att.getModule().byteValue() == em.getIndex()) {
         moduleID = em.getName();
       }
     }
     lessPath.append(File.separator);
     lessPath.append("attach");
     lessPath.append(File.separator);
     lessPath.append(company);
     lessPath.append(File.separator);
     lessPath.append(moduleID);
     lessPath.append(File.separator);
     lessPath.append(att.getYm());
     lessPath.append(File.separator);
     lessPath.append(att.getAttachId());
     lessPath.append(".");
     lessPath.append(att.getAttachName());
     return lessPath;
   }
 
   public static StringBuilder getPath()
   {
     ResourceBundle rb = ResourceBundle.getBundle("upload");
     String osName = System.getProperty("os.name");
     StringBuilder sb = new StringBuilder();
     if (osName.toLowerCase().startsWith("win"))
       sb = sb.append(rb.getString("upload.win"));
     else {
       sb = sb.append(rb.getString("upload.linux"));
     }
     return sb;
   }
 
   private static void createDir(String filePath)
   {
     for (int i = filePath.length() - 1; i >= 0; i--) {
       if ((filePath.charAt(i) == '/') || (filePath.charAt(i) == '\\')) {
         File file = new File(filePath.substring(0, i));
         file.mkdirs();
         break;
       }
       if (filePath.charAt(i) == '.') {
         String fileName = filePath.substring(filePath.lastIndexOf(File.separator) + 1, filePath.length());
         String directory = filePath.substring(0, filePath.lastIndexOf(File.separator) + 1);
         System.out.println(new StringBuilder().append("---").append(fileName).append("-----").append(directory).toString());
         File f = new File(directory, fileName);
         if (f.exists())
         {
           System.out.println(f.getAbsolutePath());
           System.out.println(f.getName());
           System.out.println(f.length());
         }
         else {
           f.getParentFile().mkdirs();
           try
           {
             f.createNewFile();
           } catch (IOException e) {
             System.out.println("创建新文件时出现了错误。。。");
             e.printStackTrace();
           }
         }
       }
     }
   }
 
   public static Boolean writeContent(StringBuilder cententString, String contentPath)
   {
     File file = new File(contentPath);
     try {
       if (file.exists()) {
         FileOutputStream aa = new FileOutputStream(file);
         PrintStream ps = new PrintStream(aa);
         ps.println(cententString);
         ps.close();
         aa.close();
       }
       return Boolean.valueOf(false);
     } catch (Exception e) {
       e.printStackTrace();
     }return Boolean.valueOf(false);
   }
 
   public static boolean copy(String from, String to)
   {
     File fromFile = new File(from);
     if ((!fromFile.exists()) || (!fromFile.isFile())) {
       return false;
     }
     File toFileDirectory = new File(to);
 
     if (!toFileDirectory.exists()) {
       toFileDirectory.mkdirs();
     }
 
     FileInputStream input = null;
     FileOutputStream output = null;
     byte[] b = new byte[1024];
     int i = 0;
     try {
       if (fromFile.exists())
         input = new FileInputStream(fromFile);
       else {
         L.a(new Object[] { "该文件不存在或者路径不对！" });
       }
       output = new FileOutputStream(new File(new StringBuilder().append(to).append("/").append(fromFile.getName()).toString()));
 
       while ((i = input.read(b)) != -1) {
         output.write(b, 0, i);
       } 
       return  i == 1;
     }
     catch (FileNotFoundException e)
     {
       e.printStackTrace(); 
       return false;
     }
     catch (IOException e)
     {
       e.printStackTrace(); 
       return false;
     }
     finally
     {
       try
       {
         input.close();
       } catch (IOException e) {
         e.printStackTrace();
       }
       try {
         output.close();
       } catch (IOException e) {
         e.printStackTrace(); 
       }
     }
   }
 
   public File doZip(String sourceDir, String zipFilePath)
     throws IOException
   {
     File file = new File(sourceDir);
     File zipFile = new File(zipFilePath);
     ZipOutputStream zos = null;
     try
     {
       OutputStream os = new FileOutputStream(zipFile);
       BufferedOutputStream bos = new BufferedOutputStream(os);
       zos = new ZipOutputStream(bos);
 
       String basePath = null;
 
       if (file.isDirectory())
         basePath = file.getPath();
       else {
         basePath = file.getParent();
       }
 
       zipFile(file, basePath, zos);
     } finally {
       if (zos != null) {
         zos.closeEntry();
         zos.close();
       }
     }
 
     return zipFile;
   }
 
   private void zipFile(File source, String basePath, ZipOutputStream zos)
     throws IOException
   {
     File[] files = null;
     if (source.isDirectory()) {
       files = source.listFiles();
     } else {
       files = new File[1];
       files[0] = source;
     }
 
     InputStream is = null;
 
     byte[] buf = new byte[1024];
     int length = 0;
     try {
       for (File file : files)
         if (file.isDirectory()) {
           String pathName = new StringBuilder().append(file.getPath().substring(basePath.length() + 1)).append("/").toString();
           zos.putNextEntry(new ZipEntry(pathName));
           zipFile(file, basePath, zos);
         } else {
           String pathName = file.getPath().substring(basePath.length() + 1);
           is = new FileInputStream(file);
           BufferedInputStream bis = new BufferedInputStream(is);
           zos.putNextEntry(new ZipEntry(pathName));
           while ((length = bis.read(buf)) > 0)
             zos.write(buf, 0, length);
         }
     }
     finally
     {
       if (is != null)
         is.close();
     }
   }
 
   public static String getString(Object str)
   {
     if (str == null) {
       return "";
     }
     return String.valueOf(str);
   }
   public static Integer getInteger(Object str) {
     if ((str == null) || ("".equals(str)))
       return Integer.valueOf(0);
     try
     {
       return Integer.valueOf(Integer.parseInt(String.valueOf(str)));
     } catch (Exception e) {
       e.printStackTrace();
     }return Integer.valueOf(0);
   }
 
   public static int getInteger(Object str, int def)
   {
     String s = getString(str);
     int dot = s.indexOf(46);
     if (dot != -1) {
       s = s.substring(0, dot);
     }
     if (!"".equals(s)) {
       try {
         return Integer.parseInt(s);
       } catch (Exception e) {
         e.printStackTrace();
         return def;
       }
     }
     return def;
   }
 
   public ToJson serachAll(Map<String, String> paramMap, HttpServletRequest request)
   {
     ToJson tojson = new ToJson();
     Integer serachType = getInteger(paramMap.get("serachType"));
     String subject = getString(paramMap.get("subject"));
     String keyword1 = getString(paramMap.get("keyword1"));
     String keyword2 = getString(paramMap.get("keyword2"));
     String keyword3 = getString(paramMap.get("keyword3"));
     String content = getString(paramMap.get("content"));
     String begainTime = getString(paramMap.get("begainTime"));
     String endTime = getString(paramMap.get("endTime"));
     String creater = getString(paramMap.get("creater"));
     String attScript = getString(paramMap.get("attScript"));
     String attContain = getString(paramMap.get("attContain"));
     String attName = getString(paramMap.get("attName"));
     String sort_no = getString(paramMap.get("sort_no"));
     Map map = new HashMap();
     map.put("subject", subject);
     map.put("keyword1", keyword1);
     map.put("keyword2", keyword2);
     map.put("keyword3", keyword3);
     map.put("content", content);
     map.put("begainTime", begainTime);
     map.put("endTime", endTime);
     map.put("creater", creater);
     map.put("attScript", attScript);
     map.put("attContain", attContain);
     map.put("attName", attName);
     map.put("sort_no", sort_no);
     switch (serachType.intValue()) {
     case 1:
       List personList = serachPerson(request, map);
       tojson.setObj(personList);
       tojson.setFlag(0);
       break;
     case 2:
       List commonList = serachCommon(request, map);
       tojson.setObj(commonList);
       tojson.setFlag(0);
       break;
     default:
       tojson.setFlag(1);
       tojson.setMsg("参数不对");
     }
 
     return tojson;
   }
 
   public List<FileSortModel> getchildTreePerson(FileSortModel file)
   {
     List parentList = new ArrayList();
     int tempNo = file.getSortId().intValue();
     List<FileSortModel> childrenList = new ArrayList();
     childrenList = this.fileSortService.getSortChrildren(tempNo);
     if (childrenList.size() > 0) {
       for (FileSortModel fs : childrenList) {
         parentList.addAll(getchildTreePerson(fs));
       }
       parentList.addAll(childrenList);
     }
     return parentList;
   }
 
   public List<FileContentModel> serachPerson(HttpServletRequest request, Map<String, Object> map)
   {
     HttpSession session = request.getSession();
     String userId = session.getAttribute("userId").toString();
     String userPriv = session.getAttribute("userPriv").toString();
     String deptId = session.getAttribute("deptId").toString();
     Map maps = new Hashtable();
     maps.put("userId", userId);
     maps.put("userPriv", userPriv);
     maps.put("deptId", deptId);
     List<FileSortModel> rootTree = new LinkedList();
     FileSortModel fs = new FileSortModel();
     fs.setUserId(userId);
     fs.setSortName("根文件夹");
     fs.setSortType("4");
     fs.setSortParent(Integer.valueOf(-1));
     fs.setSortId(Integer.valueOf(0));
 
     FileSortModel fsm = new FileSortModel();
     fsm.setUserId(userId);
     fsm.setSortType("4");
     fsm.setSortParent(Integer.valueOf(0));
     List fList = this.fileSortService.getFileSortList(fsm);
     if (fList == null) {
       fList = new ArrayList();
     }
     rootTree.addAll(fList);
 
     List childTree = new LinkedList();
     for (FileSortModel f : rootTree) {
       if (fsm.getSortParent().intValue() != -1) {
         childTree.addAll(getchildTreePerson(f));
       }
     }
     rootTree.addAll(childTree);
     rootTree.add(fs);
     StringBuffer sortid = new StringBuffer("");
     for (FileSortModel fm : rootTree) {
       sortid.append(fm.getSortId());
       sortid.append(",");
     }
     map.put("sortid", sortid.substring(0, sortid.toString().length() - 1));
     map.put("userId", userId);
     List<FileContentModel> list = this.file_ContentMapper.searchPerson(map);
     for (FileContentModel fc : list) {
       String temp = fc.getSendTime().substring(0, 19);
       fc.setSendTime(temp);
       StringBuffer path = new StringBuffer("");
       getfolderPath(fc.getSortId(), path, null, null);
       fc.setFilePath(path.toString());
       List attachmentList = new ArrayList();
       if ((fc.getAttachmentName() != null) && (!"".equals(fc.getAttachmentName()))) {
         attachmentList = GetAttachmentListUtil.returnAttachment(fc.getAttachmentName(), fc.getAttachmentId(), new StringBuilder().append(Constant.MYOA).append((String)request.getSession().getAttribute("loginDateSouse")).toString(), "file_folder");
       }
       fc.setAttachmentList(attachmentList);
     }
     return list;
   }
 
   public List<FileSortModel> getchildTrees(FileSortModel file, Map<String, Object> map)
   {
     List parentList = new ArrayList();
     int tempNo = file.getSortId().intValue();
     List<FileSortModel> childrenList = new ArrayList();
     childrenList = this.fileSortService.getSortChrildren(tempNo);
     if (childrenList.size() > 0) {
       for (FileSortModel fs : childrenList) {
         parentList.addAll(getchildTrees(fs, map));
       }
       parentList.addAll(childrenList);
     }
     return parentList;
   }
 
   public List<FileContentModel> serachCommon(HttpServletRequest request, Map<String, Object> map)
   {
     HttpSession session = request.getSession();
     String userId = session.getAttribute("userId").toString();
     String userPriv = session.getAttribute("userPriv").toString();
     String deptId = session.getAttribute("deptId").toString();
     Map maps = new Hashtable();
     maps.put("userId", userId);
     maps.put("userPriv", userPriv);
     maps.put("deptId", deptId);
 
     List<FileSortModel> rootTree = new LinkedList();
     Map rootMap = new HashMap();
     int sortid = 0;
     rootMap.put("sortid", Integer.valueOf(sortid));
     rootMap.put("sortType", "5");
     rootTree = this.fileSortService.getRootTree(rootMap);
 
     List childTree = new LinkedList();
 
     for (FileSortModel fsm : rootTree) {
       childTree.addAll(getchildTrees(fsm, map));
     }
     rootTree.addAll(childTree);
     Iterator iteratorChr = rootTree.iterator();
     while (iteratorChr.hasNext()) {
       FileSortModel fsm = (FileSortModel)iteratorChr.next();
 
       if (!CheckTree.checkAll(fsm.getUserId() == null ? "" : fsm.getUserId(), maps)) {
         iteratorChr.remove();
       }
     }
     StringBuffer sortids = new StringBuffer("");
     for (FileSortModel fm : rootTree) {
       sortids.append(fm.getSortId());
       sortids.append(",");
     }
     map.put("sortid", sortids.toString().substring(0, sortids.toString().length() - 1));
     List<FileContentModel> list = this.file_ContentMapper.serachCommon(map);
     for (FileContentModel fc : list) {
       String temp = fc.getSendTime().substring(0, 19);
       fc.setSendTime(temp);
       StringBuffer path = new StringBuffer("");
 
       Map mapPriv = new HashMap();
 
       getfolderPath(fc.getSortId(), path, mapPriv, maps);
       fc.setMapPriv(mapPriv);
       fc.setFilePath(path.toString());
       List attachmentList = new ArrayList();
       if ((fc.getAttachmentName() != null) && (!"".equals(fc.getAttachmentName()))) {
         attachmentList = GetAttachmentListUtil.returnAttachment(fc.getAttachmentName(), fc.getAttachmentId(), new StringBuilder().append(Constant.MYOA).append((String)request.getSession().getAttribute("loginDateSouse")).toString(), "file_folder");
       }
       fc.setAttachmentList(attachmentList);
     }
     return list;
   }
 
   public void getfolderPath(Integer integer, StringBuffer path, Map<String, Object> mapPriv, Map<String, Object> maps) {
     if ((integer.intValue() != 0) && (integer != null)) {
       FileSortModel pathFolder = this.fileSortMapper.getfolderPath(integer);
       if (pathFolder != null) {
         if ((mapPriv != null) && (maps != null))
         {
           mapPriv.put("USER_ID", Integer.valueOf(CheckTree.checkAll(pathFolder.getUserId(), maps) == true ? 1 : 0));
 
           mapPriv.put("NEW_USER", Integer.valueOf(CheckTree.checkAll(pathFolder.getNewUser(), maps) == true ? 1 : 0));
 
           mapPriv.put("MANAGE_USER", Integer.valueOf(CheckTree.checkAll(pathFolder.getManagerUser(), maps) == true ? 1 : 0));
 
           mapPriv.put("DEL_USER", Integer.valueOf(CheckTree.checkAll(pathFolder.getDelUser(), maps) == true ? 1 : 0));
 
           mapPriv.put("DOWN_USER", Integer.valueOf(CheckTree.checkAll(pathFolder.getDownUser(), maps) == true ? 1 : 0));
 
           mapPriv.put("SIGN_USER", Integer.valueOf(CheckTree.checkAll(pathFolder.getSignUser(), maps) == true ? 1 : 0));
 
           mapPriv.put("REVIEW", Integer.valueOf(CheckTree.checkAll(pathFolder.getReview(), maps) == true ? 1 : 0));
 
           mapPriv.put("OWNER", Integer.valueOf(CheckTree.checkAll(pathFolder.getOwner(), maps) == true ? 1 : 0));
         }
         path.insert(0, pathFolder.getSortName());
         path.insert(0, "/");
         if (pathFolder.getSortParent().intValue() != 0)
           getfolderPath(pathFolder.getSortParent(), path, null, null);
       }
     }
     else {
       path.insert(0, "根文件夹");
       path.insert(0, "/");
     }
   }
 
   public ToJson signConState(Map<String, String> paramMap, HttpServletRequest request)
   {
     ToJson tojson = new ToJson();
     String contentId = getString(paramMap.get("contentId"));
     FileContentModel fileContentModel = this.file_ContentMapper.getFileConByContentId(contentId);
     if (fileContentModel == null) {
       tojson.setFlag(1);
       tojson.setMsg("没有这个文件");
       return tojson;
     }
     FileSortModel fs = new FileSortModel();
     fs.setSortId(fileContentModel.getSortId());
     FileSortModel tempFile = this.fileSortMapper.getOne(fs);
     if (tempFile == null) {
       tojson.setFlag(1);
       tojson.setMsg("没有这个文夹");
       return tojson;
     }
     List<Users> unReadList = new ArrayList();
     List<Users> readList = new ArrayList();
     String signUser = tempFile.getUserId();
     Map mapUser = checkUser(signUser);
     if (mapUser != null) {
       if ("AllDeptId".equals(mapUser.get("dept_id")))
         unReadList = this.usersService.selectFileUserSignerAll();
       else
         unReadList = this.usersService.selectFileUserSigner(mapUser);
     }
     if (unReadList.size() > 0) {
       Iterator userIt = unReadList.iterator();
       while (userIt.hasNext()) {
         Users type = (Users)userIt.next();
         String[] readers = fileContentModel.getReaders().split(",");
         List List = Arrays.asList(readers);
         if (List.contains(type.getUserId())) {
           readList.add(type);
           userIt.remove();
           continue;
         }
       }
     }
     List resultList = new ArrayList();
     List<Department> departmentList = this.departmentMapper.getDatagrid();
 
     for (Department department : departmentList) {
       StringBuffer stringBuffer = new StringBuffer();
       for (Users users : unReadList) {
         Integer depId = users.getDeptId();
         if (department.getDeptId().equals(depId)) {
           stringBuffer.append(users.getUserName());
           stringBuffer.append(",");
         }
       }
       department.setUnread(stringBuffer.toString());
       StringBuffer stringBuffer1 = new StringBuffer();
       for (Users users : readList) {
         Integer depId = users.getDeptId();
         if (department.getDeptId().equals(depId)) {
           stringBuffer1.append(users.getUserName());
           stringBuffer1.append(",");
         }
       }
       department.setRead(stringBuffer1.toString());
     }
     tojson.setObj(departmentList);
     tojson.setObject(fileContentModel);
     tojson.setFlag(0);
     tojson.setMsg(new StringBuilder().append(unReadList.size()).append(",").append(readList.size()).toString());
     return tojson;
   }
 
   public List<FileContentModel> selectFileSortList(String sortList)
   {
     return this.file_ContentMapper.selectFileSortList(sortList);
   }
 
   public static Map<String, Object> checkUser(String checkString) {
     Map map = new HashMap();
 
     String[] checkStrings = checkString.split("\\|");
     if (checkStrings.length == 0) {
       return null;
     }
 
     if ((checkStrings.length == 1) && (!"".equals(checkStrings[0]))) {
       String[] checkDept = checkStrings[0].split(",");
       if ("ALL_DEPT".equalsIgnoreCase(checkStrings[0])) {
         map.put("dept_id", "AllDeptId");
       }
       else if ("".equals(checkStrings[0]))
         map.put("dept_id", "");
       else {
         map.put("dept_id", checkStrings[0].substring(0, checkStrings[0].length() - 1));
       }
 
     }
 
     if (checkStrings.length == 2) {
       String[] checkDept = checkStrings[0].split(",");
       if ("ALL_DEPT".equalsIgnoreCase(checkStrings[0])) {
         map.put("dept_id", "AllDeptId");
       }
       else if ("".equals(checkStrings[0]))
         map.put("dept_id", "");
       else {
         map.put("dept_id", checkStrings[0].substring(0, checkStrings[0].length() - 1));
       }
 
       if ("".equals(checkStrings[1]))
         map.put("user_Priv", checkStrings[1]);
       else {
         map.put("user_Priv", checkStrings[1].substring(0, checkStrings[1].length() - 1));
       }
     }
 
     if (checkStrings.length == 3) {
       String[] checkDept = checkStrings[0].split(",");
       if ("ALL_DEPT".equalsIgnoreCase(checkStrings[0])) {
         map.put("dept_id", "AllDeptId");
       }
       else if ("".equals(checkStrings[0]))
         map.put("dept_id", "");
       else {
         map.put("dept_id", checkStrings[0].substring(0, checkStrings[0].length() - 1));
       }
 
       if ("".equals(checkStrings[1]))
         map.put("user_Priv", checkStrings[1]);
       else {
         map.put("user_Priv", checkStrings[1].substring(0, checkStrings[1].length() - 1));
       }
       String[] checkUserId = checkStrings[2].split(",");
       StringBuffer sbUserID = new StringBuffer("");
       for (int i = 0; i < checkUserId.length; i++) {
         sbUserID.append("'");
         sbUserID.append(checkUserId[i]);
         sbUserID.append("'");
         if (i < checkUserId.length - 1) {
           sbUserID.append(",");
         }
       }
       map.put("user_id", sbUserID.toString());
     }
     return map;
   }
 
   List<TreeNode> treeFile(Integer sortid, HttpSession session) {
     String userId = session.getAttribute("userId").toString();
     String userPriv = session.getAttribute("userPriv").toString();
     String deptId = session.getAttribute("deptId").toString();
     Map map = new Hashtable();
     map.put("userId", userId);
     map.put("userPriv", userPriv);
     map.put("deptId", deptId);
 
     List<FileSortModel> rootTree = new LinkedList();
     Map rootMap = new HashMap();
     if (sortid == null) sortid = Integer.valueOf(0);
     rootMap.put("sortid", sortid);
     rootMap.put("sortType", "5");
     rootTree = this.fileSortService.getRootTree(rootMap);
 
     List childTree = new LinkedList();
 
     for (FileSortModel fsm : rootTree) {
       childTree.addAll(getchildTrees(fsm, map));
     }
 
     FileCommSortTreeUtil util = new FileCommSortTreeUtil(rootTree, childTree, map);
     return util.getTreeNode();
   }
 
   List<FileSortModel> getfilesDeleteList(FileSortModel file)
   {
     List parentList = new ArrayList();
     Integer tempNo = file.getSortId();
     List<FileSortModel> childrenList = new ArrayList();
     childrenList = this.fileSortService.getSortChrildren(tempNo.intValue());
     if (childrenList.size() > 0) {
       for (FileSortModel fs : childrenList) {
         parentList.addAll(getfilesDeleteList(fs));
       }
       parentList.addAll(childrenList);
     }
     return parentList;
   }
 }
