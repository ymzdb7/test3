 package com.myoa.service.workflow.wrapper;
 
 import com.myoa.model.workflow.FormSort;
import com.myoa.util.common.wrapper.BaseWrappers;

import java.util.List;
 
 public class JobSelectorWrapper extends BaseWrappers
 {
   List<FormSort> datasStr;
 
   public List<FormSort> getDatasStr()
   {
     return this.datasStr;
   }
 
   public void setDatasStr(List<FormSort> datasStr) {
     this.datasStr = datasStr;
   }
 }

