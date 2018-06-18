 package com.myoa.service.sys.impl;
 
 import com.myoa.dao.common.SysParaMapper;
import com.myoa.dao.sys.SysInterfaceMapper;
import com.myoa.model.common.SysPara;
import com.myoa.model.sys.InterfaceModel;
import com.myoa.service.sys.InterFaceService;
import com.myoa.util.Constant;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.ipUtil.MachineCode;
import com.tencent.xinge.ClickAction;
 import com.tencent.xinge.Message;
 import com.tencent.xinge.MessageIOS;
 import com.tencent.xinge.Style;
 import com.tencent.xinge.XingeApp;
 import java.util.List;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
 import org.json.JSONException;
 import org.json.JSONObject;
 import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
 
 @Service
 public class InterfaceServiceImpl
   implements InterFaceService
 {
 
   @Resource
   private SysInterfaceMapper sysInterfaceMapper;
 
   @Resource
   private SysParaMapper sysParaMapper;
 
   @Value("${xg_push_msg_android_key}")
   String androidKey;
 
   @Value("${xg_push_msg_android_sercetkey}")
   String androidSercetKey;
 
   @Value("${xg_push_msg_ios_key}")
   String iosKey;
 
   @Value("${xg_push_msg_ios_sercetkey}")
   String iosSercetKey;
 
   public InterfaceModel getThemeSelect()
   {
     return this.sysInterfaceMapper.getThemeSelect();
   }
 
   public InterfaceModel getAvatarUpload()
   {
     return this.sysInterfaceMapper.getAvatarUpload();
   }
 
   public InterfaceModel getTemplate()
   {
     return this.sysInterfaceMapper.getTemplate();
   }
 
   public List<InterfaceModel> getStaTusText()
   {
     List list = this.sysInterfaceMapper.getStatusText();
 
     return list;
   }
 
   public void editStatusText(InterfaceModel interfaceModel)
   {
     this.sysInterfaceMapper.editStatusText(interfaceModel.getStatusText());
   }
 
   public List<InterfaceModel> getInterfaceInfo(HttpServletRequest request)
   {
     String sqlType = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
 
     List<InterfaceModel> interfaceModelList = this.sysInterfaceMapper.getInterfaceInfo();
     for (InterfaceModel interfaceModel : interfaceModelList) {
       if ((interfaceModel.getAttachmentName() != null) && (interfaceModel.getAttachmentId() != null)) {
         interfaceModel.setAttachment(GetAttachmentListUtil.returnAttachment(interfaceModel.getAttachmentName(), interfaceModel.getAttachmentId(), sqlType, "interface"));
       }
 
       if ((interfaceModel.getAttachmentName2() != null) && (interfaceModel.getAttachmentId2() != null)) {
         interfaceModel.setAttachment2(GetAttachmentListUtil.returnAttachment(interfaceModel.getAttachmentName2(), interfaceModel.getAttachmentId2(), sqlType, "interface"));
       }
 
       if ((interfaceModel.getAttachmentName3() != null) && (interfaceModel.getAttachmentId3() != null)) {
         interfaceModel.setAttachment3(GetAttachmentListUtil.returnAttachment(interfaceModel.getAttachmentName3(), interfaceModel.getAttachmentId3(), sqlType, "interface"));
       }
 
       if ((interfaceModel.getAttachmentName4() != null) && (interfaceModel.getAttachmentId4() != null)) {
         interfaceModel.setAttachment4(GetAttachmentListUtil.returnAttachment(interfaceModel.getAttachmentName4(), interfaceModel.getAttachmentId4(), sqlType, "interface"));
       }
 
     }
 
     List sysParatList = this.sysParaMapper.getTheSysParam("LOG_OUT_TEXT");
     SysPara sysPara = this.sysParaMapper.querySysPara("LOG_OUT_TEXT");
     SysPara sysPara1 = this.sysParaMapper.querySysPara("MIIBEIAN");
     SysPara sysPara2 = this.sysParaMapper.querySysPara("IM_WINDOW_CAPTION");
 
     if (interfaceModelList != null) {
       for (InterfaceModel i : interfaceModelList) {
         if ((sysPara != null) || (sysPara1 != null)) {
           i.setLogOutText(sysPara.getParaValue());
           i.setFileNumber(sysPara1.getParaValue());
           i.setTitle(sysPara2.getParaValue());
         }
       }
     }
 
     return interfaceModelList;
   }
 
   public void updateInterfaceInfo(InterfaceModel interfaceModel)
   {
     List statusTextList = this.sysInterfaceMapper.getStatusText();
     if ((statusTextList != null) && (statusTextList.size() == 1)) {
       String statusText = ((InterfaceModel)statusTextList.get(0)).getStatusText();
 
       if (interfaceModel.getStatusText() == null) {
         interfaceModel.setStatusText(statusText);
       }
     }
 
     this.sysInterfaceMapper.updateInterfaceInfo(interfaceModel);
 
     if ((interfaceModel != null) && (interfaceModel.getLogOutText() != null)) {
       SysPara sysPara = new SysPara();
       sysPara.setParaValue(interfaceModel.getLogOutText());
       sysPara.setParaName("LOG_OUT_TEXT");
       this.sysParaMapper.updateSysPara(sysPara);
     }
   }
 
   public void insertInterfaceInfo(InterfaceModel interfaceModel)
   {
     this.sysInterfaceMapper.insertInterfaceInfo(interfaceModel);
   }
 
   public InterfaceModel getIndexInfo()
   {
     InterfaceModel interfaceModel = this.sysInterfaceMapper.getIndexInfo();
     List paras = this.sysParaMapper.getTheSysParam("LOG_OUT_TEXT");
     SysPara sysPara = (SysPara)paras.get(0);
     interfaceModel.setLogOutText(sysPara.getParaValue());
     return interfaceModel;
   }
 
   public BaseWrapper pushMessage(String userId, String app, HttpServletRequest request, String title, String content) throws JSONException
   {
     BaseWrapper baseWrapper = new BaseWrapper();
     baseWrapper.setStatus(true);
     if (StringUtils.checkNull(userId).booleanValue()) {
       baseWrapper.setMsg("参数未传递");
       baseWrapper.setFlag(true);
       baseWrapper.setCode("-1");
     }
     String sqlType = (String)request.getSession().getAttribute("loginDateSouse");
     String jixiema = (String)MachineCode.get16CharMacs().get(0);
     String account = jixiema + userId + sqlType;
     XingeApp pushIos = new XingeApp(Long.parseLong(this.iosKey), this.iosSercetKey);
     XingeApp pushAndroid = new XingeApp(Long.parseLong(this.androidKey), this.androidSercetKey);
     if (StringUtils.checkNull(app).booleanValue()) {
       ClickAction clickAction = new ClickAction();
       clickAction.setActionType(1);
       clickAction.setActivity("123");
       Style style = new Style(0, 0, 0, 1, 1, 1, 0, 1);
       Message mess = new Message();
       mess.setType(1);
       mess.setStyle(style);
       mess.setTitle(title);
       mess.setContent(content);
       mess.setAction(clickAction);
       JSONObject ret = pushAndroid.pushSingleAccount(0, account, mess);
       JSONObject contentTest = new JSONObject();
       JSONObject obj = new JSONObject();
       JSONObject aps = new JSONObject();
       contentTest.put("title", title);
       contentTest.put("body", content);
       aps.put("badge", 1);
       aps.put("alert", contentTest);
       obj.put("aps", aps);
       MessageIOS messageIOS = new MessageIOS();
       messageIOS.setRaw(obj.toString());
       JSONObject ret3 = pushIos.pushSingleAccount(0, account, messageIOS, 1);
       if (("-1".equals(ret3.get("ret_code").toString())) && ("-1".equals(ret.get("ret_code").toString())))
         baseWrapper.setCode(ret3.get("ret_code").toString());
       else {
         baseWrapper.setCode("0");
       }
       baseWrapper.setMsg("推送完成");
       baseWrapper.setFlag(true);
     }
     else if ("ios".equals(app)) {
       JSONObject contentTest = new JSONObject();
       JSONObject obj = new JSONObject();
       JSONObject aps = new JSONObject();
       contentTest.put("title", title);
       contentTest.put("body", content);
       aps.put("badge", 1);
       aps.put("alert", contentTest);
       obj.put("aps", aps);
       MessageIOS messageIOS = new MessageIOS();
       messageIOS.setRaw(obj.toString());
       JSONObject ret3 = pushIos.pushSingleAccount(0, account, messageIOS, 1);
       baseWrapper.setMsg("推送完成");
       baseWrapper.setFlag(true);
       baseWrapper.setCode(ret3.get("ret_code").toString());
     } else {
       ClickAction clickAction = new ClickAction();
       clickAction.setActionType(1);
       clickAction.setActivity("123");
       Style style = new Style(0, 0, 0, 1, 1, 1, 0, 1);
       Message mess = new Message();
       mess.setType(1);
       mess.setStyle(style);
       mess.setTitle(title);
       mess.setContent(content);
       mess.setAction(clickAction);
       JSONObject ret = pushAndroid.pushSingleAccount(0, account, mess);
       baseWrapper.setMsg("推送完成");
       baseWrapper.setFlag(true);
       baseWrapper.setCode(ret.get("ret_code").toString());
     }
 
     return baseWrapper;
   }
 }

