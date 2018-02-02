package javaclasses.library.c.book.command;

import javaclasses.library.c.book.BookDetails;
import javaclasses.library.c.book.BookId;

public class UpdateBook {

    private final BookId bookId;
    private final BookDetails newBookDetails;

    public UpdateBook(BookId bookId, BookDetails newBookDetails) {
        this.bookId = bookId;
        this.newBookDetails = newBookDetails;
    }
}
