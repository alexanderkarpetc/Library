package javaclasses.library.c.inventory.event;

import javaclasses.library.c.inventory.InventoryId;

import java.util.Date;

public class InventoryCreated {

    private final InventoryId inventoryId;
    private final Date whenCreated;

    public InventoryCreated(InventoryId inventoryId, Date whenCreated) {
        this.inventoryId = inventoryId;
        this.whenCreated = whenCreated;
    }
}
