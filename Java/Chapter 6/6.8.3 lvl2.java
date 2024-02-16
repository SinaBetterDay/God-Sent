public class Book {
   private String title;
	private String author;
   
   public Book() { // Default constructor
      title = "Unknown";
		author = "Unspecified";
   }

   public Book(String bookTitle, String bookAuthor) {
      title = bookTitle;
      author = bookAuthor;
   }

   public void print() {
      System.out.println("Book: " + title + ", " + author);
   }
}
