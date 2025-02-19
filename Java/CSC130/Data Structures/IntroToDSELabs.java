public class IntroToDSELabs {
   public static void callMethodNamed(LabPrinter printer, String methodName) {
      if (methodName == "print2Plus2") {
         printer.print2Plus2();
      } else if (methodName == "printSecret") {
         printer.printSecret();
      } else {
         System.out.println("Unknown method: " + methodName);
      }
   }
   
   public static void main(String[] args) {
      LabPrinter printer = new LabPrinter("abc");
      
      // Step 1:
      // Uncomment the block below and submit code for grading. Note that the
      // submission passes the "Compare output" test, but fails each unit test.

       
      // After completing step 1:
      // Remove lines of code from step 1 and implement the callMethodNamed() 
      // method above main().
      callMethodNamed(printer, "print2Plus2");
      callMethodNamed(printer, "printPlus2");
      callMethodNamed(printer, "printSecret");
   }
}
