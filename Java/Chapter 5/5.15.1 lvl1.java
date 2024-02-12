import java.util.Scanner;

public class BuildArray {
   public static double[] newFirstHalf(double[] arr, double val) {
		double[] newArray = new double[arr.length];
		int i;
		int halfway = newArray.length / 2;

		for (i = 0; i < newArray.length; ++i) {
			if (i < halfway) {
				newArray[i] = val;
			}
			else {
				newArray[i] = arr[i];
			}
		}

		return newArray;
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double[] startingNums = new double[6];
		double[] outputNums;
		double changeNum;
		int i;

		for (i = 0; i < startingNums.length; ++i) {
			startingNums[i] = scnr.nextDouble();
		}

		changeNum = scnr.nextDouble();

      outputNums = newFirstHalf(startingNums, changeNum);

      for (i = 0; i < outputNums.length; ++i) {
			System.out.print(outputNums[i] + " ");
      }
   }
}
