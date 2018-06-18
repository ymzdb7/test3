  package com.myoa.service.address.impl;
  
  import com.myoa.dao.address.AddressGroupMapper;
import com.myoa.dao.address.AddressMapper;
import com.myoa.dao.hierarchical.HierarchicalGlobalMapper;
import com.myoa.dao.hr.HrStaffInfoMapper;
import com.myoa.model.address.Address;
import com.myoa.model.address.AddressWithBLOBs;
import com.myoa.model.addressGroup.AddressGroup;
import com.myoa.model.addressGroup.AddressGroupWithBLOBs;
import com.myoa.model.hierarchical.HierarchicalGlobal;
import com.myoa.model.hr.HrStaffInfo;
import com.myoa.model.users.Users;
import com.myoa.service.address.AddressService;
import com.myoa.util.ExcelUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.page.PageParams;

  import java.io.File;
  import java.io.FileInputStream;
  import java.io.InputStream;
  import java.math.BigDecimal;
  import java.text.SimpleDateFormat;
  import java.util.ArrayList;
  import java.util.Date;
  import java.util.HashMap;
  import java.util.Iterator;
  import java.util.List;
  import java.util.Map;
  import java.util.ResourceBundle;
  import java.util.UUID;
  import javax.servlet.ServletOutputStream;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse;
  import org.apache.commons.collections.map.HashedMap;
  import org.apache.poi.hssf.usermodel.HSSFSheet;
  import org.apache.poi.hssf.usermodel.HSSFWorkbook;
  import org.apache.poi.ss.usermodel.Cell;
  import org.apache.poi.ss.usermodel.CellStyle;
  import org.apache.poi.ss.usermodel.DateUtil;
  import org.apache.poi.ss.usermodel.Row;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
  
  @Service
  public class AddressServiceImpl
    implements AddressService
  {
  
    @Autowired
    AddressMapper addressMapper;
  
    @Autowired
    AddressGroupMapper addressGroupMapper;
  
    @Autowired
    HierarchicalGlobalMapper hierarchicalGlobalMapper;
  
    @Autowired
    HrStaffInfoMapper hrStaffInfoMapper;
  
    public BaseWrapper getUsersById(HttpServletRequest request, String groupId, String PUBLIC_FLAG, String SHARE_TYPE, String TYPE)
    {
      BaseWrapper baseWrapper = new BaseWrapper();
  
      Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
      if ((groupId != null) && 
        (groupId.equals("-1"))) {
        groupId = null;
      }
      List data = new ArrayList();
      List addressList = new ArrayList();
      List<AddressGroupWithBLOBs> addressGroupWithBLOBs2;
      Iterator i$;
      Address address;
      if (groupId == null) {
        Map param1 = new HashMap();
        param1.put("userId", users.getUserId());
        List<AddressGroupWithBLOBs> addressGroupWithBLOBs1 = this.addressGroupMapper.selectPublicGroup(param1);
        String privDept = null;
        String privRole = null;
        String privUser = null;
        Map maps = new HashMap();
        if ((users != null) && (users.getUserId() != null)) {
          privUser = users.getUserId();
          privRole = users.getUserPriv() + "";
          privDept = users.getDeptId() + "";
        }
        maps.put("userId", "");
        maps.put("privDept", privDept);
        maps.put("privRole", privRole);
        maps.put("privUser", privUser);
        addressGroupWithBLOBs2 = new ArrayList();
        List<AddressGroupWithBLOBs> addressGroupWithBLOBsList = this.addressGroupMapper.selectAllAddressGroup(maps);
  
        if (addressGroupWithBLOBs1.size() > 0) {
          for (AddressGroupWithBLOBs addressGroupWithBLOBs4 : addressGroupWithBLOBs1) {
            addressGroupWithBLOBs2.add(addressGroupWithBLOBs4);
          }
        }
        if (addressGroupWithBLOBsList.size() > 0) {
          for (AddressGroupWithBLOBs addressGroupWithBLOBs3 : addressGroupWithBLOBsList) {
            addressGroupWithBLOBs2.add(addressGroupWithBLOBs3);
          }
        }
        Map param = new HashedMap();
        param.put("userId", users.getUserId());
        param.put("groupId", groupId);
        data = this.addressMapper.getUsersById(param);
        for (i$ = data.iterator(); i$.hasNext(); ) { address = (Address)i$.next();
          for (AddressGroupWithBLOBs addressGroupWithBLOBs : addressGroupWithBLOBs2) {
            if (address.getGroupId().intValue() == 0) {
              addressList.add(address);
              break;
            }if (address.getGroupId() == addressGroupWithBLOBs.getGroupId())
              addressList.add(address);
          }
        }
      }
      else
      {
        Map param = new HashedMap();
        param.put("userId", users.getUserId());
        param.put("groupId", groupId);
        addressList = this.addressMapper.getUsersById(param);
      }
      baseWrapper.setData(addressList);
      baseWrapper.setStatus(true);
      return baseWrapper;
    }
  
    public BaseWrapper getAddressUser(HttpServletRequest request, String groupId, String PUBLIC_FLAG, String SHARE_TYPE, String TYPE)
    {
      BaseWrapper baseWrapper = new BaseWrapper();
  
      Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
      if ((groupId != null) && 
        (groupId.equals("-1"))) {
        groupId = null;
      }
      List data = new ArrayList();
      List addressList = new ArrayList();
      List<AddressGroupWithBLOBs>  addressGroupWithBLOBs2;
      Iterator i$;
      Address address;
      if (groupId == null) {
        Map param1 = new HashMap();
        param1.put("userId", users.getUserId());
        List<AddressGroupWithBLOBs> addressGroupWithBLOBs1 = this.addressGroupMapper.selectPublicGroup(param1);
        String privDept = null;
        String privRole = null;
        String privUser = null;
        Map maps = new HashMap();
        if ((users != null) && (users.getUserId() != null)) {
          privUser = users.getUserId();
          privRole = users.getUserPriv() + "";
          privDept = users.getDeptId() + "";
        }
        maps.put("userId", "");
        maps.put("privDept", privDept);
        maps.put("privRole", privRole);
        maps.put("privUser", privUser);
        addressGroupWithBLOBs2 = new ArrayList();
        List<AddressGroupWithBLOBs>  addressGroupWithBLOBsList = this.addressGroupMapper.selectAllAddressGroup(maps);
  
        if (addressGroupWithBLOBs1.size() > 0) {
          for (AddressGroupWithBLOBs addressGroupWithBLOBs4 : addressGroupWithBLOBs1) {
            addressGroupWithBLOBs2.add(addressGroupWithBLOBs4);
          }
        }
        if (addressGroupWithBLOBsList.size() > 0) {
          for (AddressGroupWithBLOBs addressGroupWithBLOBs3 : addressGroupWithBLOBsList) {
            addressGroupWithBLOBs2.add(addressGroupWithBLOBs3);
          }
        }
        Map param = new HashedMap();
        param.put("userId", users.getUserId());
        param.put("groupId", groupId);
        data = this.addressMapper.getUsersById(param);
        for (i$ = data.iterator(); i$.hasNext(); ) { address = (Address)i$.next();
          for (AddressGroupWithBLOBs addressGroupWithBLOBs : addressGroupWithBLOBs2) {
            if (address.getGroupId().intValue() == 0) {
              addressList.add(address);
              break;
            }if (address.getGroupId() == addressGroupWithBLOBs.getGroupId())
              addressList.add(address);
          }
        }
      }
      else
      {
        Map param = new HashedMap();
        param.put("userId", users.getUserId());
        param.put("groupId", groupId);
        addressList = this.addressMapper.getUsersById(param);
      }
      baseWrapper.setData(addressList);
      baseWrapper.setStatus(true);
      return baseWrapper;
    }
  
    public BaseWrapper selectByPrimaryKey(String addId)
    {
      BaseWrapper baseWrapper = new BaseWrapper();
      baseWrapper.setData(this.addressMapper.selectByPrimaryKey(Integer.valueOf(Integer.parseInt(addId))));
      baseWrapper.setStatus(true);
      baseWrapper.setFlag(true);
      return baseWrapper;
    }
  
    public BaseWrapper addUser(HttpServletRequest request, AddressWithBLOBs addressWithBLOBs, String birthday)
    {
      BaseWrapper baseWrapper = new BaseWrapper();
      Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
      try {
        if (!StringUtils.checkNull(birthday).booleanValue()) {
          Date d = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
          addressWithBLOBs.setBirthday(d);
        }
        addressWithBLOBs.setUserId(users.getUserId());
        if (this.addressMapper.insert(addressWithBLOBs) > 0) {
          baseWrapper.setStatus(true);
          baseWrapper.setFlag(true);
          baseWrapper.setData(addressWithBLOBs);
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
  
      return baseWrapper;
    }
  
    public BaseWrapper getNotUserById(HttpServletRequest request, String groupId, String PUBLIC_FLAG, String SHARE_TYPE, String TYPE) {
      BaseWrapper baseWrapper = new BaseWrapper();
  
      Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
  
      Map param = new HashedMap();
      param.put("userId", users.getUserId());
      param.put("groupId", groupId);
      List data = this.addressMapper.getNotUserById(param);
      List addressList = new ArrayList();
      Map map = new HashMap();
      map.put("userId", "");
      List addressGroupWithBLOBsList = this.addressGroupMapper.selectPublicGroup(map);
      boolean a = false;
      for (int x = 0; x < data.size(); x++) {
        for (int y = 0; y < addressGroupWithBLOBsList.size(); y++) {
          if (((Address)data.get(x)).getGroupId() == ((AddressGroupWithBLOBs)addressGroupWithBLOBsList.get(y)).getGroupId())
            a = true;
          else {
            a = false;
          }
          if (a) {
            data.remove(x);
            x--;
            break;
          }
        }
      }
      baseWrapper.setData(data);
      baseWrapper.setStatus(true);
      return baseWrapper;
    }
  
    public BaseWrapper updateUser(HttpServletRequest request, AddressWithBLOBs addressWithBLOBs, String birthday) {
      BaseWrapper baseWrapper = new BaseWrapper();
      Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
      try
      {
        if (!StringUtils.checkNull(birthday).booleanValue()) {
          Date d = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
          addressWithBLOBs.setBirthday(d);
        }
        addressWithBLOBs.setUserId(users.getUserId());
        if (this.addressMapper.updateByPrimaryKey(addressWithBLOBs) > 0) {
          baseWrapper.setStatus(true);
          baseWrapper.setFlag(true);
          baseWrapper.setData(addressWithBLOBs);
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
  
      return baseWrapper;
    }
  
    public BaseWrapper deleteUser(HttpServletRequest request, Integer addId) {
      BaseWrapper baseWrapper = new BaseWrapper();
      if (this.addressMapper.deleteByPrimaryKey(addId) > 0) {
        baseWrapper.setStatus(true);
        baseWrapper.setFlag(true);
        baseWrapper.setData("删除成功");
      }
      return baseWrapper;
    }
  
    public BaseWrapper queryAddress(Integer groupId, String name)
    {
      BaseWrapper baseWrapper = new BaseWrapper();
      try {
        List addresses = this.addressMapper.queryAddress(groupId, name);
        baseWrapper.setStatus(true);
        baseWrapper.setFlag(true);
        baseWrapper.setData(addresses);
      } catch (Exception e) {
        e.printStackTrace();
        baseWrapper.setStatus(false);
        baseWrapper.setFlag(false);
      }
      return baseWrapper;
    }
  
    public BaseWrapper getColleagues(HttpServletRequest request)
    {
      BaseWrapper baseWrapper = new BaseWrapper();
      Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
      boolean flag = false;
      HierarchicalGlobal hierarchicalGlobal = new HierarchicalGlobal();
      hierarchicalGlobal.setModelId("0132");
      HierarchicalGlobal global = this.hierarchicalGlobalMapper.selByModel(hierarchicalGlobal);
  
      String globalDepts = global.getGlobalDept();
      String globalPersons = global.getGlobalPerson();
      String globalPriv = global.getGlobalPriv();
  
      if (!StringUtils.checkNull(globalDepts).booleanValue()) {
        String[] split = globalDepts.split(",");
        if (split.length > 0) {
          for (String deptId : split) {
            if (deptId.equals(user.getDeptId()))
              flag = true;
          }
        }
      }
      else if (!StringUtils.checkNull(globalPriv).booleanValue()) {
        String[] split = globalPriv.split(",");
        if (split.length > 0) {
          for (String userPriv : split) {
            if (userPriv.equals(user.getUserPriv()))
              flag = true;
          }
        }
      }
      else if (!StringUtils.checkNull(globalPersons).booleanValue()) {
        String[] split = globalPersons.split(",");
        if (split.length > 0) {
          for (String userId : split) {
            if (userId.equals(user.getUserId())) {
              flag = true;
            }
          }
  
        }
  
      }
  
      if (flag) {
        List alluser = this.addressMapper.getAllUsers(null);
        baseWrapper.setData(alluser);
        baseWrapper.setFlag(true);
        baseWrapper.setStatus(true);
      } else {
        Map map = new HashMap();
        map.put("deptId", user.getDeptId());
        List usersByDeptId = this.addressMapper.getAllUsers(map);
        baseWrapper.setData(usersByDeptId);
        baseWrapper.setFlag(true);
        baseWrapper.setStatus(true);
      }
  
      return baseWrapper;
    }
  
    public ToJson<Address> importAddress(HttpServletRequest request, HttpServletResponse response, MultipartFile file)
    {
      ToJson json = new ToJson();
      try
      {
        ResourceBundle rb = ResourceBundle.getBundle("upload");
        String osName = System.getProperty("os.name");
        StringBuffer path = new StringBuffer();
        if (osName.toLowerCase().startsWith("win"))
          path = path.append(rb.getString("upload.win"));
        else {
          path = path.append(rb.getString("upload.linux"));
        }
  
        if (file.isEmpty()) {
          json.setMsg("请上传文件！");
          json.setFlag(1);
          return json;
        }
        String fileName = file.getOriginalFilename();
        if ((fileName.endsWith(".xls")) || (fileName.endsWith(".xlsx"))) {
          String uuid = UUID.randomUUID().toString().replaceAll("-", "");
          int pos = fileName.indexOf(".");
          String extName = fileName.substring(pos);
          String newFileName = uuid + extName;
          File dest = new File(path.toString(), newFileName);
          file.transferTo(dest);
  
          String readPath = path.append(System.getProperty("file.separator")).append(newFileName).toString();
          InputStream in = new FileInputStream(readPath);
          HSSFWorkbook excelObj = new HSSFWorkbook(in);
          HSSFSheet sheetObj = excelObj.getSheetAt(0);
          Row row = sheetObj.getRow(0);
          int colNum = row.getPhysicalNumberOfCells();
          int lastRowNum = sheetObj.getLastRowNum();
          Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
          Address address = null;
  
          for (int i = 1; i <= lastRowNum; i++) {
            address = new Address();
            address.setUserId(users.getUserId());
            row = sheetObj.getRow(i);
            if (row != null) {
              for (int j = 0; j < colNum; j++) {
                Cell cell = row.getCell(j);
                if (cell != null) {
                  switch (j)
                  {
                  case 0:
                    String group = cell.getStringCellValue();
                    if ((group.equals("默认")) || (group.equals(""))) {
                      address.setGroupId(Integer.valueOf(0));
                    } else {
                      AddressGroup addressGroup1 = new AddressGroup();
                      addressGroup1.setGroupName(group);
                      AddressGroup addressGroup = this.addressGroupMapper.selectGroup(addressGroup1);
                      address.setGroupId(addressGroup.getGroupId());
                    }
                    break;
                  case 1:
                    address.setPsnName(cell.getStringCellValue());
                    break;
                  case 2:
                    String sex = cell.getStringCellValue();
                    if (sex.equals("男"))
                      address.setSex("0");
                    else if (sex.equals("女"))
                      address.setSex("1");
                    else {
                      address.setSex("");
                    }
                    break;
                  case 3:
                    address.setNickName(cell.getStringCellValue());
                    break;
                  case 4:
                    String result = null;
                    if (cell.getCellType() != 0) continue;
                    short format = cell.getCellStyle().getDataFormat();
                    SimpleDateFormat sdf = null;
                    if ((format == 14) || (format == 31) || (format == 57) || (format == 58))
                    {
                      sdf = new SimpleDateFormat("yyyy-MM-dd");
                    } else if ((format == 20) || (format == 32))
                    {
                      sdf = new SimpleDateFormat("HH:mm");
                    }
                    double v = cell.getNumericCellValue();
                    Date dates = DateUtil.getJavaDate(v);
                    result = sdf.format(dates);
                    address.setBirthday(dates);
                    break;
                  case 5:
                    address.setMinistration(cell.getStringCellValue());
                    break;
                  case 6:
                    address.setMate(cell.getStringCellValue());
                    break;
                  case 7:
                    address.setChild(cell.getStringCellValue());
                    break;
                  case 8:
                    address.setDeptName(cell.getStringCellValue());
                    break;
                  case 9:
                    address.setAddDept(cell.getStringCellValue());
                    break;
                  case 10:
                    address.setPostNoDept(cell.getStringCellValue());
                    break;
                  case 11:
                    address.setTelNoDept(cell.getStringCellValue());
                    break;
                  case 12:
                    address.setFaxNoDept(cell.getStringCellValue());
                    break;
                  case 13:
                    address.setAddHome(cell.getStringCellValue());
                    break;
                  case 14:
                    address.setPostNoHome(cell.getStringCellValue());
                    break;
                  case 15:
                    address.setTelNoHome(cell.getStringCellValue());
                    break;
                  case 16:
                    address.setMobilNo(cell.getStringCellValue());
                    break;
                  case 17:
                    address.setBpNo(cell.getStringCellValue());
                    break;
                  case 18:
                    address.setEmail(cell.getStringCellValue());
                    break;
                  case 19:
                    address.setOicqNo(cell.getStringCellValue());
                    break;
                  case 20:
                    address.setIcqNo(cell.getStringCellValue());
                    break;
                  case 21:
                    address.setNotes(cell.getStringCellValue());
                    break;
                  default:
                    json.setFlag(0);
                    json.setMsg("err");
                  }
                }
              }
            }
  
          }
  
          dest.delete();
        }
  
      }
      catch (Exception e)
      {
        e.printStackTrace();
        json.setMsg("err");
        json.setFlag(1);
      }
      return json;
    }
  
    public BaseWrapper exportAddress(HttpServletRequest request, HttpServletResponse response, Integer groupId)
    {
      BaseWrapper baseWrapper = new BaseWrapper();
      try {
        Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
  
        Map param = new HashedMap();
        param.put("userId", users.getUserId());
        param.put("groupId", groupId);
        List<Address> data = this.addressMapper.getUsersById(param);
        List<AddressGroup> groups = this.addressGroupMapper.getAllGroupsMap();
        Map groupsMap = new HashMap();
  
        for (AddressGroup addressGroup : groups) {
          groupsMap.put(addressGroup.getGroupId(), addressGroup.getGroupName());
        }
  
        for (Address a : data) {
          if (a.getGroupId() != null)
            a.setGroupName((String)groupsMap.get(a.getGroupId()));
          else {
            a.setGroupName("全部");
          }
        }
        HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("联系人信息", 9);
        String[] secondTitles = { "分组", "姓名", "职位", "昵称", "电子邮件", "手机", "QQ", "性别", "生日", "配偶", "子女", "家庭邮编", "家庭地址", "家庭电话", "单位名称", "单位邮编", "单位地址", "工作电话", "工作传真", "备注" };
        HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
        String[] beanProperty = { "groupName", "psnName", "ministration", "nickName", "email", "mobilNo", "oicqNo", "sex", "birthday", "mobilNo", "mate", "child", "postNoHome", "addHome", "telNoHome", "deptName", "postNoDept", "addDept", "telNoDept", "faxNoDept", "notes" };
  
        HSSFWorkbook workbook = ExcelUtil.exportExcelData(workbook2, data, beanProperty);
        ServletOutputStream out = response.getOutputStream();
  
        String filename = "联系人信息表.xls";
        filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("content-disposition", "attachment;filename=" + filename);
        workbook.write(out);
      } catch (Exception e) {
        e.printStackTrace();
      }
      return baseWrapper;
    }
  
    public ToJson<Address> selectAddress(HttpServletRequest request, Integer page, Integer pageSize, boolean useFlag, Address address, String export, HttpServletResponse response)
    {
      ToJson json = new ToJson();
      try {
        PageParams pageParams = new PageParams();
        pageParams.setPage(page);
        pageParams.setPageSize(pageSize);
        pageParams.setUseFlag(Boolean.valueOf(useFlag));
        Map map = new HashMap();
        map.put("page", pageParams);
        map.put("address", address);
        List<Address> addressList = this.addressMapper.selectAddress(map);
        if ((addressList != null) && (addressList.size() > 0)) {
          for (Address address1 : addressList) {
            if (address1.getGroupId().intValue() == 0) {
              address1.setGroupName("默认");
            } else {
              AddressGroup addressGroup1 = new AddressGroup();
              addressGroup1.setGroupId(address1.getGroupId());
              AddressGroup addressGroup = this.addressGroupMapper.selectGroup(addressGroup1);
              address1.setGroupName(addressGroup.getGroupName());
            }
          }
        }
        if (export == null) {
          export = "0";
        }
        if (export.equals("1")) {
          HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("联系人信息", 20);
          String[] secondTitles = { "分组", "姓名", "职位", "昵称", "电子邮件", "手机", "QQ", "性别", "生日", "配偶", "子女", "家庭邮编", "家庭地址", "家庭电话", "单位名称", "单位邮编", "单位地址", "工作电话", "工作传真", "备注" };
  
          HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
          String[] beanProperty = { "groupName", "psnName", "ministration", "nickName", "email", "mobilNo", "oicqNo", "sex", "birthday", "mobilNo", "mate", "child", "postNoHome", "addHome", "telNoHome", "deptName", "postNoDept", "addDept", "telNoDept", "faxNoDept", "notes" };
          HSSFWorkbook workbook = ExcelUtil.exportExcelData(workbook2, addressList, beanProperty);
          ServletOutputStream out = response.getOutputStream();
          String filename = "联系人信息表.xls";
          filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
          response.setContentType("application/vnd.ms-excel;charset=UTF-8");
          response.setHeader("content-disposition", "attachment;filename=" + filename);
          workbook.write(out);
          out.close();
        }
  
        json.setObj(addressList);
        json.setTotleNum(pageParams.getTotal());
        json.setFlag(0);
        json.setMsg("ok");
      } catch (Exception e) {
        e.printStackTrace();
        json.setMsg(e.getMessage());
        json.setFlag(1);
      }
  
      return json;
    }
  
    public ToJson<Users> selectUser(HttpServletRequest request, Integer page, Integer pageSize, boolean useFlag, Users user)
    {
      ToJson json = new ToJson();
      try {
        PageParams pageParams = new PageParams();
        pageParams.setPage(page);
        pageParams.setPageSize(pageSize);
        pageParams.setUseFlag(Boolean.valueOf(useFlag));
        Map map = new HashMap();
        map.put("page", pageParams);
        map.put("user", user);
        List usersList = this.addressMapper.selectUser(map);
        json.setObj(usersList);
        json.setTotleNum(pageParams.getTotal());
        json.setFlag(0);
        json.setMsg("ok");
      } catch (Exception e) {
        e.printStackTrace();
        json.setMsg(e.getMessage());
        json.setFlag(1);
      }
      return json;
    }
    public ToJson<Users> getUserInfoById(Integer uid, HttpServletRequest request) {
      ToJson json = new ToJson();
      try {
        Users loginUser = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
        HrStaffInfo hrStaffInfo = this.hrStaffInfoMapper.getStaffByUserId(loginUser.getUserId());
        Users user = new Users();
        if ((hrStaffInfo == null) || (hrStaffInfo.getUserdef5().equals("1"))) {
          user = this.addressMapper.getUserById(uid);
          HrStaffInfo hrStaffInfo1 = this.hrStaffInfoMapper.getStaffByUserId(user.getUserId());
          if ((hrStaffInfo1 != null) && 
            (hrStaffInfo1.getUserdef5() != null) && (hrStaffInfo1.getUserdef5() != "") && (
            (hrStaffInfo1.getUserdef5().equals("4")) || (hrStaffInfo1.getUserdef5().equals("5")))) {
            user.setTelNoDept("没有权限");
            user.setMobilNo("没有权限");
          }
  
        }
  
        json.setObject(user);
        json.setFlag(0);
        json.setMsg("ok");
      } catch (Exception e) {
        e.printStackTrace();
        json.setMsg(e.getMessage());
        json.setFlag(1);
      }
      return json;
    }
  
    public ToJson<AddressWithBLOBs> importPublicAddressWithBLOBs(Integer groupId, MultipartFile file, HttpServletRequest request, HttpServletResponse response)
    {
      ToJson json = new ToJson();
  
      Integer successCount = Integer.valueOf(0);
      try
      {
        ResourceBundle rb = ResourceBundle.getBundle("upload");
        String osName = System.getProperty("os.name");
        StringBuffer path = new StringBuffer();
        if (osName.toLowerCase().startsWith("win"))
          path = path.append(rb.getString("upload.win"));
        else {
          path = path.append(rb.getString("upload.linux"));
        }
        String path1 = path.toString();
  
        if (file.isEmpty()) {
          json.setMsg("请上传文件！");
          json.setFlag(1);
          return json;
        }
        String fileName = file.getOriginalFilename();
        if ((fileName.endsWith(".xls")) || (fileName.endsWith(".xlsx"))) {
          String uuid = UUID.randomUUID().toString().replaceAll("-", "");
          int pos = fileName.indexOf(".");
          String extName = fileName.substring(pos);
          String newFileName = uuid + extName;
          if (!file.isEmpty()) {
            try {
              if (!new File(path1, newFileName).exists()) {
                new File(path1, newFileName).mkdirs();
              }
  
              file.transferTo(new File(path1, newFileName));
            } catch (Exception e) {
              e.printStackTrace();
            }
  
          }
  
          String readPath = path.append(System.getProperty("file.separator")).append(newFileName).toString();
          InputStream in = new FileInputStream(readPath);
          HSSFWorkbook excelObj = new HSSFWorkbook(in);
          HSSFSheet sheetObj = excelObj.getSheetAt(0);
          Row row = sheetObj.getRow(0);
          int colNum = row.getPhysicalNumberOfCells();
          int lastRowNum = sheetObj.getLastRowNum();
          Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
          AddressWithBLOBs address = null;
          for (int i = 1; i <= lastRowNum; i++) {
            address = new AddressWithBLOBs();
            address.setGroupId(groupId);
            address.setUserId(users.getUserId());
            row = sheetObj.getRow(i);
            if (row != null) {
              for (int j = 0; j < colNum; j++) {
                Cell cell = row.getCell(j);
                String value = "";
                if (cell != null) {
                  switch (j)
                  {
                  case 0:
                    address.setPsnName(cell.getStringCellValue());
                    break;
                  case 1:
                    String sex = cell.getStringCellValue();
                    if (sex.equals("男"))
                      address.setSex("0");
                    else if (sex.equals("女"))
                      address.setSex("1");
                    else {
                      address.setSex("");
                    }
                    break;
                  case 2:
                    address.setNickName(cell.getStringCellValue());
                    break;
                  case 3:
                    String result = null;
                    if (cell.getCellType() != 0) continue;
                    short format = cell.getCellStyle().getDataFormat();
                    SimpleDateFormat sdf = null;
                    if ((format == 14) || (format == 31) || (format == 57) || (format == 58))
                    {
                      sdf = new SimpleDateFormat("yyyy-MM-dd");
                    } else if ((format == 20) || (format == 32))
                    {
                      sdf = new SimpleDateFormat("HH:mm");
                    }
                    double v = cell.getNumericCellValue();
                    Date dates = DateUtil.getJavaDate(v);
                    result = sdf.format(dates);
                    address.setBirthday(dates);
                    break;
                  case 4:
                    address.setMinistration(cell.getStringCellValue());
                    break;
                  case 5:
                    address.setMate(cell.getStringCellValue());
                    break;
                  case 6:
                    address.setChild(cell.getStringCellValue());
                    break;
                  case 7:
                    address.setDeptName(cell.getStringCellValue());
                    break;
                  case 8:
                    address.setAddDept(cell.getStringCellValue());
                    break;
                  case 9:
                    BigDecimal big9 = new BigDecimal(cell.getNumericCellValue());
                    value = big9.toString();
  
                    if ((null != value) && (!"".equals(value.trim()))) {
                      String[] item = value.split("[.]");
                      if ((1 < item.length) && ("0".equals(item[1]))) {
                        value = item[0];
                      }
                    }
                    address.setPostNoDept(value);
                    break;
                  case 10:
                    BigDecimal big = new BigDecimal(cell.getNumericCellValue());
                    value = big.toString();
  
                    if ((null != value) && (!"".equals(value.trim()))) {
                      String[] item = value.split("[.]");
                      if ((1 < item.length) && ("0".equals(item[1]))) {
                        value = item[0];
                      }
                    }
                    address.setTelNoDept(value);
                    break;
                  case 11:
                    BigDecimal big11 = new BigDecimal(cell.getNumericCellValue());
                    value = big11.toString();
  
                    if ((null != value) && (!"".equals(value.trim()))) {
                      String[] item = value.split("[.]");
                      if ((1 < item.length) && ("0".equals(item[1]))) {
                        value = item[0];
                      }
                    }
                    address.setFaxNoDept(value);
                    break;
                  case 12:
                    address.setAddHome(cell.getStringCellValue());
                    break;
                  case 13:
                    BigDecimal big13 = new BigDecimal(cell.getNumericCellValue());
                    value = big13.toString();
  
                    if ((null != value) && (!"".equals(value.trim()))) {
                      String[] item = value.split("[.]");
                      if ((1 < item.length) && ("0".equals(item[1]))) {
                        value = item[0];
                      }
                    }
                    address.setPostNoHome(value);
                    break;
                  case 14:
                    BigDecimal big14 = new BigDecimal(cell.getNumericCellValue());
                    value = big14.toString();
  
                    if ((null != value) && (!"".equals(value.trim()))) {
                      String[] item = value.split("[.]");
                      if ((1 < item.length) && ("0".equals(item[1]))) {
                        value = item[0];
                      }
                    }
                    address.setTelNoHome(value);
                    break;
                  case 15:
                    BigDecimal big15 = new BigDecimal(cell.getNumericCellValue());
                    value = big15.toString();
  
                    if ((null != value) && (!"".equals(value.trim()))) {
                      String[] item = value.split("[.]");
                      if ((1 < item.length) && ("0".equals(item[1]))) {
                        value = item[0];
                      }
                    }
                    address.setMobilNo(value);
                    break;
                  case 16:
                    BigDecimal big16 = new BigDecimal(cell.getNumericCellValue());
                    value = big16.toString();
  
                    if ((null != value) && (!"".equals(value.trim()))) {
                      String[] item = value.split("[.]");
                      if ((1 < item.length) && ("0".equals(item[1]))) {
                        value = item[0];
                      }
                    }
                    address.setBpNo(value);
                    break;
                  case 17:
                    address.setEmail(cell.getStringCellValue());
                    break;
                  case 18:
                    BigDecimal big18 = new BigDecimal(cell.getNumericCellValue());
                    value = big18.toString();
  
                    if ((null != value) && (!"".equals(value.trim()))) {
                      String[] item = value.split("[.]");
                      if ((1 < item.length) && ("0".equals(item[1]))) {
                        value = item[0];
                      }
                    }
                    address.setOicqNo(value);
                    break;
                  case 19:
                    BigDecimal big19 = new BigDecimal(cell.getNumericCellValue());
                    value = big19.toString();
  
                    if ((null != value) && (!"".equals(value.trim()))) {
                      String[] item = value.split("[.]");
                      if ((1 < item.length) && ("0".equals(item[1]))) {
                        value = item[0];
                      }
                    }
                    address.setIcqNo(value);
                    break;
                  case 20:
                    address.setNotes(cell.getStringCellValue());
                    break;
                  default:
                    json.setFlag(0);
                    json.setMsg("err");
                  }
                }
              }
  
              int count = this.addressMapper.insertSelective(address);
              if (count > 0) {
                successCount = Integer.valueOf(successCount.intValue() + count);
              }
            }
          }
  
        }
  
        if (successCount.intValue() > 0) {
          json.setTotleNum(successCount);
          json.setMsg("ok");
          json.setFlag(0);
          return json;
        }
      } catch (Exception e) {
        e.printStackTrace();
        json.setMsg("err");
        json.setFlag(1);
      }
      return json;
    }
  }

