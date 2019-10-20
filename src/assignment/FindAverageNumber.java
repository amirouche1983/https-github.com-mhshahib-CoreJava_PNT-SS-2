package assignment;

import java.util.Scanner;

public class FindAverageNumber {

//	Write a Java method to compute the average of three numbers. Go to the editor
//	Test Data:
//	Input the first number: 25
//	Input the second number: 45
//	Input the third number: 65
//	Expected Output:

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the first number: ");
		double x = in.nextDouble();
		System.out.print("Input the second number: ");
		double y = in.nextDouble();
		System.out.print("Input the third number: ");
		double z = in.nextDouble();
		System.out.print("The average value is " + average(x, y, z) + "\n");
	}

	public static double average(double x, double y, double z) {
		return (x + y + z) / 3;
	}

}
