 package com.myoa.service.menu.impl;
 
 import com.myoa.dao.menu.SysFunctionMapper;
import com.myoa.dao.menu.SysMenuMapper;
import com.myoa.model.menu.SysFunction;
import com.myoa.model.menu.SysMenu;
import com.myoa.service.menu.SelectMenuService;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.wrapper.BaseWrappers;

 import java.util.ArrayList;
 import java.util.List;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 @Transactional
 @Service
 public class SelectMenuServiceImpl
   implements SelectMenuService
 {
 
   @Resource
   private SysMenuMapper sysMenuMapper;
 
   @Resource
   private SysFunctionMapper sysFunctionMapper;
 
   public BaseWrappers getAll(String locale)
   {
     BaseWrappers baseWrappers = new BaseWrappers();
     baseWrappers.setStatus(true);
     baseWrappers.setFlag(false);
 
     List<SysMenu> menus = this.sysMenuMapper.getDatagrid();
     List newFunctions = new ArrayList();
 
     List<SysFunction> functions = this.sysFunctionMapper.getAll();
     if (menus == null) {
       baseWrappers.setMsg("没有数据");
       return baseWrappers;
     }
     for (SysMenu menu : menus) {
       SysFunction function = new SysFunction();
       function.setId(menu.getId());
       function.setExt(menu.getExt());
       function.setName(menu.getName());
       function.setName1(menu.getName1());
       function.setName2(menu.getName2());
       function.setName3(menu.getName3());
       function.setName4(menu.getName4());
       function.setName5(menu.getName5());
       newFunctions.add(function);
     }
 
     if (functions == null) {
       baseWrappers.setFlag(true);
       baseWrappers.setMsg("没有合适的子菜单");
       baseWrappers.setDatas(newFunctions);
       return baseWrappers;
     }
     for (SysFunction function : functions) {
       String coreStr = function.getUrl();
       if ((!StringUtils.checkNull(coreStr).booleanValue()) && 
         (coreStr.trim().startsWith("@"))) {
         newFunctions.add(function);
       }
 
     }
 
     List resultData = queryByMenuId(Integer.valueOf(2), newFunctions, "");
     if (resultData != null) {
       baseWrappers.setFlag(true);
       baseWrappers.setMsg("看看结果");
       baseWrappers.setDatas(resultData);
     }
     else {
       baseWrappers.setFlag(false);
       baseWrappers.setMsg("看看结果");
       baseWrappers.setDatas(resultData);
     }
     return baseWrappers;
   }
 
   private List<SysFunction> queryByMenuId(Integer subLength, List<SysFunction> newFunctions, String idParent) {
     if (newFunctions == null) return null;
     List datas = new ArrayList();
     for (SysFunction sort : newFunctions) {
       String subStr = sort.getId();
       if ((subStr.length() == subLength.intValue()) && (
         (subLength.intValue() == 2) || (subStr.startsWith(idParent)))) {
         sort.setChild(queryByMenuId(Integer.valueOf(subLength.intValue() + 2), newFunctions, subStr));
         datas.add(sort);
       }
     }
 
     return datas;
   }
 }

