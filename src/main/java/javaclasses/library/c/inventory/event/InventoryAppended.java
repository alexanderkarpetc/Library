package javaclasses.library.c.inventory.event;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

/**
 * Appended book becomes or ready to pickup for the user who borrowed it or available.
 */
public class InventoryAppended {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    private final UserId librarianId;
    private final Date whenAppended;

    public InventoryAppended(InventoryId inventoryId, InventoryItemId inventoryItemId, UserId librarianId, Date whenAppended) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.librarianId = librarianId;
        this.whenAppended = whenAppended;
    }
}
