package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

import java.util.Date;

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
