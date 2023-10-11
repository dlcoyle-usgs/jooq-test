/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.java.db.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.demo.java.db.Indexes;
import org.jooq.demo.java.db.Keys;
import org.jooq.demo.java.db.Public;
import org.jooq.demo.java.db.tables.records.ActorRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Actor extends TableImpl<ActorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.actor</code>
     */
    public static final Actor ACTOR = new Actor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActorRecord> getRecordType() {
        return ActorRecord.class;
    }

    /**
     * The column <code>public.actor.actor_id</code>.
     */
    public final TableField<ActorRecord, Long> ACTOR_ID = createField(DSL.name("actor_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.actor.first_name</code>.
     */
    public final TableField<ActorRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>public.actor.last_name</code>.
     */
    public final TableField<ActorRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>public.actor.last_update</code>.
     */
    public final TableField<ActorRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), this, "");

    private Actor(Name alias, Table<ActorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Actor(Name alias, Table<ActorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.actor</code> table reference
     */
    public Actor(String alias) {
        this(DSL.name(alias), ACTOR);
    }

    /**
     * Create an aliased <code>public.actor</code> table reference
     */
    public Actor(Name alias) {
        this(alias, ACTOR);
    }

    /**
     * Create a <code>public.actor</code> table reference
     */
    public Actor() {
        this(DSL.name("actor"), null);
    }

    public <O extends Record> Actor(Table<O> child, ForeignKey<O, ActorRecord> key) {
        super(child, key, ACTOR);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_ACTOR_LAST_NAME);
    }

    @Override
    public Identity<ActorRecord, Long> getIdentity() {
        return (Identity<ActorRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<ActorRecord> getPrimaryKey() {
        return Keys.ACTOR_PKEY;
    }

    @Override
    public Actor as(String alias) {
        return new Actor(DSL.name(alias), this);
    }

    @Override
    public Actor as(Name alias) {
        return new Actor(alias, this);
    }

    @Override
    public Actor as(Table<?> alias) {
        return new Actor(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Actor rename(String name) {
        return new Actor(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Actor rename(Name name) {
        return new Actor(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Actor rename(Table<?> name) {
        return new Actor(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Long, ? super String, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Long, ? super String, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
