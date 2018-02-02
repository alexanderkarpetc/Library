package javaclasses.librarian.q.reader;

import javaclasses.librarian.c.book.Author;
import javaclasses.librarian.c.book.BookCoverURL;
import javaclasses.librarian.c.book.BookTitle;

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
