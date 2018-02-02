package javaclasses.library.c.book.command;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookDetails;
import javaclasses.library.c.book.BookId;

import java.util.Date;

public class AddBook {
    //todo [dima] isbn
    private final BookId bookId;
    private final BookDetails book;

    public AddBook(BookId bookId, BookDetails book) {
        this.bookId = bookId;
        this.book = book;
    }
}
