package javaclasses.librarian.c.inventory.command;

import javaclasses.librarian.c.inventory.InventoryItemId;
import javaclasses.librarian.c.inventory.WriteBookOffReason;

import java.util.Date;

/**
 * An attempt to write off the book.
 * <p>
 * In case of a successful command propagation, the book is written off.
 * Cannot be applied to the missing book.
 */
public class WriteBookOf {

    private final InventoryItemId inventoryItemId;
    private final WriteBookOffReason reason;
    private final Date whenWritenOff;

    public WriteBookOf(InventoryItemId inventoryItemId, WriteBookOffReason reason, Date whenWritenOff) {
        this.inventoryItemId = inventoryItemId;
        this.reason = reason;
        this.whenWritenOff = whenWritenOff;
    }
}
