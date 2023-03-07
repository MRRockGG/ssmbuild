package com.lu.service;

import com.lu.mapper.BookMapper;
import com.lu.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    //service层掉dao层；组合dao
    @Autowired
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int bookID) {
        return bookMapper.deleteBookById(bookID);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int bookId) {
        return bookMapper.queryBookById(bookId);
    }

    public List<Books> queryAllBook() {
        System.out.println("public List<Books> queryAllBook()");
        return bookMapper.queryAllBook();
    }

    public List<Books> queryAllBook(String bookName) {
        System.out.println("public List<Books> queryAllBook(String bookName)");
        return bookMapper.queryAllBook(bookName);
    }

}
