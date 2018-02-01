package javaclasses.library.c.book.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookId;
import javaclasses.library.c.book.BookVO;

import java.util.Date;

public class BookUpdated {

    private final BookId bookId;
    private final BookVO currentBookVO;
    private final BookVO newBookVO;
    private final UserId userId;
    private final Date when;

    public BookUpdated(BookId bookId, BookVO currentBookVO, BookVO newBookVO, UserId userId, Date when) {
        this.bookId = bookId;
        this.currentBookVO = currentBookVO;
        this.newBookVO = newBookVO;
        this.userId = userId;
        this.when = when;
    }
}
