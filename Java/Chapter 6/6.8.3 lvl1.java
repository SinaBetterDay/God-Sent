import java.util.Scanner;

public class Library {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String articleTitle;
      String articleAuthor;
      int articleYear;
   
      articleTitle = scnr.next();
      articleAuthor = scnr.next();
      articleYear = scnr.nextInt();

      Article article1 = new Article();
      Article article2 = new Article(articleTitle, articleAuthor);
      Article article3 = new Article(articleTitle, articleAuthor, articleYear);

      article1.print();
      article2.print();
      article3.print();
   }
}
