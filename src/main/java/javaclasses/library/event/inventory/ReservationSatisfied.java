package javaclasses.library.event.inventory;

import javaclasses.library.tinytype.InventoryId;
import javaclasses.library.tinytype.UserId;

public class ReservationSatisfied {
    private final UserId userId;
    private final InventoryId inventoryId;

    public ReservationSatisfied(UserId userId, InventoryId inventoryId) {
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
