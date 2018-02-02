package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;

/**
 * An attempt to reserve the book.
 *
 * <p>In case of a successful command propagation, the book is reserved.
 * Cannot be applied if the book has already borrowed or reserved by current reader.
 */
public class ReserveBook {

    private final InventoryId inventoryId;
    private final UserId userId;

    public ReserveBook(InventoryId inventoryId, UserId userId) {
        this.inventoryId = inventoryId;
        this.userId = userId;
    }
}
