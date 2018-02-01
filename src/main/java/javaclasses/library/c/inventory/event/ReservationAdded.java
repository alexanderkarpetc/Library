package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

import java.util.Date;

public class ReservationAdded {

    private final InventoryId inventoryId;
    private final UserId userId;
    private final Date creationDate;

    public ReservationAdded(InventoryId inventoryId, UserId userId, Date creationDate) {
        this.inventoryId = inventoryId;
        this.userId = userId;
        this.creationDate = creationDate;
    }
}
