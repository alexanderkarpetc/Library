package javaclasses.library.q.librarian;


import javaclasses.library.q.librarian.valueobject.LoanDetails;

import java.util.List;

public class BookCompactHistory {
    private final List<LoanDetails> loans;

    public BookCompactHistory(List<LoanDetails> loans) {
        this.loans = loans;
    }
}
