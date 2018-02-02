package javaclasses.library.q.librarian.projection;

import javaclasses.library.c.book.BookCoverURL;
import javaclasses.library.q.librarian.InventoryDetails;
import javaclasses.library.q.librarian.LoanDetails;

import java.util.List;

/**
 * Inventory state of the current book.
 *
 * Click book details then inventory.
 */
public class InventoryByBookView {

    private final BookCoverURL bookCoverURL;
    private final InventoryDetails inventory;
    private final List<LoanDetails> loan;

    public InventoryByBookView(BookCoverURL bookCoverURL, InventoryDetails inventory, List<LoanDetails> loan) {
        this.bookCoverURL = bookCoverURL;
        this.inventory = inventory;
        this.loan = loan;
    }
}
