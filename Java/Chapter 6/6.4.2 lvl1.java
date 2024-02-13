public class Animal {
   private String species;
   private int age;

   public void setSpecies(String spec)
   {
      species = spec;
   }
   
   public void setAge(int inAge)
   {
      age = inAge;
   }

   public void print() {
      System.out.println("Animal: " + species);
      System.out.println("Age: " + age + " days old");
   }
}
