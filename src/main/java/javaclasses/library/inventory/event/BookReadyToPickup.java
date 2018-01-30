package javaclasses.library.inventory.event;

import javaclasses.library.UserId;
import javaclasses.library.inventory.InventoryId;
import javaclasses.library.inventory.InventoryItemId;

public class BookReadyToPickup {
    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId userId;

    public BookReadyToPickup(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId userId) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
    }

    public InventoryId getInventoryId() {
        return inventoryId;
    }

    public InventoryItemId getInventoryItemId() {
        return inventoryItemId;
    }

    public UserId getUserId() {
        return userId;
    }
}
