package javaclasses.library.c.inventory.command;

import javaclasses.library.c.inventory.InventoryItemId;
import javaclasses.library.c.inventory.WriteBookOffReason;

public class WriteBookOf {

    private final InventoryItemId inventoryItemId;
    private final WriteBookOffReason reason;

    public WriteBookOf(InventoryItemId inventoryItemId, WriteBookOffReason reason) {
        this.inventoryItemId = inventoryItemId;
        this.reason = reason;
    }
}
