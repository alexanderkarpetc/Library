package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

public class InventoryAppended {

    private final InventoryItemId inventoryItemId;
    private final UserId userId;
    private final Date date;

    public InventoryAppended(InventoryItemId inventoryItemId, UserId userId, Date date) {
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
        this.date = date;
    }
}
