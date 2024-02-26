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
