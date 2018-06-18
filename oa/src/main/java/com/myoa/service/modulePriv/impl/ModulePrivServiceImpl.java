 package com.myoa.service.modulePriv.impl;
 
 import com.myoa.dao.modulePriv.ModulePrivMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.modulePriv.ModulePriv;
import com.myoa.model.users.Users;
import com.myoa.service.modulePriv.ModulePrivService;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;

 import java.util.List;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class ModulePrivServiceImpl
   implements ModulePrivService
 {
 
   @Resource
   private ModulePrivMapper modulePrivMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Transactional
   public ToJson<ModulePriv> saveModulePriv(ModulePriv modulePriv, String applyModules, String applyDepts, String applyPrivs)
   {
     ToJson json = new ToJson();
     try
     {
       if ((modulePriv.getDeptId() == null) || (modulePriv.getPrivId() == null)) {
         this.modulePrivMapper.deleteModulePriv(modulePriv);
 
         if (!StringUtils.checkNull(applyModules).booleanValue()) {
           String[] moduleIds = applyModules.split(",");
           for (String moduleId : moduleIds) {
             modulePriv.setModuleId(Integer.valueOf(moduleId));
             this.modulePrivMapper.deleteModulePriv(modulePriv);
           }
         }
 
         if ((!StringUtils.checkNull(applyDepts).booleanValue()) && (!StringUtils.checkNull(applyPrivs).booleanValue())) {
           String[] deptIds = applyDepts.split(",");
           String[] privIds = applyPrivs.split(",");
           List<Users> usersByDeptAndPriv = this.usersMapper.getUsersByDeptAndPriv(deptIds, privIds);
           if ((usersByDeptAndPriv != null) && (usersByDeptAndPriv.size() > 0)) {
             StringBuffer sb = new StringBuffer();
             for (Users entity : usersByDeptAndPriv) {
               sb.append(entity.getUid() + ",");
             }
             this.modulePrivMapper.deleteModulePrivs(sb.toString().split(","), modulePriv.getModuleId());
           }
         }
       } else {
         ModulePriv modulePrivSingle = this.modulePrivMapper.getModulePrivSingle(modulePriv);
         if (modulePrivSingle != null)
           this.modulePrivMapper.updateModulePriv(modulePriv);
         else {
           this.modulePrivMapper.addModulePriv(modulePriv);
         }
 
         if (!StringUtils.checkNull(applyModules).booleanValue()) {
           String[] moduleIds = applyModules.split(",");
           for (String moduleId : moduleIds) {
             modulePriv.setModuleId(Integer.valueOf(moduleId));
             ModulePriv modulePrivSingle2 = this.modulePrivMapper.getModulePrivSingle(modulePriv);
             if (modulePrivSingle2 != null)
               this.modulePrivMapper.updateModulePriv(modulePriv);
             else {
               this.modulePrivMapper.addModulePriv(modulePriv);
             }
           }
         }
 
         if ((!StringUtils.checkNull(applyDepts).booleanValue()) && (!StringUtils.checkNull(applyPrivs).booleanValue())) {
           String[] deptIds = applyDepts.split(",");
           String[] privIds = applyPrivs.split(",");
           List<Users> usersByDeptAndPriv = this.usersMapper.getUsersByDeptAndPriv(deptIds, privIds);
           for (Users entity : usersByDeptAndPriv) {
             modulePriv.setUid(entity.getUid());
             ModulePriv modulePrivSingle3 = this.modulePrivMapper.getModulePrivSingle(modulePriv);
             if (modulePrivSingle3 != null)
               this.modulePrivMapper.updateModulePriv(modulePriv);
             else {
               this.modulePrivMapper.addModulePriv(modulePriv);
             }
           }
         }
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
 
   @Transactional
   public ToJson<ModulePriv> updateModulePriv(ModulePriv modulePriv)
   {
     ToJson json = new ToJson();
     try {
       if ((modulePriv.getDeptId() == null) || (modulePriv.getPrivId() == null)) {
         this.modulePrivMapper.deleteModulePriv(modulePriv);
         json.setMsg("ok");
         json.setFlag(0);
       } else {
         this.modulePrivMapper.updateModulePriv(modulePriv);
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
       L.e(new Object[] { "ModulePrivServiceImpl updateModulePriv:" + e });
     }
     return json;
   }
 
   public ToJson<ModulePriv> deleteModulePriv(ModulePriv modulePriv)
   {
     ToJson json = new ToJson();
     try {
       this.modulePrivMapper.deleteModulePriv(modulePriv);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<ModulePriv> getModulePrivSingle(ModulePriv modulePriv)
   {
     ToJson json = new ToJson();
     try {
       ModulePriv modulePrivByUid = this.modulePrivMapper.getModulePrivSingle(modulePriv);
       json.setObject(modulePrivByUid);
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

