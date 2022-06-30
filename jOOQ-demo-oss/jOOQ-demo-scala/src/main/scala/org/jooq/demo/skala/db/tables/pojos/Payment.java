/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long paymentId;
    private Long customerId;
    private Long staffId;
    private Long rentalId;
    private BigDecimal amount;
    private LocalDateTime paymentDate;

    public Payment() {}

    public Payment(Payment value) {
        this.paymentId = value.paymentId;
        this.customerId = value.customerId;
        this.staffId = value.staffId;
        this.rentalId = value.rentalId;
        this.amount = value.amount;
        this.paymentDate = value.paymentDate;
    }

    public Payment(
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
     * Getter for <code>public.payment.payment_id</code>.
     */
    public Long getPaymentId() {
        return this.paymentId;
    }

    /**
     * Setter for <code>public.payment.payment_id</code>.
     */
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * Getter for <code>public.payment.customer_id</code>.
     */
    public Long getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>public.payment.customer_id</code>.
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for <code>public.payment.staff_id</code>.
     */
    public Long getStaffId() {
        return this.staffId;
    }

    /**
     * Setter for <code>public.payment.staff_id</code>.
     */
    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    /**
     * Getter for <code>public.payment.rental_id</code>.
     */
    public Long getRentalId() {
        return this.rentalId;
    }

    /**
     * Setter for <code>public.payment.rental_id</code>.
     */
    public void setRentalId(Long rentalId) {
        this.rentalId = rentalId;
    }

    /**
     * Getter for <code>public.payment.amount</code>.
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Setter for <code>public.payment.amount</code>.
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Getter for <code>public.payment.payment_date</code>.
     */
    public LocalDateTime getPaymentDate() {
        return this.paymentDate;
    }

    /**
     * Setter for <code>public.payment.payment_date</code>.
     */
    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
}
