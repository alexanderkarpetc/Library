package javaclasses.library.q.librarian;

import javaclasses.library.c.book.BookCoverURL;
import javaclasses.library.q.librarian.valueobject.ReservationDetails;

public class ReservationView {

    private final BookCoverURL bookCoverURL;
    private final ReservationDetails reservation;

    public ReservationView(BookCoverURL bookCoverURL, ReservationDetails reservation) {
        this.bookCoverURL = bookCoverURL;
        this.reservation = reservation;
    }
}
