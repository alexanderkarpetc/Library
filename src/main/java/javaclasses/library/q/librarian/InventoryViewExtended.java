package javaclasses.library.q.librarian;

import javaclasses.library.q.librarian.valueobject.LoanDetails;

import java.util.List;

public class InventoryViewExtended {

    private final List<LoanDetails> loans;


    public InventoryViewExtended(List<LoanDetails> loans) {
        this.loans = loans;
    }
}
