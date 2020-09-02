package com.jeiker.demo.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jeiker.demo.entity.Book;
import com.jeiker.demo.mapper.BookMapper;
import com.jeiker.demo.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: BookServiceImpl
 * User: jeikerxiao
 * Date: 2020/9/2 3:19 下午
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

    @Override
    public List<Book> getBookList() {
        return baseMapper.selectList(Wrappers.<Book>lambdaQuery());
    }

    @Override
    public boolean save(Book book) {
        return super.save(book);
    }
}
