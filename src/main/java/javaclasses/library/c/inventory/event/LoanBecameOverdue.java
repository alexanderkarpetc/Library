package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

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
