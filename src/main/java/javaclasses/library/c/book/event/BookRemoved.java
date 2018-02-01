package javaclasses.library.c.book.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookId;
import javaclasses.library.c.book.BookRemoveReason;

import java.util.Date;

public class BookRemoved {

    private final BookId bookId;
    private final UserId librarianId;
    private final Date whenRemoved;
    /**
     * Reason contains string value.
     */
    private final BookRemoveReason whyRemoved;


    public BookRemoved(BookId bookId, UserId librarianId, Date whenRemoved, BookRemoveReason whyRemoved) {
        this.bookId = bookId;
        this.librarianId = librarianId;
        this.whenRemoved = whenRemoved;
        this.whyRemoved = whyRemoved;
    }
}
