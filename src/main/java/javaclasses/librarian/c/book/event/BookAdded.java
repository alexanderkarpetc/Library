package javaclasses.librarian.c.book.event;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.book.BookDetails;
import javaclasses.librarian.c.book.BookId;

import java.util.Date;

/**
 * An event when librarian adds new book to the library.
 * <p>
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
