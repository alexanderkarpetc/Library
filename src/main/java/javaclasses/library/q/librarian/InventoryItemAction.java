package javaclasses.library.q.librarian;

import javaclasses.library.c.ItemStatus;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

public class InventoryItemAction {
    private final InventoryItemId inventoryItemId;
    private final BookAction action;
    private final Date actionDate;

    public InventoryItemAction(InventoryItemId inventoryItemId, Date actionDate) {
        this.inventoryItemId = inventoryItemId;
        this.actionDate = actionDate;
    }
}
