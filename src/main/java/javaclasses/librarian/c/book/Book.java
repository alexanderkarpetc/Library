package javaclasses.librarian.c.book;

import java.util.Collection;


public class Book {

    private final BookId id;
    private final BookCoverURL cover;
    private final BookTitle title;
    private final Collection<Author> authors;
    private final BookDescription description;
    private final Collection<Category> categories;

    public Book(BookId id, BookCoverURL cover, BookTitle title, Collection<Author> authors, BookDescription description, Collection<Category> categories) {
        this.id = id;
        this.cover = cover;
        this.title = title;
        this.authors = authors;
        this.description = description;
        this.categories = categories;
    }
}
