public class Animal {
   private String type;
	private String name;

   public Animal() {
      type = "Void";
      name = "Unspecified";
   }

   public void setType(String animalType) {
		type = animalType;
	}
	
	public void setName(String animalName) {
		name = animalName;
	}
   
   public void print() {
      System.out.println("Type: " + type + ", Name: " + name);
   }
}
