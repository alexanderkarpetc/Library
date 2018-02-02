package javaclasses.librarian.q.librarian;

import javaclasses.librarian.c.book.Author;
import javaclasses.librarian.c.book.BookTitle;

import java.util.List;

public class InventoryDetails {

    private final BookTitle bookTitle;
    private final List<Author> authors;
    private final int availableItems;
    private final int itemsSize;

    public InventoryDetails(BookTitle bookTitle, List<Author> authors, int availableItems, int itemsSize) {
        this.bookTitle = bookTitle;
        this.authors = authors;
        this.availableItems = availableItems;
        this.itemsSize = itemsSize;
    }
}
