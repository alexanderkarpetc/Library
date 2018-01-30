package javaclasses.library.c.inventory;

public class InventoryItemId {

    private final InventoryId inventoryId;
    private final String personalItemId;

    public InventoryItemId(InventoryId inventoryId, String personalItemId) {
        this.inventoryId = inventoryId;
        this.personalItemId = personalItemId;
    }
}
