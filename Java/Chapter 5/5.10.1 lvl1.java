import java.util.Scanner;

public class AgeMethodOverload {
   public static void printAge(int age) {
      System.out.println("Artem is " + age + " years old");
   }
   
   public static void printAge(int age, String customName) {
      System.out.println(customName + " is " + age + " years old");
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int age;
		String name;
      
      age = scnr.nextInt();
		name = scnr.next();
      
      printAge(41);
      printAge(age, name); // Overloaded method called
   }
}
