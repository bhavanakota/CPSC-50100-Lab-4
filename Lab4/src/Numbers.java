import java.util.Arrays;

/* Exercise 4
 * Write a Java Class (Numbers.java) that contains a method called nextLargest. 
 * This method should accept an array of numbers and output, for each number in 
 * the array, the next bigger number. 
 */
public class Numbers {

	public static void main(String[] args) {

		// Creating the array for the original list of numbers
		int[] a = { 78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19 };

		nextLargest(a);
	}

	public static void nextLargest(int[] a) {

		// Created a copy of the original array
		int[] b = Arrays.copyOf(a, 16);

		// Sorted the array in ascending order
		Arrays.sort(b);

		// Finding the max value in the array
		int max = a[0];

		for (int i = 0; i < 15; i++) {
			if (a[i] > max)
				max = a[i];
		}
		
		int next = 0;

		// Comparing each integer to all the integers in the array and then printing out
		// the next bigger number. If they are equal then they print out the same
		// number.
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (b[j] == a[i]) {

					next = b[j + 1];
					System.out.println(a[i] + ":" + next);
				}
			}
			if (a[i] == max) {
				System.out.println(a[i] + ":" + max);

			}
		}
	}
}
