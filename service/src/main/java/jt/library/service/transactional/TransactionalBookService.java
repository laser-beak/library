package jt.library.service.transactional;

import jt.library.model.dao.Dao;
import jt.library.model.entity.Book;
import jt.library.service.BookService;

import java.util.List;

public class TransactionalBookService implements BookService {

    /**
     * ДАО класс - Книги
     */
    private Dao<Book> bookDao;

    public TransactionalBookService(Dao<Book> bookDao) {
        this.bookDao = bookDao;
    }

    public void saveOrUpdate(Book book) {
        bookDao.saveOrUpdate(book);
    }

    public void delete(Long id) {
        bookDao.delete(id);
    }

    public void delete(Book book) {
        bookDao.delete(book);
    }

    public Book get(Long id) {
        return bookDao.get(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
