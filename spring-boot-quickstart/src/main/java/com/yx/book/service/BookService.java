package com.yx.book.service;

import com.yx.book.entity.Book;

import java.util.List;

/**
 * @author DELL
 * @date 2021/3/18
 * @description BookService
 */
public interface BookService {
    /**
     * 新增book
     *
     * @param  book 入参
     * @return 新增的book对象
     */
    Book save(Book book);

    /**
     * 查询所有book
     *
     * @return 叔叔集合
     */
    List<Book> getAll();
}
