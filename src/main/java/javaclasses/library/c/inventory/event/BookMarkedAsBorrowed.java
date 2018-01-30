package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

public class BookMarkedAsBorrowed {

    private final InventoryItemId inventoryItemId;
    private final UserId userId;
    private final Date date;

    public BookMarkedAsBorrowed(InventoryItemId inventoryItemId, UserId userId, Date date) {
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
        this.date = date;
    }
}
