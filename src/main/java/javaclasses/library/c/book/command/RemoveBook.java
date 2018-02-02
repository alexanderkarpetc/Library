package javaclasses.library.c.book.command;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookId;
import javaclasses.library.c.book.BookRemovalReason;

import java.util.Date;

/**
 * A command to remove a new book.
 */
public class RemoveBook {

    private final BookId bookId;
    /**
     * Reason contains string value.
     */
    private final BookRemovalReason whyRemoved;

    public RemoveBook(BookId bookId, BookRemovalReason whyRemoved) {
        this.bookId = bookId;
        this.whyRemoved = whyRemoved;
    }
}
