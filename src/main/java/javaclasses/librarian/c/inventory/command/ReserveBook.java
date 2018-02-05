package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;

import java.util.Date;

/**
 * An attempt to reserve the book.
 * <p>
 * In case of a successful command propagation, the book is reserved.
 * Cannot be applied if the book has already borrowed or reserved by current reader.
 */
public class ReserveBook {

    private final InventoryId inventoryId;
    private final UserId userId;
    private final Date whenReserved;

    public ReserveBook(InventoryId inventoryId, UserId userId, Date whenReserved) {
        this.inventoryId = inventoryId;
        this.userId = userId;
        this.whenReserved = whenReserved;
    }
}
