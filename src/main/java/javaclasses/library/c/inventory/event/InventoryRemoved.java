package javaclasses.library.c.inventory.event;

import javaclasses.library.c.inventory.InventoryId;

import java.util.Date;
/**
 * An event fired when librarian remove book from the library.
 *
 * React on BookRemove.
 *
 * @see javaclasses.library.c.book.event.BookRemoved
 */
public class InventoryRemoved {

    private final InventoryId inventoryId;
    private final Date whenRemoved;

    public InventoryRemoved(InventoryId inventoryId, Date whenRemoved) {
        this.inventoryId = inventoryId;
        this.whenRemoved = whenRemoved;
    }
}
