package javaclasses.library.c.inventory.event;

import javaclasses.library.c.Premise;
import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

public class ReservationRemoved {

    private final InventoryId inventoryId;
    private final UserId userId;
    private final Premise premise;

    public ReservationRemoved(InventoryId inventoryId, UserId userId, Premise premise) {
        this.inventoryId = inventoryId;
        this.userId = userId;
        this.premise = premise;
    }
}
