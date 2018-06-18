 package com.myoa.service.edu.eduElectiveStudent.impl;
 
 import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.myoa.dao.edu.eduElectiveStudent.EduElectiveStudentMapper;
import com.myoa.dao.edu.eduElectiveStudentCount.EduElectiveStudentCountMapper;
import com.myoa.model.edu.eduElectiveStudent.EduElectiveStudent;
import com.myoa.model.edu.eduElectiveStudentCount.EduElectiveStudentCount;
import com.myoa.service.edu.eduElectiveStudent.IEduElectiveStudentService;
import com.myoa.util.ToJson;

 import java.util.List;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class EduElectiveStudentServiceImpl extends ServiceImpl<EduElectiveStudentMapper, EduElectiveStudent>
   implements IEduElectiveStudentService
 {
 
   @Resource
   private EduElectiveStudentMapper eduElectiveStudentMapper;
 
   @Resource
   private EduElectiveStudentCountMapper eduElectiveStudentCountMapper;
 
   public ToJson eduElectiveStudentSelect(HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try {
       String electiveCourse = request.getParameter("electiveCourse");
       List list = this.eduElectiveStudentMapper.eduElectiveStudentSelect(electiveCourse);
       if (list.size() > 0) {
         json.setObject(list);
         json.setMsg("ok");
         json.setFlag(0);
       } else {
         json.setMsg("err");
         json.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson eduElectiveStudentClass(HttpServletRequest request)
   {
     ToJson json = new ToJson();
     String nid = request.getParameter("nid");
     try {
       List list = this.eduElectiveStudentMapper.eduElectiveStudentClass(nid);
       if (list != null) {
         json.setObject(list);
         json.setMsg("ok");
         json.setFlag(1);
       } else {
         json.setFlag(0);
         json.setMsg("err");
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson eduElectiveStudentDelete(HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try {
       int id = Integer.parseInt(request.getParameter("id"));
       int count = this.eduElectiveStudentMapper.eduElectiveStudentDelete(Integer.valueOf(id));
       if (count > 0) {
         count = this.eduElectiveStudentCountMapper.eduElecctiveStudentCountUpdate(Integer.valueOf(id));
         if (count > 0) {
           json.setMsg("ok");
           json.setFlag(0);
         } else {
           json.setMsg("err");
           json.setFlag(1);
         }
       } else {
         json.setMsg("err");
         json.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson eduElectiveStudentInsert(EduElectiveStudent[] eduElectiveStudent)
   {
     ToJson json = new ToJson();
     try
     {
       for (int i = 0; i < eduElectiveStudent.length; i++) {
         EduElectiveStudent eduElectiveStudent1 = eduElectiveStudent[i];
         int count = this.eduElectiveStudentMapper.eduElectiveStudentInsert(eduElectiveStudent1);
         if (count > 0)
         {
           EduElectiveStudentCount eduElectiveStudentCount = this.eduElectiveStudentCountMapper.eduElectiveOneSelect(eduElectiveStudent1.getStudentId());
           if (eduElectiveStudentCount.getNidCount().intValue() >= 0) {
             count = this.eduElectiveStudentCountMapper.eduElecctiveStudentCountUpdateAccumulation(eduElectiveStudentCount.getId());
             if (count > 0) {
               json.setMsg("ok");
               json.setFlag(0);
             } else {
               json.setMsg("err");
               json.setFlag(1);
             }
           } else {
             eduElectiveStudentCount.setStudentId(eduElectiveStudent1.getStudentId());
             eduElectiveStudentCount.setClassId(eduElectiveStudent1.getClassId());
             eduElectiveStudentCount.setSid(eduElectiveStudent1.getSid());
             eduElectiveStudentCount.setNidCount(Integer.valueOf(1));
             count = this.eduElectiveStudentCountMapper.eduElecctiveStudentCountInsert(eduElectiveStudentCount);
             if (count > 0) {
               json.setMsg("ok");
               json.setFlag(0);
             } else {
               json.setMsg("err");
               json.setFlag(1);
             }
           }
         } else {
           json.setMsg("err");
           json.setFlag(1);
         }
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 }

