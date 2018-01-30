package javaclasses.library.c.inventory.event;

import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

public class BookMarkedAsAvailable {

    private final InventoryItemId inventoryItemId;
    private final Date date;


    public BookMarkedAsAvailable(InventoryItemId inventoryItemId, Date date) {
        this.inventoryItemId = inventoryItemId;
        this.date = date;
    }
}
