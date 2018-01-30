
package javaclasses.library.c;

public class ItemStatus {
    private UserId userId;
    private final ItemCondition condition;

    public ItemStatus(ItemCondition condition) {
        this.condition = condition;
    }

    public ItemStatus(UserId userId, ItemCondition condition) {
        this.userId = userId;
        this.condition = condition;
    }

    public UserId getUserId() {
        return userId;
    }

    public ItemCondition getCondition() {
        return condition;
    }
}
