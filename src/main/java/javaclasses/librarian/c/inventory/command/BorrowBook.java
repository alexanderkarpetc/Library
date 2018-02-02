package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryItemId;

/**
 * An attempt to borrow a book.
 *
 * <p>In case of a successful command propagation, the book is borrowed by reader.
 * If book was reserved, then {@code Reservation} became {@code Loan}.
 *
 * Cannot be applied to the book that is reserved by another user.
 */
public class BorrowBook {

    private final InventoryItemId inventoryItemId;
    private final UserId userId;

    public BorrowBook(InventoryItemId inventoryItemId, UserId userId) {
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
    }
}
