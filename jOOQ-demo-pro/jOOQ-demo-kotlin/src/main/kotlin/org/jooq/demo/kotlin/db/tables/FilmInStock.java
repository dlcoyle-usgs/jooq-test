/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables;


import java.util.function.Function;

import org.jooq.Field;
import org.jooq.Function1;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row1;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.demo.kotlin.db.Public;
import org.jooq.demo.kotlin.db.tables.records.FilmInStockRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmInStock extends TableImpl<FilmInStockRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.film_in_stock</code>
     */
    public static final FilmInStock FILM_IN_STOCK = new FilmInStock();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmInStockRecord> getRecordType() {
        return FilmInStockRecord.class;
    }

    /**
     * The column <code>public.film_in_stock.p_film_count</code>.
     */
    public final TableField<FilmInStockRecord, Integer> P_FILM_COUNT = createField(DSL.name("p_film_count"), SQLDataType.INTEGER, this, "");

    private FilmInStock(Name alias, Table<FilmInStockRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.BIGINT),
            DSL.val(null, SQLDataType.BIGINT)
        });
    }

    private FilmInStock(Name alias, Table<FilmInStockRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>public.film_in_stock</code> table reference
     */
    public FilmInStock(String alias) {
        this(DSL.name(alias), FILM_IN_STOCK);
    }

    /**
     * Create an aliased <code>public.film_in_stock</code> table reference
     */
    public FilmInStock(Name alias) {
        this(alias, FILM_IN_STOCK);
    }

    /**
     * Create a <code>public.film_in_stock</code> table reference
     */
    public FilmInStock() {
        this(DSL.name("film_in_stock"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public FilmInStock as(String alias) {
        return new FilmInStock(DSL.name(alias), this, parameters);
    }

    @Override
    public FilmInStock as(Name alias) {
        return new FilmInStock(alias, this, parameters);
    }

    @Override
    public FilmInStock as(Table<?> alias) {
        return new FilmInStock(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmInStock rename(String name) {
        return new FilmInStock(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmInStock rename(Name name) {
        return new FilmInStock(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmInStock rename(Table<?> name) {
        return new FilmInStock(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public FilmInStock call(
          Long pFilmId
        , Long pStoreId
    ) {
        FilmInStock result = new FilmInStock(DSL.name("film_in_stock"), null, new Field[] {
            DSL.val(pFilmId, SQLDataType.BIGINT),
            DSL.val(pStoreId, SQLDataType.BIGINT)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public FilmInStock call(
          Field<Long> pFilmId
        , Field<Long> pStoreId
    ) {
        FilmInStock result = new FilmInStock(DSL.name("film_in_stock"), null, new Field[] {
            pFilmId,
            pStoreId
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function1<? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function1<? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
