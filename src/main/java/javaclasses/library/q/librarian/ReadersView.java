package javaclasses.library.q.librarian;

import javaclasses.library.q.librarian.valueobject.UserDetails;

import java.util.List;

public class ReadersView {
    private final List<UserDetails> users;

    public ReadersView(List<UserDetails> users) {
        this.users = users;
    }
}
