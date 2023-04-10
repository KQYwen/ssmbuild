package com.wen.dao;

import com.wen.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@SuppressWarnings("all")
public interface BookMapper {
    //����һ����
    int addBook(Books books);
    //ɾ��һ����
    int deleteBookById(@Param("bookID") int id);
    //�޸�һ����
    int updateBook(Books books);
    //id��ѯһ����
    Books queryBookById(@Param("bookID") int id);
    //name ��ѯһ����
    Books queryBookByName(@Param("bookName") String bookName);
    //��ѯ���е���
    List<Books> queryAllBook();
}
