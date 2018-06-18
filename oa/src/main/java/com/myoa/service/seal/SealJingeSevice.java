 package com.myoa.service.seal;
 
 import com.myoa.dao.seal.SealJingeKeyMapper;
import com.myoa.dao.seal.SealJingeMapper;
import com.myoa.model.seal.SealJinge;
import com.myoa.model.seal.SealJingeExample;
import com.myoa.model.seal.SealJingeKey;
import com.myoa.model.seal.SealJingeKeyExample;
import com.myoa.model.seal.SealJingeKeyExample.Criteria;
import com.myoa.model.users.Users;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;

 import java.util.Date;
 import java.util.List;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class SealJingeSevice
 {
 
   @Resource
   SealJingeMapper sealJingeMapper;
 
   @Autowired
   SealJingeKeyMapper sealJingeKeyMapper;
 
   public ToJson<SealJinge> addSealJinge(HttpServletRequest request, SealJinge sealJinge)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       String userId = users.getUserId();
       sealJinge.setCreateUser(userId);
       sealJinge.setCreateTime(new Date());
       int a = this.sealJingeMapper.insertSelective(sealJinge);
       if (a > 0) {
         toJson.setObject(sealJinge);
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("err");
         throw new Exception();
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       toJson.setFlag(1);
     }
     return toJson;
   }
 
   public ToJson<SealJinge> getSealJingeList() {
     ToJson toJson = new ToJson();
 
     SealJingeExample example = new SealJingeExample();
     List<SealJinge> sealJingeList = this.sealJingeMapper.selectByExample(example);
 
     for (SealJinge sealJinge : sealJingeList) {
       String keyNos = "";
       SealJingeKeyExample sealJingeKeyExample = new SealJingeKeyExample();
       sealJingeKeyExample.or().andSealIdEqualTo(sealJinge.getSealId());
       List<SealJingeKey> sealJingeKeyList = this.sealJingeKeyMapper.selectByExample(sealJingeKeyExample);
       for (SealJingeKey sealJingeKey : sealJingeKeyList) {
         if (sealJingeKey.getKeyNo() != null) {
           keyNos = keyNos + "," + sealJingeKey.getKeyNo();
         }
       }
       keyNos = keyNos.replaceFirst(",", "");
       sealJinge.setKeyNos(keyNos);
     }
     if (sealJingeList != null) {
       toJson.setFlag(0);
       toJson.setMsg("查询成功!");
       toJson.setObj(sealJingeList);
     } else {
       toJson.setFlag(1);
       toJson.setMsg("查询失败!");
     }
     return toJson;
   }
 
   public ToJson<SealJinge> getSealJinge(Integer sealId)
   {
     ToJson toJson = new ToJson();
     SealJinge sealJinge = this.sealJingeMapper.selectByPrimaryKey(sealId);
 
     if (sealJinge != null) {
       toJson.setFlag(0);
       toJson.setMsg("查询成功!");
       toJson.setObject(sealJinge);
     } else {
       toJson.setFlag(1);
       toJson.setMsg("查询失败!");
     }
     return toJson;
   }
 
   @Transactional(rollbackFor={RuntimeException.class})
   public ToJson<SealJinge> updateSealJinge(SealJinge sealJinge) {
     ToJson toJson = new ToJson();
     try
     {
       int result = this.sealJingeMapper.updateByPrimaryKeySelective(sealJinge);
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
 
   public ToJson<SealJinge> deleteSealJinge(Integer sealId)
   {
     ToJson toJson = new ToJson();
     try
     {
       int result = this.sealJingeMapper.deleteByPrimaryKey(sealId);
       int result2 = this.sealJingeKeyMapper.deleteBySealId(sealId);
       if ((result > 0) && (result2 > 0)) {
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

