package javaclasses.library.q.librarian;

import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Collection;

public class InventoryAppendView {

    private final Collection<InventoryItemId> inventoryItemIds;

    public InventoryAppendView(Collection<InventoryItemId> inventoryItemIds) {
        this.inventoryItemIds = inventoryItemIds;
    }
}
