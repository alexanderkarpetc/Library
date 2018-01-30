package javaclasses.library.c;


import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

public class Reservation {

    final private InventoryItemId inventoryItemId;
    private final UserId userId;

    final private Date creationDate;
    final private Date expectedDate;

    public Reservation(InventoryItemId inventoryItemId, UserId userId, Date creationDate, Date expectedDate) {
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
        this.creationDate = creationDate;
        this.expectedDate = expectedDate;
    }
}
