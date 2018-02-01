package javaclasses.library.c.book.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookId;
import javaclasses.library.c.book.BookParameters;

import java.util.Date;

public class BookAdded {
    /**
     * Generated value based on isbn
     */
    private final BookId bookId;
    private final BookParameters book;
    private final UserId userId;
    private final Date whenAdded;

    public BookAdded(BookId bookId, BookParameters book, UserId userId, Date whenAdded) {
        this.bookId = bookId;
        this.book = book;
        this.userId = userId;
        this.whenAdded = whenAdded;
    }
}
