package javaclasses.library.c.book;

public class BookVO {

    private final Image cover;
    private final BookTitle title;
    private final Author author;
  
    public BookVO(Image cover, BookTitle title, Author author) {
        this.cover = cover;
        this.title = title;
        this.author = author;
    }
}
