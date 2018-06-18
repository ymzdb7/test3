 package com.myoa.service.portalColumn.impl;
 
 import com.myoa.dao.portalColumn.PortalColumnMapper;
import com.myoa.dao.site.SiteMapper;
import com.myoa.model.portalColumn.PortalColumn;
import com.myoa.model.portalColumn.TeeZTreeModel;
import com.myoa.model.site.Site;
import com.myoa.service.portalColumn.PortalColumnService;
import com.myoa.util.ToJson;

 import java.util.ArrayList;
 import java.util.List;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class PortalColumnServiceImpl
   implements PortalColumnService
 {
 
   @Resource
   private PortalColumnMapper portalColumnMapper;
 
   @Resource
   private SiteMapper siteMapper;
 
   @Transactional
   public ToJson<PortalColumn> selectPortalColumn()
   {
     ToJson json = new ToJson();
     try {
       List list = this.portalColumnMapper.selectPortalColumn();
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
   public ToJson selectPortalColumnById(Integer columnId) {
     ToJson json = new ToJson();
     try {
       PortalColumn portalColumn = this.portalColumnMapper.selectByPrimaryKey(columnId);
       json.setObject(portalColumn);
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
   public ToJson<PortalColumn> insertPortalColumn(PortalColumn PortalColumn) {
     ToJson toJson = new ToJson(1, "error");
     try
     {
       int temp = this.portalColumnMapper.insertSelective(PortalColumn);
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
   public ToJson<PortalColumn> upPortalColumn(PortalColumn PortalColumn) {
     ToJson toJson = new ToJson(1, "error");
     try
     {
       int temp = this.portalColumnMapper.updateByPrimaryKeySelective(PortalColumn);
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
 
   public ToJson<PortalColumn> delPortalColumn(Integer[] ids)
   {
     ToJson toJson = new ToJson(1, "error");
     try
     {
       int temp = this.portalColumnMapper.delPortalColumn(ids);
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
   public ToJson<Site> selectSite() {
     ToJson json = new ToJson();
     List list = this.siteMapper.selectSite();
     try
     {
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
   public ToJson<TeeZTreeModel> ColumnTree(String id, Integer[] portalIds, Integer[] colIds) {
     ToJson json = new ToJson();
     List list = new ArrayList();
     Integer childCount = Integer.valueOf(0);
     if ((id == null) && (portalIds.length > 0)) {
       List<Site> siteList = this.siteMapper.selectSiteSids(portalIds);
       for (Site si : siteList) {
         TeeZTreeModel model = new TeeZTreeModel();
         model.setOpen(true);
         model.setName(si.getPortalName());
         model.setTitle(si.getPortalName());
         model.setIconSkin("site");
         model.setId(si.getPortalId() + ";site");
         model.setExtend1(si.getPortalId() + "");
 
         childCount = Integer.valueOf(this.portalColumnMapper.count(si.getPortalId()));
         if (childCount.intValue() != 0)
           model.setParent(true);
         else {
           model.setParent(false);
         }
         list.add(model);
       }
     }
     else if ((id != null) && (id.equals("0"))) {
       List<Site> sites = this.siteMapper.selectSite();
       for (Site site : sites) {
         TeeZTreeModel model = new TeeZTreeModel();
         model.setOpen(true);
         model.setName(site.getPortalName());
         model.setTitle(site.getPortalName());
         model.setIconSkin("site");
         model.setId(site.getPortalId() + ";site");
         model.setExtend1(site.getPortalId() + "");
 
         childCount = Integer.valueOf(this.portalColumnMapper.count(site.getPortalId()));
         if (childCount.intValue() != 0)
           model.setParent(true);
         else {
           model.setParent(false);
         }
         list.add(model);
       }
     }
     else {
       String[] sp = id.split(";");
       Integer sid = Integer.valueOf(sp[0]);
       String type = sp[1];
       List<PortalColumn> columnsList = null;
       if (type.equals("site"))
         columnsList = this.portalColumnMapper.siteExpandColumn(sid, colIds);
       else if (type.equals("chnl")) {
         columnsList = this.portalColumnMapper.columnExpandColumn(sid, colIds);
       }
       for (PortalColumn portalColumn : columnsList) {
         TeeZTreeModel model = new TeeZTreeModel();
         model.setOpen(true);
         model.setParent(true);
         model.setName(portalColumn.getColumnName());
         model.setTitle(portalColumn.getColumnName());
         model.setIconSkin("channel");
         model.setId(portalColumn.getColumnId() + ";chnl");
         model.setExtend1(portalColumn.getColumnId() + "");
 
         childCount = Integer.valueOf(this.portalColumnMapper.columnCount(portalColumn.getPortalId(), portalColumn.getColumnId()));
         if (childCount.intValue() != 0)
           model.setParent(true);
         else {
           model.setParent(false);
         }
         list.add(model);
       }
     }
     try
     {
       if (list.size() > 0)
       {
         json.setObj(list);
         json.setFlag(0);
         json.setMsg("ok");
       }
     }
     catch (Exception e) {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
 
     return json;
   }
 }
