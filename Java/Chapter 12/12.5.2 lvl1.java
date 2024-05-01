/*Declare variable orderNumbersQueue as a Queue of type Integer. Assign orderNumbersQueue with a LinkedList of type Integer. Read five integers from input and add each integer into orderNumbersQueue.

Ex: If the input is 224 387 382 114 104, then the output is:

224
387
382
114
104*/


import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class OrderNumbersQueueOfFive {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Queue<Integer> orderNumbersQueue = new LinkedList<Integer>();

      for (int i = 0; i < 5; i++) {
         orderNumbersQueue.add(scnr.nextInt());
      }

      System.out.println(orderNumbersQueue.remove());
		System.out.println(orderNumbersQueue.remove());
		System.out.println(orderNumbersQueue.remove());
		System.out.println(orderNumbersQueue.remove());
		System.out.println(orderNumbersQueue.remove());
   }
}
