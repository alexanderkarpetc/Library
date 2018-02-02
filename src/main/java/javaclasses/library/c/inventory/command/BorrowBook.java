package javaclasses.library.c.inventory.command;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryItemId;

public class BorrowBook {

    private final InventoryItemId inventoryItemId;
    private final UserId userId;

    public BorrowBook(InventoryItemId inventoryItemId, UserId userId) {
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
    }
}
