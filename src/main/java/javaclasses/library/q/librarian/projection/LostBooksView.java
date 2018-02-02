package javaclasses.library.q.librarian.projection;

import javaclasses.library.q.librarian.LostBook;

import java.util.List;

public class LostBooksView {

    private final List<LostBook> lostBooks;

    public LostBooksView(List<LostBook> lostBooks) {
        this.lostBooks = lostBooks;
    }
}
