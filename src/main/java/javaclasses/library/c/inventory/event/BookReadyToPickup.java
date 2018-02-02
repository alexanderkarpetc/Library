package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

/**
 * Appears when either inventory appended or book returned.
 * That means that book is available for 1 user to take it.
 * In 2 days this opportunity disappear and his reservation expires.
 */
public class BookReadyToPickup {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId forWhom;
    private final Date whenBecameReadyToPickup;
    private final Date pickUpDeadline;

    public BookReadyToPickup(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId forWhom, Date whenBecameReadyToPickup, Date pickUpDeadline) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.forWhom = forWhom;
        this.whenBecameReadyToPickup = whenBecameReadyToPickup;
        this.pickUpDeadline = pickUpDeadline;
    }
}
