 package com.myoa.service.notes.impl;
 
 import com.myoa.dao.notes.NotesMapper;
import com.myoa.model.notes.Notes;
import com.myoa.model.users.Users;
import com.myoa.service.notes.NotesService;
import com.myoa.util.ToJson;
import com.myoa.util.page.PageParams;

 import java.util.Date;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class NotesServiceImpl
   implements NotesService
 {
 
   @Resource
   private NotesMapper notesMapper;
 
   public ToJson<Notes> insertNotes(Notes notes, Users user)
   {
     ToJson json = new ToJson();
     try {
       int uId = user.getUid().intValue();
       notes.setUid(Integer.valueOf(uId));
       String currentTime = String.valueOf(new Date().getTime() / 1000L);
       int time = Integer.valueOf(currentTime).intValue();
 
       notes.setCreateTime(Integer.valueOf(time));
       notes.setEditTime(Integer.valueOf(time));
       notes.setShowFlag("1");
       this.notesMapper.insertNotes(notes);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<Notes> selectNotes(Users user)
   {
     ToJson json = new ToJson();
     try {
       int uid = user.getUid().intValue();
       List notesList = this.notesMapper.selectNotes(Integer.valueOf(uid));
       json.setObj(notesList);
       json.setFlag(0);
       json.setMsg("ok");
     }
     catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<Notes> selectNotesPagination(Users user, Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson json = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     int uid = user.getUid().intValue();
     Notes notes = new Notes();
     notes.setUid(Integer.valueOf(uid));
     maps.put("notes", notes);
     try
     {
       List notesList = this.notesMapper.selectNotesPagination(maps);
       json.setTotleNum(pageParams.getTotal());
       json.setObj(notesList);
       json.setFlag(0);
       json.setMsg("ok");
     }
     catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<Notes> selectNewNote(Users user)
   {
     ToJson json = new ToJson();
     try {
       int uid = user.getUid().intValue();
       Notes notes = this.notesMapper.selectNewNote(Integer.valueOf(uid));
       json.setObject(notes);
       json.setFlag(0);
       json.setMsg("ok");
     }
     catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<Notes> selectNotesByPrimaryKey(Integer noteId)
   {
     ToJson json = new ToJson();
     try {
       Notes notes = this.notesMapper.selectNotesByPrimaryKey(noteId);
       json.setObject(notes);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<Notes> deleteByPrimaryKey(Integer noteId)
   {
     ToJson json = new ToJson();
     try {
       this.notesMapper.deleteByPrimaryKey(noteId);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<Notes> updateByPrimaryKey(Notes notes)
   {
     ToJson json = new ToJson();
     try {
       String currentTime = String.valueOf(new Date().getTime() / 1000L);
       int time = Integer.valueOf(currentTime).intValue();
       notes.setEditTime(Integer.valueOf(time));
       this.notesMapper.updateByPrimaryKey(notes);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 }

