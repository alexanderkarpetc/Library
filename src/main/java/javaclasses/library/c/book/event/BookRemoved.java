package javaclasses.library.c.book.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookId;
import javaclasses.library.c.book.BookRemoveReason;

import java.util.Date;

public class BookRemoved {

    private final BookId bookId;
    private final UserId userkId;
    private final Date whenRemoved;
    private final BookRemoveReason whyRemoved;


    public BookRemoved(BookId bookId, UserId userkId, Date whenRemoved, BookRemoveReason whyRemoved) {
        this.bookId = bookId;
        this.userkId = userkId;
        this.whenRemoved = whenRemoved;
        this.whyRemoved = whyRemoved;
    }
}
