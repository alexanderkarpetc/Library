package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookRemoveReason;
import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

public class InventoryDecreased {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId librarianId;
    private final Date whenDecreased;
    private final BookRemoveReason reason;

    public InventoryDecreased(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId librarianId, Date whenDecreased, BookRemoveReason reason) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.librarianId = librarianId;
        this.whenDecreased = whenDecreased;
        this.reason = reason;
    }
}
