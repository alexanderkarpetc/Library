package javaclasses.library.c.inventory;

import javaclasses.library.c.book.BookId;

public class InventoryId {
    /**
     * The same as the bookId.
     */
    private final BookId bookId;

    public InventoryId(BookId bookId) {
        this.bookId = bookId;
    }
}
