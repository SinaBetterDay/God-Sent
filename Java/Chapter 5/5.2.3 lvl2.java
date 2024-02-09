import java.util.Scanner;

public class ShoppingList {

   public static void printShoppingList(String food1, String food2, String food3)
   {
      System.out.println("To buy:\n1) " + food1 + "\n2) " + food2 + "\n3) " + food3);
   }

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String food1;
		String food2;
		String food3;

		food1 = scnr.next();
		food2 = scnr.next();
		food3 = scnr.next();

		printShoppingList(food1, food2, food3);
	}
}
