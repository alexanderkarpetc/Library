package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryItemId;

public class BorrowBook {

    private final InventoryItemId inventoryItemId;
    private final UserId userId;

    public BorrowBook(InventoryItemId inventoryItemId, UserId userId) {
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
    }
}
