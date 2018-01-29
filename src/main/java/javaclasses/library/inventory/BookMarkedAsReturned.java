package javaclasses.library.inventory;

import javaclasses.library.tinytype.InventoryId;
import javaclasses.library.tinytype.InventoryItemId;
import javaclasses.library.tinytype.UserId;

public class BookMarkedAsReturned {
    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId userId;

    public BookMarkedAsReturned(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId userId) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
    }

    public UserId getUserId() {
        return userId;
    }

    public InventoryId getInventoryId() {
        return inventoryId;
    }

    public InventoryItemId getInventoryItemId() {
        return inventoryItemId;
    }
}
