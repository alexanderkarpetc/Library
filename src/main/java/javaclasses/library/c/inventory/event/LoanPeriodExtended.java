package javaclasses.library.c.inventory.event;

import javaclasses.library.c.inventory.Loan;

import java.util.Date;

public class LoanPeriodExtended {

    final private Loan loanId;
    private final Date newDueOnDate;

    public LoanPeriodExtended(Loan loanId, Date newDueOnDate) {
        this.loanId = loanId;
        this.newDueOnDate = newDueOnDate;
    }
}
