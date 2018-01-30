package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

import java.util.Date;

public class ReservationCreated {

    final private InventoryId inventoryId;
    final private UserId userId;
    final private Date creationDate;
    final private Date expectedOnDate;

    public ReservationCreated(InventoryId inventoryId, UserId userId, Date creationDate, Date expectedOnDate) {
        this.inventoryId = inventoryId;
        this.userId = userId;
        this.creationDate = creationDate;
        this.expectedOnDate = expectedOnDate;
    }
}
