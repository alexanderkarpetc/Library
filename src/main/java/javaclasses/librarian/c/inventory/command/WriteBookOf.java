package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.inventory.InventoryItemId;
import javaclasses.librarian.c.inventory.WriteBookOffReason;

public class WriteBookOf {

    private final InventoryItemId inventoryItemId;
    private final WriteBookOffReason reason;

    public WriteBookOf(InventoryItemId inventoryItemId, WriteBookOffReason reason) {
        this.inventoryItemId = inventoryItemId;
        this.reason = reason;
    }
}
