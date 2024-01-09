/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables


import java.time.LocalDateTime

import kotlin.collections.Collection

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
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
import org.jooq.UniqueKey
import org.jooq.demo.kotlin.db.Public
import org.jooq.demo.kotlin.db.keys.CITY__CITY_COUNTRY_ID_FKEY
import org.jooq.demo.kotlin.db.keys.COUNTRY_PKEY
import org.jooq.demo.kotlin.db.tables.City.CityPath
import org.jooq.demo.kotlin.db.tables.records.CountryRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Country(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, CountryRecord>?,
    parentPath: InverseForeignKey<out Record, CountryRecord>?,
    aliased: Table<CountryRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<CountryRecord>(
    alias,
    Public.PUBLIC,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>public.country</code>
         */
        val COUNTRY: Country = Country()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CountryRecord> = CountryRecord::class.java

    /**
     * The column <code>public.country.country_id</code>.
     */
    val COUNTRY_ID: TableField<CountryRecord, Long?> = createField(DSL.name("country_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.country.country</code>.
     */
    val COUNTRY_: TableField<CountryRecord, String?> = createField(DSL.name("country"), SQLDataType.VARCHAR(50).nullable(false), this, "")

    /**
     * The column <code>public.country.last_update</code>.
     */
    val LAST_UPDATE: TableField<CountryRecord, LocalDateTime?> = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).readonly(true).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<CountryRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<CountryRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<CountryRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.country</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.country</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.country</code> table reference
     */
    constructor(): this(DSL.name("country"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, CountryRecord>?, parentPath: InverseForeignKey<out Record, CountryRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, COUNTRY, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class CountryPath : Country, Path<CountryRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, CountryRecord>?, parentPath: InverseForeignKey<out Record, CountryRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<CountryRecord>): super(alias, aliased)
        override fun `as`(alias: String): CountryPath = CountryPath(DSL.name(alias), this)
        override fun `as`(alias: Name): CountryPath = CountryPath(alias, this)
        override fun `as`(alias: Table<*>): CountryPath = CountryPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<CountryRecord, Long?> = super.getIdentity() as Identity<CountryRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<CountryRecord> = COUNTRY_PKEY

    private lateinit var _city: CityPath

    /**
     * Get the implicit to-many join path to the <code>public.city</code> table
     */
    fun city(): CityPath {
        if (!this::_city.isInitialized)
            _city = CityPath(this, null, CITY__CITY_COUNTRY_ID_FKEY.inverseKey)

        return _city;
    }

    val city: CityPath
        get(): CityPath = city()
    override fun `as`(alias: String): Country = Country(DSL.name(alias), this)
    override fun `as`(alias: Name): Country = Country(alias, this)
    override fun `as`(alias: Table<*>): Country = Country(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Country = Country(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Country = Country(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Country = Country(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Country = Country(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Country = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Country = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Country = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Country = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Country = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Country = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Country = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Country = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Country = where(DSL.notExists(select))
}
