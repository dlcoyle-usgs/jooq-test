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
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long countryId;
    private String country;
    private LocalDateTime lastUpdate;

    public Country() {}

    public Country(Country value) {
        this.countryId = value.countryId;
        this.country = value.country;
        this.lastUpdate = value.lastUpdate;
    }

    public Country(
        Long countryId,
        String country,
        LocalDateTime lastUpdate
    ) {
        this.countryId = countryId;
        this.country = country;
        this.lastUpdate = lastUpdate;
    }

    /**
     * Getter for <code>public.country.country_id</code>.
     */
    public Long getCountryId() {
        return this.countryId;
    }

    /**
     * Setter for <code>public.country.country_id</code>.
     */
    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    /**
     * Getter for <code>public.country.country</code>.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for <code>public.country.country</code>.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for <code>public.country.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>public.country.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
