import java.util.Scanner;
import java.util.ArrayList;

public class SmallCities {
   private ArrayList<City> cityList = new ArrayList<City>();

   public void inputCities(Scanner scnr) {
      City currCity;
      String currName;
      char currRating;
      int cityCount;
      int i;

      cityCount = scnr.nextInt();
      for (i = 0; i < cityCount; ++i) {
         currName = scnr.next();
         currRating = scnr.next().charAt(0);
         currCity = new City();
         currCity.setNameAndRating(currName, currRating);
         cityList.add(currCity);
      }
   }

   public void printSelectedCities()
   {
      for (int i = 0; i < cityList.size(); i++)
      {
         if (cityList.get(i).getRating() == 'A')
         {
            cityList.get(i).print();
         }
      }
   }
}
