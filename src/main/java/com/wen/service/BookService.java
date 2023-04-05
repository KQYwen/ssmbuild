package com.wen.service;

import com.wen.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@SuppressWarnings("all")
public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(int id);
    //修改一本书
    int updateBook(Books books);
    //id查询一本书
    Books queryBookById(int id);
    //查询所有的书
    List<Books> queryAllBook();
}
