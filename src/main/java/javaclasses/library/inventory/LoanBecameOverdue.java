package javaclasses.library.inventory;

import javaclasses.library.tinytype.InventoryId;
import javaclasses.library.tinytype.UserId;

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
