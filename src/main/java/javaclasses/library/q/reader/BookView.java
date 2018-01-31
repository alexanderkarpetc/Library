package javaclasses.library.q.reader;

import javaclasses.library.c.book.Author;
import javaclasses.library.c.book.BookStatus;
import javaclasses.library.c.book.BookTitle;
import javaclasses.library.c.book.Image;

import java.util.List;

public class BookView {
    private final Image image;
    private final BookTitle title;
    private final List<Author> author;
    private final BookStatus status;

    public BookView(Image image, BookTitle title, List<Author> author, BookStatus status) {
        this.image = image;
        this.title = title;
        this.author = author;
        this.status = status;
    }
}
