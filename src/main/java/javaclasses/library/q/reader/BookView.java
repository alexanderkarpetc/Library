package javaclasses.library.q.reader;

import javaclasses.library.c.book.Author;
import javaclasses.library.c.book.BookTitle;
import javaclasses.library.c.book.BookCoverURL;

import java.util.List;

public class BookView {

    private final BookCoverURL bookCoverURL;
    private final BookTitle title;
    private final List<Author> author;
    private final BookStatus status;

    public BookView(BookCoverURL bookCoverURL, BookTitle title, List<Author> author, BookStatus status) {
        this.bookCoverURL = bookCoverURL;
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public enum BookStatus {
        BORROWED,
        RESERVED,
        AVAILABLE,
        EXPECTED_SOON,
        OVERDUE
    }
}
