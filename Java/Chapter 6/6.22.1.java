import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      double base1 = scnr.nextDouble();
      double height1 = scnr.nextDouble();
      triangle1.setBase(base1);
      triangle1.setHeight(height1);

      double base2 = scnr.nextDouble();
      double height2 = scnr.nextDouble();
      triangle2.setBase(base2);
      triangle2.setHeight(height2);
      
      System.out.println("Triangle with smaller area:");
      
      if (triangle1.getArea() < triangle2.getArea()) {
         triangle1.printInfo();
      } else {
         triangle2.printInfo();
      }
   }
}
