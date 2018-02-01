package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

public class BookReadyToPickup {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId forWhom;
    private final Date whenBecameReadyToPickup;

    public BookReadyToPickup(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId forWhom, Date whenBecameReadyToPickup) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.forWhom = forWhom;
        this.whenBecameReadyToPickup = whenBecameReadyToPickup;
    }
}
