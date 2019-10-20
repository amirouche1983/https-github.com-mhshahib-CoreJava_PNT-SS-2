package corejava;

public class Student {// stat of a class

	// variable
	/**
	 * Type of variable local variable: Global/Instance variable class variable
	 * 
	 */

	String collageName; // Global Variable/ Reference variable
	static String universityName; // Class Variable and Global variable

	public static void displayStudentDetails() {// start
		// body of the method

		String firstName = "Arif"; // local variable
		String lastName = "Mahmud"; // local variable

		System.out.println(firstName + " " + lastName);
		System.out.println(firstName);
		System.out.print(lastName);

	}// close

	public void std() {
		String fn = "Arif";
		String ln = "Mahmud";

	}

}// closing of class
