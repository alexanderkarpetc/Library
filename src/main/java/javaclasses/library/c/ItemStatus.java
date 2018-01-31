
package javaclasses.library.c;

public class ItemStatus {
    private final UserId userId;
    private final ItemCondition condition;

    public ItemStatus(UserId userId, ItemCondition condition) {
        this.userId = userId;
        this.condition = condition;
    }
}
