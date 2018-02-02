package javaclasses.library.c.inventory;


import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookId;

import java.util.Date;

public class Reservation {

    private final BookId bookId;
    private final UserId userId;

    private final Date whenCreated;

    public Reservation(BookId bookId, UserId userId, Date whenCreated) {
        this.bookId = bookId;
        this.userId = userId;
        this.whenCreated = whenCreated;
    }
}
