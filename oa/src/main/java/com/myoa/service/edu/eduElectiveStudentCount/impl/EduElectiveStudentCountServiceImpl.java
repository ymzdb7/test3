 package com.myoa.service.edu.eduElectiveStudentCount.impl;
 
 import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.myoa.dao.edu.eduElectivePublish.EduElectivePublishMapper;
import com.myoa.dao.edu.eduElectiveStudentCount.EduElectiveStudentCountMapper;
import com.myoa.dao.edu.eduStudent.EduStudentMapper;
import com.myoa.model.edu.eduElectiveStudentCount.EduElectiveStudentCount;
import com.myoa.service.edu.eduElectiveStudentCount.IEduElectiveStudentCountService;
import com.myoa.util.ToJson;

 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class EduElectiveStudentCountServiceImpl extends ServiceImpl<EduElectiveStudentCountMapper, EduElectiveStudentCount>
   implements IEduElectiveStudentCountService
 {
 
   @Resource
   private EduElectiveStudentCountMapper eduElectiveStudentCountMapper;
 
   @Resource
   private EduElectivePublishMapper eduElectivePublishMapper;
 
   @Resource
   private EduStudentMapper eduStudentMapper;
 
   public ToJson<EduElectiveStudentCount> eudSelectStudentCount(EduElectiveStudentCount eduElectiveStudentCount)
   {
     ToJson json = new ToJson();
     int contsum = 0;
     try {
       List<EduElectiveStudentCount> list = this.eduElectiveStudentCountMapper.eudSelectStudentCount(eduElectiveStudentCount);
       if (list.size() > 0) {
         for (EduElectiveStudentCount eduElectiveStudentCount1 : list)
         {
           contsum = this.eduStudentMapper.studentSelectSum(eduElectiveStudentCount1.getClassId());
           eduElectiveStudentCount1.setContsum(Integer.valueOf(contsum));
           eduElectiveStudentCount1.setDeptFunc(this.eduElectiveStudentCountMapper.classIDName(eduElectiveStudentCount1.getClassId()));
           json.setObj(list);
           json.setMsg("ok");
           json.setFlag(0);
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
 
   public ToJson eudSelectClassStudentCount(Map<String, Object> map)
   {
     ToJson json = new ToJson();
     try {
       List list = this.eduElectiveStudentCountMapper.eudSelectClassStudentCount(map);
       if (list.size() > 0) {
         json.setObject(list);
         json.setMsg("ok");
         json.setFlag(0);
       } else {
         json.setMsg("err");
         json.setFlag(0);
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson eduElecctiveStudentCountSum(Map<String, Object> map)
   {
     ToJson json = new ToJson();
     try {
       List list = this.eduElectiveStudentCountMapper.eduElecctiveStudentCountSum(map);
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
 
   public ToJson eduElecctiveStudentCountUpdate(Integer id)
   {
     ToJson json = new ToJson();
     try {
       int count = this.eduElectiveStudentCountMapper.eduElecctiveStudentCountUpdate(id);
       if (count > 0) {
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
 
   public ToJson eduElecctiveStudentCountUpdateAccumulation(Integer id)
   {
     ToJson json = new ToJson();
     try {
       int count = this.eduElectiveStudentCountMapper.eduElecctiveStudentCountUpdateAccumulation(id);
       if (count > 0) {
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
 
   public ToJson eduElecctiveStudentCountInsert(EduElectiveStudentCount eduElectiveStudentCount)
   {
     ToJson json = new ToJson();
     try {
       int count = this.eduElectiveStudentCountMapper.eduElecctiveStudentCountInsert(eduElectiveStudentCount);
       if (count > 0) {
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
 
   public ToJson<EduElectiveStudentCount> eduElectiveOneSelect(String id)
   {
     ToJson json = new ToJson();
     try {
       EduElectiveStudentCount eduElectiveStudentCount = this.eduElectiveStudentCountMapper.eduElectiveOneSelect(id);
       if ((eduElectiveStudentCount != null) && 
         (eduElectiveStudentCount.getNidCount() != null) && (eduElectiveStudentCount.getNidCount().intValue() != 0)) {
         json.setMsg("ok");
         json.setFlag(0);
         json.setObject(eduElectiveStudentCount);
         return json;
       }
 
       json.setMsg("err");
       json.setFlag(1);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson eduClassStudent(HttpServletRequest request)
   {
     ToJson json = new ToJson();
     int classId = Integer.parseInt(request.getParameter("classId"));
     int sid = Integer.parseInt(request.getParameter("sid"));
 
     Map hashMap = new HashMap();
     Map hamap = new HashMap();
     try {
       List<Map<String,Object>> list = this.eduElectiveStudentCountMapper.eduClassStudent(Integer.valueOf(classId));
       if (list != null) {
         for (Map map : list) {
           String studentId = map.get("userId").toString();
           hashMap.put("sid", Integer.valueOf(sid));
           hashMap.put("classId", Integer.valueOf(classId));
           hashMap.put("studentId", studentId);
           Integer nidCount = this.eduElectiveStudentCountMapper.eduMaxElective(hashMap);
           if (nidCount == null) {
             nidCount = Integer.valueOf(0);
           }
           hamap.put("nid", Integer.valueOf(sid));
           hamap.put("classId", Integer.valueOf(classId));
           Integer maxClass = this.eduElectivePublishMapper.studentIDClassID(hamap);
           if (maxClass == null) {
             maxClass = Integer.valueOf(0);
           }
           map.put("maxClass", maxClass);
           map.put("nidCount", nidCount);
         }
         json.setObj(list);
         json.setFlag(1);
         json.setMsg("ok");
       } else {
         json.setFlag(1);
         json.setMsg("eer");
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson eduMaxElective(Map<String, Object> map)
   {
     return null;
   }
 
   public ToJson<Map<String, Object>> studentClassIdName(Integer sid)
   {
     ToJson json = new ToJson();
     try {
       List<Map<String, Object>> list = this.eduElectiveStudentCountMapper.studentClassIdName(sid);
       for (Map map : list) {
         String classStudentName = this.eduElectiveStudentCountMapper.classIDName((Integer)map.get("classId"));
         map.put("classStudentName", classStudentName);
       }
       if (list.size() > 0) {
         json.setMsg("ok");
         json.setFlag(0);
         json.setObj(list);
         return json;
       }
       json.setMsg("err");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson eduClassIdXuanKeId(Map<String, Object> map)
   {
     ToJson json = new ToJson();
     try {
       List list = this.eduElectiveStudentCountMapper.eduClassIdXuanKeId(map);
       if (list.size() > 0) {
         json.setFlag(0);
         json.setMsg("ok");
         json.setObj(list);
         return json;
       }
       json.setFlag(0);
       json.setMsg("err");
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 }

