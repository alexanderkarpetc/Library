package javaclasses.library.c.inventory.event;

import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.LoanId;

import java.util.Date;

/**
 * An event fired when user's loan period is overdue.
 */
public class LoanBecameOverdue {

    private final InventoryId inventoryId;
    private final LoanId loanId;
    /**
     * Date when book was expected, so overdue period can be calculated.
     */
    private final Date whenOverdue;

    public LoanBecameOverdue(InventoryId inventoryId, LoanId loanId, Date whenOverdue) {
        this.inventoryId = inventoryId;
        this.loanId = loanId;
        this.whenOverdue = whenOverdue;
    }
}
