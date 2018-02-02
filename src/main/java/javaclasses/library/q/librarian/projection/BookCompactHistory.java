package javaclasses.library.q.librarian.projection;


import javaclasses.library.c.book.BookCoverURL;
import javaclasses.library.q.librarian.LoanDetails;

import java.util.List;

public class BookCompactHistory {

    private final BookCoverURL bookCoverURL;
    private final List<LoanDetails> loans;

    public BookCompactHistory(BookCoverURL bookCoverURL, List<LoanDetails> loans) {
        this.bookCoverURL = bookCoverURL;
        this.loans = loans;
    }
}
