package javaclasses.library.q.librarian;

import javaclasses.library.q.librarian.valueobjects.LostBook;

import java.util.List;

public class LostBooksView {

    private final List<LostBook> lostBooks;

    public LostBooksView(List<LostBook> lostBooks) {
        this.lostBooks = lostBooks;
    }
}
