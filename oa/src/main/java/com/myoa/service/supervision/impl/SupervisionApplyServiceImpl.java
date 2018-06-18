 package com.myoa.service.supervision.impl;
 
 import com.myoa.dao.supervision.SupervisionApplyMapper;
import com.myoa.dao.supervision.SupervisionMapper;
import com.myoa.model.supervision.Supervision;
import com.myoa.model.supervision.SupervisionApply;
import com.myoa.service.supervision.SupervisionApplyService;
import com.myoa.util.DateFormat;
import com.myoa.util.ToJson;

 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class SupervisionApplyServiceImpl
   implements SupervisionApplyService
 {
 
   @Autowired
   SupervisionApplyMapper supervisionApplyMapper;
 
   @Autowired
   SupervisionMapper supervisionMapper;
 
   @Transactional
   public ToJson<SupervisionApply> insertSupApply(HttpServletRequest request, SupervisionApply supervisionApply)
   {
     ToJson toJson = new ToJson();
     try {
       Supervision supervision = new Supervision();
				Supervision sup	=null;
       String userId = (String)request.getSession().getAttribute("userId");
       supervisionApply.setCreaterId(userId);
       String currentTime = DateFormat.getCurrentTime();
       supervisionApply.setCreateTime(currentTime);
       int abc = supervisionApply.getType().intValue();
       switch (abc) {
       case 1:
         if (supervisionApply.getStatus().intValue() != 0) break;
         sup = new Supervision();
         sup.setSid(supervisionApply.getSupId());
         sup.setStatus(Integer.valueOf(2));
         int a = this.supervisionMapper.updateByPrimaryKeySelective(sup);
         if (a < 1) {
           return toJson;
         }
         break;
       case 2:
         if (supervisionApply.getStatus().intValue() != 0) break;
         sup = new Supervision();
         sup.setSid(supervisionApply.getSupId());
         sup.setStatus(Integer.valueOf(4));
         int e = this.supervisionMapper.updateByPrimaryKeySelective(sup);
         if (e < 1) {
           return toJson;
         }
         break;
       case 3:
         if (supervisionApply.getStatus().intValue() != 0) break;
         sup = new Supervision();
         sup.setSid(supervisionApply.getSupId());
         sup.setStatus(Integer.valueOf(5));
         sup.setRealEndTime(DateFormat.getCurrentTime());
         int b = this.supervisionMapper.updateByPrimaryKeySelective(sup);
         if (b < 1) {
           return toJson;
         }
         break;
       }
 
       int b = this.supervisionApplyMapper.addSupervisionApply(supervisionApply);
       if (b > 0) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
       } else {
         toJson.setFlag(1);
         toJson.setMsg("新增失败");
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<SupervisionApply> updateStatus(HttpServletRequest request, SupervisionApply supervisionApply)
   {
     ToJson toJson = new ToJson(1, "error");
     try
     {
       int abc = supervisionApply.getType().intValue();
       switch (abc) {
       case 1:
         if (supervisionApply.getStatus().intValue() == 1) {
           Supervision sup = new Supervision();
           sup.setSid(supervisionApply.getSupId());
           sup.setStatus(Integer.valueOf(3));
           int a = this.supervisionMapper.updateByPrimaryKeySelective(sup);
           if (a < 1)
             return toJson;
         }
         else {
           Supervision sup = new Supervision();
           sup.setSid(supervisionApply.getSupId());
           sup.setStatus(Integer.valueOf(1));
           int a = this.supervisionMapper.updateByPrimaryKeySelective(sup);
           if (a < 1) {
             return toJson;
           }
         }
         int a = this.supervisionApplyMapper.updateStatus(supervisionApply);
         if (a >= 1) break;
         return toJson;
       case 2:
         if (supervisionApply.getStatus().intValue() == 1) {
           Supervision sup = new Supervision();
           sup.setSid(supervisionApply.getSupId());
           sup.setStatus(Integer.valueOf(1));
           int e = this.supervisionMapper.updateByPrimaryKeySelective(sup);
           if (e < 1)
             return toJson;
         }
         else {
           Supervision sup = new Supervision();
           sup.setSid(supervisionApply.getSupId());
           sup.setStatus(Integer.valueOf(3));
           int e = this.supervisionMapper.updateByPrimaryKeySelective(sup);
           if (e < 1) {
             return toJson;
           }
         }
         int e = this.supervisionApplyMapper.updateStatus(supervisionApply);
         if (e >= 1) break;
         return toJson;
       case 3:
         if (supervisionApply.getStatus().intValue() == 1) {
           Supervision sup = new Supervision();
           sup.setSid(supervisionApply.getSupId());
           sup.setStatus(Integer.valueOf(6));
           sup.setRealEndTime(DateFormat.getCurrentTime());
           int b = this.supervisionMapper.updateByPrimaryKeySelective(sup);
           if (b < 1)
             return toJson;
         }
         else if (supervisionApply.getStatus().intValue() == 3) {
           Supervision sup = new Supervision();
           sup.setSid(supervisionApply.getSupId());
           sup.setStatus(Integer.valueOf(1));
           int b = this.supervisionMapper.updateByPrimaryKeySelective(sup);
           if (b < 1) {
             return toJson;
           }
 
         }
 
         int b = this.supervisionApplyMapper.updateStatus(supervisionApply);
         if (b >= 1) break;
         return toJson;
       case 4:
         if (supervisionApply.getStatus().intValue() == 1) {
           Supervision sup = new Supervision();
           sup.setSid(supervisionApply.getSupId());
           sup.setStatus(Integer.valueOf(4));
           int c = this.supervisionMapper.updateByPrimaryKeySelective(sup);
           if (c < 1)
             return toJson;
         }
         else {
           Supervision sup = new Supervision();
           sup.setSid(supervisionApply.getSupId());
           sup.setStatus(Integer.valueOf(3));
           int c = this.supervisionMapper.updateByPrimaryKeySelective(sup);
           if (c < 1) {
             return toJson;
           }
         }
         int c = this.supervisionApplyMapper.updateStatus(supervisionApply);
         if (c >= 1) break;
         return toJson;
       }
 
       toJson.setFlag(0);
       toJson.setMsg("操作成功");
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<SupervisionApply> getStatusInfor(HttpServletRequest request, Integer status)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       String createrId = (String)request.getSession().getAttribute("userId");
       SupervisionApply sup = new SupervisionApply();
       sup.setCreaterId(createrId);
       List list = this.supervisionApplyMapper.getStatusInfor(sup);
       if (list.size() > 0) {
         toJson.setObj(list);
         toJson.setFlag(0);
         toJson.setMsg("OK");
       } else {
         toJson.setMsg("err");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<SupervisionApply> getSupApplyByStatus(HttpServletRequest request, SupervisionApply supervisionApply)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       supervisionApply.setCreaterId((String)request.getSession().getAttribute("userId"));
       List list = this.supervisionApplyMapper.getStatusInfor(supervisionApply);
       if (list.size() > 0) {
         toJson.setObj(list);
         toJson.setFlag(0);
         toJson.setMsg("OK");
       } else {
         toJson.setMsg("err");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 }

