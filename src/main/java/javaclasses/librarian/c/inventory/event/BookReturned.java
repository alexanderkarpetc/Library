package javaclasses.librarian.c.inventory.event;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;
import javaclasses.librarian.c.inventory.InventoryItemId;

import java.util.Date;

/**
 * An event when user returns book.
 * <p>
 * User's loan is finished and the book becomes or ready to pickup or available.
 */
public class BookReturned {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId whoReturned;
    private final Date whenReturned;

    public BookReturned(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId whoReturned, Date whenReturned) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.whoReturned = whoReturned;
        this.whenReturned = whenReturned;
    }
}
