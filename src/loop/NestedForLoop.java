package loop;

import java.util.Scanner;

public class NestedForLoop {

	// Have the user enter how many rows they want for this output (ex: 5)
	// 1
	// 1 2
	// 1 2 3
	// 1 2 3 4
	// 1 2 3 4 5

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows");

		int numOfRows = sc.nextInt();

		for (int i = 1; i <= numOfRows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + ' ');
			}
			System.out.println();
		}

	}
}
