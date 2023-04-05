package com.wen.service;

import com.wen.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@SuppressWarnings("all")
public interface BookService {
    //����һ����
    int addBook(Books books);
    //ɾ��һ����
    int deleteBookById(int id);
    //�޸�һ����
    int updateBook(Books books);
    //id��ѯһ����
    Books queryBookById(int id);
    //��ѯ���е���
    List<Books> queryAllBook();
}
