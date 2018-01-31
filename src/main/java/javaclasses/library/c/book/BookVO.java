package javaclasses.library.c.book;

import java.util.List;

public class BookVO {

    private final BookId id;
    private final BookDescription description;
    private final List<Category> category;

    public BookVO(BookId id, BookDescription description, List<Category> category) {
        this.id = id;
        this.description = description;
        this.category = category;
    }


}
