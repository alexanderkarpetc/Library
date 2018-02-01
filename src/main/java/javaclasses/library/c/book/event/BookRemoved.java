package javaclasses.library.c.book.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookId;
import javaclasses.library.c.book.BookRemoveReason;

import java.util.Date;

public class BookRemoved {

    private final BookId bookId;
    private final UserId userkId;
    private final Date whenRemove;
    private final BookRemoveReason whyRemove;


    public BookRemoved(BookId bookId, UserId userkId, Date whenRemove, BookRemoveReason whyRemove) {
        this.bookId = bookId;
        this.userkId = userkId;
        this.whenRemove = whenRemove;
        this.whyRemove = whyRemove;
    }
}
