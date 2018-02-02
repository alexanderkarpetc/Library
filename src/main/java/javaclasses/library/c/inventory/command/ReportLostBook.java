package javaclasses.library.c.inventory.command;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryItemId;

/**
 * An attempt to report the lost book.
 *
 * <p>In case of a successful command propagation, the book is reported as lost.
 */
public class ReportLostBook {

    private final InventoryItemId inventoryItemId;
    private final UserId whoLost;

    public ReportLostBook(InventoryItemId inventoryItemId, UserId whoLost) {
        this.inventoryItemId = inventoryItemId;
        this.whoLost = whoLost;
    }
}
