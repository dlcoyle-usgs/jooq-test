/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.demo.kotlin.db.tables.Language;
import org.jooq.demo.kotlin.db.tables.records.LanguageRecord;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LanguageDao extends DAOImpl<LanguageRecord, org.jooq.demo.kotlin.db.tables.pojos.Language, Long> {

    /**
     * Create a new LanguageDao without any configuration
     */
    public LanguageDao() {
        super(Language.LANGUAGE, org.jooq.demo.kotlin.db.tables.pojos.Language.class);
    }

    /**
     * Create a new LanguageDao with an attached configuration
     */
    public LanguageDao(Configuration configuration) {
        super(Language.LANGUAGE, org.jooq.demo.kotlin.db.tables.pojos.Language.class, configuration);
    }

    @Override
    public Long getId(org.jooq.demo.kotlin.db.tables.pojos.Language object) {
        return object.getLanguageId();
    }

    /**
     * Fetch records that have <code>language_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.kotlin.db.tables.pojos.Language> fetchRangeOfLanguageId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Language.LANGUAGE.LANGUAGE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>language_id IN (values)</code>
     */
    public List<org.jooq.demo.kotlin.db.tables.pojos.Language> fetchByLanguageId(Long... values) {
        return fetch(Language.LANGUAGE.LANGUAGE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>language_id = value</code>
     */
    public org.jooq.demo.kotlin.db.tables.pojos.Language fetchOneByLanguageId(Long value) {
        return fetchOne(Language.LANGUAGE.LANGUAGE_ID, value);
    }

    /**
     * Fetch a unique record that has <code>language_id = value</code>
     */
    public Optional<org.jooq.demo.kotlin.db.tables.pojos.Language> fetchOptionalByLanguageId(Long value) {
        return fetchOptional(Language.LANGUAGE.LANGUAGE_ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.kotlin.db.tables.pojos.Language> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Language.LANGUAGE.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<org.jooq.demo.kotlin.db.tables.pojos.Language> fetchByName(String... values) {
        return fetch(Language.LANGUAGE.NAME, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.kotlin.db.tables.pojos.Language> fetchRangeOfLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Language.LANGUAGE.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<org.jooq.demo.kotlin.db.tables.pojos.Language> fetchByLastUpdate(LocalDateTime... values) {
        return fetch(Language.LANGUAGE.LAST_UPDATE, values);
    }
}
