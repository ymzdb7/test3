 package com.myoa.service.portalArticle.impl;
 
 import com.myoa.dao.portalArticle.PortalArticleMapper;
import com.myoa.dao.portalColumn.PortalColumnMapper;
import com.myoa.model.portalArticle.PortalArticle;
import com.myoa.model.portalArticle.PortalArticleWithBLOBs;
import com.myoa.service.portalArticle.PortalArticleService;
import com.myoa.util.ToJson;

 import java.util.List;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class PortalArticleServiceImpl
   implements PortalArticleService
 {
 
   @Resource
   private PortalArticleMapper portalArticleMapper;
 
   @Resource
   private PortalColumnMapper portalColumnMapper;
 
   @Transactional
   public ToJson<PortalArticleWithBLOBs> selectPortalArticle(PortalArticleWithBLOBs portalArticleWithBLOBs)
   {
     ToJson json = new ToJson();
     try {
       List list = this.portalArticleMapper.selectPortalArticle(portalArticleWithBLOBs);
       if (list.size() > 0) {
         json.setObj(list);
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
   @Transactional
   public ToJson selectPortalArticleById(Integer articleId) {
     ToJson json = new ToJson();
     try {
       PortalArticle PortalArticle = this.portalArticleMapper.selectByPrimaryKey(articleId);
       json.setObject(PortalArticle);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
   @Transactional
   public ToJson<PortalArticleWithBLOBs> insertPortalArticle(PortalArticleWithBLOBs portalArticleWithBLOBs) {
     ToJson toJson = new ToJson(1, "error");
     try
     {
       int temp = this.portalArticleMapper.insertSelective(portalArticleWithBLOBs);
       if (temp > 0) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return toJson;
   }
 
   @Transactional
   public ToJson<PortalArticleWithBLOBs> upPortalArticle(PortalArticleWithBLOBs portalArticleWithBLOBs) {
     ToJson toJson = new ToJson(1, "error");
     try
     {
       int temp = this.portalArticleMapper.updateByPrimaryKeySelective(portalArticleWithBLOBs);
       if (temp > 0) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return toJson;
   }
 
   @Transactional
   public ToJson<PortalArticleWithBLOBs> delPortalArticle(PortalArticleWithBLOBs portalArticleWithBLOBs) {
     ToJson toJson = new ToJson(1, "error");
     try
     {
       int temp = this.portalArticleMapper.delPortalArticle(portalArticleWithBLOBs);
       if (temp > 0) {
         toJson.setFlag(0);
         toJson.setMsg("ok");
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return toJson;
   }
   @Transactional
   public ToJson articleTree(String id, Integer[] colIds) {
     ToJson toJson = new ToJson(1, "error");
     try {
       if (id != null) {
         String[] sp = id.split(";");
         Integer sid = Integer.valueOf(sp[0]);
         String type = sp[1];
         List articlesList = null;
         if (type.equals("chnl")) {
           articlesList = this.portalArticleMapper.columnExpandArticle(sid);
         }
         if (articlesList.size() > 0) {
           toJson.setFlag(0);
           toJson.setMsg("ok");
           toJson.setObj(articlesList);
         }
       }
     } catch (Exception e) {
       toJson.setFlag(1);
       toJson.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return toJson;
   }
 }

