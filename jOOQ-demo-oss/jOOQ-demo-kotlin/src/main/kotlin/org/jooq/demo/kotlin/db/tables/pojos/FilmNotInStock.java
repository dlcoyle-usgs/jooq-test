/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmNotInStock implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pFilmCount;

    public FilmNotInStock() {}

    public FilmNotInStock(FilmNotInStock value) {
        this.pFilmCount = value.pFilmCount;
    }

    public FilmNotInStock(
        Integer pFilmCount
    ) {
        this.pFilmCount = pFilmCount;
    }

    /**
     * Getter for <code>public.film_not_in_stock.p_film_count</code>.
     */
    public Integer getPFilmCount() {
        return this.pFilmCount;
    }

    /**
     * Setter for <code>public.film_not_in_stock.p_film_count</code>.
     */
    public void setPFilmCount(Integer pFilmCount) {
        this.pFilmCount = pFilmCount;
    }
}
