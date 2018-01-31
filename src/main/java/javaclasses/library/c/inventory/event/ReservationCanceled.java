package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

import java.util.Date;

public class ReservationCanceled {

    private final InventoryId inventoryId;
    private final UserId userId;
    private final Date cancelationDate;

    public ReservationCanceled(InventoryId inventoryId, UserId userId, Date cancelationDate) {
        this.inventoryId = inventoryId;
        this.userId = userId;
        this.cancelationDate = cancelationDate;
    }
}
