package javaclasses.librarian.q.librarian.projection;

import javaclasses.librarian.c.book.BookCoverURL;
import javaclasses.librarian.q.librarian.InventoryItemRecord;

import java.util.Collection;

/**
 * {@code BookFullHistory} there are view with full information about book’s record.
 * <p>
 * On this screen librarian see all users that borrow book, reserve, lost, return, or extend loan period
 * with date of every record.
 */
public class BookFullHistory {

    private final BookCoverURL bookCoverURL;
    private final Collection<InventoryItemRecord> inventoryItemRecords;

    public BookFullHistory(BookCoverURL bookCoverURL, Collection<InventoryItemRecord> inventoryItemRecords) {
        this.bookCoverURL = bookCoverURL;
        this.inventoryItemRecords = inventoryItemRecords;
    }
}
