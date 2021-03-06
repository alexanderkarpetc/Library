package javaclasses.librarian.q.librarian.projection;

import javaclasses.librarian.q.librarian.LostBook;

import java.util.List;

/**
 * Full lost books list.
 */
public class LostBooksView {

    private final List<LostBook> lostBooks;

    public LostBooksView(List<LostBook> lostBooks) {
        this.lostBooks = lostBooks;
    }
}
