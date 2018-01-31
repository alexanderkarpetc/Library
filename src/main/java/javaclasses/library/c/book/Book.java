package javaclasses.library.c.book;

import java.util.Collection;


public class Book {

    private final BookId id;
    private final ISBN isbn;
    private final Image cover;
    private final BookTitle title;
    private final Collection<Author> authors;
    private final BookDescription description;
    private final Collection<Category> category;

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
