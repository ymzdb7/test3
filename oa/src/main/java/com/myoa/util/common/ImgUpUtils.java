 package com.myoa.util.common;
 
 import com.myoa.dao.users.UsersMapper;
import com.myoa.model.users.Users;
import com.myoa.util.FileUploadUtil;
import com.myoa.util.common.wrapper.BaseWrapper;

 import java.io.File;
 import java.io.PrintStream;
 import java.util.List;
 import javax.servlet.ServletContext;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
 import org.apache.commons.collections.map.HashedMap;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
 @Component
 public class ImgUpUtils
 {
 
   @Autowired
   UsersMapper usersMapper;
 
   public BaseWrapper updateUserImgaes(HttpServletRequest request)
   {
     BaseWrapper wrapper = new BaseWrapper();
     String realPath = request.getSession().getServletContext().getRealPath("/");
     String resourcePath = "uiuser";
 
     List<Users> users = this.usersMapper.getAlluser(new HashedMap());
 
     File dir = new File(realPath + resourcePath);
     if (dir.exists()) {
       File[] files = dir.listFiles();
       for (File file2 : files) {
         if (file2.isDirectory()) {
           System.out.println("文件夹:" + file2.getAbsolutePath());
         }
         else if (!tailWiths(file2.getName())) {
           for (Users user : users) {
             if (file2.getName().equals(user.getAvatar())) {
               System.out.println("原文件文件:" + file2.getAbsolutePath());
               String fileName128 = FileUploadUtil.rename(file2.getName(), "s");
               String newImg = FileUploadUtil.zipImageFile(file2.getAbsolutePath(), 128, 128, 1.0F, fileName128, dir.getAbsolutePath());
               user.setAvatar(fileName128);
               user.setAvatar128(file2.getName());
               int count = this.usersMapper.editUser(user);
               System.out.println("文件:" + newImg);
             }
           }
         }
       }
     }
 
     return wrapper;
   }
 
   private boolean tailWiths(String name) {
     return name.contains("s.");
   }
 }

