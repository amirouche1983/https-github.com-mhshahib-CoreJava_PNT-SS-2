package object;

public class Car {

	String carName;
	String carBrand;
	int carModel;

	public Car() {
		// System.out.println("Default constructor of Car class");
	}

	public Car(String carName) {
		this.carName = carName;
		System.out.println(carName);

	}

	public Car(String brand, String carName, int model) {
		this.carBrand = brand;
		this.carName = carName;
		this.carModel = model;
		System.out.println(brand + " " + carName + " " + model);
	}

	public void displayCarInfo(String carBrand, int carModel) {
		System.out.println(carBrand + " " + carModel);
		// System.out.println(carBrand);
		// System.out.println(carModel);

	}

}
