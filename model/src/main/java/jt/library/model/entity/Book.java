package jt.library.model.entity;

import java.util.List;

/**
 * created: Sep 4, 2010T6:07:53 PM
 *
 * @author ctapobep
 */
public class Book implements Persitent {
    private Long id;
    private String title;
    private List<Persitent> authors;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Persitent> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Persitent> authors) {
        this.authors = authors;
    }
}
