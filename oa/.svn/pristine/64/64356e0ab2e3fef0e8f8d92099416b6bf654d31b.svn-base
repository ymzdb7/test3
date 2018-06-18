package com.myoa.controller.netdisk;

import com.alibaba.fastjson.JSONObject;
import com.myoa.model.netdisk.Catalog;
import com.myoa.model.netdisk.MyNetdisk;
import com.myoa.model.netdisk.Netdisk;
import com.myoa.model.users.Users;
import com.myoa.service.netdisk.NetdiskService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;
import com.myoa.util.dataSource.ContextHolder;
import com.myoa.util.netdisk.CheckAll;
import com.myoa.util.netdisk.CopyFile;
import com.myoa.util.netdisk.DeleteFile;
import com.myoa.util.netdisk.GlobalSearch;
import com.myoa.util.netdisk.ReadFile;
import com.myoa.util.netdisk.SearchFile;
import com.myoa.util.netdisk.ZipUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.UUID;
import java.util.zip.ZipOutputStream;
import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
@Scope("prototype")
@RequestMapping({ "/netdisk" })
public class NetdiskController {

	@Resource
	private NetdiskService netdiskService;
	private final int PASTETYPE_COPY = 0;
	private final int PASTETYPE_CUT = 1;

	@RequestMapping({ "/netdesk" })
	public String netdesk() {
		return "app/netdesk/netdesk";
	}

	@RequestMapping({ "/getNetDiskMenu" })
	@ResponseBody
	public BaseWrappers getNetDiskMenu(HttpServletRequest request) {
		return this.netdiskService.getNetDiskMenu(request);
	}

	@ResponseBody
	@RequestMapping(value = { "/selectNetdiskBySearch" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrappers selectNetdiskBySearch(
			HttpServletRequest request,
			String path,
			@RequestParam(required = false, defaultValue = "0") Integer orderType,
			@RequestParam(required = false, defaultValue = "0") Integer orderBy,
			String searchTitle, String content) {
		return this.netdiskService.selectNetdiskBySearch(request, path,
				orderType, orderBy, searchTitle, content);
	}

	@ResponseBody
	@RequestMapping(value = { "/selectNetdisk" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Catalog> selectNetdisk(HttpServletRequest request, String path)
			throws Exception {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		Users users = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		Map map = new Hashtable();
		ToJson toJson = new ToJson();
		map.put("userId", users.getUserId());
		map.put("userPriv", users.getUserPriv());
		map.put("deptId", users.getDeptId());
		Catalog catalog = null;
		List<Netdisk> neList = this.netdiskService.selectNetdisk();
		for (Netdisk netdisk : neList) {
			if (CheckAll.checkAll(netdisk.getUserId(), map)) {
				if (!StringUtils.checkNull(path).booleanValue()) {
					catalog = ReadFile.getFiles(path);
				}
			} else {
				toJson.setFlag(1);
				toJson.setMsg("err");
			}

		}

		if (catalog != null) {
			toJson.setFlag(0);
			toJson.setMsg("ok");
			toJson.setObject(catalog);
		}

		return toJson;
	}

	@ResponseBody
	@RequestMapping(value = { "/rootNetdisk" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Catalog> selectNetdiskSettings(HttpServletRequest request) {
		ToJson tojson = new ToJson(0, "");
		try {
			List<Netdisk> list = this.netdiskService.selectNetdisk();
			List<MyNetdisk> myNetdiskList = new ArrayList<MyNetdisk>();
			for (Netdisk disk : list) {
				ResourceBundle rb = ResourceBundle.getBundle("upload");
				String osName = System.getProperty("os.name");
				StringBuffer sb = new StringBuffer();
				if (osName.toLowerCase().startsWith("win"))
					sb = sb.append(rb.getString("netdisk.win"));
				else {
					sb = sb.append(rb.getString("netdisk.linux"));
				}

				MyNetdisk myNetdisk = new MyNetdisk();
				String path = sb.toString() + disk.getDiskPath();
				myNetdisk.setPath(path);
				myNetdisk.setNeName(disk.getDiskName());
				myNetdisk.setTime(ReadFile.getFileTime(path));
				myNetdisk.setType("DIR");
				myNetdisk.setSize("");
				myNetdisk.setUpdatePriv(this.netdiskService.checkAuth(request,
						path, Integer.valueOf(18)));
				myNetdisk.setDownloadPriv(this.netdiskService.checkAuth(
						request, path, Integer.valueOf(19)));
				myNetdisk.setShowPriv(this.netdiskService.checkAuth(request,
						path, Integer.valueOf(1)));
				myNetdisk.setMakePriv(this.netdiskService.checkAuth(request,
						path, Integer.valueOf(17)));
				myNetdiskList.add(myNetdisk);
			}
			Catalog catalog = new Catalog();
			catalog.setMyNetdiskList(myNetdiskList);
			tojson.setObject(catalog);
			tojson.setMsg("ok");
			tojson.setFlag(0);
		} catch (Exception e) {
			tojson.setMsg(e.getMessage());
		}
		return tojson;
	}

	@ResponseBody
	@RequestMapping(value = { "/queryNetdisk" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Catalog> queryNetdisk(HttpServletRequest request, String path)
			throws Exception {
		ToJson toJson = new ToJson();
		Catalog catalog = null;

		if (!StringUtils.checkNull(path).booleanValue()) {
			catalog = ReadFile.getFiles(path);
		} else {
			toJson.setFlag(1);
			toJson.setMsg("err");
		}

		if (catalog != null) {
			toJson.setFlag(0);
			toJson.setMsg("ok");
			// /* 189 */ Collections.sort(catalog.getMyNetdiskList(), new
			// Comparator()
			// /* */ {
			// @Override
			// public int compare(MyNetdisk o1, MyNetdisk o2) {
			// if ((o1.getSize() != null) && (o2.getSize() != null)) {
			// /* 201 */ return -1;
			// /* */ }
			// /* 203 */ if ((o1.getSize() == null) && (o2.getSize() == null)) {
			// /* 204 */ return 1;
			// /* */ }
			// /* 206 */ return 0;
			// }
			// });
			if ((catalog.getMyNetdiskList() != null)
					&& (catalog.getMyNetdiskList().size() > 0)) {
				for (MyNetdisk myNetdisk : catalog.getMyNetdiskList()) {
					myNetdisk.setUpdatePriv(this.netdiskService.checkAuth(
							request, path, Integer.valueOf(18)));
					myNetdisk.setDownloadPriv(this.netdiskService.checkAuth(
							request, path, Integer.valueOf(19)));
					myNetdisk.setShowPriv(this.netdiskService.checkAuth(
							request, path, Integer.valueOf(1)));
					myNetdisk.setMakePriv(this.netdiskService.checkAuth(
							request, path, Integer.valueOf(17)));
				}
			}

			toJson.setObject(catalog);
		}
		return toJson;
	}

	@ResponseBody
	@RequestMapping(value = { "/mkDirectory" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<String> mkDirectory(HttpServletRequest request, String path,
			String directoryName) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		String mkDirectoryPath = path + "/" + directoryName;
		ToJson json = new ToJson();
		if (!this.netdiskService.checkAuth(request, path, Integer.valueOf(17))) {
			json.setFlag(1);
			json.setMsg("err");
			return json;
		}
		if (ReadFile.mkDirectory(mkDirectoryPath)) {
			json.setFlag(0);
			json.setMsg("ok");
		} else {
			json.setFlag(1);
			json.setMsg("err");
		}

		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/changeName" }, produces = { "application/json;charset=UTF-8" })
	public BaseWrapper changeName(HttpServletRequest request, String path,
			String newsName) {
		BaseWrapper wrapper = new BaseWrapper();
		wrapper.setStatus(true);
		if (!this.netdiskService.checkAuth(request, path, Integer.valueOf(18))) {
			wrapper.setFlag(false);
			wrapper.setMsg("无权操作");
			return wrapper;
		}
		try {
			File file = new File(path);
			String name = newsName;
			String filename = file.getAbsolutePath();
			String filename1 = null;
			String prefix = filename.substring(filename.lastIndexOf(".") + 1,
					filename.length());
			if (filename.indexOf(".") >= 0) {
				filename = filename.substring(0, filename.lastIndexOf("."));
				filename1 = filename.substring(0, filename.lastIndexOf("\\"));
				File newfile = new File(filename1 + "/" + name + prefix);
				if (newfile.exists()) {
					wrapper.setMsg("文件已经存在");
					wrapper.setFlag(false);
					return wrapper;
				}
				file.renameTo(newfile);
			} else {
				filename1 = filename.substring(0, filename.lastIndexOf("\\"));
				File newfile = new File(filename1 + "/" + name);
				if (newfile.exists()) {
					wrapper.setMsg("文件已经存在");
					wrapper.setFlag(false);
					return wrapper;
				}
				System.gc();
				file.renameTo(newfile);
			}

			wrapper.setMsg("成功");
			wrapper.setFlag(true);
		} catch (Exception e) {
			e.printStackTrace();
			wrapper.setMsg("操作失败");
			wrapper.setFlag(false);
		}

		return wrapper;
	}

	@ResponseBody
	@RequestMapping(value = { "/uploadFile" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST }, produces = { "application/json;charset=UTF-8" })
	public void uploadFile(HttpServletRequest request,
			HttpServletResponse response, String path) throws IOException {
		ToJson json = new ToJson();
		if (!this.netdiskService.checkAuth(request, path, Integer.valueOf(17))) {
			json.setFlag(1);
			json.setMsg("无权操作");
			return;
		}

		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());

		List errorOne = new ArrayList();
		try {
			if (multipartResolver.isMultipart(request)) {
				MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;

				List<MultipartFile> files = multiRequest.getFiles("file");
				for (MultipartFile multipartFile : files) {
					if (multipartFile != null) {
						String myFileName = multipartFile.getOriginalFilename();

						if (!StringUtils.checkNull(myFileName).booleanValue()) {
							String fileName = multipartFile
									.getOriginalFilename();
							String path1 = path + "/" + fileName;
							System.out.println(path1);
							File localFile = new File(path1);

							if (localFile.exists()) {
								String reName = localFile.getName().substring(
										0, fileName.lastIndexOf("."));

								String fileType = ReadFile
										.getFileType(fileName);
								String path2 = path + "/" + reName + "-复件"
										+ "." + fileType;

								File parentFile = new File(path2);

								multipartFile.transferTo(parentFile);
							} else {
								multipartFile.transferTo(localFile);
							}
						} else {
							errorOne.add(multipartFile.getName());
						}
					}
				}
			}

			json.setFlag(0);
			json.setMsg("ok");
			json.setObj(errorOne);
		} catch (Exception e) {
			json.setFlag(1);
			json.setMsg("err");
		}

		response.setHeader("content-type", "text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		ServletOutputStream out = response.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(out, "UTF-8");

		ow.write(JSONObject.toJSONString(json));
		ow.flush();
		ow.close();
	}

	@RequestMapping({ "/downLoadZipFile" })
	public void downLoadZipFile(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(name = "path[]") String[] path) throws IOException {
		BaseWrapper wrapper = new BaseWrapper();
		wrapper.setStatus(true);
		if ((path != null) && (path.length > 0)) {
			ServletOutputStream out = response.getOutputStream();
			if (!this.netdiskService.checkAuth(request, path[0],
					Integer.valueOf(19))) {
				wrapper.setFlag(false);
				wrapper.setMsg("无权操作");
				out.print(JSONObject.toJSONString(wrapper));
				out.flush();
			}
		} else {
			ServletOutputStream out = response.getOutputStream();
			wrapper.setFlag(false);
			wrapper.setMsg("数据异常");
			out.print(JSONObject.toJSONString(wrapper));
			out.flush();
		}
		String zipName = UUID.randomUUID().toString() + ".zip";
		response.setContentType("APPLICATION/OCTET-STREAM");
		response.setHeader("Content-Disposition", "attachment; filename="
				+ zipName);
		ZipOutputStream out = new ZipOutputStream(response.getOutputStream());
		try {
			for (String filePath : path) {
				File file = new File(filePath);
				if (file.exists()) {
					ZipUtils.doCompress(file, out);
					response.flushBuffer();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
	}

	@RequestMapping(value = { "/download" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET }, produces = { "application/json;charset=UTF-8" })
	public String download(String fileName, HttpServletRequest request,
			HttpServletResponse response, String path) throws IOException {
		BaseWrapper wrapper = new BaseWrapper();
		wrapper.setStatus(true);
		if (!this.netdiskService.checkAuth(request, path, Integer.valueOf(19))) {
			ServletOutputStream out = response.getOutputStream();
			wrapper.setFlag(false);
			wrapper.setMsg("无权操作");
			out.print(JSONObject.toJSONString(wrapper));
			out.flush();
		}
		response.setCharacterEncoding("utf-8");
		response.setContentType("multipart/form-data");
		response.setHeader("Content-Disposition", "attachment;fileName="
				+ fileName);
		try {
			InputStream inputStream = new FileInputStream(new File(path
					+ File.separator + fileName));

			OutputStream os = response.getOutputStream();
			byte[] b = new byte[2048];
			int length;
			while ((length = inputStream.read(b)) > 0) {
				os.write(b, 0, length);
			}

			os.flush();
			os.close();
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	@RequestMapping(value = { "/copyFile" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<String> copyFiles(String path) {
		ToJson json = new ToJson();
		if (!StringUtils.checkNull(path).booleanValue()) {
			String read = CopyFile.readByBufferedReader(path);
			json.setFlag(0);
			json.setMsg("ok");
			json.setObject(read);
		} else {
			json.setFlag(1);
			json.setMsg("err");
		}
		return json;
	}

	@RequestMapping(value = { "/writeFile" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public BaseWrapper writeFile(
			HttpServletRequest request,
			@RequestParam(name = "resourcesPath[]") String[] resourcesPath,
			String toPath,
			@RequestParam(required = false, defaultValue = "0") Integer pasteType) {
		BaseWrapper baseWrapper = new BaseWrapper();

		baseWrapper.setStatus(true);
		if ((resourcesPath == null) || (resourcesPath.length == 0)) {
			baseWrapper.setFlag(false);
			baseWrapper.setMsg("源文件不能为空");
			return baseWrapper;
		}
		if (!this.netdiskService.checkAuth(request, resourcesPath[0],
				Integer.valueOf(18))) {
			baseWrapper.setFlag(false);
			baseWrapper.setMsg("无权操作");
			return baseWrapper;
		}
		try {
			if (!StringUtils.checkNull(toPath).booleanValue()) {
				File dir = new File(toPath);
				if (dir.exists()) {
					for (String filepath : resourcesPath) {
						File file = new File(filepath);
						if (file.exists()) {
							String willName = file.getName();
							File willfile = new File(toPath + File.separator
									+ willName);
							if ((pasteType.intValue() == 1)
									&& (!willfile.exists())) {
								willfile.createNewFile();
								CopyFile.copeFile(file, willfile);
								boolean result = file.delete();
								int tryCount = 0;
								while ((!result) && (tryCount++ < 10)) {
									System.gc();
									result = file.delete();
								}
							}

							if (pasteType.intValue() == 0) {
								if (!willfile.exists()) {
									willfile.createNewFile();
									CopyFile.copeFile(file, willfile);
								} else {
									String reName = file.getName().substring(0,
											file.getName().lastIndexOf("."));
									String fileType = ReadFile
											.getFileType(filepath);
									File copyFile = new File(toPath
											+ File.separator + reName + "-复件."
											+ fileType);
									copyFile.createNewFile();
									CopyFile.copeFile(file, copyFile);
								}
							}
						}
					}
					baseWrapper.setFlag(true);
					baseWrapper.setMsg("成功");
				} else {
					baseWrapper.setFlag(false);
					baseWrapper.setMsg("文件路径不存在");
				}
			} else {
				baseWrapper.setFlag(false);
				baseWrapper.setMsg("文件路径为空");
			}
		} catch (Exception e) {
			e.printStackTrace();
			baseWrapper.setFlag(false);
			baseWrapper.setMsg("数据异常");
		}
		return baseWrapper;
	}

	@RequestMapping(value = { "/globalFile" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<String> globalFile(String content, String path) {
		ToJson json = new ToJson();
		if (!StringUtils.checkNull(path).booleanValue()) {
			String filename = path;

			File file = new File(filename);
			String[] args = { content };
			for (int i = 0; i < args.length; i++) {
				GlobalSearch.findFile(file, args[i]);

				for (String string : GlobalSearch.path) {
					System.out.println(string);
				}

			}

			json.setFlag(0);
			json.setMsg("ok");
			json.setObj(GlobalSearch.path);
		} else {
			json.setFlag(1);
			json.setMsg("err");
		}

		return json;
	}

	@RequestMapping(value = { "/searchFile" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<String> searchFile(String content, String path) {
		ToJson json = new ToJson();
		if (!StringUtils.checkNull(path).booleanValue()) {
			path = path.replaceAll("\\\\", "\\\\\\\\");
			String fileName = content;
			List<String> destpath = SearchFile.searchFile(path, fileName);
			if ((destpath != null) && (destpath.size() > 0)) {
				System.out.println("你要找的文件的目录如下：");
				for (String s : destpath) {
					System.out.println(s);
				}
				json.setFlag(0);
				json.setMsg("ok");
				json.setObj(destpath);
			} else {
				System.out.println("没有找到或您输入有误");

				json.setFlag(1);
				json.setMsg("err");
			}

		}

		return json;
	}

	@RequestMapping(value = { "/deleteFile" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<String> deleteFile(HttpServletRequest request,
			@RequestParam(name = "path[]") String[] path) {
		ToJson json = new ToJson();
		if ((path == null) || (path.length == 0)) {
			json.setMsg("err");
			json.setFlag(1);
			return json;
		}
		if (!this.netdiskService.checkAuth(request, path[0],
				Integer.valueOf(18))) {
			json.setFlag(1);
			json.setMsg("无权操作");
			return json;
		}
		List errorName = new ArrayList();
		try {
			for (String filepath : path) {
				File file = new File(filepath);
				if ((file.exists()) && (file.isFile())) {
					boolean result = file.delete();
					int tryCount = 0;
					while ((!result) && (tryCount++ < 10)) {
						System.gc();
						result = file.delete();
					}
				} else {
					errorName.add(filepath);
				}
			}
			json.setMsg("ok");
			json.setObj(errorName);
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg("err");
			json.setFlag(1);
		}
		return json;
	}

	@RequestMapping(value = { "/deleteFolder" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<String> deleteFolder(HttpServletRequest request, String path) {
		ToJson json = new ToJson();
		if (!this.netdiskService.checkAuth(request, path, Integer.valueOf(18))) {
			json.setFlag(1);
			json.setMsg("无权操作");
			return json;
		}
		if (!StringUtils.checkNull(path).booleanValue()) {
			DeleteFile.refreshFileList(path);
			json.setMsg("ok");
			json.setFlag(0);
		} else {
			json.setMsg("err");
			json.setFlag(1);
		}

		return json;
	}

	@RequestMapping({ "/up1" })
	public String cont(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/upload/updwj1";
	}
}
