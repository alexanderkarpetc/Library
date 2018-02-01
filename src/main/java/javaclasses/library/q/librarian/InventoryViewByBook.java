package javaclasses.library.q.librarian;

import javaclasses.library.q.librarian.valueobject.InventoryVO;
import javaclasses.library.q.librarian.valueobject.LoanVO;

import java.util.List;

public class InventoryViewByBook {

    private final InventoryVO inventory;
    private final List<LoanVO> loan;

    public InventoryViewByBook(InventoryVO inventory, List<LoanVO> loan) {
        this.inventory = inventory;
        this.loan = loan;
    }
}
