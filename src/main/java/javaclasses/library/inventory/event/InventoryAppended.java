package javaclasses.library.inventory.event;

import javaclasses.library.inventory.InventoryId;
import javaclasses.library.inventory.InventoryItemId;

public class InventoryAppended {
    private final InventoryItemId inventoryItemId;
    private final InventoryId inventoryId;

    public InventoryAppended(InventoryItemId inventoryItemId, InventoryId inventoryId) {
        this.inventoryItemId = inventoryItemId;
        this.inventoryId = inventoryId;
    }

    public InventoryId getInventoryId() {
        return inventoryId;
    }

    public InventoryItemId getInventoryItemId() {
        return inventoryItemId;
    }
}
