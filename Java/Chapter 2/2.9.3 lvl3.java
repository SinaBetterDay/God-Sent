import java.util.Scanner;

public class StudentCourses {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String termYear;
      String course1;
		String course2;
		String course3;

      termYear = scnr.nextLine();
      course1 = scnr.next();
      course2 = scnr.next();
      course3 = scnr.next();

		System.out.println(termYear + ":");
		System.out.println(course1);
		System.out.println(course2);
		System.out.println(course3);
   }
