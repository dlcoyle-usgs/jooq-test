/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.java.db.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.demo.java.db.tables.Actor;
import org.jooq.demo.java.db.tables.records.ActorRecord;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActorDao extends DAOImpl<ActorRecord, org.jooq.demo.java.db.tables.pojos.Actor, Long> {

    /**
     * Create a new ActorDao without any configuration
     */
    public ActorDao() {
        super(Actor.ACTOR, org.jooq.demo.java.db.tables.pojos.Actor.class);
    }

    /**
     * Create a new ActorDao with an attached configuration
     */
    public ActorDao(Configuration configuration) {
        super(Actor.ACTOR, org.jooq.demo.java.db.tables.pojos.Actor.class, configuration);
    }

    @Override
    public Long getId(org.jooq.demo.java.db.tables.pojos.Actor object) {
        return object.actorId();
    }

    /**
     * Fetch records that have <code>actor_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Actor> fetchRangeOfActorId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Actor.ACTOR.ACTOR_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>actor_id IN (values)</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Actor> fetchByActorId(Long... values) {
        return fetch(Actor.ACTOR.ACTOR_ID, values);
    }

    /**
     * Fetch a unique record that has <code>actor_id = value</code>
     */
    public org.jooq.demo.java.db.tables.pojos.Actor fetchOneByActorId(Long value) {
        return fetchOne(Actor.ACTOR.ACTOR_ID, value);
    }

    /**
     * Fetch a unique record that has <code>actor_id = value</code>
     */
    public Optional<org.jooq.demo.java.db.tables.pojos.Actor> fetchOptionalByActorId(Long value) {
        return fetchOptional(Actor.ACTOR.ACTOR_ID, value);
    }

    /**
     * Fetch records that have <code>first_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Actor> fetchRangeOfFirstName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Actor.ACTOR.FIRST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>first_name IN (values)</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Actor> fetchByFirstName(String... values) {
        return fetch(Actor.ACTOR.FIRST_NAME, values);
    }

    /**
     * Fetch records that have <code>last_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Actor> fetchRangeOfLastName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Actor.ACTOR.LAST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_name IN (values)</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Actor> fetchByLastName(String... values) {
        return fetch(Actor.ACTOR.LAST_NAME, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Actor> fetchRangeOfLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Actor.ACTOR.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<org.jooq.demo.java.db.tables.pojos.Actor> fetchByLastUpdate(LocalDateTime... values) {
        return fetch(Actor.ACTOR.LAST_UPDATE, values);
    }
}
