package javaclasses.librarian.c.inventory.event;

import javaclasses.librarian.c.inventory.InventoryId;

import java.util.Date;

/**
 * An event fired when librarian removes book from the library.
 * <p>
 * React on BookRemove.
 *
 * @see javaclasses.librarian.c.book.event.BookRemoved
 */
public class InventoryRemoved {

    private final InventoryId inventoryId;
    private final Date whenRemoved;

    public InventoryRemoved(InventoryId inventoryId, Date whenRemoved) {
        this.inventoryId = inventoryId;
        this.whenRemoved = whenRemoved;
    }
}
