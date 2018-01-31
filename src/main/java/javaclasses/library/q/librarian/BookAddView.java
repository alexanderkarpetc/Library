package javaclasses.library.q.librarian;

import javaclasses.library.c.book.*;

import java.time.Year;
import java.util.Collection;

public class BookAddView {

    private final ISBN isbn;
    private final BookTitle bookTitle;
    private final Image cover;
    private final Collection<Author> authors;
    private final Collection<Category> categories;
    private final BookDescription bookDescription;
    private final Year editionYear;

    public BookAddView(ISBN isbn, BookTitle bookTitle, Image cover, Collection<Author> authors, Collection<Category> categories, BookDescription bookDescription, Year editionYear) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.cover = cover;
        this.authors = authors;
        this.categories = categories;
        this.bookDescription = bookDescription;
        this.editionYear = editionYear;
    }
}
