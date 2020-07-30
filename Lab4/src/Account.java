/* Exercise 2
 * Create a new class called Account with a main method that contains the following:
 * A static variable called numAccounts, initialized to 0.
 * A constructor method that will add 1 to the numAccounts variable each time a new
 * Account object is created.
 * A static method called getNumAccounts(). It should return numAccounts.
 * Test the functionality in the main method of Account by creating a few Account objects,
 *  then print out the number of accounts.
 */
public class Account {

	// Creating a static variable
	static int numAccounts = 0;

	public Account() {

		numAccounts++;
	}

	public static void main(String[] args) {

		Account one = new Account();
		Account two = new Account();
		Account three = new Account();
		Account four = new Account();
		Account five = new Account();

		getNumAccounts();
	}

	static void getNumAccounts() {

		System.out.println("The number of accounts are " + numAccounts + ".");
	}
}
