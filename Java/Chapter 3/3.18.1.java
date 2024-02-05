import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int totalChange = scanner.nextInt();
      
      // Calculate the number of dollars, quarters, dimes, nickels, and pennies
      int dollars = totalChange / 100;
      int remainingChange = totalChange % 100;
      
      int quarters = remainingChange / 25;
      remainingChange %= 25;
      
      int dimes = remainingChange / 10;
      remainingChange %= 10;
      
      int nickels = remainingChange / 5;
      remainingChange %= 5;
      
      int pennies = remainingChange;

      if (dollars > 0) {
         System.out.println(dollars + (dollars == 1 ? " Dollar" : " Dollars"));
      }
      if (quarters > 0) {
         System.out.println(quarters + (quarters == 1 ? " Quarter" : " Quarters"));
      }
      if (dimes > 0) {
         System.out.println(dimes + (dimes == 1 ? " Dime" : " Dimes"));
      }
      if (nickels > 0) {
         System.out.println(nickels + (nickels == 1 ? " Nickel" : " Nickels"));
      }
      if (pennies > 0) {
         System.out.println(pennies + (pennies == 1 ? " Penny" : " Pennies"));
      }
      if (pennies == 0 && nickels == 0 && dimes == 0 && quarters == 0 && dollars == 0)
      {
         System.out.println("No change");
      }
   }
}
