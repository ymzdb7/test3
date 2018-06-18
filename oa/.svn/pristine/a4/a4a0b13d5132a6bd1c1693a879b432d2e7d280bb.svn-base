package com.myoa.controller.notes;

import com.myoa.model.notes.Notes;
import com.myoa.model.users.Users;
import com.myoa.service.notes.NotesService;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;

import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/Notes" })
public class NotesController {

	@Resource
	private NotesService notesService;

	@RequestMapping({ "/index" })
	public String address() {
		return "app/notes/index";
	}

	@RequestMapping({ "/insertNotes" })
	@ResponseBody
	public ToJson<Notes> insertNotes(Notes notes, HttpServletRequest request) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.notesService.insertNotes(notes, user);
	}

	@RequestMapping({ "/selectNotes" })
	@ResponseBody
	public ToJson<Notes> selectNotes(HttpServletRequest request) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.notesService.selectNotes(user);
	}

	@RequestMapping({ "/selectNotesPagination" })
	@ResponseBody
	public ToJson<Notes> selectNotesPagination(
			HttpServletRequest request,
			Map<String, Object> maps,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) boolean useFlag) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.notesService.selectNotesPagination(user, maps, page,
				pageSize, useFlag);
	}

	@RequestMapping({ "/selectNewNote" })
	@ResponseBody
	public ToJson<Notes> selectNewNote(HttpServletRequest request) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.notesService.selectNewNote(user);
	}

	@RequestMapping({ "/selectNotesByPrimaryKey" })
	@ResponseBody
	public ToJson<Notes> selectNotesByPrimaryKey(Integer noteId) {
		return this.notesService.selectNotesByPrimaryKey(noteId);
	}

	@RequestMapping({ "/deleteByPrimaryKey" })
	@ResponseBody
	public ToJson<Notes> deleteByPrimaryKey(Integer noteId) {
		return this.notesService.deleteByPrimaryKey(noteId);
	}

	@RequestMapping({ "/updateByPrimaryKey" })
	@ResponseBody
	public ToJson<Notes> updateByPrimaryKey(Notes notes) {
		return this.notesService.updateByPrimaryKey(notes);
	}
}
