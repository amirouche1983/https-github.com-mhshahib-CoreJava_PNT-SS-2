package corejava;

import constructor.UseConstructor;

public class TestMain {

	public static void main(String[] args) {

		Student student = new Student();
		Student sidi = new Student();
		Student arif = new Student();
		Student sara = new Student();

		UseConstructor zea = new UseConstructor();// Default constructor is used
		UseConstructor mohima = new UseConstructor("Welcome Mohima"); // Parametarized constructor is used
		UseConstructor shanto = new UseConstructor("New York Collage", "Shanto");

		String sidiCollage = sidi.collageName = " Laguardia College";

		System.out.println(sidiCollage);

		sidi.collageName = " Laguardia College";
		System.out.println(sidi.collageName);

		String arifCollage = arif.collageName = "Queens college";
		System.out.println(arifCollage);

		Student.displayStudentDetails();

		// Scanner scanner = new Scanner(System.in);
		UseDataType useDataType = new UseDataType();
		useDataType.studentFriendName = "Aroz";
		// useDataType.studentMotherName = "Mrs Juli";
		useDataType.setStudentMotherName("Mrs Juli");

		System.out.println(useDataType.getStudentMotherName());

		UseMethods useMethods = new UseMethods();
		useMethods.doSum();
		useMethods.doMultiply();
		useMethods.doSum(1500, 50);
		useMethods.doDiv(60, 20);

	}

}
