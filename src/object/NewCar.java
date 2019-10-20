package object;

public class NewCar {
	String newCarName;
	String newCarBrand;
	int newCarModel;

	public NewCar() {

	}

	public NewCar(String newCarName) {

		this.newCarName = newCarName;
		System.out.println(newCarName);
	}

	public NewCar(String newCarName, String newCarBrand) {
		this.newCarName = newCarName;
		this.newCarBrand = newCarBrand;
		// System.out.println("New Car is :" + newCarName + " " + "Model is :" +
		// newCarBrand);
		System.out.println("Rima's New Car is :" + newCarName);
		System.out.println("Rima's New Car Brand is :" + newCarBrand);

	}

	public NewCar(String newCarName, String newCarBrand, int newCarModel) {
		this.newCarName = newCarName;
		this.newCarBrand = newCarBrand;
		this.newCarModel = newCarModel;
		System.out.println("New Car is :" + newCarName);
		System.out.println("New Car Brand is :" + newCarBrand);
		System.out.println("New Car Model is :" + newCarModel);
	}

}
