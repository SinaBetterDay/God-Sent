public class Member {

   private int age = 0;
	private double height = 1.00;

   public void setAge(int memberAge) {
		age = memberAge;
	}
	
	public void setHeight(double memberHeight) {
		height = memberHeight;
	}
   
   public void print() {
      System.out.print("Age: " + age);
		System.out.printf(", Height: %.2f\n", height);
   }
}
