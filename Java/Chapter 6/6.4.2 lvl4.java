public class Money {
   private int cents;

   public void setCents(int inputCents) {
      cents = inputCents;
   }
   
   public int getCents() {
      return cents;
   }

   public int convertToDollars() {
      return cents / 100;
   }

   public void printInDollars() {
      System.out.println(convertToDollars() + " dollars");
   }
}
