package constructor;

import object.NewCar;

public class TestMain {

	public static void main(String[] args) {
		UseConstructor zea = new UseConstructor();// Default constructor is used
		UseConstructor mohima = new UseConstructor("Welcome Mohima"); // Parametarized constructor is used
		UseConstructor shanto = new UseConstructor("New York Collage", "Shanto");

		NewCar teslaCar = new NewCar("Toyota Camry ", "Toyota");

		NewCar afnaNewCar = new NewCar("Cambry", "Toyota", 2019);

	}

}
