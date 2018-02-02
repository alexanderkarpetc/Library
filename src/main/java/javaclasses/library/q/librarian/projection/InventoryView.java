package javaclasses.library.q.librarian.projection;

import javaclasses.library.q.librarian.InventoryDetails;

import java.util.List;

//Todo [dima]
public class InventoryView {

    private final List<InventoryDetails> books;

    public InventoryView(List<InventoryDetails> books) {
        this.books = books;
    }
}
