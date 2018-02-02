package javaclasses.librarian.c.book.command;

import javaclasses.librarian.c.book.BookDetails;
import javaclasses.librarian.c.book.ISBN;

/**
 * An attempt to create the new book.
 *
 * <p>In case of a successful command propagation, the book is added.
 * <p>Cannot be applied to the existing book.
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
