 package com.myoa.service.edu.eduUser.impl;
 
 import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.myoa.dao.edu.eduUser.EduUserMapper;
import com.myoa.model.edu.eduUser.EduUser;
import com.myoa.service.edu.eduUser.IEduUserService;

 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class EduUserServiceImpl extends ServiceImpl<EduUserMapper, EduUser>
   implements IEduUserService
 {
 
   @Resource
   EduUserMapper eduUserMapper;
 
   public EduUser getByuserId(String userId)
   {
     EduUser eduUser = ((EduUserMapper)this.baseMapper).getByuserId(userId);
     return eduUser;
   }
 
   public String getUserNameByUids(String uids)
   {
     String[] userArray = uids.split(",");
     StringBuffer stringBuffer = new StringBuffer();
     for (int i = 0; i < userArray.length; i++) {
       EduUser user = this.eduUserMapper.getByUid(Integer.valueOf(userArray[i]));
       if (user != null) {
         String userName = user.getUserName();
         stringBuffer.append(userName).append(",");
       }
     }
     return stringBuffer.toString();
   }
 
   public String getUserNameByUserIds(String userIds)
   {
     String[] userArray = userIds.split(",");
     StringBuffer stringBuffer = new StringBuffer();
     for (int i = 0; i < userArray.length; i++) {
       EduUser user = this.eduUserMapper.getByuserId(userArray[i]);
       if (user != null) {
         String userName = user.getUserName();
         stringBuffer.append(userName).append(",");
       }
     }
     return stringBuffer.toString();
   }
 
   public List<EduUser> getBySearch(Map<String, Object> maps)
   {
     return this.eduUserMapper.getBySearch(maps);
   }
 
   public EduUser getByUid(Integer uid)
   {
     return this.eduUserMapper.getByUid(uid);
   }
 }
