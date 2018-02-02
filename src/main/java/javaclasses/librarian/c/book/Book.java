package javaclasses.librarian.c.book;

public class Book {

    private final BookId id;
    private final BookDetails details;

    public Book(BookId id, BookDetails details) {
        this.id = id;
        this.details = details;
    }
}
