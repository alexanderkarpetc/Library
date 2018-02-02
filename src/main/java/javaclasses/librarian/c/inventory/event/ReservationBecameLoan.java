package javaclasses.librarian.c.inventory.event;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;

import java.util.Date;

/**
 * An event when the reservation was successfully finished.
 */
public class ReservationBecameLoan {

    private final InventoryId inventoryId;
    private final UserId userId;
    private final Date whenBecameLoan;

    public ReservationBecameLoan(InventoryId inventoryId, UserId userId, Date whenBecameLoan) {
        this.inventoryId = inventoryId;
        this.userId = userId;
        this.whenBecameLoan = whenBecameLoan;
    }
}
