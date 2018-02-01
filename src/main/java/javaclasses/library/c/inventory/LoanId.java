package javaclasses.library.c.inventory;

import javaclasses.library.c.UserId;

import java.util.Date;

public class LoanId {
    /**
     * Generated id is based on date.
     */
    private final String generatedId;
    private final InventoryItemId inventoryItemId;
    private final UserId userId;
    private final Date takeOnDate;
    private final Date dueOnDate;

    public LoanId(String generatedId, InventoryItemId inventoryItemId, UserId userId, Date takeOnDate, Date dueOnDate) {
        this.generatedId = generatedId;
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
        this.takeOnDate = takeOnDate;
        this.dueOnDate = dueOnDate;
    }

}
