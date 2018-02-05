package javaclasses.librarian.c.inventory.event;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;

import java.util.Date;

/**
 * An event when user reserves the book.
 * <p>
 * If a queue on book exists then reader will be added to the queue.
 * Else if book is available then reader has 2 days to borrow book.
 */
public class ReservationAdded {

    private final InventoryId inventoryId;
    private final UserId forWhomReserved;
    private final Date whenCreated;

    public ReservationAdded(InventoryId inventoryId, UserId forWhomReserved, Date whenCreated) {
        this.inventoryId = inventoryId;
        this.forWhomReserved = forWhomReserved;
        this.whenCreated = whenCreated;
    }
}
