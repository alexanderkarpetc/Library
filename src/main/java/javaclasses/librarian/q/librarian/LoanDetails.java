package javaclasses.librarian.q.librarian;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.inventory.InventoryItemId;

import java.util.Date;

public class LoanDetails {

    private final InventoryItemId inventoryItemId;
    private final UserId userId;
    private final Date whenTaken;
    private final Date whenDue;

    public LoanDetails(InventoryItemId inventoryItemId, UserId userId, Date whenTaken, Date whenDue) {
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
        this.whenTaken = whenTaken;
        this.whenDue = whenDue;
    }
}
