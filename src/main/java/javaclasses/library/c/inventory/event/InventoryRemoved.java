package javaclasses.library.c.inventory.event;

import javaclasses.library.c.inventory.InventoryId;

import java.util.Date;

public class InventoryRemoved {

    private final InventoryId inventoryId;
    private final Date whenRemoved;

    public InventoryRemoved(InventoryId inventoryId, Date whenRemoved) {
        this.inventoryId = inventoryId;
        this.whenRemoved = whenRemoved;
    }
}
