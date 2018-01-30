package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

import java.util.Date;

public class ReservationCanceled {

    final private InventoryId inventoryId;
    final private UserId userId;
    final private Date cancelationDate;

    public ReservationCanceled(InventoryId inventoryId, UserId userId, Date cancelationDate) {
        this.inventoryId = inventoryId;
        this.userId = userId;
        this.cancelationDate = cancelationDate;
    }
}
