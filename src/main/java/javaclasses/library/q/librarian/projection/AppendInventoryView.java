package javaclasses.library.q.librarian.projection;

import javaclasses.library.c.inventory.InventoryId;

/**
 * Appending inventory.
 */
public class AppendInventoryView {

    private final InventoryId inventoryId;

    public AppendInventoryView(InventoryId inventoryId) {
        this.inventoryId = inventoryId;
    }
}
