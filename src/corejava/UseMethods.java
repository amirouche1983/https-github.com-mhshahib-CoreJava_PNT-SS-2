package corejava;

public class UseMethods {

	/**
	 * Type of Methods: Return Type Non Return Type
	 * 
	 */

	// Non Return Type Method
	public void doSum() {
		int num1 = 50;
		int num2 = 20;
		int result = num1 + num2;
		System.out.println(result);
	}

	public void doSum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}

	// Return Type Method
	public int doMultiply() {
		int num1 = 50;
		int num2 = 20;
		int result = num1 * num2;
		System.out.println(result);
		return result;
	}

	// Return type Method with Parameter
	public int doDiv(int num1, int num2) {
		int result = num1 / num2;
		System.out.println(result);
		return result;
	}

}
