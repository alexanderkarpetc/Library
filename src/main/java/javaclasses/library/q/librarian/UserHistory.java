package javaclasses.library.q.librarian;

import javaclasses.library.c.book.BookTitle;
import javaclasses.library.q.librarian.valueobject.LoanDetails;

import java.util.Map;

public class UserHistory {
    private final Map<LoanDetails, BookTitle> loans;

    public UserHistory(Map<LoanDetails, BookTitle> loans) {
        this.loans = loans;
    }
}
