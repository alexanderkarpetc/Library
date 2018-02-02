package javaclasses.library.c.book.command;

import javaclasses.library.c.book.BookDetails;
import javaclasses.library.c.book.ISBN;

/**
 * A command to create a new book.
 */
public class AddBook {

    /**
     * We pass the ISBN of which will be generated {@code BookId};
     */
    private final ISBN isbn;
    private final BookDetails book;

    public AddBook(ISBN isbn, BookDetails book) {
        this.isbn = isbn;
        this.book = book;
    }
}
