 package com.myoa.service.document;
 
 import com.myoa.model.document.DocumentModel;
import com.myoa.model.document.DocumentModelWithBLOBs;
import com.myoa.model.document.SysRuleModel;
import com.myoa.model.users.Users;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrappers;
import com.myoa.util.page.PageParams;

 import java.util.List;
import javax.servlet.http.HttpServletRequest;
 
 public abstract interface DocumentSerivce
 {
   public static final Integer PRCS_FLAG_WILL = Integer.valueOf(1);
   public static final Integer PRCS_FLAG_OVER = Integer.valueOf(2);
 
   public abstract int saveSysRule(SysRuleModel paramSysRuleModel);
 
   public abstract int deleteSysRule(SysRuleModel paramSysRuleModel);
 
   public abstract int updateRuleById(SysRuleModel paramSysRuleModel);
 
   public abstract SysRuleModel getRuleById(SysRuleModel paramSysRuleModel, HttpServletRequest paramHttpServletRequest);
 
   public abstract List<SysRuleModel> getRuleAll(SysRuleModel paramSysRuleModel);
 
   public abstract SysRuleModel getRuleByCode(SysRuleModel paramSysRuleModel);
 
   public abstract ToJson<Object> saveDocument(Users paramUsers, Integer paramInteger1, Integer paramInteger2, String paramString1, String paramString2, DocumentModelWithBLOBs paramDocumentModelWithBLOBs, HttpServletRequest paramHttpServletRequest);
 
   public abstract int deleteDocument(DocumentModelWithBLOBs paramDocumentModelWithBLOBs);
 
   public abstract int updateDocument(DocumentModelWithBLOBs paramDocumentModelWithBLOBs);
 
   public abstract DocumentModelWithBLOBs selectDocumentById(HttpServletRequest paramHttpServletRequest, DocumentModelWithBLOBs paramDocumentModelWithBLOBs);
 
   public abstract List<DocumentModelWithBLOBs> selectDocAll(DocumentModelWithBLOBs paramDocumentModelWithBLOBs);
 
   public abstract ToJson<DocumentModelWithBLOBs> seleDocSendReceive(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, HttpServletRequest paramHttpServletRequest, Integer paramInteger1, Integer paramInteger2, Boolean paramBoolean);
 
   public abstract BaseWrappers selectDocSelective(Integer paramInteger1, String paramString1, Integer paramInteger2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, Integer paramInteger3, PageParams paramPageParams, HttpServletRequest paramHttpServletRequest);
 
   public abstract BaseWrappers selWillDocSendOrReceive(HttpServletRequest paramHttpServletRequest, String paramString1, String paramString2, String paramString3, String paramString4, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4);
 
   public abstract BaseWrappers selOverDocSendOrReceive(HttpServletRequest paramHttpServletRequest, String paramString1, String paramString2, String paramString3, String paramString4, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4);
 
   public abstract BaseWrappers selMyDocSendOrReceive(HttpServletRequest paramHttpServletRequest, String paramString1, String paramString2, String paramString3, String paramString4, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3);
 
   public abstract BaseWrappers selOverseeTheOfficialDocument(HttpServletRequest paramHttpServletRequest, String paramString1, String paramString2, String paramString3, Integer paramInteger1, Integer paramInteger2, Boolean paramBoolean);
 
   public abstract BaseWrappers addDocSendSms(HttpServletRequest paramHttpServletRequest, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8);
 
   public abstract ToJson<DocumentModel> getDocumentEditPriv(Integer paramInteger);
 
   public abstract BaseWrappers selectTimeOutDoc(HttpServletRequest paramHttpServletRequest);
 }

