package javaclasses.library.q.librarian;

import javaclasses.library.c.inventory.InventoryItemAction;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Collection;

public class BookFullHistory {

    private final Collection<InventoryItemId> inventoryItemIds;
    //Todo: find another way to describe all actions that happens with item.
    private final Collection<InventoryItemAction> inventoryItemActions;

    public BookFullHistory(Collection<InventoryItemId> inventoryItemIds, Collection<InventoryItemAction> inventoryItemActions) {
        this.inventoryItemIds = inventoryItemIds;
        this.inventoryItemActions = inventoryItemActions;
    }
}
