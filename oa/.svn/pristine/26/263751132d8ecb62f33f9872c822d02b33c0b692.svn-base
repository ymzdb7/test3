 package com.myoa.service.sys;
 
 import com.myoa.dao.menu.SysMenuMapper;
import com.myoa.dao.sys.DangerSysMapper;
import com.myoa.model.users.Users;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;

 import java.util.List;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class DangerSysService
 {
 
   @Autowired
   DangerSysMapper mapper;
 
   @Resource
   SysMenuMapper sysMenuMapper;
 
   public BaseWrapper truncateTable(HttpServletRequest request, String[] menuId)
   {
     BaseWrapper wrapper = new BaseWrapper();
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     if ((user == null) || (!user.getUserId().equals("admin"))) {
       wrapper.setFlag(false);
       wrapper.setStatus(true);
       wrapper.setMsg("您没有权限");
       return wrapper;
     }
     try {
       for (String id : menuId) {
         if (id.equals("0116"))
         {
           this.mapper.truncateTable("notify");
         }
         if (id.equals("0117"))
         {
           this.mapper.truncateTable("news");
           this.mapper.truncateTable("news_comment");
         }
         if (id.equals("0101"))
         {
           this.mapper.truncateTable("email");
           this.mapper.truncateTable("email_body");
           this.mapper.truncateTable("webmail");
           this.mapper.truncateTable("webmail_body");
         }
         if (id.equals("2016"))
         {
           this.mapper.truncateTable("calendar");
         }
         if (id.equals("0128"))
         {
           this.mapper.truncateTable("diary");
           this.mapper.truncateTable("diary_comment");
           this.mapper.truncateTable("diary_comment_reply");
           this.mapper.truncateTable("diary_share");
           this.mapper.truncateTable("diary_top");
         }
 
         if (id.equals("0136"))
         {
           List contentIds = this.mapper.getFileContentBySortType(Integer.valueOf(4));
           List contentIdss = this.mapper.getFileContentBySortZero();
           contentIds.addAll(contentIdss);
           this.mapper.deleteFileContent(contentIds);
           this.mapper.deleteFileBox(Integer.valueOf(4));
         }
         if (!id.equals("3001"))
           continue;
         List contentIds = this.mapper.getFileContentBySortType(Integer.valueOf(5));
         this.mapper.deleteFileContent(contentIds);
         this.mapper.deleteFileBox(Integer.valueOf(5));
       }
 
       wrapper.setFlag(true);
       wrapper.setStatus(true);
       wrapper.setMsg("操作成功");
     } catch (Exception e) {
       e.printStackTrace();
       wrapper.setMsg("操作失败");
       wrapper.setFlag(false);
       wrapper.setStatus(true);
     }
     return wrapper;
   }
 
   public BaseWrapper truncateTablePlagiarize(HttpServletRequest request, String[] menuId)
   {
     BaseWrapper wrapper = new BaseWrapper();
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     try
     {
       for (String id : menuId) {
         if (id.equals("0116"))
         {
           this.mapper.truncateTable("notify");
         }
         if (!id.equals("0117"))
           continue;
         this.mapper.truncateTable("news");
         this.mapper.truncateTable("news_comment");
       }
 
       wrapper.setFlag(true);
       wrapper.setStatus(true);
       wrapper.setMsg("操作成功");
     } catch (Exception e) {
       e.printStackTrace();
       wrapper.setMsg("操作失败");
       wrapper.setFlag(false);
       wrapper.setStatus(true);
     }
     return wrapper;
   }
 }

