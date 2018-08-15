package jt.library.model.dao;

import jt.library.model.entity.Persitent;

import java.util.List;

/**
 * created: Sep 4, 2010T6:26:53 PM
 *
 * @author ctapobep
 */
public interface Dao<T extends Persitent> {
    void saveOrUpdate(T persistent);

    void delete(Long id);

    void delete(T persistent);

    T get(Long id);

    List<T> getAll();
}
