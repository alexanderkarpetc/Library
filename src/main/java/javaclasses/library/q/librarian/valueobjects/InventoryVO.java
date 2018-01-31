package javaclasses.library.q.librarian.valueobjects;

import javaclasses.library.c.book.Author;
import javaclasses.library.c.book.BookTitle;

import java.util.List;

public class InventoryVO {

    private final BookTitle bookTitle;
    private final List<Author> authors;
    private final int avaliableItems;
    private final int itemsSize;

    public InventoryVO(BookTitle bookTitle, List<Author> authors, int avaliableItems, int itemsSize) {
        this.bookTitle = bookTitle;
        this.authors = authors;
        this.avaliableItems = avaliableItems;
        this.itemsSize = itemsSize;
    }
}
