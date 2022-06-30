/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.kotlin.db.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long addressId;
    private String address;
    private String address2;
    private String district;
    private Long cityId;
    private String postalCode;
    private String phone;
    private LocalDateTime lastUpdate;

    public Address() {}

    public Address(Address value) {
        this.addressId = value.addressId;
        this.address = value.address;
        this.address2 = value.address2;
        this.district = value.district;
        this.cityId = value.cityId;
        this.postalCode = value.postalCode;
        this.phone = value.phone;
        this.lastUpdate = value.lastUpdate;
    }

    public Address(
        Long addressId,
        String address,
        String address2,
        String district,
        Long cityId,
        String postalCode,
        String phone,
        LocalDateTime lastUpdate
    ) {
        this.addressId = addressId;
        this.address = address;
        this.address2 = address2;
        this.district = district;
        this.cityId = cityId;
        this.postalCode = postalCode;
        this.phone = phone;
        this.lastUpdate = lastUpdate;
    }

    /**
     * Getter for <code>public.address.address_id</code>.
     */
    public Long getAddressId() {
        return this.addressId;
    }

    /**
     * Setter for <code>public.address.address_id</code>.
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * Getter for <code>public.address.address</code>.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Setter for <code>public.address.address</code>.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter for <code>public.address.address2</code>.
     */
    public String getAddress2() {
        return this.address2;
    }

    /**
     * Setter for <code>public.address.address2</code>.
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * Getter for <code>public.address.district</code>.
     */
    public String getDistrict() {
        return this.district;
    }

    /**
     * Setter for <code>public.address.district</code>.
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * Getter for <code>public.address.city_id</code>.
     */
    public Long getCityId() {
        return this.cityId;
    }

    /**
     * Setter for <code>public.address.city_id</code>.
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /**
     * Getter for <code>public.address.postal_code</code>.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Setter for <code>public.address.postal_code</code>.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Getter for <code>public.address.phone</code>.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for <code>public.address.phone</code>.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter for <code>public.address.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>public.address.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
