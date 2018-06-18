 package com.myoa.model.portalColumn;
 
 public class PortalColumn
 {
   private Integer columnId;
   private Integer portalId;
   private String sortNo;
   private String columnMark;
   private Integer pageSize;
   private Integer parentColumnId;
   private String path;
   private Integer listTemplate;
   private Integer detailTemplate;
   private String auditYn;
   private String auditUser;
   private String appendix;
   private String columnName;
   private String templateName;
 
   public String getTemplateName()
   {
     return this.templateName;
   }
 
   public void setTemplateName(String templateName) {
     this.templateName = templateName;
   }
 
   public Integer getColumnId()
   {
     return this.columnId;
   }
 
   public void setColumnId(Integer columnId)
   {
     this.columnId = columnId;
   }
 
   public Integer getPortalId()
   {
     return this.portalId;
   }
 
   public void setPortalId(Integer portalId)
   {
     this.portalId = portalId;
   }
 
   public String getSortNo()
   {
     return this.sortNo;
   }
 
   public void setSortNo(String sortNo)
   {
     this.sortNo = (sortNo == null ? null : sortNo.trim());
   }
 
   public String getColumnMark()
   {
     return this.columnMark;
   }
 
   public void setColumnMark(String columnMark)
   {
     this.columnMark = (columnMark == null ? null : columnMark.trim());
   }
 
   public Integer getPageSize()
   {
     return this.pageSize;
   }
 
   public void setPageSize(Integer pageSize)
   {
     this.pageSize = pageSize;
   }
 
   public Integer getParentColumnId()
   {
     return this.parentColumnId;
   }
 
   public void setParentColumnId(Integer parentColumnId)
   {
     this.parentColumnId = parentColumnId;
   }
 
   public String getPath()
   {
     return this.path;
   }
 
   public void setPath(String path)
   {
     this.path = path;
   }
 
   public Integer getListTemplate()
   {
     return this.listTemplate;
   }
 
   public void setListTemplate(Integer listTemplate)
   {
     this.listTemplate = listTemplate;
   }
 
   public Integer getDetailTemplate()
   {
     return this.detailTemplate;
   }
 
   public void setDetailTemplate(Integer detailTemplate)
   {
     this.detailTemplate = detailTemplate;
   }
 
   public String getAuditYn()
   {
     return this.auditYn;
   }
 
   public void setAuditYn(String auditYn)
   {
     this.auditYn = (auditYn == null ? null : auditYn.trim());
   }
 
   public String getAuditUser()
   {
     return this.auditUser;
   }
 
   public void setAuditUser(String auditUser)
   {
     this.auditUser = (auditUser == null ? null : auditUser.trim());
   }
 
   public String getAppendix()
   {
     return this.appendix;
   }
 
   public void setAppendix(String appendix)
   {
     this.appendix = (appendix == null ? null : appendix.trim());
   }
 
   public String getColumnName()
   {
     return this.columnName;
   }
 
   public void setColumnName(String columnName)
   {
     this.columnName = (columnName == null ? null : columnName.trim());
   }
 }

