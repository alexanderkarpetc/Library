package javaclasses.library.q.librarian;


import javaclasses.library.c.UserId;

import java.util.List;

public class UserHistoryExtendedView {
    private final UserId userId;
    private final List<InventoryItemRecord> action;

    public UserHistoryExtendedView(UserId userId, List<InventoryItemRecord> action) {
        this.userId = userId;
        this.action = action;
    }
}
