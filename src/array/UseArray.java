package array;

import java.util.ArrayList;

public class UseArray {

	static int studentID;
	int phoneNumber;

	public static void main(String[] args) {
		UseArray ab = new UseArray();

		UseArray.studentID = 101;
		ab.phoneNumber = 654641631;

		// String studentName="Mohima";

		// Single Dimentional Array or Array
		String[] studentName = new String[14];
		studentName[0] = "Mohima";
		studentName[1] = "Rima";
		studentName[2] = "Kazi";
		studentName[3] = "Arif";
		studentName[4] = "Masud";
		studentName[5] = "Zea";

		ArrayList<String> studentList = new ArrayList<>();
		studentList.add("Williams");
		studentList.add("John");
		studentList.add("Jack");
		studentList.add("David");

		// System.out.println(studentList.get(2));

		for (String st : studentList) {
			System.out.println(st);
		}

		// System.out.println(studentName[5] + " " + studentName[4]);
		// System.out.println(studentName[2]);
		// System.out.println(studentName.length);

//		for (int i = 0; i < studentName.length; i++) {
//			System.out.println("Student Name " + studentName[i]);
//
//		}

		// .abcdefghijklmnopqustuvwxyzABCDEFGHIJKLMNOPQUSTUVWXYZ

	}

}
