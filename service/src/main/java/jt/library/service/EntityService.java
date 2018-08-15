package jt.library.service;

import jt.library.model.entity.Author;

import java.util.List;

/**
 * created: Sep 4, 2010T7:15:29 PM
 *
 * @author ctapobep
 */
public interface EntityService<T extends Author> {
    void saveOrUpdate(T persistent);

    void delete(Long id);

    void delete(T persistent);

    T get(Long id);

    List<T> getAll();
}
