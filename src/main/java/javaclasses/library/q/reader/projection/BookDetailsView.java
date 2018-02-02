package javaclasses.library.q.reader.projection;

import javaclasses.library.c.book.BookDescription;
import javaclasses.library.q.reader.BookView;

/**
 * Pop-up after click the book.
 */
public class BookDetailsView {

    private final BookView bookView;
    private final BookDescription description;

    public BookDetailsView(BookView bookView, BookDescription description) {
        this.bookView = bookView;
        this.description = description;
    }
}
