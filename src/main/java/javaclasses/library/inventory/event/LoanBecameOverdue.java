package javaclasses.library.inventory.event;

import javaclasses.library.UserId;
import javaclasses.library.inventory.InventoryId;

public class LoanBecameOverdue {
    private final UserId userId;
    private final InventoryId inventoryId;

    public LoanBecameOverdue(UserId userId, InventoryId inventoryId) {
        this.userId = userId;
        this.inventoryId = inventoryId;
    }

    public InventoryId getInventoryId() {
        return inventoryId;
    }

    public UserId getUserId() {
        return userId;
    }

}
