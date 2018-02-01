package javaclasses.library.c.inventory.event;

import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

public class BookBecameAvailable {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final Date whenBecameAvailable;


    public BookBecameAvailable(InventoryId inventoryId, InventoryItemId inventoryItemId, Date whenBecameAvailable) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.whenBecameAvailable = whenBecameAvailable;
    }
}
