package javaclasses.library.c.book.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookVO;

import java.util.Date;

public class BookUpdated {

    private final BookVO currentBookVO;
    private final BookVO newBookVO;
    private final UserId userId;
    private final Date updateDate;

    public BookUpdated(BookVO currentBookVO, BookVO newBookVO, UserId userId, Date updateDate) {
        this.currentBookVO = currentBookVO;
        this.newBookVO = newBookVO;
        this.userId = userId;
        this.updateDate = updateDate;
    }
}
