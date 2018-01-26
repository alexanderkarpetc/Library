package javaclasses.library.inventory;

import javaclasses.library.tinytype.InventoryId;
import javaclasses.library.tinytype.UserId;

public class ReservationRemoved {
    private final InventoryId inventoryId;
    private final UserId userId;

    public ReservationRemoved(InventoryId inventoryId, UserId userId) {
        this.inventoryId = inventoryId;
        this.userId = userId;
    }

    public InventoryId getInventoryId() {
        return inventoryId;
    }

    public UserId getUserId() {
        return userId;
    }
}