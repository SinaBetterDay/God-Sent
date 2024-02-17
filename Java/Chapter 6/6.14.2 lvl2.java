import java.util.Scanner;
import java.util.ArrayList;

public class Orders {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Order> orderList = new ArrayList<Order>();
      Order currOrder;
      boolean result;
      int i;
      
      result = true;
      
      while (result) {
         currOrder = new Order();
         result = currOrder.readDetails(scnr);
      
         if (result) {
             orderList.add(currOrder);
         }
      }

      for (i = 0; i < orderList.size(); ++i) {
         currOrder = orderList.get(i);
         currOrder.print();
      }
   }
}
