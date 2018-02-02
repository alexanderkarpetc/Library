package javaclasses.library.q.librarian.projection;


import javaclasses.library.c.UserId;
import javaclasses.library.q.librarian.InventoryItemRecord;

import java.util.List;

/**
 * Full user history that includes all user events.
 *
 * Events:
 * <li>
 *     <ul>borrowed</ul>
 *     <ul>reserved</ul>
 *     <ul>loan period extended</ul>
 *     <ul>returned</ul>
 *     <ul>lost</ul>
 * </li>
 */
public class UserHistoryExtendedView {

    private final UserId userId;
    private final List<InventoryItemRecord> records;

    public UserHistoryExtendedView(UserId userId, List<InventoryItemRecord> records) {
        this.userId = userId;
        this.records = records;
    }
}
