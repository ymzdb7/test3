package com.myoa.controller.im;

import com.myoa.controller.im.Model.ImMessageModel;
import com.myoa.controller.im.Model.ImRoomModel;
import com.myoa.controller.im.Model.Status;
import com.myoa.model.im.ImChatData;
import com.myoa.model.im.ImMessage;
import com.myoa.model.im.ImRoom;
import com.myoa.model.users.Users;
import com.myoa.service.im.ImChatDataService;
import com.myoa.util.ToJson;
import com.myoa.util.common.MobileCheck;
import com.myoa.util.common.session.SessionUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping({ "/im" })
public class ImChatDataController {

	@Autowired
	ImChatDataService imChatDataService;

	@RequestMapping({ "/putMessage" })
	@ResponseBody
	public Object putMessageInfo(
			@RequestParam(required = false, name = "file") MultipartFile file,
			HttpServletRequest request, Integer flag, String from_uid,
			String to_uid, String of_from, String of_to, String content,
			String type, String stime, String uuid, String msg_type,
			String voice_time, Long atime) {
		System.out.println("-------putMessage----------");
		MultipartFile[] flies = new MultipartFile[1];
		if (file != null) {
			flies[0] = file;
		}
		if (!MobileCheck.isMobileDevice(request.getHeader("User-Agent")
				.toUpperCase())) {
			return this.imChatDataService.putMessageInfoPc(flies, request,
					flag, from_uid, to_uid, of_from, of_to, content, type,
					stime, uuid, msg_type, voice_time);
		}
		Object status = this.imChatDataService.putMessageInfo(file, request,
				flag, from_uid, to_uid, of_from, of_to, content, type, stime,
				uuid, msg_type, voice_time, atime);
		return status;
	}

	@RequestMapping({ "/getImList" })
	@ResponseBody
	public List<ImMessageModel> getImList(HttpServletRequest request,
			String of_from) {
		System.out.println("-------getImList----------");
		List list = null;
		try {
			list = this.imChatDataService.getImChatList(request, of_from);
		} catch (FileNotFoundException e) {
			return list;
		} catch (IOException e) {
			e.printStackTrace();
			return list;
		} catch (LineUnavailableException e) {
			e.printStackTrace();
			return list;
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
			return list;
		}
		return list;
	}

	@RequestMapping({ "/getSqlType" })
	@ResponseBody
	public ToJson<ImMessageModel> getImList1(HttpServletRequest request) {
		String sqlType = (String) request.getSession().getAttribute(
				"loginDateSouse");

		ToJson toJson = new ToJson();
		Users users = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		int str = users.getUid().intValue();
		ImMessageModel messageModel = new ImMessageModel();
		messageModel.setSqlType(sqlType);
		messageModel.setStr(str);
		toJson.setObject(messageModel);
		toJson.setMsg("ok");
		return toJson;
	}

	@RequestMapping({ "/getImList1" })
	@ResponseBody
	public List<ImMessageModel> getImList1(HttpServletRequest request,
			String of_from) {
		String sqlType = (String) request.getSession().getAttribute(
				"loginDateSouse");

		Users users = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		int str = users.getUid().intValue();
		ImMessageModel messageModel = new ImMessageModel();
		messageModel.setSqlType(sqlType);
		messageModel.setStr(str);
		System.out.println("-------getImList----------");
		List list = null;
		try {
			list = this.imChatDataService.getImChatList1(request, of_from);
		} catch (FileNotFoundException e) {
			return list;
		} catch (IOException e) {
			e.printStackTrace();
			return list;
		} catch (LineUnavailableException e) {
			e.printStackTrace();
			return list;
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
			return list;
		}
		return list;
	}

	@RequestMapping({ "/rollBackMessage" })
	@ResponseBody
	public ToJson<ImMessage> rollBackMessage(String uuid) {
		return this.imChatDataService.rollBackMessage(uuid);
	}

	@RequestMapping({ "/showMessageList" })
	@ResponseBody
	public List<ImMessageModel> showMessageList(
			HttpServletRequest request,
			String of_from,
			String of_to,
			String last_time,
			String msg_type,
			@RequestParam(name = "pagenum", required = false, defaultValue = "1") Integer pagenum) {
		System.out.println("-------showMessageList----------");
		ToJson list = new ToJson();
		List imMessageModelList = new ArrayList();
		try {
			imMessageModelList = this.imChatDataService.showMessageList(
					request, of_from, of_to, last_time, msg_type, pagenum)
					.getObj();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		}
		return imMessageModelList;
	}

	@RequestMapping({ "/showMessageListRilegou" })
	@ResponseBody
	public ToJson<ImMessageModel> showMessageListRilegou(
			HttpServletRequest request,
			String of_from,
			String of_to,
			String last_time,
			String msg_type,
			@RequestParam(name = "pagenum", required = false, defaultValue = "1") Integer pagenum,
			String type, String fileName, String searchMsg) {
		System.out.println("-------showMessageList----------");
		ToJson list = new ToJson();
		try {
			list = this.imChatDataService.showMessageListRiLeGou(request,
					of_from, of_to, last_time, msg_type, pagenum, type,
					fileName, searchMsg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		}
		return list;
	}

	@RequestMapping({ "/getAllRoom" })
	@ResponseBody
	public List<ImRoomModel> getAllRoom(HttpServletRequest request, String uid) {
		System.out.println("-------getAllRoom----------");
		return this.imChatDataService.getAllRoom(uid);
	}

	@RequestMapping({ "/getSingleRoom" })
	@ResponseBody
	public ImRoomModel getSingleRoom(HttpServletRequest request, String room_id) {
		System.out.println("-------getSingleRoom----------");
		return this.imChatDataService.getSingleRoom(room_id);
	}

	@RequestMapping({ "/insertRoom" })
	@ResponseBody
	public Status insertRoom(HttpServletRequest request, String name,
			String set_uid, String set_of, String member_uid, String stime,
			String room_of) {
		return this.imChatDataService.insertRoom(name, set_uid, set_of,
				member_uid, stime, room_of);
	}

	@RequestMapping({ "/getOutPerson" })
	@ResponseBody
	public Status getOutPerson(HttpServletRequest request, String room_id,
			String delete_uid, String opt) {
		return this.imChatDataService.getOutPerson(room_id, delete_uid, opt);
	}

	@RequestMapping({ "/roomRever" })
	@ResponseBody
	public ToJson<ImRoom> roomRever(String room_id) {
		return this.imChatDataService.roomRever(room_id);
	}

	@RequestMapping({ "/openInvite" })
	@ResponseBody
	public Status openInvite(HttpServletRequest request, String room_id,
			String check) {
		return this.imChatDataService.openInvite(room_id, check);
	}

	@RequestMapping({ "/deleteMessage" })
	@ResponseBody
	public Status deleteMessage(String uid, String deleteuuid) {
		return this.imChatDataService.deleteMessage(deleteuuid, uid);
	}

	@RequestMapping({ "/getPersonToRoom" })
	@ResponseBody
	public Status getPersonToRoom(HttpServletRequest request, String room_id,
			String invite_uid) {
		return this.imChatDataService.getPersonToRoom(room_id, invite_uid);
	}

	@RequestMapping({ "/updateRoomName" })
	@ResponseBody
	public Status updateRoomName(HttpServletRequest request, String room_id,
			String room_name) {
		return this.imChatDataService.updateRoomName(room_id, room_name);
	}

	@RequestMapping({ "/getAttchments" })
	@ResponseBody
	public List<ImMessageModel> getAttchment(HttpServletRequest req,
			String other_id, String my_uid) {
		try {
			return this.imChatDataService.getAttchments(other_id, my_uid, req);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ArrayList();
	}

	@RequestMapping({ "/selectMessage" })
	@ResponseBody
	public List<ImMessageModel> selectMessage(HttpServletRequest req,
			String other_id, String my_uid, String keyword, String msg_type) {
		try {
			Map map = new HashMap();
			map.put("other_id", other_id);
			map.put("req", req);
			map.put("my_uid", my_uid);
			map.put("keyword", keyword);
			map.put("msg_type", msg_type);
			return this.imChatDataService.selectMessage(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList();
	}

	@RequestMapping({ "/updateMsgFree" })
	@ResponseBody
	public Status updateMsgFree(HttpServletRequest req, String list_id,
			String type, String set_uid) {
		Status s;
		try {
			Map map = new HashMap();
			map.put("list_id", list_id);
			map.put("req", req);
			map.put("type", type);
			map.put("set_uid", set_uid);
			Status status = this.imChatDataService.updateMsgFree(map);
			return status;
		} catch (Exception e) {
			e.printStackTrace();
			s = new Status();
			s.setStatus("error");
		}
		return s;
	}

	@RequestMapping({ "/getPriv" })
	@ResponseBody
	public ImMessageModel getPriv(HttpServletRequest request, String of_from,
			String of_to, String msg_type) {
		ImMessageModel priv = null;
		try {
			priv = this.imChatDataService.getPriv(of_from, of_to, msg_type);
		} catch (Exception e) {
			e.getMessage();
		}
		return priv;
	}

	@RequestMapping({ "/delChatList" })
	@ResponseBody
	public ToJson<ImChatData> delChatList(HttpServletRequest request, int listId) {
		return this.imChatDataService.delChatList(request, listId);
	}

	@RequestMapping({ "/getRoomPerson" })
	@ResponseBody
	public ToJson<Users> getRoomPerson(HttpServletRequest request, String roomOf) {
		return this.imChatDataService.getRoomPerson(request, roomOf);
	}
}