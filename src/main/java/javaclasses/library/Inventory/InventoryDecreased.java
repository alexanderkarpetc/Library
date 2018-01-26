package javaclasses.library.Inventory;

import javaclasses.library.tinytype.BookId;
import javaclasses.library.tinytype.InventoryId;

public class InventoryDecreased {
    private final BookId bookId;
    private final InventoryId inventoryId;

    public InventoryDecreased(BookId bookId, InventoryId inventoryId) {
        this.bookId = bookId;
        this.inventoryId = inventoryId;

    }

    public BookId getBookId() {
        return bookId;
    }

    public InventoryId getInventoryId() {
        return inventoryId;
    }
}
