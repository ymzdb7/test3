 package com.myoa.model.menu;
 
 import java.util.List;
 
 public class SysFunction
 {
   private Integer fId;
   private String id;
   private String name;
   private String name1;
   private String name2;
   private String name3;
   private String name4;
   private String name5;
   private String url;
   private String ext;
   private List<SysFunction> child;
   private String isopenNew;
 
   public Integer getfId()
   {
     return this.fId;
   }
 
   public void setfId(Integer fId)
   {
     this.fId = fId;
   }
 
   public String getId()
   {
     return this.id;
   }
 
   public void setId(String id)
   {
     this.id = id;
   }
 
   public String getName()
   {
     return this.name;
   }
 
   public void setName(String name)
   {
     this.name = name;
   }
 
   public String getUrl()
   {
     return this.url;
   }
 
   public void setUrl(String url)
   {
     this.url = url;
   }
 
   public String getExt()
   {
     return this.ext;
   }
 
   public void setExt(String ext)
   {
     this.ext = ext;
   }
 
   public List<SysFunction> getChild()
   {
     return this.child;
   }
 
   public void setChild(List<SysFunction> child)
   {
     this.child = child;
   }
 
   public String getName1() {
     return this.name1;
   }
 
   public void setName1(String name1)
   {
     this.name1 = name1;
   }
 
   public String getName2()
   {
     return this.name2;
   }
 
   public void setName2(String name2)
   {
     this.name2 = name2;
   }
 
   public String getName3()
   {
     return this.name3;
   }
 
   public void setName3(String name3)
   {
     this.name3 = name3;
   }
 
   public String getName4()
   {
     return this.name4;
   }
 
   public void setName4(String name4)
   {
     this.name4 = name4;
   }
 
   public String getName5()
   {
     return this.name5;
   }
 
   public void setName5(String name5)
   {
     this.name5 = name5;
   }
 
   public String getIsopenNew() {
     return this.isopenNew == null ? "0" : this.isopenNew;
   }
 
   public void setIsopenNew(String isopenNew) {
     this.isopenNew = isopenNew;
   }
 }
