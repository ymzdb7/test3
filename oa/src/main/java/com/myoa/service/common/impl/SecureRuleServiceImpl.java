  package com.myoa.service.common.impl;
  
  import com.myoa.dao.common.SecureLogMapper;
import com.myoa.dao.common.SecureRuleMapper;
import com.myoa.model.common.SecureLog;
import com.myoa.model.common.SecureRule;
import com.myoa.model.users.Users;
import com.myoa.service.common.SecureRuleService;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.ipUtil.IpAddr;

  import java.io.PrintStream;
  import java.net.InetAddress;
  import java.util.Date;
  import java.util.List;
  import javax.annotation.Resource;
  import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
  
  @Service
  public class SecureRuleServiceImpl
    implements SecureRuleService
  {
  
    @Resource
    private SecureRuleMapper secureRuleMapper;
  
    @Resource
    private SecureLogMapper secureLogMapper;
  
    public ToJson<SecureRule> getAllSecureRule()
    {
      ToJson json = new ToJson(1, "err");
      try {
        List<SecureRule> allSecureRule = this.secureRuleMapper.getAllSecureRule();
  
        if (allSecureRule != null) {
          for (SecureRule secureRule : allSecureRule) {
            if ((secureRule != null) && (secureRule.getRulePriv() != null))
            {
              if (secureRule.getRulePriv().byteValue() == 1) {
                secureRule.setRulePrivName("系统管理员");
              }
              else if (secureRule.getRulePriv().byteValue() == 2) {
                secureRule.setRulePrivName("安全员");
              }
              else if (secureRule.getRulePriv().byteValue() == 3) {
                secureRule.setRulePrivName("审计员");
              }
              else {
                secureRule.setRulePrivName("");
              }
            }
          }
        }
        json.setObj(allSecureRule);
        json.setFlag(0);
        json.setMsg("ok");
      }
      catch (Exception e) {
        json.setFlag(1);
        json.setMsg("err");
        e.printStackTrace();
      }
      return json;
    }
  
    public ToJson<Object> editSecureRule(HttpServletRequest request, SecureRule secureRule)
    {
      ToJson json = new ToJson(1, "err");
      try {
        int i = this.secureRuleMapper.updateByPrimaryKeySelective(secureRule);
        SecureLog secureLog = new SecureLog();
        if (secureRule.getRuleId() != null) {
          short i1 = secureRule.getRuleId().shortValue();
          secureLog.setRuleId(Short.valueOf(i1));
        }
  
        Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
        Integer uid = users.getUid();
        secureLog.setUid(uid);
        Date date = new Date();
        long time = date.getTime();
        int i1 = Math.abs((int)time);
        secureLog.setLogTime(Integer.valueOf(i1));
        secureLog.setRemark("修改" + secureRule.getRuleDesc());
        InetAddress currentIp = IpAddr.getCurrentIp();
        secureLog.setIp(currentIp.toString().substring(1, currentIp.toString().length()));
        int i2 = this.secureLogMapper.insertSelective(secureLog);
        if (i > 0) {
          json.setFlag(0);
          json.setMsg("ok");
        }
      } catch (Exception e) {
        json.setFlag(1);
        json.setMsg("err");
        e.printStackTrace();
      }
      return json;
    }
  
    public ToJson<SecureRule> getSecureById(String ruleId)
    {
      ToJson json = new ToJson(1, "err");
      try {
        if (ruleId != null) {
          SecureRule secureById = this.secureRuleMapper.getSecureById(Integer.valueOf(ruleId).intValue());
          if (secureById != null) {
            json.setFlag(0);
            json.setMsg("ok");
            json.setObject(secureById);
          } else {
            json.setFlag(0);
            json.setMsg("ok");
            json.setObject("");
          }
        }
      } catch (NumberFormatException e) {
        e.printStackTrace();
      }
      return json;
    }
  
    public ToJson<SecureRule> getAllInfoSecureRule()
    {
      ToJson json = new ToJson(1, "err");
      try {
        List<SecureRule> allInfoSecureRule = this.secureRuleMapper.getAllSecureRule();
        if (allInfoSecureRule != null) {
          for (SecureRule secureRule : allInfoSecureRule) {
            System.out.println(secureRule);
          }
        }
        json.setObj(allInfoSecureRule);
        json.setFlag(0);
        json.setMsg("ok");
      } catch (Exception e) {
        json.setFlag(1);
        json.setMsg("err");
        e.printStackTrace();
      }
      return json;
    }
  }

