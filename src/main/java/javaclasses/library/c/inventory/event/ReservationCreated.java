package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

import java.util.Date;

public class ReservationCreated {

    private final InventoryId inventoryId;
    private final UserId userId;
    private final Date creationDate;
    private final Date expectOnDate;

    public ReservationCreated(InventoryId inventoryId, UserId userId, Date creationDate, Date expectOnDate) {
        this.inventoryId = inventoryId;
        this.userId = userId;
        this.creationDate = creationDate;
        this.expectOnDate = expectOnDate;
    }
}
