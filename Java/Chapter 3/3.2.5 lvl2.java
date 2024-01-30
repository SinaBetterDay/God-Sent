import java.util.Scanner;

public class BookshelfInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numBooks;
      
      numBooks = scnr.nextInt();

      if (numBooks >= 227)
      {
         System.out.println("Too many books");
      }
      else if (numBooks >= 20)
      {
         System.out.println("Full-wall bookshelf");
      }
      else if (numBooks >= 1)
      {
         System.out.println("One-level bookshelf");
      }
      else
      {
         System.out.println("Invalid input");
      }

   }
}
