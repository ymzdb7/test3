  package com.myoa.service.contactPerson;
  
  import com.myoa.dao.email.EmailBodyMapper;
import com.myoa.dao.users.UserExtMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.users.UserExt;
import com.myoa.model.users.Users;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;

  import java.util.ArrayList;
  import java.util.List;
  import javax.annotation.Resource;
  import javax.servlet.http.HttpServletRequest;
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
  @Service
  public class ContactPersonService
  {
  
    @Autowired
    public EmailBodyMapper emailBodyMapperl;
  
    @Autowired
    public UsersMapper usersMapper;
  
    @Resource
    public UserExtMapper userExtMapper;
  
    public ToJson<Users> serchContactPerson(HttpServletRequest request)
    {
      ToJson toJson = new ToJson();
      try {
        Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
        UserExt userExt = this.userExtMapper.queryUserExtByUserId(user.getUserId());
        String emailRecentLinkman = userExt.getEmailRecentLinkman();
        String emailId = userExt.getTableIcon();
        String[] split = emailRecentLinkman.split(",");
        String[] split1 = emailId.split(",");
        List list = new ArrayList();
        if (split.length > 5) {
          for (int i = 0; i < 5; i++) {
            if (!StringUtils.checkNull(split[i]).booleanValue()) {
              Users usersByuserId = this.usersMapper.getUsersByuserId(split[i]);
              list.add(usersByuserId);
            }
          }
        }
        else {
          for (int i = 0; i < split.length; i++) {
            if (!StringUtils.checkNull(split[i]).booleanValue()) {
              Users usersByuserId = this.usersMapper.getUsersByuserId(split[i]);
              list.add(usersByuserId);
            }
          }
        }
        toJson.setObj(list);
        toJson.setFlag(0);
        toJson.setMsg("查询成功");
      } catch (Exception e) {
        e.printStackTrace();
        toJson.setFlag(1);
        toJson.setMsg("查询失败");
      }
      return toJson;
    }
  }
