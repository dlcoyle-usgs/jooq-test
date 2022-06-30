/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db;


import java.math.BigDecimal;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.demo.kotlin.db.tables.Actor;
import org.jooq.demo.kotlin.db.tables.ActorInfo;
import org.jooq.demo.kotlin.db.tables.Address;
import org.jooq.demo.kotlin.db.tables.Category;
import org.jooq.demo.kotlin.db.tables.City;
import org.jooq.demo.kotlin.db.tables.Country;
import org.jooq.demo.kotlin.db.tables.Customer;
import org.jooq.demo.kotlin.db.tables.CustomerList;
import org.jooq.demo.kotlin.db.tables.Film;
import org.jooq.demo.kotlin.db.tables.FilmActor;
import org.jooq.demo.kotlin.db.tables.FilmCategory;
import org.jooq.demo.kotlin.db.tables.FilmInStock;
import org.jooq.demo.kotlin.db.tables.FilmList;
import org.jooq.demo.kotlin.db.tables.FilmNotInStock;
import org.jooq.demo.kotlin.db.tables.Inventory;
import org.jooq.demo.kotlin.db.tables.Language;
import org.jooq.demo.kotlin.db.tables.NicerButSlowerFilmList;
import org.jooq.demo.kotlin.db.tables.Payment;
import org.jooq.demo.kotlin.db.tables.PaymentP2007_01;
import org.jooq.demo.kotlin.db.tables.PaymentP2007_02;
import org.jooq.demo.kotlin.db.tables.PaymentP2007_03;
import org.jooq.demo.kotlin.db.tables.PaymentP2007_04;
import org.jooq.demo.kotlin.db.tables.PaymentP2007_05;
import org.jooq.demo.kotlin.db.tables.PaymentP2007_06;
import org.jooq.demo.kotlin.db.tables.Rental;
import org.jooq.demo.kotlin.db.tables.RewardsReport;
import org.jooq.demo.kotlin.db.tables.SalesByFilmCategory;
import org.jooq.demo.kotlin.db.tables.SalesByStore;
import org.jooq.demo.kotlin.db.tables.Staff;
import org.jooq.demo.kotlin.db.tables.StaffList;
import org.jooq.demo.kotlin.db.tables.Store;
import org.jooq.demo.kotlin.db.tables.records.FilmInStockRecord;
import org.jooq.demo.kotlin.db.tables.records.FilmNotInStockRecord;
import org.jooq.demo.kotlin.db.tables.records.RewardsReportRecord;


/**
 * Convenience access to all tables in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.actor</code>.
     */
    public static final Actor ACTOR = Actor.ACTOR;

    /**
     * The table <code>public.actor_info</code>.
     */
    public static final ActorInfo ACTOR_INFO = ActorInfo.ACTOR_INFO;

    /**
     * The table <code>public.address</code>.
     */
    public static final Address ADDRESS = Address.ADDRESS;

    /**
     * The table <code>public.category</code>.
     */
    public static final Category CATEGORY = Category.CATEGORY;

    /**
     * The table <code>public.city</code>.
     */
    public static final City CITY = City.CITY;

    /**
     * The table <code>public.country</code>.
     */
    public static final Country COUNTRY = Country.COUNTRY;

    /**
     * The table <code>public.customer</code>.
     */
    public static final Customer CUSTOMER = Customer.CUSTOMER;

    /**
     * The table <code>public.customer_list</code>.
     */
    public static final CustomerList CUSTOMER_LIST = CustomerList.CUSTOMER_LIST;

    /**
     * The table <code>public.film</code>.
     */
    public static final Film FILM = Film.FILM;

    /**
     * The table <code>public.film_actor</code>.
     */
    public static final FilmActor FILM_ACTOR = FilmActor.FILM_ACTOR;

    /**
     * The table <code>public.film_category</code>.
     */
    public static final FilmCategory FILM_CATEGORY = FilmCategory.FILM_CATEGORY;

    /**
     * The table <code>public.film_in_stock</code>.
     */
    public static final FilmInStock FILM_IN_STOCK = FilmInStock.FILM_IN_STOCK;

    /**
     * Call <code>public.film_in_stock</code>.
     */
    public static Result<FilmInStockRecord> FILM_IN_STOCK(
          Configuration configuration
        , Long pFilmId
        , Long pStoreId
    ) {
        return configuration.dsl().selectFrom(org.jooq.demo.kotlin.db.tables.FilmInStock.FILM_IN_STOCK.call(
              pFilmId
            , pStoreId
        )).fetch();
    }

    /**
     * Get <code>public.film_in_stock</code> as a table.
     */
    public static FilmInStock FILM_IN_STOCK(
          Long pFilmId
        , Long pStoreId
    ) {
        return org.jooq.demo.kotlin.db.tables.FilmInStock.FILM_IN_STOCK.call(
            pFilmId,
            pStoreId
        );
    }

    /**
     * Get <code>public.film_in_stock</code> as a table.
     */
    public static FilmInStock FILM_IN_STOCK(
          Field<Long> pFilmId
        , Field<Long> pStoreId
    ) {
        return org.jooq.demo.kotlin.db.tables.FilmInStock.FILM_IN_STOCK.call(
            pFilmId,
            pStoreId
        );
    }

    /**
     * The table <code>public.film_list</code>.
     */
    public static final FilmList FILM_LIST = FilmList.FILM_LIST;

    /**
     * The table <code>public.film_not_in_stock</code>.
     */
    public static final FilmNotInStock FILM_NOT_IN_STOCK = FilmNotInStock.FILM_NOT_IN_STOCK;

    /**
     * Call <code>public.film_not_in_stock</code>.
     */
    public static Result<FilmNotInStockRecord> FILM_NOT_IN_STOCK(
          Configuration configuration
        , Long pFilmId
        , Long pStoreId
    ) {
        return configuration.dsl().selectFrom(org.jooq.demo.kotlin.db.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(
              pFilmId
            , pStoreId
        )).fetch();
    }

    /**
     * Get <code>public.film_not_in_stock</code> as a table.
     */
    public static FilmNotInStock FILM_NOT_IN_STOCK(
          Long pFilmId
        , Long pStoreId
    ) {
        return org.jooq.demo.kotlin.db.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(
            pFilmId,
            pStoreId
        );
    }

    /**
     * Get <code>public.film_not_in_stock</code> as a table.
     */
    public static FilmNotInStock FILM_NOT_IN_STOCK(
          Field<Long> pFilmId
        , Field<Long> pStoreId
    ) {
        return org.jooq.demo.kotlin.db.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(
            pFilmId,
            pStoreId
        );
    }

    /**
     * The table <code>public.inventory</code>.
     */
    public static final Inventory INVENTORY = Inventory.INVENTORY;

    /**
     * The table <code>public.language</code>.
     */
    public static final Language LANGUAGE = Language.LANGUAGE;

    /**
     * The table <code>public.nicer_but_slower_film_list</code>.
     */
    public static final NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST;

    /**
     * The table <code>public.payment</code>.
     */
    public static final Payment PAYMENT = Payment.PAYMENT;

    /**
     * The table <code>public.payment_p2007_01</code>.
     */
    public static final PaymentP2007_01 PAYMENT_P2007_01 = PaymentP2007_01.PAYMENT_P2007_01;

    /**
     * The table <code>public.payment_p2007_02</code>.
     */
    public static final PaymentP2007_02 PAYMENT_P2007_02 = PaymentP2007_02.PAYMENT_P2007_02;

    /**
     * The table <code>public.payment_p2007_03</code>.
     */
    public static final PaymentP2007_03 PAYMENT_P2007_03 = PaymentP2007_03.PAYMENT_P2007_03;

    /**
     * The table <code>public.payment_p2007_04</code>.
     */
    public static final PaymentP2007_04 PAYMENT_P2007_04 = PaymentP2007_04.PAYMENT_P2007_04;

    /**
     * The table <code>public.payment_p2007_05</code>.
     */
    public static final PaymentP2007_05 PAYMENT_P2007_05 = PaymentP2007_05.PAYMENT_P2007_05;

    /**
     * The table <code>public.payment_p2007_06</code>.
     */
    public static final PaymentP2007_06 PAYMENT_P2007_06 = PaymentP2007_06.PAYMENT_P2007_06;

    /**
     * The table <code>public.rental</code>.
     */
    public static final Rental RENTAL = Rental.RENTAL;

    /**
     * The table <code>public.rewards_report</code>.
     */
    public static final RewardsReport REWARDS_REPORT = RewardsReport.REWARDS_REPORT;

    /**
     * Call <code>public.rewards_report</code>.
     */
    public static Result<RewardsReportRecord> REWARDS_REPORT(
          Configuration configuration
        , Integer minMonthlyPurchases
        , BigDecimal minDollarAmountPurchased
    ) {
        return configuration.dsl().selectFrom(org.jooq.demo.kotlin.db.tables.RewardsReport.REWARDS_REPORT.call(
              minMonthlyPurchases
            , minDollarAmountPurchased
        )).fetch();
    }

    /**
     * Get <code>public.rewards_report</code> as a table.
     */
    public static RewardsReport REWARDS_REPORT(
          Integer minMonthlyPurchases
        , BigDecimal minDollarAmountPurchased
    ) {
        return org.jooq.demo.kotlin.db.tables.RewardsReport.REWARDS_REPORT.call(
            minMonthlyPurchases,
            minDollarAmountPurchased
        );
    }

    /**
     * Get <code>public.rewards_report</code> as a table.
     */
    public static RewardsReport REWARDS_REPORT(
          Field<Integer> minMonthlyPurchases
        , Field<BigDecimal> minDollarAmountPurchased
    ) {
        return org.jooq.demo.kotlin.db.tables.RewardsReport.REWARDS_REPORT.call(
            minMonthlyPurchases,
            minDollarAmountPurchased
        );
    }

    /**
     * The table <code>public.sales_by_film_category</code>.
     */
    public static final SalesByFilmCategory SALES_BY_FILM_CATEGORY = SalesByFilmCategory.SALES_BY_FILM_CATEGORY;

    /**
     * The table <code>public.sales_by_store</code>.
     */
    public static final SalesByStore SALES_BY_STORE = SalesByStore.SALES_BY_STORE;

    /**
     * The table <code>public.staff</code>.
     */
    public static final Staff STAFF = Staff.STAFF;

    /**
     * The table <code>public.staff_list</code>.
     */
    public static final StaffList STAFF_LIST = StaffList.STAFF_LIST;

    /**
     * The table <code>public.store</code>.
     */
    public static final Store STORE = Store.STORE;
}
