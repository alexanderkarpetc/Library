package javaclasses.library.q.librarian;


import java.util.List;

public class BookCompactHistory {
    private final List<LoanDetails> loans;

    public BookCompactHistory(List<LoanDetails> loans) {
        this.loans = loans;
    }
}
