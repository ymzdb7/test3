 package com.myoa.service.users.impl;
 
 import com.myoa.dao.unitmanagement.UnitManageMapper;
import com.myoa.dao.users.OrgManageMapper;
import com.myoa.model.users.OrgManage;
import com.myoa.service.sys.SystemInfoService;
import com.myoa.service.users.OrgManageService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;

 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Transactional
 @Service
 public class OrgManageServiceImpl
   implements OrgManageService
 {
 
   @Resource
   private UnitManageMapper unitManageMapper;
 
   @Resource
   private OrgManageMapper orgManageMapper;
 
   @Resource
   private SystemInfoService systemInfoService;
 
   public ToJson<OrgManage> queryId(String locale)
   {
     ToJson toJson = new ToJson(0, "");
     List org = this.orgManageMapper.queryId();
     if ((org != null) && (org.size() > 0))
     {
       toJson.setFlag(0);
       toJson.setMsg("ok");
       toJson.setObj(org);
     }
     else {
       toJson.setFlag(1);
       toJson.setMsg("err");
     }
 
     return toJson;
   }
 
   public List<OrgManage> getOrgManage()
   {
     List orgManageList = this.orgManageMapper.getOrgManage();
     return orgManageList;
   }
 
   public OrgManage getOrgManageById(Integer oid)
   {
     return this.orgManageMapper.getOrgManageById(oid);
   }
 
   public void editOrgManage(OrgManage orgManage, HttpServletRequest request)
   {
     int a = this.orgManageMapper.editOrgManage(orgManage);
     int a1;
     if (a > 0) {
       Map stringStringMap = this.systemInfoService.getAuthorization(request);
       if ("true".equals(stringStringMap.get("isAuthStr")))
         a1 = this.unitManageMapper.updateUnit(Constant.MYOA + orgManage.getOid(), orgManage.getName(), Integer.valueOf(1));
     }
   }
 
   public ToJson<OrgManage> addOrgManage(OrgManage orgManage, HttpServletRequest request)
   {
     ToJson toJson = new ToJson();
     int i = this.systemInfoService.getOrgManage(request);
     List orgManageList = this.orgManageMapper.getOrgManage();
     if (orgManageList.size() < i) {
       this.orgManageMapper.addOrgManage(orgManage);
       toJson.setFlag(0);
       toJson.setMsg("ok");
     } else {
       toJson.setFlag(1);
       toJson.setMsg("err");
     }
     return toJson;
   }
 
   public BaseWrapper checkOrgManage(HttpServletRequest request)
   {
     BaseWrapper wrapper = new BaseWrapper();
     wrapper.setFlag(false);
     wrapper.setCode("-1");
     wrapper.setMsg("默认调用失败");
     int i = this.systemInfoService.getOrgManage(request);
     List orgManageList = this.orgManageMapper.getOrgManage();
     if (orgManageList == null) {
       wrapper.setFlag(true);
       wrapper.setCode("-11111");
       wrapper.setMsg("没有企业信息");
       return wrapper;
     }
     if (orgManageList.size() >= i) {
       wrapper.setFlag(false);
       wrapper.setCode("8001");
       wrapper.setMsg("企业数达到注册上线，如需增加请联系厂商。");
       return wrapper;
     }
     wrapper.setFlag(true);
     wrapper.setCode("8002");
     wrapper.setMsg("可以新增企业。");
     return wrapper;
   }
 }

