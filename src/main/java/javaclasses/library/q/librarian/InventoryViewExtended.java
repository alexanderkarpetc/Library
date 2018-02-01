package javaclasses.library.q.librarian;

import javaclasses.library.q.librarian.valueobject.LoanVO;

import java.util.List;

public class InventoryViewExtended {

    private final List<LoanVO> loans;


    public InventoryViewExtended(List<LoanVO> loans) {
        this.loans = loans;
    }
}
