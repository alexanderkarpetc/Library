package javaclasses.library.q.librarian.projection;

import javaclasses.library.c.book.BookCoverURL;
import javaclasses.library.q.librarian.InventoryItemRecord;

import java.util.Collection;

public class BookFullHistory {

    private final BookCoverURL bookCoverURL;
    private final Collection<InventoryItemRecord> inventoryItemRecords;

    public BookFullHistory(BookCoverURL bookCoverURL, Collection<InventoryItemRecord> inventoryItemRecords) {
        this.bookCoverURL = bookCoverURL;
        this.inventoryItemRecords = inventoryItemRecords;
    }
}
