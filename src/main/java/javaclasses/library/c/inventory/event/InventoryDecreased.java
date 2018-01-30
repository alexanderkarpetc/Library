package javaclasses.library.c.inventory.event;

import javaclasses.library.c.Reason;
import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

public class InventoryDecreased {

    private final InventoryItemId inventoryItemId;
    private final UserId userId;
    private final Date date;
    private final Reason reason;

    public InventoryDecreased(InventoryItemId inventoryItemId, UserId userId, Date date, Reason reason) {
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
        this.date = date;
        this.reason = reason;
    }
}
