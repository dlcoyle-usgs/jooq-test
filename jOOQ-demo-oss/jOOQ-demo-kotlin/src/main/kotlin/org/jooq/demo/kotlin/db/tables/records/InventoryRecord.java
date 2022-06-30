/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.demo.kotlin.db.tables.Inventory;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InventoryRecord extends UpdatableRecordImpl<InventoryRecord> implements Record4<Long, Long, Long, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.inventory.inventory_id</code>.
     */
    public void setInventoryId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.inventory.inventory_id</code>.
     */
    public Long getInventoryId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.inventory.film_id</code>.
     */
    public void setFilmId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.inventory.film_id</code>.
     */
    public Long getFilmId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.inventory.store_id</code>.
     */
    public void setStoreId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.inventory.store_id</code>.
     */
    public Long getStoreId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.inventory.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.inventory.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, Long, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, Long, Long, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Inventory.INVENTORY.INVENTORY_ID;
    }

    @Override
    public Field<Long> field2() {
        return Inventory.INVENTORY.FILM_ID;
    }

    @Override
    public Field<Long> field3() {
        return Inventory.INVENTORY.STORE_ID;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Inventory.INVENTORY.LAST_UPDATE;
    }

    @Override
    public Long component1() {
        return getInventoryId();
    }

    @Override
    public Long component2() {
        return getFilmId();
    }

    @Override
    public Long component3() {
        return getStoreId();
    }

    @Override
    public LocalDateTime component4() {
        return getLastUpdate();
    }

    @Override
    public Long value1() {
        return getInventoryId();
    }

    @Override
    public Long value2() {
        return getFilmId();
    }

    @Override
    public Long value3() {
        return getStoreId();
    }

    @Override
    public LocalDateTime value4() {
        return getLastUpdate();
    }

    @Override
    public InventoryRecord value1(Long value) {
        setInventoryId(value);
        return this;
    }

    @Override
    public InventoryRecord value2(Long value) {
        setFilmId(value);
        return this;
    }

    @Override
    public InventoryRecord value3(Long value) {
        setStoreId(value);
        return this;
    }

    @Override
    public InventoryRecord value4(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public InventoryRecord values(Long value1, Long value2, Long value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InventoryRecord
     */
    public InventoryRecord() {
        super(Inventory.INVENTORY);
    }

    /**
     * Create a detached, initialised InventoryRecord
     */
    public InventoryRecord(Long inventoryId, Long filmId, Long storeId, LocalDateTime lastUpdate) {
        super(Inventory.INVENTORY);

        setInventoryId(inventoryId);
        setFilmId(filmId);
        setStoreId(storeId);
        setLastUpdate(lastUpdate);
    }

    /**
     * Create a detached, initialised InventoryRecord
     */
    public InventoryRecord(org.jooq.demo.kotlin.db.tables.pojos.Inventory value) {
        super(Inventory.INVENTORY);

        if (value != null) {
            setInventoryId(value.getInventoryId());
            setFilmId(value.getFilmId());
            setStoreId(value.getStoreId());
            setLastUpdate(value.getLastUpdate());
        }
    }
}
