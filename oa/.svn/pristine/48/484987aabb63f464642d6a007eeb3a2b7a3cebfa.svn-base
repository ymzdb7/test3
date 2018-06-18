 package com.myoa.service.supervision;
 
 import com.myoa.dao.supervision.SupFeedBackReplyMapper;
import com.myoa.model.supervision.SupFeedBackReply;
import com.myoa.model.users.Users;
import com.myoa.util.DateFormat;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;

 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class SupFeedBackReplyService
 {
 
   @Autowired
   private SupFeedBackReplyMapper supFeedBackReplyMapper;
 
   public BaseWrapper insetrtSupFeedBackReply(SupFeedBackReply SupFeedBackReply, HttpServletRequest request)
   {
     BaseWrapper baseWrapper = new BaseWrapper();
     if (StringUtils.checkNull(SupFeedBackReply.getContent()).booleanValue()) {
       baseWrapper.setFlag(false);
       baseWrapper.setStatus(true);
       baseWrapper.setMsg("更新失败");
     }
 
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     SupFeedBackReply.setCreaterId(users.getUserId());
     SupFeedBackReply.setSid(Integer.valueOf(0));
     SupFeedBackReply.setCreateTime(DateFormat.getCurrentTime());
     SupFeedBackReply.setFbId(Integer.valueOf(1));
     int num = this.supFeedBackReplyMapper.insert(SupFeedBackReply);
     if (num > 0) {
       baseWrapper.setFlag(true);
       baseWrapper.setStatus(true);
       baseWrapper.setMsg("更新成功");
     }
 
     return baseWrapper;
   }
 
   public ToJson<SupFeedBackReply> deleteByPrimaryKeySupFeedBackReply(HttpServletRequest request, Integer sid)
   {
     ToJson toJson = new ToJson();
     if (StringUtils.checkNull(String.valueOf(sid)).booleanValue()) {
       toJson.setFlag(1);
       toJson.setMsg("删除失败");
     }
     int num = this.supFeedBackReplyMapper.deleteByPrimaryKey(sid);
     if (num > 0) {
       toJson.setFlag(0);
       toJson.setMsg("更新成功");
     }
     return toJson;
   }
 }

