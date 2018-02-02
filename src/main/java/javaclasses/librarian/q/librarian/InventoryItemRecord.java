package javaclasses.librarian.q.librarian;

import javaclasses.librarian.c.inventory.InventoryItemId;

import java.util.Date;

public class InventoryItemRecord {
    private final InventoryItemId inventoryItemId;
    private final BookRecord action;
    private final Date actionDate;

    public InventoryItemRecord(InventoryItemId inventoryItemId, BookRecord action, Date actionDate) {
        this.inventoryItemId = inventoryItemId;
        this.action = action;
        this.actionDate = actionDate;
    }

    public enum BookRecord {
        BORROWED,
        RESERVED,
        LOAN_PERIOD_EXTENDED,
        RETURNED,
        LOST
    }
}
