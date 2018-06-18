 package com.myoa.service.edu.eduStudentExt.impl;
 
 import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.myoa.dao.edu.eduStudentExt.EduStudentExtMapper;
import com.myoa.model.edu.eduStudentExt.EduStudentExt;
import com.myoa.service.edu.eduStudentExt.IEduStudentExtService;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;

 import java.util.List;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class EduStudentExtServiceImpl extends ServiceImpl<EduStudentExtMapper, EduStudentExt>
   implements IEduStudentExtService
 {
 
   @Resource
   EduStudentExtMapper eduStudentExtMapper;
 
   public ToJson<EduStudentExt> getSemeter(HttpServletRequest request, EduStudentExt eduStudentExt)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       List list = this.eduStudentExtMapper.getSemeter(eduStudentExt);
       if (list != null) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("列表数据为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "EduStudentExtServiceImpl getSemeter:" + e });
     }
     return toJson;
   }
 }

