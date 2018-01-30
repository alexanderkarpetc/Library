package javaclasses.library.q.librarian;

import javaclasses.library.c.book.*;

import java.util.Collection;

public class BookAdditionView {

    private final ISBN isbn;
    private final BookTitle bookTitle;
    private final Image cover;
    private final Collection<Author> authors;
    private final Collection<Category> categories;
    private final BookDescription bookDescription;


    public BookAdditionView(ISBN isbn, BookTitle bookTitle, Image cover, Collection<Author> authors, Collection<Category> categories, BookDescription bookDescription) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.cover = cover;
        this.authors = authors;
        this.categories = categories;
        this.bookDescription = bookDescription;
    }
}
