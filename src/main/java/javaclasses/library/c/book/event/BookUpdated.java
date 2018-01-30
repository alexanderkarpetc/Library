package javaclasses.library.c.book.event;

import javaclasses.library.c.book.BookVO;
import javaclasses.library.c.book.BookId;

public class BookUpdated {


    final private BookId id;
    final private BookVO bookVO;

    public BookUpdated(BookId id, BookVO bookVO) {
        this.id = id;
        this.bookVO = bookVO;
    }

    public BookId getId() {
        return id;
    }

    public BookVO getBookVO() {
        return bookVO;
    }
}
