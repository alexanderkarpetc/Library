package javaclasses.librarian.c.inventory.event;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;
import javaclasses.librarian.c.inventory.InventoryItemId;

import java.util.Date;

/**
 * An event when  book is available for 1 user to take it.
 * <p>
 * Appears when either inventory appended or book returned.
 * <p>
 * In 2 days this opportunity disappear and the reservation expires.
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
