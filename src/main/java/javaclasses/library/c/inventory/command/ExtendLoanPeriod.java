package javaclasses.library.c.inventory.command;

import javaclasses.library.c.inventory.LoanId;

import java.util.Date;

/**
 * An attempt to extend the loan period.
 *
 * <p>In case of a successful command propagation, the loan period is extended.
 * Cannot be applied if the book has been reserved by another user.
 */
public class ExtendLoanPeriod {

    private final LoanId loanId;
    private final Date newDueDate;

    public ExtendLoanPeriod(LoanId loanId, Date newDueDate) {
        this.loanId = loanId;
        this.newDueDate = newDueDate;
    }
}
