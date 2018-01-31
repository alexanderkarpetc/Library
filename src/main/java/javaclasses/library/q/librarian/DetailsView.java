package javaclasses.library.q.librarian;

import javaclasses.library.c.book.BookDescription;
import javaclasses.library.c.book.Category;
import javaclasses.library.c.book.ISBN;
import javaclasses.library.q.reader.BookView;

import java.time.Year;
import java.util.List;

public class DetailsView {
    private final BookView bookView;
    private final ISBN isbn;
    private final Year editionYear;
    private final BookDescription description;
    private final List<Category> categories;

    public DetailsView(BookView bookView, ISBN isbn, Year editionYear, BookDescription description, List<Category> categories) {
        this.bookView = bookView;
        this.isbn = isbn;
        this.editionYear = editionYear;
        this.description = description;
        this.categories = categories;
    }
}
