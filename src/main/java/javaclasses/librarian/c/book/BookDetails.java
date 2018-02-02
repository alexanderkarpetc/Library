package javaclasses.librarian.c.book;

import java.util.Collection;

public class BookDetails {

    private final BookCoverURL cover;
    private final BookTitle title;
    private final Collection<Author> authors;
    private final BookDescription description;
    private final Collection<Category> categories;

    public BookDetails(BookCoverURL cover, BookTitle title, Collection<Author> authors, BookDescription description, Collection<Category> categories) {
        this.cover = cover;
        this.title = title;
        this.authors = authors;
        this.description = description;
        this.categories = categories;
    }
}
