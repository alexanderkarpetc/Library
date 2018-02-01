package javaclasses.library.c.book.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.Book;
import javaclasses.library.c.book.BookId;

import java.util.Date;

public class BookAdded {

    private final BookId bookId;
    private final Book book;
    private final UserId userId;
    private final Date when;

    public BookAdded(BookId bookId, Book book, UserId userId, Date when) {
        this.bookId = bookId;
        this.book = book;
        this.userId = userId;
        this.when = when;
    }
}
