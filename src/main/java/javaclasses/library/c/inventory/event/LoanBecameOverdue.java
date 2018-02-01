package javaclasses.library.c.inventory.event;

import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.LoanId;

import java.util.Date;

public class LoanBecameOverdue {

    private final InventoryId inventoryId;
    private final LoanId loanId;
    private final Date overdueDate;

    public LoanBecameOverdue(InventoryId inventoryId, LoanId loanId, Date overdueDate) {
        this.inventoryId = inventoryId;
        this.loanId = loanId;
        this.overdueDate = overdueDate;
    }
}
