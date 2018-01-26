package javaclasses.library.Inventory;

import javaclasses.library.tinytype.BookId;
import javaclasses.library.tinytype.InventoryId;

public class InventoryAppended {
    private final BookId bookId;
    private final InventoryId inventoryId;

    public InventoryAppended(BookId bookId, InventoryId inventoryId) {
        this.bookId = bookId;
        this.inventoryId = inventoryId;
    }

    public InventoryId getInventoryId() {
        return inventoryId;
    }

    public BookId getBookId() {
        return bookId;
    }
}
