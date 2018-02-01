package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

/**
 * Triggers 'reservation became loan' if the book was reserved.
 */
public class BookBorrowed {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId userId;
    private final Date whenBorrowed;

    public BookBorrowed(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId userId, Date whenBorrowed) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
        this.whenBorrowed = whenBorrowed;
    }
}
