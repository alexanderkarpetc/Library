package javaclasses.library.c.inventory;

import javaclasses.library.c.UserId;

import java.util.Date;

public class LoanId {

    private final InventoryItemId inventoryItemId;
    private final UserId userId;
    private final Date takeOnDate;
    private final Date dueOnDate;

    public LoanId(InventoryItemId inventoryItemId, UserId userId, Date takeOnDate, Date dueOnDate) {
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
        this.takeOnDate = takeOnDate;
        this.dueOnDate = dueOnDate;
    }
}
