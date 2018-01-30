package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

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
