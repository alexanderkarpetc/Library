package javaclasses.library.q.librarian.projection;


import javaclasses.library.q.librarian.LoanDetails;

import java.util.List;

public class BookCompactHistory {
    private final List<LoanDetails> loans;

    public BookCompactHistory(List<LoanDetails> loans) {
        this.loans = loans;
    }
}
