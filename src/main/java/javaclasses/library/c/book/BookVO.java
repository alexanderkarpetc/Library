package javaclasses.library.c.book;

import java.util.List;

public class BookVO {
    final private BookId id;
    final private BookDescription description;
    final private List<String> category;

    public BookVO(BookId id, BookDescription description, List<String> category) {
        this.id = id;
        this.description = description;
        this.category = category;
    }


}
