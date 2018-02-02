package javaclasses.library.q.librarian.projection;


import javaclasses.library.c.UserId;
import javaclasses.library.q.librarian.InventoryItemRecord;

import java.util.List;

public class UserHistoryExtendedView {
    private final UserId userId;
    private final List<InventoryItemRecord> action;

    public UserHistoryExtendedView(UserId userId, List<InventoryItemRecord> action) {
        this.userId = userId;
        this.action = action;
    }
}
