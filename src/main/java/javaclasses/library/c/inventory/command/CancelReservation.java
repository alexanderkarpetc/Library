package javaclasses.library.c.inventory.command;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

public class CancelReservation {

    private final InventoryId inventoryId;
    private final UserId whoCanceled;

    public CancelReservation(InventoryId inventoryId, UserId whoCanceled) {
        this.inventoryId = inventoryId;
        this.whoCanceled = whoCanceled;
    }
}
