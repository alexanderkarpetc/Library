package javaclasses.librarian.q.librarian.projection;

import javaclasses.librarian.c.book.BookCoverURL;
import javaclasses.librarian.q.librarian.ReservationDetails;

/**
 * Reservations of the current book.
 * <p>
 * Click book details then reservation.
 */
public class ReservationView {

    private final BookCoverURL bookCoverURL;
    private final ReservationDetails reservation;

    public ReservationView(BookCoverURL bookCoverURL, ReservationDetails reservation) {
        this.bookCoverURL = bookCoverURL;
        this.reservation = reservation;
    }
}
