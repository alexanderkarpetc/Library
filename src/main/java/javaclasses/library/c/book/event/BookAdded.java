package javaclasses.library.c.book.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.Book;

import java.util.Date;

public class BookAdded {

    private final Book book;
    private final UserId userId;
    private final Date additionDate;

    public BookAdded(Book book, UserId userId, Date additionDate) {
        this.book = book;
        this.userId = userId;
        this.additionDate = additionDate;
    }
}
