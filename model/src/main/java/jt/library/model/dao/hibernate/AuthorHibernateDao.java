package jt.library.model.dao.hibernate;

import jt.library.model.entity.Author;
import org.hibernate.Query;

import java.util.List;

/**
 * created: Sep 4, 2010T6:31:13 PM
 *
 * @author ctapobep
 */
public class AuthorHibernateDao extends AbstractHibernateDao<Author> {

    public void saveOrUpdate(Author persistent) {
        getSession().save(persistent);
    }

    public void delete(Long id) {
        Query query = getSession().createQuery("delete Author where id= :authorId");
        query.setLong("authorId", id);
    }

    public void delete(Author persistent) {
        getSession().delete(persistent);
    }

    public Author get(Long id) {
        return (Author) getSession().load(Author.class, id);
    }

    @SuppressWarnings({"unchecked"})
    public List<Author> getAll() {
        return getSession().createQuery("from Author").list();
    }

}
