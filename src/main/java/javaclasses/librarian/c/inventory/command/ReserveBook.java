package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;

public class ReserveBook {

    private final InventoryId inventoryId;
    private final UserId userId;

    public ReserveBook(InventoryId inventoryId, UserId userId) {
        this.inventoryId = inventoryId;
        this.userId = userId;
    }
}
