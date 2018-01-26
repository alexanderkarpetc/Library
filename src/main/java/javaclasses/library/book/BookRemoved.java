package javaclasses.library.book;

import javaclasses.library.tinytype.BookId;

public class BookRemoved {
    final private BookId id;

    public BookRemoved(BookId id) {
        this.id = id;
    }

    public BookId getId() {
        return id;
    }
}
