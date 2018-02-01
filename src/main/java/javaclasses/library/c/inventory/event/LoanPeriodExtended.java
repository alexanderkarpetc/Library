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
    private final Date previousDueOnDate;
    private final Date newDueOnDate;

    public LoanPeriodExtended(InventoryId inventoryId, LoanId loanId, Date previousDueOnDate, Date newDueOnDate) {
        this.inventoryId = inventoryId;
        this.loanId = loanId;
        this.previousDueOnDate = previousDueOnDate;
        this.newDueOnDate = newDueOnDate;
    }
}
