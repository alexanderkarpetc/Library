package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

/**
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
