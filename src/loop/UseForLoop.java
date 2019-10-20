package loop;

public class UseForLoop {

	// for (initialization; termination; increment) {
	// statement(s)
	// }

	// When using this version of the for statement, keep in mind that:
	//
	// 1. The initialization expression initializes the loop; it's executed once, as
	// the loop begins.
	// 2. When the termination expression evaluates to false, the loop terminates.
	// 3. The increment expression is invoked after each iteration through the loop.
	// It is perfectly acceptable for this expression to increment or decrement a
	// value.

	public static void main(String[] args) {

		// Operator: PreIncriment and postIncrement
		// ++x PreIncrement
		// x++ PostIncrement
		// --x PreDecrement
		// x-- PostDecreemnt

//		for (int x = 5; x <= 100; x++) {
//			System.out.println("We are Learning For Loop");
//
//		}

//		int a = 5; // 5
//		++a;// 6
//
//		System.out.println(a);// 6
//
//		System.out.println(++a);// 7
//		System.out.println(a++); //
//		System.out.println(a);// 8
//		System.out.println(--a);// 7 -1+8
//		System.out.println(a--); // 7 -1
//		System.out.println(a);  // 7-1=6

//		for (int i = 0; i < 3; i++) {
//			System.out.println("We are confused");
//			int a = 5;
//			int b = 6;
//			int c = a + b;
//			System.out.println(c);
//
//		}
//
//		for (int i = 50; i > 40; i--) {
//			System.out.println("Print out the number ... " + i);
//		}
//
//		for (int i = 0; i <= 10; i += 2) {
//			System.out.println("Print out the number ... " + i);
//		}
//		for (int i = 0; i <= 10; i += 1) {
//			System.out.println("Print out the number ... " + i);
//		}

//		for (int i = 0; i <= 10; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i + " is an even number");
//			} else {
//				System.out.println(i + " is an odd number");
//			}
//		}

		for (int i = 0; i < 4; i++) {
			System.out.println("Beginning of phase " + i);

			for (int j = 0; j < 2; j++) {
				System.out.println("i = " + i + " and j = " + j);
			}
			System.out.println("End of phase " + i + "\n");
		}

	}

}
