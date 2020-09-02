package com.jeiker.demo.controller;

import com.jeiker.demo.entity.Book;
import com.jeiker.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description: Book Controller
 * User: jeikerxiao
 * Date: 2020/9/2 3:12 下午
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public List<Book> getBookList() {
        return bookService.getBookList();
    }

    @PostMapping("/book")
    public Boolean saveBook(@RequestBody Book book) {
        return bookService.save(book);
    }
}
