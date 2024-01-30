import java.util.Scanner;

public class CheesecakePurchases {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numCheesecakes;
      int dollarAmount;
      
      numCheesecakes = scnr.nextInt();
      dollarAmount = scnr.nextInt();

      if (numCheesecakes >= 4)
      {
         int totalCost = numCheesecakes * 7;
         if (totalCost <= dollarAmount)
         {
            System.out.println("Successful purchase!");
         }
         else
         {
            System.out.println("Not enough money to buy all.");
         }
         if (dollarAmount >= 7)
         {
            System.out.println("At least one item was purchased.");
         }
      }
      
      if (numCheesecakes > 33)
      {
         System.out.println("Now out of stock.");
      }
   }
}
