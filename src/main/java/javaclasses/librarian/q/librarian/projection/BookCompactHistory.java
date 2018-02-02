package javaclasses.librarian.q.librarian.projection;


import javaclasses.librarian.c.book.BookCoverURL;
import javaclasses.librarian.q.librarian.LoanDetails;

import java.util.List;

/**
 * {@code BookCompactHistory} there are view with compact information about book’s loans.
 * <p>
 * On this screen librarian see all users that borrow book and the loan’s period.
 */
public class BookCompactHistory {

    private final BookCoverURL bookCoverURL;
    private final List<LoanDetails> loans;

    public BookCompactHistory(BookCoverURL bookCoverURL, List<LoanDetails> loans) {
        this.bookCoverURL = bookCoverURL;
        this.loans = loans;
    }
}
