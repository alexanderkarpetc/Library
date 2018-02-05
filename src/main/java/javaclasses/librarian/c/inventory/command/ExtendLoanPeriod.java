package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.inventory.InventoryId;
import javaclasses.librarian.c.inventory.LoanId;

import java.util.Date;

/**
 * An attempt to extend the loan period.
 * <p>
 * In case of a successful command propagation, the loan period is extended.
 * Cannot be applied if the book has been reserved by another user.
 */
public class ExtendLoanPeriod {

    private final InventoryId inventoryId;
    private final LoanId loanId;
    private final Date newDueDate;
    private final Date whenExtended;

    public ExtendLoanPeriod(InventoryId inventoryId, LoanId loanId, Date newDueDate, Date whenExtended) {
        this.inventoryId = inventoryId;
        this.loanId = loanId;
        this.newDueDate = newDueDate;
        this.whenExtended = whenExtended;
    }
}
