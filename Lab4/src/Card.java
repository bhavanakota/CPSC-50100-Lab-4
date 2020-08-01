import java.util.Random;
import java.util.Arrays;

/* Exercise 3
 * Design and implement a class called Card that represents a standard playing card.
 * Each card has a suit and a face value. Create a program that deals five random
 * cards (with replacement). HINT: Use numbers to represent the suit and the face
 * value and implement a toString method that returns a String corresponding to 
 * the given suit and face value numbers.
 */
public class Card {

	public static void main(String[] args) {
		// Creating two strings for the Suits and Ranks.

		String[] Ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

		// Combining the two strings and initializing the new combined deck.
		int a = Suits.length * Ranks.length;
		String[] newDeck = new String[a];

		for (int i = 0; i < Ranks.length; i++) {
			for (int j = 0; j < Suits.length; j++) {
				newDeck[Suits.length * i + j] = Ranks[i] + " of " + Suits[j];
			}
		}

		// This for loop is to shuffle the deck and create a temporary array for the
		// shuffled deck
		for (int i = 0; i < a; i++) {
			int r = i + (int) (Math.random() * (a - i));
			String temp = newDeck[r];
			newDeck[r] = newDeck[i];
			newDeck[i] = temp;
		}

		// This prints five cards from the shuffled deck
		for (int i = 0; i < 5; i++) {
			System.out.println(newDeck[i]);
		}
	}
}
