 package com.myoa.service.edu.eduElectiveDetail.impl;
 
 import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.myoa.dao.edu.eduElectiveCourse.EduElectiveCourseMapper;
import com.myoa.dao.edu.eduElectiveDetail.EduElectiveDetailMapper;
import com.myoa.dao.edu.eduElectivePublish.EduElectivePublishMapper;
import com.myoa.model.edu.eduElectiveDetail.EduElectiveDetail;
import com.myoa.model.edu.eduElectivePublish.EduElectivePublish;
import com.myoa.service.edu.eduElectiveDetail.IEduElectiveDetailService;
import com.myoa.util.ToJson;

 import java.beans.Transient;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class EduElectiveDetailServiceImpl extends ServiceImpl<EduElectiveDetailMapper, EduElectiveDetail>
   implements IEduElectiveDetailService
 {
 
   @Resource
   private EduElectiveDetailMapper eduElectiveDetailMapper;
 
   @Resource
   private EduElectivePublishMapper eduElectivePublishMapper;
 
   @Resource
   private EduElectiveCourseMapper eduElectiveCourseMapper;
 
   public ToJson<EduElectiveDetail> eduSelectOneDetail(Integer sid)
   {
     ToJson json = new ToJson();
     EduElectiveDetail eduElectiveDetail = this.eduElectiveDetailMapper.eduSelectOneDetail(sid);
     if (eduElectiveDetail != null) {
       json.setObject(eduElectiveDetail);
       json.setFlag(0);
       json.setMsg("ok");
     } else {
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   @Transient
   public ToJson eduUpdateDetail(EduElectiveDetail eduElectiveDetail, HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try
     {
       Integer counts = Integer.valueOf(0);
       EduElectivePublish eduElectivePublish = new EduElectivePublish();
       eduElectivePublish.setId(eduElectiveDetail.getSid());
       eduElectivePublish.setElectiveCourse(request.getParameter("electiveCourse"));
 
       int countr = this.eduElectivePublishMapper.updateEduPublish(eduElectivePublish);
       if (countr > 0)
       {
         EduElectiveDetail eduElectiveDetail1 = this.eduElectiveDetailMapper.eduSelectOneDetailTO(eduElectiveDetail.getSid());
         if (eduElectiveDetail1 != null) {
           int count = this.eduElectiveDetailMapper.eduUpdateDetail(eduElectiveDetail);
           if (count > 0) {
             json.setMsg("ok");
             json.setFlag(0);
           } else {
             json.setFlag(1);
             json.setMsg("err");
           }
         }
         eduElectiveDetail.setNid(Integer.valueOf(request.getParameter("nid")));
         eduElectiveDetail.setCounts(counts);
         int count = this.eduElectiveDetailMapper.insertDetail(eduElectiveDetail);
         if (count > 0) {
           json.setMsg("ok");
           json.setFlag(0);
         } else {
           json.setFlag(1);
           json.setMsg("err");
         }
       } else {
         json.setFlag(1);
         json.setMsg("err");
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 }

