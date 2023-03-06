package com.lu.controller;

import com.lu.pojo.Books;
import com.lu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String addBook(Books books){

        //这里用重定向还是转发，为什么
        return "redirect:/book/allbook";
    }

}
