package javaclasses.library.c.book.event;

import javaclasses.library.c.book.BookId;

public class BookRemoved {
    final private BookId id;

    public BookRemoved(BookId id) {
        this.id = id;
    }

    public BookId getId() {
        return id;
    }
}
