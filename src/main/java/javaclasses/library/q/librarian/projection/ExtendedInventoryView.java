package javaclasses.library.q.librarian.projection;

import javaclasses.library.q.librarian.LoanDetails;

import java.util.List;

public class ExtendedInventoryView {

    private final List<LoanDetails> loans;


    public ExtendedInventoryView(List<LoanDetails> loans) {
        this.loans = loans;
    }
}
