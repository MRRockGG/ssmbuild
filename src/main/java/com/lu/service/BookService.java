package com.lu.service;

import com.lu.pojo.Books;


import java.util.List;

public interface BookService {
    //add
    int addBook(Books books);

    //delete
    int deleteBookById(int bookID);
    //update
    int updateBook(Books books);
    //查询书，通过id
    Books queryBookById(int bookId);
    //查询全部的书
    List<Books> queryAllBook();



    //搜索功能
    List<Books> queryAllBook(String bookName);
}
