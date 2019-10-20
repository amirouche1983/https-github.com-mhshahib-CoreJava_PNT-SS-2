package loop;

public class WhileDoWhileLoop {

	public static void main(String[] args) {

		// While

		// How does while loops work?
		// The while statement continually executes a block of statements while a
		// particular condition is true.

		int numberOfContestants = 0;

		while (numberOfContestants < 5) {
			System.out.println("The total number of contestants in this raffle are: " + numberOfContestants);
			numberOfContestants++;
		}

		// Do..While Loop: post condition
		int number = 100;
		do {
			System.out.println("Number is " + number);
			number++;
		} while (number <= 10);

	}

}
