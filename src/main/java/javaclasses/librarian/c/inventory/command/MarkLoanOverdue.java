package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.inventory.InventoryId;
import javaclasses.librarian.c.inventory.LoanId;

/**
 * Loan period marks overdue if the reader hasn't return the book in time.
 */
public class MarkLoanOverdue {

    public final InventoryId inventoryId;
    private final LoanId loanId;

    public MarkLoanOverdue(InventoryId inventoryId, LoanId loanId) {
        this.inventoryId = inventoryId;
        this.loanId = loanId;
    }
}
