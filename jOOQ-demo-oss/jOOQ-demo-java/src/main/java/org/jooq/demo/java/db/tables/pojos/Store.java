/*
 * This file is generated by jOOQ.
 */
package org.jooq.demo.java.db.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public record Store(
    Long storeId,
    Long managerStaffId,
    Long addressId,
    LocalDateTime lastUpdate
) implements Serializable {

    private static final long serialVersionUID = 1L;

}
