package javaclasses.library.q.librarian;

import javaclasses.library.q.librarian.valueobject.InventoryVO;

import java.util.List;

public class InventoryView {

    private final List<InventoryVO> books;

    public InventoryView(List<InventoryVO> books) {
        this.books = books;
    }
}
