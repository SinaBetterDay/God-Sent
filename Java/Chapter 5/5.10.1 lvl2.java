import java.util.Scanner;

public class FamilySize {
   public static void printFamilySize(String familySize) {
      System.out.println("The family has " + familySize + " people.");
   }

   public static void printFamilySize(int familySize)
   {
      System.out.println("Headcount provided: " + familySize);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String sizeInWord;
      int sizeOfFamily;
      
      sizeInWord = scnr.next();
      sizeOfFamily = scnr.nextInt();
      
      printFamilySize(sizeInWord);
      printFamilySize(sizeOfFamily);
   }
}
