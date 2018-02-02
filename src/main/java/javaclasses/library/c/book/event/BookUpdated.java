package javaclasses.library.c.book.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookId;
import javaclasses.library.c.book.BookDetails;

import java.util.Date;

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
