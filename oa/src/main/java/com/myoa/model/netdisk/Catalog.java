 package com.myoa.model.netdisk;
 
 import java.util.List;
 
 public class Catalog
 {
   private String catalogName;
   private String catalogPath;
   private String catalogSize;
   private int catalogcount;
   private List<MyNetdisk> myNetdiskList;
 
   public String getCatalogName()
   {
     return this.catalogName;
   }
 
   public void setCatalogName(String catalogName) {
     this.catalogName = catalogName;
   }
 
   public String getCatalogPath() {
     return this.catalogPath;
   }
 
   public void setCatalogPath(String catalogPath) {
     this.catalogPath = catalogPath;
   }
 
   public int getCatalogcount() {
     return this.catalogcount;
   }
 
   public void setCatalogcount(int catalogcount) {
     this.catalogcount = catalogcount;
   }
 
   public List<MyNetdisk> getMyNetdiskList() {
     return this.myNetdiskList;
   }
 
   public void setMyNetdiskList(List<MyNetdisk> myNetdiskList) {
     this.myNetdiskList = myNetdiskList;
   }
 
   public String getCatalogSize() {
     return this.catalogSize;
   }
 
   public void setCatalogSize(String catalogSize) {
     this.catalogSize = catalogSize;
   }
 }

