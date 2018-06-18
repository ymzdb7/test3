  package com.myoa.service.department.impl;
  
  import com.alibaba.fastjson.JSONArray;
  import com.alibaba.fastjson.JSONObject;
import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.department.Department;
import com.myoa.model.users.Users;
import com.myoa.service.department.DepartmentService;
import com.myoa.service.users.UsersService;
import com.myoa.util.ExcelUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.netdisk.ZipUtils;

  import java.io.File;
  import java.io.FileInputStream;
  import java.io.FileOutputStream;
  import java.io.InputStream;
  import java.io.OutputStream;
  import java.util.ArrayList;
  import java.util.HashMap;
  import java.util.Iterator;
  import java.util.List;
  import java.util.Map;
  import java.util.ResourceBundle;
  import java.util.UUID;
  import javax.annotation.Resource;
  import javax.servlet.ServletOutputStream;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse;
  import org.apache.poi.hssf.usermodel.HSSFSheet;
  import org.apache.poi.hssf.usermodel.HSSFWorkbook;
  import org.apache.poi.ss.usermodel.Cell;
  import org.apache.poi.ss.usermodel.Row;
  import org.jdom2.Document;
  import org.jdom2.Element;
  import org.jdom2.output.Format;
  import org.jdom2.output.XMLOutputter;
  import org.springframework.stereotype.Service;
  import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
  
  @Service
  public class DepartmentServiceImpl
    implements DepartmentService
  {
  
    @Resource
    private DepartmentMapper departmentMapper;
  
    @Resource
    private UsersService usersService;
  
    @Resource
    private UsersMapper usersMapper;
    static int times = 0;
  
    public List<String> getDeptNameById(int[] deptID)
    {
      List<String> list = new ArrayList();
  
      StringBuffer sb = new StringBuffer();
      for (int i = 0; i < deptID.length; i++) {
        if (deptID.length == 1) {
          String deptName = this.departmentMapper.getDeptNameById(deptID[i]);
          list.add(deptName);
          return list;
        }
        String deptName = this.departmentMapper.getDeptNameById(deptID[i]);
        if (i < deptID.length - 1)
          sb.append(deptName).append(",");
        else {
          sb.append(deptName);
        }
      }
  
      list.add(sb.toString());
      return list;
    }
  
    public String getDeptNameByDeptId(String deptId, String flag)
    {
      if (com.myoa.util.common.StringUtils.checkNull(deptId).booleanValue()) {
        return null;
      }
  
      StringBuffer sb = new StringBuffer();
      if ("ALL_DEPT".trim().equals(deptId)) {
        sb.append("全部部门");
      } else {
        String[] temp = deptId.split(flag);
        for (int i = 0; i < temp.length; i++) {
          if (!com.myoa.util.common.StringUtils.checkNull(temp[i]).booleanValue()) {
            String userName = this.departmentMapper.getDeptNameByDeptId(Integer.valueOf(Integer.parseInt(temp[i])));
            if (!com.myoa.util.common.StringUtils.checkNull(userName).booleanValue()) {
              if (i < temp.length - 1)
                sb.append(userName).append(",");
              else {
                sb.append(userName);
              }
            }
          }
        }
      }
      return sb.toString();
    }
  
    public String getDpNameById(int[] deptID)
    {
      StringBuffer sb = new StringBuffer();
      for (int i = 0; i < deptID.length; i++) {
        if (deptID.length == 1) {
          String deptName = this.departmentMapper.getDeptNameById(deptID[i]);
          return deptName;
        }
        String deptName = this.departmentMapper.getDeptNameById(deptID[i]);
        if (i < deptID.length - 1)
          sb.append(deptName).append(",");
        else {
          sb.append(deptName);
        }
      }
  
      return sb.toString();
    }
  
    public List<Department> getDatagrid()
    {
      List<Department> departmentList = this.departmentMapper.getDatagrid();
      StringBuffer bb1 = new StringBuffer();
      StringBuffer bb2 = new StringBuffer();
      StringBuffer bb3 = new StringBuffer();
      StringBuffer bb4 = new StringBuffer();
      for (Department dept : departmentList) {
        String manag = dept.getManager();
        String assistant = dept.getAssistantId();
        String leader1 = dept.getLeader1();
        String leader2 = dept.getLeader2();
        if ((manag != null) && (!manag.equals(""))) {
          String[] mm = manag.split(",");
          for (int j = 0; j < mm.length; j++) {
            String name2 = this.usersService.findUsersByuid(new int[] { Integer.parseInt(mm[j]) });
            if (name2 != null) {
              bb1.append(name2);
              bb1.append(",");
              dept.setManager(bb1.toString().substring(0, bb1.toString().length() - 1));
            }
          }
  
          bb1.delete(0, bb1.length());
        }
        if ((assistant != null) && (!assistant.equals(""))) {
          String[] cc = assistant.split(",");
          for (int j = 0; j < cc.length; j++) {
            String name3 = this.usersService.findUsersByuid(new int[] { Integer.parseInt(cc[j]) });
            if (name3 != null) {
              bb2.append(name3);
              bb2.append(",");
              dept.setAssistantId(bb2.toString().substring(0, bb2.toString().length() - 1));
            }
          }
  
          bb2.delete(0, bb2.length());
        }
        if ((leader1 != null) && (!leader1.equals(""))) {
          String[] dd = leader1.split(",");
          for (int j = 0; j < dd.length; j++) {
            String name4 = this.usersService.findUsersByuid(new int[] { Integer.parseInt(dd[j]) });
            if (name4 != null) {
              bb3.append(name4);
              bb3.append(",");
              dept.setLeader1(bb3.toString().substring(0, bb3.toString().length() - 1));
            }
          }
  
          bb3.delete(0, bb3.length());
        }
        if ((leader2 != null) && (!leader2.equals(""))) {
          String[] ee = leader2.split(",");
          for (int j = 0; j < ee.length; j++) {
            String name5 = this.usersService.findUsersByuid(new int[] { Integer.parseInt(ee[j]) });
            if (name5 != null) {
              bb4.append(name5);
              bb4.append(",");
              dept.setLeader2(bb4.toString().substring(0, bb4.toString().length() - 1));
            }
          }
  
          bb4.delete(0, bb4.length());
        }
      }
  
      return departmentList;
    }
  
    public Department getDeptById(int deptId)
    {
      Department department = this.departmentMapper.getDeptById(deptId);
      department.setDeptParentName(this.departmentMapper.getDeptNameByDeptId(department.getDeptParent()));
      return department;
    }
  
    public void deleteDept(int deptId)
    {
      this.departmentMapper.deleteDept(deptId);
    }
  
    public void editDept(Department department)
    {
      if ((department.getDeptParent() != null) && (department.getDeptParent().intValue() != 0)) {
        Department dept = this.departmentMapper.getDeptById(department.getDeptParent().intValue());
        department.setDeptNo(dept.getDeptNo() + department.getDeptNo());
      }
      this.departmentMapper.editDept(department);
    }
  
    public void insertDept(Department department)
    {
      this.departmentMapper.insertDept(department);
    }
  
    public List<Department> getDeptByMany(Department department)
    {
      List<Department> list = this.departmentMapper.getDeptByMany(department);
      return list;
    }
  
    public List<Department> getChDept(int deptId)
    {
      List<Department> list = this.departmentMapper.getChDept(deptId);
  
      return list;
    }
  
    public List<Department> getFatherDept(int deptParent, List<Department> list)
    {
      Department dep = this.departmentMapper.getFatherDept(deptParent);
      if (dep.getDeptParent().intValue() != 0) {
        list.add(dep);
      } else {
        list.add(dep);
        return list;
      }
      return getFatherDept(dep.getDeptParent().intValue(), list);
    }
  
    public String longDepName(int deptId) {
      Department department = this.departmentMapper.getFatherDept(deptId);
      List<Department> l = new ArrayList<Department>();
      List<Department> list = getFatherDept(department.getDeptId().intValue(), l);
      StringBuffer sb = new StringBuffer();
      for (int i = list.size() - 2; i >= 0; i--) {
        sb.append(((Department)list.get(i)).getDeptName());
        if (i > 0) {
          sb.append("/");
        }
      }
      return sb.toString();
    }
  
    public List<Department> getChDeptByNo(String deptNo)
    {
      List<Department> list = this.departmentMapper.getBydeptNo(deptNo);
      return list;
    }
  
    public List<Department> getChDtUser(int deptId)
    {
      List<Department> list = this.departmentMapper.getChDeptUser(deptId);
  
      return list;
    }
  
    public List<Department> getChDeptUser(int deptId)
    {
      List<Department> list = this.departmentMapper.getChDeptUser(deptId);
      List<Department> list1 = this.departmentMapper.getChDept(deptId);
      for (Department dep : list1) {
        Department department = getDeptById(dep.getDeptParent().intValue());
        dep.setDeptParentName(department.getDeptName());
        List<Department> list2 = new ArrayList<Department>();
        list2 = getChDept(dep.getDeptId().intValue());
        if (list2.size() != 0)
          dep.setIsHaveCh("1");
        else {
          dep.setIsHaveCh("0");
        }
      }
      if ((list.size() != 0) && (list1.size() != 0)) {
        for (int i = 0; i < list1.size(); i++) {
          list.add(list1.get(i));
        }
        return list;
      }
      if ((list.size() != 0) && (list1.size() == 0)) {
        return list;
      }
      if ((list.size() == 0) && (list1.size() != 0)) {
        return list1;
      }
      if ((list.size() == 0) && (list1.size() == 0)) {
        return list;
      }
      return list;
    }
  
    public int getCountChDeptUser(String deptNo)
    {
      int count = this.departmentMapper.getCountChDeptUser(deptNo);
      return count;
    }
  
    public List<Department> listDept()
    {
      List<Department> allDept = this.departmentMapper.getDatagrid();
  
      List<Department> deptParent = this.departmentMapper.getDepartmentByParet();
      for (Department department : deptParent) {
        if (ifChilds(allDept, department.getDeptId().intValue())) {
          List<Department> resultList = new ArrayList<Department>();
          resultList = getChildList(allDept, department.getDeptId().intValue(), resultList);
          department.setChild(resultList);
        }
      }
  
      return deptParent;
    }
  
    public List<Department> getFatherChildDept()
    {
      List<Department> allDeptList = this.departmentMapper.getDatagrid();
      List<Department> departments = addChildDeptToFather(allDeptList);
  
      return departments;
    }
  
    public List<Department> addChildDeptToFather(List<Department> departments)
    {
      ArrayList<Department> departmentList = new ArrayList<Department>();
      for (int i = 0; i < departments.size(); i++) {
        Department department = (Department)departments.get(i);
        department.setChild(new ArrayList<Department>());
        Integer deptId = department.getDeptId();
        for (int j = 0; j < departments.size(); j++) {
          if (((Department)departments.get(j)).getDeptParent().equals(deptId)) {
            department.getChild().add(departments.get(j));
          }
  
        }
  
        departmentList.add(department);
      }
  
      ArrayList<Department> fatherDeptList = new ArrayList<Department>();
  
      for (int i = 0; i < departmentList.size(); i++) {
        Integer deptParrentId = ((Department)departmentList.get(i)).getDeptParent();
  
        if (deptParrentId.intValue() == 0) {
          fatherDeptList.add(departmentList.get(i));
        }
      }
  
      return fatherDeptList;
    }
  
    private static List<Department> getChildList(List<Department> list, int deptId, List<Department> reList)
    {
      for (Department department : list) {
        if (department.getDeptParent().intValue() == deptId)
        {
          reList.add(department);
          if (ifChilds(list, department.getDeptId().intValue())) {
            getChildList(list, department.getDeptId().intValue(), reList);
          }
        }
      }
      return reList;
    }
  
    private static boolean ifChilds(List<Department> list, int deptId)
    {
      boolean flag = false;
      for (Department department : list) {
        if (department.getDeptParent().intValue() == deptId) {
          flag = true;
          break;
        }
      }
      return flag;
    }
  
    public Department getFirstDept(String deptNo)
    {
      Department dep = this.departmentMapper.getFirstDept(deptNo);
      return dep;
    }
  
    @Transactional
    public ToJson<Department> batchUpdateDeptById(String departments)
    {
      ToJson<Department> json = new ToJson<Department>(1, "error");
      int count = 0;
      try {
        JSONArray jsonArray = JSONArray.parseArray(departments);
        List<Department> departmentList = new ArrayList<Department>();
        Department department = new Department();
        int i = 0; for (int len = jsonArray.size(); i < len; i++) {
          JSONObject jsonJ = jsonArray.getJSONObject(i);
          Integer deptId = jsonJ.getInteger("deptId");
          String manager = jsonJ.getString("manager");
          String assistantId = jsonJ.getString("assistantId");
  
          department.setDeptId(deptId);
          department.setManager(manager);
          department.setAssistantId(assistantId);
          count += this.departmentMapper.batchUpdateDeptById(department);
        }
  
        if (count != 0) {
          json.setMsg("ok");
          json.setFlag(0);
        }
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "DepartmentServiceImpl batchUpdateDeptById:" + e });
      }
      return json;
    }
  
    @Transactional
    public void updateDeptNo(Integer deptParent, String deptParentNo)
    {
      int deptNo = 0;
      List<Department> list = this.departmentMapper.getChDept(deptParent.intValue());
      if (list.size() != 0)
        for (Department department : list) {
          int deptId = department.getDeptId().intValue();
          deptNo += 5;
          StringBuffer sb = new StringBuffer();
          sb.append(deptParentNo).append(org.apache.commons.lang.StringUtils.repeat("0", 3 - String.valueOf(deptNo).length())).append(String.valueOf(deptNo));
          String deptNostr = sb.toString();
          Department department1 = new Department();
          department1.setDeptId(Integer.valueOf(deptId));
          department1.setDeptNo(deptNostr.toString());
          this.departmentMapper.updateDeptNoByDeptId(department1);
          updateDeptNo(Integer.valueOf(deptId), deptNostr);
        }
    }
  
    public ToJson<Department> outputDepartment(HttpServletRequest request, HttpServletResponse response)
    {
      ToJson<Department> json = new ToJson<Department>(1, "error");
      try {
        HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("OA部门信息导出", 9);
        String[] secondTitles = { "部门名称", "部门排序号", "上级部门", "部门电话", "部门传真", "部门地址", "部门职能", "是否机构", "是否全局部门" };
        HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(workbook1, secondTitles);
        Department userPriv = new Department();
        List<Department> departmentList = this.departmentMapper.getAllDepartment();
        for (Department department : departmentList) {
          int deptParent = department.getDeptParent().intValue();
          String deptParentName = this.departmentMapper.getFatherDeptName(Integer.valueOf(deptParent));
          if (com.myoa.util.common.StringUtils.checkNull(deptParentName).booleanValue())
            department.setDeptParentName("");
          else {
            department.setDeptParentName(deptParentName);
          }
        }
  
        String[] beanProperty = { "deptName", "deptNo", "deptParentName", "telNo", "faxNo", "deptAddress", "deptFunc", "isOrg", "gDept" };
        HSSFWorkbook workbook = ExcelUtil.exportExcelData(workbook2, departmentList, beanProperty);
        ServletOutputStream out = response.getOutputStream();
  
        String filename = "OA部门导出.xls";
        filename = FileUtils.encodeDownloadFilename(filename, request.getHeader("user-agent"));
  
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("content-disposition", "attachment;filename=" + filename);
  
        workbook.write(out);
        out.close();
        json.setMsg("OK");
        json.setFlag(0);
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "DepartmentServiceImpl outputDepartment:" + e });
      }
      return json;
    }
  
    public List<Department> getAllDep(int deptId, int deptParent, List<Department> allDep)
    {
      List<Department> list = this.departmentMapper.getChDept(deptParent);
      if (list.size() != 0) {
        for (Department department : list) {
          deptId = department.getDeptId().intValue();
          Department department1 = new Department();
          department1.setDeptId(Integer.valueOf(deptId));
          allDep.add(department);
          getAllDep(deptId, deptId, allDep);
        }
      }
      return allDep;
    }
  
    public boolean checkDep(Department dep, int edit)
    {
      List<Department> list = this.departmentMapper.checkDep(dep.getDeptName());
      if (edit == 0) {
        if ((list != null) && (list.size() > 0)) {
          for (Department d : list) {
            if (d.getDeptParent().equals(dep.getDeptParent())) {
              return false;
            }
          }
          return true;
        }
        return true;
      }
  
      Department old = this.departmentMapper.getDeptById(dep.getDeptId().intValue());
      if ((list != null) && (list.size() > 0)) {
        for (Department d : list) {
          if ((d.getDeptParent().equals(dep.getDeptParent())) && (!d.getDeptName().equals(old.getDeptName()))) {
            return false;
          }
        }
        return true;
      }
      return true;
    }
  
    public ToJson<Department> getAllDepartment()
    {
      ToJson<Department> json = new ToJson<Department>(1, "error");
      try {
        List<Department> departmentList = this.departmentMapper.getAllDepartment();
        for (Department department : departmentList) {
          StringBuffer manager = new StringBuffer();
          StringBuffer assistant = new StringBuffer();
          if (!com.myoa.util.common.StringUtils.checkNull(department.getManager()).booleanValue()) {
            String[] managerArray = department.getManager().split(",");
            for (String managerId : managerArray) {
              Users users = this.usersService.findUserByuid(Integer.valueOf(managerId).intValue());
              if (users != null) {
                manager.append(users.getUserName() + ",");
              }
            }
          }
          if (!com.myoa.util.common.StringUtils.checkNull(department.getAssistantId()).booleanValue()) {
            String[] assistantArray = department.getAssistantId().split(",");
            for (String assistantId : assistantArray) {
              Users users = this.usersService.findUserByuid(Integer.valueOf(assistantId).intValue());
              if (users != null) {
                assistant.append(users.getUserName() + ",");
              }
            }
          }
          department.setManagerStr(manager.toString());
          department.setAssistantStr(assistant.toString());
        }
        json.setObj(departmentList);
        json.setMsg("ok");
        json.setFlag(0);
      } catch (Exception e) {
        e.printStackTrace();
        json.setMsg(e.getMessage());
        L.e(new Object[] { "DepartmentServiceImpl getAllDepartment:" + e });
      }
      return json;
    }
  
    public int judgeHashUser(String deptId)
    {
      int flag = 0;
      try {
        int count = this.usersMapper.judgeHashUser(deptId);
        if (count != 0)
          flag = 1;
      }
      catch (Exception e)
      {
        L.e(new Object[] { "DepartmentServiceImpl judgeHashUser:" + e });
      }
      return flag;
    }
  
    public ToJson<Department> getAllDepartAndUsers(HttpServletRequest request, HttpServletResponse response)
    {
      ToJson<Department> json = new ToJson<Department>();
  
      ResourceBundle rb = ResourceBundle.getBundle("upload");
  
      String osName = System.getProperty("os.name");
      StringBuffer sb = new StringBuffer();
      if (osName.toLowerCase().startsWith("win"))
        sb = sb.append(rb.getString("upload.win"));
      else {
        sb = sb.append(rb.getString("upload.linux"));
      }
  
      try
      {
        List<Department> firstDeparts = this.departmentMapper.getChDept(0);
  
        getChildAndUsers(firstDeparts);
  
        Element root = new Element("org").setAttribute("a", "0").setAttribute("b", "北京高速波软件有限公司");
  
        Document Doc = new Document(root);
  
        writeXML(firstDeparts, root);
  
        String path = sb.append("/org.xml").toString();
  
        Format format = Format.getPrettyFormat();
        XMLOutputter XMLOut = new XMLOutputter(format);
        XMLOut.output(Doc, new FileOutputStream(path));
  
        File file = new File(path);
  
        if (!file.exists()) {
          json.setFlag(1);
          json.setMsg("xml文件不存在");
          return json;
        }
        String zipPath = path.replace("org.xml", "org.zip");
  
        ZipUtils.zip(path, zipPath);
  
        File zipFile = new File(path);
  
        if (!zipFile.exists()) {
          json.setFlag(1);
          json.setMsg("zip文件不存在");
          return json;
        }
  
        response.setContentType("application/x-zip-compressed");
        response.setHeader("content-disposition", "attachment;filename=org.zip");
  
        InputStream inputStream = new FileInputStream(new File(zipPath));
        OutputStream os = response.getOutputStream();
        byte[] b = new byte[2048];
        int length;
        while ((length = inputStream.read(b)) > 0) {
          os.write(b, 0, length);
        }
  
        os.close();
        inputStream.close();
  
        json.setFlag(0);
        json.setMsg("ok");
      } catch (Exception e) {
        e.printStackTrace();
        json.setMsg("err");
        json.setFlag(1);
      }
      return json;
    }
  
    private void writeXML(List<Department> firstDeparts, Element root)
      throws Exception
    {
      if ((firstDeparts != null) && (firstDeparts.size() > 0))
        for (Department d : firstDeparts)
        {
          Element elements = new Element("d");
          elements.setAttribute("a", d.getDeptId().toString()).setAttribute("b", d.getDeptName()).setAttribute("c", "0");
          root.addContent(elements);
          if ((d.getUsers() != null) && (d.getUsers().size() > 0)) {
            for (Users u : d.getUsers()) {
              Element elementU = new Element("u");
              elementU.setAttribute("a", u.getUid().toString()).setAttribute("b", u.getUserName()).setAttribute("c", u.getUserPriv().toString()).setAttribute("d", u.getSex()).setAttribute("e", u.getOnStatus() == null ? "" : u.getOnStatus().trim()).setAttribute("h", u.getByname()).setAttribute("i", u.getDeptId().toString()).setAttribute("k", u.getMobilNo() == null ? "" : u.getMobilNo().trim()).setAttribute("m", u.getOicqNo() == null ? "" : u.getOicqNo().trim()).setAttribute("l", u.getEmail() == null ? "" : u.getEmail().trim()).setAttribute("p1", u.getNotLogin().toString());
  
              elements.addContent(elementU);
            }
          }
          if ((d.getChild() == null) || (d.getChild().size() <= 0))
            continue;
          writeXML(d.getChild(), elements);
        }
    }
  
    private void getChildAndUsers(List<Department> departs)
      throws Exception
    {
      for (Department d : departs) {
        List<Department> chDept = this.departmentMapper.getChDept(d.getDeptId().intValue());
        List<Users> usersByDeptId = this.usersMapper.getUsersByDeptId(d.getDeptId());
        if ((usersByDeptId != null) && (usersByDeptId.size() > 0)) {
          d.setUsers(usersByDeptId);
        }
        if ((chDept != null) && (chDept.size() > 0)) {
          d.setChild(chDept);
          getChildAndUsers(chDept);
        }
      }
    }
  
    public ToJson<Department> setClassifyOrgByDeptId(String deptIds, String classifyOrgAdmin, int classifyOrg)
    {
      ToJson<Department> json = new ToJson<Department>(1, "error");
      int count = 0;
      Department department = new Department();
      department.setClassifyOrgAdmin(classifyOrgAdmin);
      department.setClassifyOrg(Integer.valueOf(classifyOrg));
      try {
        if (!com.myoa.util.common.StringUtils.checkNull(deptIds).booleanValue()) {
          String[] deptIdArray = deptIds.split(",");
          if (classifyOrg == 0)
          {
            department.setDeptId(Integer.valueOf(deptIds));
            count += this.departmentMapper.setClassifyOrgByDeptId(department);
            delClassify(deptIds, department, count);
            if (count > 0) {
              json.setMsg("ok");
              json.setFlag(0);
            }
            return json;
          }
          for (String deptId : deptIdArray)
          {
            department.setDeptId(Integer.valueOf(deptId));
            count += this.departmentMapper.setClassifyOrgByDeptId(department);
  
            int deptParent = 1;
            for (int i = 0; deptParent != 0; i++) {
              if (this.departmentMapper.getFatherDept(Integer.valueOf(deptId).intValue()) != null) {
                deptParent = this.departmentMapper.getFatherDept(Integer.valueOf(deptId).intValue()).getDeptParent().intValue();
              }
              if (deptParent != 0) {
                department.setDeptId(Integer.valueOf(deptParent));
                StringBuffer strOrgAdmin = new StringBuffer();
                String OrgAdmin = this.departmentMapper.getDeptById(deptParent).getClassifyOrgAdmin();
                strOrgAdmin.append(OrgAdmin);
                String[] postOrgAdmin = classifyOrgAdmin.split(",");
                if (!com.myoa.util.common.StringUtils.checkNull(OrgAdmin).booleanValue()) {
                  String[] destOrgAdmin = OrgAdmin.split(",");
                  int flag = 0;
                  for (String str1 : postOrgAdmin) {
                    for (String str2 : destOrgAdmin) {
                      if (str1.equals(str2)) {
                        flag = 1;
                        break;
                      }
                    }
                    if (flag == 0) {
                      strOrgAdmin.append(str1 + ",");
                    }
                  }
                  department.setClassifyOrgAdmin(strOrgAdmin.toString());
                } else {
                  department.setClassifyOrgAdmin(classifyOrgAdmin);
                }
                count += this.departmentMapper.setClassifyOrgByDeptId(department);
              }
              deptId = String.valueOf(deptParent);
            }
          }
        }
        if (count > 0) {
          json.setMsg("ok");
          json.setFlag(0);
        }
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "DepartmentServiceImpl setClassifyOrgByDeptId:" + e });
      }
      return json;
    }
  
    void delClassify(String deptIds, Department department, int count)
    {
      List<Integer> deptIdList = this.departmentMapper.getDeptIdByParent(Integer.valueOf(deptIds).intValue());
      Iterator<Integer> i$;
      if (deptIdList.size() > 0)
        for (i$ = deptIdList.iterator(); i$.hasNext(); ) { int deptId = ((Integer)i$.next()).intValue();
          department.setDeptId(Integer.valueOf(deptId));
          count += this.departmentMapper.setClassifyOrgByDeptId(department);
          delClassify(String.valueOf(deptId), department, count);
        }
    }
  
    public ToJson<Department> getAllClassifyOrg()
    {
      ToJson<Department> json = new ToJson<Department>(1, "error");
      try {
        List<Department> departmentList = this.departmentMapper.getAllClassifyOrg();
        json.setObj(departmentList);
        json.setMsg("ok");
        json.setFlag(0);
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "DepartmentServiceImpl getAllClassifyOrg:" + e });
      }
      return json;
    }
  
    public ToJson<Department> getClassifyOrgByAdmin(HttpServletRequest request)
    {
      ToJson<Department> json = new ToJson<Department>(1, "error");
      try {
        Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
        Department department = new Department();
        department.setUid(user.getUid());
        int deptId = Integer.parseInt(new String(request.getParameter("deptId").getBytes("ISO-8859-1"), "UTF-8"));
        department.setDeptParent(Integer.valueOf(deptId));
        List<Department> departmentList = this.departmentMapper.getClassifyOrgByAdmin(department);
        json.setObj(departmentList);
        json.setMsg("ok");
        json.setFlag(0);
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "DepartmentServiceImpl getClassifyOrgByAdmin:" + e });
      }
      return json;
    }
  
    public List<Department> getDepartmentByParet() {
      return this.departmentMapper.getDepartmentByParet();
    }
  
    public int selClaNumByParentId(int deptId)
    {
      return this.departmentMapper.selClaNumByParentId(deptId);
    }
  
    public List<Department> getDepByNo(String deptNo)
    {
      List<Department> list = this.departmentMapper.getDepByNo(deptNo);
      return list;
    }
  
    public ToJson<Department> importDepartment(HttpServletRequest request, HttpServletResponse response, MultipartFile file)
    {
      ToJson<Department> json = new ToJson<Department>();
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
          Department entity = null;
          int successCount = 0;
          int failCount = 0;
          Department department = new Department();
          for (int i = 1; i <= lastRowNum; i++) {
            entity = new Department();
            row = sheetObj.getRow(i);
            String deptParent = null;
            if (row != null) {
              for (int j = 0; j < colNum; j++) {
                Cell cell = row.getCell(j);
                if (cell != null) {
                  switch (j) {
                  case 0:
                    entity.setDeptName(cell.getStringCellValue());
                    break;
                  case 1:
                    entity.setDeptNo(cell.getStringCellValue());
                    break;
                  case 2:
                    entity.setDeptParentName(cell.getStringCellValue());
                    if (!com.myoa.util.common.StringUtils.checkNull(cell.getStringCellValue()).booleanValue()) {
                      List<String> deptParentList = this.departmentMapper.getDeptIdByDeptName(cell.getStringCellValue());
                      if (deptParentList.size() > 0) {
                        deptParent = (String)deptParentList.get(0);
                      }
                      if (com.myoa.util.common.StringUtils.checkNull(deptParent).booleanValue())
                        entity.setDeptParent(Integer.valueOf(-1));
                      else
                        entity.setDeptParent(Integer.valueOf(deptParent));
                    }
                    else {
                      entity.setDeptParent(Integer.valueOf(0));
                    }
                    break;
                  case 3:
                    entity.setTelNo(cell.getStringCellValue());
                    break;
                  case 4:
                    entity.setFaxNo(cell.getStringCellValue());
                    break;
                  case 5:
                    entity.setDeptAddress(cell.getStringCellValue());
                    break;
                  case 6:
                    entity.setDeptFunc(cell.getStringCellValue());
                    break;
                  case 7:
                    if ("是".equals(cell.getStringCellValue().trim())) {
                      entity.setClassifyOrg(Integer.valueOf(1)); } else {
                      if ((!"否".equals(cell.getStringCellValue().trim())) && (!"不是".equals(cell.getStringCellValue().trim()))) continue;
                      entity.setClassifyOrg(Integer.valueOf(0)); } break;
                  case 8:
                    if ("是".equals(cell.getStringCellValue().trim())) {
                      entity.setgDept(Byte.valueOf((byte) 1)); } else {
                      if ((!"否".equals(cell.getStringCellValue().trim())) && (!"不是".equals(cell.getStringCellValue().trim()))) continue;
                      entity.setgDept(Byte.valueOf((byte) 0));
                    }
                  }
                }
              }
  
            }
  
            if ((com.myoa.util.common.StringUtils.checkNull(entity.getDeptName()).booleanValue()) || (com.myoa.util.common.StringUtils.checkNull(entity.getDeptNo()).booleanValue()) || (entity.getDeptNo().length() != 3)) {
              failCount++;
              entity.setNameRoNoNull(Integer.valueOf(1));
            }
            else
            {
              String deptName = row.getCell(0).getStringCellValue();
              if (!checkDep(entity, 0)) {
                failCount++;
                entity.setNameRepeat(Integer.valueOf(1));
              }
              else if ((entity.getDeptParent() != null) && (entity.getDeptParent().intValue() == -1)) {
                failCount++;
                entity.setNoParent(Integer.valueOf(1));
              }
              else
              {
                if (!com.myoa.util.common.StringUtils.checkNull(deptParent).booleanValue()) {
                  Department parent = this.departmentMapper.getDeptById(Integer.valueOf(deptParent).intValue());
                  if (parent != null) {
                    entity.setDeptNo(parent.getDeptNo() + entity.getDeptNo());
                  }
                }
                List<Department> departmentList = this.departmentMapper.getDepByNo(entity.getDeptNo());
                if (departmentList.size() == 0) {
                  this.departmentMapper.insertDept(entity);
                  successCount++;
                } else {
                  failCount++;
                  entity.setNoRepeat(Integer.valueOf(1));
                }
              }
            }
          }
          entity.setSuccessCount(Integer.valueOf(successCount));
          entity.setFailCount(Integer.valueOf(failCount));
          json.setFlag(0);
          json.setObject(entity);
          dest.delete();
        } else {
          json.setMsg("文件类型不正确！");
          json.setFlag(1);
          return json;
        }
      }
      catch (Exception e) {
        e.printStackTrace();
        json.setMsg("数据保存异常");
        json.setFlag(1);
      }
      return json;
    }
  
    public ToJson<Department> selDeptNoByDeptParent(String deptParent, String deptNo, int editFlag, String proDeptNo)
    {
      ToJson<Department> json = new ToJson<Department>(1, "error");
      try {
        if ((!com.myoa.util.common.StringUtils.checkNull(deptParent).booleanValue()) && (deptParent.contains(","))) {
          deptParent = deptParent.substring(0, deptParent.length() - 1);
        }
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("deptParent", deptParent);
        if (editFlag == 1) {
          if ((!com.myoa.util.common.StringUtils.checkNull(deptParent).booleanValue()) && (!deptParent.equals("0"))) {
            Department dept = this.departmentMapper.getDeptById(Integer.valueOf(deptParent).intValue());
            proDeptNo = dept.getDeptNo() + proDeptNo;
            map.put("deptNo", proDeptNo);
          } else {
            map.put("deptNo", proDeptNo);
          }
        }
        List<String> deptNoList = this.departmentMapper.selDeptNoByDeptParent(map);
        for (String deptNoStr : deptNoList) {
          if (deptNoStr.equals(deptNo)) {
            json.setFlag(1);
            json.setMsg("repeat");
            return json;
          }
        }
        json.setMsg("ok");
        json.setFlag(0);
      } catch (Exception e) {
        e.printStackTrace();
        json.setMsg(e.getMessage());
        L.e(new Object[] { "DepartmentServiceImpl selDeptNoByDeptParent:" + e });
      }
      return json;
    }
  
    public ToJson<Department> selByLikeDeptName(String deptName)
    {
      ToJson<Department> json = new ToJson<Department>(1, "error");
      try {
        List<Department> departmentList = this.departmentMapper.selByLikeDeptName(deptName);
        StringBuffer bb1 = new StringBuffer();
        StringBuffer bb2 = new StringBuffer();
        StringBuffer bb3 = new StringBuffer();
        StringBuffer bb4 = new StringBuffer();
        for (Department dept : departmentList) {
          String manag = dept.getManager();
          String assistant = dept.getAssistantId();
          String leader1 = dept.getLeader1();
          String leader2 = dept.getLeader2();
          if ((manag != null) && (!manag.equals(""))) {
            String[] mm = manag.split(",");
            for (int j = 0; j < mm.length; j++) {
              String name2 = this.usersService.findUsersByuid(new int[] { Integer.parseInt(mm[j]) });
              if (name2 != null) {
                bb1.append(name2);
                bb1.append(",");
                dept.setManager(bb1.toString().substring(0, bb1.toString().length() - 1));
              }
            }
            bb1.delete(0, bb1.length());
          }
          if ((assistant != null) && (!assistant.equals(""))) {
            String[] cc = assistant.split(",");
            for (int j = 0; j < cc.length; j++) {
              String name3 = this.usersService.findUsersByuid(new int[] { Integer.parseInt(cc[j]) });
              if (name3 != null) {
                bb2.append(name3);
                bb2.append(",");
                dept.setAssistantId(bb2.toString().substring(0, bb2.toString().length() - 1));
              }
            }
  
            bb2.delete(0, bb2.length());
          }
          if ((leader1 != null) && (!leader1.equals(""))) {
            String[] dd = leader1.split(",");
            for (int j = 0; j < dd.length; j++) {
              String name4 = this.usersService.findUsersByuid(new int[] { Integer.parseInt(dd[j]) });
              if (name4 != null) {
                bb3.append(name4);
                bb3.append(",");
                dept.setLeader1(bb3.toString().substring(0, bb3.toString().length() - 1));
              }
            }
  
            bb3.delete(0, bb3.length());
          }
          if ((leader2 != null) && (!leader2.equals(""))) {
            String[] ee = leader2.split(",");
            for (int j = 0; j < ee.length; j++) {
              String name5 = this.usersService.findUsersByuid(new int[] { Integer.parseInt(ee[j]) });
              if (name5 != null) {
                bb4.append(name5);
                bb4.append(",");
                dept.setLeader2(bb4.toString().substring(0, bb4.toString().length() - 1));
              }
            }
  
            bb4.delete(0, bb4.length());
          }
        }
        json.setObj(departmentList);
        json.setMsg("ok");
        json.setFlag(0);
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "DepartmentServiceImpl selByLikeDeptName:" + e });
      }
      return json;
    }
  }

