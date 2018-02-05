package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;
import javaclasses.librarian.c.inventory.InventoryItemId;

import java.util.Date;

/**
 * An attempt to report the lost book.
 * <p>
 * In case of a successful command propagation, the book is reported as lost.
 */
public class ReportLostBook {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId whoLost;
    private final Date whenReported;

    public ReportLostBook(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId whoLost, Date whenReported) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.whoLost = whoLost;
        this.whenReported = whenReported;
    }
}
