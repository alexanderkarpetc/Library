package javaclasses.librarian.c.inventory.event;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;
import javaclasses.librarian.c.inventory.InventoryItemId;

import java.util.Date;

/**
 * An event when user lost borrowed book.
 * <p>
 * User can report by his own that he lost the book or librarian can do the same action.
 */
public class BookLost {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId whoLost;
    private final Date whenLost;

    public BookLost(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId whoLost, Date whenLost) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.whoLost = whoLost;
        this.whenLost = whenLost;
    }
}
