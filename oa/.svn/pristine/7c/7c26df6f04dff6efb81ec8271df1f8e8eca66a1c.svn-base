  package com.myoa.service.book;
  
  import com.myoa.dao.book.BookTypeMapper;
import com.myoa.model.book.BookType;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;

  import java.util.List;
  import javax.annotation.Resource;
  import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
  
  @Service
  public class BookTypeService
  {
  
    @Resource
    private BookTypeMapper bookTypeMapper;
  
    @Transactional
    public ToJson<BookType> insertType(BookType bookType)
    {
      ToJson json = new ToJson(1, "error");
      try {
        int count = this.bookTypeMapper.insertType(bookType);
        if (count > 0) {
          json.setMsg("ok");
          json.setFlag(0);
        }
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "BookTypeService insertType:" + e });
        e.printStackTrace();
      }
      return json;
    }
  
    @Transactional
    public ToJson<BookType> upTypeById(BookType bookType)
    {
      ToJson json = new ToJson(1, "error");
      try {
        int count = this.bookTypeMapper.upTypeById(bookType);
        if (count > 0) {
          json.setMsg("ok");
          json.setFlag(0);
        }
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "BookTypeService upTypeById:" + e });
        e.printStackTrace();
      }
      return json;
    }
  
    @Transactional
    public ToJson<BookType> delTypeById(Integer typeId)
    {
      ToJson json = new ToJson(1, "error");
      try {
        int count = this.bookTypeMapper.delTypeById(typeId);
        if (count > 0) {
          json.setMsg("ok");
          json.setFlag(0);
        }
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "BookTypeService delTypeById:" + e });
        e.printStackTrace();
      }
      return json;
    }
  
    public ToJson<BookType> selTypeById(Integer typeId)
    {
      ToJson json = new ToJson(1, "error");
      try {
        BookType bookType = this.bookTypeMapper.selTypeById(typeId);
        json.setObject(bookType);
        json.setMsg("ok");
        json.setFlag(0);
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "BookTypeService selTypeById:" + e });
        e.printStackTrace();
      }
      return json;
    }
  
    public ToJson<BookType> selAllType()
    {
      ToJson json = new ToJson(1, "error");
      try {
        List list = this.bookTypeMapper.selAllType();
        json.setObj(list);
        json.setMsg("ok");
        json.setFlag(0);
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "BookTypeService selAllType:" + e });
        e.printStackTrace();
      }
      return json;
    }
  
    public ToJson<BookType> selCountByTypeName(String typeName)
    {
      ToJson json = new ToJson(1, "error");
      try {
        int count = this.bookTypeMapper.selCountByTypeName(typeName);
        json.setTotleNum(Integer.valueOf(count));
        json.setMsg("ok");
        json.setFlag(0);
      } catch (Exception e) {
        json.setMsg(e.getMessage());
        L.e(new Object[] { "BookTypeService selCountByTypeName:" + e });
        e.printStackTrace();
      }
      return json;
    }
  }

