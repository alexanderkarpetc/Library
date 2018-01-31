package javaclasses.library.q.reader;

import javaclasses.library.c.book.BookDescription;
import javaclasses.library.c.book.ISBN;

/**
 * Pop-up after click the book.
 */
public class BookDetails {
    private final ISBN isbn;
    private final BookView bookView;
    private final BookDescription description;

    public BookDetails(ISBN isbn, BookView bookView, BookDescription description) {
        this.isbn = isbn;
        this.bookView = bookView;
        this.description = description;
    }
}
