package javaclasses.library.c.book.event;

import javaclasses.library.c.book.BookId;

public class BookAdded {

    final private BookId bookId;

    public BookAdded(BookId bookId) {
        this.bookId = bookId;
    }

    public BookId getBookId() {
        return bookId;
    }
}
