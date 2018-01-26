package javaclasses.library;


import javaclasses.library.tinytype.InventoryItemId;
import javaclasses.library.tinytype.UserId;

public class Reservation {
    private final InventoryItemId inventoryItemId;
    private final UserId userId;

    public Reservation(InventoryItemId inventoryItemId, UserId userId) {
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
    }

    public InventoryItemId getInventoryItemId() {
        return inventoryItemId;
    }

    public UserId getUserId() {
        return userId;
    }
}
