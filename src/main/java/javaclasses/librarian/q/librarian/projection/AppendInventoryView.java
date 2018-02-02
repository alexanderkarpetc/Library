package javaclasses.librarian.q.librarian.projection;

import javaclasses.librarian.c.inventory.InventoryId;

/**
 * Appending inventory.
 */
public class AppendInventoryView {

    private final InventoryId inventoryId;

    public AppendInventoryView(InventoryId inventoryId) {
        this.inventoryId = inventoryId;
    }
}
