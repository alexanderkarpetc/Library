package javaclasses.librarian.q.librarian;

import javaclasses.librarian.c.UserId;
import javaclasses.librarian.c.book.Author;
import javaclasses.librarian.c.book.BookTitle;

import java.util.Date;
import java.util.List;

public class ReservationDetails {

    private final BookTitle title;
    private final List<Author> authors;
    private final UserId userId;
    private final Date madeON;

    public ReservationDetails(BookTitle title, List<Author> authors, UserId userId, Date madeON) {
        this.title = title;
        this.authors = authors;
        this.userId = userId;
        this.madeON = madeON;
    }

}
