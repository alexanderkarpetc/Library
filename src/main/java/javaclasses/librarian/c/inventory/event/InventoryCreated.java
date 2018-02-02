package javaclasses.librarian.c.inventory.event;

import javaclasses.librarian.c.inventory.InventoryId;

import java.util.Date;

/**
 * An event when librarian add new book to the library.
 * <p>
 * React on BookAdded
 *
 * @see javaclasses.librarian.c.book.event.BookAdded
 */
public class InventoryCreated {

    private final InventoryId inventoryId;
    private final Date whenCreated;

    public InventoryCreated(InventoryId inventoryId, Date whenCreated) {
        this.inventoryId = inventoryId;
        this.whenCreated = whenCreated;
    }
}
