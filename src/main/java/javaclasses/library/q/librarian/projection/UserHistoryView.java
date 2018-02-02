package javaclasses.library.q.librarian.projection;

import javaclasses.library.q.librarian.LoanDetails;

import java.util.List;

/**
 * Short version of user history.
 *
 * Contains all user's loan: taken on date, due on date, returned on date.
 */
public class UserHistoryView {

    private final List<LoanDetails> loans;

    public UserHistoryView(List<LoanDetails> loans) {
        this.loans = loans;
    }
}
