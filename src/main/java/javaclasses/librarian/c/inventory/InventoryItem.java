package javaclasses.librarian.c.inventory;

import javaclasses.librarian.c.UserId;

public class InventoryItem {
    private InventoryItemId inventoryItemId;
    private ItemStatus status;
    /**
     * Optional field: exists if item is borrowed (then user is the current reader), or if
     * item is ready to pickup(then user is the person who has 2 days to take it), or
     * if lost (then user is the person who lost it).
     */
    private UserId userId;

    private enum ItemStatus {
        IN_LIBRARY,
        BORROWED,
        LOST
    }
}
