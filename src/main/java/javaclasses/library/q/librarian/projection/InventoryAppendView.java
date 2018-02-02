package javaclasses.library.q.librarian.projection;

import javaclasses.library.c.inventory.InventoryId;

/**
 * Appending inventory.
 */
public class InventoryAppendView {

    private final InventoryId inventoryId;

    public InventoryAppendView(InventoryId inventoryId) {
        this.inventoryId = inventoryId;
    }
}
