package javaclasses.library.c.book.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookId;
import javaclasses.library.c.book.BookRemovalReason;

import java.util.Date;

/**
 * An event when librarian remove book from library.
 *
 * Impossible when at least one user borrowed it.
 *
 * Also deletes inventory of this book.
 */
public class BookRemoved {

    private final BookId bookId;
    private final UserId librarianId;
    private final Date whenRemoved;

    /**
     * Reason contains string value.
     */
    private final BookRemovalReason whyRemoved;


    public BookRemoved(BookId bookId, UserId librarianId, Date whenRemoved, BookRemovalReason whyRemoved) {
        this.bookId = bookId;
        this.librarianId = librarianId;
        this.whenRemoved = whenRemoved;
        this.whyRemoved = whyRemoved;
    }
}
