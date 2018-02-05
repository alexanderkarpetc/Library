package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;

/**
 * An attempt to cancel the reservation.
 * <p>
 * In case of a successful command propagation, the reservation is canceled.
 * Cannot be applied to the missing reservation.
 */
public class CancelReservation {

    private final InventoryId inventoryId;
    private final UserId userId;

    public CancelReservation(InventoryId inventoryId, UserId userId) {
        this.inventoryId = inventoryId;
        this.userId = userId;
    }
}
