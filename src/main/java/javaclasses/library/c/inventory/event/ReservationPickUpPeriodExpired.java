package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

import java.util.Date;

/**
 * If 2 days passed, reservation period for borrowing book has expired.
 */
public class ReservationPickUpPeriodExpired {

    private final InventoryId inventoryId;
    private final UserId userId;
    private final Date whenExpired;

    public ReservationPickUpPeriodExpired(InventoryId inventoryId, UserId userId, Date whenExpired) {
        this.inventoryId = inventoryId;
        this.userId = userId;
        this.whenExpired = whenExpired;
    }
}
