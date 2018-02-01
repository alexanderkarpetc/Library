package javaclasses.library.c.book.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookId;
import javaclasses.library.c.book.BookParameters;

import java.util.Date;

public class BookUpdated {

    private final BookId bookId;
    private final BookParameters currentBookParameters;
    private final BookParameters newBookParameters;
    private final UserId librarianId;
    private final Date whenUpdated;

    public BookUpdated(BookId bookId, BookParameters currentBookParameters, BookParameters newBookParameters, UserId librarianId, Date whenUpdated) {
        this.bookId = bookId;
        this.currentBookParameters = currentBookParameters;
        this.newBookParameters = newBookParameters;
        this.librarianId = librarianId;
        this.whenUpdated = whenUpdated;
    }
}
