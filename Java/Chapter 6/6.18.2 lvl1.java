public class Automobile {

   public static int nextTireId = 1001;

   private int numAutomobiles;
	private int startId;
	private int endId;
   
   public Automobile(int newSize) {
      numAutomobiles = newSize;
		startId = nextTireId;
		endId = startId + numAutomobiles * 4 - 1;
		nextTireId += numAutomobiles * 4;
   }
   
   public void print() {
      System.out.print(numAutomobiles + " automobiles need ");
		System.out.print(numAutomobiles * 4 + " tires and the tires are assigned with IDs from ");
		System.out.println(startId + " to " + endId + ".");
   }
}
