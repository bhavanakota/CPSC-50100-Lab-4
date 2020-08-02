import java.util.Random;

/*I felt like I over complicated this exercise and after seeing other peoples discussions, 
* I decided to retry this assignment just to see if I could be more succinct. 
* 
* Exercise 3
* Design and implement a class called Card that represents a standard playing card.
* Each card has a suit and a face value. Create a program that deals five random
* cards (with replacement). HINT: Use numbers to represent the suit and the face
* value and implement a toString method that returns a String corresponding to 
* the given suit and face value numbers.
*/
public class Card2 {

	public static void main(String[] args) {
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

		Random rand = new Random();
		
		for (int i = 0; i < 5; i++) {
			String rankStr = ranks[rand.nextInt(ranks.length)];
			String suitStr = suits[rand.nextInt(suits.length)];

			System.out.println(rankStr + " of " + suitStr);

		}
	}
}
