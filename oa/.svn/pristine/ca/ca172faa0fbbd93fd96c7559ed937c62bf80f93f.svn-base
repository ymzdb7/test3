package com.myoa.service.notes;

import com.myoa.model.notes.Notes;
import com.myoa.model.users.Users;
import com.myoa.util.ToJson;

import java.util.Map;

public abstract interface NotesService
{
  public abstract ToJson<Notes> insertNotes(Notes paramNotes, Users paramUsers);

  public abstract ToJson<Notes> selectNotes(Users paramUsers);

  public abstract ToJson<Notes> selectNotesPagination(Users paramUsers, Map<String, Object> paramMap, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean);

  public abstract ToJson<Notes> selectNewNote(Users paramUsers);

  public abstract ToJson<Notes> selectNotesByPrimaryKey(Integer paramInteger);

  public abstract ToJson<Notes> deleteByPrimaryKey(Integer paramInteger);

  public abstract ToJson<Notes> updateByPrimaryKey(Notes paramNotes);
}

