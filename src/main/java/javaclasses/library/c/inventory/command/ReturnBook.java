package javaclasses.library.c.inventory.command;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.InventoryItemId;

public class ReturnBook {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId userId;

    public ReturnBook(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId userId) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
    }
}
