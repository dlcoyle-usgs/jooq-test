/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.java.db.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public record Customer(
    Long          customerId,
    Long          storeId,
    String        firstName,
    String        lastName,
    String        email,
    Long          addressId,
    Boolean       activebool,
    LocalDate     createDate,
    LocalDateTime lastUpdate,
    Long          active
) implements Serializable {

    private static final long serialVersionUID = 1L;

}
