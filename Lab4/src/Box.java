/* Exercise 1
 * In your Box class from the previous lab, add an overloaded method 
 * for printBox that takes 1 parameter: char c. 
 * This version should do the same as the printBox version 
 * with no parameters, except use the character c instead of *.
 * Add code in the main method to invoke the second version of 
 * the printBox method and run it.
 */

public class Box {

	// Creating the variable size
	static int size = 0;

	public static void main(String[] args) {

		// Creating the object box and then setting the size equal to 5
		Box box = new Box();

		Box.size = 5;

		// Printing the box
		char C = 0;
		printBox(C);
	}

	// Creating the new method printBox
	public static void printBox() {

		// Creating a for loop to repeat until size requirement is fulfilled
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printBox(char C) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("c");
			}
			System.out.println();
		}
	}
}