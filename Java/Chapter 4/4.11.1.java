import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      int sum = 0;
      int count = 0;
      int max = Integer.MIN_VALUE;
      
      while (true) {
         int num = scanner.nextInt();
      
         if (num < 0) {
             break; 
         }
      
         sum += num;
         count++;
      
         if (num > max) {
             max = num;
         }
      }
      double average = (double) sum / count;
      System.out.println(max + " " + String.format("%.2f", average));
   }
}
