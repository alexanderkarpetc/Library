package javaclasses.librarian.c.inventory;

import javaclasses.librarian.c.book.BookId;

public class InventoryId {
    /**
     * The same as the bookId.
     */
    private final BookId bookId;

    public InventoryId(BookId bookId) {
        this.bookId = bookId;
    }
}
