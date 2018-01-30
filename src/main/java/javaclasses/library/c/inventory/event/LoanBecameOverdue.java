package javaclasses.library.c.inventory.event;

import javaclasses.library.c.inventory.LoanId;

import java.util.Date;

public class LoanBecameOverdue {

    private final LoanId loanId;
    private final Date overdueDate;

    public LoanBecameOverdue(LoanId loanId, Date overdueDate) {
        this.loanId = loanId;
        this.overdueDate = overdueDate;
    }
}
