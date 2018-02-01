package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

import java.util.Date;

public class ReservationBecameLoan {

    private final InventoryId inventoryId;
    private final UserId userId;
    private final Date when;

    public ReservationBecameLoan(InventoryId inventoryId, UserId userId, Date when) {
        this.inventoryId = inventoryId;
        this.userId = userId;
        this.when = when;
    }
}
