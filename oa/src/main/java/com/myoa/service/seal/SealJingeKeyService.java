 package com.myoa.service.seal;
 
 import com.myoa.dao.seal.SealJingeKeyMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.seal.SealJingeKey;
import com.myoa.model.seal.SealJingeKeyExample;
import com.myoa.model.seal.SealJingeKeyExample.Criteria;
import com.myoa.model.users.Users;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;

 import java.util.Date;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class SealJingeKeyService
 {
 
   @Autowired
   private SealJingeKeyMapper sealJingeKeyMapper;
 
   @Autowired
   private UsersMapper usersMapper;
 
   public ToJson<SealJingeKey> addSealJingeKeyList(HttpServletRequest request, SealJingeKey sealJingeKey)
   {
     ToJson toJson = new ToJson();
 
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     sealJingeKey.setCreateUser(user.getUserId());
     sealJingeKey.setCreateTime(new Date());
     try
     {
       int result = this.sealJingeKeyMapper.insertSelective(sealJingeKey);
       if (result > 0) {
         toJson.setFlag(0);
         toJson.setMsg("删除成功!");
       } else {
         toJson.setFlag(1);
         toJson.setMsg("删除失败!");
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return toJson;
   }
 
   public ToJson<SealJingeKey> getSealJingeKeyList(Integer sealId)
   {
     ToJson toJson = new ToJson();
 
     SealJingeKeyExample example = new SealJingeKeyExample();
     example.or().andSealIdEqualTo(sealId);
     List<SealJingeKey> sealJingeKeyList = this.sealJingeKeyMapper.selectByExample(example);
 
     for (SealJingeKey sealJingeKey : sealJingeKeyList) {
       String userNames = "";
       String[] userIds = sealJingeKey.getUserIdStr().split(",");
       for (String userId : userIds) {
         String userName = this.usersMapper.getUsernameById(userId);
         if (userName != null) {
           userNames = userNames + "," + userName;
         }
       }
       userNames = userNames.replaceFirst(",", "");
       sealJingeKey.setUserNames(userNames);
     }
     if (sealJingeKeyList != null) {
       toJson.setFlag(0);
       toJson.setMsg("查询成功!");
       toJson.setObj(sealJingeKeyList);
     } else {
       toJson.setFlag(1);
       toJson.setMsg("查询失败!");
     }
     return toJson;
   }
 
   public ToJson<SealJingeKey> getSealJingeKey(Integer keyId)
   {
     ToJson toJson = new ToJson();
     SealJingeKey sealJingeKey = this.sealJingeKeyMapper.getSealJinge(keyId);
     String userNames = "";
     String[] userIds = sealJingeKey.getUserIdStr().split(",");
     for (String userId : userIds) {
       String userName = this.usersMapper.getUsernameById(userId);
       if (userName != null) {
         userNames = userNames + "," + userName;
       }
     }
     userNames = userNames.replaceFirst(",", "");
     sealJingeKey.setUserNames(userNames);
     if (sealJingeKey != null) {
       toJson.setFlag(0);
       toJson.setMsg("查询成功!");
       toJson.setObject(sealJingeKey);
     } else {
       toJson.setFlag(1);
       toJson.setMsg("查询失败!");
     }
     return toJson;
   }
 
   @Transactional(rollbackFor={RuntimeException.class})
   public ToJson<SealJingeKey> updateSealJingeKey(SealJingeKey sealJingeKey) {
     ToJson toJson = new ToJson();
     try
     {
       int result = this.sealJingeKeyMapper.updateByPrimaryKeySelective(sealJingeKey);
       if (result > 0) {
         toJson.setFlag(0);
         toJson.setMsg("更新成功!");
       } else {
         toJson.setFlag(1);
         toJson.setMsg("更新失败!");
       }
     } catch (Exception e) {
       e.printStackTrace();
       throw new RuntimeException("更新失败！");
     }
     return toJson;
   }
 
   public ToJson<SealJingeKey> deleteSealJingeKey(Integer keyId)
   {
     ToJson toJson = new ToJson();
     try
     {
       int result = this.sealJingeKeyMapper.deleteByPrimaryKey(keyId);
       if (result > 0) {
         toJson.setFlag(0);
         toJson.setMsg("删除成功!");
       } else {
         toJson.setFlag(1);
         toJson.setMsg("删除失败!");
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return toJson;
   }
 }

