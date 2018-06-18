 package com.myoa.service.rms.impl;
 
 import com.myoa.dao.enclosure.AttachmentMapper;
import com.myoa.dao.rms.RmsFileMapper;
import com.myoa.dao.rms.RmsRollMapper;
import com.myoa.model.enclosure.Attachment;
import com.myoa.model.rms.RmsFileWithBLOBs;
import com.myoa.model.rms.RmsRollWithBLOBs;
import com.myoa.model.users.Users;
import com.myoa.service.rms.RmsFileService;
import com.myoa.util.Constant;
import com.myoa.util.ExcelUtil;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ModuleEnum;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.netdisk.ZipUtils;
import com.myoa.util.page.PageParams;

 import java.io.File;
 import java.io.FileInputStream;
 import java.io.FileOutputStream;
 import java.io.InputStream;
 import java.io.OutputStreamWriter;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import java.util.ResourceBundle;
 import java.util.UUID;
 import javax.servlet.ServletOutputStream;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.ss.usermodel.Cell;
 import org.apache.poi.ss.usermodel.Row;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
 
 @Service
 public class RmsFileServiceImpl
   implements RmsFileService
 {
 
   @Autowired
   private RmsFileMapper rmsFileMapper;
 
   @Autowired
   private RmsRollMapper rmsRollMapper;
 
   @Autowired
   private AttachmentMapper attachmentMapper;
   final String HTML_STYLE = "<style id=\"css_index\" index=\"index\" type=\"text1.5 \"\\5FAE\\8F6F\\96C5\\9ED1\", arial ;\n    *line-height:1.5;\n}\n\nh1,\nh2,\nh3,\nh4,\nh5,\nh6 {\n    font-size:100%;\n    font-weight: normal;\n}\n\naddress,\ncite,\ndfn,\nem,\nvar {\n    font-style:normal;\n}\n\ncode,\nkbd,\npre,\nsamp {\n    font-family:courier new, courier, monospace;\n}\n\nul,\nol {\n    list-style:none;\n}\n\nfieldset,\nimg {\n    border:0;\n}\n\ntable {\n    border-collapse:collapse;\n    border-spacing:0;\n}\n\ninput,\nbutton,\ntextarea,\nselect,\noptgroup,\noption {\n    font-family: inherit;\n    font-size: inherit;\n    font-style: inherit;\n    font-weight: inherit;\n    font-size:100%;\n}\n\ndiv:after,\nul:after,\ndl:after,\n.clearfix:after {\n    content:\"\";\n    display:block;\n    clear:both;\n    height:0;\n    visibility:hidden;\n}\n\n\nabbr,\narticle,\naside,\naudio,\ncanvas,\ndatalist,\ndetails,\nfigure,\nfooter,\nheader,\nhgroup,\nmenu,\nnav,\noutput,\nprogress,\nsection,\nvideo {\n    display:block;\n    margin:0;\n    padding:0;\n}\n\ni,\nu,\nb,\nem,\nspan,\nsmall{\n    font-weight:normal;\n    font-style:normal;\n}\n\nhtml,\nbody {\n    height: 100%;\n}\n\n\nhtml {\n    font-size: 62.5%;\n}\n\nbody {\n    -webkit-tap-highlight-color: rgba(255, 255, 255, 0);\n    -webkit-user-select: none;\n    user-select: none;\n    -moz-user-focus: none;\n    -moz-user-select: none;\n}\n\na{\n    text-decoration: none;\n}\n\nh2{\n    margin:0;\n    padding: 0;\n}\n\nul{\n    word-spacing: -4px;\n}\n\n.body{\n    width:100%;\nheight:100%;\noverflow: hidden;\n}\n.head{\n    width:100%;\n    height:45px;\n    border-bottom:1px solid #999;\n    background-color:#f8f8f8;\n    overflow:hidden;\n}\n.abs_left,.abs_right{\n    height:100%;\n    float:left;\n\n}\n.abs_right{\n    width:auto;\n    position: absolute;\n    right: 24px;\n}\n.abs_left{\n    width: auto;\n}\n.num,.step{\n    float:left;\n}\n.num{\n    font-size: 12pt;\n    font-weight: bold;\n    margin-left: 17px;\n    line-height: 45px;\n}\n.step{\n    color: #4b4b4b;\n    line-height: 45px;\n    margin-left: 13px;\n    font-size: 10pt;\n}\n.opt{\n    margin-top: 10px !important;\n    margin-left: 17px !important;\n    color: #205f82;\n    width: 62px;\n    height: 28px;\n    border-radius: 3px;\n    background: #f6f6f6;\n}\n.abs_right ul {\n    width: 275px;\n    height: 28px;\n    border: 1px solid #4889f0;\n    border-radius: 5px;\n    margin:7px auto;\n}\n.check{\n    background: #4889f0 ;\n    color:#fff ;\n}\n.abs_right{\n    color:#4889f0;\n}\n#tab_t ul li{\n    float:left;\n    width: 68px;\n    height:100%;\n    border-right:1px solid #4889f0;\n    text-align: center;\n    line-height: 28px;\n}\n.abs_right ul li:nth-child(4){\n    border:none !important;\n}\n\n.cont{\n}\n.cont_form{\n    width: 100%;\nbackground: #e6ebef;\n    height: 99%;\n    margin: auto;\n    overflow-x: hidden;\n    overflow-y: scroll;\n}\n.foot{\n    width:100%;\n    height:52px;\n    background-color: #eaeaea;\n    position: fixed;\n    bottom: 0px;\n    z-index: 9999;\n}\n.foot_left,.foot_rig{\n    height:100%;\n}\n.foot_left{\n    float:left;\n    margin-left: 36px;\n    width:310px;\n}\n.foot_rig{\n    float:right;\n    width:685px;\n    margin-right: 24px;\n}\n.foot_left ul,.foot_rig ul{\n    margin-top:11px;\n}\n.foot_left ul li,.foot_rig ul li{\n    float:left;\n    width: 70px;\n    height:28px;\n    \n    text-align: center;\n    line-height: 28px;\n    color:#4889f0;\n    border-radius: 5px;\n}\n\n.rig_h1onexiayibu{\n    background:url(\"workflowzhuanjiao.png\") no-repeat ;\n    color: #fff!important;\n    width: 80px!important;\n}\n.saveformlo{\n    background:url(\"workflowhuitui.png\") no-repeat ;\n    \n    width: 73px!important;\n}\n.baocunfanhui{\n    background:url(\"workflowbaocunfanhui.png\") no-repeat ;\n    \n    width: 76px!important;\n}\n.foot_left ul li,.foot_rig ul li.active{\ncolor:#fff;\n}\n.foot_left ul li{\n    margin-left: 3%;\n}\n.foot_rig ul li{\n    float: right;\n    margin-left: 2%;\n}\n.foot_rig ul li:nth-child(1){\n    width: 90px !important;\n}\n.foot_rig ul li:nth-child(3){\n    width: 90px !important;\n}\n.backbtn{\n    cursor: pointer;\n}\n.left_img,.left_h1,.rig_img,.rig_h1{\n    float:left;\n}\n.left_img,.rig_img{\n    margin-left: 5px;\n    margin-top: 4px;\n    margin-right: 3px;\n}\n.left_h1{\n    margin-left: 1px;\n}\n\n\n.rig_h1{\n    width: 100%;\n    text-align: center;\n}\n#tab_t ul li,.foot ul li{\n    cursor: pointer;\n}\n\n.cont_form::-webkit-scrollbar{\n    width: 0px;\n    height: 16px;\n    background-color: #f5f5f5;\n}\n\n.cont_form::-webkit-scrollbar-track{\n    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);\n    border-radius: 10px;\n    background-color: #f5f5f5;\n}\n\n.cont_form::-webkit-scrollbar-thumb{\n    \n    height: 20px;\n    border-radius: 10px;\n    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);\n    background-color: #555;\n}\n\nbody, button, select, textarea, input, label, option, fieldset, legend{font-family: 微软雅黑E\\8F6F\\96C5\\9ED1,Tahoma,Verdana;font-size: 12px;line-height: 18px;color: #444;}\nbody, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, form, fieldset, legend, textarea, button, p, blockquote{margin: 0;padding: 0;}\ntextarea{resize: none}\na,img{border:0;}\na{color: #666;text-decoration: none;}\nli{list-style-type:none;}\n.fl{float:left;}\n.fr{float:right;}\n.nf{clear:both;}\n.red{color:red;font-weight:bold;}\n.green{color:#00b500;font-weight:bold;}\n.ds{display:block;}\n.hid{overflow:hidden;}\n.clearfix{*zoom:1}\n.clearfix:after{display:block;visibility:hidden;clear:both;height:0;content:'.';font-size:0}\n.jianbian{background: -webkit-gradient(linear,left top,left bottom,color-stop(0%,#f4f4f4),color-stop(100%,#eee));background: -webkit-linear-gradient(top,#f4f4f4 0,#eee 100%);background: linear-gradient(to bottom,#f4f4f4 0,#eee 100%);}\n.bottomshadow{border-bottom: solid 1px #B3B3B3;-webkit-box-shadow: 0 1px 1px 0 #DFDFDF;box-shadow: 0 1px 1px 0 #DFDFDF;}\n.TableBlock{\n    border: 1px solid #dddddd;\n    line-height: 20px;\n    font-size: 9pt;\n    border-collapse: collapse;\n}\ntable{\n    border-collapse: collapse;\n    border-spacing: 0;\n}\n.TableBlock .TableContent td, .TableBlock td.TableContent{\n    background: #f2f2f2;\n    border: 1px #dddddd solid;\n    border-right: 1px #dddddd solid;\n    padding: 3px;\n    height: 37px;\n}\ninput.BigInput{\n    height: 20px;\n}\ninput,select,textarea{\n    outline:none;\n}\ninput.BigStatic, textarea.BigStatic {\n    font-size: 9pt;\n    padding: 1px 5px;\n    border: 1px solid #C0BBB4;\n    background: #E0E0E0;\n}\ntextarea {\n    overflow: auto;\n    \n    white-space: pre-wrap;\n}\n.MessageBox .msg .center {\n    padding-left: 90px;\n    font-size: 16px;\n    background-color: #357ece;\n}\n.MessageBox .msg td {\n    height: 90px;\n}\n.MessageBox .head-no-title td {\n    height: 16px;\n}\n.bodycolor{\n    BACKGROUND: #f6f7f9;\n    padding-top: 5px;\n}\ninput.BigInput, textarea.BigInput{\n    font-size: 10pt;\n    padding: 1px 5px;\n    line-height: 20px;\n    border: 1px solid #C0BBB4;\n    background: white url(app*padding: 3px;*imgmenu_top_hover_r.png) no-repeat top right;\n}\n#navPanel {\n    width: 100%;\n    height: 30px;\n    padding-top: 2px;\n    font-size: 10pt;\n    background: #D6E4EF url(appimgmenu_top_hover_l.png) no-repeat top left;\n}\n#navMenu a {\n    float: left;\n    overflow: hidden;\n    color: #000000;\n    text-decoration: none;\n    padding-left: 5px;\n    background: url(appimgmessage_bg.png) left 0px no-repeat;\n}\n.MessageBox .head .right {\n    width: 20px;\n    background: url(appimgmessage_bg.png) 0px -32px repeat-x;\n}\n.MessageBox .head .center .title {\n    float: left;\n    color: #fff;\n    font-size: 16px;\n    font-weight: bold;\n}\n.MessageBox .head td {\n    height: 32px;\n    overflow: hidden;\n}\n.MessageBox .msg .left {\n    width: 20px;\n    background: url(appimgicon64_info.png);\n    background-position: 0px 10px;\n    background-repeat: no-repeat;\n}\n.MessageBox .msg .center .msg-content {\n    color: #fff;\n    margin: 20px 12px 20px 6px;\n}\n.MessageBox .msg .right {\n    width: 20px;\n    background: url(appimgmessage_bg.png) left -64px no-repeat;\n}\n.MessageBox .foot .center {\n    background: url(appimgmessage_bg.png) right -64px no-repeat;\n}\n.MessageBox .foot td {\n    height: 16px;\n}\n.MessageBox .msg .center {\n    padding-left: 90px;\n    font-size: 16px;\n    background-color: #357ece;\n}\n.TableBlock .TableData td, .TableBlock td.TableData {\n    background: #FFFFFF;\n    border-bottom: 1px #dddddd solid;\n    border-top: 1px #dddddd solid;\n    border-right: 1px #dddddd solid;\n    padding: 3px;\n    height: 37px;\n}\n.MessageBox .head-no-title .left {\n    width: 20px;\n    background: url(appimgmessage_bg.png) 0px -112px repeat-x;\n}\n.MessageBox .head-no-title .right {\n    width: 20px;\n    background: url(app*width: 120px;** text-align: center; **width: 90px;** margin: 0 10px; **margin-top: 47px;** font-size: 14px; *..sys..import.png);\n    padding-left: 25px;\n    border:none;\n}\n.importTwo{\n    width: 80px;\n    height: 30px;\n    font-size: 13px !important;\n    cursor: pointer;\n    background-repeat: no-repeat;\n    background-image: url(..img..sys..sys..sysstyle>\n";
 
   public ToJson<RmsFileWithBLOBs> save(RmsFileWithBLOBs rmsFileWithBLOBs, HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       rmsFileWithBLOBs.setAddUser(user.getUserId());
       rmsFileWithBLOBs.setAddTime(new Date());
       this.rmsFileMapper.insertSelective(rmsFileWithBLOBs);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsFileWithBLOBs> update(RmsFileWithBLOBs rmsFileWithBLOBs, HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       rmsFileWithBLOBs.setModTime(new Date());
       rmsFileWithBLOBs.setModUser(user.getUserId());
       this.rmsFileMapper.updateByPrimaryKeySelective(rmsFileWithBLOBs);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsFileWithBLOBs> destroy(String fileIds, HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       if (!StringUtils.checkNull(fileIds).booleanValue()) {
         this.rmsFileMapper.destroy(fileIds.split(","), user.getUserId(), new Date());
       }
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsFileWithBLOBs> query(RmsFileWithBLOBs rmsFileWithBLOBs, PageParams pageParams)
   {
     ToJson json = new ToJson();
     try {
       Map map = new HashMap();
       map.put("page", pageParams);
 
       map.put("fileCode", rmsFileWithBLOBs.getFileCode());
       map.put("fileSubject", rmsFileWithBLOBs.getFileSubject());
 
       map.put("fileTitle", rmsFileWithBLOBs.getFileTitle());
       map.put("fileTitle0", rmsFileWithBLOBs.getFileTitle0());
 
       map.put("sendUnit", rmsFileWithBLOBs.getSendUnit());
       map.put("sendDate", rmsFileWithBLOBs.getSendDate());
       map.put("sendDate2", rmsFileWithBLOBs.getSendDate2());
 
       map.put("roomId", rmsFileWithBLOBs.getRoomId());
       map.put("rollId", rmsFileWithBLOBs.getRollId());
 
       map.put("secret", rmsFileWithBLOBs.getSecret());
       map.put("urgency", rmsFileWithBLOBs.getUrgency());
 
       map.put("fileType", rmsFileWithBLOBs.getFileType());
       map.put("fileKind", rmsFileWithBLOBs.getFileKind());
 
       map.put("filePage", rmsFileWithBLOBs.getFilePage());
       map.put("filePage2", rmsFileWithBLOBs.getFilePage2());
       map.put("printPage", rmsFileWithBLOBs.getPrintPage());
       map.put("printPage2", rmsFileWithBLOBs.getPrintPage2());
 
       map.put("remark", rmsFileWithBLOBs.getRemark());
 
       map.put("delStatus", rmsFileWithBLOBs.getDelStatus());
 
       List query = this.rmsFileMapper.query(map);
       json.setObj(query);
       json.setTotleNum(pageParams.getTotal());
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsFileWithBLOBs> selectById(Integer fileId, HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try {
       RmsFileWithBLOBs rmsFileWithBLOBs = this.rmsFileMapper.selectByPrimaryKey(fileId);
       List attachmentList = new ArrayList();
       if (!StringUtils.checkNull(rmsFileWithBLOBs.getAttachmentId()).booleanValue()) {
         attachmentList = GetAttachmentListUtil.returnAttachment(rmsFileWithBLOBs.getAttachmentName(), rmsFileWithBLOBs.getAttachmentId(), Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse"), "roll_manage");
       }
       rmsFileWithBLOBs.setAttachmentList(attachmentList);
 
       json.setObject(rmsFileWithBLOBs);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsFileWithBLOBs> importFile(HttpServletRequest request, HttpServletResponse response, MultipartFile file)
   {
     ToJson json = new ToJson();
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
 
         String readPath = path.append(System.getProperty("file.separator")).append(newFileName).toString();
         InputStream in = new FileInputStream(readPath);
         HSSFWorkbook excelObj = new HSSFWorkbook(in);
         HSSFSheet sheetObj = excelObj.getSheetAt(0);
         Row row = sheetObj.getRow(0);
         int colNum = row.getPhysicalNumberOfCells();
         int lastRowNum = sheetObj.getLastRowNum();
         RmsFileWithBLOBs rmsFileWithBLOBs = null;
         List list = new ArrayList();
         for (int i = 1; i <= lastRowNum; i++) {
           row = sheetObj.getRow(i);
           if (row != null) {
             rmsFileWithBLOBs = new RmsFileWithBLOBs();
             for (int j = 0; j < colNum; j++) {
               Cell cell = row.getCell(j);
               if (cell != null) {
                 switch (j) {
                 case 0:
                   rmsFileWithBLOBs.setFileCode(cell.getStringCellValue());
                   break;
                 case 1:
                   rmsFileWithBLOBs.setFileSubject(cell.getStringCellValue());
                   break;
                 case 2:
                   rmsFileWithBLOBs.setFileTitle(cell.getStringCellValue());
                   break;
                 case 3:
                   rmsFileWithBLOBs.setFileTitle0(cell.getStringCellValue());
                   break;
                 case 4:
                   rmsFileWithBLOBs.setSendUnit(cell.getStringCellValue());
                   break;
                 case 5:
                   rmsFileWithBLOBs.setSendDate(cell.getDateCellValue());
                   break;
                 case 6:
                   if ("普密".equals(cell.getStringCellValue()))
                     rmsFileWithBLOBs.setSecret("1");
                   else if ("秘密".equals(cell.getStringCellValue()))
                     rmsFileWithBLOBs.setSecret("4");
                   else if ("机密".equals(cell.getStringCellValue()))
                     rmsFileWithBLOBs.setSecret("3");
                   else if ("绝密".equals(cell.getStringCellValue()))
                     rmsFileWithBLOBs.setSecret("2");
                   else {
                     rmsFileWithBLOBs.setSecret("1");
                   }
                   break;
                 case 7:
                   if ("员工类型".equals(cell.getStringCellValue())) {
                     rmsFileWithBLOBs.setUrgency("1"); } else {
                     if (!"普级".equals(cell.getStringCellValue())) continue;
                     rmsFileWithBLOBs.setUrgency("2"); } break;
                 case 8:
                   if ("公文".equals(cell.getStringCellValue())) {
                     rmsFileWithBLOBs.setFileType("1"); } else {
                     if (!"资料".equals(cell.getStringCellValue())) continue;
                     rmsFileWithBLOBs.setFileType("2"); } break;
                 case 9:
                   if ("A".equals(cell.getStringCellValue())) {
                     rmsFileWithBLOBs.setFileKind("1");
                   } else if ("B".equals(cell.getStringCellValue())) {
                     rmsFileWithBLOBs.setFileKind("2");
                   } else if ("C".equals(cell.getStringCellValue())) {
                     rmsFileWithBLOBs.setFileKind("3"); } else {
                     if (!"D".equals(cell.getStringCellValue())) continue;
                     rmsFileWithBLOBs.setFileKind("4"); } break;
                 case 10:
                   rmsFileWithBLOBs.setFilePage(cell.getStringCellValue());
                   break;
                 case 11:
                   rmsFileWithBLOBs.setPrintPage(cell.getStringCellValue());
                   break;
                 case 12:
                   rmsFileWithBLOBs.setRemark(cell.getStringCellValue());
                   break;
                 case 13:
                   String rollName = cell.getStringCellValue();
                   List rmsRollWithBLOBs = this.rmsRollMapper.selectByName(rollName);
                   if (rmsRollWithBLOBs.size() > 0)
                     rmsFileWithBLOBs.setRollId(((RmsRollWithBLOBs)rmsRollWithBLOBs.get(0)).getRollId());
                   else {
                     rmsFileWithBLOBs.setRollId(Integer.valueOf(0));
                   }
                 }
               }
             }
 
             if (rmsFileWithBLOBs.getRollId().equals(Integer.valueOf(0))) {
               rmsFileWithBLOBs.setImportStatus("导入失败，无该卷库");
             } else {
               rmsFileWithBLOBs.setAttachmentId("");
               rmsFileWithBLOBs.setAttachmentName("");
               try {
                 this.rmsFileMapper.insertSelective(rmsFileWithBLOBs);
                 rmsFileWithBLOBs.setImportStatus("导入成功");
               } catch (Exception e) {
                 rmsFileWithBLOBs.setImportStatus("导入失败，数据异常");
                 e.printStackTrace();
               }
             }
 
             list.add(rmsFileWithBLOBs);
           }
         }
         json.setObj(list);
       }
 
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<RmsFileWithBLOBs> deleteFiles(String fileIds)
   {
     ToJson json = new ToJson();
     try {
       if (!StringUtils.checkNull(fileIds).booleanValue()) {
         this.rmsFileMapper.delete(fileIds.split(","));
       }
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsFileWithBLOBs> restore(String fileIds)
   {
     ToJson json = new ToJson();
     try {
       if (!StringUtils.checkNull(fileIds).booleanValue()) {
         this.rmsFileMapper.restore(fileIds.split(","));
         json.setFlag(0);
         json.setMsg("ok");
         return json;
       }
     }
     catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     json.setFlag(1);
     json.setMsg("err");
     return json;
   }
 
   public ToJson<RmsFileWithBLOBs> export(String fileIds, HttpServletRequest request, HttpServletResponse response)
   {
     ToJson json = new ToJson();
     try {
       List list = this.rmsFileMapper.selectByFileIds(fileIds.split(","));
 
       HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("文件档案信息", 9);
       String[] secondTitles = { "文件号", "文件主题词", "文件标题", "文件辅标题", "发文单位", "发文日期", "密级", "紧急等级", "文件分类", "公文类别", "文件页数", "打印页数", "备注" };
       HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
       String[] beanProperty = { "fileCode", "fileSubject", "fileTitle", "fileTitle0", "sendUnit", "sendDate", "secretName", "urgencyName", "fileTypeName", "fileKindName", "filePage", "printPage", "remark" };
 
       HSSFWorkbook workbook = ExcelUtil.exportExcelData(workbook2, list, beanProperty);
       ServletOutputStream out = response.getOutputStream();
 
       String filename = "文件档案.xls";
       filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
       response.setContentType("application/vnd.ms-excel");
       response.setHeader("content-disposition", "attachment;filename=" + filename);
       workbook.write(out);
       out.close();
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<RmsFileWithBLOBs> updateRollBath(String fileIds, Integer rollId)
   {
     ToJson json = new ToJson();
     try {
       if (!StringUtils.checkNull(fileIds).booleanValue()) {
         this.rmsFileMapper.updateRollBath(fileIds.split(","), rollId);
       }
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<Attachment> createFormHtml(String content, String module, HttpServletResponse response, HttpServletRequest request, String typeFlag)
   {
     ToJson json = new ToJson();
     try
     {
       String company = Constant.MYOA + (String)SessionUtils.getSessionInfo(request.getSession(), "loginDateSouse", String.class);
 
       ResourceBundle rb = ResourceBundle.getBundle("upload");
       String os = System.getProperty("os.name");
       StringBuffer sb = new StringBuffer();
       if (os.toLowerCase().startsWith("win"))
         sb = sb.append(rb.getString("upload.win"));
       else {
         sb = sb.append(rb.getString("upload.linux"));
       }
 
       String ym = new SimpleDateFormat("yyMM").format(new Date());
 
       if (StringUtils.checkNull(module).booleanValue()) {
         module = "roll_manage";
       }
 
       if (StringUtils.checkNull(sb.toString()).booleanValue()) {
         String a = request.getRealPath("");
         sb.append(a);
         sb.append(System.getProperty("file.separator")).append("attach").append(System.getProperty("file.separator")).append(company).append(System.getProperty("file.separator")).append(module).append(System.getProperty("file.separator")).append(ym);
       }
       else
       {
         sb.append(System.getProperty("file.separator")).append("attach").append(System.getProperty("file.separator")).append(company).append(System.getProperty("file.separator")).append(module).append(System.getProperty("file.separator")).append(ym);
       }
 
       String path = sb.toString();
 
       new File(path).mkdirs();
 
       String fileName = "工作流表单.html";
 
       int attachID = Math.abs((int)System.currentTimeMillis());
       String newFileName = Integer.toString(attachID) + "." + fileName.toString();
 
       String filePath = path + System.getProperty("file.separator") + newFileName;
       File f = new File(filePath);
       if (!f.exists()) {
         f.createNewFile();
       }
       OutputStreamWriter pw = new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8");
       pw.write("<html><head><meta charset=\"UTF-8\"><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"></head>");
       pw.write("<style id=\"css_index\" index=\"index\" type=\"text1.5 \"\\5FAE\\8F6F\\96C5\\9ED1\", arial ;\n    *line-height:1.5;\n}\n\nh1,\nh2,\nh3,\nh4,\nh5,\nh6 {\n    font-size:100%;\n    font-weight: normal;\n}\n\naddress,\ncite,\ndfn,\nem,\nvar {\n    font-style:normal;\n}\n\ncode,\nkbd,\npre,\nsamp {\n    font-family:courier new, courier, monospace;\n}\n\nul,\nol {\n    list-style:none;\n}\n\nfieldset,\nimg {\n    border:0;\n}\n\ntable {\n    border-collapse:collapse;\n    border-spacing:0;\n}\n\ninput,\nbutton,\ntextarea,\nselect,\noptgroup,\noption {\n    font-family: inherit;\n    font-size: inherit;\n    font-style: inherit;\n    font-weight: inherit;\n    font-size:100%;\n}\n\ndiv:after,\nul:after,\ndl:after,\n.clearfix:after {\n    content:\"\";\n    display:block;\n    clear:both;\n    height:0;\n    visibility:hidden;\n}\n\n\nabbr,\narticle,\naside,\naudio,\ncanvas,\ndatalist,\ndetails,\nfigure,\nfooter,\nheader,\nhgroup,\nmenu,\nnav,\noutput,\nprogress,\nsection,\nvideo {\n    display:block;\n    margin:0;\n    padding:0;\n}\n\ni,\nu,\nb,\nem,\nspan,\nsmall{\n    font-weight:normal;\n    font-style:normal;\n}\n\nhtml,\nbody {\n    height: 100%;\n}\n\n\nhtml {\n    font-size: 62.5%;\n}\n\nbody {\n    -webkit-tap-highlight-color: rgba(255, 255, 255, 0);\n    -webkit-user-select: none;\n    user-select: none;\n    -moz-user-focus: none;\n    -moz-user-select: none;\n}\n\na{\n    text-decoration: none;\n}\n\nh2{\n    margin:0;\n    padding: 0;\n}\n\nul{\n    word-spacing: -4px;\n}\n\n.body{\n    width:100%;\nheight:100%;\noverflow: hidden;\n}\n.head{\n    width:100%;\n    height:45px;\n    border-bottom:1px solid #999;\n    background-color:#f8f8f8;\n    overflow:hidden;\n}\n.abs_left,.abs_right{\n    height:100%;\n    float:left;\n\n}\n.abs_right{\n    width:auto;\n    position: absolute;\n    right: 24px;\n}\n.abs_left{\n    width: auto;\n}\n.num,.step{\n    float:left;\n}\n.num{\n    font-size: 12pt;\n    font-weight: bold;\n    margin-left: 17px;\n    line-height: 45px;\n}\n.step{\n    color: #4b4b4b;\n    line-height: 45px;\n    margin-left: 13px;\n    font-size: 10pt;\n}\n.opt{\n    margin-top: 10px !important;\n    margin-left: 17px !important;\n    color: #205f82;\n    width: 62px;\n    height: 28px;\n    border-radius: 3px;\n    background: #f6f6f6;\n}\n.abs_right ul {\n    width: 275px;\n    height: 28px;\n    border: 1px solid #4889f0;\n    border-radius: 5px;\n    margin:7px auto;\n}\n.check{\n    background: #4889f0 ;\n    color:#fff ;\n}\n.abs_right{\n    color:#4889f0;\n}\n#tab_t ul li{\n    float:left;\n    width: 68px;\n    height:100%;\n    border-right:1px solid #4889f0;\n    text-align: center;\n    line-height: 28px;\n}\n.abs_right ul li:nth-child(4){\n    border:none !important;\n}\n\n.cont{\n}\n.cont_form{\n    width: 100%;\nbackground: #e6ebef;\n    height: 99%;\n    margin: auto;\n    overflow-x: hidden;\n    overflow-y: scroll;\n}\n.foot{\n    width:100%;\n    height:52px;\n    background-color: #eaeaea;\n    position: fixed;\n    bottom: 0px;\n    z-index: 9999;\n}\n.foot_left,.foot_rig{\n    height:100%;\n}\n.foot_left{\n    float:left;\n    margin-left: 36px;\n    width:310px;\n}\n.foot_rig{\n    float:right;\n    width:685px;\n    margin-right: 24px;\n}\n.foot_left ul,.foot_rig ul{\n    margin-top:11px;\n}\n.foot_left ul li,.foot_rig ul li{\n    float:left;\n    width: 70px;\n    height:28px;\n    \n    text-align: center;\n    line-height: 28px;\n    color:#4889f0;\n    border-radius: 5px;\n}\n\n.rig_h1onexiayibu{\n    background:url(\"workflowzhuanjiao.png\") no-repeat ;\n    color: #fff!important;\n    width: 80px!important;\n}\n.saveformlo{\n    background:url(\"workflowhuitui.png\") no-repeat ;\n    \n    width: 73px!important;\n}\n.baocunfanhui{\n    background:url(\"workflowbaocunfanhui.png\") no-repeat ;\n    \n    width: 76px!important;\n}\n.foot_left ul li,.foot_rig ul li.active{\ncolor:#fff;\n}\n.foot_left ul li{\n    margin-left: 3%;\n}\n.foot_rig ul li{\n    float: right;\n    margin-left: 2%;\n}\n.foot_rig ul li:nth-child(1){\n    width: 90px !important;\n}\n.foot_rig ul li:nth-child(3){\n    width: 90px !important;\n}\n.backbtn{\n    cursor: pointer;\n}\n.left_img,.left_h1,.rig_img,.rig_h1{\n    float:left;\n}\n.left_img,.rig_img{\n    margin-left: 5px;\n    margin-top: 4px;\n    margin-right: 3px;\n}\n.left_h1{\n    margin-left: 1px;\n}\n\n\n.rig_h1{\n    width: 100%;\n    text-align: center;\n}\n#tab_t ul li,.foot ul li{\n    cursor: pointer;\n}\n\n.cont_form::-webkit-scrollbar{\n    width: 0px;\n    height: 16px;\n    background-color: #f5f5f5;\n}\n\n.cont_form::-webkit-scrollbar-track{\n    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);\n    border-radius: 10px;\n    background-color: #f5f5f5;\n}\n\n.cont_form::-webkit-scrollbar-thumb{\n    \n    height: 20px;\n    border-radius: 10px;\n    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);\n    background-color: #555;\n}\n\nbody, button, select, textarea, input, label, option, fieldset, legend{font-family: 微软雅黑E\\8F6F\\96C5\\9ED1,Tahoma,Verdana;font-size: 12px;line-height: 18px;color: #444;}\nbody, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, form, fieldset, legend, textarea, button, p, blockquote{margin: 0;padding: 0;}\ntextarea{resize: none}\na,img{border:0;}\na{color: #666;text-decoration: none;}\nli{list-style-type:none;}\n.fl{float:left;}\n.fr{float:right;}\n.nf{clear:both;}\n.red{color:red;font-weight:bold;}\n.green{color:#00b500;font-weight:bold;}\n.ds{display:block;}\n.hid{overflow:hidden;}\n.clearfix{*zoom:1}\n.clearfix:after{display:block;visibility:hidden;clear:both;height:0;content:'.';font-size:0}\n.jianbian{background: -webkit-gradient(linear,left top,left bottom,color-stop(0%,#f4f4f4),color-stop(100%,#eee));background: -webkit-linear-gradient(top,#f4f4f4 0,#eee 100%);background: linear-gradient(to bottom,#f4f4f4 0,#eee 100%);}\n.bottomshadow{border-bottom: solid 1px #B3B3B3;-webkit-box-shadow: 0 1px 1px 0 #DFDFDF;box-shadow: 0 1px 1px 0 #DFDFDF;}\n.TableBlock{\n    border: 1px solid #dddddd;\n    line-height: 20px;\n    font-size: 9pt;\n    border-collapse: collapse;\n}\ntable{\n    border-collapse: collapse;\n    border-spacing: 0;\n}\n.TableBlock .TableContent td, .TableBlock td.TableContent{\n    background: #f2f2f2;\n    border: 1px #dddddd solid;\n    border-right: 1px #dddddd solid;\n    padding: 3px;\n    height: 37px;\n}\ninput.BigInput{\n    height: 20px;\n}\ninput,select,textarea{\n    outline:none;\n}\ninput.BigStatic, textarea.BigStatic {\n    font-size: 9pt;\n    padding: 1px 5px;\n    border: 1px solid #C0BBB4;\n    background: #E0E0E0;\n}\ntextarea {\n    overflow: auto;\n    \n    white-space: pre-wrap;\n}\n.MessageBox .msg .center {\n    padding-left: 90px;\n    font-size: 16px;\n    background-color: #357ece;\n}\n.MessageBox .msg td {\n    height: 90px;\n}\n.MessageBox .head-no-title td {\n    height: 16px;\n}\n.bodycolor{\n    BACKGROUND: #f6f7f9;\n    padding-top: 5px;\n}\ninput.BigInput, textarea.BigInput{\n    font-size: 10pt;\n    padding: 1px 5px;\n    line-height: 20px;\n    border: 1px solid #C0BBB4;\n    background: white url(app*padding: 3px;*imgmenu_top_hover_r.png) no-repeat top right;\n}\n#navPanel {\n    width: 100%;\n    height: 30px;\n    padding-top: 2px;\n    font-size: 10pt;\n    background: #D6E4EF url(appimgmenu_top_hover_l.png) no-repeat top left;\n}\n#navMenu a {\n    float: left;\n    overflow: hidden;\n    color: #000000;\n    text-decoration: none;\n    padding-left: 5px;\n    background: url(appimgmessage_bg.png) left 0px no-repeat;\n}\n.MessageBox .head .right {\n    width: 20px;\n    background: url(appimgmessage_bg.png) 0px -32px repeat-x;\n}\n.MessageBox .head .center .title {\n    float: left;\n    color: #fff;\n    font-size: 16px;\n    font-weight: bold;\n}\n.MessageBox .head td {\n    height: 32px;\n    overflow: hidden;\n}\n.MessageBox .msg .left {\n    width: 20px;\n    background: url(appimgicon64_info.png);\n    background-position: 0px 10px;\n    background-repeat: no-repeat;\n}\n.MessageBox .msg .center .msg-content {\n    color: #fff;\n    margin: 20px 12px 20px 6px;\n}\n.MessageBox .msg .right {\n    width: 20px;\n    background: url(appimgmessage_bg.png) left -64px no-repeat;\n}\n.MessageBox .foot .center {\n    background: url(appimgmessage_bg.png) right -64px no-repeat;\n}\n.MessageBox .foot td {\n    height: 16px;\n}\n.MessageBox .msg .center {\n    padding-left: 90px;\n    font-size: 16px;\n    background-color: #357ece;\n}\n.TableBlock .TableData td, .TableBlock td.TableData {\n    background: #FFFFFF;\n    border-bottom: 1px #dddddd solid;\n    border-top: 1px #dddddd solid;\n    border-right: 1px #dddddd solid;\n    padding: 3px;\n    height: 37px;\n}\n.MessageBox .head-no-title .left {\n    width: 20px;\n    background: url(appimgmessage_bg.png) 0px -112px repeat-x;\n}\n.MessageBox .head-no-title .right {\n    width: 20px;\n    background: url(app*width: 120px;** text-align: center; **width: 90px;** margin: 0 10px; **margin-top: 47px;** font-size: 14px; *..sys..import.png);\n    padding-left: 25px;\n    border:none;\n}\n.importTwo{\n    width: 80px;\n    height: 30px;\n    font-size: 13px !important;\n    cursor: pointer;\n    background-repeat: no-repeat;\n    background-image: url(..img..sys..sys..sysstyle>\n");
       pw.write("<body>");
       pw.write(content);
       pw.write("<html>");
       pw.close();
 
       int moduleID = 0;
       for (ModuleEnum em : ModuleEnum.values()) {
         if (em.getName().equals(module.trim())) {
           moduleID = em.getIndex();
         }
       }
 
       byte mid = (byte)moduleID;
 
       if ("1".equals(typeFlag))
       {
         Attachment attachment = new Attachment();
         attachment = new Attachment();
         attachment.setAttachId(Integer.valueOf(attachID));
         attachment.setModule(Byte.valueOf(mid));
         attachment.setAttachFile(fileName);
         attachment.setAttachName(fileName);
         attachment.setYm(ym);
         attachment.setAttachSign(new Long(0L));
         attachment.setDelFlag(Byte.valueOf("0"));
         attachment.setPosition(Byte.valueOf("2"));
         attachment.setIsImage(Byte.valueOf("0"));
         attachment.setFileSize(String.valueOf(f.length()));
         attachment.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
 
         this.attachmentMapper.insertSelective(attachment);
         json.setObject(attachment);
       } else if ("2".equals(typeFlag))
       {
         String zipPath = filePath.replace("工作流表单.html", "工作流表单.zip");
 
         ZipUtils.zip(filePath, zipPath);
 
         File zipFile = new File(zipPath);
 
         if (!zipFile.exists()) {
           json.setFlag(1);
           json.setMsg("zip文件不存在");
           return json;
         }
 
         fileName = "工作流表单.zip";
 
         Attachment attachment = new Attachment();
         attachment = new Attachment();
         attachment.setAttachId(Integer.valueOf(attachID));
         attachment.setModule(Byte.valueOf(mid));
         attachment.setAttachFile(fileName);
         attachment.setAttachName(fileName);
         attachment.setYm(ym);
         attachment.setAttachSign(new Long(0L));
         attachment.setDelFlag(Byte.valueOf("0"));
         attachment.setPosition(Byte.valueOf("2"));
         attachment.setIsImage(Byte.valueOf("0"));
         attachment.setFileSize(String.valueOf(f.length()));
         attachment.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
 
         this.attachmentMapper.insertSelective(attachment);
         json.setObject(attachment);
 
         String attUrl = "AID=" + attachment.getAid() + "&" + "MODULE=" + module + "&" + "COMPANY=" + company + "&" + "YM=" + attachment.getYm() + "&" + "ATTACHMENT_ID=" + attachment.getAttachId() + "&" + "ATTACHMENT_NAME=" + attachment.getAttachName() + "&" + "FILESIZE=" + attachment.getFileSize();
 
         attachment.setAttUrl(attUrl);
       }
 
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 }

