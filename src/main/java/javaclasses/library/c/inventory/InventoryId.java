package javaclasses.library.c.inventory;

import javaclasses.library.c.book.BookId;

public class InventoryId {

    private final BookId bookId;

    public InventoryId(BookId bookId) {
        this.bookId = bookId;
    }
}
