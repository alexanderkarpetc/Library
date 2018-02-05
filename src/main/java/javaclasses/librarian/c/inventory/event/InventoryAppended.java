package javaclasses.librarian.c.inventory.event;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryId;
import javaclasses.librarian.c.inventory.InventoryItemId;
import javaclasses.librarian.c.inventory.RFID;

import java.util.Date;

/**
 * An event fired when librarian adds new items to inventory.
 * <p>
 * Appended book becomes or ready to pickup for the user who borrowed it or available.
 */
public class InventoryAppended {

    private final InventoryId inventoryId;
    private final InventoryItemId inventoryItemId;
    /**
     * Optional field: exists when book has RFID mark.
     */
    private final RFID rfid;
    private final UserId librarianId;
    private final Date whenAppended;

    public InventoryAppended(InventoryId inventoryId, InventoryItemId inventoryItemId, RFID rfid, UserId librarianId, Date whenAppended) {
        this.inventoryId = inventoryId;
        this.inventoryItemId = inventoryItemId;
        this.rfid = rfid;
        this.librarianId = librarianId;
        this.whenAppended = whenAppended;
    }
}
