/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables


import java.time.LocalDateTime
import java.util.function.Function

import kotlin.collections.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Result
import org.jooq.Row4
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableLike
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.indexes.IDX_UNQ_MANAGER_STAFF_ID
import org.jooq.demo.kotlin.db.keys.CUSTOMER__CUSTOMER_STORE_ID_FKEY
import org.jooq.demo.kotlin.db.keys.INVENTORY__INVENTORY_STORE_ID_FKEY
import org.jooq.demo.kotlin.db.keys.STAFF__STAFF_STORE_ID_FKEY
import org.jooq.demo.kotlin.db.keys.STORE_PKEY
import org.jooq.demo.kotlin.db.keys.STORE__STORE_ADDRESS_ID_FKEY
import org.jooq.demo.kotlin.db.keys.STORE__STORE_MANAGER_STAFF_ID_FKEY
import org.jooq.demo.kotlin.db.tables.records.AddressRecord
import org.jooq.demo.kotlin.db.tables.records.CustomerRecord
import org.jooq.demo.kotlin.db.tables.records.InventoryRecord
import org.jooq.demo.kotlin.db.tables.records.StaffRecord
import org.jooq.demo.kotlin.db.tables.records.StoreRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Store(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, StoreRecord>?,
    aliased: Table<StoreRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<StoreRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.store</code>
         */
        val STORE: Store = Store()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<StoreRecord> = StoreRecord::class.java

    /**
     * The column <code>public.store.store_id</code>.
     */
    val STORE_ID: TableField<StoreRecord, Long?> = createField(DSL.name("store_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.store.manager_staff_id</code>.
     */
    val MANAGER_STAFF_ID: TableField<StoreRecord, Long?> = createField(DSL.name("manager_staff_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.store.address_id</code>.
     */
    val ADDRESS_ID: TableField<StoreRecord, Long?> = createField(DSL.name("address_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.store.last_update</code>.
     */
    val LAST_UPDATE: TableField<StoreRecord, LocalDateTime?> = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<StoreRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<StoreRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.store</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.store</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.store</code> table reference
     */
    constructor(): this(DSL.name("store"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, StoreRecord>): this(Internal.createPathAlias(child, key), child, key, STORE, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIndexes(): List<Index> = listOf(IDX_UNQ_MANAGER_STAFF_ID)
    override fun getIdentity(): Identity<StoreRecord, Long?> = super.getIdentity() as Identity<StoreRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<StoreRecord> = STORE_PKEY
    override fun getReferences(): List<ForeignKey<StoreRecord, *>> = listOf(STORE__STORE_MANAGER_STAFF_ID_FKEY, STORE__STORE_ADDRESS_ID_FKEY)

    private lateinit var _staff: Staff
    private lateinit var _address: Address

    /**
     * Get the implicit join path to the <code>public.staff</code> table.
     */
    fun staff(): Staff {
        if (!this::_staff.isInitialized)
            _staff = Staff(this, STORE__STORE_MANAGER_STAFF_ID_FKEY)

        return _staff;
    }

    val staff: Staff
        get(): Staff = staff()

    /**
     * Get the implicit join path to the <code>public.address</code> table.
     */
    fun address(): Address {
        if (!this::_address.isInitialized)
            _address = Address(this, STORE__STORE_ADDRESS_ID_FKEY)

        return _address;
    }

    val address: Address
        get(): Address = address()

    /**
     * A convenience constructor for correlated <code>EXISTS</code>s expressions
     * to the <code>public.customer</code> one-to-many child table.
     */
    fun customerExists(): Condition = customerExists { it }

    /**
     * A convenience constructor for correlated <code>EXISTS</code>s expressions
     * to the <code>public.customer</code> one-to-many child table.
     */
    fun <O: Record>customerExists(subquery: (Customer) -> TableLike<O>): Condition = oneToManyExists(CUSTOMER__CUSTOMER_STORE_ID_FKEY, { subquery(it as Customer) })

    /**
     * A convenience constructor for correlated <code>EXISTS</code>s expressions
     * to the <code>public.inventory</code> one-to-many child table.
     */
    fun inventoryExists(): Condition = inventoryExists { it }

    /**
     * A convenience constructor for correlated <code>EXISTS</code>s expressions
     * to the <code>public.inventory</code> one-to-many child table.
     */
    fun <O: Record>inventoryExists(subquery: (Inventory) -> TableLike<O>): Condition = oneToManyExists(INVENTORY__INVENTORY_STORE_ID_FKEY, { subquery(it as Inventory) })

    /**
     * A convenience constructor for correlated <code>EXISTS</code>s expressions
     * to the <code>public.staff</code> one-to-many child table.
     */
    fun staffExists(): Condition = staffExists { it }

    /**
     * A convenience constructor for correlated <code>EXISTS</code>s expressions
     * to the <code>public.staff</code> one-to-many child table.
     */
    fun <O: Record>staffExists(subquery: (Staff) -> TableLike<O>): Condition = oneToManyExists(STAFF__STAFF_STORE_ID_FKEY, { subquery(it as Staff) })

    /**
     * A convenience constructor for correlated <code>ROW</code>s expressions to
     * the <code>public.store</code> to-one parent table.
     */
    fun staffRow(): Field<StaffRecord> = staffRow { it }

    /**
     * A convenience constructor for correlated <code>ROW</code>s expressions to
     * the <code>public.store</code> to-one parent table.
     */
    fun <O : Record> staffRow(subquery: (Staff) -> TableLike<O>): Field<O> = toOneRow(STORE__STORE_MANAGER_STAFF_ID_FKEY, { subquery(it as Staff) })

    /**
     * A convenience constructor for correlated <code>ROW</code>s expressions to
     * the <code>public.store</code> to-one parent table.
     */
    fun addressRow(): Field<AddressRecord> = addressRow { it }

    /**
     * A convenience constructor for correlated <code>ROW</code>s expressions to
     * the <code>public.store</code> to-one parent table.
     */
    fun <O : Record> addressRow(subquery: (Address) -> TableLike<O>): Field<O> = toOneRow(STORE__STORE_ADDRESS_ID_FKEY, { subquery(it as Address) })

    /**
     * A convenience constructor for correlated <code>MULTISET</code>s
     * expressions to the <code>public.customer</code> one-to-many child table.
     */
    fun customerMultiset(): Field<Result<CustomerRecord>> = customerMultiset { it }

    /**
     * A convenience constructor for correlated <code>MULTISET</code>s
     * expressions to the <code>public.customer</code> one-to-many child table.
     */
    fun <O: Record>customerMultiset(subquery: (Customer) -> TableLike<O>): Field<Result<O>> = oneToManyMultiset(CUSTOMER__CUSTOMER_STORE_ID_FKEY, { subquery(it as Customer) })

    /**
     * A convenience constructor for correlated <code>MULTISET</code>s
     * expressions to the <code>public.inventory</code> one-to-many child table.
     */
    fun inventoryMultiset(): Field<Result<InventoryRecord>> = inventoryMultiset { it }

    /**
     * A convenience constructor for correlated <code>MULTISET</code>s
     * expressions to the <code>public.inventory</code> one-to-many child table.
     */
    fun <O: Record>inventoryMultiset(subquery: (Inventory) -> TableLike<O>): Field<Result<O>> = oneToManyMultiset(INVENTORY__INVENTORY_STORE_ID_FKEY, { subquery(it as Inventory) })

    /**
     * A convenience constructor for correlated <code>MULTISET</code>s
     * expressions to the <code>public.staff</code> one-to-many child table.
     */
    fun staffMultiset(): Field<Result<StaffRecord>> = staffMultiset { it }

    /**
     * A convenience constructor for correlated <code>MULTISET</code>s
     * expressions to the <code>public.staff</code> one-to-many child table.
     */
    fun <O: Record>staffMultiset(subquery: (Staff) -> TableLike<O>): Field<Result<O>> = oneToManyMultiset(STAFF__STAFF_STORE_ID_FKEY, { subquery(it as Staff) })
    override fun `as`(alias: String): Store = Store(DSL.name(alias), this)
    override fun `as`(alias: Name): Store = Store(alias, this)
    override fun `as`(alias: Table<*>): Store = Store(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Store = Store(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Store = Store(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Store = Store(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row4<Long?, Long?, Long?, LocalDateTime?> = super.fieldsRow() as Row4<Long?, Long?, Long?, LocalDateTime?>

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, Long?, Long?, LocalDateTime?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, Long?, Long?, LocalDateTime?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
