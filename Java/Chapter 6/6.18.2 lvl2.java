public class Order {
   private static int lastTicket = 700;
   private String food;
	private int ticket;
   
   public Order(String newFood) {
      lastTicket -= 2;
		food = newFood;
		ticket = lastTicket;
   }
	
	public void print() {
		System.out.println(food + "'s ticket is " + ticket + ".");
	}

   public static int getLastTicket() {
      return lastTicket;
   }
}
