package javaclasses.library.q.librarian.valueobjects;

import javaclasses.library.c.ItemStatus;
import javaclasses.library.c.book.Author;
import javaclasses.library.c.book.BookTitle;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.List;
import java.util.Map;

public class InventoryVOExtended {

    private final BookTitle bookTitle;
    private final List<Author> authors;
    private final int avaliableItems;
    private final int itemsSize;
    private final Map<InventoryItemId, ItemStatus> items;

    public InventoryVOExtended(BookTitle bookTitle, List<Author> authors, int avaliableItems, int itemsSize, Map<InventoryItemId, ItemStatus> items) {
        this.bookTitle = bookTitle;
        this.authors = authors;
        this.avaliableItems = avaliableItems;
        this.itemsSize = itemsSize;
        this.items = items;
    }
}
