/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.demo.kotlin.db.tables.PaymentP2007_01;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaymentP2007_01Record extends TableRecordImpl<PaymentP2007_01Record> implements Record6<Long, Long, Long, Long, BigDecimal, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.payment_p2007_01.payment_id</code>.
     */
    public void setPaymentId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.payment_p2007_01.payment_id</code>.
     */
    public Long getPaymentId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.payment_p2007_01.customer_id</code>.
     */
    public void setCustomerId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.payment_p2007_01.customer_id</code>.
     */
    public Long getCustomerId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.payment_p2007_01.staff_id</code>.
     */
    public void setStaffId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.payment_p2007_01.staff_id</code>.
     */
    public Long getStaffId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.payment_p2007_01.rental_id</code>.
     */
    public void setRentalId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.payment_p2007_01.rental_id</code>.
     */
    public Long getRentalId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.payment_p2007_01.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.payment_p2007_01.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.payment_p2007_01.payment_date</code>.
     */
    public void setPaymentDate(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.payment_p2007_01.payment_date</code>.
     */
    public LocalDateTime getPaymentDate() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, Long, Long, BigDecimal, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, Long, Long, Long, BigDecimal, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PaymentP2007_01.PAYMENT_P2007_01.PAYMENT_ID;
    }

    @Override
    public Field<Long> field2() {
        return PaymentP2007_01.PAYMENT_P2007_01.CUSTOMER_ID;
    }

    @Override
    public Field<Long> field3() {
        return PaymentP2007_01.PAYMENT_P2007_01.STAFF_ID;
    }

    @Override
    public Field<Long> field4() {
        return PaymentP2007_01.PAYMENT_P2007_01.RENTAL_ID;
    }

    @Override
    public Field<BigDecimal> field5() {
        return PaymentP2007_01.PAYMENT_P2007_01.AMOUNT;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return PaymentP2007_01.PAYMENT_P2007_01.PAYMENT_DATE;
    }

    @Override
    public Long component1() {
        return getPaymentId();
    }

    @Override
    public Long component2() {
        return getCustomerId();
    }

    @Override
    public Long component3() {
        return getStaffId();
    }

    @Override
    public Long component4() {
        return getRentalId();
    }

    @Override
    public BigDecimal component5() {
        return getAmount();
    }

    @Override
    public LocalDateTime component6() {
        return getPaymentDate();
    }

    @Override
    public Long value1() {
        return getPaymentId();
    }

    @Override
    public Long value2() {
        return getCustomerId();
    }

    @Override
    public Long value3() {
        return getStaffId();
    }

    @Override
    public Long value4() {
        return getRentalId();
    }

    @Override
    public BigDecimal value5() {
        return getAmount();
    }

    @Override
    public LocalDateTime value6() {
        return getPaymentDate();
    }

    @Override
    public PaymentP2007_01Record value1(Long value) {
        setPaymentId(value);
        return this;
    }

    @Override
    public PaymentP2007_01Record value2(Long value) {
        setCustomerId(value);
        return this;
    }

    @Override
    public PaymentP2007_01Record value3(Long value) {
        setStaffId(value);
        return this;
    }

    @Override
    public PaymentP2007_01Record value4(Long value) {
        setRentalId(value);
        return this;
    }

    @Override
    public PaymentP2007_01Record value5(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public PaymentP2007_01Record value6(LocalDateTime value) {
        setPaymentDate(value);
        return this;
    }

    @Override
    public PaymentP2007_01Record values(Long value1, Long value2, Long value3, Long value4, BigDecimal value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentP2007_01Record
     */
    public PaymentP2007_01Record() {
        super(PaymentP2007_01.PAYMENT_P2007_01);
    }

    /**
     * Create a detached, initialised PaymentP2007_01Record
     */
    public PaymentP2007_01Record(Long paymentId, Long customerId, Long staffId, Long rentalId, BigDecimal amount, LocalDateTime paymentDate) {
        super(PaymentP2007_01.PAYMENT_P2007_01);

        setPaymentId(paymentId);
        setCustomerId(customerId);
        setStaffId(staffId);
        setRentalId(rentalId);
        setAmount(amount);
        setPaymentDate(paymentDate);
    }

    /**
     * Create a detached, initialised PaymentP2007_01Record
     */
    public PaymentP2007_01Record(org.jooq.demo.kotlin.db.tables.pojos.PaymentP2007_01 value) {
        super(PaymentP2007_01.PAYMENT_P2007_01);

        if (value != null) {
            setPaymentId(value.getPaymentId());
            setCustomerId(value.getCustomerId());
            setStaffId(value.getStaffId());
            setRentalId(value.getRentalId());
            setAmount(value.getAmount());
            setPaymentDate(value.getPaymentDate());
        }
    }
}
