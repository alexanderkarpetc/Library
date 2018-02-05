package javaclasses.librarian.c.inventory.event;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;
import javaclasses.librarian.c.inventory.InventoryItemId;
import javaclasses.librarian.c.inventory.WriteBookOffReason;

import java.util.Date;

/**
 * An event when librarian decreases current inventory.
 * <p>
 * Can cancel reservation if it is the last one in current inventory.
 */
public class InventoryDecreased {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId librarianId;
    private final Date whenDecreased;
    /**
     * Book can be lost or outdated.
     */
    private final WriteBookOffReason reason;

    public InventoryDecreased(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId librarianId, Date whenDecreased, WriteBookOffReason reason) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.librarianId = librarianId;
        this.whenDecreased = whenDecreased;
        this.reason = reason;
    }
}
