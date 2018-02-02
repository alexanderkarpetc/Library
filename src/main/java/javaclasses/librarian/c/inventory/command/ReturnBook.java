package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;
import javaclasses.librarian.c.inventory.InventoryItemId;

/**
 * An attempt to return the book.
 *
 * <p>In case of a successful command propagation, the book is returned.
 * <p>Cannot be applied to the missing or not borrowed book.
 */
public class ReturnBook {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId userId;

    public ReturnBook(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId userId) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
    }
}
