package javaclasses.library.event.inventory;

import javaclasses.library.tinytype.InventoryItemId;
import javaclasses.library.tinytype.InventoryId;

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
