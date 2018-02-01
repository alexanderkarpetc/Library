package javaclasses.library.q.librarian;

import javaclasses.library.c.book.ImageURL;
import javaclasses.library.q.librarian.valueobject.ReservationVO;

public class ReservationView {

    private final ImageURL imageURL;
    private final ReservationVO reservation;

    public ReservationView(ImageURL imageURL, ReservationVO reservation) {
        this.imageURL = imageURL;
        this.reservation = reservation;
    }
}
