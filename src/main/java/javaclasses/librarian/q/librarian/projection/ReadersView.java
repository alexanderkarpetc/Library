package javaclasses.librarian.q.librarian.projection;

import javaclasses.librarian.q.librarian.UserDetails;

import java.util.List;

/**
 * Library users and their summary.
 */
public class ReadersView {
    private final List<UserDetails> users;

    public ReadersView(List<UserDetails> users) {
        this.users = users;
    }
}
