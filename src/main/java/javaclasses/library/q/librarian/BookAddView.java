package javaclasses.library.q.librarian;

import javaclasses.library.c.book.*;

import java.time.Year;
import java.util.Collection;

public class BookAddView {

    private final BookTitle bookTitle;
    private final ImageURL cover;
    private final Collection<Author> authors;
    private final Collection<Category> categories;
    private final BookDescription bookDescription;
    private final Year editionYear;

    public BookAddView(BookTitle bookTitle, ImageURL cover, Collection<Author> authors, Collection<Category> categories, BookDescription bookDescription, Year editionYear) {
        this.bookTitle = bookTitle;
        this.cover = cover;
        this.authors = authors;
        this.categories = categories;
        this.bookDescription = bookDescription;
        this.editionYear = editionYear;
    }
}
