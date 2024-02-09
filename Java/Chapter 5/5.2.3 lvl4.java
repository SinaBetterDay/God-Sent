import java.util.Scanner;

public class AirportCode {

	public static void printAirportCode(String airport_code, String city_name) {
		System.out.println(airport_code + " is " + city_name + "'s airport code.");
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
      String name1, name2, code1, code2;
      
      code1 = scnr.next();
      code2 = scnr.next();
      name1 = scnr.next();
      name2 = scnr.next();
      
      printAirportCode(code1, name1);
      printAirportCode(code2, name2);
	}
}
