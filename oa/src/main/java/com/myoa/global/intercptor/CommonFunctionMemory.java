package com.myoa.global.intercptor;

import com.myoa.dao.menu.SysFunctionMapper;
import com.myoa.model.menu.SysFunction;
import com.myoa.util.common.L;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommonFunctionMemory implements InitializingBean {

	@Autowired
	SysFunctionMapper mapper;
	private Map<String, String> reflectMaps;
	private List<SysFunction> functionIds;
	private static Map<String, String> userSessionMaps;
	private static Map<String, String> jsession_sessionIdMaps;

	public List<SysFunction> getFunctionIds() {
		return this.functionIds;
	}

	public Map<String, String> getReflectMaps() {
		return this.reflectMaps;
	}

	public String getSession(String userName) {
		if (userSessionMaps != null) {
			return (String) userSessionMaps.get(userName);
		}
		return null;
	}

	public void putReflectSession(String jsessionId, String sessionId) {
		if (jsession_sessionIdMaps == null) {
			jsession_sessionIdMaps = new HashMap();
		}
		jsession_sessionIdMaps.put(jsessionId, sessionId);
	}

	public String getSessionIdByJessionId(String jessionId) {
		if (jsession_sessionIdMaps != null) {
			return (String) jsession_sessionIdMaps.get(jessionId);
		}
		return null;
	}

	public void putSession(String userName, String sessionId) {
		if (userSessionMaps == null) {
			userSessionMaps = new HashMap();
		}
		userSessionMaps.put(userName, sessionId);
	}

	public Set<String> getUserName(String seesion) {
		Set userSet = new HashSet();
		if (userSessionMaps != null) {
			for (Map.Entry entry : userSessionMaps.entrySet()) {
				entry.getKey();
				if (seesion.equals(entry.getValue())) {
					userSet.add(entry.getKey());
				}
			}
		}
		return userSet;
	}

	public void setReflectMaps(Map<String, String> reflectMaps) {
		this.reflectMaps = reflectMaps;
	}

	public void setFunctionIds(List<SysFunction> functionIds) {
		this.functionIds = functionIds;
	}

	public void afterPropertiesSet() throws Exception {
		L.w(new Object[] { "ceshi" });

		List<SysFunction> functions = this.mapper.getAll();
		int i;
		if ((functions != null) && (functions.size() > 0)) {
			this.functionIds = new ArrayList();
			i = 0;
			for (SysFunction function : functions) {
				if (!function.getUrl().contains("@")) {
					this.functionIds.add(function);
				}
				i++;
			}
		}
		this.reflectMaps = new HashMap();
		jsession_sessionIdMaps = new HashMap();
		this.reflectMaps.put("email", "email/index");
		this.reflectMaps.put("notify/show", "notice/index");
		this.reflectMaps.put("news/show", "news/index");
		this.reflectMaps.put("file_folder/index2.php", "file/persionBox");
		this.reflectMaps.put("system/file_folder", "showFileBySort_id");
		this.reflectMaps.put("diary/show", "diary/index");
		this.reflectMaps.put("news/manage", "news/manage");
		this.reflectMaps.put("notify/manage", "notice/manage");
		this.reflectMaps.put("knowledge/management", "file/home");
		this.reflectMaps.put("system/file/folder", "file/setIndex");
		this.reflectMaps.put("system/workflow/flow_guide", "flow/type/index");
		this.reflectMaps.put("system/workflow/flow_form",
				"workflow/formtype/index");
		this.reflectMaps.put("system/workflow/flow_sort",
				"workflow/flowclassify/index");

		this.reflectMaps.put("system/unit", "sys/companyInfo");
		this.reflectMaps.put("system/dept", "common/deptManagement");
		this.reflectMaps.put("system/org_manage", "sys/organizational");
		this.reflectMaps.put("workflow/new", "workflow/work/addwork");
		this.reflectMaps.put("workflow/list", "workflow/work/workList");
		this.reflectMaps.put("system/user", "common/userManagement");
		this.reflectMaps.put("system/user_priv", "roleAuthorization");
		this.reflectMaps.put("system/status_text", "sys/statusBar");
		this.reflectMaps.put("system/interface", "sys/interfaceSettings");
		this.reflectMaps.put("system/reg_view", "sys/sysInfo");
		this.reflectMaps.put("system/menu", "sys/menuSetting");
		this.reflectMaps.put("system/log", "sys/journal");
		this.reflectMaps.put("system/code", "common/systemCode");
		this.reflectMaps.put("info/unit", "sys/unitInfor");
		this.reflectMaps.put("info/dept", "department/deptQuery");
		this.reflectMaps.put("info/user", "sys/userInfor");
		this.reflectMaps.put("calendar", "schedule/index");
		this.reflectMaps
				.put("system/netdisk", "netdiskSettings/netdisksetting");
		this.reflectMaps.put("document/mine", "document/mine");
		this.reflectMaps.put("person/info", "controlpanel/index");
		this.reflectMaps.put("workflow/rule", "workflow/work/workDelegate");
		L.s(new Object[] { "0=||======================================>",
				this.functionIds });

		userSessionMaps = new HashMap();
	}
}
