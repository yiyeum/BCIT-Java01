/**
 * @author KateYeEumLee
 * @version 1.7
 *
 */
public class Deck {
	public static final String[] SUITS = {"Hearts", "Diamonds", "Spades",
	"Clubs"};
	public static final String[] DESCRIPTIONS = {"Ace", "Two", "Three",
			"Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
			"Queen", "King"};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Deck().printDeck();
	}

	/**
	 * Method to print the deck using nested for loops.
	 */
	public void printDeck(){
		//Using 2 for loops, nested together, print out every combination in a 52 deck of cards.
		for(int i = 0; i < SUITS.length; i++){
			for(int j = 0; j < DESCRIPTIONS.length; j++){
				System.out.println(DESCRIPTIONS[j] + " of " +SUITS[i]);
			}
		}
	}
}
