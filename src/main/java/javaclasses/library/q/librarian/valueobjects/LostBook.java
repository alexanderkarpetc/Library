package javaclasses.library.q.librarian.valueobjects;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.Author;
import javaclasses.library.c.book.BookTitle;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;
import java.util.List;

public class LostBook {
    private InventoryItemId inventoryItemId;
    private BookTitle bookTitle;
    private List<Author> authors;
    private UserId userId;
    private Date reportedOn;
}
