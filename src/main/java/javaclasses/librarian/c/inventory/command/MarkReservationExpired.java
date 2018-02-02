package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;

/**
 * Reservation expires if the reader hasn't taken the book in 2 days.
 */
public class MarkReservationExpired {

    private final InventoryId inventoryId;
    private final UserId userId;

    public MarkReservationExpired(InventoryId inventoryId, UserId userId) {
        this.inventoryId = inventoryId;
        this.userId = userId;
    }
}
