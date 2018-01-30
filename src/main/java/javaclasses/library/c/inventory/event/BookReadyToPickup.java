package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

public class BookReadyToPickup {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId nextInQueue;
    private final Date date;

    public BookReadyToPickup(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId nextInQueue, Date date) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.nextInQueue = nextInQueue;
        this.date = date;
    }
}
