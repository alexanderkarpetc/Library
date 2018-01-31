package javaclasses.library.c.inventory;

import javaclasses.library.c.ItemStatus;

import java.util.Date;

public class InventoryItemAction {
    private final InventoryItemId inventoryItemId;
    private final ItemStatus status;
    private final Date actionDate;

    public InventoryItemAction(InventoryItemId inventoryItemId, ItemStatus status, Date actionDate) {
        this.inventoryItemId = inventoryItemId;
        this.status = status;
        this.actionDate = actionDate;
    }
}
