package javaclasses.library.event.book;

import javaclasses.library.tinytype.BookId;

public class BookAdded {

    final private BookId bookId;

    public BookAdded(BookId bookId) {
        this.bookId = bookId;
    }

    public BookId getBookId() {
        return bookId;
    }
}
