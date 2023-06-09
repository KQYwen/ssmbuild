package com.wen.service;

import com.wen.dao.BookMapper;
import com.wen.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{

    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
