package javaclasses.library.c.book;

import java.util.Collection;
//Todo: rename to describe semantic of class.
public class BookVO {

    private final ImageURL cover;
    private final BookTitle title;
    private final Collection<Author> authors;
    private final BookDescription description;
    private final Collection<Category> categories;

    public BookVO(ImageURL cover, BookTitle title, Collection<Author> authors, BookDescription description, Collection<Category> categories) {
        this.cover = cover;
        this.title = title;
        this.authors = authors;
        this.description = description;
        this.categories = categories;
    }
}
