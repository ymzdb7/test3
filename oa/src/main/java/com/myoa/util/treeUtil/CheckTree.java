 package com.myoa.util.treeUtil;
 
 import java.util.Map;
 
 public class CheckTree
 {
   public static boolean checkAll(String checkString, Map<String, Object> map)
   {
     String[] checkStrings = (checkString == null ? "" : checkString).split("\\|");
     if (checkStrings.length == 0) {
       return false;
     }
 
     if (checkStrings.length == 1) {
       String[] checkDept = checkStrings[0].split(",");
       for (int i = 0; i < checkDept.length; i++)
       {
         if (checkDeptPriv(checkDept[i], map.get("deptId").toString())) {
           return true;
         }
       }
     }
 
     if (checkStrings.length == 2) {
       String[] checkDept = checkStrings[0].split(",");
       for (int i = 0; i < checkDept.length; i++)
       {
         if (checkDeptPriv(checkDept[i], map.get("deptId").toString())) {
           return true;
         }
       }
       String[] checkUserPriv = checkStrings[1].split(",");
       for (int i = 0; i < checkUserPriv.length; i++)
       {
         if (checkUserPriv(checkUserPriv[i], map.get("userPriv").toString())) {
           return true;
         }
       }
     }
 
     if (checkStrings.length == 3) {
       String[] checkDept = checkStrings[0].split(",");
       for (int i = 0; i < checkDept.length; i++)
       {
         if (checkDeptPriv(checkDept[i], map.get("deptId").toString())) {
           return true;
         }
       }
       String[] checkUserPriv = checkStrings[1].split(",");
       for (int i = 0; i < checkUserPriv.length; i++)
       {
         if (checkUserPriv(checkUserPriv[i], map.get("userPriv").toString())) {
           return true;
         }
       }
       String[] checkUserId = checkStrings[2].split(",");
       for (int i = 0; i < checkUserId.length; i++)
       {
         if (checkUserId(checkUserId[i], map.get("userId").toString())) {
           return true;
         }
       }
     }
 
     return false;
   }
 
   public static boolean checkDeptPriv(String DeptId, String deptIdOfuser_Id)
   {
     if (("ALL_DEPT".equals(DeptId)) || ("ALL_DEPT" == DeptId)) {
       return true;
     }
 
     return (DeptId != null) && (!"".equals(DeptId)) && 
       (deptIdOfuser_Id.equals(DeptId));
   }
 
   public static boolean checkUserPriv(String userPriv, String userPrivOfuser_Id)
   {
     return (userPriv != null) && (!"".equals(userPriv)) && 
       (userPrivOfuser_Id.equals(userPriv));
   }
 
   public static boolean checkUserId(String userId, String userIdOfuser_Id)
   {
     return (userId != null) && (!"".equals(userId)) && 
       (userIdOfuser_Id.equals(userId));
   }
 }

