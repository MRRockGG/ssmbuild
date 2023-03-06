package com.lu.mapper;

import com.lu.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //add
    int addBook(Books books);

    //delete
    int deleteBookById(@Param("bookId") int bookID);
    //update
    int updateBook(Books books);
    //查询书，通过id
    Books queryBookById(@Param("bookId") int bookId);
    //查询全部的书
    List<Books> queryAllBook();
}
