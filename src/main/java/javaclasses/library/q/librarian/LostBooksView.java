package javaclasses.library.q.librarian;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.Author;
import javaclasses.library.c.book.BookTitle;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;
import java.util.List;

public class LostBooksView {

    private InventoryItemId inventoryItemId;
    private BookTitle bookTitle;
    private List<Author> authors;
    private UserId userId;
    private Date reportedOn;

}
