package javaclasses.library.q.librarian.valueobjects;

import javaclasses.library.c.UserId;

public class UserVO {
    private final UserId userId;
    private final String userName;
    private final int currentlyReading;
    private final int reservations;
    private final int overdue;

    public UserVO(UserId userId, String userName, int currentlyReading, int reservations, int overdue) {
        this.userId = userId;
        this.userName = userName;
        this.currentlyReading = currentlyReading;
        this.reservations = reservations;
        this.overdue = overdue;
    }
}
