package javaclasses.library.c.inventory;

import javaclasses.library.c.UserId;

import java.util.Date;

public class LoanId {

    private final String value;
    private final InventoryItemId inventoryItemId;
    private final UserId userId;
    private final Date takeOnDate;
    private final Date dueOnDate;

    public LoanId(String value, InventoryItemId inventoryItemId, UserId userId, Date takeOnDate, Date dueOnDate) {
        this.value = value;
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
        this.takeOnDate = takeOnDate;
        this.dueOnDate = dueOnDate;
    }

}
