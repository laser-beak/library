package jt.library.model.dao.hibernate;

import jt.library.model.dao.Dao;
import jt.library.model.entity.Author;
import jt.library.model.entity.Persitent;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

/**
 * created: Sep 4, 2010T6:38:57 PM
 *
 * @author ctapobep
 */
public abstract class AbstractHibernateDao<T extends Persitent> implements Dao<T> {
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
