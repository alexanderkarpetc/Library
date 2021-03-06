package javaclasses.librarian.c.inventory.event;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;
import javaclasses.librarian.c.inventory.InventoryItemId;

import java.util.Date;

/**
 * Event when user borrows book.
 * <p>
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
