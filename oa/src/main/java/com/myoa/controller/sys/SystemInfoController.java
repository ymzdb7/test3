package com.myoa.controller.sys;

import com.myoa.service.sys.SystemInfoService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.dataSource.ContextHolder;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping({ "sys" })
public class SystemInfoController {

	@Resource
	private SystemInfoService systemInfoService;

	@ResponseBody
	@RequestMapping({ "/getSysMessage" })
	public ToJson<Object> getSysMessage(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		Object locale = request.getSession().getAttribute(
				"LOCALE_SESSION_ATTRIBUTE_NAME");
		ToJson<Object> toJson = new ToJson<Object>(0, "");
		try {
			String realPath = request.getSession().getServletContext()
					.getRealPath("/");
			Map<String, String> map = this.systemInfoService.getSystemInfo(
					realPath, locale);
			String serverPath = System.getProperty("user.dir");
			try {
				map.put("installPath", realPath + "0");
				if (serverPath != null) {
					String[] pathArr = realPath.split("\\\\");
					System.out.println(pathArr.length);
					StringBuffer sb = new StringBuffer();
					for (int i = 0; i < pathArr.length - 4; i++) {
						sb.append(pathArr[i]).append("\\");
					}

					if (pathArr.length == 0) {
						String[] pathArrTwo = realPath.split("/");
						System.out.println(pathArr.length);
						StringBuffer sb1 = new StringBuffer();
						for (int i = 0; i < pathArr.length - 4; i++) {
							sb1.append(pathArr[i]).append("/");
						}
						map.put("installPath", sb1.toString());
					}
					if (pathArr.length != 0) {
						map.put("installPath", sb.toString());
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				map.put("installPath", "--");
			}

			URL resource = Thread.currentThread().getContextClassLoader()
					.getResource("");
			map.put("serverPath", serverPath);

			toJson.setMsg("OK");
			toJson.setFlag(0);
			toJson.setObject(map);
		} catch (Exception e) {
			e.printStackTrace();
			toJson.setFlag(1);
			toJson.setMsg("err");
		}

		return toJson;
	}

	@RequestMapping({ "/uploadLec" })
	@ResponseBody
	public ToJson<Object> editItemSubmit(MultipartFile lecFile,
			HttpServletRequest request) throws Exception {
		ToJson toJson = new ToJson(0, "");
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		if (!"lec.txt".equals(lecFile.getOriginalFilename())) {
			toJson.setFlag(1);
			toJson.setMsg("err");
			return toJson;
		}

		String realPath = request.getSession().getServletContext()
				.getRealPath("/");
		try {
			if ((lecFile != null) && (lecFile.getOriginalFilename() != null)
					&& (!lecFile.getOriginalFilename().equals(""))) {
				String originalFilename = lecFile.getOriginalFilename();

				String fileName_new = "lec";

				File newFile = new File(realPath.concat("/authfiles/lec.txt"));

				lecFile.transferTo(newFile);
			}
			toJson.setFlag(0);
			toJson.setMsg("授权成功");
		} catch (Exception e) {
			toJson.setFlag(1);
			toJson.setMsg("err");
		}

		return toJson;
	}

	@RequestMapping({ "/getAPPMessage" })
	@ResponseBody
	public ToJson<Object> getAPPMessage(HttpServletRequest request) {
		Map map = this.systemInfoService.getAPPMessage();

		ToJson toJson = new ToJson(0, "");

		toJson.setMsg("OK");
		toJson.setFlag(0);
		toJson.setObject(map);

		return toJson;
	}
}
