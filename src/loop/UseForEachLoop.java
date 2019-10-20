package loop;

import java.util.ArrayList;
import java.util.List;

public class UseForEachLoop {

	public static void main(String[] args) {

		// Array List
		List<String> nameList = new ArrayList<String>();

		// For Each Loop
		for (String st : nameList) {
			System.out.println("For each loop introduced" + st.length());
		}

	}

}
