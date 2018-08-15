package jt.library.model.dao.hibernate;

import jt.library.model.entity.Book;
import org.hibernate.Query;

import java.util.List;

/**
 * created: Sep 4, 2010T6:37:37 PM
 *
 * @author ctapobep
 */
public class BookHibernateDao extends AbstractHibernateDao<Book> {

    public void saveOrUpdate(Book persistent) {
        getSession().save(persistent);
    }

    public void delete(Long id) {
        Query query = getSession().createQuery("delete Book where id= :bookId");
        query.setLong("bookId", id);
        query.executeUpdate();
    }

    public void delete(Book persistent) {
        getSession().delete(persistent);
    }

    public Book get(Long id) {
        return (Book) getSession().load(Book.class, id);
    }

    @SuppressWarnings({"unchecked"})
    public List<Book> getAll() {
        return getSession().createQuery("from Book").list();
    }
}
