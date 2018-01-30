package javaclasses.library.q.librarian;

import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Collection;

public class InventoryAppendView {

    public InventoryAppendView(Collection<InventoryItemId> inventoryItemIds) {
        this.inventoryItemIds = inventoryItemIds;
    }

    private final Collection<InventoryItemId> inventoryItemIds;
}
