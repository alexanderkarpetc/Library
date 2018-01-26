package javaclasses.library.Inventory;

import javaclasses.library.tinytype.BookId;
import javaclasses.library.tinytype.InventoryId;
import javaclasses.library.tinytype.UserId;

public class BookMarkedAsBorrowed {
    private final BookId bookId;
    private final InventoryId inventoryId;
    private final UserId userId;

    public BookMarkedAsBorrowed(BookId bookId, InventoryId inventoryId, UserId userId) {
        this.bookId = bookId;
        this.inventoryId = inventoryId;
        this.userId = userId;
    }

    public BookId getBookId() {
        return bookId;
    }

    public InventoryId getInventoryId() {
        return inventoryId;
    }

    public UserId getUserId() {
        return userId;
    }
}
