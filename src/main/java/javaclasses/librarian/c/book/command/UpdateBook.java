package javaclasses.librarian.c.book.command;

import javaclasses.librarian.c.book.BookDetails;
import javaclasses.librarian.c.book.BookId;

/**
 * An attempt to update the book.
 *
 * <p>In case of a successful command propagation, the book is updated.
 * <p>Cannot be applied to the missing book.
 */
public class UpdateBook {

    private final BookId bookId;
    private final BookDetails newBookDetails;

    public UpdateBook(BookId bookId, BookDetails newBookDetails) {
        this.bookId = bookId;
        this.newBookDetails = newBookDetails;
    }
}
