package javaclasses.library.event.inventory;

import javaclasses.library.tinytype.InventoryId;
import javaclasses.library.tinytype.InventoryItemId;
import javaclasses.library.tinytype.UserId;

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
