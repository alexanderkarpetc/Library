package javaclasses.librarian.c.inventory;

import javaclasses.librarian.c.UserId;

import java.util.Date;

public class Loan {

    private final LoanId loanId;
    private final InventoryItemId inventoryItemId;
    private final UserId userId;
    private final Date whenTaken;
    private final Date whenDue;

    public Loan(LoanId loanId, InventoryItemId inventoryItemId, UserId userId, Date whenTaken, Date whenDue) {
        this.loanId = loanId;
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
        this.whenTaken = whenTaken;
        this.whenDue = whenDue;
    }

}
