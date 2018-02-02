package javaclasses.librarian.c.book.command;

import javaclasses.librarian.c.book.BookId;
import javaclasses.librarian.c.book.BookRemovalReason;

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
