package com.yx.book.service;

import com.yx.book.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.List;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j

class BookServiceTest {

    @Resource
    private BookService bookService;
    @Test
    void save() {
        Book book = Book.builder()
                .name("java")
                .cover("1.jpg")
                .build();
        Book saveBook = bookService.save(book);
//        log.info("id:" + saveBook.getId());
        assertEquals("Java", saveBook.getName());
    }

    @Test
    void getAll() {
        List<Book> books = bookService.getAll();
//           log.info("books:" + books);
        assertEquals(5, books.size());
    }
}