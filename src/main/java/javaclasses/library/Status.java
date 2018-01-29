package javaclasses.library;

import javaclasses.library.tinytype.UserId;

public class Status {
    private UserId userId;
    private final Condition condition;

    public Status(Condition condition) {
        this.condition = condition;
    }

    public Status(UserId userId, Condition condition) {
        this.userId = userId;
        this.condition = condition;
    }

    public UserId getUserId() {
        return userId;
    }

    public Condition getCondition() {
        return condition;
    }
}
