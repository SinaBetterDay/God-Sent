/*A palindrome is a string that reads the same backwards and forwards. Use a deque to implement a program that tests whether a line of text is a palindrome. The program reads a line, then outputs whether the input is a palindrome or not.

Ex: If the input is:

senile felines!
the output is:

Yes, "senile felines!" is a palindrome.
Ex: If the input is:

rotostor
the output is:

No, "rotostor" is not a palindrome.
Ignore punctuation and spacing. Assume all alphabetic characters will be lowercase.

Special case: A one-character string is a palindrome.

Hint: The deque must be a Deque of Characters, but ordinary chars will be automatically converted to Characters when added to the deque.*/



import java.util.Scanner;
import java.util.LinkedList;
import java.util.Deque;

public class LabProgram {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String line = scnr.nextLine().toLowerCase();
      Deque<Character> deque = new LinkedList<>();

        // Add alphabetic characters to deque
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (Character.isLetter(ch)) {
                deque.addLast(ch);
            }
        }

        // Check if deque is a palindrome
        boolean isPalindrome = true;
        while (deque.size() > 1 && isPalindrome) {
            char first = deque.removeFirst();
            char last = deque.removeLast();
            if (first != last) {
                isPalindrome = false;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("Yes, \"" + line + "\" is a palindrome.");
        } else {
            System.out.println("No, \"" + line + "\" is not a palindrome.");
        }
   }
}
