package javaclasses.library.c.book.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookId;
import javaclasses.library.c.book.BookDetails;

import java.util.Date;

/**
 * An event when librarian add new book to the library.
 *
 * Also invokes inventory creation.
 */
public class BookAdded {

    /**
     * Generated value based on ISBN.
     */
    private final BookId bookId;
    private final BookDetails book;
    private final UserId librarianId;
    private final Date whenAdded;

    public BookAdded(BookId bookId, BookDetails book, UserId librarianId, Date whenAdded) {
        this.bookId = bookId;
        this.book = book;
        this.librarianId = librarianId;
        this.whenAdded = whenAdded;
    }
}
