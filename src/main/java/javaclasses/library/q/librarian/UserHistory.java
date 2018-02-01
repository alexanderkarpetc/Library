package javaclasses.library.q.librarian;

import javaclasses.library.c.book.BookTitle;
import javaclasses.library.q.librarian.valueobject.LoanVO;

import java.util.Map;

public class UserHistory {
    private final Map<LoanVO, BookTitle> loans;

    public UserHistory(Map<LoanVO, BookTitle> loans) {
        this.loans = loans;
    }
}
