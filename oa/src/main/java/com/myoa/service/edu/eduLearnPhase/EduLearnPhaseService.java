 package com.myoa.service.edu.eduLearnPhase;
 
 import com.myoa.dao.edu.eduLearnPhase.EduLearnPhaseMapper;
import com.myoa.model.edu.eduLearnPhase.EduLearnPhase;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.page.PageParams;

 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class EduLearnPhaseService
 {
 
   @Autowired
   private EduLearnPhaseMapper eduLearnPhaseMapper;
 
   @Transactional
   public ToJson<EduLearnPhase> addEduLearnPhase(EduLearnPhase eduLearnPhase)
   {
     ToJson json = new ToJson(1, "error");
     try {
       int count = this.eduLearnPhaseMapper.insertSelective(eduLearnPhase);
       if (count > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       e.printStackTrace();
       L.e(new Object[] { "EduLearnPhaseService eduLearnPhase:" + e });
     }
     return json;
   }
 
   @Transactional
   public ToJson<EduLearnPhase> delEduLearnPhase(int id)
   {
     ToJson json = new ToJson(1, "error");
     try {
       int count = this.eduLearnPhaseMapper.deleteByPrimaryKey(Integer.valueOf(id));
       if (count > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       e.printStackTrace();
       L.e(new Object[] { "EduLearnPhaseService EduLearnPhase:" + e });
     }
     return json;
   }
 
   @Transactional
   public ToJson<EduLearnPhase> updateEduLearnPhase(EduLearnPhase eduLearnPhase)
   {
     ToJson json = new ToJson(1, "error");
     try {
       int count = this.eduLearnPhaseMapper.updateByPrimaryKeySelective(eduLearnPhase);
       if (count > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       e.printStackTrace();
       L.e(new Object[] { "EduLearnPhaseService updateEduLearnPhase:" + e });
     }
     return json;
   }
 
   public ToJson<EduLearnPhase> selEduLearnPhaseById(int id)
   {
     ToJson json = new ToJson(1, "error");
     try {
       EduLearnPhase eduLearnPhase = this.eduLearnPhaseMapper.selectByPrimaryKey(Integer.valueOf(id));
       json.setFlag(0);
       json.setMsg("ok");
       json.setObject(eduLearnPhase);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       e.printStackTrace();
       L.e(new Object[] { "EduLearnPhaseService selEduLearnPhaseById:" + e });
     }
     return json;
   }
 
   public ToJson<EduLearnPhase> selEduLearnPhase(EduLearnPhase eduLearnPhase, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson json = new ToJson(1, "error");
     try
     {
       PageParams pageParams = new PageParams();
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       pageParams.setUseFlag(Boolean.valueOf(useFlag));
       Map map = new HashMap();
       map.put("page", pageParams);
       map.put("eduLearnPhase", eduLearnPhase);
       List list = this.eduLearnPhaseMapper.selEduLearnPhase(map);
       json.setTotleNum(pageParams.getTotal());
       json.setFlag(0);
       json.setMsg("ok");
       json.setObj(list);
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       e.printStackTrace();
       L.e(new Object[] { "EduLearnPhaseService selEduLearnPhase:" + e });
     }
     return json;
   }
 }
