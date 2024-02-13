import java.util.Scanner;

public class VoicemailInfo { 
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Voicemail voicemail = new Voicemail();
      String inputGreeting;
      int inputAreaCode;
   
      inputGreeting = scnr.next();
      inputAreaCode = scnr.nextInt();
   
      voicemail.setGreeting(inputGreeting);
      voicemail.setAreaCode(inputAreaCode);

      System.out.print("Voicemail: " + voicemail.getGreeting());
      System.out.println(" at area code " + voicemail.getAreaCode());
   }
}
