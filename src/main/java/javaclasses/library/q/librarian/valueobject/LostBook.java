package javaclasses.library.q.librarian.valueobject;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.Author;
import javaclasses.library.c.book.BookTitle;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;
import java.util.List;

public class LostBook {
    private final InventoryItemId inventoryItemId;
    private final BookTitle bookTitle;
    private final List<Author> authors;
    private final UserId userId;
    private final Date reportedOn;

    public LostBook(InventoryItemId inventoryItemId, BookTitle bookTitle, List<Author> authors, UserId userId, Date reportedOn) {
        this.inventoryItemId = inventoryItemId;
        this.bookTitle = bookTitle;
        this.authors = authors;
        this.userId = userId;
        this.reportedOn = reportedOn;
    }
}
