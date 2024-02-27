/*Integer numValues is read from input, representing the number of floating-point numbers to be read next. Then, the remaining numbers are read and stored into array scoresList. Initialize the array halfList to be half the size of scoresList. Write a loop that iterates through halfList and assigns each element in halfList with the corresponding element in the second half of scoresList.

Ex: If the input is:

4
55.0 67.5 57.5 72.5
then the output is:

Original scores: 55.0 67.5 57.5 72.5 
Second half of the scores: 57.5 72.5 
Note: Input array always has an even number of elements.*/


import java.util.Scanner;

public class Score {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double[] scoresList;
      double[] halfList;
      int numValues;
      int i;
   
      numValues = scnr.nextInt();
      
      scoresList = new double[numValues];
   
      for (i = 0; i < scoresList.length; ++i) {
         scoresList[i] = scnr.nextDouble();
      }

      halfList = new double[numValues /2];
      
      for (i = scoresList.length/2; i < scoresList.length; ++i) {
         halfList[i - scoresList.length /2] = scoresList[i];
      }

      System.out.print("Original scores: ");
      for (i = 0; i < scoresList.length; ++i) {
         System.out.printf("%.1f ", scoresList[i]);
      }
      System.out.println();
      
      System.out.print("Second half of the scores: ");      
      for (i = 0; i < halfList.length; ++i) {
         System.out.printf("%.1f ", halfList[i]);
      }
      System.out.println();
   }
}
