package javaclasses.library.inventory.event;

import javaclasses.library.inventory.InventoryId;
import javaclasses.library.inventory.InventoryItemId;

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
