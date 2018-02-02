package javaclasses.librarian.c.inventory;


import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.book.BookId;

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
