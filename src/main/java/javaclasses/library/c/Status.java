
package javaclasses.library.c;

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
}
