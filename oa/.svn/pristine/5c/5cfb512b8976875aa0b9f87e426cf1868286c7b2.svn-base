 package com.myoa.util.netdisk;
 
 import com.myoa.util.common.StringUtils;

import java.util.Map;
 
 public class CheckAll
 {
   public static boolean checkDeptPriv(String DeptId, String deptIdOfuser_Id)
   {
     if (("ALL_DEPT".equals(DeptId)) || ("ALL_DEPT" == DeptId)) {
       return true;
     }
 
     if ((DeptId != null) && (!"".equals(DeptId))) {
       String[] deptIds = DeptId.split(",");
       for (int i = 0; i < deptIds.length; i++) {
         if (deptIdOfuser_Id.equals(deptIds[i])) {
           return true;
         }
       }
     }
 
     return false;
   }
 
   public static boolean checkUserPriv(String userPriv, String userPrivOfuser_Id)
   {
     if ((userPriv != null) && (!"".equals(userPriv))) {
       String[] deptIds = userPriv.split(",");
       for (int i = 0; i < deptIds.length; i++) {
         if (deptIds[i].equals(userPrivOfuser_Id)) {
           return true;
         }
       }
     }
 
     return false;
   }
 
   public static boolean checkUserId(String userId, String userIdOfuser_Id)
   {
     if ((userId != null) && (!"".equals(userId))) {
       String[] deptIds = userId.split(",");
       for (int i = 0; i < deptIds.length; i++) {
         if (deptIds[i].equals(userIdOfuser_Id)) {
           return true;
         }
       }
     }
 
     return false;
   }
 
   public static boolean checkAll(String checkString, Map<String, Object> map)
   {
     if (StringUtils.checkNull(checkString).booleanValue()) {
       return false;
     }
     String[] checkStrings = checkString.split("\\|");
     if (checkStrings.length == 0) {
       return false;
     }
 
     if (checkStrings.length == 1) {
       if ("ALL_DEPT".equals(checkStrings)) {
         return true;
       }
 
       String[] checkDept = checkStrings[0].split(",");
       if (!StringUtils.checkNull(checkDept[0]).booleanValue()) {
         for (int i = 0; i < checkDept.length; i++)
         {
           if (map.get("deptId") != null) {
             String depId = map.get("deptId").toString();
             if (checkDeptPriv(checkDept[i], depId))
               return true;
           }
           else {
             return false;
           }
         }
       }
     }
 
     if (checkStrings.length == 2) {
       String[] checkDept = checkStrings[0].split(",");
       if (!StringUtils.checkNull(checkDept[0]).booleanValue()) {
         for (int i = 0; i < checkDept.length; i++)
         {
           if (map.get("deptId") != null) {
             String depId = map.get("deptId").toString();
             if (checkDeptPriv(checkDept[i], depId))
               return true;
           }
           else {
             return false;
           }
         }
       }
       String[] checkUserPriv = checkStrings[1].split(",");
       if (!StringUtils.checkNull(checkUserPriv[0]).booleanValue()) {
         for (int i = 0; i < checkUserPriv.length; i++)
         {
           if (map.get("userPriv") != null) {
             String userPrivId = map.get("userPriv").toString();
             if (checkUserPriv(checkUserPriv[i], userPrivId))
               return true;
           }
           else {
             return false;
           }
         }
       }
     }
 
     if (checkStrings.length == 3) {
       String[] checkDept = checkStrings[0].split(",");
       if (!StringUtils.checkNull(checkDept[0]).booleanValue()) {
         for (int i = 0; i < checkDept.length; i++) {
           if (map.get("deptId") != null) {
             String depId = map.get("deptId").toString();
             if (checkDeptPriv(checkDept[i], depId))
               return true;
           }
           else {
             return false;
           }
         }
       }
       String[] checkUserPriv = checkStrings[1].split(",");
       if (!StringUtils.checkNull(checkUserPriv[0]).booleanValue()) {
         for (int i = 0; i < checkUserPriv.length; i++)
         {
           if (map.get("userPriv") != null) {
             String userPrivId = map.get("userPriv").toString();
             if (checkUserPriv(checkUserPriv[i], userPrivId))
               return true;
           }
           else {
             return false;
           }
         }
       }
       String[] checkUserId = checkStrings[2].split(",");
       if (!StringUtils.checkNull(checkUserId[0]).booleanValue()) {
         for (int i = 0; i < checkUserId.length; i++)
         {
           if (map.get("userId") != null) {
             String userId = map.get("userId").toString();
             if (checkUserId(checkUserId[i], userId))
               return true;
           }
           else
           {
             return false;
           }
         }
 
       }
 
     }
 
     return false;
   }
 }

