/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables


import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.function.Function

import kotlin.collections.List

import org.jooq.Check
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row6
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableLike
import org.jooq.TableOptions
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.indexes.IDX_FK_PAYMENT_P2007_02_CUSTOMER_ID
import org.jooq.demo.kotlin.db.indexes.IDX_FK_PAYMENT_P2007_02_STAFF_ID
import org.jooq.demo.kotlin.db.keys.PAYMENT_P2007_02__PAYMENT_P2007_02_CUSTOMER_ID_FKEY
import org.jooq.demo.kotlin.db.keys.PAYMENT_P2007_02__PAYMENT_P2007_02_RENTAL_ID_FKEY
import org.jooq.demo.kotlin.db.keys.PAYMENT_P2007_02__PAYMENT_P2007_02_STAFF_ID_FKEY
import org.jooq.demo.kotlin.db.tables.records.CustomerRecord
import org.jooq.demo.kotlin.db.tables.records.PaymentP2007_02Record
import org.jooq.demo.kotlin.db.tables.records.RentalRecord
import org.jooq.demo.kotlin.db.tables.records.StaffRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PaymentP2007_02(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, PaymentP2007_02Record>?,
    aliased: Table<PaymentP2007_02Record>?,
    parameters: Array<Field<*>?>?
): TableImpl<PaymentP2007_02Record>(
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
         * The reference instance of <code>public.payment_p2007_02</code>
         */
        val PAYMENT_P2007_02: PaymentP2007_02 = PaymentP2007_02()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<PaymentP2007_02Record> = PaymentP2007_02Record::class.java

    /**
     * The column <code>public.payment_p2007_02.payment_id</code>.
     */
    val PAYMENT_ID: TableField<PaymentP2007_02Record, Long?> = createField(DSL.name("payment_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.payment_p2007_02.customer_id</code>.
     */
    val CUSTOMER_ID: TableField<PaymentP2007_02Record, Long?> = createField(DSL.name("customer_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.payment_p2007_02.staff_id</code>.
     */
    val STAFF_ID: TableField<PaymentP2007_02Record, Long?> = createField(DSL.name("staff_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.payment_p2007_02.rental_id</code>.
     */
    val RENTAL_ID: TableField<PaymentP2007_02Record, Long?> = createField(DSL.name("rental_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.payment_p2007_02.amount</code>.
     */
    val AMOUNT: TableField<PaymentP2007_02Record, BigDecimal?> = createField(DSL.name("amount"), SQLDataType.NUMERIC(5, 2).nullable(false), this, "")

    /**
     * The column <code>public.payment_p2007_02.payment_date</code>.
     */
    val PAYMENT_DATE: TableField<PaymentP2007_02Record, LocalDateTime?> = createField(DSL.name("payment_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<PaymentP2007_02Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<PaymentP2007_02Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.payment_p2007_02</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.payment_p2007_02</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.payment_p2007_02</code> table reference
     */
    constructor(): this(DSL.name("payment_p2007_02"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, PaymentP2007_02Record>): this(Internal.createPathAlias(child, key), child, key, PAYMENT_P2007_02, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIndexes(): List<Index> = listOf(IDX_FK_PAYMENT_P2007_02_CUSTOMER_ID, IDX_FK_PAYMENT_P2007_02_STAFF_ID)
    override fun getIdentity(): Identity<PaymentP2007_02Record, Long?> = super.getIdentity() as Identity<PaymentP2007_02Record, Long?>
    override fun getReferences(): List<ForeignKey<PaymentP2007_02Record, *>> = listOf(PAYMENT_P2007_02__PAYMENT_P2007_02_CUSTOMER_ID_FKEY, PAYMENT_P2007_02__PAYMENT_P2007_02_STAFF_ID_FKEY, PAYMENT_P2007_02__PAYMENT_P2007_02_RENTAL_ID_FKEY)

    private lateinit var _customer: Customer
    private lateinit var _staff: Staff
    private lateinit var _rental: Rental

    /**
     * Get the implicit join path to the <code>public.customer</code> table.
     */
    fun customer(): Customer {
        if (!this::_customer.isInitialized)
            _customer = Customer(this, PAYMENT_P2007_02__PAYMENT_P2007_02_CUSTOMER_ID_FKEY)

        return _customer;
    }

    val customer: Customer
        get(): Customer = customer()

    /**
     * Get the implicit join path to the <code>public.staff</code> table.
     */
    fun staff(): Staff {
        if (!this::_staff.isInitialized)
            _staff = Staff(this, PAYMENT_P2007_02__PAYMENT_P2007_02_STAFF_ID_FKEY)

        return _staff;
    }

    val staff: Staff
        get(): Staff = staff()

    /**
     * Get the implicit join path to the <code>public.rental</code> table.
     */
    fun rental(): Rental {
        if (!this::_rental.isInitialized)
            _rental = Rental(this, PAYMENT_P2007_02__PAYMENT_P2007_02_RENTAL_ID_FKEY)

        return _rental;
    }

    val rental: Rental
        get(): Rental = rental()

    /**
     * A convenience constructor for correlated <code>ROW</code>s expressions to
     * the <code>public.payment_p2007_02</code> to-one parent table.
     */
    fun customerRow(): Field<CustomerRecord> = customerRow { it }

    /**
     * A convenience constructor for correlated <code>ROW</code>s expressions to
     * the <code>public.payment_p2007_02</code> to-one parent table.
     */
    fun <O : Record> customerRow(subquery: (Customer) -> TableLike<O>): Field<O> = toOneRow(PAYMENT_P2007_02__PAYMENT_P2007_02_CUSTOMER_ID_FKEY, { subquery(it as Customer) })

    /**
     * A convenience constructor for correlated <code>ROW</code>s expressions to
     * the <code>public.payment_p2007_02</code> to-one parent table.
     */
    fun staffRow(): Field<StaffRecord> = staffRow { it }

    /**
     * A convenience constructor for correlated <code>ROW</code>s expressions to
     * the <code>public.payment_p2007_02</code> to-one parent table.
     */
    fun <O : Record> staffRow(subquery: (Staff) -> TableLike<O>): Field<O> = toOneRow(PAYMENT_P2007_02__PAYMENT_P2007_02_STAFF_ID_FKEY, { subquery(it as Staff) })

    /**
     * A convenience constructor for correlated <code>ROW</code>s expressions to
     * the <code>public.payment_p2007_02</code> to-one parent table.
     */
    fun rentalRow(): Field<RentalRecord> = rentalRow { it }

    /**
     * A convenience constructor for correlated <code>ROW</code>s expressions to
     * the <code>public.payment_p2007_02</code> to-one parent table.
     */
    fun <O : Record> rentalRow(subquery: (Rental) -> TableLike<O>): Field<O> = toOneRow(PAYMENT_P2007_02__PAYMENT_P2007_02_RENTAL_ID_FKEY, { subquery(it as Rental) })
    override fun getChecks(): List<Check<PaymentP2007_02Record>> = listOf(
        Internal.createCheck(this, DSL.name("payment_p2007_02_payment_date_check"), "(((payment_date >= '2007-02-01 00:00:00'::timestamp without time zone) AND (payment_date < '2007-03-01 00:00:00'::timestamp without time zone)))", true)
    )
    override fun `as`(alias: String): PaymentP2007_02 = PaymentP2007_02(DSL.name(alias), this)
    override fun `as`(alias: Name): PaymentP2007_02 = PaymentP2007_02(alias, this)
    override fun `as`(alias: Table<*>): PaymentP2007_02 = PaymentP2007_02(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): PaymentP2007_02 = PaymentP2007_02(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): PaymentP2007_02 = PaymentP2007_02(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): PaymentP2007_02 = PaymentP2007_02(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row6<Long?, Long?, Long?, Long?, BigDecimal?, LocalDateTime?> = super.fieldsRow() as Row6<Long?, Long?, Long?, Long?, BigDecimal?, LocalDateTime?>

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, Long?, Long?, Long?, BigDecimal?, LocalDateTime?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, Long?, Long?, Long?, BigDecimal?, LocalDateTime?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
