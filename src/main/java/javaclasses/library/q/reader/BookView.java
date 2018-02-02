package javaclasses.library.q.reader;

import javaclasses.library.c.book.Author;
import javaclasses.library.c.book.BookTitle;
import javaclasses.library.c.book.BookCoverURL;
import javaclasses.library.q.BookStatus;

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
}
