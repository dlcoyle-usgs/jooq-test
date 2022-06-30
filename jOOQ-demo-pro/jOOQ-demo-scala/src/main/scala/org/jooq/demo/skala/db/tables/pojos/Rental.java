/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Rental implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long rentalId;
    private LocalDateTime rentalDate;
    private Long inventoryId;
    private Long customerId;
    private LocalDateTime returnDate;
    private Long staffId;
    private LocalDateTime lastUpdate;

    public Rental() {}

    public Rental(Rental value) {
        this.rentalId = value.rentalId;
        this.rentalDate = value.rentalDate;
        this.inventoryId = value.inventoryId;
        this.customerId = value.customerId;
        this.returnDate = value.returnDate;
        this.staffId = value.staffId;
        this.lastUpdate = value.lastUpdate;
    }

    public Rental(
        Long rentalId,
        LocalDateTime rentalDate,
        Long inventoryId,
        Long customerId,
        LocalDateTime returnDate,
        Long staffId,
        LocalDateTime lastUpdate
    ) {
        this.rentalId = rentalId;
        this.rentalDate = rentalDate;
        this.inventoryId = inventoryId;
        this.customerId = customerId;
        this.returnDate = returnDate;
        this.staffId = staffId;
        this.lastUpdate = lastUpdate;
    }

    /**
     * Getter for <code>public.rental.rental_id</code>.
     */
    public Long getRentalId() {
        return this.rentalId;
    }

    /**
     * Setter for <code>public.rental.rental_id</code>.
     */
    public void setRentalId(Long rentalId) {
        this.rentalId = rentalId;
    }

    /**
     * Getter for <code>public.rental.rental_date</code>.
     */
    public LocalDateTime getRentalDate() {
        return this.rentalDate;
    }

    /**
     * Setter for <code>public.rental.rental_date</code>.
     */
    public void setRentalDate(LocalDateTime rentalDate) {
        this.rentalDate = rentalDate;
    }

    /**
     * Getter for <code>public.rental.inventory_id</code>.
     */
    public Long getInventoryId() {
        return this.inventoryId;
    }

    /**
     * Setter for <code>public.rental.inventory_id</code>.
     */
    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    /**
     * Getter for <code>public.rental.customer_id</code>.
     */
    public Long getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>public.rental.customer_id</code>.
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for <code>public.rental.return_date</code>.
     */
    public LocalDateTime getReturnDate() {
        return this.returnDate;
    }

    /**
     * Setter for <code>public.rental.return_date</code>.
     */
    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * Getter for <code>public.rental.staff_id</code>.
     */
    public Long getStaffId() {
        return this.staffId;
    }

    /**
     * Setter for <code>public.rental.staff_id</code>.
     */
    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    /**
     * Getter for <code>public.rental.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>public.rental.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
