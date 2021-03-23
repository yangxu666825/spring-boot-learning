package com.yx.book.service.impl;

import com.yx.book.entity.Book;
import com.yx.book.repository.BookRepository;
import com.yx.book.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author DELL
 * @date 2021/3/18
 * @description BookServiceImpl
 */
@Service
@Transactional(rollbackFor = {RuntimeException.class})
public class BookServiceImpl implements BookService {

    @Resource
    private BookRepository bookRepository;


    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
