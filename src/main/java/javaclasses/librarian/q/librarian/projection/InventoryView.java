package javaclasses.librarian.q.librarian.projection;

import javaclasses.librarian.q.librarian.InventoryDetails;

import java.util.List;

/**
 * {@code InventoryView} there are first view that appears for librarian.
 * <p>
 * <br>This view presents like a table with all books that library has.
 * <br>In the highest part of table the books that have overdue items.
 * <br>On this view librarian can remove book, edit it, or move to book details.
 */
public class InventoryView {

    private final List<InventoryDetails> books;

    public InventoryView(List<InventoryDetails> books) {
        this.books = books;
    }
}
