 package com.myoa.service.supervision.impl;
 
 import com.myoa.dao.supervision.SupFeedBackMapper;
import com.myoa.dao.supervision.SupFeedBackReplyMapper;
import com.myoa.model.supervision.SupFeedBack;
import com.myoa.model.supervision.SupFeedBackReply;
import com.myoa.model.users.Users;
import com.myoa.service.supervision.SupFeedBackServise;
import com.myoa.util.DateFormat;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;

 import java.util.List;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Service
 public class SupFeedServiseImpl
   implements SupFeedBackServise
 {
 
   @Resource
   SupFeedBackMapper supFeedBackMapper;
 
   @Resource
   SupFeedBackReplyMapper supFeedBackReplyMapper;
 
   @Transactional
   public ToJson<Object> getSupDetail(HttpServletRequest request, SupFeedBack supFeedBack, SupFeedBackReply supFeedBackReply)
   {
     ToJson toJson = new ToJson(1, "error");
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     supFeedBack.setCreaterId(users.getUserId());
     supFeedBack.setCreateTime(DateFormat.getCurrentTime());
     try {
       supFeedBack = this.supFeedBackMapper.getSupDetails(supFeedBack);
       List list = this.supFeedBackReplyMapper.selectContent(supFeedBack.getSid());
       if ((supFeedBack != null) && 
         (!StringUtils.checkNull(supFeedBack.getCreateTime()).booleanValue())) {
         supFeedBack.setCreateTime(supFeedBack.getCreateTime().substring(0, supFeedBack.getCreateTime().length() - 2));
       }
 
       if (list.size() > 0) {
         toJson.setMsg("ok");
         toJson.setObj(list);
       }
       if (supFeedBack != null) {
         toJson.setObject(supFeedBack);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("没有详情信息");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<SupFeedBack> deleteSupFeedBack(HttpServletRequest request, Integer sid)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       this.supFeedBackMapper.deleteSupFeedBack(sid);
       if (sid != null) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("删除失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<SupFeedBack> updateSupFeedBack(HttpServletRequest request, SupFeedBack supFeedBack)
   {
     ToJson toJson = new ToJson(1, "error");
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     supFeedBack.setCreaterId(users.getUserId());
     try {
       int a = this.supFeedBackMapper.updateSupFeedBack(supFeedBack);
       if (a > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("更新失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<SupFeedBack> addSupFeedBack(HttpServletRequest request, SupFeedBack supFeedBack)
   {
     ToJson toJson = new ToJson(1, "error");
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     supFeedBack.setCreaterId(users.getUserId());
     supFeedBack.setCreateTime(DateFormat.getCurrentTime());
     try {
       int a = this.supFeedBackMapper.addSupFeedBack(supFeedBack);
       if (a > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("发表失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
     }
     return toJson;
   }
 
   public ToJson<SupFeedBack> getSupFeedBackList(HttpServletRequest request, SupFeedBack supFeedBack)
   {
     ToJson toJson = new ToJson(1, "error");
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     if ((supFeedBack.getCreateTime() == null) && (supFeedBack.getCreateTime() == "0000-00-00")) {
       supFeedBack.setCreateTime(DateFormat.getCurrentTime());
     }
     if (supFeedBack.getCreaterId() == null)
       supFeedBack.setCreaterId(users.getUserId());
     try
     {
       List list = this.supFeedBackMapper.getSupFeedBackList(supFeedBack);
 
       if (list.size() > 0) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setFlag(1);
     }
     return toJson;
   }
 }

