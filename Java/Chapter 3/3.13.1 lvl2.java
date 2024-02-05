import java.util.Scanner;

public class ReplaceStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String foodFields;
		String convertedFoodFields;
      
      foodFields = scnr.nextLine();

      convertedFoodFields = foodFields.replace("lemon", "coffee");

      System.out.println(convertedFoodFields);
   }
}
