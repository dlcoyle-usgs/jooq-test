/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables;


import java.time.LocalDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.demo.kotlin.db.Keys;
import org.jooq.demo.kotlin.db.Public;
import org.jooq.demo.kotlin.db.tables.records.CategoryRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Category extends TableImpl<CategoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.category</code>
     */
    public static final Category CATEGORY = new Category();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CategoryRecord> getRecordType() {
        return CategoryRecord.class;
    }

    /**
     * The column <code>public.category.category_id</code>.
     */
    public final TableField<CategoryRecord, Long> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.category.name</code>.
     */
    public final TableField<CategoryRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(25).nullable(false), this, "");

    /**
     * The column <code>public.category.last_update</code>.
     */
    public final TableField<CategoryRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "");

    private Category(Name alias, Table<CategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Category(Name alias, Table<CategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.category</code> table reference
     */
    public Category(String alias) {
        this(DSL.name(alias), CATEGORY);
    }

    /**
     * Create an aliased <code>public.category</code> table reference
     */
    public Category(Name alias) {
        this(alias, CATEGORY);
    }

    /**
     * Create a <code>public.category</code> table reference
     */
    public Category() {
        this(DSL.name("category"), null);
    }

    public <O extends Record> Category(Table<O> child, ForeignKey<O, CategoryRecord> key) {
        super(child, key, CATEGORY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<CategoryRecord, Long> getIdentity() {
        return (Identity<CategoryRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CategoryRecord> getPrimaryKey() {
        return Keys.CATEGORY_PKEY;
    }

    @Override
    public Category as(String alias) {
        return new Category(DSL.name(alias), this);
    }

    @Override
    public Category as(Name alias) {
        return new Category(alias, this);
    }

    @Override
    public Category as(Table<?> alias) {
        return new Category(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Category rename(String name) {
        return new Category(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Category rename(Name name) {
        return new Category(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Category rename(Table<?> name) {
        return new Category(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, LocalDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Long, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Long, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
