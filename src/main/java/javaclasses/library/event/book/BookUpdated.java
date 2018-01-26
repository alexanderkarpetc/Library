package javaclasses.library.event.book;

import javaclasses.library.book.BookVO;
import javaclasses.library.tinytype.BookId;

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
