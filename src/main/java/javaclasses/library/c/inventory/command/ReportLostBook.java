package javaclasses.library.c.inventory.command;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryItemId;

public class ReportLostBook {

    private final InventoryItemId inventoryItemId;
    private final UserId whoLost;

    public ReportLostBook(InventoryItemId inventoryItemId, UserId whoLost) {
        this.inventoryItemId = inventoryItemId;
        this.whoLost = whoLost;
    }
}
