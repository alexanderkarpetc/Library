package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryItemId;

public class ReportLostBook {

    private final InventoryItemId inventoryItemId;
    private final UserId whoLost;

    public ReportLostBook(InventoryItemId inventoryItemId, UserId whoLost) {
        this.inventoryItemId = inventoryItemId;
        this.whoLost = whoLost;
    }
}
