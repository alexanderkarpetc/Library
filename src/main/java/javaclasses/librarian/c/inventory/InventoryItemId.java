package javaclasses.librarian.c.inventory;

import javaclasses.librarian.c.book.BookId;

/**
 * Value that consists of BookId and item number.
 */

public class InventoryItemId {

    private final BookId bookId;
    /**
     * Input by librarian.
     */
    private final int itemNumber;

    public InventoryItemId(BookId bookId, int itemNumber) {
        this.bookId = bookId;
        this.itemNumber = itemNumber;
    }
}
