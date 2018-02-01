package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

import java.util.Date;

public class ReservationCanceled {

    private final InventoryId inventoryId;
    private final UserId whoCanceled;
    private final Date whenCanceled;

    public ReservationCanceled(InventoryId inventoryId, UserId whoCanceled, Date whenCanceled) {
        this.inventoryId = inventoryId;
        this.whoCanceled = whoCanceled;
        this.whenCanceled = whenCanceled;
    }
}
