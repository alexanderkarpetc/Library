package javaclasses.library.c.inventory;

import javaclasses.library.c.UserId;

import java.util.Date;

public class Loan {

    private final LoanId loanId;
    private final InventoryItemId inventoryItemId;
    private final UserId userId;
    private final Date takeOnDate;
    private final Date dueOnDate;

    public Loan(LoanId loanId, InventoryItemId inventoryItemId, UserId userId, Date takeOnDate, Date dueOnDate) {
        this.loanId = loanId;
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
        this.takeOnDate = takeOnDate;
        this.dueOnDate = dueOnDate;
    }
}
