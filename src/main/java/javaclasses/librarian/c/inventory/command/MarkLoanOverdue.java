package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.inventory.LoanId;

public class MarkLoanOverdue {

    private final LoanId loanId;

    public MarkLoanOverdue(LoanId loanId) {
        this.loanId = loanId;
    }
}
