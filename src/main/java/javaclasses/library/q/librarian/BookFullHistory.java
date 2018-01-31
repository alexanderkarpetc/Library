package javaclasses.library.q.librarian;

import javaclasses.library.c.book.Image;

import java.util.Collection;

public class BookFullHistory {
    private final Image image;
    private final Collection<InventoryItemAction> inventoryItemActions;

    public BookFullHistory(Image image, Collection<InventoryItemAction> inventoryItemActions) {
        this.image = image;
        this.inventoryItemActions = inventoryItemActions;
    }
}
