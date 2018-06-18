 package com.myoa.service.portal;
 
 import com.myoa.dao.portal.CapacitySiteInfoMapper;
import com.myoa.model.portal.CapacitySiteInfo;
import com.myoa.model.users.Users;
import com.myoa.service.portal.wrapper.PortalWrapper;
import com.myoa.util.DateFormat;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrappers;

 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class CapacitySiteInfoService
 {
 
   @Autowired
   private CapacitySiteInfoMapper capacitySiteInfoMapper;
 
   public PortalWrapper addCapacitySiteInfo(CapacitySiteInfo capacitySiteInfo, HttpServletRequest request)
   {
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     PortalWrapper portalWrapper = new PortalWrapper();
     portalWrapper.setStatus(true);
     capacitySiteInfo.setCrUserid(users.getUid());
     capacitySiteInfo.setCrUsername(users.getUserId());
     capacitySiteInfo.setCrTime(DateFormat.DateToStr(DateFormat.getCurrentTime()));
     capacitySiteInfo.setDetailTpl(Integer.valueOf(0));
     int a = this.capacitySiteInfoMapper.insertSelective(capacitySiteInfo);
     if (a > 0) {
       portalWrapper.setFlag(true);
       portalWrapper.setMsg("OK");
       portalWrapper.setData(capacitySiteInfo);
     } else {
       portalWrapper.setFlag(false);
       portalWrapper.setMsg("err");
     }
     return portalWrapper;
   }
   public PortalWrapper updateCapacitySiteInfo(CapacitySiteInfo capacitySiteInfo, HttpServletRequest request) {
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     PortalWrapper portalWrapper = new PortalWrapper();
     portalWrapper.setStatus(true);
     capacitySiteInfo.setCrUserid(users.getUid());
     capacitySiteInfo.setCrUsername(users.getUserId());
     capacitySiteInfo.setCrTime(DateFormat.DateToStr(DateFormat.getCurrentTime()));
     int a = this.capacitySiteInfoMapper.updateByPrimaryKeySelective(capacitySiteInfo);
     if (a > 0) {
       portalWrapper.setFlag(true);
       portalWrapper.setMsg("OK");
       portalWrapper.setData(capacitySiteInfo);
     } else {
       portalWrapper.setFlag(false);
       portalWrapper.setMsg("err");
     }
     return portalWrapper;
   }
 
   public BaseWrappers selectCapacitySiteInfoList(HttpServletRequest request, Integer page, Integer pageSize)
   {
     BaseWrappers baseWrappers = new BaseWrappers();
     Map objectMap = new HashMap();
     page = Integer.valueOf((page.intValue() - 1) * pageSize.intValue());
     objectMap.put("page", page);
     objectMap.put("pageSize", pageSize);
     List capacitySiteInfos = this.capacitySiteInfoMapper.selectList(objectMap);
     Integer total = this.capacitySiteInfoMapper.selectCount(objectMap);
     baseWrappers.setStatus(true);
     baseWrappers.setFlag(true);
     baseWrappers.setMsg("ok");
     baseWrappers.setDatas(capacitySiteInfos);
     baseWrappers.setTotal(total);
     return baseWrappers;
   }
   public PortalWrapper queryCapacitySiteInfoOne(Integer sid) {
     PortalWrapper portalWrapper = new PortalWrapper();
     portalWrapper.setStatus(true);
     CapacitySiteInfo capacitySiteInfo = this.capacitySiteInfoMapper.selectByPrimaryKey(sid);
     if (capacitySiteInfo != null) {
       portalWrapper.setData(capacitySiteInfo);
       portalWrapper.setMsg("ok");
       portalWrapper.setFlag(true);
     }
     else {
       portalWrapper.setMsg("err");
       portalWrapper.setFlag(false);
     }
     return portalWrapper;
   }
   public PortalWrapper deleteCapacitySiteInfoOne(Integer sid) {
     PortalWrapper portalWrapper = new PortalWrapper();
     portalWrapper.setStatus(true);
     Integer capacitySiteInfo = Integer.valueOf(this.capacitySiteInfoMapper.deleteByPrimaryKey(sid));
     if (capacitySiteInfo.intValue() > 0) {
       portalWrapper.setFlag(true);
       portalWrapper.setMsg("OK");
     } else {
       portalWrapper.setFlag(false);
       portalWrapper.setMsg("err");
     }
     return portalWrapper;
   }
 }

