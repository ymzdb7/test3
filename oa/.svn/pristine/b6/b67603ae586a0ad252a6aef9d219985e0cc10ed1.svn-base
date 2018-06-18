 package com.myoa.service.workPlan;
 
 import com.myoa.dao.workPlan.PlanTypeMapper;
import com.myoa.model.workPlan.PlanType;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;

 import java.util.List;
 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class PlanTypeService
 {
 
   @Resource
   private PlanTypeMapper planTypeMapper;
 
   public ToJson<PlanType> insertPlanType(PlanType planType)
   {
     ToJson json = new ToJson(1, "error");
     try {
       int count = this.planTypeMapper.insertPlanType(planType);
       if (count > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "PlanTypeService insertPlanType:" + e });
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<PlanType> updatePlanTypeById(PlanType planType)
   {
     ToJson json = new ToJson(1, "error");
     try {
       int count = this.planTypeMapper.updatePlanTypeById(planType);
       if (count > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "PlanTypeService updatePlanTypeById:" + e });
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<PlanType> deletePlanTypeById(int typeId)
   {
     ToJson json = new ToJson(1, "error");
     try {
       int count = this.planTypeMapper.deletePlanTypeById(typeId);
       if (count > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "PlanTypeService deletePlanTypeById:" + e });
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<PlanType> selectPlanTypeById(int typeId)
   {
     ToJson json = new ToJson(1, "error");
     try {
       PlanType planType = this.planTypeMapper.selectPlanTypeById(typeId);
       json.setObject(planType);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "PlanTypeService selectPlanTypeById:" + e });
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<PlanType> selAllPlanType()
   {
     ToJson json = new ToJson(1, "error");
     try {
       List planTypeList = this.planTypeMapper.selAllPlanType();
       json.setObj(planTypeList);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       L.e(new Object[] { "PlanTypeService selAllPlanType:" + e });
       e.printStackTrace();
     }
     return json;
   }
 }

