package javaclasses.library.q.reader;

import javaclasses.library.c.book.BookDescription;

/**
 * Pop-up after click the book.
 */
public class BookDetails {
    private final BookView bookView;
    private final BookDescription description;

    public BookDetails(BookView bookView, BookDescription description) {
        this.bookView = bookView;
        this.description = description;
    }
}
