package javaclasses.library.c.inventory.event;

import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.LoanId;

import java.util.Date;

/**
 * Impossible when book is reserved by another user.
 */
public class LoanPeriodExtended {

    private final InventoryId inventoryId;
    private final LoanId loanId;
    private final Date previousDueDate;
    private final Date newDueDate;

    public LoanPeriodExtended(InventoryId inventoryId, LoanId loanId, Date previousDueDate, Date newDueDate) {
        this.inventoryId = inventoryId;
        this.loanId = loanId;
        this.previousDueDate = previousDueDate;
        this.newDueDate = newDueDate;
    }
}
