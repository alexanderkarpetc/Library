package javaclasses.library.q.librarian;

import javaclasses.library.c.book.ImageURL;

import java.util.Collection;

public class BookFullHistory {
    private final ImageURL imageURL;
    private final Collection<InventoryItemAction> inventoryItemActions;

    public BookFullHistory(ImageURL imageURL, Collection<InventoryItemAction> inventoryItemActions) {
        this.imageURL = imageURL;
        this.inventoryItemActions = inventoryItemActions;
    }
}
