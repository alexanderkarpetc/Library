package javaclasses.librarian.c.book.event;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.book.BookId;
import javaclasses.librarian.c.book.BookRemovalReason;

import java.util.Date;

/**
 * An event when librarian removes book from library.
 * <p>
 * Impossible when at least one user borrowed it.
 * <p>
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
