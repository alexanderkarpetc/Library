package javaclasses.library.q.librarian;

import java.util.List;

public class InventoryView {

    private final List<InventoryDetails> books;

    public InventoryView(List<InventoryDetails> books) {
        this.books = books;
    }
}
