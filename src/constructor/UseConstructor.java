package constructor;

public class UseConstructor {
//Constractor: Default Constructor Parametarized Constructor

	// Constractor has no Return type A Constructor can be used to initialize an
	// object.
	// A Constructor is invoked when a object is created using the keyword new
	// A Constructor’s name must be same as the name of the class
	// When you are creating multiple constructor then first you must have to create
	// a Default constructor
	// A class can have many Constructors but must not have the same parameters.

	/*
	 * A constructor in Java is a block of code similar to a method that's called
	 * when an instance of an object is created. Here are the key differences
	 * between a constructor and a method: A constructor doesn't have a return type.
	 * ... Unlike methods, constructors are not considered members of a class.
	 */

	public UseConstructor() {
		// Default Constructor
		System.out.println("Default constructor");

	}

	public UseConstructor(String name) {
		// Parametarized Constructor with different signature
		System.out.println(name);
	}

	public UseConstructor(String collageName, String name) {
		// Parametarized Constructor with different signature
		System.out.println(name);
		System.out.println(collageName);
	}

	public UseConstructor(String name, String collageName, int stID) {
		// Parametarized Constructor with different signature
		System.out.println(name);
		System.out.println(collageName);
		System.out.println(stID);

	}

	public void displayInfo() {

	}

}
