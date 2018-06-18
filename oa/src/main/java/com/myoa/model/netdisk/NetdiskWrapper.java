 package com.myoa.model.netdisk;
 
 import com.myoa.util.common.wrapper.BaseWrapper;

import java.util.List;
 
 public class NetdiskWrapper extends BaseWrapper
 {
   List<String> used;
   List<Netdisk> fileSorts;
   String nowFileSortName;
 
   public List<String> getUsed()
   {
     return this.used;
   }
 
   public void setUsed(List<String> used) {
     this.used = used;
   }
 
   public List<Netdisk> getFileSorts() {
     return this.fileSorts;
   }
 
   public void setFileSorts(List<Netdisk> fileSorts) {
     this.fileSorts = fileSorts;
   }
 
   public String getNowFileSortName() {
     return this.nowFileSortName;
   }
 
   public void setNowFileSortName(String nowFileSortName) {
     this.nowFileSortName = nowFileSortName;
   }
 }

