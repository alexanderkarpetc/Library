package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;

public class CancelReservation {

    private final InventoryId inventoryId;
    private final UserId whoCanceled;

    public CancelReservation(InventoryId inventoryId, UserId whoCanceled) {
        this.inventoryId = inventoryId;
        this.whoCanceled = whoCanceled;
    }
}
