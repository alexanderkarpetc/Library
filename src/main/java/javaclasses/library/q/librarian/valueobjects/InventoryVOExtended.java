package javaclasses.library.q.librarian.valueobjects;



import java.util.List;

public class InventoryVOExtended {

    private final List<LoanVO> loans;
  
 public InventoryVOExtended(List<LoanVO> loans){
   this.loans = loans;
 }
}
