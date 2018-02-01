package javaclasses.library.q.librarian;

import javaclasses.library.c.inventory.InventoryItemId;
import javaclasses.library.c.inventory.RFID;

import java.util.Map;
import java.util.Optional;

public class InventoryAppendView {
    private final Map<InventoryItemId, Optional<RFID>> newItems;

    public InventoryAppendView(Map<InventoryItemId, Optional<RFID>> newItems) {
        this.newItems = newItems;
    }
}
