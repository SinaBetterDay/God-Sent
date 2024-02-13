public class Shop {
   private int numSold;
	private int numEmployees;
   private int numStock;

   public void setNumSold(int customNumSold) {
      numSold = customNumSold;
   }

	public void setNumEmployees(int customNumEmployees) {
		numEmployees = customNumEmployees;
	}

   public void setNumStock(int customNumStock) {
     numStock = customNumStock;
   }

   public int getNumSold() {
      return numSold;
   }

	public int getNumEmployees() {
		return numEmployees;
	}

   public int getNumStock() {
      return numStock;
   }
}
