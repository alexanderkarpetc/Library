package javaclasses.library.c.book.event;

import javaclasses.library.c.Reason;
import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookId;

import java.util.Date;

public class BookRemoved {

    private final BookId bookId;
    private final UserId userkId;
    private final Date removalDate;
    private final Reason removalReason;


    public BookRemoved(BookId bookId, UserId userkId, Date removalDate, Reason removalReason) {
        this.bookId = bookId;
        this.userkId = userkId;
        this.removalDate = removalDate;
        this.removalReason = removalReason;
    }
}
