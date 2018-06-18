 package com.myoa.util;
 
 import com.myoa.model.enclosure.Attachment;
import com.myoa.service.enclosure.EnclosureService;
import com.myoa.util.common.StringUtils;

 import java.util.ArrayList;
 import java.util.List;
 import javax.annotation.PostConstruct;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
 @Component
 public class GetAttachmentListUtil
 {
   public static final String MODULE_ATTEND = "attend";
   public static final String MODULE_EMAIL = "email";
   public static final String MODULE_WORKFLOW = "workflow";
   public static final String MODULE_FILE_FOLDER = "file_folder";
   public static final String MODULE_NOTIFY = "notify";
   public static final String MODULE_NEWS = "news";
   public static final String MODULE_DIARY = "diary";
   public static final String MODULE_BBS = "bbs";
   public static final String MODULE_BOOK = "book";
   public static final String MODULE_CRM = "crm";
   public static final String MODULE_DOCUMENT = "document";
   public static final String MODULE_FAX = "fax";
   public static final String MODULE_HR = "hr";
   public static final String MODULE_MEETING = "meeting";
   public static final String MODULE_OFFICE_PRODUCT = "office_product";
   public static final String MODULE_PROJECT = "project";
   public static final String MODULE_REPORTSHOP = "reportshop";
   public static final String MODULE_ROLL_MANAGE = "roll_manage";
   public static final String MODULE_SALE_MANAGE = "sale_manage";
   public static final String MODULE_TRAINING = "training";
   public static final String MODULE_VEHICLE = "vehicle";
   public static final String MODULE_VOTE = "vote";
   public static final String MODULE_WORK_PLAN = "work_plan";
   public static final String MODULE_ZHIDAO = "zhidao";
   public static final String MODULE_UNIT = "unit";
   public static final String MODULE_MODEL = "model";
   public static final String MODULE_IM = "im";
   public static final String MODULE_EXT_DATA = "ext_data";
   public static final String MODULE_ASSET = "asset";
   public static final String MODULE_UNKNOWN = "unknown";
   public static final String MODULE_ADDRESS = "address";
   public static final String MODULE_VOICEMSG = "voicemsg";
   public static final String MODULE_PORTAL = "portal";
   public static final String MODULE_WEIXUNSHARE = "weixunshare";
   public static final String MODULE_SAFEDOC = "safedoc";
   public static final String MODULE_UPLOAD_TEMP = "upload_temp";
   public static final String MODULE_ITASK = "itask";
   public static final String MODULE_SYS = "sys";
   public static final String MODULE_SUMMARY_MEET = "summary_meet";
   public static final String MODULE_HRSTAFFCONTRACT = "hr_staffcontract";
   public static final String MODULE_HRSTAFFINFO = "hr_staffinfo";
   public static final String MODULE_SEAL = "seal";
   public static final String MODULE_INTERFACE = "interface";
   public static final String WE_CHAT = "wechat";
   public static final String EMAIL_COUNT = "emailCount";
   public static final String RMS_FILE = "rmsFile";
   public static final String MODULE_USERJOB = "userjob";
   public static final String MODULE_USERPOST = "userpost";
 
   @Autowired
   private EnclosureService enclosureService;
   private static GetAttachmentListUtil getAttachmentListUtil;
 
   @PostConstruct
   public void init()
   {
     getAttachmentListUtil = this;
     getAttachmentListUtil.enclosureService = this.enclosureService;
   }
 
   public static List<Attachment> returnAttachment(String attachmentName, String attachmentId, String sqlType, String module)
   {
     List list = new ArrayList();
     if ((StringUtils.checkNull(attachmentId).booleanValue()) && (StringUtils.checkNull(attachmentName).booleanValue()))
       return list;
     try
     {
       if (attachmentId.contains("@")) {
         String[] attachmentIds = attachmentId.split(",");
         String[] attachmentNames = attachmentName.split("\\*");
         int attachmentidLength = attachmentIds.length;
         for (int i = 0; i < attachmentidLength; i++) {
           Attachment attachment = getAttachmentListUtil.enclosureService.findByAttachId(Integer.valueOf(attachmentIds[i].substring(attachmentIds[i].indexOf("_") + 1, attachmentIds[i].length())).intValue());
           if (attachment != null) {
             attachment.setAttUrl("AID=" + attachment.getAid() + "&MODULE=" + module + "&COMPANY=" + sqlType + "&YM=" + attachment.getYm() + "&ATTACHMENT_ID=" + attachment.getAttachId() + "&ATTACHMENT_NAME=" + attachment.getAttachName());
             StringBuffer id = new StringBuffer();
             StringBuffer name = new StringBuffer();
             int aid = attachment.getAid().intValue();
             int attachId = attachment.getAttachId().intValue();
             String ym = attachment.getYm();
             String attachName = attachment.getAttachName();
             String all = aid + "@" + ym + "_" + attachId;
             id.append(all).append(",");
             name.append(attachName).append("*");
             attachment.setId(id.toString());
             attachment.setName(name.toString());
             list.add(attachment);
           }
         }
       }
       else
       {
         String[] attachmentIds = attachmentId.split(",");
         String[] attachmentNames = attachmentName.split("\\*");
         int attachmentidLength = attachmentIds.length;
         for (int i = 0; i < attachmentidLength; i++)
         {
           Attachment attachment = getAttachmentListUtil.enclosureService.findByAttachId(Integer.valueOf(attachmentIds[i].substring(attachmentIds[i].indexOf("_") + 1, attachmentIds[i].length())).intValue());
           if (attachment != null) {
             attachment.setAttUrl("AID=" + attachment.getAid() + "&MODULE=" + module + "&COMPANY=" + sqlType + "&YM=" + attachment.getYm() + "&ATTACHMENT_ID=" + attachment.getAttachId() + "&ATTACHMENT_NAME=" + attachment.getAttachName());
             StringBuffer id = new StringBuffer();
             StringBuffer name = new StringBuffer();
             int aid = attachment.getAid().intValue();
             int attachId = attachment.getAttachId().intValue();
             String ym = attachment.getYm();
             String attachName = attachment.getAttachName();
             String all = aid + "@" + ym + "_" + attachId;
             id.append(all).append(",");
             name.append(attachName).append("*");
             attachment.setId(id.toString());
             attachment.setName(name.toString());
             list.add(attachment);
             list.add(attachment);
           }
         }
       }
 
     }
     catch (Exception e)
     {
       e.printStackTrace();
     }
 
     return list;
   }
 }

