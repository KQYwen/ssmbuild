package com.wen.dao;

import com.wen.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@SuppressWarnings("all")
public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(@Param("bookID") int id);
    //修改一本书
    int updateBook(Books books);
    //id查询一本书
    Books queryBookById(@Param("bookID") int id);
    //name 查询一本书
    Books queryBookByName(@Param("bookName") String bookName);
    //查询所有的书
    List<Books> queryAllBook();
}
