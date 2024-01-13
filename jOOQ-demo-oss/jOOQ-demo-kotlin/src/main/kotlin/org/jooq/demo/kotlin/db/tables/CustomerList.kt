/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables


import kotlin.collections.Collection

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.tables.records.CustomerListRecord
import org.jooq.impl.DSL
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CustomerList(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, CustomerListRecord>?,
    parentPath: InverseForeignKey<out Record, CustomerListRecord>?,
    aliased: Table<CustomerListRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<CustomerListRecord>(
    alias,
    Public.PUBLIC,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("""
    create view "customer_list" as  SELECT cu.customer_id AS id,
     (((cu.first_name)::text || ' '::text) || (cu.last_name)::text) AS name,
     a.address,
     a.postal_code AS "zip code",
     a.phone,
     city.city,
     country.country,
         CASE
             WHEN cu.activebool THEN 'active'::text
             ELSE ''::text
         END AS notes,
     cu.store_id AS sid
    FROM (((customer cu
      JOIN address a ON ((cu.address_id = a.address_id)))
      JOIN city ON ((a.city_id = city.city_id)))
      JOIN country ON ((city.country_id = country.country_id)));
    """),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>public.customer_list</code>
         */
        val CUSTOMER_LIST: CustomerList = CustomerList()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CustomerListRecord> = CustomerListRecord::class.java

    /**
     * The column <code>public.customer_list.id</code>.
     */
    val ID: TableField<CustomerListRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>public.customer_list.name</code>.
     */
    val NAME: TableField<CustomerListRecord, String?> = createField(DSL.name("name"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>public.customer_list.address</code>.
     */
    val ADDRESS: TableField<CustomerListRecord, String?> = createField(DSL.name("address"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.customer_list.zip code</code>.
     */
    val `ZIP CODE`: TableField<CustomerListRecord, String?> = createField(DSL.name("zip code"), SQLDataType.VARCHAR(10), this, "")

    /**
     * The column <code>public.customer_list.phone</code>.
     */
    val PHONE: TableField<CustomerListRecord, String?> = createField(DSL.name("phone"), SQLDataType.VARCHAR(20), this, "")

    /**
     * The column <code>public.customer_list.city</code>.
     */
    val CITY: TableField<CustomerListRecord, String?> = createField(DSL.name("city"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.customer_list.country</code>.
     */
    val COUNTRY: TableField<CustomerListRecord, String?> = createField(DSL.name("country"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>public.customer_list.notes</code>.
     */
    val NOTES: TableField<CustomerListRecord, String?> = createField(DSL.name("notes"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>public.customer_list.sid</code>.
     */
    val SID: TableField<CustomerListRecord, Long?> = createField(DSL.name("sid"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<CustomerListRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<CustomerListRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<CustomerListRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.customer_list</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.customer_list</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.customer_list</code> table reference
     */
    constructor(): this(DSL.name("customer_list"), null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun `as`(alias: String): CustomerList = CustomerList(DSL.name(alias), this)
    override fun `as`(alias: Name): CustomerList = CustomerList(alias, this)
    override fun `as`(alias: Table<*>): CustomerList = CustomerList(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CustomerList = CustomerList(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CustomerList = CustomerList(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CustomerList = CustomerList(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): CustomerList = CustomerList(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): CustomerList = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): CustomerList = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): CustomerList = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): CustomerList = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): CustomerList = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): CustomerList = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): CustomerList = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): CustomerList = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): CustomerList = where(DSL.notExists(select))
}
