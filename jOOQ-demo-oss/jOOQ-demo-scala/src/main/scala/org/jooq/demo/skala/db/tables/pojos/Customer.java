/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.skala.db.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long customerId;
    private Long storeId;
    private String firstName;
    private String lastName;
    private String email;
    private Long addressId;
    private Boolean activebool;
    private LocalDate createDate;
    private LocalDateTime lastUpdate;
    private Integer active;

    public Customer() {}

    public Customer(Customer value) {
        this.customerId = value.customerId;
        this.storeId = value.storeId;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.email = value.email;
        this.addressId = value.addressId;
        this.activebool = value.activebool;
        this.createDate = value.createDate;
        this.lastUpdate = value.lastUpdate;
        this.active = value.active;
    }

    public Customer(
        Long customerId,
        Long storeId,
        String firstName,
        String lastName,
        String email,
        Long addressId,
        Boolean activebool,
        LocalDate createDate,
        LocalDateTime lastUpdate,
        Integer active
    ) {
        this.customerId = customerId;
        this.storeId = storeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.addressId = addressId;
        this.activebool = activebool;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.active = active;
    }

    /**
     * Getter for <code>public.customer.customer_id</code>.
     */
    public Long getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>public.customer.customer_id</code>.
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for <code>public.customer.store_id</code>.
     */
    public Long getStoreId() {
        return this.storeId;
    }

    /**
     * Setter for <code>public.customer.store_id</code>.
     */
    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    /**
     * Getter for <code>public.customer.first_name</code>.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for <code>public.customer.first_name</code>.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for <code>public.customer.last_name</code>.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for <code>public.customer.last_name</code>.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for <code>public.customer.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>public.customer.email</code>.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for <code>public.customer.address_id</code>.
     */
    public Long getAddressId() {
        return this.addressId;
    }

    /**
     * Setter for <code>public.customer.address_id</code>.
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * Getter for <code>public.customer.activebool</code>.
     */
    public Boolean getActivebool() {
        return this.activebool;
    }

    /**
     * Setter for <code>public.customer.activebool</code>.
     */
    public void setActivebool(Boolean activebool) {
        this.activebool = activebool;
    }

    /**
     * Getter for <code>public.customer.create_date</code>.
     */
    public LocalDate getCreateDate() {
        return this.createDate;
    }

    /**
     * Setter for <code>public.customer.create_date</code>.
     */
    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    /**
     * Getter for <code>public.customer.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>public.customer.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * Getter for <code>public.customer.active</code>.
     */
    public Integer getActive() {
        return this.active;
    }

    /**
     * Setter for <code>public.customer.active</code>.
     */
    public void setActive(Integer active) {
        this.active = active;
    }
}
