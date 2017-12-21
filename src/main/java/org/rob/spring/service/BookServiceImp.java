package org.rob.spring.service;

import org.rob.spring.dao.BookDao;
import org.rob.spring.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by robendiane on 21-12-17.
 */
@Service
@Transactional(readOnly = true)
public class BookServiceImp implements BookService {
    @Autowired
    private BookDao bookDao;

    @Transactional
    @Override
    public long save(Book book) {
        return bookDao.save(book);
    }

    @Override
    public Book get(long id) {
        return bookDao.get(id);
    }

    @Override
    public List<Book> list() {
        return bookDao.list();
    }

    @Transactional
    @Override
    public void update(long id, Book book) {
        bookDao.update(id, book);
    }

    @Transactional
    @Override
    public void delete(long id) {
        bookDao.delete(id);
    }
}
