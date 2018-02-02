package javaclasses.library.c.inventory.command;

import javaclasses.library.c.inventory.InventoryId;
import javaclasses.library.c.inventory.InventoryItemId;
import javaclasses.library.c.inventory.RFID;

/**
 * Append item to the book inventory.
 *
 * <p>In case of a successful command propagation,
 * appended book becomes available or ready to pickup for the user who borrowed it.
 */
public class AppendInventory {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    /**
     * Optional field: exists when book has RFID mark.
     */
    private final RFID rfid;

    public AppendInventory(InventoryId inventoryId, InventoryItemId inventoryItemId, RFID rfid) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.rfid = rfid;
    }
}
