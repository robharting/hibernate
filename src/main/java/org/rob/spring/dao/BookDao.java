package org.rob.spring.dao;

import org.rob.spring.model.Book;

import java.util.List;

/**
 * Created by robendiane on 21-12-17.
 */
public interface BookDao {
    long save(Book book);
    Book get(long id);
    List<Book> list();
    void update(long id, Book book);
    void delete(long id);
}
