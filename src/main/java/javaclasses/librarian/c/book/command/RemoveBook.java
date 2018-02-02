package javaclasses.librarian.c.book.command;

import javaclasses.librarian.c.book.BookId;
import javaclasses.librarian.c.book.BookRemovalReason;

/**
 * An attempt to remove the book.
 *
 * <p>In case of a successful command propagation, the book is removed.
 * Cannot be applied to the missing book.
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
