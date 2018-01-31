package javaclasses.library.c.inventory.event;

import javaclasses.library.c.ReservationFinishState;
import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;

public class ReservationRemoved {

    private final InventoryId inventoryId;
    private final UserId userId;
    private final ReservationFinishState reservationFinishState;

    public ReservationRemoved(InventoryId inventoryId, UserId userId, ReservationFinishState reservationFinishState) {
        this.inventoryId = inventoryId;
        this.userId = userId;
        this.reservationFinishState = reservationFinishState;
    }
}
