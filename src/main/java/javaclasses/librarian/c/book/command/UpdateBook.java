package javaclasses.librarian.c.book.command;

import javaclasses.librarian.c.book.BookDetails;
import javaclasses.librarian.c.book.BookId;

/**
 * A command to update a new book.
 */
public class UpdateBook {

    private final BookId bookId;
    private final BookDetails newBookDetails;

    public UpdateBook(BookId bookId, BookDetails newBookDetails) {
        this.bookId = bookId;
        this.newBookDetails = newBookDetails;
    }
}
