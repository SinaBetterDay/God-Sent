import java.util.Scanner;
import java.util.ArrayList;

public class Purchases {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Purchase> purchaseList = new ArrayList<Purchase>();
      Purchase currPurchase;
      String currFood;
      int currQuantity;
      int purchaseCount;
      int i;

      purchaseCount = scnr.nextInt();
      for (i = 0; i < purchaseCount; ++i) {
         currFood = scnr.next();
         currQuantity = scnr.nextInt();

         currPurchase = new Purchase();
         currPurchase.setFoodAndQuantity(currFood, currQuantity);
         purchaseList.add(currPurchase);
      }
      
      for (i = 0; i < purchaseList.size(); ++i) {
         if (purchaseList.get(i).getQuantity() >= 3 && purchaseList.get(i).getQuantity() <= 20) {
            purchaseList.get(i).print();
         }
      }
   }
}
