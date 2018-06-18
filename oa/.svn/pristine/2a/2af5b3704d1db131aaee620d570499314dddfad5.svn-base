 package com.myoa.service.edu.eduCourse.impl;
 
 import com.myoa.dao.edu.eduCourse.EduCourseMapper;
import com.myoa.model.edu.eduCourse.EduCourse;
import com.myoa.model.edu.eduCourse.EduCourseWithBLOBs;
import com.myoa.model.enclosure.Attachment;
import com.myoa.service.edu.eduCourse.EduCourseService;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ToJson;

 import java.beans.Transient;
 import java.util.List;
 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class EduCourseServiceImpl
   implements EduCourseService
 {
 
   @Resource
   private EduCourseMapper eduCourseMapper;
 
   @Transient
   public ToJson<EduCourseWithBLOBs> selectEdu(EduCourse eduCourse)
   {
     ToJson json = new ToJson();
     try {
       List edulsit = this.eduCourseMapper.selectByExample(eduCourse);
       if (edulsit.size() > 0) {
         json.setObj(edulsit);
         json.setMsg("ok");
         json.setFlag(0);
         return json;
       }
       json.setMsg("false");
       json.setFlag(1);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   @Transient
   public ToJson insertEdu(EduCourseWithBLOBs eduCourseWithBLOBs)
   {
     ToJson toJson = new ToJson();
     try {
       if (eduCourseWithBLOBs.getCourseId() == null)
         eduCourseWithBLOBs.setCourseId("无");
       else if (eduCourseWithBLOBs.getOrderNo() == null)
         eduCourseWithBLOBs.setOrderNo(Integer.valueOf(0));
       else if (eduCourseWithBLOBs.getStage() == null)
         eduCourseWithBLOBs.setStage("无");
       else if (eduCourseWithBLOBs.getCourseName() == null)
         eduCourseWithBLOBs.setCourseName("无");
       else if (eduCourseWithBLOBs.getCourseScore() == null)
         eduCourseWithBLOBs.setCourseScore("无");
       else if (eduCourseWithBLOBs.getCourseDescription() == null)
         eduCourseWithBLOBs.setCourseDescription("无");
       else if (eduCourseWithBLOBs.getCreateUser() == null)
         eduCourseWithBLOBs.setCreateUser("无");
       else if (eduCourseWithBLOBs.getViewPriv() == null)
         eduCourseWithBLOBs.setViewPriv("无");
       else if (eduCourseWithBLOBs.getEditPriv() == null)
         eduCourseWithBLOBs.setEditPriv("无");
       else if (eduCourseWithBLOBs.getAttachmentId() == null)
         eduCourseWithBLOBs.setAttachmentId("无");
       else if (eduCourseWithBLOBs.getAttachmentName() == null)
         eduCourseWithBLOBs.setAttachmentName("无");
       else if (eduCourseWithBLOBs.getRealm() == null)
         eduCourseWithBLOBs.setRealm("无");
       else if (eduCourseWithBLOBs.getCourseType() == null)
         eduCourseWithBLOBs.setCourseType("无");
       else if (eduCourseWithBLOBs.getDepartment() == null)
         eduCourseWithBLOBs.setDepartment("无");
       else if (eduCourseWithBLOBs.getGuidance() == null)
         eduCourseWithBLOBs.setGuidance("无");
       else if (eduCourseWithBLOBs.getCreditHours() == null)
         eduCourseWithBLOBs.setCreditHours(Integer.valueOf(0));
       else if (eduCourseWithBLOBs.getMaxMember() == null)
         eduCourseWithBLOBs.setMaxMember(Integer.valueOf(0));
       else if (eduCourseWithBLOBs.getGradeReq() == null)
         eduCourseWithBLOBs.setGradeReq("无");
       else if (eduCourseWithBLOBs.getAcademyReq() == null)
         eduCourseWithBLOBs.setAcademyReq("无");
       else if (eduCourseWithBLOBs.getSexReq() == null)
         eduCourseWithBLOBs.setSexReq("无");
       else if (eduCourseWithBLOBs.getClassTimeReq() == null)
         eduCourseWithBLOBs.setClassTimeReq("无");
       else if (eduCourseWithBLOBs.getSiteReq() == null) {
         eduCourseWithBLOBs.setSiteReq("无");
       }
       int count = this.eduCourseMapper.insertSelective(eduCourseWithBLOBs);
       if (count > 0) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
         return toJson;
       }
       toJson.setFlag(1);
       toJson.setMsg("false");
     } catch (Exception e) {
       e.printStackTrace();
     }
     return toJson;
   }
 
   @Transient
   public ToJson deleteByPrimaryKey(Integer id)
   {
     ToJson toJson = new ToJson();
     try {
       this.eduCourseMapper.deleteByPrimaryKey(id);
       toJson.setFlag(1);
       toJson.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setFlag(0);
       toJson.setMsg("false");
     }
     return toJson;
   }
 
   public ToJson<EduCourseWithBLOBs> selectByPrimaryKey(Integer id)
   {
     ToJson toJson = new ToJson();
     List list = null;
     try {
       EduCourseWithBLOBs eduCourseWithBLOBs = this.eduCourseMapper.selectByPrimaryKey(id);
       if ((eduCourseWithBLOBs.getAttachmentName() != null) && (eduCourseWithBLOBs.getAttachmentId() != null)) {
         list = GetAttachmentListUtil.returnAttachment(eduCourseWithBLOBs.getAttachmentName(), eduCourseWithBLOBs.getAttachmentId(), null, null);
         eduCourseWithBLOBs.setAttUrl(((Attachment)list.get(0)).getAttUrl());
       }
       if (eduCourseWithBLOBs != null) {
         toJson.setObject(eduCourseWithBLOBs);
         toJson.setMsg("ok");
         toJson.setFlag(0);
         return toJson;
       }
       toJson.setFlag(0);
       toJson.setMsg("err");
     } catch (Exception e) {
       e.printStackTrace();
     }
     return toJson;
   }
 
   @Transient
   public ToJson updateByPrimaryKeySelective(EduCourseWithBLOBs eduCourseWithBLOBs)
   {
     ToJson toJson = new ToJson();
     try {
       int count = this.eduCourseMapper.updateByPrimaryKeySelective(eduCourseWithBLOBs);
       if (count > 0) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
         return toJson;
       }
       toJson.setFlag(1);
       toJson.setMsg("err");
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setFlag(1);
       toJson.setMsg("false");
     }
     return toJson;
   }
 
   @Transient
   public ToJson updateKey(EduCourse eduCourse)
   {
     ToJson toJson = new ToJson();
     try {
       this.eduCourseMapper.updatekey(eduCourse);
       toJson.setFlag(1);
       toJson.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setFlag(0);
       toJson.setMsg("false");
     }
     return toJson;
   }
 }

