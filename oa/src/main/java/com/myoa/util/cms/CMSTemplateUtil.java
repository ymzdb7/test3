 package com.myoa.util.cms;
 
 import com.myoa.util.cms.directive.CMSOutDirective;
import com.myoa.util.cms.directive.CMSSiteDirective;

 import java.util.Map;
import org.apache.commons.collections.map.HashedMap;
 
 public class CMSTemplateUtil
 {
   public static Map getInstance()
   {
     Map map = new HashedMap();
     map.put("Site", new CMSSiteDirective());
     map.put("Out", new CMSOutDirective());
     return map;
   }
 }
