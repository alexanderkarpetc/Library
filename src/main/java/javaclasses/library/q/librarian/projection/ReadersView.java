package javaclasses.library.q.librarian.projection;

import javaclasses.library.q.librarian.UserDetails;

import java.util.List;

public class ReadersView {
    private final List<UserDetails> users;

    public ReadersView(List<UserDetails> users) {
        this.users = users;
    }
}
