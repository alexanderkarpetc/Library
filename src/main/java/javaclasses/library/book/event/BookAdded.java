package javaclasses.library.book.event;

import javaclasses.library.book.BookId;

public class BookAdded {

    final private BookId bookId;

    public BookAdded(BookId bookId) {
        this.bookId = bookId;
    }

    public BookId getBookId() {
        return bookId;
    }
}
