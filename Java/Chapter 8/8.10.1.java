/*Given main() and a base Book class, define a derived class called Encyclopedia with member methods to get and set private fields of the following types:

String to store the edition
int to store the number of pages
Within the derived Encyclopedia class, define a printInfo() method that overrides the Book class' printInfo() method by printing the title, author, publisher, publication date, edition, and number of pages.

Ex. If the input is:

The Hobbit
J. R. R. Tolkien
George Allen & Unwin
21 September 1937
The Illustrated Encyclopedia of the Universe
Ian Ridpath
Watson-Guptill
2001
2nd
384
the output is:

Book Information: 
   Book Title: The Hobbit
   Author: J. R. R. Tolkien
   Publisher: George Allen & Unwin
   Publication Date: 21 September 1937
Book Information: 
   Book Title: The Illustrated Encyclopedia of the Universe
   Author: Ian Ridpath
   Publisher: Watson-Guptill
   Publication Date: 2001
   Edition: 2nd
   Number of Pages: 384
Note: Indentations use 3 spaces.*/

public class Encyclopedia extends Book {
    private String edition;
    private int numPages;

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getEdition() {
        return edition;
    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public void printInfo() {
        System.out.println("Book Information: ");
        System.out.println("   Book Title: " + getTitle());
        System.out.println("   Author: " + getAuthor());
        System.out.println("   Publisher: " + getPublisher());
        System.out.println("   Publication Date: " + getPublicationDate());
        System.out.println("   Edition: " + getEdition());
        System.out.println("   Number of Pages: " + getNumPages());
    }
}
