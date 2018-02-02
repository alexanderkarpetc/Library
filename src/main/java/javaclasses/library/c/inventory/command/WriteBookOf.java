package javaclasses.library.c.inventory.command;

import javaclasses.library.c.inventory.InventoryItemId;
import javaclasses.library.c.inventory.WriteBookOffReason;

/**
 * An attempt to write off the book.
 *
 * <p>In case of a successful command propagation, the book is written off.
 * Cannot be applied to the missing book.
 */
public class WriteBookOf {

    private final InventoryItemId inventoryItemId;
    private final WriteBookOffReason reason;

    public WriteBookOf(InventoryItemId inventoryItemId, WriteBookOffReason reason) {
        this.inventoryItemId = inventoryItemId;
        this.reason = reason;
    }
}
