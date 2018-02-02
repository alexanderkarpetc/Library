package javaclasses.library.q.librarian.projection;

import javaclasses.library.c.book.BookTitle;
import javaclasses.library.q.librarian.LoanDetails;

import java.util.Map;

public class UserHistoryView {
    private final Map<LoanDetails, BookTitle> loans;

    public UserHistoryView(Map<LoanDetails, BookTitle> loans) {
        this.loans = loans;
    }
}
