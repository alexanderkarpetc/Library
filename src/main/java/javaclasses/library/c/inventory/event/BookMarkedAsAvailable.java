package javaclasses.library.c.inventory.event;

import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.InventoryItemId;

public class BookMarkedAsAvailable {
    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;

    public BookMarkedAsAvailable(InventoryId inventoryId, InventoryItemId inventoryItemId) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
    }

    public InventoryId getInventoryId() {
        return inventoryId;
    }

    public InventoryItemId getInventoryItemId() {
        return inventoryItemId;
    }
}
