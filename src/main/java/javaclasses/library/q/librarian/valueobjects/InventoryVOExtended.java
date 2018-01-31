package javaclasses.library.q.librarian.valueobjects;

import javaclasses.library.c.ItemStatus;
import javaclasses.library.c.book.Author;
import javaclasses.library.c.book.BookTitle;
import javaclasses.library.c.inventory.InventoryItemId;

import java.util.List;
import java.util.Map;

public class InventoryVOExtended {

    private final List<LoanVO> loans;
  
 public InventoryVOExtended(List<LoanVO> loans){
   this.loans = loans;
 }
}
