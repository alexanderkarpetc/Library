package javaclasses.library.q.librarian;

import javaclasses.library.c.ItemStatus;
import javaclasses.library.c.UserId;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class BookCompactHistory {

    private final Map<ItemStatus, InventoryItemId> borrowedBooks;
    private final List<UserId> userIds;
    private final List<Date> takeOnDates;
    private final List<Date> dueOnDates;

    public BookCompactHistory(Map<ItemStatus, InventoryItemId> borrowedBooks, List<UserId> userIds, List<Date> takeOnDates, List<Date> dueOnDates) {
        this.borrowedBooks = borrowedBooks;
        this.userIds = userIds;
        this.takeOnDates = takeOnDates;
        this.dueOnDates = dueOnDates;
    }

}
