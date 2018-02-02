package javaclasses.librarian.c.book.event;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.book.BookDetails;
import javaclasses.librarian.c.book.BookId;

import java.util.Date;

/**
 * An event when librarian changes incorrect info about the book.
 */
public class BookUpdated {

    private final BookId bookId;
    private final BookDetails currentBookDetails;
    private final BookDetails newBookDetails;
    private final UserId librarianId;
    private final Date whenUpdated;

    public BookUpdated(BookId bookId, BookDetails currentBookDetails, BookDetails newBookDetails, UserId librarianId, Date whenUpdated) {
        this.bookId = bookId;
        this.currentBookDetails = currentBookDetails;
        this.newBookDetails = newBookDetails;
        this.librarianId = librarianId;
        this.whenUpdated = whenUpdated;
    }
}
