package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

public class LoanPeriodExtended {
    private final UserId userId;
    private final InventoryId inventoryId;

    public LoanPeriodExtended(UserId userId, InventoryId inventoryId) {
        this.userId = userId;
        this.inventoryId = inventoryId;
    }

    public UserId getUserId() {
        return userId;
    }

    public InventoryId getInventoryId() {
        return inventoryId;
    }
}
