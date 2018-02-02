package javaclasses.librarian.q.librarian.projection;

import javaclasses.librarian.c.book.BookDescription;
import javaclasses.librarian.c.book.Category;
import javaclasses.librarian.q.reader.BookView;

import java.time.Year;
import java.util.List;

/**
 * Click on details in inventory.
 */
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
