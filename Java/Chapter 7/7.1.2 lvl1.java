/*Four integers are read from input into four variables, student1 to student4. Declare an array of integers, named studentNums, of size 4. Then, initialize the elements of studentNums with student1 to student4, in reverse order.

Ex: If the input is 61 84 56 51, then the output is:

Student numbers: 51 56 84 61*/

import java.util.Scanner;

public class StudentList {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
		int student1;
		int student2;
		int student3;
		int student4;
      int i;

		student1 = scnr.nextInt();
		student2 = scnr.nextInt();
		student3 = scnr.nextInt();
		student4 = scnr.nextInt();

      int [] studentNums = new int[4];
      
      studentNums[0] = student4;
      studentNums[1] = student3;
      studentNums[2] = student2;
      studentNums[3] = student1;

      System.out.print("Student numbers: ");
      for (i = 0; i < studentNums.length; ++i) {
         System.out.print(studentNums[i] + " ");
      }
      System.out.println();
   }
}
