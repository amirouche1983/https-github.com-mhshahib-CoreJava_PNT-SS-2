package assignment;

import java.util.Scanner;

public class FindSmallestNumber {

//	Write a Java method to find the smallest number among three numbers.
//	Test Data:
//	Input the first number: 35
//	Input the Second number: 47
//	Input the third number: 19

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the first number: ");
		double x = in.nextDouble();
		System.out.print("Input the Second number: ");
		double y = in.nextDouble();
		System.out.print("Input the third number: ");
		double z = in.nextDouble();
		System.out.print("The smallest value is " + smallest(x, y, z) + "\n");
	}

	public static double smallest(double x, double y, double z) {
		return Math.min(Math.min(x, y), z);
	}

}
