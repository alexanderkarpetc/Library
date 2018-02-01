package javaclasses.library.q.librarian.valueobject;

import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;

public class LoanVO {

    private final InventoryItemId inventoryItemId;
    private final UserId userId;
    private final Date takeOnDate;
    private final Date dueOnDate;

    public LoanVO(InventoryItemId inventoryItemId, UserId userId, Date takeOnDate, Date dueOnDate) {
        this.inventoryItemId = inventoryItemId;
        this.userId = userId;
        this.takeOnDate = takeOnDate;
        this.dueOnDate = dueOnDate;
    }
}
