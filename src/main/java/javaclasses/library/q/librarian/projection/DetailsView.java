package javaclasses.library.q.librarian.projection;

import javaclasses.library.c.book.BookDescription;
import javaclasses.library.c.book.Category;
import javaclasses.library.q.reader.BookView;

import java.time.Year;
import java.util.List;

public class DetailsView {
    private final BookView bookView;
    private final Year editionYear;
    private final BookDescription description;
    private final List<Category> categories;

    public DetailsView(BookView bookView, Year editionYear, BookDescription description, List<Category> categories) {
        this.bookView = bookView;
        this.editionYear = editionYear;
        this.description = description;
        this.categories = categories;
    }
}
