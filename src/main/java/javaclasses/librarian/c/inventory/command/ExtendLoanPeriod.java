package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.inventory.LoanId;

import java.util.Date;

public class ExtendLoanPeriod {

    private final LoanId loanId;
    private final Date newDueDate;

    public ExtendLoanPeriod(LoanId loanId, Date newDueDate) {
        this.loanId = loanId;
        this.newDueDate = newDueDate;
    }
}
