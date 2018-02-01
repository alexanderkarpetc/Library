package javaclasses.library.c.inventory;


import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

public class Reservation {

    private final InventoryItemId inventoryItemId;
    private final UserId userId;

    private final Date creationDate;
    private final Date expectedDate;

    public Reservation(InventoryItemId inventoryItemId, UserId userId, Date creationDate, Date expectedDate) {
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
        this.creationDate = creationDate;
        this.expectedDate = expectedDate;
    }
}
