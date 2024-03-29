package com.lu.controller;

import com.lu.pojo.Books;
import com.lu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    //controller 调用service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部的书记，并且返回到一个书记展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }
    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("ADDbook开始运行");
        bookService.addBook(books);
        //这里用重定向还是转发，为什么
        return "redirect:/book/allBook";
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdatePager(int id,Model model) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBook",books);
        return "updateBook";}

    //修改书籍的action
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updatebook开始运行");
        bookService.updateBook(books);
        //这里用重定向还是转发，为什么
        return "redirect:/book/allBook";
    }

    //删除书籍的service
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //搜索书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        List<Books> list = bookService.queryAllBook(queryBookName);
        model.addAttribute("list",list);
        return "allBook";


    }

}
