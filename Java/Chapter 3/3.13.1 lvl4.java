import java.util.Scanner;

public class JoinMultipleFirsts {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String animal1;
		String animal2;
		String animal3;
      String firstOfAnimal1;
		String firstOfAnimal2;
		String firstOfAnimal3;
		String allFirsts;
      
      animal1 = scnr.nextLine();
		animal2 = scnr.nextLine();
		animal3 = scnr.nextLine();

      allFirsts = animal1.substring(1, animal1.indexOf('-') +1);
      allFirsts = allFirsts.concat(animal2.substring(1, animal2.indexOf('-') +1));
      allFirsts = allFirsts.concat(animal3.substring(1, animal3.indexOf('-')));

      System.out.println(allFirsts);
   }
}
