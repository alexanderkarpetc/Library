package javaclasses.library.c.book;

import java.util.Collection;


public class Book {

    final private BookId id;
    final private ISBN isbn;
    final private Image cover;
    final private BookTitle title;
    private final Collection<Author> authors;
    final private BookDescription description;
    final private Collection<Category> category;

    public Book(BookId id, ISBN isbn, Image cover, BookTitle title, Collection<Author> authors, BookDescription description, Collection<Category> category) {
        this.id = id;
        this.isbn = isbn;
        this.cover = cover;
        this.title = title;
        this.authors = authors;
        this.description = description;
        this.category = category;
    }
}
