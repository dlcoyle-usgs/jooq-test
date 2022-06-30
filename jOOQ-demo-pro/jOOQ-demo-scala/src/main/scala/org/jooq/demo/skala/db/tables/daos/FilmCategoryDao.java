/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables.daos;


import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.demo.skala.db.tables.FilmCategory;
import org.jooq.demo.skala.db.tables.records.FilmCategoryRecord;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmCategoryDao extends DAOImpl<FilmCategoryRecord, org.jooq.demo.skala.db.tables.pojos.FilmCategory, Record2<Long, Long>> {

    /**
     * Create a new FilmCategoryDao without any configuration
     */
    public FilmCategoryDao() {
        super(FilmCategory.FILM_CATEGORY, org.jooq.demo.skala.db.tables.pojos.FilmCategory.class);
    }

    /**
     * Create a new FilmCategoryDao with an attached configuration
     */
    public FilmCategoryDao(Configuration configuration) {
        super(FilmCategory.FILM_CATEGORY, org.jooq.demo.skala.db.tables.pojos.FilmCategory.class, configuration);
    }

    @Override
    public Record2<Long, Long> getId(org.jooq.demo.skala.db.tables.pojos.FilmCategory object) {
        return compositeKeyRecord(object.getFilmId(), object.getCategoryId());
    }

    /**
     * Fetch records that have <code>film_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.skala.db.tables.pojos.FilmCategory> fetchRangeOfFilmId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(FilmCategory.FILM_CATEGORY.FILM_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>film_id IN (values)</code>
     */
    public List<org.jooq.demo.skala.db.tables.pojos.FilmCategory> fetchByFilmId(Long... values) {
        return fetch(FilmCategory.FILM_CATEGORY.FILM_ID, values);
    }

    /**
     * Fetch records that have <code>category_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.skala.db.tables.pojos.FilmCategory> fetchRangeOfCategoryId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(FilmCategory.FILM_CATEGORY.CATEGORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>category_id IN (values)</code>
     */
    public List<org.jooq.demo.skala.db.tables.pojos.FilmCategory> fetchByCategoryId(Long... values) {
        return fetch(FilmCategory.FILM_CATEGORY.CATEGORY_ID, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.skala.db.tables.pojos.FilmCategory> fetchRangeOfLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(FilmCategory.FILM_CATEGORY.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<org.jooq.demo.skala.db.tables.pojos.FilmCategory> fetchByLastUpdate(LocalDateTime... values) {
        return fetch(FilmCategory.FILM_CATEGORY.LAST_UPDATE, values);
    }
}
