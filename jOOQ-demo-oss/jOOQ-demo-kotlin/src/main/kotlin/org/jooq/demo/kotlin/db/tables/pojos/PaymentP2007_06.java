/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaymentP2007_06 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long paymentId;
    private Long customerId;
    private Long staffId;
    private Long rentalId;
    private BigDecimal amount;
    private LocalDateTime paymentDate;

    public PaymentP2007_06() {}

    public PaymentP2007_06(PaymentP2007_06 value) {
        this.paymentId = value.paymentId;
        this.customerId = value.customerId;
        this.staffId = value.staffId;
        this.rentalId = value.rentalId;
        this.amount = value.amount;
        this.paymentDate = value.paymentDate;
    }

    public PaymentP2007_06(
        Long paymentId,
        Long customerId,
        Long staffId,
        Long rentalId,
        BigDecimal amount,
        LocalDateTime paymentDate
    ) {
        this.paymentId = paymentId;
        this.customerId = customerId;
        this.staffId = staffId;
        this.rentalId = rentalId;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    /**
     * Getter for <code>public.payment_p2007_06.payment_id</code>.
     */
    public Long getPaymentId() {
        return this.paymentId;
    }

    /**
     * Setter for <code>public.payment_p2007_06.payment_id</code>.
     */
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * Getter for <code>public.payment_p2007_06.customer_id</code>.
     */
    public Long getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>public.payment_p2007_06.customer_id</code>.
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for <code>public.payment_p2007_06.staff_id</code>.
     */
    public Long getStaffId() {
        return this.staffId;
    }

    /**
     * Setter for <code>public.payment_p2007_06.staff_id</code>.
     */
    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    /**
     * Getter for <code>public.payment_p2007_06.rental_id</code>.
     */
    public Long getRentalId() {
        return this.rentalId;
    }

    /**
     * Setter for <code>public.payment_p2007_06.rental_id</code>.
     */
    public void setRentalId(Long rentalId) {
        this.rentalId = rentalId;
    }

    /**
     * Getter for <code>public.payment_p2007_06.amount</code>.
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>public.payment_p2007_06.amount</code>.
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Getter for <code>public.payment_p2007_06.payment_date</code>.
     */
    public LocalDateTime getPaymentDate() {
        return this.paymentDate;
    }

    /**
     * Setter for <code>public.payment_p2007_06.payment_date</code>.
     */
    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
}
