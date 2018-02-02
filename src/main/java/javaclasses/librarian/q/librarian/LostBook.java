package javaclasses.librarian.q.librarian;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.book.Author;
import javaclasses.librarian.c.book.BookTitle;
import javaclasses.librarian.c.inventory.InventoryItemId;

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
