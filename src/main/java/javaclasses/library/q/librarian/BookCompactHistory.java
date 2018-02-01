package javaclasses.library.q.librarian;


import javaclasses.library.q.librarian.valueobject.LoanVO;

import java.util.List;

public class BookCompactHistory {
    private final List<LoanVO> loans;

    public BookCompactHistory(List<LoanVO> loans) {
        this.loans = loans;
    }
}
