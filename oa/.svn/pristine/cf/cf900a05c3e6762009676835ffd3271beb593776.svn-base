package com.myoa.controller.sys;

import com.myoa.model.common.SysCode;
import com.myoa.model.common.Syslog;
import com.myoa.model.users.Users;
import com.myoa.service.common.SysCodeService;
import com.myoa.service.sys.SysLogService;
import com.myoa.service.users.UsersService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.dataSource.ContextHolder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/sys" })
public class SysLogController {

	@Resource
	private SysLogService sysLogService;

	@Resource
	private SysCodeService sysCodeService;

	@Resource
	private UsersService userService;

	@RequestMapping({ "/journal" })
	public String journal(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/sys/journal";
	}

	@ResponseBody
	@RequestMapping(value = { "/getLogMessage" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Map> getLogMessage(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		HashMap logMap = new HashMap();
		try {
			this.sysLogService.getLogMessage(logMap);
			if (logMap.size() == 6) {
				tojson.setMsg("ok");
				tojson.setFlag(0);
				tojson.setObject(logMap);
			}
		} catch (Exception e) {
			tojson.setFlag(1);
			tojson.setMsg("err");
		}

		return tojson;
	}

	@ResponseBody
	@RequestMapping(value = { "/getTenLog" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Syslog> getTenLog(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		try {
			List list = this.sysLogService.getTenLog();
			tojson.setObject(list);
			tojson.setMsg("ok");
			tojson.setFlag(0);
		} catch (Exception e) {
			tojson.setFlag(1);
			tojson.setMsg("err");
		}
		return tojson;
	}

	@ResponseBody
	@RequestMapping(value = { "/getEachMouthLogData" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Object> getEachMouthLogData(String year, String month,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");

		Map map = new HashMap();
		try {
			List monthDataList = this.sysLogService.getEachMouthLogData(year);
			List dayDataList = this.sysLogService
					.getEachDayLogData(year, month);
			map.put("monthData", monthDataList);
			map.put("dayData", dayDataList);

			tojson.setObject(map);
			tojson.setMsg("OK");
			tojson.setFlag(0);
		} catch (ClassCastException e) {
			tojson.setFlag(1);
			tojson.setMsg("err");
		}
		return tojson;
	}

	@ResponseBody
	@RequestMapping(value = { "/getYear" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Integer> getYear(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		try {
			List yearList = this.sysLogService.getYear();

			tojson.setObj(yearList);
			tojson.setMsg("ok");
			tojson.setFlag(0);
		} catch (Exception e) {
			tojson.setFlag(1);
			tojson.setMsg("err");
		}

		return tojson;
	}

	@ResponseBody
	@RequestMapping(value = { "/getMonth" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Integer> getMonth(HttpServletRequest request, String year) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson toJson = new ToJson(0, "");
		try {
			Integer endMonth = this.sysLogService.getMonth(year);
			toJson.setMsg("OK");
			toJson.setFlag(0);
			toJson.setObject(endMonth);
		} catch (Exception e) {
			toJson.setFlag(1);
			toJson.setMsg("err");
		}
		return toJson;
	}

	@ResponseBody
	@RequestMapping(value = { "/getHourLog" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Object> getHourLog(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		List hourDataList = new ArrayList();

		ToJson toJson = new ToJson(0, "");
		try {
			hourDataList = this.sysLogService.getHourLog();
			toJson.setMsg("OK");
			toJson.setFlag(0);
			toJson.setObj(hourDataList);
		} catch (Exception e) {
			toJson.setFlag(1);
			toJson.setMsg("err");
		}
		return toJson;
	}

	@ResponseBody
	@RequestMapping(value = { "/getLogType" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<SysCode> getLogType(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson toJson = new ToJson(0, "");
		try {
			List logTypeList = this.sysCodeService.getLogType();
			toJson.setMsg("OK");
			toJson.setFlag(0);
			toJson.setObj(logTypeList);
		} catch (Exception e) {
			toJson.setFlag(1);
			toJson.setMsg("err");
		}
		return toJson;
	}

	@ResponseBody
	@RequestMapping(value = { "/logManage" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Syslog> findLogManage(
			HttpServletRequest request,
			@RequestParam(value = "type", required = false) Integer type,
			@RequestParam(value = "uid", required = false) String uid,
			@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") @RequestParam(value = "startTime", required = false) String startTime,
			@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") @RequestParam(value = "endTime", required = false) String endTime,
			@RequestParam(value = "syslog", required = false) Syslog syslog) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson toJson = new ToJson(0, "");
		try {
			List syslogList = this.sysLogService.logManage(type, uid,
					startTime, endTime, syslog);
			List syslogList1 = new ArrayList();
			if (syslogList.size() > 300) {
				for (int i = 0; i < 300; i++) {
					syslogList1.add(syslogList.get(i));
				}
				toJson.setObj(syslogList1);
			} else {
				toJson.setObj(syslogList);
			}
			toJson.setMsg("OK");
			toJson.setFlag(0);
		} catch (Exception e) {
			toJson.setFlag(1);
			toJson.setMsg("err");
		}
		return toJson;
	}

	@ResponseBody
	@RequestMapping(value = { "/deleteSyslog" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Syslog> deleteSyslog(
			HttpServletRequest request,
			@RequestParam(value = "type", required = false) Integer type,
			@RequestParam(value = "uid", required = false) String uid,
			@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") @RequestParam(value = "startTime", required = false) Date startTime,
			@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") @RequestParam(value = "endTime", required = false) Date endTime,
			@RequestParam(value = "syslog", required = false) Syslog syslog) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson toJson = new ToJson(0, "");
		try {
			this.sysLogService.deleteSyslog(type, uid, startTime, endTime,
					syslog);
			toJson.setMsg("OK");
			toJson.setFlag(0);
		} catch (Exception e) {
			toJson.setFlag(1);
			toJson.setMsg("err");
		}
		return toJson;
	}

	@RequestMapping(value = { "/exportLogXls" }, produces = { "application/json;charset=UTF-8" })
	public String exportLogXls(
			HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam(value = "type", required = false) Integer type,
			@RequestParam(value = "uid", required = false) String uid,
			@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") @RequestParam(value = "startTime", required = false) String startTime,
			@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") @RequestParam(value = "endTime", required = false) String endTime,
			@RequestParam(value = "syslog", required = false) Syslog syslog)
			throws Exception {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		List<Syslog> syslogList = this.sysLogService.logManage(type, uid,
				startTime, endTime, syslog);

		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("日志数据");
		HSSFRow headRow = sheet.createRow(0);
		headRow.createCell(0).setCellValue("用户姓名");
		headRow.createCell(1).setCellValue("时间");
		headRow.createCell(2).setCellValue("IP地址");
		headRow.createCell(3).setCellValue("ip所在地");
		headRow.createCell(4).setCellValue("日志类型");
		headRow.createCell(5).setCellValue("备注");

		for (Syslog log : syslogList) {
			HSSFRow dataRow = sheet.createRow(sheet.getLastRowNum() + 1);

			String userName = this.userService.getUserNameById(log.getUserId());
			dataRow.createCell(0).setCellValue(userName);

			SimpleDateFormat sdfTime = new SimpleDateFormat(
					"yyyy-MM-dd hh:MM:ss");
			String timeString = sdfTime.format(log.getTime());

			dataRow.createCell(1).setCellValue(timeString);

			dataRow.createCell(2).setCellValue(log.getIp());
			dataRow.createCell(3).setCellValue(log.getIpLocation());
			dataRow.createCell(4).setCellValue(log.getTypeName());
			dataRow.createCell(5).setCellValue(log.getRemark());
		}

		ServletOutputStream out = response.getOutputStream();

		String filename = "系统日志.xls";
		filename = FileUtils.encodeDownloadFilename(filename,
				request.getHeader("user-agent"));

		response.setContentType("application/vnd.ms-excel");
		response.setHeader("content-disposition", "attachment;filename="
				+ filename);

		workbook.write(out);

		return null;
	}

	@ResponseBody
	@RequestMapping({ "/deleteLogByIds" })
	public ToJson<Object> deleteLogByIds(HttpServletRequest request, String ids) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson toJson = new ToJson(0, "");
		try {
			this.sysLogService.deleteLogByIds(ids);
			toJson.setMsg("OK");
			toJson.setFlag(0);
		} catch (Exception e) {
			toJson.setFlag(1);
			toJson.setMsg("err");
		}
		return toJson;
	}

	@RequestMapping({ "/deleteAllLog" })
	public ToJson<Object> deleteAllLog(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson toJson = new ToJson(0, "");
		try {
			this.sysLogService.deleteAllLog();
			toJson.setMsg("OK");
			toJson.setFlag(0);
		} catch (Exception e) {
			toJson.setFlag(1);
			toJson.setMsg("err");
		}
		return toJson;
	}

	@ResponseBody
	@RequestMapping(value = { "/getUserLoginLogs" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Syslog> getCountLoginLogs(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			List syslogList = this.sysLogService.getUserLoginLogs(request);
			json.setFlag(0);
			json.setMsg("ok");
			json.setObj(syslogList);
		} catch (Exception e) {
			json.setFlag(1);
			json.setMsg("err");
			e.printStackTrace();
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/getTenBatchSetLog" })
	public ToJson<Syslog> getTenBatchSetLog(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson<Syslog> json = new ToJson<Syslog>(0, null);
		List<Syslog> sysLogList = null;
		try {
			sysLogList = this.sysLogService.getTenBatchSetLog();
			for (Syslog s : sysLogList) {
				Users usersByuserId = this.userService.findUsersByuserId(s
						.getUserId());
				s.setUserName(usersByuserId.getUserName());
				s.setTypeName(this.sysCodeService.getLogNameByNo("19"));
			}
			json.setFlag(0);
			json.setMsg("ok");
			json.setObj(sysLogList);
		} catch (Exception e) {
			e.printStackTrace();
			json.setFlag(1);
			json.setMsg("err");
		}

		return json;
	}

	@ResponseBody
	@RequestMapping(value = { "/getModifyPwdLog" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Syslog> getModifyPwdLog(HttpServletRequest request) {
		return this.sysLogService.getModifyPwdLog(request);
	}
}
