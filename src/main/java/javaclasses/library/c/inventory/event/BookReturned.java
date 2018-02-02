package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

/**
 * An event when user returns book.
 *
 * User's loan is finished and the book becomes or ready to pickup or available.
 */
public class BookReturned {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId userId;
    private final Date whenReturned;

    public BookReturned(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId userId, Date whenReturned) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
        this.whenReturned = whenReturned;
    }
}
