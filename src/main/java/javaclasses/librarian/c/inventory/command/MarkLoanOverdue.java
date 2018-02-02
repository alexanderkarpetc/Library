package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.inventory.LoanId;

/**
 * Loan period marks overdue if the reader hasn't return the book in time.
 */
public class MarkLoanOverdue {

    private final LoanId loanId;

    public MarkLoanOverdue(LoanId loanId) {
        this.loanId = loanId;
    }
}
