package corejava;

public class UseDataType {
	/**
	 * Data Type short ( 2 bytes -32,768 to 32,768) int ( 4bytes, -2147483648 to
	 * 2147483647) long ( 8 bytes -9223372036854775 to 9223372036854775) to declare
	 * long you have to use L 12000000000L byte ( 1 byte -128 to 127) char (The char
	 * type is used to describe individual characters.) boolean float ( 4 bytes, 6
	 * to 7 significant decimal digits) double ( 8 bytes, 15 significant decimal
	 * digits) The name double refers to the fact that these numbers have twice the
	 * precision of the float type These types serve as the building blocks of data
	 * manipulation in Java. Such types serve only one purpose — containing pure,
	 * simple values of a kind.
	 * 
	 */

	int instructorID; // Declaring varible
	int studentId = 101; // Declaring and Initializing variable value
	double courseFee = 4500.500;
	float discountedCourseFee = 4000.100f;
	long bankAccount = 105468135L;
	char firstNameStratWith = 'K';
	boolean isAvailable;
	static String studentName;

	public String getStudentMotherName() {
		return studentMotherName;
	}

	public void setStudentMotherName(String studentMotherName) {
		this.studentMotherName = studentMotherName;
	}

	private String studentMotherName;
	public String studentFriendName;
	protected String password = "abcd1234";

	/**
	 * Encapsulation: Getter Setter
	 */

	/**
	 * Abstraction: Encapsulation: Inheritance: Polymorphism:
	 */

	/**
	 * Access Modifier Public private protected
	 */

	public void studentDetails() {
		String studentFatherName = "Mr Williams";
		// UseDataType dataType=new UseDataType();
		isAvailable = true;
		firstNameStratWith = 'S';
		studentName = "zea";

	}

	public void parentsInfo() {
		// studentFatherName="Mr james";
		studentName = "Mohima";
	}

}
