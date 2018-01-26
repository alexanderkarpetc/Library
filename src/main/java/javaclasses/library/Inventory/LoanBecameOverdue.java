package javaclasses.library.Inventory;

import javaclasses.library.tinytype.BookId;
import javaclasses.library.tinytype.UserId;

public class LoanBecameOverdue {
    private final UserId userId;
    private final BookId bookId;

    public LoanBecameOverdue(UserId userId, BookId bookId) {
        this.userId = userId;
        this.bookId = bookId;
    }

    public UserId getUserId() {
        return userId;
    }

    public BookId getBookId() {
        return bookId;
    }
}
