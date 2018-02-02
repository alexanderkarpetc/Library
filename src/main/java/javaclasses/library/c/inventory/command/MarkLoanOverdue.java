package javaclasses.library.c.inventory.command;

import javaclasses.library.c.inventory.LoanId;

public class MarkLoanOverdue {

    private final LoanId loanId;

    public MarkLoanOverdue(LoanId loanId) {
        this.loanId = loanId;
    }
}
