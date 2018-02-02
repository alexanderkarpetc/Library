package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.InventoryItemId;
import javaclasses.library.c.inventory.WriteBookOffReason;

import java.util.Date;

/**
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
