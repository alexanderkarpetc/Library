package javaclasses.library.c.inventory.event;

import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.InventoryItemId;

public class InventoryDecreased {
    private final InventoryItemId inventoryItemId;
    private final InventoryId inventoryId;

    public InventoryDecreased(InventoryItemId inventoryItemId, InventoryId inventoryId) {
        this.inventoryItemId = inventoryItemId;
        this.inventoryId = inventoryId;

    }

    public InventoryItemId getInventoryItemId() {
        return inventoryItemId;
    }

    public InventoryId getInventoryId() {
        return inventoryId;
    }
}
