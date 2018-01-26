package javaclasses.library.inventory;

import javaclasses.library.tinytype.InventoryItemId;
import javaclasses.library.tinytype.UserId;

public class LoanBecameOverdue {
    private final UserId userId;
    private final InventoryItemId inventoryItemId;

    public LoanBecameOverdue(UserId userId, InventoryItemId inventoryItemId) {
        this.userId = userId;
        this.inventoryItemId = inventoryItemId;
    }

    public UserId getUserId() {
        return userId;
    }

    public InventoryItemId getInventoryItemId() {
        return inventoryItemId;
    }
}
