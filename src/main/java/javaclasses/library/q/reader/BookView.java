package javaclasses.library.q.reader;

import javaclasses.library.c.book.Author;
import javaclasses.library.c.book.BookTitle;
import javaclasses.library.c.book.ImageURL;
import javaclasses.library.q.BookStatus;

import java.util.List;

public class BookView {
    private final ImageURL imageURL;
    private final BookTitle title;
    private final List<Author> author;
    private final BookStatus status;

    public BookView(ImageURL imageURL, BookTitle title, List<Author> author, BookStatus status) {
        this.imageURL = imageURL;
        this.title = title;
        this.author = author;
        this.status = status;
    }
}
