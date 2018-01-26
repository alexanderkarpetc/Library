package javaclasses.library.event.book;

public class BookAdded {

    final private BookVO bookVO;


    public BookAdded(BookVO bookVO) {
        this.bookVO = bookVO;
    }

    public BookVO getBookVO() {
        return bookVO;
    }
}
