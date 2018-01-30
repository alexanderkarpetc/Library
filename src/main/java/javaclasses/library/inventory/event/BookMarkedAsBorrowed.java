package javaclasses.library.inventory.event;

import javaclasses.library.UserId;
import javaclasses.library.inventory.InventoryId;
import javaclasses.library.inventory.InventoryItemId;

public class BookMarkedAsBorrowed {
    private final InventoryItemId inventoryItemId;
    private final InventoryId inventoryId;
    private final UserId userId;

    public BookMarkedAsBorrowed(InventoryItemId inventoryItemId, InventoryId inventoryId, UserId userId) {
        this.inventoryItemId = inventoryItemId;
        this.inventoryId = inventoryId;
        this.userId = userId;
    }

    public InventoryItemId getInventoryItemId() {
        return inventoryItemId;
    }

    public InventoryId getInventoryId() {
        return inventoryId;
    }

    public UserId getUserId() {
        return userId;
    }
}
