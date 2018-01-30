package javaclasses.library.c.inventory.event;

import javaclasses.library.c.inventory.LoanId;

import java.util.Date;

public class LoanPeriodExtended {

    final private LoanId loanId;
    private final Date newDueOnDate;

    public LoanPeriodExtended(LoanId loanId, Date newDueOnDate) {
        this.loanId = loanId;
        this.newDueOnDate = newDueOnDate;
    }
}
