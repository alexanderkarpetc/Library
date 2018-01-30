package javaclasses.library.c.inventory.event;

import javaclasses.library.c.inventory.Loan;

import java.util.Date;

public class LoanBecameOverdue {

    private final Loan loanId;
    private final Date overdueDate;

    public LoanBecameOverdue(Loan loanId, Date overdueDate) {
        this.loanId = loanId;
        this.overdueDate = overdueDate;
    }
}
