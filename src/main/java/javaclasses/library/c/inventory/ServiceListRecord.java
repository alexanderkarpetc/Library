package javaclasses.library.c.inventory;

import javaclasses.library.c.UserId;

public class ServiceListRecord {
    private InventoryItemId inventoryItemId;
    private ItemStatus status;
    /**
     * Optional field: exists if item is borrowed(then user is the current reader) or if
     * item is ready to pickup(then user is the person who has 2 days to take it).
     */
    private UserId userId;


    private enum ItemStatus {
        BORROWED,
        READY_TO_PICKUP,
        AVAILABLE,
    }
}
