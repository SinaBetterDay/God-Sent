public class Person {
   private String name;
   private int age;
   private double height;
   
   public Person() { // Default constructor
      name = "Unspecified";
      age = 0;
      height = 0.0;
   }

   public Person(String personName, int personAge, double personHeight) {
      name = personName;
      age = personAge;
      height = personHeight;
   }

   public void print() {
      System.out.printf("Person: %s, %d, %.2f\n", name, age, height);
   }
}
