 package com.myoa.service.worldnews.impl;
 
 import com.myoa.dao.worldnews.NewsCommentMapper;
import com.myoa.model.users.Users;
import com.myoa.model.worldnews.NewsComment;
import com.myoa.service.users.UsersService;
import com.myoa.service.worldnews.NewsCommentService;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;

 import java.util.List;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class NewsCommentServiceImpl
   implements NewsCommentService
 {
 
   @Resource
   private NewsCommentMapper newsCommentMapper;
 
   @Resource
   private UsersService usersService;
 
   public void addNewsComment(HttpServletRequest request, NewsComment newsComment)
   {
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     newsComment.setUser_id(users.getUserId());
 
     if (newsComment.getContent() == null) {
       newsComment.setContent("");
     }
     this.newsCommentMapper.addNewsComment(newsComment);
   }
 
   public List<NewsComment> getNewsCommentInfo(HttpServletRequest request, String news_id)
   {
     List<NewsComment> newsCommentInfo = this.newsCommentMapper.getNewsCommentInfo(news_id);
     for (NewsComment newsComment : newsCommentInfo) {
       String user_id = newsComment.getUser_id();
 
       int count = this.newsCommentMapper.getCount(newsComment.getComment_id());
       newsComment.setCount(count);
 
       Users usersByuserId = this.usersService.getUsersByuserId(user_id);
       newsComment.setUser_id(usersByuserId.getUserName());
     }
     return newsCommentInfo;
   }
 
   public ToJson<Users> getUser(HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try {
       Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       json.setMsg("ok");
       json.setFlag(0);
       json.setObject(users);
     }
     catch (Exception e) {
       json.setMsg("ok");
       json.setFlag(0);
       json.setObject(null);
       e.printStackTrace();
     }
     return json;
   }
 
   public int getCount(String parent_id)
   {
     return this.newsCommentMapper.getCount(Integer.valueOf(parent_id));
   }
 
   public String deleteComment(String comment_id, HttpServletRequest request)
   {
     Users name = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
 
     NewsComment comment = this.newsCommentMapper.getNewsCommentById(Integer.valueOf(Integer.parseInt(comment_id)));
     if (name.getUserId().equals(comment.getUser_id()))
     {
       deleteEachComment(comment_id);
       return "成功";
     }
     return "您不能删除别人发布的东西";
   }
 
   public void deleteEachComment(String comment_id)
   {
     this.newsCommentMapper.deleteComment(Integer.valueOf(comment_id));
 
     List<NewsComment> commentByparentId = this.newsCommentMapper.getCommentByparentId(Integer.valueOf(comment_id));
 
     if (commentByparentId != null)
       for (NewsComment newsComment : commentByparentId)
       {
         if (newsComment != null)
         {
           deleteEachComment(String.valueOf(newsComment.getComment_id()));
         }
       }
   }
 
   public int getNewsCount(String news_id)
   {
     return this.newsCommentMapper.getNewsCount(Integer.valueOf(news_id));
   }
 }

