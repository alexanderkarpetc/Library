package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

import java.util.Date;

public class ReservationPickUpPeriodExpired {

    private final InventoryId inventoryId;
    private final UserId userId;
    private final Date dueOnDate;

    public ReservationPickUpPeriodExpired(InventoryId inventoryId, UserId userId, Date dueOnDate) {
        this.inventoryId = inventoryId;
        this.userId = userId;
        this.dueOnDate = dueOnDate;
    }

}
