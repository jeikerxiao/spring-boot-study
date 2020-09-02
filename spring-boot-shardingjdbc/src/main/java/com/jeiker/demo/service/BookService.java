package com.jeiker.demo.service;

import com.jeiker.demo.entity.Book;

import java.util.List;

/**
 * Description: spring-boot-shardingjdbc
 * User: jeikerxiao
 * Date: 2020/9/2 3:20 下午
 */
public interface BookService {

    List<Book> getBookList();

    boolean save(Book book);

}
